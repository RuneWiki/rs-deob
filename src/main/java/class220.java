import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class220 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field3644 = 0;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field3646 = 0;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
    public static int[] field3647 = new int[4];

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static volatile int field3654 = 0;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "[I")
    public static int[] field3657 = new int[100];

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
    public static boolean field3653 = false;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Z")
    public static boolean field3659 = false;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3650 = "purple:";

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Lbn;")
    public static class75 field3652;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 9)
    public static void method1530(int arg0) {
        field3650 = null;
        if (arg0 != -26735) {
            field3647 = (int[]) null;
        }
        field3647 = null;
        field3657 = null;
        field3652 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I", line = 25)
    public static final int method1531(int arg0, int arg1, int arg2, int arg3) {
        field3649++;
        if (arg0 == arg2) {
            return arg0;
        }
        int var4 = 128 - arg1;
        int var5 = ((-16711936 & arg0) >>> 7) * var4 + ((arg2 & -16711936) >>> 7) * arg1 & 0xFF00FF00;
        if (arg3 != -21281) {
            method1531(-31, 93, 63, -95);
        }
        int var6 = (arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 48)
    public static final void method1532(int arg0) {
        if (class125.field2203 > 1) {
            class110.field2021 = class83.field1436;
            class125.field2203--;
        }
        if (class263.field4323 > 0) {
            class263.field4323--;
        }
        field3651++;
        if (class136.field2321) {
            class136.field2321 = false;
            class359.method2538(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class10.method105(0); var1++) {
        }
        if (class334.field5326 != 30) {
            return;
        }
        class26.method212(120, 83, class51.field1038);
        Object var2 = class299.field4857.field1839;
        synchronized (class299.field4857.field1839) {
            if (!class233.field3817) {
                class299.field4857.field1845 = 0;
            } else if (class325.field5246 != 0 || class299.field4857.field1845 >= 40) {
                class51.field1038.method291((byte) 125, 160);
                class346.field5521++;
                class51.field1038.method1027(0, -20374);
                int var3 = class51.field1038.field2435;
                int var4 = 0;
                for (int var5 = 0; class299.field4857.field1845 > var5 && (class51.field1038.field2435 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class299.field4857.field1848[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class299.field4857.field1846[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class299.field4857.field1848[var5] == -1 && class299.field4857.field1846[var5] == -1) {
                        var6 = -1;
                        var8 = true;
                        var7 = -1;
                    }
                    if (class331.field5294 != var7 || class156.field2634 != var6) {
                        int var9 = var6 - class156.field2634;
                        int var10 = var7 - class331.field5294;
                        class156.field2634 = var6;
                        class331.field5294 = var7;
                        if (class39.field847 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class51.field1038.method1002((byte) -102, (class39.field847 << 12) + (var10 << 6) + var9);
                            class39.field847 = 0;
                        } else if (class39.field847 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class51.field1038.method1027(class39.field847 + 128, -20374);
                            class51.field1038.method1002((byte) -97, (var10 << 8) + var9);
                            class39.field847 = 0;
                        } else if (class39.field847 >= 32) {
                            class51.field1038.method1002((byte) -99, class39.field847 + 57344);
                            if (var8) {
                                class51.field1038.method1045((byte) -66, Integer.MIN_VALUE);
                            } else {
                                class51.field1038.method1045((byte) 118, var6 << 16 | var7);
                            }
                            class39.field847 = 0;
                        } else {
                            class51.field1038.method1027(class39.field847 + 192, -20374);
                            if (var8) {
                                class51.field1038.method1045((byte) 114, Integer.MIN_VALUE);
                            } else {
                                class51.field1038.method1045((byte) -107, var7 | var6 << 16);
                            }
                            class39.field847 = 0;
                        }
                    } else if (class39.field847 < 2047) {
                        class39.field847++;
                    }
                }
                class51.field1038.method990(false, class51.field1038.field2435 - var3);
                if (class299.field4857.field1845 > var4) {
                    class299.field4857.field1845 -= var4;
                    for (int var11 = 0; var11 < class299.field4857.field1845; var11++) {
                        class299.field4857.field1846[var11] = class299.field4857.field1846[var4 + var11];
                        class299.field4857.field1848[var11] = class299.field4857.field1848[var11 + var4];
                    }
                } else {
                    class299.field4857.field1845 = 0;
                }
            }
        }
        if (class325.field5246 != 0) {
            class122.field2155++;
            long var13 = (class266.field4346 - class225.field3710) / 50L;
            int var15 = class303.field4931;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            class225.field3710 = class266.field4346;
            int var16 = class37.field807;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var18 = 0;
            if (class325.field5246 == 2) {
                var18 = 1;
            }
            class51.field1038.method291((byte) 66, 182);
            class51.field1038.method1026(var16 | var15 << 16, (byte) 30);
            class51.field1038.method1023(var18 << 15 | var17, (byte) -28);
        }
        if (class232.field3809 > 0) {
            class232.field3809--;
        }
        if (class312.field5074 && class232.field3809 <= 0) {
            class46.field923++;
            class232.field3809 = 20;
            class312.field5074 = false;
            class51.field1038.method291((byte) -95, 199);
            class51.field1038.method1042((byte) -125, (int) class87.field1523);
            class51.field1038.method1023((int) class354.field5652, (byte) -28);
        }
        if (class274.field4470 && !class173.field2871) {
            class11.field365++;
            class173.field2871 = true;
            class51.field1038.method291((byte) 124, 64);
            class51.field1038.method1027(1, -20374);
        }
        if (!class274.field4470 && class173.field2871) {
            class173.field2871 = false;
            class11.field365++;
            class51.field1038.method291((byte) -84, 64);
            class51.field1038.method1027(0, -20374);
        }
        if (!class224.field3696) {
            class51.field1038.method291((byte) -80, 72);
            class51.field1038.method1032(6951, class235.method1636(-25475));
            class224.field3696 = true;
            class172.field2855++;
        }
        if (class295.field4818) {
            class295.field4818 = false;
        } else {
            class335.field5335 /= 2.0F;
        }
        if (class278.field4540) {
            class278.field4540 = false;
        } else {
            class336.field5344 /= 2.0F;
        }
        class273.method1930((byte) -112);
        if (class334.field5326 != 30) {
            return;
        }
        class68.method526(false);
        class79.method594(true);
        class12.method127(123);
        class363.field5738++;
        if (class363.field5738 > 750) {
            class359.method2538(0);
            return;
        }
        class225.method1568((byte) -128);
        class70.method537((byte) -124);
        class269.method1884((byte) -95);
        for (int var19 = class176.method1251(true, false); var19 != -1; var19 = class176.method1251(false, false)) {
            class142.method974(var19, 1);
            class68.field1272[class83.method613(class278.field4524++, 31)] = var19;
        }
        for (class199 var20 = class311.method2262(28); var20 != null; var20 = class311.method2262(28)) {
            int var21 = var20.method1359(false);
            int var22 = var20.method1361((byte) -128);
            if (var21 == 1) {
                class355.field5670[var22] = var20.field3338;
                class34.field753[class83.method613(class309.field5046++, 31)] = var22;
            } else if (var21 == 2) {
                class56.field1109[var22] = var20.field3344;
                class91.field1609[class83.method613(class68.field1270++, 31)] = var22;
            } else if (var21 == 3) {
                class181 var44 = class224.method1564(-120, var22);
                if (!var20.field3344.equals(var44.field3001)) {
                    var44.field3001 = var20.field3344;
                    class52.method459(128, var44);
                }
            } else if (var21 == 4) {
                class181 var23 = class224.method1564(-118, var22);
                int var24 = var20.field3340;
                int var25 = var20.field3343;
                int var26 = var20.field3338;
                if (var23.field3118 != var26 || var23.field3002 != var25 || var23.field2996 != var24) {
                    var23.field3118 = var26;
                    var23.field2996 = var24;
                    var23.field3002 = var25;
                    class52.method459(128, var23);
                }
            } else if (var21 == 5) {
                class181 var27 = class224.method1564(-105, var22);
                if (var20.field3338 != var27.field3092 || var20.field3338 == -1) {
                    var27.field3092 = var20.field3338;
                    var27.field3102 = 0;
                    var27.field3100 = 0;
                    var27.field3010 = 1;
                    class52.method459(128, var27);
                }
            } else if (var21 == 6) {
                int var38 = var20.field3338;
                int var39 = var38 & 0x1F;
                int var40 = (var38 & 0x7D4C) >> 10;
                class181 var41 = class224.method1564(-99, var22);
                int var42 = (var38 & 0x3FE) >> 5;
                int var43 = (var42 << 11) + (var39 << 3) + (var40 << 19);
                if (var41.field3063 != var43) {
                    var41.field3063 = var43;
                    class52.method459(128, var41);
                }
            } else if (var21 == 7) {
                class181 var36 = class224.method1564(-99, var22);
                boolean var37 = var20.field3338 == 1;
                if (var36.field3116 != var37) {
                    var36.field3116 = var37;
                    class52.method459(128, var36);
                }
            } else if (var21 == 8) {
                class181 var35 = class224.method1564(-110, var22);
                if (var20.field3338 != var35.field3000 || var20.field3343 != var35.field3130 || var20.field3340 != var35.field3114) {
                    var35.field3130 = var20.field3343;
                    var35.field3000 = var20.field3338;
                    var35.field3114 = var20.field3340;
                    if (var35.field3084 != -1) {
                        if (var35.field3113 > 0) {
                            var35.field3114 = var35.field3114 * 32 / var35.field3113;
                        } else if (var35.field2981 > 0) {
                            var35.field3114 = var35.field3114 * 32 / var35.field2981;
                        }
                    }
                    class52.method459(128, var35);
                }
            } else if (var21 == 9) {
                class181 var28 = class224.method1564(-114, var22);
                if (var20.field3338 != var28.field3084 || var20.field3343 != var28.field3091) {
                    var28.field3091 = var20.field3343;
                    var28.field3084 = var20.field3338;
                    class52.method459(128, var28);
                }
            } else if (var21 == 10) {
                class181 var34 = class224.method1564(-108, var22);
                if (var20.field3338 != var34.field3012 || var20.field3343 != var34.field3139 || var20.field3340 != var34.field3055) {
                    var34.field3012 = var20.field3338;
                    var34.field3055 = var20.field3340;
                    var34.field3139 = var20.field3343;
                    class52.method459(128, var34);
                }
            } else if (var21 == 11) {
                class181 var29 = class224.method1564(-102, var22);
                var29.field3011 = var29.field2987 = var20.field3343;
                var29.field3008 = 0;
                var29.field3125 = var29.field3136 = var20.field3338;
                var29.field3077 = 0;
                class52.method459(128, var29);
            } else if (var21 == 12) {
                class181 var30 = class224.method1564(-117, var22);
                int var31 = var20.field3338;
                if (var30 != null && var30.field3098 == 0) {
                    if ((var30.field3089 - var30.field2972) < var31) {
                        var31 = var30.field3089 - var30.field2972;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    if (var30.field2992 != var31) {
                        var30.field2992 = var31;
                        class52.method459(128, var30);
                    }
                }
            } else if (var21 == 13) {
                class181 var33 = class224.method1564(-97, var22);
                var33.field3031 = var20.field3338;
            } else if (var21 == 14) {
                class181 var32 = class224.method1564(-105, var22);
                var32.field3133 = var20.field3338;
            }
        }
        class197.field3303++;
        if (class244.field4048 != 0) {
            class323.field5227 += 20;
            if (class323.field5227 >= 400) {
                class244.field4048 = 0;
            }
        }
        if (class299.field4852 != null) {
            class156.field2646++;
            if (class156.field2646 >= 15) {
                class52.method459(128, class299.field4852);
                class299.field4852 = null;
            }
        }
        if (class240.field3991 != null) {
            class52.method459(128, class240.field3991);
            if (class55.field1087 + 5 < class73.field1339 || class73.field1339 < class55.field1087 - 5 || class26.field662 > class127.field2226 + 5 || class127.field2226 - 5 > class26.field662) {
                class34.field756 = true;
            }
            class88.field1535++;
            if (class94.field1651 == 0) {
                if (class34.field756 && class88.field1535 >= 5) {
                    if (class275.field4488 == class240.field3991 && class55.field1096 != class285.field4660) {
                        class287.field4684++;
                        class181 var45 = class240.field3991;
                        byte var46 = 0;
                        if (class238.field3971 == 1 && var45.field3059 == 206) {
                            var46 = 1;
                        }
                        if (var45.field2983[class285.field4660] <= 0) {
                            var46 = 0;
                        }
                        if (client.method1990(var45).method2404(-21377)) {
                            int var49 = class285.field4660;
                            int var50 = class55.field1096;
                            var45.field2983[var49] = var45.field2983[var50];
                            var45.field2989[var49] = var45.field2989[var50];
                            var45.field2983[var50] = -1;
                            var45.field2989[var50] = 0;
                        } else if (var46 == 1) {
                            int var47 = class55.field1096;
                            int var48 = class285.field4660;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var45.method1282(var47 - 1, var47, -101);
                                    var47--;
                                } else if (var48 > var47) {
                                    var45.method1282(var47 + 1, var47, -75);
                                    var47++;
                                }
                            }
                        } else {
                            var45.method1282(class285.field4660, class55.field1096, -89);
                        }
                        class51.field1038.method291((byte) 45, 215);
                        class51.field1038.method1048((byte) 108, var46);
                        class51.field1038.method1026(class240.field3991.field3103, (byte) 30);
                        class51.field1038.method1039((byte) -70, class55.field1096);
                        class51.field1038.method1002((byte) -81, class285.field4660);
                    }
                } else if ((class301.field4895 == 1 || class348.method2492(class137.field2343 - 1, -121)) && class137.field2343 > 2) {
                    class282.method2007((byte) -13);
                } else if (class137.field2343 > 0) {
                    class99.method751((byte) 116);
                }
                class156.field2646 = 10;
                class240.field3991 = null;
                class325.field5246 = 0;
            }
        }
        class132.field2275 = false;
        class277.field4509 = 0;
        class233.field3821 = false;
        class181 var51 = class292.field4731;
        class292.field4731 = null;
        class181 var52 = class171.field2831;
        class171.field2831 = null;
        class1.field19 = null;
        while (class128.method916((byte) -91) && class277.field4509 < 128) {
            class28.field683[class277.field4509] = class363.field5752;
            class66.field1246[class277.field4509] = class311.field5071;
            class277.field4509++;
        }
        class61.field1193 = null;
        if (class88.field1566 != -1) {
            class174.method1239(0, class287.field4696, class88.field1566, class133.field2287, 0, -2, 0, 0);
        }
        class83.field1436++;
        if (class61.field1193 != null) {
            class57.method480(false);
        }
        while (true) {
            class47 var53;
            class181 var54;
            class181 var55;
            do {
                var53 = (class47) class86.field1501.method432(true);
                if (var53 == null) {
                    while (true) {
                        class47 var56;
                        class181 var57;
                        class181 var58;
                        do {
                            var56 = (class47) class130.field2250.method432(true);
                            if (var56 == null) {
                                while (true) {
                                    class47 var59;
                                    class181 var60;
                                    class181 var61;
                                    do {
                                        var59 = (class47) class261.field4296.method432(true);
                                        if (var59 == null) {
                                            if (class61.field1193 == null) {
                                                class347.field5535 = 0;
                                            }
                                            if (class323.field5231 != null) {
                                                class83.method617((byte) 58);
                                            }
                                            if (class300.field4883 > 0 && class261.field4307[82] && class261.field4307[81] && class237.field3881 != 0) {
                                                int var62 = class276.field4506 - class237.field3881;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class86.method653(var62, 3, class96.field1750.field139[0] + class272.field4426, class21.field543 - -class96.field1750.field170[0]);
                                            }
                                            if (class300.field4883 > 0 && class261.field4307[82] && class261.field4307[81]) {
                                                if (class7.field241 != -1) {
                                                    class86.method653(class276.field4506, 3, class7.field241 + class272.field4426, class267.field4364 + class21.field543);
                                                }
                                                class231.field3795 = 0;
                                                class148.field2527 = 0;
                                            } else if (class148.field2527 == 2) {
                                                if (class7.field241 != -1) {
                                                    class103.field1892++;
                                                    class51.field1038.method291((byte) -93, 195);
                                                    class51.field1038.method1042((byte) -125, class354.field5650);
                                                    class51.field1038.method1039((byte) -70, class21.field543 + class267.field4364);
                                                    class51.field1038.method1032(6951, class119.field2126);
                                                    class51.field1038.method1002((byte) -97, class7.field241 + class272.field4426);
                                                    class53.field1061 = class303.field4931;
                                                    class244.field4048 = 1;
                                                    class133.field2289 = class37.field807;
                                                    class323.field5227 = 0;
                                                }
                                                class148.field2527 = 0;
                                            } else if (class231.field3795 == 2) {
                                                if (class7.field241 != -1) {
                                                    class354.field5649++;
                                                    class51.field1038.method291((byte) 98, 105);
                                                    class51.field1038.method1042((byte) -125, class7.field241 + class272.field4426);
                                                    class51.field1038.method1002((byte) -86, class21.field543 + class267.field4364);
                                                    class244.field4048 = 1;
                                                    class323.field5227 = 0;
                                                    class133.field2289 = class37.field807;
                                                    class53.field1061 = class303.field4931;
                                                }
                                                class231.field3795 = 0;
                                            } else if (class7.field241 != -1 && class148.field2527 == 0 && class231.field3795 == 0) {
                                                int var63 = (class7.field241 << 1) - (class96.field1750.method49((byte) -65) - 1) >> 1;
                                                int var64 = (class267.field4364 << 1) - (class96.field1750.method49((byte) 61) - 1) >> 1;
                                                class248.method1750(var63, 0, var64, -100);
                                                class323.field5227 = 0;
                                                class53.field1061 = class303.field4931;
                                                class244.field4048 = 1;
                                                class133.field2289 = class37.field807;
                                                class166.method1186(0, var64, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], 13949, var63, 0);
                                            }
                                            class7.field241 = -1;
                                            class68.method527((byte) -118);
                                            if (class292.field4731 != var51) {
                                                if (var51 != null) {
                                                    class52.method459(128, var51);
                                                }
                                                if (class292.field4731 != null) {
                                                    class52.method459(128, class292.field4731);
                                                }
                                            }
                                            if (class171.field2831 != var52 && class99.field1822 == class68.field1263) {
                                                if (var52 != null) {
                                                    class52.method459(128, var52);
                                                }
                                                if (class171.field2831 != null) {
                                                    class52.method459(128, class171.field2831);
                                                }
                                            }
                                            if (class171.field2831 == null) {
                                                if (class68.field1263 > 0) {
                                                    class68.field1263--;
                                                }
                                            } else if (class68.field1263 < class99.field1822) {
                                                class68.field1263++;
                                                if (class99.field1822 == class68.field1263) {
                                                    class52.method459(128, class171.field2831);
                                                }
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class219.field3642[var65]++;
                                            }
                                            if (arg0 >= -82) {
                                                field3646 = 5;
                                            }
                                            int var66 = class96.method733(-118);
                                            int var67 = class120.method874((byte) -73);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class263.field4323 = 250;
                                                class6.field182++;
                                                class30.method233((byte) 3, 14500);
                                                class51.field1038.method291((byte) -93, 30);
                                            }
                                            if (class234.field3830 != null && class234.field3830.field3504 == 1) {
                                                if (class234.field3830.field3501 != null) {
                                                    class352.method2508(class331.field5293, 1190717, class83.field1439);
                                                }
                                                class83.field1439 = false;
                                                class331.field5293 = null;
                                                class234.field3830 = null;
                                            }
                                            class253.field4164++;
                                            class302.field4910++;
                                            class137.field2338++;
                                            if (class137.field2338 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class312.field5075 += class111.field2033;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class12.field372 += class82.field1423;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class127.field2225 += class33.field751;
                                                }
                                                class137.field2338 = 0;
                                            }
                                            if (class253.field4164 > 500) {
                                                class253.field4164 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class192.field3253 += class19.field511;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class292.field4726 += class359.field5722;
                                                }
                                            }
                                            if (class312.field5075 < -55) {
                                                class111.field2033 = 2;
                                            }
                                            if (class192.field3253 < -60) {
                                                class19.field511 = 2;
                                            }
                                            if (class292.field4726 < -20) {
                                                class359.field5722 = 1;
                                            }
                                            if (class127.field2225 < -50) {
                                                class33.field751 = 2;
                                            }
                                            if (class192.field3253 > 60) {
                                                class19.field511 = -2;
                                            }
                                            if (class292.field4726 > 10) {
                                                class359.field5722 = -1;
                                            }
                                            if (class127.field2225 > 50) {
                                                class33.field751 = -2;
                                            }
                                            if (class312.field5075 > 55) {
                                                class111.field2033 = -2;
                                            }
                                            if (class12.field372 < -40) {
                                                class82.field1423 = 1;
                                            }
                                            if (class12.field372 > 40) {
                                                class82.field1423 = -1;
                                            }
                                            if (class302.field4910 > 50) {
                                                class51.field1038.method291((byte) 81, 164);
                                                class97.field1756++;
                                            }
                                            if (class320.field5210) {
                                                class15.method165(-105);
                                                class320.field5210 = false;
                                            }
                                            try {
                                                if (class127.field2224 != null && class51.field1038.field2435 > 0) {
                                                    class127.field2224.method1645(class51.field1038.field2496, class51.field1038.field2435, -20326, 0);
                                                    class302.field4910 = 0;
                                                    class51.field1038.field2435 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class359.method2538(0);
                                            }
                                            return;
                                        }
                                        var60 = var59.field939;
                                        if (var60.field3023 < 0) {
                                            break;
                                        }
                                        var61 = class224.method1564(-112, var60.field2970);
                                    } while (var61 == null || var61.field3095 == null || var60.field3023 >= var61.field3095.length || var61.field3095[var60.field3023] != var60);
                                    class20.method184(var59, (byte) 117);
                                }
                            }
                            var57 = var56.field939;
                            if (var57.field3023 < 0) {
                                break;
                            }
                            var58 = class224.method1564(-121, var57.field2970);
                        } while (var58 == null || var58.field3095 == null || var58.field3095.length <= var57.field3023 || var58.field3095[var57.field3023] != var57);
                        class20.method184(var56, (byte) 111);
                    }
                }
                var54 = var53.field939;
                if (var54.field3023 < 0) {
                    break;
                }
                var55 = class224.method1564(-103, var54.field2970);
            } while (var55 == null || var55.field3095 == null || var54.field3023 >= var55.field3095.length || var55.field3095[var54.field3023] != var54);
            class20.method184(var53, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", line = 1047)
    public static final void method1533(String arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        field3658++;
        class287.method2038(false, (String) null, arg0, arg1, -1, arg3, arg4, arg2);
        if (arg5 != 27293) {
            field3647 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lr;Lr;I)V", line = 1078)
    public static final void method1534(class301 arg0, class301 arg1, int arg2) {
        field3648++;
        if (arg0.field4903 != null) {
            arg0.method2152((byte) 98);
        }
        arg0.field4903 = arg1;
        if (arg2 <= -101) {
            arg0.field4901 = arg1.field4901;
            arg0.field4903.field4901 = arg0;
            arg0.field4901.field4903 = arg0;
        }
    }
}
