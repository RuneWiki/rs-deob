import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class403 {

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "B")
    public byte field5507;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "B")
    public byte field5511;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Lsp;")
    public class544 field5515;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "S")
    public short field5508;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field5510 = 0;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "Lada;")
    public static class144 field5512 = new class144(86, 7);

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "F")
    public static float field5516;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V", line = 6)
    public static void method2369(int arg0) {
        field5512 = null;
        if (arg0 != -763) {
            field5512 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 17)
    public static final int method2370(String arg0, int arg1) {
        field5509++;
        if (arg1 > -60) {
            return 63;
        }
        for (int var2 = 0; var2 < class18.field170.length; var2++) {
            if (class18.field170[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lvp;B)V", line = 38)
    public static final void method2371(class162 arg0, byte arg1) {
        if (arg1 == -62) {
            field5514++;
            if (class291.field4028 == arg0.field2526) {
                class104.field1511[arg0.field2446] = true;
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)Lpv;", line = 55)
    public static final class62 method2372(int arg0, int arg1) {
        field5513++;
        if (arg0 == 0) {
            return new class230();
        } else if (arg0 == 1) {
            return new class437();
        } else if (arg0 == 2) {
            return new class593();
        } else if (arg0 == 3) {
            return new class96();
        } else if (arg0 == 4) {
            return new class641();
        } else if (arg0 == 5) {
            return new class275();
        } else if (arg0 == 6) {
            return new class460();
        } else if (arg0 == 7) {
            return new class279();
        } else if (arg0 == 8) {
            return new class110();
        } else if (arg0 == 9) {
            return new class84();
        } else if (arg0 == 10) {
            return new class401();
        } else if (arg0 == 11) {
            return new class573();
        } else if (arg0 == 12) {
            return new class321();
        } else if (arg0 == 13) {
            return new class40();
        } else if (arg0 == 14) {
            return new class5();
        } else if (arg0 == 15) {
            return new class192();
        } else if (arg0 == 16) {
            return new class156();
        } else if (arg0 == 17) {
            return new class89();
        } else if (arg0 == 18) {
            return new class127();
        } else if (arg0 == 19) {
            return new class414();
        } else if (arg0 == 20) {
            return new class410();
        } else if (arg0 == 21) {
            return new class377();
        } else if (arg0 == 22) {
            return new class88();
        } else if (arg0 == 23) {
            return new class376();
        } else if (arg0 == 24) {
            return new class52();
        } else if (arg0 == 25) {
            return new class627();
        } else if (arg0 == 26) {
            return new class645();
        } else if (arg0 == 27) {
            return new class394();
        } else if (arg0 == 28) {
            return new class267();
        } else if (arg0 == 29) {
            return new class149();
        } else if (arg0 == 30) {
            return new class268();
        } else if (arg0 == 31) {
            return new class604();
        } else if (arg0 == 32) {
            return new class60();
        } else if (arg0 == 33) {
            return new class197();
        } else if (arg0 == 34) {
            return new class596();
        } else if (arg0 == 35) {
            return new class99();
        } else if (arg0 == 36) {
            return new class454();
        } else if (arg0 == 37) {
            return new class129();
        } else if (arg0 == 38) {
            return new class61();
        } else if (arg0 == 39) {
            return new class519();
        } else {
            if (arg1 != -33) {
                method2372(71, -99);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lsp;III)V", line = 380)
    public class403(class544 arg0, int arg1, int arg2, int arg3) {
        this.field5507 = (byte) arg2;
        this.field5511 = (byte) arg3;
        this.field5515 = arg0;
        this.field5508 = (short) arg1;
    }
}
