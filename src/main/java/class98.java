import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class98 {

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Lbg;")
    public static class324 field1314 = new class324(99, 7);

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field1317 = -1;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lgk;")
    public static class331 field1316 = new class331("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(CI)V")
    public final void method832(char arg0, int arg1) {
        OpenGL.glCallList(this.field1318 + arg0);
        field1319++;
        if (arg1 != -1) {
            method835(34);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZ)V")
    public final void method833(int arg0, boolean arg1) {
        field1313++;
        if (!arg1) {
            field1317 = -39;
        }
        OpenGL.glNewList(this.field1318 + arg0, 4864);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
    public final void method834(byte arg0) {
        OpenGL.glEndList();
        if (arg0 == 39) {
            field1315++;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method835(int arg0) {
        if (arg0 != 4864) {
            field1314 = null;
        }
        field1314 = null;
        field1316 = null;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lfd;I)V")
    public class98(class365 arg0, int arg1) {
        this.field1318 = OpenGL.glGenLists(arg1);
    }
}
