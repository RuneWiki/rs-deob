import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class74 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Lic;")
    public static class490 field1237 = new class490();

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Lgf;")
    public static class180 field1240 = new class180("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lao;")
    public static class188 field1241 = new class188(52, -2);

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field1243 = -1;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "F")
    public static float field1238;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "[Lf;")
    public static class528[] field1239;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[[[Lkf;")
    public static class165[][][] field1242;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method619(byte arg0) {
        field1237 = null;
        int var1 = 46 / ((-arg0 - 59) / 48);
        field1241 = null;
        field1240 = null;
        field1239 = null;
        field1242 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static final void method620(int arg0) {
        class56.field818 = arg0;
        class162.field2440 = null;
        field1236++;
    }
}
