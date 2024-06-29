import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class145 {

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[[I")
    private int[][] field2261;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field2257 = 0;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2263 = "glow2:";

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "F")
    public static float field2267;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "[[[B")
    public static byte[][][] field2259;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I", line = 10)
    public final int method1071(int arg0, int arg1) {
        if (this.field2261 != null) {
            arg1 = (int) ((long) this.field2260 * (long) arg1 / (long) this.field2265);
        }
        if (arg0 != -32768) {
            this.field2265 = 2;
        }
        field2269++;
        return arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lak;ILak;)V", line = 35)
    public static final void method1072(class172 arg0, int arg1, class172 arg2) {
        int var3 = 50 % ((arg1 + 75) / 40);
        field2253++;
        class121.field1882 = arg2;
        class113.field1725 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 50)
    public static void method1073(byte arg0) {
        field2263 = null;
        if (arg0 > -100) {
            field2267 = -0.43352103F;
        }
        field2259 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)I", line = 63)
    public final int method1074(byte arg0, int arg1) {
        if (this.field2261 != null) {
            arg1 = ((int) ((long) this.field2260 * (long) arg1 / (long) this.field2265)) + 6;
        }
        field2256++;
        return arg0 < 56 ? 38 : arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I[B)[B", line = 77)
    public final byte[] method1075(int arg0, byte[] arg1) {
        if (arg0 != -128) {
            this.method1075(111, (byte[]) null);
        }
        field2258++;
        if (this.field2261 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2260 / (long) this.field2265) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field2261[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field2260 + var6;
                int var12 = var11 / this.field2265;
                var6 = var11 - this.field2265 * var12;
                var5 += var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIBIII)V", line = 147)
    public static final void method1076(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2266++;
        if (arg4 <= 19) {
            field2257 = 28;
        }
        if (arg5 < 1 || arg0 < 1 || arg5 > 102 || arg0 > 102) {
            return;
        }
        if (!class76.method518(-19076) && (class129.field2025[0][arg5][arg0] & 0x2) == 0) {
            int var8 = arg2;
            if ((class129.field2025[arg2][arg5][arg0] & 0x8) != 0) {
                var8 = 0;
            }
            if (class236.field3781 != var8) {
                return;
            }
        }
        int var9 = arg2;
        if (arg2 < 3 && (class129.field2025[1][arg5][arg0] & 0x2) == 2) {
            var9 = arg2 + 1;
        }
        class279.method2019(arg2, arg3, var9, arg0, class126.field1964[arg2], arg5, -1);
        if (arg1 >= 0) {
            boolean var10 = class297.field4695;
            class297.field4695 = true;
            class277.method2009(arg1, false, arg0, arg6, arg5, arg2, class126.field1964[arg2], false, (byte) -92, var9, arg7);
            class297.field4695 = var10;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B[B)V", line = 196)
    public static final void method1077(byte arg0, byte[] arg1) {
        if (arg0 != -65) {
            method1076(117, 111, -10, -65, (byte) -81, 8, 81, 23);
        }
        field2255++;
        class44 var2 = new class44(arg1);
        var2.field586 = arg1.length - 2;
        class48.field680 = var2.method271(21081);
        class51.field732 = new int[class48.field680];
        class54.field757 = new byte[class48.field680][];
        class18.field252 = new boolean[class48.field680];
        class278.field4481 = new byte[class48.field680][];
        class270.field4364 = new int[class48.field680];
        class102.field1489 = new int[class48.field680];
        class184.field3046 = new int[class48.field680];
        var2.field586 = arg1.length - ((class48.field680 * 8) + 7);
        class303.field4757 = var2.method271(arg0 ^ 0xFFFFADE6);
        class243.field3832 = var2.method271(arg0 ^ 0xFFFFADE6);
        int var3 = (var2.method286((byte) -103) & 0xFF) + 1;
        for (int var4 = 0; var4 < class48.field680; var4++) {
            class270.field4364[var4] = var2.method271(21081);
        }
        for (int var5 = 0; var5 < class48.field680; var5++) {
            class51.field732[var5] = var2.method271(21081);
        }
        for (int var6 = 0; var6 < class48.field680; var6++) {
            class102.field1489[var6] = var2.method271(class152.method1101(arg0, -21018));
        }
        for (int var7 = 0; var7 < class48.field680; var7++) {
            class184.field3046[var7] = var2.method271(class152.method1101(arg0, -21018));
        }
        var2.field586 = arg1.length - (class48.field680 * 8) - (var3 * 3 + -3 + 7);
        class205.field3370 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class205.field3370[var8] = var2.method273(arg0 - 867672999);
            if (class205.field3370[var8] == 0) {
                class205.field3370[var8] = 1;
            }
        }
        var2.field586 = 0;
        for (int var9 = 0; var9 < class48.field680; var9++) {
            int var10 = class102.field1489[var9];
            int var11 = class184.field3046[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class278.field4481[var9] = var14;
            class54.field757[var9] = var13;
            int var16 = var2.method286((byte) -68);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var14[var22] = var2.method246((byte) -39);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method246((byte) -113);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label92;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var13[var10 * var20 + var19] = var2.method246((byte) -19);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var14[var10 * var18 + var17] = var2.method246((byte) -51);
                    }
                    var17++;
                }
            }
            class18.field252[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V", line = 372)
    public class145(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class189.method1405(arg1, arg0, 6995);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2261 = new int[var5][14];
            this.field2260 = var4;
            this.field2265 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2261[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (-1.0E-4D > var16 || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
