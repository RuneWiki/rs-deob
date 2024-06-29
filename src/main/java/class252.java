import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class252 extends class51 {

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "J")
    public static long field4345 = 0L;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Lpj;")
    private static class237 field4347 = class33.method353("Created gameworld", 56);

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field4339 = 0;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lpj;")
    public static class237 field4343 = field4347;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Lpj;")
    public static class237 field4348 = class33.method353("Zugewiesener Speicher)3", 107);

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "B")
    public static byte field4338;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "[I")
    public static int[] field4341;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "[Lgk;")
    public static class154[] field4342;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
    public static final void method1707(byte arg0, int arg1) {
        field4346++;
        if (class186.field3257 == null) {
            class186.field3257 = new byte[4][104][104];
        }
        if (arg1 != -5) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class186.field3257[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILpj;)I")
    public static final int method1708(int arg0, class237 arg1) {
        if (arg0 < 7) {
            return -4;
        } else {
            field4344++;
            return arg1.method1588(false) + 1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1709(int arg0) {
        field4341 = null;
        if (arg0 != 1) {
            field4348 = null;
        }
        field4347 = null;
        field4342 = null;
        field4343 = null;
        field4348 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILpj;)V")
    public static final void method1710(int arg0, int arg1, class237 arg2) {
        class270 var3 = class202.method1368(-15, 3, arg0);
        field4340++;
        var3.method1793(arg1 ^ 0x6650);
        if (arg1 == 26205) {
            var3.field4622 = arg2;
        }
    }
}
