import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class9 extends class161 {

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Lbd;")
    public class37 field109 = new class37();

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "[Lom;")
    public static class209[] field108 = new class209[14];

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field111 = new String[5];

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Z")
    public static boolean field112 = true;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lmo;")
    public static class447 field110;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lkk;Lwe;)V", line = 5)
    public static final void method98(class102 arg0, class232 arg1) {
        if (!arg1.field3883) {
            return;
        }
        short var2 = arg1.field3868;
        short var3 = arg1.field3880;
        byte var4 = arg1.field3874;
        byte var5 = arg1.field3879;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class232[][] var8 = class423.field6252[var4];
        float var10;
        if (class364.field5542 == class275.field4396) {
            int var9 = class381.field5763[var2][var3];
            class67.field847.method659(class181.field2961[0].method771(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class67.field847.method619(3000.0F, var10 * 1.5F);
        if (arg1.field3886) {
            if (class341.field5266) {
                if (var4 > 0) {
                    class232 var11 = class423.field6252[var4 - 1][var2][var3];
                    if (var11 != null && var11.field3883) {
                        return;
                    }
                }
                if (var2 <= class235.field3937 && var2 > class255.field4137) {
                    class232 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field3883 && (var12.field3886 || (arg1.field3876 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class235.field3937 && var2 < class391.field5871 - 1) {
                    class232 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field3883 && (var13.field3886 || (arg1.field3876 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class181.field2959 && var3 > class269.field4315) {
                    class232 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field3883 && (var14.field3886 || (arg1.field3876 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class181.field2959 && var3 < class236.field3952 - 1) {
                    class232 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field3883 && (var15.field3886 || (arg1.field3876 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class341.field5266 = true;
            }
            arg1.field3886 = false;
            if (arg1.field3863 != null) {
                class232 var16 = arg1.field3863;
                class67.field847.method619(3000.0F, (201.5F - (float) (var16.field3879 + 1) * 50.0F) * 1.5F);
                if (!class427.method2649(var16.field3879, var2, var3)) {
                    class275.field4396[var16.field3879].method770(var2, var3);
                }
                class89 var17 = var16.field3873;
                if (var17 != null) {
                    if (class271.field4345) {
                        if ((var17.field1121 & arg1.field3887) == 0) {
                            class306.method2058(arg0, var4, var2, var3);
                        } else {
                            class238.method1686(arg0, var17.field1121, var5, var2, var3);
                        }
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    var17.method189(class67.field847, true);
                }
                for (class247 var18 = var16.field3866; var18 != null; var18 = var18.field4054) {
                    class57 var19 = var18.field4052;
                    if (var19 != null) {
                        if (class271.field4345) {
                            class306.method2058(arg0, var4, var2, var3);
                            class67.field847.method613(arg0.field1422, arg0.field1416);
                        }
                        var19.method189(class67.field847, true);
                    }
                }
                class67.field847.method619(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class427.method2649(var5, var2, var3);
            if (var20) {
                class275.field4396[var5].method770(var2, var3);
                class191 var21 = arg1.field3864;
                if (var21 != null && var21.field3119) {
                    if (var21.field3111) {
                        class67.field847.method619(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var22 = var21.method189(class67.field847, true);
                    if (var22 != null) {
                        var22.field4859 = var21;
                        var22.field4848 = var4;
                        var22.field4855 = var2;
                        var22.field4852 = var3;
                        class449.field6542.method2442(var22, (byte) 121);
                    }
                    if (var21.field3111) {
                        class67.field847.method619(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class89 var25 = arg1.field3873;
            class303 var26 = arg1.field3878;
            if (var25 != null || var26 != null) {
                if (class235.field3937 == var2) {
                    var23++;
                } else if (class235.field3937 < var2) {
                    var23 += 2;
                }
                if (class181.field2959 == var3) {
                    var23 += 3;
                } else if (class181.field2959 > var3) {
                    var23 += 6;
                }
                var24 = class110.field1531[var23];
                arg1.field3887 = class102.field1429[var23];
            }
            if (var25 != null) {
                if ((var25.field1121 & client.field2565[var23]) == 0) {
                    arg1.field3869 = 0;
                } else if (var25.field1121 == 16) {
                    arg1.field3869 = 3;
                    arg1.field3881 = class350.field5417[var23];
                    arg1.field3890 = (byte) (3 - arg1.field3881);
                } else if (var25.field1121 == 32) {
                    arg1.field3869 = 6;
                    arg1.field3881 = class106.field1481[var23];
                    arg1.field3890 = (byte) (6 - arg1.field3881);
                } else if (var25.field1121 == 64) {
                    arg1.field3869 = 12;
                    arg1.field3881 = class161.field2540[var23];
                    arg1.field3890 = (byte) (12 - arg1.field3881);
                } else {
                    arg1.field3869 = 9;
                    arg1.field3881 = class186.field3018[var23];
                    arg1.field3890 = (byte) (9 - arg1.field3881);
                }
                if ((var25.field1121 & var24) != 0 && !class252.method1750(var5, var2, var3, var25.field1121)) {
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var27 = var25.method189(class67.field847, true);
                    if (var27 != null) {
                        var27.field4859 = var25;
                        var27.field4848 = var4;
                        var27.field4855 = var2;
                        var27.field4852 = var3;
                        class449.field6542.method2442(var27, (byte) 127);
                    }
                }
                class89 var28 = arg1.field3872;
                if (var28 != null && (var28.field1121 & var24) != 0 && !class252.method1750(var5, var2, var3, var28.field1121)) {
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var29 = var28.method189(class67.field847, true);
                    if (var29 != null) {
                        var29.field4859 = var28;
                        var29.field4848 = var4;
                        var29.field4855 = var2;
                        var29.field4852 = var3;
                        class449.field6542.method2442(var29, (byte) 124);
                    }
                }
            }
            if (var26 != null && !class252.method1753(var5, var2, var3, var26.method1925(-9990))) {
                class303 var30 = arg1.field3889;
                class67.field847.method619(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field4799 & var24) != 0) {
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var31 = var26.method189(class67.field847, true);
                    if (var31 != null) {
                        var31.field4859 = var26;
                        var31.field4848 = var4;
                        var31.field4855 = var2;
                        var31.field4852 = var3;
                        class449.field6542.method2442(var31, (byte) 113);
                    }
                } else if (var26.field4799 == 256) {
                    int var32 = var26.field4787 - class40.field507;
                    int var33 = var26.field4786 - class379.field5746;
                    int var34 = var26.field4793;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    if (var36 < var35) {
                        class306 var37 = var26.method189(class67.field847, true);
                        if (var37 != null) {
                            var37.field4859 = var26;
                            var37.field4848 = var4;
                            var37.field4855 = var2;
                            var37.field4852 = var3;
                            class449.field6542.method2442(var37, (byte) 111);
                        }
                    } else if (var30 != null) {
                        class306 var38 = var30.method189(class67.field847, true);
                        if (var38 != null) {
                            var38.field4859 = var30;
                            var38.field4848 = var4;
                            var38.field4855 = var2;
                            var38.field4852 = var3;
                            class449.field6542.method2442(var38, (byte) 120);
                        }
                    }
                }
                class67.field847.method619(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class191 var39 = arg1.field3864;
                if (var39 != null && !var39.field3119) {
                    if (var39.field3111) {
                        class67.field847.method619(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var40 = var39.method189(class67.field847, true);
                    if (var40 != null) {
                        var40.field4859 = var39;
                        var40.field4848 = var4;
                        var40.field4855 = var2;
                        var40.field4852 = var3;
                        class449.field6542.method2442(var40, (byte) 123);
                    }
                    if (var39.field3111) {
                        class67.field847.method619(3000.0F, var10 * 1.5F);
                    }
                }
                class101 var41 = arg1.field3860;
                if (var41 != null && !var41.field1409) {
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var42 = var41.method189(class67.field847, true);
                    if (var42 != null) {
                        var42.field4859 = var41;
                        var42.field4848 = var4;
                        var42.field4855 = var2;
                        var42.field4852 = var3;
                        class449.field6542.method2442(var42, (byte) 116);
                    }
                }
            }
            byte var43 = arg1.field3876;
            if (var43 != 0) {
                if (var2 < class235.field3937 && (var43 & 0x4) != 0) {
                    class232 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field3883) {
                        class264.field4255.method434(var44, -29009);
                    }
                }
                if (var3 < class181.field2959 && (var43 & 0x2) != 0) {
                    class232 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field3883) {
                        class264.field4255.method434(var45, -29009);
                    }
                }
                if (var2 > class235.field3937 && (var43 & 0x1) != 0) {
                    class232 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field3883) {
                        class264.field4255.method434(var46, -29009);
                    }
                }
                if (var3 > class181.field2959 && (var43 & 0x8) != 0) {
                    class232 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field3883) {
                        class264.field4255.method434(var47, -29009);
                    }
                }
            }
        }
        if (arg1.field3869 != 0) {
            boolean var48 = true;
            for (class247 var49 = arg1.field3866; var49 != null; var49 = var49.field4054) {
                if (class381.field5764 != var49.field4052.field723 && (var49.field4051 & arg1.field3869) == arg1.field3881) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class89 var50 = arg1.field3873;
                if (!class252.method1750(var5, var2, var3, var50.field1121)) {
                    if (class271.field4345) {
                        label687: {
                            if (var50.field1121 >= 16) {
                                int var51 = var2 - class235.field3937;
                                int var52 = var3 - class181.field2959;
                                if (var50.field1121 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class361.field5513) {
                                        class306.method2058(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field1121 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class156.field2449 && var3 < class361.field5513) {
                                        class306.method2058(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field1121 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class156.field2449 && var3 > 0) {
                                        class306.method2058(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field1121 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class306.method2058(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class306.method2058(arg0, var4, var2, var3);
                        }
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var53 = var50.method189(class67.field847, true);
                    if (var53 != null) {
                        var53.field4859 = var50;
                        var53.field4848 = var4;
                        var53.field4855 = var2;
                        var53.field4852 = var3;
                        class449.field6542.method2442(var53, (byte) 126);
                    }
                }
                arg1.field3869 = 0;
            }
        }
        if (arg1.field3885) {
            try {
                arg1.field3885 = false;
                int var54 = 0;
                label630: for (class247 var55 = arg1.field3866; var55 != null; var55 = var55.field4054) {
                    class57 var56 = var55.field4052;
                    if (class381.field5764 != var56.field723) {
                        for (int var57 = var56.field726; var57 <= var56.field710; var57++) {
                            for (int var58 = var56.field720; var58 <= var56.field711; var58++) {
                                class232 var59 = var8[var57][var58];
                                if (var59.field3886) {
                                    arg1.field3885 = true;
                                    continue label630;
                                }
                                if (var59.field3869 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field726) {
                                        var60++;
                                    }
                                    if (var57 < var56.field710) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field720) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field711) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field3869) == arg1.field3890) {
                                        arg1.field3885 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class235.field3937 - var56.field726;
                        int var62 = var56.field710 - class235.field3937;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class181.field2959 - var56.field720;
                        int var64 = var56.field711 - class181.field2959;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field1419[var54] = var56;
                        arg0.field1415[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class57 var68 = arg0.field1419[var67];
                        if (class381.field5764 != var68.field723) {
                            int var69 = arg0.field1415[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field724 - class40.field507;
                                int var71 = var68.field722 - class379.field5746;
                                int var72 = arg0.field1419[var66].field724 - class40.field507;
                                int var73 = arg0.field1419[var66].field722 - class379.field5746;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class57 var74 = arg0.field1419[var66];
                    var74.field723 = class381.field5764;
                    if (!class424.method2633(var5, var74.field726, var74.field710, var74.field720, var74.field711, var74.method314(27647))) {
                        if (class271.field4345) {
                            if (var74.field712 == 0) {
                                class321.method2130(arg0, var4, var74.field726, var74.field720, var74.field710, var74.field711);
                            } else {
                                class306.method2058(arg0, var4, var2, var3);
                                int var75 = var2 - class235.field3937;
                                int var76 = var3 - class181.field2959;
                                if (var74.field712 == 2) {
                                    if (var76 > -var75) {
                                        class138.method1009(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class138.method1009(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class138.method1009(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class138.method1009(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class67.field847.method613(arg0.field1422, arg0.field1416);
                        }
                        class306 var77 = var74.method189(class67.field847, true);
                        if (var77 != null) {
                            var77.field4859 = var74;
                            var77.field4848 = var4;
                            var77.field4855 = var74.field726;
                            var77.field4852 = var74.field720;
                            class449.field6542.method2442(var77, (byte) 123);
                        }
                    }
                    for (int var78 = var74.field726; var78 <= var74.field710; var78++) {
                        for (int var79 = var74.field720; var79 <= var74.field711; var79++) {
                            class232 var80 = var8[var78][var79];
                            if (var80.field3869 != 0) {
                                class264.field4255.method434(var80, -29009);
                            } else if ((var2 != var78 || var3 != var79) && var80.field3883) {
                                class264.field4255.method434(var80, -29009);
                            }
                        }
                    }
                }
                if (arg1.field3885) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field3885 = false;
            }
        }
        if (arg1.field3865 != null) {
            if ((byte) (class308.field4877 & 0xFF) == arg1.field3875) {
                class198 var81 = arg1.field3865;
                int var82 = class275.field4396[var4].method779(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class275.field4396[var4].method779(var2, var3) - class275.field4396[var4 + 1].method779(var2, var3);
                } else {
                    var83 = 1024;
                }
                class407.field6043.method1996(var6, var82, var7, arg0.field1427);
                int var84 = arg0.field1427[2];
                class407.field6043.method1996(var6, var82 - var83, var7, arg0.field1427);
                int var85 = arg0.field1427[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field3198 = var86;
                var81.field3199 = var87;
                var81.field3197 = true;
                class67.field847.method624(var81);
            } else {
                arg1.field3865 = null;
            }
        }
        if (!arg1.field3883) {
            return;
        }
        if (arg1.field3869 != 0) {
            return;
        }
        if (var2 <= class235.field3937 && var2 > class255.field4137) {
            class232 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field3883) {
                return;
            }
        }
        if (var2 >= class235.field3937 && var2 < class391.field5871 - 1) {
            class232 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field3883) {
                return;
            }
        }
        if (var3 <= class181.field2959 && var3 > class269.field4315) {
            class232 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field3883) {
                return;
            }
        }
        if (var3 >= class181.field2959 && var3 < class236.field3952 - 1) {
            class232 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field3883) {
                return;
            }
        }
        arg1.field3883 = false;
        class7.field95--;
        class101 var92 = arg1.field3860;
        if (var92 != null && var92.field1409) {
            if (class271.field4345) {
                class306.method2058(arg0, var4, var2, var3);
                class67.field847.method613(arg0.field1422, arg0.field1416);
            }
            class306 var93 = var92.method189(class67.field847, true);
            if (var93 != null) {
                var93.field4859 = var92;
                var93.field4848 = var4;
                var93.field4855 = var2;
                var93.field4852 = var3;
                class449.field6542.method2442(var93, (byte) 126);
            }
        }
        if (arg1.field3887 != 0) {
            class303 var94 = arg1.field3878;
            if (var94 != null && !class252.method1753(var5, var2, var3, var94.method1925(-9990))) {
                if ((var94.field4799 & arg1.field3887) != 0) {
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class306 var95 = var94.method189(class67.field847, true);
                    if (var95 != null) {
                        var95.field4859 = var94;
                        var95.field4848 = var4;
                        var95.field4855 = var2;
                        var95.field4852 = var3;
                        class449.field6542.method2442(var95, (byte) 125);
                    }
                } else if (var94.field4799 == 256) {
                    int var96 = var94.field4787 - class40.field507;
                    int var97 = var94.field4786 - class379.field5746;
                    int var98 = var94.field4793;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class271.field4345) {
                        class306.method2058(arg0, var4, var2, var3);
                        class67.field847.method613(arg0.field1422, arg0.field1416);
                    }
                    class303 var101 = arg1.field3889;
                    if (var100 > var99) {
                        class306 var102 = var94.method189(class67.field847, true);
                        if (var102 != null) {
                            var102.field4859 = var94;
                            var102.field4848 = var4;
                            var102.field4855 = var2;
                            var102.field4852 = var3;
                            class449.field6542.method2442(var102, (byte) 122);
                        }
                    } else if (var101 != null) {
                        class306 var103 = var101.method189(class67.field847, true);
                        if (var103 != null) {
                            var103.field4859 = var101;
                            var103.field4848 = var4;
                            var103.field4855 = var2;
                            var103.field4852 = var3;
                            class449.field6542.method2442(var103, (byte) 113);
                        }
                    }
                }
            }
            class89 var104 = arg1.field3873;
            class89 var105 = arg1.field3872;
            if (var105 != null && (var105.field1121 & arg1.field3887) != 0 && !class252.method1750(var5, var2, var3, var105.field1121)) {
                if (class271.field4345) {
                    class238.method1686(arg0, var105.field1121, var4, var2, var3);
                    class67.field847.method613(arg0.field1422, arg0.field1416);
                }
                class306 var106 = var105.method189(class67.field847, true);
                if (var106 != null) {
                    var106.field4859 = var105;
                    var106.field4848 = var4;
                    var106.field4855 = var2;
                    var106.field4852 = var3;
                    class449.field6542.method2442(var106, (byte) 114);
                }
            }
            if (var104 != null && (var104.field1121 & arg1.field3887) != 0 && !class252.method1750(var5, var2, var3, var104.field1121)) {
                if (class271.field4345) {
                    class238.method1686(arg0, var104.field1121, var4, var2, var3);
                    class67.field847.method613(arg0.field1422, arg0.field1416);
                }
                class306 var107 = var104.method189(class67.field847, true);
                if (var107 != null) {
                    var107.field4859 = var104;
                    var107.field4848 = var4;
                    var107.field4855 = var2;
                    var107.field4852 = var3;
                    class449.field6542.method2442(var107, (byte) 116);
                }
            }
        }
        if (var4 < class81.field1006 - 1) {
            class232 var108 = class423.field6252[var4 + 1][var2][var3];
            if (var108 != null && var108.field3883) {
                class264.field4255.method438((byte) -9, var108);
            }
        }
        if (var2 < class235.field3937) {
            class232 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field3883) {
                class264.field4255.method434(var109, -29009);
            }
        }
        if (var3 < class181.field2959) {
            class232 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field3883) {
                class264.field4255.method434(var110, -29009);
            }
        }
        if (var2 > class235.field3937) {
            class232 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field3883) {
                class264.field4255.method434(var111, -29009);
            }
        }
        if (var3 > class181.field2959) {
            class232 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field3883) {
                class264.field4255.method434(var112, -29009);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 1130)
    public static final boolean method99(int arg0, String arg1) {
        if (arg0 != 10) {
            method99(-10, (String) null);
        }
        field113++;
        return class249.method1722(true, 10, arg1, (byte) 122);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V", line = 1159)
    public static void method100(boolean arg0) {
        if (arg0) {
            field111 = null;
        }
        field110 = null;
        field111 = null;
        field108 = null;
    }
}
