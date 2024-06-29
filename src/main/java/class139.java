import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class139 extends class294 {

    @OriginalMember(owner = "client!cu", name = "Xc", descriptor = "I")
    public int field1829 = -1;

    @OriginalMember(owner = "client!cu", name = "Zc", descriptor = "I")
    public int field1831 = -1;

    @OriginalMember(owner = "client!cu", name = "Cc", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!cu", name = "Dc", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!cu", name = "Ec", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!cu", name = "Fc", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!cu", name = "Gc", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!cu", name = "Hc", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!cu", name = "Ic", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!cu", name = "Jc", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!cu", name = "Kc", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!cu", name = "Lc", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!cu", name = "Mc", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!cu", name = "Nc", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!cu", name = "Oc", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!cu", name = "Pc", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!cu", name = "Rc", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!cu", name = "Sc", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!cu", name = "Uc", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!cu", name = "Vc", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!cu", name = "Wc", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!cu", name = "Yc", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!cu", name = "ad", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!cu", name = "Tc", descriptor = "Ldg;")
    public class272 field1825;

    @OriginalMember(owner = "client!cu", name = "Qc", descriptor = "[[Z")
    public static boolean[][] field1822;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILts;BI)V", line = 4)
    public static final void method872(int arg0, class356 arg1, byte arg2, int arg3) {
        if (arg1.field5282 != 0) {
            if (arg1.field5282 != 1) {
                if (arg1.field5282 != 2) {
                    if (arg1.field5282 == 3) {
                        arg1.field5179 = arg1.field5201 * arg0 >> 14;
                    } else if (arg1.field5282 == 4) {
                        arg1.field5179 = (arg1.field5201 * arg0 >> 14) + (-arg1.field5169 + arg0) / 2;
                    } else {
                        arg1.field5179 = -arg1.field5169 + arg0 + -(arg1.field5201 * arg0 >> 14);
                    }
                } else {
                    arg1.field5179 = -arg1.field5169 - arg1.field5201 + arg0;
                }
            } else {
                arg1.field5179 = (-arg1.field5169 + arg0) / 2 + arg1.field5201;
            }
        } else {
            arg1.field5179 = arg1.field5201;
        }
        if (arg2 <= 14) {
            method872(82, (class356) null, (byte) -93, -62);
        }
        if (~arg1.field5161 == -1) {
            arg1.field5209 = arg1.field5251;
        } else if (arg1.field5161 == 1) {
            arg1.field5209 = (arg3 - arg1.field5168) / 2 - -arg1.field5251;
        } else if (~arg1.field5161 == -3) {
            arg1.field5209 = -arg1.field5168 + arg3 + -arg1.field5251;
        } else if (~arg1.field5161 != -4) {
            if (arg1.field5161 == 4) {
                arg1.field5209 = (arg1.field5251 * arg3 >> 14) + (-arg1.field5168 + arg3) / 2;
            } else {
                arg1.field5209 = -(arg1.field5251 * arg3 >> 14) + arg3 + -arg1.field5168;
            }
        } else {
            arg1.field5209 = arg1.field5251 * arg3 >> 14;
        }
        ++field1824;
        if (class27.field438) {
            if (client.method1188(arg1).field7487 != 0 || ~arg1.field5170 == -1) {
                if (~arg1.field5209 > -1) {
                    arg1.field5209 = 0;
                } else if (arg3 < arg1.field5209 + arg1.field5168) {
                    arg1.field5209 = arg3 - arg1.field5168;
                }
                if (arg1.field5179 >= 0) {
                    if (~(arg1.field5179 + arg1.field5169) < ~arg0) {
                        arg1.field5179 = -arg1.field5169 + arg0;
                        return;
                    }
                } else {
                    arg1.field5179 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(B)I", line = 77)
    public final int method873(byte arg0) {
        ++field1816;
        if (arg0 < 114) {
            field1822 = null;
        }
        if (this.field1825.field3797 != null) {
            class272 var2 = this.field1825.method1656(class453.field6591, 87);
            if (var2 != null && ~var2.field3810 != 0) {
                return var2.field3810;
            }
        }
        return this.field1825.field3810 == -1 ? super.method873((byte) 123) : this.field1825.field3810;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V", line = 98)
    public final void method722(int arg0) {
        if (arg0 != 0) {
            method879(96, (float[]) null, (byte) 84);
        }
        ++field1827;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I", line = 110)
    public final int method874(boolean arg0) {
        if (arg0) {
            return -3;
        } else {
            ++field1820;
            if (this.field1825.field3797 != null) {
                class272 var2 = this.field1825.method1656(class453.field6591, -1);
                if (var2 != null && ~var2.field3814 != 0) {
                    return var2.field3814;
                }
            }
            return this.field1825.field3814;
        }
    }

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "(I)Z", line = 131)
    private final boolean method875(int arg0) {
        int var2 = 125 % ((arg0 - 68) / 42);
        ++field1812;
        return this.field1825.field3788;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)I", line = 142)
    public final int method724(byte arg0) {
        if (arg0 >= -30) {
            field1822 = null;
        }
        ++field1811;
        return super.field4267;
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)Z", line = 158)
    public final boolean method723(int arg0) {
        ++field1809;
        return arg0 != 17774;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Leq;Z)Lgl;", line = 171)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field1828;
        if (this.field1825 != null && this.method883(arg0, 2048, 7)) {
            class33 var3 = arg0.method830();
            int var4 = super.field4200.method222(16383);
            var3.method276(var4);
            var3.method275(super.field2959, super.field2970, super.field2966);
            class171 var5 = this.method1767(16643);
            class272 var6 = this.field1825.field3797 == null ? this.field1825 : this.field1825.method1656(class453.field6591, -62);
            if (class118.field1533.field6890 && var6.field3845 && var5.field2315) {
                class168 var7 = ~super.field4215 != 0 && ~super.field4206 == -1 ? class286.field4083.method2602(-24462, super.field4215) : null;
                class168 var8 = super.field4256 == -1 || super.field4209 && var7 != null ? null : class286.field4083.method2602(-24462, super.field4256);
                class327 var9 = class204.method1257(super.field4201, super.field4214, this.field1825.field3793 & 255, -12889, this.field1825.field3816 & 255, super.field4193, super.field4270, super.field4276[0], var8 != null ? super.field4253 : super.field4216, 65535 & this.field1825.field3801, this.field1825.field3858 & 65535, arg0, var8 != null ? var8 : var7, var4, this.field1825.field3806);
                if (var9 != null) {
                    float var10 = arg0.method790();
                    float var11 = arg0.method781();
                    arg0.method773(false);
                    arg0.method821(var10, var11 + -150.0F);
                    var9.method191(var3, (class299) null, 0);
                    arg0.method821(var10, var11);
                    arg0.method773(true);
                }
            }
            class408 var12 = null;
            if (this.method875(110)) {
                var12 = class118.method675(-122, super.field4276.length);
            }
            if (super.field4281 != null) {
                class191 var13 = super.field4281.method2005();
                arg0.method745(super.field4276, var13, var3, var12 != null ? var12.field5983 : null, 0);
            } else {
                arg0.method812(super.field4276, var3, var12 != null ? var12.field5983 : null, 0);
            }
            this.method1779(arg1, super.field4276, 23590, arg0);
            if (super.field4276[2] != null) {
                if (var4 != 0) {
                    super.field4276[2].method171(var4);
                }
                super.field4276[2].method207(-super.field4283.field2185 + super.field2959, -super.field4283.field2197 + super.field2970, -super.field4283.field2183 + super.field2966);
            }
            super.field4196 = class287.field4103;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILdg;)V", line = 246)
    public final void method876(int arg0, class272 arg1) {
        this.field1825 = arg1;
        ++field1815;
        if (super.field4281 != null) {
            super.field4281.method2004();
        }
        if (arg0 != 0) {
            this.field1829 = -7;
        }
    }

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "(B)V", line = 260)
    public static final void method877(byte arg0) {
        ++field1814;
        class5 var1 = class151.field1951;
        synchronized (class151.field1951) {
            class151.field1951.method38((byte) -114);
            int var2 = 36 / ((8 - arg0) / 51);
        }
        class5 var3 = class124.field1607;
        synchronized (class124.field1607) {
            class124.field1607.method38((byte) -126);
        }
    }

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "(I)V", line = 276)
    public static void method878(int arg0) {
        if (arg0 > -56) {
            field1822 = null;
        }
        field1822 = null;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[FB)[F", line = 286)
    public static final float[] method879(int arg0, float[] arg1, byte arg2) {
        ++field1817;
        if (arg2 < 5) {
            field1822 = null;
        }
        float[] var3 = new float[arg0];
        class268.method1643(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)I", line = 302)
    public final int method880(boolean arg0) {
        if (arg0) {
            this.method882(79, -41, 45);
        }
        ++field1813;
        if (this.field1825.field3797 != null) {
            class272 var2 = this.field1825.method1656(class453.field6591, -98);
            if (var2 != null && var2.field3828 != -1) {
                return var2.field3828;
            }
        }
        return this.field1825.field3828;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Leq;I)V", line = 323)
    public final void method361(class134 arg0, int arg1) {
        ++field1810;
        if (this.field1825 != null) {
            if (arg1 != -1) {
                this.method883((class134) null, 68, -27);
            }
            if (super.field4280 || this.method883(arg0, 0, 7)) {
                this.method1779(super.field4280, super.field4276, 23590, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZIIB)V", line = 346)
    public final void method881(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        if (arg5 < 74) {
            field1821 = 27;
        }
        ++field1823;
        super.field2956 = (byte) arg1;
        if (super.field4215 != -1 && ~class286.field4083.method2602(-24462, super.field4215).field2225 == -2) {
            super.field4215 = -1;
        }
        if (~super.field4269 != 0) {
            class366 var7 = class53.field820.method2427(super.field4269, -17773);
            if (var7.field5517 && ~var7.field5501 != 0 && class286.field4083.method2602(-24462, var7.field5501).field2225 == 1) {
                super.field4269 = -1;
            }
        }
        if (super.field4263 != -1) {
            class366 var8 = class53.field820.method2427(super.field4263, -17773);
            if (var8.field5517 && var8.field5501 != -1 && class286.field4083.method2602(-24462, var8.field5501).field2225 == 1) {
                super.field4263 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field4279[0] + arg0;
            int var10 = arg3 - super.field4282[0];
            if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && var10 <= 8) {
                if (super.field4277 < 9) {
                    ++super.field4277;
                }
                for (int var11 = super.field4277; var11 > 0; --var11) {
                    super.field4279[var11] = super.field4279[var11 + -1];
                    super.field4282[var11] = super.field4282[var11 - 1];
                    super.field4278[var11] = super.field4278[var11 + -1];
                }
                super.field4279[0] = arg0;
                super.field4282[0] = arg3;
                super.field4278[0] = 1;
                return;
            }
        }
        super.field4279[0] = arg0;
        super.field4274 = 0;
        super.field4275 = 0;
        super.field4277 = 0;
        super.field4282[0] = arg3;
        super.field2959 = (super.field4279[0] << 7) + (arg4 << 6);
        super.field2966 = (super.field4282[0] << 7) + (arg4 << 6);
        if (super.field4281 != null) {
            super.field4281.method2004();
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V", line = 422)
    public final void method882(int arg0, int arg1, int arg2) {
        ++field1830;
        int var4 = super.field4279[0];
        int var5 = super.field4282[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (~arg2 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg2 == -3) {
            ++var4;
        }
        if (~arg2 == -4) {
            ++var4;
            --var5;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg2 == 5) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~super.field4215 != 0 && ~class286.field4083.method2602(-24462, super.field4215).field2225 == -2) {
            super.field4215 = -1;
        }
        if (arg2 == 7) {
            ++var5;
            --var4;
        }
        if (~super.field4269 != 0) {
            class366 var6 = class53.field820.method2427(super.field4269, arg0 ^ -17766);
            if (var6.field5517 && ~var6.field5501 != 0 && ~class286.field4083.method2602(-24462, var6.field5501).field2225 == -2) {
                super.field4269 = -1;
            }
        }
        if (super.field4263 != -1) {
            class366 var7 = class53.field820.method2427(super.field4263, -17773);
            if (var7.field5517 && ~var7.field5501 != 0 && ~class286.field4083.method2602(-24462, var7.field5501).field2225 == -2) {
                super.field4263 = -1;
            }
        }
        if (super.field4277 < arg0) {
            ++super.field4277;
        }
        for (int var8 = super.field4277; ~var8 < -1; --var8) {
            super.field4279[var8] = super.field4279[var8 - 1];
            super.field4282[var8] = super.field4282[var8 + -1];
            super.field4278[var8] = super.field4278[var8 + -1];
        }
        super.field4279[0] = var4;
        super.field4278[0] = (byte) arg1;
        super.field4282[0] = var5;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILeq;BI)Z", line = 511)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field1819;
        if (this.field1825 != null && this.method883(arg1, 131072, 7)) {
            class33 var5 = arg1.method830();
            int var6 = super.field4200.method222(16383);
            var5.method276(var6);
            var5.method275(super.field2959, super.field2970, super.field2966);
            int var7 = -102 % ((arg2 - -23) / 38);
            for (int var8 = 0; var8 < super.field4276.length; ++var8) {
                if (super.field4276[var8] != null && super.field4276[var8].method184(arg0, arg3, var5, ~this.field1825.field3806 == -2)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Leq;II)Z", line = 547)
    private final boolean method883(class134 arg0, int arg1, int arg2) {
        ++field1818;
        int var4 = arg1;
        class171 var5 = this.method1767(arg2 + 16636);
        class168 var6 = ~super.field4215 != 0 && super.field4206 == 0 ? class286.field4083.method2602(-24462, super.field4215) : null;
        class168 var7 = super.field4256 == -1 || super.field4209 && var6 != null ? null : class286.field4083.method2602(-24462, super.field4256);
        int var8 = var5.field2331;
        int var9 = var5.field2311;
        if (var8 != 0 || ~var9 != -1 || ~var5.field2290 != -1 || ~var5.field2319 != -1) {
            arg1 |= 7;
        }
        boolean var10 = ~super.field4230 != -1 && class263.field3748 >= super.field4239 && ~class263.field3748 > ~super.field4259;
        if (var10) {
            arg1 |= 524288;
        }
        class327 var11 = super.field4276[0] = this.field1825.method1660(var6, class286.field4083, class453.field6591, arg1, super.field4221, arg0, super.field4253, super.field4216, super.field4223, super.field4232, 850, var7, class89.field1220, super.field4261, super.field4238);
        if (var11 == null) {
            return false;
        } else {
            super.field4267 = var11.method195();
            this.method1768(arg2 + -22919, var11);
            int var12 = super.field4200.method222(16383);
            if (var8 == 0 && ~var9 == -1) {
                this.method1772(this.method1773(-50) << 7, 0, 0, this.method1773(-63) << 7, -1897039921, var12);
            } else {
                this.method1772(var9, var5.field2312, var5.field2288, var8, -1897039921, var12);
                if (super.field4201 != 0) {
                    super.field4276[0].method189(super.field4201);
                }
                if (~super.field4214 != -1) {
                    super.field4276[0].method166(super.field4214);
                }
                if (~super.field4193 != -1) {
                    super.field4276[0].method207(0, super.field4193, 0);
                }
            }
            if (var10) {
                var11.method180(super.field4244, super.field4260, super.field4192, super.field4230 & 255);
            }
            if (~super.field4269 != 0 && ~super.field4183 != 0) {
                class366 var13 = class53.field820.method2427(super.field4269, -17773);
                boolean var14 = var13.field5507 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (~super.field4190 != -1) {
                        var15 = var4 | 5;
                    }
                    if (super.field4189 != 0) {
                        var15 |= 2;
                    }
                }
                class327 var16 = super.field4276[1] = var13.method2238(class286.field4083, (byte) 112, super.field4183, super.field4187, arg0, var15, super.field4258);
                if (var16 != null) {
                    if (~super.field4189 != -1) {
                        var16.method207(0, -super.field4189 << 0, 0);
                    }
                    if (~super.field4190 != -1) {
                        var16.method171(super.field4190 * 2048);
                    }
                    if (var14) {
                        if (~super.field4201 != -1) {
                            var16.method189(super.field4201);
                        }
                        if (super.field4214 != 0) {
                            var16.method166(super.field4214);
                        }
                        if (super.field4193 != 0) {
                            var16.method207(0, super.field4193, 0);
                        }
                    }
                }
            } else {
                super.field4276[1] = null;
            }
            if (~super.field4263 != 0 && ~super.field4197 != 0) {
                class366 var17 = class53.field820.method2427(super.field4263, -17773);
                boolean var18 = var17.field5507 == 3 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (super.field4194 != 0) {
                        var19 = var4 | 5;
                    }
                    if (super.field4266 != 0) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class327 var20 = super.field4276[3] = var17.method2239(super.field4197, var19, super.field4218, (byte) 2, class286.field4083, super.field4220, arg0);
                if (var20 != null) {
                    if (super.field4266 != 0) {
                        var20.method207(0, -super.field4266 << 0, 0);
                    }
                    if (super.field4194 != 0) {
                        var20.method171(super.field4194 * 2048);
                    }
                    if (var18) {
                        if (super.field4201 != 0) {
                            var20.method189(super.field4201);
                        }
                        if (~super.field4214 != -1) {
                            var20.method166(super.field4214);
                        }
                        if (super.field4193 != 0) {
                            var20.method207(0, super.field4193, 0);
                        }
                    }
                }
            } else {
                super.field4276[3] = null;
            }
            super.field4276[2] = null;
            if (super.field4283 != null) {
                if (super.field4283.field2187 <= class263.field3748) {
                    super.field4283 = null;
                } else if (class263.field3748 >= super.field4283.field2196) {
                    class327 var21 = super.field4283.method1053((byte) -32, arg0, var4 | 7);
                    if (var21 != null) {
                        var21.method207(-super.field2959 + super.field4283.field2185, super.field4283.field2197 - super.field2970, -super.field2966 + super.field4283.field2183);
                        if (var12 != 0) {
                            var21.method171(var12);
                        }
                        super.field4276[2] = var21;
                    }
                }
            }
            if (arg2 != 7) {
                this.method873((byte) -68);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(Z)Z", line = 747)
    public final boolean method884(boolean arg0) {
        ++field1808;
        if (this.field1825 == null) {
            return false;
        } else {
            return arg0 ? true : true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 764)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        ++field1832;
        if (arg2 != -1) {
            field1821 = 63;
        }
        throw new IllegalStateException();
    }
}
