import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class46 extends class346 {

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    private int field698 = 2;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    private int field699 = 0;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    private int field703 = 1;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    private int field702 = 5;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    private int field694 = 5;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    private int field705 = 2048;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "[B")
    private byte[] field706 = new byte[512];

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "[S")
    private short[] field707 = new short[512];

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "Lsj;")
    public static class248 field696;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "Z")
    public static boolean field697;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V", line = 3)
    public final void method237(byte arg0) {
        ++field695;
        this.field706 = class248.method1631(97, this.field699);
        if (arg0 >= -95) {
            this.method38((class341) null, true, 1);
        }
        this.method331((byte) 31);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)[I", line = 20)
    public final int[] method45(int arg0, int arg1) {
        ++field704;
        if (arg1 != 3) {
            this.field705 = -86;
        }
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int var4 = class436.field6337[arg0] * this.field694 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class134.field1753 > var7; ++var7) {
                class78.field1097 = Integer.MAX_VALUE;
                class397.field5793 = Integer.MAX_VALUE;
                class245.field3452 = Integer.MAX_VALUE;
                class345.field5139 = Integer.MAX_VALUE;
                int var8 = class361.field5340[var7] * this.field702 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field706[255 & (var11 >= this.field694 ? -this.field694 + var11 : var11)] & 255;
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (255 & this.field706[255 & (var14 < this.field702 ? var14 : -this.field702 + var14) + var13]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field707[var15] + (var14 << 12));
                        int var17 = -(var11 << 12) + var4 + -this.field707[var27];
                        int var18 = this.field703;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (var19 < class345.field5139) {
                            class78.field1097 = class397.field5793;
                            class397.field5793 = class245.field3452;
                            class245.field3452 = class345.field5139;
                            class345.field5139 = var19;
                        } else if (~class245.field3452 >= ~var19) {
                            if (~var19 <= ~class397.field5793) {
                                if (var19 < class78.field1097) {
                                    class78.field1097 = var19;
                                }
                            } else {
                                class78.field1097 = class397.field5793;
                                class397.field5793 = var19;
                            }
                        } else {
                            class78.field1097 = class397.field5793;
                            class397.field5793 = class245.field3452;
                            class245.field3452 = var19;
                        }
                    }
                }
                int var12 = this.field698;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = class245.field3452 - class345.field5139;
                                }
                            } else {
                                var3[var7] = class78.field1097;
                            }
                        } else {
                            var3[var7] = class397.field5793;
                        }
                    } else {
                        var3[var7] = class245.field3452;
                    }
                } else {
                    var3[var7] = class345.field5139;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V", line = 232)
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZIII)V", line = 243)
    public static final void method330(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field700;
        class321.field4768 = arg2;
        if (arg1) {
            class389.field5696 = arg0;
            class295.field4456 = arg3;
            class209.field2844 = arg4;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V", line = 257)
    private final void method331(byte arg0) {
        ++field693;
        if (arg0 >= 16) {
            Random var2 = new Random((long) this.field699);
            this.field707 = new short[512];
            if (~this.field705 < -1) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field707[var3] = (short) class9.method67(this.field705, -1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lfb;ZI)V", line = 284)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (~arg2 == -7) {
                                        this.field694 = arg0.method2233((byte) 104);
                                    }
                                } else {
                                    this.field702 = arg0.method2233((byte) 104);
                                }
                            } else {
                                this.field703 = arg0.method2233((byte) 104);
                            }
                        } else {
                            this.field698 = arg0.method2233((byte) 104);
                        }
                    } else {
                        this.field705 = arg0.method2239(-1076227960);
                    }
                } else {
                    this.field699 = arg0.method2233((byte) 104);
                }
            } else {
                this.field702 = this.field694 = arg0.method2233((byte) 104);
            }
            ++field701;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V", line = 362)
    public static void method332(int arg0) {
        if (arg0 == -2) {
            field696 = null;
        }
    }
}
