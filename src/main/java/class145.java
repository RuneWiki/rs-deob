import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class145 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lic;")
    public static class59 field3163 = class59.method433(0, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lic;")
    public static class59 field3168 = class59.method433(0, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lic;")
    public static class59 field3169 = class59.method433(0, ":clan:");

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3165;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1083(int arg0) {
        if (arg0 != 0) {
            field3166 = -72;
        }
        field3169 = null;
        field3163 = null;
        field3168 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([BILwd;)V")
    public final void method1084(byte[] arg0, int arg1, class157 arg2) {
        field3162++;
        if (arg2.field3473[arg2.field3457] != 31 || arg2.field3473[arg2.field3457 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3165 == null) {
            this.field3165 = new Inflater(true);
        }
        try {
            this.field3165.setInput(arg2.field3473, arg2.field3457 + 10, arg2.field3473.length + -8 + -arg2.field3457 - 10);
            this.field3165.inflate(arg0);
        } catch (Exception var4) {
            this.field3165.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1 != 2989) {
            field3163 = null;
        }
        this.field3165.reset();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1085(boolean arg0, String arg1) throws ClassNotFoundException {
        field3171++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0) {
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(III)V")
    private class145(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class145() {
        this(-1, 1000000, 1000000);
    }
}
