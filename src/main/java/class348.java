import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class348 extends class98 {

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public int field4922 = 4;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public int field4925 = 0;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "[B")
    private byte[] field4934 = new byte[512];

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public int field4928 = 1638;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    public int field4942 = 4;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Z")
    public boolean field4926 = true;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
    public int field4946 = 4;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field4931 = 0;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Liq;")
    public static class362 field4933 = new class362("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "Z")
    public static boolean field4943 = false;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "Lrs;")
    public static class392 field4944;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pf", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field4947;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "[S")
    private short[] field4938;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "[S")
    private short[] field4945;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2233(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBI)Lec;", line = 4)
    public static final class128 method2223(int arg0, int arg1, byte arg2, int arg3) {
        ++field4924;
        int var4 = arg1 << 8 | arg0;
        class128 var5 = (class128) class39.field443.method856((long) var4 << 16, (byte) 123);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class406.field5866.method2420(class406.field5866.method2433(var4, arg2 + 119), -1);
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class128 var7 = method2227(var6, 22882);
                    var7.field1551 = arg0;
                    class39.field443.method849((byte) 63, var7, (long) var4 << 16);
                    return var7;
                }
            } else {
                int var8 = arg0 | arg3 + 65536 << 8;
                class128 var9 = (class128) class39.field443.method856((long) var8 << 16, (byte) 123);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class406.field5866.method2420(class406.field5866.method2433(var8, -1), -1);
                    if (var10 != null) {
                        if (~var10.length >= -2) {
                            return null;
                        } else {
                            class128 var11 = method2227(var10, 22882);
                            var11.field1551 = arg0;
                            class39.field443.method849((byte) 63, var11, (long) var8 << 16);
                            return var11;
                        }
                    } else {
                        int var12 = 16776960 | arg0;
                        class128 var13 = (class128) class39.field443.method856((long) var12 << 16, (byte) 123);
                        if (arg2 != -120) {
                            method2227((byte[]) null, -75);
                        }
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class406.field5866.method2420(class406.field5866.method2433(var12, -1), -1);
                            if (var14 != null) {
                                if (~var14.length >= -2) {
                                    return null;
                                } else {
                                    class128 var15 = method2227(var14, 22882);
                                    var15.field1551 = arg0;
                                    class39.field443.method849((byte) 63, var15, (long) var12 << 16);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 165)
    public class348() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lae;IIILp;III)V", line = 83)
    public static final void method2224(class134 arg0, int arg1, int arg2, int arg3, class119 arg4, int arg5, int arg6, int arg7) {
        ++field4941;
        class9 var8 = null;
        if (~arg1 == -1) {
            var8 = (class9) class137.method847(arg6, arg5, arg2);
        }
        if (arg3 > 93) {
            if (~arg1 == -2) {
                var8 = (class9) class109.method696(arg6, arg5, arg2);
            }
            if (arg1 == 2) {
                var8 = (class9) class159.method1013(arg6, arg5, arg2, field4947 != null ? field4947 : (field4947 = method2233("vl")));
            }
            if (arg1 == 3) {
                var8 = (class9) class327.method2118(arg6, arg5, arg2);
            }
            if (var8 != null) {
                int var9 = var8.method69(-5944);
                int var10 = var8.method68(122);
                class88 var11 = class374.method2382(var8.method71((byte) -69), false);
                if (var11.method475(-27135)) {
                    class443.method2760((byte) -92, arg2, arg6, arg5, var11);
                }
                if (var8.method67(-3673)) {
                    var8.method66(arg0, 4257);
                }
                if (~arg1 != -1) {
                    if (~arg1 != -2) {
                        if (~arg1 != -3) {
                            if (arg1 == 3) {
                                class358.method2294(arg6, arg5, arg2);
                                if (~var11.field1003 == -2) {
                                    arg4.method733(arg5, arg2, 8);
                                    return;
                                }
                            }
                            return;
                        }
                        class272.method1797(arg6, arg5, arg2, field4947 != null ? field4947 : (field4947 = method2233("vl")));
                        if (var11.field1003 != 0 && ~(var11.field1008 + arg5) > ~class176.field2403 && class383.field5395 > arg2 - -var11.field1008 && ~class176.field2403 < ~(var11.field1029 + arg5) && class383.field5395 > var11.field1029 + arg2) {
                            arg4.method732(var11.field1029, arg2, var11.field1040, arg5, !var11.field1069, -114, var10, var11.field1008);
                            return;
                        }
                    } else {
                        class39.method235(arg6, arg5, arg2);
                    }
                    return;
                }
                class2.method8(arg6, arg5, arg2);
                if (var11.field1003 != 0) {
                    arg4.method747(arg2, arg5, !var11.field1069, 16777216, var10, var9, var11.field1040);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 170)
    public final void method188(int arg0) {
        this.field4934 = class164.method1123(this.field4925, arg0 + 102);
        ++field4929;
        this.method2228((byte) -78);
        for (int var2 = this.field4946 - arg0; var2 >= 1; --var2) {
            short var3 = this.field4938[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field4946;
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(B)V", line = 197)
    public static void method2225(byte arg0) {
        field4933 = null;
        field4944 = null;
        int var1 = 24 % ((6 - arg0) / 46);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(CB)B", line = 207)
    public static final byte method2226(char arg0, byte arg1) {
        if (arg1 > -117) {
            field4933 = null;
        }
        ++field4930;
        byte var2;
        if ((arg0 <= 0 || arg0 >= 128) && (arg0 < 160 || arg0 > 255)) {
            if (~arg0 == -8365) {
                var2 = -128;
            } else if (arg0 == 8218) {
                var2 = -126;
            } else if (arg0 == 402) {
                var2 = -125;
            } else if (~arg0 != -8223) {
                if (arg0 != 8230) {
                    if (~arg0 == -8225) {
                        var2 = -122;
                    } else if (arg0 == 8225) {
                        var2 = -121;
                    } else if (~arg0 == -711) {
                        var2 = -120;
                    } else if (arg0 != 8240) {
                        if (~arg0 != -353) {
                            if (~arg0 != -8250) {
                                if (arg0 != 338) {
                                    if (arg0 != 381) {
                                        if (~arg0 == -8217) {
                                            var2 = -111;
                                        } else if (~arg0 == -8218) {
                                            var2 = -110;
                                        } else if (~arg0 == -8221) {
                                            var2 = -109;
                                        } else if (arg0 != 8221) {
                                            if (arg0 != 8226) {
                                                if (arg0 == 8211) {
                                                    var2 = -106;
                                                } else if (arg0 == 8212) {
                                                    var2 = -105;
                                                } else if (arg0 != 732) {
                                                    if (~arg0 != -8483) {
                                                        if (~arg0 == -354) {
                                                            var2 = -102;
                                                        } else if (arg0 != 8250) {
                                                            if (~arg0 != -340) {
                                                                if (arg0 != 382) {
                                                                    if (arg0 == 376) {
                                                                        var2 = -97;
                                                                    } else {
                                                                        var2 = 63;
                                                                    }
                                                                } else {
                                                                    var2 = -98;
                                                                }
                                                            } else {
                                                                var2 = -100;
                                                            }
                                                        } else {
                                                            var2 = -101;
                                                        }
                                                    } else {
                                                        var2 = -103;
                                                    }
                                                } else {
                                                    var2 = -104;
                                                }
                                            } else {
                                                var2 = -107;
                                            }
                                        } else {
                                            var2 = -108;
                                        }
                                    } else {
                                        var2 = -114;
                                    }
                                } else {
                                    var2 = -116;
                                }
                            } else {
                                var2 = -117;
                            }
                        } else {
                            var2 = -118;
                        }
                    } else {
                        var2 = -119;
                    }
                } else {
                    var2 = -123;
                }
            } else {
                var2 = -124;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)Lec;", line = 333)
    public static final class128 method2227(byte[] arg0, int arg1) {
        ++field4927;
        class128 var2 = new class128();
        class236 var3 = new class236(arg0);
        if (arg1 != 22882) {
            field4931 = 45;
        }
        var3.field3320 = var3.field3364.length + -2;
        int var4 = var3.method1617((byte) 48);
        int var5 = var3.field3364.length + -var4 + -2 + -12;
        var3.field3320 = var5;
        int var6 = var3.method1597(3641);
        var2.field1546 = var3.method1617((byte) 48);
        var2.field1559 = var3.method1617((byte) 48);
        var2.field1549 = var3.method1617((byte) 48);
        var2.field1556 = var3.method1617((byte) 48);
        int var7 = var3.method1574(-96);
        if (~var7 < -1) {
            var2.field1552 = new class288[var7];
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                int var9 = var3.method1617((byte) 48);
                class288 var10 = new class288(class328.method2123(var9, 20867));
                var2.field1552[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1597(3641);
                    int var12 = var3.method1597(arg1 + -19241);
                    var10.method1886(new class25(var12), (long) var11, arg1 ^ 22883);
                }
            }
        }
        var3.field3320 = 0;
        var2.field1547 = var3.method1568((byte) -47);
        var2.field1557 = new String[var6];
        var2.field1561 = new int[var6];
        var2.field1555 = new int[var6];
        int var13 = 0;
        while (var3.field3320 < var5) {
            int var14 = var3.method1617((byte) 48);
            if (~var14 != -4) {
                if (var14 < 100 && var14 != 21 && var14 != 38 && ~var14 != -40) {
                    var2.field1561[var13] = var3.method1597(3641);
                } else {
                    var2.field1561[var13] = var3.method1574(-118);
                }
            } else {
                var2.field1557[var13] = var3.method1562(false).intern();
            }
            var2.field1555[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I", line = 413)
    public final int[] method83(int arg0, int arg1) {
        ++field4935;
        int[] var3 = super.field1177.method820(arg1, true);
        if (arg0 != 0) {
            this.field4945 = null;
        }
        if (super.field1177.field1610) {
            this.method2230(var3, (byte) 124, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(B)V", line = 439)
    private final void method2228(byte arg0) {
        if (this.field4928 <= 0) {
            if (this.field4938 != null && this.field4938.length == this.field4946) {
                this.field4945 = new short[this.field4946];
                for (int var2 = 0; ~var2 > ~this.field4946; ++var2) {
                    this.field4945[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field4945 = new short[this.field4946];
            this.field4938 = new short[this.field4946];
            for (int var3 = 0; ~this.field4946 < ~var3; ++var3) {
                this.field4938[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field4928 / 4096.0F), (double) var3)));
                this.field4945[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 >= -38) {
            this.field4938 = null;
        }
        ++field4923;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILdg;I)V", line = 481)
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            field4943 = true;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field4922 = arg1.method1574(arg2 + -95);
                                }
                            } else {
                                this.field4942 = arg1.method1574(-25);
                            }
                        } else {
                            this.field4925 = arg1.method1574(arg2 ^ -86);
                        }
                    } else {
                        this.field4942 = this.field4922 = arg1.method1574(-30);
                    }
                } else {
                    this.field4928 = arg1.method1613(91);
                    if (~this.field4928 > -1) {
                        this.field4938 = new short[this.field4946];
                        for (int var5 = 0; ~var5 > ~this.field4946; ++var5) {
                            this.field4938[var5] = (short) arg1.method1613(84);
                        }
                    }
                }
            } else {
                this.field4946 = arg1.method1574(-98);
            }
        } else {
            this.field4926 = ~arg1.method1574(-3) == -2;
        }
        ++field4932;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)Ljg;", line = 586)
    public static final class186 method2229(int arg0, int arg1) {
        ++field4937;
        class393[] var2 = class262.field3740;
        synchronized (class262.field3740) {
            if (arg1 != 21534) {
                return null;
            } else {
                class186 var4;
                if (~class262.field3740.length < ~arg0 && !class262.field3740[arg0].method2514(0)) {
                    var4 = (class186) class262.field3740[arg0].method2506((byte) -63);
                    var4.method2635(-13388);
                    int var10002 = class452.field6476[arg0]--;
                } else {
                    var4 = new class186();
                    var4.field2704 = new class136[arg0];
                    for (int var5 = 0; var5 < arg0; ++var5) {
                        var4.field2704[var5] = new class136();
                    }
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([IBI)V", line = 625)
    public final void method2230(int[] arg0, byte arg1, int arg2) {
        ++field4939;
        int var4 = class163.field2285[arg2] * this.field4922;
        if (arg1 != 124) {
            method2226((char) 65412, (byte) 110);
        }
        if (~this.field4946 == -2) {
            short var5 = this.field4938[0];
            int var6 = this.field4945[0] << 12;
            int var7 = this.field4942 * var6 >> 12;
            int var8 = this.field4922 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 4095;
            if (var8 <= var11) {
                var11 = 0;
            }
            int var13 = this.field4934[255 & var11] & 255;
            int var14 = this.field4934[var10 & 255] & 255;
            int var15 = class146.field1789[var12];
            if (this.field4926) {
                for (int var16 = 0; class268.field3811 > var16; ++var16) {
                    int var17 = class189.field2722[var16] * this.field4942;
                    int var18 = this.method2231(var14, var13, var6 * var17 >> 12, var12, var7, 123, var15);
                    int var19 = var5 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; class268.field3811 > var20; ++var20) {
                    int var21 = class189.field2722[var20] * this.field4942;
                    int var22 = this.method2231(var14, var13, var6 * var21 >> 12, var12, var7, 127, var15);
                    arg0[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field4938[0];
            if (var23 > 8 || ~var23 > 7) {
                int var24 = this.field4945[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field4942 * var24 >> 12;
                int var27 = this.field4922 * var24 >> 12;
                int var28 = var25 >> 12;
                int var29 = var28 + 1;
                int var30 = var25 & 4095;
                if (~var27 >= ~var29) {
                    var29 = 0;
                }
                int var31 = 255 & this.field4934[255 & var28];
                int var32 = this.field4934[var29 & 255] & 255;
                int var33 = class146.field1789[var30];
                for (int var34 = 0; class268.field3811 > var34; ++var34) {
                    int var54 = class189.field2722[var34] * this.field4942;
                    int var55 = this.method2231(var31, var32, var24 * var54 >> 12, var30, var26, 122, var33);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; this.field4946 > var35; ++var35) {
                short var36 = this.field4938[var35];
                if (~var36 < -9 || ~var36 > 7) {
                    int var37 = this.field4945[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field4922 * var37 >> 12;
                    int var40 = this.field4942 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var38 & 4095;
                    if (~var39 >= ~var42) {
                        var42 = 0;
                    }
                    int var44 = class146.field1789[var43];
                    int var45 = 255 & this.field4934[var41 & 255];
                    int var46 = this.field4934[var42 & 255] & 255;
                    if (this.field4926 && ~(this.field4946 + -1) == ~var35) {
                        for (int var47 = 0; ~var47 > ~class268.field3811; ++var47) {
                            int var48 = class189.field2722[var47] * this.field4942;
                            int var49 = this.method2231(var45, var46, var37 * var48 >> 12, var43, var40, 120, var44);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~class268.field3811 < ~var51; ++var51) {
                            int var52 = class189.field2722[var51] * this.field4942;
                            int var53 = this.method2231(var45, var46, var37 * var52 >> 12, var43, var40, 121, var44);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII)I", line = 794)
    private final int method2231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4936;
        int var8 = arg2 >> 12;
        int var9 = var8 + 1;
        if (arg5 < 118) {
            return 102;
        } else {
            int var10 = var8 & 255;
            int var11 = arg2 & 4095;
            if (~var9 <= ~arg4) {
                var9 = 0;
            }
            int var12 = arg3 + -4096;
            int var13 = var9 & 255;
            int var14 = var11 + -4096;
            int var15 = class146.field1789[var11];
            int var16 = this.field4934[arg0 + var10] & 3;
            int var17;
            if (var16 <= 1) {
                var17 = ~var16 != -1 ? arg3 - var11 : var11 - -arg3;
            } else {
                var17 = ~var16 == -3 ? -arg3 + var11 : -arg3 + -var11;
            }
            int var18 = this.field4934[arg0 + var13] & 3;
            int var19;
            if (var18 > 1) {
                var19 = var18 == 2 ? var14 - arg3 : -arg3 + -var14;
            } else {
                var19 = ~var18 == -1 ? var14 - -arg3 : arg3 - var14;
            }
            int var20 = ((-var17 + var19) * var15 >> 12) + var17;
            int var21 = this.field4934[arg1 + var10] & 3;
            int var22;
            if (~var21 < -2) {
                var22 = ~var21 != -3 ? -var11 + -var12 : var11 - var12;
            } else {
                var22 = var21 != 0 ? -var11 + var12 : var11 - -var12;
            }
            int var23 = 3 & this.field4934[arg1 + var13];
            int var24;
            if (~var23 >= -2) {
                var24 = ~var23 != -1 ? -var14 + var12 : var12 + var14;
            } else {
                var24 = var23 == 2 ? var14 - var12 : -var14 - var12;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return ((-var20 + var25) * arg6 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(II)V", line = 875)
    public static final void method2232(int arg0, int arg1) {
        class240.field3418 = arg1;
        ++field4940;
        class69.field796.method1618(0);
        if (arg0 != -30827) {
            field4944 = null;
        }
    }
}
