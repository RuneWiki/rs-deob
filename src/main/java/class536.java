import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class536 extends class390 {

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public int field7791;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public int field7795;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lhe;")
    public static class573 field7793 = new class573("LIVE", 0);

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[Ll;")
    public static class639[] field7796 = new class639[2048];

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method3239(int arg0) {
        field7793 = null;
        if (arg0 == -382) {
            field7796 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BIIILjava/lang/String;I)I")
    public static final int method3240(byte[] arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg1 != 31069) {
            field7796 = null;
        }
        field7792++;
        int var6 = arg2 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg3 + var7] = -97;
            } else {
                arg0[arg3 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Leda;Lcga;IIIIIIIIII)V")
    public class536(class14 arg0, class141 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7791 = arg10;
        this.field7795 = arg11;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lhr;")
    public final class57 method478(int arg0) {
        field7794++;
        if (arg0 <= 30) {
            this.field7791 = -86;
        }
        return class438.field6242;
    }
}
