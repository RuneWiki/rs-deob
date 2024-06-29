import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class132 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Z")
    public static boolean field1659 = false;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[Lem;")
    public static class192[] field1657 = new class192[16];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lfh;")
    public static class567 field1661;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[S")
    public static short[] field1658;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 3)
    public static void method816(byte arg0) {
        if (arg0 >= 89) {
            field1658 = null;
            field1661 = null;
            field1657 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I", line = 21)
    public static final int method817(int arg0, int arg1, int arg2) {
        field1655++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & arg1) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)I", line = 44)
    public static final int method818(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -93) {
            return -36;
        }
        field1654++;
        if (arg2 > arg1) {
            return arg2;
        } else if (arg3 < arg1) {
            return arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V", line = 79)
    public class132(int arg0, int arg1, int arg2) {
        this.field1656 = arg0;
        while (arg2 > 1) {
            this.field1663++;
            arg2 >>= 0x1;
        }
        this.field1660 = arg1;
        this.field1662 = 0x1 << this.field1663;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method252(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public abstract void method261(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public abstract void method256(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
    public abstract int method259(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method254(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public abstract boolean method248(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Loj;[I)V")
    public abstract void method258(class321 arg0, int[] arg1);

    @OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
    public abstract void method251(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
    public abstract int method249(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method263(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
    public abstract void method257();

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IILw;)Lw;")
    public abstract class252 method250(int arg0, int arg1, class252 arg2);
}
