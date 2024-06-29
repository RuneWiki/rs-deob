import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class521 {

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Lnga;")
    private class510 field7386 = new class510(16);

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Leq;")
    private class209 field7385;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Lcv;")
    public static class565 field7381 = new class565();

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Lqe;")
    public static class465 field7388 = new class465(82, 6);

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public final void method3087(int arg0) {
        int var2 = 0 % (-arg0 / 37);
        field7387++;
        class510 var3 = this.field7386;
        synchronized (this.field7386) {
            this.field7386.method3050(false);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
    public final void method3088(int arg0, int arg1) {
        field7382++;
        class510 var3 = this.field7386;
        synchronized (this.field7386) {
            this.field7386.method3049(arg0, (byte) 127);
        }
        if (arg1 != 126) {
            field7391 = -13;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static void method3089(byte arg0) {
        field7388 = null;
        if (arg0 != -14) {
            field7391 = -46;
        }
        field7381 = null;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Lhg;")
    public final class688 method3090(int arg0, int arg1) {
        field7383++;
        class510 var3 = this.field7386;
        class688 var4;
        synchronized (this.field7386) {
            var4 = (class688) this.field7386.method3054((byte) -123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field7385;
        byte[] var6;
        synchronized (this.field7385) {
            var6 = this.field7385.method1453(arg1, 32, 30);
        }
        class688 var7 = new class688();
        if (var6 != null) {
            var7.method3867(new class35(var6), -63);
        }
        class510 var8 = this.field7386;
        synchronized (this.field7386) {
            if (arg0 != 350) {
                this.method3091(40);
            }
            this.field7386.method3047(false, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    public final void method3091(int arg0) {
        if (arg0 < 31) {
            return;
        }
        field7384++;
        class510 var2 = this.field7386;
        synchronized (this.field7386) {
            this.field7386.method3048(false);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([ILfca;II)V")
    public static final void method3092(int[] arg0, class84 arg1, int arg2, int arg3) {
        field7389++;
        if (arg1.field885 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field885.length; var5++) {
                if (arg1.field885[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field944 != -1) {
                class718 var6 = class698.field9806.method851(arg1.field944, -2);
                int var7 = var6.field10061;
                if (var7 == 1) {
                    arg1.field904 = 0;
                    arg1.field950 = 0;
                    arg1.field914 = 1;
                    arg1.field911 = arg3;
                    arg1.field943 = 0;
                    if (!arg1.field892) {
                        class749.method4165(arg1.field950, (byte) 70, var6, arg1);
                    }
                }
                if (var7 == 2) {
                    arg1.field943 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg2 != 8298) {
            field7381 = null;
        }
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg1.field885 == null || arg1.field885[var9] == -1 || class698.field9806.method851(arg0[var9], arg2 ^ 0xFFFFDF94).field10064 >= class698.field9806.method851(arg1.field885[var9], arg2 ^ 0xFFFFDF94).field10064) {
                arg1.field885 = arg0;
                arg1.field911 = arg3;
                arg1.field988 = arg1.field992;
            }
        }
        if (var8) {
            arg1.field988 = arg1.field992;
            arg1.field911 = arg3;
            arg1.field885 = arg0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILha;)V")
    public static final void method3093(int arg0, class58 arg1) {
        field7390++;
        int var2 = 0;
        int var3 = 0;
        if (class200.field2876) {
            var2 = class228.method1570((byte) 73);
            var3 = class252.method1712((byte) 37);
        }
        arg1.method584(var2, var3, class206.field2956 + var2, var3 + 350);
        arg1.method630(var2, var3, class206.field2956, 350, class647.field9160 << 24 | 0x332277, 1);
        class6.method33(true, var3 + 350, var3, var2, class206.field2956 + var2);
        int var4 = 350 / class308.field4359;
        if (class405.field5649 > 0) {
            int var5 = 342 - class308.field4359;
            int var6 = var4 * var5 / (class405.field5649 + var4 - 1);
            int var7 = 4;
            if (class405.field5649 > 1) {
                var7 += (var5 - var6) * (class405.field5649 - class58.field1077 - 1) / (class405.field5649 - 1);
            }
            arg1.method630(class206.field2956 + var2 - 16, var3 + var7, 12, var6, class647.field9160 << 24 | 0x332277, 2);
            for (int var8 = class58.field1077; var8 < class58.field1077 + var4 && var8 < class405.field5649; var8++) {
                String[] var9 = class327.method2091('\b', 26911, class748.field10459[var8]);
                int var10 = (class206.field2956 - 24) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = var10 * var11 + 8;
                    arg1.method584(var2 + var12, var3, var2 + var12 + var10 - 8, var3 - -350);
                    class722.field10090.method665(var3 + 350 - ((-class58.field1077 + var8) * class308.field4359) - class436.field6100.field4586 - class160.field2390 - 2, class115.method944(110, var9[var11]), -16777216, var2 + var12, -16777216, -1);
                }
            }
        }
        class242.field3393.method662(var2 + class206.field2956 - 25, -16777216, -1, "Build: 629", var3 + 330, (byte) 94);
        if (arg0 != 10) {
            method3093(83, null);
        }
        arg1.method584(var2, var3, class206.field2956 + var2, var3 + 350);
        arg1.method525(var3 + 350 - class160.field2390, class206.field2956, -1, -3482, var2);
        class537.field7568.method665(var3 + 350 - class419.field5896.field4586 - 1, "--> " + class115.method944(arg0 + 107, class718.field10065), -16777216, var2 + 10, -16777216, -1);
        if (!class33.field439) {
            return;
        }
        int var13 = -1;
        if ((class605.field8787 % 30) > 15) {
            var13 = 16777215;
        }
        arg1.method569(false, var2 + class419.field5896.method2075(false, "--> " + class115.method944(arg0 + 95, class718.field10065).substring(0, class129.field1942)) + 10, var13, var3 + 350 - class419.field5896.field4586 - 11, 12);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class521(class179 arg0, int arg1, class209 arg2) {
        this.field7385 = arg2;
        this.field7385.method1477(0, 30);
    }
}
