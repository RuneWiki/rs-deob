import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class106 extends class513 {

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Ls;")
    public static class186 field1971 = new class186(61, 6);

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
    public static final void method906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1968++;
        int var10 = arg4 + 1;
        class503.method3027(arg1, (byte) 127, arg0, arg2, class316.field4797[arg4]);
        int var9 = arg3 - 1;
        class503.method3027(arg1, (byte) 127, arg0, arg2, class316.field4797[arg3]);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class316.field4797[var6];
            var7[arg1] = var7[arg0] = arg2;
        }
        if (arg5 != -1) {
            field1971 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public static void method907(int arg0) {
        field1971 = null;
        if (arg0 != 4096) {
            field1971 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z")
    public static final boolean method908(int arg0, int arg1, int arg2) {
        field1970++;
        if (arg0 == 0) {
            return class408.method2529(arg2, arg1, ~arg0) | (arg2 & 0x70000) != 0 || class128.method1006(arg2, arg1, true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIZ)V")
    public static final void method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field1972++;
        if (class1.method16(arg6, 1465669104)) {
            if (class329.field4994[arg6] == null) {
                class352.method2181(arg0, arg1, arg2, arg5, class419.field6326[arg6], arg7, -1, arg3, -32, arg4);
            } else {
                class352.method2181(arg0, arg1, arg2, arg5, class329.field4994[arg6], arg7, -1, arg3, -56, arg4);
            }
            if (!arg8) {
                method908(48, -111, 22);
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class486.field7167[var9] = true;
            }
        } else {
            class486.field7167[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method910(byte arg0, String[] arg1) {
        field1973++;
        String[] var2 = new String[5];
        if (arg0 < 30) {
            field1971 = null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method911(int arg0, int arg1, int arg2, Class arg3) {
        class234 var4 = class518.field7511[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class440 var5 = var4.field3607; var5 != null; var5 = var5.field6528) {
            class402 var6 = var5.field6530;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6082 == arg1 && var6.field6077 == arg2) {
                class1.method7(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIZII)V")
    public static final void method912(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1969++;
        if (class1.method16(arg4, arg0 + 1465669000)) {
            class195.method1314(arg3, -117, -1, arg2, class419.field6326[arg4], arg1);
            if (arg0 != 104) {
                method910((byte) 9, null);
            }
        }
    }
}
