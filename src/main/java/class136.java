import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class136 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field1983 = -1;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[S")
    public static short[] field1988 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lwa;")
    public static class142 field1982;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lpk;")
    public static class237 field1986;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method929(byte arg0) {
        field1988 = null;
        field1982 = null;
        if (arg0 == 8) {
            field1986 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILul;BII)V")
    public static final void method930(int arg0, class188 arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -92) {
            method930(-41, (class188) null, (byte) -68, -42, 35);
        }
        field1985++;
        for (class269 var5 = (class269) class249.field3864.method1894((byte) -90); var5 != null; var5 = (class269) class249.field3864.method1886(arg2 + 69)) {
            if (var5.field4205 == arg3 && (arg0 * 128) == var5.field4197 && (arg4 * 128) == var5.field4204 && var5.field4200.field2742 == arg1.field2742) {
                if (var5.field4198 != null) {
                    class108.field1581.method908(var5.field4198);
                    var5.field4198 = null;
                }
                if (var5.field4177 != null) {
                    class108.field1581.method908(var5.field4177);
                    var5.field4177 = null;
                }
                var5.method1193(126);
                return;
            }
        }
    }
}
