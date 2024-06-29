import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class331 {

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "[S")
    public static short[] field5166 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field5167 = 0;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Lof;")
    public static class446 field5168;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Lgw;")
    public static class117 field5169;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
    public static int[] field5170;

    static {
        new class446("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field5168 = new class446("Attack", "Angreifen", "Attaquer", "Atacar");
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lga;IB)I", line = 3)
    public static final int method2142(class282 arg0, int arg1, byte arg2) {
        field5165++;
        if (!client.method1348(arg0).method2702(arg1, -104) && arg0.field4007 == null) {
            return -1;
        } else if (arg2 < 89) {
            return -106;
        } else if (arg0.field4142 == null || arg1 >= arg0.field4142.length) {
            return -1;
        } else {
            return arg0.field4142[arg1];
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 18)
    public static final byte[] method2143(byte arg0, String arg1) {
        if (arg0 != 39) {
            return null;
        }
        field5163++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 158)
    public static void method2144(byte arg0) {
        field5168 = null;
        field5169 = null;
        field5166 = null;
        field5170 = null;
        if (arg0 != 39) {
            field5162 = 61;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)[B", line = 176)
    public static final synchronized byte[] method2145(int arg0, byte arg1) {
        field5164++;
        int var2 = -86 % ((2 - arg1) / 52);
        if (arg0 == 100 && class26.field382 > 0) {
            byte[] var3 = class269.field3749[--class26.field382];
            class269.field3749[class26.field382] = null;
            return var3;
        } else if (arg0 == 5000 && class23.field338 > 0) {
            byte[] var4 = class359.field5520[--class23.field338];
            class359.field5520[class23.field338] = null;
            return var4;
        } else if (arg0 == 30000 && class315.field4588 > 0) {
            byte[] var5 = class461.field6905[--class315.field4588];
            class461.field6905[class315.field4588] = null;
            return var5;
        } else {
            return new byte[arg0];
        }
    }
}
