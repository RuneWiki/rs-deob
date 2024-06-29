import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class704 extends class196 {

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field9801;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lqfa;")
    public static class98 field9800 = new class98(60, 12);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Las;")
    public static class151 field9804 = new class151(4, 1, 1, 1);

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[F")
    public static float[] field9806 = new float[4];

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ILdp;Lfv;III)V", line = 6)
    public class704(int arg0, class3 arg1, class120 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9801 = arg5;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)Lg;", line = 14)
    public final class153 method769(boolean arg0) {
        field9803++;
        if (arg0) {
            field9806 = null;
        }
        return class516.field7358;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 25)
    public static void method3959(byte arg0) {
        field9806 = null;
        if (arg0 <= 25) {
            method3959((byte) 31);
        }
        field9804 = null;
        field9800 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII)Z", line = 40)
    public static final boolean method3960(boolean arg0, int arg1, int arg2) {
        field9799++;
        if (!arg0) {
            method3960(true, -97, -16);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IFFF)F", line = 53)
    public static final float method3961(int arg0, float arg1, float arg2, float arg3) {
        field9805++;
        return arg0 == 1 ? (arg2 - arg1) * arg3 + arg1 : -2.144353F;
    }
}
