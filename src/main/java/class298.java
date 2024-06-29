import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class298 extends class264 {

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "[I")
    public static int[] field4333 = new int[1000];

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "Lbt;")
    public static class363 field4339 = new class363(64);

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "[Les;")
    public static class301[] field4344 = new class301[29];

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "F")
    public float field4335;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
    public static void method1980(byte arg0) {
        field4333 = null;
        field4344 = null;
        if (arg0 != -61) {
            field4339 = null;
        }
        field4339 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZB)V")
    public static final void method1981(boolean arg0, byte arg1) {
        class289.method1934(class375.field5473, arg0, class318.field4672, -60, class214.field3016);
        if (arg1 <= -38) {
            field4340++;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)I")
    public static final int method1982(int arg0, int arg1, int arg2) {
        field4334++;
        if (arg1 == 1 || arg1 == 3) {
            return class304.field4463[arg2 & 0x3];
        } else if (arg0 == 18920) {
            return class15.field235[arg2 & 0x3];
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
    public static final void method1983(byte arg0) {
        class215.field3047.method2307(-65);
        if (arg0 <= -57) {
            field4341++;
            class403.field5830.method2307(88);
        }
    }
}
