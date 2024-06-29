import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class88 extends class525 {

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "Lqv;")
    public static class316 field1421 = new class316(16, 20);

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "I")
    public static int field1429 = 0;

    @OriginalMember(owner = "client!hu", name = "R", descriptor = "Lbd;")
    public static class44 field1431 = new class44("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!hu", name = "S", descriptor = "Lqt;")
    public static class459 field1432 = new class459(21, 7);

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "Lrh;")
    public static class178 field1430;

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "Lkj;")
    public class405 field1418;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "Ljava/lang/String;")
    public String field1424;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "[I")
    public int[] field1416;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "[I")
    public int[] field1427;

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "[Lhl;")
    public class375[] field1426;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field1417;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V")
    public static void method656(int arg0) {
        if (arg0 != 7) {
            method656(85);
        }
        field1432 = null;
        field1431 = null;
        field1430 = null;
        field1421 = null;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(IB)I")
    public static final int method657(int arg0, byte arg1) {
        field1419++;
        return arg1 == 97 ? arg0 & 0xFF : 91;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Z")
    public static final boolean method658(int arg0, boolean arg1) {
        field1422++;
        if (arg1) {
            method656(22);
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }
}
