import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class213 {

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    public boolean field3659 = false;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field3650 = 0;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field3662 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[I")
    public static int[] field3646 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
    public static boolean field3658 = false;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field3652 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Ljf;")
    public static class229 field3647 = class212.method1457((byte) 102, " )2> ");

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Ljf;")
    public static class229 field3661 = class212.method1457((byte) 60, "Mem:");

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lph;")
    public class79 field3657;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3656;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 6)
    public static void method1458(byte arg0) {
        if (arg0 == -65) {
            field3661 = null;
            field3646 = null;
            field3647 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V", line = 18)
    public static final void method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class150 var7 = new class150();
        var7.field2589 = arg1 / 128;
        var7.field2586 = arg2 / 128;
        var7.field2600 = arg3 / 128;
        var7.field2599 = arg4 / 128;
        var7.field2597 = arg0;
        var7.field2580 = arg1;
        var7.field2583 = arg2;
        var7.field2581 = arg3;
        var7.field2596 = arg4;
        var7.field2591 = arg5;
        var7.field2592 = arg6;
        class278.field4773[class312.field5247++] = var7;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[Lad;", line = 39)
    public static final class129[] method1460(int arg0) {
        field3645++;
        if (arg0 != -32484) {
            method1459(-108, 22, -36, 118, -51, 26, 57);
        }
        class129[] var1 = new class129[class315.field5348];
        for (int var2 = 0; var2 < class315.field5348; var2++) {
            if (class108.field1900) {
                var1[var2] = new class75(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], class21.field357[var2], class64.field1115);
            } else {
                var1[var2] = new class248(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], class21.field357[var2], class64.field1115);
            }
        }
        class62.method466((byte) 100);
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lmc;", line = 70)
    public static final class183 method1461(int arg0, int arg1) {
        field3648++;
        if (arg1 == 0) {
            return new class211();
        } else if (arg1 == 1) {
            return new class221();
        } else if (arg1 == 2) {
            return new class131();
        } else if (arg1 == 3) {
            return new class296();
        } else if (arg1 == 4) {
            return new class81();
        } else if (arg1 == 5) {
            return new class30();
        } else if (arg1 == 6) {
            return new class272();
        } else if (arg1 == 7) {
            return new class324();
        } else if (arg1 == 8) {
            return new class318();
        } else if (arg1 == 9) {
            return new class273();
        } else if (arg1 == 10) {
            return new class4();
        } else if (arg1 == 11) {
            return new class294();
        } else if (arg1 == 12) {
            return new class52();
        } else if (arg1 == 13) {
            return new class246();
        } else if (arg1 == 14) {
            return new class234();
        } else if (arg1 == 15) {
            return new class115();
        } else if (arg1 == 16) {
            return new class146();
        } else if (arg1 == 17) {
            return new class290();
        } else if (arg1 == 18) {
            return new class160();
        } else if (arg1 == 19) {
            return new class21();
        } else if (arg1 == 20) {
            return new class149();
        } else if (arg1 == 21) {
            return new class236();
        } else if (arg1 == 22) {
            return new class3();
        } else if (arg1 == 23) {
            return new class28();
        } else if (arg1 == 24) {
            return new class314();
        } else if (arg1 == 25) {
            return new class329();
        } else if (arg1 == 26) {
            return new class12();
        } else if (arg1 == 27) {
            return new class306();
        } else if (arg1 == 28) {
            return new class319();
        } else if (arg1 == 29) {
            return new class110();
        } else if (arg1 == 30) {
            return new class120();
        } else if (arg1 == 31) {
            return new class148();
        } else if (arg1 == 32) {
            return new class202();
        } else if (arg1 == 33) {
            return new class151();
        } else if (arg1 == 34) {
            return new class80();
        } else if (arg1 == 35) {
            return new class228();
        } else if (arg1 == 36) {
            return new class59();
        } else if (arg1 == 37) {
            return new class162();
        } else if (arg1 == 38) {
            return new class189();
        } else if (arg1 == 39) {
            return new class142();
        } else {
            if (arg0 != 6454) {
                method1462((class67) null, 109);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lnf;I)Z", line = 392)
    public static final boolean method1462(class67 arg0, int arg1) {
        field3655++;
        if (arg0.field1147 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != 26) {
            field3661 = (class229) null;
        }
        while (var2 < arg0.field1147.length) {
            int var3 = class238.method1700(var2, arg0, (byte) 115);
            int var4 = arg0.field1187[var2];
            if (arg0.field1147[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field1147[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1147[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V", line = 456)
    public static final void method1463(int arg0, int arg1, int arg2) {
        field3651++;
        class122 var3 = class323.method2175(arg2, arg0, -25873);
        var3.method862(arg2 - 29057);
        var3.field2144 = arg1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BZ)V", line = 467)
    public static final void method1464(byte arg0, boolean arg1) {
        field3660++;
        if (class307.field5191 == arg1) {
            return;
        }
        class307.field5191 = arg1;
        if (arg0 >= -2) {
            method1458((byte) -126);
        }
        class73.method536((byte) -33);
    }
}
