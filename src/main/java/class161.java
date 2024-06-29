import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class161 {

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "[I")
    public static int[] field2544 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[B")
    public static byte[] field2540 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "J")
    public long field2539;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Ltf;")
    public class161 field2536;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Ltf;")
    public class161 field2537;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1119(int arg0) {
        class52 var1 = class248.field4056;
        synchronized (class248.field4056) {
            if (arg0 < 52) {
                method1119(66);
            }
            class248.field4056.method335((byte) -75);
        }
        field2543++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 23)
    public final void method1120(int arg0) {
        field2535++;
        if (this.field2536 == null) {
            return;
        }
        int var2 = 37 / ((arg0 + 15) / 56);
        this.field2536.field2537 = this.field2537;
        this.field2537.field2536 = this.field2536;
        this.field2536 = null;
        this.field2537 = null;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 48)
    public static final void method1121(int arg0) {
        class52 var1 = class216.field3527;
        synchronized (class216.field3527) {
            if (arg0 != 2) {
                method1119(95);
            }
            class216.field3527.method335((byte) -118);
        }
        field2534++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIIIII)V", line = 61)
    public static final void method1122(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2538++;
        int var7 = arg4 + arg5;
        int var8 = arg0 - arg5;
        for (int var9 = arg4; var9 < var7; var9++) {
            class256.method1769(arg3, class277.field4414[var9], (byte) 95, arg6, arg2);
        }
        int var10 = arg0;
        if (arg1) {
            method1119(0);
        }
        while (var10 > var8) {
            class256.method1769(arg3, class277.field4414[var10], (byte) 99, arg6, arg2);
            var10--;
        }
        int var11 = arg2 + arg5;
        int var12 = arg3 - arg5;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class277.field4414[var13];
            class256.method1769(var11, var14, (byte) 67, arg6, arg2);
            class256.method1769(arg3, var14, (byte) 102, arg6, var12);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z", line = 107)
    public final boolean method1123(byte arg0) {
        if (arg0 <= 55) {
            method1119(91);
        }
        field2542++;
        return this.field2536 != null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lmo;Z)V", line = 123)
    public static final void method1124(class447 arg0, boolean arg1) {
        field2541++;
        class331.field5181 = arg0;
        if (!arg1) {
            field2540 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 137)
    public static void method1125(boolean arg0) {
        field2540 = null;
        if (!arg0) {
            method1125(true);
        }
        field2544 = null;
    }
}
