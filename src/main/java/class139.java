import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class139 implements class289 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Z")
    private boolean field2374 = false;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    private int field2396 = 50;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lcb;")
    private class267 field2392;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "Lcb;")
    private class267 field2406;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Li;")
    private class203 field2388;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Li;")
    private class203 field2397;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "[S")
    private short[] field2412;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "[Z")
    private boolean[] field2380;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "[B")
    private byte[] field2389;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "[Z")
    private boolean[] field2415;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[Z")
    private boolean[] field2408;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "[Z")
    private boolean[] field2405;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "[B")
    private byte[] field2400;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "[B")
    private byte[] field2401;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "[Z")
    private boolean[] field2414;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[B")
    private byte[] field2384;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Lwa;")
    public static class75 field2393 = class66.method560(":tradereq:", false);

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lwa;")
    private static class75 field2404 = class66.method560("Location", false);

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2377 = -2;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field2409 = 1;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Lwa;")
    public static class75 field2399 = field2404;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "Lmc;")
    public static class170 field2418 = new class170();

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "F")
    public static float field2379;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "[I")
    public static int[] field2373;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(IB)I", line = 9)
    public final int method1057(int arg0, byte arg1) {
        field2382++;
        return arg1 >= -46 ? -60 : this.field2389[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIF)[I", line = 24)
    public final int[] method1058(byte arg0, int arg1, float arg2) {
        field2372++;
        if (arg0 < 75) {
            this.method1072(-15, 50);
        }
        class37 var4 = this.method1074((byte) 121, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field533 = true;
            return var4.method251(arg2, this.field2374 || this.field2415[arg1], this, -96, this.field2392);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Lpd;", line = 42)
    public static final class3 method1059(byte arg0, int arg1) {
        field2407++;
        class3 var2 = (class3) class217.field3715.method1514(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class294.field5063.method1911(arg1, 0, -39);
        if (arg0 < 77) {
            field2379 = -0.20706251F;
        }
        if (var3 == null) {
            return null;
        }
        class3 var4 = new class3();
        class60 var5 = new class60(var3);
        var5.field1012 = var5.field997.length - 2;
        int var6 = var5.method485((byte) -2);
        int var7 = var5.field997.length - var6 - 2 - 12;
        var5.field1012 = var7;
        int var8 = var5.method505(255);
        var4.field34 = var5.method485((byte) -2);
        var4.field36 = var5.method485((byte) -2);
        var4.field26 = var5.method485((byte) -2);
        var4.field25 = var5.method485((byte) -2);
        int var9 = var5.method501(0);
        if (var9 > 0) {
            var4.field38 = new class126[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method485((byte) -2);
                class126 var12 = new class126(class118.method904(1440830960, var11));
                var4.field38[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method505(255);
                    int var14 = var5.method505(255);
                    var12.method1004((byte) 73, (long) var13, new class8(var14));
                }
            }
        }
        var5.field1012 = 0;
        var4.field29 = var5.method508(true);
        var4.field33 = new int[var8];
        var4.field40 = new class75[var8];
        int var15 = 0;
        var4.field39 = new int[var8];
        while (var7 > var5.field1012) {
            int var16 = var5.method485((byte) -2);
            if (var16 == 3) {
                var4.field40[var15] = var5.method532(-1);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field39[var15] = var5.method501(0);
            } else {
                var4.field39[var15] = var5.method505(255);
            }
            var4.field33[var15++] = var16;
        }
        class217.field3715.method1509((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IB)Z", line = 132)
    public final boolean method1060(int arg0, byte arg1) {
        field2387++;
        return arg1 == -63 ? this.field2380[arg0] : false;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(II)I", line = 144)
    public final int method1061(int arg0, int arg1) {
        field2375++;
        if (arg1 != -2) {
            this.method1057(86, (byte) 54);
        }
        return this.field2401[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V", line = 156)
    public final void method1062(int arg0, boolean arg1) {
        this.field2374 = arg1;
        this.method1070(9138);
        if (arg0 > 67) {
            field2394++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(BI)Ldl;", line = 169)
    private final class35 method1063(byte arg0, int arg1) {
        field2411++;
        class35 var3 = (class35) this.field2397.method1514(false, (long) arg1);
        if (var3 == null) {
            class35 var4 = new class35(this.field2412[arg1] & 0xFFFF);
            this.field2397.method1509((long) arg1, var4, -1);
            return arg0 == -43 ? var4 : (class35) null;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V", line = 190)
    public final void method1064(int arg0, int arg1) {
        field2391++;
        class140.method1079(this.field2389[arg1] & 0xFF, (byte) -14, this.field2401[arg1] & 0xFF);
        boolean var3 = false;
        class37 var4 = this.method1074((byte) -41, arg1);
        if (var4 != null) {
            var3 = var4.method253(this.field2392, arg0 ^ 0x73CE, this.field2374 || this.field2415[arg1], this);
        }
        if (arg0 != -29618) {
            this.field2389 = (byte[]) null;
        }
        if (!var3) {
            class35 var5 = this.method1063((byte) -43, arg1);
            var5.method234(-65);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 221)
    public static void method1065(int arg0) {
        int var1 = 52 % ((52 - arg0) / 40);
        field2399 = null;
        field2393 = null;
        field2418 = null;
        field2404 = null;
        field2373 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I", line = 238)
    public final int method1066(int arg0, int arg1) {
        if (arg0 == 255) {
            field2390++;
            return this.field2384[arg1] & 0xFF;
        } else {
            return -97;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)I", line = 256)
    public final int method1067(int arg0, int arg1) {
        field2381++;
        if (arg0 <= 117) {
            this.method1062(-28, true);
        }
        return this.field2400[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(II)Z", line = 270)
    public final boolean method1068(int arg0, int arg1) {
        if (arg1 == 0) {
            class37 var3 = this.method1074((byte) -43, arg0);
            field2416++;
            return var3 == null ? false : var3.method245(this, 2, this.field2392);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Z", line = 286)
    public final boolean method1069(int arg0, byte arg1) {
        field2417++;
        if (arg1 != 76) {
            field2386 = -66;
        }
        return this.field2405[arg0];
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 302)
    public final void method1070(int arg0) {
        field2378++;
        if (arg0 != 9138) {
            field2379 = 1.2150517F;
        }
        this.field2388.method1510((byte) 117);
        this.field2397.method1510((byte) 106);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(IB)[I", line = 321)
    public final int[] method1071(int arg0, byte arg1) {
        field2398++;
        class37 var3 = this.method1074((byte) -108, arg0);
        if (var3 == null) {
            return null;
        } else if (arg1 == 103) {
            return var3.method252(128, this, this.field2374 || this.field2415[arg0], this.field2392);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)Z", line = 340)
    public final boolean method1072(int arg0, int arg1) {
        field2385++;
        if (this.field2374 || this.field2415[arg1]) {
            return true;
        } else {
            if (arg0 < 124) {
                method1075((byte) 117);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(II)Z", line = 356)
    public final boolean method1073(int arg0, int arg1) {
        field2402++;
        return arg1 >= -116 ? true : this.field2414[arg0];
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lcb;Lcb;Lcb;IZ)V", line = 560)
    public class139(class267 arg0, class267 arg1, class267 arg2, int arg3, boolean arg4) {
        this.field2374 = arg4;
        this.field2392 = arg2;
        this.field2406 = arg0;
        this.field2396 = arg3;
        this.field2388 = new class203(this.field2396);
        this.field2397 = new class203(this.field2396);
        class60 var6 = new class60(arg1.method1911(0, 0, -106));
        int var7 = var6.method485((byte) -2);
        this.field2412 = new short[var7];
        this.field2380 = new boolean[var7];
        this.field2389 = new byte[var7];
        this.field2415 = new boolean[var7];
        this.field2408 = new boolean[var7];
        this.field2405 = new boolean[var7];
        this.field2400 = new byte[var7];
        this.field2401 = new byte[var7];
        this.field2414 = new boolean[var7];
        this.field2384 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2408[var8] = var6.method501(0) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2408[var9]) {
                this.field2405[var9] = var6.method501(0) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2408[var10]) {
                this.field2380[var10] = var6.method501(0) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2408[var11]) {
                this.field2415[var11] = var6.method501(0) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2408[var12]) {
                this.field2414[var12] = var6.method501(0) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2408[var13]) {
                this.field2400[var13] = var6.method511(-128);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2408[var14]) {
                this.field2384[var14] = var6.method511(-122);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2408[var15]) {
                this.field2389[var15] = var6.method511(-120);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2408[var16]) {
                this.field2401[var16] = var6.method511(-123);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2408[var17]) {
                this.field2412[var17] = (short) var6.method485((byte) -2);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(BI)Ltc;", line = 382)
    private final class37 method1074(byte arg0, int arg1) {
        class37 var3 = (class37) this.field2388.method1514(false, (long) arg1);
        field2383++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2406.method1911(arg1, 0, -43);
        if (var4 == null) {
            return null;
        }
        int var5 = 93 % ((88 - arg0) / 32);
        class60 var6 = new class60(var4);
        class37 var7 = new class37(var6);
        this.field2388.method1509((long) arg1, var7, -1);
        return var7;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 413)
    public static final void method1075(byte arg0) {
        field2403++;
        class115.method881(0);
        System.gc();
        if (arg0 == -26) {
            class52.method380(50, 25);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIBI)V", line = 427)
    public static final void method1076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg2 == arg9 && arg5 == arg6 && arg1 == arg7 && arg0 == arg4) {
            class203.method1513(arg2, arg3, arg5, arg4, 8539, arg7);
        } else {
            int var10 = arg5;
            int var11 = arg2;
            int var12 = arg2 * 3;
            int var13 = arg9 * 3;
            int var14 = arg6 * 3;
            int var15 = arg5 * 3;
            int var16 = arg1 * 3;
            int var17 = arg0 * 3;
            int var18 = arg7 + var13 - var16 - arg2;
            int var19 = var14 + arg4 - arg5 - var17;
            int var20 = var16 + var12 - var13 - var13;
            int var21 = var17 + var15 - var14 - var14;
            int var22 = var13 - var12;
            int var23 = var14 - var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var20 * var25;
                int var27 = var21 * var25;
                int var28 = var22 * var24;
                int var29 = var23 * var24;
                int var30 = var24 * var25 >> 12;
                int var31 = var19 * var30;
                int var32 = var18 * var30;
                int var33 = arg2 + (var26 + var32 + var28 >> 12);
                int var34 = (var27 + var31 + var29 >> 12) + arg5;
                class203.method1513(var11, arg3, var10, var34, 8539, var33);
                var10 = var34;
                var11 = var33;
            }
        }
        if (arg8 != 70) {
            method1059((byte) -58, 110);
        }
        field2410++;
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(II)V", line = 516)
    public final void method1077(int arg0, int arg1) {
        class37 var3 = (class37) this.field2388.method1507(1);
        if (arg0 >= -40) {
            return;
        }
        while (var3 != null) {
            if (var3.field533) {
                var3.method249(0, arg1);
                var3.field533 = false;
            }
            var3 = (class37) this.field2388.method1505(-122);
        }
        field2376++;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(IB)I", line = 551)
    public final int method1078(int arg0, byte arg1) {
        field2395++;
        if (arg1 <= 86) {
            this.method1066(-8, -67);
        }
        return this.field2412[arg0] & 0xFFFF;
    }
}
