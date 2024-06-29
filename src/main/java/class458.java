import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class458 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lrb;")
    public static class283 field6667 = new class283(69, -2);

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field6670 = 1406;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZII)I", line = 10)
    public static final int method2673(int arg0, boolean arg1, int arg2, int arg3) {
        field6671++;
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        if (arg1) {
            method2673(31, true, -64, -7);
        }
        return ((arg3 >> 2 & 0x3F) << 10) + ((arg2 >> 5 << 7) + (arg0 >> 1));
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 39)
    public static final boolean method2674(String arg0, int arg1) {
        field6668++;
        if (arg1 >= -16) {
            field6667 = null;
        }
        return class506.method3002(arg0, (byte) -110, true, 10);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 50)
    public static void method2675(int arg0) {
        if (arg0 <= 67) {
            method2675(-126);
        }
        field6667 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;II[BII)I", line = 60)
    public static final int method2676(String arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field6669++;
        int var6 = arg4 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg1 + var7] = -97;
            } else {
                arg3[arg1 + var7] = 63;
            }
        }
        if (arg5 != -8251) {
            field6667 = null;
        }
        return var6;
    }
}
