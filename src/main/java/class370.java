import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class370 extends class136 {

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "I")
    private int field5492 = 5;

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "[S")
    private short[] field5491 = new short[512];

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "[B")
    private byte[] field5495 = new byte[512];

    @OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
    private int field5494 = 2048;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
    private int field5497 = 2;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    private int field5498 = 1;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    private int field5499 = 5;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
    private int field5490 = 0;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    public static int field5500 = 0;

    @OriginalMember(owner = "client!tp", name = "F", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!tp", name = "R", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!tp", name = "S", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!tp", name = "J", descriptor = "Ll;")
    public static class16 field5496;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method82(int arg0, int arg1) {
        ++field5501;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = -72 / ((arg0 - 67) / 50);
        if (super.field1957.field7031) {
            int var5 = class290.field4168[arg1] * this.field5499 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class467.field6889; ++var8) {
                class474.field6990 = Integer.MAX_VALUE;
                class472.field6971 = Integer.MAX_VALUE;
                class8.field96 = Integer.MAX_VALUE;
                class11.field134 = Integer.MAX_VALUE;
                int var9 = class453.field6672[var8] * this.field5492 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; ~var12 >= ~var7; ++var12) {
                    int var14 = this.field5495[255 & (~var12 <= ~this.field5499 ? -this.field5499 + var12 : var12)] & 255;
                    for (int var15 = var10 + -1; var11 >= var15; ++var15) {
                        int var16 = 2 * (255 & this.field5495[(~var15 <= ~this.field5492 ? var15 - this.field5492 : var15) + var14 & 255]);
                        int var10000 = var9 - (var15 << 12);
                        int var28 = var16 + 1;
                        int var17 = var10000 - this.field5491[var16];
                        int var18 = -(var12 << 12) + -this.field5491[var28] + var5;
                        int var19 = this.field5498;
                        int var20;
                        if (~var19 != -2) {
                            if (var19 != 3) {
                                if (~var19 != -5) {
                                    if (var19 != 5) {
                                        if (var19 == 2) {
                                            var20 = (var17 >= 0 ? var17 : -var17) + (~var18 <= -1 ? var18 : -var18);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (var18 >= 0 ? var18 : -var18) / 4096.0F)));
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = var18 >= 0 ? var18 : -var18;
                                int var27 = var17 < 0 ? -var17 : var17;
                                var20 = var26 >= var27 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 - -(var18 * var18) >> 12;
                        }
                        if (var20 < class11.field134) {
                            class474.field6990 = class472.field6971;
                            class472.field6971 = class8.field96;
                            class8.field96 = class11.field134;
                            class11.field134 = var20;
                        } else if (class8.field96 > var20) {
                            class474.field6990 = class472.field6971;
                            class472.field6971 = class8.field96;
                            class8.field96 = var20;
                        } else if (~class472.field6971 >= ~var20) {
                            if (var20 < class474.field6990) {
                                class474.field6990 = var20;
                            }
                        } else {
                            class474.field6990 = class472.field6971;
                            class472.field6971 = var20;
                        }
                    }
                }
                int var13 = this.field5497;
                if (~var13 != -1) {
                    if (~var13 != -2) {
                        if (var13 != 3) {
                            if (var13 != 4) {
                                if (var13 == 2) {
                                    var3[var8] = -class11.field134 + class8.field96;
                                }
                            } else {
                                var3[var8] = class474.field6990;
                            }
                        } else {
                            var3[var8] = class472.field6971;
                        }
                    } else {
                        var3[var8] = class8.field96;
                    }
                } else {
                    var3[var8] = class11.field134;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V", line = 376)
    public class370() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "(I)V", line = 238)
    private final void method2283(int arg0) {
        ++field5505;
        if (arg0 >= -5) {
            this.field5491 = null;
        }
        Random var2 = new Random((long) this.field5490);
        this.field5491 = new short[512];
        if (this.field5494 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field5491[var3] = (short) class245.method1609((byte) 94, var2, this.field5494);
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 264)
    public final void method269(boolean arg0) {
        this.field5495 = class262.method1678(-29, this.field5490);
        ++field5504;
        if (arg0) {
            this.method82(-116, -19);
        }
        this.method2283(-75);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IJ)V", line = 281)
    public static final void method2284(int arg0, long arg1) {
        if (arg0 > 14) {
            ++field5503;
            try {
                Thread.sleep(arg1);
            } catch (InterruptedException var3) {
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILiv;)V", line = 295)
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            this.method2283(7);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field5499 = arg2.method577(arg0 + 251);
                                }
                            } else {
                                this.field5492 = arg2.method577(255);
                            }
                        } else {
                            this.field5498 = arg2.method577(255);
                        }
                    } else {
                        this.field5497 = arg2.method577(255);
                    }
                } else {
                    this.field5494 = arg2.method623((byte) 108);
                }
            } else {
                this.field5490 = arg2.method577(arg0 ^ 251);
            }
        } else {
            this.field5492 = this.field5499 = arg2.method577(arg0 + 251);
        }
        ++field5502;
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V", line = 385)
    public static void method2285(byte arg0) {
        int var1 = 118 % ((arg0 - 23) / 33);
        field5496 = null;
    }
}
