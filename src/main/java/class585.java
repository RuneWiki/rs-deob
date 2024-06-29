import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class585 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lej;")
    public static class104 field8358 = new class104("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "Ljava/lang/String;")
    public static String field8364 = "";

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field8363;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ar", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field8365;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Z")
    public static final boolean method3428(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field8364 = null;
        }
        field8363++;
        return (arg2 & 0x40000) != 0 | class145.method958(arg0, true, arg2) || class147.method979(-124, arg0, arg2);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZIF[FFFIFI)V")
    public abstract void method680(int arg0, int arg1, boolean arg2, int arg3, float arg4, float[] arg5, float arg6, float arg7, int arg8, float arg9, int arg10);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method3429(int arg0, int arg1, int arg2, byte arg3) {
        field8360++;
        boolean var4 = true;
        class115 var5 = (class115) class265.method1739(arg1, arg0, arg2);
        if (var5 != null) {
            var4 &= class134.method907(var5, (byte) 65);
        }
        class115 var6 = (class115) class582.method3324(arg1, arg0, arg2, field8365 == null ? (field8365 = method3434("wf")) : field8365);
        if (var6 != null) {
            var4 &= class134.method907(var6, (byte) 70);
        }
        class115 var7 = (class115) class404.method2411(arg1, arg0, arg2);
        if (var7 != null) {
            var4 &= class134.method907(var7, (byte) 115);
        }
        if (arg3 != 50) {
            method3431(-53, 44, (byte) 108, 74, 57, -23, -59);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIII[ILwr;)Luo;")
    public static final class494 method3430(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, class388 arg5) {
        field8359++;
        if (!arg5.method1632(arg3, class519.field7310, class608.field8759)) {
            int[] var6 = new int[arg1 * arg2];
            for (int var7 = 0; var7 < arg2; var7++) {
                int var8 = arg1 * var7 + arg4[var7];
                for (int var9 = 0; var9 < arg0[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class494(arg5, arg1, arg2, var6);
        }
        byte[] var10 = new byte[arg1 * arg2];
        for (int var11 = 0; var11 < arg2; var11++) {
            int var12 = arg1 * var11 + arg4[var11];
            for (int var13 = 0; var13 < arg0[var11]; var13++) {
                var10[var12++] = -1;
            }
        }
        return new class494(arg5, arg1, arg2, var10);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIBIIII)V")
    public static final void method3431(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 74) {
            field8358 = null;
        }
        if (class326.field4387 <= (arg4 - arg6) && (arg4 + arg6) <= class596.field8621 && arg3 - arg6 >= class264.field3687 && class591.field8435 >= (arg3 + arg6)) {
            class457.method2673(arg3, arg0, arg1, arg6, true, arg4, arg5);
        } else {
            class407.method2418(arg6, arg5, arg3, -53, arg1, arg4, arg0);
        }
        field8362++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method3432(int arg0) {
        field8358 = null;
        field8364 = null;
        if (arg0 != 25226) {
            field8358 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZ)V")
    public static final void method3433(int arg0, boolean arg1) {
        if (arg1) {
            field8358 = null;
        }
        field8361++;
        class314 var2 = class483.method2819(9, arg0, 21303);
        var2.method1962((byte) 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3434(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
