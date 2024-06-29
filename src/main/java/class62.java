import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class62 extends class240 {

    @OriginalMember(owner = "client!de", name = "u", descriptor = "[I")
    public int[] field963 = new int[] { 0 };

    @OriginalMember(owner = "client!de", name = "s", descriptor = "[I")
    public int[] field961 = new int[] { -1 };

    @OriginalMember(owner = "client!de", name = "o", descriptor = "[S")
    public static short[] field957 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!de", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field965 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lai;")
    public static class126 field959;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lvc;")
    public static class192 field956;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "[I")
    public static int[] field962;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 6)
    public static void method447(byte arg0) {
        field965 = null;
        int var1 = 4 % ((43 - arg0) / 60);
        field959 = null;
        field957 = null;
        field962 = null;
        field956 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lja;BLja;)I", line = 24)
    public static final int method448(class64 arg0, byte arg1, class64 arg2) {
        field966++;
        int var3 = 0;
        if (arg2.method489(class261.field4048, 0)) {
            var3++;
        }
        int var4 = 33 % ((13 - arg1) / 60);
        if (arg2.method489(class147.field2372, 0)) {
            var3++;
        }
        if (arg2.method489(class176.field2767, 0)) {
            var3++;
        }
        if (arg0.method489(class261.field4048, 0)) {
            var3++;
        }
        if (arg0.method489(class147.field2372, 0)) {
            var3++;
        }
        if (arg0.method489(class176.field2767, 0)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BIIILjava/lang/String;)I", line = 59)
    public static final int method449(int arg0, byte[] arg1, int arg2, int arg3, int arg4, String arg5) {
        field958++;
        int var6 = arg4 - arg0;
        if (arg3 != 14946) {
            return -67;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg2 + var7] = -97;
            } else {
                arg1[arg2 + var7] = 63;
            }
        }
        return var6;
    }
}
