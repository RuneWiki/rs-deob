import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class497 {

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "Lpj;")
    public class156 field7086;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 6)
    public void method1298(byte arg0) {
        field7090++;
        if (arg0 != 82) {
            field7084 = 20;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 19)
    public void method1297(boolean arg0) {
        field7088++;
        if (!arg0) {
            field7084 = -41;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(CBI)C", line = 31)
    public static final char method3020(char arg0, byte arg1, int arg2) {
        field7083++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 <= 49) {
            method3020('\u0001', (byte) 23, 105);
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Ljava/lang/String;", line = 115)
    public static final String method3021(int arg0, int arg1) {
        int var2 = 15 % ((arg0 + 44) / 41);
        field7089++;
        class244 var3 = (class244) class87.field961.method2242((long) arg1, -1);
        if (var3 != null) {
            class202 var4 = var3.field3625.method1962((byte) -95);
            if (var4 != null) {
                double var5 = var3.field3625.method1970(-58);
                if (var5 >= (double) var4.method1409((byte) 125) && (double) var4.method1413(true) >= var5) {
                    return var4.method1418((byte) -67);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 149)
    public void method1301(boolean arg0) {
        if (arg0) {
            this.method928(true, (byte) 10);
        }
        field7080++;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(Z)V", line = 159)
    public void method1299(boolean arg0) {
        if (!arg0) {
            field7087++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lpj;)V", line = 169)
    public class497(class156 arg0) {
        this.field7086 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 179)
    public void method1300(byte arg0) {
        int var2 = -64 / ((27 - arg0) / 37);
        field7082++;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(Z)V", line = 188)
    public void method3022(boolean arg0) {
        if (arg0) {
            field7084 = -123;
        }
        field7081++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBI)V")
    public abstract void method923(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILkja;)V")
    public abstract void method925(byte arg0, int arg1, class684 arg2);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public abstract void method926(int arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
    public abstract void method928(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)Z")
    public abstract boolean method921(int arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
    public abstract void method929(int arg0, boolean arg1);
}
