import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class485 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lpi;")
    public static class342 field7206;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
    public static boolean field7207;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
    public static final void method2883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class70.field1213 = arg1;
        if (arg2 <= -27) {
            class156.field2455 = arg4;
            field7208++;
            class389.field5859 = arg3;
            class315.field4754 = arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public abstract void method884(int arg0);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method2884(int arg0) {
        field7206 = null;
        if (arg0 != 2314) {
            field7206 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
    public abstract int method885(int arg0, int arg1);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)J")
    public abstract long method883(int arg0);

    static {
        new class342("Use", "Benutzen", "Utiliser", "Usar");
        field7206 = new class342("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");
        field7207 = false;
    }
}
