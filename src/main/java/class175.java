import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class175 extends class68 {

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public int field2439 = -1;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Lfi;")
    public static class331 field2435 = new class331(64);

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2438 = 0;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Ljava/lang/String;")
    public String field2433;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Ljava/lang/String;")
    public String field2436;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 3)
    public static void method1155(byte arg0) {
        if (arg0 != 119) {
            field2435 = null;
        }
        field2435 = null;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)Lse;", line = 14)
    public final class139 method1156(int arg0) {
        ++field2437;
        return arg0 != -1 ? null : class228.field3118[super.field771];
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V", line = 30)
    public static final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg4 + 1;
        class105.method564(arg3, arg1, 0, class318.field4522[arg4], arg5);
        if (arg2 < 116) {
            field2438 = -93;
        }
        ++field2432;
        int var8 = arg0 - 1;
        class105.method564(arg3, arg1, 0, class318.field4522[arg0], arg5);
        for (int var6 = var9; ~var8 <= ~var6; ++var6) {
            int[] var7 = class318.field4522[var6];
            var7[arg1] = var7[arg5] = arg3;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIZ)V", line = 61)
    public static final void method1158(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2434;
        if (arg1 == -1) {
            class160.field2267 = 0L;
            int var5 = class23.method151((byte) -54);
            if (~arg3 == -4 || ~var5 == -4) {
                arg4 = true;
            }
            if (!class218.field2991.method935()) {
                arg4 = true;
            }
            class201.method1289(var5, arg2, arg3, arg4, arg0, -97);
        }
    }
}
