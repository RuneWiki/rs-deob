import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lid;")
    public static class149 field223 = class60.method382("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) 119);

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lid;")
    public static class149 field226 = class60.method382("null", (byte) 48);

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lid;")
    public static class149 field227 = class60.method382("Polices charg-Bes", (byte) 49);

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Ltb;")
    public static class69 field225 = new class69();

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[Z")
    public static boolean[] field230 = new boolean[100];

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lid;")
    public static class149 field232 = class60.method382("<col=ffffff> )4 ", (byte) 68);

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lid;")
    public static class149 field233 = class60.method382("Lade)3)3)3", (byte) 37);

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[I")
    public static int[] field231 = new int[4096];

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lid;")
    public static class149 field234 = class60.method382("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", (byte) 81);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lal;")
    public static class230 field228;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method97(int arg0) {
        int var1 = 56 % ((71 - arg0) / 39);
        field227 = null;
        field228 = null;
        field226 = null;
        field234 = null;
        field231 = null;
        field232 = null;
        field225 = null;
        field233 = null;
        field223 = null;
        field230 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
    public static final void method98(int arg0, byte arg1) {
        field222++;
        class216 var2 = class139.method972(arg0, false, 5);
        if (arg1 <= 96) {
            method97(123);
        }
        var2.method1457(0);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class16() {
        new class255();
    }
}
