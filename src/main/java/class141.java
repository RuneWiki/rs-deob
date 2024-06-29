import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class141 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lgd;")
    public static class206 field2048 = new class206("K", "T", "K", "K");

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method857(int arg0) {
        if (arg0 <= 2) {
            field2048 = null;
        }
        field2050++;
        if (class76.field1030) {
            return;
        }
        class76.field1030 = true;
        class82.field1094 = true;
        if (class488.field6789.field6670) {
            class239.field3186 = (float) ((int) class239.field3186 + 47 & 0xFFFFFFF0);
        } else {
            class63.field842 += (12.0F - class63.field842) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method858(byte arg0) {
        if (arg0 != -109) {
            field2048 = null;
        }
        field2048 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BILjava/lang/String;[BII)I")
    public static final int method859(byte arg0, int arg1, String arg2, byte[] arg3, int arg4, int arg5) {
        field2049++;
        int var6 = arg1 - arg5;
        if (arg0 < 34) {
            field2048 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg4 + var7] = -97;
            } else {
                arg3[arg4 + var7] = 63;
            }
        }
        return var6;
    }
}
