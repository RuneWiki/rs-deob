import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class488 {

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "[S")
    public static short[] field6824 = new short[256];

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Ljk;")
    public static class585 field6826 = new class585(70, 16);

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field6827 = 0;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;IIZ[BI)I", line = 4)
    public static final int method2842(String arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5) {
        field6825++;
        if (!arg3) {
            method2845(-105, -72, 15, 56, (byte) 1, 63);
        }
        int var6 = arg5 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg2 + var7] = -97;
            } else {
                arg4[arg2 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V", line = 145)
    public static final void method2843(boolean arg0, int arg1) {
        field6823++;
        if (arg0) {
            field6824 = null;
        }
        class83.field1189 = arg1;
        class590.field8545.method2776(arg0);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V", line = 158)
    public static void method2844(int arg0) {
        field6824 = null;
        field6826 = null;
        if (arg0 != 732) {
            field6824 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIBI)Z", line = 173)
    public static final boolean method2845(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6828++;
        int var6 = arg2;
        if (arg4 != -110) {
            field6826 = null;
        }
        while (arg3 >= var6) {
            for (int var7 = arg1; var7 <= arg5; var7++) {
                if (class310.field4099[var6][var7] == arg0 && class40.field748[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)I", line = 205)
    public static final int method2846(int arg0, int arg1) {
        field6822++;
        int var2 = 81 / ((arg0 + 75) / 41);
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = arg1 * 6 - 61440;
        int var5 = (arg1 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)Ldw;")
    public abstract class667 method1301(int arg0);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BI)I")
    public abstract int method1299(byte arg0, int arg1);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(BI)[B")
    public abstract byte[] method1312(byte arg0, int arg1);

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(BI)V")
    public abstract void method1302(byte arg0, int arg1);
}
