import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class271 implements class630 {

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "Lvfa;")
    public class92 field3665;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "Lrq;")
    public class482 field3660;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "Z")
    public boolean field3670;

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Lfha;")
    public static class522 field3657 = new class522();

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "[I")
    public static int[] field3664 = new int[1];

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3662;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "[I")
    public static int[] field3667;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIBI)V")
    public static final void method1656(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -1) {
            return;
        }
        if (arg1 < arg0) {
            class721.method4044(class591.field8480[arg2], arg1, (byte) -126, arg0, arg4);
        } else {
            class721.method4044(class591.field8480[arg2], arg0, (byte) -127, arg1, arg4);
        }
        field3659++;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
    public static void method1657(int arg0) {
        field3662 = null;
        field3657 = null;
        field3667 = null;
        field3664 = null;
        if (arg0 != 0) {
            field3657 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Lag;")
    public final class214 method210(int arg0) {
        field3654++;
        if (arg0 != 7288) {
            this.field3669 = -71;
        }
        return class179.field2532;
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(ILvfa;Lrq;IIIIIIIZ)V")
    public class271(int arg0, class92 arg1, class482 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field3655 = arg5;
        this.field3668 = arg3;
        this.field3663 = arg7;
        this.field3658 = arg8;
        this.field3661 = arg0;
        this.field3665 = arg1;
        this.field3660 = arg2;
        this.field3666 = arg6;
        this.field3670 = arg10;
        this.field3669 = arg4;
        this.field3656 = arg9;
    }
}
