import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class288 {

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "[I")
    public static int[] field4288 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lpg;")
    public static class492 field4289 = new class492(3, -2);

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "F")
    public static float field4296 = 0.25F;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)V")
    public final void method1864(byte arg0, int arg1) {
        if (arg0 <= 67) {
            field4289 = null;
        }
        field4287++;
        OpenGL.glNewList(this.field4291 + arg1, 4864);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public final void method1865(int arg0) {
        int var2 = 8 / ((arg0 - 68) / 58);
        field4295++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IC)V")
    public final void method1866(int arg0, char arg1) {
        OpenGL.glCallList(this.field4291 + arg1);
        if (arg0 != 13) {
            this.method1866(81, (char) 65510);
        }
        field4290++;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public static void method1867(int arg0) {
        if (arg0 != 12) {
            field4289 = null;
        }
        field4288 = null;
        field4289 = null;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lbv;I)V")
    public class288(class282 arg0, int arg1) {
        this.field4291 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILlf;)V")
    public static final void method1868(int arg0, int arg1, int arg2, class383 arg3) {
        class420 var4 = class422.method2542(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6260 = arg3;
        }
    }

    static {
        new class375("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
