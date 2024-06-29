import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class323 extends class26 {

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field4740 = new String[1000];

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field4739 = 0;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field4748 = new String[100];

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field4744 = -1;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "F")
    public static float field4737;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lfh;")
    public static class140 field4733;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Z")
    public boolean field4738;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[[I")
    public static int[][] field4735;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)I", line = 5)
    public final int method2230(byte arg0) {
        field4745++;
        return arg0 == -103 ? 1 : -66;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I", line = 16)
    public int method783() {
        field4734++;
        return 0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z", line = 24)
    public final boolean method2231(int arg0) {
        if (arg0 < 41) {
            field4739 = -121;
        }
        field4747++;
        return this.field4738;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 36)
    public static void method2232(int arg0) {
        field4733 = null;
        if (arg0 != 17616) {
            field4742 = -50;
        }
        field4748 = null;
        field4740 = null;
        field4735 = (int[][]) null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIBII)V", line = 54)
    public static final void method2233(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var8 = arg2 + arg7;
        field4746++;
        int var9 = arg4 - arg7;
        int var10 = arg3 + arg7;
        int var11 = arg1 - arg7;
        for (int var12 = arg2; var12 < var8; var12++) {
            class96.method697((byte) 115, class331.field4902[var12], arg0, arg3, arg1);
        }
        if (arg5 != -57) {
            method2234(30, 23, -109, 75, 35);
        }
        for (int var13 = arg4; var13 > var9; var13--) {
            class96.method697((byte) 115, class331.field4902[var13], arg0, arg3, arg1);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class331.field4902[var14];
            class96.method697((byte) 115, var15, arg0, arg3, var10);
            class96.method697((byte) 115, var15, arg6, var10, var11);
            class96.method697((byte) 115, var15, arg0, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Z", line = 98)
    public static final boolean method2234(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class287.field4122 * arg0 + class167.field2338 * arg3 >> 16;
        int var6 = class287.field4122 * arg3 - class167.field2338 * arg0 >> 16;
        int var7 = class223.field3213 * var6 + class211.field2988 * arg1 >> 16;
        int var8 = class223.field3213 * arg1 - class211.field2988 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class223.field3213 * var6 + class211.field2988 * arg2 >> 16;
        int var12 = class223.field3213 * arg2 - class211.field2988 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class7.field71 && var13 < class7.field71) {
            return false;
        } else if (var9 > class237.field3432 && var13 > class237.field3432) {
            return false;
        } else if (var10 < class124.field1652 && var14 < class124.field1652) {
            return false;
        } else {
            return var10 <= class40.field499 || var14 <= class40.field499;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 163)
    public static final void method2235(boolean arg0) {
        field4741++;
        if (class328.field4801 != null) {
            class328.field4801.method2460((byte) -128);
        }
        if (class335.field5234 != null) {
            class335.field5234.method2460((byte) -116);
        }
        if (arg0) {
            method2233(-22, 26, -66, 81, -100, (byte) -35, 1, 98);
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)Z", line = 180)
    public final boolean method2236(int arg0) {
        int var2 = -41 % ((11 - arg0) / 32);
        field4743++;
        return false;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(B)Z", line = 202)
    public final boolean method2237(byte arg0) {
        field4736++;
        return arg0 != -12;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public abstract void method784(int arg0);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
    public abstract void method781();

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIIII)V")
    public abstract void method779(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()Z")
    public abstract boolean method785();

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public abstract void method780(int arg0, int arg1);

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()Z")
    public abstract boolean method782();
}
