import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class339 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4348;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[[I")
    public int[][] field4343;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lda;")
    public static class400 field4345;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 6)
    public static void method1958(byte arg0) {
        field4345 = null;
        if (arg0 != 75) {
            field4345 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 21)
    public final int method1959(int arg0, int arg1, int arg2) {
        if (arg0 < 122) {
            return -97;
        } else {
            field4347++;
            return this.field4343[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I", line = 37)
    public final int method1960(int arg0, int arg1, int arg2) {
        field4342++;
        int var4 = arg0 >> this.field4349;
        int var5 = arg1 >> this.field4349;
        if (var4 < 0 || var5 < 0 || this.field4344 - 1 < var4 || (this.field4348 - 1) < var5) {
            return 0;
        }
        int var6 = arg0 & this.field4346 - 1;
        int var7 = this.field4346 - 1 & arg1;
        if (arg2 < 113) {
            return 23;
        } else {
            int var8 = (this.field4346 - var6) * this.field4343[var4][var5] + (this.field4343[var4 + 1][var5] * var6) >> this.field4349;
            int var9 = (this.field4346 - var6) * this.field4343[var4][var5 + 1] + this.field4343[var4 + 1][var5 + 1] * var6 >> this.field4349;
            return (this.field4346 - var7) * var8 + (var7 * var9) >> this.field4349;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 74)
    public class339(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4344 = arg0;
        this.field4348 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4346 = 0x1 << var5;
        this.field4349 = var5;
        this.field4343 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class706 method504(int arg0, int arg1, class706 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method510(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method511(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method517(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method500(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method514();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method515(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method502(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method518(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lkb;[I)V")
    public abstract void method513(class757 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method508(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method516(int arg0, int arg1, int arg2);
}
