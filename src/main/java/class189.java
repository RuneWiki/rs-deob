import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class189 extends class184 {

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    private int field2462 = 2000;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    private int field2461 = 16;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    private int field2465 = 0;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    private int field2468 = 0;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    private int field2464 = 4096;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "Lap;")
    public static class335 field2467 = new class335("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "Lkg;")
    public static class179 field2473 = new class179(10, 7);

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    public static int field2474 = 0;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!uu", name = "S", descriptor = "[[B")
    public static byte[][] field2476;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)V", line = 3)
    public static void method1180(int arg0) {
        if (arg0 != 2000) {
            method1181(-29, -11);
        }
        field2476 = null;
        field2467 = null;
        field2473 = null;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 30)
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Z)V", line = 33)
    public final void method109(boolean arg0) {
        class93.method721(4096);
        if (arg0) {
            field2473 = null;
        }
        ++field2470;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[I", line = 48)
    public final int[] method6(int arg0, int arg1) {
        if (arg1 != 578) {
            return null;
        } else {
            ++field2466;
            int[] var3 = super.field2409.method248(arg0, 16776960);
            if (super.field2409.field436) {
                int var4 = this.field2464 >> 1;
                int[][] var5 = super.field2409.method249((byte) -115);
                Random var6 = new Random((long) this.field2468);
                for (int var7 = 0; ~var7 > ~this.field2462; ++var7) {
                    int var8 = ~this.field2464 >= -1 ? this.field2465 : this.field2465 + class349.method2006(var6, (byte) -46, this.field2464) + -var4;
                    int var9 = (4093 & var8) >> 4;
                    int var10 = class349.method2006(var6, (byte) -46, class245.field3167);
                    int var11 = class349.method2006(var6, (byte) -46, class79.field1026);
                    int var12 = var10 - -(class108.field1360[var9] * this.field2461 >> 12);
                    int var13 = var11 - -(class397.field5691[var9] * this.field2461 >> 12);
                    int var14 = -var11 + var13;
                    int var15 = var12 - var10;
                    if (var15 != 0 || var14 != 0) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = var14 > var15;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var12 = var13;
                            var11 = var17;
                            var13 = var18;
                        }
                        if (var10 > var12) {
                            int var19 = var10;
                            int var20 = var11;
                            var10 = var12;
                            var11 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = var12 - var10;
                        int var23 = var13 - var11;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = -(class349.method2006(var6, (byte) -46, 4096) >> 2) + 1024;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var27 = ~var13 >= ~var11 ? -1 : 1;
                        for (int var28 = var10; var12 > var28; ++var28) {
                            int var29 = var26 - -((-var10 + var28) * var25) + 1024;
                            int var30 = class421.field5961 & var28;
                            int var31 = class501.field7240 & var21;
                            if (!var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                            var24 += var23;
                            if (~var24 < -1) {
                                var24 += -var22;
                                var21 += var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Z", line = 182)
    public static final boolean method1181(int arg0, int arg1) {
        if (arg1 != 10916) {
            field2474 = 49;
        }
        ++field2472;
        if (~arg0 != -26 && ~arg0 != -14 && arg0 != 19 && ~arg0 != -9 && ~arg0 != -23) {
            return arg0 == 16 || ~arg0 == -1009;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BILfh;)V", line = 202)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field2469;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field2464 = arg2.method2758((byte) 115);
                        }
                    } else {
                        this.field2465 = arg2.method2758((byte) 104);
                    }
                } else {
                    this.field2461 = arg2.method2737(false);
                }
            } else {
                this.field2462 = arg2.method2758((byte) 116);
            }
        } else {
            this.field2468 = arg2.method2737(false);
        }
        int var5 = -88 / ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lhd;I)V", line = 275)
    public static final void method1182(class523 arg0, int arg1) {
        ++field2471;
        class523 var2 = class262.method1568(arg0, arg1 ^ -107);
        if (arg1 != 3) {
            field2476 = null;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class390.field5236;
            var4 = class174.field2262;
        } else {
            var4 = var2.field7617;
            var3 = var2.field7574;
        }
        class92.method718(var3, -59, arg0, false, var4);
        class161.method1037(var4, arg0, 441050190, var3);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)V", line = 308)
    public static final void method1183(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        int var5 = arg1 << 3;
        ++field2463;
        int var6 = arg0 << 3;
        class463.field6626 = (float) var4;
        class49.field629 = (float) var5;
        if (class142.field1835 == arg3) {
            class347.field4462 = var6;
            class80.field1030 = var5;
            class365.field4747 = var4;
        }
        class389.method2212(-4);
        class469.field6792 = true;
    }
}
