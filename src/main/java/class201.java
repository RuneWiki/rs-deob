import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class201 {

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "Z")
    public boolean field2788 = true;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    private int field2796 = -1;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "Lck;")
    private class733 field2791;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "I")
    private int field2792;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    private int field2784;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "Lwe;")
    private class377 field2789;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    private int field2786;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "Lgha;")
    private class520 field2785;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "Lpm;")
    private class250 field2797;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "Lww;")
    private class304 field2790;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "Lrn;")
    public static class633 field2798 = new class633(22, 3);

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "Lega;")
    public static class473 field2799 = null;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
    private final void method1371(byte arg0) {
        field2794++;
        if (!this.field2788) {
            return;
        }
        this.field2788 = false;
        byte[] var2 = this.field2789.field4604;
        byte[] var3 = this.field2791.field9957;
        int var4 = 0;
        int var5 = this.field2789.field4616;
        int var6 = this.field2789.field4616 * this.field2792 + this.field2784;
        if (arg0 != 69) {
            this.method1375(null, (byte) -7, 13);
        }
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field2785 != null && this.field2796 == var4) {
            this.field2788 = false;
            return;
        }
        this.field2796 = var4;
        int var8 = 0;
        int var9 = this.field2792 * var5 + this.field2784;
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
            var9 += this.field2789.field4616 - 128;
        }
        if (this.field2785 == null) {
            this.field2785 = new class520(this.field2791, 3553, 6406, 128, 128, false, this.field2791.field9957, 6406, false);
            this.field2785.method2873(arg0 ^ 0xFFFF9898, false, false);
            this.field2785.method759(0, true);
        } else {
            this.field2785.method2874((byte) -91, 0, this.field2791.field9957, 128, 0, 128, 0, 0, false, 6406);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[BBI)V")
    public final void method1372(int arg0, byte[] arg1, byte arg2, int arg3) {
        field2795++;
        this.field2790.method1630(arg0, this.field2791.method3916(arg0, true) * arg3, true, arg1);
        if (arg2 == 52) {
            this.method1375(this.field2790, (byte) -110, arg3);
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V")
    public static void method1373(byte arg0) {
        if (arg0 <= -81) {
            field2799 = null;
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public final void method1374(int arg0) {
        if (arg0 == 21665) {
            this.method1375(this.field2797, (byte) -110, this.field2786);
            field2787++;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lpm;BI)V")
    private final void method1375(class250 arg0, byte arg1, int arg2) {
        if (arg1 != -110) {
            return;
        }
        field2793++;
        if (arg2 != 0) {
            this.method1371((byte) 69);
            this.field2791.method3975((byte) 127, this.field2785);
            this.field2791.method3980(arg0, arg2, true, 4, 0);
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lck;Lwe;Llc;IIIII)V")
    public class201(class733 arg0, class377 arg1, class455 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2791 = arg0;
        this.field2792 = arg7;
        this.field2784 = arg6;
        this.field2789 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field4366 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5928[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field2786 = var10;
        if (var10 <= 0) {
            this.field2785 = null;
        } else {
            class234 var14 = new class234(var10 * 2);
            if (this.field2791.field9865) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field4366 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5928[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1541(374, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field4366 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5928[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1514(var18[var19] & 0xFFFF, (byte) -59);
                            }
                        }
                    }
                }
            }
            this.field2797 = this.field2791.method3981(5123, var14.field3133, false, var14.field3193, 13);
            this.field2790 = new class304(this.field2791, 5123, null, 1);
        }
    }
}
