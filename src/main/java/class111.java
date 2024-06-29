import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class111 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lmc;")
    public static class78 field1685 = new class78(2, 8);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
    public static boolean field1688 = false;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lh;")
    public static class434 field1687 = new class434(3, 3);

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[B")
    public static byte[] field1689 = new byte[2048];

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lgd;")
    public static class206 field1690 = new class206("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 12)
    public static void method716(boolean arg0) {
        if (!arg0) {
            field1689 = null;
            field1690 = null;
            field1687 = null;
            field1685 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BIB)I", line = 25)
    public static final int method717(byte[] arg0, int arg1, byte arg2) {
        field1686++;
        if (arg2 != -50) {
            method717((byte[]) null, -70, (byte) 108);
        }
        return class322.method1785(arg1, 0, -806, arg0);
    }
}
