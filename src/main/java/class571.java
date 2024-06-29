import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class571 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public boolean field8138 = true;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    private int field8149 = -1;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Ljj;")
    private class66 field8150;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    private int field8136;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Lmr;")
    private class206 field8146;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    private int field8144;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    private int field8147;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lhp;")
    private class355 field8134;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lgw;")
    private class140 field8135;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lrca;")
    private class34 field8143;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Lbv;")
    public static class567 field8151 = new class567("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method3261(byte arg0) {
        field8151 = null;
        int var1 = 123 % ((-arg0 - 14) / 44);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    private final void method3262(byte arg0) {
        field8139++;
        if (!this.field8138) {
            return;
        }
        this.field8138 = false;
        byte[] var2 = this.field8146.field2896;
        byte[] var3 = this.field8150.field1278;
        int var4 = 0;
        int var5 = this.field8146.field2915;
        if (arg0 != -19) {
            return;
        }
        int var6 = this.field8144 + (this.field8146.field2915 * this.field8136);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field8134 != null && this.field8149 == var4) {
            this.field8138 = false;
            return;
        }
        this.field8149 = var4;
        int var8 = this.field8136 * var5 + this.field8144;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field8146.field2915 - 128;
        }
        if (this.field8134 == null) {
            this.field8134 = new class355(this.field8150, 3553, 6406, 128, 128, false, this.field8150.field1278, 6406, false);
            this.field8134.method2163(77, false, false);
            this.field8134.method1490((byte) 99, true);
        } else {
            this.field8134.method2161(this.field8150.field1278, 0, 128, (byte) -126, false, 0, 0, 128, 6406, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)I")
    public static final int method3263(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 23061) {
            method3261((byte) -51);
        }
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        field8145++;
        return (arg1 >> 1) + (arg2 >> 5 << 7) + ((arg3 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqa;I)V")
    public static final void method3264(class167 arg0, int arg1) {
        if (arg1 != -128) {
            field8151 = null;
        }
        field8148++;
        if (class555.field7857 != class644.field9367.field5116 && class277.field4051 != null && class318.method1953((byte) 11, arg0, class644.field9367.field5116)) {
            class555.field7857 = class644.field9367.field5116;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public final void method3265(int arg0) {
        this.method3267(this.field8135, (byte) 121, this.field8147);
        field8141++;
        if (arg0 != 2) {
            this.field8147 = 1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BZI)V")
    public final void method3266(int arg0, byte[] arg1, boolean arg2, int arg3) {
        this.field8143.method310((byte) 53, arg3, arg0 * this.field8150.method538(110, arg3), arg1);
        field8140++;
        if (!arg2) {
            this.method3267(null, (byte) -52, -4);
        }
        this.method3267(this.field8143, (byte) 93, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lgw;BI)V")
    private final void method3267(class140 arg0, byte arg1, int arg2) {
        field8137++;
        if (arg2 != 0 && arg1 >= 39) {
            this.method3262((byte) -19);
            this.field8150.method648(96, this.field8134);
            this.field8150.method523((byte) 61, arg0, 4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Ljj;Lmr;Lvh;IIIII)V")
    public class571(class66 arg0, class206 arg1, class247 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8150 = arg0;
        this.field8136 = arg7;
        this.field8146 = arg1;
        this.field8144 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field7541 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3559[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field8147 = var10;
        if (var10 <= 0) {
            this.field8134 = null;
        } else {
            class268 var14 = new class268(var10 * 2);
            if (this.field8150.field1187) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field7541 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3559[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1699(true, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field7541 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3559[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1713((byte) 103, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field8135 = this.field8150.method545(5123, var14.field3952, false, var14.field3913, (byte) -1);
            this.field8143 = new class34(this.field8150, 5123, null, 1);
        }
    }
}
