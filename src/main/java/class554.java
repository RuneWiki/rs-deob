import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class554 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lqp;")
    public static class586 field8231 = new class586(68, 3);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Z")
    public static boolean field8233 = false;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lrk;")
    public static class419 field8234 = new class419();

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field8237 = class552.method3233(22, 1600);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field8235;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method3237(int arg0) {
        field8231 = null;
        field8234 = null;
        if (arg0 != 0) {
            field8234 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BBII)[B")
    public static final byte[] method3238(byte[] arg0, byte arg1, int arg2, int arg3) {
        field8232++;
        byte[] var4 = new byte[arg3];
        class473.method2883(arg0, arg2, var4, 0, arg3);
        if (arg1 > -111) {
            field8234 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static final void method3239(int arg0) {
        if (arg0 != 17496) {
            method3240(69, null, -89, -49, 15, null);
        }
        class186.method1221(-1, false);
        field8236++;
        if (class155.field1986 >= 0 && class155.field1986 != 0) {
            class447.method2712(10, class155.field1986);
            class155.field1986 = -1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BIIILjava/lang/String;)I")
    public static final int method3240(int arg0, byte[] arg1, int arg2, int arg3, int arg4, String arg5) {
        field8235++;
        int var6 = arg4 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg3 + var7] = -97;
            } else {
                arg1[arg3 + var7] = 63;
            }
        }
        if (arg2 == 16855) {
            return var6;
        } else {
            return 71;
        }
    }
}
