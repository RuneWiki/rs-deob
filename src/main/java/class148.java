import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class148 extends class216 {

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "Lsj;")
    public class110 field2672;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field2674 = 0;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "F")
    public static float field2668;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)I", line = 5)
    public static final int method1173(int arg0, int arg1) {
        if (arg0 != -172139252) {
            field2674 = -6;
        }
        field2671++;
        return (arg1 & 0x3FE13) >> 11;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)I", line = 39)
    public static final int method1174(int arg0, int arg1) {
        if (arg0 <= 22) {
            method1174(-40, -10);
        }
        field2669++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZIII)V", line = 52)
    public static final void method1175(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2670++;
        int var6 = arg0 - arg3;
        int var7 = arg4 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class154.method1201(arg0, arg3, arg5, arg1, true);
            }
        } else if (var6 == 0) {
            class149.method1180(arg5, arg4, (byte) 103, arg3, arg1);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg3 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class112.field2028 > arg5) {
                var11 = (class112.field2028 * var8 >> 12) + var9;
                var10 = class112.field2028;
            } else if (arg5 <= class82.field1426) {
                var10 = arg5;
                var11 = arg3;
            } else {
                var10 = class82.field1426;
                var11 = var9 + (class82.field1426 * var8 >> 12);
            }
            if (var11 < class303.field5106) {
                var10 = (class303.field5106 - var9 << 12) / var8;
                var11 = class303.field5106;
            } else if (class298.field4989 < var11) {
                var11 = class298.field4989;
                var10 = (class298.field4989 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class112.field2028 > arg4) {
                var12 = class112.field2028;
                var13 = (class112.field2028 * var8 >> 12) + var9;
            } else if (class82.field1426 < arg4) {
                var12 = class82.field1426;
                var13 = var9 + (class82.field1426 * var8 >> 12);
            } else {
                var13 = arg0;
                var12 = arg4;
            }
            if (var13 < class303.field5106) {
                var13 = class303.field5106;
                var12 = (class303.field5106 - var9 << 12) / var8;
            } else if (var13 > class298.field4989) {
                var13 = class298.field4989;
                var12 = (class298.field4989 - var9 << 12) / var8;
            }
            if (arg2) {
                method1174(-93, -63);
            }
            class139.method1085(arg1, var10, var12, var11, var13, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(II)I", line = 153)
    public static final int method1176(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 167)
    public static final void method1177(int arg0) {
        field2673++;
        class251 var1 = class240.field3998;
        synchronized (class240.field3998) {
            class92.field1628 = class297.field4972;
            class109.field1961 = class62.field969;
            if (arg0 != -1225615508) {
                field2674 = -27;
            }
            class305.field5141++;
            class274.field4554 = class228.field3794;
            class238.field3954 = class266.field4441;
            class153.field2721 = class253.field4218;
            class183.field3158 = class264.field4397;
            class66.field1048 = class207.field3492;
            class266.field4441 = 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lsj;)V", line = 192)
    public class148(class110 arg0) {
        this.field2672 = arg0;
    }
}
