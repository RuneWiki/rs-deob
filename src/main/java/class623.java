import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class623 {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field8738 = 0;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field8733 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
    public static boolean field8736 = true;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lho;")
    public static class318[] field8739;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILbja;Lha;)I")
    public static final int method3583(int arg0, class250 arg1, class473 arg2) {
        field8731++;
        if (arg1.field3716 != -1) {
            return arg1.field3716;
        }
        if (arg1.field3706 != -1) {
            class744 var3 = arg2.field6556.method581(-21732, arg1.field3706);
            if (!var3.field10264) {
                return var3.field10266;
            }
        }
        if (arg0 != -1) {
            method3585(-126, null);
        }
        return arg1.field3713;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method3584(int arg0) {
        field8739 = null;
        if (arg0 <= 100) {
            method3586(2, -94L);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method3585(int arg0, String arg1) {
        if (arg0 != 0) {
            method3585(46, null);
        }
        field8737++;
        return class564.method3335(true, 10, -16230, arg1);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IJ)V")
    public static final void method3586(int arg0, long arg1) {
        field8734++;
        if (arg0 >= -123) {
            field8739 = null;
        }
        if (class59.field688 != null) {
            if (class695.field9691 == 1 || class695.field9691 == 5) {
                class419.method2536((byte) -68, arg1);
            } else if (class695.field9691 == 4) {
                class495.method2913(arg1, false);
            }
        }
        class791.method4331((byte) -77, class111.field1332, (long) class533.field7336);
        if (class610.field8597 != -1) {
            class539.method3204(0, class610.field8597);
        }
        for (int var3 = 0; var3 < class187.field2331; var3++) {
            if (class363.field5240[var3]) {
                class585.field8271[var3] = true;
            }
            class435.field6034[var3] = class363.field5240[var3];
            class363.field5240[var3] = false;
        }
        class665.field9355 = class533.field7336;
        class88.method655(null, -1, -1, 59);
        class400.method2459(-1, -1, null, 5510);
        if (class610.field8597 != -1) {
            class187.field2331 = 0;
            class617.method3563(123);
        }
        class111.field1332.method208();
        class35.method285(class111.field1332, 125);
        int var4 = class188.method1177((byte) -111);
        if (var4 == -1) {
            var4 = class213.field2954;
        }
        if (var4 == -1) {
            var4 = class574.field8082;
        }
        class243.method1629(var4, 4592);
        int var5 = class724.field10031.method3744(1) << 8;
        class224.method1512(class510.field6925, 2, class724.field10031.field3470 + var5, class724.field10031.field3467, class724.field10031.field3460 + var5);
        class510.field6925 = 0;
    }
}
