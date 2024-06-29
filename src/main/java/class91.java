import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class91 extends class17 {

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    private int field1128 = 1;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    private int field1129 = 2048;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    private int field1131 = 0;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    private int field1132 = 5;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    private int field1134 = 2;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "[B")
    private byte[] field1130 = new byte[512];

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "[S")
    private short[] field1136 = new short[512];

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    private int field1127 = 5;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "Lam;")
    public static class455 field1133 = new class455();

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "[I")
    public static int[] field1126;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V", line = 6)
    public final void method31(int arg0) {
        this.field1130 = class327.method1972(this.field1131, (byte) -7);
        if (arg0 != -9) {
            this.method34((class403) null, -86, 17);
        }
        ++field1124;
        this.method649(512);
    }

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)V", line = 21)
    private final void method649(int arg0) {
        ++field1125;
        if (arg0 == 512) {
            Random var2 = new Random((long) this.field1131);
            this.field1136 = new short[512];
            if (this.field1129 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field1136[var3] = (short) class119.method802(0, this.field1129, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 153)
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIB)V", line = 56)
    public static final void method650(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field1123;
        if (arg3 >= class392.field5514 && class518.field7624 >= arg1 && ~class303.field4422 >= ~arg0 && ~class353.field5062 <= ~arg2) {
            class206.method1313(arg2, arg3, 36, arg4, arg0, arg1);
        } else {
            class453.method2645(arg3, arg5 ^ 104, arg1, arg0, arg4, arg2);
        }
        if (arg5 != 104) {
            field1126 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lwm;II)V", line = 78)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field1132 = arg0.method2357((byte) 114);
                                }
                            } else {
                                this.field1127 = arg0.method2357((byte) 109);
                            }
                        } else {
                            this.field1128 = arg0.method2357((byte) 105);
                        }
                    } else {
                        this.field1134 = arg0.method2357((byte) 111);
                    }
                } else {
                    this.field1129 = arg0.method2338(arg2 ^ 5159);
                }
            } else {
                this.field1131 = arg0.method2357((byte) 104);
            }
        } else {
            this.field1127 = this.field1132 = arg0.method2357((byte) 114);
        }
        if (arg2 != 5159) {
            this.method34((class403) null, -57, -122);
        }
        ++field1135;
    }

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "(I)V", line = 162)
    public static void method651(int arg0) {
        if (arg0 != 4096) {
            method650(106, 105, 109, -101, -122, (byte) -102);
        }
        field1133 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I", line = 193)
    public final int[] method27(int arg0, int arg1) {
        ++field1137;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 <= 53) {
            field1126 = null;
        }
        if (super.field210.field6442) {
            int var4 = class40.field427[arg0] * this.field1132 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class530.field7763; ++var7) {
                class55.field703 = Integer.MAX_VALUE;
                class116.field1562 = Integer.MAX_VALUE;
                class257.field3831 = Integer.MAX_VALUE;
                class274.field4056 = Integer.MAX_VALUE;
                int var8 = class492.field6966[var7] * this.field1127 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field1130[255 & (~var11 <= ~this.field1132 ? -this.field1132 + var11 : var11)] & 255;
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field1130[255 & (var14 < this.field1127 ? var14 : -this.field1127 + var14) + var13] & 255) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field1136[var15] + var8;
                        int var17 = -(var11 << 12) + var4 + -this.field1136[var27];
                        int var18 = this.field1128;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var26 <= ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class274.field4056) {
                            class55.field703 = class116.field1562;
                            class116.field1562 = class257.field3831;
                            class257.field3831 = class274.field4056;
                            class274.field4056 = var19;
                        } else if (~var19 > ~class257.field3831) {
                            class55.field703 = class116.field1562;
                            class116.field1562 = class257.field3831;
                            class257.field3831 = var19;
                        } else if (~class116.field1562 < ~var19) {
                            class55.field703 = class116.field1562;
                            class116.field1562 = var19;
                        } else if (var19 < class55.field703) {
                            class55.field703 = var19;
                        }
                    }
                }
                int var12 = this.field1134;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class274.field4056 + class257.field3831;
                                }
                            } else {
                                var3[var7] = class55.field703;
                            }
                        } else {
                            var3[var7] = class116.field1562;
                        }
                    } else {
                        var3[var7] = class257.field3831;
                    }
                } else {
                    var3[var7] = class274.field4056;
                }
            }
        }
        return var3;
    }
}
