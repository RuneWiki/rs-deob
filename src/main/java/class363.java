import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class363 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[C")
    private static char[] field4684 = new char[64];

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Z")
    public static boolean field4685;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    public final void method2097(int arg0, int arg1) {
        if (arg1 < -41) {
            OpenGL.glNewList(this.field4681 + arg0, 4864);
            field4682++;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static void method2098(boolean arg0) {
        if (arg0) {
            field4684 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(CI)V")
    public final void method2099(char arg0, int arg1) {
        field4683++;
        OpenGL.glCallList(this.field4681 + arg0);
        if (arg1 >= -104) {
            this.method2100(43);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lbi;I)V")
    public class363(class483 arg0, int arg1) {
        this.field4681 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public final void method2100(int arg0) {
        field4680++;
        OpenGL.glEndList();
        int var2 = 89 % ((arg0 + 17) / 35);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4684[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4684[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4684[var2] = (char) (var2 + 48 - 52);
        }
        field4684[63] = '/';
        field4684[62] = '+';
        field4685 = false;
    }
}
