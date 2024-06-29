import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class179 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    private int field2359;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Ldq;")
    public static class493 field2363 = new class493(109, 3);

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2366 = -1;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
    public static int[] field2367 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class277[] var7 = class147.field1869;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class277 var9 = var7[var8];
            if (var9 != null && var9.field3508 == 2) {
                class275.method1621(arg1 >> 1, arg5, arg3, var9.field3507, var9.field3501, arg4 + 37332, arg6 >> 1, var9.field3503, var9.field3512 * 2);
                if (class46.field558[0] > -1 && (class163.field2065 % 20) < 10) {
                    class293.field3739[var9.field3506].method130(arg2 - (12 - class46.field558[0]), arg0 + -28 - -class46.field558[1]);
                }
            }
        }
        if (arg4 != -11745) {
            method1145(-106, 85, 44);
        }
        field2365++;
    }

    @OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;", line = 35)
    public final String toString() {
        field2364++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 47)
    public static void method1142(boolean arg0) {
        field2363 = null;
        if (arg0) {
            method1142(false);
        }
        field2367 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I", line = 60)
    public final int method1143(byte arg0) {
        int var2 = 26 % ((arg0 - 81) / 43);
        field2361++;
        return this.field2359;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V", line = 71)
    public class179(int arg0, int arg1) {
        this.field2359 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I", line = 85)
    public static final int method1144(int arg0, int arg1) {
        field2360++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 != 18609) {
                method1142(true);
            }
            return class467.method2818(arg0 ^ 0x182, arg1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z", line = 103)
    public static final boolean method1145(int arg0, int arg1, int arg2) {
        field2362++;
        if (arg1 != 22136) {
            method1142(false);
        }
        return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }
}
