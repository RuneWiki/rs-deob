import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class115 extends class259 {

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "Lsg;")
    public static class30 field2268 = class167.method1221((byte) 33, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "Lsg;")
    public static class30 field2272 = class167.method1221((byte) 33, " GMT");

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "Z")
    public static boolean field2275 = false;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "Lsg;")
    private static class30 field2280 = class167.method1221((byte) 33, "Loading world list data");

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "Lsg;")
    public static class30 field2273 = field2280;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "[S")
    public static short[] field2274;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(III)V")
    private final void method892(int arg0, int arg1, int arg2) {
        ++field2278;
        int var4 = class29.field558[arg0];
        int var5 = class154.field2910[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (arg2 + var5));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class58.field1271 = arg1;
            class120.field2359 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class58.field1271 = arg0;
            class120.field2359 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class58.field1271 = arg0;
            class120.field2359 = class223.field3999 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class120.field2359 = arg0;
            class58.field1271 = class94.field1911 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class120.field2359 = -arg0 + class223.field3999;
            class58.field1271 = -arg1 + class94.field1911;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class120.field2359 = -arg1 + class223.field3999;
            class58.field1271 = -arg0 + class94.field1911;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class120.field2359 = arg1;
            class58.field1271 = class94.field1911 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class58.field1271 = arg1;
            class120.field2359 = -arg0 + class223.field3999;
        }
        class58.field1271 &= class263.field4649;
        class120.field2359 &= class52.field1174;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIILni;JZ)V")
    public static final void method893(int arg0, int arg1, int arg2, int arg3, class20 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class104 var8 = new class104();
            var8.field2089 = arg4;
            var8.field2104 = arg1 * 128 + 64;
            var8.field2093 = arg2 * 128 + 64;
            var8.field2101 = arg3;
            var8.field2087 = arg5;
            if (class71.field1613[arg0][arg1][arg2] == null) {
                class71.field1613[arg0][arg1][arg2] = new class195(arg0, arg1, arg2);
            }
            class71.field1613[arg0][arg1][arg2].field3541 = var8;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)I")
    public static final int method894(boolean arg0, int arg1, int arg2) {
        ++field2269;
        if (arg2 == -1) {
            return 12345678;
        } else {
            int var3 = (127 & arg2) * arg1 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            if (arg0) {
                field2275 = false;
            }
            return (65408 & arg2) + var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field2276;
        int var3 = -10 / ((arg0 - -48) / 42);
        int[][] var4 = super.field4568.method241(62, arg1);
        if (super.field4568.field564) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class223.field3999; ++var8) {
                this.method892(var8, arg1, -2048);
                int[][] var9 = this.method1795(class58.field1271, 2, 0);
                var5[var8] = var9[0][class120.field2359];
                var6[var8] = var9[1][class120.field2359];
                var7[var8] = var9[2][class120.field2359];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field2267;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            for (int var4 = 0; ~var4 > ~class223.field3999; ++var4) {
                this.method892(var4, arg0, -2048);
                int[] var5 = this.method1799(0, class58.field1271, 121);
                var3[var4] = var5[class120.field2359];
            }
        }
        if (arg1) {
            this.method3((byte) 98, -12);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)V")
    public static void method895(int arg0) {
        field2280 = null;
        field2273 = null;
        field2274 = null;
        if (arg0 != -30307) {
            field2273 = null;
        }
        field2268 = null;
        field2272 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILaa;)Lgi;")
    public static final class179 method896(int arg0, class8 arg1) {
        int var2 = -26 / ((arg0 - -3) / 56);
        ++field2279;
        class179 var3 = new class179(arg1.method84(0), arg1.method84(0), arg1.method65((byte) 123), arg1.method65((byte) 117), arg1.method70(65280), arg1.method63((byte) 97) == 1);
        int var4 = arg1.method63((byte) 57);
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            var3.field3322.method477(new class252(arg1.method65((byte) 124), arg1.method65((byte) 108), arg1.method65((byte) 115), arg1.method65((byte) 127)), (byte) 6);
        }
        var3.method1303(0);
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class115() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            field2273 = null;
        }
        if (~arg0 == -1) {
            super.field4588 = ~arg2.method63((byte) 72) == -2;
        }
        ++field2270;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILbj;IIBLdl;)V")
    public static final void method897(int arg0, int arg1, class44 arg2, int arg3, int arg4, byte arg5, class31 arg6) {
        ++field2271;
        if (arg2 != null) {
            int var7 = 2047 & class110.field2202 - -class147.field2811;
            int var8 = Math.max(arg6.field728 / 2, arg6.field670 / 2) + 10;
            int var9 = arg3 * arg3 - -(arg0 * arg0);
            if (var8 * var8 >= var9) {
                if (arg5 != 36) {
                    field2275 = true;
                }
                int var10 = class213.field3849[var7];
                int var11 = class213.field3846[var7];
                int var12 = var11 * 256 / (class50.field1139 + 256);
                int var13 = var10 * 256 / (class50.field1139 + 256);
                int var14 = arg0 * var12 + -(arg3 * var13) >> 16;
                int var15 = arg0 * var13 - -(arg3 * var12) >> 16;
                ((class152) arg2).method1133(arg6.field728 / 2 + (arg1 - arg2.field1045 / 2) + var15, arg6.field670 / 2 + -var14 + -(arg2.field1042 / 2) + arg4, arg6.field697, arg6.field760);
            }
        }
    }
}
