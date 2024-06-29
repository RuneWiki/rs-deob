import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class489 implements class595 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[S")
    public static short[] field6819 = new short[256];

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lmw;")
    public static class517 field6821 = new class517(90, 3);

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lsia;")
    public static class765 field6822 = new class765();

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[Z")
    public static boolean[] field6818;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([IJLed;I)Ljava/lang/String;", line = 5)
    public final String method2860(int[] arg0, long arg1, class732 arg2, int arg3) {
        field6817++;
        if (class548.field7575 == arg2) {
            class385 var6 = class22.field213.method2583(123, arg0[0]);
            return var6.method2396((int) arg1, 27180);
        } else if (class672.field9002 == arg2 || class777.field10681 == arg2) {
            class369 var7 = class16.field156.method2121((int) arg1, arg3 + 39060);
            return var7.field5349;
        } else {
            if (arg3 != -13132) {
                field6819 = null;
            }
            return class749.field10085 == arg2 || class452.field6491 == arg2 || class574.field7824 == arg2 ? class22.field213.method2583(arg3 + 13258, arg0[0]).method2396((int) arg1, 27180) : null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V", line = 35)
    public static final void method2861(int arg0, int arg1) {
        field6814++;
        class778 var2 = class389.method2406(-100, (long) arg1, 2);
        int var3 = -105 / ((arg0 + 66) / 32);
        var2.method4276(0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lub;I)I", line = 53)
    public static final int method2862(class22 arg0, int arg1) {
        field6816++;
        class304 var2 = arg0.field217;
        if (var2.field4295 != null) {
            var2 = var2.method1968(class480.field6740, -1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4330;
        class588 var4 = arg0.method2573(-1);
        if (arg0.field6111 == arg1 || arg0.field6128) {
            var3 = var2.field4285;
        } else if (arg0.field6111 == var4.field8030 || arg0.field6111 == var4.field7992 || arg0.field6111 == var4.field8008 || arg0.field6111 == var4.field8000) {
            var3 = var2.field4263;
        } else if (arg0.field6111 == var4.field7989 || arg0.field6111 == var4.field7985 || arg0.field6111 == var4.field8018 || arg0.field6111 == var4.field8009) {
            var3 = var2.field4262;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIB)I", line = 86)
    public static final int method2863(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 & 0x3;
        field6815++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else {
            int var5 = 30 / ((48 - arg3) / 63);
            return var4 == 2 ? 4095 - arg0 : 4095 - arg2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Luq;I)V", line = 107)
    public static final void method2864(class172 arg0, int arg1) {
        class728.field9886 = arg0.method1173(false, "p11_full");
        field6820++;
        class290.field4141 = arg0.method1173(false, "p12_full");
        class125.field1720 = arg0.method1173(false, "b12_full");
        if (arg1 != -3) {
            method2864(null, -117);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 121)
    public static void method2865(int arg0) {
        if (arg0 != 3) {
            field6818 = null;
        }
        field6821 = null;
        field6819 = null;
        field6822 = null;
        field6818 = null;
    }
}
