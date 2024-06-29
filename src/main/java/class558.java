import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class558 extends class529 {

    @OriginalMember(owner = "client!va", name = "G", descriptor = "[S")
    private short[] field7813 = new short[512];

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    private int field7814 = 5;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    private int field7815 = 0;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    private int field7817 = 2048;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    private int field7812 = 5;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    private int field7821 = 2;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    private int field7819 = 1;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "[B")
    private byte[] field7820 = new byte[512];

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field7818;
        int var3 = -67 / ((arg1 - 27) / 49);
        int[] var4 = super.field7456.method1635(arg0, -84);
        if (super.field7456.field3449) {
            int var5 = class310.field3960[arg0] * this.field7812 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; class304.field3909 > var8; ++var8) {
                class588.field8211 = Integer.MAX_VALUE;
                class42.field646 = Integer.MAX_VALUE;
                class528.field7445 = Integer.MAX_VALUE;
                class550.field7740 = Integer.MAX_VALUE;
                int var9 = class225.field2973[var8] * this.field7814 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; ~var12 >= ~var7; ++var12) {
                    int var14 = this.field7820[(~this.field7812 >= ~var12 ? -this.field7812 + var12 : var12) & 255] & 255;
                    for (int var15 = var10 + -1; var15 <= var11; ++var15) {
                        int var16 = 2 * (this.field7820[255 & (this.field7814 <= var15 ? -this.field7814 + var15 : var15) + var14] & 255);
                        int var28 = var16 + 1;
                        int var17 = -this.field7813[var16] - ((var15 << 12) - var9);
                        int var18 = var5 - this.field7813[var28] - (var12 << 12);
                        int var19 = this.field7819;
                        int var20;
                        if (var19 != 1) {
                            if (~var19 != -4) {
                                if (~var19 != -5) {
                                    if (~var19 != -6) {
                                        if (~var19 == -3) {
                                            var20 = (~var17 > -1 ? -var17 : var17) - -(var18 >= 0 ? var18 : -var18);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var17 * var17;
                                        int var22 = var18 * var18;
                                        var20 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (~var18 > -1 ? -var18 : var18) / 4096.0F)));
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                int var27 = ~var18 <= -1 ? var18 : -var18;
                                var20 = var27 >= var26 ? var27 : var26;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (var20 >= class550.field7740) {
                            if (var20 < class528.field7445) {
                                class588.field8211 = class42.field646;
                                class42.field646 = class528.field7445;
                                class528.field7445 = var20;
                            } else if (~class42.field646 < ~var20) {
                                class588.field8211 = class42.field646;
                                class42.field646 = var20;
                            } else if (~class588.field8211 < ~var20) {
                                class588.field8211 = var20;
                            }
                        } else {
                            class588.field8211 = class42.field646;
                            class42.field646 = class528.field7445;
                            class528.field7445 = class550.field7740;
                            class550.field7740 = var20;
                        }
                    }
                }
                int var13 = this.field7821;
                if (~var13 != -1) {
                    if (var13 != 1) {
                        if (var13 != 3) {
                            if (var13 != 4) {
                                if (var13 == 2) {
                                    var4[var8] = class528.field7445 - class550.field7740;
                                }
                            } else {
                                var4[var8] = class588.field8211;
                            }
                        } else {
                            var4[var8] = class42.field646;
                        }
                    } else {
                        var4[var8] = class528.field7445;
                    }
                } else {
                    var4[var8] = class550.field7740;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    private final void method3163(int arg0) {
        ++field7816;
        Random var2 = new Random((long) this.field7815);
        this.field7813 = new short[512];
        if (this.field7817 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field7813[var3] = (short) class408.method2420((byte) -27, var2, this.field7817);
            }
        }
        if (arg0 >= -122) {
            this.method303(55);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field7812 = arg2.method1094(255);
                                }
                            } else {
                                this.field7814 = arg2.method1094(255);
                            }
                        } else {
                            this.field7819 = arg2.method1094(255);
                        }
                    } else {
                        this.field7821 = arg2.method1094(255);
                    }
                } else {
                    this.field7817 = arg2.method1107(false);
                }
            } else {
                this.field7815 = arg2.method1094(255);
            }
        } else {
            this.field7814 = this.field7812 = arg2.method1094(255);
        }
        if (arg1 < 45) {
            this.field7819 = -73;
        }
        ++field7811;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        this.field7820 = class516.method2960(255, this.field7815);
        ++field7810;
        this.method3163(-126);
        if (arg0 >= -92) {
            this.field7812 = 86;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class558() {
        super(0, true);
    }
}
