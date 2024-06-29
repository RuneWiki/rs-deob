import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class243 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
    public static boolean field4243 = false;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lda;")
    public static class275 field4246 = class255.method1672(117, "Clientscript error in: ");

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lda;")
    public static class275 field4250 = class255.method1672(108, "scape main");

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIIII)V")
    public static final void method1585(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 52) {
            return;
        }
        field4244++;
        if (arg1 <= arg3) {
            class36.method216(class19.field280[arg2], arg1, arg4, -124, arg3);
        } else {
            class36.method216(class19.field280[arg2], arg3, arg4, -122, arg1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLfb;II)V")
    public static final void method1586(byte arg0, class109 arg1, int arg2, int arg3) {
        if ((arg3 & 0x1) != 0) {
            int var4 = class196.field3351.method608(55);
            int var5 = class196.field3351.method564((byte) 119);
            boolean var6 = (var4 & 0x8000) != 0;
            int var7 = class196.field3351.method559(0);
            int var8 = class196.field3351.field1392;
            if (arg1.field1910 != null && arg1.field1907 != null) {
                long var9 = arg1.field1910.method1833(0);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var6 && class255.field4490 == 1 || class131.field2343 == 1) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class16.field240; var12++) {
                            if (class139.field2440[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class91.field1550 == 0) {
                    class277.field4824.field1392 = 0;
                    class196.field3351.method601(false, 0, class277.field4824.field1381, var7);
                    class277.field4824.field1392 = 0;
                    int var13 = -1;
                    class275 var15;
                    if (var6) {
                        var4 &= 0x7FFF;
                        class38 var14 = class86.method618(false, class277.field4824);
                        var13 = var14.field639;
                        var15 = var14.field631.method958(-121, class277.field4824);
                    } else {
                        var15 = class21.method111(class233.method1518(class277.field4824, -519).method1849((byte) 117));
                    }
                    arg1.field1782 = var15.method1845(false);
                    arg1.field1783 = 150;
                    arg1.field1765 = var4 & 0xFF;
                    arg1.field1734 = var4 >> 8;
                    if (var5 == 2) {
                        class167.method1144(1, var6 ? 17 : 1, var13, class197.method1291(new class275[] { class92.field1564, arg1.method809((byte) -33) }, -30025), var15, (class275) null);
                    } else if (var5 == 1) {
                        class167.method1144(1, var6 ? 17 : 1, var13, class197.method1291(new class275[] { class139.field2442, arg1.method809((byte) -33) }, -30025), var15, (class275) null);
                    } else {
                        class167.method1144(1, var6 ? 17 : 2, var13, arg1.method809((byte) -33), var15, (class275) null);
                    }
                }
            }
            class196.field3351.field1392 = var7 + var8;
        }
        if ((arg3 & 0x80) != 0) {
            int var16 = class196.field3351.method567(-109);
            int var17 = class196.field3351.method567(-93);
            arg1.method746(-29717, class35.field576, var16, var17);
            arg1.field1754 = class35.field576 + 300;
            arg1.field1730 = class196.field3351.method559(0);
        }
        if ((arg3 & 0x40) != 0) {
            arg1.field1735 = class196.field3351.method580(true);
            if (arg1.field1735 == 65535) {
                arg1.field1735 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field1748 = class196.field3351.method567(-104);
            arg1.field1756 = class196.field3351.method564((byte) 124);
            arg1.field1789 = class196.field3351.method603((byte) -30);
            arg1.field1772 = class196.field3351.method603((byte) -102);
            arg1.field1779 = class196.field3351.method608(43) + class35.field576;
            arg1.field1737 = class196.field3351.method580(true) + class35.field576;
            arg1.field1753 = class196.field3351.method559(0);
            arg1.field1791 = 1;
            arg1.field1781 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            arg1.field1782 = class196.field3351.method599(-1);
            if (arg1.field1782.method1852(124, 0) == 126) {
                arg1.field1782 = arg1.field1782.method1839(1, (byte) -90);
                class277.method1874(arg1.field1782, arg1.method809((byte) -33), 2, true);
            } else if (class66.field1094 == arg1) {
                class277.method1874(arg1.field1782, arg1.method809((byte) -33), 2, true);
            }
            arg1.field1734 = 0;
            arg1.field1783 = 150;
            arg1.field1765 = 0;
        }
        field4248++;
        if ((arg3 & 0x400) != 0) {
            int var18 = class196.field3351.method559(0);
            int var19 = class196.field3351.method564((byte) 97);
            arg1.method746(-29717, class35.field576, var18, var19);
        }
        if ((arg3 & 0x2) != 0) {
            int var20 = class196.field3351.method580(true);
            int var21 = class196.field3351.method564((byte) 74);
            if (var20 == 65535) {
                var20 = -1;
            }
            class179.method1202(var21, arg1, -2695, var20);
        }
        if ((arg3 & 0x8) != 0) {
            int var22 = class196.field3351.method603((byte) -116);
            byte[] var23 = new byte[var22];
            class85 var24 = new class85(var23);
            class196.field3351.method577(var23, var22, 0, false);
            class13.field208[arg2] = var24;
            arg1.method811(var24, 101);
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field1724 = class196.field3351.method580(true);
            int var25 = class196.field3351.method611(-115);
            if (arg1.field1724 == 65535) {
                arg1.field1724 = -1;
            }
            arg1.field1785 = var25 >> 16;
            arg1.field1723 = (var25 & 0xFFFF) + class35.field576;
            arg1.field1777 = 0;
            arg1.field1726 = 0;
            if (class35.field576 < arg1.field1723) {
                arg1.field1777 = -1;
            }
            if (arg1.field1724 != -1 && class35.field576 == arg1.field1723) {
                int var26 = class188.method1246(arg1.field1724, 6).field1194;
                if (var26 != -1) {
                    class215 var27 = class201.method1321(128, var26);
                    if (var27 != null && var27.field3688 != null) {
                        class12.method54(-1797326908, class66.field1094 == arg1, arg1.field1758, arg1.field1770, 0, var27);
                    }
                }
            }
        }
        if (arg0 > 125 && (arg3 & 0x10) != 0) {
            arg1.field1742 = class196.field3351.method580(true);
            arg1.field1751 = class196.field3351.method566(-1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)I")
    public static final int method1587(int arg0, int arg1, int arg2) {
        field4247++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg2 != 17) {
            field4243 = true;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method1588(int arg0) {
        if (arg0 == -570653488) {
            class225.field3823.method987((byte) -102);
            class268.field4648.method987((byte) -112);
            field4245++;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        if (arg0 != -125) {
            field4249 = 87;
        }
        field4246 = null;
        field4250 = null;
    }
}
