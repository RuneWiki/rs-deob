import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class379 {

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "[I")
    public static int[] field5164 = new int[2];

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method2307(byte arg0, int arg1, int arg2) {
        field5163++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg0 >= -26) {
                field5164 = null;
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lfca;I)Lng;")
    public static final class362 method2308(class93 arg0, int arg1) {
        field5165++;
        if (arg1 > -65) {
            field5164 = null;
        }
        arg0.method793((byte) 17);
        int var2 = arg0.method793((byte) 33);
        class362 var3 = class353.method2162(false, var2);
        var3.field4933 = arg0.method793((byte) 22);
        int var4 = arg0.method793((byte) 93);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method793((byte) 125);
            var3.method154(arg0, var6, -1);
        }
        var3.method160(-996226836);
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Lkh;")
    public static final class17 method2309(int arg0, int arg1) {
        field5166++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1 != 192) {
            field5164 = null;
        }
        if (class431.field5870[var2] == null || class431.field5870[var2][var3] == null) {
            boolean var4 = class659.method3706(121, var2);
            if (!var4) {
                return null;
            }
        }
        return class431.field5870[var2][var3];
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V")
    public static final void method2310(int arg0, boolean arg1) {
        field5167++;
        if (class741.field10225.length() == 0) {
            return;
        }
        class652.method3663(126, "--> " + class741.field10225);
        class117.method1035((byte) -96, class741.field10225, arg1, false);
        class741.field10225 = "";
        class724.field9953 = 0;
        class660.field9148 = 0;
        if (arg0 <= 82) {
            method2310(-58, true);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
    public static void method2311(int arg0) {
        if (arg0 > -9) {
            method2309(22, 61);
        }
        field5164 = null;
    }

    @OriginalMember(owner = "client!ws", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5162++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BCI)C")
    public static final char method2312(byte arg0, char arg1, int arg2) {
        if (arg0 != 62) {
            method2312((byte) -28, (char) 65493, -61);
        }
        field5168++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }
}
