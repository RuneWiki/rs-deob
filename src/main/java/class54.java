import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class54 extends class290 {

    @OriginalMember(owner = "client!oe", name = "pc", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!oe", name = "oc", descriptor = "Lrc;")
    public static class9 field623 = new class9(50);

    @OriginalMember(owner = "client!oe", name = "xc", descriptor = "[I")
    public static int[] field632 = new int[4];

    @OriginalMember(owner = "client!oe", name = "Cc", descriptor = "[I")
    public static int[] field637 = new int[25];

    @OriginalMember(owner = "client!oe", name = "jc", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!oe", name = "kc", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!oe", name = "lc", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!oe", name = "mc", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!oe", name = "nc", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!oe", name = "qc", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!oe", name = "rc", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!oe", name = "sc", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!oe", name = "tc", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!oe", name = "uc", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!oe", name = "vc", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!oe", name = "wc", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!oe", name = "yc", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!oe", name = "zc", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!oe", name = "Ac", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!oe", name = "Dc", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!oe", name = "Bc", descriptor = "Lri;")
    public class267 field636;

    @OriginalMember(owner = "client!oe", name = "Ec", descriptor = "Lbc;")
    public static class282 field639;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field635;
        if (this.field636 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()I")
    public final int method227() {
        ++field618;
        return super.field4531;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lri;I)V")
    public final void method322(class267 arg0, int arg1) {
        ++field629;
        if (arg1 >= 76) {
            this.field636 = arg0;
            if (super.field4561 != null) {
                super.field4561.method1071();
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field620;
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
    public static void method323(int arg0) {
        if (arg0 >= -67) {
            field623 = null;
        }
        field623 = null;
        field637 = null;
        field639 = null;
        field632 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLwe;Z)V")
    public static final void method324(byte arg0, class82 arg1, boolean arg2) {
        int var3 = ~arg1.field1113 == -1 ? arg1.field1131 : arg1.field1113;
        ++field631;
        if (arg0 < 23) {
            method328(true);
        }
        int var4 = ~arg1.field1079 != -1 ? arg1.field1079 : arg1.field1048;
        class151.method994(var4, class123.field1767[arg1.field1025 >> 16], false, var3, arg1.field1025, arg2);
        if (arg1.field1034 != null) {
            class151.method994(var4, arg1.field1034, false, var3, arg1.field1025, arg2);
        }
        class166 var5 = (class166) class189.field2705.method1895((long) arg1.field1025, -113);
        if (var5 != null) {
            class167.method1094(arg2, var4, var5.field2395, false, var3);
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)Z")
    public final boolean method325(int arg0) {
        ++field625;
        if (arg0 < 112) {
            return false;
        } else {
            return this.field636 != null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lwe;III)V")
    public static final void method326(class82 arg0, int arg1, int arg2, int arg3) {
        ++field626;
        if (class131.field1886 == null && !class177.field2518) {
            if (arg0 != null && class118.method763(-231, arg0) != null) {
                class131.field1886 = arg0;
                class219.field3093 = class118.method763(-231, arg0);
                class213.field2984 = arg3;
                if (arg2 <= 116) {
                    method324((byte) 64, (class82) null, true);
                }
                class152.field2205 = false;
                class129.field1859 = arg1;
                class199.field2837 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
    public static final void method327(int arg0) {
        ++field628;
        class51.field590.method71(-99);
        field623.method71(-81);
        if (arg0 <= 71) {
            field632 = null;
        }
        class38.field464.method71(-92);
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V")
    public static final void method328(boolean arg0) {
        ++field621;
        if (class267.field3857) {
            class82 var1 = class112.method694(class276.field4192, false, class287.field4469);
            if (var1 != null && var1.field1068 != null) {
                class11 var2 = new class11();
                var2.field143 = var1.field1068;
                var2.field145 = var1;
                class110.method684(var2, false);
            }
            class267.field3857 = arg0;
            class241.field3500 = -1;
            class255.method1632(16711680, var1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZII[BIIII[Lhl;I)V")
    public static final void method329(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, class137[] arg9, int arg10) {
        ++field634;
        class216 var11 = new class216(arg4);
        int var12 = -1;
        while (true) {
            int var13 = var11.method1381((byte) 106);
            if (var13 == 0) {
                if (arg8 <= 63) {
                    field623 = null;
                    return;
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1378((byte) -121);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 + -1;
                int var16 = 63 & var14;
                int var17 = var14 >> 6 & 63;
                int var18 = var14 >> 12;
                int var19 = var11.method1407(118);
                int var20 = 3 & var19;
                int var21 = var19 >> 2;
                if (~arg2 == ~var18 && var17 >= arg7 && arg7 - -8 > var17 && arg3 <= var16 && var16 < arg3 + 8) {
                    class273 var22 = class164.method1081(0, var12);
                    int var23 = class124.method811(var22.field4008, var17 & 7, var20, -852666079, arg0, var22.field4023, var16 & 7) + arg6;
                    int var24 = arg10 + class118.method764(arg0, 7 & var17, var16 & 7, var22.field4023, var22.field4008, 7, var20);
                    if (~var23 < -1 && var24 > 0 && var23 < 103 && ~var24 > -104) {
                        class137 var25 = null;
                        if (!arg1) {
                            int var26 = arg5;
                            if ((2 & class241.field3507[1][var23][var24]) == 2) {
                                var26 = arg5 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg9[var26];
                            }
                        }
                        class204.method1314(!arg1, arg5, var21, arg0 + var20 & 3, arg1, var25, (byte) 118, arg5, var24, var23, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method330(String arg0, byte arg1) {
        ++field622;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != -119) {
            return null;
        } else {
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                char var5 = arg0.charAt(var4);
                if (~var5 < -1 && var5 < 128 || var5 >= 160 && ~var5 >= -256) {
                    var3[var4] = (byte) var5;
                } else if (~var5 == -8365) {
                    var3[var4] = -128;
                } else if (~var5 != -8219) {
                    if (var5 == 402) {
                        var3[var4] = -125;
                    } else if (var5 != 8222) {
                        if (var5 == 8230) {
                            var3[var4] = -123;
                        } else if (~var5 == -8225) {
                            var3[var4] = -122;
                        } else if (var5 == 8225) {
                            var3[var4] = -121;
                        } else if (~var5 != -711) {
                            if (var5 == 8240) {
                                var3[var4] = -119;
                            } else if (var5 != 352) {
                                if (var5 != 8249) {
                                    if (var5 == 338) {
                                        var3[var4] = -116;
                                    } else if (var5 != 381) {
                                        if (var5 == 8216) {
                                            var3[var4] = -111;
                                        } else if (~var5 != -8218) {
                                            if (~var5 == -8221) {
                                                var3[var4] = -109;
                                            } else if (var5 == 8221) {
                                                var3[var4] = -108;
                                            } else if (~var5 != -8227) {
                                                if (var5 == 8211) {
                                                    var3[var4] = -106;
                                                } else if (var5 != 8212) {
                                                    if (var5 == 732) {
                                                        var3[var4] = -104;
                                                    } else if (var5 != 8482) {
                                                        if (~var5 != -354) {
                                                            if (~var5 != -8251) {
                                                                if (var5 != 339) {
                                                                    if (var5 != 382) {
                                                                        if (~var5 != -377) {
                                                                            var3[var4] = 63;
                                                                        } else {
                                                                            var3[var4] = -97;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -98;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -100;
                                                                }
                                                            } else {
                                                                var3[var4] = -101;
                                                            }
                                                        } else {
                                                            var3[var4] = -102;
                                                        }
                                                    } else {
                                                        var3[var4] = -103;
                                                    }
                                                } else {
                                                    var3[var4] = -105;
                                                }
                                            } else {
                                                var3[var4] = -107;
                                            }
                                        } else {
                                            var3[var4] = -110;
                                        }
                                    } else {
                                        var3[var4] = -114;
                                    }
                                } else {
                                    var3[var4] = -117;
                                }
                            } else {
                                var3[var4] = -118;
                            }
                        } else {
                            var3[var4] = -120;
                        }
                    } else {
                        var3[var4] = -124;
                    }
                } else {
                    var3[var4] = -126;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIIJILqd;)V")
    public final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class162 arg10) {
        ++field619;
        if (this.field636 != null) {
            class274 var13 = super.field4592 != -1 && ~super.field4518 == -1 ? class27.method165(super.field4592, (byte) 95) : null;
            class274 var14 = ~super.field4579 == 0 || ~super.field4579 == ~this.method1949(-1).field4376 && var13 != null ? null : class27.method165(super.field4579, (byte) 77);
            class106 var15 = this.field636.method1715(super.field4568, super.field4520, var14, super.field4503, super.field4580, super.field4581, var13, -14068, super.field4567, super.field4540);
            if (var15 != null) {
                super.field4531 = var15.method227();
                class267 var16 = this.field636;
                if (var16.field3884 != null) {
                    var16 = var16.method1707(-1);
                }
                if (class284.field4342 && var16.field3862) {
                    class106 var17 = class282.method1876(this.field636.field3858, super.field4527, arg0, this.field636.field3910, this.field636.field3883, var15, -86, super.field4593, var14 != null ? super.field4568 : super.field4567, var14 != null ? var14 : var13, super.field4563, this.field636.field3855, this.field636.field3877, super.field4553);
                    var17.method235(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field4561);
                }
                this.method1941(false, var15);
                this.method1945(arg0, var15, (byte) -125);
                class106 var18 = null;
                if (~super.field4590 != 0 && super.field4578 != -1) {
                    class101 var19 = class189.method1246(super.field4590, (byte) -120);
                    var18 = var19.method615(super.field4556, super.field4578, super.field4542, 8);
                    if (var18 != null) {
                        var18.method645(0, -super.field4526, 0);
                        if (var19.field1391) {
                            if (class287.field4467 != 0) {
                                var18.method666(class287.field4467);
                            }
                            if (class143.field2042 != 0) {
                                var18.method646(class143.field2042);
                            }
                            if (~class287.field4456 != -1) {
                                var18.method645(0, class287.field4456, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class275) var15).method1778(var18);
                }
                if (~this.field636.field3858 == -2) {
                    var15.field1435 = true;
                }
                var15.method235(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4561);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V")
    public static final void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class55.field646 = arg0;
        class26.field302 = arg1;
        class212.field2972 = arg5;
        class129.field1858 = arg3;
        ++field638;
        class150.field2177 = arg2;
        if (~class212.field2972 <= -101) {
            int var6 = class129.field1858 * 128 - -64;
            int var7 = class26.field302 * 128 + 64;
            int var8 = class4.method21(var7, class199.field2833, var6, (byte) 26) + -class55.field646;
            int var9 = -class245.field3560 + var6;
            int var10 = var7 - class204.field2902;
            int var11 = -class225.field3172 + var8;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class280.field4246 = 2047 & (int) (Math.atan2((double) var11, (double) var12) * 325.949D);
            class138.field2010 = (int) (Math.atan2((double) var9, (double) var10) * -325.949D) & 2047;
            if (~class280.field4246 > -129) {
                class280.field4246 = 128;
            }
            if (class280.field4246 > 383) {
                class280.field4246 = 383;
            }
        }
        if (arg4 <= 87) {
            field639 = null;
        }
        class4.field61 = 2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
    public final int method332(boolean arg0) {
        if (!arg0) {
            field633 = 16;
        }
        ++field627;
        if (~class5.field67 != -1 && this.field636.field3884 != null) {
            class267 var2 = this.field636.method1707(-1);
            if (var2 != null && var2.field3860 != -1) {
                return var2.field3860;
            }
        }
        return super.field4588;
    }
}
