import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class151 {

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field2084;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "[S")
    public static short[] field2083 = new short[256];

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "Lpf;")
    public static class425 field2085 = new class425(64, -1);

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "[Lnh;")
    public static class453[] field2087 = new class453[29];

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "Z")
    public static boolean field2088;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "[I")
    public static int[] field2089;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "Z")
    public static boolean field2090;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Liq;")
    public static class134 field2081;

    @OriginalMember(owner = "client!nn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2086++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method937(byte arg0, int arg1) {
        field2082++;
        int var3 = 97 % ((arg0 - 34) / 62);
        return this.field2084[arg1];
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILjk;)V")
    public static final void method938(int arg0, int arg1, class119 arg2) {
        class411.field6119 = false;
        field2079++;
        class109.field1441 = 0;
        class121.method727(arg2, -111);
        if (arg1 < 20) {
            return;
        }
        class26.method158(-13859, arg2);
        if (class411.field6119) {
            System.out.println("---endgpp---");
        }
        if (arg2.field5666 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field5666 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class151(String arg0, String arg1, String arg2, String arg3) {
        this.field2084 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method939(byte arg0) {
        field2089 = null;
        int var1 = -113 / ((arg0 + 63) / 53);
        field2085 = null;
        field2081 = null;
        field2083 = null;
        field2087 = null;
    }

    static {
        new class151("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field2088 = false;
        field2089 = new int[200];
        field2090 = true;
        field2091 = 0;
    }
}
