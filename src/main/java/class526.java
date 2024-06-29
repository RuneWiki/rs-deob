import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class526 {

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field7718 = 0;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field7717 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Luu;")
    public static class191 field7722;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;IIBI[B)I", line = 3)
    public static final int method3114(String arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5) {
        field7719++;
        int var6 = arg2 - arg4;
        if (arg3 != -121) {
            return 94;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg1 + var7] = -97;
            } else {
                arg5[arg1 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 140)
    public static void method3115(byte arg0) {
        field7722 = null;
        if (arg0 != 23) {
            method3115((byte) 119);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V", line = 162)
    public static final void method3116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7721++;
        if (arg0 < 97) {
            field7715 = -47;
        }
        class519[] var7 = class361.field5531;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class519 var9 = var7[var8];
            if (var9 != null && var9.field7630 == 2) {
                class75.method529(arg3 >> 1, var9.field7628, arg5, var9.field7634, var9.field7633 * 2, var9.field7627, arg2 >> 1, arg4, (byte) 117);
                if (class247.field3449[0] > -1 && (class393.field6017 % 20) < 10) {
                    class389.field5944[var9.field7626].method2201(class247.field3449[0] + arg1 - 12, arg6 + -28 + class247.field3449[1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V", line = 191)
    public static final void method3117(boolean arg0) {
        class330 var1 = class160.field2086;
        synchronized (class160.field2086) {
            class160.field2086.method2127((byte) -43);
        }
        field7716++;
        if (!arg0) {
            method3116(-98, 83, -46, 7, -21, 25, 41);
        }
    }
}
