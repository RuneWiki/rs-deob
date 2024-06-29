import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class421 extends class354 {

    @OriginalMember(owner = "client!nw", name = "M", descriptor = "I")
    private int field6407 = 0;

    @OriginalMember(owner = "client!nw", name = "Y", descriptor = "[S")
    private short[] field6419 = new short[257];

    @OriginalMember(owner = "client!nw", name = "S", descriptor = "I")
    public static int field6413 = 0;

    @OriginalMember(owner = "client!nw", name = "X", descriptor = "Lla;")
    public static class319 field6418;

    @OriginalMember(owner = "client!nw", name = "ab", descriptor = "[I")
    public static int[] field6421;

    @OriginalMember(owner = "client!nw", name = "Z", descriptor = "[I")
    public static int[] field6420;

    @OriginalMember(owner = "client!nw", name = "K", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!nw", name = "L", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!nw", name = "N", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!nw", name = "O", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!nw", name = "P", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!nw", name = "Q", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!nw", name = "T", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!nw", name = "U", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!nw", name = "R", descriptor = "[I")
    private int[] field6412;

    @OriginalMember(owner = "client!nw", name = "V", descriptor = "[I")
    private int[] field6416;

    @OriginalMember(owner = "client!nw", name = "W", descriptor = "[[I")
    private int[][] field6417;

    static {
        new class446("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field6418 = new class319(25, 6);
        field6421 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
        field6420 = new int[250];
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)[I", line = 3)
    private final int[] method2572(int arg0, int arg1) {
        ++field6406;
        if (arg1 < 0) {
            return this.field6412;
        } else {
            int var3 = -6 / ((arg0 - 14) / 61);
            return this.field6417.length <= arg1 ? this.field6416 : this.field6417[arg1];
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)V", line = 28)
    public static final void method2573(boolean arg0) {
        ++field6411;
        if (class430.field6548 != null) {
            if (class430.field6548.field3322 == 1) {
                class430.field6548 = null;
                return;
            }
            if (~class430.field6548.field3322 == -3) {
                class276.method1779(class250.field3480, class91.field1319, 2, 0);
                class430.field6548 = null;
                return;
            }
        }
        if (arg0) {
            method2573(true);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZILqa;I)V", line = 58)
    public static final void method2574(boolean arg0, int arg1, class165 arg2, int arg3) {
        class515.field7568 = new class486[arg1][arg3];
        ++field6405;
        class456.field6845 = arg2;
        if (class394.field6030 != null) {
            class230.field3296 = class419.method2561(false, class394.field6030[4], class394.field6030[1], class394.field6030[2], class394.field6030[0], class394.field6030[5], class394.field6030[3]);
        }
        class232.field3306 = new class486();
        class86.method586((byte) -128);
        if (!arg0) {
            method2574(true, 113, (class165) null, 94);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lnj;II)V", line = 77)
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field6407 = arg0.method1087(false);
            this.field6417 = new int[arg0.method1087(false)][2];
            for (int var4 = 0; ~var4 > ~this.field6417.length; ++var4) {
                this.field6417[var4][0] = arg0.method1074(-635989152);
                this.field6417[var4][1] = arg0.method1074(-635989152);
            }
        }
        ++field6408;
        if (arg2 != 1638) {
            this.method272((class164) null, 60, 50);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(BI)[I", line = 105)
    public final int[] method270(byte arg0, int arg1) {
        ++field6415;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 > -74) {
            method2573(true);
        }
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 98, 0, arg1);
            for (int var5 = 0; class531.field7814 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field6419[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "(I)V", line = 149)
    public final void method357(int arg0) {
        if (arg0 < 28) {
            this.method2576(127);
        }
        ++field6410;
        if (this.field6417 == null) {
            this.field6417 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field6417.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field6407 == -3) {
                this.method2575(-114);
            }
            class410.method2530(1);
            this.method2576(1);
        }
    }

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "(I)V", line = 172)
    private final void method2575(int arg0) {
        ++field6409;
        int[] var2 = this.field6417[0];
        int[] var3 = this.field6417[1];
        int[] var4 = this.field6417[this.field6417.length + -2];
        int[] var5 = this.field6417[this.field6417.length - 1];
        if (arg0 < -111) {
            this.field6416 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - var5[1] + var4[1] };
            this.field6412 = new int[] { var2[0] - -var2[0] - var3[0], var2[1] - var3[1] + var2[1] };
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V", line = 201)
    public class421() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "(I)V", line = 208)
    private final void method2576(int arg0) {
        ++field6414;
        if (arg0 != 1) {
            this.field6412 = null;
        }
        int var2 = this.field6407;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field6417.length + -1) < ~var5 && this.field6417[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field6417[var5 + -1];
                    int[] var7 = this.field6417[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class165.field2241[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field6419[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field6417.length - 1) < ~var14 && ~this.field6417[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field6417[var14 + -1];
                    int[] var16 = this.field6417[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field6419[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field6417.length + -1 > var22 && ~var21 <= ~this.field6417[var22][0]; ++var22) {
                }
                int[] var23 = this.field6417[var22 - 1];
                int[] var24 = this.field6417[var22];
                int var25 = this.method2572(arg0 ^ -106, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2572(-93, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var25 + -var27 + var26;
                int var32 = -var26 - var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var36 + var35 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field6419[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V", line = 394)
    public static void method2577(byte arg0) {
        field6421 = null;
        int var1 = -101 % (arg0 / 46);
        field6420 = null;
        field6418 = null;
    }
}
