import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class602 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public int field8483;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Lkv;")
    private class280 field8485;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "Leo;")
    public static class310 field8486 = new class310();

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Ljo;")
    public static class351 field8488 = new class351(63, -1);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
    public static void method3479(boolean arg0) {
        if (arg0) {
            field8488 = null;
        }
        field8486 = null;
        field8488 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BIIIIII[B[B)V")
    public static final void method3480(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, byte[] arg8) {
        if (arg0 <= 120) {
            return;
        }
        field8484++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg7[var10001] = (byte) (arg7[var10001] - arg8[arg4++]);
                int var14 = arg6++;
                arg7[var14] = (byte) (arg7[var14] - arg8[arg4++]);
                int var15 = arg6++;
                arg7[var15] = (byte) (arg7[var15] - arg8[arg4++]);
                int var16 = arg6++;
                arg7[var16] = (byte) (arg7[var16] - arg8[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg7[var10001] = (byte) (arg7[var10001] - arg8[arg4++]);
            }
            arg4 += arg2;
            arg6 += arg3;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method3481(int arg0, String[] arg1) {
        field8482++;
        String[] var2 = new String[5];
        int var3 = 60 % ((-arg0 - 73) / 41);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var2[var4] = var2[var4] + arg1[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8487++;
        this.field8485.method1853(this.field8483, 123);
        super.finalize();
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lkv;II)V")
    public class602(class280 arg0, int arg1, int arg2) {
        this.field8483 = arg2;
        this.field8485 = arg0;
    }
}
