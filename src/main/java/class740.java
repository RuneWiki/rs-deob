import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class740 extends class649 {

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "Ltm;")
    public static class334 field10379 = new class334(73, 4);

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field10386;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field10388;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Lek;")
    public static class598 field10382;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
    public static final void method4140(int arg0, long[] arg1, Object[] arg2, int arg3, int arg4) {
        ++field10383;
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; arg3 > var11; ++var11) {
                if (arg1[var11] < var7 - -((long) (var10 & var11))) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method4140(-1, arg1, arg2, var6 + -1, arg4);
            method4140(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 != -1) {
            field10382 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)I")
    public final int method4141(int arg0) {
        ++field10387;
        return arg0 != 3 ? 52 : super.field9223;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(ILhs;)V")
    public class740(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)Z")
    public final boolean method4142(int arg0) {
        ++field10378;
        if (super.field9224.method2294((byte) -116)) {
            return false;
        } else if (super.field9224.method2291(-11) == class565.field8012) {
            return true;
        } else {
            if (arg0 != -16181) {
                field10379 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field10385;
        int var2 = 13 / ((-18 - arg0) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lhs;)V")
    public class740(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        if (arg1 > -120) {
            field10382 = null;
        }
        ++field10386;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 != 1) {
            this.method4141(-2);
        }
        if (super.field9224.method2291(arg0 ^ -12) == class565.field8012) {
            if (super.field9224.method2294((byte) -106)) {
                super.field9223 = 0;
            }
        } else {
            super.field9223 = 1;
        }
        ++field10388;
        if (~super.field9223 != -1 && super.field9223 != 1) {
            super.field9223 = this.method135(80);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V")
    public static void method4143(boolean arg0) {
        field10379 = null;
        field10382 = null;
        if (!arg0) {
            method4145((byte) 69);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([IB)Ljava/lang/String;")
    public static final String method4144(int[] arg0, byte arg1) {
        ++field10380;
        StringBuffer var2 = new StringBuffer();
        int var3 = class758.field10581;
        if (arg1 < 23) {
            method4145((byte) 9);
        }
        for (int var4 = 0; ~var4 > ~arg0.length; ++var4) {
            class177 var5 = class122.field1882.method3640((byte) 115, arg0[var4]);
            if (~var5.field3037 != 0) {
                class34 var6 = (class34) class527.field7586.method80((byte) -86, (long) var5.field3037);
                if (var6 == null) {
                    class726 var7 = class726.method4002(class101.field1494, var5.field3037, 0);
                    if (var7 != null) {
                        var6 = class364.field5573.method310(var7, true);
                        class527.field7586.method67((long) var5.field3037, var6, -6772);
                    }
                }
                if (var6 != null) {
                    class625.field8753[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field10384;
        if (arg0 != 18648) {
            return 104;
        } else if (super.field9224.method2294((byte) -121)) {
            return 3;
        } else {
            return super.field9224.method2291(-11) == class565.field8012 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
    public static final void method4145(byte arg0) {
        class263.field4079 = -1;
        class129.field2118 = 0;
        ++field10381;
        class257.field4036 = -1;
        if (arg0 <= 78) {
            method4144((int[]) null, (byte) -108);
        }
        class404.field5991 = -1;
    }
}
