import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class668 {

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "Ldw;")
    private class667 field9609 = null;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "Z")
    private boolean field9596;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Lhr;")
    private class488 field9575;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public int field9597;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "Ler;")
    public static class90 field9580 = new class90("runescape", 0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field9571;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field9582;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!jn", name = "A", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!jn", name = "B", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!jn", name = "O", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "[Ljava/lang/Object;")
    private Object[] field9579;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field9589;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method3778(int arg0, String arg1, String arg2) {
        field9574++;
        if (!this.method3792(0)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = 38 % ((arg0 - 12) / 45);
        int var7 = this.field9609.field9553.method2725(class429.method2578(var4, (byte) 120), 107);
        if (this.method3813(var7, (byte) 81)) {
            int var8 = this.field9609.field9556[var7].method2725(class429.method2578(var5, (byte) 124), 51);
            return this.method3800(var8, var7, (byte) -92);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
    public final int method3779(int arg0) {
        field9598++;
        if (arg0 == 5) {
            return this.method3792(0) ? this.field9609.field9560.length : -1;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public final void method3780(int arg0) {
        field9570++;
        if (this.field9579 != null) {
            for (int var2 = 0; var2 < this.field9579.length; var2++) {
                this.field9579[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.method3799(null, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)Z")
    public final boolean method3781(int arg0) {
        field9605++;
        if (arg0 != -20793) {
            return false;
        } else if (this.method3792(0)) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field9609.field9566.length; var3++) {
                int var4 = this.field9609.field9566[var3];
                if (this.field9579[var4] == null) {
                    this.method3796(18871, var4);
                    if (this.field9579[var4] == null) {
                        var2 = false;
                    }
                }
            }
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)I")
    public final int method3782(byte arg0) {
        if (arg0 != 51) {
            return -73;
        }
        field9571++;
        if (!this.method3792(0)) {
            throw new IllegalStateException("");
        }
        return this.field9609.field9554;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Z")
    public final boolean method3783(int arg0, int arg1, int arg2) {
        field9587++;
        if (arg2 != 32069) {
            return false;
        } else if (!this.method3788(arg0, arg1, (byte) -127)) {
            return false;
        } else if (this.field9589[arg0] != null && this.field9589[arg0][arg1] != null) {
            return true;
        } else if (this.field9579[arg0] == null) {
            this.method3796(18871, arg0);
            return this.field9579[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
    public final int method3784(int arg0, int arg1) {
        field9595++;
        if (this.method3792(0)) {
            int var3 = -80 / ((3 - arg1) / 38);
            int var4 = this.field9609.field9553.method2725(arg0, 80);
            return this.method3813(var4, (byte) 81) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
    public final void method3785(byte arg0) {
        if (this.field9589 != null) {
            for (int var2 = 0; var2 < this.field9589.length; var2++) {
                this.field9589[var2] = null;
            }
        }
        field9567++;
        int var3 = -40 / ((39 - arg0) / 51);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([IIBI)Z")
    private final boolean method3786(int[] arg0, int arg1, byte arg2, int arg3) {
        field9599++;
        if (!this.method3813(arg1, (byte) 81)) {
            return false;
        } else if (this.field9579[arg1] == null) {
            return false;
        } else {
            int var5 = this.field9609.field9558[arg1];
            int[] var6 = this.field9609.field9562[arg1];
            if (this.field9589[arg1] == null) {
                this.field9589[arg1] = new Object[this.field9609.field9560[arg1]];
            }
            Object[] var7 = this.field9589[arg1];
            boolean var8 = true;
            int var9 = 88 / ((47 - arg2) / 42);
            for (int var10 = 0; var10 < var5; var10++) {
                int var11;
                if (var6 == null) {
                    var11 = var10;
                } else {
                    var11 = var6[var10];
                }
                if (var7[var11] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var12;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var12 = class589.method3422(this.field9579[arg1], true, true);
                class389 var13 = new class389(var12);
                var13.method2238(false, arg0, var13.field5205.length, 5);
            } else {
                var12 = class589.method3422(this.field9579[arg1], true, false);
            }
            byte[] var14;
            try {
                var14 = class690.method3900((byte) -111, var12);
            } catch (RuntimeException var50) {
                throw class214.method1303(var50, "T3 - " + (arg0 != null) + "," + arg1 + "," + var12.length + "," + class365.method2113(var12.length, (byte) -101, var12) + "," + class365.method2113(var12.length - 2, (byte) -81, var12) + "," + this.field9609.field9557[arg1] + "," + this.field9609.field9554);
            }
            if (this.field9596) {
                this.field9579[arg1] = null;
            }
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field9597 == 0) {
                    var7[var16] = class699.method3918(false, var14, true);
                } else {
                    var7[var16] = var14;
                }
            } else if (this.field9597 == 2) {
                int var33 = var14.length;
                int var52 = var33 - 1;
                int var34 = var14[var52] & 0xFF;
                int var35 = var52 - var34 * 4 * var5;
                class389 var36 = new class389(var14);
                int var37 = 0;
                int var38 = 0;
                var36.field5195 = var35;
                for (int var39 = 0; var39 < var34; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var36.method2255(255);
                        int var42;
                        if (var6 == null) {
                            var42 = var41;
                        } else {
                            var42 = var6[var41];
                        }
                        if (arg3 == var42) {
                            var38 = var42;
                            var37 += var40;
                        }
                    }
                }
                if (var37 == 0) {
                    return true;
                }
                byte[] var43 = new byte[var37];
                var36.field5195 = var35;
                int var44 = 0;
                int var45 = 0;
                for (int var46 = 0; var46 < var34; var46++) {
                    int var47 = 0;
                    for (int var48 = 0; var48 < var5; var48++) {
                        var47 += var36.method2255(255);
                        int var49;
                        if (var6 == null) {
                            var49 = var48;
                        } else {
                            var49 = var6[var48];
                        }
                        if (arg3 == var49) {
                            class252.method1545(var14, var45, var43, var44, var47);
                            var44 += var47;
                        }
                        var45 += var47;
                    }
                }
                var7[var38] = var43;
            } else {
                int var17 = var14.length;
                int var51 = var17 - 1;
                int var18 = var14[var51] & 0xFF;
                int var19 = var51 - var5 * var18 * 4;
                class389 var20 = new class389(var14);
                int[] var21 = new int[var5];
                var20.field5195 = var19;
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var20.method2255(255);
                        var21[var24] += var23;
                    }
                }
                byte[][] var25 = new byte[var5][];
                for (int var26 = 0; var26 < var5; var26++) {
                    var25[var26] = new byte[var21[var26]];
                    var21[var26] = 0;
                }
                var20.field5195 = var19;
                int var27 = 0;
                for (int var28 = 0; var28 < var18; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var5; var30++) {
                        var29 += var20.method2255(255);
                        class252.method1545(var14, var27, var25[var30], var21[var30], var29);
                        var27 += var29;
                        var21[var30] += var29;
                    }
                }
                for (int var31 = 0; var31 < var5; var31++) {
                    int var32;
                    if (var6 == null) {
                        var32 = var31;
                    } else {
                        var32 = var6[var31];
                    }
                    if (this.field9597 == 0) {
                        var7[var32] = class699.method3918(false, var25[var31], true);
                    } else {
                        var7[var32] = var25[var31];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([IIII)[B")
    public final byte[] method3787(int[] arg0, int arg1, int arg2, int arg3) {
        field9572++;
        if (arg1 > -79) {
            this.field9579 = null;
        }
        if (!this.method3788(arg3, arg2, (byte) -127)) {
            return null;
        }
        if (this.field9589[arg3] == null || this.field9589[arg3][arg2] == null) {
            boolean var5 = this.method3786(arg0, arg3, (byte) 94, arg2);
            if (!var5) {
                this.method3796(18871, arg3);
                boolean var6 = this.method3786(arg0, arg3, (byte) -128, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class589.method3422(this.field9589[arg3][arg2], true, false);
        if (this.field9597 == 1) {
            this.field9589[arg3][arg2] = null;
            if (this.field9609.field9560[arg3] == 1) {
                this.field9589[arg3] = null;
            }
        } else if (this.field9597 == 2) {
            this.field9589[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)Z")
    private final boolean method3788(int arg0, int arg1, byte arg2) {
        field9601++;
        if (!this.method3792(0)) {
            return false;
        }
        if (arg2 != -127) {
            this.field9579 = null;
        }
        if (arg0 >= 0 && arg1 >= 0 && this.field9609.field9560.length > arg0 && this.field9609.field9560[arg0] > arg1) {
            return true;
        } else if (class265.field3642) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method3789(String arg0, int arg1) {
        field9610++;
        if (!this.method3792(0)) {
            return 0;
        } else if (arg1 == 3) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field9609.field9553.method2725(class429.method2578(var3, (byte) 109), 101);
            return this.method3793(100, var4);
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V")
    public final void method3790(boolean arg0, int arg1) {
        field9573++;
        if (!arg0) {
            this.field9589 = null;
        }
        if (this.method3813(arg1, (byte) 81) && this.field9589 != null) {
            this.field9589[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
    public static void method3791(int arg0) {
        field9580 = null;
        if (arg0 <= 46) {
            method3794(123, null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)Z")
    private final boolean method3792(int arg0) {
        field9583++;
        if (this.field9609 == null) {
            this.field9609 = this.field9575.method1301(18322);
            if (this.field9609 == null) {
                return false;
            }
            this.field9589 = new Object[this.field9609.field9563][];
            this.field9579 = new Object[this.field9609.field9563];
        }
        if (arg0 != 0) {
            this.method3793(110, 49);
        }
        return true;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I")
    private final int method3793(int arg0, int arg1) {
        field9591++;
        if (!this.method3813(arg1, (byte) 81)) {
            return 0;
        } else if (this.field9579[arg1] == null) {
            if (arg0 != 100) {
                this.method3799(null, (byte) -78);
            }
            return this.field9575.method1299((byte) -71, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[B)V")
    public static final void method3794(int arg0, byte[] arg1) {
        field9582++;
        class389 var2 = new class389(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var3 = var2.method2229(255);
                    if (var3 == 0) {
                        if (arg0 != 5) {
                            field9580 = null;
                            return;
                        }
                        return;
                    }
                    if (var3 == 1) {
                        int[] var8 = class167.field2046 = new int[6];
                        var8[0] = var2.method2260(-98);
                        var8[1] = var2.method2260(-81);
                        var8[2] = var2.method2260(-64);
                        var8[3] = var2.method2260(-54);
                        var8[4] = var2.method2260(-85);
                        var8[5] = var2.method2260(-70);
                    } else if (var3 == 4) {
                        int var4 = var2.method2229(arg0 ^ 0xFA);
                        class580.field8461 = new int[var4];
                        for (int var5 = 0; var5 < var4; var5++) {
                            class580.field8461[var5] = var2.method2260(-61);
                            if (class580.field8461[var5] == 65535) {
                                class580.field8461[var5] = -1;
                            }
                        }
                    } else if (var3 == 5) {
                        int var6 = var2.method2229(255);
                        class258.field3541 = new int[var6];
                        for (int var7 = 0; var7 < var6; var7++) {
                            class258.field3541[var7] = var2.method2260(-31);
                            if (class258.field3541[var7] == 65535) {
                                class258.field3541[var7] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method3795(byte arg0, String arg1) {
        field9592++;
        int var3 = this.method3804((byte) 80, "");
        int var4 = 28 / ((26 - arg0) / 45);
        return var3 == -1 ? this.method3803(arg1, "", 0) : this.method3803("", arg1, 0);
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V")
    private final void method3796(int arg0, int arg1) {
        field9577++;
        if (arg0 != 18871) {
            this.field9609 = null;
        }
        if (this.field9596) {
            this.field9579[arg1] = this.field9575.method1312((byte) 110, arg1);
        } else {
            this.field9579[arg1] = class699.method3918(false, this.field9575.method1312((byte) 110, arg1), true);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)Z")
    public final boolean method3797(int arg0, byte arg1) {
        if (arg1 != 66) {
            return false;
        }
        field9608++;
        if (!this.method3813(arg0, (byte) 81)) {
            return false;
        } else if (this.field9579[arg0] == null) {
            this.method3796(18871, arg0);
            return this.field9579[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)Z")
    public static final boolean method3798(int arg0, int arg1, int arg2) {
        field9576++;
        if (arg0 != 100) {
            field9606 = 55;
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method3799(String arg0, byte arg1) {
        field9603++;
        if (!this.method3792(0)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field9609.field9553.method2725(class429.method2578(var3, (byte) 126), 38);
        if (arg1 <= 25) {
            method3791(92);
        }
        this.method3801(-698, var4);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIB)[B")
    public final byte[] method3800(int arg0, int arg1, byte arg2) {
        if (arg2 == -92) {
            field9586++;
            return this.method3787(null, -87, arg0, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(II)V")
    private final void method3801(int arg0, int arg1) {
        this.field9575.method1302((byte) 51, arg1);
        field9569++;
        if (arg0 != -698) {
            this.method3810(-21, null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(IB)Z")
    public final boolean method3802(int arg0, byte arg1) {
        field9578++;
        int var3 = -44 / ((arg1 - 55) / 46);
        if (!this.method3792(0)) {
            return false;
        } else if (this.field9609.field9560.length == 1) {
            return this.method3783(0, arg0, 32069);
        } else if (!this.method3813(arg0, (byte) 81)) {
            return false;
        } else if (this.field9609.field9560[arg0] == 1) {
            return this.method3783(arg0, 0, 32069);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    private final boolean method3803(String arg0, String arg1, int arg2) {
        field9590++;
        if (!this.method3792(arg2 + arg2)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field9609.field9553.method2725(class429.method2578(var4, (byte) 117), arg2 ^ 0x5B);
        if (this.method3813(var6, (byte) 81)) {
            int var7 = this.field9609.field9556[var6].method2725(class429.method2578(var5, (byte) 104), arg2 ^ 0x61);
            return this.method3783(var6, var7, 32069);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(BLjava/lang/String;)I")
    public final int method3804(byte arg0, String arg1) {
        field9585++;
        if (!this.method3792(0)) {
            return -1;
        }
        if (arg0 < 72) {
            this.field9596 = true;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field9609.field9553.method2725(class429.method2578(var3, (byte) 115), 76);
        return this.method3813(var4, (byte) 81) ? var4 : -1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)I")
    public final int method3805(int arg0, boolean arg1) {
        field9568++;
        if (this.method3813(arg0, (byte) 81)) {
            if (arg1) {
                this.method3790(false, 95);
            }
            return this.field9609.field9560[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZZ)V")
    public final void method3806(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            this.method3784(-106, -124);
        }
        field9593++;
        if (!this.method3792(0)) {
            return;
        }
        if (arg1) {
            this.field9609.field9553 = null;
            this.field9609.field9565 = null;
        }
        if (arg0) {
            this.field9609.field9551 = null;
            this.field9609.field9556 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method3807(int arg0, String arg1) {
        field9588++;
        if (this.method3792(arg0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field9609.field9553.method2725(class429.method2578(var3, (byte) 104), 24);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "(II)[I")
    public final int[] method3808(int arg0, int arg1) {
        field9602++;
        if (!this.method3813(arg1, (byte) 81)) {
            return null;
        }
        int[] var3 = this.field9609.field9562[arg1];
        if (arg0 <= 38) {
            return null;
        }
        if (var3 == null) {
            var3 = new int[this.field9609.field9558[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)I")
    public final int method3809(int arg0) {
        field9604++;
        if (!this.method3792(arg0 + 2)) {
            return 0;
        } else if (arg0 == -2) {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field9579.length; var4++) {
                if (this.field9609.field9558[var4] > 0) {
                    var3 += this.method3793(100, var4);
                    var2 += 100;
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method3810(int arg0, String arg1) {
        field9581++;
        if (this.method3792(arg0 ^ arg0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field9609.field9553.method2725(class429.method2578(var3, (byte) 116), 92);
            return this.method3797(var4, (byte) 66);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "(II)[B")
    public final byte[] method3811(int arg0, int arg1) {
        field9600++;
        if (!this.method3792(0)) {
            return null;
        } else if (this.field9609.field9560.length == 1) {
            return this.method3800(arg1, 0, (byte) -92);
        } else if (!this.method3813(arg1, (byte) 81)) {
            return null;
        } else if (arg0 <= 111) {
            return null;
        } else if (this.field9609.field9560[arg1] == 1) {
            return this.method3800(0, arg1, (byte) -92);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method3812(String arg0, String arg1, int arg2) {
        field9607++;
        if (!this.method3792(0)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field9609.field9553.method2725(class429.method2578(var4, (byte) 102), 75);
        if (var6 < 0) {
            return false;
        }
        if (arg2 < 50) {
            method3791(74);
        }
        int var7 = this.field9609.field9556[var6].method2725(class429.method2578(var5, (byte) 102), 61);
        return var7 >= 0;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(IB)Z")
    private final boolean method3813(int arg0, byte arg1) {
        field9594++;
        if (arg1 != 81) {
            this.method3781(-16);
        }
        if (!this.method3792(0)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field9609.field9560.length && this.field9609.field9560[arg0] != 0) {
            return true;
        } else if (class265.field3642) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lhr;ZI)V")
    public class668(class488 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field9596 = arg1;
        this.field9575 = arg0;
        this.field9597 = arg2;
    }
}
