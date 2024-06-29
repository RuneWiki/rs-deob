import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class50 extends class29 {

    @OriginalMember(owner = "client!ib", name = "Bc", descriptor = "Lva;")
    private static class121 field1175 = class107.method797("slide:", -10983);

    @OriginalMember(owner = "client!ib", name = "Lc", descriptor = "Lva;")
    public static class121 field1185 = field1175;

    @OriginalMember(owner = "client!ib", name = "yc", descriptor = "Li;")
    public static class48 field1172 = new class48(30);

    @OriginalMember(owner = "client!ib", name = "Nc", descriptor = "I")
    public static int field1187 = 78;

    @OriginalMember(owner = "client!ib", name = "Oc", descriptor = "Lva;")
    private static class121 field1188 = class107.method797("red:", -10983);

    @OriginalMember(owner = "client!ib", name = "Mc", descriptor = "Lva;")
    public static class121 field1186 = class107.method797("sideicons", -10983);

    @OriginalMember(owner = "client!ib", name = "Rc", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!ib", name = "Sc", descriptor = "Lva;")
    private static class121 field1192 = class107.method797("wave:", -10983);

    @OriginalMember(owner = "client!ib", name = "Tc", descriptor = "Lva;")
    public static class121 field1193 = field1188;

    @OriginalMember(owner = "client!ib", name = "Vc", descriptor = "Lva;")
    public static class121 field1195 = field1192;

    @OriginalMember(owner = "client!ib", name = "Uc", descriptor = "Lbb;")
    public static class9 field1194 = new class9();

    @OriginalMember(owner = "client!ib", name = "Yc", descriptor = "Lva;")
    public static class121 field1198 = class107.method797("mapfunction", -10983);

    @OriginalMember(owner = "client!ib", name = "Zc", descriptor = "Lva;")
    private static class121 field1199 = class107.method797("Password: ", -10983);

    @OriginalMember(owner = "client!ib", name = "Wc", descriptor = "Lva;")
    public static class121 field1196 = field1199;

    @OriginalMember(owner = "client!ib", name = "zc", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ib", name = "Ac", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ib", name = "Cc", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ib", name = "Dc", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ib", name = "Ec", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ib", name = "Fc", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ib", name = "Gc", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ib", name = "Hc", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ib", name = "Ic", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ib", name = "Kc", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ib", name = "Qc", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ib", name = "Jc", descriptor = "Lcc;")
    public class16 field1183;

    @OriginalMember(owner = "client!ib", name = "Xc", descriptor = "Lhe;")
    public static class47 field1197;

    @OriginalMember(owner = "client!ib", name = "Pc", descriptor = "[I")
    public static int[] field1189;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Z", line = 8)
    public static final boolean method358(int arg0, boolean arg1) {
        ++field1190;
        if (arg0 >= 97 && ~arg0 >= -123) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else if (~arg0 <= -49 && arg0 <= 57) {
            return true;
        } else {
            if (!arg1) {
                method364(84);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(B)V", line = 33)
    public static final void method359(byte arg0) {
        ++field1177;
        class103.field2345 = false;
        int var1 = -13 / ((-44 - arg0) / 48);
        class38.field879 = false;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(B)V", line = 48)
    public static final void method360(byte arg0) {
        class18.field392 = 0;
        ++field1181;
        class92.field2087 = 0;
        class128.method1002(false);
        class86.method602(-13354);
        class45.method300(arg0 ^ -12996);
        for (int var1 = 0; ~class18.field392 < ~var1; ++var1) {
            int var3 = class113.field2558[var1];
            if (class115.field2614 != class8.field110[var3].field722) {
                class8.field110[var3].field1183 = null;
                class8.field110[var3] = null;
            }
        }
        if (~class5.field90 != ~class66.field1578.field2507) {
            throw new RuntimeException("gnp1 pos:" + class66.field1578.field2507 + " psize:" + class5.field90);
        } else {
            for (int var2 = 0; class42.field965 > var2; ++var2) {
                if (class8.field110[class1.field7[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class42.field965);
                }
            }
            if (arg0 != 75) {
                field1196 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Z", line = 102)
    public final boolean method232(int arg0) {
        ++field1179;
        if (arg0 != -251272184) {
            return false;
        } else {
            return this.field1183 != null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(B)V", line = 118)
    public static void method361(byte arg0) {
        field1188 = null;
        field1196 = null;
        field1193 = null;
        field1189 = null;
        if (arg0 > 14) {
            field1197 = null;
            field1198 = null;
            field1192 = null;
            field1175 = null;
            field1194 = null;
            field1172 = null;
            field1199 = null;
            field1185 = null;
            field1186 = null;
            field1195 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(IIII)I", line = 153)
    public static final int method362(int arg0, int arg1, int arg2, int arg3) {
        ++field1182;
        if (arg0 != 21428) {
            field1186 = null;
        }
        int var4 = -arg2 + 256;
        return ((arg1 & 16711935) * var4 + (arg3 & 16711935) * arg2 & -16711936) - -(16711680 & (arg1 & 65280) * var4 + (arg3 & 65280) * arg2) >> 8;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)Lrb;", line = 170)
    public final class102 method188(int arg0) {
        ++field1184;
        if (this.field1183 == null) {
            return null;
        } else {
            class41 var2 = super.field793 != -1 && super.field778 == 0 ? class5.method33(9, super.field793) : null;
            class41 var3 = super.field777 == -1 || ~super.field777 == ~super.field740 && var2 != null ? null : class5.method33(9, super.field777);
            if (arg0 < 60) {
                return null;
            } else {
                class102 var4 = this.field1183.method127(var3, super.field733, var2, -9500, super.field785);
                if (var4 == null) {
                    return null;
                } else {
                    var4.method714();
                    super.field784 = var4.field1965;
                    if (~super.field751 != 0 && super.field732 != -1) {
                        class102 var5 = class61.method446(super.field751, -117).method666((byte) 119, super.field732);
                        if (var5 != null) {
                            class102[] var6 = new class102[] { var4, var5 };
                            var5.method691(0, -super.field772, 0);
                            var4 = new class102(var6, 2, true);
                        }
                    }
                    if (~this.field1183.field345 == -2) {
                        var4.field2289 = true;
                    }
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILtc;Ls;)V", line = 215)
    public static final void method363(int arg0, int arg1, class113 arg2, class105 arg3) {
        int var4 = 66 % ((arg0 - -52) / 61);
        ++field1178;
        if (!class46.field1084) {
            class53 var5 = new class53();
            var5.field1221 = arg2.method821(true);
            var5.field1225 = arg2.method822(-708753192);
            var5.field1224 = new int[var5.field1221];
            var5.field1231 = new int[var5.field1221];
            var5.field1238 = new class32[var5.field1221];
            var5.field1228 = new byte[var5.field1221][][];
            var5.field1220 = new class32[var5.field1221];
            var5.field1233 = new int[var5.field1221];
            for (int var6 = 0; ~var5.field1221 < ~var6; ++var6) {
                try {
                    int var7 = arg2.method821(true);
                    if (~var7 != -1 && var7 != 1 && var7 != 2) {
                        if (var7 == 3 || ~var7 == -5) {
                            String var8 = new String(arg2.method861(20356).method960((byte) -57));
                            String var9 = new String(arg2.method861(20356).method960((byte) 115));
                            int var10 = arg2.method821(true);
                            String[] var11 = new String[var10];
                            for (int var12 = 0; ~var12 > ~var10; ++var12) {
                                var11[var12] = new String(arg2.method861(20356).method960((byte) 76));
                            }
                            byte[][] var13 = new byte[var10][];
                            if (~var7 == -4) {
                                for (int var14 = 0; ~var14 > ~var10; ++var14) {
                                    int var15 = arg2.method822(-708753192);
                                    var13[var14] = new byte[var15];
                                    arg2.method828(14362, var15, 0, var13[var14]);
                                }
                            }
                            var5.field1224[var6] = var7;
                            Class[] var16 = new Class[var10];
                            for (int var17 = 0; ~var10 < ~var17; ++var17) {
                                var16[var17] = class8.method49(0, var11[var17]);
                            }
                            var5.field1220[var6] = arg3.method775(var16, var9, class8.method49(0, var8), (byte) 96);
                            var5.field1228[var6] = var13;
                        }
                    } else {
                        String var18 = new String(arg2.method861(20356).method960((byte) -105));
                        String var19 = new String(arg2.method861(20356).method960((byte) -79));
                        int var20 = 0;
                        if (~var7 == -2) {
                            var20 = arg2.method822(-708753192);
                        }
                        var5.field1224[var6] = var7;
                        var5.field1233[var6] = var20;
                        var5.field1238[var6] = arg3.method773(var19, class8.method49(0, var18), 9);
                    }
                } catch (ClassNotFoundException var21) {
                    var5.field1231[var6] = -1;
                } catch (SecurityException var22) {
                    var5.field1231[var6] = -2;
                } catch (NullPointerException var23) {
                    var5.field1231[var6] = -3;
                } catch (Exception var24) {
                    var5.field1231[var6] = -4;
                } catch (Throwable var25) {
                    var5.field1231[var6] = -5;
                }
            }
            class91.field2062.method64(var5, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V", line = 333)
    public static final void method364(int arg0) {
        if (arg0 != 7786) {
            method361((byte) -79);
        }
        ++field1173;
        if (class1.field8 == 0) {
            if (class21.field568 == 1) {
                int var1 = class82.field1909 + -4 + -5;
                int var2 = class15.field280 + -550 + -25;
                if (var2 >= 0 && ~var1 <= -1 && ~var2 > -147 && var1 < 151) {
                    var1 -= 75;
                    var2 -= 73;
                    int var3 = class96.field2149 + class69.field1633 & 2047;
                    int var4 = class83.field1924[var3];
                    int var5 = (class28.field700 - -256) * var4 >> 8;
                    int var6 = class83.field1930[var3];
                    int var7 = (class28.field700 + 256) * var6 >> 8;
                    int var8 = var1 * var7 - var2 * var5 >> 11;
                    int var9 = var1 * var5 + var2 * var7 >> 11;
                    int var10 = class62.field1494.field750 + var9 >> 7;
                    int var11 = -var8 + class62.field1494.field742 >> 7;
                    boolean var12 = class115.method880(true, var11, 25, 0, 0, 1, 0, 0, var10, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                    if (var12) {
                        class60.field1437.method836(0, var2);
                        class60.field1437.method836(0, var1);
                        class60.field1437.method862((byte) 91, class96.field2149);
                        class60.field1437.method836(arg0 ^ 7786, 57);
                        class60.field1437.method836(0, class69.field1633);
                        class60.field1437.method836(0, class28.field700);
                        class60.field1437.method836(0, 89);
                        class60.field1437.method862((byte) 91, class62.field1494.field750);
                        class60.field1437.method862((byte) 91, class62.field1494.field742);
                        class60.field1437.method836(arg0 + -7786, class20.field546);
                        class60.field1437.method836(arg0 + -7786, 63);
                        return;
                    }
                }
            }
        }
    }
}
