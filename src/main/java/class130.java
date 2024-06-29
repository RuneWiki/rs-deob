import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class130 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
    public static int[] field1829 = new int[3];

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1832 = 20;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method788(int arg0) {
        class196.field2801 = true;
        int var1 = -66 / ((-arg0 - 69) / 50);
        field1830++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class473.field6624[arg0][var8][var14] == -class192.field2752) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class259.field3616) + 1;
            int var10 = (arg3 << class259.field3616) + 2;
            int var11 = class317.field4306[arg0].method710(arg1, arg3) + arg5;
            if (!class210.method1323(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class259.field3616) - 1;
            if (!class210.method1323(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class259.field3616) - 1;
            if (!class210.method1323(var9, var11, var13)) {
                return false;
            } else if (class210.method1323(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class155.method942(arg0, arg1, arg3)) {
            int var6 = arg1 << class259.field3616;
            int var7 = arg3 << class259.field3616;
            return class210.method1323(var6 + 1, class317.field4306[arg0].method710(arg1, arg3) + arg5, var7 + 1) && class210.method1323(class372.field5263 + var6 - 1, class317.field4306[arg0].method710(arg1 + 1, arg3) + arg5, var7 + 1) && class210.method1323(class372.field5263 + var6 - 1, class317.field4306[arg0].method710(arg1 + 1, arg3 + 1) + arg5, class372.field5263 + var7 - 1) && class210.method1323(var6 + 1, class317.field4306[arg0].method710(arg1, arg3 + 1) + arg5, class372.field5263 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILlk;B)Ljava/lang/String;")
    public static final String method790(int arg0, class425 arg1, byte arg2) {
        field1828++;
        try {
            int var3 = arg1.method2474((byte) -113);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field5830 += class349.field4779.method2604(var4, 0, (byte) 127, var3, arg1.field5830, arg1.field5886);
            String var5 = class164.method1015(var4, -129, var3, 0);
            int var6 = -25 % ((arg2 - 47) / 39);
            return var5;
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method791(byte arg0) {
        if (arg0 < 109) {
            method788(-79);
        }
        field1829 = null;
    }
}
