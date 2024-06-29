import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class292 {

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Z")
    public static boolean field4598 = true;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method1962(int arg0) {
        field4600++;
        if (arg0 == -6635) {
            OpenGL.glEndList();
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZC)V")
    public final void method1963(boolean arg0, char arg1) {
        OpenGL.glCallList(this.field4603 + arg1);
        field4599++;
        if (!arg0) {
            field4601 = 26;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIIII)Lda;")
    public static final class301 method1964(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4604++;
        if (arg4 != 1) {
            field4606 = -75;
        }
        class301 var5 = new class301();
        var5.field4720 = arg2;
        var5.field4721 = arg1;
        class423.field6414.method1127(var5, (byte) 38, (long) arg3);
        class440.method2790(arg1, (byte) 75);
        class437 var6 = class255.method1747(arg3, false);
        if (var6 != null) {
            class479.method2962(arg4 ^ 0xFFFFFF84, var6);
        }
        if (class322.field5031 != null) {
            class479.method2962(-117, class322.field5031);
            class322.field5031 = null;
        }
        class296.method1990((byte) 99);
        if (var6 != null) {
            class235.method1662(true, !arg0, var6);
        }
        if (!arg0) {
            class420.method2674(arg1);
        }
        if (!arg0 && class509.field7597 != -1) {
            class263.method1808(class509.field7597, arg4 ^ 0x167E, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)V")
    public final void method1965(int arg0, byte arg1) {
        if (arg1 <= -13) {
            OpenGL.glNewList(this.field4603 + arg0, 4864);
            field4602++;
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lna;I)V")
    public class292(class211 arg0, int arg1) {
        this.field4603 = OpenGL.glGenLists(arg1);
    }

    static {
        new class213("Select", "Auswählen", "Sélectionner", "Selecionar");
        field4606 = 0;
        field4605 = -1;
    }
}
