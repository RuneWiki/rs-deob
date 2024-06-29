import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class610 extends class683 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    private int field8659;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    private int field8660;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    private int field8662;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    private int field8664;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[[Luf;")
    public static class519[][] field8661;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)V", line = 8)
    public static final void method3530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class251.method1664(105, arg3);
        ++field8665;
        int var7 = 0;
        int var8 = -arg5 + arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        if (arg4 != 434430412) {
            method3531((byte) -72);
        }
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class74.field1144[arg6];
        int var16 = -var8 + arg0;
        class379.method2284(-arg3 + arg0, var16, var15, arg2, 2);
        int var17 = arg0 + var8;
        class379.method2284(var16, var17, var15, arg1, 2);
        class379.method2284(var17, arg0 + arg3, var15, arg2, 2);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class691.field9751[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                if (~var8 >= ~var9) {
                    int[] var18 = class74.field1144[arg6 + var9];
                    int[] var19 = class74.field1144[-var9 + arg6];
                    int var20 = arg0 - -var7;
                    int var21 = -var7 + arg0;
                    class379.method2284(var21, var20, var18, arg2, 2);
                    class379.method2284(var21, var20, var19, arg2, 2);
                } else {
                    int[] var22 = class74.field1144[arg6 + var9];
                    int[] var23 = class74.field1144[-var9 + arg6];
                    int var24 = class691.field9751[var9];
                    int var25 = arg0 + var7;
                    int var26 = -var7 + arg0;
                    int var27 = arg0 + var24;
                    int var28 = arg0 - var24;
                    class379.method2284(var26, var28, var22, arg2, 2);
                    class379.method2284(var28, var27, var22, arg1, arg4 + -434430410);
                    class379.method2284(var27, var25, var22, arg2, 2);
                    class379.method2284(var26, var28, var23, arg2, 2);
                    class379.method2284(var28, var27, var23, arg1, 2);
                    class379.method2284(var27, var25, var23, arg2, 2);
                }
            }
            int[] var29 = class74.field1144[arg6 + var7];
            int[] var30 = class74.field1144[arg6 - var7];
            int var31 = arg0 + var9;
            int var32 = -var9 + arg0;
            if (var8 <= var7) {
                class379.method2284(var32, var31, var29, arg2, 2);
                class379.method2284(var32, var31, var30, arg2, 2);
            } else {
                int var33 = ~var7 < ~var11 ? class691.field9751[var7] : var11;
                int var34 = arg0 - -var33;
                int var35 = arg0 - var33;
                class379.method2284(var32, var35, var29, arg2, 2);
                class379.method2284(var35, var34, var29, arg1, 2);
                class379.method2284(var34, var31, var29, arg2, 2);
                class379.method2284(var32, var35, var30, arg2, 2);
                class379.method2284(var35, var34, var30, arg1, 2);
                class379.method2284(var34, var31, var30, arg2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 141)
    public static void method3531(byte arg0) {
        if (arg0 <= 18) {
            field8661 = null;
        }
        field8661 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZI)V", line = 151)
    public final void method269(int arg0, boolean arg1, int arg2) {
        ++field8666;
        int var4 = this.field8664 * arg2 >> 12;
        int var5 = this.field8659 * arg2 >> 12;
        int var6 = this.field8660 * arg0 >> 12;
        int var7 = this.field8662 * arg0 >> 12;
        if (!arg1) {
            this.method269(35, true, 68);
        }
        class12.method157(var6, var4, var7, super.field9678, 4, var5);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIII)V", line = 171)
    public class610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field8659 = arg2;
        this.field8660 = arg1;
        this.field8662 = arg3;
        this.field8664 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZII)V", line = 183)
    public final void method268(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method268(false, -25, 19);
        }
        ++field8663;
        int var4 = this.field8664 * arg2 >> 12;
        int var5 = this.field8659 * arg2 >> 12;
        int var6 = this.field8660 * arg1 >> 12;
        int var7 = this.field8662 * arg1 >> 12;
        class136.method1124(var4, var5, var6, super.field9680, var7, super.field9678, super.field9679, (byte) -124);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V", line = 202)
    public final void method267(int arg0, int arg1, int arg2) {
        ++field8658;
        int var4 = this.field8664 * arg2 >> 12;
        if (arg1 != 1) {
            method3530(-46, 78, 57, 77, -105, -8, 71);
        }
        int var5 = this.field8659 * arg2 >> 12;
        int var6 = this.field8660 * arg0 >> 12;
        int var7 = this.field8662 * arg0 >> 12;
        class264.method1703(super.field9679, var7, super.field9680, var6, var5, -2, var4);
    }
}
