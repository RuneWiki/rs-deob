import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class93 {

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field1689 = 7759444;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Lrb;")
    public static class213 field1687 = null;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lqd;")
    public static class40 field1680 = class147.method1106("Versteckt", (byte) -50);

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Lce;")
    public static class239 field1693;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[[S")
    public static short[][] field1685;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[[[Lue;")
    public static class14[][][] field1690;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([Lqd;[SI)V", line = 6)
    public static final void method706(class40[] arg0, short[] arg1, int arg2) {
        field1688++;
        class233.method1621(arg0.length - 1, arg0, -112, arg1, 0);
        int var3 = 126 / ((-arg2 - 14) / 57);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLrb;)Z", line = 20)
    public static final boolean method707(byte arg0, class213 arg1) {
        field1681++;
        if (arg1.field3510 == 205) {
            class90.field1638 = 250;
            return true;
        } else {
            return arg0 <= 20;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILsd;)V", line = 43)
    public static final void method708(int arg0, class26 arg1) {
        field1683++;
        if (arg0 != 0) {
            method710(38, 55);
        }
        if (class310.field5206 != null) {
            try {
                class310.field5206.method495(0L, arg0 ^ 0x0);
                class310.field5206.method492(arg1.field472, arg1.field478, 24, (byte) 113);
            } catch (Exception var3) {
            }
        }
        arg1.field478 += 24;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lrb;III)V", line = 72)
    public static final void method709(class213 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -3) {
            field1680 = (class40) null;
        }
        if (arg0.field3580 == 0) {
            arg0.field3442 = arg0.field3474;
        } else if (arg0.field3580 == 1) {
            arg0.field3442 = (arg1 - arg0.field3502) / 2 + arg0.field3474;
        } else if (arg0.field3580 == 2) {
            arg0.field3442 = arg1 - arg0.field3474 - arg0.field3502;
        } else if (arg0.field3580 == 3) {
            arg0.field3442 = arg0.field3474 * arg1 >> 14;
        } else if (arg0.field3580 == 4) {
            arg0.field3442 = (arg1 - arg0.field3502) / 2 + (arg0.field3474 * arg1 >> 14);
        } else {
            arg0.field3442 = arg1 - arg0.field3502 - (arg0.field3474 * arg1 >> 14);
        }
        field1684++;
        if (arg0.field3539 == 0) {
            arg0.field3554 = arg0.field3555;
        } else if (arg0.field3539 == 1) {
            arg0.field3554 = (arg2 - arg0.field3565) / 2 + arg0.field3555;
        } else if (arg0.field3539 == 2) {
            arg0.field3554 = arg2 - arg0.field3555 - arg0.field3565;
        } else if (arg0.field3539 == 3) {
            arg0.field3554 = arg0.field3555 * arg2 >> 14;
        } else if (arg0.field3539 == 4) {
            arg0.field3554 = (arg0.field3555 * arg2 >> 14) + (arg2 - arg0.field3565) / 2;
        } else {
            arg0.field3554 = arg2 - arg0.field3565 - (arg0.field3555 * arg2 >> 14);
        }
        if (!class126.field2176 || !(client.method1720(arg0) != 0 || arg0.field3525 == 0)) {
            return;
        }
        if (arg0.field3442 < 0) {
            arg0.field3442 = 0;
        } else if (arg1 < arg0.field3502 + arg0.field3442) {
            arg0.field3442 = arg1 - arg0.field3502;
        }
        if (arg0.field3554 < 0) {
            arg0.field3554 = 0;
        } else if ((arg0.field3554 + arg0.field3565) > arg2) {
            arg0.field3554 = arg2 - arg0.field3565;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Lqd;", line = 143)
    public static final class40 method710(int arg0, int arg1) {
        field1686++;
        class40 var2 = class276.method1927((byte) -79, arg1);
        for (int var3 = var2.method350(true) - 3; var3 > 0; var3 -= 3) {
            var2 = class153.method1192(new class40[] { var2.method333(0, 20, var3), class213.field3518, var2.method371(var3, false) }, (byte) 126);
        }
        if (arg0 != 17696) {
            field1687 = (class213) null;
        }
        if (var2.method350(true) > 9) {
            return class153.method1192(new class40[] { class284.field4770, var2.method333(0, 104, var2.method350(true) - 8), class142.field2390, class6.field94, var2, class98.field1747 }, (byte) -57);
        } else if (var2.method350(true) <= 6) {
            return class153.method1192(new class40[] { class307.field5152, var2, class28.field599 }, (byte) 125);
        } else {
            return class153.method1192(new class40[] { class253.field4195, var2.method333(0, 85, var2.method350(true) - 4), class307.field5147, class6.field94, var2, class98.field1747 }, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lce;Lce;ILce;)V", line = 180)
    public static final void method711(class239 arg0, class239 arg1, int arg2, class239 arg3) {
        if (arg2 == 31002) {
            class10.field166 = arg1;
            field1692++;
            class199.field3179 = arg0;
            class25.field447 = arg3;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 204)
    public static void method712(boolean arg0) {
        field1680 = null;
        field1687 = null;
        if (arg0) {
            field1685 = (short[][]) null;
            field1690 = (class14[][][]) null;
            field1693 = null;
        }
    }
}
