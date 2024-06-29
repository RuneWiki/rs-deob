import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 {

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[[I")
    public int[][] field1042;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Lkl;")
    public static class70 field1045 = new class70(16);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Laj;")
    public static class287 field1048 = new class287(8);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1051 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lqfa;")
    public static class85 field1049 = new class85(99, 8);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method537(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method538(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method539(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method540(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lff;[I)V")
    public abstract void method541(class9 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method542(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method543(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method544(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method545(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method546(int arg0) {
        field1044++;
        class465.field6601++;
        class275 var1 = class185.method1355(0, class387.field5668, class395.field5772);
        var1.field4103.method693((byte) 106, class601.method3434(true));
        var1.field4103.method745(class506.field7173, arg0 ^ 0x31EF);
        var1.field4103.method745(class310.field4626, 128);
        var1.field4103.method693((byte) 106, class527.field7429.field2671);
        if (arg0 != 12655) {
            field1045 = null;
        }
        class140.method1141(var1, 19321);
    }

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method547();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method549(byte arg0) {
        field1049 = null;
        field1045 = null;
        field1048 = null;
        if (arg0 <= 83) {
            method549((byte) 16);
        }
        field1051 = null;
    }

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class54 method550(int arg0, int arg1, class54 arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I")
    public final int method551(int arg0, int arg1, byte arg2) {
        if (arg2 > -92) {
            this.field1041 = 113;
        }
        field1047++;
        return this.field1042[arg0][arg1];
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
    public final int method552(int arg0, int arg1, int arg2) {
        field1039++;
        int var4 = arg1 >> this.field1038;
        int var5 = arg2 >> this.field1038;
        if (var4 < 0 || var5 < 0 || var4 > this.field1041 - 1 || var5 > this.field1043 - 1) {
            return 0;
        }
        int var6 = this.field1040 - 1 & arg1;
        int var7 = arg2 & this.field1040 - 1;
        int var8 = (this.field1040 - var6) * this.field1042[var4][var5] + this.field1042[var4 + 1][var5] * var6 >> this.field1038;
        int var9 = (this.field1040 - var6) * this.field1042[var4][arg0 + var5] + this.field1042[var4 + 1][var5 + 1] * var6 >> this.field1038;
        return (this.field1040 - var7) * var8 + var7 * var9 >> this.field1038;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
    public class37(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field1043 = arg1;
        this.field1041 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field1040 = 0x1 << var5;
        this.field1042 = arg3;
        this.field1038 = var5;
    }
}
