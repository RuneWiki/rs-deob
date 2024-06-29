import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class456 {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field6688 = 128;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public int field6691 = 128;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public int field6692;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public int field6693;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public int field6689;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lpg;")
    public static class492 field6694 = new class492(81, 8);

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field6697 = -1;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field6698 = 0;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field6700 = 0;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Lbn;")
    public static class348 field6701 = new class348(16);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "Lmc;")
    public static class242 field6695;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Lmj;", line = 4)
    public static final class70 method2743(int arg0, int arg1, int arg2) {
        class420 var3 = class380.field5802[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6261;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lgr;", line = 12)
    public final class456 method2744(int arg0) {
        field6687++;
        int var2 = -61 / ((11 - arg0) / 55);
        return new class456(this.field6692, this.field6691, this.field6688, this.field6689, this.field6690, this.field6693);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V", line = 99)
    public class456(int arg0) {
        this.field6692 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIII)V", line = 106)
    private class456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6690 = arg4;
        this.field6688 = arg2;
        this.field6691 = arg1;
        this.field6693 = arg5;
        this.field6692 = arg0;
        this.field6689 = arg3;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 29)
    public static void method2745(int arg0) {
        field6701 = null;
        field6694 = null;
        if (arg0 != -10406) {
            field6698 = 15;
        }
        field6695 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBIIIII)I", line = 42)
    public static final int method2746(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6696++;
        int var7 = arg3 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg6;
        } else {
            if (arg1 < 0) {
                field6695 = null;
            }
            return var7 == 2 ? 7 - arg5 - (arg4 - 1) : -arg0 - (-1 - (-arg6 + 7));
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILgr;)V", line = 73)
    public final void method2747(int arg0, class456 arg1) {
        this.field6691 = arg1.field6691;
        this.field6690 = arg1.field6690;
        this.field6692 = arg1.field6692;
        this.field6688 = arg1.field6688;
        field6699++;
        if (arg0 == 0) {
            this.field6693 = arg1.field6693;
            this.field6689 = arg1.field6689;
        }
    }
}
