import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class21 extends class331 {

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "[Lid;")
    public static class415[] field261 = new class415[4];

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Lmq;")
    public static class78 field262 = new class78(37, 0);

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)V")
    public static void method221(byte arg0) {
        if (arg0 != -95) {
            field261 = null;
        }
        field262 = null;
        field261 = null;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILts;)V")
    public class21(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field266;
        return arg1 != 1 ? -126 : 1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III[Lgaa;ZZ)V")
    public static final void method223(int arg0, int arg1, int arg2, class460[] arg3, boolean arg4, boolean arg5) {
        for (int var6 = 0; arg3.length > var6; ++var6) {
            class460 var7 = arg3[var6];
            if (var7 != null && var7.field6528 == arg0) {
                class5.method23(arg5, arg2, (byte) -41, var7, arg1);
                class738.method4137(arg1, -897306066, arg2, var7);
                if (~(-var7.field6566 + var7.field6604) > ~var7.field6549) {
                    var7.field6549 = -var7.field6566 + var7.field6604;
                }
                if (~var7.field6466 < ~(var7.field6512 - var7.field6514)) {
                    var7.field6466 = -var7.field6514 + var7.field6512;
                }
                if (var7.field6549 < 0) {
                    var7.field6549 = 0;
                }
                if (~var7.field6466 > -1) {
                    var7.field6466 = 0;
                }
                if (~var7.field6483 == -1) {
                    class146.method908(arg5, 256, var7);
                }
            }
        }
        ++field263;
        if (!arg4) {
            method221((byte) -65);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lts;)V")
    public class21(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field260;
        if (super.field4203.method345((byte) 122) == class737.field10321) {
            super.field4202 = 2;
        }
        if (arg0 != -1959) {
            field262 = null;
        }
        if (super.field4202 < 0 || ~super.field4202 < -3) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)I")
    public final int method225(byte arg0) {
        ++field265;
        return arg0 >= -119 ? 85 : super.field4202;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        ++field267;
        return arg0 != 13 ? 60 : 1;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        if (arg0 < 113) {
            field262 = null;
        }
        ++field264;
        super.field4202 = arg1;
    }
}
