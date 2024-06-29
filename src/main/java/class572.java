import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class572 extends class147 {

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    private int field7671 = 0;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "Z")
    private boolean field7668 = false;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    private int field7674 = 0;

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
    private int field7681 = 0;

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    private int field7691 = 0;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    private int field7666;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "I")
    private int field7686;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "Lai;")
    private class626 field7672;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "Lec;")
    private class248 field7690;

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "Z")
    private boolean field7677;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Z")
    private boolean field7663;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "Z")
    private boolean field7673;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "Z")
    private boolean field7687;

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "Lcf;")
    public static class631 field7685 = new class631();

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)V")
    public static final void method3201(int arg0, int arg1) {
        field7679++;
        class16 var2 = class94.method753(arg1, arg1 + 13168, (long) arg0);
        var2.method118(585134072);
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "()I")
    public final int method1107() {
        field7676++;
        return this.field7666;
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "()I")
    public final int method1110() {
        field7683++;
        return this.field7686;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIII[III)V")
    private final void method3202(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field7690.method1663(arg1, (byte) 127, arg2, arg4, arg6, arg3, arg5, arg0);
        field7682++;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "()I")
    public final int method1106() {
        field7667++;
        return this.field7691 + this.field7671 + this.field7686;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([I)V")
    public final void method1105(int[] arg0) {
        arg0[3] = this.field7671;
        field7665++;
        arg0[1] = this.field7691;
        arg0[0] = this.field7674;
        arg0[2] = this.field7681;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
    public static void method3203(byte arg0) {
        if (arg0 != -5) {
            field7685 = null;
        }
        field7685 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V")
    public final void method1081(int arg0, int arg1, int arg2) {
        field7664++;
        int[] var4 = this.field7672.method521(arg0, arg1, this.field7666, this.field7686);
        int[] var5 = new int[this.field7686 * this.field7666];
        this.field7690.method1671(0, this.field7686, this.field7666, 0, var5, 0, 3839);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field7686; var6++) {
                int var7 = this.field7666 * var6;
                for (int var8 = 0; var8 < this.field7666; var8++) {
                    var5[var7 + var8] = class213.method1409(class440.method2643(16777215, var5[var7 + var8]), class440.method2643(var4[var7 + var8] << 8, -16777053));
                }
            }
        } else if (arg2 == 1) {
            for (int var15 = 0; var15 < this.field7686; var15++) {
                int var16 = this.field7666 * var15;
                for (int var17 = 0; var17 < this.field7666; var17++) {
                    var5[var16 + var17] = class213.method1409(class440.method2643(16777215, var5[var16 + var17]), class440.method2643(var4[var16 + var17], -1686765824) << 16);
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field7686; var9++) {
                int var10 = this.field7666 * var9;
                for (int var11 = 0; var11 < this.field7666; var11++) {
                    var5[var10 + var11] = class213.method1409(class440.method2643(var5[var10 + var11], 16777215), class440.method2643(656716287, var4[var10 + var11]) << 24);
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field7686; var12++) {
                int var13 = this.field7666 * var12;
                for (int var14 = 0; var14 < this.field7666; var14++) {
                    var5[var13 + var14] = class213.method1409(var4[var13 + var14] == 0 ? 0 : -16777216, class440.method2643(16777215, var5[var13 + var14]));
                }
            }
        }
        this.method3202(0, 0, this.field7666, this.field7686, var5, 0, this.field7666);
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIII)V")
    public final void method1112(int arg0, int arg1, int arg2, int arg3) {
        this.field7681 = arg2;
        this.field7671 = arg3;
        this.field7674 = arg0;
        this.field7691 = arg1;
        field7678++;
        this.field7668 = this.field7674 != 0 || this.field7691 != 0 || this.field7681 != 0 || this.field7671 != 0;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIII)V")
    public final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7669++;
        int[] var7 = this.field7672.method521(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class213.method1409(var7[var8], -16777216);
            }
            this.method3202(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1098(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field7689++;
        class754 var11 = this.field7672.method3482((byte) 119);
        class754 var12 = this.field7672.method3506((byte) -110);
        this.field7690.method1003(-123, this.field7677 || this.field7663 || ~(arg9 & 0x1) == -1 ? class179.field2385 : class503.field6966);
        this.field7672.method3478(4);
        this.field7672.method3520(true, this.field7690);
        this.field7672.method3460(0, arg8);
        this.field7672.method3503((byte) 113, arg6);
        this.field7672.method3514((byte) -64, class109.field1493, 1);
        this.field7672.method3509(1, class109.field1493, -111);
        this.field7672.method3525(arg7, 1);
        if (this.field7668) {
            float var13 = (float) this.method1096();
            float var14 = (float) this.method1106();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field7691 * var17;
            float var20 = (float) this.field7691 * var18;
            float var21 = (float) this.field7674 * var15;
            float var22 = (float) this.field7674 * var16;
            float var23 = (float) this.field7681 * -var15;
            float var24 = (float) this.field7681 * -var16;
            float var25 = (float) this.field7671 * -var17;
            float var26 = (float) this.field7671 * -var18;
            arg3 = arg3 + var24 + var20;
            arg0 = arg0 + var21 + var19;
            arg2 = arg2 + var23 + var19;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            arg5 = arg5 + var22 + var26;
        }
        var11.method4204(0.0F, arg4 - arg0, -arg1 + arg3, 0, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F);
        var11.method4208(18645, 0.0F, arg1, arg0);
        var12.method4197((byte) 125, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(122, (float) this.field7686));
        this.field7672.method3471(105, class413.field5937);
        this.field7672.method3508(11570);
        this.field7672.method3483(-27539);
        this.field7672.method3504((byte) -57);
        this.field7672.method3514((byte) 104, class386.field5627, 1);
        this.field7672.method3509(1, class386.field5627, -79);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILaa;II)V")
    public final void method1084(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        field7675++;
        class659 var6 = (class659) arg2;
        class248 var7 = var6.field9116;
        int var8 = this.field7691 + arg1;
        int var9 = this.field7674 + arg0;
        this.field7690.method1003(-125, class179.field2385);
        this.field7672.method3478(4);
        this.field7672.method3520(true, this.field7690);
        this.field7672.method3460(0, 1);
        this.field7672.method3503((byte) -112, 1);
        class754 var10 = this.field7672.method3482((byte) 94);
        var10.method4197((byte) 109, (float) this.field7666, 0.0F, (float) this.field7686);
        var10.method970(var9, var8, 0);
        this.field7672.method3508(11570);
        class754 var11 = this.field7672.method3506((byte) -123);
        var11.method4197((byte) -109, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(-13, (float) this.field7686));
        this.field7672.method3471(21, class413.field5937);
        this.field7672.method3470((byte) 48, 1);
        this.field7672.method3520(true, var7);
        this.field7672.method3513(class364.field5299, class521.field7150, -109);
        this.field7672.method3514((byte) -117, class386.field5627, 0);
        class754 var12 = this.field7672.method3506((byte) -107);
        var12.method4197((byte) 127, var7.method1666(-18982, (float) this.field7666), 1.0F, var7.method1670(-34, (float) this.field7686));
        var12.method4208(18645, 0.0F, var7.method1670(122, (float) (var8 - arg4)), var7.method1666(-18982, (float) (var9 - arg3)));
        this.field7672.method3471(97, class413.field5937);
        this.field7672.method3483(-27539);
        this.field7672.method3504((byte) -57);
        this.field7672.method3514((byte) -29, class122.field1782, 0);
        this.field7672.method3513(class364.field5299, class364.field5299, -87);
        this.field7672.method3520(true, null);
        this.field7672.method3470((byte) -96, 0);
        this.field7672.method3504((byte) -57);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIII)V")
    public final void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7692++;
        class754 var8 = this.field7672.method3482((byte) 74);
        class754 var9 = this.field7672.method3506((byte) -103);
        this.field7690.method1003(-106, class179.field2385);
        this.field7672.method3478(4);
        this.field7672.method3520(true, this.field7690);
        this.field7672.method3460(0, arg6);
        this.field7672.method3503((byte) 96, arg4);
        this.field7672.method3514((byte) -112, class109.field1493, 1);
        this.field7672.method3509(1, class109.field1493, -119);
        this.field7672.method3525(arg5, 1);
        boolean var10 = this.field7687 && this.field7691 == 0 && this.field7671 == 0;
        boolean var11 = this.field7673 && this.field7674 == 0 && this.field7681 == 0;
        if ((var11 & var10)) {
            var9.method4197((byte) 99, this.field7690.method1666(-18982, (float) arg2), 1.0F, this.field7690.method1670(127, (float) arg3));
            var8.method4197((byte) -78, (float) arg2, 0.0F, (float) arg3);
            var8.method970(arg0, arg1, 0);
            this.field7672.method3471(120, class413.field5937);
            this.field7672.method3508(11570);
            this.field7672.method3483(-27539);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method1106();
            var9.method4197((byte) -122, this.field7690.method1666(-18982, (float) arg2), 1.0F, this.field7690.method1670(125, (float) this.field7686));
            this.field7672.method3471(112, class413.field5937);
            int var32 = arg1 + this.field7691;
            for (int var33 = var32 + this.field7686; var33 <= var30; var33 += var31) {
                var8.method4197((byte) -116, (float) arg2, 0.0F, (float) this.field7686);
                var8.method970(arg0, var32, 0);
                this.field7672.method3508(11570);
                var32 += var31;
                this.field7672.method3483(-27539);
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method4197((byte) -115, this.field7690.method1666(-18982, (float) arg2), 1.0F, this.field7690.method1670(-107, (float) var34));
                this.field7672.method3471(95, class413.field5937);
                var8.method4197((byte) -119, (float) arg2, 0.0F, (float) var34);
                var8.method970(arg0, var32, 0);
                this.field7672.method3508(11570);
                this.field7672.method3483(-27539);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method1096();
            var9.method4197((byte) -103, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(125, (float) arg3));
            this.field7672.method3471(84, class413.field5937);
            int var14 = arg0 + this.field7674;
            int var15 = this.field7666 + var14;
            while (var12 >= var15) {
                var8.method4197((byte) 42, (float) this.field7666, 0.0F, (float) arg3);
                var8.method970(var14, arg1, 0);
                this.field7672.method3508(11570);
                var15 += var13;
                var14 += var13;
                this.field7672.method3483(-27539);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method4197((byte) 103, this.field7690.method1666(-18982, (float) var16), 1.0F, this.field7690.method1670(124, (float) arg3));
                this.field7672.method3471(24, class413.field5937);
                var8.method4197((byte) 117, (float) var16, 0.0F, (float) arg3);
                var8.method970(var14, arg1, 0);
                this.field7672.method3508(11570);
                this.field7672.method3483(-27539);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1096();
            int var20 = this.method1106();
            int var21 = this.field7691 + arg1;
            for (int var22 = this.field7686 + var21; var22 <= var17; var22 += var20) {
                var9.method4197((byte) 58, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(127, (float) this.field7686));
                this.field7672.method3471(84, class413.field5937);
                int var27 = this.field7674 + arg0;
                int var28 = this.field7666 + var27;
                while (var18 >= var28) {
                    var8.method4197((byte) 103, (float) this.field7666, 0.0F, (float) this.field7686);
                    var8.method970(var27, var21, 0);
                    this.field7672.method3508(11570);
                    var28 += var19;
                    this.field7672.method3483(-27539);
                    var27 += var19;
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method4197((byte) 45, this.field7690.method1666(-18982, (float) var29), 1.0F, this.field7690.method1670(124, (float) this.field7686));
                    this.field7672.method3471(76, class413.field5937);
                    var8.method4197((byte) 118, (float) var29, 0.0F, (float) this.field7686);
                    var8.method970(var27, var21, 0);
                    this.field7672.method3508(11570);
                    this.field7672.method3483(-27539);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method4197((byte) -85, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(15, (float) var23));
                this.field7672.method3471(35, class413.field5937);
                int var24 = this.field7674 + arg0;
                int var25 = var24 + this.field7666;
                while (var25 <= var18) {
                    var8.method4197((byte) 98, (float) this.field7666, 0.0F, (float) var23);
                    var8.method970(var24, var21, 0);
                    this.field7672.method3508(11570);
                    var25 += var19;
                    var24 += var19;
                    this.field7672.method3483(-27539);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method4197((byte) -103, this.field7690.method1666(-18982, (float) var26), 1.0F, this.field7690.method1670(-29, (float) var23));
                    this.field7672.method3471(31, class413.field5937);
                    var8.method4197((byte) -125, (float) var26, 0.0F, (float) var23);
                    var8.method970(var24, var21, 0);
                    this.field7672.method3508(11570);
                    this.field7672.method3483(-27539);
                }
            }
        }
        this.field7672.method3504((byte) -57);
        this.field7672.method3514((byte) 115, class386.field5627, 1);
        this.field7672.method3509(1, class386.field5627, -77);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "()I")
    public final int method1096() {
        field7688++;
        return this.field7674 + this.field7666 + this.field7681;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1100(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        field7684++;
        class754 var11 = this.field7672.method3482((byte) 91);
        class754 var12 = this.field7672.method3506((byte) -116);
        class659 var13 = (class659) arg7;
        class248 var14 = var13.field9116;
        this.field7690.method1003(-118, this.field7677 || this.field7663 || (arg6 & 0x1) == 0 ? class179.field2385 : class503.field6966);
        this.field7672.method3478(4);
        this.field7672.method3520(true, this.field7690);
        this.field7672.method3460(0, 1);
        this.field7672.method3503((byte) 37, 1);
        if (this.field7668) {
            float var15 = (float) this.field7666 / (float) this.method1096();
            float var16 = (float) this.field7686 / (float) this.method1106();
            var11.method4204(0.0F, (arg4 - arg0) * var16, (arg3 - arg1) * var15, 0, 0.0F, (arg5 - arg1) * var16, 0.0F, 0.0F, (arg2 - arg0) * var15, 1.0F);
            var11.method4208(18645, 0.0F, ((float) this.field7691 + arg1) * var16, ((float) this.field7674 + arg0) * var15);
        } else {
            var11.method4204(0.0F, arg4 - arg0, arg3 - arg1, 0, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F);
            var11.method4208(18645, 0.0F, arg1, arg0);
        }
        var12.method4197((byte) 43, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(124, (float) this.field7686));
        this.field7672.method3471(19, class413.field5937);
        this.field7672.method3470((byte) 123, 1);
        this.field7672.method3520(true, var14);
        this.field7672.method3513(class364.field5299, class521.field7150, -90);
        this.field7672.method3514((byte) -99, class386.field5627, 0);
        class754 var17 = this.field7672.method3506((byte) -114);
        var17.method986(var11);
        var17.method970(-arg8, -arg9, 0);
        var17.method4193(-102, 1.0F, var14.method1670(122, 1.0F), var14.method1666(-18982, 1.0F));
        this.field7672.method3471(36, class413.field5937);
        this.field7672.method3508(11570);
        this.field7672.method3483(-27539);
        this.field7672.method3504((byte) -57);
        this.field7672.method3514((byte) 116, class122.field1782, 0);
        this.field7672.method3513(class364.field5299, class364.field5299, 96);
        this.field7672.method3520(true, null);
        this.field7672.method3470((byte) 124, 0);
        this.field7672.method3504((byte) -57);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIII)V")
    public final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7670++;
        class754 var6 = this.field7672.method3482((byte) 115);
        class754 var7 = this.field7672.method3506((byte) -118);
        int var8 = this.field7691 + arg1;
        int var9 = this.field7674 + arg0;
        this.field7690.method1003(-110, class179.field2385);
        this.field7672.method3478(4);
        this.field7672.method3520(true, this.field7690);
        this.field7672.method3460(0, arg4);
        this.field7672.method3503((byte) 79, arg2);
        this.field7672.method3514((byte) -100, class109.field1493, 1);
        this.field7672.method3509(1, class109.field1493, -110);
        this.field7672.method3525(arg3, 1);
        var6.method4197((byte) 81, (float) this.field7666, 0.0F, (float) this.field7686);
        var6.method970(var9, var8, 0);
        var7.method4197((byte) -101, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(1, (float) this.field7686));
        this.field7672.method3471(76, class413.field5937);
        this.field7672.method3508(11570);
        this.field7672.method3483(-27539);
        this.field7672.method3504((byte) -57);
        this.field7672.method3514((byte) -128, class386.field5627, 1);
        this.field7672.method3509(1, class386.field5627, -120);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7680++;
        class754 var9 = this.field7672.method3482((byte) 96);
        class754 var10 = this.field7672.method3506((byte) -123);
        this.field7690.method1003(-107, this.field7677 || this.field7663 || (arg7 & 0x1) == 0 ? class179.field2385 : class503.field6966);
        this.field7672.method3478(4);
        this.field7672.method3520(true, this.field7690);
        this.field7672.method3460(0, arg6);
        this.field7672.method3503((byte) 72, arg4);
        this.field7672.method3514((byte) -56, class109.field1493, 1);
        this.field7672.method3509(1, class109.field1493, -127);
        this.field7672.method3525(arg5, 1);
        var10.method4197((byte) -110, this.field7690.method1666(-18982, (float) this.field7666), 1.0F, this.field7690.method1670(121, (float) this.field7686));
        if (this.field7668) {
            arg2 = this.field7666 * arg2 / this.method1096();
            arg3 = this.field7686 * arg3 / this.method1106();
            arg0 += this.field7674 * arg2 / this.field7666;
            arg1 += this.field7691 * arg3 / this.field7686;
        }
        var9.method4197((byte) -88, (float) arg2, 0.0F, (float) arg3);
        var9.method970(arg0, arg1, 0);
        this.field7672.method3471(120, class413.field5937);
        this.field7672.method3508(11570);
        this.field7672.method3483(-27539);
        this.field7672.method3504((byte) -57);
        this.field7672.method3514((byte) 113, class386.field5627, 1);
        this.field7672.method3509(1, class386.field5627, -103);
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lai;IIZ)V")
    public class572(class626 arg0, int arg1, int arg2, boolean arg3) {
        this.field7666 = arg1;
        this.field7686 = arg2;
        this.field7672 = arg0;
        this.field7690 = arg0.method892(arg2, arg1, class258.field3847, arg3 ? class305.field4404 : class742.field10243, 18018);
        this.field7690.method1667(true, true, 30135);
        this.field7677 = this.field7690.method1668(false) != arg1;
        this.field7663 = arg2 != this.field7690.method1665((byte) 84);
        this.field7673 = !this.field7677 && this.field7690.method1664(26244);
        this.field7687 = !this.field7663 && this.field7690.method1664(26244);
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lai;II[III)V")
    public class572(class626 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7666 = arg1;
        this.field7686 = arg2;
        this.field7672 = arg0;
        this.field7690 = arg0.method857(arg5, arg3, arg1, arg4, false, arg2, 9567);
        this.field7690.method1667(true, true, 30135);
        this.field7677 = this.field7690.method1668(false) != arg1;
        this.field7663 = this.field7690.method1665((byte) 84) != arg2;
        this.field7673 = !this.field7677 && this.field7690.method1664(26244);
        this.field7687 = !this.field7663 && this.field7690.method1664(26244);
    }
}
