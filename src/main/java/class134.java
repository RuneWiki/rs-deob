import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class134 implements class215 {

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lrm;")
    private class234 field2104 = new class234(256);

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lmo;")
    private class447 field2103;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lmo;")
    private class447 field2098;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[Lnq;")
    private class266[] field2095;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2094 = 20;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lal;")
    public static class52 field2110 = new class52(8);

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "[[I")
    public static int[][] field2113 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[I")
    public static int[] field2112 = new int[1000];

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lmo;")
    public static class447 field2109;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(IB)Lcr;", line = 6)
    private final class342 method981(int arg0, byte arg1) {
        field2108++;
        class7 var3 = this.field2104.method1660(2, (long) arg0);
        if (var3 != null) {
            return (class342) var3;
        }
        byte[] var4 = this.field2098.method2776(0, arg0);
        if (var4 == null) {
            return null;
        }
        class342 var5 = new class342(new class186(var4));
        if (arg1 > -50) {
            return null;
        } else {
            this.field2104.method1655(false, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLmp;ILe;III)V", line = 33)
    public static final void method982(boolean arg0, class452 arg1, int arg2, class312 arg3, int arg4, int arg5, int arg6) {
        field2093++;
        if (arg0) {
            class247.field4053.method2327((class369.field5615 - class247.field4053.method2318()) / 2, (class430.field6324 - class247.field4053.method2315()) / 2);
            class344.field5298.method2327((class369.field5615 - class344.field5298.method2318()) / 2, 18);
        }
        if (arg2 != 25427) {
            return;
        }
        arg1.method2820(class61.field787 == 1 ? class263.field4249 : class261.field4197, -1, class430.field6324 / 2 - 26, false, class369.field5615 / 2, arg6);
        int var7 = class430.field6324 / 2 - 18;
        arg3.method647(class369.field5615 / 2 - 152, var7, 304, 34, arg5, 0);
        arg3.method647(class369.field5615 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg3.method563(class369.field5615 / 2 - 150, var7 - -2, class173.field2887 * 3, 30, arg4, 0);
        arg3.method563(class369.field5615 / 2 + class173.field2887 * 3 - 150, var7 - -2, 300 - (class173.field2887 * 3), 30, 0, 0);
        arg1.method2820(class70.field873, -1, class430.field6324 / 2 + 4, false, class369.field5615 / 2, arg6);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IFIZII)[I", line = 58)
    public final int[] method983(int arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 != -28113) {
            method988(-117, -126, 126);
        }
        field2097++;
        return this.method981(arg0, (byte) -97).method2243((double) arg1, arg3, this, arg5, arg2, this.field2095[arg0].field4280, arg4 ^ 0x6D2F, this.field2103);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZZFI)[I", line = 70)
    public final int[] method984(int arg0, int arg1, boolean arg2, boolean arg3, float arg4, int arg5) {
        field2105++;
        if (arg3) {
            this.field2095 = null;
        }
        return this.method981(arg0, (byte) -122).method2245((double) arg4, arg1, (byte) -124, this, this.field2103, this.field2095[arg0].field4280, arg5);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)Z", line = 81)
    public final boolean method985(int arg0, byte arg1) {
        field2099++;
        if (arg1 != -16) {
            method988(117, -49, 107);
        }
        class342 var3 = this.method981(arg0, (byte) -82);
        return var3 != null && var3.method2247((byte) 124, this.field2103, this);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 94)
    public static final void method986(boolean arg0) {
        class369.field5612 = null;
        class248.field4062 = null;
        class181.field2960 = null;
        class245.field4021 = null;
        if (!arg0) {
            method988(0, -114, -21);
        }
        class379.field5741 = null;
        class152.field2373 = null;
        class329.field5157 = null;
        class254.field4122 = null;
        class292.field4680 = null;
        class405.field6027 = null;
        class388.field5850 = null;
        class267.field4309 = null;
        class241.field4008 = null;
        class269.field4321 = null;
        field2102++;
        class359.field5499 = null;
        class11.field133 = null;
        class435.field6411 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 128)
    public static void method987(int arg0) {
        if (arg0 != 21813) {
            field2109 = null;
        }
        field2110 = null;
        field2112 = null;
        field2113 = null;
        field2109 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z", line = 141)
    public static final boolean method988(int arg0, int arg1, int arg2) {
        field2106++;
        class127 var3 = class137.method1003(arg0, -30796);
        if (arg1 != 2) {
            field2109 = null;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method932(-116, arg2);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Lnq;", line = 167)
    public final class266 method989(int arg0, byte arg1) {
        field2096++;
        if (arg1 < 27) {
            this.method989(-18, (byte) 111);
        }
        return this.field2095[arg0];
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lmo;Lmo;Lmo;)V", line = 194)
    public class134(class447 arg0, class447 arg1, class447 arg2) {
        this.field2103 = arg2;
        this.field2098 = arg1;
        class186 var4 = new class186(arg0.method2771(0, 0, 3));
        int var5 = var4.method1272((byte) -100);
        this.field2095 = new class266[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1322(false) == 1) {
                this.field2095[var6] = new class266();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2095[var7] != null) {
                this.field2095[var7].field4269 = var4.method1322(false) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2095[var8] != null) {
                this.field2095[var8].field4267 = var4.method1322(false) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2095[var9] != null) {
                this.field2095[var9].field4282 = var4.method1322(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2095[var10] != null) {
                this.field2095[var10].field4273 = var4.method1322(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2095[var11] != null) {
                this.field2095[var11].field4281 = var4.method1327((byte) -128);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2095[var12] != null) {
                this.field2095[var12].field4285 = var4.method1327((byte) -125);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2095[var13] != null) {
                this.field2095[var13].field4279 = var4.method1327((byte) -106);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2095[var14] != null) {
                this.field2095[var14].field4270 = var4.method1327((byte) -113);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2095[var15] != null) {
                this.field2095[var15].field4284 = (short) var4.method1272((byte) -112);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2095[var16] != null) {
                this.field2095[var16].field4268 = var4.method1327((byte) -90);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2095[var17] != null) {
                this.field2095[var17].field4283 = var4.method1327((byte) -123);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2095[var18] != null) {
                this.field2095[var18].field4277 = var4.method1322(false) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2095[var19] != null) {
                this.field2095[var19].field4280 = var4.method1322(false) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2095[var20] != null) {
                this.field2095[var20].field4271 = var4.method1327((byte) -107);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2095[var21] != null) {
                this.field2095[var21].field4278 = var4.method1322(false) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2095[var22] != null) {
                this.field2095[var22].field4275 = var4.method1322(false) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2095[var23] != null) {
                this.field2095[var23].field4274 = var4.method1322(false) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIFBZI)[F", line = 184)
    public final float[] method990(int arg0, int arg1, float arg2, byte arg3, boolean arg4, int arg5) {
        field2107++;
        return arg3 < 92 ? null : this.method981(arg0, (byte) -96).method2242(this.field2103, (byte) -81, this, this.field2095[arg0].field4280, arg1, arg5);
    }
}
