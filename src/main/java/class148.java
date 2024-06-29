import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class148 {

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "[I")
    public static int[] field2142 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2142 = null;
        if (arg0 != 3) {
            method992(-48, 86, null);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLmg;)I")
    public static final int method991(boolean arg0, class101 arg1) {
        if (!arg0) {
            field2142 = null;
        }
        field2143++;
        int var2 = 0;
        if (arg1.method747(class128.field1892, (byte) -68)) {
            var2++;
        }
        if (arg1.method747(class165.field2476, (byte) -68)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILsi;)Ljava/lang/String;")
    public static final String method992(int arg0, int arg1, class391 arg2) {
        field2141++;
        try {
            int var3 = arg2.method2332(2);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field5719 += class53.field647.method2791(arg2.field5719, 0, var3, var4, arg2.field5678, (byte) -120);
            return arg0 >= -18 ? null : class67.method573(var4, 23231, var3, 0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
