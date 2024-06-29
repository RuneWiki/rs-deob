import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class248 {

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lmq;")
    public static class104 field3481 = new class104(64);

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3486;

    static {
        new class112("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field3487 = 100;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([BLjava/lang/String;IIIB)I", line = 5)
    public static final int method1535(byte[] arg0, String arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3485++;
        int var6 = arg3 - arg2;
        if (arg5 != -103) {
            field3481 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg4 + var7] = -97;
            } else {
                arg0[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V", line = 143)
    public static final void method1536(boolean arg0, int arg1) {
        field3479++;
        if (!class56.method431(12449, arg1)) {
            return;
        }
        class363[] var2 = class39.field666[arg1];
        if (arg0) {
            field3487 = -88;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class363 var4 = var2[var3];
            if (var4 != null) {
                var4.field5172 = 0;
                var4.field5152 = 1;
                var4.field5045 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lms;IZII)V", line = 182)
    public static final void method1537(class363 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3482++;
        if (arg1 != 16897) {
            field3486 = 47;
        }
        int var5 = arg0.field5101;
        int var6 = arg0.field5200;
        if (arg0.field5135 == 0) {
            arg0.field5101 = arg0.field5127;
        } else if (arg0.field5135 == 1) {
            arg0.field5101 = arg4 - arg0.field5127;
        } else if (arg0.field5135 == 2) {
            arg0.field5101 = arg0.field5127 * arg4 >> 14;
        }
        if (arg0.field5084 == 0) {
            arg0.field5200 = arg0.field5192;
        } else if (arg0.field5084 == 1) {
            arg0.field5200 = arg3 - arg0.field5192;
        } else if (arg0.field5084 == 2) {
            arg0.field5200 = arg0.field5192 * arg3 >> 14;
        }
        if (arg0.field5135 == 4) {
            arg0.field5101 = arg0.field5200 * arg0.field5068 / arg0.field5088;
        }
        if (arg0.field5084 == 4) {
            arg0.field5200 = arg0.field5101 * arg0.field5088 / arg0.field5068;
        }
        if (class443.field6112 && (client.method2321(arg0).field995 != 0 || arg0.field5093 == 0)) {
            if (arg0.field5200 < 5 && arg0.field5101 < 5) {
                arg0.field5200 = 5;
                arg0.field5101 = 5;
            } else {
                if (arg0.field5200 <= 0) {
                    arg0.field5200 = 5;
                }
                if (arg0.field5101 <= 0) {
                    arg0.field5101 = 5;
                }
            }
        }
        if (class272.field3775 == arg0.field5080) {
            class235.field3315 = arg0;
        }
        if (arg2 && arg0.field5094 != null && arg0.field5101 != var5 || arg0.field5200 != var6) {
            class32 var7 = new class32();
            var7.field517 = arg0;
            var7.field518 = arg0.field5094;
            class31.field503.method1553((byte) -118, var7);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 258)
    public static void method1538(byte arg0) {
        field3481 = null;
        if (arg0 != 53) {
            method1538((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIB)V", line = 269)
    public static final void method1539(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3480++;
        int var8 = arg0 + 1;
        class80.method554(class2.field16[arg0], arg5 + 212, arg4, arg3, arg1);
        int var9 = arg2 - 1;
        class80.method554(class2.field16[arg2], arg5 + 223, arg4, arg3, arg1);
        if (arg5 != -101) {
            field3481 = null;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class2.field16[var6];
            var7[arg1] = var7[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!ll", name = "toString", descriptor = "()Ljava/lang/String;", line = 293)
    public final String toString() {
        field3484++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 301)
    public class248(String arg0, int arg1) {
        this.field3483 = arg1;
    }
}
