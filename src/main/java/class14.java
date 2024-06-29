import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
    private int[] field233;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
    private int[] field244;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[B")
    private byte[] field241;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "[I")
    public static int[] field238 = new int[2000];

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lec;")
    public static class32 field235 = class73.method594("Bitte versuchen Sie)1", true);

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[Lq;")
    public static class111[] field230 = new class111[32768];

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[Lec;")
    public static class32[] field245 = new class32[100];

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lec;")
    public static class32 field234 = null;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "[Lec;")
    public static class32[] field239 = new class32[200];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[Lhb;")
    public static class51[] field237;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lec;IZ)V")
    public static final void method72(class32 arg0, int arg1, boolean arg2) {
        byte var3 = 4;
        field248++;
        int var4 = var3 + 6;
        int var5 = class121.field2878.method791(arg0, 250);
        int var6 = class121.field2878.method777(arg0, 250) * 13;
        int var7 = var3 + 6;
        class141.method1055(var7 - var3, -var3 + var4, var3 + var5 + var3, var6 - -var3 + var3, 0);
        class141.method1060(var7 - var3, -var3 + var4, var3 + var3 + var5, var6 - -var3 + var3, arg1);
        class121.field2878.method771(arg0, var7, var4, var5, var6, 16777215, -1, 1, 1, 0);
        class62.method477(114, var7 - var3, -var3 + var4, var3 + var5 + var3, var3 + var6 + var3);
        if (!arg2) {
            class32.method265(var5, var4, var7, var6, (byte) -121);
            return;
        }
        try {
            Graphics var8 = class107.field2541.getGraphics();
            class50.field1158.method122(var8, 29504, 0, 0);
        } catch (Exception var9) {
            class107.field2541.repaint();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[BIZ[B)I")
    public final int method73(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, byte[] arg5) {
        field236++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        if (!arg4) {
            field238 = null;
        }
        int var9 = arg1;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field244[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var11;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field244[var7];
            }
            int var12;
            if ((var12 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var12;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field244[var7];
            }
            int var13;
            if ((var13 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var13;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field244[var7];
            }
            int var14;
            if ((var14 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var14;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field244[var7];
            }
            int var15;
            if ((var15 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var15;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field244[var7];
            }
            int var16;
            if ((var16 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var16;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field244[var7];
            }
            int var17;
            if ((var17 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var17;
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field244[var7];
            }
            int var18;
            if ((var18 = this.field244[var7]) < 0) {
                arg2[arg0++] = (byte) ~var18;
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjd;)V")
    public static final void method74(int arg0, class66 arg1) {
        field228++;
        if (class133.field3049 != null) {
            try {
                class133.field3049.method1186((byte) -88, 0L);
                class133.field3049.method1177(arg1.field1587, (byte) 90, 24, arg1.field1569);
            } catch (Exception var3) {
            }
        }
        int var2 = -65 / ((-arg0 - 53) / 51);
        arg1.field1569 += 24;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III[B[BI)I")
    public final int method75(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        if (arg5 <= 77) {
            this.field244 = null;
        }
        int var7 = arg0 + arg1;
        field246++;
        int var8 = 0;
        int var9 = arg2 << 3;
        while (var7 > arg0) {
            int var10 = arg3[arg0] & 0xFF;
            int var11 = this.field233[var10];
            byte var12 = this.field241[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            var9 += var12;
            int var16 = var15 + (var13 + var12 - 1 >> 3);
            int var17 = var13 + 24;
            arg4[var15] = (byte) (var8 = class107.method864(var14, var11 >>> var17));
            if (var16 > var15) {
                var15++;
                var13 = var17 - 8;
                arg4[var15] = (byte) (var8 = var11 >>> var13);
                if (var15 < var16) {
                    var15++;
                    var13 -= 8;
                    arg4[var15] = (byte) (var8 = var11 >>> var13);
                    if (var15 < var16) {
                        var15++;
                        var13 -= 8;
                        arg4[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var13 -= 8;
                            var15++;
                            arg4[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ[BI)Z")
    public static final boolean method76(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field242++;
        class66 var4 = new class66(arg2);
        int var5 = -1;
        boolean var6 = arg1;
        label54: while (true) {
            int var7 = var4.method506(true);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var4.method506(true);
                    if (var11 == 0) {
                        continue label54;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 >> 6 & 0x3F;
                    int var13 = var12 + arg0;
                    int var14 = var4.method533(255) >> 2;
                    int var15 = var9 & 0x3F;
                    int var16 = var15 + arg3;
                    if (var13 > 0 && var16 > 0 && var13 < 103 && var16 < 103) {
                        class53 var17 = class5.method22(-127, var5);
                        if (var14 != 22 || !class154.field3531 || var17.field1194 != 0 || var17.field1236 == 1 || var17.field1205) {
                            var8 = true;
                            if (!var17.method415(65535)) {
                                class152.field3489++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var10 = var4.method506(true);
                if (var10 == 0) {
                    break;
                }
                var4.method533(255);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method77(byte arg0) {
        field230 = null;
        if (arg0 <= 52) {
            return;
        }
        field235 = null;
        field234 = null;
        field245 = null;
        field238 = null;
        field239 = null;
        field237 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Z")
    public static final boolean method78(byte arg0, int arg1) {
        int var2 = 40 / ((-arg0 - 38) / 37);
        field243++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method79(int arg0, int arg1) {
        field247++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class121.field2870[arg1];
        int var3 = class158.field3622[arg1];
        int var4 = class44.field1035[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class135.field3137[arg1];
        if (var4 == 7) {
            class44.field1027.method357(252, -79);
            class84.field1976++;
            class44.field1027.method557(var3, (byte) 29);
            class44.field1027.method514(var2, (byte) -76);
            class44.field1027.method547(-25680, var5);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -122);
            class34.field730 = var2;
        }
        if (var4 == 50) {
            class70 var6 = class52.field1176[var5];
            if (var6 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var6.field2761[0], class20.field373.field2761[0], 0, var6.field2738[0], 1, 2);
                class27.field499 = class9.field166;
                class135.field3149 = 2;
                class154.field3547 = class66.field1590;
                class154.field3545 = 0;
                class154.field3513++;
                class44.field1027.method357(31, -95);
                class44.field1027.method549(var5, 70);
            }
        }
        if (var4 == 10) {
            class111 var7 = field230[var5];
            if (var7 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var7.field2761[0], class20.field373.field2761[0], 0, var7.field2738[0], 1, 2);
                class32.field643++;
                class27.field499 = class9.field166;
                class154.field3545 = 0;
                class135.field3149 = 2;
                class154.field3547 = class66.field1590;
                class44.field1027.method357(185, -87);
                class44.field1027.method514(var5, (byte) -76);
            }
        }
        if (var4 == 22) {
            class70 var8 = class52.field1176[var5];
            if (var8 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var8.field2761[0], class20.field373.field2761[0], 0, var8.field2738[0], 1, 2);
                class154.field3547 = class66.field1590;
                class38.field902++;
                class135.field3149 = 2;
                class154.field3545 = 0;
                class27.field499 = class9.field166;
                class44.field1027.method357(29, -85);
                class44.field1027.method557(class43.field1003, (byte) 29);
                class44.field1027.method505(-2144754000, class146.field3321);
                class44.field1027.method549(var5, 84);
            }
        }
        if (var4 == 8) {
            class36 var9 = class130.method1002(var2, var3, (byte) -29);
            if (var9 != null) {
                class105.method858(-8602);
                class80.method633((byte) -28, var2, var3, class98.method770(true, class147.method1102(-100, var9)));
                class125.field2915 = 0;
                class147.field3355 = class61.method460((byte) -7, var9);
                if (class147.field3355 == null) {
                    class147.field3355 = class91.field2092;
                }
                if (!var9.field849) {
                    field234 = class52.method403(new class32[] { class134.field3130, var9.field834, class130.field2999 }, (byte) -20);
                    return;
                }
                field234 = class52.method403(new class32[] { var9.field814, class130.field2999 }, (byte) -20);
            }
            return;
        }
        if (var4 == 15) {
            class44.field1027.method357(44, -86);
            field227++;
            class44.field1027.method547(-25680, var2);
            class44.field1027.method557(var3, (byte) 29);
            class44.field1027.method514(var5, (byte) -76);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -107);
            class34.field730 = var2;
        }
        if (var4 == 36) {
            class20.field374++;
            boolean var10 = class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 0, var2, class20.field373.field2761[0], 0, var3, 0, 2);
            if (!var10) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var2, class20.field373.field2761[0], 0, var3, 1, 2);
            }
            class135.field3149 = 2;
            class27.field499 = class9.field166;
            class154.field3545 = 0;
            class154.field3547 = class66.field1590;
            class44.field1027.method357(80, -119);
            class44.field1027.method549(class72.field1701 + var2, 66);
            class44.field1027.method549(class118.field2838 + var3, 69);
            class44.field1027.method547(-25680, var5);
        }
        if (var4 == 43) {
            class32.field622++;
            class44.field1027.method357(204, -95);
            class44.field1027.method531(false, class43.field1003);
            class44.field1027.method527(var3, -2687);
            class44.field1027.method549(var5, 109);
            class44.field1027.method505(-2144754000, class146.field3321);
            class44.field1027.method505(-2144754000, var2);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -109);
            class34.field730 = var2;
        }
        if (var4 == 16) {
            class70 var12 = class52.field1176[var5];
            if (var12 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var12.field2761[0], class20.field373.field2761[0], 0, var12.field2738[0], 1, 2);
                class154.field3545 = 0;
                class27.field499 = class9.field166;
                class50.field1154++;
                class135.field3149 = 2;
                class154.field3547 = class66.field1590;
                class44.field1027.method357(138, -86);
                class44.field1027.method549(var5, 124);
            }
        }
        if (var4 == 45) {
            class70 var13 = class52.field1176[var5];
            if (var13 != null) {
                class114.field2661++;
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var13.field2761[0], class20.field373.field2761[0], 0, var13.field2738[0], 1, 2);
                class135.field3149 = 2;
                class27.field499 = class9.field166;
                class154.field3545 = 0;
                class154.field3547 = class66.field1590;
                class44.field1027.method357(35, -126);
                class44.field1027.method547(-25680, var5);
            }
        }
        if (var4 == 1002) {
            class154.field3547 = class66.field1590;
            class135.field3149 = 2;
            class27.field499 = class9.field166;
            class11.field187++;
            class154.field3545 = 0;
            class44.field1027.method357(32, -89);
            class44.field1027.method549(var5 >> 14 & 0x7FFF, 75);
        }
        if (var4 == 24) {
            class111 var14 = field230[var5];
            if (var14 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var14.field2761[0], class20.field373.field2761[0], 0, var14.field2738[0], 1, 2);
                class154.field3545 = 0;
                class33.field682++;
                class135.field3149 = 2;
                class154.field3547 = class66.field1590;
                class27.field499 = class9.field166;
                class44.field1027.method357(37, -123);
                class44.field1027.method505(-2144754000, var5);
            }
        }
        if (var4 == 58) {
            class111 var15 = field230[var5];
            if (var15 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var15.field2761[0], class20.field373.field2761[0], 0, var15.field2738[0], 1, 2);
                class154.field3547 = class66.field1590;
                class27.field499 = class9.field166;
                class154.field3545 = 0;
                class135.field3149 = 2;
                class44.field1027.method357(238, -105);
                class91.field2078++;
                class44.field1027.method554(8, class44.field1039);
                class44.field1027.method505(-2144754000, class41.field967);
                class44.field1027.method505(-2144754000, var5);
                class44.field1027.method505(-2144754000, class129.field2980);
            }
        }
        if (var4 == 3) {
            class159.field3659.method1132(class43.field990, var2, var3);
        }
        if (var4 == 40) {
            class121.field2868++;
            class44.field1027.method357(218, -122);
            class44.field1027.method531(false, var3);
            class36 var16 = class128.method993(var3, -101);
            if (var16.field843 != null && var16.field843[0][0] == 5) {
                int var17 = var16.field843[0][1];
                class27.field504[var17] = 1 - class27.field504[var17];
                class112.method884(var17, -2);
            }
        }
        if (var4 == 25) {
            field229++;
            class44.field1027.method357(231, -120);
            class44.field1027.method505(-2144754000, class129.field2980);
            class44.field1027.method554(8, class44.field1039);
            class44.field1027.method547(-25680, var5);
            class44.field1027.method547(-25680, var2);
            class44.field1027.method514(class41.field967, (byte) -76);
            class44.field1027.method527(var3, -2687);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -109);
            class34.field730 = var2;
        }
        if (var4 == 1001) {
            class154.field3545 = 0;
            class154.field3547 = class66.field1590;
            class135.field3149 = 2;
            class27.field499 = class9.field166;
            class125.field2901++;
            class44.field1027.method357(43, -117);
            class44.field1027.method505(-2144754000, var5);
        }
        if (var4 == 41) {
            class52.field1173++;
            class44.field1027.method357(9, -101);
            class44.field1027.method549(var5, 102);
            class44.field1027.method557(var3, (byte) 29);
            class44.field1027.method505(-2144754000, var2);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, 100);
            class34.field730 = var2;
        }
        if (var4 == 44) {
            class70 var18 = class52.field1176[var5];
            if (var18 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var18.field2761[0], class20.field373.field2761[0], 0, var18.field2738[0], 1, 2);
                class135.field3149 = 2;
                class50.field1155++;
                class27.field499 = class9.field166;
                class154.field3545 = 0;
                class154.field3547 = class66.field1590;
                class44.field1027.method357(10, -126);
                class44.field1027.method549(var5, 100);
            }
        }
        if (var4 == 21) {
            class105.method858(-8602);
            class36 var19 = class128.method993(var3, 77);
            class129.field2980 = var5;
            class41.field967 = var2;
            class44.field1039 = var3;
            class125.field2915 = 1;
            class132.method1010(var19, (byte) -101);
            class50.field1149 = class52.method403(new class32[] { class38.field903, class146.method1094(var5, 70).field1430, class130.field2999 }, (byte) -20);
            if (class50.field1149 == null) {
                class50.field1149 = class91.field2103;
            }
            return;
        }
        if (var4 == 4) {
            class110.method873(-4);
        }
        if (arg0 < 65) {
            return;
        }
        if (var4 == 38) {
            class44.field1027.method357(215, -84);
            class44.field1027.method547(-25680, var2);
            class44.field1027.method531(false, var3);
            class44.field1027.method505(-2144754000, var5);
            class117.field2802++;
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -101);
            class34.field730 = var2;
        }
        if (var4 == 13) {
            class56.field1293++;
            boolean var20 = class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 0, var2, class20.field373.field2761[0], 0, var3, 0, 2);
            if (!var20) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var2, class20.field373.field2761[0], 0, var3, 1, 2);
            }
            class135.field3149 = 2;
            class154.field3545 = 0;
            class154.field3547 = class66.field1590;
            class27.field499 = class9.field166;
            class44.field1027.method357(120, -116);
            class44.field1027.method549(var5, 110);
            class44.field1027.method549(class72.field1701 + var2, 95);
            class44.field1027.method549(class118.field2838 + var3, 74);
        }
        if (var4 == 18) {
            class44.field1027.method357(241, -116);
            class44.field1027.method514(var5, (byte) -76);
            class82.field1904++;
            class44.field1027.method505(-2144754000, var2);
            class44.field1027.method527(var3, -2687);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -106);
            class34.field730 = var2;
        }
        if (var4 == 6) {
            class70 var22 = class52.field1176[var5];
            if (var22 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var22.field2761[0], class20.field373.field2761[0], 0, var22.field2738[0], 1, 2);
                class112.field2620++;
                class27.field499 = class9.field166;
                class135.field3149 = 2;
                class154.field3547 = class66.field1590;
                class154.field3545 = 0;
                class44.field1027.method357(73, -90);
                class44.field1027.method547(-25680, var5);
            }
        }
        if (var4 == 39 && class50.field1159 == null) {
            class142.method1073(var2, true, var3);
            class50.field1159 = class130.method1002(var2, var3, (byte) -29);
            class132.method1010(class50.field1159, (byte) -107);
        }
        if (var4 == 1) {
            class156.method1202(var3, (byte) 90, var2, var5);
            class44.field1027.method357(174, -114);
            class130.field2989++;
            class44.field1027.method547(-25680, var5 >> 14 & 0x7FFF);
            class44.field1027.method505(-2144754000, class72.field1701 + var2);
            class44.field1027.method549(class118.field2838 + var3, 97);
        }
        if (var4 == 1006) {
            class154.field3547 = class66.field1590;
            class27.field499 = class9.field166;
            class135.field3149 = 2;
            class154.field3545 = 0;
            class111 var23 = field230[var5];
            if (var23 != null) {
                class97 var24 = var23.field2597;
                if (var24.field2216 != null) {
                    var24 = var24.method759(-118);
                }
                if (var24 != null) {
                    class146.field3312++;
                    class44.field1027.method357(50, -101);
                    class44.field1027.method505(-2144754000, var24.field2226);
                }
            }
        }
        if (var4 == 42) {
            class5.field86++;
            class44.field1027.method357(96, -95);
            class44.field1027.method531(false, var3);
            class44.field1027.method547(-25680, var2);
            class44.field1027.method527(class43.field1003, -2687);
            class44.field1027.method549(class146.field3321, 127);
        }
        if (var4 == 19) {
            class44.field1027.method357(117, -127);
            class44.field1027.method514(var5, (byte) -76);
            class44.field1027.method514(var2, (byte) -76);
            class31.field604++;
            class44.field1027.method531(false, var3);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -101);
            class34.field730 = var2;
        }
        if (var4 == 49 && class156.method1202(var3, (byte) 90, var2, var5)) {
            class44.field1027.method357(75, -116);
            class44.field1027.method505(-2144754000, class129.field2980);
            class44.field1027.method514(var5 >> 14 & 0x7FFF, (byte) -76);
            class44.field1027.method505(-2144754000, class41.field967);
            class44.field1027.method549(class72.field1701 + var2, 74);
            class44.field1027.method547(-25680, class118.field2838 + var3);
            class44.field1027.method531(false, class44.field1039);
            class130.field3001++;
        }
        if (var4 == 2 && class156.method1202(var3, (byte) 90, var2, var5)) {
            class34.field721++;
            class44.field1027.method357(208, -112);
            class44.field1027.method549(var5 >> 14 & 0x7FFF, 67);
            class44.field1027.method547(-25680, class118.field2838 + var3);
            class44.field1027.method554(8, class43.field1003);
            class44.field1027.method505(-2144754000, class72.field1701 + var2);
            class44.field1027.method505(-2144754000, class146.field3321);
        }
        if (var4 == 1003) {
            class121.field2877++;
            class156.method1202(var3, (byte) 90, var2, var5);
            class44.field1027.method357(182, -92);
            class44.field1027.method514(class72.field1701 + var2, (byte) -76);
            class44.field1027.method514(class118.field2838 + var3, (byte) -76);
            class44.field1027.method549(var5 >> 14 & 0x7FFF, 92);
        }
        if (var4 == 34) {
            class121.field2868++;
            class44.field1027.method357(218, -111);
            class44.field1027.method531(false, var3);
            class36 var25 = class128.method993(var3, -113);
            if (var25.field843 != null && var25.field843[0][0] == 5) {
                int var26 = var25.field843[0][1];
                if (class27.field504[var26] != var25.field786[0]) {
                    class27.field504[var26] = var25.field786[0];
                    class112.method884(var26, -2);
                }
            }
        }
        if (var4 == 29) {
            class70 var27 = class52.field1176[var5];
            if (var27 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var27.field2761[0], class20.field373.field2761[0], 0, var27.field2738[0], 1, 2);
                class77.field1798++;
                class135.field3149 = 2;
                class154.field3545 = 0;
                class154.field3547 = class66.field1590;
                class27.field499 = class9.field166;
                class44.field1027.method357(81, -89);
                class44.field1027.method505(-2144754000, var5);
            }
        }
        if (var4 == 20) {
            class129.field2983++;
            boolean var28 = class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 0, var2, class20.field373.field2761[0], 0, var3, 0, 2);
            if (!var28) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var2, class20.field373.field2761[0], 0, var3, 1, 2);
            }
            class154.field3547 = class66.field1590;
            class27.field499 = class9.field166;
            class135.field3149 = 2;
            class154.field3545 = 0;
            class44.field1027.method357(97, -101);
            class44.field1027.method505(-2144754000, class41.field967);
            class44.field1027.method549(class118.field2838 + var3, 66);
            class44.field1027.method557(class44.field1039, (byte) 29);
            class44.field1027.method505(-2144754000, class129.field2980);
            class44.field1027.method514(var5, (byte) -76);
            class44.field1027.method549(class72.field1701 + var2, 74);
        }
        if (var4 == 26) {
            class36 var30 = class128.method993(var3, -123);
            boolean var31 = true;
            if (var30.field846 > 0) {
                var31 = client.method152(-126, var30);
            }
            if (var31) {
                class44.field1027.method357(218, -93);
                class44.field1027.method531(false, var3);
                class121.field2868++;
            }
        }
        if (var4 == 46 || var4 == 1005) {
            class77.method617(var5, var3, class56.field1296[arg1], 211, var2);
        }
        if (var4 == 48) {
            class70 var32 = class52.field1176[var5];
            if (var32 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var32.field2761[0], class20.field373.field2761[0], 0, var32.field2738[0], 1, 2);
                class135.field3149 = 2;
                class63.field1469++;
                class27.field499 = class9.field166;
                class154.field3547 = class66.field1590;
                class154.field3545 = 0;
                class44.field1027.method357(193, -78);
                class44.field1027.method514(var5, (byte) -76);
            }
        }
        if (var4 == 51) {
            class3.field35++;
            class44.field1027.method357(195, -116);
            class44.field1027.method549(var5, 106);
            class44.field1027.method557(var3, (byte) 29);
            class44.field1027.method505(-2144754000, var2);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -120);
            class34.field730 = var2;
        }
        if (var4 == 28) {
            class111 var33 = field230[var5];
            if (var33 != null) {
                class32.field635++;
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var33.field2761[0], class20.field373.field2761[0], 0, var33.field2738[0], 1, 2);
                class135.field3149 = 2;
                class27.field499 = class9.field166;
                class154.field3547 = class66.field1590;
                class154.field3545 = 0;
                class44.field1027.method357(45, -112);
                class44.field1027.method547(-25680, var5);
            }
        }
        if (var4 == 30) {
            class44.field1027.method357(130, -116);
            class44.field1027.method514(var2, (byte) -76);
            class83.field1944++;
            class44.field1027.method527(var3, -2687);
            class44.field1027.method549(var5, 94);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, -126);
            class34.field730 = var2;
        }
        if (var4 == 57) {
            boolean var34 = class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 0, var2, class20.field373.field2761[0], 0, var3, 0, 2);
            class52.field1191++;
            if (!var34) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var2, class20.field373.field2761[0], 0, var3, 1, 2);
            }
            class154.field3547 = class66.field1590;
            class135.field3149 = 2;
            class27.field499 = class9.field166;
            class154.field3545 = 0;
            class44.field1027.method357(250, -85);
            class44.field1027.method549(class72.field1701 + var2, 63);
            class44.field1027.method549(var5, 95);
            class44.field1027.method549(class118.field2838 + var3, 120);
        }
        if (var4 == 11) {
            class156.method1202(var3, (byte) 90, var2, var5);
            class88.field2046++;
            class44.field1027.method357(144, -114);
            class44.field1027.method505(-2144754000, class72.field1701 + var2);
            class44.field1027.method547(-25680, class118.field2838 + var3);
            class44.field1027.method514(var5 >> 14 & 0x7FFF, (byte) -76);
        }
        if (var4 == 14) {
            class111 var36 = field230[var5];
            if (var36 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var36.field2761[0], class20.field373.field2761[0], 0, var36.field2738[0], 1, 2);
                class154.field3545 = 0;
                class27.field499 = class9.field166;
                class154.field3547 = class66.field1590;
                class39.field933++;
                class135.field3149 = 2;
                class44.field1027.method357(6, -104);
                class44.field1027.method549(var5, 85);
            }
        }
        if (var4 == 23) {
            class70 var37 = class52.field1176[var5];
            if (var37 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var37.field2761[0], class20.field373.field2761[0], 0, var37.field2738[0], 1, 2);
                class154.field3547 = class66.field1590;
                class27.field499 = class9.field166;
                class135.field3149 = 2;
                class154.field3545 = 0;
                class28.field511++;
                class44.field1027.method357(158, -85);
                class44.field1027.method549(var5, 93);
            }
        }
        if (var4 == 1004) {
            class36 var38 = class128.method993(var3, 50);
            if (var38 == null || var38.field754[var2] < 100000) {
                class125.field2901++;
                class44.field1027.method357(43, -118);
                class44.field1027.method505(-2144754000, var5);
            } else {
                class79.method629((byte) 98, class52.method403(new class32[] { class159.method1230(var38.field754[var2], 0), class71.field1668, class146.method1094(var5, 81).field1430 }, (byte) -20), 0, class77.field1787);
            }
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, 120);
            class34.field730 = var2;
        }
        if (var4 == 5) {
            class70 var39 = class52.field1176[var5];
            if (var39 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var39.field2761[0], class20.field373.field2761[0], 0, var39.field2738[0], 1, 2);
                class105.field2497++;
                class135.field3149 = 2;
                class154.field3547 = class66.field1590;
                class27.field499 = class9.field166;
                class154.field3545 = 0;
                class44.field1027.method357(67, -97);
                class44.field1027.method554(8, class44.field1039);
                class44.field1027.method505(-2144754000, class41.field967);
                class44.field1027.method547(-25680, var5);
                class44.field1027.method514(class129.field2980, (byte) -76);
            }
        }
        if (var4 == 31) {
            boolean var40 = class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 0, var2, class20.field373.field2761[0], 0, var3, 0, 2);
            class38.field899++;
            if (!var40) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var2, class20.field373.field2761[0], 0, var3, 1, 2);
            }
            class154.field3545 = 0;
            class135.field3149 = 2;
            class27.field499 = class9.field166;
            class154.field3547 = class66.field1590;
            class44.field1027.method357(137, -119);
            class44.field1027.method514(class72.field1701 + var2, (byte) -76);
            class44.field1027.method547(-25680, var5);
            class44.field1027.method514(class118.field2838 + var3, (byte) -76);
        }
        if (var4 == 35) {
            class70.field1626++;
            class44.field1027.method357(115, -93);
            class44.field1027.method531(false, var3);
            class44.field1027.method547(-25680, var2);
            class44.field1027.method549(var5, 69);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, 35);
            class34.field730 = var2;
        }
        if (var4 == 33) {
            class106.field2522++;
            boolean var42 = class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 0, var2, class20.field373.field2761[0], 0, var3, 0, 2);
            if (!var42) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var2, class20.field373.field2761[0], 0, var3, 1, 2);
            }
            class154.field3547 = class66.field1590;
            class154.field3545 = 0;
            class27.field499 = class9.field166;
            class135.field3149 = 2;
            class44.field1027.method357(122, -83);
            class44.field1027.method514(class118.field2838 + var3, (byte) -76);
            class44.field1027.method505(-2144754000, var2 + class72.field1701);
            class44.field1027.method554(8, class43.field1003);
            class44.field1027.method514(class146.field3321, (byte) -76);
            class44.field1027.method547(-25680, var5);
        }
        if (var4 == 47) {
            class15.field267++;
            boolean var44 = class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 0, var2, class20.field373.field2761[0], 0, var3, 0, 2);
            if (!var44) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var2, class20.field373.field2761[0], 0, var3, 1, 2);
            }
            class154.field3545 = 0;
            class27.field499 = class9.field166;
            class135.field3149 = 2;
            class154.field3547 = class66.field1590;
            class44.field1027.method357(112, -110);
            class44.field1027.method514(class118.field2838 + var3, (byte) -76);
            class44.field1027.method514(var5, (byte) -76);
            class44.field1027.method514(var2 + class72.field1701, (byte) -76);
        }
        if (var4 == 32) {
            class156.method1202(var3, (byte) 90, var2, var5);
            class110.field2584++;
            class44.field1027.method357(170, -98);
            class44.field1027.method547(-25680, var3 + class118.field2838);
            class44.field1027.method505(-2144754000, var5 >> 14 & 0x7FFF);
            class44.field1027.method505(-2144754000, class72.field1701 + var2);
        }
        if (var4 == 12) {
            class111 var46 = field230[var5];
            if (var46 != null) {
                class144.field3283++;
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var46.field2761[0], class20.field373.field2761[0], 0, var46.field2738[0], 1, 2);
                class154.field3545 = 0;
                class27.field499 = class9.field166;
                class135.field3149 = 2;
                class154.field3547 = class66.field1590;
                class44.field1027.method357(253, -86);
                class44.field1027.method514(class146.field3321, (byte) -76);
                class44.field1027.method554(8, class43.field1003);
                class44.field1027.method549(var5, 76);
            }
        }
        if (var4 == 17) {
            class44.field1027.method357(214, -123);
            class97.field2210++;
            class44.field1027.method547(-25680, var2);
            class44.field1027.method531(false, var3);
            class44.field1027.method514(var5, (byte) -76);
            class136.field3158 = 0;
            class5.field89 = class128.method993(var3, 123);
            class34.field730 = var2;
        }
        if (var4 == 9) {
            class111 var47 = field230[var5];
            if (var47 != null) {
                class94.method749(false, 0, class20.field373.field2738[0], -1, 0, 1, var47.field2761[0], class20.field373.field2761[0], 0, var47.field2738[0], 1, 2);
                class81.field1872++;
                class154.field3545 = 0;
                class154.field3547 = class66.field1590;
                class27.field499 = class9.field166;
                class135.field3149 = 2;
                class44.field1027.method357(149, -126);
                class44.field1027.method514(var5, (byte) -76);
            }
        }
        if (var4 == 37) {
            class152.field3478++;
            class156.method1202(var3, (byte) 90, var2, var5);
            class44.field1027.method357(229, -109);
            class44.field1027.method514(var3 + class118.field2838, (byte) -76);
            class44.field1027.method514(class72.field1701 + var2, (byte) -76);
            class44.field1027.method514(var5 >> 14 & 0x7FFF, (byte) -76);
        }
        if (class125.field2915 != 0) {
            class125.field2915 = 0;
            class132.method1010(class128.method993(class44.field1039, -128), (byte) -103);
        }
        if (class151.field3470) {
            class105.method858(-8602);
        }
        if (class5.field89 != null && class136.field3158 == 0) {
            class132.method1010(class5.field89, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
    public class14(byte[] arg0) {
        int var2 = arg0.length;
        this.field233 = new int[var2];
        this.field244 = new int[8];
        this.field241 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field233[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class107.method864(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field244[var14] == 0) {
                            this.field244[var14] = var4;
                        }
                        var14 = this.field244[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field244.length) {
                        int[] var18 = new int[this.field244.length * 2];
                        for (int var19 = 0; var19 < this.field244.length; var19++) {
                            var18[var19] = this.field244[var19];
                        }
                        this.field244 = var18;
                    }
                }
                this.field244[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)I")
    public static final int method80(boolean arg0, int arg1, int arg2) {
        field240++;
        if (arg0) {
            return -109;
        }
        int var3 = class3.method9(arg1 + 91923, 4, arg2 + 45365, 79) + (class3.method9(arg1 + 37821, 2, arg2 + 10294, 80) - 128 >> 1) + (class3.method9(arg1, 1, arg2, 86) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
