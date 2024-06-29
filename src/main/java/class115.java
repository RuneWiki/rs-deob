import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class115 {

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lhj;")
    private class29 field1800 = new class29(256);

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lhj;")
    private class29 field1809 = new class29(256);

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Llb;")
    private class211 field1801;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Llb;")
    private class211 field1799;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([IIII)Lik;", line = 16)
    private final class259 method894(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg1 >>> 12 | arg2 & arg1 << 4) ^ arg3;
        int var6 = var5 | arg1 << 16;
        field1797++;
        long var7 = (long) var6 ^ 0x100000000L;
        class259 var9 = (class259) this.field1809.method203(1710, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class280 var10 = (class280) this.field1800.method203(1710, var7);
            if (var10 == null) {
                var10 = class280.method1977(this.field1801, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1800.method208(var10, var7, 0);
            }
            class259 var11 = var10.method1974(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1554((byte) -70);
                this.field1809.method208(var11, var7, 0);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[II)Lik;", line = 57)
    public final class259 method895(int arg0, int[] arg1, int arg2) {
        field1804++;
        if (arg0 != 5300) {
            return (class259) null;
        } else if (this.field1799.method1513(arg0 - 5192) == 1) {
            return this.method896(arg2, arg0 ^ 0xFFFFB984, 0, arg1);
        } else if (this.field1799.method1523(9271, arg2) == 1) {
            return this.method896(0, -21200, arg2, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[I)Lik;", line = 80)
    private final class259 method896(int arg0, int arg1, int arg2, int[] arg3) {
        field1808++;
        int var5 = arg0 ^ (arg2 << 4 & 0xFFFE | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class259 var9 = (class259) this.field1809.method203(1710, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class229 var10 = class229.method1627(this.field1799, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class259 var11 = var10.method1624();
            this.field1809.method208(var11, var7, 0);
            if (arg3 != null) {
                arg3[0] -= var11.field3850.length;
            }
            if (arg1 != -21200) {
                this.method894((int[]) null, 115, -94, -3);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLhb;)V", line = 122)
    public static final void method897(byte arg0, class35 arg1) {
        int var2 = class198.field3139 >> 2 << 10;
        field1807++;
        int var3 = class196.field3099 >> 1;
        byte[][] var4 = new byte[class87.field1280][class193.field3089];
        while (arg1.field437.length > arg1.field455) {
            int var5 = 0;
            boolean var6 = false;
            int var7 = 0;
            if (arg1.method273(65280) == 1) {
                var6 = true;
                var5 = arg1.method273(65280);
                var7 = arg1.method273(65280);
            }
            int var8 = arg1.method273(65280);
            int var9 = arg1.method273(65280);
            int var10 = var8 * 64 - class69.field1018;
            int var11 = class193.field3089 - (var9 * 64 + -class318.field4932) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class87.field1280 > var10 + 63 && var11 < class193.field3089) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var6 || var5 * 8 <= var12 && var12 < var5 * 8 + 8 && var7 * 8 <= var14 && (var7 * 8 + 8) > var14) {
                            var13[var11 - var14] = arg1.method242((byte) -93);
                        }
                    }
                }
            } else if (var6) {
                arg1.field455 += 64;
            } else {
                arg1.field455 += 4096;
            }
        }
        int var15 = class87.field1280;
        int var16 = class193.field3089;
        if (arg0 != 76) {
            return;
        }
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class200 var26 = class236.method1656(var25 - 1, false);
                        var19[var23] += var26.field3178;
                        var17[var23] += var26.field3171;
                        var18[var23] += var26.field3177;
                        var20[var23] += var26.field3161;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class200 var29 = class236.method1656(var28 - 1, false);
                        var19[var23] -= var29.field3178;
                        var17[var23] -= var29.field3171;
                        var18[var23] -= var29.field3177;
                        var20[var23] -= var29.field3161;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class152.field2294[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var16) {
                        var35 += var21[var37];
                        var34 += var18[var37];
                        var33 += var17[var37];
                        var31 += var19[var37];
                        var32 += var20[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var35 -= var21[var38];
                        var31 -= var19[var38];
                        var34 -= var18[var38];
                        var32 -= var20[var38];
                        var33 -= var17[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var32 == 0 ? 0 : class96.method764(var33 / var35, var34 / var35, -43, var31 * 256 / var32);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class142.method1078(63, var22) + (class142.method1078(var36, 63) << 6)] = class56.field832[class58.method522((byte) 124, 96, var42)];
                        } else if (var39 != null) {
                            var39[class142.method1078(var22, 63) + class142.method1078(4032, var36 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 353)
    public static final int method898(byte arg0, String arg1) {
        field1803++;
        int var2 = 0;
        int var3 = 44 % ((44 - arg0) / 60);
        while (class269.field4058.length > var2) {
            if (class269.field4058[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILld;)V", line = 376)
    public static final void method899(int arg0, class121 arg1) {
        field1805++;
        class117 var2 = (class117) class17.field192.method203(1710, class224.method1597(true, arg1.field1895));
        if (var2 != null) {
            if (var2.field1842 != null) {
                class200.field3165.method2162(var2.field1842);
                var2.field1842 = null;
            }
            var2.method1554((byte) -64);
        }
        if (arg0 != 65534) {
            field1802 = -33;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Llb;Llb;)V", line = 456)
    public class115(class211 arg0, class211 arg1) {
        this.field1801 = arg1;
        this.field1799 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)Lla;", line = 411)
    public static final class138 method900(int arg0, boolean arg1) {
        field1810++;
        class138 var2 = (class138) class244.field3675.method1432((byte) 122, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field861.method1507(arg0, (byte) 105, 31);
        class138 var4 = new class138();
        if (var3 != null) {
            var4.method1050(new class35(var3), -16295, arg0);
        }
        class244.field3675.method1436(false, var4, (long) arg0);
        if (!arg1) {
            field1802 = -34;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[IB)Lik;", line = 434)
    public final class259 method901(int arg0, int[] arg1, byte arg2) {
        field1798++;
        if (arg2 != 107) {
            return (class259) null;
        } else if (this.field1801.method1513(123) == 1) {
            return this.method894(arg1, 0, arg2 + 65414, arg0);
        } else if (this.field1801.method1523(9271, arg0) == 1) {
            return this.method894(arg1, arg0, 65521, 0);
        } else {
            throw new RuntimeException();
        }
    }
}
