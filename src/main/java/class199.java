import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class199 extends class285 {

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "F")
    public static float field3239;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "Lbf;")
    public static class58 field3236;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "[I")
    public static int[] field3238;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "[[[B")
    public static byte[][][] field3240;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)[I", line = 9)
    public final int[] method60(boolean arg0, int arg1) {
        field3234++;
        int[] var3 = this.field4573.method1116(116, arg1);
        if (!arg0) {
            field3236 = (class58) null;
        }
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 126, arg1);
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 38)
    public static final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class45.field633 * 128) {
            arg0 = class45.field633 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class158.field2618 * 128) {
            arg2 = class158.field2618 * 128 - 1;
        }
        class259.field4143 = class170.field2801[arg3];
        class137.field2162 = class170.field2810[arg3];
        class20.field286 = class170.field2801[arg4];
        class157.field2606 = class170.field2810[arg4];
        class298.field4704 = arg0;
        class165.field2753 = arg1;
        class172.field2866 = arg2;
        class224.field3578 = arg0 / 128;
        class177.field2951 = arg2 / 128;
        class85.field1186 = class224.field3578 - class116.field1765;
        if (class85.field1186 < 0) {
            class85.field1186 = 0;
        }
        class180.field2983 = class177.field2951 - class116.field1765;
        if (class180.field2983 < 0) {
            class180.field2983 = 0;
        }
        class197.field3207 = class224.field3578 + class116.field1765;
        if (class197.field3207 > class45.field633) {
            class197.field3207 = class45.field633;
        }
        class113.field1720 = class177.field2951 + class116.field1765;
        if (class113.field1720 > class158.field2618) {
            class113.field1720 = class158.field2618;
        }
        short var15;
        if (class232.field3690) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class116.field1765 + class116.field1765 + 2; var16++) {
            for (int var17 = 0; var17 < class116.field1765 + class116.field1765 + 2; var17++) {
                int var18 = (var16 - class116.field1765 << 7) - (class298.field4704 & 0x7F);
                int var19 = (var17 - class116.field1765 << 7) - (class172.field2866 & 0x7F);
                int var20 = class224.field3578 + var16 - class116.field1765;
                int var21 = class177.field2951 + var17 - class116.field1765;
                if (var20 >= 0 && var21 >= 0 && var20 < class45.field633 && var21 < class158.field2618) {
                    int var22;
                    if (class189.field3099 == null) {
                        var22 = class97.field1380[0][var20][var21] + 128 - class165.field2753;
                    } else {
                        var22 = class189.field3099[0][var20][var21] + 128 - class165.field2753;
                    }
                    int var23 = class97.field1380[3][var20][var21] - class165.field2753 - 1000;
                    class316.field4906[var16][var17] = class303.method2162(var18, var23, var22, var19, var15);
                } else {
                    class316.field4906[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class116.field1765 + class116.field1765 + 1; var24++) {
            for (int var25 = 0; var25 < class116.field1765 + class116.field1765 + 1; var25++) {
                class213.field3485[var24][var25] = class316.field4906[var24][var25] || class316.field4906[var24 + 1][var25] || class316.field4906[var24][var25 + 1] || class316.field4906[var24 + 1][var25 + 1];
            }
        }
        class18.field238 = arg6;
        class309.field4810 = arg7;
        client.field1657 = arg8;
        class80.field1114 = arg9;
        class122.field1918 = arg10;
        class304.method2168();
        if (class310.field4833 != null) {
            class295.method2107(true);
            class88.method600(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class232.field3690) {
                class219.field3542 = false;
                class179.method1343(0, 0, -3);
                class87.method596((float[]) null);
                class118.method828();
            }
            class295.method2107(false);
        }
        class88.method600(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "(I)V", line = 166)
    public static void method1461(int arg0) {
        if (arg0 < -39) {
            field3238 = null;
            field3240 = (byte[][][]) null;
            field3236 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLjj;)Lui;", line = 178)
    public static final class194 method1462(byte arg0, class44 arg1) {
        field3235++;
        if (arg0 != 14) {
            method1463(104, (class44) null);
        }
        return new class194(arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method273(-867673064), arg1.method273(-867673064), arg1.method286((byte) -124));
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 191)
    public class199() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[[I", line = 201)
    public final int[][] method62(byte arg0, int arg1) {
        field3241++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) -75, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class287.field4599; var11++) {
                var8[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        if (arg0 < 121) {
            field3238 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjj;)V", line = 255)
    public static final void method1463(int arg0, class44 arg1) {
        field3237++;
        if (arg1.field573.length - arg1.field586 < 1) {
            return;
        }
        int var2 = arg1.method286((byte) -78);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field573.length - arg1.field586 < var3) {
            return;
        }
        class149.field2311 = arg1.method286((byte) -93);
        if (class149.field2311 < 1) {
            class149.field2311 = 1;
        } else if (class149.field2311 > 4) {
            class149.field2311 = 4;
        }
        class73.method488(-97, arg1.method286((byte) -71) == 1);
        class273.field4410 = arg1.method286((byte) -95) == 1;
        class297.field4695 = arg1.method286((byte) -127) == 1;
        class245.field3863 = arg1.method286((byte) -97) == 1;
        class322.field4989 = arg1.method286((byte) -93) == 1;
        class42.field535 = arg1.method286((byte) -95) == 1;
        class8.field123 = arg1.method286((byte) -109) == 1;
        class180.field2984 = arg1.method286((byte) -86) == 1;
        class18.field250 = arg1.method286((byte) -90);
        if (class18.field250 > 2) {
            class18.field250 = 2;
        }
        if (var2 >= 2) {
            class322.field4994 = arg1.method286((byte) -107) == 1;
        } else {
            class322.field4994 = arg1.method286((byte) -106) == 1;
            arg1.method286((byte) -127);
        }
        class245.field3872 = arg1.method286((byte) -120) == 1;
        class43.field541 = arg1.method286((byte) -118) == 1;
        class34.field460 = arg1.method286((byte) -83);
        if (class34.field460 > 2) {
            class34.field460 = 2;
        }
        class185.field3065 = class34.field460;
        class152.field2352 = arg1.method286((byte) -86) == arg0;
        class261.field4169 = arg1.method286((byte) -92);
        if (class261.field4169 > 127) {
            class261.field4169 = 127;
        }
        class210.field3447 = arg1.method286((byte) -76);
        class174.field2883 = arg1.method286((byte) -114);
        if (class174.field2883 > 127) {
            class174.field2883 = 127;
        }
        if (var2 >= 1) {
            class70.field994 = arg1.method271(21081);
            class45.field634 = arg1.method271(arg0 + 21080);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method286((byte) -78);
        }
        if (var2 >= 4) {
            int var4 = arg1.method286((byte) -120);
            if (class36.field480 < 96) {
                var4 = 0;
            }
            class294.method2101(var4);
        }
        if (var2 >= 5) {
            class97.field1376 = arg1.method238((byte) 82);
        }
        if (var2 >= 6) {
            class318.field4946 = arg1.method286((byte) -100);
        }
        if (var2 >= 7) {
            class159.field2627 = arg1.method286((byte) -109) == 1;
        }
        if (var2 >= 8) {
            class57.field803 = arg1.method286((byte) -81) == 1;
        }
        if (var2 >= 9) {
            class105.field1537 = arg1.method286((byte) -128);
        }
        if (var2 >= 10) {
            class79.field1111 = arg1.method286((byte) -114) != 0;
        }
        if (var2 >= 11) {
            class231.field3681 = arg1.method286((byte) -80) != 0;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLjj;I)V", line = 417)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field3242++;
        if (!arg0) {
            method1463(-99, (class44) null);
        }
        if (arg2 == 0) {
            this.field4572 = arg1.method286((byte) -112) == 1;
        }
    }
}
