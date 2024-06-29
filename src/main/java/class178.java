import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class178 {

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    private int field2685;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Lhn;")
    public static class509 field2684 = new class509(29, 8);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Lul;")
    public static class406 field2688;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(CB)V")
    public final void method1191(char arg0, byte arg1) {
        field2690++;
        int var3 = -61 / ((43 - arg1) / 48);
        OpenGL.glCallList(this.field2685 + arg0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
    public final void method1192(int arg0, byte arg1) {
        OpenGL.glNewList(this.field2685 + arg0, 4864);
        int var3 = -79 / ((arg1 - 35) / 36);
        field2691++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
    public static final void method1193(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        if (var3 != null && var3.field2105 != null) {
            var3.field2105 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(CI)C")
    public static final char method1194(char arg0, int arg1) {
        field2689++;
        int var2 = 108 / ((arg1 + 49) / 63);
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(III)V")
    public static final void method1195(int arg0, int arg1, int arg2) {
        field2686++;
        class211 var3 = class452.method2749(7, 127, arg0);
        var3.method1463(arg1 + 27263);
        if (arg1 != -27263) {
            field2688 = null;
        }
        var3.field3441 = arg2;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public final void method1196(int arg0) {
        field2682++;
        OpenGL.glEndList();
        if (arg0 <= 109) {
            method1195(-38, -89, 33);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public static void method1197(boolean arg0) {
        if (!arg0) {
            method1197(true);
        }
        field2688 = null;
        field2684 = null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lkd;I)V")
    public class178(class188 arg0, int arg1) {
        this.field2685 = OpenGL.glGenLists(arg1);
    }
}
