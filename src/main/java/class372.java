import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class372 {

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Lch;")
    public static class151 field5124 = new class151("K", "T", "K", "K");

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5125 = new String[100];

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Lrn;")
    public static class417 field5119;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "[[[B")
    public static byte[][][] field5120;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method2270(int arg0, int arg1, int arg2, int arg3) {
        field5118++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (arg3 == var4) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 24)
    public static void method2271(byte arg0) {
        field5120 = null;
        if (arg0 == -60) {
            field5124 = null;
            field5125 = null;
            field5119 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIZZZI)V", line = 42)
    public static final void method2272(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, int arg6) {
        field5123++;
        if (arg6 > arg0) {
            int var7 = (arg0 + arg6) / 2;
            int var8 = arg0;
            class21 var9 = class361.field4975[var7];
            class361.field4975[var7] = class361.field4975[arg6];
            class361.field4975[arg6] = var9;
            for (int var10 = arg0; var10 < arg6; var10++) {
                if (class198.method1371(arg2, arg4, arg1, arg3, var9, class361.field4975[var10], 14182) <= 0) {
                    class21 var11 = class361.field4975[var10];
                    class361.field4975[var10] = class361.field4975[var8];
                    class361.field4975[var8++] = var11;
                }
            }
            class361.field4975[arg6] = class361.field4975[var8];
            class361.field4975[var8] = var9;
            method2272(arg0, arg1, arg2, arg3, arg4, true, var8 - 1);
            method2272(var8 + 1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
        if (!arg5) {
            field5125 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V", line = 90)
    public static final void method2273(int arg0, int arg1) {
        field5122++;
        if (arg0 == -1 || !class340.field4698[arg0]) {
            return;
        }
        if (arg1 != 7) {
            field5119 = null;
        }
        class38.field479.method2641(0, arg0);
        class263.field3787[arg0] = null;
        class340.field4698[arg0] = false;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 114)
    public static final String method2274(byte arg0, String arg1) {
        field5121++;
        String var2 = class73.method655((byte) 114, class84.method719(37, arg1));
        if (var2 == null) {
            var2 = "";
        }
        if (arg0 != -86) {
            method2273(-62, -6);
        }
        return var2;
    }
}
