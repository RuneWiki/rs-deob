import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class212 {

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    private int field3249 = 4;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public int field3253 = 4;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[S")
    private short[] field3255 = new short[512];

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    private int field3257 = 0;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    private int field3256 = 4;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    private int field3247 = 4;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3260 = new String[] { method1869(method1868("\u001dG\u0012V.")), method1869(method1868("\u001dG\u0012T.")), method1869(method1868("\u001dG\u0012R.")), method1869(method1868("\u001dG\u0012X.")), method1869(method1868("\u001dG\u0012O.")), method1869(method1868("\u001dG\u0012Q.")), method1869(method1868("\u001dG\u0012#o\u001cKH!.")) };

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lel;")
    public static class573 field3245 = new class573(90, -1);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lum;")
    public static class550 field3259 = new class550("", 12);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3246;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[S")
    private short[] field3254;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 3)
    private final void method1861(byte arg0) {
        try {
            field3252++;
            Random var2 = new Random((long) this.field3257);
            for (int var3 = 0; var3 < 255; var3++) {
                this.field3255[var3] = (short) var3;
            }
            int var4 = 0;
            if (arg0 != -105) {
                field3245 = null;
            }
            while (var4 < 255) {
                int var5 = 255 - var4;
                int var6 = class656.method4817(var5, var2, (byte) -68);
                short var7 = this.field3255[var6];
                this.field3255[var6] = this.field3255[var5];
                this.field3255[var5] = this.field3255[var5 + 256] = var7;
                var4++;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3260[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 41)
    public static final void method1862(int arg0, int arg1, int arg2, Class arg3) {
        class96 var4 = class734.field10683[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class681 var5 = var4.field1085; var5 != null; var5 = var5.field9865) {
            class343 var6 = var5.field9867;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5330 == arg1 && var6.field5329 == arg2) {
                class766.method5533(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)Ldja;", line = 72)
    public static final class324 method1863(int arg0, int arg1, int arg2) {
        try {
            field3248++;
            class324 var3 = new class324();
            if (arg0 != 4014) {
                field3259 = null;
            }
            var3.field5099 = arg1 + 1 + 5;
            var3.field5114 = -1;
            var3.field5119 = arg2 + 1 + 5;
            var3.field5097 = -1;
            var3.field5117 = new int[var3.field5099][var3.field5119];
            var3.method2755((byte) -113);
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3260[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 93)
    public static void method1864(int arg0) {
        try {
            if (arg0 != 90) {
                field3246 = null;
            }
            field3259 = null;
            field3245 = null;
            field3246 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3260[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 105)
    private final void method1865(byte arg0) {
        try {
            field3258++;
            this.field3254 = new short[this.field3253];
            int var2 = 0;
            if (arg0 != -27) {
                field3245 = null;
            }
            while (this.field3253 > var2) {
                this.field3254[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                var2++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3260[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z", line = 126)
    public static final boolean method1866(int arg0, int arg1) {
        try {
            field3250++;
            if (arg0 != 4) {
                field3245 = null;
            }
            return arg1 == 7 || arg1 == 8 || arg1 == 9;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3260[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIB)V", line = 139)
    public final void method1867(int arg0, int arg1, int arg2, byte arg3) {
        try {
            field3251++;
            int[] var5 = new int[arg0];
            int[] var6 = new int[arg1];
            int[] var7 = new int[arg2];
            for (int var8 = 0; var8 < arg0; var8++) {
                var5[var8] = (var8 << 12) / arg0;
            }
            int var9 = 0;
            if (arg3 > -77) {
                this.field3255 = null;
            }
            while (var9 < arg1) {
                var6[var9] = (var9 << 12) / arg1;
                var9++;
            }
            for (int var10 = 0; var10 < arg2; var10++) {
                var7[var10] = (var10 << 12) / arg2;
            }
            this.method252(true);
            for (int var11 = 0; var11 < arg2; var11++) {
                for (int var12 = 0; var12 < arg1; var12++) {
                    for (int var13 = 0; var13 < arg0; var13++) {
                        for (int var14 = 0; var14 < this.field3253; var14++) {
                            int var15 = this.field3254[var14] << 12;
                            int var16 = var5[var13] * var15 >> 12;
                            int var17 = this.field3247 * var15 >> 12;
                            int var18 = this.field3249 * var15 >> 12;
                            int var19 = var7[var11] * var15 >> 12;
                            int var20 = this.field3256 * var15 >> 12;
                            int var21 = var6[var12] * var15 >> 12;
                            int var22 = this.field3256 * var19;
                            int var23 = this.field3249 * var21;
                            int var24 = this.field3247 * var16;
                            int var25 = var24 >> 12;
                            int var26 = var25 + 1;
                            int var27 = var25 & 0xFF;
                            int var28 = var23 >> 12;
                            int var29 = var28 + 1;
                            int var30 = var28 & 0xFF;
                            int var31 = var22 >> 12;
                            int var32 = var31 + 1;
                            int var33 = var23 & 0xFFF;
                            int var34 = var31 & 0xFF;
                            int var35 = var22 & 0xFFF;
                            int var36;
                            if (var26 < var17) {
                                var36 = var26 & 0xFF;
                            } else {
                                var36 = 0;
                            }
                            int var37;
                            if (var32 >= var20) {
                                var37 = 0;
                            } else {
                                var37 = var32 & 0xFF;
                            }
                            int var38 = var24 & 0xFFF;
                            int var39;
                            if (var18 <= var29) {
                                var39 = 0;
                            } else {
                                var39 = var29 & 0xFF;
                            }
                            int var40 = class170.field2327[var33];
                            short var41 = this.field3255[var34];
                            int var42 = var33 - 4096;
                            short var43 = this.field3255[var37];
                            int var44 = var35 - 4096;
                            int var45 = class170.field2327[var35];
                            int var46 = var38 - 4096;
                            int var47 = class170.field2327[var38];
                            short var48 = this.field3255[var30 + var43];
                            short var49 = this.field3255[var39 + var41];
                            short var50 = this.field3255[var30 + var41];
                            short var51 = this.field3255[var39 + var43];
                            int var52 = class594.method4424(var35, var33, this.field3255[var27 + var50], 15, var38);
                            int var53 = class594.method4424(var35, var33, this.field3255[var36 + var50], 15, var46);
                            int var54 = ((var53 - var52) * var47 >> 12) + var52;
                            int var55 = class594.method4424(var35, var42, this.field3255[var27 + var49], 15, var38);
                            int var56 = class594.method4424(var35, var42, this.field3255[var36 + var49], 15, var46);
                            int var57 = var55 + ((var56 - var55) * var47 >> 12);
                            int var58 = ((var57 - var54) * var40 >> 12) + var54;
                            int var59 = class594.method4424(var44, var33, this.field3255[var27 + var48], 15, var38);
                            int var60 = class594.method4424(var44, var33, this.field3255[var36 + var48], 15, var46);
                            int var61 = var59 + ((var60 - var59) * var47 >> 12);
                            int var62 = class594.method4424(var44, var42, this.field3255[var27 + var51], 15, var38);
                            int var63 = class594.method4424(var44, var42, this.field3255[var36 + var51], 15, var46);
                            int var64 = ((var63 - var62) * var47 >> 12) + var62;
                            int var65 = ((var64 - var61) * var40 >> 12) + var61;
                            this.method256(980100556, ((var65 - var58) * var45 >> 12) + var58, var14);
                        }
                        this.method257((byte) -82);
                    }
                }
            }
        } catch (RuntimeException var67) {
            throw class759.method5498(var67, field3260[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIII)V", line = 344)
    public class212(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field3249 = arg3;
            this.field3257 = arg0;
            this.field3253 = arg1;
            this.field3247 = arg2;
            this.field3256 = arg4;
            this.method1865((byte) -27);
            this.method1861((byte) -105);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3260[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public abstract void method256(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public abstract void method252(boolean arg0);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public abstract void method257(byte arg0);

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1868(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1869(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
