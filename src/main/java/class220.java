import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class220 extends class638 {

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lmc;")
    public class220 field3587;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lmc;")
    public class220 field3589;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lraa;")
    public static class353 field3588;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 6)
    public final void method1568(int arg0) {
        field3590++;
        if (this.field3587 == null) {
            return;
        }
        this.field3587.field3589 = this.field3589;
        this.field3589.field3587 = this.field3587;
        int var2 = -45 / ((arg0 + 16) / 63);
        this.field3589 = null;
        this.field3587 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 25)
    public static void method1569(int arg0) {
        if (arg0 != -27365) {
            method1569(-121);
        }
        field3588 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BILjava/lang/String;II)I", line = 35)
    public static final int method1570(int arg0, byte[] arg1, int arg2, String arg3, int arg4, int arg5) {
        if (arg2 != 29695) {
            return 100;
        }
        field3591++;
        int var6 = arg0 - arg4;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg5 + var7] = -97;
            } else {
                arg1[arg5 + var7] = 63;
            }
        }
        return var6;
    }
}
