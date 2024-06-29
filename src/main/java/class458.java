import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class458 extends class70 implements class196 {

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lmj;")
    public class70 field6719;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lbr;")
    public static class380 field6721 = new class380();

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lcm;")
    public static class449 field6725 = new class449(6, 7);

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field6730 = -1;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field6732;

    static {
        new class375("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I", line = 4)
    public final int method63(byte arg0) {
        if (arg0 != 63) {
            this.method66(-10);
        }
        field6723++;
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILqa;B)Lc;", line = 15)
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        field6714++;
        int var4 = 110 / ((arg2 + 62) / 39);
        return null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V", line = 25)
    public static final void method2755(int arg0, int arg1) {
        field6727++;
        if (!class109.method719((byte) -124, arg0)) {
            return;
        }
        class499[] var2 = class59.field791[arg0];
        if (arg1 != -25377) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class499 var4 = var2[var3];
            if (var4 != null) {
                var4.field7287 = 0;
                var4.field7412 = 0;
                var4.field7335 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V", line = 60)
    public final void method59(byte arg0) {
        field6718++;
        int var2 = -43 / ((arg0 - 27) / 63);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 72)
    public final void method57(int arg0) {
        field6724++;
        if (arg0 != -5077) {
            this.method59((byte) -11);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I", line = 84)
    public final int method50(int arg0) {
        field6715++;
        if (arg0 != 25707) {
            this.field6719 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 98)
    public static final void method2756(int arg0, byte arg1, String arg2) {
        field6731++;
        int var3 = class442.field6574;
        int[] var4 = class320.field4896;
        boolean var5 = false;
        if (arg1 <= 38) {
            method2756(88, (byte) -88, null);
        }
        for (int var6 = 0; var6 < var3; var6++) {
            class322 var7 = class439.field6539[var4[var6]];
            if (var7 != null && class339.field5365 != var7 && var7.field4947 != null && var7.field4947.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class179.method1287(false, class501.field7484);
                    class225.field3224++;
                    class75.field1006.method635((byte) -75, 0);
                    class75.field1006.method589(var4[var6], false);
                } else if (arg0 == 4) {
                    class179.method1287(false, class181.field2576);
                    class527.field7781++;
                    class75.field1006.method600(var4[var6], -12891);
                    class75.field1006.method629((byte) 119, 0);
                } else if (arg0 == 5) {
                    class472.field6898++;
                    class179.method1287(false, class434.field6451);
                    class75.field1006.method637((byte) -93, var4[var6]);
                    class75.field1006.method635((byte) 95, 0);
                } else if (arg0 == 6) {
                    class144.field2078++;
                    class179.method1287(false, class321.field4919);
                    class75.field1006.method637((byte) 8, var4[var6]);
                    class75.field1006.method629((byte) 86, 0);
                } else if (arg0 == 7) {
                    class80.field1076++;
                    class179.method1287(false, class420.field6282);
                    class75.field1006.method589(var4[var6], false);
                    class75.field1006.method602(0, 128);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class219.method1485((byte) -85, class317.field4868.method2335((byte) -100, class288.field4292) + arg2);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILqa;)Z", line = 179)
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        field6713++;
        if (arg1 != 3) {
            method2755(38, -29);
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIILmj;)V", line = 198)
    public class458(int arg0, int arg1, int arg2, int arg3, int arg4, class70 arg5) {
        super(arg2, arg3, arg4, class307.method1972(arg1, 3, arg0));
        this.field6719 = arg5;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Z", line = 206)
    public final boolean method60(byte arg0) {
        field6722++;
        if (arg0 >= -108) {
            method2757(-22, true, 25);
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZI)Ljb;", line = 218)
    public static final class499 method2757(int arg0, boolean arg1, int arg2) {
        field6716++;
        if (arg1) {
            field6730 = -82;
        }
        class499 var3 = class211.method1457(arg0, 6687);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field7423 == null || var3.field7423.length <= arg2) {
            return null;
        } else {
            return var3.field7423[arg2];
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILqa;)V", line = 242)
    public final void method67(int arg0, class496 arg1) {
        int var3 = 99 / ((arg0 - 59) / 60);
        field6726++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lqa;I)Lpj;", line = 252)
    public final class507 method51(class496 arg0, int arg1) {
        if (arg1 == -150) {
            field6712++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Z", line = 264)
    public final boolean method49(int arg0) {
        field6728++;
        return arg0 != 7;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 275)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field6720++;
        if (arg1 != 118) {
            field6725 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V", line = 285)
    public static void method2758(int arg0) {
        field6721 = null;
        field6725 = null;
        if (arg0 != 0) {
            method2756(54, (byte) 6, null);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I", line = 304)
    public final int method66(int arg0) {
        field6729++;
        if (arg0 != -7234) {
            field6725 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(BLqa;)V", line = 315)
    public final void method62(byte arg0, class496 arg1) {
        if (arg0 != -126) {
            field6725 = null;
        }
        field6717++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLqa;)V", line = 325)
    public final void method55(byte arg0, class496 arg1) {
        field6732++;
        if (arg0 >= -31) {
            field6725 = null;
        }
    }
}
