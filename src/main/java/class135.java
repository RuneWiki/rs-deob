import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class135 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[B")
    public static byte[] field1945 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "S")
    public static short field1952 = 32767;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lfg;")
    public static class83 field1950 = new class83(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Ltk;")
    public static class228 field1953 = new class228(6, 0, 4, 2);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field1948;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Ljc;")
    public static class302 field1954;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lf;")
    public static class529 field1949;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Z")
    public boolean field1947;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method884(int arg0) {
        field1945 = null;
        field1949 = null;
        field1953 = null;
        field1954 = null;
        if (arg0 >= -48) {
            field1949 = null;
        }
        field1950 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lfm;")
    public static final class515 method885(int arg0, int arg1) {
        field1946++;
        class515[] var2 = class89.method616((byte) -2);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class515 var4 = var2[var3];
            if (var4.field7563 == arg1) {
                return var4;
            }
        }
        if (arg0 != 4) {
            field1949 = null;
        }
        return null;
    }
}
