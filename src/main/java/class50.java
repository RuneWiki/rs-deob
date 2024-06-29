import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class50 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
    public static int[] field922 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Ldj;")
    public static class44 field924 = class89.method650(255, "::tele 0)1");

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Ldj;")
    public static class44 field923 = class89.method650(255, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lve;")
    public static class225 field920;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[Lle;")
    public static class125[] field925;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)I")
    public static final int method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        field921++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg5;
        } else {
            if (arg6 <= 106) {
                method365(64);
            }
            return var8 == 2 ? 7 + 1 - arg4 - arg2 : -arg3 - -1 + -arg5 + 7;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method365(int arg0) {
        int var1 = 58 / ((-arg0 - 33) / 55);
        field920 = null;
        field922 = null;
        field923 = null;
        field925 = null;
        field924 = null;
    }
}
