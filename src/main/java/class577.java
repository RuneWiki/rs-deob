import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class577 {

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public int field7741;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public int field7737;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "B")
    public byte field7746;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    public int field7745;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    private int field7729;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "Lmt;")
    public static class419 field7744 = new class419(4, 1, 1, 1);

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public int field7730;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public int field7731;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public int field7733;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public int field7734;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "I")
    public int field7738;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public int field7739;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public int field7747;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "I")
    public int field7748;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
    public int field7750;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "Lcba;")
    public class577 field7732;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)Lcba;", line = 6)
    public final class577 method3216(int arg0, int arg1, int arg2, int arg3) {
        field7751++;
        return arg1 == 0 ? new class577(this.field7729, arg2, arg3, arg0, this.field7746) : null;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method3217(int arg0, int arg1, int arg2) {
        field7749++;
        if (arg2 == 0) {
            return (arg0 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)Lnd;", line = 39)
    public final class571 method3218(boolean arg0) {
        field7743++;
        if (arg0) {
            method3222(-66, false, (byte) -75);
        }
        return class440.method2648(this.field7729, false);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)Llda;", line = 57)
    public static final class513 method3219(int arg0) {
        field7736++;
        if (class196.field2620 < class791.field10877.length) {
            return class791.field10877[class196.field2620++];
        } else {
            if (arg0 < 77) {
                field7744 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZI)V", line = 74)
    public static final void method3220(int arg0, boolean arg1, int arg2) {
        field7740++;
        class166 var3 = class389.method2461((byte) -126, arg0, arg1);
        if (var3 != null) {
            var3.method792((byte) -128);
            if (arg2 <= 44) {
                method3219(-123);
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(Z)V", line = 91)
    public static void method3221(boolean arg0) {
        if (!arg0) {
            field7744 = null;
        }
        field7744 = null;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZB)V", line = 104)
    public static final void method3222(int arg0, boolean arg1, byte arg2) {
        field7735++;
        class56 var3 = arg1 ? class66.field952 : class285.field4208;
        if (var3 == null || arg0 < 0 || arg0 >= var3.field777) {
            return;
        }
        class179 var4 = var3.field786[arg0];
        if (var4.field2381 != -1) {
            return;
        }
        if (arg2 > -17) {
            field7744 = null;
        }
        String var5 = var4.field2378;
        class267 var6 = class545.method3099((byte) 90, class269.field3966, class754.field10481);
        var6.field3938.method2380(65280, class469.method2769(var5, (byte) 105) + 3);
        var6.field3938.method2380(65280, arg1 ? 1 : 0);
        var6.field3938.method2415(false, arg0);
        var6.field3938.method2349(88, var5);
        class617.method3392(var6, true);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZB)V", line = 134)
    public static final void method3223(boolean arg0, byte arg1) {
        class468.field6495.method986(class86.field1200.method565());
        field7742++;
        int[] var2 = class86.field1200.method496();
        class57.field792 = var2[0];
        class598.field8146 = var2[2];
        if (arg1 != -92) {
            method3220(22, true, 93);
        }
        class230.field3135 = var2[3];
        class391.field5770 = var2[1];
        if (arg0) {
            class86.field1200.method540(class99.field1362, class24.field383, class670.field9425, class659.field9119);
            class554.method3129((byte) -103, class268.field3943);
        } else {
            class86.field1200.method540(class550.field7452, class344.field5061, class404.field5866, class664.field9176);
            class554.method3129((byte) -82, class9.field137);
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(IIIIB)V", line = 163)
    public class577(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7741 = arg2;
        this.field7737 = arg3;
        this.field7746 = arg4;
        this.field7745 = arg1;
        this.field7729 = arg0;
    }
}
