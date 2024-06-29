import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class26 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Ld;")
    private class242 field293 = new class242(128);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lum;")
    private class83 field296;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljp;")
    public static class55 field295;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lpu;")
    public static class179 field297;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[[I")
    public static int[][] field298;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lpu;")
    public static class179 field299;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field294;

    static {
        new class179("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field295 = new class55(72, -2);
        field297 = new class179("glow3:", "leuchten3:", "brillant3:", "brilho3:");
        field298 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
        field299 = new class179("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I", line = 3)
    public static final int method159(int arg0, int arg1) {
        field292++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg1 != -9640) {
            return 43;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Ls;", line = 47)
    public final class163 method160(int arg0, int arg1) {
        field294++;
        class242 var3 = this.field293;
        class163 var4;
        synchronized (this.field293) {
            var4 = (class163) this.field293.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 22732) {
            field299 = null;
        }
        byte[] var5 = this.field296.method731(0, class385.method2453(arg1, (byte) -30), class93.method791(1186545864, arg1));
        class163 var6 = new class163();
        if (var5 != null) {
            var6.method1163(new class194(var5), -1);
        }
        class242 var7 = this.field293;
        synchronized (this.field293) {
            this.field293.method1623((long) arg1, 17621, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 81)
    public static void method161(byte arg0) {
        field299 = null;
        field295 = null;
        field298 = null;
        field297 = null;
        if (arg0 > -64) {
            method161((byte) -17);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 105)
    public class26(class308 arg0, int arg1, class83 arg2) {
        this.field296 = arg2;
        if (this.field296 != null) {
            int var4 = this.field296.method754(false) - 1;
            this.field296.method748(var4, 12408);
        }
    }
}
