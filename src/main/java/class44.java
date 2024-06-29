import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class44 extends class108 {

    @OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
    public static int[] field709 = new int[] { 0, 0, -1, 0, 8, 2, 6, 0, 4, 0, -1, 8, 12, -2, 0, 0, 0, 0, 15, -2, 0, 12, 0, 0, 3, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 2, -2, -1, 0, -1, 0, 0, 0, 6, 0, 0, 0, 0, 12, -1, -1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 5, 0, 6, 0, 0, 0, 10, 0, 12, 0, 0, 0, 4, 0, -2, 8, 3, 6, 5, 8, 0, 0, 0, 0, 0, 0, 3, 0, 14, 0, 0, 0, 0, 4, -2, 0, 20, 11, -1, -2, 0, 0, 0, 0, 6, 3, 0, 7, 0, 0, 0, 0, 6, -1, 0, 0, 0, 0, 7, 0, 0, 28, 0, 1, 0, 0, 4, 0, 15, 0, 2, 0, 0, 7, 2, 0, 0, 0, 7, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 2, 3, -1, 0, 0, 17, 0, 0, 0, 0, 10, 0, 1, -2, 0, 6, 0, 0, 9, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 6, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 8, 14, -1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 3, 0, 2, 0, 0, 8, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 6, 1, 0, 6, 0, 1, -1, 0, 10, 10, 0, 8, 5 };

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Ljava/lang/String;")
    public static String field710 = "wave:";

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Luf;")
    public static class176 field706;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[Lqd;")
    public static class3[] field708;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method367(byte arg0, String arg1) {
        if (arg0 > -27) {
            return false;
        } else {
            field705++;
            return class184.method1236(-4, arg1, true, 10);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)I")
    public static final int method368(int arg0, byte arg1) {
        field707++;
        if (arg1 != 18) {
            field709 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method369(boolean arg0) {
        field708 = null;
        field706 = null;
        if (!arg0) {
            field704 = -90;
        }
        field710 = null;
        field709 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field703++;
        int var8 = arg1 + arg3;
        int var9 = arg7 - arg3;
        int var10 = arg4 - arg3;
        for (int var11 = arg1; var11 < var8; var11++) {
            class263.method1788(arg0, -18732, arg2, class156.field2379[var11], arg4);
        }
        if (arg6 != 33) {
            field704 = 101;
        }
        for (int var12 = arg7; var12 > var9; var12--) {
            class263.method1788(arg0, -18732, arg2, class156.field2379[var12], arg4);
        }
        int var13 = arg0 + arg3;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class156.field2379[var14];
            class263.method1788(arg0, -18732, arg2, var15, var13);
            class263.method1788(var13, arg6 ^ 0xFFFFB6F5, arg5, var15, var10);
            class263.method1788(var10, -18732, arg2, var15, arg4);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZIII)V")
    public static final void method371(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (~arg4 > arg3) {
            arg4 = 1;
        }
        class16.field266 = (short) arg5;
        class72.field1153 = (short) arg4;
        field712++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static final void method372(boolean arg0) {
        field711++;
        if (class265.field4221) {
            return;
        }
        class216.field3333 = true;
        if (class195.field3070) {
            class276.field4334 = (float) ((int) class276.field4334 + 191 & 0xFFFFFF80);
        } else {
            class53.field821 += (24.0F - class53.field821) / 2.0F;
        }
        class265.field4221 = arg0;
    }
}
