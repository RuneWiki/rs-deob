import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class607 extends class334 {

    @OriginalMember(owner = "client!tp", name = "J", descriptor = "[B")
    private byte[] field8630 = new byte[512];

    @OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
    private int field8627 = 1;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    private int field8633 = 2;

    @OriginalMember(owner = "client!tp", name = "H", descriptor = "[S")
    private short[] field8628 = new short[512];

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    private int field8634 = 5;

    @OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
    private int field8636 = 5;

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "I")
    private int field8629 = 0;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    private int field8635 = 2048;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "Lin;")
    public static class380 field8631 = new class380(76, -2);

    @OriginalMember(owner = "client!tp", name = "S", descriptor = "[I")
    public static int[] field8639;

    @OriginalMember(owner = "client!tp", name = "R", descriptor = "Lsv;")
    public static class570 field8638;

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!tp", name = "F", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
    public static int field8637;

    static {
        new class307("", 76);
        field8639 = new int[8];
        field8638 = new class570(23, 7);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V", line = 3)
    public final void method27(byte arg0) {
        if (arg0 > -27) {
            this.method27((byte) -108);
        }
        this.field8630 = class117.method1033(this.field8629, -3979);
        ++field8625;
        this.method3521((byte) 0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[I", line = 17)
    public final int[] method28(int arg0, int arg1) {
        ++field8632;
        int[] var3 = super.field4743.method1027((byte) -118, arg0);
        if (super.field4743.field1993) {
            int var4 = 2048 - -(class527.field7361[arg0] * this.field8636);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class439.field6099 > var7; ++var7) {
                class118.field2003 = Integer.MAX_VALUE;
                class165.field2525 = Integer.MAX_VALUE;
                class568.field7905 = Integer.MAX_VALUE;
                class480.field6598 = Integer.MAX_VALUE;
                int var8 = class295.field4296[var7] * this.field8634 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field8630[255 & (~var11 > ~this.field8636 ? var11 : var11 - this.field8636)];
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (255 & this.field8630[var13 - -(var14 < this.field8634 ? var14 : var14 - this.field8634) & 255]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field8628[var15] + var8;
                        int var17 = -(var11 << 12) - this.field8628[var27] + var4;
                        int var18 = this.field8627;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = var26 >= var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 > ~class480.field6598) {
                            class118.field2003 = class165.field2525;
                            class165.field2525 = class568.field7905;
                            class568.field7905 = class480.field6598;
                            class480.field6598 = var19;
                        } else if (~var19 > ~class568.field7905) {
                            class118.field2003 = class165.field2525;
                            class165.field2525 = class568.field7905;
                            class568.field7905 = var19;
                        } else if (var19 < class165.field2525) {
                            class118.field2003 = class165.field2525;
                            class165.field2525 = var19;
                        } else if (~var19 > ~class118.field2003) {
                            class118.field2003 = var19;
                        }
                    }
                }
                int var12 = this.field8633;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class568.field7905 - class480.field6598;
                                }
                            } else {
                                var3[var7] = class118.field2003;
                            }
                        } else {
                            var3[var7] = class165.field2525;
                        }
                    } else {
                        var3[var7] = class568.field7905;
                    }
                } else {
                    var3[var7] = class480.field6598;
                }
            }
        }
        return arg1 != -22563988 ? null : var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZLol;)V", line = 230)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field8637;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field8636 = arg2.method2557(14929);
                                }
                            } else {
                                this.field8634 = arg2.method2557(14929);
                            }
                        } else {
                            this.field8627 = arg2.method2557(14929);
                        }
                    } else {
                        this.field8633 = arg2.method2557(14929);
                    }
                } else {
                    this.field8635 = arg2.method2565((byte) -84);
                }
            } else {
                this.field8629 = arg2.method2557(14929);
            }
        } else {
            this.field8634 = this.field8636 = arg2.method2557(14929);
        }
        if (arg1) {
            this.field8633 = 67;
        }
    }

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "(I)V", line = 309)
    public static void method3520(int arg0) {
        field8631 = null;
        int var1 = 81 % ((arg0 - 22) / 43);
        field8639 = null;
        field8638 = null;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V", line = 325)
    private final void method3521(byte arg0) {
        int var2 = 123 % ((arg0 - -55) / 54);
        ++field8626;
        Random var3 = new Random((long) this.field8629);
        this.field8628 = new short[512];
        if (~this.field8635 < -1) {
            for (int var4 = 0; ~var4 > -513; ++var4) {
                this.field8628[var4] = (short) class728.method4047(120, this.field8635, var3);
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V", line = 369)
    public class607() {
        super(0, true);
    }
}
