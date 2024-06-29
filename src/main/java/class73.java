import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class73 {

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
    public static int[] field1391 = new int[256];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lsg;")
    public static class162 field1386 = new class162();

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lcc;")
    public static class209 field1392 = class95.method669(124, "Lade)3)3)3");

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lkd;")
    public static class203 field1385;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method521(byte arg0) {
        field1391 = null;
        field1392 = null;
        field1386 = null;
        field1385 = null;
        if (arg0 >= -73) {
            field1386 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ls;I)V")
    public static final void method522(class238 arg0, int arg1) {
        field1390++;
        if (arg1 == -2) {
            class61.field1216 = arg0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
    public static final void method523(byte arg0, int arg1) {
        field1387++;
        int var2 = 29 / ((-arg0 - 46) / 38);
        class286.field5040.method662(32768, arg1);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static final void method524(byte arg0) {
        field1389++;
        if (arg0 != 97) {
            method523((byte) 23, -56);
        }
        for (class118 var1 = (class118) class201.field3606.method1119(20896); var1 != null; var1 = (class118) class201.field3606.method1120(56)) {
            class281 var2 = var1.field2360;
            if (class99.field1937 != var2.field4947 || var2.field4944) {
                var1.method269(-214950896);
            } else if (class163.field2968 >= var2.field4952) {
                var2.method1894(class122.field2402, arg0 + 3);
                if (var2.field4944) {
                    var1.method269(-214950896);
                } else {
                    class117.method830(var2.field4947, var2.field4950, var2.field4953, var2.field4955, 60, var2, 0, -1L, false);
                }
            }
        }
    }
}
