import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class422 extends class413 {

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "[I")
    public static int[] field5926;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class626 var7 = new class626();
        var7.field9114 = arg1 >> class272.field3786;
        var7.field9122 = arg2 >> class272.field3786;
        var7.field9124 = arg3 >> class272.field3786;
        var7.field9115 = arg4 >> class272.field3786;
        var7.field9137 = arg0;
        var7.field9128 = arg1;
        var7.field9117 = arg2;
        var7.field9112 = arg3;
        var7.field9129 = arg4;
        var7.field9136 = arg5;
        var7.field9125 = arg6;
        class120.field1964[class134.field2127++] = var7;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static void method2519(int arg0) {
        field5926 = null;
        if (arg0 != -20475) {
            method2519(65);
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
    public static final void method2520(int arg0) {
        field5927++;
        if (arg0 == -21760) {
            class556.field7665.method3246(false);
        }
    }
}
