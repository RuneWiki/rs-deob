import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class25 extends class86 {

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Lei;")
    public class384 field405;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field404 = new CRC32();

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field411 = 0;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Lui;")
    public static class375 field410 = new class375("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "F")
    public static float field407;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "F")
    public static float field414;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "Ltf;")
    public static class167 field413;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "[I")
    public static int[] field406;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "[[Z")
    public static boolean[][] field408;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljb;I)Ljb;", line = 6)
    public static final class499 method201(class499 arg0, int arg1) {
        if (arg1 != 0) {
            method203(null, -116, null);
        }
        field412++;
        class499 var2 = client.method447(arg0);
        if (var2 == null) {
            var2 = arg0.field7434;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V", line = 30)
    public static void method202(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field404 = null;
        field413 = null;
        field410 = null;
        field406 = null;
        field408 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljb;ILjb;)V", line = 46)
    public static final void method203(class499 arg0, int arg1, class499 arg2) {
        field409++;
        class179.method1287(false, class57.field773);
        class29.field454++;
        class75.field1006.method615(28010, arg0.field7312);
        if (arg1 >= -109) {
            return;
        }
        class75.field1006.method615(28010, arg2.field7312);
        class75.field1006.method589(arg0.field7310, false);
        class75.field1006.method582(-64, arg2.field7304);
        class75.field1006.method637((byte) 90, arg0.field7304);
        class75.field1006.method637((byte) 103, arg2.field7310);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lei;)V", line = 67)
    public class25(class384 arg0) {
        this.field405 = arg0;
    }
}
