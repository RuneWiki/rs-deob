import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class171 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field2797 = 0;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lra;")
    public static class253 field2801 = new class253();

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[I")
    public static int[] field2802 = new int[32];

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static void method1209(boolean arg0) {
        field2801 = null;
        if (!arg0) {
            field2803 = -5;
        }
        field2802 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[II[IB)V")
    public static final void method1210(int arg0, int[] arg1, int arg2, int[] arg3, byte arg4) {
        if (arg0 > arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if ((var9 & 0x1) + var7 < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method1210(var6 - 1, arg1, arg2, arg3, (byte) 57);
            method1210(arg0, arg1, var6 + 1, arg3, (byte) 69);
        }
        field2799++;
        if (arg4 < 12) {
            field2803 = 51;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BILfj;)V")
    private final void method1211(byte arg0, int arg1, class274 arg2) {
        if (arg0 < 21) {
            this.field2797 = 98;
        }
        field2796++;
        if (arg1 == 5) {
            this.field2797 = arg2.method1837(252);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLfj;)V")
    public final void method1212(byte arg0, class274 arg1) {
        if (arg0 < 37) {
            field2802 = null;
        }
        field2800++;
        while (true) {
            int var3 = arg1.method1849(255);
            if (var3 == 0) {
                return;
            }
            this.method1211((byte) 111, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)J")
    public static final long method1213(byte arg0) {
        field2798++;
        int var1 = -78 % ((arg0 - 9) / 45);
        return class195.field3156.method273((byte) -106);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2802[var1] = var0 - 1;
            var0 += var0;
        }
        field2804 = 0;
    }
}
