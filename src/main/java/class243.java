import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class243 extends class264 {

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    private int field4376 = 4096;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    private int field4377 = 409;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    private int field4380 = 4096;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    private int field4381 = 4096;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "[I")
    private int[] field4385 = new int[3];

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "Z")
    public static boolean field4378 = false;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "[Z")
    public static boolean[] field4383 = new boolean[5];

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field4384 = 2;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lcf;")
    public static class93 field4391 = class147.method1066("Lade Konfiguration )2 ", -48);

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "Lcf;")
    public static class93 field4382 = class277.method1854(1, 160);

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "Lvj;")
    public static class115 field4389;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "[I")
    public static int[] field4388;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method1651(boolean arg0) {
        field4389 = null;
        if (!arg0) {
            field4391 = null;
            field4383 = null;
            field4382 = null;
            field4388 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field4387;
        if (arg1) {
            this.field4376 = 61;
        }
        int[][] var3 = super.field4705.method1089(arg0, 52);
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-118, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class176.field3060; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field4385[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field4377) {
                    var7[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var8[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field4385[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4377) {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = -this.field4385[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field4377 > ~var17) {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field4381 * var12 >> 12;
                            var9[var11] = this.field4376 * var14 >> 12;
                            var10[var11] = this.field4380 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4390;
        if (class146.method1062((byte) -103, arg6)) {
            client.method1117(class6.field82[arg6], -1, arg2, arg1, arg5, arg3, arg7, arg4);
            if (arg0 != -21606) {
                method1651(false);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 <= 11) {
            method1652(102, -66, -31, 23, -104, -19, -114, -102);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method1893((byte) -94);
                            this.field4385[1] = class58.method333(var5 >> 4, 4080);
                            this.field4385[0] = class58.method333(267386880, var5 << 4);
                            this.field4385[2] = class58.method333(0, var5 >> 12);
                        }
                    } else {
                        this.field4381 = arg2.method1891(-128);
                    }
                } else {
                    this.field4376 = arg2.method1891(-122);
                }
            } else {
                this.field4380 = arg2.method1891(-111);
            }
        } else {
            this.field4377 = arg2.method1891(-120);
        }
        ++field4379;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }
}
