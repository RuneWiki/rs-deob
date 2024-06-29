import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class283 extends class345 {

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "[I")
    public static int[] field4421 = new int[64];

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4419 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "[Lgo;")
    public static class313[] field4425 = new class313[14];

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Ljp;")
    public static class55 field4422 = new class55(52, 8);

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "J")
    public long field4418;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIII)V", line = 10)
    public static final void method1902(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class40.field667.field4192 * arg3 >> 8;
        field4412++;
        if (~arg2 == arg1 && !class326.field4938) {
            class241.method1621((byte) -125);
        } else if (arg2 != -1 && (class235.field3548 != arg2 || !class444.method2741(2730)) && var4 != 0 && !class326.field4938) {
            class495.method2967(var4, arg2, class417.field6135, 1, arg0, false, 0);
        }
        class235.field3548 = arg2;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I", line = 38)
    public final int method1903(int arg0) {
        if (arg0 == 11) {
            field4415++;
            return this.field4416;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)V", line = 49)
    public static void method1904(byte arg0) {
        field4421 = null;
        if (arg0 < -105) {
            field4419 = null;
            field4422 = null;
            field4425 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I", line = 62)
    public final int method1905(boolean arg0) {
        if (!arg0) {
            method1904((byte) -92);
        }
        field4413++;
        return this.field4410;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I", line = 73)
    public final int method1906(byte arg0) {
        if (arg0 != 0) {
            field4419 = null;
        }
        field4424++;
        return 0;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)I", line = 84)
    public final int method1907(int arg0) {
        if (arg0 <= 78) {
            this.method1905(true);
        }
        field4423++;
        return this.field4420;
    }

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)J", line = 106)
    public final long method1908(int arg0) {
        if (arg0 != 5) {
            field4421 = null;
        }
        field4417++;
        return this.field4418;
    }
}
