import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class239 {

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lhh;")
    private class84 field3481;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Lgf;")
    public static class180 field3480 = new class180("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Llh;")
    public static class364 field3483 = new class364(8);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3482;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method1552(byte arg0) {
        field3483 = null;
        field3480 = null;
        if (arg0 == 79) {
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILti;)V")
    public static final void method1553(int arg0, int arg1, class303 arg2) {
        field3479++;
        if (class319.field4566 != null) {
            try {
                class319.field4566.method1755(0L, -1);
                class319.field4566.method1751(arg0, 24, -1, arg2.field4326);
            } catch (Exception var3) {
            }
        }
        if (arg1 != -22189) {
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1554(byte arg0, String arg1) {
        int var2 = 91 / ((arg0 - 86) / 40);
        field3476++;
        System.out.println("Error: " + class36.method286("%0a", arg1, "\n", 0));
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class239(class271 arg0, int arg1, class84 arg2) {
        new class364(64);
        this.field3481 = arg2;
        this.field3478 = this.field3481.method656((byte) 122, 15);
    }
}
