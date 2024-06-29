import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class142 extends class248 {

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field2484 = -1;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lij;")
    public static class50 field2489 = class78.method578(123, "Fallen lassen");

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lij;")
    public static class50 field2488 = class78.method578(123, ": ");

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "[I")
    public static int[] field2494 = new int[2];

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lij;")
    private static class50 field2482 = class78.method578(124, "Loading title screen )2 ");

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "[I")
    public static int[] field2496 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lij;")
    public static class50 field2491 = field2482;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "B")
    public byte field2481;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Lwi;")
    public class21 field2487;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Lwi;")
    public static class21 field2495;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIZII)V")
    public static final void method990(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class224.field3772 = arg0;
        class249.field4328 = arg3;
        class243.field4234 = arg2;
        class29.field607 = arg5;
        field2490++;
        class69.field1317 = arg6;
        if (arg4 && class69.field1317 >= 100) {
            class32.field644 = class243.field4234 * 128 + 64;
            class1.field15 = class224.field3772 * 128 + 64;
            class129.field2268 = class187.method1260((byte) 74, class32.field644, class1.field15, class201.field3312) - class249.field4328;
        }
        class130.field2291 = 2;
        if (arg1 != -29111) {
            method991(34);
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Lre;")
    public static final class148 method991(int arg0) {
        field2485++;
        if (arg0 >= -69) {
            method995(-29, -16);
        }
        try {
            return (class148) Class.forName("mj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class157();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class255 var8 = new class255();
        var8.field4418 = arg2 / 128;
        var8.field4423 = arg3 / 128;
        var8.field4427 = arg4 / 128;
        var8.field4426 = arg5 / 128;
        var8.field4422 = arg1;
        var8.field4430 = arg2;
        var8.field4407 = arg3;
        var8.field4416 = arg4;
        var8.field4401 = arg5;
        var8.field4409 = arg6;
        var8.field4405 = arg7;
        class61.field1131[arg0][class61.field1122[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2494 = null;
        field2491 = null;
        field2482 = null;
        field2496 = null;
        field2489 = null;
        field2488 = null;
        if (arg0 > -86) {
            method990(-101, -14, -116, 113, false, -8, 126);
        }
        field2495 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B[I)[I")
    public static final int[] method994(byte arg0, int[] arg1) {
        int var2 = 112 % ((arg0 - 21) / 45);
        field2492++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var3 = new int[arg1.length];
            class105.method791(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Ldk;")
    public static final class123 method995(int arg0, int arg1) {
        if (arg1 != 2) {
            method992(-96, -48, -65, 92, -83, 48, -116, -51);
        }
        field2483++;
        class123 var2 = (class123) class252.field4379.method912((long) arg0, (byte) 50);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class133.field2331.method190((byte) -103, arg0, 26);
        class123 var4 = new class123();
        if (var3 != null) {
            var4.method895(new class217(var3), 30);
        }
        class252.field4379.method913(var4, 102, (long) arg0);
        return var4;
    }
}
