import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class510 {

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Z")
    public boolean field7446 = true;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    private int field7448 = -1;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "Lmi;")
    private class460 field7445;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "Ler;")
    private class92 field7450;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    private int field7444;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
    private int field7453;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    private int field7449;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "Llga;")
    private class662 field7455;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "Llda;")
    private class450 field7440;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "Lwh;")
    private class133 field7447;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "Z")
    public static boolean field7443 = false;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "Lhw;")
    public static class116 field7452 = new class116(0);

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public static void method3092(int arg0) {
        field7452 = null;
        if (arg0 != -1) {
            field7452 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
    public final void method3093(int arg0) {
        field7456++;
        if (arg0 == 0) {
            this.method3095(-97, this.field7449, this.field7455);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)V")
    public static final void method3094(int arg0, int arg1) {
        if (arg1 != 0) {
            field7452 = null;
        }
        field7451++;
        class335.field5482.method573((byte) 122, arg0);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILlga;)V")
    private final void method3095(int arg0, int arg1, class662 arg2) {
        field7441++;
        int var4 = -55 % ((arg0 - 66) / 53);
        if (arg1 != 0) {
            this.method3097(true);
            this.field7450.method856(false, this.field7447);
            this.field7450.method819(arg1, 122, 0, 4, arg2);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[BIZ)V")
    public final void method3096(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.method3097(false);
        }
        field7442++;
        this.field7440.method694(arg0 * this.field7450.method817(arg2, -5126), 2112, arg1, arg2);
        this.method3095(119, arg0, this.field7440);
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Ler;Lmi;Ltv;IIIII)V")
    public class510(class92 arg0, class460 arg1, class521 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7445 = arg1;
        this.field7450 = arg0;
        this.field7444 = arg7;
        this.field7453 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field510 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field7541[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field7449 = var10;
        if (var10 <= 0) {
            this.field7447 = null;
        } else {
            class6 var14 = new class6(var10 * 2);
            if (this.field7450.field1410) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field510 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field7541[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method25(true, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field510 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field7541[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method49(-1060492440, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field7455 = this.field7450.method892(false, var14.field57, 5123, false, var14.field96);
            this.field7440 = new class450(this.field7450, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V")
    private final void method3097(boolean arg0) {
        field7454++;
        if (!this.field7446) {
            return;
        }
        this.field7446 = false;
        byte[] var2 = this.field7445.field6888;
        byte[] var3 = this.field7450.field1476;
        int var4 = 0;
        int var5 = this.field7445.field6893;
        int var6 = this.field7445.field6893 * this.field7444 + this.field7453;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field7447 != null && this.field7448 == var4) {
            this.field7446 = false;
            return;
        }
        this.field7448 = var4;
        int var8 = 0;
        int var9 = this.field7444 * var5 + this.field7453;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field7445.field6893 - 128;
        }
        if (!arg0) {
            this.method3097(true);
        }
        if (this.field7447 == null) {
            this.field7447 = new class133(this.field7450, 3553, 6406, 128, 128, false, this.field7450.field1476, 6406, false);
            this.field7447.method1158(false, false, (byte) 65);
            this.field7447.method2509(true, -49);
        } else {
            this.field7447.method1155(0, 128, 0, false, 10243, 0, 128, 6406, this.field7450.field1476, 0);
        }
    }
}
