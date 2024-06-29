import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class98 extends class66 {

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "Lhga;")
    public static class158 field1584 = new class158(21, -1);

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1592 = null;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "J")
    public long field1586;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "Lbm;")
    public class98 field1588;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "Lbm;")
    public class98 field1591;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "[[B")
    public static byte[][] field1590;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method953(byte arg0) {
        field1582++;
        if (this.field1591 == null) {
            return false;
        } else {
            if (arg0 < 74) {
                method954(42);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V", line = 20)
    public static void method954(int arg0) {
        field1590 = null;
        field1592 = null;
        field1584 = null;
        if (arg0 != -240) {
            method959(null, null, 19);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)Z", line = 37)
    public static final boolean method955(int arg0, int arg1, int arg2) {
        field1585++;
        if (arg2 != -9646) {
            field1592 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;I)Lak;", line = 48)
    public static final class320 method956(int arg0, String arg1, int arg2) {
        field1583++;
        class320 var3;
        try {
            var3 = (class320) Class.forName("hda").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class212();
        }
        if (arg2 != 251) {
            method954(77);
        }
        var3.field5008 = arg1;
        var3.field5012 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(CB)C", line = 69)
    public static final char method957(char arg0, byte arg1) {
        field1593++;
        if (arg1 != 73) {
            method956(-27, null, 112);
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V", line = 462)
    public final void method958(byte arg0) {
        field1581++;
        if (arg0 == 69 && this.field1591 != null) {
            this.field1591.field1588 = this.field1588;
            this.field1588.field1591 = this.field1591;
            this.field1588 = null;
            this.field1591 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 484)
    public static final void method959(String arg0, String arg1, int arg2) {
        class665.field9421 = 1;
        class700.field9878 = -1;
        field1594++;
        class136.method1182(arg1, (byte) -104, false, arg0);
        if (arg2 != 9528) {
            method959(null, null, -106);
        }
    }
}
