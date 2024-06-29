import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class162 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lps;")
    private class63 field2108;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Ljs;")
    public static class221 field2107 = new class221(2);

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lof;")
    public static class446 field2112 = new class446("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2117 = 765;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Luu;")
    public static class191 field2111;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lie;")
    private class5 field2115;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[[[I")
    public static int[][][] field2116;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lie;")
    public final class5 method1041(byte arg0) {
        field2109++;
        class5 var2 = this.field2115;
        if (this.field2108.field906 == var2) {
            this.field2115 = null;
            return null;
        } else if (arg0 > -26) {
            return null;
        } else {
            this.field2115 = var2.field39;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Lie;")
    public final class5 method1042(int arg0) {
        field2113++;
        class5 var2 = this.field2108.field906.field39;
        if (arg0 != 765) {
            this.method1042(-123);
        }
        if (this.field2108.field906 == var2) {
            this.field2115 = null;
            return null;
        } else {
            this.field2115 = var2.field39;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILps;)V")
    public final void method1043(int arg0, class63 arg1) {
        field2110++;
        if (arg0 < -19) {
            this.field2108 = arg1;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method1044(int arg0) {
        int var1 = -35 % ((14 - arg0) / 44);
        field2111 = null;
        field2116 = null;
        field2107 = null;
        field2112 = null;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class162() {
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lps;)V")
    public class162(class63 arg0) {
        this.field2108 = arg0;
    }
}
