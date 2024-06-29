import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class510 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Z")
    public boolean field7573 = true;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    private int field7588 = -1;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private int field7577;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    private int field7576;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lbv;")
    private class282 field7575;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Ltn;")
    private class123 field7578;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    private int field7574;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lwg;")
    private class393 field7586;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Ltu;")
    private class176 field7585;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lmv;")
    private class227 field7580;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[I")
    public static int[] field7587 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lpg;")
    public static class492 field7581 = new class492(10, -1);

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[I")
    public static int[] field7589 = new int[4096];

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 5)
    public final void method3038(byte arg0) {
        field7582++;
        this.method3041((byte) 65, this.field7585, this.field7574);
        if (arg0 != -89) {
            this.method3038((byte) -111);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 19)
    private final void method3039(int arg0) {
        field7579++;
        if (!this.field7573) {
            return;
        }
        this.field7573 = false;
        int var2 = 113 % ((arg0 - 10) / 54);
        byte[] var3 = this.field7578.field1751;
        byte[] var4 = class238.field3378;
        int var5 = 0;
        int var6 = this.field7578.field1763;
        int var7 = this.field7578.field1763 * this.field7577 + this.field7576;
        for (int var8 = -128; var8 < 0; var8++) {
            var5 = (var5 << 8) - var5;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var3[var7++] != 0) {
                    var5++;
                }
            }
            var7 += var6 - 128;
        }
        if (this.field7586 != null && this.field7588 == var5) {
            this.field7573 = false;
            return;
        }
        this.field7588 = var5;
        int var9 = this.field7577 * var6 + this.field7576;
        int var10 = 0;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var3[var9] == 0) {
                    int var13 = 0;
                    if (var3[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var3[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var3[var9 - var6] != 0) {
                        var13++;
                    }
                    if (var3[var6 + var9] != 0) {
                        var13++;
                    }
                    var4[var10++] = (byte) (var13 * 17);
                } else {
                    var4[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field7578.field1763 - 128;
        }
        if (this.field7586 == null) {
            this.field7586 = new class393(this.field7575, 3553, 6406, 128, 128, false, class238.field3378, 6406, false);
            this.field7586.method2417(true, false, false);
            this.field7586.method123(false, true);
        } else {
            this.field7586.method2422(0, class238.field3378, 6406, 128, 0, 0, 0, false, false, 128);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[BII)V", line = 127)
    public final void method3040(int arg0, byte[] arg1, int arg2, int arg3) {
        field7584++;
        this.field7580.method1270(this.field7575.method1780(arg0, 1) * arg3, -126, arg0, arg1);
        this.method3041((byte) 65, this.field7580, arg3);
        if (arg2 <= 109) {
            this.field7578 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLtu;I)V", line = 140)
    private final void method3041(byte arg0, class176 arg1, int arg2) {
        field7583++;
        if (arg2 == 0) {
            return;
        }
        this.method3039(127);
        if (arg0 != 65) {
            this.method3039(12);
        }
        this.field7575.method1787(this.field7586, (byte) 121);
        this.field7575.method1829(1, 0, arg2, arg1, 4);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lbv;Ltn;Llh;IIIII)V", line = 197)
    public class510(class282 arg0, class123 arg1, class257 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7577 = arg7;
        this.field7576 = arg6;
        this.field7575 = arg0;
        this.field7578 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2912 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3556[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field7574 = var10;
        if (var10 <= 0) {
            this.field7586 = null;
        } else {
            class91 var14 = new class91(var10 * 2);
            if (this.field7575.field4197) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2912 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3556[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method600(var23[var24] & 0xFFFF, -12891);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2912 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3556[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method628(-123, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field7585 = this.field7575.method1816(-61, var14.field1277, false, var14.field1292, 5123);
            this.field7580 = new class227(this.field7575, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 171)
    public static void method3042(boolean arg0) {
        field7589 = null;
        field7587 = null;
        if (arg0) {
            method3042(false);
        }
        field7581 = null;
    }
}
