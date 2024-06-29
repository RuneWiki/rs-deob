import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class341 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lkn;")
    public static class442 field4661 = new class442("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4666 = -1;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Luo;")
    public static class345 field4664;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4660;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBIII)V", line = 3)
    public static final void method2165(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4665++;
        if (arg3 == arg5) {
            class368.method2368(arg1, arg0, arg3, arg2 - 71, arg4);
            return;
        }
        if (class154.field2161 <= arg1 - arg3 && arg1 + arg3 <= class233.field3350 && (arg0 - arg5) >= class290.field4058 && arg0 + arg5 <= class442.field6212) {
            class269.method1772(-907270302, arg5, arg1, arg4, arg0, arg3);
        } else {
            class151.method1022(arg0, arg2 - 168, arg5, arg3, arg4, arg1);
        }
        if (arg2 != 71) {
            field4661 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V", line = 31)
    public static final void method2166(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            class286.field4032 = new class131(arg2);
            field4662++;
            class376.field5368 = new class131(arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method2167(byte arg0, int arg1) {
        field4663++;
        class131 var2 = class143.field2049;
        synchronized (class143.field2049) {
            class143.field2049.method901(arg1, 12223);
        }
        class131 var3 = class159.field2232;
        synchronized (class159.field2232) {
            class159.field2232.method901(arg1, 12223);
            if (arg0 <= 97) {
                method2165(-66, 60, (byte) -61, 65, -102, 37);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 66)
    public static void method2168(int arg0) {
        field4661 = null;
        field4664 = null;
        if (arg0 < 80) {
            field4666 = -51;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lkh;[BI)V", line = 83)
    public final void method2169(class11 arg0, byte[] arg1, int arg2) {
        field4659++;
        if (arg0.field230[arg0.field191] != 31 || arg0.field230[arg0.field191 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4660 == null) {
            this.field4660 = new Inflater(true);
        }
        try {
            this.field4660.setInput(arg0.field230, arg0.field191 + arg2, arg0.field230.length + -8 + -arg0.field191 + -10);
            this.field4660.inflate(arg1);
        } catch (Exception var4) {
            this.field4660.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4660.reset();
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 106)
    public class341() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(III)V", line = 109)
    private class341(int arg0, int arg1, int arg2) {
    }
}
