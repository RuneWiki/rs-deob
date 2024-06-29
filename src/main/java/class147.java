import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class147 extends class107 {

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    private int field2622 = 4096;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "Z")
    private boolean field2621 = true;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "[Lea;")
    public static class37[] field2618 = new class37[50];

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "Lpj;")
    public static class237 field2616 = class33.method353("Zugewiesener Speicher)3", 20);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
    public static int[] field2619 = new int[50];

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Lpj;")
    public static class237 field2620 = class33.method353("(R", 37);

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lfa;")
    public static class239 field2615;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int[][] var3 = super.field1903.method634(arg1, 13012);
        ++field2624;
        int var4 = 42 / ((26 - arg0) / 45);
        if (super.field1903.field1551) {
            int[] var5 = this.method797(0, class254.field4363 & arg1 + -1, (byte) 116);
            int[] var6 = this.method797(0, arg1, (byte) 120);
            int[] var7 = this.method797(0, arg1 + 1 & class254.field4363, (byte) -89);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class106.field1862; ++var11) {
                int var12 = (var6[class110.field1937 & var11 + 1] - var6[class110.field1937 & var11 + -1]) * this.field2622;
                int var13 = (var7[var11] + -var5[var11]) * this.field2622;
                int var14 = var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = var14 * var14 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var17) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var21 = 0;
                }
                if (this.field2621) {
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var20;
                var9[var11] = var21;
                var10[var11] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method998(byte arg0) {
        if (arg0 <= 48) {
            method998((byte) 64);
        }
        field2619 = null;
        field2616 = null;
        field2618 = null;
        field2620 = null;
        field2615 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field2623;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2621 = ~arg0.method316((byte) 109) == -2;
            }
        } else {
            this.field2622 = arg0.method339(-16777216);
        }
        if (arg2 != -32513) {
            this.field2622 = 35;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZB)V")
    public static final void method999(boolean arg0, byte arg1) {
        if (arg1 != -88) {
            field2618 = null;
        }
        for (int var2 = 0; class89.field1636 > var2; ++var2) {
            class210 var3 = class232.field4022[class263.field4498[var2]];
            long var4 = (long) class263.field4498[var2] << 32 | 536870912L;
            if (var3 != null && var3.method1403((byte) 63) && !var3.field3586.field3945 == !arg0 && var3.field3586.method1538((byte) -122)) {
                int var6 = var3.field3710 >> 7;
                int var7 = var3.field3700 >> 7;
                if (~var6 <= -1 && var6 < 104 && ~var7 <= -1 && ~var7 > -105) {
                    if (var3.method1441((byte) 94) == 1 && ~(127 & var3.field3710) == -65 && (127 & var3.field3700) == 64) {
                        if (~class241.field4232[var6][var7] == ~class152.field2698) {
                            continue;
                        }
                        class241.field4232[var6][var7] = class152.field2698;
                    }
                    if (!var3.field3586.field3974) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field3695 = class23.method216(-85, var3.field3700, var3.field3710, class274.field4798);
                    class185.method1269(class274.field4798, var3.field3710, var3.field3700, var3.field3695, 64 * var3.method1441((byte) 126) + -64 + 60, var3, var3.field3697, var4, var3.field3675);
                }
            }
        }
        ++field2617;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lqe;III)V")
    public static final void method1000(class95 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class224.field3852) {
            class35 var4 = class274.field4775[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field753 != null && var4.field753.field4012.method704()) {
                arg0.method708(var4.field753.field4012, 128, 0, 0, true);
            }
        }
        if (arg3 < class224.field3852) {
            class35 var5 = class274.field4775[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field753 != null && var5.field753.field4012.method704()) {
                arg0.method708(var5.field753.field4012, 0, 0, 128, true);
            }
        }
        if (arg2 < class224.field3852 && arg3 < class182.field3211) {
            class35 var6 = class274.field4775[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field753 != null && var6.field753.field4012.method704()) {
                arg0.method708(var6.field753.field4012, 128, 0, 128, true);
            }
        }
        if (arg2 < class224.field3852 && arg3 > 0) {
            class35 var7 = class274.field4775[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field753 != null && var7.field753.field4012.method704()) {
                arg0.method708(var7.field753.field4012, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILpj;)V")
    public static final void method1001(int arg0, class237 arg1) {
        ++field2626;
        int var2 = class39.method401(arg1, 13431);
        if (arg0 == 25288) {
            if (~var2 != 0) {
                class180.field3167 = class77.field1449.field1007[var2] - class202.field3466;
                int var3 = -((int) ((float) class59.field1210.field2575 / class169.field2966)) + class180.field3167;
                int var4 = (int) ((float) class59.field1210.field2575 / class169.field2966) + class180.field3167;
                class51.field1085 = class17.field296 + class115.field2017 + -class77.field1449.field987[var2] + -1;
                if (~var3 > -1) {
                    class180.field3167 = (int) ((float) class59.field1210.field2575 / class169.field2966);
                }
                int var5 = class51.field1085 - (int) ((float) class59.field1210.field2490 / class169.field2966);
                int var6 = class51.field1085 - -((int) ((float) class59.field1210.field2490 / class169.field2966));
                if (~var4 < ~class148.field2629) {
                    class180.field3167 = -((int) ((float) class59.field1210.field2575 / class169.field2966)) + class148.field2629;
                }
                if (var5 < 0) {
                    class51.field1085 = (int) ((float) class59.field1210.field2490 / class169.field2966);
                }
                if (class115.field2017 < var6) {
                    class51.field1085 = -((int) ((float) class59.field1210.field2490 / class169.field2966)) + class115.field2017;
                }
            }
        }
    }
}
