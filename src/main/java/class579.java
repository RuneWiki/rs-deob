import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class579 extends class714 {

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public int field8345;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field8340;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[B")
    public static byte[] field8342 = new byte[520];

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field8346 = 1405;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lol;")
    public static class431 field8344;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Lhl;")
    public final class353 method327(byte arg0) {
        field8343++;
        if (arg0 <= 51) {
            this.method327((byte) -102);
        }
        return class116.field1982;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lmp;Lfe;IIIIIIIII)V")
    public class579(class565 arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8345 = arg10;
        this.field8340 = arg9;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI)V")
    public static final void method3405(long arg0, int arg1) {
        field8341++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % (long) arg1) == 0L) {
            class465.method2720(arg1 - 120, arg0 + -1L);
            class465.method2720(-99, 1L);
        } else {
            class465.method2720(111, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method3406(int arg0) {
        if (arg0 > -12) {
            field8346 = -58;
        }
        field8344 = null;
        field8342 = null;
    }
}
