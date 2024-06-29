import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class283 extends class96 {

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Z")
    private boolean field3615 = true;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "Z")
    private boolean field3612 = true;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "Lpi;")
    public static class340 field3618 = new class340(72, 10);

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "[I")
    public static int[] field3621 = new int[32];

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "D")
    public static double field3622 = -1.0D;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "Lqd;")
    public static class277 field3619;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "[Lna;")
    public static class251[] field3620;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V")
    public static void method1727(int arg0) {
        field3620 = null;
        field3618 = null;
        field3621 = null;
        if (arg0 != -1) {
            field3621 = null;
        }
        field3619 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field3611;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1329 = ~arg2.method617(arg1 ^ -3) == -2;
                }
            } else {
                this.field3615 = ~arg2.method617(arg1 + 3) == -2;
            }
        } else {
            this.field3612 = arg2.method617(arg1 + 3) == 1;
        }
        if (arg1 != -1) {
            method1728(-44, 127, (class7) null, -122, (class129) null);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field3617;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, -73, !this.field3615 ? arg1 : -arg1 + class380.field4948);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field3612) {
                for (int var11 = 0; ~var11 > ~class269.field3403; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class269.field3403; ++var12) {
                    var8[var12] = var5[-var12 + class292.field3781];
                    var9[var12] = var6[-var12 + class292.field3781];
                    var10[var12] = var7[class292.field3781 - var12];
                }
            }
        }
        if (arg0 != 3) {
            this.field3612 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field3614;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int[] var4 = this.method657(0, this.field3615 ? -arg0 + class380.field4948 : arg0, -1);
            if (this.field3612) {
                for (int var5 = 0; class269.field3403 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class292.field3781];
                }
            } else {
                class526.method3116(var4, 0, var3, 0, class269.field3403);
            }
        }
        if (arg1 != 255) {
            this.method31(28, -11, (class88) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class283() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILtu;ILqa;)V")
    public static final void method1728(int arg0, int arg1, class7 arg2, int arg3, class129 arg4) {
        if (arg0 != 1) {
            field3620 = null;
        }
        ++field3623;
        class176.field2250.method47(0);
        if (!class233.field3015) {
            for (class343 var5 = (class343) arg2.method49(arg0 + -114); var5 != null; var5 = (class343) arg2.method46((byte) 62)) {
                class429 var6 = class230.field2950.method1093(var5.field4371, 85);
                if (class294.method1765(var6, 837401932)) {
                    boolean var7 = class279.method1717(0, arg3, arg4, var5, arg1, var6);
                    if (var7) {
                        class407.method2418(var6, true, arg4, var5);
                    }
                }
            }
        }
    }
}
