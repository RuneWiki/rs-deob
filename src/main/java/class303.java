import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class303 extends class485 {

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "[I")
    public int[] field3791;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "[I")
    public int[] field3788;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Ldh;")
    public static class320 field3786 = new class320(73, -2);

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILha;IZ)Lda;")
    public static final class59 method1822(int arg0, class58 arg1, int arg2, boolean arg3) {
        field3792++;
        if (arg0 == -3457) {
            class667 var4 = class104.method718(93, arg1, arg3, arg2);
            return var4 == null ? null : var4.field9491;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        field3786 = null;
        if (arg0 != 38) {
            method1823((byte) -77);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIILnv;I)Ltea;")
    public static final class238 method1824(int arg0, int arg1, int arg2, int arg3, class417 arg4, int arg5) {
        field3787++;
        if (arg1 != 3553) {
            field3786 = null;
        }
        if (!arg4.field6061 && (!class560.method3273(-3469, arg2) || !class560.method3273(-3469, arg0))) {
            return arg4.field5996 ? new class238(arg4, 34037, arg5, arg3, arg2, arg0, true) : new class238(arg4, arg5, arg3, arg2, arg0, class756.method4202(true, arg2), class756.method4202(true, arg0), true);
        } else {
            return new class238(arg4, 3553, arg5, arg3, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(II[I[I)V")
    public class303(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3791 = arg2;
        this.field3788 = arg3;
    }
}
