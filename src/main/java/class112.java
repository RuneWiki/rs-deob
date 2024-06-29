import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class112 {

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "[C")
    public static char[] field1477 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Lnn;")
    public static class151 field1463 = new class151("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1486 = new String[200];

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "[[B")
    public static byte[][] field1485 = new byte[250][];

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "[I")
    public static int[] field1484;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
    public static void method682(boolean arg0) {
        field1486 = null;
        if (arg0) {
            field1484 = null;
        }
        field1484 = null;
        field1463 = null;
        field1477 = null;
        field1485 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BZLjava/lang/String;Liq;)Ltn;")
    public static final class378 method683(byte arg0, boolean arg1, String arg2, class134 arg3) {
        field1474++;
        int var4 = arg3.method836(-1, arg2);
        if (arg0 < 119) {
            field1463 = null;
        }
        if (var4 == -1) {
            return new class378(0);
        }
        int[] var5 = arg3.method830(-127, var4);
        class378 var6 = new class378(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field5506 > var7) {
                class385 var9 = new class385(arg3.method823(var4, -20334, var5[var8++]));
                int var10 = var9.method2354(255);
                int var11 = var9.method2323(-3);
                int var12 = var9.method2343(255);
                if (!arg1 && var12 == 1) {
                    var6.field5506--;
                } else {
                    var6.field5512[var7] = var10;
                    var6.field5509[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }
}
