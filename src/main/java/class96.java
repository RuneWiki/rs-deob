import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class96 {

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "B")
    public byte field1440;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lqm;")
    public class96 field1434;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Lff;")
    public static class9 field1449;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Lcu;")
    public static class145 field1455;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "Lsl;")
    public static class317 field1459;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "F")
    public static float field1457;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "Ldf;")
    public static class274 field1460;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Ltk;")
    public static final class228 method682(int arg0) {
        field1435++;
        if (class6.field163 == null || class70.field1049 == null) {
            return null;
        }
        for (class228 var1 = (class228) class70.field1049.method1703(-109); var1 != null; var1 = (class228) class70.field1049.method1703(4)) {
            class460 var2 = class6.field160.method1014(var1.field3078, -22947);
            if (var2 != null && var2.field6347 && var2.method2621(0, class6.field158)) {
                return var1;
            }
        }
        if (arg0 != 256) {
            method691(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIB)Lqm;")
    public final class96 method683(int arg0, int arg1, int arg2, byte arg3) {
        field1453++;
        if (arg3 != 1) {
            method684(-65L, true);
        }
        return new class96(this.field1431, arg0, arg1, arg2, this.field1440);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method684(long arg0, boolean arg1) {
        class392.field5314.setTime(new Date(arg0));
        field1437++;
        int var3 = class392.field5314.get(7);
        if (arg1) {
            method689(null, null);
        }
        int var4 = class392.field5314.get(5);
        int var5 = class392.field5314.get(2);
        int var6 = class392.field5314.get(1);
        int var7 = class392.field5314.get(11);
        int var8 = class392.field5314.get(12);
        int var9 = class392.field5314.get(13);
        return class71.field1081[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class182.field2602[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1442++;
        int var8 = class99.method710(arg0, (byte) -29, class300.field3971, class353.field4777);
        if (arg7 != 5) {
            method689(null, null);
        }
        int var9 = class99.method710(arg3, (byte) -29, class300.field3971, class353.field4777);
        int var10 = class99.method710(arg1, (byte) -29, class71.field1077, class308.field4055);
        int var11 = class99.method710(arg2, (byte) -29, class71.field1077, class308.field4055);
        int var12 = class99.method710(arg0 + arg6, (byte) -29, class300.field3971, class353.field4777);
        int var13 = class99.method710(arg3 - arg6, (byte) -29, class300.field3971, class353.field4777);
        for (int var14 = var8; var14 < var12; var14++) {
            class427.method2465(class457.field6299[var14], var11, var10, -7, arg5);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class427.method2465(class457.field6299[var15], var11, var10, arg7 ^ 0xFFFFFFFC, arg5);
        }
        int var16 = class99.method710(arg1 + arg6, (byte) -29, class71.field1077, class308.field4055);
        int var17 = class99.method710(arg2 - arg6, (byte) -29, class71.field1077, class308.field4055);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class457.field6299[var18];
            class427.method2465(var19, var16, var10, -7, arg5);
            class427.method2465(var19, var17, var16, -7, arg4);
            class427.method2465(var19, var11, var17, -7, arg5);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)Laf;")
    public final class298 method686(byte arg0) {
        if (arg0 < 17) {
            this.field1440 = 17;
        }
        field1433++;
        return class419.method2416(false, this.field1431);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
    public static void method687(byte arg0) {
        field1449 = null;
        field1460 = null;
        if (arg0 == 1) {
            field1455 = null;
            field1459 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lsn;")
    public static final class443 method688(int arg0, int arg1) {
        field1430++;
        if (arg1 != 7892) {
            field1446 = 9;
        }
        class443[] var2 = class211.method1337(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class443 var4 = var2[var3];
            if (var4.field6072 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lbi;Lht;)V")
    public static final void method689(class334 arg0, class409 arg1) {
        if (!arg1.field5629) {
            return;
        }
        short var2 = arg1.field5619;
        short var3 = arg1.field5615;
        byte var4 = arg1.field5608;
        byte var5 = arg1.field5620;
        int var6 = (var2 << class530.field7813) + class497.field6892;
        int var7 = (var3 << class530.field7813) + class497.field6892;
        class409[][] var8 = class497.field6886[var4];
        float var9;
        if (class37.field582 == class141.field2049) {
            class280.field3693.method540(class209.field2868[0].method276(var6, var7), class461.method2626(var2, var3), class157.method1076(var2, var3), class50.method379(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class280.field3693.method568(3000.0F, var9 * 1.5F);
        if (arg1.field5614) {
            if (class23.field413) {
                if (var4 > 0) {
                    class409 var10 = class497.field6886[var4 - 1][var2][var3];
                    if (var10 != null && var10.field5629) {
                        return;
                    }
                }
                if (var2 <= class95.field1428 && var2 > class414.field5728) {
                    class409 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field5629 && (var11.field5614 || (arg1.field5622 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class95.field1428 && var2 < class260.field3439 - 1) {
                    class409 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field5629 && (var12.field5614 || (arg1.field5622 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class259.field3429 && var3 > class65.field1017) {
                    class409 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field5629 && (var13.field5614 || (arg1.field5622 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class259.field3429 && var3 < class380.field5200 - 1) {
                    class409 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field5629 && (var14.field5614 || (arg1.field5622 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class23.field413 = true;
            }
            arg1.field5614 = false;
            if (arg1.field5612 != null) {
                class409 var15 = arg1.field5612;
                class280.field3693.method568(3000.0F, (201.5F - (float) (var15.field5620 + 1) * 50.0F) * 1.5F);
                if (!class92.method667(var15.field5620, var2, var3)) {
                    class141.field2049[var15.field5620].method274(var2, var3);
                }
                class56 var16 = var15.field5627;
                if (var16 != null) {
                    if (class219.field2963) {
                        if ((var16.field880 & arg1.field5621) == 0) {
                            class503.method2873(arg0, var4, var2, var3);
                        } else {
                            class305.method1770(arg0, var16.field880, var5, var2, var3);
                        }
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    var16.method339(9124, class280.field3693);
                }
                for (class165 var17 = var15.field5630; var17 != null; var17 = var17.field2400) {
                    class37 var18 = var17.field2402;
                    if (var18 != null) {
                        if (class219.field2963) {
                            class503.method2873(arg0, var4, var2, var3);
                            class280.field3693.method609(arg0.field4383, arg0.field4380);
                        }
                        var18.method339(9124, class280.field3693);
                    }
                }
                class280.field3693.method568(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class92.method667(var5, var2, var3);
            if (var19) {
                class141.field2049[var5].method274(var2, var3);
                class431 var20 = arg1.field5618;
                if (var20 != null && var20.field5895) {
                    if (var20.field5897) {
                        class280.field3693.method568(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var21 = var20.method339(9124, class280.field3693);
                    if (var21 != null) {
                        var21.field7567 = var20;
                        var21.field7569 = var4;
                        var21.field7566 = var2;
                        var21.field7565 = var3;
                        class232.field3129.method1766((byte) 110, var21);
                    }
                    if (var20.field5897) {
                        class280.field3693.method568(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class56 var24 = arg1.field5627;
            class11 var25 = arg1.field5625;
            if (var24 != null || var25 != null) {
                if (class95.field1428 == var2) {
                    var22++;
                } else if (class95.field1428 < var2) {
                    var22 += 2;
                }
                if (class259.field3429 == var3) {
                    var22 += 3;
                } else if (class259.field3429 > var3) {
                    var22 += 6;
                }
                var23 = class332.field4365[var22];
                arg1.field5621 = class523.field7735[var22];
            }
            if (var24 != null) {
                if ((var24.field880 & class519.field7697[var22]) == 0) {
                    arg1.field5606 = 0;
                } else if (var24.field880 == 16) {
                    arg1.field5606 = 3;
                    arg1.field5611 = class12.field248[var22];
                    arg1.field5609 = (byte) (3 - arg1.field5611);
                } else if (var24.field880 == 32) {
                    arg1.field5606 = 6;
                    arg1.field5611 = class289.field3778[var22];
                    arg1.field5609 = (byte) (6 - arg1.field5611);
                } else if (var24.field880 == 64) {
                    arg1.field5606 = 12;
                    arg1.field5611 = class427.field5831[var22];
                    arg1.field5609 = (byte) (12 - arg1.field5611);
                } else {
                    arg1.field5606 = 9;
                    arg1.field5611 = class302.field3991[var22];
                    arg1.field5609 = (byte) (9 - arg1.field5611);
                }
                if ((var24.field880 & var23) != 0 && !class157.method1078(var5, var2, var3, var24.field880)) {
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var26 = var24.method339(9124, class280.field3693);
                    if (var26 != null) {
                        var26.field7567 = var24;
                        var26.field7569 = var4;
                        var26.field7566 = var2;
                        var26.field7565 = var3;
                        class232.field3129.method1766((byte) 63, var26);
                    }
                }
                class56 var27 = arg1.field5607;
                if (var27 != null && (var27.field880 & var23) != 0 && !class157.method1078(var5, var2, var3, var27.field880)) {
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var28 = var27.method339(9124, class280.field3693);
                    if (var28 != null) {
                        var28.field7567 = var27;
                        var28.field7569 = var4;
                        var28.field7566 = var2;
                        var28.field7565 = var3;
                        class232.field3129.method1766((byte) 46, var28);
                    }
                }
            }
            if (var25 != null && !class382.method2268(var5, var2, var3, var25.method128((byte) 72))) {
                class11 var29 = arg1.field5628;
                class280.field3693.method568(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field238 & var23) != 0) {
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var30 = var25.method339(9124, class280.field3693);
                    if (var30 != null) {
                        var30.field7567 = var25;
                        var30.field7569 = var4;
                        var30.field7566 = var2;
                        var30.field7565 = var3;
                        class232.field3129.method1766((byte) 34, var30);
                    }
                } else if (var25.field238 == 256) {
                    int var31 = var25.field241 - class128.field1868;
                    int var32 = var25.field242 - class427.field5836;
                    int var33 = var25.field244;
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
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    if (var35 < var34) {
                        class514 var36 = var25.method339(9124, class280.field3693);
                        if (var36 != null) {
                            var36.field7567 = var25;
                            var36.field7569 = var4;
                            var36.field7566 = var2;
                            var36.field7565 = var3;
                            class232.field3129.method1766((byte) 25, var36);
                        }
                    } else if (var29 != null) {
                        class514 var37 = var29.method339(9124, class280.field3693);
                        if (var37 != null) {
                            var37.field7567 = var29;
                            var37.field7569 = var4;
                            var37.field7566 = var2;
                            var37.field7565 = var3;
                            class232.field3129.method1766((byte) 96, var37);
                        }
                    }
                }
                class280.field3693.method568(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class431 var38 = arg1.field5618;
                if (var38 != null && !var38.field5895) {
                    if (var38.field5897) {
                        class280.field3693.method568(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var39 = var38.method339(9124, class280.field3693);
                    if (var39 != null) {
                        var39.field7567 = var38;
                        var39.field7569 = var4;
                        var39.field7566 = var2;
                        var39.field7565 = var3;
                        class232.field3129.method1766((byte) 91, var39);
                    }
                    if (var38.field5897) {
                        class280.field3693.method568(3000.0F, var9 * 1.5F);
                    }
                }
                class55 var40 = arg1.field5624;
                if (var40 != null && !var40.field870) {
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var41 = var40.method339(9124, class280.field3693);
                    if (var41 != null) {
                        var41.field7567 = var40;
                        var41.field7569 = var4;
                        var41.field7566 = var2;
                        var41.field7565 = var3;
                        class232.field3129.method1766((byte) 101, var41);
                    }
                }
            }
            byte var42 = arg1.field5622;
            if (var42 != 0) {
                if (var2 < class95.field1428 && (var42 & 0x4) != 0) {
                    class409 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field5629) {
                        class399.field5370.method1042(0, var43);
                    }
                }
                if (var3 < class259.field3429 && (var42 & 0x2) != 0) {
                    class409 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field5629) {
                        class399.field5370.method1042(0, var44);
                    }
                }
                if (var2 > class95.field1428 && (var42 & 0x1) != 0) {
                    class409 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field5629) {
                        class399.field5370.method1042(0, var45);
                    }
                }
                if (var3 > class259.field3429 && (var42 & 0x8) != 0) {
                    class409 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field5629) {
                        class399.field5370.method1042(0, var46);
                    }
                }
            }
        }
        if (arg1.field5606 != 0) {
            boolean var47 = true;
            for (class165 var48 = arg1.field5630; var48 != null; var48 = var48.field2400) {
                if (class39.field603 != var48.field2402.field575 && (var48.field2401 & arg1.field5606) == arg1.field5611) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class56 var49 = arg1.field5627;
                if (!class157.method1078(var5, var2, var3, var49.field880)) {
                    if (class219.field2963) {
                        label682: {
                            if (var49.field880 >= 16) {
                                int var50 = var2 - class95.field1428;
                                int var51 = var3 - class259.field3429;
                                if (var49.field880 == 16) {
                                    int var52 = var50 - class497.field6892;
                                    int var53 = class497.field6892 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class318.field4170) {
                                        class503.method2873(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field880 == 32) {
                                    int var54 = class497.field6892 + var50;
                                    int var55 = class497.field6892 + var51;
                                    if (var55 < -var54 && var2 < class439.field6036 && var3 < class318.field4170) {
                                        class503.method2873(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field880 == 64) {
                                    int var56 = class497.field6892 + var50;
                                    int var57 = var51 - class497.field6892;
                                    if (var57 > var56 && var2 < class439.field6036 && var3 > 0) {
                                        class503.method2873(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field880 == 128) {
                                    int var58 = var50 - class497.field6892;
                                    int var59 = var51 - class497.field6892;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class503.method2873(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class503.method2873(arg0, var4, var2, var3);
                        }
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var60 = var49.method339(9124, class280.field3693);
                    if (var60 != null) {
                        var60.field7567 = var49;
                        var60.field7569 = var4;
                        var60.field7566 = var2;
                        var60.field7565 = var3;
                        class232.field3129.method1766((byte) 27, var60);
                    }
                }
                arg1.field5606 = 0;
            }
        }
        if (arg1.field5626) {
            try {
                arg1.field5626 = false;
                int var61 = 0;
                label625: for (class165 var62 = arg1.field5630; var62 != null; var62 = var62.field2400) {
                    class37 var63 = var62.field2402;
                    if (class39.field603 != var63.field575) {
                        for (int var64 = var63.field581; var64 <= var63.field580; var64++) {
                            for (int var65 = var63.field587; var65 <= var63.field569; var65++) {
                                class409 var66 = var8[var64][var65];
                                if (var66.field5614) {
                                    arg1.field5626 = true;
                                    continue label625;
                                }
                                if (var66.field5606 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field581) {
                                        var67++;
                                    }
                                    if (var64 < var63.field580) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field587) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field569) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field5606) == arg1.field5609) {
                                        arg1.field5626 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class95.field1428 - var63.field581;
                        int var69 = var63.field580 - class95.field1428;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class259.field3429 - var63.field587;
                        int var71 = var63.field569 - class259.field3429;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field4384[var61] = var63;
                        arg0.field4379[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class37 var75 = arg0.field4384[var74];
                        if (class39.field603 != var75.field575) {
                            int var76 = arg0.field4379[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field584 - class128.field1868;
                                int var78 = var75.field574 - class427.field5836;
                                int var79 = arg0.field4384[var73].field584 - class128.field1868;
                                int var80 = arg0.field4384[var73].field574 - class427.field5836;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class37 var81 = arg0.field4384[var73];
                    var81.field575 = class39.field603;
                    if (!class409.method2370(var5, var81.field581, var81.field580, var81.field587, var81.field569, var81.method285((byte) 126))) {
                        if (class219.field2963) {
                            if (var81.field570 == 0) {
                                class49.method370(arg0, var4, var81.field581, var81.field587, var81.field580, var81.field569);
                            } else {
                                class503.method2873(arg0, var4, var2, var3);
                                int var82 = var2 - class95.field1428;
                                int var83 = var3 - class259.field3429;
                                if (var81.field570 == 2) {
                                    if (var83 > -var82) {
                                        class212.method1339(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class212.method1339(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class212.method1339(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class212.method1339(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class280.field3693.method609(arg0.field4383, arg0.field4380);
                        }
                        class514 var84 = var81.method339(9124, class280.field3693);
                        if (var84 != null) {
                            var84.field7567 = var81;
                            var84.field7569 = var4;
                            var84.field7566 = var81.field581;
                            var84.field7565 = var81.field587;
                            class232.field3129.method1766((byte) 127, var84);
                        }
                    }
                    for (int var85 = var81.field581; var85 <= var81.field580; var85++) {
                        for (int var86 = var81.field587; var86 <= var81.field569; var86++) {
                            class409 var87 = var8[var85][var86];
                            if (var87.field5606 != 0) {
                                class399.field5370.method1042(0, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field5629) {
                                class399.field5370.method1042(0, var87);
                            }
                        }
                    }
                }
                if (arg1.field5626) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field5626 = false;
            }
        }
        if (arg1.field5623 != null && (byte) (class73.field1110 & 0xFF) == arg1.field5610) {
            class411 var88 = arg1.field5623;
            int var89 = class141.field2049[var4].method272(var2, var3);
            int var90;
            if (var4 < class508.field7055 - 1) {
                var90 = class141.field2049[var4].method272(var2, var3) - class141.field2049[var4 + 1].method272(var2, var3);
            } else {
                var90 = 0x8 << class530.field7813;
            }
            class64.field1004.method968(var6, var89, var7, arg0.field4385);
            int var91 = arg0.field4385[2];
            class64.field1004.method968(var6, var89 - var90, var7, arg0.field4385);
            int var92 = arg0.field4385[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class354.field4783;
            int var96 = class354.field4783 + var94;
            var88.field5657 = var95;
            var88.field5650 = var96;
            var88.field5649 = true;
            class280.field3693.method582(var88);
        }
        if (!arg1.field5629) {
            return;
        }
        if (arg1.field5606 != 0) {
            return;
        }
        if (var2 <= class95.field1428 && var2 > class414.field5728) {
            class409 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field5629) {
                return;
            }
        }
        if (var2 >= class95.field1428 && var2 < class260.field3439 - 1) {
            class409 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field5629) {
                return;
            }
        }
        if (var3 <= class259.field3429 && var3 > class65.field1017) {
            class409 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field5629) {
                return;
            }
        }
        if (var3 >= class259.field3429 && var3 < class380.field5200 - 1) {
            class409 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field5629) {
                return;
            }
        }
        arg1.field5629 = false;
        class363.field4921--;
        class55 var101 = arg1.field5624;
        if (var101 != null && var101.field870) {
            if (class219.field2963) {
                class503.method2873(arg0, var4, var2, var3);
                class280.field3693.method609(arg0.field4383, arg0.field4380);
            }
            class514 var102 = var101.method339(9124, class280.field3693);
            if (var102 != null) {
                var102.field7567 = var101;
                var102.field7569 = var4;
                var102.field7566 = var2;
                var102.field7565 = var3;
                class232.field3129.method1766((byte) 30, var102);
            }
        }
        if (arg1.field5621 != 0) {
            class11 var103 = arg1.field5625;
            if (var103 != null && !class382.method2268(var5, var2, var3, var103.method128((byte) 73))) {
                if ((var103.field238 & arg1.field5621) != 0) {
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class514 var104 = var103.method339(9124, class280.field3693);
                    if (var104 != null) {
                        var104.field7567 = var103;
                        var104.field7569 = var4;
                        var104.field7566 = var2;
                        var104.field7565 = var3;
                        class232.field3129.method1766((byte) 34, var104);
                    }
                } else if (var103.field238 == 256) {
                    int var105 = var103.field241 - class128.field1868;
                    int var106 = var103.field242 - class427.field5836;
                    int var107 = var103.field244;
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
                    if (class219.field2963) {
                        class503.method2873(arg0, var4, var2, var3);
                        class280.field3693.method609(arg0.field4383, arg0.field4380);
                    }
                    class11 var110 = arg1.field5628;
                    if (var109 > var108) {
                        class514 var111 = var103.method339(9124, class280.field3693);
                        if (var111 != null) {
                            var111.field7567 = var103;
                            var111.field7569 = var4;
                            var111.field7566 = var2;
                            var111.field7565 = var3;
                            class232.field3129.method1766((byte) 46, var111);
                        }
                    } else if (var110 != null) {
                        class514 var112 = var110.method339(9124, class280.field3693);
                        if (var112 != null) {
                            var112.field7567 = var110;
                            var112.field7569 = var4;
                            var112.field7566 = var2;
                            var112.field7565 = var3;
                            class232.field3129.method1766((byte) 123, var112);
                        }
                    }
                }
            }
            class56 var113 = arg1.field5627;
            class56 var114 = arg1.field5607;
            if (var114 != null && (var114.field880 & arg1.field5621) != 0 && !class157.method1078(var5, var2, var3, var114.field880)) {
                if (class219.field2963) {
                    class305.method1770(arg0, var114.field880, var4, var2, var3);
                    class280.field3693.method609(arg0.field4383, arg0.field4380);
                }
                class514 var115 = var114.method339(9124, class280.field3693);
                if (var115 != null) {
                    var115.field7567 = var114;
                    var115.field7569 = var4;
                    var115.field7566 = var2;
                    var115.field7565 = var3;
                    class232.field3129.method1766((byte) 71, var115);
                }
            }
            if (var113 != null && (var113.field880 & arg1.field5621) != 0 && !class157.method1078(var5, var2, var3, var113.field880)) {
                if (class219.field2963) {
                    class305.method1770(arg0, var113.field880, var4, var2, var3);
                    class280.field3693.method609(arg0.field4383, arg0.field4380);
                }
                class514 var116 = var113.method339(9124, class280.field3693);
                if (var116 != null) {
                    var116.field7567 = var113;
                    var116.field7569 = var4;
                    var116.field7566 = var2;
                    var116.field7565 = var3;
                    class232.field3129.method1766((byte) 92, var116);
                }
            }
        }
        if (var4 < class508.field7055 - 1) {
            class409 var117 = class497.field6886[var4 + 1][var2][var3];
            if (var117 != null && var117.field5629) {
                class399.field5370.method1041(var117, 0);
            }
        }
        if (var2 < class95.field1428) {
            class409 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field5629) {
                class399.field5370.method1042(0, var118);
            }
        }
        if (var3 < class259.field3429) {
            class409 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field5629) {
                class399.field5370.method1042(0, var119);
            }
        }
        if (var2 > class95.field1428) {
            class409 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field5629) {
                class399.field5370.method1042(0, var120);
            }
        }
        if (var3 > class259.field3429) {
            class409 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field5629) {
                class399.field5370.method1042(0, var121);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([BIII)I")
    public static final int method690(byte[] arg0, int arg1, int arg2, int arg3) {
        field1452++;
        int var4 = -1;
        if (arg1 != 1) {
            field1446 = -25;
        }
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = class183.field2608[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public static final void method691(boolean arg0) {
        field1443++;
        if (arg0) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class12.field251; var2++) {
            for (int var3 = 0; var3 < class289.field3782; var3++) {
                if (class327.method1894(var3, class497.field6886, (byte) -40, var1, var2, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(IIIIB)V")
    public class96(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1440 = arg4;
        this.field1431 = arg0;
        this.field1451 = arg3;
        this.field1447 = arg1;
        this.field1454 = arg2;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lqm;I)V")
    public class96(class96 arg0, int arg1) {
        this.field1434 = arg0;
        this.field1451 = this.field1434.field1451 + arg1;
        this.field1431 = this.field1434.field1431;
        this.field1440 = this.field1434.field1440;
        this.field1454 = this.field1434.field1454 + arg1;
        this.field1447 = this.field1434.field1447 + arg1;
    }

    static {
        new class304("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field1449 = new class9(87, 3);
        field1455 = new class145(78, 12);
        field1459 = new class317("", 15);
    }
}
