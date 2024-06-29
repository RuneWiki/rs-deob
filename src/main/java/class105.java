import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class105 extends class47 {

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Lgt;")
    public class260 field1476;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Lch;")
    public static class151 field1471 = new class151("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field1474 = 0;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "[I")
    public static int[] field1473 = new int[1000];

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "Lrc;")
    public static class108 field1475 = new class108(88, -2);

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "[Lrn;")
    public static class417[] field1478;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 4)
    public static void method838(int arg0) {
        field1473 = null;
        field1471 = null;
        field1478 = null;
        field1475 = null;
        if (arg0 != -256) {
            field1472 = 9;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 22)
    public static final boolean method839(int arg0, String arg1) {
        if (arg0 <= 47) {
            method838(-4);
        }
        field1477++;
        return class92.method764(10, true, arg1, 1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 33)
    public static final byte[] method840(String arg0, int arg1) {
        field1470++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg1 >= -88) {
            field1472 = -123;
        }
        while (var2 > var4) {
            char var5 = arg0.charAt(var4);
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
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lgt;)V", line = 181)
    public class105(class260 arg0) {
        this.field1476 = arg0;
    }
}
