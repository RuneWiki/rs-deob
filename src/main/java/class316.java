import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class316 {

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "[[I")
    private int[][] field4297;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "S")
    public static short field4292 = 205;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4294 = new String[100];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field4288;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
    public final int method2008(int arg0, int arg1) {
        field4287++;
        if (arg0 == 4888) {
            if (this.field4297 != null) {
                arg1 = ((int) ((long) this.field4289 * (long) arg1 / (long) this.field4296)) + 6;
            }
            return arg1;
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBI)Ldd;")
    public static final class213 method2009(int arg0, int arg1, byte arg2, int arg3) {
        field4295++;
        int var4 = arg3 | arg1 << 8;
        class213 var5 = (class213) class88.field1300.method361((long) var4 << 16, (byte) -93);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class297.field4006.method2656(arg2 - 5, class297.field4006.method2630(var4, (byte) -54));
        if (var6 == null) {
            int var8 = arg3 | arg0 + 65536 << 8;
            if (arg2 != 105) {
                return null;
            }
            class213 var9 = (class213) class88.field1300.method361((long) var8 << 16, (byte) -82);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class297.field4006.method2656(100, class297.field4006.method2630(var8, (byte) -54));
            if (var10 == null) {
                int var12 = arg3 | 0xFFFF00;
                class213 var13 = (class213) class88.field1300.method361((long) var12 << 16, (byte) 89);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class297.field4006.method2656(100, class297.field4006.method2630(var12, (byte) -54));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class213 var15 = class374.method2337(38, var14);
                    var15.field2954 = arg3;
                    class88.field1300.method360(false, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class213 var11 = class374.method2337(38, var10);
                var11.field2954 = arg3;
                class88.field1300.method360(false, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class213 var7 = class374.method2337(38, var6);
            var7.field2954 = arg3;
            class88.field1300.method360(false, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)I")
    public final int method2010(int arg0, byte arg1) {
        field4290++;
        if (this.field4297 != null) {
            arg0 = (int) ((long) this.field4289 * (long) arg0 / (long) this.field4296);
        }
        int var3 = -26 % ((arg1 - 8) / 53);
        return arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2011(int arg0, int arg1, String arg2, String arg3) {
        class37.field570 = arg2;
        class312.field4224 = arg0;
        field4293++;
        class163.field2415 = arg3;
        if (class163.field2415.equals("") || class37.field570.equals("")) {
            class368.field5051 = 3;
        } else if (class227.field3144 == -1) {
            class335.field4542 = arg1;
            class368.field5051 = -3;
            class244.field3374 = 0;
            class420.field5882 = 1;
            class289 var4 = new class289(128);
            var4.method1824(45, 10);
            var4.method1854((int) (Math.random() * 9.9999999E7D), true);
            var4.method1866(-19069, class14.method70((byte) 80, class163.field2415));
            var4.method1854((int) (Math.random() * 9.9999999E7D), true);
            var4.method1827(0, class37.field570);
            var4.method1854((int) (Math.random() * 9.9999999E7D), true);
            var4.method1878(class340.field4635, -116, class38.field579);
            class355.field4828.field3938 = 0;
            class355.field4828.method1824(arg1 + 57, 24);
            class355.field4828.method1824(arg1 + 37, var4.field3938 + 2);
            class355.field4828.method1877(true, 555);
            class355.field4828.method1870(0, var4.field3882, var4.field3938, (byte) 105);
        } else {
            class134.method1072(-2109085497);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method2012(int arg0) {
        field4294 = null;
        field4288 = null;
        int var1 = -11 % ((arg0 - 61) / 53);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZZZLji;)V")
    public static final void method2013(boolean arg0, boolean arg1, boolean arg2, class64 arg3) {
        field4286++;
        int var4 = arg3.field976;
        int var5 = (int) arg3.field5349;
        arg3.method2367(5);
        if (arg1) {
            class101.method863(var4, 2);
        }
        class297.method1910(var4, (byte) -91);
        class139 var6 = class10.method57(65535, var5);
        if (var6 != null) {
            class10.method52(var6, (byte) -89);
        }
        class414.method2560(22);
        if (!arg2 && class149.field2288 != -1) {
            class385.method2389(1, -22715, class149.field2288);
        }
        class160 var7 = new class160(class204.field2865);
        if (!arg0) {
            method2017((class391) null);
        }
        for (class64 var8 = (class64) var7.method1206(12274); var8 != null; var8 = (class64) var7.method1205(0)) {
            if (!var8.method2370(0)) {
                var8 = (class64) var7.method1206(12274);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field973 == 3) {
                int var9 = (int) var8.field5349;
                if (var9 >>> 16 == var4) {
                    method2013(true, true, arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2014(int arg0, String arg1) {
        field4285++;
        int var2 = 55 % ((91 - arg0) / 35);
        int var3 = arg1.length();
        char[] var4 = new char[var3];
        byte var5 = 2;
        for (int var6 = 0; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (var5 == 0) {
                var7 = Character.toLowerCase(var7);
            } else if (var5 == 2 || Character.isUpperCase(var7)) {
                var7 = class407.method2489(var7, -70);
            }
            if (Character.isLetter(var7)) {
                var5 = 0;
            } else if (var7 == '.' || var7 == '?' || var7 == '!') {
                var5 = 2;
            } else if (!Character.isSpaceChar(var7)) {
                var5 = 1;
            } else if (var5 != 2) {
                var5 = 1;
            }
            var4[var6] = var7;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)V")
    public static final void method2015(int arg0, int arg1) {
        field4284++;
        if (class236.field3259 == arg1) {
            return;
        }
        class116.field1621 = class385.field5425 = class399.field5585[arg1];
        class249.field3415.method124(50, (int) ((double) class116.field1621 * 34.46D));
        class183.field2660 = new int[class116.field1621][class385.field5425];
        if (arg0 != 29770) {
            method2015(-57, -24);
        }
        class39.field602 = new int[4][class116.field1621 >> 3][class385.field5425 >> 3];
        class269.field3627 = new int[class116.field1621][class385.field5425];
        for (int var2 = 0; var2 < 4; var2++) {
            class235.field3247[var2] = class27.method326(class385.field5425, 17389, class116.field1621);
        }
        class163.field2408 = new byte[4][class116.field1621][class385.field5425];
        class448.method2794(class385.field5425, 4, -13713, class116.field1621);
        class420.method2591(class249.field3415, class385.field5425 >> 3, false, class116.field1621 >> 3);
        class236.field3259 = arg1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B")
    public final byte[] method2016(int arg0, byte[] arg1) {
        if (arg0 != 0) {
            method2017((class391) null);
        }
        field4291++;
        if (this.field4297 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4289 / (long) this.field4296) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4297[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4289 + var6;
                int var14 = var13 / this.field4296;
                var5 += var14;
                var6 = var13 - this.field4296 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lpe;)V")
    public static final void method2017(class391 arg0) {
        for (int var1 = class213.field2966; var1 < class388.field5464; var1++) {
            for (int var2 = 0; var2 < class368.field5054; var2++) {
                for (int var3 = 0; var3 < class16.field190; var3++) {
                    class224 var4 = class118.field1653[var1][var2][var3];
                    if (var4 != null) {
                        class339 var5 = var4.field3108;
                        class339 var6 = var4.field3125;
                        if (var5 != null && var5.method537(-73)) {
                            class359.method2252(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method537(-105)) {
                                class359.method2252(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method532(false, 124, var5, arg0, 0, 0, 0);
                                var6.method535((byte) 120);
                            }
                            var5.method535((byte) 126);
                        }
                        for (class26 var7 = var4.field3129; var7 != null; var7 = var7.field463) {
                            class228 var9 = var7.field460;
                            if (var9 != null && var9.method537(-54)) {
                                class359.method2252(arg0, var9, var1, var2, var3, var9.field3162 + 1 - var9.field3172, var9.field3178 - var9.field3161 + 1);
                                var9.method535((byte) 119);
                            }
                        }
                        class44 var8 = var4.field3124;
                        if (var8 != null && var8.method537(-120)) {
                            class63.method559(arg0, var8, var1, var2, var3);
                            var8.method535((byte) 113);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(II)V")
    public class316(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class154.method1185(arg1, (byte) 108, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4297 = new int[var5][14];
            this.field4296 = var5;
            this.field4289 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4297[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
