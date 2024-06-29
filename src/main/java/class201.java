import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class201 {

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    private int field2839 = -1;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
    public boolean field2842 = true;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lmb;")
    private class268 field2833;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    private int field2834;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Lks;")
    private class173 field2837;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    private int field2836;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    private int field2843;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Ld;")
    private class391 field2840;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Let;")
    private class261 field2838;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "Lqb;")
    private class89 field2841;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "[B")
    private static byte[] field2835 = new byte[16384];

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILd;I)V", line = 8)
    private final void method1385(int arg0, class391 arg1, int arg2) {
        if (arg2 != 0) {
            this.method1387((byte) 109);
            this.field2837.method1160(this.field2841);
            this.field2837.method1136(arg1, 4, 0, arg2);
            int var4 = -101 / ((arg0 - 20) / 58);
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lks;Lmb;Ldl;IIIII)V", line = 164)
    public class201(class173 arg0, class268 arg1, class207 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2833 = arg1;
        this.field2834 = arg7;
        this.field2837 = arg0;
        this.field2836 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var14 = (var12 + var13) * arg2.field5538 + var11;
            for (int var15 = 0; var15 < var9; var15++) {
                short[] var16 = arg2.field2892[var14++];
                if (var16 != null) {
                    var10 += var16.length;
                }
            }
        }
        this.field2843 = var10;
        if (var10 > 0) {
            class256 var17 = new class256(var10 * 2);
            if (this.field2837.field2296) {
                for (int var23 = 0; var23 < var9; var23++) {
                    int var24 = (var12 + var23) * arg2.field5538 + var11;
                    for (int var25 = 0; var25 < var9; var25++) {
                        short[] var26 = arg2.field2892[var24++];
                        if (var26 != null) {
                            for (int var27 = 0; var27 < var26.length; var27++) {
                                var17.method1750((byte) 0, var26[var27] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var18 = 0; var18 < var9; var18++) {
                    int var19 = (var12 + var18) * arg2.field5538 + var11;
                    for (int var20 = 0; var20 < var9; var20++) {
                        short[] var21 = arg2.field2892[var19++];
                        if (var21 != null) {
                            for (int var22 = 0; var22 < var21.length; var22++) {
                                var17.method1731(-117, var21[var22] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field2840 = this.field2837.method1181(5123, var17.field3764, var17.field3762, false);
            this.field2838 = new class261(this.field2837, 5123, (byte[]) null, 1);
        } else {
            this.field2841 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 32)
    public final void method1386(byte arg0) {
        this.method1385(122, this.field2840, this.field2843);
        if (arg0 < 47) {
            this.method1386((byte) 113);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V", line = 43)
    private final void method1387(byte arg0) {
        if (arg0 != 109) {
            this.field2841 = (class89) null;
        }
        if (!this.field2842) {
            return;
        }
        this.field2842 = false;
        byte[] var2 = this.field2833.field3981;
        byte[] var3 = field2835;
        int var4 = 0;
        int var5 = this.field2833.field3985;
        int var6 = this.field2833.field3985 * this.field2834 + this.field2836;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var8 = -128; var8 < 0; var8++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field2841 != null && this.field2839 == var4) {
            this.field2842 = false;
            return;
        }
        this.field2839 = var4;
        int var9 = 0;
        int var10 = this.field2834 * var5 + this.field2836;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var10] == 0) {
                    int var13 = 0;
                    if (var2[var10 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var10] != 0) {
                        var13++;
                    }
                    var3[var9++] = (byte) (var13 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var10++;
            }
            var10 += this.field2833.field3985 - 128;
        }
        if (this.field2841 == null) {
            this.field2841 = new class89(this.field2837, 3553, 6406, 128, 128, false, field2835, 6406, false);
            this.field2841.method599(false, false);
            this.field2841.method1405(true);
        } else {
            this.field2841.method597(0, 0, 128, 128, field2835, 6406, 0, 0, false);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III[B)V", line = 151)
    public final void method1388(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 < 45) {
            this.method1387((byte) -109);
        }
        this.field2838.method51(arg2, arg3, arg0 * this.field2837.method1173(arg2));
        this.method1385(-46, this.field2838, arg0);
    }
}
