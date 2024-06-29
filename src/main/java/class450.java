import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class450 extends class55 {

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "S")
    public short field6288;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lkt;")
    public static class159 field6286 = new class159(3);

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Llga;")
    public static class712 field6292 = new class712(12, 0);

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lgga;")
    public static class294 field6295;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Lni;")
    public static class522 field6298;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lfl;")
    public static class739 field6290;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILji;)Ldk;")
    public static final class511 method2518(int arg0, class611 arg1) {
        field6291++;
        int var2 = arg1.method3428((byte) -105);
        class676 var3 = class216.method1203(arg0 + 123)[arg1.method3428((byte) 79)];
        class82 var4 = class449.method2516(256)[arg1.method3428((byte) -127)];
        int var5 = arg1.method3413(false);
        int var6 = arg1.method3413(false);
        int var7 = arg1.method3402((byte) 127);
        int var8 = arg1.method3402((byte) 127);
        int var9 = arg1.method3418(-2);
        int var10 = arg1.method3418(-2);
        int var11 = arg1.method3418(-2);
        boolean var12 = ~arg1.method3428((byte) 96) == arg0;
        return new class511(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class450() {
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method2519(int arg0) {
        class165.field2066 = null;
        field6287++;
        if (arg0 != 3796) {
            field6286 = null;
        }
        class3.field31 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2520(int arg0, long arg1) {
        class135.field1716.setTime(new Date(arg1));
        field6289++;
        int var3 = class135.field1716.get(7);
        if (arg0 != 5090) {
            method2522(null, -92, null, 85, 126, null);
        }
        int var4 = class135.field1716.get(5);
        int var5 = class135.field1716.get(2);
        int var6 = class135.field1716.get(1);
        int var7 = class135.field1716.get(11);
        int var8 = class135.field1716.get(12);
        int var9 = class135.field1716.get(13);
        return class170.field2118[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class19.field130[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method2521(int arg0) {
        field6286 = null;
        field6295 = null;
        field6290 = null;
        if (arg0 != -1) {
            field6286 = null;
        }
        field6292 = null;
        field6298 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(S)V")
    public class450(short arg0) {
        this.field6288 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lbq;ILuca;IILha;)Z")
    public static final boolean method2522(class292 arg0, int arg1, class513 arg2, int arg3, int arg4, class60 arg5) {
        field6293++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field3903 != null) {
            var6 = (arg0.field3878 + arg2.field6945 - class642.field8963) * (class642.field8965 - class642.field8958) / (class642.field8946 - class642.field8963) + class642.field8958;
            var9 = class642.field8966 - ((class642.field8966 - class642.field8949) * (arg2.field6939 + arg0.field3883 - class642.field8962) / (class642.field8955 - class642.field8962));
            var7 = (arg0.field3881 + arg2.field6945 - class642.field8963) * (class642.field8965 - class642.field8958) / (class642.field8946 - class642.field8963) + class642.field8958;
            var8 = class642.field8966 - ((class642.field8966 - class642.field8949) * (arg2.field6939 + arg0.field3900 - class642.field8962) / (class642.field8955 - class642.field8962));
        }
        class680 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field3879 != -1) {
            if (arg2.field6949 && arg0.field3858 != -1) {
                var10 = arg0.method1739((byte) 92, arg5, true);
            } else {
                var10 = arg0.method1739((byte) 92, arg5, false);
            }
            if (var10 != null) {
                var11 = arg2.field6938 - (var10.method666() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg2.field6938 + (var10.method666() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg2.field6943 - (var10.method663() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg2.field6943 + (var10.method663() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class119 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        if (arg4 != 15924) {
            method2518(-104, null);
        }
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg0.field3901 != null) {
            var15 = class125.method806(arg0.field3902, 5466);
            if (var15 != null) {
                var16 = class86.field1180.method2217(arg0.field3901, class614.field8609, null, null, -1);
                var17 = (class642.field8965 - class642.field8958) * arg0.field3868 / (class642.field8946 - class642.field8963) + arg2.field6938;
                int var24 = arg2.field6943 - ((class642.field8966 - class642.field8949) * arg0.field3887 / (class642.field8955 - class642.field8962));
                if (var10 == null) {
                    var18 = var24 - var15.method777() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method663() >> 1) + var15.method778() * var16);
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class614.field8609[var25];
                    if (var25 < (var16 - 1)) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method774(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = arg3 + var17 - (var19 / 2);
                if (var20 < var6) {
                    var6 = var20;
                }
                var21 = var19 / 2 + var17 + arg3;
                var22 = arg1 + var18;
                if (var7 < var21) {
                    var7 = var21;
                }
                var23 = arg1 + var16 * var15.method778() + var18;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class642.field8958 > var7 || var6 > class642.field8965 || class642.field8949 > var9 || var8 > class642.field8966) {
            return true;
        }
        class642.method3628(arg5, arg2, arg0);
        if (var10 != null) {
            if (class41.field420 > 0 && (class572.field8051 != -1 && class572.field8051 == arg2.field6940 || class251.field3238 != -1 && class251.field3238 == arg0.field3880)) {
                int var28;
                if (class354.field4718 <= 50) {
                    var28 = class354.field4718 * 2;
                } else {
                    var28 = 200 - (class354.field4718 * 2);
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg5.method364(var10.method674() / 2 + 7, arg2.field6943, var29, 85, arg2.field6938);
                arg5.method364(var10.method674() / 2 + 5, arg2.field6943, var29, 117, arg2.field6938);
                arg5.method364(var10.method674() / 2 + 3, arg2.field6943, var29, 92, arg2.field6938);
                arg5.method364(var10.method674() / 2 + 1, arg2.field6943, var29, 37, arg2.field6938);
                arg5.method364(var10.method674() / 2, arg2.field6943, var29, 95, arg2.field6938);
            }
            var10.method3859(arg2.field6938 - (var10.method666() >> 1), arg2.field6943 - (var10.method663() >> 1));
        }
        if (arg0.field3901 != null && var15 != null) {
            class89.method639((byte) 12, arg2, var19, arg5, var15, var18, arg0, var16, var17);
        }
        if (arg0.field3879 != -1 || arg0.field3901 != null) {
            class617 var30 = new class617(arg2);
            var30.field8652 = var14;
            var30.field8658 = var22;
            var30.field8651 = var13;
            var30.field8657 = var23;
            var30.field8656 = var20;
            var30.field8654 = var21;
            var30.field8647 = var11;
            var30.field8659 = var12;
            class600.field8354.method725(var30, arg4 ^ 0xFFFF9065);
        }
        return false;
    }
}
