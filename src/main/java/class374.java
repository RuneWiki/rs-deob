import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class374 extends class142 {

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Ldv;")
    public static class566 field5035 = new class566(69, -1);

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lcba;")
    public static class471 field5038 = new class471(60, 2);

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Z")
    public static boolean field5039 = false;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field5031;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public int field5036;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lbe;")
    public class33 field5037;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "[I")
    public static int[] field5033;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static void method2218(int arg0) {
        if (arg0 > -38) {
            method2218(-123);
        }
        field5033 = null;
        field5038 = null;
        field5035 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIFIIZIII)[[I")
    public static final int[][] method2219(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field5032++;
        int[][] var9 = new int[arg7][arg6];
        class168 var10 = new class168();
        var10.field2421 = arg1;
        if (arg4 != 22106) {
            field5038 = null;
        }
        var10.field2426 = (int) (arg2 * 4096.0F);
        var10.field2420 = arg0;
        var10.field2437 = arg5;
        var10.field2435 = arg3;
        var10.method7(arg4 - 806088494);
        class33.method342(arg7, arg6, (byte) 9);
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method1076(86, var11, var9[var11]);
        }
        return var9;
    }
}
