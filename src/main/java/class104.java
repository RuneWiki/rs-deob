import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class104 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1907 = -1;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1906 = "Loading defaults - ";

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    public static int[] field1905 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lnb;")
    public static class348 field1904;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILth;)V", line = 21)
    public static final void method781(int arg0, int arg1, class98 arg2) {
        class302 var3 = (class302) class362.field5736.method2344(-1, (long) arg0);
        if (var3 == null) {
            class124.method891((class238) null, class276.field4506, arg2.field170[0], arg0, arg2.field139[0], 128, (class314) null, arg2, 0);
        } else {
            var3.method2163(71);
        }
        if (arg1 != 16420) {
            method783(-111, 81, (String) null);
        }
        field1909++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 39)
    public static void method782(byte arg0) {
        if (arg0 >= -39) {
            method781(89, 59, (class98) null);
        }
        field1905 = null;
        field1906 = null;
        field1904 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/String;)V", line = 57)
    public static final void method783(int arg0, int arg1, String arg2) {
        field1908++;
        class354.field5651++;
        class51.field1038.method291((byte) -100, 224);
        class51.field1038.method1027(class148.method1066(arg2, (byte) 57) + 1, -20374);
        if (arg1 == 16316) {
            class51.field1038.method1027(arg0, -20374);
            class51.field1038.method1012(arg2, (byte) 103);
        }
    }
}
