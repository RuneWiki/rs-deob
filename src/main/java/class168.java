import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class168 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
    public static int[] field2384 = new int[50];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lkn;")
    public static class442 field2380 = new class442();

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lof;")
    public static class370 field2381;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 6)
    public static final String[] method1203(int arg0, String[] arg1) {
        int var2 = -71 % ((-arg0 - 79) / 33);
        field2383++;
        String[] var3 = new String[5];
        for (int var4 = 0; var4 < 5; var4++) {
            var3[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var3[var4] = var3[var4] + arg1[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 35)
    public static final void method1204(byte arg0) {
        class407.field5764 = new class382(class113.field1467.method2284((byte) -60, class309.field4497), "", class385.field5451, 1011, 0L, 0, 0);
        if (arg0 <= 3) {
            method1204((byte) 97);
        }
        field2382++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 47)
    public static void method1205(boolean arg0) {
        field2380 = null;
        if (!arg0) {
            field2384 = null;
            field2381 = null;
        }
    }
}
