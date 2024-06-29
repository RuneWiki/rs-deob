import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class168 {

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Loa;")
    private static class99 field3002 = class221.method1463(2844, "Walk here");

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Loa;")
    public static class99 field3001 = class221.method1463(2844, "vert:");

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Loa;")
    public static class99 field2999 = field3002;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3000 = 0;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lng;")
    public static class76 field2998 = new class76();

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lng;")
    public static class76 field3005 = new class76();

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Z")
    public static boolean field3007 = true;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Led;")
    public static class183 field3006;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Lg;")
    public static final class278 method1138(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        return var3 == null || var3.field3757 == null ? null : var3.field3757;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1139(byte arg0) {
        field2998 = null;
        field3001 = null;
        field3006 = null;
        field3005 = null;
        field3002 = null;
        if (arg0 <= 68) {
            field2996 = -18;
        }
        field2999 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Led;III)V")
    public static final void method1140(class183 arg0, int arg1, int arg2, int arg3) {
        if ((arg3 & 0x40) != 0) {
            int var4 = class129.field2252.method1692(arg2 ^ 0xFFFFFF82);
            int var5 = class129.field2252.method1694(0);
            if (var4 == 65535) {
                var4 = -1;
            }
            class120.method801(arg0, var5, var4, (byte) -78);
        }
        field3003++;
        if ((arg3 & 0x200) != 0) {
            int var6 = class129.field2252.method1742(-957401312);
            int var7 = class129.field2252.method1714(-1640531527);
            arg0.method519(var7, class56.field926, 22, var6);
        }
        if ((arg3 & 0x100) != 0) {
            arg0.field1313 = class129.field2252.method1692(-26);
            int var8 = class129.field2252.method1712(-4);
            arg0.field1277 = var8 >> 16;
            if (arg0.field1313 == 65535) {
                arg0.field1313 = -1;
            }
            arg0.field1262 = class56.field926 + (var8 & 0xFFFF);
            arg0.field1312 = 0;
            arg0.field1295 = 0;
            if (class56.field926 < arg0.field1262) {
                arg0.field1295 = -1;
            }
            if (arg0.field1313 != -1 && class56.field926 == arg0.field1262) {
                int var9 = class90.method610(arg0.field1313, true).field3137;
                if (var9 != -1) {
                    class270 var10 = class38.method297(132, var9);
                    if (var10 != null && var10.field4740 != null) {
                        class250.method1621(arg0.field1325, 0, arg0.field1301, 115, field3006 == arg0, var10);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg0.field1306 = class129.field2252.method1740((byte) 46);
            arg0.field1331 = class129.field2252.method1740((byte) 126);
        }
        if ((arg3 & 0x4) != 0) {
            int var11 = class129.field2252.method1714(-1640531527);
            byte[] var12 = new byte[var11];
            class261 var13 = new class261(var12);
            class129.field2252.method1704(var12, var11, (byte) -98, 0);
            class145.field2565[arg1] = var13;
            arg0.method1259(arg2 ^ 0xFFFFFF9A, var13);
        }
        if ((arg3 & 0x400) != 0) {
            arg0.field1289 = class129.field2252.method1693((byte) 80);
            arg0.field1332 = class129.field2252.method1693((byte) -113);
            arg0.field1261 = class129.field2252.method1694(0);
            arg0.field1293 = class129.field2252.method1693((byte) 29);
            arg0.field1314 = class129.field2252.method1740((byte) 67) + class56.field926;
            arg0.field1334 = class129.field2252.method1729((byte) 21) + class56.field926;
            arg0.field1310 = class129.field2252.method1714(-1640531527);
            arg0.field1326 = 0;
            arg0.field1323 = 1;
        }
        if ((arg3 & 0x2) != arg2) {
            arg0.field1324 = class129.field2252.method1705(121);
            if (arg0.field1324.method655(0, (byte) -96) == 126) {
                arg0.field1324 = arg0.field1324.method680((byte) 99, 1);
                class259.method1678(arg0.method1257((byte) 104), arg0.field1324, (byte) -126, 2);
            } else if (field3006 == arg0) {
                class259.method1678(arg0.method1257((byte) 35), arg0.field1324, (byte) -126, 2);
            }
            arg0.field1272 = 0;
            arg0.field1300 = 150;
            arg0.field1267 = 0;
        }
        if ((arg3 & 0x8) != 0) {
            arg0.field1265 = class129.field2252.method1740((byte) 82);
            if (arg0.field1265 == 65535) {
                arg0.field1265 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            int var14 = class129.field2252.method1742(arg2 ^ 0xC6EF3720);
            int var15 = class129.field2252.method1694(0);
            arg0.method519(var15, class56.field926, 22, var14);
            arg0.field1304 = class56.field926 + 300;
            arg0.field1287 = class129.field2252.method1714(-1640531527);
        }
        if ((arg3 & 0x10) == 0) {
            return;
        }
        int var16 = class129.field2252.method1713((byte) 28);
        int var17 = class129.field2252.method1694(0);
        int var18 = class129.field2252.method1693((byte) -117);
        int var19 = class129.field2252.field4587;
        boolean var20 = (var16 & 0x8000) != 0;
        if (arg0.field3224 != null && arg0.field3250 != null) {
            boolean var21 = false;
            long var22 = arg0.field3224.method697(-23666);
            if (var17 <= 1) {
                if (var20 || (!class74.field1258 || class105.field1763) && !class138.field2425) {
                    for (int var24 = 0; var24 < class122.field2138; var24++) {
                        if (class160.field2846[var24] == var22) {
                            var21 = true;
                            break;
                        }
                    }
                } else {
                    var21 = true;
                }
            }
            if (!var21 && class174.field3074 == 0) {
                class98.field1637.field4587 = 0;
                class129.field2252.method1698(class98.field1637.field4619, var18, -6215, 0);
                class98.field1637.field4587 = 0;
                int var25 = -1;
                class99 var26;
                if (var20) {
                    var16 &= 0x7FFF;
                    class54 var27 = class37.method290(class98.field1637, -12441);
                    var25 = var27.field883;
                    var26 = var27.field885.method419(60, class98.field1637);
                } else {
                    var26 = class70.method472(class180.method1205(class98.field1637, 32767).method700(false));
                }
                arg0.field1324 = var26.method705(-34);
                arg0.field1272 = var16 & 0xFF;
                arg0.field1267 = var16 >> 8;
                arg0.field1300 = 150;
                if (var17 == 2) {
                    class271.method1795(var25, -67, (class99) null, var26, var20 ? 17 : 1, class198.method1332(78, new class99[] { class46.field778, arg0.method1257((byte) 74) }));
                } else if (var17 == 1) {
                    class271.method1795(var25, -127, (class99) null, var26, var20 ? 17 : 1, class198.method1332(arg2 ^ 0x37, new class99[] { class57.field964, arg0.method1257((byte) 89) }));
                } else {
                    class271.method1795(var25, -107, (class99) null, var26, var20 ? 17 : 2, arg0.method1257((byte) 79));
                }
            }
        }
        class129.field2252.field4587 = var18 + var19;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLtg;)V")
    public static final void method1141(byte arg0, class182 arg1) {
        field2996 = arg1.method1245(class133.field2329, false);
        class215.field3733 = arg1.method1245(class106.field1777, false);
        field3004++;
        class280.field4914 = arg1.method1245(class37.field642, false);
        class263.field4640 = arg1.method1245(class198.field3444, false);
        class115.field2040 = arg1.method1245(class125.field2200, false);
        class125.field2203 = arg1.method1245(class222.field3858, false);
        class219.field3814 = arg1.method1245(class107.field1860, false);
        class260.field4545 = arg1.method1245(class95.field1595, false);
        class3.field24 = arg1.method1245(class264.field4683, false);
        class193.field3402 = arg1.method1245(class9.field80, false);
        class23.field324 = arg1.method1245(class193.field3388, false);
        class25.field374 = arg1.method1245(class59.field998, false);
        class144.field2540 = arg1.method1245(class217.field3767, false);
        class172.field3045 = arg1.method1245(class242.field4196, false);
        class258.field4501 = arg1.method1245(class185.field3284, false);
        class214.field3727 = arg1.method1245(class79.field1390, false);
        class12.field113 = arg1.method1245(class220.field3832, false);
        class159.field2828 = arg1.method1245(class183.field3249, false);
        if (arg0 > -71) {
            method1138(121, 9, -49);
        }
        class263.field4651 = arg1.method1245(class153.field2695, false);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I")
    public static final int method1142(int arg0) {
        if (arg0 == -3082) {
            field2997++;
            return class152.field2670;
        } else {
            return -94;
        }
    }
}
