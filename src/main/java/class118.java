import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class118 extends class398 {

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    private int field1659 = 0;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    private int field1657 = 16;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    private int field1663 = 2000;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    private int field1665 = 0;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    private int field1667 = 4096;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Lps;")
    public static class394 field1653 = null;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public final void method209(int arg0) {
        if (arg0 != 16) {
            this.field1663 = 110;
        }
        ++field1655;
        class42.method303(arg0 ^ 7328);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V")
    public static final void method764(byte arg0) {
        ++field1664;
        if (class291.field4168 == null) {
            class291.field4168 = new int[65536];
            if (arg0 != -120) {
                field1653 = null;
            }
            double var1 = 0.03D * Math.random() - 0.015D + 0.7D;
            for (int var3 = 0; var3 < 65536; ++var3) {
                double var4 = (double) ((65346 & var3) >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) (7 & var3 >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (var3 & 127) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 - var6 * var8;
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (var20 * 3.0D < 2.0D) {
                        var10 = (0.6666666666666666D - var20) * (-var18 + var16) * 6.0D + var18;
                    } else {
                        var10 = var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (!(var4 * 6.0D < 1.0D)) {
                        if (!(var4 * 2.0D < 1.0D)) {
                            if (!(var4 * 3.0D < 2.0D)) {
                                var12 = var18;
                            } else {
                                var12 = (0.6666666666666666D - var4) * (-var18 + var16) * 6.0D + var18;
                            }
                        } else {
                            var12 = var16;
                        }
                    } else {
                        var12 = (-var18 + var16) * 6.0D * var4 + var18;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (!(var24 * 2.0D < 1.0D)) {
                            if (var24 * 3.0D < 2.0D) {
                                var14 = (-var18 + var16) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                            } else {
                                var14 = var18;
                            }
                        } else {
                            var14 = var16;
                        }
                    } else {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + (var33 << 8) + var34;
                class291.field4168[var3] = var35;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZIIZII)V")
    public static final void method765(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field1654;
        if (arg5 != 26577) {
            field1653 = null;
        }
        if (arg0 < arg2) {
            int var7 = (arg0 + arg2) / 2;
            int var8 = arg0;
            class92 var9 = class16.field226[var7];
            class16.field226[var7] = class16.field226[arg2];
            class16.field226[arg2] = var9;
            for (int var10 = arg0; ~arg2 < ~var10; ++var10) {
                if (class219.method1282(class16.field226[var10], var9, 29995, arg1, arg3, arg4, arg6) <= 0) {
                    class92 var11 = class16.field226[var10];
                    class16.field226[var10] = class16.field226[var8];
                    class16.field226[var8++] = var11;
                }
            }
            class16.field226[arg2] = class16.field226[var8];
            class16.field226[var8] = var9;
            method765(arg0, arg1, var8 + -1, arg3, arg4, arg5, arg6);
            method765(var8 + 1, arg1, arg2, arg3, arg4, 26577, arg6);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(III)Z")
    public static final boolean method766(int arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            field1653 = null;
        }
        ++field1656;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class104 var3 = class329.method2190((byte) 63, arg0);
        if (arg2 >= 5 && ~arg2 >= -9) {
            arg2 = 4;
        }
        return var3.method697(arg2, arg1 ^ -66);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            method764((byte) 110);
        }
        ++field1660;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field1667 = arg0.method1343(255);
                        }
                    } else {
                        this.field1665 = arg0.method1343(255);
                    }
                } else {
                    this.field1657 = arg0.method1348(arg2 ^ 13105);
                }
            } else {
                this.field1663 = arg0.method1343(arg2 ^ -13237);
            }
        } else {
            this.field1659 = arg0.method1348(-110);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class118() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLlm;)Lon;")
    public static final class35 method767(int arg0, byte arg1, class347 arg2) {
        ++field1658;
        if (arg1 < 1) {
            field1653 = null;
        }
        byte[] var3 = arg2.method2266((byte) 98, arg0);
        return var3 == null ? null : new class35(var3);
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static void method768(int arg0) {
        if (arg0 != 5513) {
            field1653 = null;
        }
        field1653 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field1666;
        int[] var3 = super.field5927.method305(arg0, (byte) 64);
        if (arg1 != 0) {
            method768(69);
        }
        if (super.field5927.field591) {
            int var4 = this.field1667 >> 1;
            int[][] var5 = super.field5927.method301(0);
            Random var6 = new Random((long) this.field1659);
            for (int var7 = 0; ~this.field1663 < ~var7; ++var7) {
                int var8 = this.field1667 <= 0 ? this.field1665 : this.field1665 + -var4 + class139.method895(arg1 + -19416, var6, this.field1667);
                int var9 = var8 >> 4 & 255;
                int var10 = class139.method895(-19416, var6, class140.field1922);
                int var11 = class139.method895(-19416, var6, class329.field4798);
                int var12 = (class286.field4148[var9] * this.field1657 >> 12) + var10;
                int var13 = (class159.field2152[var9] * this.field1657 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class139.method895(arg1 ^ -19416, var6, 4096) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = 1024 - -((-var10 + var28) * var25) + var26;
                        int var30 = class242.field3233 & var28;
                        int var31 = var21 & class411.field6070;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
