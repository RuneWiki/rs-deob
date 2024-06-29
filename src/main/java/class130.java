import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class130 {

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public int field2235 = -1;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "Llo;")
    public static class306 field2229 = new class306("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "Z")
    public static boolean field2231 = false;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "[[B")
    public static byte[][] field2236 = new byte[50][];

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "Lgn;")
    public class405 field2227;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Ltl;")
    public static class91 field2232;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "[I")
    public int[] field2237;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field2230;

    static {
        new class306("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V", line = 21)
    public static void method996(byte arg0) {
        if (arg0 != -70) {
            method996((byte) -45);
        }
        field2236 = null;
        field2229 = null;
        field2232 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 41)
    public static final void method997(int arg0) {
        field2233++;
        class231 var1 = class322.field5060;
        synchronized (class322.field5060) {
            class322.field5060.method1598(126);
        }
        class231 var2 = class241.field4158;
        synchronized (class241.field4158) {
            class241.field4158.method1598(89);
        }
        if (arg0 > -25) {
            field2231 = false;
        }
    }
}
