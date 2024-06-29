import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class193 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lt;")
    public static class212 field3148;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lrk;")
    public static class292 field3143;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lie;")
    public class34 field3149;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Luj;ILgi;Lgi;)V")
    public static final void method1349(class303 arg0, int arg1, class164 arg2, class164 arg3) {
        class9.field198 = arg3;
        class70.field1125 = arg0;
        field3146++;
        class101.field1580 = arg2;
        int var4 = -100 / ((arg1 - 52) / 51);
        if (class101.field1580 != null) {
            class240.field3750 = class101.field1580.method1145((byte) 101, 1);
        }
        if (class9.field198 != null) {
            class60.field872 = class9.field198.method1145((byte) 110, 1);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)Loi;")
    public static final class84 method1350(boolean arg0, int arg1) {
        field3144++;
        class84 var2 = (class84) class88.field1373.method1879(8887, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            byte[] var3 = class156.field2502.method1156(33, arg1, (byte) -16);
            class84 var4 = new class84();
            if (var3 != null) {
                var4.method602(-1, arg1, new class274(var3));
            }
            class88.field1373.method1883((long) arg1, -72, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lhe;")
    public static final class21 method1351(int arg0, int arg1) {
        field3145++;
        class21 var2 = (class21) class274.field4440.method61(52, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 1) {
            field3148 = null;
        }
        byte[] var3 = class230.field3599.method1156(26, arg0, (byte) -16);
        class21 var4 = new class21();
        if (var3 != null) {
            var4.method170(new class274(var3), -29953);
        }
        class274.field4440.method59(var4, (long) arg0, arg1 + 4);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1352(int arg0) {
        if (arg0 == 33) {
            field3143 = null;
            field3148 = null;
        }
    }
}
