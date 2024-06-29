import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class52 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "[B")
    public static byte[] field595 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "Ljava/lang/String;")
    public static String field596 = "Attack";

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method309(byte arg0, int arg1) {
        field599++;
        class348 var2 = class385.method2464(7, 1302, arg1);
        if (arg0 != 117) {
            method310(29);
        }
        var2.method2214((byte) 121);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 19)
    public static void method310(int arg0) {
        field595 = null;
        field596 = null;
        int var1 = -42 / ((arg0 - 12) / 55);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Lgf;", line = 29)
    public static final class151 method311(int arg0, int arg1) {
        field597++;
        class151 var2 = (class151) class93.field1031.method2049(-81, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field1647.method361(1, 61, arg1);
        class151 var4 = new class151();
        int var5 = 65 % ((arg0 + 3) / 41);
        if (var3 != null) {
            var4.method905(-1, new class211(var3), arg1);
        }
        class93.field1031.method2046((long) arg1, 0, var4);
        return var4;
    }
}
