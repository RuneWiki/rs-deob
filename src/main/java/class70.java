import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 extends class28 {

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "Lue;")
    public class219 field1399;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field1405 = 0;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Lqe;")
    private static class179 field1404 = class206.method1380("Close", (byte) 23);

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field1409 = 4;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field1403 = 100;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lqe;")
    public static class179 field1402 = class206.method1380("Clientscript error )2 check log for details", (byte) -127);

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Lqe;")
    public static class179 field1410 = class206.method1380("Bitte geben Sie Ihren Benutzernamen ein)3", (byte) -127);

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1398 = 0;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[[Lka;")
    public static class109[][] field1401 = new class109[field1409][500];

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "[I")
    public static int[] field1400 = new int[field1409];

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Lqe;")
    public static class179 field1407 = field1404;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[[[I")
    public static int[][][] field1408;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static final void method450(int arg0) {
        field1411++;
        if (arg0 != 100) {
            field1408 = null;
        }
        class49.field1061.method1297((byte) 89);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lue;)V")
    public class70(class219 arg0) {
        this.field1399 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Leh;Leh;Leh;I)V")
    public static final void method451(class52 arg0, class52 arg1, class52 arg2, int arg3) {
        field1406++;
        class116.field2184 = arg0.method359(-1, class229.field4222);
        class78.field1518 = arg1.method359(-1, class178.field3227);
        class234.field4324 = arg1.method359(-1, class127.field2324);
        class139.field2564 = arg1.method359(-1, class206.field3845);
        class80.field1537 = arg1.method359(-1, class107.field2004);
        class212.field3954 = arg1.method359(-1, class92.field1742);
        class182.field3361 = arg1.method359(-1, class214.field3977);
        class55.field1226 = arg1.method359(-1, class130.field2363);
        class11.field303 = arg1.method359(-1, class143.field2602);
        class84.field1632 = arg1.method359(-1, class34.field728);
        class4.field59 = arg1.method359(arg3 - 1, class172.field3082);
        class23.field561 = arg2.method359(-1, class106.field1981);
        if (arg3 != 0) {
            method452((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
    public static void method452(byte arg0) {
        field1402 = null;
        field1408 = null;
        field1401 = null;
        field1410 = null;
        int var1 = -27 % ((-arg0 - 12) / 40);
        field1404 = null;
        field1400 = null;
        field1407 = null;
    }
}
