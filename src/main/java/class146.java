import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class146 implements class37 {

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "Luw;")
    private class197 field2046;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Lcp;")
    private class325 field2048;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BZ)V", line = 5)
    public final void method201(byte arg0, boolean arg1) {
        if (arg0 >= -74) {
            this.field2046 = null;
        }
        field2050++;
        class563 var3 = this.field2048.method2080(0, this.field2046.field2655);
        if (var3 == null) {
            return;
        }
        int var4 = this.field2046.field2656.method3281(false, class732.field10164, this.field2046.field2646) + this.field2046.field2649;
        int var5 = this.field2046.field2651.method779(this.field2046.field2650, class84.field1195, 14) + this.field2046.field2652;
        if (this.field2046.field2643) {
            class129.field1802.method1534(var4, var5, this.field2046.field2646, this.field2046.field2650, this.field2046.field2644, 0);
        }
        int var6 = var5 + this.method945(var5, class758.field10575, 5, var4, var3.field7820, 1) * 12;
        int var9 = var6 + 8;
        if (this.field2046.field2643) {
            class129.field1802.method1434(var4, var9, this.field2046.field2646 + var4 - 1, var9, this.field2046.field2644, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method945(var6, class758.field10575, 5, var4, var3.field7817, 1) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method945(var10, class758.field10575, 5, var4, var3.field7814, 1) * 12;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)Z", line = 37)
    public final boolean method202(byte arg0) {
        field2047++;
        if (arg0 > -46) {
            this.field2048 = null;
        }
        return this.field2048.method2081(2);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILda;IILjava/lang/String;I)I", line = 48)
    private final int method945(int arg0, class402 arg1, int arg2, int arg3, String arg4, int arg5) {
        field2049++;
        if (arg5 != 1) {
            this.method200(-111);
        }
        return arg1.method2503(0, 0, 0, this.field2046.field2639, null, this.field2046.field2650 - (arg2 * 2), null, arg3 + arg2, arg4, 0, 0, this.field2046.field2646 - (arg2 * 2), null, this.field2046.field2640, arg0 + arg2, 0);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 60)
    public final void method200(int arg0) {
        if (arg0 <= 12) {
            method947(124);
        }
        field2042++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZLhw;)Z", line = 70)
    public static final boolean method946(int arg0, boolean arg1, class616 arg2) {
        class474.field6574.method881(arg2.field8283[arg0], arg2.field8293[arg0], arg2.field8281[arg0], class563.field7811);
        if (arg1) {
            method946(-68, false, null);
        }
        field2043++;
        int var3 = class563.field7811[2];
        if (var3 < 50) {
            return false;
        } else {
            arg2.field8279[arg0] = (short) (class563.field7811[0] * class68.field1051 / var3 + class338.field4751);
            arg2.field8292[arg0] = (short) (class563.field7811[1] * class698.field9746 / var3 + class626.field8423);
            arg2.field8284[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)[Lal;", line = 94)
    public static final class125[] method947(int arg0) {
        field2044++;
        return arg0 >= -27 ? null : new class125[] { class471.field6531, class749.field10301, class123.field1649 };
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lcp;Luw;)V", line = 108)
    public class146(class325 arg0, class197 arg1) {
        this.field2046 = arg1;
        this.field2048 = arg0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIB)V", line = 117)
    public static final void method948(int arg0, int arg1, byte arg2) {
        field2045++;
        if (arg2 > -50) {
            method946(-89, false, null);
        }
        class346 var3 = class299.method1976(0, 13, arg0);
        var3.method2209(255);
        var3.field4926 = arg1;
    }
}
