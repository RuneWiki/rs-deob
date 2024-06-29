import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class class229 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "S")
    public static short field3260 = 256;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
    public static boolean field3264 = true;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "[I")
    public static int[] field3265 = new int[4];

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "[[B")
    public static byte[][] field3261;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1454(byte arg0) {
        field3262++;
        class432.field5950 = false;
        if (arg0 != -15) {
            method1455(-26, 49, 81);
        }
        class312.method1915(arg0 - 86);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Lih;", line = 17)
    public static final class701 method1455(int arg0, int arg1, int arg2) {
        if (class660.field8718[arg0][arg1][arg2] == null) {
            boolean var3 = class660.field8718[0][arg1][arg2] != null && class660.field8718[0][arg1][arg2].field9744 != null;
            if (var3 && arg0 >= class225.field3201 - 1) {
                return null;
            }
            class421.method2442(arg0, arg1, arg2);
        }
        return class660.field8718[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V", line = 32)
    public static void method1456(byte arg0) {
        field3261 = null;
        field3265 = null;
        int var1 = 6 / ((arg0 + 13) / 36);
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V", line = 42)
    public static final void method1457(byte arg0) {
        if (class194.field2929 < 0) {
            class663.field8853 = -1;
            class347.field4871 = -1;
            class194.field2929 = 0;
        }
        field3259++;
        if (class194.field2929 > class744.field10367) {
            class347.field4871 = -1;
            class663.field8853 = -1;
            class194.field2929 = class744.field10367;
        }
        if (class432.field5949 < 0) {
            class663.field8853 = -1;
            class432.field5949 = 0;
            class347.field4871 = -1;
        }
        if (arg0 != -7) {
            method1454((byte) 79);
        }
        if (class744.field10359 < class432.field5949) {
            class347.field4871 = -1;
            class663.field8853 = -1;
            class432.field5949 = class744.field10359;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lrba;I)Lrba;")
    public abstract class437 method1458(class437 arg0, int arg1);
}
