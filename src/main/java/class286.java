import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class286 extends class339 {

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lug;")
    public static class396 field3760 = new class396(new byte[5000]);

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field3763 = Boolean.FALSE;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
    public static void method1715(byte arg0) {
        field3763 = null;
        int var1 = 112 / ((1 - arg0) / 39);
        field3760 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZI)I")
    public static final int method1716(int arg0, int arg1, boolean arg2, int arg3) {
        field3759++;
        if (!arg2) {
            return 11;
        }
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        int var6 = arg1 / arg3;
        int var7 = arg3 - 1 & arg1;
        int var8 = class354.method2071((byte) 125, var4, var6);
        int var9 = class354.method2071((byte) 93, var4 + 1, var6);
        int var10 = class354.method2071((byte) -115, var4, var6 + 1);
        int var11 = class354.method2071((byte) 83, var4 + 1, var6 - -1);
        int var12 = class412.method2520(var9, arg3, var8, var5, 103);
        int var13 = class412.method2520(var11, arg3, var10, var5, 124);
        return class412.method2520(var13, arg3, var12, var7, 122);
    }
}
