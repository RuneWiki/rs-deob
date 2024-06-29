import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class347 extends class526 implements class706 {

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Z")
    private boolean field4880;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "B")
    private byte field4879;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Z")
    private boolean field4884;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "S")
    private short field4903;

    @OriginalMember(owner = "client!sc", name = "mb", descriptor = "Z")
    private boolean field4910;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "Z")
    private boolean field4881;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lka;")
    private class471 field4896;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "Lr;")
    private class180 field4895;

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "S")
    public static short field4907 = 256;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Lkk;")
    public static class188 field4885 = new class188(512);

    @OriginalMember(owner = "client!sc", name = "lb", descriptor = "Lpca;")
    public static class714 field4909 = new class714(50);

    @OriginalMember(owner = "client!sc", name = "pb", descriptor = "[I")
    public static int[] field4913 = new int[13];

    @OriginalMember(owner = "client!sc", name = "ob", descriptor = "Ldp;")
    public static class3 field4912 = new class3();

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!sc", name = "kb", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!sc", name = "nb", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!sc", name = "qb", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "Lkj;")
    private class566 field4901;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sc", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field4915;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2247(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z", line = 6)
    public final boolean method751(boolean arg0) {
        ++field4899;
        if (arg0) {
            return true;
        } else {
            return this.field4896 != null ? this.field4896.method224() : false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIII)Z", line = 24)
    public static final boolean method2242(byte arg0, int arg1, int arg2, int arg3) {
        ++field4902;
        boolean var4 = true;
        class706 var5 = (class706) class252.method1672(arg3, arg2, arg1);
        if (var5 != null) {
            var4 &= class84.method641(var5, false);
        }
        if (arg0 != 92) {
            field4885 = null;
        }
        class706 var6 = (class706) class243.method1557(arg3, arg2, arg1, field4915 != null ? field4915 : (field4915 = method2247("ip")));
        if (var6 != null) {
            var4 &= class84.method641(var6, false);
        }
        class706 var7 = (class706) class434.method2639(arg3, arg2, arg1);
        if (var7 != null) {
            var4 &= class84.method641(var7, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Z", line = 50)
    public final boolean method867(byte arg0) {
        ++field4906;
        if (arg0 < 82) {
            field4911 = -77;
        }
        return this.field4881;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lha;III)Z", line = 61)
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this.method752((class58) null, -97, -108, -5);
        }
        ++field4908;
        class471 var5 = this.method2244(arg1 + -102, arg0, 131072);
        if (var5 != null) {
            class513 var6 = arg0.method439();
            var6.method339(super.field1264, super.field1255, super.field1250);
            return class180.field2409 ? var5.method229(arg3, arg2, var6, false, 0, class516.field7361) : var5.method233(arg3, arg2, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "(I)V", line = 87)
    public final void method614(int arg0) {
        ++field4878;
        this.field4880 = false;
        if (arg0 != 26062) {
            field4913 = null;
        }
        if (this.field4896 != null) {
            this.field4896.method242(this.field4896.method228() & -65537);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lha;B)V", line = 106)
    public final void method864(class58 arg0, byte arg1) {
        ++field4897;
        Object var3 = null;
        if (arg1 != -73) {
            this.method864((class58) null, (byte) 74);
        }
        class180 var5;
        if (this.field4895 == null && this.field4881) {
            class102 var4 = this.method2245(110, arg0, 262144, true);
            var5 = var4 != null ? var4.field1214 : null;
        } else {
            var5 = this.field4895;
            this.field4895 = null;
        }
        if (var5 != null) {
            class412.method2537(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(BLha;)Lml;", line = 133)
    public final class387 method755(byte arg0, class58 arg1) {
        ++field4900;
        if (this.field4896 == null) {
            return null;
        } else {
            class513 var3 = arg1.method439();
            var3.method339(super.field1264, super.field1255, super.field1250);
            class387 var4 = class65.method544(this.field4910, 1, 24824);
            if (class180.field2409) {
                this.field4896.method262(var3, var4.field5482[0], class516.field7361, 0);
            } else {
                this.field4896.method221(var3, var4.field5482[0], 0);
            }
            if (arg0 != -127) {
                this.method621(17);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZBLwm;)V", line = 164)
    public static final void method2243(boolean arg0, byte arg1, class564 arg2) {
        ++field4891;
        class224 var3 = arg2.method3247(21816);
        if (arg2.field8014 == 0) {
            class36.field457 = 0;
            class381.field5459 = -1;
            arg2.field8012 = 0;
        } else {
            if (arg2.field7991 != -1 && arg2.field7925 == 0) {
                class709 var4 = class343.field4785.method3525(arg2.field7991, (byte) -109);
                if (~arg2.field8007 < -1 && ~var4.field9823 == -1) {
                    class381.field5459 = -1;
                    ++arg2.field8012;
                    class36.field457 = 0;
                    return;
                }
                if (arg2.field8007 <= 0 && ~var4.field9839 == -1) {
                    ++arg2.field8012;
                    class381.field5459 = -1;
                    class36.field457 = 0;
                    return;
                }
            }
            if (~arg2.field7928 != 0 && arg2.field7940 <= class740.field10285) {
                class752 var5 = class220.field2879.method977(arg2.field7928, (byte) 49);
                if (var5.field10443 && var5.field10449 != -1) {
                    class709 var6 = class343.field4785.method3525(var5.field10449, (byte) -121);
                    if (arg2.field8007 > 0 && var6.field9823 == 0) {
                        class381.field5459 = -1;
                        ++arg2.field8012;
                        class36.field457 = 0;
                        return;
                    }
                    if (~arg2.field8007 >= -1 && ~var6.field9839 == -1) {
                        ++arg2.field8012;
                        class381.field5459 = -1;
                        class36.field457 = 0;
                        return;
                    }
                }
            }
            if (~arg2.field7928 != 0 && class740.field10285 >= arg2.field7940) {
                class752 var7 = class220.field2879.method977(arg2.field7928, (byte) -107);
                if (var7.field10443 && ~var7.field10449 != 0) {
                    class709 var8 = class343.field4785.method3525(var7.field10449, (byte) 119);
                    if (~arg2.field8007 < -1 && var8.field9823 == 0) {
                        ++arg2.field8012;
                        class381.field5459 = -1;
                        class36.field457 = 0;
                        return;
                    }
                    if (arg2.field8007 <= 0 && var8.field9839 == 0) {
                        ++arg2.field8012;
                        class381.field5459 = -1;
                        class36.field457 = 0;
                        return;
                    }
                }
            }
            int var9 = arg2.field1264;
            int var10 = arg2.field1250;
            int var11 = arg2.field8009[arg2.field8014 - 1] * 512 - -(256 * arg2.method1835((byte) 127));
            int var12 = arg2.field8015[arg2.field8014 + -1] * 512 + 256 * arg2.method1835((byte) 127);
            if (var9 >= var11) {
                if (var9 > var11) {
                    if (var10 < var12) {
                        arg2.method3242(8192, 6144);
                    } else if (var10 <= var12) {
                        arg2.method3242(8192, 4096);
                    } else {
                        arg2.method3242(8192, 2048);
                    }
                } else if (var10 >= var12) {
                    if (var12 < var10) {
                        arg2.method3242(8192, 0);
                    }
                } else {
                    arg2.method3242(8192, 8192);
                }
            } else if (~var12 < ~var10) {
                arg2.method3242(8192, 10240);
            } else if (var12 < var10) {
                arg2.method3242(8192, 14336);
            } else {
                arg2.method3242(8192, 12288);
            }
            if (arg1 <= 25) {
                method2243(false, (byte) 30, (class564) null);
            }
            byte var13 = arg2.field8011[arg2.field8014 + -1];
            if (arg0 || -var9 + var11 <= 1024 && ~(var11 - var9) <= 1023 && -var10 + var12 <= 1024 && -var10 + var12 >= -1024) {
                int var14 = 16;
                boolean var15 = true;
                if (arg2 instanceof class468) {
                    var15 = ((class468) arg2).field6632.field5045;
                }
                if (var15) {
                    int var16 = -arg2.field7917.field4509 + arg2.field8002;
                    if (~var16 != -1 && arg2.field8001 == -1 && ~arg2.field7959 != -1) {
                        var14 = 8;
                    }
                    if (!arg0 && arg2.field8014 > 2) {
                        var14 = 24;
                    }
                    if (!arg0 && arg2.field8014 > 3) {
                        var14 = 32;
                    }
                } else {
                    if (!arg0 && arg2.field8014 > 1) {
                        var14 = 24;
                    }
                    if (!arg0 && ~arg2.field8014 < -3) {
                        var14 = 32;
                    }
                }
                if (~arg2.field8012 < -1 && arg2.field8014 > 1) {
                    --arg2.field8012;
                    var14 = 32;
                }
                if (var13 != 2) {
                    if (~var13 == -1) {
                        var14 >>= 1;
                    }
                } else {
                    var14 <<= 1;
                }
                if (~var3.field2985 != 0) {
                    int var17 = var14 << 9;
                    if (arg2.field8014 == 1) {
                        int var18 = arg2.field8013 * arg2.field8013;
                        int var19 = (var11 >= arg2.field1264 ? var11 - arg2.field1264 : -var11 + arg2.field1264) << 9;
                        int var20 = (var12 >= arg2.field1250 ? -arg2.field1250 + var12 : arg2.field1250 - var12) << 9;
                        int var21 = ~var19 < ~var20 ? var19 : var20;
                        int var22 = var3.field2985 * 2 * var21;
                        if (var22 < var18) {
                            arg2.field8013 /= 2;
                        } else if (~var21 > ~(var18 / 2)) {
                            arg2.field8013 -= var3.field2985;
                            if (arg2.field8013 < 0) {
                                arg2.field8013 = 0;
                            }
                        } else if (~var17 < ~arg2.field8013) {
                            arg2.field8013 += var3.field2985;
                            if (~arg2.field8013 < ~var17) {
                                arg2.field8013 = var17;
                            }
                        }
                    } else if (~var17 >= ~arg2.field8013) {
                        if (~arg2.field8013 < -1) {
                            arg2.field8013 -= var3.field2985;
                            if (~arg2.field8013 > -1) {
                                arg2.field8013 = 0;
                            }
                        }
                    } else {
                        arg2.field8013 += var3.field2985;
                        if (~arg2.field8013 < ~var17) {
                            arg2.field8013 = var17;
                        }
                    }
                    var14 = arg2.field8013 >> 9;
                    if (~var14 > -2) {
                        var14 = 1;
                    }
                }
                class36.field457 = 0;
                if (~var9 == ~var11 && var10 == var12) {
                    class381.field5459 = -1;
                } else {
                    if (var11 > var9) {
                        arg2.field1264 += var14;
                        class36.field457 |= 4;
                        if (~arg2.field1264 < ~var11) {
                            arg2.field1264 = var11;
                        }
                    } else if (~var9 < ~var11) {
                        class36.field457 |= 8;
                        arg2.field1264 -= var14;
                        if (~arg2.field1264 > ~var11) {
                            arg2.field1264 = var11;
                        }
                    }
                    if (~var14 <= -33) {
                        class381.field5459 = 2;
                    } else {
                        class381.field5459 = var13;
                    }
                    if (~var12 >= ~var10) {
                        if (~var12 > ~var10) {
                            class36.field457 |= 2;
                            arg2.field1250 -= var14;
                            if (var12 > arg2.field1250) {
                                arg2.field1250 = var12;
                            }
                        }
                    } else {
                        arg2.field1250 += var14;
                        class36.field457 |= 1;
                        if (~arg2.field1250 < ~var12) {
                            arg2.field1250 = var12;
                        }
                    }
                }
                if (~arg2.field1264 == ~var11 && ~arg2.field1250 == ~var12) {
                    --arg2.field8014;
                    if (~arg2.field8007 < -1) {
                        --arg2.field8007;
                        return;
                    }
                }
            } else {
                arg2.field1264 = var11;
                arg2.field1250 = var12;
                arg2.method3248(false, -126, arg2.field8002);
                if (~arg2.field8007 < -1) {
                    --arg2.field8007;
                }
                --arg2.field8014;
                class381.field5459 = -1;
                class36.field457 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILha;)V", line = 505)
    public final void method860(int arg0, class58 arg1) {
        if (arg0 > 15) {
            ++field4883;
            Object var3 = null;
            class180 var5;
            if (this.field4895 == null && this.field4881) {
                class102 var4 = this.method2245(121, arg1, 262144, true);
                var5 = var4 == null ? null : var4.field1214;
            } else {
                var5 = this.field4895;
                this.field4895 = null;
            }
            if (var5 != null) {
                class583.method3312(var5, super.field1258, super.field1264, super.field1250, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)I", line = 534)
    public final int method749(int arg0) {
        if (arg0 != 32767) {
            this.method860(30, (class58) null);
        }
        ++field4898;
        return this.field4896 != null ? this.field4896.method253() : 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILha;I)Lka;", line = 545)
    private final class471 method2244(int arg0, class58 arg1, int arg2) {
        ++field4914;
        if (arg0 >= -74) {
            this.field4903 = 103;
        }
        if (this.field4896 != null && arg1.method466(this.field4896.method228(), arg2) == 0) {
            return this.field4896;
        } else {
            class102 var4 = this.method2245(118, arg1, arg2, false);
            return var4 == null ? null : var4.field1213;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I", line = 568)
    public final int method865(int arg0) {
        ++field4894;
        if (arg0 != 30374) {
            this.method750((byte) -72);
        }
        return this.field4879;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)Z", line = 579)
    public final boolean method746(int arg0) {
        ++field4904;
        if (arg0 > -106) {
            return false;
        } else if (this.field4896 != null) {
            return !this.field4896.method243();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLha;)V", line = 594)
    public final void method753(byte arg0, class58 arg1) {
        ++field4890;
        int var3 = -30 % ((arg0 - 18) / 40);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 604)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        if (arg4 instanceof class347) {
            class347 var8 = (class347) arg4;
            if (this.field4896 != null && var8.field4896 != null) {
                this.field4896.method237(var8.field4896, arg6, arg2, arg3, arg0);
            }
        }
        if (arg5 != 22501) {
            field4911 = -115;
        }
        ++field4892;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILha;IZ)Lqha;", line = 624)
    private final class102 method2245(int arg0, class58 arg1, int arg2, boolean arg3) {
        ++field4893;
        class10 var5 = class612.field8588.method558((byte) -94, 65535 & this.field4903);
        int var6 = -104 / ((19 - arg0) / 35);
        class278 var7;
        class278 var8;
        if (!this.field4884) {
            var7 = class588.field8292[super.field1258];
            if (~super.field1258 <= -4) {
                var8 = null;
            } else {
                var8 = class588.field8292[super.field1258 - -1];
            }
        } else {
            var8 = class588.field8292[0];
            var7 = class135.field1969[super.field1258];
        }
        return var5.method71(-86, super.field1255, var7, var8, arg3, this.field4879, super.field1264, super.field1250, arg1, arg2, 22);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZIZ)V", line = 655)
    public class347(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field150);
        this.field4880 = arg9;
        super.field1250 = arg6;
        this.field4879 = (byte) arg8;
        super.field1264 = arg4;
        this.field4884 = arg7;
        this.field4903 = (short) arg1.field236;
        this.field4910 = ~arg1.field207 != -1 && !arg7;
        this.field4881 = arg0.method487() && arg1.field177 && !this.field4884 && ~class557.field7812.field6542.method1222(false) != -1;
        int var11 = 2048;
        if (this.field4880) {
            var11 |= 65536;
        }
        class102 var12 = this.method2245(-104, arg0, var11, this.field4881);
        if (var12 != null) {
            this.field4896 = var12.field1213;
            this.field4895 = var12.field1214;
            if (this.field4880) {
                this.field4896 = this.field4896.method226((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)V", line = 687)
    public final void method866(byte arg0) {
        if (arg0 != -62) {
            this.field4884 = true;
        }
        ++field4882;
        if (this.field4896 != null) {
            this.field4896.method230();
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(B)I", line = 701)
    public final int method750(byte arg0) {
        ++field4905;
        if (arg0 != 14) {
            return -61;
        } else {
            return this.field4896 != null ? this.field4896.method218() : 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Z", line = 723)
    public final boolean method621(int arg0) {
        ++field4887;
        if (arg0 > -103) {
            this.method861((byte) 114);
        }
        return this.field4880;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILha;)Lkj;", line = 734)
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            field4912 = null;
        }
        if (this.field4901 == null) {
            this.field4901 = class654.method3596(super.field1255, this.method2244(-109, arg1, 0), super.field1264, super.field1250, (byte) 14);
        }
        ++field4886;
        return this.field4901;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)I", line = 752)
    public final int method868(byte arg0) {
        ++field4888;
        if (arg0 != -10) {
            this.method865(97);
        }
        return 22;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)I", line = 763)
    public final int method861(byte arg0) {
        ++field4889;
        if (arg0 != -17) {
            this.field4896 = null;
        }
        return this.field4903 & 65535;
    }

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "(I)V", line = 784)
    public static void method2246(int arg0) {
        field4885 = null;
        field4912 = null;
        field4909 = null;
        field4913 = null;
        if (arg0 != -1) {
            field4885 = null;
        }
    }
}
