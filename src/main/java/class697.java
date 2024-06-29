import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class697 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lad;")
    private class19 field9776 = new class19(64);

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Ltf;")
    private class701 field9784;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[[I")
    public static int[][] field9782 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field9781 = -1;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field9783 = 0;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lad;")
    public static class19 field9777 = new class19(4);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Ltf;")
    public static class701 field9787;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 3)
    public final void method3828(int arg0, int arg1) {
        class19 var3 = this.field9776;
        synchronized (this.field9776) {
            this.field9776.method88(121);
            this.field9776 = new class19(arg0);
        }
        field9780++;
        if (arg1 != -16285) {
            method3834(57);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 18)
    public final void method3829(int arg0) {
        class19 var2 = this.field9776;
        synchronized (this.field9776) {
            this.field9776.method80((byte) -89);
            if (arg0 != 0) {
                field9783 = -41;
            }
        }
        field9786++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Ljt;", line = 33)
    public final class531 method3830(int arg0, int arg1) {
        field9778++;
        class19 var3 = this.field9776;
        class531 var4;
        synchronized (this.field9776) {
            var4 = (class531) this.field9776.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field9784;
        byte[] var6;
        synchronized (this.field9784) {
            var6 = this.field9784.method3854((byte) 39, class688.method3801(arg1 - 1365854460, arg0), class310.method1782(arg0, (byte) -119));
        }
        class531 var7 = new class531();
        if (arg1 != 6) {
            this.method3830(-46, 85);
        }
        if (var6 != null) {
            var7.method2981(new class115(var6), 0);
        }
        class19 var8 = this.field9776;
        synchronized (this.field9776) {
            this.field9776.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V", line = 66)
    public final void method3831(int arg0, int arg1) {
        int var3 = -92 / ((arg1 + 78) / 43);
        class19 var4 = this.field9776;
        synchronized (this.field9776) {
            this.field9776.method83((byte) -2, arg0);
        }
        field9785++;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 93)
    public final void method3832(int arg0) {
        field9779++;
        class19 var2 = this.field9776;
        synchronized (this.field9776) {
            this.field9776.method88(99);
            if (arg0 != 0) {
                field9783 = 41;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIBI)V", line = 108)
    public static final void method3833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field9788++;
        if (arg6 >= 1 && arg2 >= 1 && arg6 <= (class142.field1574 - 2) && arg2 <= (class140.field1550 - 2)) {
            int var9 = arg3;
            if (arg3 < 3 && class568.method3221(arg2, arg6, 0)) {
                var9 = arg3 + 1;
            }
            if (!class639.field9075.method2641(class430.field6109, (byte) 34) && !class457.method2624(-25097, arg6, var9, class652.field9150, arg2)) {
                return;
            }
            if (class487.field7044 == null) {
                return;
            }
            class585.field8307.method2742(arg6, -80, class282.field3534[arg3], arg0, class701.field9813, arg3, arg2);
            if (arg5 >= 0) {
                boolean var10 = class639.field9075.field6796;
                class639.field9075.field6796 = true;
                class585.field8307.method2740(arg5, var9, arg8, arg4, 114, arg1, class701.field9813, arg6, arg3, class282.field3534[arg3], arg2);
                class639.field9075.field6796 = var10;
            }
        }
        if (arg7 >= -112) {
            method3834(-105);
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 155)
    public static void method3834(int arg0) {
        if (arg0 != -18564) {
            method3834(108);
        }
        field9777 = null;
        field9782 = null;
        field9787 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lqh;ILtf;)V", line = 175)
    public class697(class320 arg0, int arg1, class701 arg2) {
        this.field9784 = arg2;
        if (this.field9784 != null) {
            int var4 = this.field9784.method3877(100) - 1;
            this.field9784.method3883(var4, 0);
        }
    }
}
