import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class41 extends class60 {

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[[I")
    public static int[][] field674 = new int[104][104];

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "Luh;")
    public static class198 field673 = new class198();

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Lub;")
    public static class227 field681 = class257.method1749("Lade Wordpack )2 ", 17263);

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "Lub;")
    public static class227 field682 = class257.method1749("Untersuchen", 17263);

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "Ljk;")
    public class192 field678;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "Lnh;")
    public class57 field675;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "[B")
    public byte[] field680;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)V")
    public static void method222(byte arg0) {
        field673 = null;
        field682 = null;
        field674 = null;
        if (arg0 == -88) {
            field681 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)Lub;")
    public static final class227 method223(int arg0) {
        if (arg0 != 17511) {
            method222((byte) -2);
        }
        field679++;
        class227 var1 = class66.field1197;
        if (class169.field2832 != 0) {
            var1 = class176.field2936;
        }
        return class76.method445((byte) 102, new class227[] { class237.field4104, var1, class4.field68, class204.method1303(class214.field3612, 1), class27.field448, class204.method1303(class64.field1172, 1), class218.field3678 });
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public static final void method224(int arg0) {
        field672++;
        class176.field2938.method534((byte) 90);
        for (int var1 = 0; var1 < 32; var1++) {
            class214.field3616[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 >= -12) {
            method224(81);
        }
        while (var2 < 32) {
            class251.field4340[var2] = 0L;
            var2++;
        }
        class66.field1199 = 0;
    }
}
