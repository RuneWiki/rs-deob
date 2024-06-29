import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class320 {

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private int field4087;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[Z")
    public static boolean[] field4080 = new boolean[5];

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "J")
    public static long field4085;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)I")
    public final int method1911(boolean arg0) {
        field4083++;
        if (arg0) {
            this.toString();
        }
        return this.field4087;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method1912(byte arg0) {
        field4080 = null;
        if (arg0 != -108) {
            field4080 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4081++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIIBI)Z")
    public static final boolean method1913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field4088++;
        if (!class643.method3663(arg6, arg2, 1549, arg7)) {
            return false;
        }
        int var10 = class397.field5436[1];
        int var11 = class397.field5436[0];
        int var12 = class397.field5436[2];
        if (!class643.method3663(arg0, arg1, 1549, arg5)) {
            return false;
        }
        int var13 = class397.field5436[0];
        if (arg8 != -17) {
            return true;
        }
        int var14 = class397.field5436[2];
        int var15 = class397.field5436[1];
        if (class643.method3663(arg3, arg9, 1549, arg4)) {
            int var16 = class397.field5436[2];
            int var17 = class397.field5436[0];
            int var18 = class397.field5436[1];
            return class602.method3418(var11, var13, var12, var16, var18, var10, 0, var15, var14, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lha;IILei;IIIIIIII)V")
    public static final void method1914(class58 arg0, int arg1, int arg2, class177 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4082++;
        if (arg10 > arg6 && (arg6 + arg7) > arg10 && (arg4 - 13) < arg11 && arg4 + 3 > arg11) {
            arg8 = arg5;
        }
        String var12 = class502.method2979(-125, arg3);
        class567.field8070.method452(arg8, class740.field10345, arg4, var12, arg6 + 3, class126.field1322, (byte) 94, arg1);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V")
    public class320(int arg0, int arg1) {
        this.field4086 = arg1;
        this.field4087 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;IZI[BI)I")
    public static final int method1915(String arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5) {
        field4084++;
        int var6 = arg5 - arg3;
        if (arg2) {
            field4080 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg1 + var7] = -97;
            } else {
                arg4[arg1 + var7] = 63;
            }
        }
        return var6;
    }
}
