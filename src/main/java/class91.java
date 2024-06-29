import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class91 extends InputStream {

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field1287 = -1;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Lmw;")
    public static class517 field1283 = new class517(59, -1);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1282++;
        if (class422.method2542(16, arg8)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            if (arg5 == -1) {
                int var14 = 0;
                if (class24.field246) {
                    var13 = class570.field7773;
                    var14 = class28.field274;
                    var11 = class46.field477;
                    var10 = class279.field4041;
                    var12 = class429.field6218;
                    class28.field274 = 1;
                }
                if (class230.field2956[arg8] == null) {
                    class676.method3728(arg6 < 0, arg0, arg2, -127, -1, arg1, class419.field6032[arg8], arg3, arg6, arg4, arg7);
                } else {
                    class676.method3728(arg6 < 0, arg0, arg2, arg5 - 116, -1, arg1, class230.field2956[arg8], arg3, arg6, arg4, arg7);
                }
                if (class24.field246) {
                    if (arg6 >= 0 && class28.field274 == 2) {
                        class199.method1300(class46.field477, class429.field6218, 8963, class279.field4041, class570.field7773);
                    }
                    class46.field477 = var11;
                    class570.field7773 = var13;
                    class279.field4041 = var10;
                    class429.field6218 = var12;
                    class28.field274 = var14;
                }
            }
        } else if (arg6 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class753.field10199[var9] = true;
            }
        } else {
            class753.field10199[arg6] = true;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method719(int arg0, String arg1) {
        field1286++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 >= -14) {
            field1283 = null;
        }
        for (int var2 = 0; var2 < class525.field7289; var2++) {
            if (arg1.equalsIgnoreCase(class316.field4458[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class625.field8475.field10367);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIIBI)V")
    public static final void method720(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1285++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        if (arg4 >= -73) {
            field1287 = -28;
        }
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg3 >= class291.field4156 && class233.field3099 >= arg3) {
            int var20 = class269.method1790(arg0 + arg2, class45.field472, class297.field4199, 13094);
            int var21 = class269.method1790(arg2 - arg0, class45.field472, class297.field4199, 13094);
            class464.method2733(arg1, var21, var20, -22816, class228.field2951[arg3]);
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var24 >= class291.field4156 && var23 <= class233.field3099) {
                int var25 = class269.method1790(arg2 + var6, class45.field472, class297.field4199, 13094);
                int var26 = class269.method1790(arg2 - var6, class45.field472, class297.field4199, 13094);
                if (class291.field4156 <= var23) {
                    class464.method2733(arg1, var26, var25, -22816, class228.field2951[var23]);
                }
                if (var24 <= class233.field3099) {
                    class464.method2733(arg1, var26, var25, -22816, class228.field2951[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "read", descriptor = "()I")
    public final int read() {
        class171.method1152(30000L, false);
        field1284++;
        return -1;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public static void method721(int arg0) {
        if (arg0 == 0) {
            field1283 = null;
        }
    }
}
