import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public abstract class class729 extends class454 {

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "Z")
    public volatile boolean field10169 = true;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "[Z")
    public static boolean[] field10167 = new boolean[200];

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "Laq;")
    public static class494 field10165 = new class494(32);

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "Z")
    public boolean field10170;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "Z")
    public boolean field10172;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)Z")
    public static final boolean method4050(int arg0, int arg1) {
        if (arg0 < 91) {
            method4051(null, null, true);
        }
        field10166++;
        return arg1 == 15 || arg1 == 12 || arg1 == 1001 || arg1 == 57 || arg1 == 53;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)I")
    public abstract int method715(int arg0);

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([[BLqv;Z)V")
    public static final void method4051(byte[][] arg0, class79 arg1, boolean arg2) {
        field10168++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class431 var11 = new class431(var10);
                int var12 = class12.field156[var5] >> 8;
                int var13 = class12.field156[var5] & 0xFF;
                int var14 = var12 * 64 - class222.field3266;
                int var15 = var13 * 64 - class697.field9798;
                class193.method1378(-112);
                arg1.method4205((byte) 80, class697.field9798, class222.field3266, var15, var11, var14, class605.field8591);
                arg1.method703(var11, (byte) 104, class686.field9702, var15, var14, var3);
                if (!arg1.field10544 && (class732.field10181 / 8) == var12 && (class263.field3718 / 8) == var13 && var3[0] != -1) {
                    class283.field4157 = class648.field9192.method2360(var3[0], 29, var3[3], var3[1], class606.field8616, var3[2]);
                    class250.field3603 = var3[4];
                }
            }
        }
        if (arg2) {
            method4052((byte) -59, null);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class12.field156[var6] >> 8) * 64 - class222.field3266;
            int var8 = (class12.field156[var6] & 0xFF) * 64 - class697.field9798;
            byte[] var9 = arg0[var6];
            if (var9 == null && class263.field3718 < 800) {
                class193.method1378(117);
                arg1.method4204(-64, var8, var7, 64, 64);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLuf;)V")
    public static final void method4052(byte arg0, class519 arg1) {
        field10171++;
        if (!class295.field4298) {
            return;
        }
        class252.field3617++;
        if (arg1.field7271 != null) {
            class519 var2 = class153.method1203(0, class65.field979, class568.field7906);
            if (var2 != null) {
                class511 var3 = new class511();
                var3.field7026 = var2;
                var3.field7021 = arg1.field7271;
                var3.field7023 = arg1;
                class46.method357(var3);
            }
        }
        class302 var4 = class582.method3419(class383.field5379, (byte) 127, class626.field8901);
        var4.field4341.method2548(arg1.field7247, (byte) -87);
        var4.field4341.method2559(class121.field2051, 113);
        var4.field4341.method2559(class65.field979, 118);
        var4.field4341.method2546(true, arg1.field7129);
        var4.field4341.method2542(337533360, class568.field7906);
        var4.field4341.method2559(arg1.field7193, 117);
        if (arg0 == 107) {
            class501.method2928(0, var4);
        }
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)V")
    public static void method4053(int arg0) {
        field10167 = null;
        if (arg0 != 0) {
            field10165 = null;
        }
        field10165 = null;
    }

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "(I)[B")
    public abstract byte[] method713(int arg0);
}
