import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class610 {

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    private int field9051;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field9049 = 1337;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Lh;")
    public static class572 field9046 = new class572("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Llu;")
    public static class610 field9050 = new class610(28, 8);

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "Llu;")
    public static class610 field9052 = new class610(44, -1);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)V")
    public static void method3583(boolean arg0) {
        field9046 = null;
        field9052 = null;
        field9050 = null;
        if (arg0) {
            field9049 = 27;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)Z")
    public static final boolean method3584(int arg0, int arg1) {
        if (arg0 == -10) {
            field9045++;
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)I")
    public final int method3585(boolean arg0) {
        field9047++;
        if (!arg0) {
            method3584(-118, -110);
        }
        return this.field9051;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lqa;Lco;IIIII)V")
    public static final void method3586(class208 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class348.field4772 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class145.field2083) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class384.field5282 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class205 var15 = class420.field5697[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class165.field2609[var12].method1239(var13, var14) + class165.field2609[var12].method1239(var13 + 1, var14) + class165.field2609[var12].method1239(var13, var14 + 1) + class165.field2609[var12].method1239(var13 + 1, var14 + 1)) / 4 - (class165.field2609[arg2].method1239(arg3, arg4) + class165.field2609[arg2].method1239(arg3 + 1, arg4) + class165.field2609[arg2].method1239(arg3, arg4 + 1) + class165.field2609[arg2].method1239(arg3 + 1, arg4 + 1)) / 4;
                                    class113 var17 = var15.field3047;
                                    class113 var18 = var15.field3037;
                                    if (var17 != null && var17.method180((byte) 58)) {
                                        arg1.method182(arg0, var16, var7, (var13 - arg3) * class96.field1409 + (1 - arg5) * class402.field5500, (var14 - arg4) * class96.field1409 + (1 - arg6) * class402.field5500, var17, 21130);
                                    }
                                    if (var18 != null && var18.method180((byte) 58)) {
                                        arg1.method182(arg0, var16, var7, (var13 - arg3) * class96.field1409 + (1 - arg5) * class402.field5500, (var14 - arg4) * class96.field1409 + (1 - arg6) * class402.field5500, var18, 21130);
                                    }
                                    for (class636 var19 = var15.field3029; var19 != null; var19 = var19.field9302) {
                                        class577 var20 = var19.field9299;
                                        if (var20 != null && var20.method180((byte) 58) && (var20.field8504 == var13 || var8 == var13) && (var20.field8509 == var14 || var10 == var14)) {
                                            int var21 = var20.field8508 + 1 - var20.field8504;
                                            int var22 = var20.field8499 + 1 - var20.field8509;
                                            arg1.method182(arg0, var16, var7, (var20.field8504 - arg3) * class96.field1409 + (var21 - arg5) * class402.field5500, (var20.field8509 - arg4) * class96.field1409 + (var22 - arg6) * class402.field5500, var20, 21130);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9048++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(II)V")
    public class610(int arg0, int arg1) {
        this.field9051 = arg0;
    }
}
