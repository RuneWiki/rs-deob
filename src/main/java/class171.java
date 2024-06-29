import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class171 extends class263 {

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    private int field2514 = 585;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "Lok;")
    public static class74 field2517;

    static {
        new class347((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field2518 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(Z)V", line = 7)
    public static void method1178(boolean arg0) {
        field2517 = null;
        if (arg0) {
            method1181(116);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZI)Lkd;", line = 17)
    public static final class411 method1179(boolean arg0, boolean arg1, int arg2) {
        ++field2516;
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
        return !arg1 ? null : (class411) class214.field3053.method3059(39, var3);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lya;IILgo;B)V", line = 30)
    public static final void method1180(class11 arg0, int arg1, int arg2, class310 arg3, byte arg4) {
        ++field2515;
        int var5 = 14 % ((-66 - arg4) / 48);
        class249 var6 = arg3.method1940(true, arg0);
        if (var6 != null) {
            arg0.method84(arg2, arg1, arg3.field4661 + arg2, arg3.field4736 + arg1);
            if (class81.field1164 != 2 && class81.field1164 != 5 && class389.field5862 != null) {
                int var7;
                int var8;
                int var9;
                int var10;
                if (~class350.field5388 != -5) {
                    var7 = class410.field6198.field7671;
                    var8 = 16383 & (int) (-class311.field4836) - -class469.field6881;
                    var9 = class410.field6198.field7681;
                    var10 = 4096 - class230.field3230 * 16;
                } else {
                    var8 = (int) (-class311.field4836) & 16383;
                    var7 = class444.field6528;
                    var10 = 4096;
                    var9 = class382.field5746;
                }
                int var11 = var9 / 32 + 48 + -((class50.field640 + -104) * 2);
                int var12 = class448.field6611 * 4 + 48 + -(var7 / 32) + -((class448.field6611 + -104) * 2);
                class389.field5862.method937((float) arg3.field4661 / 2.0F + (float) arg2, (float) arg3.field4736 / 2.0F + (float) arg1, (float) var11, (float) var12, var10, var8 << 2, var6, arg2, arg1);
                for (class221 var13 = (class221) class182.field2705.method2957(-66); var13 != null; var13 = (class221) class182.field2705.method2947(62)) {
                    int var55 = var13.field3155;
                    int var56 = (16383 & client.field7541.field4348[var55] >> 14) + -class267.field3979;
                    int var57 = (client.field7541.field4348[var55] & 16383) - class241.field3358;
                    int var58 = var56 * 4 - var9 / 32 + 2;
                    int var59 = var57 * 4 + -(var7 / 32) + 2;
                    class474.method2822(var6, arg0, arg3, arg1, var59, var58, client.field7541.field4350[var55], arg2, 4);
                }
                for (int var14 = 0; ~class515.field7563 < ~var14; ++var14) {
                    int var52 = class164.field2440[var14] * 4 - (-2 - -(var9 / 32));
                    int var53 = class535.field7868[var14] * 4 + -(var7 / 32) + 2;
                    class486 var54 = class119.field1824.method248(class249.field3404[var14], 30);
                    if (var54.field7219 != null) {
                        var54 = var54.method2909((byte) 123, class307.field4619);
                        if (var54 == null || ~var54.field7168 == 0) {
                            continue;
                        }
                    }
                    class474.method2822(var6, arg0, arg3, arg1, var53, var52, var54.field7168, arg2, 4);
                }
                for (class449 var15 = (class449) class491.field7318.method3061(-16817); var15 != null; var15 = (class449) class491.field7318.method3066((byte) 122)) {
                    int var49 = (int) (3L & var15.field1739 >> 28);
                    if (~class133.field1990 == ~var49) {
                        int var50 = (int) (16383L & var15.field1739) * 4 + -(var9 / 32) + 2;
                        int var51 = 2 + (int) (16383L & var15.field1739 >> 14) * 4 + -(var7 / 32);
                        class299.method1857(arg1, 116, var50, var6, class268.field3993[0], arg2, arg3, var51);
                    }
                }
                for (int var16 = 0; ~var16 > ~class519.field7609; ++var16) {
                    class351 var45 = class88.field1375[class327.field5114[var16]];
                    if (var45 != null && var45.method2126(65535) && class410.field6198.field7686 == var45.field7686) {
                        class277 var46 = var45.field5409;
                        if (var46 != null && var46.field4148 != null) {
                            var46 = var46.method1734((byte) 66, class307.field4619);
                        }
                        if (var46 != null && var46.field4179 && var46.field4187) {
                            int var47 = var45.field7681 / 32 + -(var9 / 32);
                            int var48 = var45.field7671 / 32 - var7 / 32;
                            if (~var46.field4197 != 0) {
                                class474.method2822(var6, arg0, arg3, arg1, var48, var47, var46.field4197, arg2, 4);
                            } else {
                                class299.method1857(arg1, -84, var47, var6, class268.field3993[1], arg2, arg3, var48);
                            }
                        }
                    }
                }
                int var17 = class146.field2203;
                int[] var18 = class457.field6694;
                for (int var19 = 0; var19 < var17; ++var19) {
                    class480 var37 = class83.field1327[var18[var19]];
                    if (var37 != null && var37.method2865(65535) && class410.field6198 != var37 && ~class410.field6198.field7686 == ~var37.field7686) {
                        int var38 = var37.field7681 / 32 + -(var9 / 32);
                        int var39 = var37.field7671 / 32 + -(var7 / 32);
                        boolean var40 = false;
                        for (int var41 = 0; var41 < class222.field3162; ++var41) {
                            if (var37.field7063.equals(class134.field1996[var41]) && ~class89.field1388[var41] != -1) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; class516.field7572 > var43; ++var43) {
                            if (var37.field7063.equals(class293.field4399[var43].field2496)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (~class410.field6198.field7076 != -1 && var37.field7076 != 0 && class410.field6198.field7076 == var37.field7076) {
                            var44 = true;
                        }
                        if (var37.field7089) {
                            class299.method1857(arg1, 83, var38, var6, class268.field3993[6], arg2, arg3, var39);
                        } else if (var40) {
                            class299.method1857(arg1, 102, var38, var6, class268.field3993[3], arg2, arg3, var39);
                        } else if (!var42) {
                            if (!var44) {
                                class299.method1857(arg1, 122, var38, var6, class268.field3993[2], arg2, arg3, var39);
                            } else {
                                class299.method1857(arg1, -119, var38, var6, class268.field3993[4], arg2, arg3, var39);
                            }
                        } else {
                            class299.method1857(arg1, -100, var38, var6, class268.field3993[5], arg2, arg3, var39);
                        }
                    }
                }
                class427[] var20 = class390.field5874;
                for (int var21 = 0; var20.length > var21; ++var21) {
                    class427 var24 = var20[var21];
                    if (var24 != null && var24.field6358 != 0 && class86.field1350 % 20 < 10) {
                        if (var24.field6358 == 1 && var24.field6361 >= 0 && ~var24.field6361 > ~class88.field1375.length) {
                            class351 var25 = class88.field1375[var24.field6361];
                            if (var25 != null) {
                                int var26 = var25.field7681 / 32 + -(var9 / 32);
                                int var27 = var25.field7671 / 32 + -(var7 / 32);
                                class430.method2543(var6, arg3, var27, var24.field6360, 360000L, var26, 256, arg1, arg2);
                            }
                        }
                        if (var24.field6358 == 2) {
                            int var28 = var24.field6366 / 32 - var9 / 32;
                            int var29 = var24.field6356 / 32 + -(var7 / 32);
                            long var30 = (long) (var24.field6357 << 5);
                            long var32 = var30 * var30;
                            class430.method2543(var6, arg3, var29, var24.field6360, var32, var28, 256, arg1, arg2);
                        }
                        if (~var24.field6358 == -11 && ~var24.field6361 <= -1 && ~var24.field6361 > ~class83.field1327.length) {
                            class480 var34 = class83.field1327[var24.field6361];
                            if (var34 != null) {
                                int var35 = var34.field7681 / 32 + -(var9 / 32);
                                int var36 = var34.field7671 / 32 + -(var7 / 32);
                                class430.method2543(var6, arg3, var36, var24.field6360, 360000L, var35, 256, arg1, arg2);
                            }
                        }
                    }
                }
                if (~class350.field5388 != -5) {
                    if (class504.field7423 != 0) {
                        int var22 = class504.field7423 * 4 - -2 - (var9 / 32 - 2 * (class410.field6198.method2419((byte) 116) + -1));
                        int var23 = class182.field2702 * 4 - -2 - (var7 / 32 + 2 + -(2 * class410.field6198.method2419((byte) 105)));
                        class299.method1857(arg1, 45, var22, var6, class254.field3448[!class94.field1462 ? 0 : 1], arg2, arg3, var23);
                    }
                    arg0.method67(127, 3, -1, arg3.field4661 / 2 + arg2 + -1, 3, arg3.field4736 / 2 + arg1 + -1);
                }
            } else {
                arg0.method132(-16777216, var6, arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I", line = 329)
    public final int[] method33(int arg0, byte arg1) {
        ++field2511;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (arg1 <= 40) {
            field2517 = null;
        }
        if (super.field3917.field91) {
            int var4 = class170.field2509[arg0];
            for (int var5 = 0; ~var5 > ~class367.field5597; ++var5) {
                int var6 = class379.field5711[var5];
                if (~this.field2514 > ~var6 && ~(-this.field2514 + 4096) < ~var6 && ~var4 < ~(-this.field2514 + 2048) && this.field2514 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2514 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field2514 < var6 && ~var6 > ~(this.field2514 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2514;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2514 + 2048);
                } else if (this.field2514 <= var4 && var4 <= 4096 - this.field2514) {
                    if (var6 >= this.field2514 && ~(-this.field2514 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2514 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2514;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2514 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 411)
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)[Lkq;", line = 415)
    public static final class78[] method1181(int arg0) {
        ++field2513;
        if (arg0 != 2) {
            method1182(-62);
        }
        return new class78[] { class149.field2269, class242.field3371, class376.field5672, class436.field6429, class5.field47, class208.field3004 };
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZLgk;)V", line = 432)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (!arg1) {
            field2518 = 113;
        }
        if (arg0 == 0) {
            this.field2514 = arg2.method2727((byte) 43);
        }
        ++field2512;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V", line = 464)
    public static final void method1182(int arg0) {
        ++field2510;
        class382 var1 = class169.field2484;
        synchronized (class169.field2484) {
            class169.field2484.method2287(arg0 ^ -1933252449);
        }
        class382 var2 = class146.field2199;
        synchronized (class146.field2199) {
            class146.field2199.method2287(arg0 + 1933252515);
            if (arg0 != -1933252411) {
                field2517 = null;
            }
        }
    }
}
