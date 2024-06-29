import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class103 implements class153 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "J")
    public static long field1256;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lpq;")
    public static class159 field1263;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Z")
    public boolean field1261;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 4)
    public static final String method553(int arg0, byte arg1) {
        field1255++;
        if (arg1 != 7) {
            method558((byte) -23);
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF06) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIZ)I", line = 17)
    public static final int method554(int arg0, int arg1, int arg2, boolean arg3) {
        field1250++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else if (arg3) {
            return -23;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)J", line = 42)
    public final long method555(int arg0) {
        field1260++;
        long[] var2 = class604.field8265;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field1257 ^ var3) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field1262 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field1262 ^ var7) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field1258 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field1258 >> 16)) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field1258 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field1258 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field1251 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field1259 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field1259 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field1259 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field1259 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field1253 ^ var27) & 0xFFL)];
        long var31 = var2[(int) ((var29 ^ (long) (this.field1261 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
        if (arg0 != -11918) {
            this.method557(null, 42);
        }
        return var31;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lwt;", line = 73)
    public static final class509 method556(int arg0) {
        if (arg0 != 255) {
            field1256 = -114L;
        }
        field1254++;
        try {
            return (class509) Class.forName("nf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lrl;I)Z", line = 93)
    public final boolean method557(class153 arg0, int arg1) {
        field1265++;
        if (!(arg0 instanceof class103)) {
            return false;
        }
        class103 var3 = (class103) arg0;
        if (this.field1257 != var3.field1257) {
            return false;
        } else if (this.field1262 != var3.field1262) {
            return false;
        } else if (this.field1258 == var3.field1258) {
            if (arg1 != 11933) {
                field1263 = null;
            }
            if (this.field1251 != var3.field1251) {
                return false;
            } else if (this.field1259 != var3.field1259) {
                return false;
            } else if (this.field1253 == var3.field1253) {
                return this.field1261 == var3.field1261;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 135)
    public static void method558(byte arg0) {
        int var1 = -71 % ((arg0 - 58) / 63);
        field1263 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBLoa;Lba;ILfq;IIIIIIII)Lba;", line = 145)
    public static final class629 method559(int arg0, int arg1, byte arg2, class689 arg3, class629 arg4, int arg5, class463 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field1264++;
        if (arg4 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg6 != null) {
            int var16 = var15 | arg6.method2625(107, -1, false, arg0);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg14 << 48) + ((long) arg12 << 32) + (long) ((arg5 << 24) + (arg8 << 16) + arg9);
        class560 var19 = class372.field5329;
        class629 var20;
        synchronized (class372.field5329) {
            var20 = (class629) class372.field5329.method3134(var17, -88);
        }
        if (var20 == null || arg3.method2007(var20.method688(), var15) != 0) {
            if (var20 != null) {
                var15 = arg3.method1987(var15, var20.method688());
            }
            byte var21;
            if (arg9 == 1) {
                var21 = 9;
            } else if (arg9 == 2) {
                var21 = 12;
            } else if (arg9 == 3) {
                var21 = 15;
            } else if (arg9 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class238 var24 = new class238(var21 * var22 + 1, var21 * 2 * var22 - var21, 0);
            int var25 = var24.method1475(0, (byte) -66, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class654.field9259[var31] * var28 >> 14;
                    int var33 = class654.field9260[var31] * var29 >> 14;
                    var26[var27][var30] = var24.method1475(0, (byte) -117, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg5 * var35 + arg8 * var36 >> 8);
                short var38 = (short) (((arg12 & 0x7F) * var36 + (arg14 & 0x7F) * var35 & 0x7F00) + ((arg12 & 0xFC00) * var36 + (arg14 & 0xFC00) * var35 & 0xFC0000) + ((arg12 & 0x380) * var36 + (arg14 & 0x380) * var35 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1478((byte) -1, var38, var26[0][(var39 + 1) % var21], (byte) -84, (short) -1, var25, var37, (byte) 1, var26[0][var39]);
                    } else {
                        var24.method1478((byte) -1, var38, var26[var34 - 1][(var39 + 1) % var21], (byte) -44, (short) -1, var26[var34 - 1][var39], var37, (byte) 1, var26[var34][(var39 + 1) % var21]);
                        var24.method1478((byte) -1, var38, var26[var34][(var39 + 1) % var21], (byte) -89, (short) -1, var26[var34 - 1][var39], var37, (byte) 1, var26[var34][var39]);
                    }
                }
            }
            var20 = arg3.method1784(var24, var15, class512.field6903, 64, 768);
            class560 var40 = class372.field5329;
            synchronized (class372.field5329) {
                class372.field5329.method3130(var17, true, var20);
            }
        }
        int var41 = (arg9 << 8) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg13 != 0) {
            if ((arg13 & 0x8) != 0) {
                var42 -= 512;
            }
            if ((arg13 & 0x1) != 0) {
                var45 = var41 + 512;
            }
            if ((arg13 & 0x2) != 0) {
                var43 -= 512;
            }
            if ((arg13 & 0x4) != 0) {
                var44 = var41 + 512;
            }
        }
        int var46 = arg4.method641();
        int var47 = arg4.method662();
        int var48 = arg4.method679();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var43 > var48) {
            var48 = var43;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        int var49 = arg4.method690();
        if (var45 < var49) {
            var49 = var45;
        }
        class495 var50 = null;
        if (arg6 != null) {
            int var51 = arg6.field6307[arg0];
            var50 = class77.field971.method774(var51 >> 16, -124);
            arg0 = var51 & 0xFFFF;
        }
        class629 var52;
        if (var50 == null) {
            var52 = var20.method659((byte) 3, var15, true);
            var52.method670(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method693(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method659((byte) 3, var15, true);
            var52.method670(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method693(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method3434(var50, false, arg0);
        }
        if (arg1 != 0) {
            var52.method650(arg1);
        }
        if (arg10 != 0) {
            var52.method645(arg10);
        }
        int var53 = -102 % ((-arg2 - 66) / 40);
        if (arg7 != 0) {
            var52.method693(0, arg7, 0);
        }
        return var52;
    }
}
