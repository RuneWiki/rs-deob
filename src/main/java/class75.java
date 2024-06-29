import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class113 {

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public static int field1718 = 0;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "Lfc;")
    public static class39 field1720 = class90.method774("Name eingeben:", -94);

    @OriginalMember(owner = "client!kf", name = "nb", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "Lfc;")
    public static class39 field1722 = class90.method774("blinken3:", -89);

    @OriginalMember(owner = "client!kf", name = "qb", descriptor = "Lfc;")
    public static class39 field1730 = class90.method774("mapdots", -111);

    @OriginalMember(owner = "client!kf", name = "ob", descriptor = "[I")
    public static int[] field1728 = new int[] { 0, 6, 0, -2, 0, -2, 0, -2, 0, 0, 0, -2, 0, 0, 3, 5, 0, 0, 0, 0, 14, 0, 2, 0, 0, 2, 0, 4, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 2, 0, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 6, 10, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 8, 6, 0, 0, 0, 12, 0, -1, 0, 5, 0, 0, 0, 2, 6, 11, 0, 0, 6, 4, 4, 0, 11, 8, 4, -1, 0, 0, 0, 2, -2, 3, 1, 4, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 15, 0, 6, 0, 0, 0, 0, 2, -1, 0, -2, 0, 0, 0, 1, 1, 0, -1, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, 0, 0, 3, 10, 0, 0, 7, 6, 6, 0, -2, 0, 0, 0, 7, 0, 2, 0, 0, 0, 0, 0, 0, 6, 0, 0, 3, 0, -2, 0, 2, 6, 0, 0, 0, 0, 0, 1, 5 };

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!kf", name = "jb", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!kf", name = "kb", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!kf", name = "pb", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kf", name = "rb", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(B)V", line = 4)
    public static void method668(byte arg0) {
        field1720 = null;
        if (arg0 <= -8) {
            field1722 = null;
            field1728 = null;
            field1730 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII[Lob;BIIII)V", line = 20)
    public static final void method669(int arg0, int arg1, int arg2, int arg3, int arg4, class99[] arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < arg5.length; var11++) {
            class99 var12 = arg5[var11];
            if (var12 != null && (var12.field2452 == 0 || var12.field2415) && var12 != null && var12.field2348 == arg3 && !class44.method515(var12, (byte) -119)) {
                int var13 = var12.field2450 + arg4 - arg10;
                int var14 = var12.field2368 + arg8 - arg0;
                int var15 = var12.field2357 + var13;
                int var16 = var13 > arg4 ? var13 : arg4;
                int var17 = arg8 < var14 ? var14 : arg8;
                int var18 = arg2 <= var15 ? arg2 : var15;
                int var19 = var12.field2381 + var14;
                int var20 = arg9 <= var19 ? arg9 : var19;
                if (var12.field2452 == 0) {
                    method669(var12.field2447 + var17 - var14, arg1, var18, var12.field2406, var16, arg5, (byte) -128, arg7, var17, var20, var16 + var12.field2429 - var13);
                    if (var12.field2416 != null) {
                        method669(var17 + var12.field2447 - var14, arg1, var18, var12.field2406, var16, var12.field2416, (byte) -128, arg7, var17, var20, var16 + var12.field2429 - var13);
                    }
                }
                if (var12.field2415) {
                    boolean var21 = false;
                    boolean var22 = false;
                    if (class13.field343 == 1 && class34.field889 >= var16 && class26.field758 >= var17 && var18 > class34.field889 && class26.field758 < var20) {
                        var22 = true;
                    }
                    boolean var23;
                    if (class12.field314 >= var16 && class131.field3322 >= var17 && var18 > class12.field314 && var20 > class131.field3322) {
                        var23 = true;
                    } else {
                        var23 = false;
                    }
                    if (class50.field1275 == 1 && var23) {
                        var21 = true;
                    }
                    if (var22 && class100.field2504 == null && (arg1 & 0x200) != 0 && !class94.field2206 && class127.method1057(var12, 100) != null) {
                        class100.field2504 = var12;
                        class37.field1016 = arg7;
                        class110.field2809 = 0;
                        class30.field849 = false;
                        field1727 = class34.field889 - var16;
                        class100.field2479 = class26.field758 - var17;
                    }
                    if (class100.field2504 != null || class94.field2206) {
                        var23 = false;
                        var21 = false;
                        var22 = false;
                    }
                    if (!var12.field2449 && var22 && (arg1 & 0x1) != 0) {
                        var12.field2449 = true;
                        if (var12.field2440 != null) {
                            class30.method365(arg6 + 132, var12, var12.field2440, null, class34.field889 - var13, -var14 + class26.field758, 0);
                        }
                    }
                    if (var12.field2449 && var21 && (arg1 & 0x4) != 0 && var12.field2341 != null) {
                        class30.method365(4, var12, var12.field2341, null, class12.field314 - var13, -var14 + class131.field3322, 0);
                    }
                    if (var12.field2449 && !var21 && (arg1 & 0x2) != 0) {
                        var12.field2449 = false;
                        if (var12.field2360 != null) {
                            class30.method365(arg6 + 132, var12, var12.field2360, null, class12.field314 - var13, class131.field3322 - var14, 0);
                        }
                    }
                    if (var21 && (arg1 & 0x8) != 0 && var12.field2332 != null) {
                        class30.method365(4, var12, var12.field2332, null, class12.field314 - var13, -var14 + class131.field3322, 0);
                    }
                    if (!var12.field2365 && var23 && (arg1 & 0x10) != 0) {
                        var12.field2365 = true;
                        if (var12.field2408 != null) {
                            class30.method365(4, var12, var12.field2408, null, class12.field314 - var13, -var14 + class131.field3322, 0);
                        }
                    }
                    if (var12.field2365 && var23 && (arg1 & 0x40) != 0 && var12.field2350 != null) {
                        class30.method365(arg6 ^ 0xFFFFFF84, var12, var12.field2350, null, class12.field314 - var13, -var14 + class131.field3322, 0);
                    }
                    if (var12.field2365 && !var23 && (arg1 & 0x20) != 0) {
                        var12.field2365 = false;
                        if (var12.field2451 != null) {
                            class30.method365(arg6 ^ 0xFFFFFF84, var12, var12.field2451, null, class12.field314 - var13, class131.field3322 - var14, 0);
                        }
                    }
                    if (var12.field2359 != null && (arg1 & 0x80) != 0) {
                        class30.method365(4, var12, var12.field2359, null, 0, 0, 0);
                    }
                    if (var23 && class2.field37 != 0 && var12.field2372 != null && (arg1 & 0x400) != 0) {
                        class30.method365(4, var12, var12.field2372, null, 0, class2.field37, 0);
                    }
                    if ((arg1 & 0x100) != 0) {
                        if (class72.field1687 > var12.field2356 && var12.field2404 != null) {
                            class30.method365(4, var12, var12.field2404, null, 0, 0, 0);
                        }
                        if (var12.field2356 < class30.field858 && var12.field2378 != null) {
                            class30.method365(4, var12, var12.field2378, null, 0, 0, 0);
                        }
                        if (class42.field1141 > var12.field2356 && var12.field2419 != null) {
                            class30.method365(4, var12, var12.field2419, null, 0, 0, 0);
                        }
                        var12.field2356 = class70.field1654;
                    }
                }
            }
        }
        if (arg6 != -128) {
            method672(-95, 57, false, null, false, -74);
        }
        field1719++;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Lda;", line = 204)
    public final class23 method153(int arg0) {
        if (arg0 != 64) {
            field1727 = 120;
        }
        field1717++;
        return class37.method421(true, this.field1731).method967(this.field1724, arg0 - 64);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I", line = 216)
    public static final int method670(int arg0, int arg1, int arg2) {
        field1721++;
        if (arg1 != 0) {
            method672(37, -53, true, null, true, -77);
        }
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 0) {
                arg0 = 0;
            } else if (arg0 > 127) {
                arg0 = 127;
            }
            return 127 - arg0;
        } else {
            int var4 = (arg2 & 0x7F) * arg0 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(B)V", line = 285)
    public static final void method671(byte arg0) {
        field1715++;
        Object var1 = class34.field899;
        synchronized (class34.field899) {
            if (class151.field3740 != 0) {
                class151.field3740 = 1;
                try {
                    class34.field899.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
        int var2 = 38 % ((-arg0 - 31) / 56);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZLoc;ZI)V", line = 323)
    public static final void method672(int arg0, int arg1, boolean arg2, class100 arg3, boolean arg4, int arg5) {
        class101.field2547 = 1;
        class1.field2 = 10000;
        class150.field3711 = arg5;
        if (arg4) {
            field1725 = -22;
        }
        field1729++;
        field1723 = arg1;
        class139.field3513 = arg2;
        class142.field3562 = arg0;
        class61.field1497 = arg3;
    }
}
