import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class184 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Laj;")
    public static class71 field2671 = new class71(16);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
    public static volatile long field2677 = 0L;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2679 = "Loading textures - ";

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 8)
    public static final void method1343(int arg0) {
        class55.field889 = null;
        field2672++;
        class239.method1592(class149.field2288, 0, 0, 0, -1, class249.field3414, class258.field3488, 0, (byte) -120);
        if (class55.field889 != null) {
            class147.method1136(class256.field3463, class406.field5639, class291.field3953.field2128, arg0 - 18285, 0, class55.field889, class258.field3488, 0, class249.field3414, -1412584499);
            class55.field889 = null;
        }
        if (arg0 != 18412) {
            method1346((byte) 58);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V", line = 39)
    public static final void method1344(int arg0, int arg1) {
        field2673++;
        if (arg0 > -85) {
            field2675 = -8;
        }
        class450 var2 = class59.method540(6, arg1, 1000);
        var2.method2798(-664528978);
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)I", line = 57)
    public static final int method1345(int arg0) {
        field2676++;
        if (class387.field5455) {
            return 0;
        }
        if (arg0 <= 11) {
            method1343(-120);
        }
        if (class339.method2153(9)) {
            return class173.field2554 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V", line = 76)
    public static void method1346(byte arg0) {
        int var1 = 6 % ((arg0 + 25) / 49);
        field2679 = null;
        field2671 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 86)
    public static final void method1347(boolean arg0) {
        if (!arg0) {
            field2678++;
            class450 var1 = class59.method540(15, 0, 1000);
            var1.method2798(-664528978);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    public abstract void method535(byte arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZILhh;Lpe;III)V")
    public abstract void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILpe;)V")
    public abstract void method581(int arg0, class391 arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILpe;I)Z")
    public abstract boolean method583(int arg0, int arg1, class391 arg2, int arg3);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
    public abstract boolean method537(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lpe;B)Lca;")
    public abstract class415 method572(class391 arg0, byte arg1);
}
