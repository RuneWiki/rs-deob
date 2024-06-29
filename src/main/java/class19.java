import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 extends class14 {

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!qo", name = "N", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field318;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int[] var4 = this.method145(arg0, 0, -18596);
            int[] var5 = this.method145(arg0, 1, -18596);
            int[] var6 = this.method145(arg0, 2, -18596);
            for (int var7 = 0; ~class115.field1637 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return arg1 > -2 ? null : var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[II[I)V")
    public static final void method185(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg3 == 2127) {
            ++field322;
            if (~arg1 > ~arg0) {
                int var5 = (arg0 + arg1) / 2;
                int var6 = arg1;
                int var7 = arg2[var5];
                arg2[var5] = arg2[arg0];
                arg2[arg0] = var7;
                int var8 = arg4[var5];
                arg4[var5] = arg4[arg0];
                arg4[arg0] = var8;
                int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
                for (int var10 = arg1; arg0 > var10; ++var10) {
                    if ((var10 & var9) + var7 > arg2[var10]) {
                        int var11 = arg2[var10];
                        arg2[var10] = arg2[var6];
                        arg2[var6] = var11;
                        int var12 = arg4[var10];
                        arg4[var10] = arg4[var6];
                        arg4[var6++] = var12;
                    }
                }
                arg2[arg0] = arg2[var6];
                arg2[var6] = var7;
                arg4[arg0] = arg4[var6];
                arg4[var6] = var8;
                method185(var6 + -1, arg1, arg2, arg3, arg4);
                method185(arg0, var6 - -1, arg2, 2127, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class19() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IB)I")
    public static final int method186(int arg0, byte arg1) {
        ++field321;
        int var2 = arg0 & 63;
        if (arg1 >= -81) {
            method185(-121, 39, (int[]) null, 97, (int[]) null);
        }
        int var3 = (235 & arg0) >> 6;
        if (~var2 != -19) {
            if (~var2 == -20 || var2 == 21) {
                if (var3 == 0) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (~var3 == -3) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
        } else {
            if (~var3 == -1) {
                return 1;
            }
            if (~var3 == -2) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (arg0 == 0) {
            super.field263 = arg2.method2238(255) == 1;
        }
        int var4 = 59 % ((-51 - arg1) / 37);
        ++field320;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field319;
        if (arg0 != -30909) {
            return null;
        } else {
            int[][] var3 = super.field268.method2561(arg1, 0);
            if (super.field268.field6091) {
                int[] var4 = this.method145(arg1, 2, -18596);
                int[][] var5 = this.method139(0, 2, arg1);
                int[][] var6 = this.method139(1, arg0 ^ -30911, arg1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~var16 > ~class115.field1637; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (~var17 == -1) {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        } else {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }

    static {
        new class304("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
