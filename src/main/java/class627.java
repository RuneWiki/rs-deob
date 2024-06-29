import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class627 extends class128 {

    @OriginalMember(owner = "client!go", name = "i", descriptor = "[I")
    public static int[] field8771 = new int[120];

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field8770;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8771[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIZIII)V", line = 5)
    public static final void method3541(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field8768++;
        int var8 = arg1 + arg5;
        int var9 = arg6 - arg1;
        for (int var10 = arg5; var10 < var8; var10++) {
            class168.method980(arg0, class300.field4036[var10], arg3, arg2, (byte) 96);
        }
        int var11 = arg2 - arg1;
        for (int var12 = arg6; var12 > var9; var12--) {
            class168.method980(arg0, class300.field4036[var12], arg3, arg2, (byte) 91);
        }
        if (arg4) {
            field8771 = null;
        }
        int var13 = arg1 + arg3;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class300.field4036[var14];
            class168.method980(arg0, var15, arg3, var13, (byte) 100);
            class168.method980(arg7, var15, var13, var11, (byte) -124);
            class168.method980(arg0, var15, var11, arg2, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILni;)Lgga;", line = 59)
    public static final class294 method3542(int arg0, int arg1, int arg2, class522 arg3) {
        field8769++;
        class611 var4 = new class611(arg3.method2885(arg0, arg1, false));
        class294 var5 = new class294(arg0, var4.method3403((byte) 84), var4.method3403((byte) 84), var4.method3418(-2), var4.method3418(-2), var4.method3428((byte) -119) == 1, var4.method3428((byte) 126), var4.method3428((byte) 28));
        int var6 = var4.method3428((byte) 116);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field3939.method725(new class317(var4.method3428((byte) -122), var4.method3402((byte) 127), var4.method3402((byte) 127), var4.method3402((byte) 127), var4.method3402((byte) 127), var4.method3402((byte) 127), var4.method3402((byte) 127), var4.method3402((byte) 127), var4.method3402((byte) 127)), -20911);
        }
        var5.method1758(-1);
        if (arg2 != 10443) {
            field8771 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lkaa;IIIZ)V", line = 86)
    public static final void method3543(class48 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8767++;
        long var5 = (long) (arg1 << 28 | arg2 << 14 | arg3);
        class270 var7 = (class270) class472.field6537.method2552(var5, -1);
        if (var7 == null) {
            class270 var8 = new class270();
            class472.field6537.method2558(var8, var5, -1);
            var8.field3567.method725(arg0, -20911);
            return;
        }
        class697 var9 = class761.field10628.method4169(arg0.field491, (byte) -117);
        int var10 = var9.field9813;
        if (var9.field9806 == 1) {
            var10 = (arg0.field493 + 1) * var10;
        }
        for (class48 var11 = (class48) var7.field3567.method724(32); var11 != null; var11 = (class48) var7.field3567.method723(102)) {
            class697 var12 = class761.field10628.method4169(var11.field491, (byte) -126);
            int var13 = var12.field9813;
            if (var12.field9806 == 1) {
                var13 = (var11.field493 + 1) * var13;
            }
            if (var10 > var13) {
                class242.method1453(var11, arg0, (byte) 24);
                return;
            }
        }
        if (!arg4) {
            method3544(true);
        }
        var7.field3567.method725(arg0, -20911);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V", line = 140)
    public static void method3544(boolean arg0) {
        field8771 = null;
        if (arg0) {
            field8771 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Lhw;")
    public abstract class132 method145(byte arg0);
}
