import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class69 extends class139 {

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    private int field864 = 5;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    private int field865 = 2;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    private int field871 = 2048;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    private int field869 = 5;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "[B")
    private byte[] field870 = new byte[512];

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    private int field876 = 1;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "[S")
    private short[] field874 = new short[512];

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    private int field866 = 0;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Ldk;")
    public static class326 field863 = new class326("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "[I")
    public static int[] field875 = new int[2];

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(B)V")
    public static void method410(byte arg0) {
        field863 = null;
        int var1 = -66 / ((arg0 - 84) / 42);
        field875 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        this.field870 = class62.method387(this.field866, (byte) 74);
        if (arg0 != 7) {
            method410((byte) -95);
        }
        ++field872;
        this.method412(false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
    public static final void method411() {
        class386.method2329(1, class314.field4441);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field862;
        if (arg1 != -45) {
            method411();
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field869 = arg0.method1701(-23121);
                                }
                            } else {
                                this.field864 = arg0.method1701(-23121);
                            }
                        } else {
                            this.field876 = arg0.method1701(-23121);
                        }
                    } else {
                        this.field865 = arg0.method1701(-23121);
                    }
                } else {
                    this.field871 = arg0.method1729(arg1 ^ -65325);
                }
            } else {
                this.field866 = arg0.method1701(arg1 + -23076);
            }
        } else {
            this.field864 = this.field869 = arg0.method1701(-23121);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field867;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (arg1 != 27782) {
            this.field871 = -44;
        }
        if (super.field1844.field5045) {
            int var4 = class237.field3559[arg0] * this.field869 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class356.field5147 < ~var7; ++var7) {
                class208.field3177 = Integer.MAX_VALUE;
                class190.field2828 = Integer.MAX_VALUE;
                class61.field812 = Integer.MAX_VALUE;
                class227.field3435 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class216.field3245[var7] * this.field864);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field870[255 & (var11 >= this.field869 ? -this.field869 + var11 : var11)];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (255 & this.field870[var13 - -(var14 >= this.field864 ? -this.field864 + var14 : var14) & 255]) * 2;
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field874[var15]);
                        int var17 = var4 - (var11 << 12) - this.field874[var27];
                        int var18 = this.field876;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = var25 >= var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class227.field3435) {
                            if (~var19 > ~class61.field812) {
                                class208.field3177 = class190.field2828;
                                class190.field2828 = class61.field812;
                                class61.field812 = var19;
                            } else if (~class190.field2828 >= ~var19) {
                                if (class208.field3177 > var19) {
                                    class208.field3177 = var19;
                                }
                            } else {
                                class208.field3177 = class190.field2828;
                                class190.field2828 = var19;
                            }
                        } else {
                            class208.field3177 = class190.field2828;
                            class190.field2828 = class61.field812;
                            class61.field812 = class227.field3435;
                            class227.field3435 = var19;
                        }
                    }
                }
                int var12 = this.field865;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class227.field3435 + class61.field812;
                                }
                            } else {
                                var3[var7] = class208.field3177;
                            }
                        } else {
                            var3[var7] = class190.field2828;
                        }
                    } else {
                        var3[var7] = class61.field812;
                    }
                } else {
                    var3[var7] = class227.field3435;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    private final void method412(boolean arg0) {
        if (arg0) {
            this.method412(true);
        }
        ++field868;
        Random var2 = new Random((long) this.field866);
        this.field874 = new short[512];
        if (this.field871 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field874[var3] = (short) class351.method2194(-118, var2, this.field871);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public static final void method413(int arg0) {
        ++field873;
        if (class36.field472 != -1) {
            int var1 = class262.field3832.method175(-127);
            int var2 = class262.field3832.method177(-128);
            if (class419.field5854 != null) {
                var1 = class419.field5854.method2162(true);
                var2 = class419.field5854.method2159(-98);
            }
            class244.method1536(class144.field1900, var1, 0, 0, class36.field472, 0, var2, (byte) 63, class244.field3634, 0);
            if (class307.field4372 != null) {
                class328.method2078(var1, (byte) 114, var2);
            }
            int var3 = 6 / ((arg0 - -82) / 38);
        }
    }
}
