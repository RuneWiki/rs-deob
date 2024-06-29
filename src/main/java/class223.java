import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class223 {

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "[Lwc;")
    public static class66[] field2561 = new class66[14];

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public static int field2564 = 0;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public static final void method1293(int arg0) {
        class735.field10274 = 0;
        class179.field2107 = 0;
        class68.field695 = 0;
        class535.field7737 = 0;
        if (arg0 == 667) {
            field2559++;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B[SI)[S")
    public static final short[] method1294(byte arg0, short[] arg1, int arg2) {
        if (arg0 >= -14) {
            return null;
        } else {
            field2558++;
            short[] var3 = new short[arg2];
            class143.method895(arg1, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
    public static final void method1295(int arg0) {
        field2563++;
        if (arg0 < 51) {
            field2561 = null;
        }
        if (class87.field917 == null) {
            return;
        }
        class715[] var1 = class87.field917;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class715 var3 = var1[var2];
            var3.method1197((byte) -3);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)V")
    public static void method1296(boolean arg0) {
        field2561 = null;
        if (arg0) {
            method1298((byte) -37, false, -33, 63, 14);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([IIIII)V")
    public static final void method1297(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field2556++;
        arg2--;
        int var11 = arg4 - 1;
        int var5 = arg1 + var11;
        while (arg2 < var5) {
            int var6 = arg2 + 1;
            arg0[var6] = arg3;
            int var7 = var6 + 1;
            arg0[var7] = arg3;
            int var8 = var7 + 1;
            arg0[var8] = arg3;
            int var9 = var8 + 1;
            arg0[var9] = arg3;
            int var10 = var9 + 1;
            arg0[var10] = arg3;
            int var12 = var10 + 1;
            arg0[var12] = arg3;
            int var13 = var12 + 1;
            arg0[var13] = arg3;
            arg2 = var13 + 1;
            arg0[arg2] = arg3;
        }
        while (var11 > arg2) {
            arg2++;
            arg0[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BZIII)Lwg;")
    public static final class424 method1298(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2562++;
        class424 var5 = new class424();
        var5.field6158 = arg3;
        var5.field6159 = arg4;
        class153.field1688.method1751(var5, 3970, (long) arg2);
        class334.method1992((byte) -109, arg4);
        class532 var6 = class269.method1608((byte) -72, arg2);
        if (var6 != null) {
            class11.method50(var6, (byte) -101);
        }
        if (class468.field6697 != null) {
            class11.method50(class468.field6697, (byte) -107);
            class468.field6697 = null;
        }
        int var7 = 118 % ((arg0 - 26) / 58);
        class688.method3893(1);
        if (var6 != null) {
            class600.method3414(!arg1, var6, 105);
        }
        if (!arg1) {
            class133.method852(arg4);
        }
        if (!arg1 && class327.field4245 != -1) {
            class600.method3415(class327.field4245, 64, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IBI)I")
    public static final int method1299(int arg0, byte arg1, int arg2) {
        field2560++;
        int var3 = class302.method1815(arg0 - 1, arg2 + -1, Integer.MAX_VALUE) + class302.method1815(arg0 + 1, arg2 + -1, Integer.MAX_VALUE) + class302.method1815(arg0 + -1, arg2 + 1, Integer.MAX_VALUE) + class302.method1815(arg0 - -1, arg2 + 1, Integer.MAX_VALUE);
        int var4 = -7 % ((-arg1 - 28) / 33);
        int var5 = class302.method1815(arg0 - 1, arg2, Integer.MAX_VALUE) + class302.method1815(arg0 + 1, arg2, Integer.MAX_VALUE) + class302.method1815(arg0, arg2 - 1, Integer.MAX_VALUE) + class302.method1815(arg0, arg2 + 1, Integer.MAX_VALUE);
        int var6 = class302.method1815(arg0, arg2, Integer.MAX_VALUE);
        return var6 / 4 + var3 / 16 + var5 / 8;
    }
}
