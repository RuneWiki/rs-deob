import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class448 {

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Lhm;")
    private class460 field6536;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lnd;")
    private class632 field6528;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public int field6523;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    private int field6522;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    private int field6524;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[B")
    public byte[] field6520;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    private int field6521;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private int field6525;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lgp;")
    public static class561 field6526;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "[[Lag;")
    private class430[][] field6529;

    static {
        new class567("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILk;B)V", line = 4)
    public final void method2648(int arg0, int arg1, class88 arg2, byte arg3) {
        field6532++;
        int var5 = -127 % ((-arg3 - 33) / 41);
        class444 var6 = (class444) arg2;
        int var7 = var6.field6490 + arg0 + 1;
        int var8 = var6.field6485 + arg1 + 1;
        int var9 = this.field6523 * var7 + var8;
        int var10 = 0;
        int var11 = var6.field6487;
        int var12 = var6.field6491;
        int var13 = this.field6523 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var11 -= var15;
            var9 += this.field6523 * var15;
            var10 += var12 * var15;
            var7 = 1;
        }
        if (this.field6522 <= (var7 + var11)) {
            int var16 = var11 + var7 + 1 - this.field6522;
            var11 -= var16;
        }
        if (var8 <= 0) {
            int var17 = 1 - var8;
            var10 += var17;
            var8 = 1;
            var13 += var17;
            var12 -= var17;
            var14 += var17;
            var9 += var17;
        }
        if (this.field6523 <= var8 + var12) {
            int var18 = var8 + var12 + 1 - this.field6523;
            var12 -= var18;
            var13 += var18;
            var14 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class90.method802(var11, var14, var13, var12, var10, (byte) -10, this.field6520, var9, var6.field6480);
            this.method2655(var11, var12, 124, var7, var8);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BILk;I)V", line = 77)
    public final void method2649(byte arg0, int arg1, class88 arg2, int arg3) {
        field6527++;
        class444 var5 = (class444) arg2;
        int var6 = var5.field6485 + arg1 + 1;
        int var7 = var5.field6490 + arg3 + 1;
        int var8 = this.field6523 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6487;
        if (arg0 < 74) {
            return;
        }
        int var11 = var5.field6491;
        int var12 = this.field6523 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var8 += this.field6523 * var13;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field6522) {
            int var15 = var7 + var10 + 1 - this.field6522;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var8 += var16;
            var14 += var16;
            var12 += var16;
            var11 -= var16;
            var6 = 1;
        }
        if (this.field6523 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field6523;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class7.method29(var5.field6480, (byte) -123, var8, this.field6520, var12, var10, var14, var11, var9);
            this.method2655(var10, var11, 122, var7, var6);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBILk;)Z", line = 148)
    public final boolean method2650(int arg0, byte arg1, int arg2, class88 arg3) {
        field6530++;
        int var5 = -56 % ((arg1 - 60) / 47);
        class444 var6 = (class444) arg3;
        int var7 = var6.field6490 + arg2 + 1;
        int var8 = var6.field6485 + arg0 + 1;
        int var9 = this.field6523 * var7 + var8;
        int var10 = var6.field6487;
        int var11 = var6.field6491;
        int var12 = this.field6523 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var9 += this.field6523 * var13;
        }
        if (this.field6522 <= var7 + var10) {
            int var14 = var7 + var10 + 1 - this.field6522;
            var10 -= var14;
        }
        if (var8 <= 0) {
            int var15 = 1 - var8;
            var11 -= var15;
            var8 = 1;
            var12 += var15;
            var9 += var15;
        }
        if (this.field6523 <= (var8 + var11)) {
            int var16 = var8 + var11 + 1 - this.field6523;
            var12 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field6523 + var12;
            return class474.method2746(var18, var9, var17, -1, var11, var10, this.field6520);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III[[ZBZ)V", line = 232)
    public final void method2651(int arg0, int arg1, int arg2, boolean[][] arg3, byte arg4, boolean arg5) {
        this.field6528.method3630((byte) 91, false);
        field6531++;
        this.field6528.method3623(false, 122);
        this.field6528.method3624(-45, 1);
        this.field6528.method3600(arg4 ^ 0xFFFFFFFB, 1);
        if (arg4 != 87) {
            this.field6536 = null;
        }
        this.field6528.method3568(-2, 14511, false, false);
        float var7 = 1.0F / (float) (this.field6528.field9063 * 128);
        if (arg5) {
            for (int var26 = 0; var26 < this.field6525; var26++) {
                int var27 = var26 << this.field6524;
                int var28 = var26 + 1 << this.field6524;
                label94: for (int var29 = 0; var29 < this.field6521; var29++) {
                    if (this.field6529[var29][var26] != null) {
                        int var30 = var29 << this.field6524;
                        int var31 = var29 + 1 << this.field6524;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if (var32 - arg2 >= -arg0 && (var32 - arg2) <= arg0) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((-arg0) <= (var33 - arg1) && arg0 >= (var33 - arg1) && arg3[arg0 + var32 - arg2][var33 + arg0 - arg1]) {
                                        class516 var34 = this.field6528.method3595((byte) 40);
                                        var34.method2902(var7, var7, (byte) 2, 1.0F);
                                        var34.method877(-var29, -var26, 0);
                                        this.field6528.method3616(class577.field8230, (byte) 94);
                                        this.field6529[var29][var26].method2562(arg4 - 209);
                                        continue label94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field6525; var8++) {
                int var9 = var8 << this.field6524;
                int var10 = var8 + 1 << this.field6524;
                for (int var11 = 0; var11 < this.field6521; var11++) {
                    class430 var12 = this.field6529[var11][var8];
                    if (var12 != null) {
                        class620 var13 = this.field6528.method3637(var12.field6263 * 3, 2);
                        Buffer var14 = var13.method251(true, (byte) 60);
                        if (var14 != null) {
                            Stream var15 = this.field6528.method3588(var14, (byte) -121);
                            int var16 = 0;
                            int var17 = var11 << this.field6524;
                            int var18 = var11 + 1 << this.field6524;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (-arg0 <= var19 - arg1 && (var19 - arg1) <= arg0) {
                                    int var21 = this.field6536.field7541 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if (var22 - arg2 >= -arg0 && arg0 >= (var22 - arg2) && arg3[var22 + arg0 - arg2][var19 + arg0 - arg1]) {
                                            short[] var23 = this.field6536.field6650[var21];
                                            if (var23 != null) {
                                                if (Stream.method3248()) {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var16++;
                                                        var15.method3244(var23[var25] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method3238(var23[var24] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3246();
                            if (var13.method245(-11359) && var16 > 0) {
                                class516 var20 = this.field6528.method3595((byte) 40);
                                var20.method2902(var7, var7, (byte) 2, 1.0F);
                                var20.method877(-var11, -var8, 0);
                                this.field6528.method3616(class577.field8230, (byte) 94);
                                var12.method2560(var16 / 3, var13, (byte) 118);
                            }
                        }
                    }
                }
            }
        }
        this.field6528.method3627(-113);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 432)
    public final void method2652(int arg0) {
        if (arg0 <= 23) {
            field6535 = 41;
        }
        field6519++;
        this.field6529 = new class430[this.field6521][this.field6525];
        for (int var2 = 0; var2 < this.field6525; var2++) {
            for (int var3 = 0; var3 < this.field6521; var3++) {
                this.field6529[var3][var2] = new class430(this.field6528, this, this.field6536, var3, var2, this.field6524, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field6529[var3][var2].field6263 == 0) {
                    this.field6529[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 464)
    public static void method2653(byte arg0) {
        field6526 = null;
        if (arg0 != -4) {
            method2653((byte) 17);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)Z", line = 474)
    public static final boolean method2654(int arg0, int arg1, byte arg2) {
        int var3 = 68 % ((arg2 - 10) / 58);
        field6533++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V", line = 484)
    private final void method2655(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6534++;
        if (this.field6529 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg4 + arg1 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg0 - 1 - 1 >> 7;
        if (arg2 < 121) {
            method2653((byte) -119);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class430[] var11 = this.field6529[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field6275 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lnd;Lhm;)V", line = 534)
    public class448(class632 arg0, class460 arg1) {
        this.field6536 = arg1;
        this.field6528 = arg0;
        this.field6523 = (this.field6536.field7544 * this.field6536.field7541 >> this.field6528.field9140) + 2;
        this.field6522 = (this.field6536.field7544 * this.field6536.field7539 >> this.field6528.field9140) + 2;
        this.field6524 = this.field6528.field9140 + 7 - this.field6536.field7537;
        this.field6520 = new byte[this.field6523 * this.field6522];
        this.field6521 = this.field6536.field7541 >> this.field6524;
        this.field6525 = this.field6536.field7539 >> this.field6524;
    }
}
