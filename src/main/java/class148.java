import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class148 extends class28 {

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "Lrb;")
    public class186 field2673;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[I")
    public static int[] field2669 = new int[50];

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "[I")
    public static int[] field2668;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public static final void method945(int arg0, int arg1, int arg2) {
        class23 var3 = class95.method619(true, arg0);
        int var4 = var3.field565;
        field2676++;
        int var5 = var3.field559;
        int var6 = var3.field570;
        int var7 = class60.field1285[var6 - var4];
        if (arg1 != 3405) {
            field2668 = null;
        }
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class14.field355[var5] = class125.method790(class107.method696(var8, arg2 << var4), class107.method696(class14.field355[var5], ~var8));
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2668 = null;
        field2669 = null;
        if (arg0 >= -11) {
            method950(108);
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)I")
    public static final int method947(int arg0) {
        field2674++;
        if (arg0 > -121) {
            field2668 = null;
        }
        return class196.field3635;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public static final void method948(boolean arg0) {
        class199.method1325(102);
        field2670++;
        class98.method626((byte) -26);
        class175.method1102((byte) 23);
        method950(85);
        class16.method128(5654);
        class239.method1554(1);
        class237.method1537(-116);
        class229.method1507((byte) 72);
        class70.method450(100);
        class198.method1321(arg0);
        class115.method738((byte) -116);
        class165.method1060((byte) 127);
        ((class81) class27.field597).method517((byte) -26);
        class218.field4035.method1297((byte) 89);
        class18.field475.method353(0);
        class80.field1539.method353(0);
        class50.field1070.method353(0);
        class157.field2850.method353(0);
        class34.field753.method353(0);
        class179.field3251.method353(0);
        class183.field3381.method353(0);
        class131.field2384.method353(0);
        class223.field4108.method353(0);
        class144.field2634.method353(0);
        class237.field4380.method353(0);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lrb;)V")
    public class148(class186 arg0) {
        this.field2673 = arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Lqe;")
    public static final class179 method949(byte arg0, int arg1) {
        field2671++;
        return arg0 == -14 ? class42.method281(arg1, 10, -117, false) : null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
    private static final void method950(int arg0) {
        if (arg0 <= 10) {
            return;
        }
        class16.field434.method1297((byte) 89);
        field2672++;
        class217.field4008.method1339((byte) 68);
        class193.field3597.method1339((byte) 77);
        class202.field3744.method1339((byte) 92);
    }
}
