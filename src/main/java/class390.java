import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class390 {

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "Z")
    public static boolean field5612 = false;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "[I")
    public static int[] field5613 = new int[32];

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "[[Lkg;")
    public static class208[][] field5608;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 3)
    public static void method2328(int arg0) {
        field5613 = null;
        int var1 = 19 % ((arg0 + 12) / 47);
        field5608 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIIII)I", line = 17)
    public static final int method2329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5609++;
        int var7 = arg0 & 0x3;
        if ((arg5 & arg2) == 1) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 1 + 7 - arg6 - arg3;
        } else if (var7 == 2) {
            return 8 - arg1 - arg4;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(IIIIIII)V", line = 47)
    public static final void method2330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 10626) {
            return;
        }
        if (arg0 >= class398.field5676 && class298.field3995 >= arg2 && arg4 >= class609.field8313 && arg6 <= class19.field169) {
            if (arg1 == 1) {
                class494.method2789(arg0, arg4, false, arg6, arg3, arg2);
            } else {
                class380.method2301(arg3, (byte) -113, arg0, arg1, arg4, arg2, arg6);
            }
        } else if (arg1 == 1) {
            class48.method286(arg6, arg4, (byte) 124, arg0, arg3, arg2);
        } else {
            class505.method2856(arg6, arg0, arg2, (byte) -77, arg4, arg1, arg3);
        }
        field5610++;
    }
}
