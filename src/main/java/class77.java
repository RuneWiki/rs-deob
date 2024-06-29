import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class77 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "J")
    public static volatile long field1119;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lla;")
    public static class319 field1117;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Lla;")
    public static class319 field1121;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "Lhg;")
    public static class496 field1120;

    static {
        new class446(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field1119 = 0L;
        field1118 = -1;
        field1117 = new class319(54, 17);
        field1121 = new class319(82, 8);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 7)
    public static final String[] method534(int arg0, String[] arg1) {
        field1113++;
        if (arg0 < 58) {
            method536(65);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Lff;", line = 34)
    public static final class8 method535(int arg0, int arg1) {
        field1115++;
        class8 var2 = (class8) class56.field809.method2133((long) arg0, (byte) 86);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -23) {
            field1121 = null;
        }
        byte[] var3 = class384.field5830.method1281(1, arg0, 109);
        class8 var4 = new class8();
        var4.field167 = arg0;
        if (var3 != null) {
            var4.method93(65, new class164(var3));
        }
        var4.method96(true);
        if (var4.field170 == 2 && class138.field1842.method1747((long) arg0, false) == null) {
            class138.field1842.method1751((long) arg0, -103, new class160(class365.field5594));
            class180.field2429[class365.field5594++] = var4;
        }
        class56.field809.method2131(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 73)
    public static void method536(int arg0) {
        if (arg0 != 31640) {
            field1118 = -125;
        }
        field1120 = null;
        field1121 = null;
        field1117 = null;
    }

    @OriginalMember(owner = "client!co", name = "toString", descriptor = "()Ljava/lang/String;", line = 87)
    public final String toString() {
        field1114++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 94)
    public class77(String arg0, int arg1) {
        this.field1112 = arg1;
    }
}
