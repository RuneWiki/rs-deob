import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class183 extends class656 {

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    private int field2762;

    @OriginalMember(owner = "client!vda", name = "r", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    private int field2763;

    @OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    private int field2775;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2772 = null;

    @OriginalMember(owner = "client!vda", name = "p", descriptor = "Lhda;")
    public static class752 field2766 = new class752(95, 6);

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "Lhda;")
    public static class752 field2778 = new class752(79, 6);

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!vda", name = "q", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!vda", name = "u", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III[I)V")
    public final void method1261(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = arg1 - (this.field2760 - this.field2763);
        arg3[arg2] = arg0 + this.field2775 - this.field2773;
        field2771++;
        arg3[0] = this.field2759;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "([IIII)V")
    public final void method1262(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[2] = this.field2773 + arg1 - this.field2775;
        field2767++;
        arg0[1] = -this.field2763 - (-this.field2760 - arg2);
        arg0[0] = 0;
        int var5 = 39 / ((arg3 + 75) / 37);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
    public static void method1263(int arg0) {
        if (arg0 == -375892824) {
            field2766 = null;
            field2772 = null;
            field2778 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIBI)Z")
    public final boolean method1264(int arg0, int arg1, byte arg2, int arg3) {
        field2774++;
        if (arg2 == -71) {
            return this.field2759 == arg3 && this.field2763 <= arg1 && this.field2769 >= arg1 && arg0 >= this.field2775 && arg0 <= this.field2762;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z")
    public final boolean method1265(int arg0, int arg1, int arg2) {
        if (arg1 > -76) {
            return false;
        } else {
            field2770++;
            return arg2 >= this.field2763 && arg2 <= this.field2769 && this.field2775 <= arg0 && arg0 <= this.field2762;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(III)Z")
    public final boolean method1266(int arg0, int arg1, int arg2) {
        field2776++;
        if (arg0 == -31819) {
            return this.field2760 <= arg1 && arg1 <= this.field2764 && arg2 >= this.field2773 && arg2 <= this.field2768;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZZ)I")
    public static final int method1267(boolean arg0, boolean arg1) {
        field2765++;
        if (arg1) {
            field2772 = null;
        }
        int var2 = class410.field5681;
        if (var2 == 0) {
            return arg0 ? 0 : class55.field664;
        } else if (var2 == 1) {
            return class55.field664;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIB)V")
    public static final void method1268(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2777++;
        for (class461 var5 = (class461) class496.field6692.method21(2); var5 != null; var5 = (class461) class496.field6692.method9(-127)) {
            class763.method4242(var5, arg3, arg2, -1, arg0, arg1);
        }
        if (arg4 > -21) {
            method1263(76);
        }
        for (class461 var6 = (class461) class681.field9519.method21(2); var6 != null; var6 = (class461) class681.field9519.method9(-128)) {
            byte var12 = 1;
            class98 var13 = var6.field6304.method4141(0);
            if (var6.field6304.field10247 == -1 || var6.field6304.field10304) {
                var12 = 0;
            } else if (var6.field6304.field10247 == var13.field1209 || var6.field6304.field10247 == var13.field1212 || var6.field6304.field10247 == var13.field1241 || var6.field6304.field10247 == var13.field1225) {
                var12 = 2;
            } else if (var6.field6304.field10247 == var13.field1223 || var6.field6304.field10247 == var13.field1263 || var6.field6304.field10247 == var13.field1257 || var6.field6304.field10247 == var13.field1211) {
                var12 = 3;
            }
            if (var6.field6312 != var12) {
                int var14 = class483.method2731(var6.field6304, (byte) 99);
                class166 var15 = var6.field6304.field7328;
                if (var15.field2575 != null) {
                    var15 = var15.method1190((byte) 46, class74.field901);
                }
                if (var15 == null || var14 == -1) {
                    var6.field6312 = var12;
                    var6.field6326 = false;
                    var6.field6307 = -1;
                } else if (var6.field6307 == var14 && var6.field6326 == var15.field2534) {
                    var6.field6312 = var12;
                    var6.field6325 = var15.field2514;
                } else {
                    boolean var16 = false;
                    if (var6.field6305 == null) {
                        var16 = true;
                    } else {
                        var6.field6325 -= 512;
                        if (var6.field6325 <= 0) {
                            class603.field7927.method1612(var6.field6305);
                            var6.field6305 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field6327 = null;
                        var6.field6325 = var15.field2514;
                        var6.field6312 = var12;
                        var6.field6328 = null;
                        var6.field6326 = var15.field2534;
                        var6.field6307 = var14;
                    }
                }
            }
            var6.field6311 = var6.field6304.field3505;
            var6.field6320 = var6.field6304.field3505 + (var6.field6304.method2256(-1) << 8);
            var6.field6306 = var6.field6304.field3502;
            var6.field6319 = var6.field6304.field3502 + (var6.field6304.method2256(-1) << 8);
            class763.method4242(var6, arg3, arg2, -1, arg0, arg1);
        }
        for (class461 var7 = (class461) class592.field7700.method2144(true); var7 != null; var7 = (class461) class592.field7700.method2146(false)) {
            byte var8 = 1;
            class98 var9 = var7.field6308.method4141(0);
            if (var7.field6308.field10247 == -1 || var7.field6308.field10304) {
                var8 = 0;
            } else if (var7.field6308.field10247 == var9.field1209 || var7.field6308.field10247 == var9.field1212 || var7.field6308.field10247 == var9.field1241 || var7.field6308.field10247 == var9.field1225) {
                var8 = 2;
            } else if (var7.field6308.field10247 == var9.field1223 || var7.field6308.field10247 == var9.field1263 || var7.field6308.field10247 == var9.field1257 || var7.field6308.field10247 == var9.field1211) {
                var8 = 3;
            }
            if (var7.field6312 != var8) {
                int var10 = class416.method2417(var7.field6308, (byte) 126);
                if (var7.field6307 == var10 && var7.field6308.field5354 == var7.field6326) {
                    var7.field6312 = var8;
                    var7.field6325 = var7.field6308.field5350;
                } else {
                    boolean var11 = false;
                    if (var7.field6305 == null) {
                        var11 = true;
                    } else {
                        var7.field6325 -= 512;
                        if (var7.field6325 <= 0) {
                            class603.field7927.method1612(var7.field6305);
                            var7.field6305 = null;
                            var11 = true;
                        }
                    }
                    if (var11) {
                        var7.field6328 = null;
                        var7.field6327 = null;
                        var7.field6325 = var7.field6308.field5350;
                        var7.field6312 = var8;
                        var7.field6326 = var7.field6308.field5354;
                        var7.field6307 = var10;
                    }
                }
            }
            var7.field6311 = var7.field6308.field3505;
            var7.field6320 = var7.field6308.field3505 + (var7.field6308.method2256(-1) << 8);
            var7.field6306 = var7.field6308.field3502;
            var7.field6319 = var7.field6308.field3502 + (var7.field6308.method2256(-1) << 8);
            class763.method4242(var7, arg3, arg2, -1, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2762 = arg4;
        this.field2768 = arg8;
        this.field2764 = arg7;
        this.field2763 = arg1;
        this.field2769 = arg3;
        this.field2775 = arg2;
        this.field2760 = arg5;
        this.field2759 = arg0;
        this.field2773 = arg6;
    }
}
