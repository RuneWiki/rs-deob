import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class151 {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Z")
    public static boolean field2470 = true;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2474 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public int field2473;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[Lbf;")
    public static class102[] field2467;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
    public static final void method1097(int arg0, boolean arg1) {
        class22.field343 = arg0;
        field2472++;
        class80.field1326 = -1;
        class80.field1326 = -1;
        if (!arg1) {
            field2474 = -34;
        }
        class11.method72(!arg1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lsb;Lsb;B)I")
    public static final int method1098(class124 arg0, class124 arg1, byte arg2) {
        int var3 = 0;
        if (arg1.method899(class193.field3168, -90)) {
            var3++;
        }
        if (arg1.method899(class212.field3395, -89)) {
            var3++;
        }
        if (arg1.method899(class157.field2554, arg2 ^ 0x75)) {
            var3++;
        }
        if (arg0.method899(class193.field3168, -81)) {
            var3++;
        }
        if (arg0.method899(class212.field3395, arg2 - 100)) {
            var3++;
        }
        if (arg2 != -21) {
            return 67;
        }
        if (arg0.method899(class157.field2554, -88)) {
            var3++;
        }
        field2468++;
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static final void method1099(int arg0) {
        field2469++;
        class100.field1533.method919(-8);
        for (int var1 = 0; var1 < 32; var1++) {
            class76.field1242[var1] = 0L;
        }
        if (arg0 <= 94) {
            field2470 = true;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class273.field4371[var2] = 0L;
        }
        class100.field1514 = 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2476++;
        int var6 = (arg5 - 32) * arg5 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg4 / (arg0 - arg5);
        class253.field4024[0].method588(arg2, arg1);
        class253.field4024[1].method588(arg2, arg1 + arg5 - 16);
        class63.method493(arg2, arg1 + 16, 16, arg5 - 32, class20.field308);
        class63.method493(arg2, arg1 + var7 + 16, 16, var6, class218.field3506);
        class63.method481(arg2, arg1 + var7 + 16, var6, class110.field1704);
        class63.method481(arg2 + 1, var7 + 16 + arg1, var6, class110.field1704);
        if (arg3 != -26118) {
            field2474 = 28;
        }
        class63.method485(arg2, arg1 + var7 + 16, 16, class110.field1704);
        class63.method485(arg2, arg1 + var7 + 17, 16, class110.field1704);
        class63.method481(arg2 + 15, arg1 + var7 - -16, var6, class66.field1071);
        class63.method481(arg2 + 14, arg1 + 17 - -var7, var6 - 1, class66.field1071);
        class63.method485(arg2, var7 + var6 + arg1 + 15, 16, class66.field1071);
        class63.method485(arg2 + 1, arg1 - -14 - -var7 + var6, 15, class66.field1071);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2467 = null;
        if (arg0 != 14276) {
            method1101(92);
        }
    }
}
