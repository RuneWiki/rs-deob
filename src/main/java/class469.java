import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class469 extends class105 {

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    private int field6951;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    private int field6958;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    private int field6950;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    private int field6949;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Lsr;")
    public static class167 field6953 = new class167();

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "Lho;")
    public static class103 field6960 = new class103(54, 8);

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "[I")
    public static int[] field6962 = new int[4096];

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Lfo;")
    public static class361 field6959;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Ljava/lang/Object;")
    public static Object field6961;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZIII)I", line = 3)
    public static final int method2861(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 3;
        ++field6955;
        if (!arg3) {
            return 93;
        } else {
            if (~(arg2 & 1) == -2) {
                int var8 = arg1;
                arg1 = arg0;
                arg0 = var8;
            }
            if (var7 == 0) {
                return arg6;
            } else if (var7 == 1) {
                return -arg1 + -arg4 + 7 - -1;
            } else {
                return var7 == 2 ? -arg6 + 1 + 7 + -arg0 : arg4;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)V", line = 37)
    public final void method637(int arg0, int arg1, boolean arg2) {
        ++field6952;
        if (arg2) {
            int var4 = this.field6958 * arg1 >> 12;
            int var5 = this.field6951 * arg1 >> 12;
            int var6 = this.field6950 * arg0 >> 12;
            int var7 = this.field6949 * arg0 >> 12;
            class123.method735(var7, 99, var4, var6, super.field1412, var5);
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(III)V", line = 57)
    public static final void method2862(int arg0, int arg1, int arg2) {
        boolean var3 = class186.field2421[0][arg1][arg2] != null && class186.field2421[0][arg1][arg2].field7276 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class186.field2421[var4][arg1][arg2] == null) {
                class498 var5 = class186.field2421[var4][arg1][arg2] = new class498(var4, arg1, arg2);
                if (var3) {
                    ++var5.field7262;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V", line = 77)
    public final void method638(int arg0, int arg1, int arg2) {
        ++field6957;
        int var4 = this.field6958 * arg1 >> 12;
        int var5 = this.field6951 * arg1 >> 12;
        if (arg0 < 4) {
            this.field6949 = -21;
        }
        int var6 = this.field6950 * arg2 >> 12;
        int var7 = this.field6949 * arg2 >> 12;
        class382.method2335(var7, var4, var6, super.field1411, var5, super.field1413, 27795);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)V", line = 98)
    public static final void method2863(int arg0, int arg1, int arg2, int arg3) {
        ++field6954;
        if (arg3 < -93) {
            class184 var4 = class277.method1682(arg1, 9, -53);
            var4.method1069(true);
            var4.field2393 = arg2;
            var4.field2392 = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 113)
    public static void method2864(int arg0) {
        field6953 = null;
        if (arg0 != 13470) {
            field6960 = null;
        }
        field6959 = null;
        field6962 = null;
        field6960 = null;
        field6961 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)V", line = 131)
    public final void method640(int arg0, int arg1, int arg2) {
        ++field6956;
        int var4 = this.field6958 * arg2 >> 12;
        int var5 = this.field6951 * arg2 >> 12;
        if (arg1 != -3686) {
            field6960 = null;
        }
        int var6 = this.field6950 * arg0 >> 12;
        int var7 = this.field6949 * arg0 >> 12;
        class392.method2368(super.field1411, arg1 ^ -20839, var7, var4, super.field1413, super.field1412, var6, var5);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIII)V", line = 153)
    public class469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6951 = arg2;
        this.field6958 = arg0;
        this.field6950 = arg1;
        this.field6949 = arg3;
    }
}
