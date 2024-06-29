import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class278 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field3920;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[[I")
    public int[][] field3916;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lqe;")
    public static class465 field3919 = new class465(64, 4);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIIBILae;Leq;)V", line = 5)
    public static final void method1822(boolean arg0, int arg1, int arg2, byte arg3, int arg4, class250 arg5, class209 arg6) {
        if (arg3 == 28) {
            field3923++;
            class348.method2182(arg1, arg2, arg0, arg6, arg4, false);
            class432.field6038 = arg5;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method1823(int arg0, int arg1, int arg2) {
        field3917++;
        if (arg2 == 2048) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 35)
    public static void method1824(int arg0) {
        field3919 = null;
        if (arg0 != -1) {
            method1824(15);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I", line = 50)
    public final int method1825(int arg0, int arg1, int arg2) {
        if (arg1 > -127) {
            this.method1085();
        }
        field3922++;
        return this.field3916[arg2][arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Z", line = 77)
    public static final boolean method1826(byte arg0, int arg1) {
        if (arg0 < 113) {
            field3919 = null;
        }
        field3921++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(III)I", line = 88)
    public final int method1827(int arg0, int arg1, int arg2) {
        field3918++;
        int var4 = arg1 >> this.field3915;
        if (arg0 != -3458) {
            return 82;
        }
        int var5 = arg2 >> this.field3915;
        if (var4 < 0 || var5 < 0 || (this.field3924 - 1) < var4 || this.field3914 - 1 < var5) {
            return 0;
        }
        int var6 = this.field3920 - 1 & arg1;
        int var7 = arg2 & this.field3920 - 1;
        int var8 = (this.field3920 - var6) * this.field3916[var4][var5] + this.field3916[var4 + 1][var5] * var6 >> this.field3915;
        int var9 = (this.field3920 - var6) * this.field3916[var4][var5 + 1] + this.field3916[var4 + 1][var5 + 1] * var6 >> this.field3915;
        return (this.field3920 - var7) * var8 + var7 * var9 >> this.field3915;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 113)
    public class278(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3914 = arg1;
        this.field3924 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field3920 = 0x1 << var5;
        this.field3916 = arg3;
        this.field3915 = var5;
    }

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1085();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1077(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1092(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1078(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1081(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class181 method1086(int arg0, int arg1, class181 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbh;[I)V")
    public abstract void method1079(class36 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1091(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1089(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1080(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1093(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1096(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1095(class181 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
