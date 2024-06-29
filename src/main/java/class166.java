import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class166 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lqj;")
    private static class196 field2735 = class80.method502("Select a world", -48);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lqj;")
    private static class196 field2734 = class80.method502("Take", -48);

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lqj;")
    public static class196 field2737 = class80.method502("3D)2Softwarebibliothek gestartet)3", -48);

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lqj;")
    public static class196 field2739 = field2735;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lqj;")
    public static class196 field2738 = field2734;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lqj;")
    private static class196 field2742 = class80.method502("slide:", -48);

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lqj;")
    public static class196 field2743 = field2742;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lqj;")
    public static class196 field2741 = field2742;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class46.field555; var5++) {
            if (class29.field368[var5] + class138.field2122[var5] > arg2 && arg0 + arg2 > class138.field2122[var5] && class64.field886[var5] + class168.field2828[var5] > arg4 && arg1 + arg4 > class168.field2828[var5]) {
                class161.field2588[var5] = true;
            }
        }
        field2745++;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIII)V")
    public static final void method1071(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2736++;
        int var5 = 45 / ((arg3 + 53) / 41);
        if (arg1 > arg0) {
            class25.method147(arg2, 7, arg0, class95.field1380[arg4], arg1);
        } else {
            class25.method147(arg2, 7, arg1, class95.field1380[arg4], arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1072(int arg0) {
        field2735 = null;
        field2739 = null;
        field2737 = null;
        field2734 = null;
        field2738 = null;
        field2741 = null;
        int var1 = -7 / ((arg0 + 12) / 37);
        field2743 = null;
        field2742 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[Lqj;II)Lqj;")
    public static final class196 method1073(int arg0, class196[] arg1, int arg2, int arg3) {
        field2746++;
        int var4 = 0;
        if (arg2 > -19) {
            method1071(-35, 103, -13, -85, -38);
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg3 + var5] == null) {
                arg1[arg3 + var5] = class133.field1894;
            }
            var4 += arg1[arg3 + var5].field3459;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class196 var10 = arg1[arg3 + var8];
            class37.method185(var10.field3448, 0, var6, var7, var10.field3459);
            var7 += var10.field3459;
        }
        class196 var9 = new class196();
        var9.field3448 = var6;
        var9.field3459 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static final void method1074(int arg0) {
        field2740++;
        if (arg0 != 100) {
            method1073(-51, null, 57, -90);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class161.field2588[var1] = true;
        }
    }
}
