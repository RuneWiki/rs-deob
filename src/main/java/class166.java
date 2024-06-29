import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class166 extends class17 {

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "Lsf;")
    public static class108 field2979 = class140.method973(255, "d-Broulement:");

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "Lsf;")
    public static class108 field2986 = class140.method973(255, "hint_mapmarkers");

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "[[[B")
    public static byte[][][] field2980 = new byte[4][104][104];

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    public static int field2984 = 100;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "Lsf;")
    private static class108 field2993 = class140.method973(255, "Loaded config");

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "Lsf;")
    public static class108 field2994 = class140.method973(255, "mapscene");

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "Lsf;")
    public static class108 field2995 = class140.method973(255, "scape main");

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Lsf;")
    public static class108 field2992 = field2993;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V", line = 6)
    public static final void method1160(byte arg0) {
        field2982++;
        if (class132.field2261 == null) {
            return;
        }
        if (class317.field5455 < 10) {
            if (!class155.field2796.method1865(class132.field2261.field3170, -1)) {
                class317.field5455 = class210.field3763.method1867(0, class132.field2261.field3170) / 10;
                return;
            }
            class172.method1223(-32511);
            class317.field5455 = 10;
        }
        if (class317.field5455 == 10) {
            class83.field1288 = class132.field2261.field3152 >> 6 << 6;
            class147.field2643 = 8.0F;
            class200.field3621 = 8.0F;
            class152.field2757 = (class132.field2261.field3168 >> 6 << 6) + 64 - class83.field1288;
            class144.field2546 = class132.field2261.field3159 >> 6 << 6;
            int var1 = class152.field2757 - ((class95.field1513.field4457 >> 7) - class83.field1288) - class137.field2421 - 1;
            int var2 = (class95.field1513.field4452 >> 7) + class305.field5295 - class144.field2546;
            int var3 = var2 + ((int) (Math.random() * 10.0D) - 5);
            class74.field1113 = (class132.field2261.field3160 >> 6 << 6) + 64 - class144.field2546;
            int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && var3 < class74.field1113 && var4 >= 0 && var4 < class152.field2757) {
                class202.field3652 = var3;
                class126.field2121 = var4;
            } else {
                class202.field3652 = class132.field2261.field3163 * 64 - class144.field2546;
                class126.field2121 = class152.field2757 + class83.field1288 - (class132.field2261.field3155 * 64) - 1;
            }
            class137.method943(-1);
            int var5 = class74.field1113 >> 6;
            int var6 = class144.field2537 >> 2 << 10;
            int var7 = class152.field2757 >> 6;
            class190.field3449 = new byte[var5][var7][];
            class5.field69 = new byte[var5][var7][];
            class304.field5273 = new byte[var5][var7][];
            class143.field2517 = new short[var5][var7][];
            class280.field4905 = new int[var5][var7][];
            class202.field3650 = new byte[var5][var7][];
            int var8 = class78.field1187 >> 1;
            class183.field3360 = new byte[var5][var7][];
            class255.field4439 = new int[var5][var7][];
            class159.field2859 = new int[class72.field1099 + 1];
            class281.method2024(false, var6, var8);
            class317.field5455 = 20;
        } else if (class317.field5455 == 20) {
            class181.method1311(new class249(class155.field2796.method1884(119, class132.field2261.field3170, class60.field954)), -1);
            class317.field5455 = 30;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 30) {
            class329.method2252(true, new class249(class155.field2796.method1884(121, class132.field2261.field3170, class266.field4682)));
            class317.field5455 = 40;
            class17.method123(0);
        } else if (class317.field5455 == 40) {
            class251.method1775(new class249(class155.field2796.method1884(111, class132.field2261.field3170, class35.field491)), 63);
            class317.field5455 = 50;
            class17.method123(0);
        } else if (class317.field5455 == 50) {
            class34.method239((byte) 123, new class249(class155.field2796.method1884(125, class132.field2261.field3170, class196.field3545)));
            class317.field5455 = 60;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 60) {
            if (class155.field2796.method1891(-1, class117.method833(new class108[] { class132.field2261.field3170, class156.field2802 }, false))) {
                if (!class155.field2796.method1865(class117.method833(new class108[] { class132.field2261.field3170, class156.field2802 }, false), -1)) {
                    return;
                }
                class42.field559 = class255.method1800(class155.field2796, -111, class117.method833(new class108[] { class132.field2261.field3170, class156.field2802 }, false));
            } else {
                class42.field559 = new class289(0);
            }
            class317.field5455 = 70;
            class17.method123(0);
        } else if (class317.field5455 == 70) {
            class236.field4145 = new class193(11, true, class13.field158);
            class317.field5455 = 73;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 73) {
            class162.field2902 = new class193(12, true, class13.field158);
            class317.field5455 = 76;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 76) {
            class64.field1030 = new class193(14, true, class13.field158);
            class317.field5455 = 79;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 79) {
            class99.field1749 = new class193(17, true, class13.field158);
            class317.field5455 = 82;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 82) {
            class306.field5332 = new class193(19, true, class13.field158);
            class317.field5455 = 85;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 85) {
            class9.field114 = new class193(22, true, class13.field158);
            class317.field5455 = 88;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else if (class317.field5455 == 88) {
            class174.field3186 = new class193(26, true, class13.field158);
            class317.field5455 = 91;
            class163.method1130(true, 10695);
            class17.method123(0);
        } else {
            class122.field2089 = new class193(30, true, class13.field158);
            class317.field5455 = 100;
            int var9 = -33 / ((-arg0 - 48) / 34);
            class163.method1130(true, 10695);
            class17.method123(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II)[I", line = 213)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            method1160((byte) -41);
        }
        field2989++;
        int[] var3 = this.field217.method1698(126, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(85, 0, arg1);
            int[] var5 = this.method124(63, 1, arg1);
            int[] var6 = this.method124(106, 2, arg1);
            for (int var7 = 0; var7 < class116.field2008; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V", line = 265)
    public static final void method1161(int arg0) {
        field2987++;
        Container var1;
        if (class168.field3026 != null) {
            var1 = class168.field3026;
        } else if (class273.field4805 == null) {
            var1 = class289.field5052.field2441;
        } else {
            var1 = class273.field4805;
        }
        class9.field104 = var1.getSize().width;
        class297.field5176 = var1.getSize().height;
        if (class273.field4805 == var1) {
            Insets var2 = class273.field4805.getInsets();
            class9.field104 -= var2.left + var2.right;
            class297.field5176 -= var2.top + var2.bottom;
        }
        if (class281.method2020((byte) -59) < 2) {
            class81.field1266 = (class9.field104 - 765) / 2;
            class87.field1379 = 0;
            class73.field1110 = 765;
            class21.field331 = 503;
        } else {
            class81.field1266 = 0;
            class21.field331 = class297.field5176;
            class73.field1110 = class9.field104;
            class87.field1379 = 0;
        }
        if (class231.field4051) {
            class231.method1569(class73.field1110, class21.field331);
        }
        class13.field158.setSize(class73.field1110, class21.field331);
        if (class273.field4805 == var1) {
            Insets var3 = class273.field4805.getInsets();
            class13.field158.setLocation(class81.field1266 + var3.left, class87.field1379 + var3.top);
        } else {
            class13.field158.setLocation(class81.field1266, class87.field1379);
        }
        if (arg0 >= -39) {
            field2984 = -20;
        }
        if (class322.field5511 != -1) {
            class289.method2069(0, true);
        }
        class307.method2153(-1);
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V", line = 334)
    public static void method1162(int arg0) {
        field2980 = (byte[][][]) null;
        field2994 = null;
        if (arg0 != -765) {
            return;
        }
        field2995 = null;
        field2993 = null;
        field2979 = null;
        field2986 = null;
        field2992 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLrm;I)V", line = 352)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field2991++;
        if (arg2 == 0) {
            this.field225 = arg1.method1731(true) == 1;
        }
        if (arg0 != -114) {
            method1160((byte) -117);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)[[I", line = 380)
    public final int[][] method122(boolean arg0, int arg1) {
        field2981++;
        int[][] var3 = this.field224.method2081(arg1, -39);
        if (this.field224.field5106) {
            int[] var4 = this.method124(84, 2, arg1);
            int[][] var5 = this.method111(3, arg1, 0);
            int[][] var6 = this.method111(3, arg1, 1);
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class116.field2008; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var7[var16] = var12[var16];
                } else if (var17 == 0) {
                    var8[var16] = var13[var16];
                    var9[var16] = var14[var16];
                    var7[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var8[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var9[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var7[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        if (arg0) {
            field2979 = (class108) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZIIIZBI)V", line = 462)
    public static final void method1163(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field2985++;
        if (arg1 < arg3) {
            int var7 = arg1;
            int var8 = (arg1 + arg3) / 2;
            class278 var9 = class15.field201[var8];
            class15.field201[var8] = class15.field201[arg3];
            class15.field201[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (class273.method1972((byte) 86, var9, class15.field201[var10], arg2, arg4, arg0, arg6) <= 0) {
                    class278 var11 = class15.field201[var10];
                    class15.field201[var10] = class15.field201[var7];
                    class15.field201[var7++] = var11;
                }
            }
            class15.field201[arg3] = class15.field201[var7];
            class15.field201[var7] = var9;
            method1163(arg0, arg1, arg2, var7 - 1, arg4, (byte) 101, arg6);
            method1163(arg0, var7 + 1, arg2, arg3, arg4, (byte) 105, arg6);
        }
        int var12 = -3 / ((arg5 - 30) / 44);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 517)
    public class166() {
        super(3, false);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILqd;II)V", line = 524)
    public static final void method1164(int arg0, class45 arg1, int arg2, int arg3) {
        if (arg3 != 5422) {
            method1160((byte) 87);
        }
        if (arg1.field4492 == arg0 && arg0 != -1) {
            class272 var4 = class149.method1063(arg0, -18767);
            int var5 = var4.field4773;
            if (var5 == 1) {
                arg1.field4521 = arg2;
                arg1.field4473 = 0;
                arg1.field4456 = 0;
                arg1.field4453 = 0;
                class172.method1226(var4, arg1.field4457, -21329, arg1.field4453, false, arg1.field4452);
            }
            if (var5 == 2) {
                arg1.field4456 = 0;
            }
        } else if (arg0 == -1 || arg1.field4492 == -1 || class149.method1063(arg0, -18767).field4758 >= class149.method1063(arg1.field4492, -18767).field4758) {
            arg1.field4521 = arg2;
            arg1.field4492 = arg0;
            arg1.field4473 = 0;
            arg1.field4453 = 0;
            arg1.field4456 = 0;
            arg1.field4447 = arg1.field4487;
            if (arg1.field4492 != -1) {
                class172.method1226(class149.method1063(arg1.field4492, -18767), arg1.field4457, -21329, arg1.field4453, false, arg1.field4452);
            }
        }
        field2996++;
    }
}
