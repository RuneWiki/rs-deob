import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class121 extends class702 {

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    private int field1942 = 0;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    private int field1947 = 0;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    private int field1952 = 0;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Z")
    private boolean field1954 = false;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    private int field1943 = 0;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "Lrr;")
    private class332 field1962;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lmca;")
    private class29 field1951;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Z")
    private boolean field1963;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Z")
    private boolean field1937;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Z")
    private boolean field1941;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Z")
    private boolean field1938;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lrl;")
    public static class672 field1935 = new class672(34, 3);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lufa;")
    public static class632 field1950;

    @OriginalMember(owner = "client!wf", name = "YA", descriptor = "(IIIIIIII)V", line = 4)
    public final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1958++;
        class498 var9 = this.field1962.method2296(0);
        class498 var10 = this.field1962.method2282((byte) 122);
        this.field1951.method246(this.field1963 || this.field1937 || (arg7 & 0x1) == 0 ? class123.field2045 : class379.field5910, (byte) -18);
        this.field1962.method2274(2929);
        this.field1962.method2271(this.field1951, 5180);
        this.field1962.method2259(-76, arg6);
        this.field1962.method2280(2, arg4);
        this.field1962.method2287((byte) -88, 1, class471.field6974);
        this.field1962.method2304(class471.field6974, 1, -127);
        this.field1962.method2290(10359, arg5);
        var10.method3034(this.field1951.method365(-105, (float) this.field1944), this.field1951.method373((float) this.field1949, (byte) -100), true, 1.0F);
        if (this.field1954) {
            arg2 = this.field1944 * arg2 / this.method1076();
            arg3 = this.field1949 * arg3 / this.method1079();
            arg0 += this.field1942 * arg2 / this.field1944;
            arg1 += this.field1952 * arg3 / this.field1949;
        }
        var9.method3034((float) arg2, (float) arg3, true, 0.0F);
        var9.method505(arg0, arg1, 0);
        this.field1962.method2291(class386.field5995, 24813);
        this.field1962.method2270(-21);
        this.field1962.method2250(51);
        this.field1962.method2263((byte) 116);
        this.field1962.method2287((byte) -93, 1, class692.field9702);
        this.field1962.method2304(class692.field9702, 1, -122);
    }

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "()I", line = 43)
    public final int method1075() {
        field1955++;
        return this.field1949;
    }

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "()I", line = 55)
    public final int method1076() {
        field1948++;
        return this.field1944 + this.field1942 + this.field1943;
    }

    @OriginalMember(owner = "client!wf", name = "xa", descriptor = "(III)V", line = 63)
    public final void method1077(int arg0, int arg1, int arg2) {
        field1934++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)Z", line = 73)
    public static final boolean method1078(int arg0, int arg1, int arg2) {
        if (arg0 == 30518) {
            field1953++;
            return (arg2 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "ca", descriptor = "()I", line = 84)
    public final int method1079() {
        field1945++;
        return this.field1949 - (-this.field1952 - this.field1947);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lrr;IIZ)V", line = 618)
    public class121(class332 arg0, int arg1, int arg2, boolean arg3) {
        this.field1962 = arg0;
        this.field1949 = arg2;
        this.field1944 = arg1;
        this.field1951 = arg0.method125(arg2, arg1, class134.field2197, 110, arg3 ? class86.field1055 : class189.field3150);
        this.field1951.method364(true, true, (byte) 119);
        this.field1963 = this.field1951.method371(-89) != arg1;
        this.field1937 = this.field1951.method369(57) != arg2;
        this.field1941 = !this.field1963 && this.field1951.method366(-4758);
        this.field1938 = !this.field1937 && this.field1951.method366(-4758);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lrr;II[III)V", line = 633)
    public class121(class332 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1962 = arg0;
        this.field1944 = arg1;
        this.field1949 = arg2;
        this.field1951 = arg0.method142(arg3, 119, false, arg2, arg5, arg4, arg1);
        this.field1951.method364(true, true, (byte) -6);
        this.field1963 = arg1 != this.field1951.method371(-78);
        this.field1937 = this.field1951.method369(76) != arg2;
        this.field1941 = !this.field1963 && this.field1951.method366(-4758);
        this.field1938 = !this.field1937 && this.field1951.method366(-4758);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILua;II)V", line = 100)
    public final void method1080(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        field1964++;
        class213 var6 = (class213) arg2;
        int var7 = this.field1942 + arg0;
        class29 var8 = var6.field3535;
        int var9 = this.field1952 + arg1;
        this.field1951.method246(class123.field2045, (byte) 118);
        this.field1962.method2274(2929);
        this.field1962.method2271(this.field1951, 5180);
        this.field1962.method2259(-76, 1);
        this.field1962.method2280(2, 1);
        class498 var10 = this.field1962.method2296(0);
        var10.method3034((float) this.field1944, (float) this.field1949, true, 0.0F);
        var10.method505(var7, var9, 0);
        this.field1962.method2270(-83);
        class498 var11 = this.field1962.method2282((byte) -111);
        var11.method3034(this.field1951.method365(-110, (float) this.field1944), this.field1951.method373((float) this.field1949, (byte) -83), true, 1.0F);
        this.field1962.method2291(class386.field5995, 24813);
        this.field1962.method2244(1, -125);
        this.field1962.method2271(var8, 5180);
        this.field1962.method2275(class646.field9074, -108, class406.field6268);
        this.field1962.method2287((byte) -78, 0, class692.field9702);
        class498 var12 = this.field1962.method2282((byte) -13);
        var12.method3034(var8.method365(-94, (float) this.field1944), var8.method373((float) this.field1949, (byte) -63), true, 1.0F);
        var12.method3024(var8.method365(-119, (float) (var7 - arg3)), 26428, 0.0F, var8.method373((float) (var9 - arg4), (byte) -92));
        this.field1962.method2291(class386.field5995, 24813);
        this.field1962.method2250(118);
        this.field1962.method2263((byte) 116);
        this.field1962.method2287((byte) -105, 0, class622.field8779);
        this.field1962.method2275(class646.field9074, 119, class646.field9074);
        this.field1962.method2271(null, 5180);
        this.field1962.method2244(0, -121);
        this.field1962.method2263((byte) 121);
    }

    @OriginalMember(owner = "client!wf", name = "da", descriptor = "(IIIIII)V", line = 147)
    public final void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1956++;
        int[] var7 = this.field1962.method146(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class81.method769(var7[var8], -16777216);
            }
            this.method1082(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII[III)V", line = 168)
    private final void method1082(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field1951.method372(13353, arg2, arg4, arg5, arg6, arg0, arg3, arg1);
        field1960++;
    }

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "()I", line = 176)
    public final int method1083() {
        field1936++;
        return this.field1944;
    }

    @OriginalMember(owner = "client!wf", name = "qa", descriptor = "(FFFFFFIIII)V", line = 184)
    public final void method1084(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field1940++;
        class498 var11 = this.field1962.method2296(0);
        class498 var12 = this.field1962.method2282((byte) 117);
        this.field1951.method246(this.field1963 || this.field1937 || (arg9 & 0x1) == 0 ? class123.field2045 : class379.field5910, (byte) -45);
        this.field1962.method2274(2929);
        this.field1962.method2271(this.field1951, 5180);
        this.field1962.method2259(-56, arg8);
        this.field1962.method2280(2, arg6);
        this.field1962.method2287((byte) -117, 1, class471.field6974);
        this.field1962.method2304(class471.field6974, 1, -117);
        this.field1962.method2290(10359, arg7);
        if (this.field1954) {
            float var13 = (float) this.method1076();
            float var14 = (float) this.method1079();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field1952 * var17;
            float var20 = (float) this.field1952 * var18;
            float var21 = (float) this.field1942 * var15;
            float var22 = (float) this.field1942 * var16;
            float var23 = (float) this.field1943 * -var15;
            float var24 = (float) this.field1943 * -var16;
            float var25 = (float) this.field1947 * -var17;
            arg1 = arg1 + var22 + var20;
            arg0 = arg0 + var21 + var19;
            float var26 = (float) this.field1947 * -var18;
            arg3 = arg3 + var24 + var20;
            arg2 = arg2 + var23 + var19;
            arg4 = arg4 + var21 + var25;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3023(0.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, arg2 - arg0, -arg1 + arg5, (byte) -80, arg3 - arg1, 1.0F);
        var11.method3024(arg0, 26428, 0.0F, arg1);
        var12.method3034(this.field1951.method365(-109, (float) this.field1944), this.field1951.method373((float) this.field1949, (byte) -109), true, 1.0F);
        this.field1962.method2291(class386.field5995, 24813);
        this.field1962.method2270(-46);
        this.field1962.method2250(20);
        this.field1962.method2263((byte) 117);
        this.field1962.method2287((byte) -105, 1, class692.field9702);
        this.field1962.method2304(class692.field9702, 1, -115);
    }

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "(IIII)V", line = 253)
    public final void method1085(int arg0, int arg1, int arg2, int arg3) {
        this.field1943 = arg2;
        this.field1952 = arg1;
        this.field1947 = arg3;
        field1961++;
        this.field1942 = arg0;
        this.field1954 = this.field1942 != 0 || this.field1952 != 0 || this.field1943 != 0 || this.field1947 != 0;
    }

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "(IIIII)V", line = 274)
    public final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1939++;
        class498 var6 = this.field1962.method2296(0);
        class498 var7 = this.field1962.method2282((byte) 116);
        int var8 = this.field1942 + arg0;
        int var9 = this.field1952 + arg1;
        this.field1951.method246(class123.field2045, (byte) 104);
        this.field1962.method2274(2929);
        this.field1962.method2271(this.field1951, 5180);
        this.field1962.method2259(-120, arg4);
        this.field1962.method2280(2, arg2);
        this.field1962.method2287((byte) -96, 1, class471.field6974);
        this.field1962.method2304(class471.field6974, 1, -128);
        this.field1962.method2290(10359, arg3);
        var6.method3034((float) this.field1944, (float) this.field1949, true, 0.0F);
        var6.method505(var8, var9, 0);
        var7.method3034(this.field1951.method365(-103, (float) this.field1944), this.field1951.method373((float) this.field1949, (byte) -83), true, 1.0F);
        this.field1962.method2291(class386.field5995, 24813);
        this.field1962.method2270(-91);
        this.field1962.method2250(73);
        this.field1962.method2263((byte) 107);
        this.field1962.method2287((byte) -88, 1, class692.field9702);
        this.field1962.method2304(class692.field9702, 1, -114);
    }

    @OriginalMember(owner = "client!wf", name = "DA", descriptor = "(IIIIIII)V", line = 304)
    public final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1959++;
        class498 var8 = this.field1962.method2296(0);
        class498 var9 = this.field1962.method2282((byte) -53);
        this.field1951.method246(class123.field2045, (byte) 124);
        this.field1962.method2274(2929);
        this.field1962.method2271(this.field1951, 5180);
        this.field1962.method2259(-42, arg6);
        this.field1962.method2280(2, arg4);
        this.field1962.method2287((byte) -88, 1, class471.field6974);
        this.field1962.method2304(class471.field6974, 1, -124);
        this.field1962.method2290(10359, arg5);
        boolean var10 = this.field1938 && this.field1952 == 0 && this.field1947 == 0;
        boolean var11 = this.field1941 && this.field1942 == 0 && this.field1943 == 0;
        if (var10 & var11) {
            var9.method3034(this.field1951.method365(-115, (float) arg2), this.field1951.method373((float) arg3, (byte) -121), true, 1.0F);
            var8.method3034((float) arg2, (float) arg3, true, 0.0F);
            var8.method505(arg0, arg1, 0);
            this.field1962.method2291(class386.field5995, 24813);
            this.field1962.method2270(-12);
            this.field1962.method2250(45);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method1079();
            var9.method3034(this.field1951.method365(-116, (float) arg2), this.field1951.method373((float) this.field1949, (byte) -61), true, 1.0F);
            this.field1962.method2291(class386.field5995, 24813);
            int var32 = this.field1952 + arg1;
            for (int var33 = this.field1949 + var32; var33 <= var30; var33 += var31) {
                var8.method3034((float) arg2, (float) this.field1949, true, 0.0F);
                var8.method505(arg0, var32, 0);
                this.field1962.method2270(-54);
                var32 += var31;
                this.field1962.method2250(72);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method3034(this.field1951.method365(-97, (float) arg2), this.field1951.method373((float) var34, (byte) -110), true, 1.0F);
                this.field1962.method2291(class386.field5995, 24813);
                var8.method3034((float) arg2, (float) var34, true, 0.0F);
                var8.method505(arg0, var32, 0);
                this.field1962.method2270(-98);
                this.field1962.method2250(99);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method1076();
            var9.method3034(this.field1951.method365(-124, (float) this.field1944), this.field1951.method373((float) arg3, (byte) -110), true, 1.0F);
            this.field1962.method2291(class386.field5995, 24813);
            int var27 = arg0 + this.field1942;
            int var28 = this.field1944 + var27;
            while (var28 <= var25) {
                var8.method3034((float) this.field1944, (float) arg3, true, 0.0F);
                var8.method505(var27, arg1, 0);
                this.field1962.method2270(-73);
                var28 += var26;
                var27 += var26;
                this.field1962.method2250(127);
            }
            if (var27 < var25) {
                int var29 = var25 - var27;
                var9.method3034(this.field1951.method365(-92, (float) var29), this.field1951.method373((float) arg3, (byte) -96), true, 1.0F);
                this.field1962.method2291(class386.field5995, 24813);
                var8.method3034((float) var29, (float) arg3, true, 0.0F);
                var8.method505(var27, arg1, 0);
                this.field1962.method2270(-110);
                this.field1962.method2250(41);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method1076();
            int var15 = this.method1079();
            int var16 = this.field1952 + arg1;
            int var17 = this.field1949 + var16;
            while (var17 <= var12) {
                var9.method3034(this.field1951.method365(-115, (float) this.field1944), this.field1951.method373((float) this.field1949, (byte) -119), true, 1.0F);
                this.field1962.method2291(class386.field5995, 24813);
                int var22 = arg0 + this.field1942;
                int var23 = this.field1944 + var22;
                while (var13 >= var23) {
                    var8.method3034((float) this.field1944, (float) this.field1949, true, 0.0F);
                    var8.method505(var22, var16, 0);
                    this.field1962.method2270(-59);
                    this.field1962.method2250(112);
                    var23 += var14;
                    var22 += var14;
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method3034(this.field1951.method365(-93, (float) var24), this.field1951.method373((float) this.field1949, (byte) -90), true, 1.0F);
                    this.field1962.method2291(class386.field5995, 24813);
                    var8.method3034((float) var24, (float) this.field1949, true, 0.0F);
                    var8.method505(var22, var16, 0);
                    this.field1962.method2270(-74);
                    this.field1962.method2250(97);
                }
                var17 += var15;
                var16 += var15;
            }
            if (var16 < var12) {
                int var18 = var12 - var16;
                var9.method3034(this.field1951.method365(-101, (float) this.field1944), this.field1951.method373((float) var18, (byte) -117), true, 1.0F);
                this.field1962.method2291(class386.field5995, 24813);
                int var19 = this.field1942 + arg0;
                for (int var20 = this.field1944 + var19; var20 <= var13; var20 += var14) {
                    var8.method3034((float) this.field1944, (float) var18, true, 0.0F);
                    var8.method505(var19, var16, 0);
                    this.field1962.method2270(-21);
                    var19 += var14;
                    this.field1962.method2250(100);
                }
                if (var19 < var13) {
                    int var21 = var13 - var19;
                    var9.method3034(this.field1951.method365(-96, (float) var21), this.field1951.method373((float) var18, (byte) -72), true, 1.0F);
                    this.field1962.method2291(class386.field5995, 24813);
                    var8.method3034((float) var21, (float) var18, true, 0.0F);
                    var8.method505(var19, var16, 0);
                    this.field1962.method2270(-55);
                    this.field1962.method2250(19);
                }
            }
        }
        this.field1962.method2263((byte) 122);
        this.field1962.method2287((byte) -79, 1, class692.field9702);
        this.field1962.method2304(class692.field9702, 1, -118);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(FFFFFFILua;II)V", line = 513)
    public final void method1088(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        field1957++;
        class498 var11 = this.field1962.method2296(0);
        class498 var12 = this.field1962.method2282((byte) -105);
        class213 var13 = (class213) arg7;
        class29 var14 = var13.field3535;
        this.field1951.method246(this.field1963 || this.field1937 || (arg6 & 0x1) == 0 ? class123.field2045 : class379.field5910, (byte) -54);
        this.field1962.method2274(2929);
        this.field1962.method2271(this.field1951, 5180);
        this.field1962.method2259(-22, 1);
        this.field1962.method2280(2, 1);
        if (this.field1954) {
            float var15 = (float) this.field1944 / (float) this.method1076();
            float var16 = (float) this.field1949 / (float) this.method1079();
            var11.method3023(0.0F, 0.0F, 0.0F, (arg4 - arg0) * var16, 0.0F, (arg2 - arg0) * var15, (arg5 - arg1) * var16, (byte) -101, (arg3 - arg1) * var15, 1.0F);
            var11.method3024(((float) this.field1942 + arg0) * var15, 26428, 0.0F, ((float) this.field1952 + arg1) * var16);
        } else {
            var11.method3023(0.0F, 0.0F, 0.0F, arg4 - arg0, 0.0F, arg2 - arg0, arg5 - arg1, (byte) -97, arg3 - arg1, 1.0F);
            var11.method3024(arg0, 26428, 0.0F, arg1);
        }
        var12.method3034(this.field1951.method365(-103, (float) this.field1944), this.field1951.method373((float) this.field1949, (byte) -71), true, 1.0F);
        this.field1962.method2291(class386.field5995, 24813);
        this.field1962.method2244(1, -72);
        this.field1962.method2271(var14, 5180);
        this.field1962.method2275(class646.field9074, -47, class406.field6268);
        this.field1962.method2287((byte) -117, 0, class692.field9702);
        class498 var17 = this.field1962.method2282((byte) -23);
        var17.method512(var11);
        var17.method505(-arg8, -arg9, 0);
        var17.method3030(var14.method365(-113, 1.0F), 1.0F, var14.method373(1.0F, (byte) -121), 24625);
        this.field1962.method2291(class386.field5995, 24813);
        this.field1962.method2270(-53);
        this.field1962.method2250(118);
        this.field1962.method2263((byte) 122);
        this.field1962.method2287((byte) -99, 0, class622.field8779);
        this.field1962.method2275(class646.field9074, 91, class646.field9074);
        this.field1962.method2271(null, 5180);
        this.field1962.method2244(0, -119);
        this.field1962.method2263((byte) 111);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 568)
    public static void method1089(int arg0) {
        field1950 = null;
        if (arg0 <= 57) {
            field1935 = null;
        }
        field1935 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 583)
    public static final String method1090(boolean arg0, long arg1) {
        field1946++;
        class275.field4418.setTime(new Date(arg1));
        int var3 = class275.field4418.get(7);
        int var4 = class275.field4418.get(5);
        int var5 = class275.field4418.get(2);
        int var6 = class275.field4418.get(1);
        if (arg0) {
            method1090(true, -16L);
        }
        int var7 = class275.field4418.get(11);
        int var8 = class275.field4418.get(12);
        int var9 = class275.field4418.get(13);
        return class429.field6544[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class694.field9730[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
