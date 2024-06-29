import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class88 extends class266 {

    @OriginalMember(owner = "client!ai", name = "sc", descriptor = "I")
    public int field1191 = 0;

    @OriginalMember(owner = "client!ai", name = "Hc", descriptor = "I")
    public int field1206 = -1;

    @OriginalMember(owner = "client!ai", name = "uc", descriptor = "I")
    public int field1193 = 0;

    @OriginalMember(owner = "client!ai", name = "zc", descriptor = "Z")
    public boolean field1198 = false;

    @OriginalMember(owner = "client!ai", name = "tc", descriptor = "I")
    public int field1192 = -1;

    @OriginalMember(owner = "client!ai", name = "Dc", descriptor = "I")
    public int field1202 = 0;

    @OriginalMember(owner = "client!ai", name = "xc", descriptor = "I")
    public int field1196 = 0;

    @OriginalMember(owner = "client!ai", name = "vc", descriptor = "I")
    public int field1194 = -1;

    @OriginalMember(owner = "client!ai", name = "Gc", descriptor = "B")
    private byte field1205 = 0;

    @OriginalMember(owner = "client!ai", name = "Rc", descriptor = "I")
    public int field1216 = -1;

    @OriginalMember(owner = "client!ai", name = "Bc", descriptor = "I")
    public int field1200 = -1;

    @OriginalMember(owner = "client!ai", name = "Jc", descriptor = "I")
    public int field1208 = -1;

    @OriginalMember(owner = "client!ai", name = "rc", descriptor = "I")
    public int field1190 = 0;

    @OriginalMember(owner = "client!ai", name = "Tc", descriptor = "I")
    public int field1218 = 255;

    @OriginalMember(owner = "client!ai", name = "Fc", descriptor = "I")
    public int field1204 = -1;

    @OriginalMember(owner = "client!ai", name = "Lc", descriptor = "I")
    public static int field1210 = 0;

    @OriginalMember(owner = "client!ai", name = "qc", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ai", name = "wc", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ai", name = "yc", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ai", name = "Ac", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ai", name = "Cc", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ai", name = "Ec", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!ai", name = "Ic", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ai", name = "Mc", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ai", name = "Nc", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ai", name = "Oc", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ai", name = "Pc", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ai", name = "Qc", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ai", name = "Uc", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ai", name = "Vc", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ai", name = "Wc", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ai", name = "Kc", descriptor = "Lnj;")
    public class144 field1209;

    @OriginalMember(owner = "client!ai", name = "Sc", descriptor = "Ljava/lang/String;")
    public String field1217;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)I")
    public final int method554(byte arg0) {
        ++field1213;
        return arg0 < 0 ? 119 : super.field4025;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()I")
    public final int method106() {
        ++field1215;
        return super.field4088;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z")
    public final boolean method555(boolean arg0) {
        ++field1197;
        if (this.field1209 == null) {
            return false;
        } else {
            if (!arg0) {
                this.field1206 = 43;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1220;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBIIIIIIIILnl;IILgh;)V")
    private final void method556(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class97 arg12, int arg13, int arg14, class25 arg15) {
        ++field1199;
        int var17 = arg2 * arg2 - -(arg9 * arg9);
        if (var17 >= 16 && ~var17 >= ~arg0) {
            if (arg3 == -18) {
                int var18 = 2047 & (int) (325.949D * Math.atan2((double) arg2, (double) arg9));
                class25 var19 = class32.method205(super.field4085, arg10, super.field3987, arg15, super.field4019, var18, (byte) -126);
                if (var19 != null) {
                    var19.method120(0, arg1, arg11, arg6, arg5, arg4, arg14, arg8, -1L, arg7, arg12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lql;B)V")
    public static final void method557(class224 arg0, byte arg1) {
        ++field1189;
        int var2 = arg0.method1461(true);
        class218.field3291 = new class181[var2];
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            class218.field3291[var3] = new class181();
            class218.field3291[var3].field2537 = arg0.method1461(true);
            class218.field3291[var3].field2535 = arg0.method1446(0);
        }
        class232.field3509 = arg0.method1461(true);
        class276.field4282 = arg0.method1461(true);
        class95.field1348 = arg0.method1461(true);
        class167.field2299 = new class245[class276.field4282 - class232.field3509 - -1];
        for (int var4 = 0; ~var4 > ~class95.field1348; ++var4) {
            int var5 = arg0.method1461(true);
            class245 var6 = class167.field2299[var5] = new class245();
            var6.field641 = arg0.method1453((byte) -128);
            var6.field624 = arg0.method1483((byte) 46);
            var6.field3741 = class232.field3509 + var5;
            var6.field3743 = arg0.method1446(0);
            var6.field3742 = arg0.method1446(0);
        }
        if (arg1 < 100) {
            field1210 = 21;
        }
        class231.field3506 = arg0.method1483((byte) 46);
        class257.field3927 = true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
    public static final void method558(int arg0, boolean arg1) {
        class29.field393 = 20;
        class145.field2026 = 3;
        ++field1212;
        class127.field1781 = arg0;
        if (!arg1) {
            field1210 = 114;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lak;I)V")
    public static final void method559(class140 arg0, int arg1) {
        ++field1211;
        if (arg1 == -1) {
            for (class71 var2 = (class71) class235.field3541.method990(-98); var2 != null; var2 = (class71) class235.field3541.method993(-84)) {
                if (var2.field971 == arg0) {
                    if (var2.field989 != null) {
                        class21.field298.method360(var2.field989);
                        var2.field989 = null;
                    }
                    var2.method1115(18);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method560(int arg0) {
        String var2 = this.field1217;
        if (class173.field2415 != null) {
            var2 = class173.field2415[this.field1205] + var2;
        }
        ++field1214;
        if (arg0 != 50) {
            this.field1190 = 126;
        }
        if (class81.field1110 != null) {
            var2 = var2 + class81.field1110[this.field1205];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)I")
    public final int method561(int arg0) {
        ++field1219;
        if (this.field1209 != null && this.field1209.field2012 != -1) {
            return class270.method1783((byte) -124, this.field1209.field2012).field4431;
        } else {
            if (arg0 != -1) {
                this.field1200 = -87;
            }
            return super.method561(-1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1203;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)V")
    public static final void method562(String arg0, String arg1, int arg2, int arg3, boolean arg4, String arg5) {
        ++field1221;
        for (int var6 = 99; ~var6 < -1; --var6) {
            class57.field817[var6] = class57.field817[var6 + -1];
            class7.field61[var6] = class7.field61[var6 + -1];
            class44.field664[var6] = class44.field664[var6 + -1];
            class286.field4480[var6] = class286.field4480[var6 + -1];
            class30.field415[var6] = class30.field415[var6 + -1];
        }
        class57.field817[0] = arg2;
        class30.field415[0] = arg3;
        class7.field61[0] = arg1;
        class75.field1046 = class35.field548;
        class44.field664[0] = arg5;
        class286.field4480[0] = arg0;
        if (arg4) {
            ++class214.field3218;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILql;)V")
    public final void method563(int arg0, class224 arg1) {
        arg1.field3402 = 0;
        ++field1201;
        int var3 = arg1.method1453((byte) -128);
        int var4 = var3 & 1;
        int[] var5 = new int[12];
        boolean var6 = ~(4 & var3) != -1;
        int var7 = super.method561(-1);
        int var8 = -1;
        this.method1744(((63 & var3) >> 3) + 1, (byte) 42);
        this.field1205 = (byte) (var3 >> 6 & arg0);
        super.field4019 += (-var7 + this.method561(-1)) * 64;
        super.field4085 += 64 * (this.method561(-1) - var7);
        this.field1208 = arg1.method1437((byte) -110);
        this.field1192 = arg1.method1437((byte) -104);
        this.field1196 = 0;
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg1.method1453((byte) -128);
            if (~var10 == -1) {
                var5[var9] = 0;
            } else {
                int var11 = arg1.method1453((byte) -127);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var8 = arg1.method1445(false);
                    this.field1196 = arg1.method1453((byte) -128);
                    break;
                }
                if (var12 >= 32768) {
                    int var25 = class193.field2679[var12 + -32768];
                    var5[var9] = class54.method339(1073741824, var25);
                    int var26 = class73.method463(var25, -31104).field475;
                    if (~var26 != -1) {
                        this.field1196 = var26;
                    }
                } else {
                    var5[var9] = class54.method339(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var24 = arg1.method1453((byte) -127);
            if (var24 < 0 || ~var24 <= ~class248.field3795[var14].length) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field4025 = arg1.method1445(false);
        long var15 = arg1.method1491(-21241);
        this.field1217 = class274.method1828(0, var15);
        this.field1190 = arg1.method1453((byte) -128);
        if (!var6) {
            this.field1191 = 0;
            this.field1193 = arg1.method1453((byte) -128);
            this.field1200 = arg1.method1453((byte) -127);
            if (this.field1200 == 255) {
                this.field1200 = -1;
            }
        } else {
            this.field1191 = arg1.method1445(false);
            this.field1193 = this.field1190;
            this.field1200 = -1;
        }
        int var17 = this.field1202;
        this.field1202 = arg1.method1453((byte) -127);
        if (~this.field1202 == -1) {
            class73.method460((byte) 106, this);
        } else {
            int var18 = this.field1216;
            int var19 = this.field1194;
            int var20 = this.field1204;
            int var21 = this.field1206;
            int var22 = this.field1218;
            this.field1194 = arg1.method1445(false);
            this.field1216 = arg1.method1445(false);
            this.field1206 = arg1.method1445(false);
            this.field1204 = arg1.method1445(false);
            this.field1218 = arg1.method1453((byte) -127);
            if (this.field1202 != var17 || this.field1194 != var19 || this.field1216 != var18 || ~this.field1206 != ~var21 || ~this.field1204 != ~var20 || ~this.field1218 != ~var22) {
                class29.method187(true, this);
            }
        }
        if (this.field1209 == null) {
            this.field1209 = new class144();
        }
        int var23 = this.field1209.field2012;
        this.field1209.method966(var5, -120, ~var4 == -2, var13, var8, super.field4025);
        if (var8 != var23) {
            super.field4019 = super.field4076[0] * 128 + 64 * this.method561(-1);
            super.field4085 = super.field4032[0] * 128 + 64 * this.method561(-1);
        }
        if (super.field4078 != null) {
            super.field4078.method642();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBZ)V")
    public final void method564(int arg0, int arg1, byte arg2, boolean arg3) {
        ++field1195;
        super.method1740((byte) -72, this.method561(-1), arg3, arg0, arg1);
        if (arg2 <= 43) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIJILnl;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class97 arg10) {
        ++field1207;
        if (this.field1209 != null) {
            class240 var13 = super.field4040 != -1 && ~super.field3985 == -1 ? class132.method905(true, super.field4040) : null;
            class240 var14 = super.field4050 == -1 || this.field1198 || super.field4050 == this.method1741((byte) 3).field2106 && var13 != null ? null : class132.method905(true, super.field4050);
            class25 var15 = this.field1209.method972(super.field4080, super.field3994, -7893, super.field4066, var13, var14, super.field4022, true, super.field4013, super.field4024, super.field4048);
            int var16 = class217.method1410((byte) -119);
            if (class160.field2247 != 0 && var16 < 50) {
                int var17 = 50 - var16;
                while (class297.field4696 < var17) {
                    class35.field535[class297.field4696] = new byte[102400];
                    ++class297.field4696;
                }
                while (var17 < class297.field4696) {
                    --class297.field4696;
                    class35.field535[class297.field4696] = null;
                }
            }
            if (var15 != null) {
                super.field4088 = var15.method106();
                if (class29.field390 && (this.field1209.field2012 == -1 || class270.method1783((byte) -63, this.field1209.field2012).field4393)) {
                    class25 var18 = class21.method157(super.field4003, 160, super.field4019, var14 != null ? var14 : var13, var15, var14 == null ? super.field4024 : super.field4066, 0, 112, 1, 240, arg0, 0, super.field3987, super.field4085);
                    var18.method120(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class97) null);
                }
                if (class217.field3280 == this) {
                    for (int var19 = class175.field2463.length + -1; var19 >= 0; --var19) {
                        class275 var20 = class175.field2463[var19];
                        if (var20 != null && ~var20.field4261 != 0) {
                            if (var20.field4262 == 1 && ~var20.field4257 <= -1 && ~class119.field1679.length < ~var20.field4257) {
                                class140 var21 = class119.field1679[var20.field4257];
                                if (var21 != null) {
                                    int var22 = var21.field4019 / 32 + -(class217.field3280.field4019 / 32);
                                    int var23 = var21.field4085 / 32 - class217.field3280.field4085 / 32;
                                    this.method556(360000, arg1, var22, (byte) -18, arg5, arg4, arg3, arg9, arg7, var23, var20.field4261, arg2, (class97) null, arg0, arg6, var15);
                                }
                            }
                            if (var20.field4262 == 2) {
                                int var24 = (-class37.field565 + var20.field4251) * 4 + -(class217.field3280.field4019 / 32) + 2;
                                int var25 = (-class216.field3255 + var20.field4255) * 4 + 2 + -(class217.field3280.field4085 / 32);
                                int var26 = var20.field4250 * 4;
                                int var27 = var26 * var26;
                                this.method556(var27, arg1, var24, (byte) -18, arg5, arg4, arg3, arg9, arg7, var25, var20.field4261, arg2, (class97) null, arg0, arg6, var15);
                            }
                            if (var20.field4262 == 10 && var20.field4257 >= 0 && ~class154.field2133.length < ~var20.field4257) {
                                class88 var28 = class154.field2133[var20.field4257];
                                if (var28 != null) {
                                    int var29 = var28.field4085 / 32 + -(class217.field3280.field4085 / 32);
                                    int var30 = var28.field4019 / 32 + -(class217.field3280.field4019 / 32);
                                    this.method556(360000, arg1, var30, (byte) -18, arg5, arg4, arg3, arg9, arg7, var29, var20.field4261, arg2, (class97) null, arg0, arg6, var15);
                                }
                            }
                        }
                    }
                }
                this.method1746(var15, 2);
                this.method1745(-25893, var15, arg0);
                class25 var31 = null;
                if (!this.field1198 && ~super.field4046 != 0 && ~super.field4077 != 0) {
                    class191 var32 = class82.method512(super.field4046, (byte) 95);
                    var31 = var32.method1225(super.field4062, super.field4077, super.field4061, false);
                    if (var31 != null) {
                        var31.method119(0, -super.field4047, 0);
                        if (var32.field2636) {
                            if (class269.field4124 != 0) {
                                var31.method107(class269.field4124);
                            }
                            if (class257.field3926 != 0) {
                                var31.method118(class257.field3926);
                            }
                            if (~class131.field1852 != -1) {
                                var31.method119(0, class131.field1852, 0);
                            }
                        }
                    }
                }
                class25 var33 = null;
                if (!this.field1198 && super.field3989 != null) {
                    if (~class52.field740 <= ~super.field4079) {
                        super.field3989 = null;
                    }
                    if (class52.field740 >= super.field4038 && ~class52.field740 > ~super.field4079) {
                        if (super.field3989 instanceof class123) {
                            var33 = (class25) ((class123) super.field3989).method805(100);
                        } else {
                            var33 = (class25) super.field3989;
                        }
                        var33.method119(super.field3986 - super.field4019, -super.field3987 + super.field4058, super.field3998 - super.field4085);
                        if (~super.field4009 == -513) {
                            var33.method128();
                        } else if (super.field4009 != 1024) {
                            if (~super.field4009 == -1537) {
                                var33.method112();
                            }
                        } else {
                            var33.method123();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class18) var15).method126(var31);
                }
                if (var33 != null) {
                    var15 = ((class18) var15).method126(var33);
                }
                var15.field335 = true;
                var15.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4078);
                if (var33 != null) {
                    if (~super.field4009 == -513) {
                        var33.method112();
                    } else if (super.field4009 == 1024) {
                        var33.method123();
                    } else if (super.field4009 == 1536) {
                        var33.method128();
                    }
                    var33.method119(-super.field3986 + super.field4019, -super.field4058 + super.field3987, -super.field3998 + super.field4085);
                }
            }
        }
    }
}
