import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class114 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lhi;")
    public static class82 field2045 = class95.method664((byte) -98, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lhi;")
    public static class82 field2044 = class95.method664((byte) -26, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lhi;")
    public static class82 field2047 = class95.method664((byte) -128, "brillant2:");

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lhi;")
    private static class82 field2048 = class95.method664((byte) -127, "Loading title screen )2 ");

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lhi;")
    public static class82 field2042 = field2048;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lhi;")
    public static class82 field2050 = class95.method664((byte) -32, "null");

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 63)
    public static void method778(byte arg0) {
        field2042 = null;
        if (arg0 >= -71) {
            field2048 = (class82) null;
        }
        field2047 = null;
        field2050 = null;
        field2045 = null;
        field2044 = null;
        field2048 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILsa;II)V", line = 89)
    public static final void method779(int arg0, class81 arg1, int arg2, int arg3) {
        field2049++;
        if ((arg2 & 0x40) != 0) {
            int var4 = class35.field545.method1068(-13190);
            byte[] var5 = new byte[var4];
            class153 var6 = new class153(var5);
            class35.field545.method1083(var5, 0, var4, (byte) 12);
            class42.field748[arg0] = var6;
            arg1.method524(var6, -13);
        }
        if (arg3 != -11625) {
            method780(56, -50, 101, 67, (int[]) null);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field1715 = class35.field545.method1076(-97);
            int var7 = class35.field545.method1101(255);
            arg1.field1662 = 0;
            arg1.field1688 = (var7 & 0xFFFF) + class212.field3708;
            arg1.field1678 = 0;
            arg1.field1721 = var7 >> 16;
            if (class212.field3708 < arg1.field1688) {
                arg1.field1678 = -1;
            }
            if (arg1.field1715 == 65535) {
                arg1.field1715 = -1;
            }
            if (arg1.field1715 != -1 && class212.field3708 == arg1.field1688) {
                int var8 = class187.method1289(arg1.field1715, (byte) -119).field999;
                if (var8 != -1) {
                    class35 var9 = class284.method1973(var8, false);
                    if (var9 != null && var9.field547 != null) {
                        class205.method1474(var9, class168.field2932 == arg1, 0, arg1.field1685, arg1.field1689, (byte) -115);
                    }
                }
            }
        }
        if ((arg2 & 0x200) != 0) {
            int var10 = class35.field545.method1050(arg3 - 21143);
            int var11 = class35.field545.method1105((byte) -20);
            arg1.method651(false, class212.field3708, var11, var10);
        }
        if ((arg2 & 0x4) != 0) {
            arg1.field1681 = class35.field545.method1078(false);
            arg1.field1726 = class35.field545.method1078(false);
        }
        if ((arg2 & 0x1) != 0) {
            int var12 = class35.field545.method1078(false);
            int var13 = class35.field545.method1072(65280);
            boolean var14 = (var12 & 0x8000) != 0;
            int var15 = class35.field545.method1072(65280);
            int var16 = class35.field545.field2611;
            if (arg1.field1409 != null && arg1.field1404 != null) {
                long var17 = arg1.field1409.method568(22476);
                boolean var19 = false;
                if (var13 <= 1) {
                    if (var14 || (!class82.field1462 || class317.field5437) && !class289.field4864) {
                        for (int var20 = 0; var20 < class171.field2964; var20++) {
                            if (class144.field2458[var20] == var17) {
                                var19 = true;
                                break;
                            }
                        }
                    } else {
                        var19 = true;
                    }
                }
                if (!var19 && class298.field5061 == 0) {
                    class28.field377.field2611 = 0;
                    class35.field545.method1083(class28.field377.field2598, 0, var15, (byte) 121);
                    class28.field377.field2611 = 0;
                    int var21 = -1;
                    class82 var23;
                    if (var14) {
                        class23 var22 = class283.method1966((byte) 26, class28.field377);
                        var12 &= 0x7FFF;
                        var21 = var22.field320;
                        var23 = var22.field318.method1347((byte) -102, class28.field377);
                    } else {
                        var23 = class18.method121(class220.method1559(-118, class28.field377).method567((byte) 20));
                    }
                    arg1.field1725 = var23.method550(-1);
                    arg1.field1661 = var12 & 0xFF;
                    arg1.field1698 = 150;
                    arg1.field1686 = var12 >> 8;
                    if (var13 == 2) {
                        class62.method403(0, class29.method182(-6039, new class82[] { class35.field560, arg1.method517(false) }), (class82) null, var14 ? 17 : 1, var23, var21);
                    } else if (var13 == 1) {
                        class62.method403(0, class29.method182(-6039, new class82[] { class137.field2358, arg1.method517(false) }), (class82) null, var14 ? 17 : 1, var23, var21);
                    } else {
                        class62.method403(0, arg1.method517(false), (class82) null, var14 ? 17 : 2, var23, var21);
                    }
                }
            }
            class35.field545.field2611 = var15 + var16;
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field1683 = class35.field545.method1078(false);
            if (arg1.field1683 == 65535) {
                arg1.field1683 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field1651 = class35.field545.method1072(arg3 ^ 0xFFFF2D97);
            arg1.field1670 = class35.field545.method1082(arg3 + 11519);
            arg1.field1665 = class35.field545.method1068(-13190);
            arg1.field1713 = class35.field545.method1105((byte) -20);
            arg1.field1690 = class35.field545.method1100(-32768) + class212.field3708;
            arg1.field1656 = class35.field545.method1100(-32768) + class212.field3708;
            arg1.field1699 = class35.field545.method1105((byte) -20);
            arg1.field1674 = 1;
            arg1.field1722 = 0;
        }
        if ((arg2 & 0x8) != 0) {
            int var24 = class35.field545.method1050(-32768);
            int var25 = class35.field545.method1072(65280);
            arg1.method651(false, class212.field3708, var25, var24);
            arg1.field1666 = class212.field3708 + 300;
            arg1.field1712 = class35.field545.method1105((byte) -20);
        }
        if ((arg2 & 0x20) != 0) {
            int var26 = class35.field545.method1100(-32768);
            int var27 = class35.field545.method1105((byte) -20);
            if (var26 == 65535) {
                var26 = -1;
            }
            class260.method1857(arg1, var26, var27, true);
        }
        if ((arg2 & 0x10) == 0) {
            return;
        }
        arg1.field1725 = class35.field545.method1092((byte) 118);
        if (arg1.field1725.method551(0, (byte) -116) == 126) {
            arg1.field1725 = arg1.field1725.method558((byte) -66, 1);
            class200.method1406(arg1.method517(false), 2, arg1.field1725, 4);
        } else if (class168.field2932 == arg1) {
            class200.method1406(arg1.method517(false), 2, arg1.field1725, 4);
        }
        arg1.field1686 = 0;
        arg1.field1698 = 150;
        arg1.field1661 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII[I)V", line = 362)
    public static final void method780(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2043++;
        arg1--;
        int var9 = arg2 - 1;
        int var5 = var9 - 7;
        while (arg1 < var5) {
            int var7 = arg1 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var10 = var8 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            int var14 = var13 + 1;
            arg4[var14] = arg3;
            arg1 = var14 + 1;
            arg4[arg1] = arg3;
        }
        int var6 = 72 % ((29 - arg0) / 48);
        while (var9 > arg1) {
            arg1++;
            arg4[arg1] = arg3;
        }
    }
}
