import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class208 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field3335 = -1;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field3339 = -1;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
    public boolean field3340 = true;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public int field3345 = 0;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
    public static volatile boolean field3341 = true;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Ltb;")
    public static class71 field3336 = new class71();

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[[[I")
    public static int[][][] field3338;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBC)C")
    public static final char method1519(int arg0, byte arg1, char arg2) {
        field3343++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 != 74) {
            field3346 = -86;
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lv;II)V")
    public final void method1520(class152 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1111(255);
            if (var4 == 0) {
                field3337++;
                if (arg2 != 0) {
                    this.method1520((class152) null, -57, -64);
                    return;
                }
                return;
            }
            this.method1523(arg0, (byte) -99, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZZIII)V")
    public static final void method1521(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3347++;
        if (arg2 != 89) {
            field3341 = false;
        }
        class24.method178(arg4, arg1, arg0, arg3, class169.field2725.length - 1, 0, -1);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        field3338 = null;
        if (arg0 == -63) {
            field3336 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lv;BII)V")
    private final void method1523(class152 arg0, byte arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field3345 = class210.method1530(111, arg0.method1128((byte) -122));
        } else if (arg2 == 2) {
            this.field3335 = arg0.method1111(255);
        } else if (arg2 == 3) {
            this.field3335 = arg0.method1126(false);
            if (this.field3335 == 65535) {
                this.field3335 = -1;
            }
        } else if (arg2 == 5) {
            this.field3340 = false;
        } else if (arg2 == 7) {
            this.field3339 = class210.method1530(-14, arg0.method1128((byte) -112));
        } else if (arg2 == 8) {
            class82.field1195 = arg3;
        } else if (arg2 == 9) {
            arg0.method1126(false);
        } else if (arg2 != 10) {
            if (arg2 == 11) {
                arg0.method1111(255);
            } else if (arg2 != 12) {
                if (arg2 == 13) {
                    arg0.method1128((byte) -115);
                } else if (arg2 == 14) {
                    arg0.method1111(255);
                }
            }
        }
        int var5 = -99 / ((arg1 - 16) / 61);
        field3344++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I")
    public static final int method1524(int arg0, int arg1, int arg2) {
        field3342++;
        if (arg0 != 198) {
            field3338 = null;
        }
        class83 var3 = (class83) class67.field991.method1034((long) arg1, (byte) 21);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1197.length; var5++) {
                if (var3.field1206[var5] == arg2) {
                    var4 += var3.field1197[var5];
                }
            }
            return var4;
        }
    }
}
