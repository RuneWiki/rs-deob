import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class103 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "[I")
    public static int[] field1513 = new int[14];

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lcu;")
    public static class145 field1515 = new class145(53, 3);

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lff;")
    public static class9 field1516 = new class9(22, 3);

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[Ldr;")
    public static class504[] field1518 = new class504[14];

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lff;")
    public static class9 field1519 = new class9(77, 12);

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lvj;")
    public static class304 field1520 = new class304("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lff;")
    public static class9 field1522 = new class9(52, -1);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[I")
    public static int[] field1521;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method721(byte arg0) {
        field1516 = null;
        field1521 = null;
        field1519 = null;
        field1520 = null;
        field1513 = null;
        field1515 = null;
        if (arg0 < 106) {
            method722(null, 127, 44, -25, -31, null, -91, -41, 31, 105, -16, -2, -52);
        }
        field1518 = null;
        field1522 = null;
    }

    @OriginalMember(owner = "client!vf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1511++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lqa;IIII[[[BIIIIIII)V")
    public static final void method722(class162 arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1517++;
        if (arg2 >= -30) {
            field1515 = null;
        }
        if (arg11 == 0 || arg1 == 0) {
            return;
        }
        if (arg11 == 9) {
            arg4 = arg4 + 1 & 0x3;
            arg11 = 1;
        }
        if (arg11 == 10) {
            arg11 = 1;
            arg4 = arg4 + 3 & 0x3;
        }
        if (arg11 == 11) {
            arg4 = arg4 + 3 & 0x3;
            arg11 = 8;
        }
        arg0.method530(arg10, arg8, arg7, arg9, arg3, arg12, arg5[arg11 - 1][arg4], arg1, arg6);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(II)V")
    public class103(int arg0, int arg1) {
        this.field1514 = arg0;
    }
}
