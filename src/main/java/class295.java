import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class295 extends class56 {

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Ler;")
    public static class157 field4360 = new class157(260);

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lcb;")
    public static class117 field4365;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lwo;")
    public static class225 field4368;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4370;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 3)
    public final void method381(int arg0) {
        super.field752.method1848(false, true);
        if (arg0 < -50) {
            ++field4358;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lbv;)V", line = 14)
    public class295(class282 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CI)C", line = 17)
    public static final char method1899(char arg0, int arg1) {
        ++field4363;
        if (arg0 == 198) {
            return 'E';
        } else if (~arg0 == -231) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (~arg0 == -339) {
            return 'E';
        } else {
            if (arg1 != -19091) {
                field4360 = null;
            }
            return (char) (arg0 == 339 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z", line = 48)
    public final boolean method377(byte arg0) {
        if (arg0 > -8) {
            return false;
        } else {
            ++field4359;
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V", line = 59)
    public final void method380(boolean arg0, int arg1) {
        if (arg1 <= 42) {
            this.method379(6, 57, (class14) null);
        }
        ++field4364;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V", line = 69)
    public static final void method1900(int arg0, boolean arg1) {
        ++field4361;
        if (!arg1) {
            field4366 = -40;
        }
        class377 var2 = class99.method672(arg0, !arg1, 5);
        var2.method2339(-11688);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(ZI)V", line = 86)
    public final void method383(boolean arg0, int arg1) {
        if (arg1 <= -77) {
            ++field4369;
            super.field752.method1848(true, true);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 97)
    public static void method1901(int arg0) {
        field4365 = null;
        field4360 = null;
        field4370 = null;
        field4368 = null;
        if (arg0 != -8354) {
            field4360 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lco;IIII)V", line = 110)
    public static final void method1902(class442 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class123.method796(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class492.field7186) {
            class123.method796(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class123.method796(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class285.field4248) {
            class123.method796(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class285.field4248) {
            class123.method796(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class492.field7186 && arg4 <= class285.field4248) {
            class123.method796(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class123.method796(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class492.field7186 && arg4 > 0) {
            class123.method796(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 162)
    public final void method382(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method383(true, -45);
        }
        ++field4367;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILkv;)V", line = 183)
    public final void method379(int arg0, int arg1, class14 arg2) {
        int var4 = -20 / ((81 - arg1) / 39);
        super.field752.method1787(arg2, (byte) 121);
        ++field4362;
        super.field752.method1794(arg0, 84);
    }
}
