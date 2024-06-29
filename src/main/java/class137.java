import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class137 extends class136 {

    @OriginalMember(owner = "client!qd", name = "Gb", descriptor = "[[B")
    public byte[][] field2420 = new byte[256][];

    @OriginalMember(owner = "client!qd", name = "Eb", descriptor = "Lqe;")
    public static class168 field2418 = class66.method448("rot:", -114);

    @OriginalMember(owner = "client!qd", name = "Cb", descriptor = "I")
    public static int field2416 = 0;

    @OriginalMember(owner = "client!qd", name = "Ib", descriptor = "[I")
    public static int[] field2422 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qd", name = "Mb", descriptor = "I")
    public static int field2426 = -1;

    @OriginalMember(owner = "client!qd", name = "Fb", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!qd", name = "Hb", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!qd", name = "Jb", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!qd", name = "Kb", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!qd", name = "Lb", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!qd", name = "Db", descriptor = "Lrd;")
    public static class207 field2417;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2422 = null;
        field2418 = null;
        field2417 = null;
        if (arg0 != 16711935) {
            field2426 = -75;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    public class137(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2425++;
        int var7 = class216.field3729 * arg2 + arg1;
        int var8 = class216.field3729 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class216.field3732) {
            int var11 = class216.field3732 - arg2;
            var10 += arg3 * var11;
            arg4 -= var11;
            var7 += class216.field3729 * var11;
            arg2 = class216.field3732;
        }
        if (arg2 + arg4 > class216.field3727) {
            arg4 -= arg2 + arg4 - class216.field3727;
        }
        if (arg1 < class216.field3733) {
            int var12 = class216.field3733 - arg1;
            arg1 = class216.field3733;
            var9 += var12;
            var8 += var12;
            var10 += var12;
            var7 += var12;
            arg3 -= var12;
        }
        if (arg1 + arg3 > class216.field3728) {
            int var13 = arg3 + arg1 - class216.field3728;
            arg3 -= var13;
            var8 += var13;
            var9 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class83.method550(arg4, var9, -102, var8, var10, arg5, this.field2420[arg0], class216.field3731, var7, arg3);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIIII)V")
    public final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2424++;
        int var8 = class216.field3729 * arg2 + arg1;
        int var9 = class216.field3729 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class216.field3732) {
            int var12 = class216.field3732 - arg2;
            arg2 = class216.field3732;
            var11 += arg3 * var12;
            arg4 -= var12;
            var8 += class216.field3729 * var12;
        }
        if (class216.field3727 < arg2 + arg4) {
            arg4 -= arg4 + arg2 - class216.field3727;
        }
        if (arg1 < class216.field3733) {
            int var13 = class216.field3733 - arg1;
            arg3 -= var13;
            var11 += var13;
            var10 += var13;
            var9 += var13;
            var8 += var13;
            arg1 = class216.field3733;
        }
        if (arg1 + arg3 > class216.field3728) {
            int var14 = arg1 + arg3 - class216.field3728;
            var10 += var14;
            var9 += var14;
            arg3 -= var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class56.method391(arg3, var9, var8, var11, this.field2420[arg0], (byte) -20, class216.field3731, arg5, arg4, arg6, var10);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class137(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2420 = arg5;
    }
}
