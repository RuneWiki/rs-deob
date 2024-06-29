import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class310 extends class260 {

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "Ljw;")
    public static class581 field4463 = new class581(88, 6);

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "Lmga;")
    public static class739 field4466 = new class739(50, -1);

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "D")
    public static double field4461;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        if (arg1 != -107) {
            field4463 = null;
        }
        super.field3868 = arg0;
        ++field4459;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            field4461 = -1.1352100688518034D;
        }
        ++field4458;
        return 2;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(Z)V")
    public static void method1946(boolean arg0) {
        field4463 = null;
        field4466 = null;
        if (arg0) {
            method1947(107, -36, -127);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field4462;
        int var3 = -43 / ((arg1 - -53) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(ILfca;)V")
    public class310(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(III)Z")
    public static final boolean method1947(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method1947(30, 27, 73);
        }
        ++field4460;
        return class619.method3401(arg2, 9209, arg1) || class271.method1759(arg2, arg1, -114);
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)V")
    public static final void method1948(int arg0) {
        ++field4467;
        class712.field9959.method735(1, class712.field9959.field1305, 113);
        class712.field9959.method735(1, class712.field9959.field1320, 126);
        class712.field9959.method735(arg0, class712.field9959.field1291, 116);
        class712.field9959.method735(1, class712.field9959.field1313, 91);
        class712.field9959.method735(1, class712.field9959.field1287, arg0 + 103);
        class712.field9959.method735(1, class712.field9959.field1301, 126);
        class712.field9959.method735(0, class712.field9959.field1276, 113);
        class712.field9959.method735(0, class712.field9959.field1281, 76);
        class712.field9959.method735(0, class712.field9959.field1318, 125);
        class712.field9959.method735(0, class712.field9959.field1319, 97);
        class712.field9959.method735(0, class712.field9959.field1307, arg0 ^ 82);
        class712.field9959.method735(0, class712.field9959.field1288, arg0 ^ 96);
        class712.field9959.method735(0, class712.field9959.field1322, 109);
        class712.field9959.method735(0, class712.field9959.field1316, 94);
        class712.field9959.method735(0, class712.field9959.field1300, 72);
        class712.field9959.method735(0, class712.field9959.field1271, arg0 + 87);
        class712.field9959.method735(0, class712.field9959.field1274, 112);
        class712.field9959.method735(0, class712.field9959.field1297, 98);
        class712.field9959.method735(0, class712.field9959.field1312, 100);
        class196.method1348(false);
        class712.field9959.method735(2, class712.field9959.field1293, 124);
        class712.field9959.method735(2, class712.field9959.field1311, 95);
        class686.method3808(false);
        class596.method3322((byte) 113);
        class92.field1310 = true;
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lfca;)V")
    public class310(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)I")
    public final int method1949(int arg0) {
        ++field4464;
        if (arg0 <= 3) {
            this.method9(28, (byte) -84);
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        ++field4465;
        if (super.field3867.field1323.method3655((byte) -120) && super.field3868 == 2) {
            super.field3868 = 1;
        }
        if (arg0) {
            field4461 = 2.5032322117488977D;
        }
        if (~super.field3868 > -1 || super.field3868 > 2) {
            super.field3868 = this.method8((byte) 4);
        }
    }
}
