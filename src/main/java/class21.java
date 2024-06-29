import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class21 extends class137 {

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lhh;")
    public static class163 field338 = class137.method1065(")1p", 17);

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field333 = 0;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lmi;")
    public static class128 field334 = new class128();

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lhh;")
    public static class163 field342 = class137.method1065("_", 17);

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lhh;")
    private static class163 field344 = class137.method1065("Hidden", 17);

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lhh;")
    public static class163 field341 = field344;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "F")
    public static float field335;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Z")
    public static boolean field345;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)I")
    public static final int method139(byte arg0, int arg1) {
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        field340++;
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        if (arg0 != -127) {
            field343 = 15;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
    public static void method140(byte arg0) {
        if (arg0 != 127) {
            method139((byte) 26, -19);
        }
        field334 = null;
        field338 = null;
        field344 = null;
        field342 = null;
        field341 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILsh;)V")
    public static final void method141(int arg0, class202 arg1) {
        arg1.field3659 = false;
        field337++;
        if (arg1.field3664 != -1) {
            class18 var2 = class212.method1511(arg1.field3664, -1);
            if (var2 == null || var2.field265 == null) {
                arg1.field3664 = -1;
            } else {
                arg1.field3632++;
                if (arg1.field3650 < var2.field265.length && arg1.field3632 > var2.field268[arg1.field3650]) {
                    arg1.field3632 = 1;
                    arg1.field3650++;
                    class222.method1571(arg1.field3650, arg1.field3615, arg1.field3633, (byte) 83, class235.field4203 == arg1, var2);
                }
                if (arg1.field3650 >= var2.field265.length) {
                    arg1.field3650 = 0;
                    arg1.field3632 = 0;
                    class222.method1571(arg1.field3650, arg1.field3615, arg1.field3633, (byte) 98, class235.field4203 == arg1, var2);
                }
            }
        }
        if (arg1.field3671 != arg0 && arg1.field3657 <= class227.field4092) {
            if (arg1.field3630 < 0) {
                arg1.field3630 = 0;
            }
            int var3 = class67.method465(arg1.field3671, 126).field2093;
            if (var3 == -1) {
                arg1.field3671 = -1;
            } else {
                class18 var4 = class212.method1511(var3, arg0);
                if (var4 == null || var4.field265 == null) {
                    arg1.field3671 = -1;
                } else {
                    arg1.field3636++;
                    if (arg1.field3630 < var4.field265.length && var4.field268[arg1.field3630] < arg1.field3636) {
                        arg1.field3636 = 1;
                        arg1.field3630++;
                        class222.method1571(arg1.field3630, arg1.field3615, arg1.field3633, (byte) 95, class235.field4203 == arg1, var4);
                    }
                    if (var4.field265.length <= arg1.field3630) {
                        arg1.field3671 = -1;
                    }
                }
            }
        }
        if (arg1.field3673 != -1 && arg1.field3622 <= 1) {
            class18 var5 = class212.method1511(arg1.field3673, -1);
            if (var5.field276 == 1 && arg1.field3617 > 0 && arg1.field3639 <= class227.field4092 && arg1.field3641 < class227.field4092) {
                arg1.field3622 = 1;
                return;
            }
        }
        if (arg1.field3673 != -1 && arg1.field3622 == 0) {
            class18 var6 = class212.method1511(arg1.field3673, arg0);
            if (var6 == null || var6.field265 == null) {
                arg1.field3673 = -1;
            } else {
                arg1.field3665++;
                if (arg1.field3658 < var6.field265.length && var6.field268[arg1.field3658] < arg1.field3665) {
                    arg1.field3665 = 1;
                    arg1.field3658++;
                    class222.method1571(arg1.field3658, arg1.field3615, arg1.field3633, (byte) 79, class235.field4203 == arg1, var6);
                }
                if (arg1.field3658 >= var6.field265.length) {
                    arg1.field3631++;
                    arg1.field3658 -= var6.field271;
                    if (arg1.field3631 >= var6.field261) {
                        arg1.field3673 = -1;
                    } else if (arg1.field3658 >= 0 && arg1.field3658 < var6.field265.length) {
                        class222.method1571(arg1.field3658, arg1.field3615, arg1.field3633, (byte) 87, class235.field4203 == arg1, var6);
                    } else {
                        arg1.field3673 = -1;
                    }
                }
                arg1.field3659 = var6.field275;
            }
        }
        if (arg1.field3622 > 0) {
            arg1.field3622--;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        this.field339 = arg1;
        this.field336 = arg0;
    }
}
