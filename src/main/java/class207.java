import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class207 {

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ln;")
    public static class282 field3216 = new class282(50);

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lna;")
    private static class26 field3218 = class69.method505("Loaded fonts", (byte) -124);

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lna;")
    public static class26 field3220 = class69.method505("tremblement:", (byte) -126);

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lna;")
    public static class26 field3221 = field3218;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lna;")
    public static class26 field3219 = class69.method505(":assist:", (byte) -120);

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lna;")
    public static class26 field3222 = class69.method505(")1", (byte) -118);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method1386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3214++;
        int var8 = class308.method2151(class117.field1840, arg6, (byte) 0, class80.field1259);
        int var9 = class308.method2151(class117.field1840, arg3, (byte) 0, class80.field1259);
        int var10 = class308.method2151(class27.field454, arg7, (byte) 0, class225.field3572);
        int var11 = class308.method2151(class27.field454, arg0, (byte) 0, class225.field3572);
        int var12 = class308.method2151(class117.field1840, arg4 + arg6, (byte) 0, class80.field1259);
        int var13 = class308.method2151(class117.field1840, arg3 - arg4, (byte) 0, class80.field1259);
        for (int var14 = var8; var14 < var12; var14++) {
            class76.method543(class45.field710[var14], var10, 97, var11, arg5);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class76.method543(class45.field710[var15], var10, 94, var11, arg5);
        }
        int var16 = class308.method2151(class27.field454, arg4 + arg7, (byte) 0, class225.field3572);
        int var17 = class308.method2151(class27.field454, arg0 - arg4, (byte) 0, class225.field3572);
        if (arg2 >= -88) {
            field3218 = (class26) null;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class45.field710[var18];
            class76.method543(var19, var10, 105, var16, arg5);
            class76.method543(var19, var16, 111, var17, arg1);
            class76.method543(var19, var17, 109, var11, arg5);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 68)
    public static void method1387(int arg0) {
        field3220 = null;
        field3216 = null;
        field3222 = null;
        field3219 = null;
        field3218 = null;
        if (arg0 == 0) {
            field3221 = null;
        }
    }
}
