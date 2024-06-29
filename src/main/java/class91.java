import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class91 implements class7 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lnb;")
    private class80 field1981 = new class80();

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    private int field1992 = 0;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "D")
    private double field1998 = 1.0D;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    private int field1996 = 128;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lkc;")
    private class63 field1991;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[Lec;")
    private class28[] field1978;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
    public static boolean field1974 = false;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
    public static int[] field1980 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
    public static int[] field1982 = new int[1000];

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lnb;")
    public static class80 field1986 = new class80();

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
    public static int[] field1993 = new int[5];

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field1995 = 0;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "[Lvb;")
    public static class122[] field1997 = new class122[4];

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lkc;")
    public static class63 field1979;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[[B")
    public static byte[][] field1994;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[[[B")
    public static byte[][][] field1987;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
    public final void method640(int arg0, int arg1) {
        int var3 = 0;
        if (arg1 != -21528) {
            field1980 = null;
        }
        while (this.field1978.length > var3) {
            class28 var4 = this.field1978[var3];
            if (var4 != null && var4.field596 != 0 && var4.field593) {
                var4.method183(arg0);
                var4.field593 = false;
            }
            var3++;
        }
        field1984++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
    public static final void method641(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1989++;
        int var6 = class120.field2562.method945(arg5, arg2, arg1);
        if (var6 != 0) {
            int var7 = arg3;
            if (var6 > 0) {
                var7 = arg4;
            }
            int var8 = class120.field2562.method990(arg5, arg2, arg1, var6);
            int var9 = var6 >> 14 & 0x7FFF;
            int var10 = var8 >> 6 & 0x3;
            int var11 = var8 & 0x1F;
            int var12 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
            int[] var13 = class121.field2612.field439;
            class121 var14 = class110.method821(var9, 724);
            if (var14.field2588 == -1) {
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var13[var12] = var7;
                        var13[var12 + 512] = var7;
                        var13[var12 + 1024] = var7;
                        var13[var12 + 1536] = var7;
                    } else if (var10 == 1) {
                        var13[var12] = var7;
                        var13[var12 + 1] = var7;
                        var13[var12 + 2] = var7;
                        var13[var12 + 3] = var7;
                    } else if (var10 == 2) {
                        var13[var12 + 3] = var7;
                        var13[var12 + 3 + 512] = var7;
                        var13[var12 + 1027] = var7;
                        var13[var12 + 1536 + 3] = var7;
                    } else if (var10 == 3) {
                        var13[var12 + 1536] = var7;
                        var13[var12 + 1536 + 1] = var7;
                        var13[var12 + 2 + 1536] = var7;
                        var13[var12 + 1536 + 3] = var7;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var13[var12] = var7;
                    } else if (var10 == 1) {
                        var13[var12 + 3] = var7;
                    } else if (var10 == 2) {
                        var13[var12 + 1536 + 3] = var7;
                    } else if (var10 == 3) {
                        var13[var12 + 1536] = var7;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var13[var12] = var7;
                        var13[var12 + 512] = var7;
                        var13[var12 + 1024] = var7;
                        var13[var12 + 1536] = var7;
                    } else if (var10 == 0) {
                        var13[var12] = var7;
                        var13[var12 + 1] = var7;
                        var13[var12 + 2] = var7;
                        var13[var12 + 3] = var7;
                    } else if (var10 == 1) {
                        var13[var12 + 3] = var7;
                        var13[var12 + 3 + 512] = var7;
                        var13[var12 + 3 + 1024] = var7;
                        var13[var12 + 3 + 1536] = var7;
                    } else if (var10 == 2) {
                        var13[var12 + 1536] = var7;
                        var13[var12 + 1537] = var7;
                        var13[var12 + 1536 + 2] = var7;
                        var13[var12 + 1539] = var7;
                    }
                }
            } else {
                class15 var15 = class64.field1339[var14.field2588];
                if (var15 != null) {
                    int var16 = (var14.field2574 * 4 - var15.field275) / 2;
                    int var17 = (var14.field2575 * 4 - var15.field280) / 2;
                    var15.method80(arg2 * 4 + var16 + 48, (-var14.field2575 + 104 + -arg1) * 4 + 48 + var17);
                }
            }
        }
        int var18 = class120.field2562.method983(arg5, arg2, arg1);
        if (arg0 < 91) {
            field1980 = null;
        }
        if (var18 != 0) {
            int var19 = class120.field2562.method990(arg5, arg2, arg1, var18);
            int var20 = var18 >> 14 & 0x7FFF;
            int var21 = var19 >> 6 & 0x3;
            class121 var22 = class110.method821(var20, 724);
            int var23 = var19 & 0x1F;
            if (var22.field2588 != -1) {
                class15 var24 = class64.field1339[var22.field2588];
                if (var24 != null) {
                    int var25 = (var22.field2575 * 4 - var24.field280) / 2;
                    int var26 = (var22.field2574 * 4 - var24.field275) / 2;
                    var24.method80(arg2 * 4 + var26 + 48, (-arg1 + 104 + -var22.field2575) * 4 + 48 + var25);
                }
            } else if (var23 == 9) {
                int var27 = 15658734;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int[] var28 = class121.field2612.field439;
                int var29 = (103 - arg1) * 2048 + arg2 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1024 + 1] = var27;
                    var28[var29 + 2 + 512] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 512 + 1] = var27;
                    var28[var29 + 2 + 1024] = var27;
                    var28[var29 + 1539] = var27;
                }
            }
        }
        int var30 = class120.field2562.method956(arg5, arg2, arg1);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class121 var32 = class110.method821(var31, 724);
        if (var32.field2588 == -1) {
            return;
        }
        class15 var33 = class64.field1339[var32.field2588];
        if (var33 != null) {
            int var34 = (var32.field2575 * 4 - var33.field280) / 2;
            int var35 = (var32.field2574 * 4 - var33.field275) / 2;
            var33.method80(arg2 * 4 + var35 + 48, (-var32.field2575 + 104 + -arg1) * 4 + 48 - -var34);
            return;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[I")
    public final int[] method39(int arg0, byte arg1) {
        field1975++;
        class28 var3 = this.field1978[arg0];
        if (var3 != null) {
            if (var3.field588 != null) {
                this.field1981.method578(0, var3);
                var3.field593 = true;
                return var3.field588;
            }
            boolean var4 = var3.method186(this.field1998, this.field1996, this.field1991);
            if (var4) {
                if (this.field1992 == 0) {
                    class28 var5 = (class28) this.field1981.method581((byte) -45);
                    var5.method184();
                } else {
                    this.field1992--;
                }
                this.field1981.method578(0, var3);
                var3.field593 = true;
                return var3.field588;
            }
        }
        if (arg1 >= -30) {
            this.method40((byte) -80, 10);
        }
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Z")
    public final boolean method40(byte arg0, int arg1) {
        int var3 = 48 % ((arg0 - 2) / 49);
        field1988++;
        return this.field1996 == 64;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method642(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1986 = null;
        field1993 = null;
        field1987 = null;
        field1979 = null;
        field1982 = null;
        field1994 = null;
        field1997 = null;
        field1980 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(DI)V")
    public final void method643(double arg0, int arg1) {
        if (arg1 != 1536) {
            this.field1992 = -92;
        }
        this.field1998 = arg0;
        this.method645(arg1 + 13780);
        field1983++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIII)V")
    public static final void method644(byte arg0, int arg1, int arg2, int arg3) {
        field1976++;
        if (arg2 < 128 || arg3 < 128 || arg2 > 13056 || arg3 > 13056) {
            class13.field269 = -1;
            class40.field779 = -1;
            return;
        }
        int var4 = class53.method341(0, arg2, arg3, class71.field1588) - arg1;
        if (arg0 <= 41) {
            return;
        }
        int var5 = arg2 - class55.field1164;
        int var6 = var4 - class70.field1561;
        int var7 = class44.field920[class85.field1900];
        int var8 = class44.field915[class24.field510];
        int var9 = arg3 - class108.field2395;
        int var10 = class44.field920[class24.field510];
        int var11 = class44.field915[class85.field1900];
        int var12 = var5 * var10 + var8 * var9 >> 16;
        int var13 = var9 * var10 - var5 * var8 >> 16;
        int var15 = var6 * var7 - var11 * var13 >> 16;
        int var16 = var6 * var11 + var7 * var13 >> 16;
        if (var16 < 50) {
            class13.field269 = -1;
            class40.field779 = -1;
        } else {
            class40.field779 = (var12 << 9) / var16 + 256;
            class13.field269 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method645(int arg0) {
        field1977++;
        for (int var2 = 0; var2 < this.field1978.length; var2++) {
            if (this.field1978[var2] != null) {
                this.field1978[var2].method184();
            }
        }
        if (arg0 != 15316) {
            this.method37(96, -124);
        }
        this.field1981 = new class80();
        this.field1992 = this.field1999;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)I")
    public final int method38(int arg0, int arg1) {
        if (arg0 == 1625) {
            field1985++;
            return this.field1978[arg1] == null ? 0 : this.field1978[arg1].field592;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
    public final boolean method37(int arg0, int arg1) {
        if (arg0 != 7441) {
            field1993 = null;
        }
        field1990++;
        return this.field1978[arg1].field591;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lkc;Lkc;IDI)V")
    public class91(class63 arg0, class63 arg1, int arg2, double arg3, int arg4) {
        this.field1998 = arg3;
        this.field1999 = arg2;
        this.field1991 = arg1;
        this.field1992 = this.field1999;
        this.field1996 = arg4;
        int[] var7 = arg0.method385(0, -1);
        int var8 = var7.length;
        this.field1978 = new class28[arg0.method382(0, (byte) 24)];
        for (int var9 = 0; var9 < var8; var9++) {
            class94 var10 = new class94(arg0.method394(0, var7[var9], (byte) -42));
            this.field1978[var7[var9]] = new class28(var10);
        }
    }
}
