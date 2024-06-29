import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class110 extends class71 {

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Z")
    private boolean field2027 = true;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Z")
    private boolean field2030 = true;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Lud;")
    private static class279 field2021 = class130.method1024("glow3:", 255);

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Lud;")
    public static class279 field2026 = field2021;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lud;")
    public static class279 field2033 = field2021;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "Lbd;")
    public static class305 field2022;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZLvh;)V", line = 8)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field2029++;
        if (arg0 == 0) {
            this.field2027 = arg2.method483(-109) == 1;
        } else if (arg0 == 1) {
            this.field2030 = arg2.method483(-117) == 1;
        } else if (arg0 == 2) {
            this.field1389 = arg2.method483(-116) == 1;
        }
        if (!arg1) {
            field2021 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V", line = 53)
    public static void method903(int arg0) {
        field2021 = null;
        field2026 = null;
        if (arg0 == 0) {
            field2033 = null;
            field2022 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIIII)I", line = 69)
    public static final int method904(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -54) {
            return 81;
        }
        field2028++;
        if (class312.field5521) {
            arg4 = 1000000;
            class312.field5521 = false;
        }
        class144 var5 = class309.field5482[arg1][arg3];
        int var6 = var5.field2620;
        float var7 = ((float) arg2 * 0.1F + 0.7F) * var5.field2616;
        float var8 = var5.field2602;
        float var9 = var5.field2607;
        int var10 = var5.field2618;
        int var11 = var5.field2614;
        if (!class68.field1335) {
            var11 = 0;
        }
        if (class210.field3700 != var6 || class21.field587 != var7 || class138.field2489 != var8 || class72.field1417 != var9 || class317.field5572 != var10 || class275.field4882 != var11) {
            class210.field3700 = var6;
            class138.field2489 = var8;
            class282.field5035 = class12.field399;
            class317.field5572 = var10;
            class54.field1191 = 0;
            class279.field4931 = class293.field5226;
            class80.field1536 = class200.field3572;
            class275.field4882 = var11;
            class72.field1417 = var9;
            class21.field587 = var7;
            class278.field4918 = class218.field3865;
            class134.field2453 = class130.field2383;
            class244.field4338 = class236.field4109;
        }
        if (class54.field1191 < 65536) {
            class54.field1191 += arg4 * 250;
            if (class54.field1191 >= 65536) {
                class54.field1191 = 65536;
            }
            int var12 = 65536 - class54.field1191 >> 8;
            int var13 = class54.field1191 >> 8;
            class293.field5226 = class279.field4931 * var12 + (class275.field4882 * var13) >> 8;
            class130.field2383 = ((class134.field2453 & 0xFF00FF) * var12 + ((class317.field5572 & 0xFF00FF) * var13) & 0xFF00FF00) + ((class317.field5572 & 0xFF00) * var13 + (class134.field2453 & 0xFF00) * var12 & 0xFF0000) >> 8;
            float var14 = (float) class54.field1191 / 65536.0F;
            class200.field3572 = ((class80.field1536 & 0xFF00FF) * var12 + (class210.field3700 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class80.field1536 & 0xFF00) * var12 + (class210.field3700 & 0xFF00) * var13 & 0xFF0000) >> 8;
            float var15 = (float) (65536 - class54.field1191) / 65536.0F;
            class12.field399 = class72.field1417 * var14 + class282.field5035 * var15;
            class236.field4109 = class244.field4338 * var15 + class21.field587 * var14;
            class218.field3865 = class278.field4918 * var15 + class138.field2489 * var14;
        }
        class219.method1610(class200.field3572, class236.field4109, class218.field3865, class12.field399);
        class219.method1601(class130.field2383, class293.field5226);
        class219.method1600((float) class268.field4809, (float) class245.field4350, (float) class192.field3471);
        class219.method1609();
        return class130.field2383;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([JB[Ljava/lang/Object;)V", line = 150)
    public static final void method905(long[] arg0, byte arg1, Object[] arg2) {
        field2023++;
        class58.method525(123, arg2, arg0, 0, arg0.length - 1);
        if (arg1 > -77) {
            field2022 = (class305) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 179)
    public class110() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)I", line = 197)
    public static final int method906(byte arg0, int arg1) {
        field2031++;
        if (arg0 != 36) {
            field2026 = (class279) null;
        }
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = (arg1 * var2 >> 12) + 40960;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I", line = 215)
    public final int[][] method86(int arg0, int arg1) {
        field2025++;
        int var3 = 12 / ((arg1 + 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) -87, arg0);
        if (this.field1400.field4363) {
            int[][] var5 = this.method619(0, 2, this.field2030 ? class262.field4688 - arg0 : arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            if (this.field2027) {
                for (int var12 = 0; var12 < class215.field3787; var12++) {
                    var9[var12] = var7[class309.field5478 - var12];
                    var11[var12] = var6[class309.field5478 - var12];
                    var10[var12] = var8[class309.field5478 - var12];
                }
            } else {
                for (int var13 = 0; var13 < class215.field3787; var13++) {
                    var9[var13] = var7[var13];
                    var11[var13] = var6[var13];
                    var10[var13] = var8[var13];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)[I", line = 283)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            this.method86(104, -110);
        }
        field2024++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(this.field2030 ? class262.field4688 - arg0 : arg0, -3, 0);
            if (this.field2027) {
                for (int var5 = 0; var5 < class215.field3787; var5++) {
                    var3[var5] = var4[class309.field5478 - var5];
                }
            } else {
                class25.method223(var4, 0, var3, 0, class215.field3787);
            }
        }
        return var3;
    }
}
