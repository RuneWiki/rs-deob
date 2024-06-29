import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class115 {

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lph;")
    public static class114 field1433 = new class114(4);

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
    public static boolean field1434 = false;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "[B")
    public static byte[] field1435 = new byte[520];

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1439 = "flash1:";

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field1437 = 0;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "S")
    public static short field1438 = 32767;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lwm;")
    public static class298 field1436;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 38)
    public static void method618(int arg0) {
        field1436 = null;
        field1435 = null;
        field1439 = null;
        if (arg0 != -216) {
            field1435 = null;
        }
        field1433 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 54)
    public static final void method619(String arg0, int arg1) {
        if (arg1 >= -35) {
            field1439 = null;
        }
        field1432++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V", line = 72)
    public static final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class104.field1281 = arg2;
        class295.field4001 = arg0;
        class34.field337 = arg5;
        field1430++;
        class126.field1627 = arg4;
        class309.field4180 = arg3;
        class40.field417 = arg1;
        if (arg6 <= 68) {
            field1438 = -125;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 101)
    public static final void method621(int arg0) {
        class327.method1874(-4005, 5);
        field1431++;
        class233.method1262(-39, 5);
        class437.method2701(5, true);
        class65.method366((byte) -126, 5);
        class263.method1475(false, 5);
        class314.method1821(5, false);
        class41.method195(5, -103);
        class452.method2809(5, -24785);
        class18.method81(5, 58);
        class451.method2804(5, (byte) -66);
        class398.method2488(5, (byte) 57);
        class250.method1367(5, (byte) -100);
        class71.method408(-106, 5);
        if (arg0 != -29398) {
            method620(-95, -4, -125, -91, 125, 44, -118);
        }
        class176.method929(5, true);
        class409.method2543(5, 95);
        class405.method2534(arg0 ^ 0xFFFF8D28, 5);
        class17.method77(-105, 5);
        class318.method1834(5, (byte) 126);
        class131.method707(-339, 5);
        class116.method626(14, 5);
        class63.method354(-24, 50);
        class87.method474((byte) 127, 5);
        class384.method2383(5, (byte) -114);
        class422.field6190.method614(arg0 + 29275, 5);
        field1433.method614(-119, 5);
        client.field3468.method614(-122, 5);
        class398.field5730.method614(-123, 5);
        class277.field3758.method614(-119, 5);
    }
}
