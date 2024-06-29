import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class495 extends class431 {

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    private int field7241 = -1;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    private int field7240 = 0;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field7254 = 0;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Z")
    public boolean field7256 = false;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field7244 = 0;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    private int field7253 = -32768;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public int field7238;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    private int field7264;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field7243;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Llp;")
    private class267 field7242;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field7259 = 0;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "[I")
    public static int[] field7248 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lsl;")
    public static class318 field7239 = new class318(60, 3);

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field7265 = 0;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field7267 = 0;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7266 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "Lao;")
    private class189 field7261;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Lfs;")
    public static class387 field7251;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "[I")
    public static int[] field7255;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILya;B)Lt;", line = 5)
    private final class471 method2964(int arg0, int arg1, class38 arg2, byte arg3) {
        ++field7258;
        if (arg3 < 50) {
            return null;
        } else {
            class330 var5 = class151.field2145.method2115(-137, arg0);
            class142 var6 = class283.field4115[super.field6328];
            class142 var7 = this.field7243 >= 3 ? null : class283.field4115[this.field7243 + 1];
            return this.field7256 ? var5.method2026(var7, true, super.field6327, super.field6335, arg2, super.field6334, -1, var6, -1, true, class153.field2169, arg1, 0) : var5.method2026(var7, true, super.field6327, super.field6335, arg2, super.field6334, this.field7254, var6, this.field7241, true, class153.field2169, arg1, this.field7244);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 23)
    public class495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field7238 = arg1 + arg2;
        this.field7264 = arg0;
        this.field7240 = arg12;
        this.field7243 = arg4;
        class330 var14 = class151.field2145.method2115(-137, this.field7264);
        int var15 = var14.field4611;
        if (~var15 == 0) {
            this.field7256 = true;
        } else {
            this.field7242 = class153.field2169.method1585(3, var15);
            this.field7256 = false;
        }
        if (this.field7238 == arg2) {
            class20.method183(super.field6335, this.field7254, super.field6328, super.field6334, true, this.field7242, false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() {
        ++field7246;
        if (this.field7261 != null) {
            this.field7261.method1326();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 62)
    public static final void method2965(int arg0) {
        if (arg0 == 527) {
            if (class305.field4338 != null) {
                class305.field4338.method1654(arg0 ^ 515);
            }
            ++field7247;
            if (class440.field6544 != null) {
                class440.field6544.method1654(arg0 ^ 515);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lya;I)V", line = 82)
    public final void method35(class38 arg0, int arg1) {
        ++field7249;
        if (arg1 < 53) {
            field7239 = null;
        }
        class471 var3 = this.method2964(this.field7264, 0, arg0, (byte) 56);
        if (var3 != null) {
            this.method2969(var3, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 108)
    public static void method2966(int arg0) {
        field7248 = null;
        field7251 = null;
        field7266 = null;
        field7239 = null;
        if (arg0 != -12582) {
            method2965(68);
        }
        field7255 = null;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)Z", line = 130)
    public final boolean method32(byte arg0) {
        ++field7245;
        if (arg0 < 104) {
            this.field7253 = -59;
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Lya;I)Lfk;", line = 141)
    public final class462 method38(class38 arg0, int arg1) {
        ++field7252;
        if (arg1 >= -87) {
            this.finalize();
        }
        class471 var3 = this.method2964(this.field7264, (~this.field7240 == -1 ? 0 : 5) | 2048, arg0, (byte) 74);
        if (var3 == null) {
            return null;
        } else {
            if (this.field7240 != 0) {
                var3.method451(this.field7240 * 2048);
            }
            class122 var4 = arg0.method362();
            var4.method249(super.field6335, super.field6327, super.field6334);
            if (this.field7261 != null) {
                class88 var5 = this.field7261.method1331();
                arg0.method324(var3, var5, var4, (class341) null, 0);
            } else {
                var3.method457(var4, (class341) null, 0);
            }
            this.field7253 = var3.method463();
            this.method2969(var3, arg0, -1);
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V", line = 175)
    public final void method2967(int arg0, boolean arg1) {
        ++field7257;
        if (!this.field7256) {
            this.field7244 += arg0;
            while (~this.field7244 < ~this.field7242.field3940[this.field7254]) {
                this.field7244 -= this.field7242.field3940[this.field7254];
                ++this.field7254;
                if (this.field7254 >= this.field7242.field3919.length) {
                    this.field7256 = true;
                    break;
                }
            }
            if (!this.field7256) {
                class20.method183(super.field6335, this.field7254, super.field6328, super.field6334, arg1, this.field7242, false);
            }
            if (!arg1) {
                this.method2964(112, -23, (class38) null, (byte) -113);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 210)
    public final void method2968(boolean arg0) {
        if (this.field7261 != null) {
            this.field7261.method1326();
        }
        if (!arg0) {
            field7267 = 58;
        }
        ++field7250;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 225)
    public final void method29(int arg0) {
        int var2 = -23 % ((57 - arg0) / 44);
        ++field7260;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILya;I)Z", line = 242)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field7237;
        if (arg1 != 0) {
            this.method32((byte) 33);
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)I", line = 257)
    public final int method890(int arg0) {
        ++field7262;
        if (arg0 != -25430) {
            this.field7243 = 54;
        }
        return this.field7253;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILfi;BZLya;I)V", line = 268)
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        if (arg3 != -99) {
            this.method890(-42);
        }
        ++field7236;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lt;Lya;I)V", line = 280)
    private final void method2969(class471 arg0, class38 arg1, int arg2) {
        ++field7263;
        class17[] var4 = arg0.method454();
        if (arg2 != -1) {
            field7266 = null;
        }
        class410[] var5 = arg0.method444();
        if ((this.field7261 == null || this.field7261.field2781) && (var4 != null || var5 != null)) {
            this.field7261 = new class189(class263.field3867);
        }
        if (this.field7261 != null) {
            this.field7261.method1329(arg1, (long) class263.field3867, var4, var5, false);
            this.field7261.method1334(super.field6328, super.field6332, super.field6340, super.field6339, super.field6337);
        }
    }
}
