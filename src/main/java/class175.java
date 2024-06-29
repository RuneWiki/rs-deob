import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class175 extends class431 implements class185 {

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "Ljk;")
    public class431 field2745;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "Loe;")
    public static class127 field2742 = new class127(48, 1);

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "Lte;")
    public static class419 field2746 = new class419(0, 0);

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I", line = 3)
    public final int method173(int arg0) {
        if (arg0 != 1438) {
            field2746 = null;
        }
        field2735++;
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 14)
    public final void method163(int arg0) {
        if (arg0 != 8793) {
            this.method1099((byte) 57);
        }
        field2729++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILlt;I)Lwr;", line = 26)
    public static final class303 method1096(int arg0, int arg1, class458 arg2, int arg3) {
        field2732++;
        byte[] var4 = arg2.method2715(arg3, arg0, false);
        int var5 = -67 / ((arg1 - 59) / 40);
        return var4 == null ? null : new class303(var4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lhf;IB)I", line = 43)
    public static final int method1097(class260 arg0, int arg1, byte arg2) {
        if (arg2 != 72) {
            method1097(null, 110, (byte) -112);
        }
        field2730++;
        return -1;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIILjk;)V", line = 56)
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, class431 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class469.method2832(arg0, arg1, 127));
        this.field2745 = arg5;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V", line = 66)
    public static final void method1098(byte arg0) {
        field2739++;
        class341.method2107((byte) -126);
        class233.method1400(false);
        if (arg0 != 72) {
            method1096(127, -93, null, -62);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 78)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return null;
        } else {
            field2747++;
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)I", line = 90)
    public final int method170(boolean arg0) {
        if (arg0) {
            field2734++;
            return 0;
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lqq;BII)Z", line = 108)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        field2728++;
        return arg1 != -44;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)I", line = 122)
    public final int method1099(byte arg0) {
        int var2 = -13 / ((16 - arg0) / 41);
        field2738++;
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([Ljava/lang/Object;II[II)V", line = 132)
    public static final void method1100(Object[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field2743++;
        if (arg4 != 14677) {
            method1098((byte) 19);
        }
        if (arg1 >= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var7;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if (var7 + (var9 & var10) > arg3[var10]) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                Object var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg3[arg2] = arg3[var6];
        arg3[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var8;
        method1100(arg0, arg1, var6 - 1, arg3, arg4);
        method1100(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lqq;I)V", line = 194)
    public final void method171(class318 arg0, int arg1) {
        field2733++;
        if (arg1 != 1577) {
            field2746 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Z", line = 204)
    public final boolean method161(int arg0) {
        field2740++;
        if (arg0 != 15275) {
            this.field2745 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(ZLqq;)V", line = 218)
    public final void method172(boolean arg0, class318 arg1) {
        if (!arg0) {
            field2736++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLqq;)Lkm;", line = 228)
    public final class227 method169(byte arg0, class318 arg1) {
        if (arg0 >= -11) {
            this.method173(126);
        }
        field2731++;
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I", line = 242)
    public final int method174(byte arg0) {
        field2737++;
        return arg0 <= 113 ? -41 : 0;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)V", line = 254)
    public static void method1101(byte arg0) {
        field2746 = null;
        field2742 = null;
        if (arg0 < 126) {
            method1098((byte) -86);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLqq;)V", line = 265)
    public final void method176(boolean arg0, class318 arg1) {
        field2741++;
        if (!arg0) {
            field2742 = null;
        }
    }
}
