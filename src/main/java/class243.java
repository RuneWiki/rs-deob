import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class243 {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lhl;")
    public static class353 field3479 = new class353(9, 2);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Ldda;")
    public static class407 field3480;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Ldda;")
    public static class407 field3481;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
    public static void method1614(boolean arg0) {
        field3479 = null;
        field3481 = null;
        field3480 = null;
        if (arg0) {
            field3482 = -89;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBIIIII)I")
    public static final int method1615(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        int var8 = -77 / ((arg1 + 4) / 55);
        field3483++;
        if ((arg4 & 0x1) == 1) {
            int var9 = arg2;
            arg2 = arg5;
            arg5 = var9;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 7 + 1 - arg6 - arg2;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg5;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static final void method1616(int arg0) {
        if (arg0 == 0) {
            if (class44.field585 == 2) {
                class495.field6792[0].method4001(class604.field8584[0]);
                class495.field6792[1].method4001(class604.field8584[1]);
            } else if (class44.field585 == 3) {
                class495.field6792[0].method4001(class604.field8584[0]);
                class495.field6792[1].method4001(class604.field8584[1]);
                class495.field6792[2].method4001(class604.field8584[2]);
            } else {
                class495.field6792[0].method4001(class604.field8584[0]);
                class495.field6792[1].method4001(class604.field8584[1]);
                class495.field6792[2].method4001(class604.field8584[2]);
                class495.field6792[3].method4001(class604.field8584[3]);
            }
        } else if (arg0 == 1) {
            if (class44.field585 == 2) {
                class495.field6792[0].method4001(class604.field8584[2]);
            } else if (class44.field585 == 3) {
                class495.field6792[0].method4001(class604.field8584[3]);
                class495.field6792[1].method4001(class604.field8584[4]);
            } else {
                class495.field6792[0].method4001(class604.field8584[4]);
                class495.field6792[1].method4001(class604.field8584[5]);
                class495.field6792[2].method4001(class604.field8584[6]);
            }
        } else if (arg0 == 2) {
            if (class44.field585 == 2) {
                class495.field6792[0].method4001(class604.field8584[3]);
                return;
            }
            if (class44.field585 == 3) {
                class495.field6792[0].method4001(class604.field8584[5]);
                return;
            }
            class495.field6792[0].method4001(class604.field8584[7]);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public static final void method1617(int arg0) {
        field3478++;
        if (class373.field5243 == 0 || class373.field5243 == 5) {
            return;
        }
        try {
            short var1;
            if (class322.field4586 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if ((++class296.field4300) > var1) {
                if (class600.field8551 != null) {
                    class600.field8551.method183((byte) 88);
                    class600.field8551 = null;
                }
                if (class322.field4586 >= 3) {
                    class373.field5243 = 0;
                    class330.method2010(arg0 + 2854, -5);
                    return;
                }
                if (class591.field8484 == 2) {
                    class472.field6424.method2406(20);
                } else {
                    field3481.method2406(20);
                }
                class296.field4300 = 0;
                class373.field5243 = 1;
                class322.field4586++;
            }
            if (class373.field5243 == 1) {
                if (class591.field8484 == 2) {
                    class456.field6230 = class472.field6424.method2409(class336.field4775, (byte) 112);
                } else {
                    class456.field6230 = field3481.method2409(class336.field4775, (byte) -73);
                }
                class373.field5243 = 2;
            }
            if (class373.field5243 == 2) {
                if (class456.field6230.field10365 == 2) {
                    throw new IOException();
                }
                if (class456.field6230.field10365 != 1) {
                    return;
                }
                class600.field8551 = class502.method2931((Socket) class456.field6230.field10371, 1894, 15000);
                class456.field6230 = null;
                class702.method3933(1712);
                class302 var2 = class99.method815(arg0 - 38870);
                var2.field4341.method2524(false, class260.field3680.field9792);
                class501.method2928(0, var2);
                class323.method1951(false);
                class373.field5243 = 3;
            }
            if (class373.field5243 == 3) {
                if (!class600.field8551.method186(1, -124)) {
                    return;
                }
                class600.field8551.method185(1, class48.field674.field6002, 0, -92);
                int var3 = class48.field674.field6002[0] & 0xFF;
                if (var3 != 0) {
                    class373.field5243 = 0;
                    class330.method2010(arg0 ^ 0xDEA, var3);
                    class600.field8551.method183((byte) 88);
                    class600.field8551 = null;
                    class382.method2310((byte) 93);
                    return;
                }
                class48.field674.field5983 = 0;
                class431 var4 = new class431(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method2524(false, 10);
                var4.method2548(var5[0], (byte) -93);
                var4.method2548(var5[1], (byte) -108);
                var4.method2548(var5[2], (byte) -104);
                var4.method2548(var5[3], (byte) -127);
                var4.method2563(true, 0L);
                var4.method2566(-2, class110.field1563);
                var4.method2563(true, class507.field6971);
                var4.method2563(true, class38.field453);
                var4.method2554(class97.field1382, false, class144.field2333);
                class702.method3933(1712);
                class302 var6 = class99.method815(-18016);
                class373 var7 = var6.field4341;
                if (class591.field8484 == 2) {
                    if (class141.field2306 == 13) {
                        var7.method2524(false, class260.field3689.field9792);
                    } else {
                        var7.method2524(false, class260.field3687.field9792);
                    }
                    var7.method2546(true, 0);
                    int var8 = var7.field5983;
                    var7.method2548(643, (byte) -121);
                    var7.method2514(var4.field6002, var4.field5983, (byte) -122, 0);
                    int var9 = var7.field5983;
                    var7.method2566(arg0 ^ 0xFFFFAE88, class599.field8546);
                    var7.method2524(false, class347.field4939);
                    var7.method2524(false, class388.method2333((byte) 47));
                    var7.method2546(true, class709.field9923);
                    var7.method2546(true, class448.field6174);
                    var7.method2524(false, class420.field5820.field9447.method745(17539));
                    class113.method932((byte) -104, var7);
                    var7.method2566(arg0 - 20856, class121.field2061);
                    var7.method2548(class276.field3953, (byte) -115);
                    class431 var10 = class420.field5820.method3785(24);
                    var7.method2524(false, var10.field5983);
                    var7.method2514(var10.field6002, var10.field5983, (byte) -111, 0);
                    class356.field5069 = true;
                    class431 var11 = new class431(class63.field964.method4321(42));
                    class63.field964.method4323(var11, false);
                    var7.method2514(var11.field6002, var11.field6002.length, (byte) -122, 0);
                    var7.method2546(true, class661.field9319);
                    var7.method2563(true, class578.field8335);
                    var7.method2524(false, class18.field190 == null ? 0 : 1);
                    if (class18.field190 != null) {
                        var7.method2566(arg0 ^ 0xFFFFAE88, class18.field190);
                    }
                    var7.method2524(false, class514.method3023(-102, "jagtheora") ? 1 : 0);
                    var7.method2524(false, class781.field10717 ? 1 : 0);
                    class578.method3404((byte) -59, var7);
                    var7.method2583(var7.field5983, var5, -125, var9);
                    var7.method2516(var7.field5983 - var8, true);
                } else {
                    var7.method2524(false, class260.field3690.field9792);
                    var7.method2546(true, 0);
                    int var12 = var7.field5983;
                    var7.method2548(643, (byte) -98);
                    var7.method2514(var4.field6002, var4.field5983, (byte) -117, 0);
                    int var13 = var7.field5983;
                    var7.method2566(-2, class599.field8546);
                    var7.method2524(false, class113.field1647.field482);
                    var7.method2524(false, class423.field5892);
                    class113.method932((byte) -112, var7);
                    var7.method2566(-2, class121.field2061);
                    var7.method2548(class276.field3953, (byte) -94);
                    class578.method3404((byte) -59, var7);
                    var7.method2583(var7.field5983, var5, -113, var13);
                    var7.method2516(var7.field5983 - var12, true);
                }
                class501.method2928(0, var6);
                class323.method1951(false);
                class626.field8901 = new class781(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class48.field674.method2225(arg0 - 20726, var5);
                class373.field5243 = 4;
            }
            if (class373.field5243 == 4) {
                if (!class600.field8551.method186(1, -125)) {
                    return;
                }
                class600.field8551.method185(1, class48.field674.field6002, 0, -116);
                int var15 = class48.field674.field6002[0] & 0xFF;
                if (var15 == 21) {
                    class373.field5243 = 7;
                } else if (var15 == 29) {
                    class373.field5243 = 13;
                } else if (var15 == 1) {
                    class373.field5243 = 5;
                    class330.method2010(23708, var15);
                    return;
                } else if (var15 == 2) {
                    class373.field5243 = 8;
                } else if (var15 == 15) {
                    class373.field5243 = 14;
                    class549.field7634 = -2;
                } else if (var15 == 23 && class322.field4586 < 3) {
                    class373.field5243 = 1;
                    class322.field4586++;
                    class296.field4300 = 0;
                    class600.field8551.method183((byte) 88);
                    class600.field8551 = null;
                    return;
                } else {
                    class373.field5243 = 0;
                    class330.method2010(arg0 ^ 0xDEA, var15);
                    class600.field8551.method183((byte) 88);
                    class600.field8551 = null;
                    class382.method2310((byte) -117);
                    return;
                }
            }
            if (arg0 != 20854) {
                method1614(true);
            }
            if (class373.field5243 == 6) {
                class702.method3933(1712);
                class302 var16 = class99.method815(-18016);
                class373 var17 = var16.field4341;
                var17.method2221((byte) -117, class626.field8901);
                var17.method2230((byte) 6, class260.field3694.field9792);
                class501.method2928(0, var16);
                class323.method1951(false);
                class373.field5243 = 4;
            } else if (class373.field5243 == 7) {
                if (class600.field8551.method186(1, arg0 - 20970)) {
                    class600.field8551.method185(1, class48.field674.field6002, 0, -82);
                    int var18 = class48.field674.field6002[0] & 0xFF;
                    class373.field5243 = 0;
                    class551.field7651 = var18 * 50;
                    class330.method2010(23708, 21);
                    class600.field8551.method183((byte) 88);
                    class600.field8551 = null;
                    class382.method2310((byte) 33);
                }
            } else if (class373.field5243 == 13) {
                if (class600.field8551.method186(1, arg0 ^ 0xFFFFAEEE)) {
                    class600.field8551.method185(1, class48.field674.field6002, 0, arg0 - 20911);
                    class28.field294 = class48.field674.field6002[0] & 0xFF;
                    class373.field5243 = 0;
                    class330.method2010(arg0 + 2854, 29);
                    class600.field8551.method183((byte) 88);
                    class600.field8551 = null;
                    class382.method2310((byte) 35);
                }
            } else if (class373.field5243 != 8) {
                if (class373.field5243 == 9) {
                    class373 var19 = class48.field674;
                    if (class591.field8484 == 2) {
                        if (!class600.field8551.method186(class422.field5872, -104)) {
                            return;
                        }
                        class600.field8551.method185(class422.field5872, var19.field6002, 0, -25);
                        var19.field5983 = 0;
                        class778.field10675 = var19.method2557(14929);
                        class81.field1201 = var19.method2557(14929);
                        class273.field3833 = var19.method2557(14929) == 1;
                        class115.field1975 = var19.method2557(arg0 ^ 0x6B27) == 1;
                        class617.field8744 = var19.method2557(arg0 ^ 0x6B27) == 1;
                        class419.field5810 = var19.method2557(arg0 - 5925) == 1;
                        class541.field7492 = var19.method2565((byte) -96);
                        class29.field315 = var19.method2557(14929) == 1;
                        class429.field5940 = var19.method2547(arg0 - 20967);
                        class362.field5127 = var19.method2557(14929) == 1;
                        class312.field4418.method368((byte) 114, class362.field5127);
                        class422.field5873.method2936(class362.field5127, arg0 - 40740);
                        class677.field9511.method3701(class362.field5127, (byte) 61);
                    } else if (class600.field8551.method186(class422.field5872, -103)) {
                        class600.field8551.method185(class422.field5872, var19.field6002, 0, arg0 ^ 0xFFFFAEAA);
                        var19.field5983 = 0;
                        class778.field10675 = var19.method2557(14929);
                        class81.field1201 = var19.method2557(14929);
                        class273.field3833 = var19.method2557(14929) == 1;
                        class115.field1975 = var19.method2557(14929) == 1;
                        class617.field8744 = var19.method2557(arg0 - 5925) == 1;
                        class209.field3075 = var19.method2567((byte) -125);
                        class792.field10858 = -class337.method2062(false) + (class209.field3075 - var19.method2520(107));
                        int var20 = var19.method2557(14929);
                        class29.field315 = (var20 & 0x1) != 0;
                        class102.field1505 = (var20 & 0x2) != 0;
                        class116.field1980 = var19.method2526(17);
                        class39.field459 = var19.method2565((byte) -117);
                        class526.field7341 = var19.method2565((byte) -94);
                        class592.field8486 = var19.method2565((byte) -105);
                        class662.field9322 = var19.method2526(17);
                        class18.field191 = class336.field4775.method921((byte) 117, class662.field9322);
                        class265.field3737 = var19.method2557(14929);
                        class436.field6071 = var19.method2565((byte) -108);
                        class542.field7505 = var19.method2565((byte) -112);
                        class432.field6037 = var19.method2557(14929) == 1;
                        class719.field10041.field212 = class719.field10041.field224 = class445.field6154 = var19.method2537((byte) 27);
                        class464.field6305 = var19.method2557(arg0 - 5925);
                        class789.field10787 = var19.method2526(17);
                        class523.field7330 = var19.method2557(arg0 ^ 0x6B27) == 1;
                        class74.field1142 = new class407();
                        class74.field1142.field5598 = var19.method2565((byte) -108);
                        if (class74.field1142.field5598 == 65535) {
                            class74.field1142.field5598 = -1;
                        }
                        class74.field1142.field5595 = var19.method2537((byte) 27);
                        if (class94.field1340 != class145.field2353) {
                            class74.field1142.field5599 = class74.field1142.field5598 + 50000;
                            class74.field1142.field5597 = class74.field1142.field5598 + 40000;
                        }
                        if (class63.field963 != class145.field2353 && (class210.field3079 != class145.field2353 || class778.field10675 < 2) && (class472.field6424.method2408(class488.field6706, 6) || class472.field6424.method2408(field3480, 6))) {
                            class302.method1877(5);
                        }
                    } else {
                        return;
                    }
                    if ((!class273.field3833 || class617.field8744) && !class29.field315) {
                        try {
                            class154.method1204(class343.field4881, "unzap", 22458);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class154.method1204(class343.field4881, "zap", 22458);
                        } catch (Throwable var27) {
                            if (class758.field10503) {
                                try {
                                    class343.field4881.getAppletContext().showDocument(new URL(class343.field4881.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var26) {
                                }
                            }
                        }
                    }
                    if (class94.field1340 == class145.field2353) {
                        try {
                            class154.method1204(class343.field4881, "loggedin", 22458);
                        } catch (Throwable var24) {
                        }
                    }
                    if (class591.field8484 != 2) {
                        class373.field5243 = 0;
                        class330.method2010(23708, 2);
                        class337.method2061(-128);
                        class75.method690(true, 7);
                        class673.field9429 = null;
                        return;
                    }
                    class373.field5243 = 11;
                }
                if (class373.field5243 == 11) {
                    if (!class600.field8551.method186(3, arg0 ^ 0xFFFFAEE0)) {
                        return;
                    }
                    class600.field8551.method185(3, class48.field674.field6002, 0, -62);
                    class373.field5243 = 12;
                }
                if (class373.field5243 == 12) {
                    class373 var21 = class48.field674;
                    var21.field5983 = 0;
                    if (var21.method2224(arg0 + 1898335309)) {
                        if (!class600.field8551.method186(1, -100)) {
                            return;
                        }
                        class600.field8551.method185(1, var21.field6002, 3, arg0 - 20932);
                    }
                    class673.field9429 = class508.method2971(false)[var21.method2228((byte) -72)];
                    class549.field7634 = var21.method2565((byte) -111);
                    class373.field5243 = 10;
                }
                if (class373.field5243 == 10) {
                    if (class600.field8551.method186(class549.field7634, -127)) {
                        class600.field8551.method185(class549.field7634, class48.field674.field6002, 0, -117);
                        class48.field674.field5983 = 0;
                        int var22 = class549.field7634;
                        class373.field5243 = 0;
                        class330.method2010(23708, 2);
                        class119.method1049(arg0 - 20854);
                        class717.method3992(true, class48.field674);
                        class732.field10181 = -1;
                        if (class673.field9429 == class47.field634) {
                            class157.method1213((byte) -71);
                        } else {
                            class381.method2300(false);
                        }
                        if (class48.field674.field5983 != var22) {
                            throw new RuntimeException("lswp pos:" + class48.field674.field5983 + " psize:" + var22);
                        }
                        class673.field9429 = null;
                    }
                } else if (class373.field5243 == 14) {
                    if (class549.field7634 == -2) {
                        if (!class600.field8551.method186(2, -112)) {
                            return;
                        }
                        class600.field8551.method185(2, class48.field674.field6002, 0, -100);
                        class48.field674.field5983 = 0;
                        class549.field7634 = class48.field674.method2565((byte) -109);
                    }
                    if (class600.field8551.method186(class549.field7634, -92)) {
                        class600.field8551.method185(class549.field7634, class48.field674.field6002, 0, -76);
                        class48.field674.field5983 = 0;
                        class373.field5243 = 0;
                        int var23 = class549.field7634;
                        class330.method2010(23708, 15);
                        class493.method2880(-1);
                        class717.method3992(true, class48.field674);
                        if (class48.field674.field5983 != var23) {
                            throw new RuntimeException("lswpr pos:" + class48.field674.field5983 + " psize:" + var23);
                        }
                        class673.field9429 = null;
                    }
                }
            } else if (class600.field8551.method186(1, -116)) {
                class600.field8551.method185(1, class48.field674.field6002, 0, -117);
                class422.field5872 = class48.field674.field6002[0] & 0xFF;
                class373.field5243 = 9;
            }
        } catch (IOException var28) {
            if (class600.field8551 != null) {
                class600.field8551.method183((byte) 88);
                class600.field8551 = null;
            }
            if (class322.field4586 >= 3) {
                class373.field5243 = 0;
                class330.method2010(23708, -4);
                class382.method2310((byte) 27);
            } else {
                if (class591.field8484 == 2) {
                    class472.field6424.method2406(20);
                } else {
                    field3481.method2406(20);
                }
                class296.field4300 = 0;
                class373.field5243 = 1;
                class322.field4586++;
            }
        }
    }
}
