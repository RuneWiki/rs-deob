import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class646 {

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    private int field8946 = -1;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "Z")
    public boolean field8948 = true;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    private int field8937;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    private int field8950;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "Lbi;")
    private class483 field8941;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "Lnr;")
    private class59 field8939;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    private int field8940;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "Lg;")
    private class158 field8934;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "Lkf;")
    private class256 field8943;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "Lbq;")
    private class293 field8951;

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    public static int field8938 = -1;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    public static int field8947 = 0;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "Loha;")
    public static class743 field8935;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lcc;I)I")
    public static final int method3621(class733 arg0, int arg1) {
        field8936++;
        class131 var2 = arg0.field10192;
        if (var2.field1899 != null) {
            var2 = var2.method981(-116, class516.field7236);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1920;
        class738 var4 = arg0.method94((byte) -121);
        if (~arg0.field215 == arg1 || arg0.field239) {
            var3 = var2.field1882;
        } else if (arg0.field215 == var4.field10285 || arg0.field215 == var4.field10286 || arg0.field215 == var4.field10268 || arg0.field215 == var4.field10267) {
            var3 = var2.field1922;
        } else if (arg0.field215 == var4.field10276 || arg0.field215 == var4.field10259 || arg0.field215 == var4.field10251 || arg0.field215 == var4.field10279) {
            var3 = var2.field1917;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III[B)V")
    public final void method3622(int arg0, int arg1, int arg2, byte[] arg3) {
        field8949++;
        this.field8943.method1107(arg1, arg3, 21189, arg2 * this.field8941.method2848(arg1, (byte) -27));
        this.method3623((byte) -66, this.field8943, arg2);
        if (arg0 > -74) {
            this.method3626(2);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLg;I)V")
    private final void method3623(byte arg0, class158 arg1, int arg2) {
        field8945++;
        if (arg2 != 0) {
            this.method3627(95);
            this.field8941.method2850(122, this.field8951);
            this.field8941.method2854(4, 0, arg2, arg1, (byte) -82);
            int var4 = 46 % (arg0 / 40);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method3624(int arg0, int arg1, boolean arg2) {
        field8942++;
        if (arg2 && arg0 >= 0) {
            return arg1 == 0 ? class513.method2989(arg0, arg2, 10, arg1 ^ 0x4211) : null;
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public static void method3625(int arg0) {
        field8935 = null;
        if (arg0 < 41) {
            method3625(119);
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
    public final void method3626(int arg0) {
        field8952++;
        this.method3623((byte) -93, this.field8934, this.field8940);
        if (arg0 != -9380) {
            this.method3622(-89, -109, -40, null);
        }
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
    private final void method3627(int arg0) {
        field8944++;
        if (!this.field8948) {
            return;
        }
        this.field8948 = false;
        byte[] var2 = this.field8939.field813;
        byte[] var3 = this.field8941.field6928;
        int var4 = 0;
        int var5 = this.field8939.field828;
        int var6 = this.field8939.field828 * this.field8950 + this.field8937;
        int var7 = -128;
        if (arg0 <= 88) {
            method3625(53);
        }
        while (var7 < 0) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
            var7++;
        }
        if (this.field8951 != null && this.field8946 == var4) {
            this.field8948 = false;
            return;
        }
        this.field8946 = var4;
        int var8 = this.field8950 * var5 + this.field8937;
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
            var8 += this.field8939.field828 - 128;
        }
        if (this.field8951 == null) {
            this.field8951 = new class293(this.field8941, 3553, 6406, 128, 128, false, this.field8941.field6928, 6406, false);
            this.field8951.method1756(false, false, 66);
            this.field8951.method3898(true, 32);
        } else {
            this.field8951.method1763(0, false, this.field8941.field6928, 0, 0, 0, 128, (byte) 116, 128, 6406);
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lbi;Lnr;Led;IIIII)V")
    public class646(class483 arg0, class59 arg1, class707 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8937 = arg6;
        this.field8950 = arg7;
        this.field8941 = arg0;
        this.field8939 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3561 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field9813[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field8940 = var10;
        if (var10 <= 0) {
            this.field8951 = null;
        } else {
            class461 var14 = new class461(var10 * 2);
            if (this.field8941.field6903) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3561 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field9813[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2620(var23[var24] & 0xFFFF, false);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3561 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field9813[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2619(var18[var19] & 0xFFFF, -1);
                            }
                        }
                    }
                }
            }
            this.field8934 = this.field8941.method2774(-64, var14.field6193, false, var14.field6180, 5123);
            this.field8943 = new class256(this.field8941, 5123, null, 1);
        }
    }
}
