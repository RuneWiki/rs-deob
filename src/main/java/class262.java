import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class262 extends class649 {

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 3)
    public static final void method1745(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class199.field3402 = true;
        class532.field7660 = class478.field6933.method356() > 0;
        class656.field9336 = arg15;
        class336.field4923 = arg1 >> class662.field9425;
        class63.field996 = arg3 >> class662.field9425;
        class551.field7856 = arg1;
        class703.field9940 = arg3;
        class364.field5572 = arg2;
        class51.field822 = class336.field4923 - class155.field2405;
        if (class51.field822 < 0) {
            class121.field1866 = -class51.field822;
            class51.field822 = 0;
        } else {
            class121.field1866 = 0;
        }
        class398.field5922 = class63.field996 - class155.field2405;
        if (class398.field5922 < 0) {
            class472.field6845 = -class398.field5922;
            class398.field5922 = 0;
        } else {
            class472.field6845 = 0;
        }
        class611.field8618 = class336.field4923 + class155.field2405;
        if (class611.field8618 > class42.field727) {
            class611.field8618 = class42.field727;
        }
        class387.field5808 = class63.field996 + class155.field2405;
        if (class387.field5808 > class54.field870) {
            class387.field5808 = class54.field870;
        }
        boolean[][] var19 = class52.field838;
        boolean[][] var20 = class135.field2156;
        if (class656.field9336) {
            for (int var21 = 0; var21 < class155.field2405 + class155.field2405 + 2; ++var21) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class155.field2405 + class155.field2405 + 2; ++var24) {
                    if (var24 > 1) {
                        class426.field6258[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class336.field4923 - class155.field2405 + var21;
                    int var26 = class63.field996 - class155.field2405 + var24;
                    if (var25 >= 0 && var26 >= 0 && var25 < class42.field727 && var26 < class54.field870) {
                        int var27 = var25 << class662.field9425;
                        int var28 = var26 << class662.field9425;
                        int var29 = class121.field1867[class121.field1867.length - 1].method2160(-102, var26, var25) - (1000 << class662.field9425 - 7);
                        int var30 = class152.field2374 != null ? class152.field2374[0].method2160(-96, var26, var25) + class382.field5732 : class121.field1867[0].method2160(-92, var26, var25) + class382.field5732;
                        var23 = arg16 >= 0 ? class478.field6933.method416(var27, var29, var28, var27, var30, var28, arg16) : class478.field6933.method297(var27, var29, var28, var27, var30, var28);
                        class135.field2156[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class135.field2156[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class426.field6258[var24 - 1] & class426.field6258[var24] & var22 & var23;
                        class52.field838[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class426.field6258[class155.field2405 + class155.field2405] = var22;
                class426.field6258[class155.field2405 + class155.field2405 + 1] = var23;
            }
            if (arg16 >= 0) {
                class199.field3402 = false;
            } else {
                class603.field8538 = arg5;
                class705.field9954 = arg6;
                class541.field7718 = arg7;
                class110.field1723 = arg8;
                class670.field9491 = arg9;
                class736.method4108(arg10, 24997, class478.field6933);
            }
        } else {
            if (class637.field8957 == null) {
                class637.field8957 = new boolean[class42.field727 + class42.field727 + 1][class54.field870 + class42.field727 + 1];
            }
            for (int var32 = 0; var32 < class637.field8957.length; ++var32) {
                for (int var42 = 0; var42 < class637.field8957[0].length; ++var42) {
                    class637.field8957[var32][var42] = true;
                }
            }
            class135.field2156 = class637.field8957;
            class52.field838 = class637.field8957;
            class51.field822 = 0;
            class398.field5922 = 0;
            class611.field8618 = class42.field727;
            class387.field5808 = class54.field870;
            class199.field3402 = false;
        }
        class59.method586(class478.field6933, 0);
        if (!class532.field7659.field8) {
            class564 var33 = class532.field7659.field7;
            for (class48 var34 = (class48) var33.method3272(-114); var34 != null; var34 = (class48) var33.method3274(false)) {
                var34.method3610(-25057);
                class59.method577(var34, (byte) -77);
            }
        }
        if (class532.field7660) {
            for (int var35 = 0; var35 < class145.field2253; ++var35) {
                class96.field1422[var35].method3614(50, arg0, arg14);
            }
        }
        if (class238.field3835) {
            class718.field10072 = class478.field6933.method217();
            class478.field6933.method331(class192.field3327);
            int var36 = (class192.field3327[2] - class192.field3327[0]) / class286.field4406;
            for (int var37 = 0; var37 < class286.field4406 - 1; ++var37) {
                class671.field9501[var37] = (var37 + 1) * var36 + class436.field6358[var37];
            }
            for (int var38 = 0; var38 < class147.field2305.length; ++var38) {
                class147.field2305[var38].method3291();
            }
        }
        if (class576.field8160 != null) {
            if (class238.field3835) {
                class563.method3261(0);
            }
            class733.method4095(true);
            class478.field6933.method350(-1, 1583160, 40, 127);
            class42.method453(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class238.field3835) {
                class618.method3525();
            }
            class478.field6933.method305();
            class733.method4095(false);
        }
        class42.method453(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class238.field3835) {
            for (int var39 = 0; var39 < class386.field5782; ++var39) {
                class370.field5622[var39] = class314.field4726[var39];
            }
            class563.method3261(0);
            for (int var40 = 0; var40 < class147.field2305.length; ++var40) {
                class147.field2305[var40].method3291();
            }
        }
        if (class238.field3835) {
            class618.method3525();
            for (int var41 = 0; var41 < class386.field5782; ++var41) {
                class314.field4726[var41] = class370.field5622[var41];
            }
            if (class23.field228 == 2) {
                int var10002;
                if (class199.field3399[0] < class199.field3399[1]) {
                    if (class671.field9501[0] + class436.field6358[0] > class192.field3327[0]) {
                        var10002 = class436.field6358[0]++;
                    }
                } else if (class199.field3399[0] > class199.field3399[1] && class671.field9501[0] + class436.field6358[0] < class192.field3327[2]) {
                    var10002 = class436.field6358[0]--;
                }
            }
        }
        if (!class656.field9336) {
            class52.field838 = var19;
            class135.field2156 = var20;
        }
        class742.method4160();
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(ILhs;)V", line = 284)
    public class262(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)Z", line = 287)
    public static final boolean method1746(byte arg0, int arg1) {
        if (arg0 > -76) {
            return false;
        } else {
            ++field4072;
            return ~arg1 == -1 || arg1 == 1 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lhs;)V", line = 298)
    public class262(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V", line = 302)
    public final void method134(int arg0) {
        if (~super.field9223 != -2 && super.field9223 != 0) {
            super.field9223 = this.method135(36);
        }
        ++field4071;
        if (arg0 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)I", line = 317)
    public final int method135(int arg0) {
        int var2 = -9 / ((-18 - arg0) / 50);
        ++field4074;
        return 1;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lov;ILvga;I)V", line = 328)
    public static final void method1747(class668 arg0, int arg1, class82 arg2, int arg3) {
        ++field4076;
        if (~class115.field1790 > -51) {
            if (arg2 != null && arg2.field1192 != null && arg2.field1192.length > arg1 && arg2.field1192[arg1] != null) {
                int var4 = arg2.field1192[arg1][0];
                int var5 = var4 >> 8;
                int var6 = (var4 & 253) >> 5;
                if (~arg2.field1192[arg1].length < -2) {
                    int var7 = (int) (Math.random() * (double) arg2.field1192[arg1].length);
                    if (~var7 < -1) {
                        var5 = arg2.field1192[arg1][var7];
                    }
                }
                int var8 = var4 & 31;
                int var9 = 256;
                if (arg2.field1187 != null && arg2.field1202 != null) {
                    var9 = (int) (Math.random() * (double) (arg2.field1202[arg1] + -arg2.field1187[arg1])) - -arg2.field1187[arg1];
                }
                if (arg3 == -26868) {
                    int var10 = arg2.field1190 != null ? arg2.field1190[arg1] : 255;
                    if (~var8 == -1) {
                        if (class145.field2251 == arg0) {
                            if (!arg2.field1193) {
                                class146.method1122(var10, 0, var5, var9, (byte) -113, var6);
                                return;
                            }
                            class522.method3110(0, var9, 50, var10, var5, var6, false);
                        }
                    } else if (class654.field9289.field5435.method155(arg3 ^ -26865) != 0) {
                        int var11 = arg0.field9477 + -256 >> 9;
                        int var12 = arg0.field9475 + -256 >> 9;
                        int var13 = class145.field2251 == arg0 ? 0 : (arg0.field9470 << 24) + (var11 << 16) - -(var12 << 8) + var8;
                        class374.field5649[class115.field1790++] = new class625((byte) (!arg2.field1193 ? 1 : 2), var5, var6, 0, var10, var13, var9, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)I", line = 398)
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            return 20;
        } else {
            ++field4069;
            return 1;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V", line = 410)
    public static final void method1748(int arg0) {
        ++field4070;
        int var1 = 70 / ((arg0 - 36) / 53);
        try {
            if (class442.field6421 == 1) {
                int var2 = class208.field3480.method2336(123);
                if (var2 > 0 && class208.field3480.method2311(-10936)) {
                    int var3 = var2 - class730.field10244;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class208.field3480.method2332(100, var3);
                    return;
                }
                class208.field3480.method2334(64);
                class208.field3480.method2325(true);
                class92.field1376 = null;
                class206.field3459 = null;
                if (class140.field2198 != null) {
                    class442.field6421 = 2;
                } else {
                    class442.field6421 = 0;
                }
            }
            if (class442.field6421 == 3) {
                int var4 = class208.field3480.method2336(123);
                if (~var4 > ~class540.field7712 && class208.field3480.method2311(-10936)) {
                    int var5 = class416.field6104 + var4;
                    if (~var5 < ~class540.field7712) {
                        var5 = class540.field7712;
                    }
                    class208.field3480.method2332(84, var5);
                } else {
                    class416.field6104 = 0;
                    class442.field6421 = 0;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class208.field3480.method2334(64);
            class442.field6421 = 0;
            class206.field3459 = null;
            class259.field4052 = null;
            class92.field1376 = null;
            class140.field2198 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)I", line = 474)
    public final int method1749(int arg0) {
        if (arg0 != 3) {
            method1750(-48, 40, -62, 32, 43, (class544) null);
        }
        ++field4075;
        return super.field9223;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IB)V", line = 489)
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        if (arg1 < -120) {
            ++field4073;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIILha;)V", line = 500)
    public static final void method1750(int arg0, int arg1, int arg2, int arg3, int arg4, class544 arg5) {
        ++field4068;
        arg5.method240(arg3, arg2, arg3 - -arg0, arg2 - -arg1);
        arg5.method3183(arg0, arg1, -16777216, arg2, 79, arg3);
        if (~class612.field8632 <= -101) {
            float var6 = (float) class729.field10226 / (float) class729.field10221;
            int var7 = arg0;
            int var8 = arg1;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg0 * var6);
            } else {
                var7 = (int) ((float) arg1 / var6);
            }
            int var9 = (arg1 - var8) / 2 + arg2;
            int var10 = (-var7 + arg0) / 2 + arg3;
            if (class4.field32 == null || arg0 != class4.field32.method175() || ~arg1 != ~class4.field32.method179()) {
                class729.method4050(class729.field10228, class729.field10239 + class729.field10226, class729.field10228 - -class729.field10221, class729.field10239, var10, var9, var7 + var10, var8 + var9);
                class729.method4042(arg5);
                class4.field32 = arg5.method270(var10, var9, var7, var8, false);
            }
            class4.field32.method182(var10, var9);
            int var11 = class404.field5992 * var7 / class729.field10221;
            int var12 = class106.field1551 * var8 / class729.field10226;
            int var13 = class709.field9986 * var7 / class729.field10221 + var10;
            int var14 = var9 - -var8 + -(class629.field8848 * var8 / class729.field10226) + -var12;
            int var15 = -1996554240;
            if (class519.field7498 == class322.field4757) {
                var15 = -1996488705;
            }
            arg5.method410(var13, var14, var11, var12, var15, arg4);
            arg5.method224(var13, var14, var11, var12, var15, 0);
            if (~class167.field2913 < -1) {
                int var16;
                if (class511.field7416 > 50) {
                    var16 = (-class511.field7416 + 100) * 5;
                } else {
                    var16 = class511.field7416 * 5;
                }
                for (class302 var17 = (class302) class729.field10210.method3463((byte) -50); var17 != null; var17 = (class302) class729.field10210.method3469((byte) 107)) {
                    class277 var18 = class729.field10206.method2550(var17.field4601, -93);
                    if (class31.method159(false, var18)) {
                        if (~class214.field3547 != ~var17.field4601) {
                            if (~class173.field2953 != 0 && ~class173.field2953 == ~var18.field4220) {
                                int var19 = var17.field4604 * var7 / class729.field10221 + var10;
                                int var20 = (-var17.field4605 + class729.field10226) * var8 / class729.field10226 + var9;
                                arg5.method3183(4, 4, 16776960 | var16 << 24, var20 + -2, 60, var19 + -2);
                            }
                        } else {
                            int var21 = var17.field4604 * var7 / class729.field10221 + var10;
                            int var22 = var9 - -((class729.field10226 - var17.field4605) * var8 / class729.field10226);
                            arg5.method3183(4, 4, var16 << 24 | 16776960, var22 + -2, arg4 + -6, var21 + -2);
                        }
                    }
                }
            }
        }
    }
}
