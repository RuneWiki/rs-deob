import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class class134 extends class1 {

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1964 = null;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "Lsb;")
    public static class230 field1959;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)Z")
    public abstract boolean method820(int arg0);

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method821(int arg0);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method822(String arg0, byte arg1) {
        String var2 = class98.method632(0, class94.method604((byte) 57, arg0));
        field1961++;
        if (arg1 > -34) {
            method824(9, -70);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)V")
    public static final void method823(byte arg0) {
        field1958++;
        if (arg0 != 71) {
            field1964 = null;
        }
        if (class184.field2794 == 30) {
            class203.method1292(25, false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public static final void method824(int arg0, int arg1) {
        class177.field2709.method1780(arg1, true);
        if (arg0 != 2108008097) {
            field1956 = 64;
        }
        field1960++;
        class80.field1289.method1780(arg1, true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
    public static final void method825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1962++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = var8 << 1;
        int var10 = arg0 * arg0;
        int var11 = arg0 << 1;
        int var12 = var10 - ((var11 - 1) * var9);
        int var13 = var10 << 1;
        int var14 = var8 << 2;
        int var15 = (1 - var11) * var8 + var13;
        int var16 = var10 << 2;
        if (arg2 > -95) {
            field1964 = null;
        }
        int var17 = (var6 + 1) * var16;
        if (arg5 >= class243.field3635 && class118.field1782 >= arg5) {
            int var18 = class86.method565(class248.field3765, arg1 + arg3, class163.field2505, 8142);
            int var19 = class86.method565(class248.field3765, arg1 - arg3, class163.field2505, 8142);
            class64.method429(class23.field284[arg5], var19, (byte) 109, arg4, var18);
        }
        int var20 = ((arg0 << 1) - 3) * var9;
        int var21 = ((var6 << 1) + 3) * var13;
        int var22 = (arg0 - 1) * var14;
        while (var7 > 0) {
            var7--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var12 += var17;
                    var17 += var16;
                    var15 += var21;
                    var21 += var16;
                    var6++;
                }
            }
            if (var12 < 0) {
                var6++;
                var15 += var21;
                var12 += var17;
                var17 += var16;
                var21 += var16;
            }
            int var23 = arg5 - var7;
            var15 += -var22;
            var12 += -var20;
            int var24 = arg5 + var7;
            var22 -= var14;
            var20 -= var14;
            if (var24 >= class243.field3635 && class118.field1782 >= var23) {
                int var25 = class86.method565(class248.field3765, arg1 + var6, class163.field2505, 8142);
                int var26 = class86.method565(class248.field3765, arg1 - var6, class163.field2505, 8142);
                if (class243.field3635 <= var23) {
                    class64.method429(class23.field284[var23], var26, (byte) 126, arg4, var25);
                }
                if (var24 <= class118.field1782) {
                    class64.method429(class23.field284[var24], var26, (byte) 94, arg4, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
    public static void method826(int arg0) {
        field1964 = null;
        if (arg0 != 0) {
            field1964 = null;
        }
        field1959 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IC)Z")
    public static final boolean method827(int arg0, char arg1) {
        field1963++;
        if (arg0 != -1) {
            field1964 = null;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
