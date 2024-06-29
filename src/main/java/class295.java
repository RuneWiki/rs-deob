import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class295 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field4177;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[[I")
    public int[][] field4180;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Ltd;")
    public static class478 field4181;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method1894(boolean arg0) {
        field4181 = null;
        if (arg0) {
            field4181 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method194(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method188(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method197();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public final int method1895(int arg0, int arg1, int arg2) {
        field4172++;
        int var4 = arg0 >> this.field4179;
        int var5 = arg1 >> this.field4179;
        if (var4 < 0 || var5 < 0 || var4 > this.field4174 - 1 || (this.field4173 - 1) < var5) {
            return 0;
        }
        if (arg2 < 18) {
            this.field4174 = 105;
        }
        int var6 = this.field4177 - 1 & arg0;
        int var7 = arg1 & this.field4177 - 1;
        int var8 = (this.field4177 - var6) * this.field4180[var4][var5] + this.field4180[var4 + 1][var5] * var6 >> this.field4179;
        int var9 = (this.field4177 - var6) * this.field4180[var4][var5 + 1] + (this.field4180[var4 + 1][var5 + 1] * var6) >> this.field4179;
        return (this.field4177 - var7) * var8 + var7 * var9 >> this.field4179;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
    public static final boolean method1896(int arg0) {
        int var1 = -70 / ((arg0 - 29) / 50);
        field4175++;
        if (class273.field3971) {
            try {
                if ((Boolean) class376.method2358(class552.field7624, 3860, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method195(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method205(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Luaa;[I)V")
    public abstract void method189(class127 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method185(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method1897(int arg0) {
        field4178++;
        if (arg0 >= -35) {
            field4181 = null;
        }
        class685.field9165.method3103(-11294);
    }

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method200(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method204(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method201(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I")
    public final int method1898(int arg0, int arg1, byte arg2) {
        if (arg2 >= -1) {
            this.field4179 = 125;
        }
        field4176++;
        return this.field4180[arg1][arg0];
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class295(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4173 = arg1;
        this.field4174 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4177 = 0x1 << var5;
        this.field4179 = var5;
        this.field4180 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class195 method190(int arg0, int arg1, class195 arg2);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method202(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
