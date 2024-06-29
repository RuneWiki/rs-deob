import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class651 extends class583 {

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "Lqga;")
    public class182 field8947;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "Lgda;")
    public static class53 field8944 = new class53(77, 1);

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "[[[B")
    public static byte[][][] field8948;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 6)
    public static void method3585(int arg0) {
        if (arg0 <= -5) {
            field8944 = null;
            field8948 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB)Z", line = 20)
    public static final boolean method3586(int arg0, int arg1, byte arg2) {
        field8946++;
        if (arg2 <= 108) {
            method3587((byte) -25, null);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLbda;)I", line = 31)
    public static final int method3587(byte arg0, class505 arg1) {
        field8945++;
        if (class499.field7165 == arg1) {
            return 6407;
        } else if (class165.field2263 == arg1) {
            return 6408;
        } else if (class233.field3143 == arg1) {
            return 6406;
        } else if (class91.field1081 == arg1) {
            return 6409;
        } else if (class403.field5708 == arg1) {
            return 6410;
        } else if (class413.field5819 == arg1) {
            return 6145;
        } else {
            if (arg0 >= -79) {
                method3588(109, 106, 79, -45, -76, 102, null);
            }
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIILha;)V", line = 66)
    public static final void method3588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6) {
        field8943++;
        if ((class681.field9344 == null || class166.field2285 == null || class426.field5985 == null) && class374.field5245.method2088(class317.field4399, 118) && class374.field5245.method2088(class98.field1183, 98) && class374.field5245.method2088(class186.field2512, 124)) {
            class204 var7 = class204.method1237(class374.field5245, class98.field1183, 0);
            class166.field2285 = arg6.method484(var7, true);
            var7.method1239();
            class213.field2811 = arg6.method484(var7, true);
            class681.field9344 = arg6.method484(class204.method1237(class374.field5245, class317.field4399, 0), true);
            class204 var8 = class204.method1237(class374.field5245, class186.field2512, 0);
            class426.field5985 = arg6.method484(var8, true);
            var8.method1239();
            class648.field8916 = arg6.method484(var8, true);
        }
        if (class681.field9344 != null && class166.field2285 != null && class426.field5985 != null) {
            int var9 = (arg1 - class426.field5985.method657() * 2) / class681.field9344.method657();
            for (int var10 = 0; var10 < var9; var10++) {
                class681.field9344.method658(arg5 + class426.field5985.method657() + var10 * class681.field9344.method657(), -class681.field9344.method663() + arg4 + arg2);
            }
            int var11 = (arg4 - class426.field5985.method663() - arg0) / class166.field2285.method663();
            for (int var12 = 0; var12 < var11; var12++) {
                class166.field2285.method658(arg5, arg0 + arg2 + (var12 * class166.field2285.method663()));
                class213.field2811.method658(arg1 + arg5 - class213.field2811.method657(), class166.field2285.method663() * var12 + arg0 + arg2);
            }
            class426.field5985.method658(arg5, arg2 + (arg4 - class426.field5985.method663()));
            class648.field8916.method658(arg1 + arg5 - class426.field5985.method657(), -class426.field5985.method663() + (arg2 - -arg4));
        }
        if (arg3 != 0) {
            field8944 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lqga;)V", line = 122)
    public class651(class182 arg0) {
        this.field8947 = arg0;
    }
}
