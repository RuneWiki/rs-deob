import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class51 extends class219 {

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Lbe;")
    public static class235 field811 = new class235(16);

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field820 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "Lbd;")
    public static class162 field823 = class17.method142(0, "0");

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "Lbd;")
    public static class162 field822 = class17.method142(0, "gelb:");

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Lda;")
    public static class143 field817;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILb;)V", line = 5)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field816++;
        if (arg1 != 0) {
            method368(41, 61, -43, 99, 100, (byte) -110);
        }
        if (arg0 == 0) {
            this.method366(arg1 - 16, arg2.method732(arg1 + -1));
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V", line = 33)
    private final void method366(int arg0, int arg1) {
        if (arg0 == -16) {
            this.field808 = arg1 >> 12 & 0xFF0;
            field819++;
            this.field809 = (arg1 & 0xFF) << 4;
            this.field812 = (arg1 & 0xFF00) >> 4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(ZI)V", line = 64)
    public static final void method367(boolean arg0, int arg1) {
        class58.method401((byte) 62);
        field815++;
        if (class262.field4380 != 30 && class262.field4380 != 25) {
            return;
        }
        if (arg1 >= -34) {
            field817 = (class143) null;
        }
        class179.field3077++;
        if (class179.field3077 < 50 && !arg0) {
            return;
        }
        class179.field3077 = 0;
        if (!class163.field2890 && class116.field2054 != null) {
            class146.field2649++;
            class187.field3229.method338(173, (byte) 8);
            try {
                class116.field2054.method1827(0, 71, class187.field3229.field1681, class187.field3229.field1653);
                class187.field3229.field1653 = 0;
            } catch (IOException var3) {
                class163.field2890 = true;
            }
        }
        class58.method401((byte) 62);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[[I", line = 105)
    public final int[][] method219(int arg0, byte arg1) {
        field810++;
        if (arg1 != 83) {
            field817 = (class143) null;
        }
        int[][] var3 = this.field3651.method406(false, arg0);
        if (this.field3651.field917) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class128.field2326; var7++) {
                var6[var7] = this.field808;
                var4[var7] = this.field812;
                var5[var7] = this.field809;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIB)V", line = 145)
    public static final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field814++;
        int var6 = 59 / ((arg5 - 35) / 54);
        int var7 = 0;
        int var8 = arg0;
        int var9 = arg2 * arg2;
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg0 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - ((var13 - 1) * var12);
        int var16 = var9 << 2;
        int var17 = ((var7 << 1) + 3) * var11;
        int var18 = var10 << 2;
        if (class303.field5106 <= arg3 && class298.field4989 >= arg3) {
            int var19 = class19.method172(class112.field2028, arg1 + arg2, class82.field1426, false);
            int var20 = class19.method172(class112.field2028, arg1 - arg2, class82.field1426, false);
            class3.method14(arg4, var20, var19, class184.field3180[arg3], -127);
        }
        int var21 = (arg0 - 1) * var16;
        int var22 = ((arg0 << 1) - 3) * var12;
        int var23 = (var7 + 1) * var18;
        while (var8 > 0) {
            var8--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var17;
                    var17 += var18;
                    var15 += var23;
                    var7++;
                    var23 += var18;
                }
            }
            if (var15 < 0) {
                var7++;
                var15 += var23;
                var14 += var17;
                var23 += var18;
                var17 += var18;
            }
            int var24 = arg3 - var8;
            var15 += -var22;
            var22 -= var16;
            int var25 = arg3 + var8;
            if (class303.field5106 <= var25 && var24 <= class298.field4989) {
                int var26 = class19.method172(class112.field2028, arg1 + var7, class82.field1426, false);
                int var27 = class19.method172(class112.field2028, arg1 - var7, class82.field1426, false);
                if (var24 >= class303.field5106) {
                    class3.method14(arg4, var27, var26, class184.field3180[var24], -112);
                }
                if (var25 <= class298.field4989) {
                    class3.method14(arg4, var27, var26, class184.field3180[var25], -122);
                }
            }
            var14 += -var21;
            var21 -= var16;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 243)
    public class51() {
        this(0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)V", line = 248)
    public static final void method369(int arg0, long arg1) {
        field813++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg0 != 6110) {
            method370((byte) 99);
        }
        while (class264.field4403 > var3) {
            if (class200.field3405[var3] == arg1) {
                class211.field3553++;
                class264.field4403--;
                for (int var4 = var3; var4 < class264.field4403; var4++) {
                    class290.field4891[var4] = class290.field4891[var4 + 1];
                    class214.field3586[var4] = class214.field3586[var4 + 1];
                    class35.field591[var4] = class35.field591[var4 + 1];
                    class200.field3405[var4] = class200.field3405[var4 + 1];
                    class260.field4337[var4] = class260.field4337[var4 + 1];
                    class199.field3390[var4] = class199.field3390[var4 + 1];
                }
                class149.field2681 = class284.field4808;
                class187.field3229.method338(49, (byte) 8);
                class187.field3229.method745(arg1, (byte) -124);
                break;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V", line = 308)
    public static void method370(byte arg0) {
        if (arg0 >= -77) {
            method368(-86, -22, 8, -75, 41, (byte) 35);
        }
        field822 = null;
        field817 = null;
        field811 = null;
        field823 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 321)
    private class51(int arg0) {
        super(0, false);
        this.method366(-16, arg0);
    }
}
