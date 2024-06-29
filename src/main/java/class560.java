import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class560 extends class132 {

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "Ldv;")
    public static class566 field7756 = new class566(48, 11);

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public int field7751;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public int field7752;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public int field7753;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public int field7759;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Lfca;")
    public class74 field7750;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Ljava/lang/String;")
    public String field7760;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "[I")
    public int[] field7754;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "[I")
    public int[] field7764;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "[Ldea;")
    public class205[] field7762;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field7755;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method3189(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != -20962) {
            return null;
        }
        field7758++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg0 + arg3;
        for (int var7 = arg0; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 >= 224) {
                    if (var8 >= 240) {
                        if (var8 < 244) {
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                    }
                    if ((var7 + 2) >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg2[var7] & 0xFF;
                    if (var9 >= 128 && var9 <= 191) {
                        var7++;
                        int var10 = arg2[var7] & 0xFF;
                        if (var10 >= 128 && var10 <= 191) {
                            var4[var5++] = (char) class73.method578(class589.method3454(var10, -129), class73.method578(class589.method3454(var8, -225) << 12, class589.method3454(-8256, var9 << 6)));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var6 > var7 + 1) {
                    var7++;
                    int var11 = arg2[var7] & 0xFF;
                    if (var11 < 128 || var11 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class73.method578(class589.method3454(var8 << 6, -12352), class589.method3454(-129, var11));
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIC)C")
    public static final char method3190(int arg0, int arg1, char arg2) {
        field7749++;
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
        }
        int var3 = 112 % ((arg0 - 62) / 63);
        if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)Z")
    public static final boolean method3191(byte arg0, int arg1) {
        if (arg1 != 101) {
            method3191((byte) -34, 2);
        }
        field7761++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class3.field44[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method3192(byte arg0) {
        field7756 = null;
        int var1 = 56 % ((-arg0 - 24) / 54);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BII)Z")
    public static final boolean method3193(byte arg0, int arg1, int arg2) {
        field7757++;
        if (arg0 > -113) {
            field7763 = -27;
        }
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    static {
        new class104("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }
}
