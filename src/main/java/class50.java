import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class50 implements class682 {

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lrk;")
    private class260 field695;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[C")
    public static char[] field693 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Lvd;")
    public static class635 field699 = new class635("stellardawn", 1);

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field705 = 0;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Lnv;")
    public static class655 field706 = null;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public static void method443(int arg0) {
        if (arg0 != 93) {
            method445(6, true);
        }
        field693 = null;
        field699 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Z")
    public final boolean method444(byte arg0) {
        if (arg0 > -10) {
            field699 = null;
        }
        field703++;
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IZ)V")
    public static final void method445(int arg0, boolean arg1) {
        if (arg1) {
            if (class196.field2562 != -1) {
                class469.method2601(class196.field2562, (byte) -77);
            }
            for (class270 var2 = (class270) class700.field9763.method42((byte) 95); var2 != null; var2 = (class270) class700.field9763.method40(false)) {
                if (!var2.method2440(121)) {
                    var2 = (class270) class700.field9763.method42((byte) 102);
                    if (var2 == null) {
                        break;
                    }
                }
                class298.method1764(false, -99, true, var2);
            }
            class196.field2562 = -1;
            class700.field9763 = new class9(8);
            class503.method2717(0);
            class196.field2562 = class196.field2551;
            class380.method2169(true, false);
            class211.method1355(-21784);
            class709.method3890(class196.field2562);
        }
        field697++;
        if (arg0 != -9017) {
            field693 = null;
        }
        class642.field8932 = true;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V")
    public static final void method446(byte arg0, int arg1) {
        if (class426.field5523 == 0) {
            class359.field4658.method2930(arg1, -126);
        } else {
            class332.field4314 = arg1;
        }
        field694++;
        if (arg0 != 58) {
            field705 = -90;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)Z")
    public static final boolean method447(int arg0, int arg1, int arg2) {
        if (arg1 == 5978) {
            field704++;
            return (arg2 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
    public final void method448(int arg0, boolean arg1) {
        if (arg0 == -207) {
            field691++;
            if (arg1) {
                class520.field6799.method353(0, 0, class519.field6796, class461.field6047, this.field695.field3503, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public final void method449(int arg0) {
        int var2 = 56 % ((65 - arg0) / 45);
        field696++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)I")
    public static final int method450(int arg0, int arg1) {
        int var2 = 113 / ((arg1 + 75) / 42);
        field700++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field701++;
        class367 var5 = class573.method3057(8, arg1, 2);
        var5.method2115(1);
        var5.field4736 = arg0;
        var5.field4735 = arg4;
        var5.field4742 = arg2;
        if (arg3 >= -125) {
            method443(22);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)V")
    public static final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field702++;
        int var8 = arg0 + 1;
        class349.method2008(arg1, (byte) 27, class213.field2746[arg0], arg2, arg5);
        int var9 = arg4 - 1;
        class349.method2008(arg1, (byte) 105, class213.field2746[arg4], arg2, arg5);
        int var6 = var8;
        if (arg3 != 1) {
            field705 = -47;
        }
        while (var9 >= var6) {
            int[] var7 = class213.field2746[var6];
            var7[arg2] = var7[arg1] = arg5;
            var6++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILut;II)J")
    public static final long method453(int arg0, class620 arg1, int arg2, int arg3) {
        field692++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class698 var10 = class348.field4436.method1900(-112, arg1.method76((byte) -93));
        long var11 = (long) (arg1.method66((byte) -42) << 14 | arg0 << 7 | arg3 | arg1.method70(true) << 20 | 0x40000000);
        if (var10.field9660 == 0) {
            var11 |= var8;
        }
        if (var10.field9628 == 1) {
            var11 |= var4;
        }
        if (var10.field9624) {
            var11 |= var6;
        }
        long var13 = var11 | (long) arg1.method76((byte) -97) << 32;
        int var15 = -24 % ((75 - arg2) / 50);
        return var13;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lrk;)V")
    public class50(class260 arg0) {
        this.field695 = arg0;
    }
}
