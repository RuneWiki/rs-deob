import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class440 extends class621 {

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "I")
    public int field6043;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "J")
    public static long field6041 = 0L;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(ILrt;Lcp;III)V")
    public class440(int arg0, class212 arg1, class679 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6043 = arg5;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)I")
    public static final int method2495(int arg0, int arg1) {
        if (arg0 != -1340305368) {
            method2496(null, 50, -63, 125, -83, null);
        }
        field6046++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "([BIIIILjava/lang/String;)I")
    public static final int method2496(byte[] arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field6044++;
        int var6 = arg4 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg2 + var7] = -97;
            } else {
                arg0[arg2 + var7] = 63;
            }
        }
        if (arg3 != -26993) {
            field6041 = -28L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)Los;")
    public final class412 method193(byte arg0) {
        field6045++;
        return arg0 > -21 ? null : class275.field3855;
    }
}
