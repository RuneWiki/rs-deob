import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class12 {

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "Lkh;")
    private static class117 field668 = class224.method1450((byte) 20, "Malformed login packet)3");

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "Lkh;")
    private static class117 field670 = class224.method1450((byte) 118, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lkh;")
    public static class117 field667 = field668;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lkh;")
    public static class117 field663 = field670;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Lff;")
    public static class62 field669 = new class62(4096);

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "[I")
    public static int[] field672 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field674 = 0;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lkh;")
    public static class117 field676 = class224.method1450((byte) 126, "gelb:");

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "Lai;")
    public static class10 field671;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "Ls;")
    public static class197 field675;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Lfi;")
    public static class65 field673;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lkh;III[S)V")
    public static final void method233(class117[] arg0, int arg1, int arg2, int arg3, short[] arg4) {
        if (arg1 < 124) {
            field670 = null;
        }
        if (arg3 > arg2) {
            int var5 = arg2;
            int var6 = (arg2 + arg3) / 2;
            class117 var7 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var7;
            short var8 = arg4[var6];
            arg4[var6] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].method805(false, var7) < (var9 & 0x1)) {
                    class117 var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5++] = var11;
                }
            }
            arg0[arg3] = arg0[var5];
            arg0[var5] = var7;
            arg4[arg3] = arg4[var5];
            arg4[var5] = var8;
            method233(arg0, 125, arg2, var5 - 1, arg4);
            method233(arg0, 127, var5 + 1, arg3, arg4);
        }
        field677++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static void method234(int arg0) {
        field676 = null;
        field669 = null;
        field672 = null;
        field675 = null;
        field663 = null;
        field667 = null;
        if (arg0 != 0) {
            method233(null, 16, 66, -84, null);
        }
        field668 = null;
        field671 = null;
        field670 = null;
        field673 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLvg;Lai;Lai;)V")
    public static final void method235(byte arg0, class236 arg1, class10 arg2, class10 arg3) {
        class51.field1049 = arg2;
        if (arg0 != -100) {
            method234(125);
        }
        class31.field740 = arg3;
        class48.field1012 = arg1;
        field664++;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II)V")
    public class27(int arg0, int arg1) {
        this.field665 = arg1;
        this.field666 = arg0;
    }
}
