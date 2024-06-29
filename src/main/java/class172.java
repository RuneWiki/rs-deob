import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class172 extends class313 {

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    private int field2973 = 32768;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "[J")
    public static long[] field2977 = new long[100];

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Ltm;")
    public static class79 field2972 = new class79(8);

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)V", line = 7)
    public static final void method1351(int arg0, byte arg1) {
        class293.field4708--;
        field2971++;
        if (class293.field4708 == arg0) {
            return;
        }
        class345.method2420(class166.field2909, arg0 + 1, class166.field2909, arg0, class293.field4708 - arg0);
        class345.method2420(class241.field3944, arg0 + 1, class241.field3944, arg0, class293.field4708 - arg0);
        class345.method2415(class221.field3691, arg0 + 1, class221.field3691, arg0, class293.field4708 - arg0);
        class345.method2414(class276.field4401, arg0 + 1, class276.field4401, arg0, class293.field4708 - arg0);
        class345.method2419(class110.field1868, arg0 + 1, class110.field1868, arg0, class293.field4708 - arg0);
        class345.method2415(class161.field2863, arg0 + 1, class161.field2863, arg0, class293.field4708 - arg0);
        if (arg1 == -65) {
            class345.method2415(class70.field1135, arg0 + 1, class70.field1135, arg0, class293.field4708 - arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIII)I", line = 28)
    public static final int method1352(int arg0, int arg1, int arg2, int arg3) {
        field2976++;
        if (arg1 != 0) {
            return 19;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V", line = 52)
    public static void method1353(boolean arg0) {
        field2972 = null;
        if (arg0) {
            field2977 = (long[]) null;
        }
        field2977 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[I", line = 66)
    public final int[] method111(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method182(5);
        }
        field2970++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[] var4 = this.method2156(1, true, arg1);
            int[] var5 = this.method2156(2, true, arg1);
            for (int var6 = 0; var6 < class133.field2269; var6++) {
                int var7 = var4[var6] >> 4 & 0xFF;
                int var8 = var5[var6] * this.field2973 >> 12;
                int var9 = class209.field3548[var7] * var8 >> 12;
                int var10 = class17.field284[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class297.field4731;
                int var12 = class132.field2262 & (var10 >> 12) + arg1;
                int[] var13 = this.method2156(0, true, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 115)
    public final void method182(int arg0) {
        if (arg0 == 25833) {
            class154.method1238(0);
            field2975++;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I", line = 129)
    public final int[][] method299(int arg0, int arg1) {
        field2979++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 125);
        if (this.field4958.field5463) {
            int[] var4 = this.method2156(1, true, arg0);
            int[] var5 = this.method2156(2, true, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class133.field2269; var9++) {
                int var10 = var4[var9] * 255 >> 12 & 0xFF;
                int var11 = var5[var9] * this.field2973 >> 12;
                int var12 = class209.field3548[var10] * var11 >> 12;
                int var13 = class297.field4731 & var9 + (var12 >> 12);
                int var14 = class17.field284[var10] * var11 >> 12;
                int var15 = class132.field2262 & (var14 >> 12) + arg0;
                int[][] var16 = this.method2161(0, 4, var15);
                var7[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        if (arg1 != 2) {
            field2977 = (long[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 222)
    public class172() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 197)
    public static final String[] method1354(String[] arg0, int arg1) {
        field2978++;
        if (arg1 <= 11) {
            field2972 = (class79) null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILpi;)V", line = 226)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field2974++;
        if (arg1 != -17848) {
            field2972 = (class79) null;
        }
        if (arg0 == 0) {
            this.field2973 = arg2.method2339((byte) -46) << 4;
        } else if (arg0 == 1) {
            this.field4968 = arg2.method2364(arg1 ^ 0x66DB) == 1;
        }
    }
}
