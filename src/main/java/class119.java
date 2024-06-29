import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class119 extends class301 {

    @OriginalMember(owner = "client!el", name = "C", descriptor = "[I")
    private final int[] field2116 = new int[this.field5121];

    @OriginalMember(owner = "client!el", name = "z", descriptor = "Ljf;")
    private static class229 field2113 = class212.method1457((byte) 116, "Discard");

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Ljf;")
    public static class229 field2111 = field2113;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "Z")
    public static boolean field2119 = false;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "[I")
    public static int[] field2123 = new int[4];

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    private int field2120;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "[B")
    private byte[] field2118;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)[Lgd;", line = 6)
    public static final class312[] method845(int arg0) {
        field2122++;
        if (class8.field78 == null) {
            class312[] var1 = class237.method1694(class215.field3689, (byte) 105);
            int var2 = 0;
            class312[] var3 = new class312[var1.length];
            label57: for (int var4 = 0; var4 < var1.length; var4++) {
                class312 var5 = var1[var4];
                if ((var5.field5251 <= 0 || var5.field5251 >= 24) && var5.field5255 >= 800 && var5.field5239 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class312 var7 = var3[var6];
                        if (var5.field5255 == var7.field5255 && var5.field5239 == var7.field5239) {
                            if (var7.field5251 < var5.field5251) {
                                var3[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class8.field78 = new class312[var2];
            class36.method325(var3, 0, class8.field78, 0, var2);
            int[] var8 = new int[class8.field78.length];
            for (int var9 = 0; var9 < class8.field78.length; var9++) {
                class312 var10 = class8.field78[var9];
                var8[var9] = var10.field5255 * var10.field5239;
            }
            class320.method2157((byte) -115, class8.field78, var8);
        }
        return arg0 == 14791 ? class8.field78 : (class312[]) null;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 84)
    public final void method222(int arg0) {
        field2121++;
        if (arg0 != 22620) {
            this.method217(90);
        }
        this.field2120 = 0;
        this.field2112 = 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZIII)V", line = 96)
    public static final void method846(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class295.field5049++;
        if (!arg2) {
            class131.method913(true, false);
            class82.method580(-39, true);
            class131.method913(false, false);
        }
        class82.method580(-94, false);
        field2110++;
        if (arg0 != -1671102361) {
            method847(-68);
        }
        if (!arg2) {
            class275.method1925(3524);
        }
        class215.method1478((byte) 96);
        if (class108.field1900) {
            class309.method2102(true, 512, arg3, arg5, arg1, arg4);
            arg3 = class309.field5216;
            arg1 = class195.field3394;
            arg4 = class118.field2108;
            arg5 = class80.field1446;
        }
        class164.field2781 = arg4;
        class164.field2786 = arg5;
        if (class74.field1405 == 1) {
            int var6 = class293.field5021;
            if ((class107.field1885 / 256) > var6) {
                var6 = class107.field1885 / 256;
            }
            int var7 = class229.field3939 + class200.field3505 & 0x7FF;
            if (class302.field5142[4] && var6 < class275.field4706[4] + 128) {
                var6 = class275.field4706[4] + 128;
            }
            class69.method514(class282.method1984((byte) -76, class301.field5124.field2028, class301.field5124.field1983, class16.field254) - 50, class234.field4049, arg3, -1781369264, var6 * 3 + 600, class186.field3246, var7, var6);
        }
        int var8 = class97.field1721;
        int var9 = class107.field1881;
        int var10 = class243.field4301;
        int var11 = class203.field3550;
        int var12 = class174.field3043;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class302.field5142[var13]) {
                int var14 = (int) ((double) (-class39.field723[var13]) + (double) (class39.field723[var13] * 2 + 1) * Math.random() + Math.sin((double) class229.field3960[var13] / 100.0D * (double) class7.field74[var13]) * (double) class275.field4706[var13]);
                if (var13 == 2) {
                    class243.field4301 += var14;
                }
                if (var13 == 0) {
                    class97.field1721 += var14;
                }
                if (var13 == 3) {
                    class174.field3043 = class174.field3043 + var14 & 0x7FF;
                }
                if (var13 == 4) {
                    class203.field3550 += var14;
                    if (class203.field3550 < 128) {
                        class203.field3550 = 128;
                    }
                    if (class203.field3550 > 383) {
                        class203.field3550 = 383;
                    }
                }
                if (var13 == 1) {
                    class107.field1881 += var14;
                }
            }
        }
        class168.method1142(false);
        if (class108.field1900) {
            class163.method1095(arg5, arg4, arg1 + arg5, arg3 + arg4);
            float var15 = (float) class174.field3043 * 0.17578125F;
            float var16 = (float) class203.field3550 * 0.17578125F;
            if (class74.field1405 == 3) {
                var15 = class249.field4391 * 360.0F / 6.2831855F;
                var16 = class127.field2276 * 360.0F / 6.2831855F;
            }
            class108.method753(arg5, arg4, arg1, arg3, arg1 / 2 + arg5, arg3 / 2 + arg4, var16, var15, class275.field4730, class275.field4730);
        } else {
            class114.method813(arg5, arg4, arg5 + arg1, arg4 - -arg3);
            class227.method1591();
        }
        if (class61.field1044 || class48.field875 < arg5 || (arg1 + arg5) <= class48.field875 || arg4 > class25.field461 || class25.field461 >= (arg3 + arg4)) {
            class222.field3792 = false;
            class156.field2653 = 0;
        } else {
            class156.field2653 = 0;
            class222.field3792 = true;
            int var17 = class214.field3688;
            int var18 = class297.field5079;
            int var19 = class324.field5468;
            class317.field5358 = (var19 - var17) * (class48.field875 - arg5) / arg1 + var17;
            int var20 = class165.field2827;
            class51.field890 = (class25.field461 - arg4) * (var18 - var20) / arg3 + var20;
        }
        class18.method179((byte) 101);
        byte var21 = class269.method1903(-24433) == 2 ? (byte) class295.field5049 : 1;
        if (class108.field1900) {
            boolean var22 = false;
            class108.method762();
            class108.method747(true);
            class108.method768(true);
            int var23;
            if (class325.field5482 == 10) {
                var23 = class156.method1042(class243.field4301 >> 10, class146.field2540, (byte) -112, class281.field4822, class97.field1721 >> 10);
            } else {
                var23 = class156.method1042(class301.field5124.field2017[0] >> 3, class146.field2540, (byte) -84, class281.field4822, class301.field5124.field2018[0] >> 3);
            }
            class216.method1490(class199.field3475, !class329.field5605);
            class108.method741(var23);
            class223.method1537(class203.field3550, class174.field3043, class97.field1721, class243.field4301, class107.field1881, false);
            class108.field1905 = class199.field3475;
            class136.method931(class97.field1721, class107.field1881, class243.field4301, class203.field3550, class174.field3043, class288.field4933, class90.field1644, class186.field3255, class303.field5145, class81.field1483, class223.field3810, class16.field254 + 1, var21, class301.field5124.field1983 >> 7, class301.field5124.field2028 >> 7);
            class205.field3589 = true;
            class216.method1481();
            class223.method1537(0, 0, 0, 0, 0, false);
            class18.method179((byte) 101);
            class3.method9();
            class67.method496(arg5, class275.field4730, arg4, class275.field4730, arg1, arg3, 110);
            class27.method240(class275.field4730, (byte) -19, arg4, arg3, class275.field4730, arg1, arg5);
        } else {
            class114.method803(arg5, arg4, arg1, arg3, 0);
            class136.method931(class97.field1721, class107.field1881, class243.field4301, class203.field3550, class174.field3043, class288.field4933, class90.field1644, class186.field3255, class303.field5145, class81.field1483, class223.field3810, class16.field254 + 1, var21, class301.field5124.field1983 >> 7, class301.field5124.field2028 >> 7);
            class18.method179((byte) 101);
            class3.method9();
            class67.method496(arg5, 256, arg4, 256, arg1, arg3, 112);
            class27.method240(256, (byte) -19, arg4, arg3, 256, arg1, arg5);
        }
        ((class275) class227.field3904).method1928(arg0 ^ 0x639AFF98, class146.field2540);
        class134.method924(arg5, arg3, arg4, 124, arg1);
        class203.field3550 = var11;
        class174.field3043 = var12;
        class107.field1881 = var9;
        class97.field1721 = var8;
        class243.field4301 = var10;
        if (class249.field4390 && class102.field1773.method1559((byte) -96) == 0) {
            class249.field4390 = false;
        }
        if (class249.field4390) {
            if (class108.field1900) {
                class163.method1102(arg5, arg4, arg1, arg3, 0);
            } else {
                class114.method803(arg5, arg4, arg1, arg3, 0);
            }
            class18.method178(false, (byte) -4, class47.field856);
        }
        if (!arg2 && !class249.field4390 && !class61.field1044 && class48.field875 >= arg5 && class48.field875 < (arg1 + arg5) && arg4 <= class25.field461 && arg3 + arg4 > class25.field461) {
            class128.method905(arg4, arg3, (byte) 46, arg5, class25.field461, arg1, class48.field875);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 320)
    public final void method221(int arg0, int arg1, int arg2) {
        if (arg1 != -1513462804) {
            method847(-125);
        }
        field2115++;
        this.field2120 += this.field2116[arg2] * arg0 >> 12;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 360)
    public final void method217(int arg0) {
        this.field2120 = Math.abs(this.field2120);
        if (arg0 != 1) {
            this.method217(108);
        }
        if (this.field2120 >= 4096) {
            this.field2120 = 4095;
        }
        field2117++;
        this.method348(this.field2112++, (byte) (this.field2120 >> 4));
        this.field2120 = 0;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V", line = 385)
    public static void method847(int arg0) {
        if (arg0 != 5) {
            field2123 = (int[]) null;
        }
        field2123 = null;
        field2111 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V", line = 399)
    public void method348(int arg0, byte arg1) {
        field2114++;
        this.field2118[this.field2112++] = (byte) ((class305.method2086(255, arg1) >> 1) + 127);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIF)V", line = 409)
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field5121; var7++) {
            this.field2116[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
