import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class293 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lhe;")
    public static class94 field5122 = new class94(4);

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lsf;")
    private static class108 field5126 = class140.method973(255, "Starting 3d Library");

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lsf;")
    public static class108 field5125 = field5126;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lci;")
    public static class203 field5127 = new class203(5000);

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Z")
    public static boolean field5130 = false;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[J")
    public static long[] field5129 = new long[100];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)I", line = 4)
    public static final int method2091(int arg0, boolean arg1) {
        field5123++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        }
        if (!arg1) {
            field5122 = (class94) null;
        }
        if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 30)
    public static void method2092(int arg0) {
        field5126 = null;
        field5125 = null;
        field5129 = null;
        field5127 = null;
        if (arg0 < -84) {
            field5122 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIBIIII)V", line = 52)
    public static final void method2093(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field5121++;
        int var7 = arg3 + arg4;
        int var8 = arg4 + arg6;
        int var9 = arg5 - arg4;
        for (int var10 = arg6; var10 < var8; var10++) {
            class209.method1452(arg0, class106.field1839[var10], 7, arg3, arg1);
        }
        int var11 = arg0 - arg4;
        for (int var12 = arg5; var12 > var9; var12--) {
            class209.method1452(arg0, class106.field1839[var12], 7, arg3, arg1);
        }
        if (arg2 != -60) {
            method2094(true);
        }
        for (int var13 = var8; var13 <= var9; var13++) {
            int[] var14 = class106.field1839[var13];
            class209.method1452(var7, var14, arg2 + 67, arg3, arg1);
            class209.method1452(arg0, var14, 7, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)[Lse;", line = 97)
    public static final class12[] method2094(boolean arg0) {
        field5124++;
        class12[] var1 = new class12[class196.field3546];
        for (int var2 = 0; var2 < class196.field3546; var2++) {
            int var3 = class273.field4795[var2] * class155.field2780[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class94.field1512[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class321.field5494[class162.method1118(var5[var6], 255)];
            }
            var1[var2] = new class12(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], var4);
        }
        if (arg0) {
            class15.method100(1);
            return var1;
        } else {
            return (class12[]) null;
        }
    }
}
