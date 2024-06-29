import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class181 extends class198 {

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2804 = "wave2:";

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[I")
    public static int[] field2807 = new int[32];

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        ++field2803;
        class100.field1502.method145(-122);
        if (arg0 != 2) {
            method1204(53);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lfa;Lfa;ZZ)V")
    public static final void method1205(class273 arg0, class273 arg1, boolean arg2, boolean arg3) {
        class162.field2557 = arg1;
        ++field2806;
        if (arg3) {
            field2804 = null;
        }
        class162.field2555 = arg0;
        class248.field3946 = arg2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIBI)V")
    public static final void method1206(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class36 var5 = class161.method1067(8, arg4, (byte) 81);
        var5.method219(arg3 ^ 107);
        var5.field461 = arg1;
        if (arg3 != -83) {
            field2804 = null;
        }
        var5.field465 = arg0;
        var5.field458 = arg2;
        ++field2801;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static void method1207(boolean arg0) {
        field2804 = null;
        field2807 = null;
        if (arg0) {
            method1205((class273) null, (class273) null, false, false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class181() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        ++field2802;
        class66.field974.method145(-128);
        if (arg0 >= -26) {
            method1206(101, -46, 104, (byte) 48, -105);
        }
        class50.field682.method145(-127);
        class276.field4561.method145(-110);
        class264.field4353.method145(-121);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field2805;
        if (!arg0) {
            this.method32(false, 127);
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[][] var4 = this.method1372(0, arg1, (byte) -98);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            for (int var8 = 0; ~class42.field590 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }
}
