import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class95 extends class217 {

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "Z")
    public boolean field1755 = false;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Lbh;")
    private class239 field1753;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Z")
    private boolean field1737;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Z")
    private boolean field1747;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Llc;")
    public static class143 field1741 = class66.method374("Chargement du module texte )2 ", -1);

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "[J")
    public static long[] field1745 = new long[100];

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "Llc;")
    public static class143 field1751 = class66.method374("hint_headicons", -1);

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "Llc;")
    public static class143 field1748 = class66.method374("logo", -1);

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "Llc;")
    public static class143 field1757 = class66.method374(":assist:", -1);

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Llc;")
    public static class143 field1756 = class66.method374("Titelbild ge-Offnet)3", -1);

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "Llc;")
    public static class143 field1760 = class66.method374("m-Ochte mit Ihnen handeln)3", -1);

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "F")
    private float field1736;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "Lgf;")
    public static class7 field1743;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "[I")
    private int[] field1734;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lgf;IZFLg;)[I")
    public final int[] method555(class7 arg0, int arg1, boolean arg2, float arg3, class138 arg4) {
        field1733++;
        if (arg1 > -71) {
            method561(-121, -90);
        }
        if (this.field1734 == null || this.field1736 != arg3) {
            if (!this.field1753.method1604(arg0, 20948, arg4)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field1734 = this.field1753.method1605(true, (byte) 79, arg0, arg4, (double) arg3, this.field1747, var6, var6);
            this.field1736 = arg3;
            if (this.field1737) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field1734[var12];
                        var7[var34] += class129.method777(var35, 16762997) >> 16;
                        var10[var34] += class129.method777(255, var35 >> 8);
                        var8[var34] += class129.method777(var35, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var24--;
                        var23 += var7[var24];
                        var22 += var8[var24];
                        var21 += var10[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        int var32 = var23 / 9;
                        int var33 = var21 / 9;
                        var19--;
                        var9[var19] = class119.method729(var31, class119.method729(var32 << 16, var33 << 8));
                        var24--;
                        var25--;
                        var23 += var7[var24] - var7[var25];
                        var22 += var8[var24] - var8[var25];
                        var21 += var10[var24] - var10[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field1734[var12];
                        var13--;
                        int var30 = this.field1734[var13];
                        var7[var28] += -class129.method777(var30 >> 16, 255) + (class129.method777(var29, 16716250) >> 16);
                        var10[var28] += -(class129.method777(65354, var30) >> 8) + (class129.method777(65338, var29) >> 8);
                        var8[var28] += -class129.method777(var30, 255) + class129.method777(var29, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field1734 = var9;
            }
        }
        return this.field1734;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
    public static final int method556(int arg0, int arg1) {
        field1750++;
        int var2 = arg0 & 0x3F;
        if (arg1 != 640914416) {
            return -31;
        }
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIZI)V")
    public static final void method557(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1759++;
        class141.field2460++;
        if (!arg4) {
            class145.method925(true, (byte) 58);
            class62.method350((byte) -121, true);
            class145.method925(false, (byte) -120);
        }
        class62.method350((byte) -118, false);
        if (!arg4) {
            class240.method1607(6611);
        }
        class185.method1212(1);
        class125.field2202 = arg5;
        class125.field2201 = arg0;
        if (class21.field349 == 1) {
            int var6 = class75.field1402;
            if (class192.field3520 / 256 > var6) {
                var6 = class192.field3520 / 256;
            }
            if (class34.field592[4] && var6 < (class105.field1850[4] + 128)) {
                var6 = class105.field1850[4] + 128;
            }
            int var7 = class184.field3339 + class147.field2655 & 0x7FF;
            class258.method1705(class62.field1167, class127.field2245, -111, class20.method140(class229.field4195.field4178, 113, class229.field4195.field4108, class170.field3044) - 50, var6, var7, arg3, var6 * 3 + 600);
        }
        int var8 = class167.field2992;
        int var9 = class163.field2925;
        int var10 = class92.field1658;
        int var11 = class154.field2776;
        int var12 = class148.field2729;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class34.field592[var13]) {
                int var19 = (int) ((double) (class267.field4796[var13] * 2 + 1) * Math.random() + Math.sin((double) class139.field2417[var13] / 100.0D * (double) class143.field2511[var13]) * (double) class105.field1850[var13] - (double) class267.field4796[var13]);
                if (var13 == 4) {
                    class163.field2925 += var19;
                    if (class163.field2925 < 128) {
                        class163.field2925 = 128;
                    }
                    if (class163.field2925 > 383) {
                        class163.field2925 = 383;
                    }
                }
                if (var13 == 0) {
                    class167.field2992 += var19;
                }
                if (var13 == 3) {
                    class148.field2729 = class148.field2729 + var19 & 0x7FF;
                }
                if (var13 == 2) {
                    class154.field2776 += var19;
                }
                if (var13 == 1) {
                    class92.field1658 += var19;
                }
            }
        }
        class134.method803(false);
        if (arg2 != 3848) {
            method556(-47, 27);
        }
        class260.method1738(arg5, arg0, arg1 + arg5, arg0 + arg3);
        class196.method1353();
        if (class139.field2415 || class251.field4522 < arg5 || class251.field4522 >= arg5 + arg1 || class12.field233 < arg0 || arg0 + arg3 <= class12.field233) {
            class214.field3956 = false;
            class70.field1326 = 0;
        } else {
            class214.field3956 = true;
            int var14 = class140.field2450;
            class70.field1326 = 0;
            int var15 = class119.field2109;
            int var16 = class5.field79;
            class61.field1157 = (class251.field4522 - arg5) * (var15 - var14) / arg1 + var14;
            int var17 = class92.field1654;
            class204.field3703 = (class12.field233 - arg0) * (var16 - var17) / arg3 + var17;
        }
        class224.method1543((byte) -56);
        byte var18 = class91.method520(arg2 - 3847) == 2 ? (byte) class141.field2460 : 1;
        class260.method1726(arg5, arg0, arg1, arg3, 0);
        class143.method911(class167.field2992, class92.field1658, class154.field2776, class163.field2925, class148.field2729, class36.field623, class42.field707, class63.field1196, class159.field2863, class158.field2858, class13.field245, class170.field3044 + 1, var18, class229.field4195.field4178 >> 7, class229.field4195.field4108 >> 7);
        class224.method1543((byte) -56);
        class257.method1702();
        class247.method1639(256, arg1, 256, arg3, arg5, arg0, (byte) 66);
        class70.method408(256, arg5, arg3, arg2 ^ 0xFFFFC2C0, 256, arg1, arg0);
        ((class66) class196.field3636).method382(0, class128.field2252);
        class264.method1759(arg5, arg0, arg3, arg2 ^ 0xFFFFF0F6, arg1);
        class167.field2992 = var8;
        class148.field2729 = var12;
        class163.field2925 = var9;
        class92.field1658 = var10;
        class154.field2776 = var11;
        if (class26.field438 && class79.field1430.method1855((byte) 126) == 0) {
            class26.field438 = false;
        }
        if (class26.field438) {
            class260.method1726(arg5, arg0, arg1, arg3, 0);
            class236.method1593(16777215, false, class243.field4365);
        }
        if (!arg4 && !class26.field438 && !class139.field2415 && arg5 <= class251.field4522 && class251.field4522 < arg5 + arg1 && class12.field233 >= arg0 && arg0 + arg3 > class12.field233) {
            class8.method64(arg1, class12.field233, -63, class251.field4522, arg5, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ke", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field1752++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILgf;Lg;)Z")
    public final boolean method558(int arg0, class7 arg1, class138 arg2) {
        int var4 = -109 / ((10 - arg0) / 44);
        field1746++;
        return this.field1753.method1604(arg1, 20948, arg2);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
    public final void method559(int arg0, int arg1) {
        if (arg0 != 128) {
            this.method555((class7) null, 9, false, 1.579753F, (class138) null);
        }
        field1740++;
        if (this.field1734 == null || this.field1738 == 0 && this.field1744 == 0) {
            return;
        }
        if (class89.field1607 == null || this.field1734.length > class89.field1607.length) {
            class89.field1607 = new int[this.field1734.length];
        }
        int var3 = this.field1734.length == 4096 ? 64 : 128;
        int var4 = this.field1734.length;
        int var5 = this.field1744 * arg1;
        int var6 = var3 - 1;
        int var7 = this.field1738 * var3 * arg1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var8 & var7 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = var11 + (var6 & var5 + var12);
                class89.field1607[var13] = this.field1734[var14];
            }
        }
        int[] var10 = this.field1734;
        this.field1734 = class89.field1607;
        class89.field1607 = var10;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public static void method560(int arg0) {
        field1757 = null;
        field1756 = null;
        field1741 = null;
        field1745 = null;
        field1751 = null;
        field1760 = null;
        if (arg0 < 36) {
            field1745 = null;
        }
        field1748 = null;
        field1743 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
    public static final void method561(int arg0, int arg1) {
        field1739++;
        class257.field4625--;
        if (class257.field4625 == arg1) {
            return;
        }
        class275.method1815(class132.field2319, arg1 + 1, class132.field2319, arg1, class257.field4625 - arg1);
        class275.method1815(class136.field2382, arg1 + 1, class136.field2382, arg1, class257.field4625 - arg1);
        class275.method1811(class122.field2147, arg1 + 1, class122.field2147, arg1, class257.field4625 - arg1);
        if (arg0 <= -20) {
            class275.method1814(class69.field1321, arg1 + 1, class69.field1321, arg1, class257.field4625 - arg1);
            class275.method1810(class128.field2269, arg1 + 1, class128.field2269, arg1, class257.field4625 - arg1);
            class275.method1810(class168.field3006, arg1 + 1, class168.field3006, arg1, class257.field4625 - arg1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZILg;Lgf;)[I")
    public final int[] method562(boolean arg0, int arg1, class138 arg2, class7 arg3) {
        field1758++;
        if (arg1 != 128) {
            method556(-60, -80);
        }
        if (this.field1753.method1604(arg3, 20948, arg2)) {
            int var5 = arg0 ? 64 : 128;
            return this.field1753.method1605(false, (byte) 79, arg3, arg2, 1.0D, this.field1747, var5, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lh;)V")
    public class95(class190 arg0) {
        this.field1753 = new class239(arg0);
        this.field1737 = arg0.method1265(114) == 1;
        this.field1747 = arg0.method1265(113) == 1;
        arg0.method1265(124);
        arg0.method1265(117);
        int var2 = arg0.method1265(118) & 0x3;
        this.field1744 = arg0.method1234(false);
        this.field1738 = arg0.method1234(false);
        arg0.method1265(127);
        arg0.method1265(126);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILgf;)V")
    public static final void method563(int arg0, class7 arg1) {
        field1749++;
        if (arg0 != 1) {
            method557(-17, 44, 66, -49, true, 55);
        }
        class71.field1344 = arg1;
    }
}
