import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class364 extends class68 {

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public int field5572;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field5571;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public int field5577;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public int field5574;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5575 = new String[200];

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field5576 = 0;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5570;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public static void method2264(int arg0) {
        field5570 = null;
        field5575 = null;
        if (arg0 != -8222) {
            method2264(-62);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILjava/lang/String;[BI)I")
    public static final int method2265(int arg0, int arg1, int arg2, String arg3, byte[] arg4, int arg5) {
        field5573++;
        int var6 = arg0 - arg1;
        if (arg2 != -8217) {
            field5575 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg5 + var7] = -97;
            } else {
                arg4[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIII)V")
    public class364(int arg0, int arg1, int arg2, int arg3) {
        this.field5572 = arg2;
        this.field5571 = arg1;
        this.field5577 = arg0;
        this.field5574 = arg3;
    }

    static {
        new class475("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }
}
