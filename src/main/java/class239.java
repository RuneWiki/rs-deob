import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class239 extends class253 {

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    private int field3776;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    private int field3778;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    private int field3775;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    private int field3783;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[I")
    public static int[] field3781;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "[[[Lwa;")
    public static class281[][][] field3780;

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3773 = arg3;
        this.field3776 = arg0;
        this.field3778 = arg5;
        this.field3784 = arg1;
        this.field3774 = arg4;
        this.field3777 = arg7;
        this.field3775 = arg2;
        this.field3783 = arg6;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static void method1663(int arg0) {
        if (arg0 == 1559) {
            field3780 = null;
            field3781 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)V")
    public final void method40(int arg0, byte arg1, int arg2) {
        if (arg1 == -14) {
            ++field3782;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZI)V")
    public final void method44(int arg0, boolean arg1, int arg2) {
        ++field3785;
        if (arg1) {
            method1663(93);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        int var4 = this.field3784 * arg0 >> 12;
        int var5 = this.field3776 * arg2 >> 12;
        int var6 = this.field3775 * arg2 >> 12;
        ++field3772;
        int var7 = this.field3774 * arg2 >> 12;
        if (arg1 > -47) {
            method1664(-13, (class254) null);
        }
        int var8 = this.field3778 * arg0 >> 12;
        int var9 = this.field3777 * arg0 >> 12;
        int var10 = this.field3783 * arg2 >> 12;
        int var11 = this.field3773 * arg0 >> 12;
        class45.method287(false, var5, var11, var4, var9, super.field4014, var8, var7, var6, var10);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILkk;)Ljava/lang/String;")
    public static final String method1664(int arg0, class254 arg1) {
        if (arg0 != 897034860) {
            method1664(-48, (class254) null);
        }
        ++field3779;
        if (~client.method1085(arg1).method1646((byte) -97) == -1) {
            return null;
        } else if (arg1.field4095 != null && ~arg1.field4095.trim().length() != -1) {
            return arg1.field4095;
        } else {
            return class266.field4381 ? "Hidden-use" : null;
        }
    }
}
