import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 extends class123 {

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public int field1173 = 0;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Lvc;")
    private static class137 field1168 = class45.method325("Could not complete login)3", -46);

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lvc;")
    public static class137 field1167 = field1168;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1169 = new CRC32();

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "Lvc;")
    private static class137 field1175 = class45.method325("Connecting to server)3)3)3", -46);

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lvc;")
    public static class137 field1177 = field1175;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lqa;")
    public static class105 field1178 = new class105(64);

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lvc;")
    private static class137 field1179 = class45.method325(" from your friend list first", -46);

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "Lvc;")
    public static class137 field1183 = field1179;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "Lvc;")
    public static class137 field1182 = class45.method325("Sichtbare Karte vorbereitet)3", -46);

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "Lvc;")
    public static class137 field1187 = class45.method325("60 Sekunden noch einmal)3)3)3", -46);

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field1180 = 0;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "Lvc;")
    public static class137 field1184 = class45.method325("rot:", -46);

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "[I")
    public static int[] field1181;

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "[I")
    public static int[] field1186;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static void method375(byte arg0) {
        field1177 = null;
        field1179 = null;
        field1184 = null;
        field1181 = null;
        field1169 = null;
        field1167 = null;
        field1175 = null;
        field1183 = null;
        field1182 = null;
        if (arg0 <= 84) {
            field1179 = null;
        }
        field1178 = null;
        field1187 = null;
        field1168 = null;
        field1186 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILqe;)V")
    public final void method376(int arg0, class109 arg1) {
        while (true) {
            int var3 = arg1.method838(arg0 ^ 0xFFFFFF00);
            if (var3 == 0) {
                field1171++;
                if (arg0 != -1) {
                    method375((byte) 88);
                    return;
                }
                return;
            }
            this.method377(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILqe;I)V")
    private final void method377(int arg0, class109 arg1, int arg2) {
        field1172++;
        if (arg2 == 0 && arg0 == 5) {
            this.field1173 = arg1.method835(2);
        }
    }
}
