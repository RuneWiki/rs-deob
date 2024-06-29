import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class159 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[Lgk;")
    public static class52[] field2181 = new class52[14];

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lhi;")
    public static class192 field2178 = new class192();

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lqc;")
    public static class99 field2182 = new class99(64);

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Lkm;")
    public static class133 field2177;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 21)
    public static void method1149(int arg0) {
        field2178 = null;
        if (arg0 != 0) {
            field2178 = (class192) null;
        }
        field2181 = null;
        field2182 = null;
        field2177 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;", line = 49)
    public static final String[] method1150(String arg0, byte arg1, char arg2) {
        int var3 = class306.method2079(true, arg0, arg2);
        if (arg1 != -83) {
            return (String[]) null;
        }
        int var4 = 0;
        field2180++;
        String[] var5 = new String[var3 + 1];
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var5[var4++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var5[var3] = arg0.substring(var6);
        return var5;
    }
}
