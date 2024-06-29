import jaggl.memory.NativeBuffer;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class183 extends class322 implements class525 {

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    private int field2745;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "[Lln;")
    public static class256[] field2747 = new class256[2048];

    @OriginalMember(owner = "client!s", name = "x", descriptor = "Lrn;")
    public static class174 field2748 = new class174(9, 7);

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Lef;")
    public static class335 field2750 = new class335(14, 0, 4, 1);

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lvj;I[BIZ)V", line = 11)
    public class183(class303 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2745 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V", line = 19)
    public final void method1282(boolean arg0) {
        super.field4917.method1975(-124, this);
        ++field2744;
        if (arg0) {
            this.method604((byte) -85);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([BIII)V", line = 32)
    public final void method603(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 19049) {
            this.method2097(arg0, arg1, 35040);
            ++field2741;
            this.field2745 = arg3;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)I", line = 44)
    public final int method604(byte arg0) {
        if (arg0 != 35) {
            return 7;
        } else {
            ++field2742;
            return super.field4914;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lvj;ILjaggl/memory/NativeBuffer;IZ)V", line = 57)
    public class183(class303 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2745 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V", line = 65)
    public static void method1283(byte arg0) {
        field2747 = null;
        field2750 = null;
        field2748 = null;
        if (arg0 >= -20) {
            field2750 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)J", line = 78)
    public final long method602(int arg0) {
        ++field2738;
        if (arg0 != -16182) {
            field2735 = 43;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V", line = 89)
    public static final void method1284(byte arg0) {
        class380.field5726.method1586((byte) -126);
        ++field2749;
        class166.field2579.method1017((byte) -26);
        if (class477.field7122 != null) {
            class477.field7122.method2830(73, class370.field5611);
        }
        class19.field322.method2727(-87);
        class370.field5611.setBackground(Color.black);
        class246.field3550 = -1;
        int var1 = -31 / ((arg0 - 74) / 37);
        class380.field5726 = class304.method1997(class370.field5611, 123);
        class166.field2579 = class151.method1153(class370.field5611, (byte) 54, true);
        if (class477.field7122 != null) {
            class477.field7122.method2829(class370.field5611, -29157);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)I", line = 111)
    public final int method601(int arg0) {
        if (arg0 != 536) {
            field2748 = null;
        }
        ++field2739;
        return this.field2745;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbu;B)I", line = 122)
    public static final int method1285(class17 arg0, byte arg1) {
        ++field2737;
        int var2 = 0;
        if (arg1 != -112) {
            return -17;
        } else {
            if (arg0.method129(true, class127.field2029)) {
                ++var2;
            }
            if (arg0.method129(true, class318.field4783)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 149)
    public static final void method1286(int arg0) {
        ++field2740;
        class8.field143 = 0;
        int var1 = (class139.field2224.field6228 >> 7) + class200.field2931;
        int var2 = (class139.field2224.field6233 >> 7) + class403.field6059;
        if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && var2 <= 3136) {
            class8.field143 = 1;
        }
        if (arg0 != 25476) {
            method1286(-76);
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class8.field143 = 1;
        }
        if (~class8.field143 == -2 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class8.field143 = 0;
        }
    }
}
