import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class432 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
    public static int[] field6337 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lfd;")
    public static class194 field6335 = null;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[[I")
    public static int[][] field6336;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[[[I")
    public static int[][][] field6340;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILam;)V")
    public static final void method2676(int arg0, class286 arg1) {
        class229.field3155 = arg1.method1700("p11_full", (byte) -70);
        field6339++;
        class333.field4428 = arg1.method1700("p12_full", (byte) -70);
        class222.field2978 = arg1.method1700("b12_full", (byte) -70);
        class123.field1579 = arg1.method1700("hitmarks", (byte) -70);
        class99.field1172 = arg1.method1700("hitbar_default", (byte) -70);
        if (arg0 != -14228) {
            method2677(77);
        }
        class259.field3520 = arg1.method1700("timerbar_default", (byte) -70);
        class140.field1795 = arg1.method1700("headicons_pk", (byte) -70);
        class206.field2781 = arg1.method1700("headicons_prayer", (byte) -70);
        class188.field2367 = arg1.method1700("hint_headicons", (byte) -70);
        class132.field1710 = arg1.method1700("hint_mapmarkers", (byte) -70);
        class154.field1946 = arg1.method1700("mapflag", (byte) -70);
        class36.field349 = arg1.method1700("cross", (byte) -70);
        class298.field4072 = arg1.method1700("mapdots", (byte) -70);
        class23.field217 = arg1.method1700("scrollbar", (byte) -70);
        class98.field1163 = arg1.method1700("name_icons", (byte) -70);
        class30.field293 = arg1.method1700("floorshadows", (byte) -70);
        class110.field1360 = arg1.method1700("compass", (byte) -70);
        class75.field842 = arg1.method1700("hint_mapedge", (byte) -70);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2677(int arg0) {
        field6337 = null;
        field6336 = null;
        field6340 = null;
        if (arg0 < 56) {
            field6337 = null;
        }
        field6335 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lii;I)I")
    public static final int method2678(class405 arg0, int arg1) {
        field6342++;
        String var2 = class83.method452(arg0, arg1 ^ 0x3A72);
        int[] var3 = null;
        if (arg1 != 1) {
            return 75;
        }
        if (class306.method1798(arg0.field5892, 9055)) {
            var3 = class65.method368((int) arg0.field5891, -126).field1543;
        } else if (class293.method1725((byte) -121, arg0.field5892)) {
            class91 var4 = class38.field397[(int) arg0.field5891];
            if (var4 != null) {
                var3 = var4.field1035.field4655;
            }
        } else if (class376.method2259((byte) -77, arg0.field5892)) {
            if (arg0.field5892 == 1010) {
                var3 = class281.method1655((byte) -28, (int) arg0.field5891).field3068;
            } else {
                var3 = class281.method1655((byte) -28, (int) (arg0.field5891 >>> 32 & 0x7FFFFFFFL)).field3068;
            }
        }
        if (var3 != null) {
            var2 = var2 + client.method1409((byte) 115, var3);
        }
        return class111.field1385.method2524(class335.field4469, var2, 1518);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static final void method2679(byte arg0) {
        class47.field478 = new class382(8);
        field6341++;
        class203.field2716 = 0;
        if (arg0 == -84) {
            for (class174 var1 = (class174) class299.field4074.method986((byte) 104); var1 != null; var1 = (class174) class299.field4074.method984((byte) 71)) {
                var1.method915();
            }
        }
    }
}
