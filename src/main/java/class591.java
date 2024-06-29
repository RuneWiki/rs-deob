import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class591 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lfja;")
    public static class783 field8313 = new class783(26, 0);

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static void method3383(byte arg0) {
        field8313 = null;
        if (arg0 <= 85) {
            method3384(-72, 1, -21);
        }
    }

    @OriginalMember(owner = "client!wm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8314++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)I")
    public static final int method3384(int arg0, int arg1, int arg2) {
        field8315++;
        if (class542.field7390 == -1) {
            return 1;
        }
        if (arg0 != class111.field1911.field6725.method3784((byte) 124)) {
            class239.method1599(-3, class641.field8831.method3566((byte) -38, class464.field6309), true, arg0);
            if (arg0 != class111.field1911.field6725.method3784((byte) 90)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class558.field7896.getSize();
            class289.method1844(class95.field1472, class16.field239, class359.field4908, class641.field8831.method3566((byte) 102, class464.field6309), true, (byte) 11);
            class5 var4 = class245.method1636(class542.field7390, class109.field1705, 0, 2);
            long var5 = class197.method1423(1);
            class95.field1472.method575();
            class417.field5701.method1868(0, class370.field5022, 0);
            class95.field1472.method503(class417.field5701);
            class95.field1472.method521(var3.width / 2, var3.height / 2, 512, 512);
            class95.field1472.method480(1.0F);
            class95.field1472.method590(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class499 var7 = class95.field1472.method505(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class95.field1472.method536(0);
                class95.field1472.method494();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class160.field2574.method1868((int) (((float) var11 - (float) var10 / 2.0F) * (float) class365.field4955), 0, (var10 + 1) * class365.field4955);
                        var7.method301(class160.field2574, null, 0);
                        var8++;
                        if (class197.method1423(1) - var5 >= (long) arg1) {
                            break label45;
                        }
                    }
                }
            }
            class95.field1472.method489();
            long var12 = (long) (var8 * 1000) / (class197.method1423(1) - var5);
            class95.field1472.method536(0);
            class95.field1472.method494();
            if (arg2 != 7762) {
                field8313 = null;
            }
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }
}
