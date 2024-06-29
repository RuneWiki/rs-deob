import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class8 extends class303 {

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    private int field119 = 2048;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    private int field124 = 10;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    private int field129 = 0;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "[C")
    public static char[] field123 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field126 = 2301979;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "[I")
    private int[] field122;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "[I")
    private int[] field125;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)V", line = 6)
    public static final void method63(int arg0, int arg1) {
        field127++;
        if (arg0 == -1 || !class213.method1543(25641, arg0)) {
            return;
        }
        class292[] var2 = class207.field3269[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class292 var4 = var2[var3];
            if (var4.field4602 != null) {
                class88 var5 = new class88();
                var5.field1340 = var4.field4602;
                var5.field1357 = var4;
                class269.method1935(var5, 2000000, arg1 - 1983715);
            }
        }
        if (arg1 != 2000000) {
            field123 = (char[]) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V", line = 46)
    private final void method64(boolean arg0) {
        int var2 = 0;
        int var3 = 4096 / this.field124;
        field118++;
        this.field122 = new int[this.field124 + 1];
        this.field125 = new int[this.field124 + 1];
        int var4 = this.field119 * var3 >> 12;
        if (arg0) {
            this.field124 = 116;
        }
        for (int var5 = 0; var5 < this.field124; var5++) {
            this.field125[var5] = var2;
            this.field122[var5] = var2 + var4;
            var2 += var3;
        }
        this.field125[this.field124] = 4096;
        this.field122[this.field124] = this.field122[0] + 4096;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 403)
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILpe;I)V", line = 89)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            field126 = -104;
        }
        field128++;
        if (arg2 == 0) {
            this.field124 = arg1.method741(47);
        } else if (arg2 == 1) {
            this.field119 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field129 = arg1.method741(17);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(CZ)Z", line = 140)
    public static final boolean method66(char arg0, boolean arg1) {
        if (arg1) {
            field126 = 76;
        }
        field120++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = field123;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[I", line = 177)
    public final int[] method67(int arg0, int arg1) {
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = class36.field591[arg1];
            if (this.field129 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field124; var6++) {
                    if (this.field125[var6] <= var4 && var4 < this.field125[var6 + 1]) {
                        if (var4 < this.field122[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class271.method1955(var3, 0, class70.field1108, var5);
            } else {
                for (int var7 = 0; var7 < class70.field1108; var7++) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class291.field4427[var7];
                    int var11 = this.field129;
                    if (var11 == 1) {
                        var8 = var10;
                    } else if (var11 == 2) {
                        var8 = (var10 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field124; var12++) {
                        if (var8 >= this.field125[var12] && var8 < this.field125[var12 + 1]) {
                            if (this.field122[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        field131++;
        if (arg0 != -3) {
            this.field119 = -25;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILpe;)V", line = 292)
    public static final void method68(int arg0, class101 arg1) {
        field121++;
        while (true) {
            while (arg1.field1667 < arg1.field1661.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method741(107) == 1) {
                    var4 = true;
                    var3 = arg1.method741(114);
                    var2 = arg1.method741(108);
                }
                int var5 = arg1.method741(33);
                int var6 = arg1.method741(61);
                int var7 = class70.field1107 + class279.field4316 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class310.field4885;
                if (var8 >= 0 && var7 - 63 >= 0 && var8 + 63 < class79.field1208 && var7 < class279.field4316) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var3 * 8 <= var11 && (var3 * 8 + 8) > var11 && var12 >= var2 * 8 && var12 < var2 * 8 + 8) {
                                byte var13 = arg1.method727((byte) 109);
                                if (var13 != 0) {
                                    if (class276.field4279[var10][var9] == null) {
                                        class276.field4279[var10][var9] = new byte[4096];
                                    }
                                    class276.field4279[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method727((byte) 121);
                                    if (class195.field3110[var10][var9] == null) {
                                        class195.field3110[var10][var9] = new byte[4096];
                                    }
                                    class195.field3110[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method727((byte) 121);
                        if (var16 != 0) {
                            arg1.field1667++;
                        }
                    }
                }
            }
            if (arg0 <= 126) {
                field126 = -97;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V", line = 391)
    public static void method69(byte arg0) {
        if (arg0 <= -56) {
            field123 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V", line = 409)
    public final void method70(int arg0) {
        if (arg0 < 13) {
            this.field119 = 21;
        }
        field130++;
        this.method64(false);
    }
}
