import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class74 extends class120 {

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "Lok;")
    public static class41 field1096 = null;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "Lok;")
    public static class41 field1093 = class137.method956("(U4", 45);

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "J")
    public static long field1091 = 0L;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "Lmh;")
    public static class65 field1089;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V", line = 4)
    public static void method544(int arg0) {
        field1093 = null;
        field1096 = null;
        field1089 = null;
        if (arg0 != -1) {
            method545((byte) -54, (class112) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLlb;)V", line = 35)
    public static final void method545(byte arg0, class112 arg1) {
        field1092++;
        if (arg0 != -56) {
            field1090 = -117;
        }
        if (class10.field135 != null) {
            try {
                class10.field135.method675(-99, 0L);
                class10.field135.method677(arg1.field1607, arg1.field1640, 24, false);
            } catch (Exception var3) {
            }
        }
        arg1.field1640 += 24;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 56)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILic;Lie;IIILof;)V", line = 64)
    public static final void method546(int arg0, int arg1, class171 arg2, class50 arg3, int arg4, int arg5, int arg6, class245 arg7) {
        field1095++;
        class149 var8 = new class149();
        var8.field2308 = arg0;
        if (arg1 != 5559) {
            return;
        }
        var8.field2328 = arg6 * 128;
        var8.field2312 = arg5 * 128;
        if (arg2 != null) {
            var8.field2321 = arg2;
            var8.field2327 = arg2.field2742;
            var8.field2306 = arg2.field2798 * 128;
            var8.field2324 = arg2.field2764;
            int var9 = arg2.field2752;
            var8.field2315 = arg2.field2785;
            int var10 = arg2.field2784;
            if (arg4 == 1 || arg4 == 3) {
                var9 = arg2.field2784;
                var10 = arg2.field2752;
            }
            var8.field2318 = (arg5 + var10) * 128;
            var8.field2322 = arg2.field2732;
            var8.field2307 = (arg6 + var9) * 128;
            if (arg2.field2745 != null) {
                var8.field2311 = true;
                var8.method1031(arg1 - 22782);
            }
            if (var8.field2315 != null) {
                var8.field2323 = var8.field2324 + ((int) (Math.random() * (double) (var8.field2322 - var8.field2324)));
            }
            class236.field3796.method1503(var8, (byte) -97);
        } else if (arg3 != null) {
            var8.field2316 = arg3;
            class147 var11 = arg3.field758;
            if (var11.field2284 != null) {
                var8.field2311 = true;
                var11 = var11.method1015(-1);
            }
            if (var11 != null) {
                var8.field2318 = (arg5 + var11.field2251) * 128;
                var8.field2307 = (var11.field2251 + arg6) * 128;
                var8.field2327 = class174.method1245(arg3, (byte) 38);
                var8.field2306 = var11.field2260 * 128;
            }
            class140.field2149.method1503(var8, (byte) -79);
        } else if (arg7 != null) {
            var8.field2313 = arg7;
            var8.field2307 = (arg7.method1753((byte) -15) + arg6) * 128;
            var8.field2318 = (arg7.method1753((byte) -15) + arg5) * 128;
            var8.field2327 = class281.method1983((byte) -53, arg7);
            var8.field2306 = arg7.field3903 * 128;
            class283.field4599.method610(115, var8, arg7.field3933.method291((byte) 65));
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I", line = 162)
    public final int[] method14(int arg0, int arg1) {
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            field1091 = -87L;
        }
        field1101++;
        if (this.field1775.field1798) {
            for (int var4 = 0; var4 < class307.field5160; var4++) {
                this.method547(var4, arg0, arg1 + 15036);
                int[] var5 = this.method854(0, class311.field5231, -24059);
                var3[var4] = var5[class316.field5351];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)[[I", line = 199)
    public final int[][] method168(int arg0, boolean arg1) {
        field1099++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (!arg1) {
            field1090 = 103;
        }
        if (this.field1764.field1836) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class307.field5160; var7++) {
                this.method547(var7, arg0, 93);
                int[][] var8 = this.method858(0, class311.field5231, 121);
                var4[var7] = var8[0][class316.field5351];
                var6[var7] = var8[1][class316.field5351];
                var5[var7] = var8[2][class316.field5351];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)V", line = 236)
    private final void method547(int arg0, int arg1, int arg2) {
        field1094++;
        int var4 = class203.field3278[arg0];
        int var5 = class16.field216[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var6 && (double) var6 <= -2.356194490192345D) {
            class316.field5351 = arg0;
            class311.field5231 = arg1;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class316.field5351 = arg1;
            class311.field5231 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && -1.5707963267948966D <= (double) var6) {
            class311.field5231 = arg0;
            class316.field5351 = class307.field5160 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class311.field5231 = class226.field3609 - arg1;
            class316.field5351 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class311.field5231 = class226.field3609 - arg1;
            class316.field5351 = class307.field5160 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class311.field5231 = class226.field3609 - arg0;
            class316.field5351 = class307.field5160 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class316.field5351 = arg1;
            class311.field5231 = class226.field3609 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class311.field5231 = arg1;
            class316.field5351 = class307.field5160 - arg0;
        }
        class311.field5231 &= class27.field410;
        int var7 = -82 % ((arg2 + 1) / 38);
        class316.field5351 &= class51.field776;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Llb;II)V", line = 325)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field1770 = arg0.method792(2) == 1;
        }
        field1097++;
    }
}
