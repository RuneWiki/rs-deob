import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class294 extends class499 {

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[B")
    public byte[] field3919;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "[Z")
    public static boolean[] field3921 = new boolean[100];

    @OriginalMember(owner = "client!li", name = "n", descriptor = "Lfg;")
    public static class83 field3918 = new class83("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lkj;")
    public static class397 field3920;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    public static void method1681(byte arg0) {
        field3920 = null;
        if (arg0 <= 84) {
            method1681((byte) -77);
        }
        field3921 = null;
        field3918 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
    public class294(byte[] arg0) {
        this.field3919 = arg0;
    }
}
