import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class102 {

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1254 = 0;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
    public static int[] field1256 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "[I")
    public static int[] field1255;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIBIIII)V", line = 11)
    public static final void method612(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1257++;
        int var7 = class536.method3056(class271.field3513, 118, arg6, class563.field8282);
        int var8 = class536.method3056(class271.field3513, 120, arg3, class563.field8282);
        int var9 = class536.method3056(class592.field8588, 125, arg0, class470.field6589);
        int var10 = class536.method3056(class592.field8588, 116, arg1, class470.field6589);
        int var11 = class536.method3056(class271.field3513, 127, arg4 + arg6, class563.field8282);
        int var12 = class536.method3056(class271.field3513, 115, arg3 - arg4, class563.field8282);
        for (int var13 = var7; var13 < var11; var13++) {
            class62.method363(var10, -127, arg5, class328.field4287[var13], var9);
        }
        int var14 = -84 / ((arg2 - 65) / 54);
        for (int var15 = var8; var15 > var12; var15--) {
            class62.method363(var10, -128, arg5, class328.field4287[var15], var9);
        }
        int var16 = class536.method3056(class592.field8588, 119, arg0 + arg4, class470.field6589);
        int var17 = class536.method3056(class592.field8588, 125, arg1 - arg4, class470.field6589);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class328.field4287[var18];
            class62.method363(var16, -128, arg5, var19, var9);
            class62.method363(var10, -127, arg5, var19, var17);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 66)
    public static void method613(byte arg0) {
        field1256 = null;
        int var1 = 92 / ((arg0 - 24) / 42);
        field1255 = null;
    }
}
