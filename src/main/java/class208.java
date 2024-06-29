import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class208 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[I")
    public int[] field3240;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[B")
    public byte[] field3247;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "[I")
    public int[] field3243;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field3242;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3235 = "rating: ";

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "[I")
    public static int[] field3244 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lhc;")
    public static class235 field3246;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[Ljb;")
    public static class276[] field3236;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Z")
    public final boolean method1392(int arg0, int arg1) {
        field3232++;
        if (arg0 <= 99) {
            method1398((class144) null, -22);
        }
        return (this.field3247[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static void method1393(boolean arg0) {
        field3246 = null;
        if (arg0) {
            field3244 = null;
        }
        field3236 = null;
        field3244 = null;
        field3235 = null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I")
    public final int method1394(int arg0, int arg1) {
        field3231++;
        int var3 = -111 % ((arg1 + 35) / 41);
        return this.field3247[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)Z")
    public final boolean method1395(int arg0, int arg1) {
        field3237++;
        if (arg1 < 48) {
            field3246 = null;
        }
        return (this.field3247[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[BLjava/lang/String;B)I")
    public static final int method1396(int arg0, int arg1, int arg2, byte[] arg3, String arg4, byte arg5) {
        int var6 = arg2 - arg1;
        if (arg5 != 69) {
            method1399(20, -28);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg4.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg0 + var7] = -97;
            } else {
                arg3[arg0 + var7] = 63;
            }
        }
        field3234++;
        return var6;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Z")
    public final boolean method1397(byte arg0, int arg1) {
        if (arg0 != 59) {
            this.field3247 = null;
        }
        field3238++;
        return (this.field3247[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lnj;I)V")
    public static final void method1398(class144 arg0, int arg1) {
        if (arg1 != -4045) {
            method1396(55, 82, 30, (byte[]) null, (String) null, (byte) 46);
        }
        field3239++;
        if (class192.field2978 == arg0.field2294 || arg0.field2214 == -1 || arg0.field2239 != 0 || (arg0.field2288 + 1) > class148.method996(-71, arg0.field2214).field423[arg0.field2199]) {
            int var2 = arg0.field2294 - arg0.field2276;
            int var3 = class192.field2978 - arg0.field2276;
            int var4 = arg0.field2210 * 128 + arg0.method971(65535) * 64;
            int var5 = arg0.field2231 * 128 + arg0.method971(65535) * 64;
            int var6 = arg0.field2206 * 128 + arg0.method971(65535) * 64;
            int var7 = arg0.field2254 * 128 + (arg0.method971(65535) * 64);
            arg0.field2240 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field2278 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        arg0.field2267 = 0;
        if (arg0.field2218 == 0) {
            arg0.field2257 = 1024;
        }
        if (arg0.field2218 == 1) {
            arg0.field2257 = 1536;
        }
        if (arg0.field2218 == 2) {
            arg0.field2257 = 0;
        }
        if (arg0.field2218 == 3) {
            arg0.field2257 = 512;
        }
        arg0.field2275 = arg0.field2257;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)V")
    public static final void method1399(int arg0, int arg1) {
        class111.field1817 = -1;
        if (arg0 != 29079) {
            method1393(true);
        }
        class84.field1422 = false;
        class240.field3908 = arg1;
        field3245++;
        class179.field2792 = -1;
        class253.field4061 = 1;
        class179.field2783 = 0;
        class205.field3198 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILai;)Lad;")
    public static final class259 method1400(int arg0, int arg1, class88 arg2) {
        class259 var3 = new class259(arg0, arg2.method675((byte) 16), arg2.method675((byte) 16), arg2.method641(-1), arg2.method641(arg1 ^ 0xFFFFFFFE), arg1 == arg2.method633(arg1 ^ 0x75), arg2.method633(60));
        field3241++;
        int var4 = arg2.method633(125);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4152.method1219(false, new class79(arg2.method633(58), arg2.method633(arg1 + 92), arg2.method645(11596), arg2.method645(arg1 + 11595), arg2.method645(arg1 + 11595), arg2.method645(11596), arg2.method645(11596), arg2.method645(arg1 + 11595), arg2.method645(11596), arg2.method645(11596)));
        }
        var3.method1756((byte) -118);
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
    public class208(int arg0) {
        this.field3233 = arg0;
        this.field3240 = new int[this.field3233];
        this.field3247 = new byte[this.field3233];
        this.field3243 = new int[this.field3233];
        this.field3242 = new String[this.field3233];
    }
}
