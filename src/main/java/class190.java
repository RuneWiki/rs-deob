import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class190 {

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Ldj;")
    public class190 field2735;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lnc;")
    public class18 field2733;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Liq;")
    public static class362 field2739 = new class362("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Z")
    public static boolean field2742 = false;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Liq;")
    public static class362 field2741 = new class362("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Z")
    public static boolean field2744 = true;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[[[B")
    public static byte[][][] field2743;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 7)
    public static void method1291(int arg0) {
        field2741 = null;
        field2743 = null;
        int var1 = 92 % ((arg0 + 55) / 53);
        field2739 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZI)V", line = 18)
    public static final void method1292(int arg0, boolean arg1, int arg2) {
        class306.field4294 = 99;
        class143.field1767 = new byte[arg0][class176.field2403 + 1][class383.field5395 + 1];
        class421.field6018 = new byte[arg0][class176.field2403][class383.field5395];
        if (arg2 > -15) {
            method1291(-105);
        }
        field2743 = new byte[arg0][class176.field2403][class383.field5395];
        class369.field5213 = new byte[arg0][class176.field2403][class383.field5395];
        class435.field6272 = new int[class383.field5395];
        class419.field5994 = new int[arg0][class176.field2403 + 1][class383.field5395 + 1];
        field2737++;
        class164.field2321 = new int[class383.field5395];
        class389.field5496 = new int[class383.field5395];
        if (!arg1) {
            class327.field4639 = null;
        }
        class141.field1747 = new byte[arg0][class176.field2403][class383.field5395];
        class131.field1588 = new int[class383.field5395];
        class257.field3686 = new int[class383.field5395];
        class189.field2723 = new int[5];
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V", line = 52)
    public class190(int arg0, int arg1) {
        this.field2738 = arg1;
        this.field2740 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ldj;I)V", line = 63)
    public class190(class190 arg0, int arg1) {
        this.field2735 = arg0;
        this.field2733 = this.field2735.field2733;
        this.field2740 = this.field2735.field2740;
        this.field2738 = this.field2735.field2738 + arg1;
    }
}
