import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class139 extends class137 {

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "[I")
    public static int[] field2243 = new int[25];

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[I")
    public static int[] field2232 = new int[5];

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lhh;")
    public class126 field2250;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lgi;")
    public static class164 field2245;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "Lll;")
    public class222 field2253;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lwc;")
    public class251 field2239;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Lrc;")
    public class70 field2252;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[I")
    public static int[] field2234;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZIIBII)V")
    public static final void method958(boolean arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 110) {
            field2243 = null;
        }
        field2260++;
        if (arg2 <= arg3) {
            return;
        }
        int var7 = (arg2 + arg3) / 2;
        int var8 = arg3;
        class241 var9 = class93.field1486[var7];
        class93.field1486[var7] = class93.field1486[arg2];
        class93.field1486[arg2] = var9;
        for (int var10 = arg3; var10 < arg2; var10++) {
            if (class232.method1604((byte) 113, arg6, var9, arg5, arg1, class93.field1486[var10], arg0) <= 0) {
                class241 var11 = class93.field1486[var10];
                class93.field1486[var10] = class93.field1486[var8];
                class93.field1486[var8++] = var11;
            }
        }
        class93.field1486[arg2] = class93.field1486[var8];
        class93.field1486[var8] = var9;
        method958(arg0, arg1, var8 - 1, arg3, (byte) 110, arg5, arg6);
        method958(arg0, arg1, arg2, var8 + 1, (byte) 110, arg5, arg6);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLgd;)V")
    public static final void method959(byte arg0, class78 arg1) {
        field2257++;
        if (arg0 < 82) {
            field2234 = null;
        }
        class79.method572((byte) 67, 200000, arg1);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static final void method960(int arg0) {
        field2238++;
        if (class288.field4650 || class41.field625 == 2) {
            return;
        }
        try {
            class216.method1481(-93, class106.field1658, "tbrefresh");
            if (arg0 <= 47) {
                method961((byte) 96);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public static void method961(byte arg0) {
        field2245 = null;
        field2243 = null;
        field2232 = null;
        if (arg0 > 32) {
            field2234 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIBIZ)V")
    public static final void method962(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        field2247++;
        class89.field1384++;
        class123.method846(112);
        if (arg5) {
            class78.method567(false, 96, 0, false);
        } else {
            class111.method780((byte) -127, 0);
            class78.method567(true, 113, 0, false);
            if (class156.field2504 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class78.method567(false, 85, var6, false);
                    class78.method567(false, -101, var6, true);
                    class111.method780((byte) -115, var6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class111.method780((byte) -122, var7);
                    class78.method567(false, 101, var7, false);
                    class78.method567(false, 106, var7, true);
                }
            }
        }
        if (!arg5) {
            class248.method1690(false);
        }
        class25.method201(true);
        class181.field2979 = arg0;
        class181.field2980 = arg4;
        if (class231.field3613 == 1) {
            int var8 = (int) class226.field3554;
            if (var8 < (class221.field3477 / 256)) {
                var8 = class221.field3477 / 256;
            }
            int var9 = (int) class114.field1742 + class117.field1802 & 0x7FF;
            if (class12.field217[4] && class74.field1186[4] + 128 > var8) {
                var8 = class74.field1186[4] + 128;
            }
            class44.method296(2047, arg2, var8 * 3 + 600, class60.method387(-18796, class217.field3408.field929, class217.field3408.field994, class214.field3389) + -50, class256.field4219, var9, class288.field4687, var8);
        } else if (class231.field3613 == 5) {
            class230.method1591(-1, arg2);
        }
        int var10 = class135.field2184;
        int var11 = class123.field1960;
        int var12 = class182.field3028;
        int var13 = class211.field3361;
        int var14 = class95.field1506;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class12.field217[var15]) {
                int var22 = (int) ((double) (-class90.field1415[var15]) + (double) (class90.field1415[var15] * 2 + 1) * Math.random() + Math.sin((double) class220.field3473[var15] / 100.0D * (double) field2232[var15]) * (double) class74.field1186[var15]);
                if (var15 == 4) {
                    class95.field1506 += var22;
                    if (class95.field1506 < 128) {
                        class95.field1506 = 128;
                    }
                    if (class95.field1506 > 383) {
                        class95.field1506 = 383;
                    }
                }
                if (var15 == 3) {
                    class211.field3361 = class211.field3361 + var22 & 0x7FF;
                }
                if (var15 == 0) {
                    class135.field2184 += var22;
                }
                if (var15 == 1) {
                    class182.field3028 += var22;
                }
                if (var15 == 2) {
                    class123.field1960 += var22;
                }
            }
        }
        class297.method2041(66);
        class94.method676(arg0, arg4, arg0 + arg1, arg2 + arg4);
        class136.method945();
        if (class145.field2326 >= 0) {
            class142 var16 = class43.method290(class63.field1028, (byte) 114, class145.field2326, class122.field1927, class68.field1088);
            var16.method976(class58.field840, arg0, arg4, arg1, arg2, class95.field1506, class211.field3361, 0);
        } else {
            class94.method660(arg0, arg4, arg1, arg2, 0);
        }
        if (class41.field633 || class33.field539 < arg0 || (arg0 + arg1) <= class33.field539 || arg4 > class148.field2368 || arg4 + arg2 <= class148.field2368) {
            class229.field3595 = false;
            class294.field4795 = 0;
        } else {
            class229.field3595 = true;
            int var17 = class79.field1277;
            int var18 = class261.field4262;
            class294.field4795 = 0;
            int var19 = class178.field2956;
            class310.field5005 = (class33.field539 - arg0) * (var19 - var17) / arg1 + var17;
            int var20 = class87.field1365;
            class191.field3127 = (var20 - var18) * (class148.field2368 - arg4) / arg2 + var18;
        }
        class243.method1653(false);
        byte var21 = class74.method538(-27785) == 2 ? (byte) class89.field1384 : 1;
        class163.method1118(class135.field2184, class182.field3028, class123.field1960, class95.field1506, class211.field3361, class217.field3412, class40.field607, class87.field1366, class218.field3424, class16.field300, class205.field3303, class214.field3389 + 1, var21, class217.field3408.field994 >> 7, class217.field3408.field929 >> 7);
        class243.method1653(false);
        class147.method1003();
        class68.method468(256, arg4, arg1, arg0, arg2, (byte) -58, 256);
        class99.method704(256, arg4, arg2, arg0, 256, arg1, (byte) -82);
        ((class220) class136.field2196).method1500(class61.field883, (byte) 66);
        class26.method205((byte) -104, arg2, arg0, arg1, arg4);
        if (arg3 > -92) {
            return;
        }
        class123.field1960 = var11;
        class182.field3028 = var12;
        class135.field2184 = var10;
        class211.field3361 = var13;
        class95.field1506 = var14;
        if (class143.field2307 && class102.field1624.method718(30456) == 0) {
            class143.field2307 = false;
        }
        if (class143.field2307) {
            class94.method660(arg0, arg4, arg1, arg2, 0);
            class247.method1671(class115.field1755, false, -436);
        }
        if (!arg5 && !class143.field2307 && !class41.field633 && class33.field539 >= arg0 && class33.field539 < arg0 + arg1 && class148.field2368 >= arg4 && arg2 + arg4 > class148.field2368) {
            class169.method1199(arg2, class33.field539, arg0, (byte) -110, arg1, class148.field2368, arg4);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    public final void method963(byte arg0) {
        field2255++;
        int var2 = -83 % ((41 - arg0) / 53);
        this.field2253 = null;
        this.field2250 = null;
        this.field2239 = null;
        this.field2252 = null;
    }
}
