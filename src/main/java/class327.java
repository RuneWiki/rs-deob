import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class327 {

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lig;")
    public static class206 field4717;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lig;")
    public static class206 field4719;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lea;")
    public static class474 field4723;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lkea;")
    public static class203 field4710;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lcq;")
    public static class402 field4720;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[[[Luaa;")
    public static class99[][][] field4722;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZILgea;ZIIILgea;)V")
    public final void method2116(int arg0, boolean arg1, int arg2, class66 arg3, boolean arg4, int arg5, int arg6, int arg7, class66 arg8) {
        field4709++;
        if (arg0 == -1 || !this.method1373()) {
            return;
        }
        class116 var10 = arg3.field726[arg0];
        class575 var11 = var10.field1441;
        class116 var12 = null;
        if (arg8 != null) {
            var12 = arg8.field726[arg6];
            if (var12.field1441 != var11) {
                var12 = null;
            }
        }
        this.method2126(var12, arg5, arg7, arg1, false, var10, (byte) -54, arg2, var11, null, 65535, null);
        this.method1389();
        if (!arg4) {
            method2123(-12, -90, -33, -78, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;)V")
    public abstract void method1371(class364 arg0);

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
    public abstract boolean method1373();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static void method2117(boolean arg0) {
        field4722 = null;
        field4710 = null;
        if (arg0) {
            field4722 = null;
        }
        field4723 = null;
        field4717 = null;
        field4719 = null;
        field4720 = null;
    }

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lw;)Lw;")
    public abstract class252 method1387(class252 arg0);

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
    public abstract void method1350(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lsda;II)V")
    public abstract void method1365(class364 arg0, class219 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
    public abstract int method1375();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[III[IZIIII)V")
    private final void method2118(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = -arg3;
                arg3 = arg7;
                arg7 = var13;
            } else if (arg8 == 3) {
                int var11 = arg3;
                arg3 = arg7;
                arg7 = var11;
            } else if (arg8 == 2) {
                int var12 = arg3;
                arg3 = -arg7 & 0x3FFF;
                arg7 = var12 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg7 = -arg7;
                arg3 = -arg3;
            } else if (arg8 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = arg3;
                arg3 = -arg7;
                arg7 = var16;
            } else if (arg8 == 3) {
                int var14 = arg3;
                arg3 = arg7;
                arg7 = var14;
            } else if (arg8 == 2) {
                int var15 = arg3;
                arg3 = arg7 & 0x3FFF;
                arg7 = -var15 & 0x3FFF;
            }
        }
        field4712++;
        if (arg6 != -21158) {
            method2123(-2, -114, -24, -114, (byte) -88);
        }
        if (arg2 == 65535) {
            this.method1350(arg8, arg4, arg3, arg9, arg7, arg0, arg5);
        } else {
            this.method1356(arg8, arg4, arg3, arg9, arg7, arg5, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lsda;I)V")
    public abstract void method1380(class364 arg0, class219 arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lba;")
    public abstract class327 method1382(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
    public abstract void method1385(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lgea;IZILgea;II[IIIZ)V")
    public final void method2119(class66 arg0, int arg1, boolean arg2, int arg3, class66 arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, boolean arg10) {
        field4718++;
        if (arg5 == -1 || !this.method1373()) {
            return;
        }
        class116 var12 = arg4.field726[arg5];
        class575 var13 = var12.field1441;
        class116 var14 = null;
        if (arg0 != null) {
            var14 = arg0.field726[arg8];
            if (var14.field1441 != var13) {
                var14 = null;
            }
        }
        this.method2126(var14, arg9, arg1, arg2, arg10, var12, (byte) -126, arg3, var13, arg7, arg6, null);
        this.method1389();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lgea;BI)V")
    public final void method2120(class66 arg0, byte arg1, int arg2) {
        field4713++;
        if (arg2 == -1 || !this.method1373()) {
            return;
        }
        if (arg1 < 114) {
            this.method1373();
        }
        class116 var4 = arg0.field726[arg2];
        class575 var5 = var4.field1441;
        for (int var6 = 0; var6 < var4.field1444; var6++) {
            short var7 = var4.field1435[var6];
            if (var5.field8291[var7]) {
                if (var4.field1447[var6] != -1) {
                    this.method1378(0, 0, 0, 0);
                }
                this.method1378(var5.field8293[var7], var4.field1436[var6], var4.field1437[var6], var4.field1449[var6]);
            }
        }
        this.method1389();
    }

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
    public abstract void method1363(int arg0);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
    public abstract void method1369(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
    public abstract void method1378(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
    public abstract void method1354(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lfca;")
    public abstract class75[] method1353();

    @OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILd;Ld;III)V")
    public abstract void method1391(int arg0, int arg1, class132 arg2, class132 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILoa;II)V")
    public static final void method2121(int arg0, class605 arg1, int arg2, int arg3) {
        field4705++;
        if (arg2 < 0 || arg0 < 0 || class157.field1941 == 0 || class343.field4894 == 0) {
            return;
        }
        arg1.method309(class201.field2688, class341.field4865, class157.field1941, class343.field4894);
        arg1.method368(class384.field5787, class426.field6340, class157.field1941, class343.field4894);
        class364 var4 = arg1.method337();
        var4.method2019(class613.field8922, class39.field423, class122.field1523, class156.field1937, class406.field6126, class70.field752);
        arg1.method382(var4);
        if (class544.field7780 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method305();
            int var8 = (arg2 - class201.field2688) * var7 / class157.field1941;
            int var9 = (arg0 - class341.field4865) * var7 / class343.field4894;
            int var10 = arg1.method369();
            int var11 = (arg2 - class201.field2688) * var10 / class157.field1941;
            int var12 = (arg0 - class341.field4865) * var10 / class343.field4894;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method2016(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method2016(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 9;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 9;
                if (var20 > 0 && var22 > 0 && class90.field1032 > var20 && var22 < class30.field349) {
                    int var23 = class439.field6548.field1757;
                    if (var23 < 3 && (class443.field6617[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class544.field7780[var23].method249(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class439.field6548.method1153(true) - 1 << 8) >> 9;
                        var6 = var21 + (class439.field6548.method1153(true) - 1 << 8) >> 9;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class169.field2063 && (class580.field8354 & 0x40) != 0) {
                    class593 var24 = class322.method2103(class238.field3397, false, class405.field6120);
                    if (var24 == null) {
                        class650.method3713(true);
                    } else {
                        class36.method198(true, " ->", -1, class442.field6600, class259.field3692, true, var6, var5, false, 44, 0L);
                    }
                } else {
                    if (class408.field6151 == class184.field2291) {
                        class36.method198(true, "", -1, class358.field5087.method2902(class35.field396, arg3 - 20140), -1, true, var6, var5, false, 23, 0L);
                    }
                    class260.field3698++;
                    class36.method198(true, "", -1, class80.field890, class261.field3713, true, var6, var5, false, 21, 0L);
                }
            }
        }
        class567 var25 = class24.field266;
        class630 var26 = (class630) var25.method3297((byte) 92);
        if (arg3 != 1) {
            field4721 = 57;
        }
        while (var26 != null) {
            if ((class521.field7578 || class439.field6548.field1757 == var26.field9087) && var26.method3609(arg1, arg0, 0, arg2)) {
                label467: {
                    if (var26.field9090 instanceof class655) {
                        class655 var27 = (class655) var26.field9090;
                        int var28 = var27.method1153(true);
                        if ((var28 & 0x1) == 0 && (var27.field1764 & 0x1FF) == 0 && (var27.field1768 & 0x1FF) == 0 || (var28 & 0x1) == 1 && (var27.field1764 & 0x1FF) == 256 && (var27.field1768 & 0x1FF) == 256) {
                            int var29 = var27.field1764 - (var27.method1153(true) - 1 << 8);
                            int var30 = var27.field1768 - (var27.method1153(true) - 1 << 8);
                            for (int var31 = 0; var31 < class387.field5958; var31++) {
                                class411 var38 = (class411) class42.field456.method524((byte) 105, (long) class362.field5141[var31]);
                                if (var38 != null) {
                                    class78 var39 = var38.field6254;
                                    if (class287.field3982 != var39.field2435 && var39.field2448) {
                                        int var40 = var39.field1764 - (var39.field864.field8096 - 1 << 8);
                                        int var41 = var39.field1768 - (var39.field864.field8096 - 1 << 8);
                                        if (var29 <= var40 && var39.field864.field8096 <= (var27.method1153(true) - (var40 - var29 >> 9)) && var41 >= var30 && var39.field864.field8096 <= (var27.method1153(true) - (var41 - var30 >> 9))) {
                                            class646.method3697(-31188, var39, class439.field6548.field1757 != var26.field9087);
                                            var39.field2435 = class287.field3982;
                                        }
                                    }
                                }
                            }
                            int var32 = class88.field1018;
                            int[] var33 = class457.field6839;
                            for (int var34 = 0; var34 < var32; var34++) {
                                class655 var35 = class142.field1749[var33[var34]];
                                if (var35 != null && class287.field3982 != var35.field2435 && var27 != var35 && var35.field2448) {
                                    int var36 = var35.field1764 - (var35.method1153(true) - 1 << 8);
                                    int var37 = var35.field1768 - (var35.method1153(true) - 1 << 8);
                                    if (var29 <= var36 && var35.method1153(true) <= var27.method1153(true) - (var36 - var29 >> 9) && var37 >= var30 && var35.method1153(true) <= var27.method1153(true) - (var37 - var30 >> 9)) {
                                        class650.method3716(class439.field6548.field1757 != var26.field9087, 0, var35);
                                        var35.field2435 = class287.field3982;
                                    }
                                }
                            }
                        }
                        if (class287.field3982 == var27.field2435) {
                            break label467;
                        }
                        class650.method3716(class439.field6548.field1757 != var26.field9087, arg3 - 1, var27);
                        var27.field2435 = class287.field3982;
                    }
                    if (var26.field9090 instanceof class78) {
                        class78 var42 = (class78) var26.field9090;
                        if (var42.field864 != null) {
                            if ((var42.field864.field8096 & 0x1) == 0 && (var42.field1764 & 0x1FF) == 0 && (var42.field1768 & 0x1FF) == 0 || (var42.field864.field8096 & 0x1) == 1 && (var42.field1764 & 0x1FF) == 256 && (var42.field1768 & 0x1FF) == 256) {
                                int var43 = var42.field1764 - (var42.field864.field8096 - 1 << 8);
                                int var44 = var42.field1768 - (var42.field864.field8096 - 1 << 8);
                                for (int var45 = 0; var45 < class387.field5958; var45++) {
                                    class411 var52 = (class411) class42.field456.method524((byte) 124, (long) class362.field5141[var45]);
                                    if (var52 != null) {
                                        class78 var53 = var52.field6254;
                                        if (class287.field3982 != var53.field2435 && var42 != var53 && var53.field2448) {
                                            int var54 = var53.field1764 - (var53.field864.field8096 - 1 << 8);
                                            int var55 = var53.field1768 - (var53.field864.field8096 - 1 << 8);
                                            if (var43 <= var54 && (var42.field864.field8096 - (var54 - var43 >> 9)) >= var53.field864.field8096 && var55 >= var44 && var42.field864.field8096 - (var55 - var44 >> 9) >= var53.field864.field8096) {
                                                class646.method3697(arg3 ^ 0xFFFF862D, var53, class439.field6548.field1757 != var26.field9087);
                                                var53.field2435 = class287.field3982;
                                            }
                                        }
                                    }
                                }
                                int var46 = class88.field1018;
                                int[] var47 = class457.field6839;
                                for (int var48 = 0; var48 < var46; var48++) {
                                    class655 var49 = class142.field1749[var47[var48]];
                                    if (var49 != null && class287.field3982 != var49.field2435 && var49.field2448) {
                                        int var50 = var49.field1764 - (var49.method1153(true) - 1 << 8);
                                        int var51 = var49.field1768 - (var49.method1153(true) - 1 << 8);
                                        if (var50 >= var43 && var49.method1153(true) <= (var42.field864.field8096 - (var50 - var43 >> 9)) && var51 >= var44 && var49.method1153(true) <= var42.field864.field8096 - (var51 - var44 >> 9)) {
                                            class650.method3716(class439.field6548.field1757 != var26.field9087, 0, var49);
                                            var49.field2435 = class287.field3982;
                                        }
                                    }
                                }
                            }
                            if (class287.field3982 == var42.field2435) {
                                break label467;
                            }
                            class646.method3697(arg3 - 31189, var42, class439.field6548.field1757 != var26.field9087);
                            var42.field2435 = class287.field3982;
                        }
                    }
                    if (var26.field9090 instanceof class395) {
                        int var56 = var26.field9092 + class287.field3980;
                        int var57 = class250.field3549 + var26.field9088;
                        class446 var58 = (class446) class294.field4247.method524((byte) 83, (long) (var56 | var26.field9087 << 28 | var57 << 14));
                        if (var58 != null) {
                            for (class236 var59 = (class236) var58.field6669.method711(arg3 ^ 0xFFFF840E); var59 != null; var59 = (class236) var58.field6669.method712((byte) -116)) {
                                class190 var60 = class622.field8999.method25(var59.field3385, arg3 ^ 0xFFFFFFAD);
                                if (class169.field2063 && class439.field6548.field1757 == var26.field9087) {
                                    class403 var61 = class17.field174 == -1 ? null : class565.field8053.method3495(3, class17.field174);
                                    if ((class580.field8354 & 0x1) != 0 && (var61 == null || var60.method1143(var61.field6089, arg3 ^ 0x29D, class17.field174) != var61.field6089)) {
                                        class130.field1625++;
                                        class36.method198(true, class180.field2210 + " -> <col=ff9040>" + var60.field2408, -1, class442.field6600, class259.field3692, true, var26.field9088, var26.field9092, false, 15, (long) var59.field3385);
                                    }
                                }
                                if (class439.field6548.field1757 == var26.field9087) {
                                    String[] var62 = var60.field2410;
                                    for (int var63 = 4; var63 >= 0; var63--) {
                                        if (var62 != null && var62[var63] != null) {
                                            byte var64 = 0;
                                            int var65 = class86.field986;
                                            if (var63 == 0) {
                                                var64 = 12;
                                            }
                                            if (var63 == 1) {
                                                var64 = 59;
                                            }
                                            if (var63 == 2) {
                                                var64 = 51;
                                            }
                                            if (var63 == 3) {
                                                var64 = 11;
                                            }
                                            if (var63 == 4) {
                                                var64 = 30;
                                            }
                                            if (var60.field2384 == var63) {
                                                var65 = var60.field2409;
                                            }
                                            if (var60.field2398 == var63) {
                                                var65 = var60.field2356;
                                            }
                                            field4714++;
                                            class36.method198(true, "<col=ff9040>" + var60.field2408, -1, var62[var63], var65, true, var26.field9088, var26.field9092, false, var64, (long) var59.field3385);
                                        }
                                    }
                                }
                                class36.method198(true, "<col=ff9040>" + var60.field2408, -1, class631.field9106.method2902(class35.field396, -20139), class501.field7291, true, var26.field9088, var26.field9092, class439.field6548.field1757 != var26.field9087, 1010, (long) var59.field3385);
                                class112.field1379++;
                            }
                        }
                    }
                    if (var26.field9090 instanceof class57) {
                        class57 var66 = (class57) var26.field9090;
                        class385 var67 = class575.field8301.method1499(-7532, var66.method89(106));
                        if (var67.field5793 != null) {
                            var67 = var67.method2453(class23.field243, 0);
                        }
                        if (var67 != null) {
                            if (class169.field2063 && class439.field6548.field1757 == var26.field9087) {
                                class403 var68 = class17.field174 == -1 ? null : class565.field8053.method3495(arg3 ^ 0x2, class17.field174);
                                if ((class580.field8354 & 0x4) != 0 && (var68 == null || var67.method2461(109, var68.field6089, class17.field174) != var68.field6089)) {
                                    class613.field8915++;
                                    class36.method198(true, class180.field2210 + " -> <col=00ffff>" + var67.field5815, -1, class442.field6600, class259.field3692, true, var26.field9088, var26.field9092, false, 9, class271.method1775(1, var26.field9092, var26.field9088, var66));
                                }
                            }
                            if (class439.field6548.field1757 == var26.field9087) {
                                String[] var69 = var67.field5871;
                                if (var69 != null) {
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        if (var69[var70] != null) {
                                            short var71 = 0;
                                            int var72 = class86.field986;
                                            if (var70 == 0) {
                                                var71 = 22;
                                            }
                                            if (var70 == 1) {
                                                var71 = 5;
                                            }
                                            if (var70 == 2) {
                                                var71 = 6;
                                            }
                                            if (var70 == 3) {
                                                var71 = 10;
                                            }
                                            if (var70 == 4) {
                                                var71 = 1012;
                                            }
                                            if (var67.field5796 == var70) {
                                                var72 = var67.field5862;
                                            }
                                            if (var67.field5814 == var70) {
                                                var72 = var67.field5845;
                                            }
                                            class494.field7198++;
                                            class36.method198(true, "<col=00ffff>" + var67.field5815, -1, var69[var70], var72, true, var26.field9088, var26.field9092, false, var71, class271.method1775(120, var26.field9092, var26.field9088, var66));
                                        }
                                    }
                                }
                            }
                            class166.field2039++;
                            class36.method198(true, "<col=00ffff>" + var67.field5815, -1, class631.field9106.method2902(class35.field396, -20139), class501.field7291, true, var26.field9088, var26.field9092, class439.field6548.field1757 != var26.field9087, 1008, (long) var67.field5810);
                        }
                    }
                }
            }
            var26 = (class630) var25.method3296((byte) -112);
        }
    }

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
    public abstract void method1399(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Z")
    public static final boolean method2122(int arg0, int arg1) {
        field4716++;
        if (arg1 != 7510) {
            field4717 = null;
        }
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
    public abstract int method1367();

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
    public abstract void method1394(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lba;IIIZ)V")
    public abstract void method1361(class327 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
    public abstract int method1402();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method1401(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
    public abstract void method1376(int arg0);

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
    public abstract void method1396(int arg0);

    @OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
    public abstract int method1379();

    @OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
    public abstract int method1383();

    @OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
    public abstract int method1360();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIB)V")
    public static final void method2123(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 17) {
            method2122(-52, 9);
        }
        if (arg1 < arg2) {
            class645.method3675(121, class402.field6087[arg0], arg3, arg1, arg2);
        } else {
            class645.method3675(91, class402.field6087[arg0], arg3, arg2, arg1);
        }
        field4711++;
    }

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
    public abstract int method1349();

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
    public abstract int method1352();

    @OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
    public abstract void method1351(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lgea;IIILgea;IIIZ[ZLgea;IILgea;Z)V")
    public final void method2124(class66 arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5, int arg6, int arg7, boolean arg8, boolean[] arg9, class66 arg10, int arg11, int arg12, class66 arg13, boolean arg14) {
        field4706++;
        if (arg1 == -1) {
            return;
        }
        if (arg9 == null || arg7 == -1) {
            this.method2116(arg1, arg14, 0, arg13, true, arg2, arg11, arg5, arg0);
        } else if (this.method1373()) {
            class116 var16 = arg13.field726[arg1];
            class575 var17 = var16.field1441;
            class116 var18 = null;
            if (arg0 != null) {
                var18 = arg0.field726[arg11];
                if (var18.field1441 != var17) {
                    var18 = null;
                }
            }
            this.method2126(var18, arg2, arg5, arg14, false, var16, (byte) 106, 0, var17, null, 65535, arg9);
            class116 var19 = arg4.field726[arg7];
            class116 var20 = null;
            if (arg10 != null) {
                var20 = arg10.field726[arg3];
                if (var20.field1441 != var17) {
                    var20 = null;
                }
            }
            this.method1350(0, new int[0], 0, 0, 0, 0, arg14);
            this.method2126(var20, arg6, arg12, arg14, arg8, var19, (byte) -17, 0, var19.field1441, null, 65535, arg9);
            this.method1389();
        }
    }

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
    public abstract void method1357(int arg0);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
    public abstract int method1364();

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
    public abstract void method1372();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method1381(int arg0, int arg1, class364 arg2, boolean arg3);

    @OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1356(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
    public abstract void method1358(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILd;IIIIIII)V")
    public final void method2125(int arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4708++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg1.method249(arg7 + var13, arg3 + var14);
        int var16 = arg8 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg1.method249(arg7 + var16, arg3 + var17);
        int var19 = -arg8 / 2;
        int var20 = arg2 / 2;
        int var21 = arg1.method249(arg7 + var19, arg3 + var20);
        int var22 = arg8 / 2;
        int var23 = arg2 / 2;
        int var24 = arg1.method249(arg7 + var22, arg3 + var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var18 < var24 ? var18 : var24;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg2 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg5 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg5;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (arg5 < var29) {
                        var29 = arg5;
                    }
                }
                this.method1358(var29);
            }
        }
        int var31 = var15 + var24;
        if (~arg8 != arg0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg6 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg6;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg6) {
                        var32 = arg6;
                    }
                }
                this.method1396(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg4;
        if (var34 != 0) {
            this.method1354(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
    public abstract void method1389();

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
    public abstract int method1374();

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()Z")
    public abstract boolean method1393();

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Lgl;")
    public abstract class522[] method1348();

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
    public abstract void method1355();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lmc;IIZZLmc;BILsv;[II[Z)V")
    private final void method2126(class116 arg0, int arg1, int arg2, boolean arg3, boolean arg4, class116 arg5, byte arg6, int arg7, class575 arg8, int[] arg9, int arg10, boolean[] arg11) {
        field4707++;
        if (arg0 == null || arg1 == 0) {
            for (int var39 = 0; var39 < arg5.field1444; var39++) {
                short var40 = arg5.field1435[var39];
                if (arg11 == null || arg11[var40] == arg4 || arg8.field8293[var40] == 0) {
                    short var41 = arg5.field1447[var39];
                    if (var41 != -1) {
                        this.method2118(arg7, arg9, arg8.field8295[var41] & arg10, 0, arg8.field8292[var41], arg3, -21158, 0, 0, 0);
                    }
                    this.method2118(arg7, arg9, arg8.field8295[var40] & arg10, arg5.field1436[var39], arg8.field8292[var40], arg3, -21158, arg5.field1449[var39], arg8.field8293[var40], arg5.field1437[var39]);
                }
            }
            return;
        }
        int var13 = -8 / ((41 - arg6) / 38);
        int var14 = 0;
        int var15 = 0;
        for (int var16 = 0; var16 < arg8.field8298; var16++) {
            boolean var17 = false;
            if (var14 < arg5.field1444 && arg5.field1435[var14] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (arg0.field1444 > var15 && arg0.field1435[var15] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg11 == null || arg11[var16] == arg4 || arg8.field8293[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg8.field8293[var16];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var21 = arg5.field1437[var14];
                        var25 = arg5.field1447[var14];
                        var23 = arg5.field1436[var14];
                        var22 = arg5.field1434[var14];
                        var24 = arg5.field1449[var14];
                        var14++;
                    } else {
                        var21 = var19;
                        var22 = 0;
                        var23 = var19;
                        var24 = var19;
                        var25 = -1;
                    }
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    short var30;
                    if (var18) {
                        var29 = arg0.field1437[var15];
                        var28 = arg0.field1447[var15];
                        var27 = arg0.field1434[var15];
                        var26 = arg0.field1436[var15];
                        var30 = arg0.field1449[var15];
                        var15++;
                    } else {
                        var26 = var19;
                        var27 = 0;
                        var28 = -1;
                        var29 = var19;
                        var30 = var19;
                    }
                    if (var25 != -1) {
                        this.method2118(arg7, arg9, arg10 & arg8.field8295[var25], 0, arg8.field8292[var25], arg3, -21158, 0, 0, 0);
                    } else if (var28 != -1) {
                        this.method2118(arg7, arg9, arg8.field8295[var28] & arg10, 0, arg8.field8292[var28], arg3, -21158, 0, 0, 0);
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var22 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var36 = var24;
                        var35 = var23;
                        var34 = var21;
                    } else if (var20 == 2) {
                        int var31 = var26 - var23 & 0x3FFF;
                        int var32 = var29 - var21 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        int var33 = var30 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        var34 = arg1 * var32 / arg2 + var21 & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var35 = var23 + (arg1 * var31 / arg2) & 0x3FFF;
                        var36 = arg1 * var33 / arg2 + var24 & 0x3FFF;
                    } else if (var20 == 9) {
                        int var38 = var26 - var23 & 0x3FFF;
                        if (var38 >= 8192) {
                            var38 -= 16384;
                        }
                        var35 = arg1 * var38 / arg2 + var23 & 0x3FFF;
                        var36 = 0;
                        var34 = 0;
                    } else if (var20 == 7) {
                        int var37 = var26 - var23 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = (var29 - var21) * arg1 / arg2 + var21;
                        var36 = (var30 - var24) * arg1 / arg2 + var24;
                        var35 = arg1 * var37 / arg2 + var23 & 0x3F;
                    } else {
                        var34 = var21 + ((var29 - var21) * arg1 / arg2);
                        var36 = var24 + ((var30 - var24) * arg1 / arg2);
                        var35 = var23 + ((var26 - var23) * arg1 / arg2);
                    }
                    this.method2118(arg7, arg9, arg8.field8295[var16] & arg10, var35, arg8.field8292[var16], arg3, -21158, var36, var20, var34);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var18) {
                        var15++;
                    }
                }
            }
        }
    }

    static {
        new class474("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field4717 = new class206(20, 3);
        field4719 = new class206(31, 14);
        field4723 = new class474("Discard", "Ablegen", "Jeter", "Descartar");
    }
}
