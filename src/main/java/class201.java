import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vh")
public class class201 {

    @OriginalMember(owner = "vh", name = "h", descriptor = "[[[Ltf;")
    public static class181[][][] field3965 = new class181[4][104][104];

    @OriginalMember(owner = "vh", name = "a", descriptor = "[S")
    public static short[] field3958 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "vh", name = "f", descriptor = "Llf;")
    private static class109 field3963 = class35.method275("OFF", 2);

    @OriginalMember(owner = "vh", name = "b", descriptor = "I")
    public static int field3959 = 0;

    @OriginalMember(owner = "vh", name = "i", descriptor = "[I")
    public static int[] field3966 = new int[500];

    @OriginalMember(owner = "vh", name = "g", descriptor = "Llf;")
    public static class109 field3964 = field3963;

    @OriginalMember(owner = "vh", name = "j", descriptor = "[I")
    public static int[] field3967 = new int[128];

    @OriginalMember(owner = "vh", name = "l", descriptor = "Llf;")
    public static class109 field3969 = class35.method275("zur-Uck auf die RuneScape)2Webseite gehen", 2);

    @OriginalMember(owner = "vh", name = "d", descriptor = "I")
    private static int field3961 = 2;

    @OriginalMember(owner = "vh", name = "m", descriptor = "Lua;")
    public static class185 field3970 = null;

    @OriginalMember(owner = "vh", name = "e", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "vh", name = "k", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "vh", name = "c", descriptor = "J")
    public static long field3960;

    @OriginalMember(owner = "vh", name = "a", descriptor = "(B[BII)I")
    public static final int method1325(byte arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        field3968++;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class162.field3036[(arg1[var5] ^ var4) & 0xFF];
        }
        int var6 = 48 / ((arg0 - 66) / 42);
        return ~var4;
    }

    @OriginalMember(owner = "vh", name = "a", descriptor = "(I)V")
    public static final void method1326(int arg0) {
        if (class30.field655 > 1) {
            class30.field655--;
        }
        field3962++;
        if (class13.field193 > 0) {
            class13.field193--;
        }
        if (class4.field48) {
            class4.field48 = false;
            class52.method344((byte) -125);
            return;
        }
        for (int var1 = 0; var1 < 100 && class181.method1228(arg0 + 7865); var1++) {
        }
        if (class107.field2123 != 30) {
            return;
        }
        class30.method244(157, (byte) 35, class200.field3850);
        Object var2 = class90.field1857.field2936;
        synchronized (class90.field1857.field2936) {
            if (!class179.field3389) {
                class90.field1857.field2946 = 0;
            } else if (class69.field1333 != 0 || class90.field1857.field2946 >= 40) {
                class200.field3850.method1339((byte) 110, 210);
                class197.field3765++;
                class200.field3850.method568(arg0 - 5622, 0);
                int var3 = class200.field3850.field1773;
                int var4 = 0;
                for (int var5 = 0; var5 < class90.field1857.field2946 && class200.field3850.field1773 - var3 < 240; var5++) {
                    int var6 = class90.field1857.field2945[var5];
                    var4++;
                    int var7 = class90.field1857.field2947[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class90.field1857.field2945[var5] == -1 && class90.field1857.field2947[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class67.field1304 != var7 || class91.field1862 != var6) {
                        int var9 = var7 - class67.field1304;
                        int var10 = var6 - class91.field1862;
                        class91.field1862 = var6;
                        class67.field1304 = var7;
                        if (class95.field1940 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class200.field3850.method557(arg0 ^ 0xFFFFC4A4, (class95.field1940 << 12) + (var9 << 6) + var10);
                            class95.field1940 = 0;
                        } else if (class95.field1940 < 8) {
                            class200.field3850.method549((class95.field1940 << 19) + var8 + 8388608, -2140);
                            class95.field1940 = 0;
                        } else {
                            class200.field3850.method588((byte) 115, (class95.field1940 << 19) + var8 - 1073741824);
                            class95.field1940 = 0;
                        }
                    } else if (class95.field1940 < 2047) {
                        class95.field1940++;
                    }
                }
                class200.field3850.method565(class200.field3850.field1773 - var3, 87);
                if (class90.field1857.field2946 <= var4) {
                    class90.field1857.field2946 = 0;
                } else {
                    class90.field1857.field2946 -= var4;
                    for (int var11 = 0; var11 < class90.field1857.field2946; var11++) {
                        class90.field1857.field2947[var11] = class90.field1857.field2947[var11 + var4];
                        class90.field1857.field2945[var11] = class90.field1857.field2945[var11 + var4];
                    }
                }
            }
        }
        if (class69.field1333 != 0) {
            class181.field3408++;
            long var12 = (class44.field917 - class13.field208) / 50L;
            class13.field208 = class44.field917;
            int var14 = class67.field1310;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var15 = class129.field2511;
            int var16 = (int) var12;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var17 = var14 * 765 + var15;
            byte var18 = 0;
            if (class69.field1333 == 2) {
                var18 = 1;
            }
            class200.field3850.method1339((byte) 119, 242);
            class200.field3850.method604((byte) -98, (var18 << 19) + ((var16 << 20) + var17));
        }
        if (class74.field1423[96] || class74.field1423[97] || class74.field1423[98] || class74.field1423[99]) {
            class185.field3525 = true;
        }
        if (class159.field2988 > 0) {
            class159.field2988--;
        }
        if (class185.field3525 && class159.field2988 <= 0) {
            class185.field3525 = false;
            class159.field2988 = 20;
            class144.field2777++;
            class200.field3850.method1339((byte) 87, 230);
            class200.field3850.method574(1174839336, class142.field2742);
            class200.field3850.method600(class69.field1343, arg0 + 7994);
        }
        if (class205.field4021 && !class112.field2218) {
            class112.field2218 = true;
            class132.field2548++;
            class200.field3850.method1339((byte) 81, 143);
            class200.field3850.method568(-13488, 1);
        }
        if (!class205.field4021 && class112.field2218) {
            class112.field2218 = false;
            class132.field2548++;
            class200.field3850.method1339((byte) 100, 143);
            class200.field3850.method568(-13488, 0);
        }
        class50.method340(arg0 ^ arg0);
        if (class107.field2123 != 30) {
            return;
        }
        class114.method841(arg0 ^ 0x1EC1);
        class13.method83(0);
        class115.field2283++;
        if (class115.field2283 > 750) {
            class52.method344((byte) -125);
            return;
        }
        class72.method456(1);
        client.method247(0);
        class22.method203((byte) 122);
        if (class199.field3812 != 0) {
            class90.field1858 += 20;
            if (class90.field1858 >= 400) {
                class199.field3812 = 0;
            }
        }
        class193.field3694++;
        if (class106.field2107 != null) {
            class184.field3480++;
            if (class184.field3480 >= 15) {
                class115.method851(class106.field2107, arg0 ^ 0x4485);
                class106.field2107 = null;
            }
        }
        if (class174.field3296 != null) {
            class115.method851(class174.field3296, -23101);
            class164.field3070++;
            if (class62.field1200 + 5 < class21.field479 || class21.field479 < class62.field1200 - 5 || class109.field2134 > class41.field870 + 5 || class109.field2134 < class41.field870 - 5) {
                class126.field2435 = true;
            }
            if (class206.field4043 == 0) {
                if (class126.field2435 && class164.field3070 >= 5) {
                    if (class7.field106 == class174.field3296 && class159.field2978 != class10.field158) {
                        class130.field2517++;
                        class200 var19 = class174.field3296;
                        byte var20 = 0;
                        if (class13.field201 == 1 && var19.field3916 == 206) {
                            var20 = 1;
                        }
                        if (var19.field3925[class159.field2978] <= 0) {
                            var20 = 0;
                        }
                        if (class158.method1077(610157134, class126.method918(var19, 100))) {
                            int var21 = class10.field158;
                            int var22 = class159.field2978;
                            var19.field3925[var22] = var19.field3925[var21];
                            var19.field3913[var22] = var19.field3913[var21];
                            var19.field3925[var21] = -1;
                            var19.field3913[var21] = 0;
                        } else if (var20 == 1) {
                            int var23 = class159.field2978;
                            int var24 = class10.field158;
                            while (var23 != var24) {
                                if (var24 > var23) {
                                    var19.method1316(var24, (byte) 79, var24 - 1);
                                    var24--;
                                } else if (var24 < var23) {
                                    var19.method1316(var24, (byte) 79, var24 + 1);
                                    var24++;
                                }
                            }
                        } else {
                            var19.method1316(class10.field158, (byte) 79, class159.field2978);
                        }
                        class200.field3850.method1339((byte) 83, 10);
                        class200.field3850.method556(class174.field3296.field3866, arg0 - 2125503870);
                        class200.field3850.method603(class159.field2978, true);
                        class200.field3850.method587((byte) -36, var20);
                        class200.field3850.method574(arg0 ^ 0xB9F9416E, class10.field158);
                    }
                } else if ((class126.field2429 == 1 || class28.method229(arg0 ^ 0x45220F8C, class149.field2882 - 1)) && class149.field2882 > 2) {
                    class127.method925((byte) -124);
                } else if (class149.field2882 > 0) {
                    class7.method34((byte) 116, class149.field2882 - 1);
                }
                class184.field3480 = 10;
                class174.field3296 = null;
                class69.field1333 = 0;
            }
        }
        class48.field984 = null;
        class200 var25 = class209.field4069;
        class27.field596 = false;
        class52.field1048 = false;
        class209.field4069 = null;
        class200 var26 = class92.field1889;
        class92.field1889 = null;
        for (class48.field990 = 0; class104.method747(arg0 + 7866) && class48.field990 < 128; class48.field990++) {
            class24.field542[class48.field990] = class204.field4005;
            field3967[class48.field990] = class78.field1513;
        }
        if (class4.field57 != -1) {
            class104.method744(0, (byte) 126, 503, 0, 0, 765, 0, class4.field57);
        }
        class75.field1442++;
        while (true) {
            class82 var27;
            class200 var28;
            class200 var29;
            do {
                var27 = (class82) class109.field2153.method1229((byte) 70);
                if (var27 == null) {
                    while (true) {
                        class82 var30;
                        class200 var31;
                        class200 var32;
                        do {
                            var30 = (class82) class210.field4089.method1229((byte) 85);
                            if (var30 == null) {
                                while (true) {
                                    class82 var33;
                                    class200 var34;
                                    class200 var35;
                                    do {
                                        var33 = (class82) class177.field3337.method1229((byte) 121);
                                        if (var33 == null) {
                                            if (class182.field3431 != null) {
                                                class77.method492((byte) 121);
                                            }
                                            if (class9.field142 != -1) {
                                                int var36 = class9.field142;
                                                int var37 = client.field662;
                                                boolean var38 = class55.method358(arg0 + 7866, 0, 0, var36, 0, 0, class157.field2955.field3567[0], class157.field2955.field3547[0], true, var37, 0, 0);
                                                class9.field142 = -1;
                                                if (var38) {
                                                    class90.field1858 = 0;
                                                    class145.field2801 = class67.field1310;
                                                    class60.field1185 = class129.field2511;
                                                    class199.field3812 = 1;
                                                }
                                            }
                                            class22.method201(15859);
                                            if (class209.field4069 != var25) {
                                                if (var25 != null) {
                                                    class115.method851(var25, -23101);
                                                }
                                                if (class209.field4069 != null) {
                                                    class115.method851(class209.field4069, -23101);
                                                }
                                            }
                                            if (class92.field1889 != var26 && class185.field3524 == class174.field3294) {
                                                if (var26 != null) {
                                                    class115.method851(var26, -23101);
                                                }
                                                if (class92.field1889 != null) {
                                                    class115.method851(class92.field1889, -23101);
                                                }
                                            }
                                            if (class92.field1889 == null) {
                                                if (class185.field3524 > 0) {
                                                    class185.field3524--;
                                                }
                                            } else if (class174.field3294 > class185.field3524) {
                                                class185.field3524++;
                                                if (class185.field3524 == class174.field3294) {
                                                    class115.method851(class92.field1889, -23101);
                                                }
                                            }
                                            class158.method1076(false);
                                            if (class109.field2148) {
                                                class169.method1129(arg0 ^ 0x1EC8);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class68.field1311[var39]++;
                                            }
                                            int var40 = class146.method1021(-1);
                                            int var41 = class193.method1299(true);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class13.field193 = 250;
                                                class86.field1791++;
                                                class59.method390(-123, 4000);
                                                class200.field3850.method1339((byte) 98, 36);
                                            }
                                            class158.field2976++;
                                            if (class158.field2976 > 500) {
                                                class158.field2976 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x4) == 4) {
                                                    class76.field1464 += class125.field2395;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class59.field1172 += class148.field2859;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class174.field3300 += field3961;
                                                }
                                            }
                                            class204.field4016++;
                                            if (class76.field1464 < -40) {
                                                class125.field2395 = 1;
                                            }
                                            if (class204.field4016 > 500) {
                                                class204.field4016 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class144.field2780 += class165.field3096;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class47.field970 += class129.field2504;
                                                }
                                            }
                                            class206.field4053++;
                                            if (class144.field2780 < -20) {
                                                class165.field3096 = 1;
                                            }
                                            if (class47.field970 < -60) {
                                                class129.field2504 = 2;
                                            }
                                            if (class59.field1172 < -50) {
                                                class148.field2859 = 2;
                                            }
                                            if (class144.field2780 > 10) {
                                                class165.field3096 = -1;
                                            }
                                            if (class59.field1172 > 50) {
                                                class148.field2859 = -2;
                                            }
                                            if (class174.field3300 < -55) {
                                                field3961 = 2;
                                            }
                                            if (class47.field970 > 60) {
                                                class129.field2504 = -2;
                                            }
                                            if (class76.field1464 > 40) {
                                                class125.field2395 = -1;
                                            }
                                            if (class174.field3300 > 55) {
                                                field3961 = -2;
                                            }
                                            if (class206.field4053 > 50) {
                                                class24.field531++;
                                                class200.field3850.method1339((byte) 94, 20);
                                            }
                                            try {
                                                if (class55.field1114 != null && class200.field3850.field1773 > 0) {
                                                    class55.field1114.method908(-123, 0, class200.field3850.field1773, class200.field3850.field1808);
                                                    class206.field4053 = 0;
                                                    class200.field3850.field1773 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class52.method344((byte) -125);
                                                return;
                                            }
                                        }
                                        var34 = var33.field1608;
                                        if (var34.field3900 < 0) {
                                            break;
                                        }
                                        var35 = class158.method1078(var34.field3868, (byte) 123);
                                    } while (var35 == null || var35.field3898 == null || var34.field3900 >= var35.field3898.length || var35.field3898[var34.field3900] != var34);
                                    class42.method305(24087, var33);
                                }
                            }
                            var31 = var30.field1608;
                            if (var31.field3900 < 0) {
                                break;
                            }
                            var32 = class158.method1078(var31.field3868, (byte) 116);
                        } while (var32 == null || var32.field3898 == null || var32.field3898.length <= var31.field3900 || var32.field3898[var31.field3900] != var31);
                        class42.method305(24087, var30);
                    }
                }
                var28 = var27.field1608;
                if (var28.field3900 < 0) {
                    break;
                }
                var29 = class158.method1078(var28.field3868, (byte) 112);
            } while (var29 == null || var29.field3898 == null || var28.field3900 >= var29.field3898.length || var29.field3898[var28.field3900] != var28);
            class42.method305(24087, var27);
        }
    }

    @OriginalMember(owner = "vh", name = "a", descriptor = "(III)Z")
    public static final boolean method1327(int arg0, int arg1, int arg2) {
        int var3 = class206.field4051[arg0][arg1][arg2];
        if (-class102.field2020 == var3) {
            return false;
        } else if (class102.field2020 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class1.method1(var4 + 1, class29.field623[arg0][arg1][arg2], var5 + 1) && class1.method1(var4 + 128 - 1, class29.field623[arg0][arg1 + 1][arg2], var5 + 1) && class1.method1(var4 + 128 - 1, class29.field623[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class1.method1(var4 + 1, class29.field623[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class206.field4051[arg0][arg1][arg2] = class102.field2020;
                return true;
            } else {
                class206.field4051[arg0][arg1][arg2] = -class102.field2020;
                return false;
            }
        }
    }

    @OriginalMember(owner = "vh", name = "b", descriptor = "(I)V")
    public static void method1328(int arg0) {
        field3958 = null;
        field3967 = null;
        field3969 = null;
        field3963 = null;
        field3966 = null;
        field3965 = null;
        field3964 = null;
        if (arg0 != -1048) {
            field3958 = null;
        }
    }
}
