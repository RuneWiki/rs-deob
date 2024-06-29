import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class265 extends class14 {

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "[S")
    private short[] field3491 = new short[257];

    @OriginalMember(owner = "client!fu", name = "X", descriptor = "I")
    private int field3501 = 0;

    @OriginalMember(owner = "client!fu", name = "W", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!fu", name = "ab", descriptor = "[Z")
    public static boolean[] field3504;

    @OriginalMember(owner = "client!fu", name = "Z", descriptor = "Lcu;")
    public static class145 field3503;

    @OriginalMember(owner = "client!fu", name = "bb", descriptor = "Lcu;")
    public static class145 field3505;

    @OriginalMember(owner = "client!fu", name = "db", descriptor = "Lvj;")
    public static class304 field3507;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!fu", name = "T", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!fu", name = "U", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!fu", name = "Y", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!fu", name = "R", descriptor = "[I")
    private int[] field3495;

    @OriginalMember(owner = "client!fu", name = "V", descriptor = "[I")
    private int[] field3499;

    @OriginalMember(owner = "client!fu", name = "cb", descriptor = "[Lvi;")
    public static class375[] field3506;

    @OriginalMember(owner = "client!fu", name = "S", descriptor = "[[I")
    private int[][] field3496;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(B)V")
    public static void method1592(byte arg0) {
        field3504 = null;
        field3505 = null;
        field3506 = null;
        field3503 = null;
        if (arg0 > -19) {
            field3507 = null;
        }
        field3507 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (~arg0 == -1) {
            this.field3501 = arg2.method2238(255);
            this.field3496 = new int[arg2.method2238(255)][2];
            for (int var4 = 0; ~var4 > ~this.field3496.length; ++var4) {
                this.field3496[var4][0] = arg2.method2212((byte) 83);
                this.field3496[var4][1] = arg2.method2212((byte) 83);
            }
        }
        int var5 = 41 % ((-51 - arg1) / 37);
        ++field3502;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field3492;
        if (arg1 >= -2) {
            return null;
        } else {
            int[] var3 = super.field270.method2263(-29596, arg0);
            if (super.field270.field5222) {
                int[] var4 = this.method145(arg0, 0, -18596);
                for (int var5 = 0; ~var5 > ~class115.field1637; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field3491[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
    private final void method1593(int arg0) {
        if (arg0 == -1) {
            int var2 = this.field3501;
            if (var2 != 2) {
                if (~var2 == -2) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; this.field3496.length - 1 > var5 && ~var4 <= ~this.field3496[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field3496[var5 + -1];
                        int[] var7 = this.field3496[var5];
                        int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                        int var9 = 4096 - class289.field3779[var8 >> 5 & 255] >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (var11 >= 32768) {
                            var11 = 32767;
                        }
                        this.field3491[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; this.field3496.length + -1 > var14 && ~var13 <= ~this.field3496[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field3496[var14 + -1];
                        int[] var16 = this.field3496[var14];
                        int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (var19 <= -32768) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field3491[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field3496.length + -1) && ~var21 <= ~this.field3496[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field3496[var22 + -1];
                    int[] var24 = this.field3496[var22];
                    int var25 = this.method1595(var22 + -2, (byte) -123)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method1595(var22 - -1, (byte) -122)[1];
                    int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = -var25 + -var27 + var26 + var28;
                    int var32 = -var26 + var25 + -var31;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var35 - -var26 + var36 + var37;
                    if (var38 <= -32768) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field3491[var20] = (short) var38;
                }
            }
            ++field3493;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field3497;
        if (this.field3496 == null) {
            this.field3496 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field3496.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3501 == -3) {
                this.method1597(-98);
            }
            class204.method1307((byte) 64);
            int var2 = 63 / ((arg0 - 39) / 59);
            this.method1593(-1);
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(B)Lii;")
    public static final class386 method1594(byte arg0) {
        ++field3498;
        class377.field5105 = 0;
        if (arg0 != -68) {
            field3504 = null;
        }
        return class193.method1241((byte) 85);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(IB)[I")
    private final int[] method1595(int arg0, byte arg1) {
        ++field3488;
        if (arg0 < 0) {
            return this.field3499;
        } else {
            if (arg1 > -106) {
                this.method142((byte) -80);
            }
            return ~this.field3496.length >= ~arg0 ? this.field3495 : this.field3496[arg0];
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1596(byte arg0, byte[] arg1) {
        if (arg0 != -8) {
            return null;
        } else {
            ++field3489;
            class379 var2 = new class379(arg1);
            int var3 = var2.method2238(255);
            int var4 = var2.method2232((byte) 125);
            if (~var4 > -1 || ~class175.field2551 != -1 && ~class175.field2551 > ~var4) {
                throw new RuntimeException();
            } else if (~var3 == -1) {
                byte[] var7 = new byte[var4];
                var2.method2191(0, -9637, var7, var4);
                return var7;
            } else {
                int var5 = var2.method2232((byte) 126);
                if (var5 >= 0 && (~class175.field2551 == -1 || ~var5 >= ~class175.field2551)) {
                    byte[] var6 = new byte[var5];
                    if (~var3 == -2) {
                        class230.method1435(var6, var5, arg1, var4, 9);
                    } else {
                        class9.field217.method2566(var6, true, var2);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
    private final void method1597(int arg0) {
        ++field3490;
        int[] var2 = this.field3496[0];
        int[] var3 = this.field3496[1];
        if (arg0 >= -9) {
            this.field3499 = null;
        }
        int[] var4 = this.field3496[this.field3496.length - 2];
        int[] var5 = this.field3496[this.field3496.length - 1];
        this.field3495 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] - (var5[1] - var4[1]) };
        this.field3499 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] - -var2[1] - var3[1] };
    }

    static {
        new class304("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field3504 = new boolean[5];
        field3503 = new class145(44, 7);
        field3505 = new class145(69, -1);
        field3507 = new class304("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
    }
}
