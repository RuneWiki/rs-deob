import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class284 extends class172 {

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "[I")
    public static int[] field4389 = new int[5];

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field4398 = 0;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field4385 = 100;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4410 = "Loading sprites - ";

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4397 = "scroll:";

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4405 = null;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public int field4390;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public int field4395;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public int field4408;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "Loa;")
    public class163 field4402;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Lqj;")
    public class225 field4391;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "Lnj;")
    public class235 field4413;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "Lj;")
    public class7 field4394;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBIIII)I", line = 9)
    public static final int method2063(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4388++;
        int var7 = arg6 & 0x3;
        if (arg2 != -104) {
            method2063(103, -2, (byte) -86, -104, 60, -113, -42);
        }
        if ((arg0 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 - (arg5 - 1) - arg1;
        } else {
            return 7 - arg4 - (arg3 + -1);
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 65)
    public final void method2064(int arg0) {
        this.field4394 = null;
        int var2 = -118 % ((25 - arg0) / 48);
        this.field4402 = null;
        this.field4391 = null;
        this.field4413 = null;
        field4414++;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 83)
    public static void method2065(int arg0) {
        if (arg0 != -21657) {
            field4397 = (String) null;
        }
        field4410 = null;
        field4389 = null;
        field4397 = null;
        field4405 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 110)
    public static final byte[] method2066(byte arg0, String arg1) {
        field4392++;
        if (arg0 != -121) {
            field4405 = (String) null;
        }
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }
}
