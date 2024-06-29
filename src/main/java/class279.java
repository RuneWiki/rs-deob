import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class279 {

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "[I")
    public static int[] field3946 = new int[14];

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "Z")
    public static boolean field3951 = false;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "Ltq;")
    public static class376 field3949;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "Ljj;")
    public static class60 field3952;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "[Lgj;")
    public static class381[] field3953;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[S")
    public static short[] field3947;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lae;Lna;IIIII)V")
    public static final void method1838(class134 arg0, class29 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class167.field2334 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class415.field5953) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class299.field4190 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class193 var15 = class250.field3570[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class161.field2122[var12].method328(var13, var14) + class161.field2122[var12].method328(var13 + 1, var14) + class161.field2122[var12].method328(var13, var14 + 1) + class161.field2122[var12].method328(var13 + 1, var14 + 1)) / 4 - (class161.field2122[arg2].method328(arg3, arg4) + class161.field2122[arg2].method328(arg3 + 1, arg4) + class161.field2122[arg2].method328(arg3, arg4 + 1) + class161.field2122[arg2].method328(arg3 + 1, arg4 + 1)) / 4;
                                    class394 var17 = var15.field2784;
                                    class394 var18 = var15.field2771;
                                    if (var17 != null && var17.method54(true)) {
                                        arg1.method60(var7, (byte) -85, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, var17, (var14 - arg4) * 128 + (1 - arg6) * 64, arg0);
                                    }
                                    if (var18 != null && var18.method54(true)) {
                                        arg1.method60(var7, (byte) 52, var16, (var13 - arg3) * 128 + (1 - arg5) * 64, var18, (var14 - arg4) * 128 + (1 - arg6) * 64, arg0);
                                    }
                                    for (class250 var19 = var15.field2779; var19 != null; var19 = var19.field3568) {
                                        class233 var20 = var19.field3571;
                                        if (var20 != null && var20.method54(true) && (var20.field3268 == var13 || var8 == var13) && (var20.field3267 == var14 || var10 == var14)) {
                                            int var21 = var20.field3275 + 1 - var20.field3268;
                                            int var22 = var20.field3271 + 1 - var20.field3267;
                                            arg1.method60(var7, (byte) -115, var16, (var20.field3268 - arg3) * 128 + (var21 - arg5) * 64, var20, (var20.field3267 - arg4) * 128 + (var22 - arg6) * 64, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static final void method1839(byte arg0) {
        if (class69.field790 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class411.field5899.length; var2++) {
                if (class411.field5899[var2].startsWith("--> ")) {
                    int var10000 = ~class69.field790;
                    var1++;
                    if (var10000 == ~var1) {
                        class377.field5318 = class411.field5899[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class377.field5318 = "";
        }
        field3945++;
        if (arg0 != 89) {
            method1839((byte) -53);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILon;)V")
    public static final void method1840(int arg0, class184 arg1) {
        if (arg1.field2524 == 5 && arg1.field2635 != -1) {
            class154.method930(class151.field1873, arg1, 119);
        }
        field3950++;
        if (arg0 != 2) {
            field3949 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
    public static void method1841(byte arg0) {
        field3947 = null;
        field3946 = null;
        field3953 = null;
        field3949 = null;
        field3952 = null;
        if (arg0 < 63) {
            method1839((byte) 104);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
    public static final void method1842(String arg0, String arg1, int arg2, byte arg3) {
        class451.field6459 = arg2;
        class78.field924 = arg1;
        field3948++;
        class143.field1754 = arg0;
        if (class78.field924.equals("") || class143.field1754.equals("")) {
            class346.field4890 = 3;
        } else if (class397.field5685 == -1) {
            class380.field5351 = 0;
            class105.field1260 = 1;
            class346.field4890 = -3;
            class34.field391 = 0;
            class236 var4 = new class236(128);
            var4.method1583(10, (byte) -73);
            var4.method1603((int) (Math.random() * 9.9999999E7D), 871);
            var4.method1615(class193.method1310(class78.field924, (byte) 123), 120);
            var4.method1603((int) (Math.random() * 9.9999999E7D), 871);
            var4.method1596(class143.field1754, false);
            var4.method1603((int) (Math.random() * 9.9999999E7D), 871);
            var4.method1558(true, class125.field1530, class158.field2063);
            class62.field718.field3320 = 0;
            class62.field718.method1583(24, (byte) -128);
            int var5 = -67 % ((arg3 + 52) / 36);
            class62.field718.method1583(var4.field3320 + 2, (byte) -100);
            class62.field718.method1605(569, false);
            class62.field718.method1571(var4.field3364, 100, var4.field3320, 0);
        } else {
            class414.method2640((byte) -66);
        }
    }
}
