import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class360 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ltf;")
    public static class264 field5168 = new class264(11, 7);

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ldg;")
    public static class376 field5172 = new class376(17, 2);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lff;")
    public static class9 field5173 = new class9(11, 0, 1, 2);

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ltf;")
    public static class264 field5174 = new class264(13, -1);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZII)Z", line = 4)
    public static final boolean method2197(boolean arg0, int arg1, int arg2) {
        field5171++;
        if (arg0) {
            method2199(-4, -84, -5, -13, -69, -127, -113, 85, 78, -63);
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 17)
    public static void method2198(int arg0) {
        if (arg0 != -25954) {
            field5168 = null;
        }
        field5173 = null;
        field5168 = null;
        field5172 = null;
        field5174 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIII)Z", line = 36)
    public static final boolean method2199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5170++;
        if (!class117.method905(arg7, arg1, 2, arg9)) {
            return false;
        }
        if (arg8 < 92) {
            method2199(-28, 83, -4, 30, -104, -31, 19, 73, -113, 99);
        }
        int var10 = class243.field3781[1];
        int var11 = class243.field3781[2];
        int var12 = class243.field3781[0];
        if (!class117.method905(arg6, arg4, 2, arg0)) {
            return false;
        }
        int var13 = class243.field3781[0];
        int var14 = class243.field3781[2];
        int var15 = class243.field3781[1];
        if (class117.method905(arg2, arg5, 2, arg3)) {
            int var16 = class243.field3781[0];
            int var17 = class243.field3781[2];
            int var18 = class243.field3781[1];
            return class7.method39(var15, var10, var13, var14, true, var11, var17, var18, var12, var16);
        } else {
            return false;
        }
    }
}
