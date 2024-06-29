import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class415 extends class362 {

    @OriginalMember(owner = "client!za", name = "o", descriptor = "Loaa;")
    public static class290 field6006 = new class290(10, 2, 2, 0);

    @OriginalMember(owner = "client!za", name = "q", descriptor = "I")
    public static int field6008 = 0;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!za", name = "c", descriptor = "(II)V", line = 4)
    public static final void method2560(int arg0, int arg1) {
        class184 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class281 var4 = class465.field6517[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class432.field6185; var5++) {
                    for (int var6 = 0; var6 < class434.field6208; var6++) {
                        var2 = var4.method1146(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class130.field2185;
                            int var8 = var5 << class130.field2185;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class281 var10 = class465.field6517[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1851((byte) -86, var5, var6) - var10.method1851((byte) -86, var5, var6);
                                    int var12 = var4.method1851((byte) -86, var5, var6 + 1) - var10.method1851((byte) -86, var5, var6 + 1);
                                    int var13 = var4.method1851((byte) -86, var5 + 1, var6 + 1) - var10.method1851((byte) -86, var5 + 1, var6 + 1);
                                    int var14 = var4.method1851((byte) -86, var5 + 1, var6) - var10.method1851((byte) -86, var5 + 1, var6);
                                    var10.method1151(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 69)
    public static void method2561(byte arg0) {
        if (arg0 > 39) {
            field6006 = null;
        }
    }
}
