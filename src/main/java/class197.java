import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class197 extends class87 {

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Z")
    public boolean field2795 = false;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Z")
    public boolean field2792 = false;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "S")
    public short field2793;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lan;")
    public static class21 field2796;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[Z")
    public static boolean[] field2797;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static void method1214(byte arg0) {
        int var1 = -17 % ((71 - arg0) / 54);
        field2797 = null;
        field2796 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
    public static final int method1215(int arg0, int arg1, int arg2, byte[] arg3, String arg4, int arg5) {
        field2798++;
        int var6 = arg1 - arg0;
        if (arg5 != -8226) {
            field2797 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg2 + var7] = -97;
            } else {
                arg3[arg2 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIIZZ)V")
    public class197(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field2792 = arg4;
        this.field2795 = arg5;
        this.field2791 = arg2;
        this.field2794 = arg0;
        this.field2793 = (short) arg3;
        this.field2799 = arg1;
    }

    static {
        new class104("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
