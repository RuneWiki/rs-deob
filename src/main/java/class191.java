import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class191 extends class200 {

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    private int field3420 = 1;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    private int field3419 = 204;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    private int field3416 = 1;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "Lid;")
    public static class149 field3425 = class60.method382("<br>(X100(U(Y", (byte) 85);

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "Lid;")
    private static class149 field3431 = class60.method382("Ok", (byte) 15);

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "Lid;")
    public static class149 field3428 = class60.method382(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 81);

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "Lid;")
    public static class149 field3432 = class60.method382(")4l=", (byte) 26);

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "Lid;")
    public static class149 field3433 = field3431;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)[Lch;")
    public static final class282[] method1298(int arg0) {
        class282[] var1 = new class282[class84.field1528];
        ++field3434;
        if (arg0 <= 18) {
            method1299(67, 83);
        }
        for (int var2 = 0; class84.field1528 > var2; ++var2) {
            var1[var2] = new class282(class251.field4406, class286.field5082, class147.field2651[var2], class18.field259[var2], class283.field5005[var2], class55.field991[var2], class73.field1276[var2], class108.field1865);
        }
        class103.method731(false);
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            for (int var4 = 0; ~class137.field2515 < ~var4; ++var4) {
                int var5 = class73.field1263[var4];
                int var6 = this.field3416 * var5 >> 12;
                int var7 = class93.field1644[arg0];
                int var8 = this.field3420 * var7 >> 12;
                int var9 = var7 % (4096 / this.field3420) * this.field3420;
                int var10 = var5 % (4096 / this.field3416) * this.field3416;
                if (this.field3419 > var9) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field3419) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field3419 < ~var10) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        ++field3437;
        if (arg1 != 55) {
            this.field3420 = 126;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)V")
    public static final void method1299(int arg0, int arg1) {
        class41.field648.method1289(arg0, 115);
        ++field3417;
        if (arg1 == 4) {
            class255.field4461.method1289(arg0, arg1 ^ 86);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3419 = arg0.method485(-2386);
                }
            } else {
                this.field3420 = arg0.method489((byte) -73);
            }
        } else {
            this.field3416 = arg0.method489((byte) 119);
        }
        if (!arg1) {
            method1301((byte) -13);
        }
        ++field3427;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field3430;
        if (~class257.field4496 >= ~arg7 && arg1 <= class192.field3449 && ~arg5 <= ~class224.field3940 && ~arg2 >= ~class94.field1655) {
            class174.method1238(arg1, true, arg2, arg0, arg5, arg3, arg4, arg7);
        } else {
            class139.method970(arg1, (byte) -101, arg0, arg2, arg4, arg5, arg7, arg3);
        }
        if (arg6) {
            method1303(-97, -18, 78, -99, (byte) -50, -34, 110, -114, 83, -71);
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field3433 = null;
        field3432 = null;
        if (arg0 < 118) {
            method1298(-9);
        }
        field3428 = null;
        field3431 = null;
        field3425 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBIIIILob;)V")
    public static final void method1302(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class131 arg6) {
        if (arg1 != 45) {
            field3431 = null;
        }
        class47.method294(arg3, arg0, false, arg6.field2340, arg4, arg5, arg2, arg6.field2347);
        ++field3435;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != -121) {
            method1302(-52, (byte) 69, 110, -38, -57, 7, (class131) null);
        }
        ++field3426;
        if (~arg5 == ~arg7 && ~arg6 == ~arg9 && ~arg1 == ~arg3 && ~arg0 == ~arg2) {
            class48.method310(arg0, (byte) 67, arg8, arg3, arg6, arg5);
        } else {
            int var10 = arg5;
            int var11 = arg6;
            int var12 = arg5 * 3;
            int var13 = arg6 * 3;
            int var14 = arg9 * 3;
            int var15 = arg1 * 3;
            int var16 = arg2 * 3;
            int var17 = arg7 * 3;
            int var18 = -arg5 + arg3 - (var15 - var17);
            int var19 = -var12 + var17;
            int var20 = -var17 + var15 + -var17 + var12;
            int var21 = -var14 + var13 + var16 - var14;
            int var22 = arg0 - var16 + var14 + -arg6;
            int var23 = -var13 + var14;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var25;
                int var28 = var18 * var26;
                int var29 = var22 * var26;
                int var30 = var21 * var25;
                int var31 = var19 * var24;
                int var32 = var23 * var24;
                int var33 = (var28 + var31 + var27 >> 12) + arg5;
                int var34 = (var29 + var30 + var32 >> 12) + arg6;
                class48.method310(var34, (byte) 67, arg8, var33, var11, var10);
                var11 = var34;
                var10 = var33;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lid;II)V")
    public static final void method1304(class149 arg0, int arg1, int arg2) {
        ++field3423;
        class149 var3 = arg0.method1058(-11662).method1022(arg2 + 534);
        boolean var4 = false;
        for (int var5 = 0; class253.field4432 > var5; ++var5) {
            class127 var6 = class107.field1851[class251.field4407[var5]];
            if (var6 != null && var6.field2243 != null && var6.field2243.method1048(arg2 ^ 632, var3)) {
                class71.method445(1, var6.field2400[0], var6.field2333[0], 1, (byte) -6, false, 0, 0, class77.field1449.field2400[0], 0, 2, class77.field1449.field2333[0]);
                var4 = true;
                if (arg1 == 1) {
                    class208.field3720.method162(2, 68);
                    ++class276.field4925;
                    class208.field3720.method516((byte) 103, class251.field4407[var5]);
                } else if (~arg1 == -5) {
                    ++class1.field20;
                    class208.field3720.method162(2, 180);
                    class208.field3720.method516((byte) 119, class251.field4407[var5]);
                } else if (~arg1 != -6) {
                    if (~arg1 == -7) {
                        class208.field3720.method162(2, 133);
                        class208.field3720.method509(class251.field4407[var5], 1608904784);
                        ++class270.field4862;
                    } else if (arg1 == 7) {
                        ++class20.field300;
                        class208.field3720.method162(arg2 + 536, 114);
                        class208.field3720.method516((byte) -106, class251.field4407[var5]);
                    }
                } else {
                    ++class176.field3219;
                    class208.field3720.method162(2, 4);
                    class208.field3720.method509(class251.field4407[var5], 1608904784);
                }
                break;
            }
        }
        if (!var4) {
            class264.method1841(true, class237.method1603(new class149[] { class261.field4630, var3 }, -118), class171.field3158, 0);
        }
        if (arg2 != -534) {
            method1302(1, (byte) 37, 39, 70, -38, 36, (class131) null);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljb;IIIIII)Z")
    public static final boolean method1305(class268 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class185 var7 = class123.method865(arg0.field4837, arg1 + -23245);
        ++field3424;
        if (~var7.field3342 == 0) {
            return true;
        } else {
            int var8;
            if (!arg0.field4835) {
                var8 = 0;
            } else {
                int var9 = arg0.field4803 + arg6;
                var8 = var9 & 3;
            }
            class282 var10 = var7.method1277(var8, (byte) -104);
            if (var10 == null) {
                return false;
            } else {
                int var11 = arg0.field4820;
                if (arg1 != 23279) {
                    field3422 = 118;
                }
                int var12 = arg0.field4787;
                if ((1 & var8) == 1) {
                    var12 = arg0.field4820;
                    var11 = arg0.field4787;
                }
                int var13 = var10.field3601;
                int var14 = var10.field3589;
                if (var7.field3340) {
                    var14 = var12 * 4;
                    var13 = var11 * 4;
                }
                if (var7.field3331 == 0) {
                    var10.method1933(arg5 * 4 + 48, 48 - -((104 - (arg3 + var12)) * 4), var13, var14);
                } else {
                    var10.method1934(48 - -(arg5 * 4), (104 - (arg3 + var12)) * 4 + 48, var13, var14, var7.field3331);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }
}
