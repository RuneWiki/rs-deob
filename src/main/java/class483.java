import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class483 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lst;")
    public static class335 field6734 = new class335(10, -1);

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "D")
    public static double field6740 = -1.0D;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field6741 = 0;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lrea;")
    public static class121 field6736;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Lgh;")
    public static class50 field6739;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I", line = 5)
    public static final int method2939(int arg0, int arg1) {
        if (arg0 == 407500840) {
            field6737++;
            return arg1 >>> 8;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 28)
    public static void method2943(int arg0) {
        field6734 = null;
        field6736 = null;
        if (arg0 >= -13) {
            method2939(112, 1);
        }
        field6739 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V", line = 47)
    public static final void method2944(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6735++;
        if (class521.field7260 != 1) {
            return;
        }
        int var5 = arg2 / class494.field6919;
        int var6 = arg0 / class494.field6919;
        int var7 = arg3 / class319.field4441;
        int var8 = arg1 / class319.field4441;
        if (class557.field7745 <= var5 || var6 < 0 || class17.field172 <= var7 || var8 < 0) {
            return;
        }
        if (class17.field172 <= var8) {
            var8 = class17.field172 - 1;
        }
        if (~var7 > arg4) {
            var7 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class557.field7745 <= var6) {
            var6 = class557.field7745 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class328.method2109((byte) 56, class17.field172, var9 + class517.field7217) * class557.field7745;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class328.method2109((byte) 55, class557.field7745, class172.field2389 + var11);
                class321.field4463[var12] = class114.field1525;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2940(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2941(int arg0);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([BI)V")
    public abstract void method2942(byte[] arg0, int arg1);
}
