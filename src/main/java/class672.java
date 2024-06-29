import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class672 extends class207 {

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field9007 = -1;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Led;")
    public static class732 field9002 = new class732(1, 2, 2, 0);

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Ljb;")
    public static class519 field9012 = new class519(83, -1);

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ILrd;)V")
    public class672(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method3704(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 > -98) {
            method3704(105, -126, (byte) -88, 106, 41, 41, 12, -39, 0);
        }
        class175.field2318[class586.field7974++] = new class378(arg3, arg0, arg8, arg7, arg7, arg8, arg6, arg5, arg5, arg6, arg1, arg1, arg4, arg4);
        ++field9006;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        ++field9009;
        if (arg0 > -14) {
            field9002 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lrd;)V")
    public class672(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIBIIZF)[[I")
    public static final int[][] method3705(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, boolean arg7, float arg8) {
        if (arg4 != 89) {
            field9012 = null;
        }
        ++field9011;
        int[][] var9 = new int[arg1][arg0];
        class128 var10 = new class128();
        var10.field1764 = arg2;
        var10.field1761 = arg6;
        var10.field1751 = (int) (arg8 * 4096.0F);
        var10.field1752 = arg3;
        var10.field1760 = arg7;
        var10.method46(-8);
        class685.method3757(-5975, arg0, arg1);
        for (int var11 = 0; var11 < arg1; ++var11) {
            var10.method910(arg4 ^ 81, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static void method3706(int arg0) {
        field9002 = null;
        if (arg0 > 23) {
            field9012 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        super.field2669 = arg0;
        if (arg1 > -7) {
            this.method36(12);
        }
        ++field9001;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        if (arg1 != 69) {
            field9002 = null;
        }
        ++field9003;
        return arg0 != 0 && ~super.field2668.field5147.method3686(43) != -2 ? 2 : 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
    public static final void method3707(int arg0, boolean arg1) {
        class282.field4078.method3101(arg1, arg0);
        ++field9005;
        class338.field4739.method3101(arg1, arg0);
        class647.field8730.method3101(arg1, arg0);
        class98.field1408.method3101(false, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        ++field9008;
        if (super.field2669 != 0 && super.field2668.field5147.method3686(43) != 1) {
            super.field2669 = 0;
        }
        if (~super.field2669 > -1 || ~super.field2669 < -2) {
            super.field2669 = this.method36(-78);
        }
        int var2 = -6 % ((arg0 - -58) / 48);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
    public final boolean method3708(byte arg0) {
        if (arg0 != 8) {
            return false;
        } else {
            ++field9010;
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)I")
    public final int method3709(int arg0) {
        ++field9004;
        if (arg0 != 43) {
            field9002 = null;
        }
        return super.field2669;
    }
}
