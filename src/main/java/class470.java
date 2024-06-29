import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class470 extends class534 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private int field6714 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field6713 = 0;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Z")
    private boolean field6725 = false;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    private int field6736 = 0;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    private int field6742 = 0;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    private int field6716;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "Lmj;")
    private class344 field6741;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    private int field6728;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "Lpm;")
    private class134 field6737;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "Z")
    private boolean field6735;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "Z")
    private boolean field6739;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Z")
    private boolean field6719;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Z")
    private boolean field6724;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Z")
    public static boolean field6717 = false;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lcq;")
    public static class110 field6722 = new class110(88, 10);

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "Z")
    public static boolean field6744 = false;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "Lwd;")
    public static class357 field6745 = new class357(0, 2, 2, 1);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "[Lf;")
    public static class534[] field6746;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[[I")
    public static int[][] field6718;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "()I")
    public final int method315() {
        field6734++;
        return this.field6728;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII[III)V")
    private final void method2711(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field6738++;
        this.field6737.method753(arg6, arg2, arg5, arg1, arg4, (byte) -119, arg3, arg0);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method302(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class598 arg7, int arg8, int arg9) {
        field6727++;
        class537 var11 = this.field6741.method2014(390);
        class537 var12 = this.field6741.method2044(51);
        class507 var13 = (class507) arg7;
        class134 var14 = var13.field7284;
        this.field6737.method2077(this.field6735 || this.field6739 || (arg6 & 0x1) == 0 ? class401.field5388 : class377.field5117, (byte) 93);
        this.field6741.method2048(true);
        this.field6741.method1997(126, this.field6737);
        this.field6741.method2051(1, (byte) -124);
        this.field6741.method2004(1, 2);
        if (this.field6725) {
            float var15 = (float) this.field6728 / (float) this.method312();
            float var16 = (float) this.field6716 / (float) this.method304();
            var11.method3022(0.0F, (arg4 - arg0) * var16, (arg3 - arg1) * var15, 0.0F, 0.0F, -498, (arg2 - arg0) * var15, 0.0F, (arg5 - arg1) * var16, 1.0F);
            var11.method3017(((float) this.field6714 + arg0) * var15, 0.0F, (byte) -48, ((float) this.field6736 + arg1) * var16);
        } else {
            var11.method3022(0.0F, arg4 - arg0, arg3 - arg1, 0.0F, 0.0F, -498, arg2 - arg0, 0.0F, arg5 - arg1, 1.0F);
            var11.method3017(arg0, 0.0F, (byte) -48, arg1);
        }
        var12.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
        this.field6741.method1999(class103.field1120, false);
        this.field6741.method2015(1, -2);
        this.field6741.method1997(127, var14);
        this.field6741.method1994(-30, class250.field3133, class428.field6081);
        this.field6741.method2012((byte) -111, 0, class692.field9717);
        class537 var17 = this.field6741.method2044(62);
        var17.method15(var11);
        var17.method30(-arg8, -arg9, 0);
        var17.method3012(var14.method756(1.0F, 5044), -20775, 1.0F, var14.method758(1.0F, false));
        this.field6741.method1999(class103.field1120, false);
        this.field6741.method2033((byte) 101);
        this.field6741.method1981(-78);
        this.field6741.method2010(114);
        this.field6741.method2012((byte) -66, 0, class304.field3769);
        this.field6741.method1994(-30, class250.field3133, class250.field3133);
        this.field6741.method1997(126, null);
        this.field6741.method2015(0, -2);
        this.field6741.method2010(126);
    }

    @OriginalMember(owner = "client!ai", name = "ca", descriptor = "()I")
    public final int method304() {
        field6729++;
        return this.field6736 + this.field6716 + this.field6713;
    }

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "()I")
    public final int method312() {
        field6740++;
        return this.field6728 + this.field6714 + this.field6742;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILua;II)V")
    public final void method301(int arg0, int arg1, class598 arg2, int arg3, int arg4) {
        field6723++;
        class507 var6 = (class507) arg2;
        int var7 = this.field6714 + arg0;
        class134 var8 = var6.field7284;
        int var9 = this.field6736 + arg1;
        this.field6737.method2077(class401.field5388, (byte) 93);
        this.field6741.method2048(true);
        this.field6741.method1997(127, this.field6737);
        this.field6741.method2051(1, (byte) 115);
        this.field6741.method2004(1, 2);
        class537 var10 = this.field6741.method2014(390);
        var10.method3030((float) this.field6728, (byte) -51, (float) this.field6716, 0.0F);
        var10.method30(var7, var9, 0);
        this.field6741.method2033((byte) 101);
        class537 var11 = this.field6741.method2044(48);
        var11.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
        this.field6741.method1999(class103.field1120, false);
        this.field6741.method2015(1, -2);
        this.field6741.method1997(127, var8);
        this.field6741.method1994(-30, class250.field3133, class428.field6081);
        this.field6741.method2012((byte) -106, 0, class692.field9717);
        class537 var12 = this.field6741.method2044(38);
        var12.method3030(var8.method756((float) this.field6728, 5044), (byte) -51, var8.method758((float) this.field6716, false), 1.0F);
        var12.method3017(var8.method756((float) (var7 - arg3), 5044), 0.0F, (byte) -48, var8.method758((float) (var9 - arg4), false));
        this.field6741.method1999(class103.field1120, false);
        this.field6741.method1981(-107);
        this.field6741.method2010(117);
        this.field6741.method2012((byte) -55, 0, class304.field3769);
        this.field6741.method1994(-30, class250.field3133, class250.field3133);
        this.field6741.method1997(126, null);
        this.field6741.method2015(0, -2);
        this.field6741.method2010(116);
    }

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "(IIIII)V")
    public final void method314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6720++;
        class537 var6 = this.field6741.method2014(390);
        class537 var7 = this.field6741.method2044(65);
        int var8 = this.field6714 + arg0;
        int var9 = this.field6736 + arg1;
        this.field6737.method2077(class401.field5388, (byte) 93);
        this.field6741.method2048(true);
        this.field6741.method1997(126, this.field6737);
        this.field6741.method2051(arg4, (byte) -38);
        this.field6741.method2004(arg2, 2);
        this.field6741.method2012((byte) -64, 1, class107.field1154);
        this.field6741.method1979(1, class107.field1154, (byte) -59);
        this.field6741.method1988(arg3, 4);
        var6.method3030((float) this.field6728, (byte) -51, (float) this.field6716, 0.0F);
        var6.method30(var8, var9, 0);
        var7.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
        this.field6741.method1999(class103.field1120, false);
        this.field6741.method2033((byte) 101);
        this.field6741.method1981(-84);
        this.field6741.method2010(124);
        this.field6741.method2012((byte) -97, 1, class692.field9717);
        this.field6741.method1979(1, class692.field9717, (byte) -54);
    }

    @OriginalMember(owner = "client!ai", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6730++;
        class537 var9 = this.field6741.method2014(390);
        class537 var10 = this.field6741.method2044(53);
        this.field6737.method2077(this.field6735 || this.field6739 || (arg7 & 0x1) == 0 ? class401.field5388 : class377.field5117, (byte) 93);
        this.field6741.method2048(true);
        this.field6741.method1997(127, this.field6737);
        this.field6741.method2051(arg6, (byte) -80);
        this.field6741.method2004(arg4, 2);
        this.field6741.method2012((byte) -102, 1, class107.field1154);
        this.field6741.method1979(1, class107.field1154, (byte) -56);
        this.field6741.method1988(arg5, 4);
        var10.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
        if (this.field6725) {
            arg2 = this.field6728 * arg2 / this.method312();
            arg3 = this.field6716 * arg3 / this.method304();
            arg1 += this.field6736 * arg3 / this.field6716;
            arg0 += this.field6714 * arg2 / this.field6728;
        }
        var9.method3030((float) arg2, (byte) -51, (float) arg3, 0.0F);
        var9.method30(arg0, arg1, 0);
        this.field6741.method1999(class103.field1120, false);
        this.field6741.method2033((byte) 101);
        this.field6741.method1981(-103);
        this.field6741.method2010(109);
        this.field6741.method2012((byte) -119, 1, class692.field9717);
        this.field6741.method1979(1, class692.field9717, (byte) -61);
    }

    @OriginalMember(owner = "client!ai", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method310(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field6715++;
        class537 var11 = this.field6741.method2014(390);
        class537 var12 = this.field6741.method2044(79);
        this.field6737.method2077(this.field6735 || this.field6739 || (arg9 & 0x1) == 0 ? class401.field5388 : class377.field5117, (byte) 93);
        this.field6741.method2048(true);
        this.field6741.method1997(127, this.field6737);
        this.field6741.method2051(arg8, (byte) 126);
        this.field6741.method2004(arg6, 2);
        this.field6741.method2012((byte) -92, 1, class107.field1154);
        this.field6741.method1979(1, class107.field1154, (byte) -70);
        this.field6741.method1988(arg7, 4);
        if (this.field6725) {
            float var13 = (float) this.method312();
            float var14 = (float) this.method304();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field6736 * var17;
            float var20 = (float) this.field6736 * var18;
            float var21 = (float) this.field6714 * var15;
            float var22 = (float) this.field6714 * var16;
            float var23 = (float) this.field6742 * -var15;
            float var24 = (float) this.field6742 * -var16;
            float var25 = (float) this.field6713 * -var17;
            arg3 = arg3 + var24 + var20;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            float var26 = (float) this.field6713 * -var18;
            arg2 = arg2 + var23 + var19;
            arg0 = arg0 + var21 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3022(0.0F, arg4 - arg0, arg3 - arg1, 0.0F, 0.0F, -498, arg2 - arg0, 0.0F, arg5 - arg1, 1.0F);
        var11.method3017(arg0, 0.0F, (byte) -48, arg1);
        var12.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
        this.field6741.method1999(class103.field1120, false);
        this.field6741.method2033((byte) 101);
        this.field6741.method1981(-118);
        this.field6741.method2010(124);
        this.field6741.method2012((byte) -43, 1, class692.field9717);
        this.field6741.method1979(1, class692.field9717, (byte) -28);
    }

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "(IIII)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3) {
        this.field6713 = arg3;
        field6731++;
        this.field6714 = arg0;
        this.field6736 = arg1;
        this.field6742 = arg2;
        this.field6725 = this.field6714 != 0 || this.field6736 != 0 || this.field6742 != 0 || this.field6713 != 0;
    }

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "()I")
    public final int method306() {
        field6726++;
        return this.field6716;
    }

    @OriginalMember(owner = "client!ai", name = "xa", descriptor = "(III)V")
    public final void method488(int arg0, int arg1, int arg2) {
        field6732++;
    }

    @OriginalMember(owner = "client!ai", name = "DA", descriptor = "(IIIIIII)V")
    public final void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6743++;
        class537 var8 = this.field6741.method2014(390);
        class537 var9 = this.field6741.method2044(37);
        this.field6737.method2077(class401.field5388, (byte) 93);
        this.field6741.method2048(true);
        this.field6741.method1997(126, this.field6737);
        this.field6741.method2051(arg6, (byte) 108);
        this.field6741.method2004(arg4, 2);
        this.field6741.method2012((byte) -47, 1, class107.field1154);
        this.field6741.method1979(1, class107.field1154, (byte) -126);
        this.field6741.method1988(arg5, 4);
        boolean var10 = this.field6724 && this.field6736 == 0 && this.field6713 == 0;
        boolean var11 = this.field6719 && this.field6714 == 0 && this.field6742 == 0;
        if ((var10 & var11)) {
            var9.method3030(this.field6737.method756((float) arg2, 5044), (byte) -51, this.field6737.method758((float) arg3, false), 1.0F);
            var8.method3030((float) arg2, (byte) -51, (float) arg3, 0.0F);
            var8.method30(arg0, arg1, 0);
            this.field6741.method1999(class103.field1120, false);
            this.field6741.method2033((byte) 101);
            this.field6741.method1981(-75);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method304();
            var9.method3030(this.field6737.method756((float) arg2, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
            this.field6741.method1999(class103.field1120, false);
            int var32 = arg1 + this.field6736;
            int var33 = this.field6716 + var32;
            while (var30 >= var33) {
                var8.method3030((float) arg2, (byte) -51, (float) this.field6716, 0.0F);
                var8.method30(arg0, var32, 0);
                this.field6741.method2033((byte) 101);
                this.field6741.method1981(-114);
                var33 += var31;
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method3030(this.field6737.method756((float) arg2, 5044), (byte) -51, this.field6737.method758((float) var34, false), 1.0F);
                this.field6741.method1999(class103.field1120, false);
                var8.method3030((float) arg2, (byte) -51, (float) var34, 0.0F);
                var8.method30(arg0, var32, 0);
                this.field6741.method2033((byte) 101);
                this.field6741.method1981(-78);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method312();
            var9.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) arg3, false), 1.0F);
            this.field6741.method1999(class103.field1120, false);
            int var14 = this.field6714 + arg0;
            int var15 = this.field6728 + var14;
            while (var12 >= var15) {
                var8.method3030((float) this.field6728, (byte) -51, (float) arg3, 0.0F);
                var8.method30(var14, arg1, 0);
                this.field6741.method2033((byte) 101);
                var14 += var13;
                var15 += var13;
                this.field6741.method1981(-93);
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method3030(this.field6737.method756((float) var16, 5044), (byte) -51, this.field6737.method758((float) arg3, false), 1.0F);
                this.field6741.method1999(class103.field1120, false);
                var8.method3030((float) var16, (byte) -51, (float) arg3, 0.0F);
                var8.method30(var14, arg1, 0);
                this.field6741.method2033((byte) 101);
                this.field6741.method1981(-101);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method312();
            int var20 = this.method304();
            int var21 = this.field6736 + arg1;
            int var22 = this.field6716 + var21;
            while (var22 <= var17) {
                var9.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
                this.field6741.method1999(class103.field1120, false);
                int var27 = this.field6714 + arg0;
                int var28 = this.field6728 + var27;
                while (var28 <= var18) {
                    var8.method3030((float) this.field6728, (byte) -51, (float) this.field6716, 0.0F);
                    var8.method30(var27, var21, 0);
                    this.field6741.method2033((byte) 101);
                    var27 += var19;
                    var28 += var19;
                    this.field6741.method1981(-93);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method3030(this.field6737.method756((float) var29, 5044), (byte) -51, this.field6737.method758((float) this.field6716, false), 1.0F);
                    this.field6741.method1999(class103.field1120, false);
                    var8.method3030((float) var29, (byte) -51, (float) this.field6716, 0.0F);
                    var8.method30(var27, var21, 0);
                    this.field6741.method2033((byte) 101);
                    this.field6741.method1981(-120);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method3030(this.field6737.method756((float) this.field6728, 5044), (byte) -51, this.field6737.method758((float) var23, false), 1.0F);
                this.field6741.method1999(class103.field1120, false);
                int var24 = this.field6714 + arg0;
                int var25 = this.field6728 + var24;
                while (var18 >= var25) {
                    var8.method3030((float) this.field6728, (byte) -51, (float) var23, 0.0F);
                    var8.method30(var24, var21, 0);
                    this.field6741.method2033((byte) 101);
                    var25 += var19;
                    var24 += var19;
                    this.field6741.method1981(-112);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method3030(this.field6737.method756((float) var26, 5044), (byte) -51, this.field6737.method758((float) var23, false), 1.0F);
                    this.field6741.method1999(class103.field1120, false);
                    var8.method3030((float) var26, (byte) -51, (float) var23, 0.0F);
                    var8.method30(var24, var21, 0);
                    this.field6741.method2033((byte) 101);
                    this.field6741.method1981(-87);
                }
            }
        }
        this.field6741.method2010(113);
        this.field6741.method2012((byte) -123, 1, class692.field9717);
        this.field6741.method1979(1, class692.field9717, (byte) -67);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method2712(int arg0) {
        if (arg0 != 1) {
            method2713(-34, 43);
        }
        field6745 = null;
        field6722 = null;
        field6746 = null;
        field6718 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Z")
    public static final boolean method2713(int arg0, int arg1) {
        if (arg0 < 10) {
            method2712(-70);
        }
        field6721++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ai", name = "da", descriptor = "(IIIIII)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6733++;
        int[] var7 = this.field6741.method944(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class422.method2436(var7[var8], -16777216);
            }
            this.method2711(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lmj;IIZ)V")
    public class470(class344 arg0, int arg1, int arg2, boolean arg3) {
        this.field6716 = arg2;
        this.field6741 = arg0;
        this.field6728 = arg1;
        this.field6737 = arg0.method1319(arg1, arg2, -67, class179.field2008, arg3 ? class412.field5529 : class293.field3663);
        this.field6737.method759(true, -19314, true);
        this.field6735 = arg1 != this.field6737.method752(115);
        this.field6739 = arg2 != this.field6737.method754(7142);
        this.field6719 = !this.field6735 && this.field6737.method755(-75);
        this.field6724 = !this.field6739 && this.field6737.method755(-109);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lmj;II[III)V")
    public class470(class344 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6741 = arg0;
        this.field6716 = arg2;
        this.field6728 = arg1;
        this.field6737 = arg0.method1300((byte) 63, false, arg5, arg2, arg1, arg3, arg4);
        this.field6737.method759(true, -19314, true);
        this.field6735 = arg1 != this.field6737.method752(105);
        this.field6739 = this.field6737.method754(7142) != arg2;
        this.field6719 = !this.field6735 && this.field6737.method755(-74);
        this.field6724 = !this.field6739 && this.field6737.method755(-81);
    }
}
