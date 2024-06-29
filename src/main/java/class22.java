import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class22 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Luu;")
    public static class191 field327;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
    public static final void method203(int arg0, byte arg1) {
        field329++;
        class177 var2 = class344.method2229(10, arg0, (byte) 103);
        if (arg1 <= -54) {
            var2.method1194(-114);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILga;I)V")
    public static final void method204(int arg0, int arg1, class282 arg2, int arg3) {
        if (arg2.field4127 == 0) {
            arg2.field4010 = arg2.field4155;
        } else if (arg2.field4127 == 1) {
            arg2.field4010 = (arg3 - arg2.field4043) / 2 + arg2.field4155;
        } else if (arg2.field4127 == 2) {
            arg2.field4010 = arg3 - arg2.field4155 - arg2.field4043;
        } else if (arg2.field4127 == 3) {
            arg2.field4010 = arg2.field4155 * arg3 >> 14;
        } else if (arg2.field4127 == 4) {
            arg2.field4010 = (arg2.field4155 * arg3 >> 14) + (arg3 - arg2.field4043) / 2;
        } else {
            arg2.field4010 = arg3 - arg2.field4043 - (arg2.field4155 * arg3 >> 14);
        }
        if (arg0 != 1160694670) {
            method203(25, (byte) 83);
        }
        if (arg2.field3993 == 0) {
            arg2.field4032 = arg2.field4130;
        } else if (arg2.field3993 == 1) {
            arg2.field4032 = (arg1 - arg2.field3991) / 2 + arg2.field4130;
        } else if (arg2.field3993 == 2) {
            arg2.field4032 = arg1 - arg2.field4130 - arg2.field3991;
        } else if (arg2.field3993 == 3) {
            arg2.field4032 = arg2.field4130 * arg1 >> 14;
        } else if (arg2.field3993 == 4) {
            arg2.field4032 = (arg2.field4130 * arg1 >> 14) + (arg1 - arg2.field3991) / 2;
        } else {
            arg2.field4032 = arg1 - arg2.field3991 - (arg2.field4130 * arg1 >> 14);
        }
        field330++;
        if (!class215.field3038) {
            return;
        }
        if (client.method1348(arg2).field6684 == 0 && arg2.field4103 != 0) {
            return;
        }
        if (arg2.field4010 < 0) {
            arg2.field4010 = 0;
        } else if (arg2.field4043 + arg2.field4010 > arg3) {
            arg2.field4010 = arg3 - arg2.field4043;
        }
        if (arg2.field4032 < 0) {
            arg2.field4032 = 0;
            return;
        }
        if (arg2.field4032 + arg2.field3991 > arg1) {
            arg2.field4032 = arg1 - arg2.field3991;
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method205(int arg0) {
        if (class435.field6596 == 2) {
            class134.method908(3, 2);
        } else if (class435.field6596 == 6) {
            class134.method908(7, 2);
        } else if (class435.field6596 == 9) {
            class134.method908(10, 2);
        }
        if (arg0 >= -22) {
            method204(-20, -6, null, 32);
        }
        field325++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method206(byte arg0) {
        if (arg0 != 0) {
            method203(50, (byte) -74);
        }
        field327 = null;
    }
}
