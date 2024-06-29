import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class82 {

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[[I")
    private int[][] field1325;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lve;")
    public static class255 field1330 = class87.method607(127, "k");

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field1333 = 0;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    public static int[] field1328 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lve;")
    public static class255 field1326 = class87.method607(79, "blinken1:");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
    public static int[] field1324 = new int[2];

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lve;")
    public static class255 field1329 = class87.method607(33, "::clientdrop");

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    public static boolean field1323 = false;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lve;")
    public static class255 field1327 = class87.method607(30, "_labels");

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field1338 = -1;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[Lta;")
    public static class186[] field1334 = new class186[32768];

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static volatile int field1343 = -1;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lve;")
    public static class255 field1342 = null;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILme;IJIIII)Z", line = 8)
    public static final boolean method563(int arg0, int arg1, int arg2, int arg3, class177 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class314.method2166(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V", line = 14)
    public static final void method564(int arg0, int arg1, int arg2) {
        class29.field461 = true;
        class215.field3658 = arg0;
        class75.field1231 = arg1;
        class199.field3426 = arg2;
        class247.field4140 = -1;
        field1338 = -1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 26)
    public static void method565(byte arg0) {
        field1330 = null;
        field1324 = null;
        field1329 = null;
        field1326 = null;
        field1327 = null;
        if (arg0 < 6) {
            field1328 = (int[]) null;
        }
        field1334 = null;
        field1342 = null;
        field1328 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ltl;III)V", line = 43)
    public static final void method566(class197 arg0, int arg1, int arg2, int arg3) {
        field1335++;
        if (arg0.field3307 == 0) {
            arg0.field3332 = arg0.field3393;
        } else if (arg0.field3307 == 1) {
            arg0.field3332 = (arg1 - arg0.field3294) / 2 + arg0.field3393;
        } else if (arg0.field3307 == 2) {
            arg0.field3332 = arg1 - arg0.field3393 - arg0.field3294;
        } else if (arg0.field3307 == 3) {
            arg0.field3332 = arg0.field3393 * arg1 >> 14;
        } else if (arg0.field3307 == 4) {
            arg0.field3332 = (arg0.field3393 * arg1 >> 14) + (arg1 - arg0.field3294) / 2;
        } else {
            arg0.field3332 = arg1 - arg0.field3294 - (arg0.field3393 * arg1 >> 14);
        }
        if (arg0.field3276 == 0) {
            arg0.field3305 = arg0.field3254;
        } else if (arg0.field3276 == 1) {
            arg0.field3305 = (arg2 - arg0.field3253) / 2 + arg0.field3254;
        } else if (arg0.field3276 == 2) {
            arg0.field3305 = arg2 - arg0.field3254 - arg0.field3253;
        } else if (arg0.field3276 == 3) {
            arg0.field3305 = arg0.field3254 * arg2 >> 14;
        } else if (arg0.field3276 == 4) {
            arg0.field3305 = (arg0.field3254 * arg2 >> 14) + (arg2 - arg0.field3253) / 2;
        } else {
            arg0.field3305 = arg2 - (arg0.field3254 * arg2 >> 14) - arg0.field3253;
        }
        if (arg3 < 91) {
            field1343 = 50;
        }
        if (!class198.field3421 || !(client.method1673(arg0) != 0 || arg0.field3281 == 0)) {
            return;
        }
        if (arg0.field3305 < 0) {
            arg0.field3305 = 0;
        } else if ((arg0.field3305 + arg0.field3253) > arg2) {
            arg0.field3305 = arg2 - arg0.field3253;
        }
        if (arg0.field3332 < 0) {
            arg0.field3332 = 0;
        } else if (arg1 < (arg0.field3332 + arg0.field3294)) {
            arg0.field3332 = arg1 - arg0.field3294;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILrg;I)[Lpc;", line = 142)
    public static final class83[] method567(byte arg0, int arg1, class88 arg2, int arg3) {
        field1340++;
        if (class96.method763((byte) 99, arg3, arg1, arg2)) {
            if (arg0 <= 88) {
                field1328 = (int[]) null;
            }
            return class149.method1106(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I", line = 158)
    public final int method568(int arg0, int arg1) {
        field1322++;
        if (arg1 <= 47) {
            method563(23, -120, 98, -96, (class177) null, -65, -78L, 83, -66, -107, 123);
        }
        if (this.field1325 != null) {
            arg0 = (int) ((long) this.field1332 * (long) arg0 / (long) this.field1331);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)I", line = 180)
    public final int method569(boolean arg0, int arg1) {
        field1337++;
        if (arg0) {
            return 61;
        } else {
            if (this.field1325 != null) {
                arg1 = (int) ((long) this.field1332 * (long) arg1 / (long) this.field1331) + 6;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(II)V", line = 192)
    public class82(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class122.method903(arg1, arg0, false);
            int var4 = arg0 / var3;
            this.field1331 = var4;
            int var5 = arg1 / var3;
            this.field1332 = var5;
            this.field1325 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1325[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BZ)[B", line = 273)
    public final byte[] method570(byte[] arg0, boolean arg1) {
        field1341++;
        if (this.field1325 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1332 / (long) this.field1331) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var8 = arg0[var7];
                int[] var9 = this.field1325[var5];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var6 + var10] += var9[var10] * var8;
                }
                int var11 = this.field1332 + var5;
                int var12 = var11 / this.field1331;
                var6 += var12;
                var5 = var11 - this.field1331 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        return arg1 ? arg0 : (byte[]) null;
    }
}
