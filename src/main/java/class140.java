import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class140 extends class667 {

    @OriginalMember(owner = "client!fea", name = "E", descriptor = "[S")
    private short[] field2163 = new short[512];

    @OriginalMember(owner = "client!fea", name = "I", descriptor = "I")
    private int field2167 = 2;

    @OriginalMember(owner = "client!fea", name = "L", descriptor = "I")
    private int field2170 = 0;

    @OriginalMember(owner = "client!fea", name = "H", descriptor = "I")
    private int field2166 = 5;

    @OriginalMember(owner = "client!fea", name = "B", descriptor = "I")
    private int field2161 = 2048;

    @OriginalMember(owner = "client!fea", name = "O", descriptor = "I")
    private int field2173 = 5;

    @OriginalMember(owner = "client!fea", name = "P", descriptor = "I")
    private int field2174 = 1;

    @OriginalMember(owner = "client!fea", name = "K", descriptor = "[B")
    private byte[] field2169 = new byte[512];

    @OriginalMember(owner = "client!fea", name = "G", descriptor = "Lrr;")
    public static class361 field2165 = new class361();

    @OriginalMember(owner = "client!fea", name = "C", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!fea", name = "F", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!fea", name = "J", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!fea", name = "M", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!fea", name = "N", descriptor = "Z")
    public static boolean field2172;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V")
    public static void method1105(int arg0) {
        if (arg0 != 5) {
            field2172 = true;
        }
        field2165 = null;
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V")
    private final void method1106(int arg0) {
        if (arg0 == 4096) {
            ++field2164;
            Random var2 = new Random((long) this.field2170);
            this.field2163 = new short[512];
            if (~this.field2161 < -1) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field2163[var3] = (short) class459.method2800(var2, this.field2161, (byte) -90);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field2172 = true;
        }
        ++field2171;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field2166 = arg0.method273(arg1 + 252);
                                }
                            } else {
                                this.field2173 = arg0.method273(arg1 ^ 252);
                            }
                        } else {
                            this.field2174 = arg0.method273(255);
                        }
                    } else {
                        this.field2167 = arg0.method273(255);
                    }
                } else {
                    this.field2161 = arg0.method253(-13900);
                }
            } else {
                this.field2170 = arg0.method273(255);
            }
        } else {
            this.field2173 = this.field2166 = arg0.method273(arg1 ^ 252);
        }
    }

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "(III)Lrc;")
    public static final class535 method1107(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5845;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field2162;
        if (arg0 > -87) {
            this.method121(false);
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int var4 = 2048 - -(class385.field5384[arg1] * this.field2166);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~var7 > ~class77.field1455; ++var7) {
                class255.field3695 = Integer.MAX_VALUE;
                class260.field3814 = Integer.MAX_VALUE;
                class341.field4791 = Integer.MAX_VALUE;
                class534.field7548 = Integer.MAX_VALUE;
                int var8 = class20.field261[var7] * this.field2173 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field2169[(this.field2166 > var11 ? var11 : -this.field2166 + var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (255 & this.field2169[(~var14 > ~this.field2173 ? var14 : -this.field2173 + var14) + var13 & 255]) * 2;
                        int var10001 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var8 + var10001 + -this.field2163[var15];
                        int var17 = -(var11 << 12) - this.field2163[var27] + var4;
                        int var18 = this.field2174;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
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
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = ~var25 > ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class534.field7548 > var19) {
                            class255.field3695 = class260.field3814;
                            class260.field3814 = class341.field4791;
                            class341.field4791 = class534.field7548;
                            class534.field7548 = var19;
                        } else if (~var19 <= ~class341.field4791) {
                            if (~var19 > ~class260.field3814) {
                                class255.field3695 = class260.field3814;
                                class260.field3814 = var19;
                            } else if (var19 < class255.field3695) {
                                class255.field3695 = var19;
                            }
                        } else {
                            class255.field3695 = class260.field3814;
                            class260.field3814 = class341.field4791;
                            class341.field4791 = var19;
                        }
                    }
                }
                int var12 = this.field2167;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class534.field7548 + class341.field4791;
                                }
                            } else {
                                var3[var7] = class255.field3695;
                            }
                        } else {
                            var3[var7] = class260.field3814;
                        }
                    } else {
                        var3[var7] = class341.field4791;
                    }
                } else {
                    var3[var7] = class534.field7548;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        this.field2169 = class532.method3126(255, this.field2170);
        ++field2168;
        this.method1106(4096);
        if (arg0) {
            this.field2169 = null;
        }
    }
}
