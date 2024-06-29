import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class22 {

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field398 = new String[200];

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
    public static int[] field401 = new int[13];

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[Lsg;")
    public static class226[] field395;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field400;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I")
    public static final int method283(int arg0, int arg1, int arg2) {
        field397++;
        if (arg1 != 256) {
            field401 = null;
        }
        return arg0 == 4 || arg0 == 5 ? class14.field285[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)[B")
    public abstract byte[] method284(int arg0);

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method285(int arg0) {
        field401 = null;
        field398 = null;
        field400 = null;
        if (arg0 < 62) {
            field400 = null;
        }
        field395 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method286(byte arg0) {
        field399++;
        int var1 = 0;
        for (int var2 = 0; var2 < class211.field2954; var2++) {
            for (int var4 = 0; var4 < class290.field4061; var4++) {
                if (class187.method1211((byte) 82, var4, var1, true, class328.field4549, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        int var3 = 51 / ((-arg0 - 48) / 55);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[B)V")
    public abstract void method287(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field396++;
        if (arg5 < 90) {
            return;
        }
        class285[] var7 = class131.field1864;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class285 var9 = var7[var8];
            if (var9 != null && var9.field4017 == 2) {
                class381.method2429(43, arg4 >> 1, arg3, (var9.field4026 - class447.field6269 << 7) + var9.field4012, var9.field4027 * 2, arg2 >> 1, arg1, (var9.field4019 - class212.field2968 << 7) + var9.field4020);
                if (class48.field682[0] > -1 && class276.field3837 % 20 < 10) {
                    class239.field3413[var9.field4011].method1501(class48.field682[0] + arg6 - 12, class48.field682[1] + arg0 + -28);
                }
            }
        }
    }
}
