import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class58 extends class81 {

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lpj;")
    public static class237 field1183 = class33.method353(" weitere Optionen", 24);

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "[S")
    public static short[] field1186 = new short[] { 49, 41, 22, 36, 43, 59, 23, 42 };

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Lpj;")
    private static class237 field1188 = class33.method353(" from your friend list first)3", 20);

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Lpj;")
    public static class237 field1195 = class33.method353("hint_mapmarkers", 17);

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1196 = 0;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "Z")
    public static boolean field1197 = false;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1184 = 0;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lpj;")
    public static class237 field1194 = field1188;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Lfa;")
    public static class239 field1193;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Leh;")
    public static class80 field1198;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method505(byte arg0) {
        field1198 = null;
        field1186 = null;
        field1183 = null;
        field1194 = null;
        if (arg0 != 94) {
            method507((byte) -29, (class237) null);
        }
        field1193 = null;
        field1195 = null;
        field1188 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)Lpj;")
    public static final class237 method506(int arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        field1190++;
        class237 var3 = new class237();
        var3.field4114 = 0;
        var3.field4151 = var2;
        if (arg0 != -12664) {
            return null;
        }
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field4114++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLpj;)V")
    public static final void method507(byte arg0, class237 arg1) {
        field1192++;
        if (arg0 != 98) {
            method506(74, (String) null);
        }
        for (class224 var2 = (class224) class210.field3587.method673(false); var2 != null; var2 = (class224) class210.field3587.method680(19)) {
            if (var2.field3857.method1585((byte) 74, arg1)) {
                class65.field1296 = var2;
                return;
            }
        }
    }
}
