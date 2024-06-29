import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class315 extends RuntimeException {

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4019;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
    public String field4016;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4015 = new String[5];

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[[I")
    public static int[][] field4018 = new int[128][128];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lkp;")
    public static class340 field4017;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 3)
    public static void method1846(byte arg0) {
        field4015 = null;
        field4018 = null;
        if (arg0 > 96) {
            field4017 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lvh;Lev;)V", line = 17)
    public static final void method1847(class242 arg0, class490 arg1) {
        if (!arg1.field7141) {
            return;
        }
        short var2 = arg1.field7132;
        short var3 = arg1.field7135;
        byte var4 = arg1.field7143;
        byte var5 = arg1.field7140;
        int var6 = (var2 << class94.field1144) + class59.field772;
        int var7 = (var3 << class94.field1144) + class59.field772;
        class490[][] var8 = class125.field1664[var4];
        float var9;
        if (class520.field7520 == class140.field1808) {
            class481.field7025.method357(class531.field7811[0].method396(var6, var7), class297.method1758(var2, var3), class106.method784(var2, var3), class211.method1311(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class481.field7025.method338(3000.0F, var9 * 1.5F);
        if (arg1.field7142) {
            if (class291.field3709) {
                if (var4 > 0) {
                    class490 var10 = class125.field1664[var4 - 1][var2][var3];
                    if (var10 != null && var10.field7141) {
                        return;
                    }
                }
                if (var2 <= class255.field3246 && var2 > class253.field3235) {
                    class490 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field7141 && (var11.field7142 || (arg1.field7123 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class255.field3246 && var2 < class469.field6812 - 1) {
                    class490 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field7141 && (var12.field7142 || (arg1.field7123 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class139.field1797 && var3 > class205.field2680) {
                    class490 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field7141 && (var13.field7142 || (arg1.field7123 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class139.field1797 && var3 < class316.field4043 - 1) {
                    class490 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field7141 && (var14.field7142 || (arg1.field7123 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class291.field3709 = true;
            }
            arg1.field7142 = false;
            if (arg1.field7146 != null) {
                class490 var15 = arg1.field7146;
                class481.field7025.method338(3000.0F, (201.5F - (float) (var15.field7140 + 1) * 50.0F) * 1.5F);
                if (!class452.method2698(var15.field7140, var2, var3)) {
                    class520.field7520[var15.field7140].method393(var2, var3);
                }
                class314 var16 = var15.field7126;
                if (var16 != null) {
                    if (class467.field6749) {
                        if ((var16.field4011 & arg1.field7144) == 0) {
                            class119.method855(arg0, var4, var2, var3);
                        } else {
                            class477.method2905(arg0, var16.field4011, var5, var2, var3);
                        }
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    var16.method181(true, class481.field7025);
                }
                for (class376 var17 = var15.field7127; var17 != null; var17 = var17.field4952) {
                    class205 var18 = var17.field4953;
                    if (var18 != null) {
                        if (class467.field6749) {
                            class119.method855(arg0, var4, var2, var3);
                            class481.field7025.method311(arg0.field3134, arg0.field3137);
                        }
                        var18.method181(true, class481.field7025);
                    }
                }
                class481.field7025.method338(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class452.method2698(var5, var2, var3);
            if (var19) {
                class520.field7520[var5].method393(var2, var3);
                class522 var20 = arg1.field7131;
                if (var20 != null && var20.field7555) {
                    if (var20.field7557) {
                        class481.field7025.method338(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var21 = var20.method181(true, class481.field7025);
                    if (var21 != null) {
                        var21.field7813 = var20;
                        var21.field7809 = var4;
                        var21.field7817 = var2;
                        var21.field7815 = var3;
                        class170.field2183.method2099(var21, 69);
                    }
                    if (var20.field7557) {
                        class481.field7025.method338(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class314 var24 = arg1.field7126;
            class372 var25 = arg1.field7138;
            if (var24 != null || var25 != null) {
                if (class255.field3246 == var2) {
                    var22++;
                } else if (class255.field3246 < var2) {
                    var22 += 2;
                }
                if (class139.field1797 == var3) {
                    var22 += 3;
                } else if (class139.field1797 > var3) {
                    var22 += 6;
                }
                var23 = class395.field5460[var22];
                arg1.field7144 = class291.field3710[var22];
            }
            if (var24 != null) {
                if ((var24.field4011 & class157.field1998[var22]) == 0) {
                    arg1.field7133 = 0;
                } else if (var24.field4011 == 16) {
                    arg1.field7133 = 3;
                    arg1.field7124 = class472.field6840[var22];
                    arg1.field7147 = (byte) (3 - arg1.field7124);
                } else if (var24.field4011 == 32) {
                    arg1.field7133 = 6;
                    arg1.field7124 = class348.field4480[var22];
                    arg1.field7147 = (byte) (6 - arg1.field7124);
                } else if (var24.field4011 == 64) {
                    arg1.field7133 = 12;
                    arg1.field7124 = class125.field1665[var22];
                    arg1.field7147 = (byte) (12 - arg1.field7124);
                } else {
                    arg1.field7133 = 9;
                    arg1.field7124 = class309.field3962[var22];
                    arg1.field7147 = (byte) (9 - arg1.field7124);
                }
                if ((var24.field4011 & var23) != 0 && !class496.method2998(var5, var2, var3, var24.field4011)) {
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var26 = var24.method181(true, class481.field7025);
                    if (var26 != null) {
                        var26.field7813 = var24;
                        var26.field7809 = var4;
                        var26.field7817 = var2;
                        var26.field7815 = var3;
                        class170.field2183.method2099(var26, 73);
                    }
                }
                class314 var27 = arg1.field7130;
                if (var27 != null && (var27.field4011 & var23) != 0 && !class496.method2998(var5, var2, var3, var27.field4011)) {
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var28 = var27.method181(true, class481.field7025);
                    if (var28 != null) {
                        var28.field7813 = var27;
                        var28.field7809 = var4;
                        var28.field7817 = var2;
                        var28.field7815 = var3;
                        class170.field2183.method2099(var28, 102);
                    }
                }
            }
            if (var25 != null && !class403.method2384(var5, var2, var3, var25.method516(true))) {
                class372 var29 = arg1.field7137;
                class481.field7025.method338(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field4826 & var23) != 0) {
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var30 = var25.method181(true, class481.field7025);
                    if (var30 != null) {
                        var30.field7813 = var25;
                        var30.field7809 = var4;
                        var30.field7817 = var2;
                        var30.field7815 = var3;
                        class170.field2183.method2099(var30, 61);
                    }
                } else if (var25.field4826 == 256) {
                    int var31 = var25.field4829 - class309.field3954;
                    int var32 = var25.field4835 - class211.field2718;
                    int var33 = var25.field4834;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    if (var35 < var34) {
                        class531 var36 = var25.method181(true, class481.field7025);
                        if (var36 != null) {
                            var36.field7813 = var25;
                            var36.field7809 = var4;
                            var36.field7817 = var2;
                            var36.field7815 = var3;
                            class170.field2183.method2099(var36, 39);
                        }
                    } else if (var29 != null) {
                        class531 var37 = var29.method181(true, class481.field7025);
                        if (var37 != null) {
                            var37.field7813 = var29;
                            var37.field7809 = var4;
                            var37.field7817 = var2;
                            var37.field7815 = var3;
                            class170.field2183.method2099(var37, 36);
                        }
                    }
                }
                class481.field7025.method338(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class522 var38 = arg1.field7131;
                if (var38 != null && !var38.field7555) {
                    if (var38.field7557) {
                        class481.field7025.method338(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var39 = var38.method181(true, class481.field7025);
                    if (var39 != null) {
                        var39.field7813 = var38;
                        var39.field7809 = var4;
                        var39.field7817 = var2;
                        var39.field7815 = var3;
                        class170.field2183.method2099(var39, 40);
                    }
                    if (var38.field7557) {
                        class481.field7025.method338(3000.0F, var9 * 1.5F);
                    }
                }
                class262 var40 = arg1.field7129;
                if (var40 != null && !var40.field3310) {
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var41 = var40.method181(true, class481.field7025);
                    if (var41 != null) {
                        var41.field7813 = var40;
                        var41.field7809 = var4;
                        var41.field7817 = var2;
                        var41.field7815 = var3;
                        class170.field2183.method2099(var41, 115);
                    }
                }
            }
            byte var42 = arg1.field7123;
            if (var42 != 0) {
                if (var2 < class255.field3246 && (var42 & 0x4) != 0) {
                    class490 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field7141) {
                        class523.field7719.method1419(1911, var43);
                    }
                }
                if (var3 < class139.field1797 && (var42 & 0x2) != 0) {
                    class490 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field7141) {
                        class523.field7719.method1419(1911, var44);
                    }
                }
                if (var2 > class255.field3246 && (var42 & 0x1) != 0) {
                    class490 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field7141) {
                        class523.field7719.method1419(1911, var45);
                    }
                }
                if (var3 > class139.field1797 && (var42 & 0x8) != 0) {
                    class490 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field7141) {
                        class523.field7719.method1419(1911, var46);
                    }
                }
            }
        }
        if (arg1.field7133 != 0) {
            boolean var47 = true;
            for (class376 var48 = arg1.field7127; var48 != null; var48 = var48.field4952) {
                if (class144.field1852 != var48.field4953.field2675 && (var48.field4948 & arg1.field7133) == arg1.field7124) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class314 var49 = arg1.field7126;
                if (!class496.method2998(var5, var2, var3, var49.field4011)) {
                    if (class467.field6749) {
                        label682: {
                            if (var49.field4011 >= 16) {
                                int var50 = var2 - class255.field3246;
                                int var51 = var3 - class139.field1797;
                                if (var49.field4011 == 16) {
                                    int var52 = var50 - class59.field772;
                                    int var53 = class59.field772 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class105.field1336) {
                                        class119.method855(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field4011 == 32) {
                                    int var54 = class59.field772 + var50;
                                    int var55 = class59.field772 + var51;
                                    if (var55 < -var54 && var2 < class470.field6825 && var3 < class105.field1336) {
                                        class119.method855(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field4011 == 64) {
                                    int var56 = class59.field772 + var50;
                                    int var57 = var51 - class59.field772;
                                    if (var57 > var56 && var2 < class470.field6825 && var3 > 0) {
                                        class119.method855(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field4011 == 128) {
                                    int var58 = var50 - class59.field772;
                                    int var59 = var51 - class59.field772;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class119.method855(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class119.method855(arg0, var4, var2, var3);
                        }
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var60 = var49.method181(true, class481.field7025);
                    if (var60 != null) {
                        var60.field7813 = var49;
                        var60.field7809 = var4;
                        var60.field7817 = var2;
                        var60.field7815 = var3;
                        class170.field2183.method2099(var60, 102);
                    }
                }
                arg1.field7133 = 0;
            }
        }
        if (arg1.field7128) {
            try {
                arg1.field7128 = false;
                int var61 = 0;
                label625: for (class376 var62 = arg1.field7127; var62 != null; var62 = var62.field4952) {
                    class205 var63 = var62.field4953;
                    if (class144.field1852 != var63.field2675) {
                        for (int var64 = var63.field2673; var64 <= var63.field2681; var64++) {
                            for (int var65 = var63.field2671; var65 <= var63.field2670; var65++) {
                                class490 var66 = var8[var64][var65];
                                if (var66.field7142) {
                                    arg1.field7128 = true;
                                    continue label625;
                                }
                                if (var66.field7133 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field2673) {
                                        var67++;
                                    }
                                    if (var64 < var63.field2681) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field2671) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field2670) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field7133) == arg1.field7147) {
                                        arg1.field7128 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class255.field3246 - var63.field2673;
                        int var69 = var63.field2681 - class255.field3246;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class139.field1797 - var63.field2671;
                        int var71 = var63.field2670 - class139.field1797;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field3135[var61] = var63;
                        arg0.field3130[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class205 var75 = arg0.field3135[var74];
                        if (class144.field1852 != var75.field2675) {
                            int var76 = arg0.field3130[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field2666 - class309.field3954;
                                int var78 = var75.field2677 - class211.field2718;
                                int var79 = arg0.field3135[var73].field2666 - class309.field3954;
                                int var80 = arg0.field3135[var73].field2677 - class211.field2718;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class205 var81 = arg0.field3135[var73];
                    var81.field2675 = class144.field1852;
                    if (!class208.method1293(var5, var81.field2673, var81.field2681, var81.field2671, var81.field2670, var81.method733(-29382))) {
                        if (class467.field6749) {
                            if (var81.field2668 == 0) {
                                class36.method260(arg0, var4, var81.field2673, var81.field2671, var81.field2681, var81.field2670);
                            } else {
                                class119.method855(arg0, var4, var2, var3);
                                int var82 = var2 - class255.field3246;
                                int var83 = var3 - class139.field1797;
                                if (var81.field2668 == 2) {
                                    if (var83 > -var82) {
                                        class442.method2609(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class442.method2609(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class442.method2609(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class442.method2609(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class481.field7025.method311(arg0.field3134, arg0.field3137);
                        }
                        class531 var84 = var81.method181(true, class481.field7025);
                        if (var84 != null) {
                            var84.field7813 = var81;
                            var84.field7809 = var4;
                            var84.field7817 = var81.field2673;
                            var84.field7815 = var81.field2671;
                            class170.field2183.method2099(var84, 85);
                        }
                    }
                    for (int var85 = var81.field2673; var85 <= var81.field2681; var85++) {
                        for (int var86 = var81.field2671; var86 <= var81.field2670; var86++) {
                            class490 var87 = var8[var85][var86];
                            if (var87.field7133 != 0) {
                                class523.field7719.method1419(1911, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field7141) {
                                class523.field7719.method1419(1911, var87);
                            }
                        }
                    }
                }
                if (arg1.field7128) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field7128 = false;
            }
        }
        if (arg1.field7134 != null && (byte) (class3.field32 & 0xFF) == arg1.field7125) {
            class517 var88 = arg1.field7134;
            int var89 = class520.field7520[var4].method399(var2, var3);
            int var90;
            if (var4 < class524.field7753 - 1) {
                var90 = class520.field7520[var4].method399(var2, var3) - class520.field7520[var4 + 1].method399(var2, var3);
            } else {
                var90 = 0x8 << class94.field1144;
            }
            class443.field6354.method236(var6, var89, var7, arg0.field3136);
            int var91 = arg0.field3136[2];
            class443.field6354.method236(var6, var89 - var90, var7, arg0.field3136);
            int var92 = arg0.field3136[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class6.field59;
            int var96 = class6.field59 + var94;
            var88.field7492 = var95;
            var88.field7491 = var96;
            var88.field7493 = true;
            class481.field7025.method351(var88);
        }
        if (!arg1.field7141) {
            return;
        }
        if (arg1.field7133 != 0) {
            return;
        }
        if (var2 <= class255.field3246 && var2 > class253.field3235) {
            class490 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field7141) {
                return;
            }
        }
        if (var2 >= class255.field3246 && var2 < class469.field6812 - 1) {
            class490 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field7141) {
                return;
            }
        }
        if (var3 <= class139.field1797 && var3 > class205.field2680) {
            class490 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field7141) {
                return;
            }
        }
        if (var3 >= class139.field1797 && var3 < class316.field4043 - 1) {
            class490 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field7141) {
                return;
            }
        }
        arg1.field7141 = false;
        class356.field4584--;
        class262 var101 = arg1.field7129;
        if (var101 != null && var101.field3310) {
            if (class467.field6749) {
                class119.method855(arg0, var4, var2, var3);
                class481.field7025.method311(arg0.field3134, arg0.field3137);
            }
            class531 var102 = var101.method181(true, class481.field7025);
            if (var102 != null) {
                var102.field7813 = var101;
                var102.field7809 = var4;
                var102.field7817 = var2;
                var102.field7815 = var3;
                class170.field2183.method2099(var102, 89);
            }
        }
        if (arg1.field7144 != 0) {
            class372 var103 = arg1.field7138;
            if (var103 != null && !class403.method2384(var5, var2, var3, var103.method516(true))) {
                if ((var103.field4826 & arg1.field7144) != 0) {
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class531 var104 = var103.method181(true, class481.field7025);
                    if (var104 != null) {
                        var104.field7813 = var103;
                        var104.field7809 = var4;
                        var104.field7817 = var2;
                        var104.field7815 = var3;
                        class170.field2183.method2099(var104, 45);
                    }
                } else if (var103.field4826 == 256) {
                    int var105 = var103.field4829 - class309.field3954;
                    int var106 = var103.field4835 - class211.field2718;
                    int var107 = var103.field4834;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class467.field6749) {
                        class119.method855(arg0, var4, var2, var3);
                        class481.field7025.method311(arg0.field3134, arg0.field3137);
                    }
                    class372 var110 = arg1.field7137;
                    if (var109 > var108) {
                        class531 var111 = var103.method181(true, class481.field7025);
                        if (var111 != null) {
                            var111.field7813 = var103;
                            var111.field7809 = var4;
                            var111.field7817 = var2;
                            var111.field7815 = var3;
                            class170.field2183.method2099(var111, 120);
                        }
                    } else if (var110 != null) {
                        class531 var112 = var110.method181(true, class481.field7025);
                        if (var112 != null) {
                            var112.field7813 = var110;
                            var112.field7809 = var4;
                            var112.field7817 = var2;
                            var112.field7815 = var3;
                            class170.field2183.method2099(var112, 54);
                        }
                    }
                }
            }
            class314 var113 = arg1.field7126;
            class314 var114 = arg1.field7130;
            if (var114 != null && (var114.field4011 & arg1.field7144) != 0 && !class496.method2998(var5, var2, var3, var114.field4011)) {
                if (class467.field6749) {
                    class477.method2905(arg0, var114.field4011, var4, var2, var3);
                    class481.field7025.method311(arg0.field3134, arg0.field3137);
                }
                class531 var115 = var114.method181(true, class481.field7025);
                if (var115 != null) {
                    var115.field7813 = var114;
                    var115.field7809 = var4;
                    var115.field7817 = var2;
                    var115.field7815 = var3;
                    class170.field2183.method2099(var115, 37);
                }
            }
            if (var113 != null && (var113.field4011 & arg1.field7144) != 0 && !class496.method2998(var5, var2, var3, var113.field4011)) {
                if (class467.field6749) {
                    class477.method2905(arg0, var113.field4011, var4, var2, var3);
                    class481.field7025.method311(arg0.field3134, arg0.field3137);
                }
                class531 var116 = var113.method181(true, class481.field7025);
                if (var116 != null) {
                    var116.field7813 = var113;
                    var116.field7809 = var4;
                    var116.field7817 = var2;
                    var116.field7815 = var3;
                    class170.field2183.method2099(var116, 116);
                }
            }
        }
        if (var4 < class524.field7753 - 1) {
            class490 var117 = class125.field1664[var4 + 1][var2][var3];
            if (var117 != null && var117.field7141) {
                class523.field7719.method1415(-12933, var117);
            }
        }
        if (var2 < class255.field3246) {
            class490 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field7141) {
                class523.field7719.method1419(1911, var118);
            }
        }
        if (var3 < class139.field1797) {
            class490 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field7141) {
                class523.field7719.method1419(1911, var119);
            }
        }
        if (var2 > class255.field3246) {
            class490 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field7141) {
                class523.field7719.method1419(1911, var120);
            }
        }
        if (var3 > class139.field1797) {
            class490 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field7141) {
                class523.field7719.method1419(1911, var121);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 1146)
    public class315(Throwable arg0, String arg1) {
        this.field4019 = arg0;
        this.field4016 = arg1;
    }
}
