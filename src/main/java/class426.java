import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class426 extends class77 {

    @OriginalMember(owner = "client!ns", name = "dd", descriptor = "I")
    public int field6705 = 1;

    @OriginalMember(owner = "client!ns", name = "Yc", descriptor = "I")
    public int field6712 = -1;

    @OriginalMember(owner = "client!ns", name = "Tc", descriptor = "I")
    public int field6725 = -1;

    @OriginalMember(owner = "client!ns", name = "kd", descriptor = "I")
    public int field6718 = 1;

    @OriginalMember(owner = "client!ns", name = "rd", descriptor = "[Ljava/lang/String;")
    private static final String[] field6731 = new String[] { method3385(method3384("lSYo-")), method3385(method3384("y\u000eY\u0014x")), method3385(method3384("lU\u001bV")), method3385(method3384("lSYxD*")), method3385(method3384("lSYk-")), method3385(method3384("lSYyG*")), method3385(method3384("lSY\u007fD*")), method3385(method3384("lSY}D*")), method3385(method3384("lSYnD*")), method3385(method3384("lSY~D*")), method3385(method3384("lSYiD*")), method3385(method3384("lSYmD*")), method3385(method3384("lSYi-")), method3385(method3384("lSYxG*")), method3385(method3384("lSYv-")), method3385(method3384("lSYoD*")), method3385(method3384("lSYh-")), method3385(method3384("lSYn-")), method3385(method3384("lSYj-")), method3385(method3384("lSY{G*")), method3385(method3384("lSYlD*")) };

    @OriginalMember(owner = "client!ns", name = "cd", descriptor = "Lvn;")
    public static class330 field6711 = new class330(34, 2);

    @OriginalMember(owner = "client!ns", name = "ld", descriptor = "Lvn;")
    public static class330 field6727 = new class330(6, 15);

    @OriginalMember(owner = "client!ns", name = "md", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!ns", name = "Pc", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!ns", name = "Qc", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!ns", name = "Nc", descriptor = "I")
    public int field6704;

    @OriginalMember(owner = "client!ns", name = "od", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!ns", name = "Uc", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!ns", name = "pd", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!ns", name = "Oc", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!ns", name = "fd", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!ns", name = "qd", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!ns", name = "nd", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!ns", name = "Xc", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!ns", name = "ad", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!ns", name = "Zc", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!ns", name = "hd", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!ns", name = "jd", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!ns", name = "Wc", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!ns", name = "ed", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!ns", name = "Sc", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!ns", name = "gd", descriptor = "Lfaa;")
    public class162 field6716;

    @OriginalMember(owner = "client!ns", name = "id", descriptor = "Lsaa;")
    public class345 field6726;

    @OriginalMember(owner = "client!ns", name = "bd", descriptor = "Ljava/lang/String;")
    public String field6706;

    @OriginalMember(owner = "client!ns", name = "Vc", descriptor = "Z")
    public static boolean field6729;

    @OriginalMember(owner = "client!ns", name = "Rc", descriptor = "[I")
    public static int[] field6724;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILha;)Z", line = 7)
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field6713;
            if (this.field6716 != null && this.method3378(true, arg3, 131072)) {
                class486 var5 = arg3.method251();
                int var6 = super.field1118.method4069(true);
                var5.method2458(var6);
                var5.method2480(super.field9985, super.field9972, super.field9983);
                boolean var7 = false;
                for (int var8 = 0; var8 < super.field1207.length; ++var8) {
                    if (super.field1207[var8] != null) {
                        boolean var10000;
                        label69: {
                            if (~this.field6716.field2610 >= -1) {
                                label67: {
                                    if (this.field6716.field2619 != -1) {
                                        if (~this.field6716.field2619 == -2) {
                                            break label67;
                                        }
                                        var10000 = false;
                                    } else {
                                        if (~this.field6716.field2572 == -2) {
                                            break label67;
                                        }
                                        var10000 = false;
                                    }
                                    if (!var10000) {
                                        var10000 = false;
                                        break label69;
                                    }
                                }
                            }
                            var10000 = true;
                        }
                        boolean var9 = var10000;
                        boolean var10;
                        if (!class200.field3163) {
                            var10 = super.field1207[var8].method425(arg2, arg1, var5, var9, this.field6716.field2610);
                        } else {
                            var10 = super.field1207[var8].method429(arg2, arg1, var5, var9, this.field6716.field2610, class547.field8042);
                        }
                        if (var10) {
                            var7 = true;
                            break;
                        }
                    }
                }
                int var11 = 0;
                if (arg0 != 131072) {
                    this.field6726 = null;
                }
                while (var11 < super.field1207.length) {
                    super.field1207[var11] = null;
                    ++var11;
                }
                return var7;
            } else {
                return false;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field6731[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6731[1] : field6731[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I", line = 68)
    public final int method3375(boolean arg0) {
        try {
            if (arg0) {
                this.field6726 = null;
            }
            ++field6714;
            return this.field6716 == null ? 0 : this.field6716.field2610;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6731[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "(I)Z", line = 84)
    private final boolean method3376(int arg0) {
        try {
            if (arg0 < 20) {
                return false;
            } else {
                ++field6707;
                return this.field6716.field2556;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6731[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(B)Z", line = 97)
    public final boolean method3377(byte arg0) {
        try {
            ++field6708;
            if (this.field6716 == null) {
                return false;
            } else {
                if (arg0 != -95) {
                    this.field6716 = null;
                }
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6731[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLha;I)Z", line = 116)
    private final boolean method3378(boolean arg0, class63 arg1, int arg2) {
        try {
            ++field6710;
            if (!arg0) {
                return false;
            } else {
                int var4 = arg2;
                class707 var5 = this.method802(-59);
                class210 var6 = super.field1167 != -1 && ~super.field1186 == -1 ? class397.field6293.method2058(super.field1167, (byte) 119) : null;
                class210 var7 = super.field1121 == -1 || super.field1150 && var6 != null ? null : class397.field6293.method2058(super.field1121, (byte) 125);
                int var8 = var5.field10135;
                int var9 = var5.field10138;
                if (var8 != 0 || var9 != 0 || ~var5.field10155 != -1 || var5.field10136 != 0) {
                    arg2 |= 7;
                }
                boolean var10 = ~super.field1123 != -1 && ~super.field1146 >= ~class431.field6776 && super.field1112 > class431.field6776;
                if (var10) {
                    arg2 |= 524288;
                }
                int var11 = super.field1118.method4069(arg0);
                class499 var12 = super.field1207[0] = this.field6716.method1529(class398.field6315, super.field1177, var11, super.field1140, var7, super.field1161, super.field1119, super.field1176, this.field6726, 65535, class78.field1216, super.field1125, class397.field6293, super.field1164, arg2, super.field1143, var6, arg1);
                if (var12 == null) {
                    return false;
                } else {
                    super.field1158 = var12.method438();
                    super.field1113 = var12.method390();
                    this.method794(-30570, var12);
                    if (var8 == 0 && var9 == 0) {
                        this.method809(0, this.method804(true) << 9, this.method804(true) << 9, 0, (byte) 78, var11);
                    } else {
                        this.method809(var5.field10167, var9, var8, var5.field10174, (byte) 73, var11);
                        if (super.field1185 != 0) {
                            super.field1207[0].method386(super.field1185);
                        }
                        if (super.field1151 != 0) {
                            super.field1207[0].method404(super.field1151);
                        }
                        if (super.field1128 != 0) {
                            super.field1207[0].method395(0, super.field1128, 0);
                        }
                    }
                    if (var10) {
                        var12.method416(super.field1111, super.field1159, super.field1184, 255 & super.field1123);
                    }
                    this.method796(var4, (byte) -98, var8, var11, var9, var5, arg1);
                    return true;
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field6731[13] + arg0 + ',' + (arg1 != null ? field6731[1] : field6731[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(B)V", line = 184)
    public final void method50(byte arg0) {
        try {
            if (arg0 <= -41) {
                ++field6719;
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6731[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(III)V", line = 196)
    public final void method3379(int arg0, int arg1, int arg2) {
        try {
            ++field6720;
            int var4 = super.field1201[0];
            int var5 = super.field1200[0];
            if (~arg2 == arg1) {
                ++var5;
            }
            if (arg2 == 1) {
                ++var4;
                ++var5;
            }
            if (arg2 == 2) {
                ++var4;
            }
            if (arg2 == 3) {
                ++var4;
                --var5;
            }
            if (~arg2 == -5) {
                --var5;
            }
            if (~arg2 == -6) {
                --var4;
                --var5;
            }
            if (arg2 == 6) {
                --var4;
            }
            if (~arg2 == -8) {
                ++var5;
                --var4;
            }
            if (~super.field1167 != 0 && class397.field6293.method2058(super.field1167, (byte) 119).field3315 == 1) {
                super.field1167 = -1;
                super.field1194 = null;
            }
            for (int var6 = 0; var6 < super.field1192.length; ++var6) {
                if (super.field1192[var6].field7459 != -1) {
                    class75 var7 = class779.field11366.method1859((byte) -86, super.field1192[var6].field7459);
                    if (var7.field1084 && var7.field1072 != -1 && class397.field6293.method2058(var7.field1072, (byte) 121).field3315 == 1) {
                        super.field1192[var6].field7459 = -1;
                    }
                }
            }
            if (super.field1205 < 9) {
                ++super.field1205;
            }
            for (int var8 = super.field1205; ~var8 < -1; --var8) {
                super.field1201[var8] = super.field1201[var8 + -1];
                super.field1200[var8] = super.field1200[var8 - 1];
                super.field1198[var8] = super.field1198[var8 + -1];
            }
            super.field1201[0] = var4;
            super.field1200[0] = var5;
            super.field1198[0] = (byte) arg0;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field6731[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V", line = 293)
    public static final void method3380(boolean arg0, int arg1) {
        try {
            class10.field109 = arg1;
            ++field6723;
            class363.field5940.method304(1);
            if (!arg0) {
                method3380(false, 31);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6731[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZILha;ILrda;II)V", line = 306)
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            if (arg5 >= -10) {
                this.field6706 = null;
            }
            ++field6703;
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6731[17] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6731[1] : field6731[2]) + ',' + arg3 + ',' + (arg4 != null ? field6731[1] : field6731[2]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZIIII)V", line = 319)
    public final void method3381(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            super.field9975 = super.field9974 = (byte) arg4;
            int var7 = 68 / ((arg5 - -83) / 43);
            ++field6730;
            if (class541.method4028(arg2, arg0, (byte) 113)) {
                ++super.field9974;
            }
            if (super.field1167 != -1 && class397.field6293.method2058(super.field1167, (byte) 124).field3315 == 1) {
                super.field1194 = null;
                super.field1167 = -1;
            }
            for (int var8 = 0; super.field1192.length > var8; ++var8) {
                if (super.field1192[var8].field7459 != -1) {
                    class75 var9 = class779.field11366.method1859((byte) -46, super.field1192[var8].field7459);
                    if (var9.field1084 && ~var9.field1072 != 0 && class397.field6293.method2058(var9.field1072, (byte) 3).field3315 == 1) {
                        super.field1192[var8].field7459 = -1;
                    }
                }
            }
            if (!arg1) {
                int var10 = -super.field1201[0] + arg0;
                int var11 = -super.field1200[0] + arg2;
                if (var10 >= -8 && var10 <= 8 && ~var11 <= 7 && var11 <= 8) {
                    if (~super.field1205 > -10) {
                        ++super.field1205;
                    }
                    for (int var12 = super.field1205; ~var12 < -1; --var12) {
                        super.field1201[var12] = super.field1201[var12 + -1];
                        super.field1200[var12] = super.field1200[var12 + -1];
                        super.field1198[var12] = super.field1198[var12 + -1];
                    }
                    super.field1201[0] = arg0;
                    super.field1200[0] = arg2;
                    super.field1198[0] = 1;
                    return;
                }
            }
            super.field1201[0] = arg0;
            super.field1206 = 0;
            super.field1205 = 0;
            super.field1208 = 0;
            super.field1200[0] = arg2;
            super.field9985 = (super.field1201[0] << 9) - -(arg3 << 8);
            super.field9983 = (super.field1200[0] << 9) + (arg3 << 8);
            if (super.field1204 != null) {
                super.field1204.method892();
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field6731[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lha;B)Lrga;", line = 407)
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            if (arg1 != -118) {
                this.field6716 = null;
            }
            ++field6717;
            return null;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6731[9] + (arg0 != null ? field6731[1] : field6731[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)I", line = 418)
    public final int method813(byte arg0) {
        try {
            if (arg0 > -118) {
                this.field6712 = 19;
            }
            ++field6701;
            if (this.field6716.field2620 != null) {
                class162 var2 = this.field6716.method1530(-51, class398.field6315);
                if (var2 != null && ~var2.field2571 != 0) {
                    return var2.field2571;
                }
            }
            return this.field6716.field2571 == -1 ? super.method813((byte) -120) : this.field6716.field2571;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6731[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILfaa;)V", line = 440)
    public final void method3382(int arg0, class162 arg1) {
        try {
            this.field6716 = arg1;
            if (arg0 != 0) {
                this.method3382(58, (class162) null);
            }
            ++field6722;
            if (this.field6716 != null) {
                this.field6704 = this.field6716.field2607;
                this.field6706 = this.field6716.field2589;
            }
            if (super.field1204 != null) {
                super.field1204.method892();
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6731[8] + arg0 + ',' + (arg1 != null ? field6731[1] : field6731[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLha;)V", line = 462)
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field6715;
            if (this.field6716 != null) {
                if (super.field1202 || this.method3378(true, arg1, 0)) {
                    class486 var3 = arg1.method251();
                    if (arg0 != -108) {
                        field6729 = true;
                    }
                    var3.method2458(super.field1118.method4069(true));
                    var3.method2480(super.field9985, super.field9972 - 20, super.field9983);
                    this.method810(0, arg1, super.field1202, var3, super.field1207);
                    for (int var4 = 0; var4 < super.field1207.length; ++var4) {
                        super.field1207[var4] = null;
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6731[3] + arg0 + ',' + (arg1 != null ? field6731[1] : field6731[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Z", line = 494)
    public final boolean method53(int arg0) {
        try {
            ++field6709;
            if (arg0 != 47) {
                this.method46(-7, 123, 74, (class63) null);
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6731[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lha;B)Lkv;", line = 510)
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field6721;
            if (this.field6716 != null && this.method3378(true, arg0, 2048)) {
                if (arg1 != 122) {
                    this.field6705 = -87;
                }
                class486 var3 = arg0.method251();
                int var4 = super.field1118.method4069(true);
                var3.method2458(var4);
                class290 var5 = class85.field1280[super.field9975][super.field9985 >> class165.field2688][super.field9983 >> class165.field2688];
                if (var5 != null && var5.field4677 != null) {
                    int var6 = -var5.field4677.field7592 + super.field1137;
                    super.field1137 = (int) ((float) super.field1137 - (float) var6 / 10.0F);
                } else {
                    super.field1137 = (int) ((float) super.field1137 - (float) super.field1137 / 10.0F);
                }
                var3.method2480(super.field9985, super.field9972 + -20 + -super.field1137, super.field9983);
                class707 var7 = this.method802(arg1 + -194);
                class162 var8 = this.field6716.field2620 != null ? this.field6716.method1530(-68, class398.field6315) : this.field6716;
                super.field1203 = false;
                class281 var9 = null;
                if (class623.field8996.field6394.method3019(true) == 1 && var8.field2563 && var7.field10166) {
                    class210 var10 = super.field1167 != -1 && ~super.field1186 == -1 ? class397.field6293.method2058(super.field1167, (byte) 118) : null;
                    class210 var11 = ~super.field1121 == 0 || super.field1150 && var10 != null ? null : class397.field6293.method2058(super.field1121, (byte) 121);
                    class499 var12 = class145.method1332(var11 == null ? super.field1125 : super.field1143, 255 & this.field6716.field2594, var4, 65535 & this.field6716.field2554, super.field1128, var11 != null ? var11 : var10, super.field1151, super.field1185, arg0, this.field6716.field2572, this.field6716.field2628 & 255, super.field1207[0], -85, this.field6716.field2573 & 65535);
                    if (var12 != null) {
                        var9 = class349.method2910(this.method3376(arg1 + -52), super.field1207.length + 1, (byte) -121);
                        super.field1203 = true;
                        arg0.method265(false);
                        if (!class200.field3163) {
                            var12.method426(var3, var9.field4578[super.field1207.length], 0);
                        } else {
                            var12.method423(var3, var9.field4578[super.field1207.length], class547.field8042, 0);
                        }
                        arg0.method265(true);
                    }
                }
                var3.method2458(var4);
                var3.method2480(super.field9985, super.field9972 + -5 + -super.field1137, super.field9983);
                if (var9 == null) {
                    var9 = class349.method2910(this.method3376(104), super.field1207.length, (byte) -117);
                }
                this.method810(0, arg0, false, var3, super.field1207);
                if (class200.field3163) {
                    for (int var13 = 0; ~var13 > ~super.field1207.length; ++var13) {
                        if (super.field1207[var13] != null) {
                            super.field1207[var13].method423(var3, var9.field4578[var13], class547.field8042, 0);
                        }
                    }
                } else {
                    for (int var14 = 0; var14 < super.field1207.length; ++var14) {
                        if (super.field1207[var14] != null) {
                            super.field1207[var14].method426(var3, var9.field4578[var14], 0);
                        }
                    }
                }
                if (super.field1204 != null) {
                    class659 var15 = super.field1204.method893();
                    if (!class200.field3163) {
                        arg0.method191(var15);
                    } else {
                        arg0.method172(var15, class547.field8042);
                    }
                }
                for (int var16 = 0; var16 < super.field1207.length; ++var16) {
                    if (super.field1207[var16] != null) {
                        super.field1203 |= super.field1207[var16].method407();
                    }
                }
                super.field1127 = class680.field9672;
                super.field1207[0] = super.field1207[1] = super.field1207[2] = null;
                return var9;
            } else {
                return null;
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field6731[6] + (arg0 != null ? field6731[1] : field6731[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I", line = 637)
    public final int method806(byte arg0) {
        try {
            ++field6702;
            if (this.field6716.field2620 != null) {
                class162 var2 = this.field6716.method1530(-85, class398.field6315);
                if (var2 != null && ~var2.field2583 != 0) {
                    return var2.field2583;
                }
            }
            int var3 = 94 / ((-86 - arg0) / 38);
            return this.field6716.field2583;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6731[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)I", line = 662)
    public final int method799(byte arg0) {
        try {
            ++field6728;
            if (arg0 >= -37) {
                this.method3379(-75, 87, 126);
            }
            if (this.field6716.field2620 != null) {
                class162 var2 = this.field6716.method1530(-71, class398.field6315);
                if (var2 != null && var2.field2629 != -1) {
                    return var2.field2629;
                }
            }
            return this.field6716.field2629;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6731[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "(I)V", line = 693)
    public static void method3383(int arg0) {
        try {
            field6724 = null;
            if (arg0 != -21230) {
                field6711 = null;
            }
            field6711 = null;
            field6727 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6731[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3384(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3385(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
