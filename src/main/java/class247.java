import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class247 extends class214 implements class193 {

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Lbi;")
    public class282 field3477;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Z")
    private boolean field3483;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[I")
    public static int[] field3474 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!li", name = "U", descriptor = "[Lph;")
    public static class386[] field3491 = new class386[14];

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Ljava/awt/Font;")
    public static Font field3476;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "Z")
    public static boolean field3492;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "[[B")
    public static byte[][] field3495;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1665(boolean arg0) {
        field3474 = null;
        if (!arg0) {
            field3476 = null;
            field3491 = null;
            field3495 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I", line = 18)
    public final int method689(byte arg0) {
        ++field3485;
        if (arg0 != -83) {
            this.method677((class345) null, 5);
        }
        return this.field3477.field3962;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Z", line = 34)
    public final boolean method691(byte arg0) {
        ++field3475;
        if (arg0 != -72) {
            this.method681(true, (class345) null);
        }
        return this.field3477.method1840(true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILuo;I)Z", line = 45)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field3489;
        class394 var5 = this.field3477.method1848(super.field2985, false, 65536, arg2, false, false, super.field2990);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != -20759) {
                field3476 = null;
            }
            class417 var6 = arg2.method84();
            var6.method702(super.field2989 + super.field2985, super.field2975, super.field2990 + super.field2980);
            return var5.method1465(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Luo;Lgm;IIIIIIIZIIII)V", line = 67)
    public class247(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class22.method283(arg2, 256, arg3));
        this.field3477 = new class282(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field3483 = arg1.field922 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILuo;I)Lmj;", line = 78)
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        if (arg2 != -9380) {
            this.field3477 = null;
        }
        ++field3482;
        return this.field3477.method1848(0, false, arg0, arg1, false, false, 0);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Luo;I)V", line = 92)
    public final void method678(class345 arg0, int arg1) {
        ++field3481;
        class394 var3 = this.field3477.method1848(super.field2985, true, 131072, arg0, false, false, super.field2990);
        if (var3 != null) {
            this.field3477.method1850(false, arg1 + 22826, super.field2985 >> 7, super.field2990 >> 7, arg0, super.field2985 >> 7, super.field2990 >> 7, var3);
        }
        if (arg1 != -22948) {
            this.method689((byte) -128);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLuo;)Laj;", line = 109)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field3488;
        class394 var3 = this.field3477.method1848(super.field2985, true, 1024, arg1, !arg0, false, super.field2990);
        if (var3 == null) {
            return null;
        } else {
            class417 var4 = arg1.method84();
            var4.method702(super.field2989 + super.field2985, super.field2975, super.field2990 + super.field2980);
            class170 var5 = null;
            if (this.field3483) {
                var5 = class175.method1152((byte) 72, 1);
            }
            if (this.field3477.field3956 != null) {
                class77 var6 = this.field3477.field3956.method2017();
                arg1.method72(var3, var6, var4, var5 != null ? var5.field2333[0] : null, 0);
            } else {
                var3.method1416(var4, var5 == null ? null : var5.field2333[0], 0);
            }
            this.field3477.method1850(arg0, -125, super.field2985 >> 7, super.field2990 >> 7, arg1, super.field2985 >> 7, super.field2990 >> 7, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I", line = 144)
    public final int method684(int arg0) {
        ++field3484;
        if (arg0 != -13726) {
            this.method672(113);
        }
        return this.field3477.field3987;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I", line = 164)
    public final int method672(int arg0) {
        ++field3478;
        if (arg0 != 17011) {
            this.method681(false, (class345) null);
        }
        return this.field3477.field3993;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)I", line = 175)
    public final int method1398(int arg0) {
        if (arg0 != 0) {
            field3492 = true;
        }
        ++field3480;
        return this.field3477.method1847(-12458);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Luo;I)V", line = 190)
    public final void method677(class345 arg0, int arg1) {
        ++field3486;
        this.field3477.method1849(true, arg0);
        if (arg1 <= 33) {
            this.field3477 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(B)V", line = 202)
    public static final void method1666(byte arg0) {
        client.field2272 = null;
        ++field3479;
        if (arg0 >= -120) {
            field3476 = null;
        }
        class73.field1047 = -1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([I[Ljava/lang/Object;BII)V", line = 215)
    public static final void method1667(int[] arg0, Object[] arg1, byte arg2, int arg3, int arg4) {
        if (~arg4 < ~arg3) {
            int var5 = (arg3 - -arg4) / 2;
            int var6 = arg3;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg3; ~var9 > ~arg4; ++var9) {
                if (arg0[var9] < (var9 & 1) + var7) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method1667(arg0, arg1, (byte) 41, arg3, var6 - 1);
            method1667(arg0, arg1, (byte) 79, var6 - -1, arg4);
        }
        ++field3490;
        int var12 = 122 / ((-25 - arg2) / 56);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILuo;)V", line = 267)
    public final void method676(int arg0, class345 arg1) {
        if (arg0 > -58) {
            method1667((int[]) null, (Object[]) null, (byte) 110, 93, -80);
        }
        this.field3477.method1843(-91, arg1);
        ++field3493;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 278)
    public final void method680(int arg0) {
        if (arg0 != -24686) {
            field3476 = null;
        }
        ++field3496;
    }
}
