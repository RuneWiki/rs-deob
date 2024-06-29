import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class216 extends class67 {

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "Lqc;")
    public static class743 field2614 = new class743();

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "B")
    public byte field2612;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lji;")
    public class611 field2608;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "[I")
    public static int[] field2615;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I", line = 9)
    public final int method510(int arg0) {
        ++field2613;
        if (arg0 != 100) {
            return -60;
        } else {
            return this.field2608 == null ? 0 : this.field2608.field8520 * 100 / (this.field2608.field8529.length + -this.field2612);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1201(byte arg0) {
        ++field2609;
        int var1 = 0;
        if (~class11.field68.field5541.method3210((byte) 127) == -2) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (class11.field68.field5521.method3358((byte) 124) == 0) {
            var1 |= 64;
        }
        class452.method2528(var1, (byte) -85);
        class707.field9894.method4117(true, var1);
        class761.field10628.method4167(60, var1);
        class51.field540.method4087(true, var1);
        class303.field4090.method3517(var1, 0);
        class607.method3356(18279, var1);
        class300.method1802(var1, 1024);
        class488.method2747(var1, false);
        class108.method735(117, var1);
        if (arg0 <= 44) {
            method1203(85);
        }
        class243.method1461((byte) 124);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)[B", line = 64)
    public final byte[] method511(int arg0) {
        ++field2610;
        if (arg0 < 5) {
            return null;
        } else if (!super.field741 && this.field2608.field8529.length - this.field2612 <= this.field2608.field8520) {
            return this.field2608.field8529;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIB)V", line = 83)
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field2606;
        int var5 = class68.field750;
        int var6 = class703.field9873;
        if (class247.field3206) {
            var5 += class63.method488((byte) 42);
            var6 += class231.method1364(false);
        }
        if (arg4 <= 115) {
            field2615 = null;
        }
        if (~class698.field9826 == -2) {
            class680 var7 = class584.field8181[class96.field1251 / 100];
            var7.method3859(var5 + -8, var6 + -8);
            class207.method1157(var7.method663() + -8 + var6, var6 + -8, false, var5 - 8, -8 + (var5 - -var7.method666()));
        }
        if (class698.field9826 == 2) {
            class680 var8 = class584.field8181[4 - -(class96.field1251 / 100)];
            var8.method3859(var5 + -8, var6 + -8);
            class207.method1157(var8.method663() + -8 + var6, var6 + -8, false, var5 - 8, var5 + -8 + var8.method666());
        }
        class205.method1140(-23196);
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)[Lee;", line = 120)
    public static final class676[] method1203(int arg0) {
        ++field2607;
        if (arg0 <= 102) {
            method1204((byte) 125);
        }
        return new class676[] { class733.field10227, class409.field5775, class416.field5871 };
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V", line = 132)
    public static void method1204(byte arg0) {
        if (arg0 > 6) {
            field2615 = null;
            field2614 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 144)
    public static final void method1205(int[] arg0, Object[] arg1, int arg2) {
        ++field2611;
        class139.method860(arg0, arg1, arg2, arg0.length + -1, 0);
    }
}
