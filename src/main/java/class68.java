import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class68 extends class25 {

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lgd;")
    public static class206 field918 = new class206("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
    public static boolean field931 = false;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "Lmc;")
    public static class78 field932 = new class78(75, 11);

    @OriginalMember(owner = "client!co", name = "u", descriptor = "[I")
    public static int[] field933 = new int[4096];

    @OriginalMember(owner = "client!co", name = "g", descriptor = "C")
    public char field919;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "J")
    public long field926;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Lco;")
    public class68 field929;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Z")
    public boolean field917;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "[Lsk;")
    public static class405[] field928;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)C")
    public final char method143(int arg0) {
        if (arg0 == 12088) {
            field922++;
            return this.field919;
        } else {
            return (char) 65534;
        }
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(I)I")
    public final int method148(int arg0) {
        field923++;
        if (arg0 != -26944) {
            method452(114, 73);
        }
        return this.field921;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)I")
    public final int method147(byte arg0) {
        if (arg0 == 126) {
            field925++;
            return this.field927;
        } else {
            return 57;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method450(int arg0, byte[] arg1, int arg2, int arg3) {
        field915++;
        char[] var4 = new char[arg2];
        if (arg3 <= 96) {
            return null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class72.field985[var7 - 128];
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

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)J")
    public final long method144(int arg0) {
        if (arg0 != -22407) {
            this.method148(24);
        }
        field930++;
        return this.field926;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V")
    public static void method451(byte arg0) {
        field932 = null;
        if (arg0 != -11) {
            field918 = null;
        }
        field933 = null;
        field928 = null;
        field918 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method452(int arg0, int arg1) {
        if (arg0 != 0) {
            field931 = false;
        }
        field916++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class341.field4570.method1176(class110.field1676, (byte) -99) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class124.field1815.method1176(class110.field1676, (byte) -109) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        int var2 = -21 / ((29 - arg0) / 56);
        field920++;
        return this.field917;
    }
}
