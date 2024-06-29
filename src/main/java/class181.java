import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class181 extends class7 {

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
    private int[] field2817 = new int[this.field86];

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "Lui;")
    public static class98 field2820 = new class98(260);

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field2822 = 0;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    private int field2811;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "[B")
    private byte[] field2814;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 4)
    public final void method52(int arg0) {
        this.field2816 = 0;
        field2819++;
        if (arg0 > 54) {
            this.field2811 = 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 16)
    public final void method57(int arg0) {
        if (arg0 != 4) {
            method1264(-67);
        }
        this.field2816 = Math.abs(this.field2816);
        if (this.field2816 >= 4096) {
            this.field2816 = 4095;
        }
        this.method460(this.field2811++, (byte) (this.field2816 >> 4));
        field2813++;
        this.field2816 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V", line = 33)
    public final void method55(int arg0, int arg1, byte arg2) {
        this.field2816 += this.field2817[arg1] * arg0 >> 12;
        field2818++;
        if (arg2 >= -25) {
            this.method57(-15);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V", line = 49)
    public static final void method1262(int arg0, boolean arg1) {
        class96.field1383 = arg1;
        if (arg0 != -24903) {
            return;
        }
        field2812++;
        if (!class96.field1383) {
            int var2 = class159.field2552.method2250(-1613178296);
            int var3 = class159.field2552.method2227(0);
            int var4 = (class201.field3091 - class159.field2552.field5137) / 16;
            class177.field2752 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    class177.field2752[var5][var6] = class159.field2552.method2231((byte) -128);
                }
            }
            int var7 = class159.field2552.method2227(0);
            int var8 = class159.field2552.method2238(-7946);
            boolean var9 = class79.method539(class159.field2552.method2220(-21362), 127);
            int var10 = class159.field2552.method2250(arg0 - 1613153393);
            class285.field4673 = new int[var4];
            class54.field813 = new int[var4];
            class241.field3778 = new byte[var4][];
            class190.field2956 = null;
            class150.field2404 = new int[var4];
            class202.field3107 = new byte[var4][];
            class23.field352 = new byte[var4][];
            class71.field1096 = (byte[][]) null;
            class315.field5197 = new byte[var4][];
            boolean var11 = false;
            class356.field5644 = new int[var4];
            class51.field764 = new int[var4];
            if ((var3 / 8 == 48 || (var3 / 8) == 49) && var2 / 8 == 48) {
                var11 = true;
            }
            int var12 = 0;
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var11 = true;
            }
            for (int var13 = (var3 - 6) / 8; var13 <= ((var3 + 6) / 8); var13++) {
                for (int var14 = (var2 - 6) / 8; var14 <= ((var2 + 6) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class150.field2404[var12] = var15;
                        class285.field4673[var12] = -1;
                        class356.field5644[var12] = -1;
                        class54.field813[var12] = -1;
                        class51.field764[var12] = -1;
                    } else {
                        class150.field2404[var12] = var15;
                        class285.field4673[var12] = class97.field1406.method1510("m" + var13 + "_" + var14, class185.method1279(arg0, -24903));
                        class356.field5644[var12] = class97.field1406.method1510("l" + var13 + "_" + var14, 0);
                        class54.field813[var12] = class97.field1406.method1510("um" + var13 + "_" + var14, 0);
                        class51.field764[var12] = class97.field1406.method1510("ul" + var13 + "_" + var14, 0);
                    }
                    var12++;
                }
            }
            class304.method2132(var8, var3, false, var7, var9, var2, var10, (byte) -115);
            return;
        }
        boolean var16 = class79.method539(class159.field2552.method2220(-21362), -77);
        int var17 = class159.field2552.method2227(0);
        int var18 = class159.field2552.method2216((byte) 92);
        int var19 = class159.field2552.method2227(0);
        int var20 = class159.field2552.method2241((byte) 66);
        class159.field2552.method255(8);
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class159.field2552.method246(8, 1);
                    if (var24 == 1) {
                        class276.field4549[var21][var22][var23] = class159.field2552.method246(8, 26);
                    } else {
                        class276.field4549[var21][var22][var23] = -1;
                    }
                }
            }
        }
        class159.field2552.method253((byte) -98);
        int var25 = (class201.field3091 - class159.field2552.field5137) / 16;
        class177.field2752 = new int[var25][4];
        for (int var26 = 0; var26 < var25; var26++) {
            for (int var27 = 0; var27 < 4; var27++) {
                class177.field2752[var26][var27] = class159.field2552.method2231((byte) -124);
            }
        }
        int var28 = class159.field2552.method2215(true);
        class71.field1096 = (byte[][]) null;
        class54.field813 = new int[var25];
        class241.field3778 = new byte[var25][];
        class23.field352 = new byte[var25][];
        class51.field764 = new int[var25];
        class202.field3107 = new byte[var25][];
        class315.field5197 = new byte[var25][];
        class356.field5644 = new int[var25];
        class285.field4673 = new int[var25];
        class190.field2956 = null;
        class150.field2404 = new int[var25];
        int var29 = 0;
        for (int var30 = 0; var30 < 4; var30++) {
            for (int var31 = 0; var31 < 13; var31++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class276.field4549[var30][var31][var32];
                    if (var33 != -1) {
                        int var34 = (var33 & 0xFFFF39) >> 14;
                        int var35 = (var33 & 0x3FF8) >> 3;
                        int var36 = (var34 / 8 << 8) + (var35 / 8);
                        for (int var37 = 0; var37 < var29; var37++) {
                            if (class150.field2404[var37] == var36) {
                                var36 = -1;
                                break;
                            }
                        }
                        if (var36 != -1) {
                            class150.field2404[var29] = var36;
                            int var38 = var36 >> 8 & 0xFF;
                            int var39 = var36 & 0xFF;
                            class285.field4673[var29] = class97.field1406.method1510("m" + var38 + "_" + var39, arg0 + 24903);
                            class356.field5644[var29] = class97.field1406.method1510("l" + var38 + "_" + var39, 0);
                            class54.field813[var29] = class97.field1406.method1510("um" + var38 + "_" + var39, arg0 + 24903);
                            class51.field764[var29] = class97.field1406.method1510("ul" + var38 + "_" + var39, 0);
                            var29++;
                        }
                    }
                }
            }
        }
        class304.method2132(var18, var28, false, var20, var16, var17, var19, (byte) -115);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)V", line = 315)
    public void method460(int arg0, byte arg1) {
        this.field2814[this.field2811++] = (byte) (class235.method1623(arg1 >> 1, 127) + 127);
        field2810++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 323)
    public static final String method1263(int arg0, String arg1, String arg2, String arg3) {
        if (arg0 < 103) {
            field2820 = (class98) null;
        }
        int var4 = arg1.indexOf(arg2);
        field2809++;
        while (var4 != -1) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(arg2.length() + var4);
            var4 = arg1.indexOf(arg2, var4 + arg3.length());
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 343)
    public static void method1264(int arg0) {
        if (arg0 != 48) {
            field2821 = 27;
        }
        field2820 = null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIIIF)V", line = 363)
    public class181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field86; var7++) {
            this.field2817[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
