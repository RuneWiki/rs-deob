import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class283 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lhi;")
    public class177 field3959 = new class177();

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
    public boolean field3962 = false;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field3963;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lqo;")
    public static class21 field3960;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static void method1761(boolean arg0) {
        if (!arg0) {
            field3960 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
    public static final int method1762(int arg0, int arg1, int arg2) {
        if (arg0 != 204) {
            method1763((byte) 122);
        }
        field3961++;
        if (class519.field7409 == -1) {
            return 1;
        }
        if (class526.field7533 != arg1) {
            class430.method2521(arg1, arg0 - 206);
            if (class526.field7533 != arg1) {
                return -1;
            }
        }
        try {
            Dimension var3 = class79.field1069.getSize();
            class438.method2554(class470.field6638.method3408(127, class63.field795), true, (byte) -26, class465.field6539);
            class451 var4 = class537.method3254(class519.field7409, (byte) 1, class511.field7275, 0);
            long var5 = class598.method3538(true);
            class99.field1445.method479();
            class259.field3707.method353(0, class402.field5500, 0);
            class99.field1445.method483(class259.field3707);
            class99.field1445.method516(var3.width / 2, var3.height / 2, 512, 512);
            class99.field1445.method500(1.0F);
            class99.field1445.method520(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class159 var7 = class99.field1445.method491(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label43: for (int var9 = 0; var9 < 500; var9++) {
                class99.field1445.method421(0);
                class99.field1445.method465();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class106.field1520.method353((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class96.field1409), 0, (var10 + 1) * class96.field1409);
                        var7.method93(class106.field1520, null, 0);
                        var8++;
                        if ((class598.method3538(true) - var5) >= ((long) arg2)) {
                            break label43;
                        }
                    }
                }
            }
            class99.field1445.method504();
            long var12 = (long) (var8 * 1000) / (class598.method3538(true) - var5);
            class99.field1445.method421(0);
            class99.field1445.method465();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static final void method1763(byte arg0) {
        field3957++;
        class551.field8224 = 0;
        if (arg0 != 26) {
            field3960 = null;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class110.field1568[var1] = null;
            class432.field5787[var1] = 1;
            class163.field2573[var1] = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
    public static final int method1764(boolean arg0) {
        if (arg0) {
            method1764(false);
        }
        field3958++;
        return 14;
    }
}
