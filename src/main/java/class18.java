import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class18 extends class283 {

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field253 = -1;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Lih;")
    public static class32 field258 = new class32();

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "[I")
    public static int[] field263 = new int[64];

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "Lna;")
    public static class26 field264 = class69.method505(":clanreq:", (byte) -124);

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "J")
    public static long field262;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILe;I)V", line = 13)
    public static final void method119(int arg0, int arg1, int arg2, class159 arg3, int arg4) {
        field257++;
        if (class13.field221 == arg3 || class126.field1955 >= 400) {
            return;
        }
        class26 var11;
        if (arg3.field2506 == 0) {
            boolean var5 = true;
            if (class13.field221.field2501 != -1 && arg3.field2501 != -1) {
                int var6 = arg3.field2481 < class13.field221.field2481 ? class13.field221.field2481 : arg3.field2481;
                int var7 = class13.field221.field2501 < arg3.field2501 ? class13.field221.field2501 : arg3.field2501;
                int var8 = (var6 * 10 / 100) + var7 + 5;
                int var9 = class13.field221.field2481 - arg3.field2481;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            class26 var10 = class170.field2670 == 1 ? class47.field767 : class322.field5543;
            if (arg3.field2481 < arg3.field2488) {
                var11 = class236.method1587(new class26[] { arg3.method1083(0), var5 ? class149.method1016(arg3.field2481, (byte) -73, class13.field221.field2481) : class301.field5194, class149.field2329, var10, class149.method1019((byte) 9, arg3.field2481), class308.field5297, class149.method1019((byte) 9, arg3.field2488 - arg3.field2481), class224.field3563 }, (byte) -127);
            } else {
                var11 = class236.method1587(new class26[] { arg3.method1083(0), var5 ? class149.method1016(arg3.field2481, (byte) -128, class13.field221.field2481) : class301.field5194, class149.field2329, var10, class149.method1019((byte) 9, arg3.field2481), class224.field3563 }, (byte) -70);
            }
        } else {
            var11 = class236.method1587(new class26[] { arg3.method1083(0), class149.field2329, class322.field5540, class149.method1019((byte) 9, arg3.field2506), class224.field3563 }, (byte) -119);
        }
        if (class134.field2046 == 1) {
            class29.method237(class67.field1059, (long) arg0, (byte) -80, class236.method1587(new class26[] { class236.field3764, class95.field1555, var11 }, (byte) -125), arg4, (short) 1, class110.field1755, arg2);
            class50.field779++;
        } else if (!class86.field1420) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class228.field3596[var12] != null) {
                    class208.field3224++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class170.field2670 == 0 && class228.field3596[var12].method162(-123, class264.field4321)) {
                        if (arg3.field2481 > class13.field221.field2481) {
                            var13 = 2000;
                        }
                        if (class13.field221.field2477 != 0 && arg3.field2477 != 0) {
                            if (class13.field221.field2477 == arg3.field2477) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class273.field4570[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class178.field2801[var12];
                    short var16 = (short) (var13 + var15);
                    class29.method237(class201.field3127[var12], (long) arg0, (byte) -73, class236.method1587(new class26[] { class301.field5194, var11 }, (byte) -78), arg4, var16, class228.field3596[var12], arg2);
                }
            }
        } else if ((class58.field940 & 0x8) != 0) {
            class72.field1109++;
            class29.method237(class254.field4158, (long) arg0, (byte) -58, class236.method1587(new class26[] { class308.field5303, class95.field1555, var11 }, (byte) -116), arg4, (short) 15, class33.field559, arg2);
        }
        if (arg1 <= 0) {
            field262 = -79L;
        }
        for (int var17 = 0; var17 < class126.field1955; var17++) {
            if (class142.field2178[var17] == 60) {
                class252.field4138[var17] = class236.method1587(new class26[] { class301.field5194, var11 }, (byte) -75);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)V", line = 143)
    public static final void method120(byte arg0) {
        if (arg0 <= 51) {
            method119(77, -52, -42, (class159) null, 120);
        }
        field259++;
        class10.method66(96);
        class294.method2067(2);
        class252.method1740(0);
        class35.method298(69);
        class301.method2117((byte) -108);
        class290.method2040((byte) -128);
        class320.method2226(true);
        class21.method140(true);
        class39.method322(0);
        class280.method1965(14073);
        class88.method689((byte) -73);
        class240.method1648(6799);
        class308.method2156(-19761);
        class320.method2227(-108);
        class56.method404(91);
        class23.method147((byte) -41);
        if (class72.field1106 != 0) {
            for (int var1 = 0; var1 < class202.field3141.length; var1++) {
                class202.field3141[var1] = null;
            }
            class95.field1556 = 0;
        }
        class317.method2204(16712751);
        class35.method301(true);
        class295.field4913.method1987(3);
        if (!class255.field4184) {
            ((class13) class200.field3102).method99(0);
        }
        class95.field1548.method37(2);
        class276.field4620.method1893((byte) 56);
        class280.field4661.method1893((byte) 56);
        class109.field1710.method1893((byte) 56);
        class189.field2969.method1893((byte) 56);
        class98.field1597.method1893((byte) 56);
        class36.field593.method1893((byte) 56);
        class80.field1258.method1893((byte) 56);
        class319.field5464.method1893((byte) 56);
        class230.field3646.method1893((byte) 56);
        class96.field1568.method1893((byte) 56);
        class327.field5656.method1893((byte) 56);
        class46.field721.method1987(3);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(III)I", line = 206)
    private final int method121(int arg0, int arg1, int arg2) {
        if (arg1 != 7001) {
            this.method121(-83, 92, 48);
        }
        field254++;
        int var4 = arg2 + (arg0 * 57);
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 219)
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "(I)V", line = 225)
    public static void method122(int arg0) {
        field258 = null;
        field263 = null;
        if (arg0 != -15028) {
            field258 = (class32) null;
        }
        field264 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[I", line = 240)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = 104 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        field261++;
        if (this.field4733.field1406) {
            int var5 = class59.field955[arg0];
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                var4[var6] = this.method121(var5, 7001, class13.field184[var6]) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([Lmj;I[BIIIIZIIB)V", line = 278)
    public static final void method123(class228[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, byte arg10) {
        if (arg10 != -54) {
            return;
        }
        int var11 = -1;
        class82 var12 = new class82(arg2);
        field256++;
        while (true) {
            int var13 = var12.method612((byte) -127);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method617(true);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method642((byte) -51);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg3 == var18 && var17 >= arg8 && var17 < arg8 + 8 && arg9 <= var16 && arg9 + 8 > var16) {
                    class78 var22 = class104.method750(4, var11);
                    int var23 = class116.method807(var16 & 0x7, arg4, var21, var22.field1178, var22.field1171, 1, var17 & 0x7) + arg5;
                    int var24 = class86.method671(var22.field1171, arg4, (byte) 126, var22.field1178, var17 & 0x7, var21, var16 & 0x7) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class228 var25 = null;
                        if (!arg7) {
                            int var26 = arg1;
                            if ((class92.field1492[1][var23][var24] & 0x2) == 2) {
                                var26 = arg1 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg0[var26];
                            }
                        }
                        class100.method739(arg1, !arg7, arg1, arg7, var25, var11, var20, var23, (byte) 50, var24, arg4 + var21 & 0x3);
                    }
                }
            }
        }
    }
}
