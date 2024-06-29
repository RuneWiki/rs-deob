import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class75 {

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Laf;")
    private static class7 field1741 = class48.method406(40, "Use");

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Laf;")
    public static class7 field1732 = field1741;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Laf;")
    public static class7 field1736 = class48.method406(40, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lnd;")
    public static class94 field1738 = new class94();

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lbd;")
    public static class12 field1748 = new class12(8);

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "[I")
    public static int[] field1752 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Laf;")
    public static class7 field1751 = class48.method406(40, "runes");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lr;")
    public static class118 field1754;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Lj;")
    public static class62 field1750;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lkb;")
    public static class71 field1734;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Ln;")
    public static class90 field1742;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Ljava/awt/Image;")
    public Image field1746;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    public int[] field1735;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public abstract void method640(Component arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)Z")
    public static final boolean method641(int arg0, byte arg1) {
        field1729++;
        int var2 = 32 / ((2 - arg1) / 51);
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public final void method642(int arg0) {
        field1745++;
        if (arg0 != 8430) {
            field1748 = null;
        }
        class33.method295(this.field1735, this.field1731, this.field1737);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
    public static final void method643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class33.method301(arg3, arg1, arg3 + arg4, arg1 - -arg2);
        class134.method1089();
        field1733++;
        class144.field3411++;
        class83.method698(false, true);
        class45.method386(true, (byte) -124);
        class83.method698(false, false);
        class45.method386(false, (byte) -124);
        class106.method860(122);
        class2.method17(true);
        if (!class121.field2848) {
            int var5 = class9.field239;
            if (var5 < class12.field304 / 256) {
                var5 = class12.field304 / 256;
            }
            int var6 = class4.field48 + class22.field603 & 0x7FF;
            if (class20.field525[4] && var5 < client.field569[4] + 128) {
                var5 = client.field569[4] + 128;
            }
            class6.method53(class66.field1431, class119.method921(class21.field531.field491, arg0 - 21953, class8.field186, class21.field531.field505) - 50, 0, var5, var5 * 3 + 600, class148.field3486, var6);
        }
        int var7;
        if (class121.field2848) {
            var7 = class149.method1195(arg0 - 370);
        } else {
            var7 = class42.method376(false);
        }
        int var8 = field1753;
        int var9 = class103.field2506;
        int var10 = class143.field3392;
        int var11 = class127.field3056;
        int var12 = class86.field2014;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class20.field525[var13]) {
                int var16 = (int) ((double) (class26.field687[var13] * 2 + 1) * Math.random() + Math.sin((double) class64.field1424[var13] / 100.0D * (double) class51.field1233[var13]) * (double) client.field569[var13] - (double) class26.field687[var13]);
                if (var13 == 4) {
                    class127.field3056 += var16;
                    if (class127.field3056 < 128) {
                        class127.field3056 = 128;
                    }
                    if (class127.field3056 > 383) {
                        class127.field3056 = 383;
                    }
                }
                if (var13 == 2) {
                    class143.field3392 += var16;
                }
                if (var13 == 0) {
                    field1753 += var16;
                }
                if (var13 == 1) {
                    class103.field2506 += var16;
                }
                if (var13 == 3) {
                    class86.field2014 = class86.field2014 + var16 & 0x7FF;
                }
            }
        }
        int var14 = class111.field2681;
        int var15 = class113.field2709;
        if (arg3 <= var15 && var15 < arg3 + arg4 && var14 >= arg1 && var14 < arg1 + arg2) {
            class31.field805 = class113.field2709 - arg3;
            class31.field816 = true;
            class31.field820 = 0;
            class31.field824 = class111.field2681 - arg1;
        } else {
            class31.field820 = 0;
            class31.field816 = false;
        }
        class118.method915((byte) 112);
        class33.method304(arg3, arg1, arg4, arg2, 0);
        class118.method915((byte) 104);
        class47.field1151.method1028(field1753, class103.field2506, class143.field3392, class127.field3056, class86.field2014, var7);
        class118.method915((byte) 107);
        class47.field1151.method1021();
        class101.method832(arg2, arg3, arg4, arg1, arg0 ^ 0x137);
        class142.method1158(-4, arg1, arg3);
        ((class66) class134.field3161).method537(class108.field2646, 5);
        class71.method569(arg2, 20, arg3, arg1, arg4);
        class143.field3392 = var10;
        if (arg0 != 256) {
            return;
        }
        class127.field3056 = var11;
        class86.field2014 = var12;
        class103.field2506 = var9;
        field1753 = var8;
        if (class93.field2182 && class84.method704(true, false, (byte) -20) == 0) {
            class93.field2182 = false;
        }
        if (class93.field2182) {
            class33.method304(arg3, arg1, arg4, arg2, 0);
            class43.method382(112, class13.field342, false);
        }
        if (!class93.field2182 && !class78.field1817 && var15 >= arg3 && var15 < arg3 + arg4 && var14 >= arg1 && var14 < arg1 + arg2) {
            class46.method392(-2, arg3, var14, arg1, var15);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method644(int arg0) {
        field1754 = null;
        field1738 = null;
        field1741 = null;
        field1748 = null;
        field1742 = null;
        field1736 = null;
        field1732 = null;
        field1734 = null;
        if (arg0 == 0) {
            field1752 = null;
            field1751 = null;
            field1750 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILne;)V")
    public static final void method645(int arg0, int arg1, int arg2, int arg3, class95 arg4) {
        field1730++;
        if (class19.field449 >= 400) {
            return;
        }
        if (arg3 <= 75) {
            method643(-68, 74, -65, -3, -98);
        }
        if (arg4.field2213 != null) {
            arg4 = arg4.method775(30856);
        }
        if (arg4 == null || !arg4.field2235) {
            return;
        }
        class7 var5 = arg4.field2236;
        if (arg4.field2251 != 0) {
            var5 = class116.method905(new class7[] { var5, class11.method118(arg4.field2251, class21.field531.field2135, -7), class103.field2488, class37.field940, class51.method421((byte) 118, arg4.field2251), class86.field2006 }, 1);
        }
        if (class142.field3348 == 1) {
            class91.field2091++;
            class19.method176(arg2, arg1, class116.method905(new class7[] { class83.field1956, class30.field763, var5 }, 1), field1732, 3, 44, arg0);
        } else if (!class50.field1206) {
            class139.field3288++;
            class7[] var6 = arg4.field2217;
            if (class51.field1223) {
                var6 = class42.method369(var6, 8);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method84(class49.field1186, 124)) {
                        class101.field2404++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 32;
                        }
                        if (var7 == 1) {
                            var8 = 35;
                        }
                        if (var7 == 2) {
                            var8 = 24;
                        }
                        if (var7 == 3) {
                            var8 = 23;
                        }
                        if (var7 == 4) {
                            var8 = 26;
                        }
                        class19.method176(arg2, arg1, class116.method905(new class7[] { class51.field1232, var5 }, 1), var6[var7], 3, var8, arg0);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method84(class49.field1186, 124)) {
                        short var10 = 0;
                        class122.field2896++;
                        if (class21.field531.field2135 < arg4.field2251) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 32;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 35;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 24;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 23;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 26;
                        }
                        class19.method176(arg2, arg1, class116.method905(new class7[] { class51.field1232, var5 }, 1), var6[var9], 3, var11, arg0);
                    }
                }
            }
            class19.method176(arg2, arg1, class116.method905(new class7[] { class51.field1232, var5 }, 1), class28.field736, 3, 1005, arg0);
        } else if ((class9.field246 & 0x2) == 2) {
            class141.field3317++;
            class19.method176(arg2, arg1, class116.method905(new class7[] { class126.field3013, class30.field763, var5 }, 1), class92.field2132, 3, 46, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method646(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public abstract void method647(Graphics arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
    public static final void method648(int arg0, int arg1, int arg2) {
        field1739++;
        if (class19.field449 < 2 && class142.field3348 == 0 && !class50.field1206) {
            return;
        }
        if (arg2 >= -17) {
            method645(-117, -103, -115, -18, null);
        }
        class7 var3;
        if (class142.field3348 == 1 && class19.field449 < 2) {
            var3 = class116.method905(new class7[] { field1732, class143.field3384, class83.field1956, class6.field108 }, 1);
        } else if (class50.field1206 && class19.field449 < 2) {
            var3 = class116.method905(new class7[] { class92.field2132, class143.field3384, class126.field3013, class6.field108 }, 1);
        } else {
            var3 = class81.method680(class19.field449 - 1, false);
        }
        if (class19.field449 > 2) {
            var3 = class116.method905(new class7[] { var3, class149.field3512, class51.method421((byte) 122, class19.field449 - 2), class74.field1727 }, 1);
        }
        class25.field660.method33(var3, arg0 + 4, arg1 + 15, 16777215, 0, class155.field3611 / 1000);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    protected class75() {
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V")
    public static final void method649(int arg0, boolean arg1) {
        class118.method915((byte) 106);
        field1747++;
        class8.field180++;
        if (class8.field180 < 50 && !arg1) {
            return;
        }
        class8.field180 = 0;
        if (arg0 < 78) {
            field1749 = -82;
        }
        if (class46.field1107 || class12.field302 == null) {
            return;
        }
        class96.field2271++;
        class47.field1150.method1131(118, 2027385224);
        try {
            class12.field302.method1178(class47.field1150.field2903, (byte) -102, 0, class47.field1150.field2895);
            class47.field1150.field2903 = 0;
        } catch (IOException var2) {
            class46.field1107 = true;
        }
    }
}
