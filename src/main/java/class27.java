import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class27 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lva;")
    public static class121 field674 = class107.method797("p12_full", -10983);

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Lva;")
    private static class121 field683 = class107.method797("Walk here", -10983);

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lva;")
    public static class121 field686 = class107.method797("0(U", -10983);

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lva;")
    public static class121 field688 = field683;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lva;")
    private static class121 field684 = class107.method797("Hide", -10983);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lva;")
    public static class121 field687 = class107.method797(" ", -10983);

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lva;")
    public static class121 field690 = field684;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lva;")
    public static class121 field691 = class107.method797("backvmid2", -10983);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lw;")
    public static class125 field681;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILic;)V", line = 5)
    public static final synchronized void method209(int arg0, class51 arg1) {
        class12.field228 = arg1;
        if (arg0 >= 95) {
            field679++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lhe;Lhe;Lhe;I)V", line = 19)
    public static final void method210(class47 arg0, class47 arg1, class47 arg2, int arg3) {
        if (arg3 != 0) {
            method218(88, -69);
        }
        field680++;
        class107.field2435 = arg1;
        class56.field1307 = arg2;
        class23.field610 = arg0;
        class126.field2872 = new class19[class107.field2435.method335(-1)][];
        class61.field1482 = new boolean[class107.field2435.method335(-1)];
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V", line = 36)
    public static final synchronized void method211(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class12.field228 != null) {
            class12.field228.method248(arg0, 0, var3);
        }
        class81.method555(var3, -100);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V", line = 70)
    public static final void method212(int arg0, boolean arg1) {
        class86.field1984 = arg1;
        if (class86.field1984) {
            int var2 = class66.field1578.method829(512);
            int var3 = class66.field1578.method842((byte) 114);
            int var4 = class66.field1578.method845(false);
            class66.field1578.method617(17591);
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class66.field1578.method626(1, -52);
                        if (var24 == 1) {
                            class46.field1082[var5][var22][var23] = class66.field1578.method626(26, -101);
                        } else {
                            class46.field1082[var5][var22][var23] = -1;
                        }
                    }
                }
            }
            class66.field1578.method620(0);
            int var6 = (class5.field90 - class66.field1578.field2507) / 16;
            class118.field2684 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class118.field2684[var7][var21] = class66.field1578.method830((byte) 94);
                }
            }
            int var8 = class66.field1578.method851(-12543);
            int var9 = class66.field1578.method851(-12543);
            class47.field1104 = new byte[var6][];
            class96.field2147 = new int[var6];
            class19.field495 = new int[var6];
            class45.field1062 = new int[var6];
            class80.field1866 = new byte[var6][];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class46.field1082[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 3 & 0x7FF;
                            int var16 = var14 >> 14 & 0x3FF;
                            int var17 = (var16 / 8 << 8) + var15 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class45.field1062[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class45.field1062[var10] = var17;
                                int var19 = var17 & 0xFF;
                                int var20 = var17 >> 8 & 0xFF;
                                class96.field2147[var10] = class69.field1665.method332(class113.method866((byte) -103, new class121[] { class69.field1660, class35.method242(var20, 10), class115.field2629, class35.method242(var19, 10) }), -22814);
                                class19.field495[var10] = class69.field1665.method332(class113.method866((byte) -66, new class121[] { class15.field303, class35.method242(var20, 10), class115.field2629, class35.method242(var19, 10) }), -22814);
                                var10++;
                            }
                        }
                    }
                }
            }
            class97.method659(var4, 0, var8, var3, var2, var9);
        } else {
            int var25 = class66.field1578.method842((byte) 105);
            int var26 = class66.field1578.method829(512);
            int var27 = class66.field1578.method829(512);
            int var28 = (class5.field90 - class66.field1578.field2507) / 16;
            class118.field2684 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class118.field2684[var29][var37] = class66.field1578.method837(true);
                }
            }
            boolean var30 = false;
            if ((var25 / 8 == 48 || var25 / 8 == 49) && var27 / 8 == 48) {
                var30 = true;
            }
            int var31 = class66.field1578.method845(false);
            if (var25 / 8 == 48 && var27 / 8 == 148) {
                var30 = true;
            }
            int var32 = class66.field1578.method829(512);
            class47.field1104 = new byte[var28][];
            class45.field1062 = new int[var28];
            class19.field495 = new int[var28];
            class96.field2147 = new int[var28];
            class80.field1866 = new byte[var28][];
            int var33 = 0;
            for (int var34 = (var25 - 6) / 8; var34 <= (var25 + 6) / 8; var34++) {
                for (int var35 = (var27 - 6) / 8; var35 <= (var27 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var30 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class45.field1062[var33] = var36;
                        class96.field2147[var33] = class69.field1665.method332(class113.method866((byte) -125, new class121[] { class69.field1660, class35.method242(var34, 10), class115.field2629, class35.method242(var35, 10) }), -22814);
                        class19.field495[var33] = class69.field1665.method332(class113.method866((byte) -34, new class121[] { class15.field303, class35.method242(var34, 10), class115.field2629, class35.method242(var35, 10) }), -22814);
                        var33++;
                    }
                }
            }
            class97.method659(var31, 0, var25, var26, var27, var32);
        }
        if (arg0 >= 34) {
            field676++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZLtc;)Lva;", line = 299)
    public static final class121 method213(int arg0, boolean arg1, class113 arg2) {
        field693++;
        try {
            class121 var3 = new class121();
            var3.field2783 = arg2.method846(!arg1);
            if (arg0 < var3.field2783) {
                var3.field2783 = arg0;
            }
            var3.field2817 = new byte[var3.field2783];
            arg2.field2507 += class43.field999.method222(arg2.field2512, var3.field2783, var3.field2817, arg2.field2507, 0, (byte) -91);
            if (!arg1) {
                field688 = null;
            }
            return var3;
        } catch (Exception var4) {
            return class86.field1985;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(J)V", line = 328)
    public void method214(long arg0) {
        field677++;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V", line = 354)
    public class27(int arg0) {
        class35.field836 = arg0;
        class11.field187 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 363)
    public static final void method215(int arg0) {
        field682++;
        if (arg0 == 11128) {
            System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
            System.exit(1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V", line = 376)
    public void method216() {
        field685++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 384)
    public static void method217(int arg0) {
        field686 = null;
        field674 = null;
        field691 = null;
        if (arg0 != 11366) {
            field689 = 66;
        }
        field681 = null;
        field690 = null;
        field688 = null;
        field684 = null;
        field687 = null;
        field683 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 414)
    public static final synchronized void method218(int arg0, int arg1) {
        field678++;
        if (class12.field228 != null) {
            class12.field228.method245(arg0);
        }
        if (arg1 != 3328) {
            method211(null, -87);
        }
        class81.method555(arg0, -122);
    }
}
