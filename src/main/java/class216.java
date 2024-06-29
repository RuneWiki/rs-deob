import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class216 extends class146 {

    @OriginalMember(owner = "client!km", name = "wc", descriptor = "I")
    public int field3235 = -1;

    @OriginalMember(owner = "client!km", name = "Hc", descriptor = "I")
    public int field3246 = -1;

    @OriginalMember(owner = "client!km", name = "qc", descriptor = "Lus;")
    public static class1 field3229 = new class1(19, 5);

    @OriginalMember(owner = "client!km", name = "Ic", descriptor = "Ljava/lang/String;")
    public static String field3247 = "";

    @OriginalMember(owner = "client!km", name = "Kc", descriptor = "J")
    public static long field3249 = 0L;

    @OriginalMember(owner = "client!km", name = "Oc", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!km", name = "Mc", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!km", name = "mc", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!km", name = "nc", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!km", name = "oc", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!km", name = "pc", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!km", name = "rc", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!km", name = "sc", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!km", name = "uc", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!km", name = "vc", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!km", name = "xc", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!km", name = "yc", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!km", name = "zc", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!km", name = "Ac", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!km", name = "Bc", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!km", name = "Cc", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!km", name = "Dc", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!km", name = "Ec", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!km", name = "Fc", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!km", name = "Jc", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!km", name = "Lc", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!km", name = "Nc", descriptor = "Lb;")
    public static class201 field3252;

    @OriginalMember(owner = "client!km", name = "tc", descriptor = "Ldr;")
    public class466 field3232;

    @OriginalMember(owner = "client!km", name = "Gc", descriptor = "[I")
    public static int[] field3245;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILsk;)V")
    public static final void method1382(int arg0, int arg1, int arg2, class405 arg3) {
        class88 var4 = class257.method1605(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field1070 = arg3;
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(B)V")
    public static void method1383(byte arg0) {
        field3247 = null;
        field3245 = null;
        field3252 = null;
        field3229 = null;
        int var1 = 48 / ((arg0 - 72) / 34);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field3239;
        if (arg1 < 16) {
            this.method249(-91);
        }
        if (this.field3232 != null && this.method1388(-1, arg3, 65536)) {
            class282 var5 = arg3.method601();
            int var6 = super.field2153.method583((byte) 127);
            var5.method1011(var6);
            var5.method1012(super.field4331, super.field4322, super.field4317);
            for (int var7 = 0; ~super.field2161.length < ~var7; ++var7) {
                if (super.field2161[var7] != null && super.field2161[var7].method1339(arg0, arg2, var5, ~this.field3232.field6573 == -2)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
    public final int method921(int arg0) {
        ++field3230;
        if (this.field3232.field6526 != null) {
            class466 var2 = this.field3232.method2742(arg0 + -98, class140.field1859);
            if (var2 != null && var2.field6577 != -1) {
                return var2.field6577;
            }
        }
        if (arg0 != 0) {
            this.method1388(54, (class313) null, -104);
        }
        return this.field3232.field6577 == -1 ? super.method921(0) : this.field3232.field6577;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIIIB)V")
    public final void method1384(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = 16 / ((arg5 - 22) / 54);
        ++field3233;
        super.field4319 = (byte) arg3;
        if (super.field2080 != -1 && ~class64.field836.method2081(super.field2080, 0).field2278 == -2) {
            super.field2080 = -1;
        }
        if (~super.field2147 != 0) {
            class327 var8 = class324.field4674.method1279(super.field2147, -2);
            if (var8.field4728 && ~var8.field4714 != 0 && class64.field836.method2081(var8.field4714, 0).field2278 == 1) {
                super.field2147 = -1;
            }
        }
        if (!arg0) {
            int var9 = arg1 - super.field2163[0];
            int var10 = -super.field2159[0] + arg2;
            if (var9 >= -8 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (super.field2168 < 9) {
                    ++super.field2168;
                }
                for (int var11 = super.field2168; ~var11 < -1; --var11) {
                    super.field2163[var11] = super.field2163[var11 - 1];
                    super.field2159[var11] = super.field2159[var11 + -1];
                    super.field2166[var11] = super.field2166[var11 - 1];
                }
                super.field2163[0] = arg1;
                super.field2159[0] = arg2;
                super.field2166[0] = 1;
                return;
            }
        }
        super.field2168 = 0;
        super.field2160 = 0;
        super.field2162 = 0;
        super.field2163[0] = arg1;
        super.field2159[0] = arg2;
        super.field4331 = super.field2163[0] * 128 - -(arg4 * 64);
        super.field4317 = super.field2159[0] * 128 + arg4 * 64;
        if (super.field2158 != null) {
            super.field2158.method556();
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field3236;
        if (this.field3232 != null && this.method1388(-1, arg1, 1024)) {
            class282 var3 = arg1.method601();
            if (arg0 != 0) {
                return null;
            } else {
                int var4 = super.field2153.method583((byte) 125);
                var3.method1011(var4);
                var3.method1012(super.field4331, super.field4322, super.field4317);
                class332 var5 = this.method924((byte) -32);
                class466 var6 = this.field3232.field6526 != null ? this.field3232.method2742(-125, class140.field1859) : this.field3232;
                if (class314.field4438.field5797 && var6.field6519 && var5.field4797) {
                    class153 var7 = ~super.field2080 != 0 && super.field2094 == 0 ? class64.field836.method2081(super.field2080, 0) : null;
                    class153 var8 = super.field2105 == -1 || super.field2121 && var7 != null ? null : class64.field836.method2081(super.field2105, arg0);
                    class491 var9 = class104.method585(super.field2161[0], 255 & this.field3232.field6550, this.field3232.field6573, this.field3232.field6545 & 65535, super.field2143, arg1, this.field3232.field6555 & 65535, super.field2152, 255 & this.field3232.field6565, var8 != null ? super.field2082 : super.field2134, (byte) 27, super.field2086, var4, var8 != null ? var8 : var7, super.field2133);
                    if (var9 != null) {
                        float var10 = arg1.method677();
                        float var11 = arg1.method694();
                        arg1.method618(false);
                        arg1.method686(var10, var11 - 150.0F);
                        var9.method1323(var3, (class98) null, 0);
                        arg1.method686(var10, var11);
                        arg1.method618(true);
                    }
                }
                class477 var12 = null;
                if (this.method1387(-3)) {
                    var12 = class96.method543(super.field2161.length, (byte) 71);
                }
                if (super.field2158 == null) {
                    arg1.method627(super.field2161, var3, var12 != null ? var12.field6696 : null, 0);
                } else {
                    class207 var13 = super.field2158.method552();
                    arg1.method612(super.field2161, var13, var3, var12 != null ? var12.field6696 : null, 0);
                }
                this.method915(20537, false, super.field2161, arg1);
                if (super.field2161[2] != null) {
                    if (var4 != 0) {
                        super.field2161[2].method1311(var4);
                    }
                    super.field2161[2].method1343(-super.field2167.field1433 + super.field4331, -super.field2167.field1441 + super.field4322, super.field4317 - super.field2167.field1427);
                }
                super.field2103 = class492.field6932;
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V")
    public static final void method1385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3238;
        if (arg0 != -1) {
            field3253 = 2;
        }
        if (class168.field2449 <= arg2 && ~arg5 >= ~class94.field1209 && ~class345.field5011 >= ~arg3 && ~arg4 >= ~class485.field6827) {
            class276.method1716(arg4, arg1, arg2, arg3, 114, arg5);
        } else {
            class138.method867(arg3, arg2, arg1, arg4, false, arg5);
        }
    }

    @OriginalMember(owner = "client!km", name = "j", descriptor = "(I)I")
    public final int method323(int arg0) {
        ++field3237;
        return arg0 != 0 ? 5 : super.field2122;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        ++field3248;
        if (arg1 >= -95) {
            this.method323(-58);
        }
        if (this.field3232 != null) {
            if (super.field2164 || this.method1388(-1, arg0, 0)) {
                this.method915(20537, super.field2164, super.field2161, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILdr;)V")
    public final void method1386(int arg0, class466 arg1) {
        ++field3231;
        if (arg0 != -18479) {
            field3251 = -16;
        }
        this.field3232 = arg1;
        if (super.field2158 != null) {
            super.field2158.method556();
        }
    }

    @OriginalMember(owner = "client!km", name = "l", descriptor = "(I)Z")
    private final boolean method1387(int arg0) {
        if (arg0 != -3) {
            this.method1387(-127);
        }
        ++field3241;
        return this.field3232.field6552;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)I")
    public final int method916(byte arg0) {
        if (arg0 != 20) {
            return 47;
        } else {
            ++field3244;
            if (this.field3232.field6526 != null) {
                class466 var2 = this.field3232.method2742(-125, class140.field1859);
                if (var2 != null && var2.field6575 != -1) {
                    return var2.field6575;
                }
            }
            return this.field3232.field6575;
        }
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)I")
    public final int method923(int arg0) {
        if (arg0 != 0) {
            this.method1388(-65, (class313) null, -124);
        }
        ++field3227;
        if (this.field3232.field6526 != null) {
            class466 var2 = this.field3232.method2742(arg0 + -65, class140.field1859);
            if (var2 != null && ~var2.field6533 != 0) {
                return var2.field6533;
            }
        }
        return this.field3232.field6533;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILnp;I)Z")
    private final boolean method1388(int arg0, class313 arg1, int arg2) {
        ++field3228;
        int var4 = arg2;
        class332 var5 = this.method924((byte) -32);
        class153 var6 = super.field2080 != -1 && ~super.field2094 == -1 ? class64.field836.method2081(super.field2080, 0) : null;
        class153 var7 = ~super.field2105 == 0 || super.field2121 && var6 != null ? null : class64.field836.method2081(super.field2105, 0);
        int var8 = var5.field4809;
        int var9 = var5.field4803;
        if (~var8 != -1 || var9 != 0 || var5.field4799 != 0 || var5.field4801 != 0) {
            arg2 |= 7;
        }
        class491 var10 = super.field2161[0] = this.field3232.method2737(super.field2083, (byte) -106, super.field2110, super.field2120, super.field2134, super.field2141, arg2, super.field2130, class64.field836, arg1, class140.field1859, super.field2082, class459.field6436, var7, var6);
        if (var10 == null) {
            return false;
        } else {
            super.field2122 = var10.method1289();
            this.method928(var10, -18464);
            int var11 = super.field2153.method583((byte) 125);
            super.field2133 = 0;
            super.field2143 = 0;
            super.field2152 = 0;
            if (~var8 == -1 && ~var9 == -1) {
                this.method926(true, this.method918(false) << 7, this.method918(false) << 7, var11);
            } else {
                this.method926(true, var8, var9, var11);
                if (~super.field2143 != -1) {
                    super.field2161[0].method1293(super.field2143);
                }
                if (super.field2152 != 0) {
                    super.field2161[0].method1325(super.field2152);
                }
                if (~super.field2133 != -1) {
                    super.field2161[0].method1343(0, super.field2133, 0);
                }
            }
            super.field2161[1] = null;
            if (super.field2147 != arg0 && ~super.field2129 != 0) {
                class327 var12 = class324.field4674.method1279(super.field2147, arg0 ^ 1);
                class491 var13 = var12.method2074(0, class64.field836, super.field2139, arg1, super.field2115, super.field2129, var4 | (var12.field4723 ? 7 : 2));
                if (var13 != null) {
                    var13.method1343(0, -super.field2101, 0);
                    if (var12.field4723 && (var8 != 0 || ~var9 != -1)) {
                        if (super.field2143 != 0) {
                            var13.method1293(super.field2143);
                        }
                        if (~super.field2152 != -1) {
                            var13.method1325(super.field2152);
                        }
                        if (super.field2133 != 0) {
                            var13.method1343(0, super.field2133, 0);
                        }
                    }
                    super.field2161[1] = var13;
                }
            }
            super.field2161[2] = null;
            if (super.field2167 != null) {
                if (class353.field5090 < super.field2167.field1431) {
                    if (class353.field5090 >= super.field2167.field1428) {
                        class491 var14 = super.field2167.method719(arg1, 114, 7 | var4);
                        if (var14 != null) {
                            var14.method1343(super.field2167.field1433 - super.field4331, -super.field4322 + super.field2167.field1441, -super.field4317 + super.field2167.field1427);
                            if (var11 != 0) {
                                var14.method1311(var11);
                            }
                            super.field2161[2] = var14;
                        }
                    }
                } else {
                    super.field2167 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        ++field3240;
        if (arg0 > -105) {
            this.method1389(-121, -4, -111);
        }
        return false;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
    public final void method1389(int arg0, int arg1, int arg2) {
        ++field3225;
        int var4 = super.field2163[0];
        int var5 = super.field2159[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var5;
            ++var4;
        }
        if (arg1 <= -63) {
            if (~arg0 == -3) {
                ++var4;
            }
            if (~arg0 == -4) {
                --var5;
                ++var4;
            }
            if (~arg0 == -5) {
                --var5;
            }
            if (~arg0 == -6) {
                --var4;
                --var5;
            }
            if (arg0 == 6) {
                --var4;
            }
            if (arg0 == 7) {
                ++var5;
                --var4;
            }
            if (super.field2080 != -1 && ~class64.field836.method2081(super.field2080, 0).field2278 == -2) {
                super.field2080 = -1;
            }
            if (~super.field2147 != 0) {
                class327 var6 = class324.field4674.method1279(super.field2147, -2);
                if (var6.field4728 && var6.field4714 != -1 && class64.field836.method2081(var6.field4714, 0).field2278 == 1) {
                    super.field2147 = -1;
                }
            }
            if (~super.field2168 > -10) {
                ++super.field2168;
            }
            for (int var7 = super.field2168; ~var7 < -1; --var7) {
                super.field2163[var7] = super.field2163[var7 + -1];
                super.field2159[var7] = super.field2159[var7 + -1];
                super.field2166[var7] = super.field2166[var7 + -1];
            }
            super.field2163[0] = var4;
            super.field2159[0] = var5;
            super.field2166[0] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(B)Z")
    public final boolean method1390(byte arg0) {
        ++field3226;
        if (this.field3232 == null) {
            return false;
        } else {
            return arg0 != 75 ? true : true;
        }
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        ++field3234;
        if (arg0 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = -88 % ((20 - arg4) / 38);
        ++field3243;
        throw new IllegalStateException();
    }

    static {
        new class326("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field3253 = 0;
        field3251 = 0;
    }
}
