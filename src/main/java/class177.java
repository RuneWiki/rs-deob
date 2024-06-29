import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class177 extends class601 {

    @OriginalMember(owner = "client!wda", name = "K", descriptor = "Ljf;")
    public static class667 field2325 = new class667();

    @OriginalMember(owner = "client!wda", name = "O", descriptor = "Lega;")
    public static class473 field2329 = new class473("game4", 3);

    @OriginalMember(owner = "client!wda", name = "F", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!wda", name = "I", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!wda", name = "L", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!wda", name = "N", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!wda", name = "M", descriptor = "[Llq;")
    public static class210[] field2327;

    @OriginalMember(owner = "client!wda", name = "J", descriptor = "[Lpu;")
    public static class772[] field2324;

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)V")
    public static final void method1136(int arg0) {
        if (arg0 == -585072574) {
            ++field2322;
            class702.field9291.method946((0.7F + (float) class485.field6252.field6929.method1802(false) * 0.1F) * class477.field6185);
            class702.field9291.method997(class656.field8456, class495.field6329, class568.field7184, (float) (class404.field5368 << 2), (float) (class663.field8658 << 2), (float) (class392.field5178 << 2));
            class702.field9291.method910(class259.field3483);
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field2321;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 > -76) {
            this.method638(-31, 12);
        }
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0, 27123, 0);
            for (int var5 = 0; ~class418.field5518 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "(I)V")
    public static void method1137(int arg0) {
        if (arg0 != -585072574) {
            method1136(-52);
        }
        field2329 = null;
        field2325 = null;
        field2324 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lqf;I)I")
    public static final int method1138(class403 arg0, int arg1) {
        if (arg1 != 385838050) {
            method1138((class403) null, -125);
        }
        ++field2326;
        String var2 = class229.method1473((byte) 95, arg0);
        return class66.field868.method1054(var2, true, class269.field3556);
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)[[I")
    public final int[][] method638(int arg0, int arg1) {
        ++field2323;
        if (arg0 != 2017) {
            field2327 = null;
        }
        int[][] var3 = super.field7647.method3510((byte) -51, arg1);
        if (super.field7647.field8306) {
            int[][] var4 = this.method3247((byte) -118, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class418.field5518 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIZI)Lfda;")
    public static final class381 method1139(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field2324 = null;
        }
        ++field2320;
        class766 var4 = class28.field252[arg0][arg3][arg1];
        if (var4 == null) {
            return null;
        } else {
            class381 var5 = null;
            int var6 = -1;
            for (class569 var7 = var4.field10431; var7 != null; var7 = var7.field7189) {
                class620 var8 = var7.field7193;
                if (var8 instanceof class381) {
                    class381 var9 = (class381) var8;
                    int var10 = 252 + -256 + var9.method190((byte) -126) * 256;
                    int var11 = -var10 + var9.field2896 >> 9;
                    int var12 = -var10 + var9.field2900 >> 9;
                    int var13 = var9.field2896 + var10 >> 9;
                    int var14 = var9.field2900 + var10 >> 9;
                    if (~arg3 <= ~var11 && ~var12 >= ~arg1 && ~arg3 >= ~var13 && var14 >= arg1) {
                        int var15 = (var13 - (-1 - -arg3)) * (-arg1 + 1 + var14);
                        if (var15 > var6) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field7646 = arg0.method1509(true) == 1;
        }
        int var4 = -46 / ((40 - arg2) / 52);
        ++field2328;
    }
}
