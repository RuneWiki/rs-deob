import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class153 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    private int field2309;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[[I")
    private int[][] field2312;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Lec;")
    public static class99 field2311 = new class99(16);

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2321 = 0;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Lmn;")
    public static class161 field2324 = null;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2320 = 0;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2323 = -1;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2326 = "Loaded defaults";

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2328 = "Started 3d Library";

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Ljd;")
    public static class95 field2327;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "Ljd;")
    public static class95 field2329;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)[B", line = 5)
    public final byte[] method1150(byte[] arg0, int arg1) {
        field2314++;
        if (this.field2312 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2316 / (long) this.field2309) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var8 = this.field2312[var5];
                byte var9 = arg0[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var6[var4 + var10] += var8[var10] * var9;
                }
                int var11 = this.field2316 + var5;
                int var12 = var11 / this.field2309;
                var4 += var12;
                var5 = var11 - this.field2309 * var12;
            }
            arg0 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var6[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg0[var13] = -128;
                } else if (var14 <= 127) {
                    arg0[var13] = (byte) var14;
                } else {
                    arg0[var13] = 127;
                }
            }
        }
        int var15 = -85 / ((5 - arg1) / 47);
        return arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I", line = 71)
    public final int method1151(int arg0, int arg1) {
        if (arg1 != 14) {
            method1157(-79, false, -67);
        }
        field2319++;
        if (this.field2312 != null) {
            arg0 = (int) ((long) this.field2316 * (long) arg0 / (long) this.field2309);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 86)
    public static void method1152(int arg0) {
        field2326 = null;
        field2311 = null;
        field2327 = null;
        field2329 = null;
        if (arg0 < 57) {
            field2327 = (class95) null;
        }
        field2324 = null;
        field2328 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIII)V", line = 110)
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -53 / ((arg4 - 18) / 58);
        field2318++;
        if (class154.method1161(arg6, 50)) {
            class261.method1836(arg5, arg3, -1, arg2, arg1, arg8, class8.field128[arg6], arg7, arg0, 0);
        } else if (arg7 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class121.field1861[var10] = true;
            }
        } else {
            class121.field1861[arg7] = true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)I", line = 138)
    public final int method1154(int arg0, int arg1) {
        if (this.field2312 != null) {
            arg0 = (int) ((long) this.field2316 * (long) arg0 / (long) this.field2309) + 6;
        }
        field2313++;
        return arg1 >= -42 ? 61 : arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V", line = 157)
    public static final void method1155(int arg0, int arg1, int arg2) {
        field2317++;
        if (class154.method1161(arg2, 55)) {
            if (arg1 != -1) {
                field2311 = (class99) null;
            }
            class114.method879(class8.field128[arg2], -31349, arg0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)Lqi;", line = 172)
    public static final class257 method1156(int arg0, int arg1, int arg2) {
        field2310++;
        if (arg0 < 33) {
            field2324 = (class161) null;
        }
        class257 var3 = new class257();
        for (class262 var4 = (class262) class224.field3418.method1706(0); var4 != null; var4 = (class262) class224.field3418.method1705((byte) 83)) {
            if (var4.field4038 && var4.method1841(arg1, 77, arg2)) {
                var3.method1810(var4, false);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZI)I", line = 198)
    public static final int method1157(int arg0, boolean arg1, int arg2) {
        field2315++;
        if (arg1) {
            method1156(118, -38, 4);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V", line = 222)
    public class153(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class257.method1809(arg1, arg0, (byte) 125);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2309 = var4;
            this.field2312 = new int[var4][14];
            this.field2316 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2312[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
