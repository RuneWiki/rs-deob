import java.awt.Dimension;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class388 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field5805 = 1;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field5808;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 4)
    public static void method2393(int arg0) {
        if (arg0 < -1) {
            field5808 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field5806++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)I", line = 33)
    public static final int method2394(boolean arg0, int arg1, int arg2) {
        field5807++;
        if (class197.field2698 == -1) {
            return 1;
        }
        if (class62.field996 != arg2) {
            class408.method2501(class279.field3638.method1654(-79, class262.field3401), (byte) 48, arg2);
            if (class62.field996 != arg2) {
                return -1;
            }
        }
        try {
            Dimension var3 = class410.field6110.getSize();
            class453.method2656(0, class244.field3236, class279.field3638.method1654(-51, class262.field3401), class332.field4821, arg0, class624.field9024);
            class677 var4 = class177.method1208(-29831, class197.field2698, class638.field9171, 0);
            long var5 = class60.method371(false);
            class332.field4821.method699();
            class242.field3215.method883(0, class41.field615, 0);
            class332.field4821.method616(class242.field3215);
            class332.field4821.method667(var3.width / 2, var3.height / 2, 512, 512);
            class332.field4821.method711(1.0F);
            class332.field4821.method607(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class395 var7 = class332.field4821.method651(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label46: for (int var9 = 0; var9 < 500; var9++) {
                class332.field4821.method646(0);
                class332.field4821.method638();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class510.field7197.method883((int) (((float) var11 - (float) var10 / 2.0F) * (float) class263.field3412), 0, (var10 + 1) * class263.field3412);
                        var7.method1054(class510.field7197, null, 0);
                        var8++;
                        if (class60.method371(false) - var5 >= (long) arg1) {
                            break label46;
                        }
                    }
                }
            }
            class332.field4821.method681();
            long var12 = (long) (var8 * 1000) / (class60.method371(!arg0) - var5);
            class332.field4821.method646(0);
            class332.field4821.method638();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }
}
