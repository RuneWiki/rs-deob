import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class311 extends class172 {

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field4832 = 50;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field4818 = new String[field4832];

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "[I")
    public static int[] field4825 = new int[field4832];

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field4826 = 0;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[I")
    public static int[] field4823 = new int[field4832];

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
    public static int[] field4812 = new int[field4832];

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4822 = " ";

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "[I")
    public static int[] field4837 = new int[field4832];

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "[I")
    public static int[] field4834 = new int[field4832];

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
    public static int[] field4808 = new int[field4832];

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "[I")
    public static int[] field4824 = new int[field4832];

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4838 = "yellow:";

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "Ljava/util/Random;")
    public static Random field4821 = new Random();

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4840 = "level: ";

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "Ll;")
    public static class66 field4841 = new class66(20);

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[F")
    public static float[] field4842 = new float[4];

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public int field4828;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public int field4829;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public int field4835;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "Z")
    public static boolean field4839;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILvo;ILel;IIZLec;)V", line = 6)
    public static final void method2208(int arg0, class22 arg1, int arg2, class255 arg3, int arg4, int arg5, boolean arg6, class181 arg7) {
        if (arg2 != 10) {
            field4821 = (Random) null;
        }
        field4810++;
        class330 var8 = null;
        if (arg7.field2831 == 0) {
            if ((double) class351.field5597 == 3.0D) {
                var8 = class298.field4623;
            }
            if ((double) class351.field5597 == 4.0D) {
                var8 = class293.field4559;
            }
            if ((double) class351.field5597 == 6.0D) {
                var8 = class114.field1754;
            }
            if ((double) class351.field5597 >= 8.0D) {
                var8 = class160.field2551;
            }
        } else if (arg7.field2831 == 1) {
            if ((double) class351.field5597 == 3.0D) {
                var8 = class114.field1754;
            }
            if ((double) class351.field5597 == 4.0D) {
                var8 = class160.field2551;
            }
            if ((double) class351.field5597 == 6.0D) {
                var8 = class214.field3352;
            }
            if ((double) class351.field5597 >= 8.0D) {
                var8 = client.field1848;
            }
        } else if (arg7.field2831 == 2) {
            if ((double) class351.field5597 == 3.0D) {
                var8 = class214.field3352;
            }
            if ((double) class351.field5597 == 4.0D) {
                var8 = client.field1848;
            }
            if ((double) class351.field5597 == 6.0D) {
                var8 = class119.field1835;
            }
            if ((double) class351.field5597 >= 8.0D) {
                var8 = class66.field1000;
            }
        }
        if (var8 == null) {
            return;
        }
        int var9 = arg7.field2868;
        if (arg1.field340 && arg7.field2830 != -1) {
            var9 = arg7.field2830;
        }
        int var10 = class314.field4853.method1192(arg7.field2841, (int[]) null, class209.field3224);
        int var11 = 0;
        int var12 = arg1.field345;
        int var13;
        if (arg6) {
            var13 = var12 - var10 * var8.method2336() / 2;
        } else {
            var13 = var12 - (arg4 + (var8.method2329() * (var10 - 1)) + (var8.method2336() / 2));
        }
        int var14 = var13 - var8.method2336();
        int var15 = var13 + var8.method2336() / 2;
        for (int var16 = 0; var16 < var10; var16++) {
            String var17 = class209.field3224[var16];
            if (var16 < (var10 - 1)) {
                var17 = var17.substring(0, var17.length() - 4);
            }
            int var18 = var8.method2327(var17);
            if (var18 > var11) {
                var11 = var18;
            }
        }
        arg3.field3926 = arg0 + var14;
        arg3.field3925 = arg1.field343 - (-(var11 / 2) - arg5);
        arg3.field3927 = arg5 + arg1.field343 - (var11 / 2);
        int var19 = var14 + 2;
        arg3.field3923 = arg0 + var8.method2329() * var10 + var14;
        int var20 = arg1.field343 - (var11 / 2) - 5;
        if (arg7.field2829 != 0) {
            class60.method601(var20, var19, var11 + 10, var10 * var8.method2329() + -var19 + var14 + 1, arg7.field2829, arg7.field2829 >>> 24);
        }
        if (arg7.field2847 != 0) {
            class60.method594(var20, var19, var11 + 10, var14 + 1 + var8.method2329() * var10 + -var19, arg7.field2847, arg7.field2847 >>> 24);
        }
        for (int var21 = 0; var21 < var10; var21++) {
            String var22 = class209.field3224[var21];
            if (var21 < (var10 - 1)) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method2327(var22);
            var8.method2330(var22, arg1.field343, var15, var9, true);
            if (var11 < var23) {
                var11 = var23;
            }
            var15 += var8.method2329();
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V", line = 153)
    public static void method2209(int arg0) {
        field4821 = null;
        field4824 = null;
        field4838 = null;
        field4842 = null;
        field4834 = null;
        field4840 = null;
        field4823 = null;
        field4812 = null;
        field4837 = null;
        field4808 = null;
        field4841 = null;
        if (arg0 == -5) {
            field4822 = null;
            field4818 = null;
            field4825 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZII)V", line = 179)
    public static final void method2210(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = arg0;
        field4827++;
        int var8 = arg5 * arg5;
        int var9 = var8 << 1;
        int var10 = arg0 * arg0;
        int var11 = arg0 << 1;
        int var12 = var10 << 1;
        int var13 = (1 - var11) * var8 + var12;
        if (arg3) {
            field4818 = (String[]) null;
        }
        int var14 = var10 - ((var11 - 1) * var9);
        int var15 = var8 << 2;
        int var16 = ((arg0 << 1) - 3) * var9;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var12;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg0 - 1) * var15;
        if (arg2 >= class328.field5042 && arg2 <= class284.field4385) {
            int var21 = class268.method1965(arg1 + arg5, class128.field2130, class43.field693, -114);
            int var22 = class268.method1965(arg1 - arg5, class128.field2130, class43.field693, -66);
            class283.method2059(arg4, class133.field2235[arg2], (byte) 90, var21, var22);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var18;
                    var18 += var17;
                    var14 += var19;
                    var19 += var17;
                    var6++;
                }
            }
            if (var14 < 0) {
                var6++;
                var13 += var18;
                var14 += var19;
                var18 += var17;
                var19 += var17;
            }
            var13 += -var20;
            var20 -= var15;
            var14 += -var16;
            var16 -= var15;
            var7--;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (var24 >= class328.field5042 && class284.field4385 >= var23) {
                int var25 = class268.method1965(arg1 + var6, class128.field2130, class43.field693, -77);
                int var26 = class268.method1965(arg1 - var6, class128.field2130, class43.field693, -94);
                if (var23 >= class328.field5042) {
                    class283.method2059(arg4, class133.field2235[var23], (byte) 100, var25, var26);
                }
                if (var24 <= class284.field4385) {
                    class283.method2059(arg4, class133.field2235[var24], (byte) 112, var25, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V", line = 294)
    public static final void method2211(int arg0, boolean arg1) {
        field4811++;
        if (class90.field1276 == arg1) {
            return;
        }
        class90.field1276 = arg1;
        if (arg0 != 0) {
            field4839 = true;
        }
        class286.method2074(arg0 ^ 0x13);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLua;)[Lt;", line = 310)
    public static final class356[] method2212(byte arg0, class323 arg1) {
        field4816++;
        if (!arg1.method2271(-30627)) {
            return new class356[0];
        }
        class95 var2 = arg1.method2274(0);
        while (var2.field1447 == 0) {
            class188.method1443(10, 10L);
        }
        if (var2.field1447 == 2) {
            return new class356[0];
        }
        if (arg0 > -125) {
            field4842 = (float[]) null;
        }
        int[] var3 = (int[]) ((int[]) var2.field1446);
        class356[] var4 = new class356[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class356 var6 = new class356();
            var4[var5] = var6;
            var6.field5662 = var3[var5 << 2];
            var6.field5664 = var3[(var5 << 2) + 1];
            var6.field5667 = var3[(var5 << 2) + 2];
            var6.field5666 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 392)
    public static final void method2213(boolean arg0) {
        field4830++;
        if (class351.field5602 == null) {
            return;
        }
        if (class294.field4577 < 10) {
            if (!class351.field5590.method211(class351.field5602.field898, 119)) {
                class294.field4577 = class266.field4129.method209((byte) 114, class351.field5602.field898) / 10;
                return;
            }
            class345.method2435((byte) 114);
            class294.field4577 = 10;
        }
        if (class294.field4577 == 10) {
            class351.field5592 = class351.field5602.field904 >> 6 << 6;
            class351.field5596 = (class351.field5602.field895 >> 6 << 6) + 64 - class351.field5592;
            int var1 = -1;
            int[] var2 = new int[3];
            class351.field5598 = class351.field5602.field886 >> 6 << 6;
            class351.field5593 = (class351.field5602.field888 >> 6 << 6) - (class351.field5598 - 64);
            int var3 = -1;
            if (class351.field5602.method568(class49.field755 + (class173.field2746.field1286 >> 7), (class173.field2746.field1359 >> 7) + class358.field5696, class119.field1826, var2, (byte) 47)) {
                var3 = class351.field5593 + class351.field5598 - var2[2] - 1;
                var1 = var2[1] - class351.field5592;
            }
            if (!class115.field1768 && var1 >= 0 && var1 < class351.field5596 && var3 >= 0 && class351.field5593 > var3) {
                int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
                class335.field5120 = var4;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class348.field5530 = var5;
            } else if (class170.field2680 == -1 || class75.field1110 == -1) {
                class351.field5602.method573(class351.field5602.field887 >> 14 & 0x3FFF, var2, class351.field5602.field887 & 0x3FFF, (byte) 65);
                class335.field5120 = var2[1] - class351.field5592;
                class348.field5530 = class351.field5593 + class351.field5598 - var2[2] - 1;
            } else {
                class351.field5602.method573(class170.field2680, var2, class75.field1110, (byte) 114);
                if (var2 != null) {
                    class348.field5530 = class351.field5598 + class351.field5593 - var2[2] - 1;
                    class335.field5120 = var2[1] - class351.field5592;
                }
                class115.field1768 = false;
                class75.field1110 = -1;
                class170.field2680 = -1;
            }
            if (class351.field5602.field891 == 37) {
                class351.field5597 = 3.0F;
                class351.field5595 = 3.0F;
            } else if (class351.field5602.field891 == 50) {
                class351.field5597 = 4.0F;
                class351.field5595 = 4.0F;
            } else if (class351.field5602.field891 == 75) {
                class351.field5597 = 6.0F;
                class351.field5595 = 6.0F;
            } else if (class351.field5602.field891 == 100) {
                class351.field5597 = 8.0F;
                class351.field5595 = 8.0F;
            } else if (class351.field5602.field891 == 200) {
                class351.field5597 = 16.0F;
                class351.field5595 = 16.0F;
            } else {
                class351.field5597 = 8.0F;
                class351.field5595 = 8.0F;
            }
            class71.method679((byte) -34);
            class351.field5607 = new int[class51.field798 + 1];
            int var6 = class351.field5596 >> 6;
            int var7 = class351.field5593 >> 6;
            class351.field5617 = new byte[var6][var7][];
            class351.field5613 = new byte[var6][var7][];
            class351.field5608 = new byte[var6][var7][];
            class351.field5616 = new int[var6][var7][];
            class351.field5618 = new byte[var6][var7][];
            class351.field5609 = new int[var6][var7][];
            class351.field5612 = new byte[var6][var7][];
            class128.field2131 = new class317();
            class338.field5202 = new class314();
            int var8 = class221.field3437 >> 2 << 10;
            int var9 = class261.field3999 >> 1;
            class351.method2484(var8, var9);
            class255.method1890(1024, 256, -111);
            class309.method2203(256, 256, false);
            class48.method467(4096, 256);
            class294.field4577 = 20;
            return;
        }
        if (arg0) {
            method2211(-31, false);
        }
        if (class294.field4577 == 20) {
            class290.method2090((byte) 25, new class25(class351.field5590.method215("underlay", false, class351.field5602.field898)));
            class294.field4577 = 30;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 30) {
            class351.method2471(new class25(class351.field5590.method215("overlay", false, class351.field5602.field898)));
            class294.field4577 = 40;
            class63.method627(-33);
        } else if (class294.field4577 == 40) {
            class351.method2483(new class25(class351.field5590.method215("overlay2", false, class351.field5602.field898)));
            class294.field4577 = 50;
            class63.method627(-33);
        } else if (class294.field4577 == 50) {
            class351.method2476(new class25(class351.field5590.method215("loc", false, class351.field5602.field898)), class42.field668);
            class294.field4577 = 60;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 60) {
            if (class351.field5590.method193(class351.field5602.field898 + "_labels", (byte) 99)) {
                if (!class351.field5590.method211(class351.field5602.field898 + "_labels", -93)) {
                    return;
                }
                class351.field5601 = class185.method1427(!arg0, class351.field5602.field898 + "_labels", class351.field5590, class42.field668);
            } else {
                class351.field5601 = new class59(0);
            }
            class351.method2479();
            class294.field4577 = 70;
            class63.method627(-33);
        } else if (class294.field4577 == 70) {
            class298.field4623 = new class330(11, true, class64.field974);
            class294.field4577 = 73;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 73) {
            class293.field4559 = new class330(12, true, class64.field974);
            class294.field4577 = 76;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 76) {
            class114.field1754 = new class330(14, true, class64.field974);
            class294.field4577 = 79;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 79) {
            class160.field2551 = new class330(17, true, class64.field974);
            class294.field4577 = 82;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 82) {
            class214.field3352 = new class330(19, true, class64.field974);
            class294.field4577 = 85;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 85) {
            client.field1848 = new class330(22, true, class64.field974);
            class294.field4577 = 88;
            class246.method1852(3, true);
            class63.method627(-33);
        } else if (class294.field4577 == 88) {
            class119.field1835 = new class330(26, true, class64.field974);
            class294.field4577 = 91;
            class246.method1852(3, true);
            class63.method627(-33);
        } else {
            class66.field1000 = new class330(30, true, class64.field974);
            class294.field4577 = 100;
            class246.method1852(3, true);
            class63.method627(-33);
            System.gc();
        }
    }
}
