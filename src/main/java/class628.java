import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class628 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field9187 = 0;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "[[I")
    public static int[][] field9194 = new int[6][];

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field9195 = -60;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field9189 = 0;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public int field9188;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public int field9190;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public int field9193;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "[Lha;")
    public static class52[] field9192;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZLmc;)Lmc;")
    public static final class114 method3658(boolean arg0, class114 arg1) {
        field9191++;
        class114 var2 = client.method1540(arg1);
        if (!arg0) {
            field9192 = null;
        }
        if (var2 == null) {
            var2 = arg1.field1914;
        }
        return var2;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public static void method3659(byte arg0) {
        field9194 = null;
        field9192 = null;
        if (arg0 <= 61) {
            method3659((byte) 101);
        }
    }
}
