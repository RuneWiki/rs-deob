import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class505 {

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
    public static int[] field7275 = new int[16];

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "Lkg;")
    public static class179 field7274 = new class179(2, -1);

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "Ljk;")
    public static class449 field7279 = new class449(8);

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field7282 = 0;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "Ltb;")
    public static class275 field7281;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "Lqn;")
    public static class47 field7280;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Z")
    public static boolean field7276;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([Lhd;IB)V", line = 15)
    public static final void method3035(class523[] arg0, int arg1, byte arg2) {
        field7278++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class523 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field7632 == 0) {
                    if (var4.field7717 != null) {
                        method3035(var4.field7717, arg1, (byte) -123);
                    }
                    class175 var5 = (class175) class397.field5684.method2022(-1, (long) var4.field7723);
                    if (var5 != null) {
                        class186.method1166(var5.field2279, arg1, (byte) -57);
                    }
                }
                if (arg1 == 0 && var4.field7582 != null) {
                    class170 var6 = new class170();
                    var6.field2178 = var4.field7582;
                    var6.field2179 = var4;
                    class239.method1444(var6);
                }
                if (arg1 == 1 && var4.field7715 != null) {
                    if (var4.field7562 >= 0) {
                        class523 var7 = class310.method1810(var4.field7723, 1182823664);
                        if (var7 == null || var7.field7717 == null || var7.field7717.length <= var4.field7562 || var7.field7717[var4.field7562] != var4) {
                            continue;
                        }
                    }
                    class170 var8 = new class170();
                    var8.field2179 = var4;
                    var8.field2178 = var4.field7715;
                    class239.method1444(var8);
                }
            }
        }
        if (arg2 >= -120) {
            method3035(null, 36, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 99)
    public static void method3036(byte arg0) {
        field7274 = null;
        field7275 = null;
        field7279 = null;
        field7280 = null;
        field7281 = null;
        if (arg0 != 39) {
            field7282 = 117;
        }
    }
}
