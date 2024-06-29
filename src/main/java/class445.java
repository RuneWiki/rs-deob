import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class445 {

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Z")
    public static boolean field6619 = false;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6620;

    static {
        new class179("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([BZLfh;)V", line = 5)
    public final void method2745(byte[] arg0, boolean arg1, class194 arg2) {
        field6618++;
        if (arg2.field2973[arg2.field2982] != 31 || arg2.field2973[arg2.field2982 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6620 == null) {
            this.field6620 = new Inflater(true);
        }
        if (!arg1) {
            method2746(32, -40, 57);
        }
        try {
            this.field6620.setInput(arg2.field2973, arg2.field2982 + 10, -arg2.field2982 + -10 + -8 + arg2.field2973.length);
            this.field6620.inflate(arg0);
        } catch (Exception var4) {
            this.field6620.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field6620.reset();
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I", line = 30)
    public static final int method2746(int arg0, int arg1, int arg2) {
        field6621++;
        if (arg2 == 4 || arg2 == 5) {
            return class289.field4486[arg0 & 0x3];
        } else {
            if (arg1 > -18) {
                field6617 = -31;
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 47)
    public class445() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)[Lmo;", line = 61)
    public static final class271[] method2747(int arg0) {
        field6622++;
        return arg0 == -11242 ? new class271[] { class252.field4096, class267.field4256, class482.field7064, class521.field7643, class499.field7264, class294.field4538, class451.field6715, class261.field4164, class474.field6945, class94.field1499, class326.field4925, class386.field5682, class408.field6037, class23.field272, class12.field131 } : null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(III)V", line = 77)
    private class445(int arg0, int arg1, int arg2) {
    }
}
