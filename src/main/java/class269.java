import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class269 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lok;")
    public static class41 field4344 = class137.method956("Versteckt", 45);

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "[I")
    public static int[] field4345 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Lee;")
    public static class75 field4347 = new class75(64);

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field4349 = 0;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Lok;")
    public static class41 field4350 = class137.method956("Cabbage", 45);

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lmh;")
    public static class65 field4343;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[IIII)V", line = 8)
    public static final void method1908(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field4346++;
        arg4--;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg2;
            int var8 = var7 + 1;
            arg1[var8] = arg2;
            int var9 = var8 + 1;
            arg1[var9] = arg2;
            int var10 = var9 + 1;
            arg1[var10] = arg2;
            int var11 = var10 + 1;
            arg1[var11] = arg2;
            int var12 = var11 + 1;
            arg1[var12] = arg2;
            int var13 = var12 + 1;
            arg1[var13] = arg2;
            arg4 = var13 + 1;
            arg1[arg4] = arg2;
        }
        if (arg0 != 19) {
            field4349 = 46;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 44)
    public static void method1909(int arg0) {
        field4347 = null;
        field4345 = null;
        field4350 = null;
        field4344 = null;
        field4343 = null;
        if (arg0 != 76) {
            field4344 = (class41) null;
        }
    }
}
