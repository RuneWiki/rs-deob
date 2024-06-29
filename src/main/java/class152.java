import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class152 {

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "B")
    private byte field2759;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[I")
    public static int[] field2763 = new int[64];

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Z")
    public static boolean field2766 = false;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method1203(boolean arg0) {
        class23.method209((byte) 110);
        class159.method1249((byte) 125);
        field2764++;
        class235.method1694(115);
        class134.method1052((byte) -127);
        class137.method1065(-125);
        class321.method2262(-17958);
        class232.method1678(-110);
        class166.method1295(53);
        class17.method150(arg0);
        class183.method1418((byte) -86);
        class310.method2205(55);
        class42.method363((byte) -88);
        class121.method959(-21098);
        class183.method1417(-29744);
        class190.method1444(true);
        class181.method1402((byte) 113);
        if (class283.field5063 != 0) {
            for (int var1 = 0; var1 < class14.field424.length; var1++) {
                class14.field424[var1] = null;
            }
            class292.field5212 = 0;
        }
        class171.method1332(30499);
        class70.method615(123);
        class91.field1715.method1338((byte) -94);
        if (!class97.field1824) {
            ((class237) class27.field656).method1709(true);
        }
        class318.field5578.method1770(-30351);
        class182.field3343.method1183((byte) -120);
        class169.field3060.method1183((byte) -53);
        if (arg0) {
            field2763 = (int[]) null;
        }
        class261.field4653.method1183((byte) -39);
        class317.field5574.method1183((byte) -66);
        class295.field5259.method1183((byte) -62);
        class33.field742.method1183((byte) -96);
        class44.field923.method1183((byte) -56);
        class266.field4799.method1183((byte) -109);
        class42.field887.method1183((byte) -41);
        class78.field1497.method1183((byte) -122);
        class103.field1947.method1183((byte) -76);
        class1.field97.method1338((byte) -113);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)Z", line = 74)
    public static final boolean method1204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2767++;
        long var8 = class102.method861(arg1, arg5 + arg3, arg2 + arg7);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = ((int) var8 & 0x3832D3) >> 20;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class264 var13 = class252.method1808(var12, (byte) 4);
            if (var13.field4708 == -1) {
                int var14 = arg0;
                if (var8 > 0L) {
                    var14 = arg4;
                }
                int[] var15 = class146.field2637;
                int var16 = (52736 - (arg2 * 512)) * 4 + arg5 * 4 + 24624;
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var15[var16] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 1539] = var14;
                    } else if (var11 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var11 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var11 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var11 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else if (!class321.method2259(arg2, 124, arg7, arg3, arg5, var11, var13)) {
                return false;
            }
        }
        long var17 = class184.method1422(arg1, arg5 + arg3, arg2 + arg7);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3207A0) >> 20;
            int var20 = ((int) var17 & 0x7E6D4) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class264 var22 = class252.method1808(var21, (byte) 4);
            if (var22.field4708 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    int[] var24 = class146.field2637;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var25 = (52736 - (arg2 * 512)) * 4 + arg5 * 4 + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1024 + 1] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 1 + 512] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class321.method2259(arg2, 98, arg7, arg3, arg5, var19, var22)) {
                return false;
            }
        }
        long var26 = class266.method1907(arg1, arg5 + arg3, arg2 + arg7);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class264 var30 = class252.method1808(var29, (byte) 4);
            if (var30.field4708 != -1 && !class321.method2259(arg2, 111, arg7, arg3, arg5, var28, var30)) {
                return false;
            }
        }
        if (arg6 < 31) {
            method1203(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V", line = 289)
    public static void method1205(boolean arg0) {
        if (!arg0) {
            field2763 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I", line = 308)
    public final int method1206(byte arg0) {
        if (arg0 == -101) {
            field2761++;
            return (this.field2759 & 0x8) == 8 ? 1 : 0;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 321)
    public class152() {
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I", line = 335)
    public final int method1207(int arg0) {
        int var2 = 10 % ((-arg0 - 42) / 63);
        field2758++;
        return this.field2759 & 0x7;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[II)V", line = 348)
    public static final void method1208(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg0--;
        int var11 = arg2 - 1;
        int var5 = arg4 + var11;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg3[var6] = arg1;
            int var7 = var6 + 1;
            arg3[var7] = arg1;
            int var8 = var7 + 1;
            arg3[var8] = arg1;
            int var9 = var8 + 1;
            arg3[var9] = arg1;
            int var10 = var9 + 1;
            arg3[var10] = arg1;
            int var12 = var10 + 1;
            arg3[var12] = arg1;
            int var13 = var12 + 1;
            arg3[var13] = arg1;
            arg0 = var13 + 1;
            arg3[arg0] = arg1;
        }
        field2757++;
        while (var11 > arg0) {
            arg0++;
            arg3[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V", line = 373)
    public static final void method1209(byte arg0) {
        field2769++;
        class51.method432((byte) -100, false);
        boolean var1 = true;
        class202.field3593 = 0;
        for (int var2 = 0; var2 < class122.field2204.length; var2++) {
            if (class74.field1468[var2] != -1 && class122.field2204[var2] == null) {
                class122.field2204[var2] = class295.field5259.method1192(0, class74.field1468[var2], 0);
                if (class122.field2204[var2] == null) {
                    var1 = false;
                    class202.field3593++;
                }
            }
            if (class28.field676[var2] != -1 && class7.field147[var2] == null) {
                class7.field147[var2] = class295.field5259.method1176(class28.field676[var2], 0, class102.field1911[var2], 1);
                if (class7.field147[var2] == null) {
                    class202.field3593++;
                    var1 = false;
                }
            }
            if (class97.field1824) {
                if (class309.field5488[var2] != -1 && class237.field4133[var2] == null) {
                    class237.field4133[var2] = class295.field5259.method1192(0, class309.field5488[var2], 0);
                    if (class237.field4133[var2] == null) {
                        var1 = false;
                        class202.field3593++;
                    }
                }
                if (class62.field1270[var2] != -1 && class297.field5280[var2] == null) {
                    class297.field5280[var2] = class295.field5259.method1192(0, class62.field1270[var2], 0);
                    if (class297.field5280[var2] == null) {
                        var1 = false;
                        class202.field3593++;
                    }
                }
            }
            if (class226.field3976 != null && class238.field4170[var2] == null && class226.field3976[var2] != -1) {
                class238.field4170[var2] = class295.field5259.method1176(class226.field3976[var2], 0, class102.field1911[var2], 1);
                if (class238.field4170[var2] == null) {
                    var1 = false;
                    class202.field3593++;
                }
            }
        }
        if (class310.field5503 == null) {
            if (class172.field3103 == null || !class326.field5674.method1172((byte) -128, class115.method929(new class279[] { class172.field3103.field896, class294.field5249 }, (byte) 60))) {
                class310.field5503 = new class133(0);
            } else if (class326.field5674.method1163(class115.method929(new class279[] { class172.field3103.field896, class294.field5249 }, (byte) 60), 83)) {
                class310.field5503 = class275.method1947(true, class115.method929(new class279[] { class172.field3103.field896, class294.field5249 }, (byte) 60), class326.field5674);
            } else {
                var1 = false;
                class202.field3593++;
            }
        }
        if (!var1) {
            class311.field5509 = 1;
            return;
        }
        boolean var3 = true;
        class12.field394 = 0;
        for (int var4 = 0; var4 < class122.field2204.length; var4++) {
            byte[] var5 = class7.field147[var4];
            if (var5 != null) {
                int var6 = (class77.field1493[var4] >> 8) * 64 - class112.field2058;
                int var7 = (class77.field1493[var4] & 0xFF) * 64 - class12.field396;
                if (class255.field4554) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class130.method1028(var7, var6, (byte) 97, var5);
            }
            if (class97.field1824) {
                byte[] var8 = class297.field5280[var4];
                if (var8 != null) {
                    int var9 = (class77.field1493[var4] >> 8) * 64 - class112.field2058;
                    int var10 = (class77.field1493[var4] & 0xFF) * 64 - class12.field396;
                    if (class255.field4554) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class130.method1028(var10, var9, (byte) -13, var8);
                }
            }
        }
        if (!var3) {
            class311.field5509 = 2;
            return;
        }
        if (class311.field5509 != 0) {
            class321.method2258(class115.method929(new class279[] { class200.field3575, class297.field5279 }, (byte) 60), true, (byte) -70);
        }
        class35.method309((byte) 73);
        boolean var11 = false;
        method1203(false);
        if (class97.field1824 && class162.field2929) {
            for (int var12 = 0; var12 < class122.field2204.length; var12++) {
                if (class297.field5280[var12] != null || class237.field4133[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class87.method760(4, 104, 104, class97.field1824 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class90.field1702[var13].method981(5);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class257.field4573[var14][var15][var16] = 0;
                }
            }
        }
        class140.method1081(false, 121);
        if (class97.field1824) {
            class160.field2904.method1245();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class160.field2903[var17][var18].field3477 = true;
                }
            }
        }
        if (class97.field1824) {
            class30.method272();
        }
        if (class97.field1824) {
            class34.method306(127);
        }
        class35.method309((byte) 112);
        System.gc();
        class51.method432((byte) -100, true);
        class196.method1466(false, (byte) 20);
        if (!class255.field4554) {
            class233.method1679(false, false);
            class51.method432((byte) -100, true);
            if (class97.field1824) {
                int var19 = class72.field1420.field11[0] >> 3;
                int var20 = class72.field1420.field34[0] >> 3;
                class254.method1817(-46, var19, var20);
            }
            class201.method1495(false, (byte) 127);
            if (class238.field4170 != null) {
                class279.method2000(false);
            }
        }
        if (class255.field4554) {
            class279.method1976((byte) 92, false);
            class51.method432((byte) -100, true);
            if (class97.field1824) {
                int var21 = class72.field1420.field34[0] >> 3;
                int var22 = class72.field1420.field11[0] >> 3;
                class254.method1817(-47, var22, var21);
            }
            class314.method2223(false, false);
        }
        method1203(false);
        class51.method432((byte) -100, true);
        class53.method474(false, class90.field1702, 122);
        if (class97.field1824) {
            class30.method282();
        }
        int var23 = 6 / ((arg0 - 48) / 55);
        class51.method432((byte) -100, true);
        int var24 = class301.field5358;
        if (var24 > class287.field5134) {
            var24 = class287.field5134;
        }
        if (var24 < class287.field5134 - 1) {
            int var25 = class287.field5134 - 1;
        }
        if (class221.method1617((byte) 29)) {
            class139.method1074(0);
        } else {
            class139.method1074(class301.field5358);
        }
        class196.method1465(87);
        if (class97.field1824 && var11) {
            class315.method2232(true);
            class196.method1466(true, (byte) 20);
            if (!class255.field4554) {
                class233.method1679(true, false);
                class51.method432((byte) -100, true);
                class201.method1495(true, (byte) 126);
            }
            if (class255.field4554) {
                class279.method1976((byte) 92, true);
                class51.method432((byte) -100, true);
                class314.method2223(true, false);
            }
            method1203(false);
            class51.method432((byte) -100, true);
            class53.method474(true, class90.field1702, 114);
            class51.method432((byte) -100, true);
            class196.method1465(94);
            class315.method2232(false);
        }
        if (class97.field1824) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    class160.field2903[var26][var27].method1455(class165.field2970[0], var26 * 8, var27 * 8);
                }
            }
        }
        for (int var28 = 0; var28 < 104; var28++) {
            for (int var29 = 0; var29 < 104; var29++) {
                class293.method2086(var29, var28, (byte) 86);
            }
        }
        class74.method641(-122);
        class35.method309((byte) 117);
        class269.method1913(-25088);
        method1203(false);
        class201.field3591 = false;
        if (class5.field115 != null && class202.field3603 != null && class53.field1111 == 25) {
            class98.field1840++;
            class314.field5534.method1634(88, 0);
            class314.field5534.method444((byte) 46, 1057001181);
        }
        if (!class255.field4554) {
            int var30 = (class64.field1312 - 6) / 8;
            int var31 = (class64.field1312 + 6) / 8;
            int var32 = (class274.field4875 - 6) / 8;
            int var33 = (class274.field4875 + 6) / 8;
            for (int var34 = var30 - 1; var34 <= var31 + 1; var34++) {
                for (int var35 = var32 - 1; var35 <= var33 + 1; var35++) {
                    if (var30 > var34 || var31 < var34 || var32 > var35 || var33 < var35) {
                        class295.field5259.method1179(class115.method929(new class279[] { class84.field1598, class191.method1447(5, var34), class229.field3987, class191.method1447(5, var35) }, (byte) 60), (byte) 111);
                        class295.field5259.method1179(class115.method929(new class279[] { class265.field4780, class191.method1447(5, var34), class229.field3987, class191.method1447(5, var35) }, (byte) 60), (byte) 111);
                    }
                }
            }
        }
        if (class53.field1111 == 28) {
            class172.method1343(10, -29401);
        } else {
            class172.method1343(30, -29401);
            if (class202.field3603 != null) {
                class314.field5534.method1634(125, 0);
            }
        }
        class290.method2074(37);
        class35.method309((byte) 99);
        class142.method1092(-127);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lvh;)V", line = 866)
    public class152(class53 arg0) {
        this.field2759 = arg0.method494(false);
        this.field2760 = arg0.method468(28214);
        this.field2765 = arg0.method453(1);
        this.field2768 = arg0.method453(1);
        this.field2762 = arg0.method453(1);
        this.field2756 = arg0.method453(1);
    }
}
