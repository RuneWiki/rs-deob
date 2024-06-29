import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class490 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
    public static int[] field7124 = new int[13];

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[Luca;")
    public static class695[] field7125 = new class695[16];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Ltf;")
    public static class701 field7122;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method2841(int arg0, int arg1, int arg2) {
        if (arg2 <= 49) {
            field7124 = null;
        }
        field7123++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 38)
    public static void method2842(boolean arg0) {
        field7122 = null;
        field7124 = null;
        if (!arg0) {
            field7125 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(I)V")
    public abstract void method20(int arg0);

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(I)V")
    public abstract void method17(int arg0);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "(Lq;)V")
    public abstract void method15(class490 arg0);

    @OriginalMember(owner = "client!q", name = "na", descriptor = "(IIIIII)V")
    public abstract void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class490 method27();

    @OriginalMember(owner = "client!q", name = "wa", descriptor = "(III[I)V")
    public abstract void method29(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "(III)V")
    public abstract void method30(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "AA", descriptor = "(I)V")
    public abstract void method26(int arg0);

    @OriginalMember(owner = "client!q", name = "ZA", descriptor = "(I)V")
    public abstract void method24(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method22();

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(III)V")
    public abstract void method23(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "o", descriptor = "(I)V")
    public abstract void method16(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method19(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "w", descriptor = "(I)V")
    public abstract void method18(int arg0);

    @OriginalMember(owner = "client!q", name = "YA", descriptor = "([I)V")
    public abstract void method21(int[] arg0);
}
