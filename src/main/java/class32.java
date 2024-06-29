import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class32 {

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "[I")
    public int[] field410 = new int[1500];

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "[I")
    private int[] field406 = new int[1500];

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "[I")
    public int[] field415 = new int[1500];

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "[I")
    private int[] field404 = new int[1500];

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "[I")
    public int[] field417 = new int[1500];

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "[I")
    private int[] field412 = new int[1500];

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "I")
    private int field416 = 0;

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "Lh;")
    public static class15 field408 = class18.method153("_", 1);

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "Lh;")
    public static class15 field409 = class18.method153("Mace Shop", 1);

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "Z")
    public static boolean field414 = true;

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "[J")
    public static long[] field418 = new long[32];

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Lh;")
    public static class15 field405 = class18.method153("Jewellery", 1);

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "[[B")
    public static byte[][] field419 = new byte[250][];

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "Lv;")
    public static class36 field420;

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "[Lma;")
    public static class26[] field411;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B[[B[B)V", line = 6)
    private final void method209(byte arg0, byte[][] arg1, byte[] arg2) {
        int var4 = 0;
        while (true) {
            while (arg2.length > var4) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class22.field304;
                int var6 = (arg2[var4++] & 0xFF) * 64 - class31.field395;
                if (var5 > 0 && var6 > 0 && class33.field423 > var5 + 64 && class28.field357 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var7 + var5];
                        int var9 = class28.field357 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg2[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg0 != -86) {
                this.field404 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 63)
    public static final void method210(Component arg0, byte arg1) {
        if (arg1 != 66) {
            return;
        }
        try {
            Method var2 = class4.field74;
            if (var2 != null) {
                var2.invoke(arg0, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        arg0.addKeyListener(class21.field288);
        arg0.addFocusListener(class21.field288);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIIIIIIIB)V", line = 87)
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        int var10 = arg4 - arg7;
        int var11 = arg5 - arg1;
        int var12 = (arg0 - arg3 << 16) / var10;
        int var13 = (arg2 - arg6 << 16) / var11;
        if (arg8 != 52) {
            this.field406 = null;
        }
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg6 + var16;
                class18.method158(-123, arg7, arg1 + var14);
                int var19 = arg6 + var15;
                for (int var20 = 0; var20 < var10; var20++) {
                    int var21 = (var20 + 1) * var12 >> 16;
                    int var22 = var12 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = arg3 + var21;
                        int var25 = arg3 + var22;
                        int var26 = class15.method127(arg8 - 176);
                        int var27 = class25.method187(0);
                        if (var26 == 0 && var27 == 0) {
                            class8.method75(var19, var25, var18 - var19, -var25 + var24, method212((byte) -55));
                        } else {
                            byte var28 = class6.method54(false);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class8.method75(var19, var25, var17, var23, var26);
                            } else {
                                this.method221(-111, var17, var29 >> 2, class8.field114, method212((byte) -55), var26, true, var23, class8.field109 * var25 + var19, var28 & 0x3);
                            }
                            if (var27 > 0) {
                                byte var30 = class15.method136(true);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class8.method75(var19, var25, var17, var23, var27);
                                }
                                this.method221(-120, var17, var31 >> 2, class8.field114, method212((byte) -55), var27, var26 == 0, var23, class8.field109 * var25 + var19, var30 & 0x3);
                            }
                        }
                    }
                    class35.method233((byte) 121);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)I", line = 184)
    private static final int method212(byte arg0) {
        if (arg0 != -55) {
            field420 = null;
        }
        return class12.field175 == null ? 0 : class12.field175[class15.field220];
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I[B)V", line = 200)
    private final void method213(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != 1) {
            return;
        }
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class22.field304;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class31.field395;
                if (var4 > 0 && var5 > 0 && class33.field423 > var4 + 64 && class28.field357 > var5 + 64) {
                    mapview.field57 = var4 >> 6;
                    class9.field123 = class28.field357 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class20.method177(4, class28.field357 - var7 - var5 - 1 - 64, (byte) 121, var9, var4 + var6);
                                if (class21.field299[class9.field123][mapview.field57] == null) {
                                    class21.field299[class9.field123][mapview.field57] = new class36();
                                    class21.field299[class9.field123][mapview.field57].field452 = new byte[4096];
                                }
                                class21.field299[class9.field123][mapview.field57].field452[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class21.field299[class9.field123][mapview.field57] != null) {
                        class21.field299[class9.field123][mapview.field57].method241((byte) -79);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg1[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IBIIIIIIIII)V", line = 281)
    public final void method214(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field416 == 0) {
            int var12 = arg7 - arg10;
            int var13 = arg6 - arg3;
            int var14 = (arg4 - arg5 << 16) / var13;
            int var15 = (arg2 - arg0 << 16) / var12;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var15 * var16 >> 16;
                int var18 = (var16 + 1) * var15 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class18.method158(-116, arg3, arg10 + var16);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = (var20 + 1) * var14 >> 16;
                        int var22 = var14 * var20 >> 16;
                        int var23 = var21 - var22;
                        if (var23 > 0) {
                            int var24 = class19.method161((byte) 49) & 0xFF;
                            if (var24 != 0) {
                                this.field404[this.field416] = var24 - 1;
                                this.field412[this.field416] = var19 / 2 + var17;
                                this.field406[this.field416] = var23 / 2 + var22;
                                this.field416++;
                            }
                        }
                        class35.method233((byte) 127);
                    }
                }
            }
        }
        if (arg1 > -54) {
            field405 = null;
        }
        for (int var25 = 0; var25 < this.field416; var25++) {
            if (class14.field212[this.field404[var25]] != null) {
                class14.field212[this.field404[var25]].method147(this.field412[var25] - 7, this.field406[var25] - 7);
            }
        }
        if (arg9 > 0) {
            for (int var26 = 0; var26 < this.field416; var26++) {
                if (this.field404[var26] == arg8) {
                    class14.field212[this.field404[var26]].method147(this.field412[var26] - 7, this.field406[var26] + -7);
                    if (arg9 % 10 < 5) {
                        class8.method77(this.field412[var26], this.field406[var26], 15, 16776960, 128);
                        class8.method77(this.field412[var26], this.field406[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field416 = 0;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(DDDB)I", line = 396)
    private final int method215(double arg0, double arg1, double arg2, byte arg3) {
        if (arg3 != -35) {
            method212((byte) 38);
        }
        double var8 = arg2;
        double var10 = arg2;
        double var12 = arg2;
        if (arg1 != 0.0D) {
            double var14 = arg0 + 0.3333333333333333D;
            double var16;
            if (arg2 < 0.5D) {
                var16 = (arg1 + 1.0D) * arg2;
            } else {
                var16 = arg1 + arg2 - arg1 * arg2;
            }
            double var18 = arg2 * 2.0D - var16;
            if (var14 > 1.0D) {
                var14--;
            }
            if (var14 * 6.0D < 1.0D) {
                var10 = (var16 - var18) * 6.0D * var14 + var18;
            } else if (var14 * 2.0D < 1.0D) {
                var10 = var16;
            } else if (var14 * 3.0D < 2.0D) {
                var10 = (var16 - var18) * (-var14 + 0.6666666666666666D) * 6.0D + var18;
            } else {
                var10 = var18;
            }
            double var22 = arg0 - 0.3333333333333333D;
            if (arg0 * 6.0D < 1.0D) {
                var8 = (var16 - var18) * 6.0D * arg0 + var18;
            } else if (arg0 * 2.0D < 1.0D) {
                var8 = var16;
            } else if (arg0 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - arg0) * (-var18 + var16) * 6.0D + var18;
            } else {
                var8 = var18;
            }
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var16 - var18) * 6.0D * var22 + var18;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var16;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var22) * (-var18 + var16) * 6.0D + var18;
            } else {
                var12 = var18;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var25 << 8) + (var24 << 16) + var26;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIIDIIIIII)V", line = 495)
    public final void method216(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var12 = arg1 - arg5;
        if (arg7 != 428849264) {
            this.method222(null, (byte) -71);
        }
        int var13 = arg9 - arg6;
        int var14 = (arg0 - arg8 << 16) / var13;
        int var15 = (arg2 - arg4 << 16) / var12;
        if (arg9 - arg6 > -arg8 + arg0) {
            return;
        }
        this.field416 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class18.method158(-105, arg5, arg6 + var16);
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = (var20 + 1) * var15 >> 16;
                    int var22 = var15 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = class31.method207(-86) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                field411[var24 - 1].method191(var17, var22, var19 * 2 + 1, var23 * 2 + 1);
                                if (!(arg3 < 4.0D) && arg3 > 4.2D && arg3 > 6.2D) {
                                }
                            } else {
                                field411[var24 - 1].method191(var17 - var19 / 2, var22 - var23 / 2, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class35.method233((byte) 126);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I[[B)V", line = 621)
    private final void method217(int arg0, byte[][] arg1) {
        int var3 = class28.field357;
        int var4 = class33.field423;
        int[] var5 = new int[var3];
        for (int var6 = arg0; var6 < var3; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var4 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var3; var10++) {
                int var11 = class23.field317[var8[var10] & 0xFF];
                int var12 = class23.field317[var9[var10] & 0xFF];
                if (var11 <= 0 && mapview.method2(var10, (byte) -50, var7 + 5) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && mapview.method2(var10, (byte) -50, var7 - 5) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var4 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var3 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 >> 10 & 0x3FF) - (var17 >> 10 & 0x3FF);
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    if (var14 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class35.field440[var20][var19] == null) {
                            class35.field440[var20][var19] = new int[4096];
                        }
                        class35.field440[var20][var19][mapview.method14(63, var7) + mapview.method14(var16 << 6, 4032)] = this.method215((double) var13 / 8533.0D, (double) var15 / 8533.0D, (double) var14 / 8533.0D, (byte) -35);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([BZ)V", line = 728)
    private final void method218(byte[] arg0, boolean arg1) {
        int var3 = 0;
        if (arg1) {
            this.method218(null, false);
        }
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class22.field304;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class31.field395;
                if (var4 > 0 && var5 > 0 && class33.field423 > var4 + 64 && class28.field357 > var5 + 64) {
                    mapview.field57 = var4 >> 6;
                    class9.field123 = class28.field357 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class20.method177(3, class28.field357 - var7 - var5 - 64 - 1, (byte) 121, var9, var4 + var6);
                                if (class25.field335[class9.field123][mapview.field57] == null) {
                                    class25.field335[class9.field123][mapview.field57] = new class36();
                                    class25.field335[class9.field123][mapview.field57].field452 = new byte[4096];
                                }
                                class25.field335[class9.field123][mapview.field57].field452[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class25.field335[class9.field123][mapview.field57] != null) {
                        class25.field335[class9.field123][mapview.field57].method241((byte) -45);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(B)V", line = 809)
    public static void method219(byte arg0) {
        field420 = null;
        field405 = null;
        field419 = null;
        field409 = null;
        field418 = null;
        if (arg0 > -120) {
            method212((byte) -24);
        }
        field411 = null;
        field408 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(ILka;)V", line = 835)
    public final void method220(int arg0, class22 arg1) {
        class19 var3 = new class19(arg1.method101(class6.field98, class36.field451, false));
        int var4 = var3.method166(2);
        int var5 = var3.method166(2);
        int var6 = var3.method166(2);
        int var7 = var3.method166(2);
        int var8 = var3.method166(2);
        int var9 = var3.method166(2);
        var3.method160((byte) -119);
        class28.field357 = (var7 - var5) * 64 + 64;
        class31.field395 = var5 * 64;
        class14.field213 = class31.field395 + class28.field357 - var9 * 64;
        class22.field304 = var4 * 64;
        class20.field285 = var8 * 64 - class22.field304;
        class33.field423 = (var6 + 1 - var4) * 64;
        int var10 = 76 / ((12 - arg0) / 62);
        this.method223(class28.field357, 8701, class33.field423);
        class19 var11 = new class19(arg1.method101(class24.field330, class36.field451, false));
        int var12 = var11.method166(2);
        class23.field317 = new int[var12 + 1];
        for (int var13 = 0; var13 < var12; var13++) {
            class23.field317[var13 + 1] = var11.method162((byte) 118);
        }
        int var14 = var11.method166(2);
        class24.field324 = new int[var14 + 1];
        for (int var15 = 0; var15 < var14; var15++) {
            class24.field324[var15 + 1] = var11.method162((byte) 116);
        }
        byte[] var16 = arg1.method101(class15.field224, class36.field451, false);
        byte[][] var17 = new byte[class33.field423][class28.field357];
        this.method209((byte) -86, var17, var16);
        byte[] var18 = arg1.method101(class25.field334, class36.field451, false);
        this.method218(var18, false);
        byte[] var19 = arg1.method101(class35.field442, class36.field451, false);
        this.method213(1, var19);
        byte[] var20 = arg1.method101(class18.field253, class36.field451, false);
        class33.field422 = 0;
        this.method222(var20, (byte) 122);
        this.method217(0, var17);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(III[IIIZIII)V", line = 908)
    private final void method221(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 >= -103) {
            method219((byte) -35);
        }
        int var11 = class8.field109 - arg1;
        if (arg2 == 9) {
            arg2 = 1;
            arg9 = arg9 + 1 & 0x3;
        }
        if (arg2 == 10) {
            arg2 = 1;
            arg9 = arg9 + 3 & 0x3;
        }
        if (arg2 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg2 = 8;
        }
        if (arg2 == 1) {
            if (arg9 == 0) {
                for (int var18 = 0; var18 < arg7; var18++) {
                    for (int var19 = 0; var19 < arg1; var19++) {
                        if (var19 <= var18) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 1) {
                for (int var12 = arg7 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg1; var13++) {
                        if (var12 >= var13) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 2) {
                for (int var14 = 0; var14 < arg7; var14++) {
                    for (int var15 = 0; var15 < arg1; var15++) {
                        if (var14 <= var15) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 3) {
                for (int var16 = arg7 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg1; var17++) {
                        if (var16 <= var17) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg2 == 2) {
            if (arg9 == 0) {
                for (int var68 = arg7 - 1; var68 >= 0; var68--) {
                    for (int var69 = 0; var69 < arg1; var69++) {
                        if (var68 >> 1 >= var69) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 1) {
                for (int var70 = 0; var70 < arg7; var70++) {
                    for (int var71 = 0; var71 < arg1; var71++) {
                        if (var71 >= var70 << 1) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 2) {
                for (int var72 = 0; var72 < arg7; var72++) {
                    for (int var73 = arg1 - 1; var73 >= 0; var73--) {
                        if (var72 >> 1 >= var73) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 3) {
                for (int var74 = arg7 - 1; var74 >= 0; var74--) {
                    for (int var75 = arg1 - 1; var75 >= 0; var75--) {
                        if (var74 << 1 <= var75) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg2 == 3) {
            if (arg9 == 0) {
                for (int var20 = arg7 - 1; var20 >= 0; var20--) {
                    for (int var21 = arg1 - 1; var21 >= 0; var21--) {
                        if (var20 >> 1 >= var21) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 1) {
                for (int var22 = arg7 - 1; var22 >= 0; var22--) {
                    for (int var23 = 0; var23 < arg1; var23++) {
                        if (var22 << 1 <= var23) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 2) {
                for (int var26 = 0; var26 < arg7; var26++) {
                    for (int var27 = 0; var27 < arg1; var27++) {
                        if (var26 >> 1 >= var27) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 3) {
                for (int var24 = 0; var24 < arg7; var24++) {
                    for (int var25 = arg1 - 1; var25 >= 0; var25--) {
                        if (var25 >= var24 << 1) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg2 == 4) {
            if (arg9 == 0) {
                for (int var34 = arg7 - 1; var34 >= 0; var34--) {
                    for (int var35 = 0; var35 < arg1; var35++) {
                        if (var34 >> 1 <= var35) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 1) {
                for (int var32 = 0; var32 < arg7; var32++) {
                    for (int var33 = 0; var33 < arg1; var33++) {
                        if (var32 << 1 >= var33) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 2) {
                for (int var30 = 0; var30 < arg7; var30++) {
                    for (int var31 = arg1 - 1; var31 >= 0; var31--) {
                        if (var30 >> 1 <= var31) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg9 == 3) {
                for (int var28 = arg7 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg1 - 1; var29 >= 0; var29--) {
                        if (var29 <= var28 << 1) {
                            arg3[arg8] = arg5;
                        } else if (arg6) {
                            arg3[arg8] = arg4;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg2 != 5) {
            if (arg2 == 6) {
                if (arg9 == 0) {
                    for (int var58 = 0; var58 < arg7; var58++) {
                        for (int var59 = 0; var59 < arg1; var59++) {
                            if (arg1 / 2 >= var59) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var56 = 0; var56 < arg7; var56++) {
                        for (int var57 = 0; var57 < arg1; var57++) {
                            if (arg7 / 2 >= var56) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var54 = 0; var54 < arg7; var54++) {
                        for (int var55 = 0; var55 < arg1; var55++) {
                            if (var55 >= arg1 / 2) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var52 = 0; var52 < arg7; var52++) {
                        for (int var53 = 0; var53 < arg1; var53++) {
                            if (arg7 / 2 <= var52) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
            if (arg2 == 7) {
                if (arg9 == 0) {
                    for (int var36 = 0; var36 < arg7; var36++) {
                        for (int var37 = 0; var37 < arg1; var37++) {
                            if (var37 <= var36 - arg7 / 2) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var38 = arg7 - 1; var38 >= 0; var38--) {
                        for (int var39 = 0; var39 < arg1; var39++) {
                            if (var38 - arg7 / 2 >= var39) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var40 = arg7 - 1; var40 >= 0; var40--) {
                        for (int var41 = arg1 - 1; var41 >= 0; var41--) {
                            if (var41 <= var40 - arg7 / 2) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var42 = 0; var42 < arg7; var42++) {
                        for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                            if (var42 - arg7 / 2 >= var43) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
            if (arg2 == 8) {
                if (arg9 == 0) {
                    for (int var50 = 0; var50 < arg7; var50++) {
                        for (int var51 = 0; var51 < arg1; var51++) {
                            if (var50 - arg7 / 2 <= var51) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 1) {
                    for (int var44 = arg7 - 1; var44 >= 0; var44--) {
                        for (int var45 = 0; var45 < arg1; var45++) {
                            if (var44 - arg7 / 2 <= var45) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 2) {
                    for (int var48 = arg7 - 1; var48 >= 0; var48--) {
                        for (int var49 = arg1 - 1; var49 >= 0; var49--) {
                            if (var49 >= var48 - arg7 / 2) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg9 == 3) {
                    for (int var46 = 0; var46 < arg7; var46++) {
                        for (int var47 = arg1 - 1; var47 >= 0; var47--) {
                            if (var46 - arg7 / 2 <= var47) {
                                arg3[arg8] = arg5;
                            } else if (arg6) {
                                arg3[arg8] = arg4;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
        } else if (arg9 == 0) {
            for (int var60 = arg7 - 1; var60 >= 0; var60--) {
                for (int var61 = arg1 - 1; var61 >= 0; var61--) {
                    if (var60 >> 1 <= var61) {
                        arg3[arg8] = arg5;
                    } else if (arg6) {
                        arg3[arg8] = arg4;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg9 == 1) {
            for (int var62 = arg7 - 1; var62 >= 0; var62--) {
                for (int var63 = 0; var63 < arg1; var63++) {
                    if (var62 << 1 >= var63) {
                        arg3[arg8] = arg5;
                    } else if (arg6) {
                        arg3[arg8] = arg4;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg9 == 2) {
            for (int var66 = 0; var66 < arg7; var66++) {
                for (int var67 = 0; var67 < arg1; var67++) {
                    if (var67 >= var66 >> 1) {
                        arg3[arg8] = arg5;
                    } else if (arg6) {
                        arg3[arg8] = arg4;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg9 == 3) {
            for (int var64 = 0; var64 < arg7; var64++) {
                for (int var65 = arg1 - 1; var65 >= 0; var65--) {
                    if (var64 << 1 >= var65) {
                        arg3[arg8] = arg5;
                    } else if (arg6) {
                        arg3[arg8] = arg4;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([BB)V", line = 2038)
    private final void method222(byte[] arg0, byte arg1) {
        int var3 = 0;
        int var4 = 30 / ((arg1 - 57) / 50);
        while (true) {
            while (arg0.length > var3) {
                int var5 = (arg0[var3++] & 0xFF) * 64 - class22.field304;
                int var6 = (arg0[var3++] & 0xFF) * 64 - class31.field395;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class33.field423 && class28.field357 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        int var8 = class28.field357 - var6 - 1;
                        for (int var9 = -64; var9 < 0; var9++) {
                            while (true) {
                                int var10 = arg0[var3++] & 0xFF;
                                if (var10 == 0) {
                                    break;
                                }
                                if (var10 < 29) {
                                    class20.method177(0, class28.field357 - var9 - var6 - 1 - 64, (byte) 121, (byte) var10, var5 + var7);
                                } else if (var10 < 160) {
                                    class20.method177(1, class28.field357 - var6 - var9 - 64 - 1, (byte) 121, (byte) (var10 - 28), var5 + var7);
                                } else {
                                    class20.method177(2, class28.field357 - var9 - var6 - 64 - 1, (byte) 121, (byte) (var10 - 159), var5 + var7);
                                    if (class33.field422 >= 1500) {
                                        break;
                                    }
                                    this.field410[class33.field422] = var7 + var5;
                                    this.field415[class33.field422] = var8;
                                    this.field417[class33.field422] = var10 - 160;
                                    class33.field422++;
                                }
                            }
                            var8--;
                        }
                    }
                } else {
                    for (int var11 = 0; var11 < 64; var11++) {
                        byte var13;
                        for (int var12 = -64; var12 < 0; var12++) {
                            do {
                                var13 = arg0[var3++];
                            } while (var13 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(III)V", line = 2140)
    private final void method223(int arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg0 >> 6;
        class24.field327[0] = new byte[var5][var4][];
        class24.field327[1] = new byte[var5][var4][];
        class24.field327[2] = new byte[var5][var4][];
        class24.field327[3] = new byte[var5][var4][];
        class24.field327[4] = new byte[var5][var4][];
        if (arg1 != 8701) {
            this.method221(57, -119, 34, null, 93, -76, true, -7, -27, 89);
        }
        class35.field440 = new int[var5][var4][];
        class25.field335 = new class36[var5][var4];
        class21.field299 = new class36[var5][var4];
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIIIBIIII)V", line = 2163)
    public final void method224(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg8 - arg0;
        this.field416 = 0;
        int var11 = arg1 - arg2;
        int var12 = (arg6 - arg7 << 16) / var11;
        int var13 = (arg3 - arg5 << 16) / var10;
        if (arg4 > -25) {
            this.field406 = null;
        }
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var12 * var14 >> 16;
            int var16 = (var14 + 1) * var12 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class18.method158(-108, arg0, arg2 + var14);
                for (int var18 = 0; var18 < var10; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class25.method189((byte) -110) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var21 == 1) {
                                var23 = var19;
                            } else {
                                var23 = var20 - 1;
                            }
                            int var24;
                            if (var17 == 1) {
                                var24 = var15;
                            } else {
                                var24 = var16 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var25 = 13369344;
                                var22 -= 4;
                            }
                            if (var22 == 1) {
                                class8.method72(var15, var19, var21, var25);
                            } else if (var22 == 2) {
                                class8.method76(var15, var19, var17, var25);
                            } else if (var22 == 3) {
                                class8.method72(var24, var19, var21, var25);
                            } else if (var22 == 4) {
                                class8.method76(var15, var23, var17, var25);
                            } else if (var22 == 9) {
                                class8.method72(var15, var19, var21, 16777215);
                                class8.method76(var15, var19, var17, var25);
                            } else if (var22 == 10) {
                                class8.method72(var24, var19, var21, 16777215);
                                class8.method76(var15, var19, var17, var25);
                            } else if (var22 == 11) {
                                class8.method72(var24, var19, var21, 16777215);
                                class8.method76(var15, var23, var17, var25);
                            } else if (var22 == 12) {
                                class8.method72(var15, var19, var21, 16777215);
                                class8.method76(var15, var23, var17, var25);
                            } else if (var22 == 17) {
                                class8.method76(var15, var19, 1, var25);
                            } else if (var22 == 18) {
                                class8.method76(var24, var19, 1, var25);
                            } else if (var22 == 19) {
                                class8.method76(var24, var23, 1, var25);
                            } else if (var22 == 20) {
                                class8.method76(var15, var23, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class8.method76(var15 + var27, -var27 + var23, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class8.method76(var15 + var26, var19 + var26, 1, var25);
                                }
                            }
                        }
                        int var28 = class19.method161((byte) 49) & 0xFF;
                        if (var28 != 0) {
                            this.field404[this.field416] = var28 - 1;
                            this.field412[this.field416] = var15 + var17 / 2;
                            this.field406[this.field416] = var21 / 2 + var19;
                            this.field416++;
                        }
                    }
                    class35.method233((byte) 127);
                }
            }
        }
    }
}
