import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class558 {

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public int field7756;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[I")
    public static int[] field7753 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
    public static int[] field7752 = new int[1000];

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field7751 = 0;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field7754 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lhj;")
    public static class596 field7748 = new class596(64, 4);

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[S")
    private static short[] field7757 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[S")
    private static short[] field7759 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[S")
    private static short[] field7760 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[[S")
    public static short[][] field7758 = new short[][] { field7759, field7757, field7760 };

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method3252(int arg0) {
        field7752 = null;
        field7758 = null;
        field7760 = null;
        field7757 = null;
        field7748 = null;
        if (arg0 != 0) {
            method3252(127);
        }
        field7759 = null;
        field7753 = null;
    }

    @OriginalMember(owner = "client!de", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7749++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public class558(String arg0, String arg1, String arg2, int arg3) {
        this.field7756 = arg3;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I")
    public static final int method3253(int arg0) {
        field7750++;
        return arg0 > -112 ? -38 : class89.field1190;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIIZIZ)V")
    public static final void method3254(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg2 > arg0) {
            int var7 = (arg0 + arg2) / 2;
            int var8 = arg0;
            class631 var9 = class780.field10754[var7];
            class780.field10754[var7] = class780.field10754[arg2];
            class780.field10754[arg2] = var9;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (class734.method4143(var9, arg6, -116, arg5, arg4, class780.field10754[var10], arg3) <= 0) {
                    class631 var11 = class780.field10754[var10];
                    class780.field10754[var10] = class780.field10754[var8];
                    class780.field10754[var8++] = var11;
                }
            }
            class780.field10754[arg2] = class780.field10754[var8];
            class780.field10754[var8] = var9;
            method3254(arg0, (byte) 123, var8 - 1, arg3, arg4, arg5, arg6);
            method3254(var8 + 1, (byte) 123, arg2, arg3, arg4, arg5, arg6);
        }
        field7755++;
        if (arg1 != 123) {
            field7748 = null;
        }
    }
}
