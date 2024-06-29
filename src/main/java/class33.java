import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class33 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Lab;")
    public static class148[] field495 = new class148[6];

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field497 = -1;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Loh;")
    public static class281 field494 = new class281(64);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[I")
    public static int[] field503 = new int[14];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lhc;")
    public static class235 field496;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "[I")
    public static int[] field502;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[Z")
    public static boolean[] field501;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[[[I")
    public static int[][][] field500;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method261(int arg0) {
        field503 = null;
        field501 = null;
        field502 = null;
        field494 = null;
        field495 = null;
        if (arg0 == 0) {
            field496 = null;
            field500 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I")
    public static final int method262(int arg0) {
        if (arg0 == 0) {
            field499++;
            return 0;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)I")
    public static final int method263(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - class195.field3089[arg0 * 1024 / arg1] >> 1;
        field492++;
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public static final void method264(int arg0) {
        if (arg0 < 96) {
            return;
        }
        field491++;
        if (!class95.field1613 && class212.field3292 != 2) {
            try {
                class215.method1453(class61.field1053, 124, "tbrefresh");
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field490++;
        if (arg6 < 38) {
            field495 = null;
        }
        int var7 = arg2 + arg5;
        int var8 = arg3 + arg5;
        int var9 = arg4 - arg5;
        int var10 = arg1 - arg5;
        for (int var11 = arg2; var11 < var7; var11++) {
            class166.method1124(true, class154.field2406[var11], arg1, arg0, arg3);
        }
        for (int var12 = arg4; var12 > var9; var12--) {
            class166.method1124(true, class154.field2406[var12], arg1, arg0, arg3);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class154.field2406[var13];
            class166.method1124(true, var14, var8, arg0, arg3);
            class166.method1124(true, var14, arg1, arg0, var10);
        }
    }
}
