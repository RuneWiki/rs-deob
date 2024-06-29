import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class569 {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    private int field8010;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "B")
    public byte field8011;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field8017;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field8006;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field8009;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field8003;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field8007;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public int field8012;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field8013;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field8014;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public int field8015;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public int field8018;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field8019;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public int field8020;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lqi;")
    public class569 field8008;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lbm;", line = 3)
    public final class115 method3265(byte arg0) {
        field8016++;
        return arg0 == -26 ? class556.method3212(0, this.field8010) : null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)Lqi;", line = 17)
    public final class569 method3266(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 110) {
            this.method3265((byte) -65);
        }
        field8004++;
        return new class569(this.field8010, arg3, arg2, arg1, this.field8011);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILvea;IIILha;IIBIII)V", line = 42)
    public static final void method3267(int arg0, class277 arg1, int arg2, int arg3, int arg4, class60 arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        field8005++;
        if (arg3 > arg7 && (arg7 + arg10) > arg3 && arg9 - 13 < arg6 && (arg9 + 3) > arg6 && arg1.field3476) {
            arg2 = arg11;
        }
        int[] var12 = null;
        if (arg8 > -107) {
            return;
        }
        if (class36.method228(arg1.field3478, 610)) {
            var12 = class21.field381.method1583(-72, (int) arg1.field3480).field8817;
        } else if (arg1.field3473 != -1) {
            var12 = class21.field381.method1583(122, arg1.field3473).field8817;
        } else if (class491.method2902(arg1.field3478, 116)) {
            class592 var13 = (class592) class207.field2745.method1160((long) ((int) arg1.field3480), 119);
            if (var13 != null) {
                class733 var14 = var13.field8280;
                class131 var15 = var14.field10192;
                if (var15.field1899 != null) {
                    var15 = var15.method981(23, class516.field7236);
                }
                if (var15 != null) {
                    var12 = var15.field1863;
                }
            }
        } else if (class473.method2693(-51, arg1.field3478)) {
            Object var16 = null;
            class543 var17;
            if (arg1.field3478 == 1003) {
                var17 = client.field3995.method3384((int) arg1.field3480, false);
            } else {
                var17 = client.field3995.method3384((int) (arg1.field3480 >>> 32 & 0x7FFFFFFFL), false);
            }
            if (var17.field7541 != null) {
                var17 = var17.method3111(class516.field7236, -99);
            }
            if (var17 != null) {
                var12 = var17.field7542;
            }
        }
        String var18 = class699.method3929(arg1, -8669);
        if (var12 != null) {
            var18 = var18 + class339.method1949(-59, var12);
        }
        class242.field3132.method562(arg9, arg7 + 3, arg2, (byte) -60, class679.field9480, var18, class120.field1751, 0);
        if (arg1.field3484) {
            class745.field10382.method2759(arg7 + class270.field3406.method1619(false, var18) + 5, arg9 + -12);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIB)V", line = 118)
    public class569(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8010 = arg0;
        this.field8011 = arg4;
        this.field8017 = arg2;
        this.field8006 = arg3;
        this.field8009 = arg1;
    }
}
