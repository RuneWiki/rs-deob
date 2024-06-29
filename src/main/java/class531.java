import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class531 implements class277 {

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Lkr;")
    private class524 field7815 = new class524(256);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "Lmg;")
    private class101 field7812;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Lmg;")
    private class101 field7818;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "[Lkf;")
    private class166[] field7823;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Lri;")
    public static class74 field7816 = new class74(1, 4);

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "I")
    public static int field7825 = -1;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "Z")
    public static boolean field7826 = false;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Ll;")
    public static class16 field7824;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(FIIZII)[F")
    public final float[] method1653(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = 69 % ((-arg2 - 33) / 42);
        field7814++;
        return this.method3139(-79, arg4).method2898((byte) 84, this, this.field7818, this.field7823[arg4].field2482, arg5, arg1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method3138(int arg0) {
        if (arg0 == 1559) {
            field7816 = null;
            field7824 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBIZFI)[I")
    public final int[] method1651(int arg0, byte arg1, int arg2, boolean arg3, float arg4, int arg5) {
        if (arg1 != -87) {
            field7825 = 56;
        }
        field7817++;
        return this.method3139(arg1 ^ 0x9, arg2).method2897(arg5, this.field7818, (double) arg4, arg0, this.field7823[arg2].field2482, -1, this);
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)Lkf;")
    public final class166 method1654(int arg0, int arg1) {
        if (arg0 < 8) {
            method3140(123, 39, -122);
        }
        field7820++;
        return this.field7823[arg1];
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(II)Ldd;")
    private final class495 method3139(int arg0, int arg1) {
        field7813++;
        class6 var3 = this.field7815.method3117((long) arg1, 50);
        if (var3 != null) {
            return (class495) var3;
        }
        byte[] var4 = this.field7812.method742(arg1, 1);
        if (var4 == null) {
            return null;
        }
        if (arg0 > -75) {
            field7826 = true;
        }
        class495 var5 = new class495(new class391(var4));
        this.field7815.method3113(var5, (byte) -47, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIZFZI)[I")
    public final int[] method1650(int arg0, int arg1, boolean arg2, float arg3, boolean arg4, int arg5) {
        if (!arg2) {
            field7826 = true;
        }
        field7819++;
        return this.method3139(-95, arg1).method2895(this, arg4, arg2, arg5, (double) arg3, arg0, this.field7818, this.field7823[arg1].field2482);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
    public static final void method3140(int arg0, int arg1, int arg2) {
        field7821++;
        if ((class350.field5112 < class350.field5117)) {
            class350.field5112 = (float) ((double) class350.field5112 / 30.0D + (double) class350.field5112);
            if (class350.field5112 > class350.field5117) {
                class350.field5112 = class350.field5117;
            }
            class279.method1660(false);
            class350.field5113 = (int) class350.field5112 >> 1;
            class350.field5118 = class323.method1871(8132, class350.field5113);
        } else if (class350.field5117 < class350.field5112) {
            class350.field5112 = (float) ((double) class350.field5112 - (double) class350.field5112 / 30.0D);
            if (class350.field5117 > class350.field5112) {
                class350.field5112 = class350.field5117;
            }
            class279.method1660(false);
            class350.field5113 = (int) class350.field5112 >> 1;
            class350.field5118 = class323.method1871(8132, class350.field5113);
        }
        if (class495.field7230 != -1 && class295.field4056 != -1) {
            int var3 = class495.field7230 - class299.field4107;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class295.field4056 - class80.field1216;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class299.field4107 += var3;
            if (var3 == 0 && var4 == 0) {
                class495.field7230 = -1;
                class295.field4056 = -1;
            }
            class80.field1216 += var4;
            class279.method1660(false);
        }
        if (class222.field3167 > 0) {
            class193.field2756--;
            if (class193.field2756 == 0) {
                class193.field2756 = 100;
                class222.field3167--;
            }
        } else {
            class346.field4955 = -1;
            class294.field4050 = -1;
        }
        if (class494.field7219 && class212.field2958 != null) {
            for (class454 var5 = (class454) class212.field2958.method2818((byte) 118); var5 != null; var5 = (class454) class212.field2958.method2820((byte) -58)) {
                class146 var6 = class350.field5106.method141(var5.field6674.field1639, false);
                if (var5.method2672((byte) 87, arg2, arg0)) {
                    if (var6.field2072 != null) {
                        if (var6.field2072[4] != null) {
                            class407.method2438(1001, -1, true, (long) var5.field6674.field1639, var6.field2072[4], var6.field2070, var6.field2097, -1, 500, false, 0);
                        }
                        if (var6.field2072[3] != null) {
                            class407.method2438(1009, -1, true, (long) var5.field6674.field1639, var6.field2072[3], var6.field2070, var6.field2097, -1, 500, false, 0);
                        }
                        if (var6.field2072[2] != null) {
                            class407.method2438(1004, -1, true, (long) var5.field6674.field1639, var6.field2072[2], var6.field2070, var6.field2097, -1, 500, false, 0);
                        }
                        if (var6.field2072[1] != null) {
                            class407.method2438(1008, -1, true, (long) var5.field6674.field1639, var6.field2072[1], var6.field2070, var6.field2097, -1, 500, false, 0);
                        }
                        if (var6.field2072[0] != null) {
                            class407.method2438(1010, -1, true, (long) var5.field6674.field1639, var6.field2072[0], var6.field2070, var6.field2097, -1, 500, false, 0);
                        }
                    }
                    if (!var5.field6674.field1640) {
                        var5.field6674.field1640 = true;
                        class429.method2540(class335.field4520, var5.field6674.field1639, var6.field2070);
                    }
                    if (var5.field6674.field1640) {
                        class429.method2540(class50.field607, var5.field6674.field1639, var6.field2070);
                    }
                } else if (var5.field6674.field1640) {
                    var5.field6674.field1640 = false;
                    class429.method2540(class401.field5883, var5.field6674.field1639, var6.field2070);
                }
            }
        }
        if (arg1 > -63) {
            method3138(-31);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Z")
    public final boolean method1652(int arg0, int arg1) {
        if (arg1 != 29423) {
            field7816 = null;
        }
        field7822++;
        class495 var3 = this.method3139(-105, arg0);
        return var3 != null && var3.method2899(this, (byte) 7, this.field7818);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lmg;Lmg;Lmg;)V")
    public class531(class101 arg0, class101 arg1, class101 arg2) {
        this.field7812 = arg1;
        this.field7818 = arg2;
        class391 var4 = new class391(arg0.method727(0, 0, 39));
        int var5 = var4.method2353((byte) 103);
        this.field7823 = new class166[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2348(-2) == 1) {
                this.field7823[var6] = new class166();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field7823[var7] != null) {
                this.field7823[var7].field2501 = var4.method2348(-2) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field7823[var8] != null) {
                this.field7823[var8].field2494 = var4.method2348(-2) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field7823[var9] != null) {
                this.field7823[var9].field2480 = var4.method2348(-2) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field7823[var10] != null) {
                this.field7823[var10].field2493 = var4.method2348(-2) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field7823[var11] != null) {
                this.field7823[var11].field2499 = var4.method2337(-1);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field7823[var12] != null) {
                this.field7823[var12].field2486 = var4.method2337(-1);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field7823[var13] != null) {
                this.field7823[var13].field2492 = var4.method2337(-1);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field7823[var14] != null) {
                this.field7823[var14].field2490 = var4.method2337(-1);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field7823[var15] != null) {
                this.field7823[var15].field2484 = (short) var4.method2353((byte) 80);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field7823[var16] != null) {
                this.field7823[var16].field2488 = var4.method2337(-1);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field7823[var17] != null) {
                this.field7823[var17].field2495 = var4.method2337(-1);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field7823[var18] != null) {
                this.field7823[var18].field2498 = var4.method2348(-2) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field7823[var19] != null) {
                this.field7823[var19].field2482 = var4.method2348(-2) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field7823[var20] != null) {
                this.field7823[var20].field2496 = var4.method2337(-1);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field7823[var21] != null) {
                this.field7823[var21].field2503 = var4.method2348(-2) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field7823[var22] != null) {
                this.field7823[var22].field2497 = var4.method2348(-2) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field7823[var23] != null) {
                this.field7823[var23].field2489 = var4.method2348(-2) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field7823[var24] != null) {
                this.field7823[var24].field2500 = var4.method2348(-2);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field7823[var25] != null) {
                this.field7823[var25].field2491 = var4.method2361((byte) -56);
            }
        }
    }
}
