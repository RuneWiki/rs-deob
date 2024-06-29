import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class103 extends class139 {

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field2153 = 0;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lrf;")
    public static class163 field2164 = class53.method392(102, ": ");

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "[Lrf;")
    public static class163[] field2161 = new class163[1000];

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "Lrf;")
    public static class163 field2150 = class53.method392(-92, "Versteckt");

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
    public static int field2165 = -1;

    @OriginalMember(owner = "client!kh", name = "mb", descriptor = "[J")
    public static long[] field2169 = new long[32];

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "[Loa;")
    public static class131[] field2163 = new class131[4];

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field2158 = -1;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "Lrf;")
    public static class163 field2162 = class53.method392(-103, ":clanreq:");

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "Lrf;")
    private static class163 field2157 = class53.method392(116, "glow1:");

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "Lrf;")
    public static class163 field2155 = field2157;

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "Lrf;")
    public static class163 field2167 = field2157;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!kh", name = "nb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!kh", name = "ob", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!kh", name = "lb", descriptor = "[I")
    public static int[] field2168;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method702(int arg0) {
        if (arg0 >= -21) {
            field2163 = null;
        }
        field2150 = null;
        field2155 = null;
        field2167 = null;
        field2164 = null;
        field2163 = null;
        field2162 = null;
        field2161 = null;
        field2157 = null;
        field2169 = null;
        field2168 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class103() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 != 21) {
            field2167 = null;
        }
        ++field2160;
        if (arg0 == 0) {
            super.field2872 = arg2.method344(255) == 1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
    public static final void method703(int arg0) {
        if (~class67.field1411.toLowerCase().indexOf("microsoft") != 0) {
            class163.field3326[189] = 26;
            class163.field3326[192] = 58;
            class163.field3326[220] = 74;
            class163.field3326[188] = 71;
            class163.field3326[221] = 43;
            class163.field3326[219] = 42;
            class163.field3326[222] = 59;
            class163.field3326[191] = 73;
            class163.field3326[187] = 27;
            class163.field3326[190] = 72;
            class163.field3326[223] = 28;
            class163.field3326[186] = 57;
        } else {
            if (class67.field1412 == null) {
                class163.field3326[192] = 58;
                class163.field3326[222] = 59;
            } else {
                class163.field3326[222] = 58;
                class163.field3326[192] = 28;
                class163.field3326[520] = 59;
            }
            class163.field3326[47] = 73;
            class163.field3326[61] = 27;
            class163.field3326[93] = 43;
            class163.field3326[46] = 72;
            class163.field3326[45] = 26;
            class163.field3326[59] = 57;
            class163.field3326[92] = 74;
            class163.field3326[44] = 71;
            class163.field3326[91] = 42;
        }
        if (arg0 > -77) {
            method706(-39, -10, 25, -126, 50);
        }
        ++field2152;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)Z")
    public static final boolean method704(byte arg0, int arg1) {
        if (arg0 > -26) {
            field2165 = 57;
        }
        ++field2170;
        return ~((arg1 & 4095355) >> 21) != -1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZII)Lrf;")
    public static final class163 method705(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field2171;
        if (arg3 >= 2 && arg3 <= 36) {
            if (arg0 != -17) {
                field2163 = null;
            }
            int var4 = 1;
            int var5 = arg2 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                ++var4;
            }
            int var6 = var4;
            if (~arg2 > -1 || arg1) {
                var6 = var4 + 1;
            }
            byte[] var7 = new byte[var6];
            if (~arg2 > -1) {
                var7[0] = 45;
            } else if (arg1) {
                var7[0] = 43;
            }
            for (int var8 = 0; ~var4 < ~var8; ++var8) {
                int var10 = arg2 % arg3;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (~var10 < -10) {
                    var10 += 39;
                }
                var7[-var8 + -1 + var6] = (byte) (var10 + 48);
                arg2 /= arg3;
            }
            class163 var9 = new class163();
            var9.field3341 = var6;
            var9.field3320 = var7;
            return var9;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2859.method1319(-118, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0, 0, true);
            for (int var5 = 0; class23.field402 > var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        ++field2159;
        if (arg1 != 7451) {
            field2153 = -112;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
    public static final void method706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 223) {
            method703(-115);
        }
        ++field2156;
        class95 var5 = (class95) class65.field1373.method465((long) arg0, (byte) 86);
        if (var5 == null) {
            var5 = new class95();
            class65.field1373.method462(108, var5, (long) arg0);
        }
        if (var5.field2037.length <= arg1) {
            int[] var6 = new int[arg1 - -1];
            int[] var7 = new int[arg1 - -1];
            for (int var8 = 0; var8 < var5.field2037.length; ++var8) {
                var6[var8] = var5.field2037[var8];
                var7[var8] = var5.field2038[var8];
            }
            for (int var9 = var5.field2037.length; var9 < arg1; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2038 = var7;
            var5.field2037 = var6;
        }
        var5.field2037[arg1] = arg3;
        var5.field2038[arg1] = arg4;
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)Lsd;")
    public static final class170 method707(int arg0) {
        ++field2154;
        try {
            return arg0 != -15728 ? null : (class170) Class.forName("hg").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field2166;
        if (arg0 <= 53) {
            method706(-20, 76, 109, -45, -4);
        }
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[][] var4 = this.method910((byte) -97, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class23.field402 > var11; ++var11) {
                var6[var11] = -var5[var11] + 4096;
                var7[var11] = -var9[var11] + 4096;
                var10[var11] = -var8[var11] + 4096;
            }
        }
        return var3;
    }
}
