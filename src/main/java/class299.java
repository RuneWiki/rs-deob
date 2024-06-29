import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class299 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4914 = "red:";

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field4912 = -1;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Z")
    public static boolean field4915 = false;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method2071(byte arg0) {
        field4914 = null;
        int var1 = -2 % ((arg0 + 33) / 33);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method2072(int arg0) {
        field4911++;
        class18.field254.method145(-91);
        if (arg0 != 0) {
            field4912 = -120;
        }
        class284.field4745.method145(arg0 - 86);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)V")
    public static final void method2073(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class145 var5 = (class145) class226.field3589.method1959(205); var5 != null; var5 = (class145) class226.field3589.method1956(83)) {
            class42.method267(arg4, var5, arg1, arg2, 8809, arg3);
        }
        field4913++;
        int var6 = 92 / ((arg0 - 89) / 35);
        for (class145 var7 = (class145) class66.field976.method1959(205); var7 != null; var7 = (class145) class66.field976.method1956(96)) {
            byte var12 = 1;
            class261 var13 = var7.field2281.method361(-1);
            if (var7.field2281.field857 == var13.field4282) {
                var12 = 0;
            } else if (var7.field2281.field857 == var13.field4299 || var7.field2281.field857 == var13.field4278 || var7.field2281.field857 == var13.field4302 || var7.field2281.field857 == var13.field4305) {
                var12 = 2;
            } else if (var7.field2281.field857 == var13.field4308 || var7.field2281.field857 == var13.field4281 || var7.field2281.field857 == var13.field4272 || var7.field2281.field857 == var13.field4275) {
                var12 = 3;
            }
            if (var7.field2293 != var12) {
                int var14 = class79.method527(var7.field2281, (byte) -103);
                if (var7.field2279 != var14) {
                    if (var7.field2290 != null) {
                        class71.field1024.method597(var7.field2290);
                        var7.field2290 = null;
                    }
                    var7.field2279 = var14;
                }
                var7.field2293 = var12;
            }
            var7.field2285 = var7.field2281.field836;
            var7.field2268 = var7.field2281.field836 + (var7.field2281.method362(25892) * 64);
            var7.field2277 = var7.field2281.field850;
            var7.field2288 = var7.field2281.field850 + var7.field2281.method362(25892) * 64;
            class42.method267(arg4, var7, arg1, arg2, 8809, arg3);
        }
        for (class145 var8 = (class145) class89.field1371.method871(-36); var8 != null; var8 = (class145) class89.field1371.method869(-14210)) {
            class261 var9 = var8.field2274.method361(-1);
            byte var10 = 1;
            if (var8.field2274.field857 == var9.field4282) {
                var10 = 0;
            } else if (var8.field2274.field857 == var9.field4299 || var8.field2274.field857 == var9.field4278 || var8.field2274.field857 == var9.field4302 || var8.field2274.field857 == var9.field4305) {
                var10 = 2;
            } else if (var8.field2274.field857 == var9.field4308 || var8.field2274.field857 == var9.field4281 || var8.field2274.field857 == var9.field4272 || var8.field2274.field857 == var9.field4275) {
                var10 = 3;
            }
            if (var8.field2293 != var10) {
                int var11 = class74.method484(var8.field2274, -11443);
                if (var8.field2279 != var11) {
                    if (var8.field2290 != null) {
                        class71.field1024.method597(var8.field2290);
                        var8.field2290 = null;
                    }
                    var8.field2279 = var11;
                }
                var8.field2293 = var10;
            }
            var8.field2285 = var8.field2274.field836;
            var8.field2268 = var8.field2274.field836 + (var8.field2274.method362(25892) * 64);
            var8.field2277 = var8.field2274.field850;
            var8.field2288 = var8.field2274.field850 + (var8.field2274.method362(25892) * 64);
            class42.method267(arg4, var8, arg1, arg2, 8809, arg3);
        }
    }
}
