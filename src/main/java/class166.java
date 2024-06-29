import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class166 extends class310 {

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    private int field2627 = 8;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    private int field2624 = 1024;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    private int field2644 = 4;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    private int field2643 = 1024;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    private int field2629 = 409;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    private int field2642 = 204;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    private int field2640 = 81;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    private int field2638 = 0;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "Ljl;")
    public static class332 field2625 = new class332(64);

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "[I")
    public static int[] field2651 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field2649 = 3;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "[I")
    public static int[] field2654 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "J")
    public static long field2650 = 0L;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    private int field2631;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    private int field2633;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    private int field2636;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lth;")
    public static class57 field2652;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "[I")
    private int[] field2634;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "[[I")
    private int[][] field2632;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "[[I")
    private int[][] field2646;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "[[Z")
    public static boolean[][] field2653;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)Lki;", line = 8)
    public static final class190 method1288(byte arg0) {
        field2637++;
        try {
            return new class8();
        } catch (Throwable var4) {
            if (arg0 != -50) {
                method1294(-3);
            }
            try {
                return (class190) Class.forName("md").getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class225();
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V", line = 32)
    public final void method553(byte arg0) {
        this.method1290(-70);
        field2628++;
        if (arg0 > -82) {
            this.field2643 = -24;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lqm;II)V", line = 45)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field2639++;
        if (arg2 == 0) {
            this.field2644 = arg0.method1720((byte) -50);
        } else if (arg2 == 1) {
            this.field2627 = arg0.method1720((byte) -113);
        } else if (arg2 == 2) {
            this.field2629 = arg0.method1765(true);
        } else if (arg2 == 3) {
            this.field2642 = arg0.method1765(true);
        } else if (arg2 == 4) {
            this.field2624 = arg0.method1765(true);
        } else if (arg2 == 5) {
            this.field2638 = arg0.method1765(true);
        } else if (arg2 == 6) {
            this.field2640 = arg0.method1765(true);
        } else if (arg2 == 7) {
            this.field2643 = arg0.method1765(true);
        }
        if (arg1 != -2470) {
            this.field2627 = 47;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 983)
    public class166() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 134)
    public static final String method1289(int arg0, byte[] arg1, int arg2, int arg3) {
        field2630++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = 74 / ((arg3 + 51) / 55);
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg1[arg0 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class70.field1230[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 178)
    private final void method1290(int arg0) {
        Random var2 = new Random((long) this.field2627);
        this.field2636 = 4096 / this.field2627;
        this.field2646 = new int[this.field2627][this.field2644];
        this.field2632 = new int[this.field2627][this.field2644 + 1];
        this.field2633 = this.field2640 / 2;
        this.field2631 = 4096 / this.field2644;
        this.field2634 = new int[this.field2627 + 1];
        this.field2634[0] = 0;
        field2635++;
        int var3 = this.field2636 / 2;
        int var4 = this.field2631 / 2;
        for (int var5 = 0; var5 < this.field2627; var5++) {
            if (var5 > 0) {
                int var6 = this.field2636;
                int var7 = (class2.method4(4096, var2, -81) - 2048) * this.field2642 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2634[var5] = this.field2634[var5 - 1] + var8;
            }
            this.field2632[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2644; var9++) {
                if (var9 > 0) {
                    int var10 = this.field2631;
                    int var11 = (class2.method4(4096, var2, -66) - 2048) * this.field2629 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2632[var5][var9] = this.field2632[var5][var9 - 1] + var12;
                }
                this.field2646[var5][var9] = this.field2643 > 0 ? 4096 - class2.method4(this.field2643, var2, 111) : 4096;
            }
            this.field2632[var5][this.field2644] = 4096;
        }
        if (arg0 >= -51) {
            this.field2643 = -118;
        }
        this.field2634[this.field2627] = 4096;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBIIIII)V", line = 244)
    public static final void method1291(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -106 / ((3 - arg1) / 61);
        class292.field4731 = 0;
        field2626++;
        for (int var8 = -1; var8 < class35.field508 + class345.field5501; var8++) {
            class121 var9 = null;
            class220 var10;
            if (var8 < 0) {
                var10 = class6.field55;
            } else if (var8 < class345.field5501) {
                var10 = class56.field924[class306.field4895[var8]];
            } else {
                var10 = class165.field2621[class330.field5253[var8 - class345.field5501]];
                var9 = ((class288) var10).field4692;
                if (var9.field2066 != null) {
                    var9 = var9.method958((byte) -115);
                    if (var9 == null) {
                        continue;
                    }
                }
            }
            if (var10.method1646((byte) -7)) {
                class74.method623(false, var10.method1644((byte) 114), arg4 >> 1, arg0 >> 1, var10, arg2, arg5);
                if (class210.field3308 >= 0) {
                    if (!var10.field3551) {
                        int var11 = class247.field4047 + arg3;
                        if (var8 < class345.field5501) {
                            class258 var12 = (class258) var10;
                            if (var12.field4327 != -1 || var12.field4318 != -1) {
                                if (var12.field4327 != -1) {
                                    var11 -= 25;
                                    class238.field3928[var12.field4327].method89(arg6 + class210.field3308 - 12, var11);
                                    var11 -= 2;
                                }
                                if (var12.field4318 != -1) {
                                    var11 -= 25;
                                    class98.field1641[var12.field4318].method89(arg6 + class210.field3308 - 12, var11);
                                    var11 -= 2;
                                }
                            }
                        } else if (var9.field2067 >= 0 && class98.field1641.length > var9.field2067) {
                            class17 var13 = class98.field1641[var9.field2067];
                            var11 -= 25;
                            var13.method89(class210.field3308 + arg6 - (var13.field197 >> 1), var11);
                            var11 -= 2;
                        }
                        if (var10.field3481 > class332.field5261) {
                            class17 var14 = class240.field3964[0];
                            class17 var15 = class240.field3964[1];
                            if (var10 instanceof class288) {
                                class288 var16 = (class288) var10;
                                class17[] var17 = (class17[]) ((class17[]) class101.field1655.method2329((byte) 107, (long) var16.field4692.field2040));
                                if (var17 == null) {
                                    var17 = class179.method1410(var16.field4692.field2040, true, class76.field1305, 0);
                                    if (var17 != null) {
                                        class101.field1655.method2333((long) var16.field4692.field2040, 0, var17);
                                    }
                                }
                                if (var17 != null && var17.length == 2) {
                                    var14 = var17[0];
                                    var15 = var17[1];
                                }
                            }
                            int var18 = var14.field199;
                            var11 -= var18;
                            int var19 = arg6 + class210.field3308 - (var14.field197 >> 1);
                            var14.method89(var19, var11);
                            int var20 = var10.field3525 * var14.field197 / 255;
                            if (class42.field607) {
                                class244.method1859(var19, var11, var19 + var20, var11 + var18);
                            } else {
                                class246.method1884(var19, var11, var19 + var20, var11 + var18);
                            }
                            var15.method89(var19, var11);
                            if (class42.field607) {
                                class244.method1871(arg6, arg3, arg6 + arg0, arg3 + arg4);
                            } else {
                                class246.method1889(arg6, arg3, arg0 + arg6, arg3 + arg4);
                            }
                            var11 -= 2;
                        }
                        if (!(var10 instanceof class258)) {
                            int var21 = 0;
                            class273[] var22 = class74.field1261;
                            for (int var23 = 0; var23 < var22.length; var23++) {
                                class273 var24 = var22[var23];
                                if (var24 != null && var24.field4529 == 1 && class330.field5253[var8 - class345.field5501] == var24.field4525) {
                                    class17 var25 = class32.field458[var24.field4531];
                                    if (var25.field199 > var21) {
                                        var21 = var25.field199;
                                    }
                                    if ((class332.field5261 % 20) < 10) {
                                        var25.method89(class210.field3308 + arg6 - 12, var11 - var25.field199);
                                    }
                                }
                            }
                            if (var21 > 0) {
                                var11 -= var21 + 2;
                            }
                        } else if (var8 >= 0) {
                            int var26 = 0;
                            int var27 = 0;
                            class273[] var28 = class74.field1261;
                            while (var27 < var28.length) {
                                class273 var29 = var28[var27];
                                if (var29 != null && var29.field4529 == 10 && class306.field4895[var8] == var29.field4525) {
                                    class17 var30 = class32.field458[var29.field4531];
                                    if (var26 < var30.field199) {
                                        var26 = var30.field199;
                                    }
                                    var30.method89(class210.field3308 + arg6 - 12, -var30.field199 + var11);
                                }
                                var27++;
                            }
                            if (var26 > 0) {
                                var11 -= var26 + 2;
                            }
                        }
                        if (!var10.field3526 && var10.field3570 != null && (class345.field5501 <= var8 || class195.field3101 == 0 || class195.field3101 == 3 || class195.field3101 == 1 && class213.method1607((byte) -85, ((class258) var10).field4349)) && class48.field774 > class292.field4731) {
                            class48.field770[class292.field4731] = class109.field1792.method1338(var10.field3570) / 2;
                            class48.field767[class292.field4731] = class109.field1792.field2725;
                            var11 -= class48.field767[class292.field4731];
                            class48.field760[class292.field4731] = class210.field3308;
                            class48.field768[class292.field4731] = var11;
                            var11 -= 2;
                            class48.field777[class292.field4731] = var10.field3518;
                            class48.field761[class292.field4731] = var10.field3483;
                            class48.field776[class292.field4731] = var10.field3565;
                            class48.field773[class292.field4731] = var10.field3570;
                            class292.field4731++;
                        }
                        var10.field3492 = var11;
                    }
                    for (int var31 = 0; var31 < 4; var31++) {
                        if (var10.field3528[var31] > class332.field5261) {
                            int var32 = var10.method1644((byte) 95) / 2;
                            class74.method623(false, var32, arg4 >> 1, arg0 >> 1, var10, arg2, arg5);
                            if (class210.field3308 > -1) {
                                if (var31 == 1) {
                                    class247.field4047 -= 20;
                                }
                                if (var31 == 2) {
                                    class210.field3308 -= 15;
                                    class247.field4047 -= 10;
                                }
                                if (var31 == 3) {
                                    class247.field4047 -= 10;
                                    class210.field3308 += 15;
                                }
                                class54.field892[var10.field3502[var31]].method89(arg6 + class210.field3308 - 12, arg3 - (-class247.field4047 - -12));
                                class286.field4663.method1328(Integer.toString(var10.field3535[var31]), class210.field3308 + arg6 - 1, class247.field4047 + arg3 + 3, 16777215, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var33 = 0; var33 < class25.field306; var33++) {
            int var34 = class84.field1431[var33];
            class220 var35;
            if (var34 < 2048) {
                var35 = class56.field924[var34];
            } else {
                var34 -= 2048;
                var35 = class165.field2621[var34];
            }
            int var36 = class50.field792[var33];
            class220 var37;
            if (var36 < 2048) {
                var37 = class56.field924[var36];
            } else {
                var36 -= 2048;
                var37 = class165.field2621[var36];
            }
            int var38 = var37.method1648(-1);
            if (var38 != -1) {
                Object var39 = null;
                class17 var40 = (class17) class183.field2948.method2329((byte) 107, (long) var38);
                if (var40 == null) {
                    class17[] var41 = class179.method1410(var38, true, class76.field1305, 0);
                    if (var41 != null) {
                        var40 = var41[0];
                        class183.field2948.method2333((long) var38, 0, var40);
                    }
                }
                if (var40 != null) {
                    int var42 = var35.field3564++;
                    class181.method1420(var35.field3511, -94, arg4 >> 1, var35.field3577, var35.method1634(-1) * 64, 0, arg5, arg0 >> 1, arg2);
                    int var43 = class247.field4047 - 70;
                    int var44 = var42 % 4 * 18 + var43;
                    int var45 = arg6 + class210.field3308 - 18;
                    int var46 = var42 / 4 * 18 + var45;
                    var40.method89(var46, var44);
                    if (var35 == var37) {
                        if (class42.field607) {
                            class244.method1865(var46 - 1, var44 + -1, 18, 18, 16776960);
                        } else {
                            class246.method1881(var46 - 1, var44 - 1, 18, 18, 16776960);
                        }
                    }
                    if (class45.field695 >= var46 && class45.field695 < var40.field197 + var46 && class196.field3144 >= var44 && var40.field199 + var44 > class196.field3144) {
                        if ((var37 instanceof class258)) {
                            class221.field3606[0] = (long) var36 << 32;
                        } else {
                            class221.field3606[0] = class38.method252(536870912L, (long) var36 << 32);
                        }
                        class287.field4674 = false;
                        class298.field4775 = 1;
                    }
                }
            }
            if (var37.field3570 != null && (var37 instanceof class288 || class195.field3101 == 0 || class195.field3101 == 3 || class195.field3101 == 1 && class213.method1607((byte) -65, ((class258) var37).field4349)) && class48.field774 > class292.field4731) {
                class74.method623(false, 0, arg4 >> 1, arg0 >> 1, var35, arg2, arg5);
                int var47 = var35.field3492;
                class48.field770[class292.field4731] = class109.field1792.method1338(var37.field3570) / 2;
                class48.field767[class292.field4731] = class109.field1792.field2725;
                int var48 = var47 - class48.field767[class292.field4731];
                class48.field760[class292.field4731] = class210.field3308;
                class48.field768[class292.field4731] = var48;
                class48.field777[class292.field4731] = var37.field3518;
                int var64 = var48 - 2;
                class48.field761[class292.field4731] = var37.field3483;
                class48.field776[class292.field4731] = var37.field3565;
                class48.field773[class292.field4731] = var37.field3570;
                class292.field4731++;
            }
        }
        for (int var49 = 0; var49 < class292.field4731; var49++) {
            int var50 = class48.field768[var49];
            int var51 = class48.field760[var49];
            boolean var52 = true;
            int var53 = class48.field767[var49];
            int var54 = class48.field770[var49];
            while (var52) {
                var52 = false;
                for (int var55 = 0; var55 < var49; var55++) {
                    if ((class48.field768[var55] - class48.field767[var55]) < (var50 + 2) && (var50 - var53) < (class48.field768[var55] + 2) && (class48.field760[var55] + class48.field770[var55]) > (var51 - var54) && class48.field760[var55] - class48.field770[var55] < var51 + var54 && class48.field768[var55] - class48.field767[var55] < var50) {
                        var52 = true;
                        var50 = class48.field768[var55] - class48.field767[var55];
                    }
                }
            }
            class210.field3308 = class48.field760[var49];
            class247.field4047 = class48.field768[var49] = var50;
            String var56 = class48.field773[var49];
            if (class329.field5228 == 0) {
                int var57 = 16776960;
                if (class48.field777[var49] < 6) {
                    var57 = class234.field3893[class48.field777[var49]];
                }
                if (class48.field777[var49] == 6) {
                    var57 = class2.field14 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class48.field777[var49] == 7) {
                    var57 = (class2.field14 % 20) < 10 ? 255 : 65535;
                }
                if (class48.field777[var49] == 8) {
                    var57 = class2.field14 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class48.field777[var49] == 9) {
                    int var58 = 150 - class48.field776[var49];
                    if (var58 < 50) {
                        var57 = var58 * 1280 + 16711680;
                    } else if (var58 < 100) {
                        var57 = 16776960 - (var58 * 327680 - 16384000);
                    } else if (var58 < 150) {
                        var57 = (var58 - 100) * 5 + 65280;
                    }
                }
                if (class48.field777[var49] == 10) {
                    int var59 = 150 - class48.field776[var49];
                    if (var59 < 50) {
                        var57 = var59 * 5 + 16711680;
                    } else if (var59 < 100) {
                        var57 = 16711935 - ((var59 - 50) * 327680);
                    } else if (var59 < 150) {
                        var57 = (var59 - 100) * 327680 + 255 - (var59 + -100) * 5;
                    }
                }
                if (class48.field777[var49] == 11) {
                    int var60 = 150 - class48.field776[var49];
                    if (var60 < 50) {
                        var57 = 16777215 - (var60 * 327685);
                    } else if (var60 < 100) {
                        var57 = (var60 - 50) * 327685 + 65280;
                    } else if (var60 < 150) {
                        var57 = 49545215 - (var60 * 327680);
                    }
                }
                if (class48.field761[var49] == 0) {
                    class109.field1792.method1328(var56, arg6 + class210.field3308, class247.field4047 + arg3, var57, 0);
                }
                if (class48.field761[var49] == 1) {
                    class109.field1792.method1346(var56, class210.field3308 + arg6, class247.field4047 + arg3, var57, 0, class2.field14);
                }
                if (class48.field761[var49] == 2) {
                    class109.field1792.method1329(var56, class210.field3308 + arg6, class247.field4047 + arg3, var57, 0, class2.field14);
                }
                if (class48.field761[var49] == 3) {
                    class109.field1792.method1341(var56, class210.field3308 + arg6, class247.field4047 + arg3, var57, 0, class2.field14, 150 - class48.field776[var49]);
                }
                if (class48.field761[var49] == 4) {
                    int var61 = (150 - class48.field776[var49]) * (class109.field1792.method1338(var56) + 100) / 150;
                    if (class42.field607) {
                        class244.method1859(class210.field3308 + arg6 - 50, arg3, class210.field3308 + arg6 + 50, arg3 + arg4);
                    } else {
                        class246.method1884(class210.field3308 + arg6 - 50, arg3, class210.field3308 + arg6 + 50, arg3 + arg4);
                    }
                    class109.field1792.method1332(var56, class210.field3308 + arg6 + 50 - var61, class247.field4047 + arg3, var57, 0);
                    if (class42.field607) {
                        class244.method1871(arg6, arg3, arg6 + arg0, arg3 + arg4);
                    } else {
                        class246.method1889(arg6, arg3, arg0 + arg6, arg3 + arg4);
                    }
                }
                if (class48.field761[var49] == 5) {
                    int var62 = 150 - class48.field776[var49];
                    if (class42.field607) {
                        class244.method1859(arg6, arg3 + class247.field4047 - class109.field1792.field2725 - 1, arg0 + arg6, arg3 + class247.field4047 + 5);
                    } else {
                        class246.method1884(arg6, class247.field4047 + arg3 - class109.field1792.field2725 - 1, arg0 + arg6, arg3 + class247.field4047 + 5);
                    }
                    int var63 = 0;
                    if (var62 < 25) {
                        var63 = var62 - 25;
                    } else if (var62 > 125) {
                        var63 = var62 - 125;
                    }
                    class109.field1792.method1328(var56, class210.field3308 + arg6, arg3 + var63 + class247.field4047, var57, 0);
                    if (class42.field607) {
                        class244.method1871(arg6, arg3, arg0 + arg6, arg3 + arg4);
                    } else {
                        class246.method1889(arg6, arg3, arg6 + arg0, arg3 - -arg4);
                    }
                }
            } else {
                class109.field1792.method1328(var56, class210.field3308 + arg6, class247.field4047 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)Lkc;", line = 829)
    public static final class29 method1292(int arg0, int arg1) {
        field2645++;
        class29 var2 = (class29) class118.field1998.method2329((byte) 107, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class235.field3902.method472(class254.method1965(arg1, (byte) -67), 85, class196.method1521(arg1, (byte) -59));
        class29 var4 = new class29();
        var4.field417 = arg1;
        if (var3 != null) {
            var4.method182((byte) -80, new class227(var3));
        }
        var4.method186(-1);
        if (!class353.field5603 && var4.field364) {
            var4.field410 = null;
        }
        if (var4.field365) {
            var4.field371 = 0;
            var4.field420 = false;
        }
        class118.field1998.method2333((long) arg1, arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I", line = 864)
    public final int[] method77(int arg0, int arg1) {
        field2648++;
        if (arg1 != -13093) {
            this.field2627 = 99;
        }
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int var4 = 0;
            int var5;
            for (var5 = class230.field3818[arg0] + this.field2638; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2627 > var4 && var5 >= this.field2634[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field2634[var4];
            int var9 = this.field2634[var4 - 1];
            if (var5 > this.field2633 + var9 && var5 < var8 - this.field2633) {
                for (int var10 = 0; var10 < class261.field4405; var10++) {
                    int var11 = var7 ? this.field2624 : -this.field2624;
                    int var12 = (this.field2631 * var11 >> 12) + class293.field4737[var10];
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (this.field2644 > var13 && this.field2632[var6][var13] <= var12) {
                        var13++;
                    }
                    int var14 = this.field2632[var6][var13];
                    int var15 = var13 - 1;
                    int var16 = this.field2632[var6][var15];
                    if (var12 > (this.field2633 + var16) && var12 < (var14 - this.field2633)) {
                        var3[var10] = this.field2646[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class242.method1839(var3, 0, class261.field4405, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 964)
    public static void method1293(int arg0) {
        field2625 = null;
        field2653 = (boolean[][]) null;
        int var1 = -41 / ((46 - arg0) / 47);
        field2651 = null;
        field2654 = null;
        field2652 = null;
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)Z", line = 994)
    public static final boolean method1294(int arg0) {
        if (arg0 != -10) {
            method1288((byte) -71);
        }
        field2641++;
        try {
            if (class152.field2417 == 2) {
                if (class27.field329 == null) {
                    class27.field329 = class224.method1698(class135.field2259, class183.field2954, class318.field5065);
                    if (class27.field329 == null) {
                        return false;
                    }
                }
                if (class213.field3420 == null) {
                    class213.field3420 = new class175(class223.field3700, class109.field1795);
                }
                if (class36.field535.method1674((byte) 119, class27.field329, 22050, class213.field3420, class260.field4387)) {
                    class36.field535.method1668(108);
                    class36.field535.method1690(class66.field1177, (byte) 61);
                    class36.field535.method1669((byte) 25, class200.field3190, class27.field329);
                    class27.field329 = null;
                    class135.field2259 = null;
                    class213.field3420 = null;
                    class152.field2417 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class36.field535.method1686(arg0 - 87);
            class213.field3420 = null;
            class27.field329 = null;
            class152.field2417 = 0;
            class135.field2259 = null;
        }
        return false;
    }
}
