import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class429 extends class349 {

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    private int field5955 = 2048;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    private int field5956 = 1;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    private int field5957 = 5;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    private int field5953 = 0;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "[S")
    private short[] field5964 = new short[512];

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    private int field5965 = 2;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    private int field5966 = 5;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "[B")
    private byte[] field5967 = new byte[512];

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field5954 = 0;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "Lpq;")
    public static class159 field5959;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 8)
    public class429() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V", line = 14)
    public static void method2470(byte arg0) {
        if (arg0 >= -36) {
            field5954 = -5;
        }
        field5959 = null;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V", line = 25)
    private final void method2471(int arg0) {
        ++field5958;
        Random var2 = new Random((long) this.field5953);
        this.field5964 = new short[512];
        if (this.field5955 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field5964[var3] = (short) class571.method3224((byte) -31, this.field5955, var2);
            }
        }
        if (arg0 != 1) {
            this.field5964 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)[I", line = 64)
    public final int[] method13(byte arg0, int arg1) {
        ++field5952;
        int var3 = -3 % ((56 - arg0) / 41);
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int var5 = class54.field709[arg1] * this.field5966 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; class39.field497 > var8; ++var8) {
                class61.field843 = Integer.MAX_VALUE;
                class310.field4165 = Integer.MAX_VALUE;
                class67.field884 = Integer.MAX_VALUE;
                class216.field2791 = Integer.MAX_VALUE;
                int var9 = class29.field283[var8] * this.field5957 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; ~var7 <= ~var12; ++var12) {
                    int var14 = this.field5967[(var12 >= this.field5966 ? var12 - this.field5966 : var12) & 255] & 255;
                    for (int var15 = var10 + -1; var11 >= var15; ++var15) {
                        int var16 = (255 & this.field5967[(this.field5957 > var15 ? var15 : var15 - this.field5957) + var14 & 255]) * 2;
                        int var28 = var16 + 1;
                        int var17 = -this.field5964[var16] + -(var15 << 12) + var9;
                        int var18 = var5 - (this.field5964[var28] - -(var12 << 12));
                        int var19 = this.field5956;
                        int var20;
                        if (~var19 != -2) {
                            if (~var19 != -4) {
                                if (~var19 != -5) {
                                    if (var19 != 5) {
                                        if (var19 == 2) {
                                            var20 = (var18 >= 0 ? var18 : -var18) + (~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 - -(var18 * var18)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = (int) (Math.sqrt((double) ((float) (~var18 <= -1 ? var18 : -var18) / 4096.0F)) * 4096.0D);
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var18 > -1 ? -var18 : var18;
                                int var27 = var17 < 0 ? -var17 : var17;
                                var20 = ~var26 <= ~var27 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (~var20 <= ~class216.field2791) {
                            if (class67.field884 > var20) {
                                class61.field843 = class310.field4165;
                                class310.field4165 = class67.field884;
                                class67.field884 = var20;
                            } else if (var20 < class310.field4165) {
                                class61.field843 = class310.field4165;
                                class310.field4165 = var20;
                            } else if (var20 < class61.field843) {
                                class61.field843 = var20;
                            }
                        } else {
                            class61.field843 = class310.field4165;
                            class310.field4165 = class67.field884;
                            class67.field884 = class216.field2791;
                            class216.field2791 = var20;
                        }
                    }
                }
                int var13 = this.field5965;
                if (var13 != 0) {
                    if (var13 != 1) {
                        if (var13 != 3) {
                            if (~var13 != -5) {
                                if (var13 == 2) {
                                    var4[var8] = -class216.field2791 + class67.field884;
                                }
                            } else {
                                var4[var8] = class61.field843;
                            }
                        } else {
                            var4[var8] = class310.field4165;
                        }
                    } else {
                        var4[var8] = class67.field884;
                    }
                } else {
                    var4[var8] = class216.field2791;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)Llt;", line = 276)
    public static final class95 method2472(int arg0, byte arg1) {
        ++field5961;
        if (arg1 >= -62) {
            field5954 = 116;
        }
        class361[] var2 = class648.field9171;
        synchronized (class648.field9171) {
            class95 var3;
            if (~class648.field9171.length < ~arg0 && !class648.field9171[arg0].method2223(0)) {
                var3 = (class95) class648.field9171[arg0].method2218(3);
                var3.method2357(3553);
                int var10002 = class388.field5602[arg0]--;
            } else {
                var3 = new class95();
                var3.field1175 = new class455[arg0];
                for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                    var3.field1175[var4] = new class455();
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 311)
    public final void method11(byte arg0) {
        if (arg0 <= -51) {
            ++field5962;
            this.field5967 = class650.method3610(this.field5953, 54);
            this.method2471(1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 323)
    public static final void method2473(boolean arg0) {
        if (!arg0) {
            class676.method3739(-22149, 11);
            ++field5963;
            class560.method3141((byte) 79);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILdga;)V", line = 343)
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field5960;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field5966 = arg2.method957((byte) -81);
                                }
                            } else {
                                this.field5957 = arg2.method957((byte) -98);
                            }
                        } else {
                            this.field5956 = arg2.method957((byte) -77);
                        }
                    } else {
                        this.field5965 = arg2.method957((byte) -122);
                    }
                } else {
                    this.field5955 = arg2.method922((byte) -113);
                }
            } else {
                this.field5953 = arg2.method957((byte) -128);
            }
        } else {
            this.field5957 = this.field5966 = arg2.method957((byte) -121);
        }
        if (arg0 != 4095) {
            this.field5956 = 44;
        }
    }
}
