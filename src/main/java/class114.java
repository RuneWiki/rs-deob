import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class114 extends class62 {

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    private int field2462 = 0;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "[I")
    private int[] field2465 = new int[6];

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    private int field2474 = 0;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
    private int field2480 = 0;

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
    private int field2486 = 128;

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "[I")
    private int[] field2490 = new int[6];

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "I")
    public int field2485 = -1;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    private int field2478 = 128;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Llc;")
    public static class69 field2460 = class69.method470((byte) -111, "Cancel");

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "Llc;")
    public static class69 field2464 = class69.method470((byte) -109, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!td", name = "nb", descriptor = "I")
    public static int field2479 = 0;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public static int field2470 = 0;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "Z")
    public static boolean field2475 = false;

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
    public static int field2489 = 0;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "Llc;")
    public static class69 field2484 = class69.method470((byte) -111, "@yel@0 unread messages");

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "Llc;")
    public static class69 field2482 = class69.method470((byte) -116, "To change your recovery questions:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WSet new recovery questions(W)3");

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "Loa;")
    public static class85 field2483;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "[I")
    public static int[] field2472;

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "[[[B")
    public static byte[][][] field2473;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static final void method833(byte arg0) {
        field2476++;
        if (class72.field1604 < 2 && class76.field1696 == 0 && class60.field1248 == 0) {
            return;
        }
        class69 var1;
        if (class76.field1696 == 1 && class72.field1604 < 2) {
            var1 = class46.method305(20025, new class69[] { class13.field261, class50.field1083, class67.field1395 });
        } else if (class60.field1248 == 1 && class72.field1604 < 2) {
            var1 = class46.method305(20025, new class69[] { class101.field2186, class72.field1607 });
        } else {
            var1 = class101.field2197[class72.field1604 - 1];
        }
        if (class72.field1604 > 2) {
            var1 = class46.method305(arg0 + 19921, new class69[] { var1, class83.field1877, class106.method791(class72.field1604 - 2, (byte) -77), class112.field2438 });
        }
        if (arg0 != 104) {
            field2463 = 110;
        }
        class82.field1861.method292(var1, 4, 15, 16777215, true, class62.field1282 / 1000);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lhb;")
    public final class44 method834(int arg0, byte arg1) {
        if (arg1 >= -36) {
            this.method834(6, (byte) 80);
        }
        field2469++;
        class44 var3 = (class44) class68.field1450.method224((long) this.field2491, (byte) 127);
        if (var3 == null) {
            var3 = class44.method259(class3.field63, this.field2488, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2490[0] != 0) {
                    var3.method287(this.field2490[var4], this.field2465[var4]);
                }
            }
            var3.method260();
            var3.method267(this.field2480 + 64, this.field2462 + 850, -30, -50, -30, true);
            class68.field1450.method221(var3, true, (long) this.field2491);
        }
        class44 var5;
        if (this.field2485 == -1 || arg0 == -1) {
            var5 = var3.method269(true);
        } else {
            var5 = class67.method435(104, this.field2485).method522(var3, arg0, (byte) 118);
        }
        if (this.field2486 != 128 || this.field2478 != 128) {
            var5.method258(this.field2486, this.field2478, this.field2486);
        }
        if (this.field2474 != 0) {
            if (this.field2474 == 90) {
                var5.method264();
            }
            if (this.field2474 == 180) {
                var5.method264();
                var5.method264();
            }
            if (this.field2474 == 270) {
                var5.method264();
                var5.method264();
                var5.method264();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)Lda;")
    public static final class20 method835(int arg0, int arg1, int arg2, int arg3) {
        field2487++;
        if (arg0 == 0) {
            class20 var4 = (class20) class55.field1159.method224((long) arg1, (byte) -22);
            if (var4 != null && var4.field436 != arg3 && var4.field436 != -1) {
                var4.method502(0);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class108 var5 = class9.method47(arg2 + 64, arg1);
        if (var5.field2405 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field2390[var7] && var5.field2390[var7] != 0) {
                    var6 = var5.field2405[var7];
                }
            }
            if (var6 != -1) {
                var5 = class9.method47(arg2 ^ 0x40, var6);
            }
        }
        class44 var8 = var5.method812(1, 9995, true);
        if (var8 == null) {
            return null;
        }
        class20 var9 = null;
        if (var5.field2360 != -1) {
            var9 = method835(-1, var5.field2347, 0, 10);
            if (var9 == null) {
                return null;
            }
        }
        int[] var10 = class117.method849();
        int var11 = class95.field2117;
        int[] var12 = class95.field2115;
        int var13 = class95.field2119;
        int var14 = class95.field2118;
        int var15 = class95.field2114;
        int var16 = class95.field2120;
        int var17 = class95.field2116;
        class20 var18 = new class20(32, 32);
        class95.method727(var18.field439, 32, 32);
        class101.field2195 = class117.method848(class101.field2195);
        class95.method728(0, 0, 32, 32, arg2);
        class117.field2509 = false;
        int var19 = var5.field2391;
        if (arg0 == -1) {
            var19 = (int) ((double) var19 * 1.5D);
        }
        if (arg0 > 0) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class117.field2527[var5.field2385] * var19 >> 16;
        int var21 = class117.field2514[var5.field2385] * var19 >> 16;
        var8.method283();
        var8.method286(0, var5.field2408, var5.field2388, var5.field2385, var5.field2356, var8.field563 / 2 + var5.field2365 + var20, var5.field2365 + var21);
        for (int var22 = 31; var22 >= 0; var22--) {
            for (int var29 = 31; var29 >= 0; var29--) {
                if (var18.field439[var29 * 32 + var22] == 0) {
                    if (var22 > 0 && var18.field439[var22 + var29 * 32 - 1] > 1) {
                        var18.field439[var22 + var29 * 32] = 1;
                    } else if (var29 > 0 && var18.field439[(var29 - 1) * 32 + var22] > 1) {
                        var18.field439[var29 * 32 + var22] = 1;
                    } else if (var22 < 31 && var18.field439[var29 * 32 + var22 + 1] > 1) {
                        var18.field439[var29 * 32 + var22] = 1;
                    } else if (var29 < 31 && var18.field439[var22 + (var29 + 1) * 32] > 1) {
                        var18.field439[var29 * 32 + var22] = 1;
                    }
                }
            }
        }
        if (arg0 > 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var28 = 31; var28 >= 0; var28--) {
                    if (var18.field439[var28 * 32 + var25] == 0) {
                        if (var25 > 0 && var18.field439[var25 + var28 * 32 - 1] == 1) {
                            var18.field439[var28 * 32 + var25] = arg0;
                        } else if (var28 > 0 && var18.field439[var25 + var28 * 32 - 32] == 1) {
                            var18.field439[var25 + var28 * 32] = arg0;
                        } else if (var25 < 31 && var18.field439[var28 * 32 + var25 + 1] == 1) {
                            var18.field439[var28 * 32 + var25] = arg0;
                        } else if (var28 < 31 && var18.field439[(var28 + 1) * 32 + var25] == 1) {
                            var18.field439[var25 + var28 * 32] = arg0;
                        }
                    }
                }
            }
        } else if (arg0 == 0) {
            for (int var23 = 31; var23 >= 0; var23--) {
                for (int var24 = 31; var24 >= 0; var24--) {
                    if (var18.field439[var24 * 32 + var23] == 0 && var23 > 0 && var24 > 0 && var18.field439[var24 * 32 + var23 - 1 - 32] > 0) {
                        var18.field439[var24 * 32 + var23] = 3153952;
                    }
                }
            }
        }
        if (var5.field2360 != -1) {
            int var26 = var9.field436;
            int var27 = var9.field434;
            var9.field434 = 32;
            var9.field436 = 32;
            var9.method139(0, 0);
            var9.field436 = var26;
            var9.field434 = var27;
        }
        if (arg0 == 0) {
            class55.field1159.method221(var18, true, (long) arg1);
        }
        class95.method727(var12, var11, var13);
        class95.method719(var14, var15, var16, var17);
        class117.method848(var10);
        var18.field436 = arg3;
        class117.field2509 = true;
        if (var5.field2363) {
            var18.field434 = 33;
        } else {
            var18.field434 = 32;
        }
        return var18;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILpd;)V")
    public final void method836(int arg0, class94 arg1) {
        field2477++;
        while (true) {
            int var3 = arg1.method703((byte) -52);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.field2480 = 70;
                    return;
                }
            }
            this.method838(arg1, (byte) 57, var3);
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V")
    public static final void method837(boolean arg0) {
        class90.field1948.method606(-2);
        field2461++;
        class112.field2444.method80(0, 0);
        class93.field2036 = class117.method848(class93.field2036);
        if (arg0) {
            method835(99, 126, 75, -48);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lpd;BI)V")
    private final void method838(class94 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field2488 = arg0.method665(8666);
        } else if (arg2 == 2) {
            this.field2485 = arg0.method665(8666);
        } else if (arg2 == 4) {
            this.field2486 = arg0.method665(8666);
        } else if (arg2 == 5) {
            this.field2478 = arg0.method665(8666);
        } else if (arg2 == 6) {
            this.field2474 = arg0.method665(8666);
        } else if (arg2 == 7) {
            this.field2480 = arg0.method703((byte) -89);
        } else if (arg2 == 8) {
            this.field2462 = arg0.method703((byte) -71);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2490[arg2 - 40] = arg0.method665(8666);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2465[arg2 - 50] = arg0.method665(8666);
        }
        field2468++;
        if (arg1 < 38) {
            field2479 = -35;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
    public static void method839(int arg0) {
        field2473 = null;
        field2483 = null;
        field2472 = null;
        field2460 = null;
        int var1 = -6 % ((7 - arg0) / 50);
        field2482 = null;
        field2464 = null;
        field2484 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lkc;III)[Lcb;")
    public static final class15[] method840(class63 arg0, int arg1, int arg2, int arg3) {
        field2466++;
        if (class101.method768(500, arg3, arg0, arg1)) {
            if (arg2 != 0) {
                method833((byte) -113);
            }
            return class62.method378(arg2 + 2009);
        } else {
            return null;
        }
    }
}
