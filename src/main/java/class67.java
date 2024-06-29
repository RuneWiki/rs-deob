import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class67 extends class335 {

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "[I")
    public static int[] field1120 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
    public static int[] field1119 = new int[256];

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lid;IIZIIB)Lwj;", line = 5)
    public static final class270 method512(class189 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        if (arg6 > -12) {
            method512((class189) null, -38, 74, false, -63, -62, (byte) -86);
        }
        field1121++;
        int var8 = arg1 + (arg3 ? 65536 : 0) + (arg5 << 17) + (arg2 << 19);
        long var9 = (long) arg4 * 3147483667L + (long) var8 * 3849834839L;
        class270 var11 = (class270) class229.field3639.method2179(false, var9);
        if (var11 != null) {
            return var11;
        }
        class15.field212 = false;
        class270 var12 = class251.method1741(arg2, false, false, arg1, arg3, 272444528, arg5, arg4, arg0);
        if (var12 != null && !class15.field212) {
            class229.field3639.method2173(var12, true, var9);
        }
        return var12;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 34)
    public class67() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILtb;)Ltb;", line = 38)
    public static final class220 method513(int arg0, class220 arg1) {
        field1112++;
        if (arg1.field3393 != -1) {
            return class68.method524((byte) -112, arg1.field3393);
        }
        int var2 = arg1.field3404 >>> 16;
        class173 var3 = new class173(class276.field4257);
        if (arg0 != 20786) {
            return (class220) null;
        }
        for (class61 var4 = (class61) var3.method1247(-98); var4 != null; var4 = (class61) var3.method1245(0)) {
            if (var4.field982 == var2) {
                return class68.method524((byte) -107, (int) var4.field758);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lkh;I)Ljava/lang/String;", line = 70)
    public static final String method514(class166 arg0, int arg1) {
        field1111++;
        if (arg1 < 48) {
            field1119 = (int[]) null;
        }
        return class154.method1060(128, 32767, arg0);
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V", line = 82)
    public static void method515(int arg0) {
        if (arg0 == 0) {
            field1119 = null;
            field1120 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", line = 94)
    public static final String method516(String arg0, String arg1, String arg2, boolean arg3) {
        if (arg3) {
            return (String) null;
        }
        field1108++;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = arg1.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg0.indexOf(arg2, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg0.indexOf(arg2, var12);
            if (var13 < 0) {
                var11.append(arg0.substring(var12));
                return var11.toString();
            }
            var11.append(arg0.substring(var12, var13));
            var11.append(arg1);
            var12 = var5 + var13;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBIIIII)V", line = 150)
    public static final void method517(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1109++;
        if (arg1 < 69) {
            method512((class189) null, -113, 117, false, -68, -109, (byte) -99);
        }
        class235[] var7 = class75.field1216;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class235 var9 = var7[var8];
            if (var9 != null && var9.field3761 == 2) {
                class310.method2115(-51, arg0, arg3 >> 1, var9.field3749 * 2, arg5, arg2 >> 1, (var9.field3746 - class213.field3249 << 7) + var9.field3744, (-class342.field5328 + var9.field3748 << 7) + var9.field3758);
                if (class240.field3829 > -1 && (class227.field3618 % 20) < 10) {
                    class314.field4876[var9.field3752].method617(class240.field3829 + arg6 - 12, arg4 - (-class336.field5267 + 28));
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I", line = 182)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            field1117 = 70;
        }
        field1110++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            for (int var4 = 0; var4 < class105.field1630; var4++) {
                this.method519(arg0, 80, var4);
                int[] var5 = this.method2330(class295.field4564, true, 0);
                var3[var4] = var5[class199.field2978];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 218)
    public static final void method518(String arg0, int arg1) {
        if (arg1 == 0) {
            System.out.println("Error: " + class171.method1239(arg0, (byte) 116, "\n", "%0a"));
            field1107++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V", line = 230)
    private final void method519(int arg0, int arg1, int arg2) {
        field1115++;
        int var4 = class90.field1437[arg2];
        int var5 = class280.field4316[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class199.field2978 = arg2;
            class295.field4564 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class199.field2978 = arg0;
            class295.field4564 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class295.field4564 = arg2;
            class199.field2978 = class105.field1630 - arg0;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class199.field2978 = arg2;
            class295.field4564 = class75.field1213 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class199.field2978 = class105.field1630 - arg2;
            class295.field4564 = class75.field1213 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class199.field2978 = class105.field1630 - arg0;
            class295.field4564 = class75.field1213 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class199.field2978 = arg0;
            class295.field4564 = class75.field1213 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class295.field4564 = arg0;
            class199.field2978 = class105.field1630 - arg2;
        }
        class199.field2978 &= class244.field3906;
        if (arg1 <= 77) {
            method520((class133) null, 36);
        }
        class295.field4564 &= class227.field3597;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[[I", line = 306)
    public final int[][] method249(int arg0, byte arg1) {
        field1114++;
        if (arg1 != 51) {
            this.method230(-100, (class166) null, 40);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class105.field1630; var7++) {
                this.method519(arg0, 95, var7);
                int[][] var8 = this.method2328(class295.field4564, false, 0);
                var4[var7] = var8[0][class199.field2978];
                var5[var7] = var8[1][class199.field2978];
                var6[var7] = var8[2][class199.field2978];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ll;I)I", line = 349)
    public static final int method520(class133 arg0, int arg1) {
        if (arg1 != 32767) {
            field1117 = 109;
        }
        field1116++;
        int var2 = 0;
        if (arg0.method956(class339.field5301, true)) {
            var2++;
        }
        if (arg0.method956(class258.field4041, true)) {
            var2++;
        }
        if (arg0.method956(class58.field937, true)) {
            var2++;
        }
        if (arg0.method956(class90.field1443, true)) {
            var2++;
        }
        if (arg0.method956(class238.field3781, true)) {
            var2++;
        }
        if (arg0.method956(class204.field3071, true)) {
            var2++;
        }
        if (arg0.method956(class188.field2811, true)) {
            var2++;
        }
        if (arg0.method956(class316.field4935, true)) {
            var2++;
        }
        if (arg0.method956(class150.field2270, true)) {
            var2++;
        }
        if (arg0.method956(class181.field2729, true)) {
            var2++;
        }
        if (arg0.method956(class131.field2061, true)) {
            var2++;
        }
        if (arg0.method956(class212.field3227, true)) {
            var2++;
        }
        if (arg0.method956(class344.field5337, true)) {
            var2++;
        }
        if (arg0.method956(class222.field3542, true)) {
            var2++;
        }
        if (arg0.method956(class32.field460, true)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILkh;I)V", line = 415)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field5234 = arg1.method1178(0) == 1;
        }
        if (arg2 < 51) {
            this.method230(113, (class166) null, 4);
        }
        field1122++;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V", line = 439)
    public static final void method521(int arg0) {
        class77.method568();
        class80.field1265 = -1;
        if (arg0 < 65) {
            field1119 = (int[]) null;
        }
        class268.field4181 = null;
        field1113++;
        class171.method1235((byte) -96);
        class319.field4981.method440((byte) -107);
        class128.field2008 = new class121();
        ((class315) class15.field207).method2142((byte) 58);
        class45.method402();
        class183.field2755 = new class204[255];
        class183.field2763 = 0;
        class21.method202();
        class6.method38();
        class107.method774(0);
        class257.method1766(6, false);
        class62.method481(-115);
        class32.method263(27261);
        for (int var1 = 0; var1 < 2048; var1++) {
            class33 var2 = class254.field3992[var1];
            if (var2 != null) {
                var2.field1893 = null;
            }
        }
        if (class94.field1516) {
            class6.method42(104, 104);
            class174.method1254((byte) -52, class34.field512);
            class64.method492();
        }
        class134.method984(class186.field2788, true, class142.field2190);
        class322.method2191(-19605, class186.field2788);
        class88.field1420 = null;
        class107.field1661 = null;
        class185.field2771 = null;
        class233.field3698 = null;
        class101.field1582 = null;
        if (class131.field2052 == 5) {
            class288.method1980((byte) 80, class186.field2788);
        }
        if (class131.field2052 == 10) {
            class203.method1441(1, false);
        }
        if (class131.field2052 == 30) {
            class88.method640(25, (byte) 49);
        }
    }
}
