import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class545 {

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lhba;")
    public static class10 field7704;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I", line = 6)
    public static final int method3093(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class360.field4767 - 1; var2++) {
            if (arg0 < class281.field3729[var2] + class116.field1540[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class360.field4767 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;", line = 29)
    public final String toString() {
        field7705++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLha;)Lufa;", line = 40)
    public static final class680 method3094(int arg0, byte arg1, class60 arg2) {
        field7703++;
        if (arg1 > -104) {
            return null;
        }
        class585 var3 = (class585) class604.field8417.method2552((long) arg0, -1);
        if (var3 != null) {
            class293 var4 = var3.field8189.method3703(-32675);
            var3.field8190 = true;
            if (var4 != null) {
                return var4.method1750(arg2, 11242);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;III[BI)I", line = 65)
    public static final int method3095(String arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field7706++;
        int var6 = arg2 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg3 + var7] = -97;
            } else {
                arg4[arg3 + var7] = 63;
            }
        }
        if (arg5 != -28439) {
            field7704 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 203)
    public static void method3096(int arg0) {
        field7704 = null;
        if (arg0 != -382) {
            field7704 = null;
        }
    }
}
