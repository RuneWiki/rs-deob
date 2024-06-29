import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class147 extends class80 {

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lr;")
    public static class66 field2671 = class93.method641(43, "");

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[Lba;")
    public static class259[] field2675 = new class259[500];

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Lr;")
    public static class66 field2678 = class93.method641(43, "event_opbase");

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field2681 = 99;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Ljk;")
    public static class196 field2674;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Lsg;")
    public class247 field2682;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Lp;")
    public class86 field2677;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[B")
    public byte[] field2672;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "[I")
    public static int[] field2679;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Z")
    public static final boolean method1010(byte arg0) {
        field2676++;
        class252 var1 = class218.field3747;
        synchronized (class218.field3747) {
            if (class95.field1836 == class73.field1447) {
                return false;
            } else {
                class78.field1543 = class15.field184[class73.field1447];
                class107.field2052 = class160.field2867[class73.field1447];
                class73.field1447 = class73.field1447 + 1 & 0x7F;
                return arg0 == 111;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2675 = null;
        field2679 = null;
        field2671 = null;
        int var1 = -53 % ((arg0 - 33) / 49);
        field2674 = null;
        field2678 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1012(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2680++;
        if (arg4 >= class165.field2972 && arg4 <= class215.field3706 && class165.field2972 <= arg0 && arg0 <= class215.field3706 && arg9 >= class165.field2972 && arg9 <= class215.field3706 && arg5 >= class165.field2972 && class215.field3706 >= arg5 && class241.field4186 <= arg2 && class222.field3788 >= arg2 && class241.field4186 <= arg3 && class222.field3788 >= arg3 && arg6 >= class241.field4186 && class222.field3788 >= arg6 && class241.field4186 <= arg8 && arg8 <= class222.field3788) {
            class73.method519(arg5, -99, arg6, arg0, arg2, arg4, arg7, arg3, arg9, arg8);
        } else {
            class1.method6(arg2, arg9, arg0, 1580177356, arg8, arg6, arg3, arg5, arg4, arg7);
        }
        if (arg1 > -80) {
            field2671 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lsg;BLp;I)V")
    public static final void method1013(class247 arg0, byte arg1, class86 arg2, int arg3) {
        field2673++;
        class147 var4 = new class147();
        int var5 = 4 / ((-arg1 - 78) / 32);
        var4.field2684 = 1;
        var4.field2682 = arg0;
        var4.field1560 = (long) arg3;
        var4.field2677 = arg2;
        class125 var6 = class256.field4499;
        synchronized (class256.field4499) {
            class256.field4499.method866(var4, true);
        }
        class57.method377(600);
    }
}
