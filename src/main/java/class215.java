import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class215 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
    public static boolean field3234;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Lbd;")
    public static class44 field3235;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lqt;")
    public static class459 field3237;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "Lkj;")
    public static class405 field3239;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field3237 = null;
        field3239 = null;
        int var1 = 60 % ((arg0 - 64) / 47);
        field3235 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BLjava/lang/String;BII)I")
    public static final int method1439(int arg0, byte[] arg1, String arg2, byte arg3, int arg4, int arg5) {
        field3236++;
        if (arg3 != 103) {
            method1438(-128);
        }
        int var6 = arg5 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg0 + var7] = -97;
            } else {
                arg1[arg0 + var7] = 63;
            }
        }
        return var6;
    }

    static {
        new class44(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field3233 = 0;
        field3234 = false;
        field3235 = new class44("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
        field3238 = 0;
        field3237 = new class459(26, 16);
        field3239 = new class405("", 14);
    }
}
