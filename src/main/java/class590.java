import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class590 extends class227 {

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field8318 = 0;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field8319 = 0;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lit;")
    private class34 field8313;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 3)
    public final void method576(int arg0) {
        super.method576(arg0);
        ++field8323;
        this.field8313 = class451.method2768(super.field3635, -38, ((class165) super.field3638).field2533);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 12)
    public static final void method3388(int arg0, int arg1, int arg2) {
        ++field8314;
        class118 var3 = class86.method755(true, 7, arg1);
        var3.method933((byte) 103);
        var3.field1811 = arg0;
        if (arg2 != 0) {
            method3391((byte) -98, 24, 71, 104, -98, -88, 37, -45, 101);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIZ)V", line = 28)
    public final void method821(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field8321;
        if (arg1 != -30) {
            field8318 = 20;
        }
        int var5 = this.method1588(arg1 ^ 1032) * super.field3638.field1076 / 10000;
        int[] var6 = new int[4];
        class364.field5573.method331(var6);
        class364.field5573.method240(arg0, arg2 + 2, arg0 + var5, arg2 - -super.field3638.field1078);
        this.field8313.method188(arg0, arg2 - -2, super.field3638.field1076, super.field3638.field1078);
        class364.field5573.method240(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z", line = 47)
    public final boolean method574(byte arg0) {
        ++field8322;
        if (arg0 < 96) {
            this.method576(44);
        }
        return !super.method574((byte) 120) ? false : super.field3635.method2621(((class165) super.field3638).field2533, -28975);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIZI)V", line = 64)
    public final void method824(boolean arg0, int arg1, boolean arg2, int arg3) {
        class364.field5573.method224(arg1 - 2, arg3, super.field3638.field1076 - -4, super.field3638.field1078 + 2, ((class165) super.field3638).field2537, 0);
        ++field8324;
        class364.field5573.method224(arg1 - 1, arg3 + 1, super.field3638.field1076 - -2, super.field3638.field1078, 0, 0);
        if (arg0) {
            this.method821(-12, (byte) 55, 61, true);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BB)V", line = 76)
    public static final void method3389(byte arg0, byte arg1) {
        ++field8315;
        if (arg1 < 1) {
            field8319 = 120;
        }
        if (class327.field4817 == null) {
            class327.field4817 = new byte[4][class191.field3229][class314.field4720];
        }
        for (int var2 = 0; ~var2 > -5; ++var2) {
            for (int var3 = 0; ~var3 > ~class191.field3229; ++var3) {
                for (int var4 = 0; ~var4 > ~class314.field4720; ++var4) {
                    class327.field4817[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)I", line = 112)
    public static final int method3390(int arg0, int arg1, int arg2) {
        if (arg1 != 31019) {
            method3389((byte) 22, (byte) -88);
        }
        ++field8320;
        int var3 = arg0 + -1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg0 - -var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIIIIIIII)Z", line = 126)
    public static final boolean method3391(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8317;
        if (~arg6 > ~(arg1 - -arg7) && ~arg1 > ~(arg5 + arg6)) {
            if (arg0 >= -75) {
                method3391((byte) 105, 57, -55, 103, 53, 112, -122, 99, -65);
            }
            return ~arg3 > ~(arg2 + arg8) && ~arg2 > ~(arg3 - -arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lla;Lla;Lwda;)V", line = 147)
    public class590(class422 arg0, class422 arg1, class165 arg2) {
        super(arg0, arg1, arg2);
    }
}
