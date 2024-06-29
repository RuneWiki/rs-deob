import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class136 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2084 = -1;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lwm;")
    public static class152 field2086 = class157.method1048("Lade Benutzeroberfl-=che )2 ", 119);

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[F")
    public static float[] field2087 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 16)
    public static void method861(byte arg0) {
        int var1 = 88 % ((-arg0 - 34) / 55);
        field2087 = null;
        field2086 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V", line = 35)
    public static final void method862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -1) {
            return;
        }
        field2085++;
        int var6 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg2);
        int var7 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg3);
        int var8 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4);
        int var9 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg5);
        for (int var10 = var6; var10 <= var7; var10++) {
            class275.method1885(arg1, class179.field2843[var10], var8, var9, arg0 - 2610);
        }
    }
}
