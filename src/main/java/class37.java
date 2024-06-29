import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class37 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field533 = 16777215;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field539 = 8;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lrm;")
    public static class184 field541 = new class184(64);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Z")
    public boolean field540;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BIC)C", line = 7)
    public static final char method315(byte arg0, int arg1, char arg2) {
        field531++;
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
            if (arg2 == 'Ñ' && arg1 != 0) {
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
            if (arg2 == 'ñ' && arg1 != 0) {
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
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            int var3 = -64 % ((arg0 - 60) / 60);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 103)
    public static final String method316(byte[] arg0, int arg1, int arg2, int arg3) {
        char[] var4 = new char[arg2];
        field538++;
        int var5 = 0;
        if (arg1 < 84) {
            return (String) null;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class59.field856[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIILvl;)V", line = 147)
    private final void method317(int arg0, int arg1, int arg2, class6 arg3) {
        if (arg0 == 1) {
            this.field539 = arg3.method39((byte) 48);
        } else if (arg0 == 2) {
            this.field540 = true;
        } else if (arg0 == 3) {
            this.field534 = arg3.method78((byte) -11);
            this.field536 = arg3.method78((byte) -102);
            this.field529 = arg3.method78((byte) -110);
        } else if (arg0 == 4) {
            this.field532 = arg3.method58(-288140008);
        } else if (arg0 == 5) {
            this.field537 = arg3.method39((byte) 110);
        } else if (arg0 == 6) {
            this.field533 = arg3.method31(-22888);
        }
        if (arg1 == 224) {
            field535++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 198)
    public static void method318(byte arg0) {
        field541 = null;
        if (arg0 < 62) {
            method316((byte[]) null, -15, 83, -109);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILvl;I)V", line = 217)
    public final void method319(int arg0, class6 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method58(arg2 ^ 0xEED35518);
            if (var4 == 0) {
                if (arg2 != 0) {
                    this.field540 = false;
                }
                field530++;
                return;
            }
            this.method317(var4, 224, arg0, arg1);
        }
    }
}
