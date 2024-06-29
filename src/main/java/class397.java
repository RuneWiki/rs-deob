import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class397 extends class321 {

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "[I")
    public static int[] field5359 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "[I")
    public static int[] field5361 = new int[2];

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field5367 = 0;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public int field5362;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public int field5363;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public int field5364;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public int field5369;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "Ljava/lang/String;")
    public String field5358;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V", line = 14)
    public static void method2243(byte arg0) {
        field5359 = null;
        int var1 = -12 % ((68 - arg0) / 44);
        field5361 = null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILwp;ILr;)V", line = 31)
    public static final void method2244(int arg0, int arg1, class452 arg2, int arg3, class564 arg4) {
        field5366++;
        class598 var5 = arg2.method2607(-56, arg4);
        if (var5 == null) {
            return;
        }
        arg4.method982(arg3, arg1, arg3 + arg2.field6483, arg1 - -arg2.field6443);
        if (class16.field130 == 2 || class16.field130 == 5 || class256.field3204 == null) {
            arg4.method1036(-16777216, var5, arg3, arg1);
        } else {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class538.field7572 == 4) {
                var8 = class672.field9356;
                var9 = 4096;
                var6 = (int) (-class508.field7300) & 0x3FFF;
                var7 = class436.field6158;
            } else {
                var6 = (int) (-class508.field7300) + class302.field3748 & 0x3FFF;
                var7 = class362.field4859.field5176;
                var8 = class362.field4859.field5179;
                var9 = 4096 - (class373.field5085 * 16);
            }
            int var10 = (var8 / 128) + 48 + 208 - class142.field1574 * 2;
            int var11 = class140.field1550 * 4 + 48 - (var7 / 128) - (class140.field1550 + -104) * 2;
            class256.field3204.method2995((float) arg2.field6483 / 2.0F + (float) arg3, (float) arg2.field6443 / 2.0F + (float) arg1, (float) var10, (float) var11, var9, var6 << 2, var5, arg3, arg1);
            for (class22 var12 = (class22) class138.field1523.method3434((byte) 2); var12 != null; var12 = (class22) class138.field1523.method3430(true)) {
                int var58 = var12.field168;
                int var59 = ((class313.field3891.field2040[var58] & 0xFFFE415) >> 14) - class26.field245;
                int var60 = (class313.field3891.field2040[var58] & 0x3FFF) - class231.field2860;
                int var61 = var59 * 4 + 2 - (var8 / 128);
                int var62 = var60 * 4 + 2 - var7 / 128;
                class509.method2908(var5, arg1, var62, arg2, var61, arg0 + 16777220, arg3, arg4, class313.field3891.field2041[var58]);
            }
            for (int var13 = 0; var13 < class154.field1709; var13++) {
                int var55 = class263.field3288[var13] * 4 + 2 - (var8 / 128);
                int var56 = class266.field3325[var13] * 4 + 2 - (var7 / 128);
                class638 var57 = class364.field4891.method2134(class656.field9235[var13], true);
                if (var57.field8974 != null) {
                    var57 = var57.method3597(-1, class628.field8859);
                    if (var57 == null || var57.field9069 == -1) {
                        continue;
                    }
                }
                class509.method2908(var5, arg1, var56, arg2, var55, arg0 + 16777220, arg3, arg4, var57.field9069);
            }
            for (class310 var14 = (class310) class200.field2354.method3674(127); var14 != null; var14 = (class310) class200.field2354.method3672(-1)) {
                int var50 = (int) (var14.field4176 >> 28 & 0x3L);
                if (class421.field5610 == var50) {
                    int var51 = (int) (var14.field4176 & 0x3FFFL) - class26.field245;
                    int var52 = (int) (var14.field4176 >> 14 & 0x3FFFL) - class231.field2860;
                    int var53 = var51 * 4 + 2 - (var8 / 128);
                    int var54 = var52 * 4 + 2 - var7 / 128;
                    class517.method2941(var54, class631.field8881[0], var5, arg3, arg2, 124, var53, arg1);
                }
            }
            for (int var15 = 0; var15 < class651.field9144; var15++) {
                class214 var45 = (class214) class274.field3433.method3669((long) class398.field5375[var15], -1);
                if (var45 != null) {
                    class600 var46 = var45.field2601;
                    if (var46.method3359(-124) && class362.field4859.field5166 == var46.field5166) {
                        class210 var47 = var46.field8461;
                        if (var47 != null && var47.field2492 != null) {
                            var47 = var47.method1247((byte) 97, class628.field8859);
                        }
                        if (var47 != null && var47.field2491 && var47.field2499) {
                            int var48 = var46.field5179 / 128 - (var8 / 128);
                            int var49 = var46.field5176 / 128 - (var7 / 128);
                            if (var47.field2483 == -1) {
                                class517.method2941(var49, class631.field8881[1], var5, arg3, arg2, 125, var48, arg1);
                            } else {
                                class509.method2908(var5, arg1, var49, arg2, var48, 4, arg3, arg4, var47.field2483);
                            }
                        }
                    }
                }
            }
            int var16 = class306.field3786;
            int[] var17 = class396.field5353;
            for (int var18 = 0; var18 < var16; var18++) {
                class236 var37 = class139.field1540[var17[var18]];
                if (var37 != null && var37.method1408(-126) && !var37.field2930 && class362.field4859 != var37 && class362.field4859.field5166 == var37.field5166) {
                    int var38 = var37.field5179 / 128 - var8 / 128;
                    int var39 = var37.field5176 / 128 - (var7 / 128);
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class699.field9804; var41++) {
                        if (var37.field2893.equals(class703.field9867[var41]) && class380.field5151[var41] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    for (int var43 = 0; var43 < class288.field3603; var43++) {
                        if (var37.field2893.equals(class145.field1611[var43].field9239)) {
                            var42 = true;
                            break;
                        }
                    }
                    boolean var44 = false;
                    if (class362.field4859.field2938 != 0 && var37.field2938 != 0 && class362.field4859.field2938 == var37.field2938) {
                        var44 = true;
                    }
                    if (var37.field2895) {
                        class517.method2941(var39, class631.field8881[6], var5, arg3, arg2, arg0 ^ 0xFF000017, var38, arg1);
                    } else if (var40) {
                        class517.method2941(var39, class631.field8881[3], var5, arg3, arg2, 126, var38, arg1);
                    } else if (var42) {
                        class517.method2941(var39, class631.field8881[5], var5, arg3, arg2, -119, var38, arg1);
                    } else if (var44) {
                        class517.method2941(var39, class631.field8881[4], var5, arg3, arg2, -113, var38, arg1);
                    } else {
                        class517.method2941(var39, class631.field8881[2], var5, arg3, arg2, -69, var38, arg1);
                    }
                }
            }
            class99[] var19 = class497.field7195;
            for (int var20 = 0; var20 < var19.length; var20++) {
                class99 var23 = var19[var20];
                if (var23 != null && var23.field1066 != 0 && class678.field9539 % 20 < 10) {
                    if (var23.field1066 == 1) {
                        class214 var24 = (class214) class274.field3433.method3669((long) var23.field1071, -1);
                        if (var24 != null) {
                            class600 var25 = var24.field2601;
                            int var26 = var25.field5179 / 128 - (var8 / 128);
                            int var27 = var25.field5176 / 128 - (var7 / 128);
                            class538.method3033(var23.field1059, var27, (byte) 50, 360000L, arg3, var26, var5, arg1, arg2);
                        }
                    }
                    if (var23.field1066 == 2) {
                        int var28 = var23.field1070 / 128 - (var8 / 128);
                        int var29 = var23.field1063 / 128 - (var7 / 128);
                        long var30 = (long) (var23.field1062 << 7);
                        long var32 = var30 * var30;
                        class538.method3033(var23.field1059, var29, (byte) 94, var32, arg3, var28, var5, arg1, arg2);
                    }
                    if (var23.field1066 == 10 && var23.field1071 >= 0 && var23.field1071 < class139.field1540.length) {
                        class236 var34 = class139.field1540[var23.field1071];
                        if (var34 != null) {
                            int var35 = var34.field5179 / 128 - (var8 / 128);
                            int var36 = var34.field5176 / 128 - (var7 / 128);
                            class538.method3033(var23.field1059, var36, (byte) 91, 360000L, arg3, var35, var5, arg1, arg2);
                        }
                    }
                }
            }
            if (class538.field7572 != 4) {
                if (class248.field3078 != 0) {
                    int var21 = class248.field3078 * 4 + 2 - (var8 / 128) - (-(class362.field4859.method1414(-31789) * 2) + 2);
                    int var22 = class184.field2065 * 4 + class362.field4859.method1414(arg0 ^ 0xFF83D3) * 2 + 2 - (var7 / 128) - 2;
                    class517.method2941(var22, class421.field5602[class556.field7946 ? 1 : 0], var5, arg3, arg2, 125, var21, arg1);
                }
                if (!class362.field4859.field2930) {
                    arg4.method3206(3, (byte) 75, arg2.field6483 / 2 + arg3 - 1, arg1 - -(arg2.field6443 / 2) + -1, -1, 3);
                }
            }
        }
        if (arg0 != -16777216) {
            field5367 = 10;
        }
    }
}
