import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class7 {

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public int field66 = 0;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field64 = 0;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Lqj;")
    public static class238 field70;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 6)
    public static void method53(int arg0) {
        field70 = null;
        if (arg0 >= -95) {
            field65 = 111;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lqj;Lqj;Lqj;Lqj;B)V", line = 19)
    public static final void method54(class238 arg0, class238 arg1, class238 arg2, class238 arg3, byte arg4) {
        field69++;
        class419.field6221 = arg3;
        class262.field3811 = arg1;
        class405.field6088 = arg2;
        class419.field6228 = arg0;
        class119.field1607 = new class249[class262.field3811.method1469((byte) -125)][];
        if (arg4 < 113) {
            field65 = -120;
        }
        class339.field4991 = new boolean[class262.field3811.method1469((byte) -128)];
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZIII)I", line = 35)
    public static final int method55(boolean arg0, int arg1, int arg2, int arg3) {
        field76++;
        if (arg1 == arg3) {
            return arg3;
        }
        if (!arg0) {
            method57(70, 69, 118, -89, -21);
        }
        int var4 = 128 - arg2;
        int var5 = (arg1 & 0x7F) * arg2 + (arg3 & 0x7F) * var4 >> 7;
        int var6 = (arg1 & 0x380) * arg2 + (arg3 & 0x380) * var4 >> 7;
        int var7 = (arg3 & 0xFC00) * var4 + ((arg1 & 0xFC00) * arg2) >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lil;IZ)V", line = 58)
    private final void method56(class265 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field71 = -90;
        }
        if (arg1 == 5) {
            this.field66 = arg0.method1685(8104);
        }
        field72++;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIII)I", line = 74)
    public static final int method57(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field73++;
        int var5 = arg3 & 0xF;
        int var6 = var5 >= 8 ? arg2 : arg0;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg0 : arg4);
        if (arg1 < 81) {
            field70 = null;
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)[B", line = 97)
    public static final byte[] method58(boolean arg0, int arg1) {
        field75++;
        class132 var2 = (class132) class187.field2542.method2319(-12, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class205.method1296(2044605728, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class132(var3);
            class187.field2542.method2318(var2, false, (long) arg1);
        }
        return arg0 ? null : var2.field1773;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLil;)V", line = 157)
    public final void method59(byte arg0, class265 arg1) {
        if (arg0 <= 120) {
            return;
        }
        field74++;
        while (true) {
            int var3 = arg1.method1697(-109);
            if (var3 == 0) {
                return;
            }
            this.method56(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;II[BI)I", line = 182)
    public static final int method60(int arg0, String arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field67++;
        if (arg5 != -25945) {
            method58(false, 40);
        }
        int var6 = arg3 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg0 + var7] = -97;
            } else {
                arg4[arg0 + var7] = 63;
            }
        }
        return var6;
    }
}
