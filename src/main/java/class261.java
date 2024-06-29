import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class261 {

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    private int field3826 = -1;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
    public boolean field3832 = true;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Lpj;")
    private class132 field3827;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "Lus;")
    private class1 field3833;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    private int field3843;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "Lcv;")
    private class529 field3831;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "Lbl;")
    private class603 field3824;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "Ldb;")
    private class296 field3837;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "Lte;")
    public static class571 field3830 = new class571("", 12);

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lop;")
    public static class174 field3825;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "Ln;")
    public static class17 field3838;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1707(byte arg0, String arg1) {
        field3828++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        if (arg0 <= 36) {
            field3830 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public static void method1708(byte arg0) {
        if (arg0 < -8) {
            field3838 = null;
            field3825 = null;
            field3830 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I")
    public static final int method1709(int arg0, int arg1) {
        field3829++;
        if (arg1 != -1) {
            field3825 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V")
    public final void method1710(byte arg0) {
        field3835++;
        this.method1711(this.field3831, true, this.field3839);
        if (arg0 != 77) {
            this.field3834 = 88;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lcv;ZI)V")
    private final void method1711(class529 arg0, boolean arg1, int arg2) {
        field3841++;
        if (arg2 == 0) {
            return;
        }
        this.method1713(-31415);
        if (!arg1) {
            this.field3826 = 122;
        }
        this.field3833.method5(3845, this.field3837);
        this.field3833.method9(arg0, 0, 4, (byte) 90, arg2);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIB)V")
    public static final void method1712(int arg0, int arg1, byte arg2) {
        class459.field6560 = arg0 - class407.field5902;
        field3840++;
        if (arg2 > -27) {
            field3838 = null;
        }
        class453.field6461 = arg1 - class407.field5899;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    private final void method1713(int arg0) {
        field3836++;
        if (!this.field3832) {
            return;
        }
        this.field3832 = false;
        byte[] var2 = this.field3827.field2364;
        byte[] var3 = this.field3833.field360;
        int var4 = 0;
        int var5 = this.field3827.field2361;
        int var6 = this.field3827.field2361 * this.field3834 + this.field3843;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3837 != null && this.field3826 == var4) {
            this.field3832 = false;
            return;
        }
        this.field3826 = var4;
        int var8 = this.field3834 * var5 + this.field3843;
        int var9 = 0;
        if (arg0 != -31415) {
            this.field3831 = null;
        }
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
            var8 += this.field3827.field2361 - 128;
        }
        if (this.field3837 == null) {
            this.field3837 = new class296(this.field3833, 3553, 6406, 128, 128, false, this.field3833.field360, 6406, false);
            this.field3837.method1971(false, -110, false);
            this.field3837.method2939(true, (byte) -69);
        } else {
            this.field3837.method1970(arg0 + 28256, 0, 0, 0, 6406, 0, 128, 128, false, this.field3833.field360);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([BIIB)V")
    public final void method1714(byte[] arg0, int arg1, int arg2, byte arg3) {
        field3842++;
        if (arg3 <= 97) {
            this.field3824 = null;
        }
        this.field3824.method263(-89, arg0, this.field3833.method77(arg1, true) * arg2, arg1);
        this.method1711(this.field3824, true, arg2);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lus;Lpj;Loj;IIIII)V")
    public class261(class1 arg0, class132 arg1, class350 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3834 = arg7;
        this.field3827 = arg1;
        this.field3833 = arg0;
        this.field3843 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field1041 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5236[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3839 = var10;
        if (var10 <= 0) {
            this.field3837 = null;
        } else {
            class61 var14 = new class61(var10 * 2);
            if (this.field3833.field267) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field1041 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5236[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method745(var23[var24] & 0xFFFF, 128);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field1041 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5236[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method689(var18[var19] & 0xFFFF, true);
                            }
                        }
                    }
                }
            }
            this.field3831 = this.field3833.method150(false, 5123, var14.field1397, 47, var14.field1393);
            this.field3824 = new class603(this.field3833, 5123, null, 1);
        }
    }
}
