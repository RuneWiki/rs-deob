import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class267 {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[I")
    public static int[] field4106 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4108 = new String[100];

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Llm;")
    public static class210 field4100;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "[Lea;")
    public static class235[] field4107;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1876(int arg0, int arg1) {
        field4101++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class198.field2974 += arg0 * 128;
        if (class12.field135.length < class198.field2974) {
            class198.field2974 -= class12.field135.length;
            int var3 = (int) (Math.random() * 12.0D);
            class297.method2072(0, class293.field4493[var3]);
        }
        int var4 = 0;
        int var5 = (var2 - arg0) * 128;
        int var6 = arg0 * 128;
        int var7 = 0;
        int var8 = 21 / ((arg1 + 76) / 41);
        while (var7 < var5) {
            int var9 = class123.field1928[var4 + var6] - (class12.field135[class198.field2974 + var4 & class12.field135.length - 1] * arg0 / 6);
            if (var9 < 0) {
                var9 = 0;
            }
            class123.field1928[var4++] = var9;
            var7++;
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            int var11 = var10 * 128;
            for (int var12 = 0; var12 < 128; var12++) {
                int var13 = (int) (Math.random() * 100.0D);
                if (var13 < 50 && var12 > 10 && var12 < 118) {
                    class123.field1928[var11 + var12] = 255;
                } else {
                    class123.field1928[var11 + var12] = 0;
                }
            }
        }
        for (int var14 = 0; var14 < (var2 - arg0); var14++) {
            class317.field4778[var14] = class317.field4778[arg0 + var14];
        }
        for (int var15 = var2 - arg0; var15 < var2; var15++) {
            class317.field4778[var15] = (int) (Math.sin((double) class121.field1892 / 14.0D) * 16.0D + Math.sin((double) class121.field1892 / 15.0D) * 14.0D + Math.sin((double) class121.field1892 / 16.0D) * 12.0D);
            class121.field1892++;
        }
        int var16 = (arg0 + (class304.field4641 & 0x1)) / 2;
        class217.field3297 += arg0;
        if (var16 <= 0) {
            return;
        }
        for (int var17 = 0; var17 < class217.field3297; var17++) {
            int var18 = (int) (Math.random() * 124.0D) + 2;
            int var19 = (int) (Math.random() * 128.0D) + 128;
            class123.field1928[var18 + (var19 << 7)] = 192;
        }
        class217.field3297 = 0;
        for (int var20 = 0; var20 < var2; var20++) {
            int var21 = 0;
            int var22 = var20 * 128;
            for (int var23 = -var16; var23 < 128; var23++) {
                if ((var23 + var16) < 128) {
                    var21 += class123.field1928[var22 + var16 + var23];
                }
                if ((-(var16 - var23) - 1) >= 0) {
                    var21 -= class123.field1928[var22 + var23 - var16 - 1];
                }
                if (var23 >= 0) {
                    class78.field1083[var22 + var23] = var21 / (var16 * 2 + 1);
                }
            }
        }
        for (int var24 = 0; var24 < 128; var24++) {
            int var25 = 0;
            for (int var26 = -var16; var26 < var2; var26++) {
                int var27 = var26 * 128;
                if (var16 + var26 < var2) {
                    var25 += class78.field1083[var16 * 128 + var27 + var24];
                }
                if ((var26 - var16 - 1) >= 0) {
                    var25 -= class78.field1083[var24 + var27 - (var16 * 128) - 128];
                }
                if (var26 >= 0) {
                    class123.field1928[var24 + var27] = var25 / (var16 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 185)
    public static final void method1877(byte arg0) {
        class9 var1 = class60.field796;
        synchronized (class60.field796) {
            class205.field3084 = class286.field4311;
            class58.field743++;
            if (class123.field1927 >= 0) {
                while (class126.field1982 != class123.field1927) {
                    int var3 = class37.field452[class126.field1982];
                    class126.field1982 = class126.field1982 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class120.field1879[var3] = true;
                    } else {
                        class120.field1879[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class120.field1879[var2] = false;
                }
                class123.field1927 = class126.field1982;
            }
            class286.field4311 = class200.field2989;
        }
        if (arg0 < 79) {
            field4108 = (String[]) null;
        }
        field4102++;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V", line = 227)
    public static final void method1878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4099++;
        for (int var6 = arg0; var6 <= (arg0 + arg5); var6++) {
            for (int var7 = arg4; var7 <= (arg3 + arg4); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class212.field3225[arg1][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg0; var8 < (arg0 + arg5); var8++) {
            for (int var9 = arg4; var9 < (arg3 + arg4); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class294.field4502[arg1][var9][var8] = arg1 <= 0 ? 0 : class294.field4502[arg1 - 1][var9][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var10 = arg0 + 1; var10 < (arg0 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class294.field4502[arg1][arg4][var10] = class294.field4502[arg1][arg4 - 1][var10];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var11 = arg4 + 1; var11 < arg3 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class294.field4502[arg1][var11][arg0] = class294.field4502[arg1][var11][arg0 - 1];
                }
            }
        }
        if (arg4 < arg2 || arg0 < 0 || arg4 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 > 0 && class294.field4502[arg1][arg4 - 1][arg0] != 0) {
                class294.field4502[arg1][arg4][arg0] = class294.field4502[arg1][arg4 - 1][arg0];
            } else if (arg0 > 0 && class294.field4502[arg1][arg4][arg0 - 1] != 0) {
                class294.field4502[arg1][arg4][arg0] = class294.field4502[arg1][arg4][arg0 - 1];
            } else if (arg4 > 0 && arg0 > 0 && class294.field4502[arg1][arg4 - 1][arg0 - 1] != 0) {
                class294.field4502[arg1][arg4][arg0] = class294.field4502[arg1][arg4 - 1][arg0 - 1];
            }
        } else if (arg4 > 0 && class294.field4502[arg1 - 1][arg4 - 1][arg0] != class294.field4502[arg1][arg4 - 1][arg0]) {
            class294.field4502[arg1][arg4][arg0] = class294.field4502[arg1][arg4 - 1][arg0];
        } else if (arg0 > 0 && class294.field4502[arg1][arg4][arg0 - 1] != class294.field4502[arg1 - 1][arg4][arg0 - 1]) {
            class294.field4502[arg1][arg4][arg0] = class294.field4502[arg1][arg4][arg0 - 1];
        } else if (arg4 > 0 && arg0 > 0 && class294.field4502[arg1][arg4 - 1][arg0 - 1] != class294.field4502[arg1 - 1][arg4 - 1][arg0 - 1]) {
            class294.field4502[arg1][arg4][arg0] = class294.field4502[arg1][arg4 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIZII)V", line = 352)
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field4104++;
        class329 var7 = class10.method48(arg1, arg3, (byte) -11);
        if (var7 != null && var7.field4969 != null) {
            class286 var8 = new class286();
            var8.field4310 = var7.field4969;
            var8.field4330 = var7;
            class9.method39(var8, 6514);
        }
        class122.field1907 = arg4;
        class274.field4201 = arg6;
        class156.field2330 = arg0;
        class198.field2977 = arg1;
        class12.field133 = arg2;
        class115.field1762 = arg3;
        class149.field2247 = arg5;
        class247.method1666(var7, -128);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 384)
    public static void method1880(byte arg0) {
        if (arg0 > -35) {
            method1879(-23, -11, -111, -58, false, 70, -120);
        }
        field4100 = null;
        field4107 = null;
        field4106 = null;
        field4108 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLlm;)V", line = 403)
    public static final void method1881(byte arg0, class210 arg1) {
        if (arg0 != -26) {
            method1880((byte) 73);
        }
        field4105++;
        class226.field3449 = arg1;
    }
}
