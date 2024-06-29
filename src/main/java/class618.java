import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class618 extends class629 implements class602 {

    @OriginalMember(owner = "client!kq", name = "ab", descriptor = "Z")
    private boolean field8351 = false;

    @OriginalMember(owner = "client!kq", name = "T", descriptor = "Ljp;")
    public class374 field8344;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "Z")
    private boolean field8335;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "Lmw;")
    public static class517 field8334 = new class517(33, 11);

    @OriginalMember(owner = "client!kq", name = "Z", descriptor = "Lqj;")
    public static class535 field8350 = new class535(4);

    @OriginalMember(owner = "client!kq", name = "db", descriptor = "Ljb;")
    public static class519 field8354 = new class519(9, 6);

    @OriginalMember(owner = "client!kq", name = "fb", descriptor = "Ljb;")
    public static class519 field8356 = new class519(93, -1);

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!kq", name = "R", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!kq", name = "S", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!kq", name = "U", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!kq", name = "V", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!kq", name = "W", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!kq", name = "X", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!kq", name = "Y", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!kq", name = "bb", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!kq", name = "cb", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!kq", name = "eb", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "Lln;")
    private class398 field8338;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lha;B)V", line = 5)
    public final void method1742(class66 arg0, byte arg1) {
        if (arg1 <= 68) {
            this.method1747((byte) -29);
        }
        this.field8344.method2343(arg0, false);
        ++field8342;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I", line = 16)
    public final int method1748(int arg0) {
        if (arg0 != 5875) {
            this.field8335 = true;
        }
        ++field8339;
        return this.field8344.field5447;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZI[[[Lvda;I)Z", line = 28)
    public static final boolean method3425(int arg0, int arg1, boolean arg2, int arg3, class194[][][] arg4, int arg5) {
        ++field8331;
        byte var6 = arg2 ? 1 : (byte) (255 & class327.field4642);
        if (class641.field8644[class184.field2420][arg5][arg0] == var6) {
            return false;
        } else if (~(4 & class328.field4667[class184.field2420][arg5][arg0]) == -1) {
            return false;
        } else {
            byte var7 = 0;
            class673.field9016[var7] = arg5;
            int var8 = 0;
            if (arg3 < 115) {
                method3425(-89, -127, false, -26, (class194[][][]) null, 39);
            }
            int var35 = var7 + 1;
            class105.field1496[var7] = arg0;
            class641.field8644[class184.field2420][arg5][arg0] = var6;
            while (var35 != var8) {
                int var9 = 65535 & class673.field9016[var8];
                int var10 = 255 & class673.field9016[var8] >> 16;
                int var11 = class673.field9016[var8] >> 24 & 255;
                int var12 = 65535 & class105.field1496[var8];
                int var13 = 255 & class105.field1496[var8] >> 16;
                var8 = var8 + 1 & 4095;
                boolean var14 = false;
                if ((class328.field4667[class184.field2420][var9][var12] & 4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg4 != null) {
                    label244: for (int var16 = class184.field2420 + 1; ~var16 >= -4; ++var16) {
                        if (arg4[var16] != null && (class328.field4667[var16][var9][var12] & 8) == 0) {
                            if (var14 && arg4[var16][var9][var12] != null) {
                                if (arg4[var16][var9][var12].field2527 != null) {
                                    int var17 = class17.method95((byte) -107, var10);
                                    if (~arg4[var16][var9][var12].field2527.field6752 == ~var17 || arg4[var16][var9][var12].field2523 != null && ~arg4[var16][var9][var12].field2523.field6752 == ~var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class17.method95((byte) -89, var11);
                                        if (arg4[var16][var9][var12].field2527.field6752 == var18 || arg4[var16][var9][var12].field2523 != null && arg4[var16][var9][var12].field2523.field6752 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class17.method95((byte) -124, var13);
                                        if (arg4[var16][var9][var12].field2527.field6752 == var19 || arg4[var16][var9][var12].field2523 != null && ~arg4[var16][var9][var12].field2523.field6752 == ~var19) {
                                            continue;
                                        }
                                    }
                                }
                                class194 var20 = arg4[var16][var9][var12];
                                if (var20.field2525 != null) {
                                    for (class511 var21 = var20.field2525; var21 != null; var21 = var21.field7127) {
                                        class539 var22 = var21.field7126;
                                        if (var22 instanceof class602) {
                                            class602 var23 = (class602) var22;
                                            int var24 = var23.method1750(29244);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method1744(21215);
                                            int var26 = var24 | var25 << 6;
                                            if (~var10 == ~var26 || ~var11 != -1 && var11 == var26 || var13 != 0 && ~var13 == ~var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class194 var27 = arg4[var16][var9][var12];
                            if (var27 != null && var27.field2525 != null) {
                                for (class511 var28 = var27.field2525; var28 != null; var28 = var28.field7127) {
                                    class539 var29 = var28.field7126;
                                    if (var29.field7466 != var29.field7455 || ~var29.field7467 != ~var29.field7453) {
                                        for (int var30 = var29.field7466; var30 <= var29.field7455; ++var30) {
                                            for (int var31 = var29.field7467; ~var31 >= ~var29.field7453; ++var31) {
                                                class641.field8644[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class641.field8644[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class645.field8694[class184.field2420 + 1].method1898(var12, var9, (byte) -66);
                    if (~class304.field4276[arg1] > ~var32) {
                        class304.field4276[arg1] = var32;
                    }
                    int var33 = var9 << 9;
                    if (var33 >= class730.field9894[arg1]) {
                        if (class157.field2114[arg1] < var33) {
                            class157.field2114[arg1] = var33;
                        }
                    } else {
                        class730.field9894[arg1] = var33;
                    }
                    int var34 = var12 << 9;
                    if (var34 >= class414.field5958[arg1]) {
                        if (var34 > class23.field237[arg1]) {
                            class23.field237[arg1] = var34;
                        }
                    } else {
                        class414.field5958[arg1] = var34;
                    }
                }
                if (!var14) {
                    if (~var9 <= -2 && ~class641.field8644[class184.field2420][var9 + -1][var12] != ~var6) {
                        class673.field9016[var35] = class670.method3699(class670.method3699(var9 + -1, 1179648), -754974720);
                        class105.field1496[var35] = class670.method3699(1245184, var12);
                        var35 = var35 + 1 & 4095;
                        class641.field8644[class184.field2420][var9 + -1][var12] = var6;
                    }
                    ++var12;
                    if (class393.field5663 > var12) {
                        if (var9 + -1 >= 0 && ~class641.field8644[class184.field2420][var9 - 1][var12] != ~var6 && ~(4 & class328.field4667[class184.field2420][var9][var12]) == -1 && (class328.field4667[class184.field2420][var9 + -1][var12 + -1] & 4) == 0) {
                            class673.field9016[var35] = class670.method3699(1375731712, class670.method3699(var9 + -1, 1179648));
                            class105.field1496[var35] = class670.method3699(1245184, var12);
                            var35 = var35 + 1 & 4095;
                            class641.field8644[class184.field2420][var9 + -1][var12] = var6;
                        }
                        if (~class641.field8644[class184.field2420][var9][var12] != ~var6) {
                            class673.field9016[var35] = class670.method3699(class670.method3699(var9, 5373952), 318767104);
                            class105.field1496[var35] = class670.method3699(5439488, var12);
                            class641.field8644[class184.field2420][var9][var12] = var6;
                            var35 = 4095 & var35 - -1;
                        }
                        if (class102.field1467 > var9 + 1 && ~class641.field8644[class184.field2420][var9 + 1][var12] != ~var6 && (class328.field4667[class184.field2420][var9][var12] & 4) == 0 && (4 & class328.field4667[class184.field2420][var9 + 1][var12 + -1]) == 0) {
                            class673.field9016[var35] = class670.method3699(-1845493760, class670.method3699(var9 + 1, 5373952));
                            class105.field1496[var35] = class670.method3699(5439488, var12);
                            class641.field8644[class184.field2420][var9 + 1][var12] = var6;
                            var35 = 4095 & var35 - -1;
                        }
                    }
                    --var12;
                    if (var9 + 1 < class102.field1467 && class641.field8644[class184.field2420][var9 + 1][var12] != var6) {
                        class673.field9016[var35] = class670.method3699(class670.method3699(var9 + 1, 9568256), 1392508928);
                        class105.field1496[var35] = class670.method3699(var12, 9633792);
                        var35 = var35 - -1 & 4095;
                        class641.field8644[class184.field2420][var9 - -1][var12] = var6;
                    }
                    --var12;
                    if (~var12 <= -1) {
                        if (~(var9 - 1) <= -1 && ~class641.field8644[class184.field2420][var9 + -1][var12] != ~var6 && (class328.field4667[class184.field2420][var9][var12] & 4) == 0 && ~(class328.field4667[class184.field2420][var9 - 1][var12 + 1] & 4) == -1) {
                            class673.field9016[var35] = class670.method3699(class670.method3699(var9 + -1, 13762560), 301989888);
                            class105.field1496[var35] = class670.method3699(var12, 13828096);
                            class641.field8644[class184.field2420][var9 - 1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        if (class641.field8644[class184.field2420][var9][var12] != var6) {
                            class673.field9016[var35] = class670.method3699(-1828716544, class670.method3699(13762560, var9));
                            class105.field1496[var35] = class670.method3699(var12, 13828096);
                            var35 = 4095 & var35 - -1;
                            class641.field8644[class184.field2420][var9][var12] = var6;
                        }
                        if (var9 + 1 < class102.field1467 && ~class641.field8644[class184.field2420][var9 + 1][var12] != ~var6 && ~(4 & class328.field4667[class184.field2420][var9][var12]) == -1 && (4 & class328.field4667[class184.field2420][var9 + 1][var12 + 1]) == 0) {
                            class673.field9016[var35] = class670.method3699(class670.method3699(var9 - -1, 9568256), -771751936);
                            class105.field1496[var35] = class670.method3699(var12, 9633792);
                            class641.field8644[class184.field2420][var9 + 1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                    }
                }
            }
            if (class304.field4276[arg1] != -1000000) {
                class304.field4276[arg1] += 40;
                class730.field9894[arg1] -= 512;
                class157.field2114[arg1] += 512;
                class23.field237[arg1] += 512;
                class414.field5958[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(Lha;B)V", line = 357)
    public final void method1752(class66 arg0, byte arg1) {
        ++field8336;
        this.field8344.method2352((byte) 127, arg0);
        if (arg1 >= -17) {
            this.method122(34, (class66) null, -67, 69);
        }
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)Z", line = 372)
    public final boolean method769(int arg0) {
        if (arg0 > -70) {
            field8356 = null;
        }
        ++field8353;
        return false;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)I", line = 383)
    public final int method1744(int arg0) {
        if (arg0 != 21215) {
            field8334 = null;
        }
        ++field8330;
        return this.field8344.field5474;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)Z", line = 394)
    public final boolean method1747(byte arg0) {
        int var2 = 45 % ((arg0 - -41) / 60);
        ++field8352;
        return this.field8344.method2353(-1);
    }

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "(I)V", line = 404)
    public static void method3426(int arg0) {
        if (arg0 != 13828096) {
            field8354 = null;
        }
        field8350 = null;
        field8356 = null;
        field8354 = null;
        field8334 = null;
    }

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "(I)Z", line = 422)
    public final boolean method777(int arg0) {
        int var2 = -66 / ((-34 - arg0) / 59);
        ++field8345;
        return this.field8351;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V", line = 434)
    public final void method1745(boolean arg0) {
        ++field8343;
        if (!arg0) {
            this.field8351 = true;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILfq;BIILha;Z)V", line = 449)
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        if (arg2 == -103) {
            ++field8347;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lha;Llp;IIIIIZII)V", line = 462)
    public class618(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5907);
        this.field8344 = new class374(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field8335 = ~arg1.field5905 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(Lha;B)V", line = 472)
    public final void method131(class66 arg0, byte arg1) {
        ++field8332;
        class497 var3 = this.field8344.method2341(arg1 ^ 91, arg0, true, 262144, true);
        if (var3 != null) {
            int var4 = super.field2802 >> 9;
            int var5 = super.field2810 >> 9;
            class109 var6 = arg0.method475();
            var6.method814(super.field2802, super.field2815, super.field2810);
            this.field8344.method2347(false, var4, var4, var6, arg0, var5, var5, (byte) -118, var3);
        }
        if (arg1 != 53) {
            field8334 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(Lha;B)Lpia;", line = 499)
    public final class104 method114(class66 arg0, byte arg1) {
        ++field8340;
        class497 var3 = this.field8344.method2341(59, arg0, false, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class109 var4 = arg0.method475();
            var4.method814(super.field2802, super.field2815, super.field2810);
            if (arg1 != 115) {
                return null;
            } else {
                class104 var5 = class568.method3241(1, (byte) -93, this.field8335);
                int var6 = super.field2802 >> 9;
                int var7 = super.field2810 >> 9;
                this.field8344.method2347(true, var6, var6, var4, arg0, var7, var7, (byte) -118, var3);
                if (class408.field5786) {
                    var3.method258(var4, var5.field1479[0], class72.field972, 0);
                } else {
                    var3.method254(var4, var5.field1479[0], 0);
                }
                if (this.field8344.field5452 != null) {
                    class586 var8 = this.field8344.field5452.method1057();
                    if (class408.field5786) {
                        arg0.method524(var8, class72.field972);
                    } else {
                        arg0.method534(var8);
                    }
                }
                this.field8351 = var3.method272() || this.field8344.field5452 != null;
                if (this.field8338 != null) {
                    class478.method2827(true, super.field2802, var3, this.field8338, super.field2810, super.field2815);
                } else {
                    this.field8338 = class122.method882(var3, super.field2810, super.field2802, super.field2815, 74);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "(I)V", line = 549)
    public final void method127(int arg0) {
        if (arg0 == -13127) {
            ++field8333;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljca;B)V", line = 562)
    public final void method3427(class711 arg0, byte arg1) {
        ++field8355;
        int var3 = -112 / ((-63 - arg1) / 35);
        this.field8344.method2349(arg0, true);
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(Lha;B)Lln;", line = 572)
    public final class398 method119(class66 arg0, byte arg1) {
        ++field8346;
        return arg1 > -35 ? null : this.field8338;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)I", line = 588)
    public final int method1750(int arg0) {
        ++field8337;
        return arg0 != 29244 ? 117 : this.field8344.field5456;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)I", line = 599)
    public final int method767(boolean arg0) {
        if (arg0) {
            return 100;
        } else {
            ++field8348;
            return this.field8344.method2342(true);
        }
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)I", line = 610)
    public final int method774(byte arg0) {
        ++field8341;
        if (arg0 != 115) {
            this.method3427((class711) null, (byte) -81);
        }
        return this.field8344.method2351(-94);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)Z", line = 623)
    public final boolean method126(byte arg0) {
        ++field8349;
        if (arg0 != -34) {
            field8356 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILha;II)Z", line = 642)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field8329;
        if (arg2 != 6238) {
            return false;
        } else {
            class497 var5 = this.field8344.method2341(55, arg1, false, 131072, false);
            if (var5 == null) {
                return false;
            } else {
                class109 var6 = arg1.method475();
                var6.method814(super.field2802, super.field2815, super.field2810);
                return !class408.field5786 ? var5.method248(arg0, arg3, var6, false, 0) : var5.method245(arg0, arg3, var6, false, 0, class72.field972);
            }
        }
    }
}
