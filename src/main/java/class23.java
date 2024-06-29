import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class23 {

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Ll;")
    private class120 field387 = new class120(256);

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Ll;")
    private class120 field389 = new class120(256);

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lve;")
    private class225 field384;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lve;")
    private class225 field385;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Ldj;")
    public static class44 field383 = class89.method650(255, " )2>");

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[Lbd;")
    public static class16[] field378 = new class16[50];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI[I)Lti;")
    public final class209 method164(boolean arg0, int arg1, int[] arg2) {
        if (arg0) {
            return null;
        }
        field388++;
        if (this.field384.method1477(-17161) == 1) {
            return this.method165(arg1, 0, 1610616831, arg2);
        } else if (this.field384.method1473(20756, arg1) == 1) {
            return this.method165(0, arg1, 1610616831, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)Lti;")
    private final class209 method165(int arg0, int arg1, int arg2, int[] arg3) {
        field386++;
        int var5 = arg0 ^ ((arg1 & arg2) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class209 var9 = (class209) this.field389.method828(var7, (byte) -40);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class25 var10 = (class25) this.field387.method828(var7, (byte) -40);
            if (var10 == null) {
                var10 = class25.method180(this.field384, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field387.method830(var10, var7, 1);
            }
            class209 var11 = var10.method183(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1148(-13215);
                this.field389.method830(var11, var7, 1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 32002) {
            return;
        }
        field380++;
        if (arg2 == arg9 && arg4 == arg5 && arg6 == arg8 && arg0 == arg3) {
            class131.method890(arg5, arg8, arg0, arg7, arg1 - 31998, arg2);
            return;
        }
        int var10 = arg2;
        int var11 = arg5;
        int var12 = arg2 * 3;
        int var13 = arg5 * 3;
        int var14 = arg9 * 3;
        int var15 = arg6 * 3;
        int var16 = arg4 * 3;
        int var17 = arg3 * 3;
        int var18 = arg8 + var14 - var15 - arg2;
        int var19 = var15 + var12 - var14 - var14;
        int var20 = arg0 + var16 - var17 - arg5;
        int var21 = var17 + var13 - var16 - var16;
        int var22 = var16 - var13;
        int var23 = var14 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var21 * var25;
            int var29 = var19 * var25;
            int var30 = var20 * var26;
            int var31 = var23 * var24;
            int var32 = var22 * var24;
            int var33 = (var27 + var31 + var29 >> 12) + arg2;
            int var34 = arg5 + (var28 + var30 + var32 >> 12);
            class131.method890(var11, var33, var34, arg7, 4, var10);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IB)Lti;")
    public final class209 method167(int arg0, int[] arg1, byte arg2) {
        field381++;
        int var4 = -65 / ((-arg2 - 47) / 51);
        if (this.field385.method1477(-17161) == 1) {
            return this.method170(0, -52, arg0, arg1);
        } else if (this.field385.method1473(20756, arg0) == 1) {
            return this.method170(arg0, -93, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
    public static final int method168(byte arg0, int arg1) {
        if (arg0 != 10) {
            field383 = null;
        }
        field382++;
        if (class119.field2119 == 1) {
            return 7;
        } else if (arg1 == 77) {
            return 1;
        } else if (arg1 == 38) {
            return 2;
        } else if (arg1 == 16) {
            return 3;
        } else if (arg1 == 161) {
            return 4;
        } else if (arg1 == 191) {
            return 5;
        } else if (arg1 == 69) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method169(int arg0) {
        field378 = null;
        field383 = null;
        if (arg0 != 5) {
            method166(-99, 3, -85, 24, 87, 9, -116, 42, 90, 88);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III[I)Lti;")
    private final class209 method170(int arg0, int arg1, int arg2, int[] arg3) {
        field379++;
        if (arg1 >= -49) {
            return null;
        }
        int var5 = (arg0 >>> 12 | (arg0 & 0x10000FFF) << 4) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class209 var9 = (class209) this.field389.method828(var7, (byte) -40);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class16 var10 = class16.method142(this.field385, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class209 var11 = var10.method139();
            this.field389.method830(var11, var7, 1);
            if (arg3 != null) {
                arg3[0] -= var11.field3741.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lve;Lve;)V")
    public class23(class225 arg0, class225 arg1) {
        this.field384 = arg1;
        this.field385 = arg0;
    }
}
