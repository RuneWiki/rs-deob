import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class83 extends class62 {

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static volatile int field1301 = 0;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "Leg;")
    public static class37 field1306 = class174.method1167("zap", 77);

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Leg;")
    public static class37 field1309 = class174.method1167("Poser", 105);

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Leg;")
    private static class37 field1305 = class174.method1167("Allocating memory", 92);

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Leg;")
    public static class37 field1308 = field1305;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Lcd;")
    public static class117 field1302 = new class117();

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field1313 = -1;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Leg;")
    public static class37 field1312 = class174.method1167("::rect_debug", -121);

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)I")
    public static final int method556(int arg0, int arg1) {
        field1303++;
        class203 var2 = class223.method1556(arg1, arg0 ^ 0x8513EFB3);
        if (arg0 != 1522) {
            field1300 = 21;
        }
        int var3 = var2.field3475;
        int var4 = var2.field3468;
        int var5 = var2.field3471;
        int var6 = class120.field2030[var5 - var3];
        return class153.field2571[var4] >> var3 & var6;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
    public static void method557(byte arg0) {
        field1312 = null;
        if (arg0 != -127) {
            return;
        }
        field1308 = null;
        field1309 = null;
        field1302 = null;
        field1305 = null;
        field1306 = null;
    }
}
