import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class173 implements class109 {

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lba;")
    private class240 field2512 = new class240(256);

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lb;")
    private class201 field2515;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "Lb;")
    private class201 field2518;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "[Ljc;")
    private class279[] field2513;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Lr;")
    public static class110 field2507 = class305.method1891(1);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)Lpg;")
    private final class475 method1065(int arg0, int arg1) {
        field2508++;
        class272 var3 = this.field2512.method1524(false, (long) arg1);
        if (var3 != null) {
            return (class475) var3;
        }
        byte[] var4 = this.field2515.method1228(arg1, arg0 ^ 0xFFFFFDEE);
        if (var4 == null) {
            return null;
        }
        if (arg0 != -610) {
            method1067(-30, 42, false);
        }
        class475 var5 = new class475(new class276(var4));
        this.field2512.method1522((long) arg1, false, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBC)I")
    public static final int method1066(int arg0, byte arg1, char arg2) {
        field2517++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg1 == -91) {
            if (arg2 == 'ñ' && arg0 == 0) {
                var3 = 1762;
            }
            return var3;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZ)V")
    public static final void method1067(int arg0, int arg1, boolean arg2) {
        field2509++;
        if (arg2) {
            field2507 = null;
        }
        class489 var3 = class116.method731(-625541408, 12, arg0);
        var3.method2863(255);
        var3.field6895 = arg1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        if (arg0 != 1) {
            method1067(-111, 74, false);
        }
        field2507 = null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Ljc;")
    public final class279 method703(int arg0, int arg1) {
        if (arg0 != 12095) {
            field2507 = null;
        }
        field2506++;
        return this.field2513[arg1];
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIFZI)[F")
    public final float[] method706(int arg0, byte arg1, int arg2, float arg3, boolean arg4, int arg5) {
        if (arg1 <= 14) {
            this.method704(true, 0.5366691F, -111, true, -107, 8);
        }
        field2516++;
        return this.method1065(-610, arg0).method2786(arg5, this.field2518, this, arg2, 0, this.field2513[arg0].field4108);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZFIZII)[I")
    public final int[] method704(boolean arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            this.method703(-109, 87);
        }
        field2514++;
        return this.method1065(-610, arg4).method2783(arg2, arg5, this.field2518, -19146, this, (double) arg1, this.field2513[arg4].field4108);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Z")
    public final boolean method702(int arg0, int arg1) {
        field2510++;
        class475 var3 = this.method1065(-610, arg0);
        if (arg1 <= 35) {
            this.method1065(-124, -84);
        }
        return var3 != null && var3.method2784(false, this.field2518, this);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IFZIII)[I")
    public final int[] method705(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 == -30470) {
            field2511++;
            return this.method1065(arg5 ^ 0x7564, arg4).method2782(this.field2513[arg4].field4108, arg3, this.field2518, arg0, this, -5513, arg2, (double) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lb;Lb;Lb;)V")
    public class173(class201 arg0, class201 arg1, class201 arg2) {
        this.field2515 = arg1;
        this.field2518 = arg2;
        class276 var4 = new class276(arg0.method1257(0, 0, 24558));
        int var5 = var4.method1729(65280);
        this.field2513 = new class279[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1701(-23121) == 1) {
                this.field2513[var6] = new class279();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2513[var7] != null) {
                this.field2513[var7].field4113 = var4.method1701(-23121) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2513[var8] != null) {
                this.field2513[var8].field4097 = var4.method1701(-23121) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2513[var9] != null) {
                this.field2513[var9].field4114 = var4.method1701(-23121) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2513[var10] != null) {
                this.field2513[var10].field4119 = var4.method1701(-23121) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2513[var11] != null) {
                this.field2513[var11].field4110 = var4.method1715((byte) -78);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2513[var12] != null) {
                this.field2513[var12].field4122 = var4.method1715((byte) 126);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2513[var13] != null) {
                this.field2513[var13].field4105 = var4.method1715((byte) -80);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2513[var14] != null) {
                this.field2513[var14].field4116 = var4.method1715((byte) 42);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2513[var15] != null) {
                this.field2513[var15].field4111 = (short) var4.method1729(65280);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2513[var16] != null) {
                this.field2513[var16].field4106 = var4.method1715((byte) 48);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2513[var17] != null) {
                this.field2513[var17].field4104 = var4.method1715((byte) 54);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2513[var18] != null) {
                this.field2513[var18].field4120 = var4.method1701(-23121) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2513[var19] != null) {
                this.field2513[var19].field4108 = var4.method1701(-23121) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2513[var20] != null) {
                this.field2513[var20].field4096 = var4.method1715((byte) -91);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2513[var21] != null) {
                this.field2513[var21].field4112 = var4.method1701(-23121) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2513[var22] != null) {
                this.field2513[var22].field4098 = var4.method1701(-23121) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2513[var23] != null) {
                this.field2513[var23].field4102 = var4.method1701(-23121) == 1;
            }
        }
    }
}
