import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class144 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2333 = new BigInteger("99f3676f97fb8bbdf273a5262b7170c53b2e682c2236e4e4cbafa8a332006566243ec843eb13c7d874b044a65ccf5b6f801f4bc526f09a1db20e3c07c02d5b77", 16);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lgga;")
    public static class513 field2338;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 4)
    public static void method1151(int arg0) {
        field2338 = null;
        if (arg0 < 24) {
            method1152(null, null, (byte) 44, null, -75, 39);
        }
        field2333 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lha;Lll;BLjg;II)Z", line = 15)
    public static final boolean method1152(class475 arg0, class548 arg1, byte arg2, class770 arg3, int arg4, int arg5) {
        field2336++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field7592 != null) {
            var8 = class751.field10453 - ((arg1.field7618 + arg3.field10626 - class751.field10442) * (class751.field10453 - class751.field10451) / (class751.field10437 - class751.field10442));
            var6 = (arg1.field7591 + arg3.field10629 - class751.field10449) * (class751.field10439 - class751.field10447) / (class751.field10434 - class751.field10449) + class751.field10447;
            var9 = class751.field10453 - ((arg1.field7596 + arg3.field10626 - class751.field10442) * (class751.field10453 - class751.field10451) / (class751.field10437 - class751.field10442));
            var7 = (class751.field10439 - class751.field10447) * (arg1.field7627 + arg3.field10629 - class751.field10449) / (class751.field10434 - class751.field10449) + class751.field10447;
        }
        class85 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field7590 != -1) {
            if (arg3.field10635 && arg1.field7609 != -1) {
                var10 = arg1.method3170(12, true, arg0);
            } else {
                var10 = arg1.method3170(12, false, arg0);
            }
            if (var10 != null) {
                var11 = arg3.field10637 - (var10.method11() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg3.field10637 + (var10.method11() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg3.field10628 - (var10.method14() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg3.field10628 + (var10.method14() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class49 var15 = null;
        if (arg2 > -23) {
            field2338 = null;
        }
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg1.field7582 != null) {
            var15 = class562.method3271(arg1.field7610, 1);
            if (var15 != null) {
                var16 = class606.field8600.method2753(class363.field5167, null, arg1.field7582, null, (byte) 34);
                var17 = (class751.field10439 - class751.field10447) * arg1.field7623 / (class751.field10434 - class751.field10449) + arg3.field10637;
                int var24 = arg3.field10628 - ((class751.field10453 - class751.field10451) * arg1.field7601 / (class751.field10437 - class751.field10442));
                if (var10 == null) {
                    var18 = var24 - var15.method386() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method14() >> 1) + (var15.method381() * var16));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class363.field5167[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method387(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg4 - var19 / 2;
                var21 = var19 / 2 + arg4 + var17;
                if (var6 > var20) {
                    var6 = var20;
                }
                if (var21 > var7) {
                    var7 = var21;
                }
                var22 = arg5 + var18;
                if (var22 < var8) {
                    var8 = var22;
                }
                var23 = var15.method381() * var16 + var18 + arg5;
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (class751.field10447 > var7 || class751.field10439 < var6 || class751.field10451 > var9 || class751.field10453 < var8) {
            return true;
        }
        class751.method4136(arg0, arg3, arg1);
        if (var10 != null) {
            if (class33.field410 > 0 && (class752.field10460 != -1 && class752.field10460 == arg3.field10634 || class727.field10134 != -1 && class727.field10134 == arg1.field7580)) {
                int var28;
                if (class482.field6622 > 50) {
                    var28 = 200 - (class482.field6622 * 2);
                } else {
                    var28 = class482.field6622 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg0.method2767(var10.method16() / 2 + 7, arg3.field10628, false, arg3.field10637, var29);
                arg0.method2767(var10.method16() / 2 + 5, arg3.field10628, false, arg3.field10637, var29);
                arg0.method2767(var10.method16() / 2 + 3, arg3.field10628, false, arg3.field10637, var29);
                arg0.method2767(var10.method16() / 2 + 1, arg3.field10628, false, arg3.field10637, var29);
                arg0.method2767(var10.method16() / 2, arg3.field10628, false, arg3.field10637, var29);
            }
            var10.method759(arg3.field10637 - (var10.method11() >> 1), arg3.field10628 - (var10.method14() >> 1));
        }
        if (arg1.field7582 != null && var15 != null) {
            class760.method4195(var19, var15, arg3, var18, arg1, var16, -1, var17, arg0);
        }
        if (arg1.field7590 != -1 || arg1.field7582 != null) {
            class343 var30 = new class343(arg3);
            var30.field4869 = var23;
            var30.field4877 = var13;
            var30.field4868 = var11;
            var30.field4879 = var21;
            var30.field4873 = var20;
            var30.field4872 = var12;
            var30.field4871 = var22;
            var30.field4878 = var14;
            class148.field2381.method3728((byte) 122, var30);
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIII)Lgga;", line = 214)
    public static final class513 method1153(boolean arg0, int arg1, int arg2, int arg3) {
        field2335++;
        class590 var4 = null;
        if (class439.field6100 != null) {
            var4 = new class590(arg1, class439.field6100, class641.field9024[arg1], 1000000);
        }
        class429.field5942[arg1] = class330.field4697.method3503(class164.field2511, arg1, var4, (byte) 102);
        class429.field5942[arg1].method3798(0);
        int var5 = -92 % ((arg3 + 1) / 54);
        return new class513(class429.field5942[arg1], arg0, arg2);
    }
}
