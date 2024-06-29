import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class213 extends class322 {

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ldga;")
    public static class204 field2804;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Loia;")
    public static class88 field2811;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Ljava/applet/Applet;")
    public static Applet field2800;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method1307(byte arg0) {
        ++field2809;
        if (super.field4450.method2751(-18373)) {
            return false;
        } else {
            if (arg0 != -53) {
                this.method1308(false);
            }
            return super.field4450.method2749(-21) == class556.field7800;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)I", line = 21)
    public final int method1308(boolean arg0) {
        ++field2802;
        if (arg0) {
            method1311((byte) -80, 36, (class508) null, 42);
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)V", line = 35)
    public static void method1309(boolean arg0) {
        field2811 = null;
        if (!arg0) {
            field2804 = null;
            field2800 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I", line = 53)
    public final int method17(byte arg0) {
        ++field2806;
        int var2 = -33 % ((arg0 - 70) / 51);
        return 1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 69)
    public final void method23(boolean arg0) {
        ++field2810;
        if (arg0) {
            this.method19(102, -11);
        }
        if (super.field4450.method2749(-21) == class556.field7800) {
            if (super.field4450.method2751(-18373)) {
                super.field4451 = 0;
            }
        } else {
            super.field4451 = 1;
        }
        if (~super.field4451 != -1 && ~super.field4451 != -2) {
            super.field4451 = this.method17((byte) -111);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lch;)V", line = 91)
    public class213(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I", line = 94)
    public final int method19(int arg0, int arg1) {
        ++field2808;
        if (arg1 <= 10) {
            field2801 = -40;
        }
        if (super.field4450.method2751(-18373)) {
            return 3;
        } else if (super.field4450.method2749(-21) == class556.field7800) {
            if (~arg0 == -1) {
                if (~super.field4450.field6557.method3237(false) == -2) {
                    return 2;
                }
                if (super.field4450.field6522.method2865(false) == 1) {
                    return 2;
                }
                if (~super.field4450.field6520.method77(false) < -1) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 135)
    public static final boolean method1310(String arg0, int arg1) {
        ++field2803;
        if (arg1 != -17633) {
            field2800 = null;
        }
        return class19.method117((byte) 66, arg0, 10, true);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V", line = 148)
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field2814;
        if (arg0 != 0) {
            method1311((byte) -81, 2, (class508) null, -102);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILch;)V", line = 159)
    public class213(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILmq;I)V", line = 162)
    public static final void method1311(byte arg0, int arg1, class508 arg2, int arg3) {
        ++field2805;
        if (class436.field6192) {
            int var4 = 0;
            for (class37 var5 = (class37) arg2.field7267.method4000((byte) -7); var5 != null; var5 = (class37) arg2.field7267.method4002(-103)) {
                int var10 = class392.method2465(4, var5);
                if (var10 > var4) {
                    var4 = var10;
                }
            }
            if (arg0 != -82) {
                field2800 = null;
            }
            var4 += 8;
            int var6 = arg2.field7268 * 16 + 21;
            class505.field7238 = arg2.field7268 * 16 - -(class273.field3903 ? 26 : 22);
            int var7 = class470.field6668 + class208.field2732;
            if (~(var4 + var7) < ~class446.field6323) {
                var7 = -var4 + class208.field2732;
            }
            if (~var7 > -1) {
                var7 = 0;
            }
            int var8 = !class273.field3903 ? 31 : 33;
            int var9 = arg3 + 13 + -var8;
            if (var6 + var9 > class172.field2348) {
                var9 = class172.field2348 - var6;
            }
            if (var9 < 0) {
                var9 = 0;
            }
            class326.field4512 = var7;
            class430.field6135 = arg2;
            class426.field5986 = var4;
            class373.field5236 = var9;
        }
    }
}
