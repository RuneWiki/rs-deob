import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class218 extends class253 {

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public int field3824 = -1;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public int field3839 = 0;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "J")
    public static volatile long field3835 = 0L;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "Ljd;")
    public static class85 field3832 = class221.method1499("W-=hlen Sie eine Option", (byte) -121);

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field3840 = 0;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "Lge;")
    public static class68 field3836;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lui;Z)V")
    public static final void method1485(class218 arg0, boolean arg1) {
        field3837++;
        int var2 = -1;
        if (!arg1) {
            return;
        }
        long var3 = 0L;
        if (arg0.field3821 == 0) {
            var3 = class116.method818(arg0.field3819, arg0.field3830, arg0.field3826);
        }
        if (arg0.field3821 == 1) {
            var3 = class18.method131(arg0.field3819, arg0.field3830, arg0.field3826);
        }
        if (arg0.field3821 == 2) {
            var3 = class67.method447(arg0.field3819, arg0.field3830, arg0.field3826);
        }
        if (arg0.field3821 == 3) {
            var3 = class95.method679(arg0.field3819, arg0.field3830, arg0.field3826);
        }
        int var5 = 0;
        int var6 = 0;
        if (var3 != 0L) {
            var5 = ((int) var3 & 0x7C2D6) >> 14;
            var6 = (int) var3 >> 20 & 0x3;
            var2 = (int) (var3 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field3841 = var2;
        arg0.field3823 = var5;
        arg0.field3838 = var6;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -70) {
            field3832 = null;
        }
        if (arg5 >= class217.field3802 && arg2 <= class83.field1513 && class34.field522 <= arg3 && arg0 <= class1.field6) {
            if (arg1 == 1) {
                class119.method830(arg3, arg5, arg0, -1, arg2, arg4);
            } else {
                class76.method534(arg0, arg3, arg2, arg1, arg6 - 1349, arg4, arg5);
            }
        } else if (arg1 == 1) {
            class106.method735(arg3, arg5, (byte) 114, arg4, arg0, arg2);
        } else {
            class240.method1630(arg2, arg5, arg3, arg4, arg0, arg1, (byte) -110);
        }
        field3822++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lge;II)Z")
    public static final boolean method1487(class68 arg0, int arg1, int arg2) {
        field3828++;
        byte[] var3 = arg0.method459(67, arg1);
        if (arg2 != 508630) {
            return false;
        } else if (var3 == null) {
            return false;
        } else {
            class13.method104(var3, (byte) 104);
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1488(byte arg0) {
        field3836 = null;
        if (arg0 > -88) {
            field3832 = null;
        }
        field3832 = null;
    }
}
