import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class140 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lr;")
    public static class66 field2587 = class93.method641(43, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[I")
    public static int[] field2592 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field2595 = 0;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lr;")
    private static class66 field2601 = class93.method641(43, "Members object");

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lr;")
    public static class66 field2596 = field2601;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "J")
    public long field2586;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "La;")
    public class20 field2588;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "La;")
    public class20 field2593;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "La;")
    public class20 field2598;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lsg;")
    public static class247 field2583;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
    public static final boolean method967(int arg0, int arg1) {
        if (arg0 != 140) {
            field2592 = null;
        }
        field2599++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method968(int arg0) {
        field2583 = null;
        field2596 = null;
        field2592 = null;
        field2587 = null;
        if (arg0 == 156) {
            field2601 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIII)V")
    public static final void method969(byte arg0, int arg1, int arg2, int arg3) {
        field2597++;
        if (class61.field1030 != 0 && arg2 != 0 && class7.field64 < 50 && arg3 != -1) {
            class230.field3984[class7.field64] = arg3;
            class257.field4521[class7.field64] = arg2;
            class194.field3356[class7.field64] = arg1;
            class214.field3679[class7.field64] = null;
            class178.field3123[class7.field64] = 0;
            class7.field64++;
        }
        int var4 = 68 / ((59 - arg0) / 45);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
    public static final void method970(int arg0, int arg1) {
        field2591++;
        class114.field2162.method1611(-18767, arg0);
        class48.field867.method1611(-18767, arg0);
        if (arg1 != 0) {
            method969((byte) -5, 17, -8, 87);
        }
    }
}
