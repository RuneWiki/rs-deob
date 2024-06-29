import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class147 extends class196 {

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "Z")
    private boolean field2461 = true;

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "I")
    private int field2476 = 4096;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "Ljava/util/Random;")
    public static Random field2466 = new Random();

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "Ldf;")
    private static class51 field2468 = class46.method233("You can(Wt add yourself to your own friend list)3", 100);

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "Ldf;")
    public static class51 field2472 = field2468;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "[Lrd;")
    public static class245[] field2471 = new class245[500];

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    public static int field2473 = 0;

    @OriginalMember(owner = "client!gi", name = "mb", descriptor = "Ldf;")
    private static class51 field2481 = class46.method233("skill)2", 100);

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "Ldf;")
    public static class51 field2475 = field2481;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!gi", name = "kb", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!gi", name = "lb", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!gi", name = "nb", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "Lla;")
    public static class91 field2467;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(II)V")
    public static final void method1063(int arg0, int arg1) {
        ++field2462;
        class123.field2082 += arg1 * 128;
        if (~class123.field2082 < ~class207.field3455.length) {
            class123.field2082 -= class207.field3455.length;
            int var2 = (int) (Math.random() * 12.0D);
            class261.method1776(99, class156.field2567[var2]);
        }
        int var3 = 0;
        int var4 = arg1 * 128;
        short var5 = 256;
        int var6 = (-arg1 + var5) * 128;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            int var26 = class37.field570[var3 + var4] + -(class207.field3455[class123.field2082 + var3 & class207.field3455.length + -1] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class37.field570[var3++] = var26;
        }
        for (int var8 = -arg1 + var5; ~var5 < ~var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; ++var24) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class37.field570[var23 + var24] = 255;
                } else {
                    class37.field570[var23 + var24] = 0;
                }
            }
        }
        if (arg0 < 74) {
            field2475 = null;
        }
        for (int var9 = 0; ~var9 > ~(-arg1 + var5); ++var9) {
            class122.field2072[var9] = class122.field2072[arg1 + var9];
        }
        for (int var10 = -arg1 + var5; var10 < var5; ++var10) {
            class122.field2072[var10] = (int) (Math.sin((double) class169.field2750 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class169.field2750 / 15.0D) + Math.sin((double) class169.field2750 / 16.0D) * 12.0D);
            ++class169.field2750;
        }
        class3.field28 += arg1;
        int var11 = ((1 & class179.field2960) + arg1) / 2;
        if (var11 > 0) {
            for (int var12 = 0; var12 < class3.field28; ++var12) {
                int var21 = 2 + (int) (124.0D * Math.random());
                int var22 = (int) (Math.random() * 128.0D) + 128;
                class37.field570[var21 - -(var22 << 7)] = 192;
            }
            class3.field28 = 0;
            for (int var13 = 0; var13 < var5; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; var20 < 128; ++var20) {
                    if (~(var20 - -var11) > -129) {
                        var18 += class37.field570[var11 + var19 + var20];
                    }
                    if (-var11 - 1 + var20 >= 0) {
                        var18 -= class37.field570[-var11 + var19 + -1 + var20];
                    }
                    if (var20 >= 0) {
                        class100.field1675[var19 + var20] = var18 / (var11 * 2 + 1);
                    }
                }
            }
            for (int var14 = 0; var14 < 128; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; var5 > var16; ++var16) {
                    int var17 = var16 * 128;
                    if (~var5 < ~(var11 + var16)) {
                        var15 += class100.field1675[var11 * 128 + (var14 - -var17)];
                    }
                    if (~(var16 + -1 + -var11) <= -1) {
                        var15 -= class100.field1675[var14 - (-var17 - -((var11 + 1) * 128))];
                    }
                    if (~var16 <= -1) {
                        class37.field570[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ldf;Ldf;BI)V")
    public static final void method1064(class51 arg0, class51 arg1, byte arg2, int arg3) {
        if (arg2 <= 43) {
            method1071(6);
        }
        ++field2482;
        class20.method97(arg3, arg0, 3, (class51) null, -1, arg1);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            field2481 = null;
        }
        ++field2464;
        if (class207.method1426((byte) 104, arg0)) {
            client.method1051(class10.field106[arg0], -1, arg3, arg1, arg7, arg6, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(JI)V")
    public static final void method1066(long arg0, int arg1) {
        ++field2463;
        if (~arg0 < -1L) {
            if (arg0 % 10L == (long) arg1) {
                class38.method190((byte) 126, arg0 + -1L);
                class38.method190((byte) 125, 1L);
            } else {
                class38.method190((byte) 127, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZILdf;)V")
    public static final void method1067(boolean arg0, int arg1, class51 arg2) {
        class51 var3 = arg2.method313(109);
        int var4 = 0;
        short[] var5 = new short[16];
        ++field2479;
        for (int var6 = 0; ~class19.field270 < ~var6; ++var6) {
            class222 var9 = class219.method1508(var6, (byte) 123);
            if ((!arg0 || var9.field3901) && ~var9.field3882 == 0 && var9.field3866 == -1 && ~var9.field3878 == -1 && ~var9.field3907.method313(50).method271(var3, -1) != 0) {
                if (~var4 <= -251) {
                    class69.field1117 = null;
                    class120.field1995 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; ++var11) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class218.field3807 = 0;
        class69.field1117 = var5;
        class120.field1995 = var4;
        class51[] var7 = new class51[class120.field1995];
        int var8 = 0;
        if (arg1 > -41) {
            method1067(false, 120, (class51) null);
        }
        while (~class120.field1995 < ~var8) {
            var7[var8] = class219.method1508(var5[var8], (byte) 109).field3907;
            ++var8;
        }
        class218.method1505(var7, class69.field1117, 119);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
    public static final void method1068(byte arg0) {
        ++field2480;
        int var1 = 0;
        for (int var2 = 0; ~var2 > -105; ++var2) {
            for (int var4 = 0; ~var4 > -105; ++var4) {
                if (class184.method1300(var1, class27.field395, (byte) 101, var2, true, var4)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
        }
        int var3 = -1 / ((arg0 - 86) / 37);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method1069(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2469;
        class36 var10 = null;
        for (class36 var11 = (class36) class66.field1085.method1720(arg1); var11 != null; var11 = (class36) class66.field1085.method1712((byte) 112)) {
            if (~var11.field548 == ~arg2 && ~var11.field543 == ~arg0 && var11.field552 == arg6 && var11.field551 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class36();
            var10.field551 = arg4;
            var10.field552 = arg6;
            var10.field548 = arg2;
            var10.field543 = arg0;
            class172.method1208((byte) -19, var10);
            class66.field1085.method1709(-128, var10);
        }
        var10.field558 = arg5;
        var10.field549 = arg3;
        if (!arg1) {
            field2473 = 63;
        }
        var10.field547 = arg9;
        var10.field557 = arg7;
        var10.field544 = arg8;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 == 82) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field2461 = arg1.method897(123) == 1;
                }
            } else {
                this.field2476 = arg1.method876(false);
            }
            ++field2460;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1070(Component arg0, byte arg1) {
        arg0.removeKeyListener(class208.field3475);
        ++field2465;
        if (arg1 <= 125) {
            method1064((class51) null, (class51) null, (byte) 101, -12);
        }
        arg0.removeFocusListener(class208.field3475);
        class5.field57 = -1;
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    public static void method1071(int arg0) {
        field2472 = null;
        field2467 = null;
        field2475 = null;
        field2468 = null;
        field2471 = null;
        field2466 = null;
        field2481 = null;
        if (arg0 != 255) {
            method1063(-66, -10);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)I")
    public static final int method1072(int arg0, boolean arg1) {
        int var2 = (-715827883 & arg0 >>> 1) + (arg0 & 1431655765);
        if (!arg1) {
            field2475 = null;
        }
        int var3 = (var2 & 858993459) - -(var2 >>> 2 & 858993459);
        int var4 = 252645135 & (var3 >>> 4) + var3;
        ++field2477;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return 255 & var6;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        if (arg0 != 11) {
            this.method44(49, (class121) null, (byte) -60);
        }
        ++field2478;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -123);
        if (super.field3285.field3963) {
            int[] var4 = this.method1390(arg1 + -1 & class214.field3717, 0, arg0 + -129);
            int[] var5 = this.method1390(arg1, 0, -123);
            int[] var6 = this.method1390(class214.field3717 & arg1 + 1, 0, -90);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class49.field767; ++var10) {
                int var11 = (var5[class135.field2245 & var10 + 1] + -var5[var10 + -1 & class135.field2245]) * this.field2476;
                int var12 = (var6[var10] + -var4[var10]) * this.field2476;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                }
                if (this.field2461) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var10] = var20;
                var7[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }
}
