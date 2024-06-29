import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class232 extends class274 implements class285 {

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "Lie;")
    public class53 field3196;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "Z")
    private boolean field3201;

    @OriginalMember(owner = "client!aq", name = "C", descriptor = "[I")
    public static int[] field3188 = new int[200];

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3193 = "skill: ";

    @OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
    public static int field3205 = -1;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "J")
    public static long field3203 = 0L;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "[I")
    public static int[] field3199 = new int[25];

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!aq", name = "V", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!aq", name = "W", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!aq", name = "X", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!aq", name = "Y", descriptor = "Lam;")
    public static class286 field3209;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lvm;Z)Ldn;", line = 3)
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field3192;
        class396 var3 = this.field3196.method258(arg0, super.field3703, 1024, super.field3688, -1, true, false);
        if (var3 == null) {
            return null;
        } else {
            class247 var4 = arg0.method1650();
            var4.method747(super.field3690 + super.field3688, super.field3702, super.field3703 - -super.field3701);
            class321 var5 = null;
            if (this.field3201) {
                var5 = class204.method1110(258, 1);
            }
            if (this.field3196.field546 != null) {
                class366 var6 = this.field3196.field546.method917();
                arg0.method1622(var3, var6, var4, var5 != null ? var5.field4293[0] : null, 0);
            } else {
                var3.method2284(var4, var5 != null ? var5.field4293[0] : null, 0);
            }
            this.field3196.method262(super.field3703 >> 7, arg0, super.field3688 >> 7, super.field3703 >> 7, arg1, true, var3, super.field3688 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLvm;)V", line = 38)
    public final void method347(byte arg0, class322 arg1) {
        this.field3196.method260(false, arg1);
        ++field3208;
        if (arg0 != -108) {
            field3203 = 118L;
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)I", line = 50)
    public final int method351(byte arg0) {
        ++field3195;
        return arg0 != 103 ? 26 : this.field3196.field532;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 62)
    public static final String method1256(long arg0, byte arg1) {
        ++field3200;
        if (~arg0 < -1L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                int var6 = 35 % ((arg1 - -60) / 47);
                StringBuffer var7 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    char var10 = class366.field5124[(int) (-(arg0 * 37L) + var8)];
                    if (var10 == '_') {
                        int var11 = var7.length() - 1;
                        var10 = 160;
                        var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                    }
                    var7.append(var10);
                }
                var7.reverse();
                var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                return var7.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lvm;II)Ljn;", line = 112)
    public final class396 method349(class322 arg0, int arg1, int arg2) {
        ++field3190;
        return arg1 != -24206 ? null : this.field3196.method258(arg0, 0, arg2, 0, -1, false, false);
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)V", line = 125)
    public static void method1257(int arg0) {
        field3209 = null;
        if (arg0 != 0) {
            method1257(-119);
        }
        field3193 = null;
        field3199 = null;
        field3188 = null;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V", line = 138)
    public final void method350(byte arg0) {
        if (arg0 < 114) {
            method1258(52);
        }
        ++field3204;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lvm;I)V", line = 148)
    public final void method352(class322 arg0, int arg1) {
        ++field3202;
        class396 var3 = this.field3196.method258(arg0, super.field3703, 131072, super.field3688, -1, true, false);
        if (arg1 == 0) {
            if (var3 != null) {
                this.field3196.method262(super.field3703 >> 7, arg0, super.field3688 >> 7, super.field3703 >> 7, false, false, var3, super.field3688 >> 7);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)I", line = 166)
    public final int method588(boolean arg0) {
        ++field3198;
        if (arg0) {
            this.method357(true, (class322) null);
        }
        return this.field3196.method263(2);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)I", line = 196)
    public final int method356(int arg0) {
        ++field3191;
        if (arg0 != 10397) {
            this.method347((byte) -5, (class322) null);
        }
        return this.field3196.field539;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZLvm;)V", line = 208)
    public final void method357(boolean arg0, class322 arg1) {
        ++field3194;
        if (arg0) {
            this.field3201 = false;
        }
        this.field3196.method261(-96, arg1);
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V", line = 224)
    public static final void method1258(int arg0) {
        if (arg0 != 95) {
            method1257(-93);
        }
        class179.field2247 = true;
        ++field3189;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILvm;)Z", line = 240)
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field3207;
        class396 var5 = this.field3196.method258(arg3, super.field3703, 65536, super.field3688, -1, false, false);
        if (arg0 != -23563) {
            field3199 = null;
        }
        if (var5 == null) {
            return false;
        } else {
            class247 var6 = arg3.method1650();
            var6.method747(super.field3690 + super.field3688, super.field3702, super.field3703 + super.field3701);
            return var5.method2300(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lvm;Lds;IIIIIIIZIIII)V", line = 259)
    public class232(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class339.method1974(arg2, -91, arg3));
        this.field3196 = new class53(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field3201 = ~arg1.field3027 != -1;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)Z", line = 268)
    public final boolean method358(byte arg0) {
        if (arg0 != 24) {
            field3199 = null;
        }
        ++field3206;
        return this.field3196.method256(arg0 + 15818);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I", line = 280)
    public final int method339(int arg0) {
        ++field3197;
        int var2 = 86 / ((19 - arg0) / 32);
        return this.field3196.field516;
    }
}
