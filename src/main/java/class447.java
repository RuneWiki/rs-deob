import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class447 {

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lij;")
    private class241 field6495 = null;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
    private boolean field6502;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public int field6510;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "Lue;")
    private class126 field6500;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field6501 = 1;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "[I")
    public static int[] field6517 = new int[200];

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "[I")
    public static int[] field6525 = new int[13];

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "Lmo;")
    public static class447 field6512;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "[Ljava/lang/Object;")
    private Object[] field6516;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6514;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method2757(String arg0, int arg1) {
        field6503++;
        if (!this.method2767(-1)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field6495.field3995.method796(class234.method1658(1, var3), 1797367457);
        if (arg1 >= -91) {
            this.field6510 = 3;
        }
        return this.method2760(var4, (byte) 83);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
    public final int method2758(int arg0, int arg1) {
        if (arg1 == 14535) {
            field6504++;
            return this.method2782(93, arg0) ? this.field6495.field4004[arg0] : 0;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II[II)[B")
    public final byte[] method2759(int arg0, int arg1, int[] arg2, int arg3) {
        field6520++;
        if (!this.method2792(arg0, false, arg1)) {
            return null;
        }
        if (this.field6514[arg0] == null || this.field6514[arg0][arg1] == null) {
            boolean var5 = this.method2768(arg2, arg0, arg1, 41);
            if (!var5) {
                this.method2766(arg0, arg3 ^ 0xFFFFD9F3);
                boolean var6 = this.method2768(arg2, arg0, arg1, 91);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class38.method261(-102, false, this.field6514[arg0][arg1]);
        if (arg3 != 27149) {
            this.field6502 = false;
        }
        if (this.field6510 == 1) {
            this.field6514[arg0][arg1] = null;
            if (this.field6495.field4004[arg0] == 1) {
                this.field6514[arg0] = null;
            }
        } else if (this.field6510 == 2) {
            this.field6514[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)I")
    private final int method2760(int arg0, byte arg1) {
        field6496++;
        if (arg1 != 83) {
            return -88;
        } else if (this.method2782(arg1 - 5, arg0)) {
            return this.field6516[arg0] == null ? this.field6500.method927(arg0, 0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static final void method2761(int arg0) {
        class128.method953(16205, 25);
        field6531++;
        class312.method2088(false);
        if (arg0 == 9916) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)Z")
    public final boolean method2762(int arg0, int arg1) {
        field6507++;
        if (!this.method2767(arg0 ^ 0xFFFFFFFE)) {
            return false;
        } else if (this.field6495.field4004.length == arg0) {
            return this.method2775(arg1, (byte) -37, 0);
        } else if (!this.method2782(83, arg1)) {
            return false;
        } else if (this.field6495.field4004[arg1] == 1) {
            return this.method2775(0, (byte) -37, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method2763(byte arg0, int arg1, int arg2) {
        field6518++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (arg0 != -5) {
            return null;
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)[I")
    public final int[] method2764(int arg0, byte arg1) {
        field6527++;
        if (!this.method2782(118, arg0)) {
            return null;
        } else if (arg1 > -117) {
            return null;
        } else {
            int[] var3 = this.field6495.field3989[arg0];
            if (var3 == null) {
                var3 = new int[this.field6495.field4003[arg0]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)I")
    public final int method2765(int arg0, boolean arg1) {
        field6491++;
        if (!this.method2767(-1)) {
            return -1;
        }
        int var3 = this.field6495.field3995.method796(arg0, 1797367457);
        if (!arg1) {
            this.field6502 = false;
        }
        return this.method2782(113, var3) ? var3 : -1;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)V")
    private final void method2766(int arg0, int arg1) {
        if (arg1 != -19458) {
            this.field6495 = null;
        }
        field6533++;
        if (this.field6502) {
            this.field6516[arg0] = this.field6500.method929(arg0, true);
        } else {
            this.field6516[arg0] = class171.method1187(136, this.field6500.method929(arg0, true), false);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Z")
    private final boolean method2767(int arg0) {
        if (arg0 != -1) {
            return false;
        }
        field6511++;
        if (this.field6495 == null) {
            this.field6495 = this.field6500.method931((byte) -98);
            if (this.field6495 == null) {
                return false;
            }
            this.field6514 = new Object[this.field6495.field4002][];
            this.field6516 = new Object[this.field6495.field4002];
        }
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([IIII)Z")
    private final boolean method2768(int[] arg0, int arg1, int arg2, int arg3) {
        field6530++;
        if (!this.method2782(124, arg1)) {
            return false;
        } else if (this.field6516[arg1] == null) {
            return false;
        } else {
            int var5 = this.field6495.field4003[arg1];
            int[] var6 = this.field6495.field3989[arg1];
            if (this.field6514[arg1] == null) {
                this.field6514[arg1] = new Object[this.field6495.field4004[arg1]];
            }
            Object[] var7 = this.field6514[arg1];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class38.method261(-106, true, this.field6516[arg1]);
                class186 var12 = new class186(var11);
                var12.method1329(var12.field3066.length, (byte) -89, 5, arg0);
            } else {
                var11 = class38.method261(-113, false, this.field6516[arg1]);
            }
            byte[] var13;
            try {
                var13 = class349.method2285((byte) -57, var11);
            } catch (RuntimeException var50) {
                throw class243.method1704(var50, "T3 - " + (arg0 != null) + "," + arg1 + "," + var11.length + "," + class323.method2141(var11.length, (byte) 75, var11) + "," + class323.method2141(var11.length - 2, (byte) 75, var11) + "," + this.field6495.field4007[arg1] + "," + this.field6495.field3996);
            }
            if (this.field6502) {
                this.field6516[arg1] = null;
            }
            int var15 = -95 / ((-arg3 - 15) / 54);
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field6510 == 0) {
                    var7[var16] = class171.method1187(136, var13, false);
                } else {
                    var7[var16] = var13;
                }
            } else if (this.field6510 == 2) {
                int var17 = var13.length;
                int var51 = var17 - 1;
                int var18 = var13[var51] & 0xFF;
                int var19 = var51 - var5 * var18 * 4;
                class186 var20 = new class186(var13);
                int var21 = 0;
                int var22 = 0;
                var20.field3044 = var19;
                for (int var23 = 0; var23 < var18; var23++) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < var5; var25++) {
                        var24 += var20.method1284(8388607);
                        int var26;
                        if (var6 == null) {
                            var26 = var25;
                        } else {
                            var26 = var6[var25];
                        }
                        if (arg2 == var26) {
                            var22 = var26;
                            var21 += var24;
                        }
                    }
                }
                if (var21 == 0) {
                    return true;
                }
                byte[] var27 = new byte[var21];
                var20.field3044 = var19;
                int var28 = 0;
                int var29 = 0;
                for (int var30 = 0; var30 < var18; var30++) {
                    int var31 = 0;
                    for (int var32 = 0; var32 < var5; var32++) {
                        var31 += var20.method1284(8388607);
                        int var33;
                        if (var6 == null) {
                            var33 = var32;
                        } else {
                            var33 = var6[var32];
                        }
                        if (arg2 == var33) {
                            class408.method2559(var13, var29, var27, var28, var31);
                            var28 += var31;
                        }
                        var29 += var31;
                    }
                }
                var7[var22] = var27;
            } else {
                int var34 = var13.length;
                int var52 = var34 - 1;
                int var35 = var13[var52] & 0xFF;
                int var36 = var52 - var5 * var35 * 4;
                class186 var37 = new class186(var13);
                var37.field3044 = var36;
                int[] var38 = new int[var5];
                for (int var39 = 0; var39 < var35; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var37.method1284(8388607);
                        var38[var41] += var40;
                    }
                }
                byte[][] var42 = new byte[var5][];
                for (int var43 = 0; var43 < var5; var43++) {
                    var42[var43] = new byte[var38[var43]];
                    var38[var43] = 0;
                }
                var37.field3044 = var36;
                int var44 = 0;
                for (int var45 = 0; var45 < var35; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var37.method1284(8388607);
                        class408.method2559(var13, var44, var42[var47], var38[var47], var46);
                        var44 += var46;
                        var38[var47] += var46;
                    }
                }
                for (int var48 = 0; var48 < var5; var48++) {
                    int var49;
                    if (var6 == null) {
                        var49 = var48;
                    } else {
                        var49 = var6[var48];
                    }
                    if (this.field6510 == 0) {
                        var7[var49] = class171.method1187(136, var42[var48], false);
                    } else {
                        var7[var49] = var42[var48];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2769(String arg0, int arg1) {
        field6528++;
        if (!this.method2767(arg1 ^ 0xFFFFFFFA)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 5) {
            field6525 = null;
        }
        int var4 = this.field6495.field3995.method796(class234.method1658(arg1 - 4, var3), arg1 + 1797367452);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(IB)V")
    public final void method2770(int arg0, byte arg1) {
        field6497++;
        if (arg1 < 108) {
            this.field6516 = null;
        }
        if (this.method2782(94, arg0) && this.field6514 != null) {
            this.field6514[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)[B")
    public final byte[] method2771(int arg0, int arg1, int arg2) {
        field6513++;
        if (arg2 != 3) {
            field6525 = null;
        }
        return this.method2759(arg0, arg1, (int[]) null, arg2 + 27146);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method2772(boolean arg0, String arg1, String arg2) {
        field6506++;
        if (!this.method2767(-1)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        if (!arg0) {
            return null;
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field6495.field3995.method796(class234.method1658(1, var4), 1797367457);
        if (this.method2782(115, var6)) {
            int var7 = this.field6495.field3992[var6].method796(class234.method1658(1, var5), 1797367457);
            return this.method2771(var6, var7, 3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
    public final int method2773(int arg0) {
        field6499++;
        if (this.method2767(-1)) {
            if (arg0 < 54) {
                this.field6502 = true;
            }
            return this.field6495.field4004.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
    public final void method2774(int arg0) {
        if (this.field6514 != null) {
            for (int var2 = 0; var2 < this.field6514.length; var2++) {
                this.field6514[var2] = null;
            }
        }
        if (arg0 != -10298) {
            this.method2791((byte) -48, (String) null);
        }
        field6532++;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)Z")
    public final boolean method2775(int arg0, byte arg1, int arg2) {
        field6509++;
        if (!this.method2792(arg2, false, arg0)) {
            return false;
        } else if (this.field6514[arg2] != null && this.field6514[arg2][arg0] != null) {
            return true;
        } else if (this.field6516[arg2] == null) {
            this.method2766(arg2, -19458);
            if (arg1 == -37) {
                return this.field6516[arg2] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)[B")
    public final byte[] method2776(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        }
        field6494++;
        if (!this.method2767(-1)) {
            return null;
        } else if (this.field6495.field4004.length == 1) {
            return this.method2771(0, arg1, arg0 ^ 0x3);
        } else if (!this.method2782(100, arg1)) {
            return null;
        } else if (this.field6495.field4004[arg1] == 1) {
            return this.method2771(arg1, 0, 3);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)I")
    public final int method2777(int arg0) {
        field6524++;
        if (!this.method2767(-1)) {
            throw new IllegalStateException("");
        }
        if (arg0 != -9) {
            this.field6500 = null;
        }
        return this.field6495.field3996;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Z")
    public final boolean method2778(byte arg0) {
        field6526++;
        if (arg0 > -102) {
            method2787(5, 84, 10, 19);
        }
        if (!this.method2767(-1)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field6495.field3997.length; var3++) {
            int var4 = this.field6495.field3997[var3];
            if (this.field6516[var4] == null) {
                this.method2766(var4, -19458);
                if (this.field6516[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
    public final void method2779(int arg0) {
        field6515++;
        if (this.field6516 != null) {
            for (int var2 = 0; var2 < this.field6516.length; var2++) {
                this.field6516[var2] = null;
            }
        }
        if (arg0 > -84) {
            this.method2785(-114, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method2780(String arg0, byte arg1) {
        field6522++;
        if (this.method2767(-1)) {
            String var3 = arg0.toLowerCase();
            int var4 = 39 / ((arg1 - 24) / 36);
            int var5 = this.field6495.field3995.method796(class234.method1658(1, var3), 1797367457);
            return this.method2785(var5, (byte) -113);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)I")
    public final int method2781(int arg0) {
        field6492++;
        if (!this.method2767(-1)) {
            return 0;
        }
        int var2 = arg0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6516.length; var4++) {
            if (this.field6495.field4003[var4] > 0) {
                var3 += this.method2760(var4, (byte) 83);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(II)Z")
    private final boolean method2782(int arg0, int arg1) {
        field6523++;
        if (!this.method2767(-1)) {
            return false;
        }
        if (arg0 < 75) {
            this.field6500 = null;
        }
        if (arg1 >= 0 && this.field6495.field4004.length > arg1 && this.field6495.field4004[arg1] != 0) {
            return true;
        } else if (class247.field4050) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZIZ)V")
    public final void method2783(boolean arg0, int arg1, boolean arg2) {
        field6521++;
        if (!this.method2767(-1)) {
            return;
        }
        if (arg2) {
            this.field6495.field3988 = null;
            this.field6495.field3992 = null;
        }
        if (arg0) {
            this.field6495.field4001 = null;
            this.field6495.field3995 = null;
        }
        if (arg1 != -16018) {
            method2789(-102, (class312) null);
        }
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(II)V")
    private final void method2784(int arg0, int arg1) {
        field6505++;
        this.field6500.method926(arg1, -31);
        if (arg0 > -6) {
            this.method2768((int[]) null, 120, -51, -49);
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(IB)Z")
    public final boolean method2785(int arg0, byte arg1) {
        field6490++;
        if (!this.method2782(98, arg0)) {
            return false;
        }
        int var3 = -106 / ((-arg1 - 45) / 63);
        if (this.field6516[arg0] == null) {
            this.method2766(arg0, -19458);
            return this.field6516[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)V")
    public static void method2786(int arg0) {
        if (arg0 != 0) {
            method2763((byte) -120, 12, -68);
        }
        field6512 = null;
        field6517 = null;
        field6525 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
    public static final void method2787(int arg0, int arg1, int arg2, int arg3) {
        class232 var4 = class423.field6252[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class303 var5 = var4.field3878;
        class303 var6 = var4.field3889;
        if (var5 != null) {
            var5.field4801 = var5.field4801 * arg3 / 16;
            var5.field4794 = var5.field4794 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field4801 = var6.field4801 * arg3 / 16;
            var6.field4794 = var6.field4794 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2788(int arg0, String arg1, String arg2) {
        field6498++;
        if (!this.method2767(-1)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6495.field3995.method796(class234.method1658(1, var4), 1797367457);
        if (this.method2782(84, var6)) {
            int var7 = this.field6495.field3992[var6].method796(class234.method1658(arg0, var5), 1797367457);
            return this.method2775(var7, (byte) -37, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILe;)V")
    public static final void method2789(int arg0, class312 arg1) {
        field6529++;
        if (class144.field2267 < 2 && class374.field5639 == 0 && !class449.field6546) {
            return;
        }
        String var2;
        if (class374.field5639 == 1 && class144.field2267 < 2) {
            var2 = class318.field4986 + class77.field959 + class287.field4606 + " ->";
        } else if (class449.field6546 && class144.field2267 < 2) {
            var2 = class306.field4854 + class77.field959 + class213.field3414 + " ->";
        } else if (class183.field2983 && class232.field3856[81] && class144.field2267 > 2) {
            var2 = class30.method209((class418) class86.field1089.field459.field2536.field2536, (byte) -119);
        } else {
            class418 var3 = (class418) class86.field1089.field459.field2536;
            var2 = class30.method209(var3, (byte) -115);
            int[] var4 = null;
            if (class222.method1590((byte) -21, var3.field6192)) {
                var4 = class155.method1092(true, (int) var3.field6194).field1361;
            } else if (class239.method1692(var3.field6192, 69)) {
                class50 var5 = class39.field499[(int) var3.field6194];
                if (var5 != null) {
                    var4 = var5.field615.field3797;
                }
            } else if (class104.method792(var3.field6192, 20308)) {
                if (var3.field6192 == 1001) {
                    var4 = class137.method1003((int) var3.field6194, -30796).field1959;
                } else {
                    var4 = class137.method1003((int) (var3.field6194 >>> 32 & 0x7FFFFFFFL), -30796).field1959;
                }
            }
            if (var4 != null) {
                var2 = var2 + class269.method1826(true, var4);
            }
        }
        int var6 = 82 % ((30 - arg0) / 41);
        if (class144.field2267 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class144.field2267 - 2) + class225.field3741;
        }
        if (class72.field897 != null) {
            class452 var8 = class72.field897.method1205(arg1, -102);
            if (var8 == null) {
                var8 = class11.field133;
            }
            var8.method2817((byte) -111, class376.field5680, class72.field897.field2834, class27.field318, class421.field6213, class297.field4725, class72.field897.field2802, class72.field897.field2705, class372.field5627, class72.field897.field2842, var2, class318.field4985, class201.field3222, class72.field897.field2690, class72.field897.field2772);
            class59.method389(class201.field3222[1], class201.field3222[3], class201.field3222[0], class201.field3222[2], (byte) -107);
        } else if (class61.field792 != null && class61.field787 == 0) {
            int var7 = class11.field133.method2809(class422.field6247 + 4, class372.field5627, 8364, class318.field4985, class314.field4933 + 16, class297.field4725, class376.field5680, var2, 16777215, 0);
            class59.method389(class314.field4933, 16, class422.field6247 + 4, var7 + class413.field6111.method2162(var2, 81), (byte) -73);
            return;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method2790(boolean arg0, String arg1) {
        field6519++;
        if (!this.method2767(-1)) {
            return;
        }
        if (arg0) {
            this.method2777(-120);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field6495.field3995.method796(class234.method1658(1, var3), 1797367457);
        this.method2784(-73, var4);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method2791(byte arg0, String arg1) {
        field6508++;
        if (!this.method2767(-1)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field6495.field3995.method796(class234.method1658(1, var3), 1797367457);
        if (this.method2782(115, var4)) {
            int var5 = 98 % ((arg0 + 10) / 49);
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lue;ZI)V")
    public class447(class126 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6502 = arg1;
        this.field6510 = arg2;
        this.field6500 = arg0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZI)Z")
    private final boolean method2792(int arg0, boolean arg1, int arg2) {
        field6493++;
        if (arg1) {
            this.method2777(-38);
        }
        if (!this.method2767(-1)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field6495.field4004.length > arg0 && arg2 < this.field6495.field4004[arg0]) {
            return true;
        } else if (class247.field4050) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }
}
