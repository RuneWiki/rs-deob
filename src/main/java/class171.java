import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class171 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    public boolean field2137 = true;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    private int field2139 = -1;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lpea;")
    private class641 field2148;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    private int field2142;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    private int field2136;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lat;")
    private class600 field2143;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lrm;")
    private class359 field2133;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lfw;")
    private class167 field2145;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lqw;")
    private class379 field2138;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ljj;")
    public static class398 field2141 = new class398(55, 8);

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljj;")
    public static class398 field2147 = new class398(30, 0);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
    public static final boolean method1140(int arg0, int arg1, int arg2) {
        field2135++;
        if (arg1 == 16607) {
            return (arg2 & 0x580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1141(int arg0) {
        if (arg0 >= 17) {
            field2141 = null;
            field2147 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    private final void method1142(int arg0) {
        field2149++;
        if (!this.field2137) {
            return;
        }
        this.field2137 = false;
        byte[] var2 = this.field2143.field8219;
        byte[] var3 = this.field2148.field9085;
        if (arg0 != 12217) {
            method1140(14, 21, -48);
        }
        int var4 = 0;
        int var5 = this.field2143.field8210;
        int var6 = this.field2143.field8210 * this.field2142 + this.field2136;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field2138 != null && this.field2139 == var4) {
            this.field2137 = false;
            return;
        }
        this.field2139 = var4;
        int var8 = 0;
        int var9 = this.field2136 + (this.field2142 * var5);
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
            var9 += this.field2143.field8210 - 128;
        }
        if (this.field2138 == null) {
            this.field2138 = new class379(this.field2148, 3553, 6406, 128, 128, false, this.field2148.field9085, 6406, false);
            this.field2138.method2299(arg0 ^ 0xFFFFD011, false, false);
            this.field2138.method1592(arg0 ^ 0x2FCF, true);
        } else {
            this.field2138.method2295(0, 128, 128, this.field2148.field9085, 0, 0, 6406, 0, true, false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILrm;I)V")
    private final void method1143(int arg0, class359 arg1, int arg2) {
        if (arg0 != -10575) {
            return;
        }
        field2134++;
        if (arg2 != 0) {
            this.method1142(12217);
            this.field2148.method3553((byte) -95, this.field2138);
            this.field2148.method3497(121, arg2, 4, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI[BI)V")
    public final void method1144(boolean arg0, int arg1, byte[] arg2, int arg3) {
        field2132++;
        if (!arg0) {
            this.field2148 = null;
        }
        this.field2145.method1109(arg2, arg3, 92, this.field2148.method3526(-5122, arg3) * arg1);
        this.method1143(-10575, this.field2145, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public final void method1145(int arg0) {
        if (arg0 >= -46) {
            field2141 = null;
        }
        field2146++;
        this.method1143(-10575, this.field2133, this.field2140);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lpea;Lat;Lle;IIIII)V")
    public class171(class641 arg0, class600 arg1, class517 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field2148 = arg0;
        this.field2142 = arg7;
        this.field2136 = arg6;
        this.field2143 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2214 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field7101[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field2140 = var10;
        if (var10 <= 0) {
            this.field2138 = null;
        } else {
            class138 var14 = new class138(var10 * 2);
            if (this.field2148.field8968) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2214 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field7101[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method915(var18[var19] & 0xFFFF, 1502242504);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2214 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field7101[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method954(var23[var24] & 0xFFFF, -80);
                            }
                        }
                    }
                }
            }
            this.field2133 = this.field2148.method3498(var14.field1745, false, var14.field1712, 5123, -23702);
            this.field2145 = new class167(this.field2148, 5123, null, 1);
        }
    }
}
