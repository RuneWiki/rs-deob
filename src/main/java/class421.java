import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class421 extends class539 {

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[I")
    public int[] field5945 = new int[] { -1 };

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "[I")
    public int[] field5946 = new int[1];

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "Z")
    public static boolean field5950 = false;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Lof;")
    public static class568 field5947 = new class568(15, 4);

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "[F")
    public static float[] field5952 = new float[4];

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "Lka;")
    public static class434 field5949;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "[J")
    public static long[] field5953;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILoa;Ln;IIIBZILct;)Lba;", line = 4)
    public final class352 method2397(int arg0, class638 arg1, class17 arg2, int arg3, int arg4, int arg5, byte arg6, boolean arg7, int arg8, class131 arg9) {
        field5951++;
        class352 var11 = null;
        int var12 = arg8;
        class308 var13 = null;
        if (arg4 != -1) {
            var13 = class310.field4615.method3018(arg4, 32);
        }
        int[] var14 = this.field5945;
        if (var13 != null && var13.field4598 != null) {
            var14 = new int[var13.field4598.length];
            for (int var15 = 0; var15 < var13.field4598.length; var15++) {
                int var16 = var13.field4598[var15];
                if (var16 >= 0 && var16 < this.field5945.length) {
                    var14[var15] = this.field5945[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class597 var24 = null;
        int var25 = 26 / (arg6 / 54);
        class597 var26 = null;
        if (arg9 != null) {
            int var27 = arg9.field1806[arg0];
            var12 = arg8 | 0x20;
            int var28 = var27 >>> 16;
            var24 = class301.field4465.method2757(64, var28);
            var21 = var27 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method3303(true, var21);
                var17 |= var24.method3302(var21, false);
                var20 |= var24.method3304(66, var21);
                var19 |= arg9.field1792;
            }
            if ((arg9.field1788 || class492.field6791) && arg5 != -1 && arg5 < arg9.field1806.length) {
                var23 = arg9.field1810[arg0];
                int var29 = arg9.field1806[arg5];
                int var30 = var29 >>> 16;
                var22 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var24;
                } else {
                    var26 = class301.field4465.method2757(64, var22 >>> 16);
                }
                if (var26 != null) {
                    var18 |= var26.method3303(true, var22);
                    var17 |= var26.method3302(var22, false);
                    var20 |= var26.method3304(79, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var31 = this.method2398(var14, arg2 == null ? null : arg2.field259, arg7, (byte) -115, arg4);
        if (class239.field3442 != null) {
            var11 = (class352) class239.field3442.method1986((byte) -111, var31);
        }
        if (var11 == null || arg1.method431(var11.method189(), var12) != 0) {
            if (var11 != null) {
                var12 = arg1.method444(var12, var11.method189());
            }
            int var33 = var12;
            boolean var34 = false;
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1 && !class648.field9184.method3064(var14[var35], -92).method1582((byte) 55, arg7)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class661[] var36 = new class661[var14.length];
            for (int var37 = 0; var37 < var14.length; var37++) {
                if (var14[var37] != -1) {
                    var36[var37] = class648.field9184.method3064(var14[var37], -39).method1573((byte) -128, arg7);
                }
            }
            if (var13 != null && var13.field4585 != null) {
                for (int var38 = 0; var38 < var13.field4585.length; var38++) {
                    if (var13.field4585[var38] != null && var36[var38] != null) {
                        int var39 = var13.field4585[var38][0];
                        int var40 = var13.field4585[var38][1];
                        int var41 = var13.field4585[var38][2];
                        int var42 = var13.field4585[var38][3];
                        int var43 = var13.field4585[var38][4];
                        int var44 = var13.field4585[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method3663((byte) -82, var43, var44, var42);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method3662((byte) -120, var40, var41, var39);
                        }
                    }
                }
            }
            class661 var45 = new class661(var36, var36.length);
            if (arg2 != null) {
                var33 = var12 | 0x4000;
            }
            var11 = arg1.method379(var45, var33, class185.field2733, 64, 850);
            if (arg2 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    if (arg2.field259[var46] < class471.field6577[var46].length) {
                        var11.method213(class459.field6500[var46], class471.field6577[var46][arg2.field259[var46]]);
                    }
                    if (arg2.field259[var46] < class227.field3262[var46].length) {
                        var11.method213(class531.field7241[var46], class227.field3262[var46][arg2.field259[var46]]);
                    }
                }
            }
            if (class239.field3442 != null) {
                var11.method216(var12);
                class239.field3442.method1985(var11, var31, (byte) -102);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class352 var47 = var11.method235((byte) 1, var12, true);
            var47.method2090(arg3 - 1, var21, arg9.field1792, var22, 0, var26, var23, 16383, var24);
            return var47;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([I[IZBI)J", line = 244)
    private final long method2398(int[] arg0, int[] arg1, boolean arg2, byte arg3, int arg4) {
        field5948++;
        long[] var6 = class667.field9397;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) ((var9 ^ (long) arg4) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg0[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        long var15 = var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
        if (arg3 >= -55) {
            method2399(102);
        }
        return var15;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 294)
    public static void method2399(int arg0) {
        field5953 = null;
        if (arg0 == 0) {
            field5952 = null;
            field5947 = null;
            field5949 = null;
        }
    }
}
