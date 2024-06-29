import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class295 {

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lud;")
    public static class279 field5260 = class130.method1024("Chargement des interfaces )2 ", 255);

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lud;")
    public static class279 field5262 = class130.method1024("Fertigkeit: ", 255);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field5258 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lok;")
    public static class149 field5259;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[[[Lpl;")
    public static class191[][][] field5263;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 6)
    public static void method2093(byte arg0) {
        field5262 = null;
        field5259 = null;
        field5260 = null;
        field5263 = (class191[][][]) null;
        int var1 = 72 % ((3 - arg0) / 46);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I", line = 28)
    public static final int method2094(int arg0, int arg1, int arg2) {
        field5257++;
        if (arg2 != 0) {
            method2094(-35, -41, -88);
        }
        class109 var3 = (class109) class103.field1928.method610((long) arg1, -1);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field2013.length) {
            return var3.field2013[arg0];
        } else {
            return 0;
        }
    }
}
