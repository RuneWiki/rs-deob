import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class243 {

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lbb;")
    public class88 field4460 = new class88();

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lhj;")
    public static class69 field4459 = class181.method1318("Spieler", (byte) -108);

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lhj;")
    private static class69 field4461 = class181.method1318("Please remove ", (byte) -124);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lhj;")
    public static class69 field4463 = field4461;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Lhj;")
    public static class69 field4465 = field4461;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lhj;")
    public static class69 field4468 = class181.method1318("", (byte) -121);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Z")
    public static boolean field4467 = false;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Z")
    public static boolean field4469 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lhj;")
    public static class69 field4456 = class181.method1318("Wordpack geladen)3", (byte) -113);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lbb;")
    private class88 field4473;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Lbb;")
    public final class88 method1722(int arg0) {
        field4455++;
        if (arg0 != -29709) {
            return null;
        }
        class88 var2 = this.field4473;
        if (this.field4460 == var2) {
            this.field4473 = null;
            return null;
        } else {
            this.field4473 = var2.field1676;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method1723(byte arg0) {
        field4459 = null;
        field4461 = null;
        if (arg0 != -89) {
            field4459 = null;
        }
        field4468 = null;
        field4456 = null;
        field4463 = null;
        field4465 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Lbb;")
    public final class88 method1724(int arg0) {
        field4466++;
        class88 var2 = this.field4460.field1677;
        if (arg0 != 255) {
            return null;
        } else if (this.field4460 == var2) {
            this.field4473 = null;
            return null;
        } else {
            this.field4473 = var2.field1677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILfh;)V")
    public static final void method1725(int arg0, class128 arg1) {
        field4462++;
        int var2 = class215.field3899 >> 1;
        int var3 = class259.field4645 >> 2 << 10;
        byte[][] var4 = new byte[class84.field1626][class22.field306];
        while (arg1.field2385.length > arg1.field2379) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method937(false) == 1) {
                var34 = arg1.method937(false);
                var33 = true;
                var35 = arg1.method937(false);
            }
            int var36 = arg1.method937(false);
            int var37 = arg1.method937(false);
            int var38 = class22.field306 + class209.field3806 - var37 * 64 - 1;
            int var39 = var36 * 64 - class250.field4539;
            if (var39 >= 0 && var38 - 63 >= 0 && class84.field1626 > var39 + 63 && var38 < class22.field306) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= (var34 * 8) && (var34 * 8 + 8) > var40 && (var35 * 8) <= var42 && (var35 * 8 + 8) > var42) {
                            var41[var38 - var42] = arg1.method950(1495791448);
                        }
                    }
                }
            } else if (var33) {
                arg1.field2379 += 64;
            } else {
                arg1.field2379 += 4096;
            }
        }
        int var5 = class84.field1626;
        int var6 = class22.field306;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        if (arg0 != 0) {
            method1723((byte) 58);
        }
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class141 var29 = class233.method1655(var28 - 1, (byte) -124);
                        var7[var13] += var29.field2629;
                        var8[var13] += var29.field2628;
                        var11[var13] += var29.field2625;
                        var9[var13] += var29.field2627;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class141 var32 = class233.method1655(var31 - 1, (byte) -86);
                        var7[var13] -= var32.field2629;
                        var8[var13] -= var32.field2628;
                        var11[var13] -= var32.field2625;
                        var9[var13] -= var32.field2627;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class64.field1243[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var6 > var21) {
                        var17 += var9[var21];
                        var19 += var10[var21];
                        var16 += var8[var21];
                        var14 += var7[var21];
                        var18 += var11[var21];
                    }
                    if (var22 >= 0) {
                        var14 -= var7[var22];
                        var19 -= var10[var22];
                        var17 -= var9[var22];
                        var16 -= var8[var22];
                        var18 -= var11[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class33.method180(var16 / var19, 1, var14 * 256 / var17, var18 / var19);
                        if (var4[var12][var20] != 0) {
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var26 = (var24 + var3 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class69.method443(var12, 63) + class69.method443(var20 << 6, 4032)] = class178.field3243[class35.method186(96, arg0, var26)];
                        } else if (var23 != null) {
                            var23[class69.method443(var12, 63) + (class69.method443(var20, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Lbb;")
    public final class88 method1726(int arg0) {
        field4470++;
        if (arg0 <= 92) {
            return null;
        }
        class88 var2 = this.field4473;
        if (this.field4460 == var2) {
            this.field4473 = null;
            return null;
        } else {
            this.field4473 = var2.field1677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILbb;)V")
    public final void method1727(int arg0, class88 arg1) {
        if (arg1.field1676 != null) {
            arg1.method632(-8296);
        }
        arg1.field1676 = this.field4460.field1676;
        arg1.field1677 = this.field4460;
        arg1.field1676.field1677 = arg1;
        if (arg0 >= -92) {
            field4459 = null;
        }
        field4458++;
        arg1.field1677.field1676 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
    public static final void method1728(int arg0) {
        if (class206.field3767 == null || class244.field4476 == null) {
            class206.field3767 = new int[256];
            class244.field4476 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class206.field3767[var1] = (int) (Math.sin(var3) * 4096.0D);
                class244.field4476[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field4472++;
        int var2 = 44 / ((arg0 + 22) / 61);
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)Lbb;")
    public final class88 method1729(int arg0) {
        class88 var2 = this.field4460.field1676;
        field4471++;
        if (arg0 != 7113) {
            return null;
        } else if (this.field4460 == var2) {
            this.field4473 = null;
            return null;
        } else {
            this.field4473 = var2.field1676;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lbb;B)V")
    public final void method1730(class88 arg0, byte arg1) {
        field4452++;
        if (arg0.field1676 != null) {
            arg0.method632(-8296);
        }
        arg0.field1677 = this.field4460.field1677;
        arg0.field1676 = this.field4460;
        arg0.field1676.field1677 = arg0;
        if (arg1 != 56) {
            this.method1730((class88) null, (byte) -62);
        }
        arg0.field1677.field1676 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Lbb;")
    public final class88 method1731(byte arg0) {
        field4453++;
        if (arg0 != -101) {
            method1723((byte) 123);
        }
        class88 var2 = this.field4460.field1677;
        if (this.field4460 == var2) {
            return null;
        } else {
            var2.method632(arg0 - 8195);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    public final void method1732(int arg0) {
        if (arg0 <= 104) {
            return;
        }
        while (true) {
            class88 var2 = this.field4460.field1677;
            if (this.field4460 == var2) {
                this.field4473 = null;
                field4464++;
                return;
            }
            var2.method632(-8296);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class243() {
        this.field4460.field1677 = this.field4460;
        this.field4460.field1676 = this.field4460;
    }
}
