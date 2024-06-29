import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class225 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Z")
    public static boolean field3564 = false;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3572 = 0;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lih;")
    public static class32 field3571 = new class32();

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lva;")
    public static class146 field3568;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lve;")
    public static class266 field3566;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lve;")
    public static class266 field3570;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Lve;")
    public static class266 field3575;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Len;")
    public static class41 field3569;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
    public static int[] field3573;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "[[S")
    public static short[][] field3576;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZ[I[I)V", line = 8)
    public static final void method1497(int arg0, int arg1, boolean arg2, int[] arg3, int[] arg4) {
        field3565++;
        if (arg2) {
            method1498((byte) 106);
        }
        if (arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (arg3[var9] > ((var9 & 0x1) + var7)) {
                int var10 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6] = var10;
                int var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg3[arg1] = arg3[var6];
        arg3[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var8;
        method1497(arg0, var6 - 1, arg2, arg3, arg4);
        method1497(var6 + 1, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 64)
    public static void method1498(byte arg0) {
        field3575 = null;
        field3571 = null;
        field3576 = (short[][]) null;
        field3573 = null;
        field3568 = null;
        field3569 = null;
        field3570 = null;
        if (arg0 != 110) {
            method1497(46, 78, true, (int[]) null, (int[]) null);
        }
        field3566 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 102)
    public static final void method1499(int arg0) {
        class9.field121 = null;
        if (arg0 <= 49) {
            method1498((byte) 96);
        }
        class49.method362();
        field3567++;
    }
}
