import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class150 implements class200 {

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "Lgh;")
    private class457 field2532;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "[Lgs;")
    private class389[] field2530;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "Leda;")
    public static class116 field2531 = new class116(97, 14);

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "Lau;")
    public static class692 field2533 = new class692();

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Lr;")
    private class98 field2521;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
    private boolean field2520;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZ)V")
    public final void method1138(byte arg0, boolean arg1) {
        boolean var3 = true;
        field2522++;
        class389[] var4 = this.field2530;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class389 var7 = var4[var5];
            if (var7 != null) {
                var7.method344(false, var3 || this.field2520);
            }
        }
        this.field2520 = false;
        int var6 = -57 / ((84 - arg0) / 34);
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
    public final void method1139(int arg0) {
        field2529++;
        int var2 = -1 / ((-arg0 - 82) / 43);
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V")
    public static void method1140(int arg0) {
        field2531 = null;
        field2533 = null;
        if (arg0 != 31314) {
            field2533 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
    public final void method1141(byte arg0) {
        if (class637.field9048 != this.field2521) {
            this.field2520 = true;
            this.field2521 = class637.field9048;
        }
        field2524++;
        this.field2521.method118(0);
        if (arg0 <= 18) {
            return;
        }
        class389[] var2 = this.field2530;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class389 var4 = var2[var3];
            if (var4 != null) {
                var4.method343(-79);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BB)V")
    public static final void method1142(byte arg0, byte arg1) {
        if (class468.field6756 == null) {
            class468.field6756 = new byte[4][class430.field6136][class580.field8504];
        }
        if (arg1 != 7) {
            field2534 = 27;
        }
        field2527++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class430.field6136; var3++) {
                for (int var4 = 0; var4 < class580.field8504; var4++) {
                    class468.field6756[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
    public final int method1143(int arg0) {
        field2528++;
        int var2 = 0;
        if (arg0 != -12150) {
            this.method1146(38L, (byte) -110);
        }
        class389[] var3 = this.field2530;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class389 var5 = var3[var4];
            if (var5 == null || var5.method348(arg0 + 33528)) {
                var2++;
            }
        }
        return var2 * 100 / this.field2530.length;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLvj;Lfo;)V")
    public static final void method1144(int arg0, byte arg1, class204 arg2, class606 arg3) {
        if (arg1 <= 14) {
            return;
        }
        field2526++;
        if (class222.field3314 >= 50 || arg3 == null || arg3.field8723 == null || arg0 >= arg3.field8723.length || arg3.field8723[arg0] == null) {
            return;
        }
        int var4 = arg3.field8723[arg0][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xEF) >> 5;
        int var7 = var4 & 0x1F;
        if (arg3.field8723[arg0].length > 1) {
            int var8 = (int) (Math.random() * (double) arg3.field8723[arg0].length);
            if (var8 > 0) {
                var5 = arg3.field8723[arg0][var8];
            }
        }
        int var9 = 256;
        if (arg3.field8700 != null && arg3.field8709 != null) {
            var9 = (int) ((double) (arg3.field8709[arg0] - arg3.field8700[arg0]) * Math.random()) + arg3.field8700[arg0];
        }
        int var10 = arg3.field8705 == null ? 255 : arg3.field8705[arg0];
        if (var7 == 0) {
            if (class103.field1708 == arg2) {
                if (arg3.field8715) {
                    class522.method3076((byte) -84, false, var10, 0, var9, var6, var5);
                    return;
                }
                class542.method3190(var9, var10, 0, true, var6, var5);
            }
        } else if (class525.field7713.field5995 != 0) {
            int var11 = arg2.field3155 - 256 >> 9;
            int var12 = arg2.field3154 - 256 >> 9;
            int var13 = class103.field1708 == arg2 ? 0 : (arg2.field3158 << 24) + (var11 << 16) + (var12 << 8) + var7;
            class428.field6114[class222.field3314++] = new class105((byte) (arg3.field8715 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)I")
    public final int method1145(boolean arg0) {
        if (!arg0) {
            field2533 = null;
        }
        field2519++;
        return this.field2532.field6570;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(JB)Z")
    public final boolean method1146(long arg0, byte arg1) {
        if (arg1 > -41) {
            this.method1146(48L, (byte) 4);
        }
        field2525++;
        return class254.method1619(true) >= ((long) this.field2532.field6565 + arg0);
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
    public static final void method1147(int arg0) {
        class415.field5896 = arg0;
        for (int var1 = 0; var1 < class33.field474; var1++) {
            for (int var2 = 0; var2 < class687.field9758; var2++) {
                if (class541.field7946[arg0][var1][var2] == null) {
                    class541.field7946[arg0][var1][var2] = new class293(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IF)F")
    public static final float method1148(int arg0, float arg1) {
        if (arg0 != 0) {
            method1140(89);
        }
        field2523++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lgh;Lsf;)V")
    public class150(class457 arg0, class399 arg1) {
        this.field2532 = arg0;
        this.field2530 = new class389[this.field2532.field6568.length];
        for (int var3 = 0; var3 < this.field2530.length; var3++) {
            this.field2530[var3] = arg1.method2425(this.field2532.field6568[var3], (byte) -98);
        }
    }
}
