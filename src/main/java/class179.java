import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class179 extends class262 {

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lok;")
    public static class146 field3010 = class235.method1724(-12908, "showVideoAd");

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lok;")
    public static class146 field3008 = class235.method1724(-12908, "Number of player models in cache:");

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Lok;")
    public static class146 field3014 = class235.method1724(-12908, "brillant2:");

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Lje;")
    public static class70 field3012;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I", line = 4)
    public static final int method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        field3009++;
        if (arg6 != 3964) {
            method1411(-126, (byte) -11, (short[]) null, (class146[]) null, -13);
        }
        if ((arg1 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg5;
        } else if (var7 == 2) {
            return 7 - arg2 - (arg0 + -1);
        } else {
            return 7 + 1 - arg5 - arg4;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 35)
    public class179() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBIZII)V", line = 39)
    public static final void method1408(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class260.field4321++;
        if (!arg3) {
            class106.method714(true, 1398);
            class5.method35(true, true);
            class106.method714(false, arg1 ^ 0x55D);
        }
        field3018++;
        class5.method35(true, false);
        if (!arg3) {
            class97.method671(arg1 ^ 0xFFFFABD3);
        }
        class146.method1088(-1);
        if (class271.field4640) {
            class124.method854(arg5, (byte) 67, arg0, arg2, arg4, true);
            arg5 = class238.field3970;
            arg0 = class297.field5055;
            arg2 = class294.field4990;
            arg4 = class43.field734;
        }
        if (arg1 != 43) {
            method1409((byte) 73);
        }
        if (class302.field5172 == 1) {
            int var6 = class158.field2668 + class51.field918 & 0x7FF;
            int var7 = class211.field3490;
            if ((class184.field3073 / 256) > var7) {
                var7 = class184.field3073 / 256;
            }
            if (class150.field2549[4] && (class177.field3005[4] + 128) > var7) {
                var7 = class177.field3005[4] + 128;
            }
            class200.method1536(class19.method141(class102.field1639.field5409, class203.field3387, class102.field1639.field5380, 123) - 50, arg2, class203.field3392, var7, var6, var7 * 3 + 600, class254.field4237, 30637);
        }
        int var8 = class107.field1742;
        int var9 = class151.field2572;
        int var10 = class161.field2719;
        int var11 = class79.field1269;
        int var12 = class63.field1088;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class150.field2549[var13]) {
                int var14 = (int) ((double) (-client.field4079[var13]) + Math.random() * (double) (client.field4079[var13] * 2 + 1) + Math.sin((double) class158.field2658[var13] / 100.0D * (double) class110.field1775[var13]) * (double) class177.field3005[var13]);
                if (var13 == 1) {
                    class151.field2572 += var14;
                }
                if (var13 == 4) {
                    class63.field1088 += var14;
                    if (class63.field1088 < 128) {
                        class63.field1088 = 128;
                    }
                    if (class63.field1088 > 383) {
                        class63.field1088 = 383;
                    }
                }
                if (var13 == 3) {
                    class79.field1269 = class79.field1269 + var14 & 0x7FF;
                }
                if (var13 == 0) {
                    class107.field1742 += var14;
                }
                if (var13 == 2) {
                    class161.field2719 += var14;
                }
            }
        }
        class182.method1441(0);
        if (class271.field4640) {
            class131.method973(arg0, arg5, arg0 + arg4, arg2 + arg5);
            float var15 = (float) class63.field1088 * 0.17578125F;
            float var16 = (float) class79.field1269 * 0.17578125F;
            if (class302.field5172 == 3) {
                var15 = class13.field251 * 360.0F / 6.2831855F;
                var16 = class135.field2261 * 360.0F / 6.2831855F;
            }
            class271.method1973(arg0, arg5, arg4, arg2, arg4 / 2 + arg0, arg2 / 2 + arg5, var15, var16, class261.field4343, class261.field4343);
        } else {
            class181.method1420(arg0, arg5, arg0 + arg4, arg2 + arg5);
            class109.method734();
        }
        if (class295.field4998 || class263.field4372 < arg0 || (arg0 + arg4) <= class263.field4372 || arg5 > class250.field4183 || arg2 + arg5 <= class250.field4183) {
            class199.field3334 = 0;
            class9.field186 = false;
        } else {
            class199.field3334 = 0;
            int var17 = class120.field1970;
            class9.field186 = true;
            int var18 = class167.field2822;
            class202.field3369 = (class263.field4372 - arg0) * (var18 - var17) / arg4 + var17;
            int var19 = class148.field2512;
            int var20 = class137.field2281;
            class199.field3319 = (class250.field4183 - arg5) * (var19 - var20) / arg2 + var20;
        }
        class3.method9(-122);
        byte var21 = class248.method1813((byte) 118) == 2 ? (byte) class260.field4321 : 1;
        if (class271.field4640) {
            class271.method1981();
            class271.method1971(true);
            boolean var22 = false;
            class271.method1962(true);
            int var23;
            if (class238.field3973 == 10) {
                var23 = class139.method1021(class161.field2719 >> 10, class107.field1742 >> 10, class214.field3534, 65280, class273.field4684);
            } else {
                var23 = class139.method1021(class102.field1639.field5432[0] >> 3, class102.field1639.field5419[0] >> 3, class214.field3534, 65280, class273.field4684);
            }
            class53.method433(class203.field3385, !class300.field5078);
            class271.method1975(var23);
            class164.method1277(class151.field2572, class107.field1742, class63.field1088, class161.field2719, class79.field1269, true);
            class271.field4635 = class203.field3385;
            class206.method1559(class107.field1742, class151.field2572, class161.field2719, class63.field1088, class79.field1269, class300.field5075, class85.field1353, class28.field484, class248.field4136, class232.field3878, class27.field464, class203.field3387 + 1, var21, class102.field1639.field5409 >> 7, class102.field1639.field5380 >> 7);
            class189.field3125 = true;
            class53.method439();
            class164.method1277(0, 0, 0, 0, 0, true);
            class3.method9(-117);
            class211.method1586();
            class103.method705(arg5, class261.field4343, arg1 - 42, class261.field4343, arg2, arg0, arg4);
            class41.method295(arg5, arg0, true, class261.field4343, arg4, arg2, class261.field4343);
        } else {
            class181.method1416(arg0, arg5, arg4, arg2, 0);
            class206.method1559(class107.field1742, class151.field2572, class161.field2719, class63.field1088, class79.field1269, class300.field5075, class85.field1353, class28.field484, class248.field4136, class232.field3878, class27.field464, class203.field3387 + 1, var21, class102.field1639.field5409 >> 7, class102.field1639.field5380 >> 7);
            class3.method9(arg1 ^ 0xFFFFFF90);
            class211.method1586();
            class103.method705(arg5, 256, 1, 256, arg2, arg0, arg4);
            class41.method295(arg5, arg0, true, 256, arg4, arg2, 256);
        }
        ((class120) class109.field1747).method832(0, class214.field3534);
        class2.method6(arg5, true, arg4, arg0, arg2);
        class63.field1088 = var12;
        class79.field1269 = var11;
        class151.field2572 = var9;
        class107.field1742 = var8;
        class161.field2719 = var10;
        if (class148.field2519 && class70.field1139.method1219((byte) -30) == 0) {
            class148.field2519 = false;
        }
        if (class148.field2519) {
            if (class271.field4640) {
                class131.method978(arg0, arg5, arg4, arg2, 0);
            } else {
                class181.method1416(arg0, arg5, arg4, arg2, 0);
            }
            class55.method445(false, 0, class71.field1169);
        }
        if (!arg3 && !class148.field2519 && !class295.field4998 && class263.field4372 >= arg0 && class263.field4372 < (arg0 + arg4) && class250.field4183 >= arg5 && arg5 + arg2 > class250.field4183) {
            class39.method274(arg0, (byte) -41, class250.field4183, arg2, arg4, arg5, class263.field4372);
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V", line = 263)
    public static final void method1409(byte arg0) {
        field3013++;
        if (arg0 >= -18) {
            field3008 = (class146) null;
        }
        class182.field3054 = new class160();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I", line = 274)
    public final int[] method38(int arg0, byte arg1) {
        field3011++;
        return arg1 > -85 ? (int[]) null : class210.field3485;
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V", line = 288)
    public static void method1410(int arg0) {
        field3008 = null;
        field3010 = null;
        field3012 = null;
        field3014 = null;
        if (arg0 >= -35) {
            method1409((byte) -98);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB[S[Lok;I)V", line = 307)
    public static final void method1411(int arg0, byte arg1, short[] arg2, class146[] arg3, int arg4) {
        int var5 = -46 % ((8 - arg1) / 45);
        field3015++;
        if (arg0 >= arg4) {
            return;
        }
        int var6 = (arg0 + arg4) / 2;
        int var7 = arg0;
        class146 var8 = arg3[var6];
        arg3[var6] = arg3[arg4];
        arg3[arg4] = var8;
        short var9 = arg2[var6];
        arg2[var6] = arg2[arg4];
        arg2[arg4] = var9;
        for (int var10 = arg0; var10 < arg4; var10++) {
            if (var8 == null || arg3[var10] != null && arg3[var10].method1113(-6036, var8) < (var10 & 0x1)) {
                class146 var11 = arg3[var10];
                arg3[var10] = arg3[var7];
                arg3[var7] = var11;
                short var12 = arg2[var10];
                arg2[var10] = arg2[var7];
                arg2[var7++] = var12;
            }
        }
        arg3[arg4] = arg3[var7];
        arg3[var7] = var8;
        arg2[arg4] = arg2[var7];
        arg2[var7] = var9;
        method1411(arg0, (byte) 72, arg2, arg3, var7 - 1);
        method1411(var7 + 1, (byte) 112, arg2, arg3, arg4);
    }
}
