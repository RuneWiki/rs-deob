import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class132 {

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "Loa;")
    public static class99 field558 = class221.method1463(2844, "(Y");

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "[I")
    public static int[] field562 = new int[64];

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "Loa;")
    public static class99 field559 = class221.method1463(2844, "Sprites charg-Bs");

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "F")
    public static float field560;

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "Ltg;")
    public static class182 field563;

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "Lue;")
    public static class88 field566;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public static void method259(int arg0) {
        field563 = null;
        field558 = null;
        field562 = null;
        if (arg0 > 79) {
            field559 = null;
            field566 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        if (arg0 != -27) {
            method259(114);
        }
        ++field565;
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791 && this.method886((byte) -103)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg1 % super.field2318 * super.field2318;
            int[] var7 = var3[2];
            for (int var8 = 0; class234.field4046 > var8; ++var8) {
                int var9 = super.field2305[var6 - -(var8 % super.field2315)];
                var7[var8] = class71.method502(var9, 255) << 4;
                var5[var8] = class71.method502(var9 >> 4, 4080);
                var4[var8] = class71.method502(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field561;
        if (~arg0 <= ~class197.field3437 && class79.field1395 >= arg0 && ~class197.field3437 >= ~arg3 && ~class79.field1395 <= ~arg3 && ~class197.field3437 >= ~arg9 && ~arg9 >= ~class79.field1395 && ~arg5 <= ~class197.field3437 && arg5 <= class79.field1395 && class178.field3101 <= arg7 && ~arg7 >= ~class137.field2414 && ~class178.field3101 >= ~arg6 && class137.field2414 >= arg6 && arg8 >= class178.field3101 && class137.field2414 >= arg8 && ~arg1 <= ~class178.field3101 && arg1 <= class137.field2414) {
            class135.method913(-21673, arg8, arg4, arg5, arg1, arg0, arg9, arg6, arg7, arg3);
        } else {
            class141.method958(arg7, 2521, arg5, arg3, arg6, arg1, arg9, arg8, arg4, arg0);
        }
        if (arg2 > -114) {
            field563 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)V")
    public static final void method261(boolean arg0) {
        if (!arg0) {
            field560 = 0.3445459F;
        }
        ++field564;
        if (class78.field1386 == 5) {
            class78.field1386 = 6;
        }
    }
}
