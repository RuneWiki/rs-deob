import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class572 extends class42 {

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "[[I")
    public static int[][] field8417 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lf;")
    private class257 field8407;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lf;")
    public class257 field8408;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Lf;")
    private class257 field8409;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lf;")
    private class257 field8411;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lf;")
    private class257 field8413;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lf;")
    private class257 field8416;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lqaa;")
    public static class309 field8418;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static void method3330(int arg0) {
        field8417 = null;
        field8418 = null;
        int var1 = 41 / ((arg0 - -44) / 55);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lvo;Lvo;Lvu;)V")
    public class572(class345 arg0, class345 arg1, class199 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZI)V")
    public final void method345(int arg0, int arg1, boolean arg2, int arg3) {
        ++field8415;
        if (arg1 != 0) {
            field8418 = null;
        }
        if (arg2) {
            int[] var5 = new int[4];
            class637.field9048.method764(var5);
            class637.field9048.method771(arg3, arg0, super.field576.field8300 + arg3, super.field576.field8291 + arg0);
            int var6 = this.field8407.method11();
            int var7 = this.field8407.method9();
            int var8 = this.field8416.method11();
            int var9 = this.field8416.method9();
            this.field8407.method1638(arg3, (-var7 + super.field576.field8291) / 2 + arg0);
            this.field8416.method1638(-var8 + super.field576.field8300 + arg3, (-var9 + super.field576.field8291) / 2 + arg0);
            class637.field9048.method771(arg3, arg0, super.field576.field8300 + arg3, this.field8409.method9() + arg0);
            this.field8409.method1632(arg3 + var6, arg0, -var8 + super.field576.field8300 - var6, super.field576.field8291);
            int var10 = this.field8411.method9();
            class637.field9048.method771(arg3, super.field576.field8291 + arg0 - var10, arg3 - -super.field576.field8300, super.field576.field8291 + arg0);
            this.field8411.method1632(arg3 + var6, -var10 + arg0 - -super.field576.field8291, super.field576.field8300 - (var6 - -var8), super.field576.field8291);
            class637.field9048.method771(var5[0], var5[1], var5[2], var5[3]);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        ++field8410;
        if (!super.method348(arg0)) {
            return false;
        } else {
            class199 var2 = (class199) super.field576;
            if (!super.field573.method2077(arg0 ^ 21378, var2.field3088)) {
                return false;
            } else if (!super.field573.method2077(0, var2.field3089)) {
                return false;
            } else if (!super.field573.method2077(0, var2.field3086)) {
                return false;
            } else if (!super.field573.method2077(0, var2.field3097)) {
                return false;
            } else if (!super.field573.method2077(0, var2.field3092)) {
                return false;
            } else {
                return super.field573.method2077(0, var2.field3094);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public void method3224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 6) {
            this.method3224(77, -17, 18, 92, -4);
        }
        ++field8414;
        this.field8408.method1632(arg0, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public final void method343(int arg0) {
        ++field8412;
        super.method343(-42);
        class199 var2 = (class199) super.field576;
        this.field8408 = class699.method3926(var2.field3088, (byte) 13, super.field573);
        if (arg0 <= -29) {
            this.field8413 = class699.method3926(var2.field3089, (byte) 80, super.field573);
            this.field8407 = class699.method3926(var2.field3086, (byte) 39, super.field573);
            this.field8416 = class699.method3926(var2.field3097, (byte) 48, super.field573);
            this.field8409 = class699.method3926(var2.field3092, (byte) -123, super.field573);
            this.field8411 = class699.method3926(var2.field3094, (byte) 2, super.field573);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIZ)V")
    public final void method342(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8406;
        int var5 = this.field8407.method11() + arg0;
        int var6 = super.field576.field8300 + arg0 + -this.field8416.method11();
        int var7 = this.field8409.method9() + arg1;
        int var8 = super.field576.field8291 + arg1 + -this.field8411.method9();
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method347((byte) 77) / 10000;
        int[] var12 = new int[4];
        class637.field9048.method764(var12);
        class637.field9048.method771(var5, var7, var5 + var11, var8);
        this.method3224(var5, var7, arg2 + 6, var9, var10);
        class637.field9048.method771(var5 + var11, var7, var6, var8);
        this.field8413.method1632(var5, var7, var9, var10);
        class637.field9048.method771(var12[arg2], var12[1], var12[2], var12[3]);
    }
}
