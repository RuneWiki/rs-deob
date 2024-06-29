import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public abstract class class353 extends class179 {

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Lsk;")
    public static class423 field5182 = new class423("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Loe;")
    public static class127 field5184 = new class127(92, -1);

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "(I)V")
    public static void method2150(int arg0) {
        field5184 = null;
        if (arg0 != 31993) {
            field5182 = null;
        }
        field5182 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[BII)I")
    public static final int method2151(int arg0, byte[] arg1, int arg2, int arg3) {
        field5181++;
        int var4 = arg2;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = class456.field6992[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public static final void method2152(byte arg0) {
        field5183++;
        if (class86.method608(true)) {
            if (class105.field1855 == null) {
                class1.method1(-2);
            }
            class107.field1870 = true;
            class116.field1958 = 0;
            try {
                class181.field2811 = class6.field75.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        if (arg0 >= -90) {
            field5184 = null;
        }
    }
}
