import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class133 extends class145 {

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "[Ljd;")
    public class66[] field3125;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "Lob;")
    public static class99 field3131 = new class99();

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "Ltd;")
    public static class136 field3136 = class145.method1172("Musik)2Engine vorbereitet)3", 45);

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "[I")
    public static int[] field3137 = new int[100];

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "Ltd;")
    public static class136 field3143 = class145.method1172("<col=ffb000>", 45);

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "Lpd;")
    public static class108 field3142;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "Lcd;")
    public static class19 field3140;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "Lmd;")
    public static class87 field3138;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "[[[B")
    public static byte[][][] field3141;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Ltd;")
    public static final class136 method1071(int arg0, byte arg1) {
        field3135++;
        if (arg1 > -79) {
            method1077(-47);
        }
        return arg0 < 999999999 ? class19.method140(arg0, -89) : class88.field2086;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public static final void method1072(byte arg0) {
        class88.field2088 = new class15(32);
        field3130++;
        int var1 = -17 % ((arg0 + 4) / 32);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lmd;Lmd;BLmd;)V")
    public static final void method1073(class87 arg0, class87 arg1, byte arg2, class87 arg3) {
        field3133++;
        if (arg2 != 64) {
            return;
        }
        class90.field2123 = arg3;
        class81.field1936 = arg0;
        class109.field2569 = arg1;
        class94.field2201 = new class74[class109.field2569.method671((byte) 115)][];
        class67.field1427 = new boolean[class109.field2569.method671((byte) 84)];
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)Z")
    private static final boolean method1074(int arg0, byte arg1) {
        if (arg1 != -84) {
            method1072((byte) 1);
        }
        field3127++;
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(IB)Z")
    public final boolean method1075(int arg0, byte arg1) {
        int var3 = -13 % ((arg1 + 40) / 51);
        field3128++;
        return this.field3125[arg0].field1410;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)V")
    public static void method1076(byte arg0) {
        if (arg0 != -46) {
            field3136 = null;
        }
        field3141 = null;
        field3131 = null;
        field3142 = null;
        field3143 = null;
        field3140 = null;
        field3137 = null;
        field3136 = null;
        field3138 = null;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        if (arg0 != -25724) {
            method1076((byte) 79);
        }
        for (class118 var1 = (class118) class18.field363.method107((byte) -115); var1 != null; var1 = (class118) class18.field363.method104(52)) {
            int var2 = var1.field2693;
            if (class91.method688(var2, (byte) -128)) {
                boolean var3 = true;
                class74[] var4 = class94.field2201[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1616;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2090;
                    class74 var7 = class12.method82(var6, (byte) 108);
                    if (var7 != null) {
                        class145.method1173(var7, -4008);
                    }
                }
            }
        }
        field3134++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public static final void method1078(int arg0, int arg1) {
        field3123++;
        if (!class91.method688(arg0, (byte) -127)) {
            return;
        }
        class74[] var2 = class94.field2201[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class74 var4 = var2[var3];
            if (var4 != null) {
                var4.field1634 = 0;
                var4.field1626 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Z")
    public static final boolean method1079(byte arg0, int arg1) {
        if (arg0 < 118) {
            field3142 = null;
        }
        field3124++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[BIIILo;ZII[Lm;I)V")
    public static final void method1080(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class97 arg5, boolean arg6, int arg7, int arg8, class83[] arg9, int arg10) {
        field3132++;
        if (!arg6) {
            return;
        }
        class127 var11 = new class127(arg1);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1027(false);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1027(!arg6);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method1011(67);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg0 == var18 && arg3 <= var17 && arg3 + 8 > var17 && var16 >= arg8 && arg8 + 8 > var16) {
                    class128 var22 = class142.method1154(var12, -100);
                    int var23 = class49.method417(var22.field3076, var16 & 0x7, var22.field3071, var21, 1, arg4, var17 & 0x7) + arg10;
                    int var24 = arg2 + class77.method559(var21, var17 & 0x7, var22.field3071, var22.field3076, (byte) 28, var16 & 0x7, arg4);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg7;
                        class83 var26 = null;
                        if ((class125.field2895[1][var23][var24] & 0x2) == 2) {
                            var25 = arg7 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg9[var25];
                        }
                        class29.method251(var26, arg7, var24, var21 + arg4 & 0x3, var23, true, var12, var20, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lmd;Lmd;IZ)V")
    public class133(class87 arg0, class87 arg1, int arg2, boolean arg3) {
        class69 var5 = new class69();
        int var6 = arg0.method666(0, arg2);
        this.field3125 = new class66[var6];
        int[] var7 = arg0.method651(arg2, -2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method669(var7[var8], arg2, -78);
            class26 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class26 var12 = (class26) var5.method512(0); var12 != null; var12 = (class26) var5.method520((byte) 85)) {
                if (var12.field593 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method670(var11, (byte) 75, 0);
                } else {
                    var13 = arg1.method670(0, (byte) 75, var11);
                }
                var10 = new class26(var11, var13);
                var5.method509(1, var10);
            }
            this.field3125[var7[var8]] = new class66(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lke;IIIIIIII)V")
    public static final void method1081(class74[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class74 var10 = arg0[var9];
            if (var10 != null && (!var10.field1616 || var10.field1690 == 0 || var10.field1606 || class56.method444(var10, arg6 - 29552) != 0 || class39.field903 == var10) && var10.field1628 == arg1 && (!var10.field1616 || !class19.method135(var10, (byte) 107))) {
                int var11 = var10.field1619 + arg7;
                int var12 = var10.field1610 + arg8;
                if (class38.field894 == var10) {
                    class47.field1063 = true;
                    class38.field880 = var11;
                    class99.field2372 = var12;
                }
                int var13;
                int var15;
                int var17;
                int var18;
                if (var10.field1690 == 2) {
                    var18 = arg4;
                    var13 = arg5;
                    var17 = arg2;
                    var15 = arg3;
                } else if (var10.field1690 == 9) {
                    int var19 = var11;
                    int var20 = var11 + var10.field1545;
                    int var21 = var10.field1686 + var12;
                    if (var11 > var20) {
                        var19 = var20;
                        var20 = var11;
                    }
                    var20++;
                    int var23 = var12;
                    var17 = arg2 <= var20 ? arg2 : var20;
                    var13 = arg5 >= var19 ? arg5 : var19;
                    if (var21 < var12) {
                        var23 = var21;
                        var21 = var12;
                    }
                    var21++;
                    var15 = arg3 < var23 ? var23 : arg3;
                    var18 = var21 >= arg4 ? arg4 : var21;
                } else {
                    var13 = var11 <= arg5 ? arg5 : var11;
                    int var14 = var10.field1545 + var11;
                    var15 = var12 > arg3 ? var12 : arg3;
                    int var16 = var10.field1686 + var12;
                    var17 = var14 < arg2 ? var14 : arg2;
                    var18 = arg4 <= var16 ? arg4 : var16;
                }
                if (!var10.field1616 || var17 > var13 && var18 > var15) {
                    if (var10.field1630 == 1337) {
                        class145.method1173(var10, -4008);
                    } else if (var10.field1630 == 1338) {
                        class1.method1(-94, var11, var12);
                    } else {
                        if (var10.field1690 == 0) {
                            if (!var10.field1616 && class19.method135(var10, (byte) 77) && class79.field1821 != var10) {
                                continue;
                            }
                            method1081(arg0, var10.field1663, var17, var15, var18, var13, 29552, var11 - var10.field1677, -var10.field1646 + var12);
                            if (var10.field1688 != null) {
                                method1081(var10.field1688, var10.field1663, var17, var15, var18, var13, 29552, var11 - var10.field1677, var12 - var10.field1646);
                            }
                            class118 var25 = (class118) class18.field363.method109(92, (long) var10.field1663);
                            if (var25 != null) {
                                class1.method5(var15, var13, var11, var25.field2693, var18, var12, -13751, var17);
                            }
                        }
                        if (var10.field1616) {
                            boolean var26;
                            if (class18.field360 >= var13 && class142.field3292 >= var15 && var17 > class18.field360 && var18 > class142.field3292) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            boolean var28 = false;
                            if (class51.field1155 == 1 && class146.field3379 >= var13 && class8.field142 >= var15 && class146.field3379 < var17 && var18 > class8.field142) {
                                var28 = true;
                            }
                            if (field3139 == 1 && var26) {
                                var27 = true;
                            }
                            if (var28) {
                                class147.method1184(arg6 - 29552, class8.field142 - var12, var10, class146.field3379 - var11);
                            }
                            if (class38.field894 != null && class38.field894 != var10 && var26 && method1074(class56.method444(var10, arg6 ^ 0x7370), (byte) -84)) {
                                class13.field261 = var10;
                            }
                            if (class39.field903 == var10) {
                                class122.field2839 = var11;
                                class11.field188 = true;
                                class128.field3084 = var12;
                            }
                            if (var10.field1606) {
                                if (var26 && class83.field1975 != 0 && var10.field1615 != null) {
                                    class139 var29 = new class139();
                                    var29.field3244 = var10.field1615;
                                    var29.field3222 = var10;
                                    var29.field3223 = class83.field1975;
                                    class127.field3017.method509(1, var29);
                                }
                                if (class38.field894 != null || class96.field2267) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var10.field1624 && var28) {
                                    var10.field1624 = true;
                                    if (var10.field1621 != null) {
                                        class139 var30 = new class139();
                                        var30.field3222 = var10;
                                        var30.field3244 = var10.field1621;
                                        var30.field3240 = class146.field3379 - var11;
                                        var30.field3223 = class8.field142 - var12;
                                        class127.field3017.method509(arg6 - 29551, var30);
                                    }
                                }
                                if (var10.field1624 && var27 && var10.field1579 != null) {
                                    class139 var31 = new class139();
                                    var31.field3223 = class142.field3292 - var12;
                                    var31.field3244 = var10.field1579;
                                    var31.field3240 = class18.field360 - var11;
                                    var31.field3222 = var10;
                                    class127.field3017.method509(1, var31);
                                }
                                if (var10.field1624 && !var27) {
                                    var10.field1624 = false;
                                    if (var10.field1548 != null) {
                                        class139 var32 = new class139();
                                        var32.field3244 = var10.field1548;
                                        var32.field3222 = var10;
                                        var32.field3223 = class142.field3292 - var12;
                                        var32.field3240 = class18.field360 - var11;
                                        class143.field3326.method509(arg6 ^ 0x7371, var32);
                                    }
                                }
                                if (var27 && var10.field1684 != null) {
                                    class139 var33 = new class139();
                                    var33.field3222 = var10;
                                    var33.field3240 = class18.field360 - var11;
                                    var33.field3223 = class142.field3292 - var12;
                                    var33.field3244 = var10.field1684;
                                    class127.field3017.method509(1, var33);
                                }
                                if (!var10.field1671 && var26) {
                                    var10.field1671 = true;
                                    if (var10.field1588 != null) {
                                        class139 var34 = new class139();
                                        var34.field3244 = var10.field1588;
                                        var34.field3222 = var10;
                                        var34.field3223 = class142.field3292 - var12;
                                        var34.field3240 = class18.field360 - var11;
                                        class127.field3017.method509(1, var34);
                                    }
                                }
                                if (var10.field1671 && var26 && var10.field1571 != null) {
                                    class139 var35 = new class139();
                                    var35.field3240 = class18.field360 - var11;
                                    var35.field3222 = var10;
                                    var35.field3223 = class142.field3292 - var12;
                                    var35.field3244 = var10.field1571;
                                    class127.field3017.method509(1, var35);
                                }
                                if (var10.field1671 && !var26) {
                                    var10.field1671 = false;
                                    if (var10.field1561 != null) {
                                        class139 var36 = new class139();
                                        var36.field3223 = class142.field3292 - var12;
                                        var36.field3244 = var10.field1561;
                                        var36.field3222 = var10;
                                        var36.field3240 = class18.field360 - var11;
                                        class143.field3326.method509(1, var36);
                                    }
                                }
                                if (var10.field1584 != null) {
                                    class139 var37 = new class139();
                                    var37.field3244 = var10.field1584;
                                    var37.field3222 = var10;
                                    class37.field872.method509(1, var37);
                                }
                                if (var10.field1683 != null && var10.field1587 < class18.field370) {
                                    if (var10.field1674 == null || class18.field370 - var10.field1587 > 32) {
                                        class139 var42 = new class139();
                                        var42.field3244 = var10.field1683;
                                        var42.field3222 = var10;
                                        class127.field3017.method509(arg6 - 29551, var42);
                                    } else {
                                        label392: for (int var38 = var10.field1587; var38 < class18.field370; var38++) {
                                            int var39 = class155.field3562[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field1674.length; var40++) {
                                                if (var10.field1674[var40] == var39) {
                                                    class139 var41 = new class139();
                                                    var41.field3244 = var10.field1683;
                                                    var41.field3222 = var10;
                                                    class127.field3017.method509(arg6 ^ 0x7371, var41);
                                                    break label392;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1587 = class18.field370;
                                }
                                if (var10.field1549 != null && var10.field1562 < class107.field2528) {
                                    if (var10.field1665 == null || class107.field2528 - var10.field1562 > 32) {
                                        class139 var47 = new class139();
                                        var47.field3222 = var10;
                                        var47.field3244 = var10.field1549;
                                        class127.field3017.method509(1, var47);
                                    } else {
                                        label368: for (int var43 = var10.field1562; var43 < class107.field2528; var43++) {
                                            int var44 = class3.field52[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field1665.length; var45++) {
                                                if (var10.field1665[var45] == var44) {
                                                    class139 var46 = new class139();
                                                    var46.field3222 = var10;
                                                    var46.field3244 = var10.field1549;
                                                    class127.field3017.method509(1, var46);
                                                    break label368;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1562 = class107.field2528;
                                }
                                if (var10.field1639 != null && var10.field1627 < client.field456) {
                                    if (var10.field1637 == null || client.field456 - var10.field1627 > 32) {
                                        class139 var52 = new class139();
                                        var52.field3244 = var10.field1639;
                                        var52.field3222 = var10;
                                        class127.field3017.method509(arg6 - 29551, var52);
                                    } else {
                                        label344: for (int var48 = var10.field1627; var48 < client.field456; var48++) {
                                            int var49 = class7.field133[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field1637.length; var50++) {
                                                if (var10.field1637[var50] == var49) {
                                                    class139 var51 = new class139();
                                                    var51.field3244 = var10.field1639;
                                                    var51.field3222 = var10;
                                                    class127.field3017.method509(1, var51);
                                                    break label344;
                                                }
                                            }
                                        }
                                    }
                                    var10.field1627 = client.field456;
                                }
                                if (var10.field1576 < class127.field3022 && var10.field1603 != null) {
                                    class139 var53 = new class139();
                                    var53.field3222 = var10;
                                    var53.field3244 = var10.field1603;
                                    class127.field3017.method509(1, var53);
                                }
                                if (class154.field3522 > var10.field1576 && var10.field1560 != null) {
                                    class139 var54 = new class139();
                                    var54.field3222 = var10;
                                    var54.field3244 = var10.field1560;
                                    class127.field3017.method509(1, var54);
                                }
                                if (var10.field1576 < class74.field1585 && var10.field1636 != null) {
                                    class139 var55 = new class139();
                                    var55.field3222 = var10;
                                    var55.field3244 = var10.field1636;
                                    class127.field3017.method509(1, var55);
                                }
                                if (class81.field1918 > var10.field1576 && var10.field1550 != null) {
                                    class139 var56 = new class139();
                                    var56.field3244 = var10.field1550;
                                    var56.field3222 = var10;
                                    class127.field3017.method509(arg6 ^ 0x7371, var56);
                                }
                                var10.field1576 = class67.field1423;
                                if (var10.field1597 != null) {
                                    for (int var57 = 0; var57 < class143.field3307; var57++) {
                                        class139 var58 = new class139();
                                        var58.field3222 = var10;
                                        var58.field3249 = class76.field1719[var57];
                                        var58.field3239 = class147.field3414[var57];
                                        var58.field3244 = var10.field1597;
                                        class127.field3017.method509(arg6 ^ 0x7371, var58);
                                    }
                                }
                            }
                        }
                        if (!var10.field1616) {
                            if ((var10.field1672 >= 0 || var10.field1645 != 0) && class18.field360 >= var13 && var15 <= class142.field3292 && var17 > class18.field360 && class142.field3292 < var18) {
                                if (var10.field1672 >= 0) {
                                    class79.field1821 = arg0[var10.field1672];
                                } else {
                                    class79.field1821 = var10;
                                }
                            }
                            if (var10.field1690 == 8 && class18.field360 >= var13 && var15 <= class142.field3292 && var17 > class18.field360 && var18 > class142.field3292) {
                                class94.field2203 = var10;
                            }
                            if (var10.field1686 < var10.field1638) {
                                class145.method1175(var10.field1686, (byte) 16, var10, var10.field1638, class142.field3292, class18.field360, var12, var10.field1545 + var11);
                            }
                        }
                    }
                }
            }
        }
        field3129++;
        if (arg6 != 29552) {
            method1073(null, null, (byte) 52, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZB)V")
    public static final void method1082(boolean arg0, byte arg1) {
        field3126++;
        class21.method155(121);
        class119.field2711++;
        if (class119.field2711 < 50 && !arg0) {
            return;
        }
        class119.field2711 = 0;
        if (!class155.field3611 && field3140 != null) {
            class15.field304.method867(132, true);
            try {
                field3140.method145(class15.field304.field2995, -6660, class15.field304.field2960, 0);
                class15.field304.field2995 = 0;
            } catch (IOException var2) {
                class155.field3611 = true;
            }
            class142.field3297++;
        }
        if (arg1 < 50) {
            method1072((byte) 80);
        }
    }
}
