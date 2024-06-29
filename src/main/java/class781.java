import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class781 implements class396 {

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "Lnw;")
    private class611 field10723;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "Ldk;")
    private class536 field10715;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "[I")
    public static int[] field10717 = new int[1000];

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "Lhja;")
    public static class426 field10716 = new class426();

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field10714;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public static int field10718;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field10719;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field10720;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field10722;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "Lc;")
    public static class199 field10724;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)V", line = 9)
    public static void method4285(byte arg0) {
        field10724 = null;
        field10716 = null;
        if (arg0 > -20) {
            method4286(null, 88, -118, null, (byte) 89, 113);
        }
        field10717 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method210(int arg0) {
        if (arg0 != 16125) {
            method4286(null, -33, -63, null, (byte) 69, -41);
        }
        field10722++;
        return this.field10723.method3396(arg0 - 16200);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)V", line = 37)
    public final void method209(boolean arg0, int arg1) {
        if (arg1 != 7582) {
            return;
        }
        field10718++;
        class17 var3 = this.field10723.method3397(1, this.field10715.field7426);
        if (var3 == null) {
            return;
        }
        int var4 = this.field10715.field7433.method3710(arg1 - 7582, class67.field933, this.field10715.field7438) + this.field10715.field7435;
        int var5 = this.field10715.field7437.method3920(this.field10715.field7431, class187.field2450, -58) + this.field10715.field7427;
        if (this.field10715.field7430) {
            class375.field5490.method539(var4, var5, this.field10715.field7438, this.field10715.field7431, this.field10715.field7429, 0);
        }
        int var6 = var5 + this.method4287(var5, 5, -13555, var4, var3.field172, class88.field1251) * 12;
        int var9 = var6 + 8;
        if (this.field10715.field7430) {
            class375.field5490.method487(var4, var9, var4 + this.field10715.field7438 - 1, var9, this.field10715.field7429, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method4287(var6, 5, -13555, var4, var3.field173, class88.field1251) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method4287(var10, 5, -13555, var4, var3.field171, class88.field1251) * 12;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "([BIILjava/lang/String;BI)I", line = 70)
    public static final int method4286(byte[] arg0, int arg1, int arg2, String arg3, byte arg4, int arg5) {
        field10720++;
        int var6 = arg1 - arg5;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg5 + var7);
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
        if (arg4 != -124) {
            field10724 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lnw;Ldk;)V", line = 205)
    public class781(class611 arg0, class536 arg1) {
        this.field10723 = arg0;
        this.field10715 = arg1;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIILjava/lang/String;Lda;)I", line = 214)
    private final int method4287(int arg0, int arg1, int arg2, int arg3, String arg4, class67 arg5) {
        field10721++;
        if (arg2 != -13555) {
            method4285((byte) 116);
        }
        return arg5.method557(arg0 + arg1, arg1 + arg3, null, null, 0, (byte) 55, arg4, this.field10715.field7438 - (arg1 * 2), this.field10715.field7428, 0, null, 0, 0, this.field10715.field7432, 0, this.field10715.field7431 - (arg1 * 2));
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V", line = 228)
    public final void method211(byte arg0) {
        if (arg0 < -107) {
            field10719++;
        }
    }
}
