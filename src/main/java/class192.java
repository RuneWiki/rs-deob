import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class192 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[Z")
    public boolean[] field3219 = new boolean[256];

    @OriginalMember(owner = "client!la", name = "p", descriptor = "[B")
    public byte[] field3233 = new byte[18002];

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public int field3236 = 0;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "[[B")
    public byte[][] field3228 = new byte[6][258];

    @OriginalMember(owner = "client!la", name = "q", descriptor = "[B")
    public byte[] field3234 = new byte[256];

    @OriginalMember(owner = "client!la", name = "E", descriptor = "[[I")
    public int[][] field3248 = new int[6][258];

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
    public int[] field3239 = new int[256];

    @OriginalMember(owner = "client!la", name = "t", descriptor = "[B")
    public byte[] field3237 = new byte[18002];

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[B")
    public byte[] field3227 = new byte[4096];

    @OriginalMember(owner = "client!la", name = "B", descriptor = "[I")
    public int[] field3245 = new int[6];

    @OriginalMember(owner = "client!la", name = "L", descriptor = "[Z")
    public boolean[] field3255 = new boolean[16];

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public int field3252 = 0;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "[[I")
    public int[][] field3253 = new int[6][258];

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
    public int[] field3230 = new int[16];

    @OriginalMember(owner = "client!la", name = "N", descriptor = "[I")
    public int[] field3257 = new int[257];

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[[I")
    public int[][] field3247 = new int[6][258];

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lhi;")
    public static class82 field3225 = class95.method664((byte) -48, ")1");

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lhi;")
    public static class82 field3242 = class95.method664((byte) -28, "loginscreen");

    @OriginalMember(owner = "client!la", name = "K", descriptor = "Lhi;")
    public static class82 field3254 = class95.method664((byte) -128, " de votre liste noire)3");

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lhi;")
    public static class82 field3218 = class95.method664((byte) -67, " )2>");

    @OriginalMember(owner = "client!la", name = "f", descriptor = "B")
    public byte field3223;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public int field3240;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lum;")
    public static class222 field3220;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "Lei;")
    public static class70 field3249;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[B")
    public byte[] field3221;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[B")
    public byte[] field3241;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 5)
    public static void method1334(byte arg0) {
        field3249 = null;
        field3225 = null;
        field3218 = null;
        field3242 = null;
        if (arg0 > 116) {
            field3254 = null;
            field3220 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZZI)Lhi;", line = 27)
    public static final class82 method1335(int arg0, boolean arg1, boolean arg2, int arg3) {
        field3256++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        int var5 = arg3 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg3 /= arg0;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        if (arg2) {
            field3218 = (class82) null;
        }
        class82 var10 = new class82();
        var10.field1468 = var6;
        var10.field1419 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIZII)V", line = 148)
    public static final void method1336(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3229++;
        if (class260.field4465 == arg2 && class126.field2215 == arg6 && class287.field4826 == arg3 || class123.method841(false)) {
            return;
        }
        class126.field2215 = arg6;
        class260.field4465 = arg2;
        class287.field4826 = arg3;
        if (class123.method841(false)) {
            class287.field4826 = 0;
        }
        int var7 = -39 % ((-arg1 - 59) / 51);
        if (arg4) {
            class292.method2014(28, 28);
        } else {
            class292.method2014(28, 25);
        }
        class323.method2230(class289.field4847, (byte) 67, true);
        int var8 = class226.field3916;
        int var9 = class230.field3976;
        class230.field3976 = arg2 * 8 - 48;
        class226.field3916 = (arg6 - 6) * 8;
        class139.field2383 = class39.method308(0, class126.field2215 * 8, class260.field4465 * 8);
        class32.field473 = null;
        int var10 = class230.field3976 - var9;
        int var11 = class226.field3916 - var8;
        int var12 = class226.field3916;
        int var13 = class230.field3976;
        if (arg4) {
            class25.field333 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class275 var18 = class99.field1777[var17];
                if (var18 != null) {
                    var18.field1689 -= var11 * 128;
                    var18.field1685 -= var10 * 128;
                    if (var18.field1685 >= 0 && var18.field1685 <= 13184 && var18.field1689 >= 0 && var18.field1689 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field1723[var19] -= var10;
                            var18.field1720[var19] -= var11;
                        }
                        class43.field749[class25.field333++] = var17;
                    } else {
                        class99.field1777[var17].field4628 = null;
                        class99.field1777[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class275 var15 = class99.field1777[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field1723[var16] -= var10;
                        var15.field1720[var16] -= var11;
                    }
                    var15.field1685 -= var10 * 128;
                    var15.field1689 -= var11 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class81 var21 = class29.field405[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1723[var22] -= var10;
                    var21.field1720[var22] -= var11;
                }
                var21.field1685 -= var10 * 128;
                var21.field1689 -= var11 * 128;
            }
        }
        class297.field5058 = arg3;
        class168.field2932.method521(false, arg0, -1, arg5);
        byte var23 = 0;
        byte var24 = 1;
        byte var25 = 104;
        if (var10 < 0) {
            var24 = -1;
            var23 = 103;
            var25 = -1;
        }
        byte var26 = 104;
        byte var27 = 1;
        byte var28 = 0;
        if (var11 < 0) {
            var28 = 103;
            var27 = -1;
            var26 = -1;
        }
        for (int var29 = var23; var29 != var25; var29 += var24) {
            for (int var30 = var28; var30 != var26; var30 += var27) {
                int var31 = var30 + var11;
                int var32 = var10 + var29;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                        class107.field1889[var33][var29][var30] = class107.field1889[var33][var32][var31];
                    } else {
                        class107.field1889[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class181 var34 = (class181) class68.field1055.method1936(16173); var34 != null; var34 = (class181) class68.field1055.method1926((byte) 90)) {
            var34.field3087 -= var11;
            var34.field3085 -= var10;
            if (var34.field3085 < 0 || var34.field3087 < 0 || var34.field3085 >= 104 || var34.field3087 >= 104) {
                var34.method961((byte) 66);
            }
        }
        if (class111.field2008 != 0) {
            class38.field634 -= var11;
            class111.field2008 -= var10;
        }
        if (arg4) {
            class87.field1549 -= var10;
            class4.field32 -= var11 * 128;
            class325.field5578 -= var10;
            class24.field326 -= var11;
            class19.field252 -= var11;
            class219.field3792 -= var10 * 128;
        } else {
            class273.field4602 = 1;
        }
        class21.field282 = 0;
        if (class147.field2485 && arg4 && (Math.abs(var10) > 104 || Math.abs(var11) > 104)) {
            class317.method2171(true);
        }
        class138.field2377 = -1;
        class60.field947.method1938(71);
        class22.field300.method1938(71);
        class295.method2037();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lum;B)V", line = 418)
    public static final void method1337(class222 arg0, byte arg1) {
        field3244++;
        if (class282.field4743) {
            return;
        }
        if (class147.field2485) {
            class116.method793();
        } else {
            class320.method2214();
        }
        class100.field1798 = class177.method1255(1181, class168.field2933, arg0);
        int var2 = class180.field3078;
        int var3 = -57 / ((-arg1 - 59) / 55);
        int var4 = var2 * 956 / 503;
        class100.field1798.method604((class260.field4462 - var4) / 2, 0, var4, var2);
        class280.field4709 = class279.method1942(arg0, class187.field3141, 9465);
        class280.field4709.method1284(class260.field4462 / 2 - (class280.field4709.field3711 / 2), 18);
        class282.field4743 = true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I", line = 495)
    public static final int method1338(byte arg0, int arg1) {
        field3235++;
        int var2 = -121 % ((arg0 - 6) / 38);
        return arg1 >>> 8;
    }
}
