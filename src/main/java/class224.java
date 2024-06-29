import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class224 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field3145 = 1337;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "[I")
    public static int[] field3148 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "Lmha;")
    public static class701 field3147 = new class701(10, 2, 2, 0);

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "Lju;")
    public static class102 field3149 = new class102(48, 12);

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Ljf;")
    public static class640 field3150 = new class640(1, 8);

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public static void method1455(boolean arg0) {
        field3150 = null;
        field3148 = null;
        field3149 = null;
        field3147 = null;
        if (arg0) {
            method1457((byte) 114);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(JI)V")
    public static final void method1456(long arg0, int arg1) {
        if (class352.field4549 != null) {
            if (class665.field9377 == 1 || class665.field9377 == 5) {
                class479.method2830((byte) -63, arg0);
            } else if (class665.field9377 == 4) {
                class260.method1617(arg0, (byte) -52);
            }
        }
        field3144++;
        class136.method884((byte) -28, (long) class245.field3409, class96.field1401);
        if (class312.field4004 != -1) {
            class370.method2063(class312.field4004, arg1 - 1);
        }
        for (int var3 = 0; var3 < class752.field10450; var3++) {
            if (class142.field1966[var3]) {
                class523.field7346[var3] = true;
            }
            class513.field7167[var3] = class142.field1966[var3];
            class142.field1966[var3] = false;
        }
        class217.field3073 = class245.field3409;
        class38.method265(-1, -1, null, (byte) -3);
        class172.method1073(-1, null, -1, (byte) 46);
        if (class312.field4004 != -1) {
            class752.field10450 = 0;
            class310.method1814((byte) -53);
        }
        class96.field1401.method2198();
        class217.method1421(class96.field1401, 1);
        int var4 = class474.method2817(~arg1);
        if (var4 == -1) {
            var4 = class565.field8033;
        }
        if (var4 == -1) {
            var4 = class623.field8898;
        }
        class156.method987(true, var4);
        int var5 = class473.field6483.method3470(-1) << 8;
        class456.method2738(class473.field6483.field9489 + var5, 3, class284.field3763, class473.field6483.field9490 + var5, class473.field6483.field9501);
        class284.field3763 = arg1;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)J")
    public static final synchronized long method1457(byte arg0) {
        if (arg0 != -62) {
            field3148 = null;
        }
        field3146++;
        long var1 = System.currentTimeMillis();
        if (var1 < class733.field10258) {
            class490.field6591 += class733.field10258 - var1;
        }
        class733.field10258 = var1;
        return class490.field6591 + var1;
    }
}
