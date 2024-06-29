import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class253 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4272 = " has logged out.";

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Z")
    public static boolean field4274 = false;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4270 = -1;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    public static int[] field4275 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[Lui;")
    public static class257[] field4273 = new class257[14];

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4276 = "";

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
    public static boolean field4271 = false;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method1958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4277++;
        int var7 = class315.method2235(class273.field4522, arg0, class296.field4758, 124);
        int var8 = class315.method2235(class273.field4522, arg5, class296.field4758, 115);
        int var9 = class315.method2235(class355.field5640, arg2, class74.field1269, 119);
        int var10 = class315.method2235(class355.field5640, arg4, class74.field1269, 112);
        int var11 = class315.method2235(class273.field4522, arg0 + arg3, class296.field4758, 124);
        int var12 = class315.method2235(class273.field4522, arg5 - arg3, class296.field4758, 111);
        for (int var13 = var7; var13 < var11; var13++) {
            class161.method1253(var10, class353.field5599[var13], -1, arg6, var9);
        }
        int var14 = -36 / ((arg1 - 34) / 53);
        for (int var15 = var8; var15 > var12; var15--) {
            class161.method1253(var10, class353.field5599[var15], -1, arg6, var9);
        }
        int var16 = class315.method2235(class355.field5640, arg2 + arg3, class74.field1269, 111);
        int var17 = class315.method2235(class355.field5640, arg4 - arg3, class74.field1269, 112);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class353.field5599[var18];
            class161.method1253(var16, var19, -1, arg6, var9);
            class161.method1253(var10, var19, -1, arg6, var17);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V", line = 61)
    public static void method1959(boolean arg0) {
        field4276 = null;
        if (arg0) {
            method1958(-116, -19, -102, -116, -38, -18, 16);
        }
        field4272 = null;
        field4273 = null;
        field4275 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B)Ldf;", line = 101)
    public static final class171 method1960(int arg0, byte[] arg1) {
        field4278++;
        if (arg1 == null) {
            return null;
        }
        class171 var2;
        if (class42.field607) {
            var2 = new class97(arg1, class189.field3035, class19.field211, class221.field3595, class322.field5132, class163.field2578);
        } else {
            var2 = new class290(arg1, class189.field3035, class19.field211, class221.field3595, class322.field5132, class163.field2578);
        }
        class211.method1592((byte) 41);
        if (arg0 != 14) {
            field4273 = (class257[]) null;
        }
        return var2;
    }
}
