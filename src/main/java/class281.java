import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class281 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[[I")
    public int[][] field3934;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lin;")
    public static class91 field3935;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1161(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1150(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public static final void method1850(int arg0, Canvas arg1) {
        if (arg0 <= 85) {
            return;
        }
        field3936++;
        Dimension var2 = arg1.getSize();
        class486.method2862((byte) 38, var2.height, var2.width);
        if (class215.field3119 == 1) {
            class569.field7823.method280(arg1, class225.field3209, class218.field3157);
        } else {
            class569.field7823.method280(arg1, class241.field3512, class368.field5247);
        }
    }

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1149(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1155(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lab;[I)V")
    public abstract void method1158(class669 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method1851(byte arg0, int arg1, int arg2) {
        field3943++;
        if (arg0 != -86) {
            this.field3940 = -59;
        }
        return this.field3934[arg2][arg1];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1160(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1156(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Log;")
    public static final class649 method1852(int arg0, int arg1) {
        field3941++;
        if (arg0 != -101) {
            method1850(-117, null);
        }
        return arg1 >= 0 && arg1 < 100 ? class42.field977[arg1] : null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I")
    public final int method1853(int arg0, int arg1, byte arg2) {
        field3939++;
        int var4 = arg0 >> this.field3938;
        int var5 = arg1 >> this.field3938;
        if (var4 < 0 || var5 < 0 || var4 > this.field3937 - 1 || (this.field3940 - 1) < var5) {
            return 0;
        }
        int var6 = -78 % ((arg2 + 53) / 36);
        int var7 = arg0 & this.field3942 - 1;
        int var8 = arg1 & this.field3942 - 1;
        int var9 = (this.field3942 - var7) * this.field3934[var4][var5] + (this.field3934[var4 + 1][var5] * var7) >> this.field3938;
        int var10 = (this.field3942 - var7) * this.field3934[var4][var5 + 1] + this.field3934[var4 + 1][var5 + 1] * var7 >> this.field3938;
        return (this.field3942 - var8) * var9 + var8 * var10 >> this.field3938;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1159(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1854(int arg0) {
        int var1 = 49 / ((15 - arg0) / 40);
        field3935 = null;
    }

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1151(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class281(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3937 = arg0;
        this.field3940 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3942 = 0x1 << var5;
        this.field3934 = arg3;
        this.field3938 = var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1154(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1153();

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class184 method1146(int arg0, int arg1, class184 arg2);
}
