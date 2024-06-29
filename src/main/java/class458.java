import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class458 extends class630 {

    @OriginalMember(owner = "client!fw", name = "Eb", descriptor = "I")
    public static int field5837 = 0;

    @OriginalMember(owner = "client!fw", name = "Ib", descriptor = "I")
    public static int field5841 = 0;

    @OriginalMember(owner = "client!fw", name = "Db", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!fw", name = "Fb", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!fw", name = "Gb", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!fw", name = "Hb", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!fw", name = "Kb", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!fw", name = "Jb", descriptor = "Loj;")
    public static class543 field5842;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "(I)V", line = 6)
    public static final void method2446(int arg0) {
        if (arg0 == 25923) {
            class460.field5850 = null;
            class395.field4987 = null;
            ++field5839;
            class705.field9941 = null;
            class100.field1353 = false;
            class207.field2621 = null;
            class169.field2208 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BF)V", line = 22)
    public final void method2447(byte arg0, float arg1) {
        ++field5843;
        if (arg0 != -71) {
            field5841 = 98;
        }
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field8804[super.field8812++] = (byte) var3;
        super.field8804[super.field8812++] = (byte) (var3 >> 8);
        super.field8804[super.field8812++] = (byte) (var3 >> 16);
        super.field8804[super.field8812++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(IZ)V", line = 39)
    public static final void method2448(int arg0, boolean arg1) {
        ++field5836;
        class592 var2 = class61.method371(9, arg0, (byte) -91);
        if (!arg1) {
            method2448(-120, true);
        }
        var2.method3253(0);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(FI)V", line = 53)
    public final void method2449(float arg0, int arg1) {
        ++field5840;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field8804[super.field8812++] = (byte) (var3 >> 24);
        super.field8804[super.field8812++] = (byte) (var3 >> 16);
        int var4 = -97 % ((-11 - arg1) / 35);
        super.field8804[super.field8812++] = (byte) (var3 >> 8);
        super.field8804[super.field8812++] = (byte) var3;
    }

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "(I)I", line = 79)
    public static final int method2450(int arg0) {
        ++field5838;
        int var1 = class347.field4449.method1226((byte) -106);
        if (arg0 != 20666) {
            return 40;
        } else {
            if (class487.field6450.length + -1 > var1) {
                class347.field4449 = class487.field6450[var1 - -1];
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(I)V", line = 96)
    public class458(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "(I)V", line = 99)
    public static void method2451(int arg0) {
        if (arg0 != 15775) {
            field5841 = -43;
        }
        field5842 = null;
    }
}
