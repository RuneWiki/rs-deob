import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class51 {

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Ljo;")
    private class382 field659 = new class382(64);

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lok;")
    private class74 field657;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lns;")
    public static class62 field651 = new class62(1);

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field660 = new String[100];

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "B")
    public static byte field650;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V", line = 3)
    public final void method378(byte arg0, int arg1) {
        field649++;
        class382 var3 = this.field659;
        synchronized (this.field659) {
            if (arg0 != -9) {
                field658 = -98;
            }
            this.field659.method2294(arg1, true);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BB)V", line = 18)
    public static final void method379(byte arg0, byte arg1) {
        field655++;
        if (class274.field4082 == null) {
            class274.field4082 = new byte[4][class50.field640][class448.field6611];
        }
        int var2 = 0;
        int var3 = 66 % ((arg1 - 30) / 35);
        while (var2 < 4) {
            for (int var4 = 0; var4 < class50.field640; var4++) {
                for (int var5 = 0; var5 < class448.field6611; var5++) {
                    class274.field4082[var2][var4][var5] = arg0;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 56)
    public final void method380(int arg0) {
        class382 var2 = this.field659;
        synchronized (this.field659) {
            if (arg0 <= 18) {
                field650 = 101;
            }
            this.field659.method2293(false);
        }
        field656++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lrm;Lrr;)V", line = 80)
    public static final void method381(class79 arg0, class306 arg1) {
        if (!arg1.field4584) {
            return;
        }
        short var2 = arg1.field4593;
        short var3 = arg1.field4581;
        byte var4 = arg1.field4576;
        byte var5 = arg1.field4583;
        int var6 = (var2 << class9.field75) + class280.field4230;
        int var7 = (var3 << class9.field75) + class280.field4230;
        class306[][] var8 = class236.field3305[var4];
        float var9;
        if (class420.field6281 == class249.field3405) {
            class521.field7669.method140(class213.field3048[0].method718(var6, var7), class471.method2802(var2, var3), class498.method2967(var2, var3), class49.method370(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class521.field7669.method154(3000.0F, var9 * 1.5F);
        if (arg1.field4590) {
            if (class335.field5175) {
                if (var4 > 0) {
                    class306 var10 = class236.field3305[var4 - 1][var2][var3];
                    if (var10 != null && var10.field4584) {
                        return;
                    }
                }
                if (var2 <= class487.field7256 && var2 > class18.field283) {
                    class306 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field4584 && (var11.field4590 || (arg1.field4594 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class487.field7256 && var2 < class407.field6144 - 1) {
                    class306 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field4584 && (var12.field4590 || (arg1.field4594 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class301.field4475 && var3 > class508.field7457) {
                    class306 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field4584 && (var13.field4590 || (arg1.field4594 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class301.field4475 && var3 < class520.field7617 - 1) {
                    class306 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field4584 && (var14.field4590 || (arg1.field4594 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class335.field5175 = true;
            }
            arg1.field4590 = false;
            if (arg1.field4585 != null) {
                class306 var15 = arg1.field4585;
                class521.field7669.method154(3000.0F, (201.5F - (float) (var15.field4583 + 1) * 50.0F) * 1.5F);
                if (!class98.method760(var15.field4583, var2, var3)) {
                    class249.field3405[var15.field4583].method704(var2, var3);
                }
                class512 var16 = var15.field4596;
                if (var16 != null) {
                    if (class358.field5479) {
                        if ((var16.field7502 & arg1.field4591) == 0) {
                            class208.method1351(arg0, var4, var2, var3);
                        } else {
                            class110.method853(arg0, var16.field7502, var5, var2, var3);
                        }
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    var16.method238(class521.field7669, -1);
                }
                for (class17 var17 = var15.field4589; var17 != null; var17 = var17.field281) {
                    class522 var18 = var17.field279;
                    if (var18 != null) {
                        if (class358.field5479) {
                            class208.method1351(arg0, var4, var2, var3);
                            class521.field7669.method114(arg0.field1095, arg0.field1092);
                        }
                        var18.method238(class521.field7669, -1);
                    }
                }
                class521.field7669.method154(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class98.method760(var5, var2, var3);
            if (var19) {
                class249.field3405[var5].method704(var2, var3);
                class259 var20 = arg1.field4577;
                if (var20 != null && var20.field3863) {
                    if (var20.field3853) {
                        class521.field7669.method154(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var21 = var20.method238(class521.field7669, -1);
                    if (var21 != null) {
                        var21.field3982 = var20;
                        var21.field3990 = var4;
                        var21.field3988 = var2;
                        var21.field3986 = var3;
                        class268.field3989.method3094(-2713, var21);
                    }
                    if (var20.field3853) {
                        class521.field7669.method154(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class512 var24 = arg1.field4596;
            class169 var25 = arg1.field4592;
            if (var24 != null || var25 != null) {
                if (class487.field7256 == var2) {
                    var22++;
                } else if (class487.field7256 < var2) {
                    var22 += 2;
                }
                if (class301.field4475 == var3) {
                    var22 += 3;
                } else if (class301.field4475 > var3) {
                    var22 += 6;
                }
                var23 = class311.field4821[var22];
                arg1.field4591 = class49.field626[var22];
            }
            if (var24 != null) {
                if ((var24.field7502 & class390.field5865[var22]) == 0) {
                    arg1.field4580 = 0;
                } else if (var24.field7502 == 16) {
                    arg1.field4580 = 3;
                    arg1.field4578 = class337.field5194[var22];
                    arg1.field4579 = (byte) (3 - arg1.field4578);
                } else if (var24.field7502 == 32) {
                    arg1.field4580 = 6;
                    arg1.field4578 = class29.field424[var22];
                    arg1.field4579 = (byte) (6 - arg1.field4578);
                } else if (var24.field7502 == 64) {
                    arg1.field4580 = 12;
                    arg1.field4578 = class235.field3302[var22];
                    arg1.field4579 = (byte) (12 - arg1.field4578);
                } else {
                    arg1.field4580 = 9;
                    arg1.field4578 = class36.field501[var22];
                    arg1.field4579 = (byte) (9 - arg1.field4578);
                }
                if ((var24.field7502 & var23) != 0 && !class514.method3028(var5, var2, var3, var24.field7502)) {
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var26 = var24.method238(class521.field7669, -1);
                    if (var26 != null) {
                        var26.field3982 = var24;
                        var26.field3990 = var4;
                        var26.field3988 = var2;
                        var26.field3986 = var3;
                        class268.field3989.method3094(-2713, var26);
                    }
                }
                class512 var27 = arg1.field4582;
                if (var27 != null && (var27.field7502 & var23) != 0 && !class514.method3028(var5, var2, var3, var27.field7502)) {
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var28 = var27.method238(class521.field7669, -1);
                    if (var28 != null) {
                        var28.field3982 = var27;
                        var28.field3990 = var4;
                        var28.field3988 = var2;
                        var28.field3986 = var3;
                        class268.field3989.method3094(-2713, var28);
                    }
                }
            }
            if (var25 != null && !class398.method2386(var5, var2, var3, var25.method921((byte) -118))) {
                class169 var29 = arg1.field4586;
                class521.field7669.method154(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field2483 & var23) != 0) {
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var30 = var25.method238(class521.field7669, -1);
                    if (var30 != null) {
                        var30.field3982 = var25;
                        var30.field3990 = var4;
                        var30.field3988 = var2;
                        var30.field3986 = var3;
                        class268.field3989.method3094(-2713, var30);
                    }
                } else if (var25.field2483 == 256) {
                    int var31 = var25.field2487 - class259.field3860;
                    int var32 = var25.field2488 - class263.field3924;
                    int var33 = var25.field2479;
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
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    if (var35 < var34) {
                        class268 var36 = var25.method238(class521.field7669, -1);
                        if (var36 != null) {
                            var36.field3982 = var25;
                            var36.field3990 = var4;
                            var36.field3988 = var2;
                            var36.field3986 = var3;
                            class268.field3989.method3094(-2713, var36);
                        }
                    } else if (var29 != null) {
                        class268 var37 = var29.method238(class521.field7669, -1);
                        if (var37 != null) {
                            var37.field3982 = var29;
                            var37.field3990 = var4;
                            var37.field3988 = var2;
                            var37.field3986 = var3;
                            class268.field3989.method3094(-2713, var37);
                        }
                    }
                }
                class521.field7669.method154(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class259 var38 = arg1.field4577;
                if (var38 != null && !var38.field3863) {
                    if (var38.field3853) {
                        class521.field7669.method154(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var39 = var38.method238(class521.field7669, -1);
                    if (var39 != null) {
                        var39.field3982 = var38;
                        var39.field3990 = var4;
                        var39.field3988 = var2;
                        var39.field3986 = var3;
                        class268.field3989.method3094(-2713, var39);
                    }
                    if (var38.field3853) {
                        class521.field7669.method154(3000.0F, var9 * 1.5F);
                    }
                }
                class202 var40 = arg1.field4588;
                if (var40 != null && !var40.field2941) {
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var41 = var40.method238(class521.field7669, -1);
                    if (var41 != null) {
                        var41.field3982 = var40;
                        var41.field3990 = var4;
                        var41.field3988 = var2;
                        var41.field3986 = var3;
                        class268.field3989.method3094(-2713, var41);
                    }
                }
            }
            byte var42 = arg1.field4594;
            if (var42 != 0) {
                if (var2 < class487.field7256 && (var42 & 0x4) != 0) {
                    class306 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field4584) {
                        class159.field2393.method489(var43, 0);
                    }
                }
                if (var3 < class301.field4475 && (var42 & 0x2) != 0) {
                    class306 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field4584) {
                        class159.field2393.method489(var44, 0);
                    }
                }
                if (var2 > class487.field7256 && (var42 & 0x1) != 0) {
                    class306 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field4584) {
                        class159.field2393.method489(var45, 0);
                    }
                }
                if (var3 > class301.field4475 && (var42 & 0x8) != 0) {
                    class306 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field4584) {
                        class159.field2393.method489(var46, 0);
                    }
                }
            }
        }
        if (arg1.field4580 != 0) {
            boolean var47 = true;
            for (class17 var48 = arg1.field4589; var48 != null; var48 = var48.field281) {
                if (class520.field7642 != var48.field279.field7675 && (var48.field277 & arg1.field4580) == arg1.field4578) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class512 var49 = arg1.field4596;
                if (!class514.method3028(var5, var2, var3, var49.field7502)) {
                    if (class358.field5479) {
                        label682: {
                            if (var49.field7502 >= 16) {
                                int var50 = var2 - class487.field7256;
                                int var51 = var3 - class301.field4475;
                                if (var49.field7502 == 16) {
                                    int var52 = var50 - class280.field4230;
                                    int var53 = class280.field4230 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class167.field2473) {
                                        class208.method1351(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7502 == 32) {
                                    int var54 = class280.field4230 + var50;
                                    int var55 = class280.field4230 + var51;
                                    if (var55 < -var54 && var2 < class445.field6562 && var3 < class167.field2473) {
                                        class208.method1351(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7502 == 64) {
                                    int var56 = class280.field4230 + var50;
                                    int var57 = var51 - class280.field4230;
                                    if (var57 > var56 && var2 < class445.field6562 && var3 > 0) {
                                        class208.method1351(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field7502 == 128) {
                                    int var58 = var50 - class280.field4230;
                                    int var59 = var51 - class280.field4230;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class208.method1351(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class208.method1351(arg0, var4, var2, var3);
                        }
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var60 = var49.method238(class521.field7669, -1);
                    if (var60 != null) {
                        var60.field3982 = var49;
                        var60.field3990 = var4;
                        var60.field3988 = var2;
                        var60.field3986 = var3;
                        class268.field3989.method3094(-2713, var60);
                    }
                }
                arg1.field4580 = 0;
            }
        }
        if (arg1.field4575) {
            try {
                arg1.field4575 = false;
                int var61 = 0;
                label625: for (class17 var62 = arg1.field4589; var62 != null; var62 = var62.field281) {
                    class522 var63 = var62.field279;
                    if (class520.field7642 != var63.field7675) {
                        for (int var64 = var63.field7687; var64 <= var63.field7683; var64++) {
                            for (int var65 = var63.field7676; var65 <= var63.field7673; var65++) {
                                class306 var66 = var8[var64][var65];
                                if (var66.field4590) {
                                    arg1.field4575 = true;
                                    continue label625;
                                }
                                if (var66.field4580 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field7687) {
                                        var67++;
                                    }
                                    if (var64 < var63.field7683) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field7676) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field7673) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field4580) == arg1.field4579) {
                                        arg1.field4575 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class487.field7256 - var63.field7687;
                        int var69 = var63.field7683 - class487.field7256;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class301.field4475 - var63.field7676;
                        int var71 = var63.field7673 - class301.field4475;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field1093[var61] = var63;
                        arg0.field1090[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class522 var75 = arg0.field1093[var74];
                        if (class520.field7642 != var75.field7675) {
                            int var76 = arg0.field1090[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field7681 - class259.field3860;
                                int var78 = var75.field7671 - class263.field3924;
                                int var79 = arg0.field1093[var73].field7681 - class259.field3860;
                                int var80 = arg0.field1093[var73].field7671 - class263.field3924;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class522 var81 = arg0.field1093[var73];
                    var81.field7675 = class520.field7642;
                    if (!class279.method1740(var5, var81.field7687, var81.field7683, var81.field7676, var81.field7673, var81.method236(0))) {
                        if (class358.field5479) {
                            if (var81.field7682 == 0) {
                                class23.method227(arg0, var4, var81.field7687, var81.field7676, var81.field7683, var81.field7673);
                            } else {
                                class208.method1351(arg0, var4, var2, var3);
                                int var82 = var2 - class487.field7256;
                                int var83 = var3 - class301.field4475;
                                if (var81.field7682 == 2) {
                                    if (var83 > -var82) {
                                        class340.method2076(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class340.method2076(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class340.method2076(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class340.method2076(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class521.field7669.method114(arg0.field1095, arg0.field1092);
                        }
                        class268 var84 = var81.method238(class521.field7669, -1);
                        if (var84 != null) {
                            var84.field3982 = var81;
                            var84.field3990 = var4;
                            var84.field3988 = var81.field7687;
                            var84.field3986 = var81.field7676;
                            class268.field3989.method3094(-2713, var84);
                        }
                    }
                    for (int var85 = var81.field7687; var85 <= var81.field7683; var85++) {
                        for (int var86 = var81.field7676; var86 <= var81.field7673; var86++) {
                            class306 var87 = var8[var85][var86];
                            if (var87.field4580 != 0) {
                                class159.field2393.method489(var87, 0);
                            } else if ((var2 != var85 || var3 != var86) && var87.field4584) {
                                class159.field2393.method489(var87, 0);
                            }
                        }
                    }
                }
                if (arg1.field4575) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field4575 = false;
            }
        }
        if (arg1.field4587 != null && (byte) (class269.field3999 & 0xFF) == arg1.field4595) {
            class46 var88 = arg1.field4587;
            int var89 = class249.field3405[var4].method707(var2, var3);
            int var90;
            if (var4 < class349.field5377 - 1) {
                var90 = class249.field3405[var4].method707(var2, var3) - class249.field3405[var4 + 1].method707(var2, var3);
            } else {
                var90 = 0x8 << class9.field75;
            }
            class18.field286.method1308(var6, var89, var7, arg0.field1091);
            int var91 = arg0.field1091[2];
            class18.field286.method1308(var6, var89 - var90, var7, arg0.field1091);
            int var92 = arg0.field1091[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class187.field2750;
            int var96 = class187.field2750 + var94;
            var88.field598 = var95;
            var88.field600 = var96;
            var88.field601 = true;
            class521.field7669.method105(var88);
        }
        if (!arg1.field4584) {
            return;
        }
        if (arg1.field4580 != 0) {
            return;
        }
        if (var2 <= class487.field7256 && var2 > class18.field283) {
            class306 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field4584) {
                return;
            }
        }
        if (var2 >= class487.field7256 && var2 < class407.field6144 - 1) {
            class306 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field4584) {
                return;
            }
        }
        if (var3 <= class301.field4475 && var3 > class508.field7457) {
            class306 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field4584) {
                return;
            }
        }
        if (var3 >= class301.field4475 && var3 < class520.field7617 - 1) {
            class306 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field4584) {
                return;
            }
        }
        arg1.field4584 = false;
        class147.field2219--;
        class202 var101 = arg1.field4588;
        if (var101 != null && var101.field2941) {
            if (class358.field5479) {
                class208.method1351(arg0, var4, var2, var3);
                class521.field7669.method114(arg0.field1095, arg0.field1092);
            }
            class268 var102 = var101.method238(class521.field7669, -1);
            if (var102 != null) {
                var102.field3982 = var101;
                var102.field3990 = var4;
                var102.field3988 = var2;
                var102.field3986 = var3;
                class268.field3989.method3094(-2713, var102);
            }
        }
        if (arg1.field4591 != 0) {
            class169 var103 = arg1.field4592;
            if (var103 != null && !class398.method2386(var5, var2, var3, var103.method921((byte) -124))) {
                if ((var103.field2483 & arg1.field4591) != 0) {
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class268 var104 = var103.method238(class521.field7669, -1);
                    if (var104 != null) {
                        var104.field3982 = var103;
                        var104.field3990 = var4;
                        var104.field3988 = var2;
                        var104.field3986 = var3;
                        class268.field3989.method3094(-2713, var104);
                    }
                } else if (var103.field2483 == 256) {
                    int var105 = var103.field2487 - class259.field3860;
                    int var106 = var103.field2488 - class263.field3924;
                    int var107 = var103.field2479;
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
                    if (class358.field5479) {
                        class208.method1351(arg0, var4, var2, var3);
                        class521.field7669.method114(arg0.field1095, arg0.field1092);
                    }
                    class169 var110 = arg1.field4586;
                    if (var109 > var108) {
                        class268 var111 = var103.method238(class521.field7669, -1);
                        if (var111 != null) {
                            var111.field3982 = var103;
                            var111.field3990 = var4;
                            var111.field3988 = var2;
                            var111.field3986 = var3;
                            class268.field3989.method3094(-2713, var111);
                        }
                    } else if (var110 != null) {
                        class268 var112 = var110.method238(class521.field7669, -1);
                        if (var112 != null) {
                            var112.field3982 = var110;
                            var112.field3990 = var4;
                            var112.field3988 = var2;
                            var112.field3986 = var3;
                            class268.field3989.method3094(-2713, var112);
                        }
                    }
                }
            }
            class512 var113 = arg1.field4596;
            class512 var114 = arg1.field4582;
            if (var114 != null && (var114.field7502 & arg1.field4591) != 0 && !class514.method3028(var5, var2, var3, var114.field7502)) {
                if (class358.field5479) {
                    class110.method853(arg0, var114.field7502, var4, var2, var3);
                    class521.field7669.method114(arg0.field1095, arg0.field1092);
                }
                class268 var115 = var114.method238(class521.field7669, -1);
                if (var115 != null) {
                    var115.field3982 = var114;
                    var115.field3990 = var4;
                    var115.field3988 = var2;
                    var115.field3986 = var3;
                    class268.field3989.method3094(-2713, var115);
                }
            }
            if (var113 != null && (var113.field7502 & arg1.field4591) != 0 && !class514.method3028(var5, var2, var3, var113.field7502)) {
                if (class358.field5479) {
                    class110.method853(arg0, var113.field7502, var4, var2, var3);
                    class521.field7669.method114(arg0.field1095, arg0.field1092);
                }
                class268 var116 = var113.method238(class521.field7669, -1);
                if (var116 != null) {
                    var116.field3982 = var113;
                    var116.field3990 = var4;
                    var116.field3988 = var2;
                    var116.field3986 = var3;
                    class268.field3989.method3094(-2713, var116);
                }
            }
        }
        if (var4 < class349.field5377 - 1) {
            class306 var117 = class236.field3305[var4 + 1][var2][var3];
            if (var117 != null && var117.field4584) {
                class159.field2393.method500(var117, -64);
            }
        }
        if (var2 < class487.field7256) {
            class306 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field4584) {
                class159.field2393.method489(var118, 0);
            }
        }
        if (var3 < class301.field4475) {
            class306 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field4584) {
                class159.field2393.method489(var119, 0);
            }
        }
        if (var2 > class487.field7256) {
            class306 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field4584) {
                class159.field2393.method489(var120, 0);
            }
        }
        if (var3 > class301.field4475) {
            class306 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field4584) {
                class159.field2393.method489(var121, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 1198)
    public static void method382(byte arg0) {
        field651 = null;
        field660 = null;
        if (arg0 <= 44) {
            field660 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lfh;", line = 1214)
    public final class192 method383(int arg0, int arg1) {
        field654++;
        class382 var3 = this.field659;
        class192 var4;
        synchronized (this.field659) {
            var4 = (class192) this.field659.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field657;
        byte[] var6;
        synchronized (this.field657) {
            var6 = this.field657.method541(arg0, arg1, (byte) -122);
        }
        class192 var7 = new class192();
        if (var6 != null) {
            var7.method1280(arg1 ^ 0xFFFFFFDF, new class468(var6));
        }
        class382 var8 = this.field659;
        synchronized (this.field659) {
            this.field659.method2290((long) arg0, var7, 107);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 1241)
    public final void method384(byte arg0) {
        class382 var2 = this.field659;
        synchronized (this.field659) {
            this.field659.method2287(75);
        }
        field653++;
        if (arg0 != -119) {
            this.method384((byte) -48);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIII)V", line = 1260)
    public static final void method385(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field652++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg3 * arg3;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        if (arg2 > -73) {
            field660 = null;
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class94.method740(class306.field4574[arg0], arg4 - arg3, arg3 + arg4, arg5, false);
        int var20 = (arg1 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class94.method740(class306.field4574[var21], var24, var23, arg5, false);
            class94.method740(class306.field4574[var22], var24, var23, arg5, false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 1346)
    public class51(class262 arg0, int arg1, class74 arg2) {
        this.field657 = arg2;
        this.field657.method536(false, 32);
    }
}
