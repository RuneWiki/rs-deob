import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class206 {

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field3481 = 1;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field3482 = -1;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "J")
    public static long field3484;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "J")
    public long field3488;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lh;")
    public class206 field3483;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lh;")
    public class206 field3490;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lcb;")
    public static class267 field3487;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "[I")
    public static int[] field3489;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)I", line = 25)
    public static final int method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        field3480++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 1 + 7 - arg6 - arg2;
        } else if (var7 == 2) {
            return 1 + 7 - arg1 - arg3;
        } else {
            int var9 = 17 / ((arg0 + 15) / 53);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 59)
    public static void method1523(int arg0) {
        field3489 = null;
        if (arg0 == 1) {
            field3487 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Z", line = 70)
    public final boolean method1524(int arg0) {
        if (arg0 <= 44) {
            this.method1527(-89);
        }
        field3491++;
        return this.field3490 != null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Leh;", line = 90)
    public static final class156 method1525(int arg0, int arg1, int arg2) {
        class156 var3 = (class156) class24.field312.method1007((long) arg2 | (long) arg0 << 32, arg1 + 15697);
        if (arg1 != -32701) {
            return (class156) null;
        }
        if (var3 == null) {
            var3 = new class156(arg0, arg2);
            class24.field312.method1004((byte) 73, var3.field3488, var3);
        }
        field3478++;
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILwa;I)V", line = 114)
    public static final void method1526(int arg0, class75 arg1, int arg2) {
        field3479++;
        class156 var3 = method1525(2, -32701, arg2);
        var3.method1183(true);
        var3.field2685 = arg1;
        if (arg0 != -3) {
            method1523(-88);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 135)
    public final void method1527(int arg0) {
        int var2 = 8 % ((-arg0 - 8) / 45);
        field3485++;
        if (this.field3490 != null) {
            this.field3490.field3483 = this.field3483;
            this.field3483.field3490 = this.field3490;
            this.field3483 = null;
            this.field3490 = null;
        }
    }
}
