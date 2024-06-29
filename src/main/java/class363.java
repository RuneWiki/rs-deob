import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class363 extends class535 {

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
    private int field5265 = 5;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    private int field5270 = 1;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "[B")
    private byte[] field5271 = new byte[512];

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    private int field5269 = 0;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
    private int field5266 = 5;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
    private int field5272 = 2;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "[S")
    private short[] field5274 = new short[512];

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
    private int field5275 = 2048;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "Z")
    public static boolean field5264 = false;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "Lhl;")
    public static class375 field5276 = new class375(512);

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "Lfm;")
    public static class526 field5277;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)V", line = 4)
    public final void method66(byte arg0) {
        ++field5267;
        this.field5271 = class12.method68(this.field5269, 0);
        if (arg0 <= 111) {
            this.method66((byte) -13);
        }
        this.method2239(-69);
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V", line = 20)
    public class363() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[I", line = 28)
    public final int[] method65(int arg0, int arg1) {
        ++field5268;
        if (arg1 != 1) {
            return null;
        } else {
            int[] var3 = super.field7885.method974(-30531, arg0);
            if (super.field7885.field2086) {
                int var4 = 2048 - -(class448.field6442[arg0] * this.field5266);
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class174.field2597; ++var7) {
                    class311.field4633 = Integer.MAX_VALUE;
                    class79.field1287 = Integer.MAX_VALUE;
                    class515.field7472 = Integer.MAX_VALUE;
                    class521.field7600 = Integer.MAX_VALUE;
                    int var8 = 2048 - -(class539.field7939[var7] * this.field5265);
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                        int var13 = 255 & this.field5271[255 & (var11 < this.field5266 ? var11 : -this.field5266 + var11)];
                        for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                            int var15 = (255 & this.field5271[(this.field5265 <= var14 ? -this.field5265 + var14 : var14) + var13 & 255]) * 2;
                            int var10000 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field5274[var15] + var8;
                            int var17 = -(var11 << 12) + -this.field5274[var27] + var4;
                            int var18 = this.field5270;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (~var18 != -5) {
                                        if (~var18 != -6) {
                                            if (var18 == 2) {
                                                var19 = (var16 >= 0 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 - -var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var17 > -1 ? -var17 : var17;
                                    int var26 = ~var16 <= -1 ? var16 : -var16;
                                    var19 = ~var26 >= ~var25 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class521.field7600 <= var19) {
                                if (var19 >= class515.field7472) {
                                    if (var19 < class79.field1287) {
                                        class311.field4633 = class79.field1287;
                                        class79.field1287 = var19;
                                    } else if (var19 < class311.field4633) {
                                        class311.field4633 = var19;
                                    }
                                } else {
                                    class311.field4633 = class79.field1287;
                                    class79.field1287 = class515.field7472;
                                    class515.field7472 = var19;
                                }
                            } else {
                                class311.field4633 = class79.field1287;
                                class79.field1287 = class515.field7472;
                                class515.field7472 = class521.field7600;
                                class521.field7600 = var19;
                            }
                        }
                    }
                    int var12 = this.field5272;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (~var12 != -4) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = -class521.field7600 + class515.field7472;
                                    }
                                } else {
                                    var3[var7] = class311.field4633;
                                }
                            } else {
                                var3[var7] = class79.field1287;
                            }
                        } else {
                            var3[var7] = class515.field7472;
                        }
                    } else {
                        var3[var7] = class521.field7600;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 239)
    public static void method2238(int arg0) {
        field5276 = null;
        field5277 = null;
        if (arg0 != 4096) {
            method2240(10, -80, 122, 44);
        }
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V", line = 252)
    private final void method2239(int arg0) {
        ++field5278;
        Random var2 = new Random((long) this.field5269);
        int var3 = -59 / ((arg0 - -3) / 43);
        this.field5274 = new short[512];
        if (~this.field5275 < -1) {
            for (int var4 = 0; ~var4 > -513; ++var4) {
                this.field5274[var4] = (short) class392.method2360(Integer.MIN_VALUE, var2, this.field5275);
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILwn;I)V", line = 284)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 == -6232) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (~arg0 != -6) {
                                    if (arg0 == 6) {
                                        this.field5266 = arg1.method3072((byte) -128);
                                    }
                                } else {
                                    this.field5265 = arg1.method3072((byte) -120);
                                }
                            } else {
                                this.field5270 = arg1.method3072((byte) -120);
                            }
                        } else {
                            this.field5272 = arg1.method3072((byte) -127);
                        }
                    } else {
                        this.field5275 = arg1.method3018(arg2 ^ -566984816);
                    }
                } else {
                    this.field5269 = arg1.method3072((byte) -123);
                }
            } else {
                this.field5265 = this.field5266 = arg1.method3072((byte) -125);
            }
            ++field5273;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIII)I", line = 386)
    public static final int method2240(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        ++field5279;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return -arg1 + 1023;
        } else if (var4 == 2) {
            return -arg0 + 1023;
        } else {
            if (arg3 != 2048) {
                field5276 = null;
            }
            return arg1;
        }
    }
}
