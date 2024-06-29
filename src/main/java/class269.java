import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class269 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4286 = new String[100];

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lvj;")
    public static class115 field4292 = new class115(64);

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4293 = "green:";

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field4294 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method1826(byte arg0) {
        field4290++;
        class256.method1758(0, 5);
        class163.method1120(5, arg0 ^ 0xFFFFFFEE);
        if (arg0 != -127) {
            return;
        }
        class244.method1646(5, (byte) 109);
        class145.method966(16174, 5);
        class41.method325(-193823103, 5);
        class258.method1771(-124, 5);
        class69.method470(5, arg0 ^ 0xFFFFFFFA);
        class131.method886(false, 5);
        class8.method48(0, 5);
        class277.method1857(arg0 + 126, 5);
        class11.method66(5, true);
        class276.method1855(true, 5);
        class222.method1517(5, (byte) 122);
        class262.method1801(5, 12890);
        class272.method1836(5, 788436204);
        class173.method1218(50, arg0 - 1782761856);
        class99.method659(5, -95);
        class214.method1452(5, (byte) -94);
        class37.field484.method1425(5, arg0 ^ 0xD);
        class99.field1545.method1425(5, arg0 ^ 0x12);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLlk;)V")
    public static final void method1827(byte arg0, class82 arg1) {
        field4291++;
        int var2 = arg1.field1208 - class111.field1684;
        int var3 = arg1.field1216 * 128 + (arg1.method565((byte) 0) * 64);
        int var4 = arg1.field1279 * 128 + (arg1.method565((byte) 0) * 64);
        arg1.field1206 = 0;
        arg1.field1273 += (var4 - arg1.field1273) / var2;
        if (arg0 <= 66) {
            return;
        }
        arg1.field1226 += (var3 - arg1.field1226) / var2;
        if (arg1.field1242 == 0) {
            arg1.field1211 = 1024;
        }
        if (arg1.field1242 == 1) {
            arg1.field1211 = 1536;
        }
        if (arg1.field1242 == 2) {
            arg1.field1211 = 0;
        }
        if (arg1.field1242 == 3) {
            arg1.field1211 = 512;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1828(byte arg0, long arg1) {
        field4289++;
        int var3 = -57 / ((arg0 + 55) / 53);
        class178.field2771.setTime(new Date(arg1));
        int var4 = class178.field2771.get(7);
        int var5 = class178.field2771.get(5);
        int var6 = class178.field2771.get(2);
        int var7 = class178.field2771.get(1);
        int var8 = class178.field2771.get(11);
        int var9 = class178.field2771.get(12);
        int var10 = class178.field2771.get(13);
        return class149.field2230[var4 - 1] + ", " + var5 / 10 + var5 % 10 + "-" + class237.field3790[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public static void method1829(byte arg0) {
        if (arg0 >= -56) {
            field4292 = null;
        }
        field4286 = null;
        field4292 = null;
        field4293 = null;
    }
}
