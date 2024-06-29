import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class600 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Ldg;")
    public static class376 field8479 = new class376(48, 4);

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
    public static boolean field8481 = false;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lli;")
    public static class392 field8482 = new class392();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "J")
    public static long field8484;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lau;")
    public static class685 field8483;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)V", line = 5)
    public static final void method3393(int arg0, int arg1, byte arg2) {
        field8478++;
        if (arg2 != -7) {
            field8484 = -24L;
        }
        class191 var3 = class6.method38(14, arg2 ^ 0x76, arg1);
        var3.method1285((byte) -1);
        var3.field2754 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 19)
    public static void method3394(boolean arg0) {
        if (!arg0) {
            method3395(-65, -100, -50, 40, 124, 116);
        }
        field8483 = null;
        field8479 = null;
        field8482 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V", line = 38)
    public static final void method3395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8480++;
        int var9 = arg2 + 1;
        class58.method623(arg1, arg4, 23309, class651.field9125[arg2], arg3);
        int var10002 = arg5 + 14811;
        int var8 = arg0 - 1;
        class58.method623(arg1, arg4, var10002, class651.field9125[arg0], arg3);
        if (arg5 != 8498) {
            method3393(34, -24, (byte) 10);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class651.field9125[var6];
            var7[arg3] = var7[arg4] = arg1;
        }
    }
}
