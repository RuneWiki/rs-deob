import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class739 extends class627 {

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Ljava/lang/String;")
    public String field10338;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "[I")
    public static int[] field10339 = new int[32];

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
    public static int[] field10343 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Lmq;")
    public static class78 field10341 = new class78(101, 0);

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "Lmq;")
    public static class78 field10346 = new class78(54, 4);

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lha;Lgaa;B)V", line = 3)
    public static final void method4138(class454 arg0, class460 arg1, byte arg2) {
        field10340++;
        boolean var3 = class190.field2488.method3948((byte) -83, arg1.field6470, arg1.field6616, arg1.field6556, arg1.field6499 | 0xFF000000, arg1.field6598 ? class339.field4374.field7665 : null, arg1.field6568, arg0) == null;
        if (var3) {
            class118.field1431.method3110(new class189(arg1.field6556, arg1.field6470, arg1.field6568, arg1.field6499 | 0xFF000000, arg1.field6616, arg1.field6598), 1);
            class663.method3591(16886, arg1);
        }
        if (arg2 >= -61) {
            field10339 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method4139(int arg0, int arg1, int arg2) {
        if (arg0 > -76) {
            method4142(50, -86, 78, 107);
        }
        field10342++;
        return class24.method263(arg1, -2814, arg2) || class34.method315(arg1, arg2, (byte) -67);
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V", line = 36)
    public class739() {
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BII)Z", line = 39)
    public static final boolean method4140(byte arg0, int arg1, int arg2) {
        field10345++;
        if (arg0 <= 48) {
            return true;
        } else if (arg2 >= 0 && arg1 >= 0 && arg2 < class215.field2728[1].length && arg1 < class215.field2728[1][arg2].length) {
            return (class215.field2728[1][arg2][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 63)
    public static void method4141(int arg0) {
        field10341 = null;
        field10343 = null;
        field10346 = null;
        if (arg0 == 31285) {
            field10339 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)I", line = 77)
    public static final int method4142(int arg0, int arg1, int arg2, int arg3) {
        field10344++;
        if (arg3 >= -30) {
            method4139(-80, 71, 2);
        }
        if ((class215.field2728[arg1][arg0][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class215.field2728[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 95)
    public class739(String arg0) {
        this.field10338 = arg0;
    }
}
