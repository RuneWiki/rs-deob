import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class244 extends class480 implements class248 {

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "Lag;")
    public class480 field3512;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "Liv;")
    public static class64 field3507;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
    public static int field3515;

    static {
        new class342("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field3507 = new class64(64, 1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lqa;I)V", line = 3)
    public final void method9(class162 arg0, int arg1) {
        field3508++;
        if (arg1 >= -111) {
            field3498 = -116;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLqa;)V", line = 15)
    public final void method25(byte arg0, class162 arg1) {
        int var3 = 105 % ((arg0 + 45) / 48);
        field3506++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLqa;)Lae;", line = 26)
    public final class163 method13(boolean arg0, class162 arg1) {
        if (arg0) {
            return null;
        } else {
            field3499++;
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(B)V", line = 39)
    public static void method1589(byte arg0) {
        int var1 = 19 % ((arg0 - 11) / 41);
        field3507 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILqa;ZLto;III)V", line = 54)
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            method1590(15, (byte) 81);
        }
        field3513++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILqa;)V", line = 64)
    public final void method15(int arg0, class162 arg1) {
        field3505++;
        if (arg0 != -13300) {
            this.method23(null, 48, -98);
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(B)V", line = 74)
    public final void method22(byte arg0) {
        if (arg0 == -3) {
            field3511++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIILag;)V", line = 84)
    public class244(int arg0, int arg1, int arg2, class480 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field3512 = arg3;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)Z", line = 95)
    public final boolean method24(boolean arg0) {
        field3500++;
        if (arg0) {
            this.method24(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)I", line = 108)
    public final int method19(byte arg0) {
        if (arg0 == -69) {
            field3503++;
            return 0;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V", line = 120)
    public static final void method1590(int arg0, byte arg1) {
        field3510++;
        if (class281.field4023 == arg0) {
            return;
        }
        if (class281.field4023 == 0) {
            class503.method3008((byte) -117);
        }
        if (arg1 <= 21) {
            field3498 = 48;
        }
        if (arg0 == 40) {
            class148.method1141((byte) 121);
        }
        if (arg0 != 40 && class367.field5545 != null) {
            class367.field5545.method1305((byte) 98);
            class367.field5545 = null;
        }
        if (class281.field4023 == 25 || class281.field4023 == 28) {
            class445.field6649.field247 = 2;
            class290.field4133.field247 = 2;
            class138.field2214.field247 = 2;
            class466.field6955.field247 = 2;
            class488.field7222.field247 = 2;
            class20.field333.field247 = 2;
            class368.field5571.field247 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class455.field6794 = 0;
            class358.field5442 = 0;
            class161.field2493 = 0;
            class121.field1968 = 1;
            class170.field2638 = 1;
            class54.method479(true, (byte) 120);
            class445.field6649.field247 = 1;
            class290.field4133.field247 = 1;
            class138.field2214.field247 = 1;
            class466.field6955.field247 = 1;
            class488.field7222.field247 = 1;
            class20.field333.field247 = 1;
            class368.field5571.field247 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class294.method1875(10429);
        }
        if (arg0 == 5) {
            class386.method2390(class4.field109, class151.field2407, 5);
        } else {
            class139.method1041(-3);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        boolean var3 = class281.field4023 == 5 || class281.field4023 == 10 || class281.field4023 == 28;
        if (var3 != var2) {
            if (var2) {
                class281.field4026 = class360.field5458;
                if (class443.field6623.field594 == 0) {
                    class431.method2583(2, (byte) -55);
                } else {
                    class60.method527(class84.field1455, class443.field6623.field594, false, 0, false, 2, class360.field5458);
                }
                class405.field6072.method769(-32251, false);
            } else {
                class431.method2583(2, (byte) -55);
                class405.field6072.method769(-32251, true);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class4.field109.method247();
        }
        class281.field4023 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lqa;II)Lc;", line = 219)
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        if (arg1 != 17793) {
            this.method8(-84);
        }
        field3501++;
        return null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)I", line = 230)
    public final int method12(int arg0) {
        if (arg0 == 3765) {
            field3515++;
            return 0;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Z", line = 244)
    public final boolean method8(int arg0) {
        field3509++;
        if (arg0 < 94) {
            this.field3512 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILqa;II)Z", line = 257)
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        if (arg0 == 131072) {
            field3514++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V", line = 268)
    public final void method26(int arg0) {
        int var2 = -83 / ((-arg0 - 46) / 44);
        field3504++;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)I", line = 281)
    public final int method17(byte arg0) {
        int var2 = 110 / ((-arg0 - 60) / 40);
        field3502++;
        return 0;
    }
}
