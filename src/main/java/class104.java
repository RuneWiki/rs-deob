import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class104 {

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lun;")
    public static class204 field1525;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lza;")
    public static class497 field1523;

    @OriginalMember(owner = "client!bi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1527++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V")
    public class104(int arg0, int arg1) {
        this.field1531 = arg0;
        this.field1526 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
    public final int method705(int arg0) {
        field1532++;
        int var2 = -58 / ((arg0 - 33) / 58);
        return this.field1531;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lon;")
    public static final class514 method706(int arg0, int arg1) {
        field1529++;
        class410[] var2 = class149.field2003;
        synchronized (class149.field2003) {
            if (arg0 != 0) {
                method708(null, null);
            }
            class514 var3;
            if (class149.field2003.length <= arg1 || class149.field2003[arg1].method2622(114)) {
                var3 = new class514();
                var3.field7629 = new class182[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field7629[var4] = new class182();
                }
            } else {
                var3 = (class514) class149.field2003[arg1].method2624(-74);
                var3.method1613(1049391719);
                int var10002 = class59.field945[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
    public static final void method707(int arg0, int arg1) {
        int var2 = -120 / ((arg0 + 25) / 41);
        field1524++;
        if (class415.field6293 == arg1) {
            return;
        }
        class135.field1839 = class197.field3038 = class359.field5571[arg1];
        class248.method1718((byte) 13);
        class159.field2186 = new int[class135.field1839][class197.field3038];
        class298.field4685 = new int[4][class135.field1839 >> 3][class197.field3038 >> 3];
        class452.field7015 = new int[class135.field1839][class197.field3038];
        for (int var3 = 0; var3 < 4; var3++) {
            class352.field5488[var3] = class85.method595(-126, class197.field3038, class135.field1839);
        }
        class240.field3908 = new byte[4][class135.field1839][class197.field3038];
        class234.method1660(class135.field1839, class197.field3038, 4, 39);
        class435.method2739(class197.field3038 >> 3, class135.field1839 >> 3, class19.field198, 4);
        class415.field6293 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Leo;")
    public static final class490 method708(Throwable arg0, String arg1) {
        field1528++;
        class490 var2;
        if (arg0 instanceof class490) {
            var2 = (class490) arg0;
            var2.field7413 = var2.field7413 + ' ' + arg1;
        } else {
            var2 = new class490(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public static void method709(int arg0) {
        field1523 = null;
        field1525 = null;
        if (arg0 >= -61) {
            method709(31);
        }
    }

    static {
        new class213("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field1530 = 0;
    }
}
