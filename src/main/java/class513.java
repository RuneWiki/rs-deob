import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class513 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7088 = null;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lih;")
    public static class744 field7094;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[B")
    public byte[] field7089;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[S")
    public short[] field7086;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[S")
    public short[] field7090;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[S")
    public short[] field7092;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method3065(boolean arg0) {
        field7094 = null;
        field7088 = null;
        if (arg0) {
            method3067(43, -20, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lto;")
    public static final class717 method3066(byte arg0) {
        field7093++;
        if (class461.field6394 == null || class225.field3028 == null) {
            return null;
        }
        class717 var1 = (class717) class225.field3028.method2763(26385);
        if (arg0 >= -125) {
            method3066((byte) 60);
        }
        while (var1 != null) {
            class21 var2 = class461.field6385.method11(-125, var1.field9990);
            if (var2 != null && var2.field227 && var2.method109(false, class461.field6380)) {
                return var1;
            }
            var1 = (class717) class225.field3028.method2763(26385);
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3067(int arg0, int arg1, byte arg2) {
        if (arg2 > -125) {
            field7094 = null;
        }
        field7091++;
        return class525.method3122(6, arg0, arg1) || class383.method2404(-124, arg0, arg1);
    }
}
