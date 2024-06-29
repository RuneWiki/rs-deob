import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class606 extends class377 {

    @OriginalMember(owner = "client!ica", name = "R", descriptor = "Lpr;")
    public static class407 field8565 = new class407(59, 7);

    @OriginalMember(owner = "client!ica", name = "P", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!ica", name = "S", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!ica", name = "T", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!ica", name = "Q", descriptor = "[B")
    private byte[] field8564;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIBI)V", line = 5)
    public static final void method3378(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 <= class501.field7217 && arg3 >= class58.field602) {
            boolean var6;
            if (arg2 < class326.field4246) {
                arg2 = class326.field4246;
                var6 = false;
            } else if (arg2 <= class163.field1942) {
                var6 = true;
            } else {
                arg2 = class163.field1942;
                var6 = false;
            }
            boolean var7;
            if (class326.field4246 > arg5) {
                arg5 = class326.field4246;
                var7 = false;
            } else if (class163.field1942 >= arg5) {
                var7 = true;
            } else {
                arg5 = class163.field1942;
                var7 = false;
            }
            if (class58.field602 > arg0) {
                arg0 = class58.field602;
            } else {
                class445.method2463(arg2, 117, arg5, arg1, class156.field1755[arg0++]);
            }
            if (class501.field7217 >= arg3) {
                class445.method2463(arg2, 106, arg5, arg1, class156.field1755[arg3--]);
            } else {
                arg3 = class501.field7217;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg3; var8++) {
                    int[] var9 = class156.field1755[var8];
                    var9[arg2] = var9[arg5] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg0; var11 <= arg3; var11++) {
                    class156.field1755[var11][arg2] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg0; var10 <= arg3; var10++) {
                    class156.field1755[var10][arg5] = arg1;
                }
            }
        }
        if (arg4 == -109) {
            field8567++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZIII)[B", line = 114)
    public final byte[] method3379(boolean arg0, int arg1, int arg2, int arg3) {
        field8566++;
        if (!arg0) {
            this.field8564 = null;
        }
        this.field8564 = new byte[arg1 * arg2 * arg3 * 2];
        this.method2940((byte) 28, arg1, arg3, arg2);
        return this.field8564;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)V", line = 127)
    public final void method2070(int arg0, byte arg1, int arg2) {
        field8563++;
        if (arg0 >= -50) {
            this.field8564 = null;
        }
        int var4 = arg2 * 2;
        int var6 = var4 + 1;
        this.field8564[var4] = -1;
        int var5 = arg1 & 0xFF;
        this.field8564[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V", line = 144)
    public class606() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(III)Loj;", line = 148)
    public static final class344 method3380(int arg0, int arg1, int arg2) {
        class287 var3 = class97.field1074[arg0][arg1][arg2];
        return var3 == null || var3.field3686 == null ? null : var3.field3686;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V", line = 155)
    public static void method3381(byte arg0) {
        int var1 = -42 % ((-arg0 - 33) / 52);
        field8565 = null;
    }
}
