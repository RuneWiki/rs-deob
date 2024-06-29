import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class377 {

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    private int field72 = 4096;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    private int field73 = 4096;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    private int field68 = 409;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "[I")
    private int[] field70 = new int[3];

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    private int field76 = 4096;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "Lqga;")
    public static class173 field77;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lpfa;ILjava/lang/String;Z)Lsf;", line = 3)
    public static final class489 method22(class275 arg0, int arg1, String arg2, boolean arg3) {
        ++field69;
        int var4 = arg0.method1651(arg2, (byte) 77);
        if (var4 == -1) {
            return new class489(0);
        } else {
            int[] var5 = arg0.method1639(var4, -2979);
            class489 var6 = new class489(var5.length);
            int var7 = arg1;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field6108) {
                    class572 var9 = new class572(arg0.method1659(-90, var5[var8++], var4));
                    int var10 = var9.method3064(arg1 + -2031091464);
                    int var11 = var9.method3031(-1);
                    int var12 = var9.method3097((byte) 12);
                    if (!arg3 && var12 == 1) {
                        --var6.field6108;
                    } else {
                        var6.field6111[var7] = var10;
                        var6.field6113[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)[[I", line = 47)
    public final int[][] method23(int arg0, byte arg1) {
        ++field75;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        int var4 = 12 % ((31 - arg1) / 42);
        if (super.field4850.field5843) {
            int[][] var5 = this.method2173(1, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class528.field6661; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field70[0] + var13;
                if (~var14 > -1) {
                    var14 = -var14;
                }
                if (var14 > this.field68) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field70[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var16 > this.field68) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field70[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (~var18 < ~this.field68) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field76 * var13 >> 12;
                            var10[var12] = this.field73 * var15 >> 12;
                            var11[var12] = this.field72 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I", line = 141)
    public static final int method24(String arg0, String arg1, int arg2, int arg3) {
        ++field71;
        int var4 = arg0.length();
        int var5 = arg1.length();
        int var6 = arg3;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (~(-var8 + var6) > ~var4 || ~(-var9 + var7) > ~var5) {
            if (-var8 + var6 >= var4) {
                return -1;
            }
            if (var5 <= -var9 + var7) {
                return 1;
            }
            char var22;
            if (var8 == 0) {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (~var9 != -1) {
                var24 = var9;
                boolean var25 = false;
            } else {
                var24 = arg1.charAt(var7++);
            }
            var8 = class8.method30(var22, -109);
            var9 = class8.method30(var24, arg3 + -108);
            char var26 = class614.method3435(111, arg2, var22);
            char var27 = class614.method3435(111, arg2, var24);
            if (var26 != var27 && ~Character.toUpperCase(var26) != ~Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class549.method2936(arg3 ^ -1191559388, var28, arg2) - class549.method2936(arg3 + -1191559388, var29, arg2);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = -var11 + -1 + var4;
                var17 = -var11 + -1 + var5;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg0.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (~var18 != ~var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (~var20 != ~var21) {
                    return class549.method2936(-1191559388, var20, arg2) - class549.method2936(arg3 + -1191559388, var21, arg2);
                }
            }
        }
        int var12 = -var5 + var4;
        if (~var12 != -1) {
            return var12;
        } else {
            for (int var13 = 0; var13 < var10; ++var13) {
                char var14 = arg0.charAt(var13);
                char var15 = arg1.charAt(var13);
                if (var14 != var15) {
                    return class549.method2936(arg3 + -1191559388, var14, arg2) + -class549.method2936(arg3 + -1191559388, var15, arg2);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(B)V", line = 262)
    public static void method25(byte arg0) {
        field77 = null;
        if (arg0 != -45) {
            field74 = 57;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 276)
    public class7() {
        super(1, false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 287)
    public static final byte[] method26(int arg0, String arg1) {
        ++field66;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 24 % ((-64 - arg0) / 50);
        for (int var5 = 0; var2 > var5; ++var5) {
            char var6 = arg1.charAt(var5);
            if (var6 > 0 && var6 < 128 || var6 >= 160 && var6 <= 255) {
                var3[var5] = (byte) var6;
            } else if (~var6 != -8365) {
                if (~var6 != -8219) {
                    if (~var6 == -403) {
                        var3[var5] = -125;
                    } else if (var6 != 8222) {
                        if (~var6 != -8231) {
                            if (~var6 != -8225) {
                                if (var6 == 8225) {
                                    var3[var5] = -121;
                                } else if (var6 != 710) {
                                    if (~var6 != -8241) {
                                        if (~var6 == -353) {
                                            var3[var5] = -118;
                                        } else if (~var6 != -8250) {
                                            if (~var6 != -339) {
                                                if (~var6 == -382) {
                                                    var3[var5] = -114;
                                                } else if (~var6 != -8217) {
                                                    if (var6 != 8217) {
                                                        if (var6 != 8220) {
                                                            if (~var6 != -8222) {
                                                                if (~var6 != -8227) {
                                                                    if (~var6 == -8212) {
                                                                        var3[var5] = -106;
                                                                    } else if (var6 == 8212) {
                                                                        var3[var5] = -105;
                                                                    } else if (~var6 == -733) {
                                                                        var3[var5] = -104;
                                                                    } else if (~var6 != -8483) {
                                                                        if (var6 == 353) {
                                                                            var3[var5] = -102;
                                                                        } else if (var6 != 8250) {
                                                                            if (var6 == 339) {
                                                                                var3[var5] = -100;
                                                                            } else if (var6 == 382) {
                                                                                var3[var5] = -98;
                                                                            } else if (~var6 != -377) {
                                                                                var3[var5] = 63;
                                                                            } else {
                                                                                var3[var5] = -97;
                                                                            }
                                                                        } else {
                                                                            var3[var5] = -101;
                                                                        }
                                                                    } else {
                                                                        var3[var5] = -103;
                                                                    }
                                                                } else {
                                                                    var3[var5] = -107;
                                                                }
                                                            } else {
                                                                var3[var5] = -108;
                                                            }
                                                        } else {
                                                            var3[var5] = -109;
                                                        }
                                                    } else {
                                                        var3[var5] = -110;
                                                    }
                                                } else {
                                                    var3[var5] = -111;
                                                }
                                            } else {
                                                var3[var5] = -116;
                                            }
                                        } else {
                                            var3[var5] = -117;
                                        }
                                    } else {
                                        var3[var5] = -119;
                                    }
                                } else {
                                    var3[var5] = -120;
                                }
                            } else {
                                var3[var5] = -122;
                            }
                        } else {
                            var3[var5] = -123;
                        }
                    } else {
                        var3[var5] = -124;
                    }
                } else {
                    var3[var5] = -126;
                }
            } else {
                var3[var5] = -128;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILji;)V", line = 435)
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = 36 / ((13 - arg1) / 55);
        ++field67;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var6 = arg2.method3059(1);
                            this.field70[0] = class109.method762(16711680, var6) << 4;
                            this.field70[1] = class109.method762(var6, 65280) >> 4;
                            this.field70[2] = class109.method762(var6 >> 12, 0);
                        }
                    } else {
                        this.field76 = arg2.method3031(-1);
                    }
                } else {
                    this.field73 = arg2.method3031(-1);
                }
            } else {
                this.field72 = arg2.method3031(-1);
            }
        } else {
            this.field68 = arg2.method3031(-1);
        }
    }
}
