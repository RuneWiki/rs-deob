import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class179 extends class182 {

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2863 = "purple:";

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "[[I")
    public static int[][] field2868 = new int[5][5000];

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "Z")
    public static boolean field2861 = false;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Lqj;")
    public static class164 field2865;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            field2863 = null;
        }
        int[] var3 = super.field2911.method77(arg1, -72);
        if (super.field2911.field287) {
            int[][] var4 = this.method1327(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class4.field116; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        ++field2866;
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "(I)Lqh;")
    public static final class237 method1304(int arg0) {
        if (arg0 != 0) {
            field2861 = true;
        }
        ++field2862;
        try {
            return (class237) Class.forName("fg").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII)V")
    public static final void method1305(byte arg0, int arg1, int arg2) {
        ++field2864;
        if (class301.method2056(-1, arg1)) {
            if (arg0 == 69) {
                class225.method1592(arg2, 1, class208.field3515[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "(I)V")
    public static final void method1307(int arg0) {
        if (class32.field523 != null) {
            class297 var1 = class32.field523;
            synchronized (class32.field523) {
                class32.field523 = null;
            }
        }
        ++field2867;
        if (arg0 != -19735) {
            field2865 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class179() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public static void method1308(byte arg0) {
        field2863 = null;
        if (arg0 != 83) {
            field2861 = true;
        }
        field2868 = null;
        field2865 = null;
    }
}
