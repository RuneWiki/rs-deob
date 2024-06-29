import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class410 extends class601 {

    @OriginalMember(owner = "client!ada", name = "K", descriptor = "[S")
    private short[] field5437 = new short[257];

    @OriginalMember(owner = "client!ada", name = "T", descriptor = "I")
    private int field5445 = 0;

    @OriginalMember(owner = "client!ada", name = "H", descriptor = "S")
    public static short field5434 = 205;

    @OriginalMember(owner = "client!ada", name = "V", descriptor = "[C")
    private static char[] field5447 = new char[64];

    @OriginalMember(owner = "client!ada", name = "G", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!ada", name = "I", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!ada", name = "L", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ada", name = "Q", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ada", name = "R", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ada", name = "S", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!ada", name = "U", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ada", name = "W", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ada", name = "X", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ada", name = "J", descriptor = "Lwm;")
    public static class30 field5436;

    @OriginalMember(owner = "client!ada", name = "N", descriptor = "[I")
    private int[] field5440;

    @OriginalMember(owner = "client!ada", name = "Y", descriptor = "[I")
    private int[] field5450;

    @OriginalMember(owner = "client!ada", name = "P", descriptor = "[[I")
    private int[][] field5441;

    @OriginalMember(owner = "client!ada", name = "M", descriptor = "[[[B")
    public static byte[][][] field5439;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "(B)V")
    private final void method2378(byte arg0) {
        ++field5433;
        int var2 = this.field5445;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field5441.length - 1 && var4 >= this.field5441[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5441[var5 - 1];
                    int[] var7 = this.field5441[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class558.field7100[(var8 & 8191) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5437[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field5441.length + -1 > var14 && var13 >= this.field5441[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5441[var14 + -1];
                    int[] var16 = this.field5441[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5437[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field5441.length - 1 && ~var21 <= ~this.field5441[var22][0]; ++var22) {
                }
                int[] var23 = this.field5441[var22 + -1];
                int[] var24 = this.field5441[var22];
                int var25 = this.method2380(51, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2380(23, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var28 - -var26;
                int var32 = -var26 + -var31 + var25;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 - -var26 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5437[var20] = (short) var38;
            }
        }
        if (arg0 <= 20) {
            field5439 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)V")
    private final void method2379(int arg0) {
        ++field5444;
        int[] var2 = this.field5441[0];
        int[] var3 = this.field5441[1];
        int[] var4 = this.field5441[this.field5441.length + -2];
        if (arg0 < -44) {
            int[] var5 = this.field5441[this.field5441.length + -1];
            this.field5450 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - var5[1] - -var4[1] };
            this.field5440 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - var3[1] + var2[1] };
        }
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(II)[I")
    private final int[] method2380(int arg0, int arg1) {
        ++field5443;
        if (arg1 < 0) {
            return this.field5440;
        } else if (~this.field5441.length >= ~arg1) {
            return this.field5450;
        } else {
            return arg0 <= 0 ? null : this.field5441[arg1];
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
    public class410() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field5449;
        int var4 = -46 / ((arg2 - 40) / 52);
        if (arg1 == 0) {
            this.field5445 = arg0.method1509(true);
            this.field5441 = new int[arg0.method1509(true)][2];
            for (int var5 = 0; this.field5441.length > var5; ++var5) {
                this.field5441[var5][0] = arg0.method1553((byte) -123);
                this.field5441[var5][1] = arg0.method1553((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)V")
    public static final void method2381(int arg0) {
        if (class331.field4047 != null) {
            class331.field4047.method1026((byte) -104);
        }
        ++field5448;
        if (class223.field3037 != null) {
            class223.field3037.method1026((byte) -104);
        }
        if (arg0 != -224) {
            field5434 = 12;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IC)C")
    public static final char method2382(int arg0, char arg1) {
        ++field5435;
        if (arg0 != -7848) {
            field5434 = 4;
        }
        if (~arg1 == -199) {
            return 'E';
        } else if (arg1 == 230) {
            return 'e';
        } else if (~arg1 == -224) {
            return 's';
        } else if (~arg1 == -339) {
            return 'E';
        } else {
            return (char) (arg1 == 339 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)V")
    public final void method292(byte arg0) {
        ++field5442;
        if (this.field5441 == null) {
            this.field5441 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field5441.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field5445 == 2) {
                this.method2379(-68);
            }
            if (arg0 <= 44) {
                field5434 = 7;
            }
            class257.method1651(0);
            this.method2378((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "(I)V")
    public static void method2383(int arg0) {
        field5436 = null;
        if (arg0 <= -114) {
            field5439 = null;
            field5447 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field5438;
        if (arg1 >= -76) {
            method2382(61, (char) 65492);
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0, 27123, 0);
            for (int var5 = 0; var5 < class418.field5518; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field5437[var6];
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field5447[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; ~var1 > -53; ++var1) {
            field5447[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field5447[var2] = (char) (var2 + -4);
        }
        field5447[63] = '/';
        field5447[62] = '+';
    }
}
