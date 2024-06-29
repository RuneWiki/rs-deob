import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class class31 {

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field368 = -1;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "Lfaa;")
    public static class140 field375;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "Ltg;")
    public static class210 field371;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "[Ld;")
    public static class136[] field369;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Ldi;", line = 5)
    public static final class112 method138(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field374++;
        try {
            return (class112) Class.forName("ft").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)V", line = 40)
    public static void method139(int arg0) {
        field375 = null;
        field371 = null;
        if (arg0 == 13342) {
            field369 = null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IFIIFBFFI[FI)V")
    public abstract void method137(int arg0, float arg1, int arg2, int arg3, float arg4, byte arg5, float arg6, float arg7, int arg8, float[] arg9, int arg10);
}
