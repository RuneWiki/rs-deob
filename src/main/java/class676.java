import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class676 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
    public static int[] field9442 = new int[6];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)I", line = 3)
    public final int method3841(int arg0, int arg1, byte arg2) {
        field9440++;
        int var4 = class546.field7710 > arg0 ? class546.field7710 : arg0;
        int var5 = 39 / ((arg2 + 39) / 42);
        if (class733.field10227 == this) {
            return 0;
        } else if (class416.field5871 == this) {
            return var4 - arg1;
        } else if (class409.field5775 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILjava/util/Random;)I", line = 25)
    public static final int method3842(int arg0, int arg1, Random arg2) {
        field9445++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class143.method891(arg1, 0)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            if (arg0 != -28737) {
                method3845(null, false, (byte) 77);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class304.method1837((byte) 6, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILoia;IIII)Z", line = 54)
    public static final boolean method3843(int arg0, int arg1, class90 arg2, int arg3, int arg4, int arg5, int arg6) {
        field9441++;
        if (arg3 != 0) {
            field9444 = 76;
        }
        if (!class314.field4236 || !class232.field2988) {
            return false;
        } else if (class51.field536 < 100) {
            return false;
        } else if (arg0 != arg4 || arg1 != arg5) {
            for (int var7 = arg0; var7 <= arg4; var7++) {
                for (int var8 = arg1; var8 <= arg5; var8++) {
                    if (class435.field6105[arg6][var7][var8] == -class13.field85) {
                        return false;
                    }
                }
            }
            if (class503.method2808(arg2, (byte) 112)) {
                class460.field6373++;
                return true;
            } else {
                return false;
            }
        } else if (!class161.method954((byte) 105, arg6, arg1, arg0)) {
            return false;
        } else if (class503.method2808(arg2, (byte) 86)) {
            class460.field6373++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 122)
    public static void method3844(byte arg0) {
        if (arg0 != -60) {
            field9444 = 107;
        }
        field9442 = null;
    }

    @OriginalMember(owner = "client!ee", name = "toString", descriptor = "()Ljava/lang/String;", line = 135)
    public final String toString() {
        field9446++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsba;ZB)V", line = 143)
    public static final void method3845(class218 arg0, boolean arg1, byte arg2) {
        field9443++;
        int var3 = arg0.field2756 == 0 ? arg0.field2781 : arg0.field2756;
        int var4 = arg0.field2687 == 0 ? arg0.field2718 : arg0.field2687;
        class700.method3955(arg1, class357.field4742[arg0.field2708 >> 16], var3, true, var4, arg0.field2708);
        int var5 = -112 % ((3 - arg2) / 40);
        if (arg0.field2816 != null) {
            class700.method3955(arg1, arg0.field2816, var3, true, var4, arg0.field2708);
        }
        class526 var6 = (class526) class520.field6994.method2552((long) arg0.field2708, -1);
        if (var6 != null) {
            class375.method2206(var3, var6.field7062, -1, arg1, var4);
        }
    }
}
