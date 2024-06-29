import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class298 extends class354 {

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "[B")
    private byte[] field4384 = new byte[512];

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "[S")
    private short[] field4391 = new short[512];

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    private int field4397 = 5;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    private int field4396 = 0;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    private int field4390 = 1;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    private int field4394 = 2;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    private int field4387 = 5;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    private int field4393 = 2048;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Z")
    public static boolean field4388 = false;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "[I")
    public static int[] field4398 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "Lni;")
    public static class367 field4399 = new class367(12, -1);

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field4387 = arg0.method1087(false);
                                }
                            } else {
                                this.field4397 = arg0.method1087(false);
                            }
                        } else {
                            this.field4390 = arg0.method1087(false);
                        }
                    } else {
                        this.field4394 = arg0.method1087(false);
                    }
                } else {
                    this.field4393 = arg0.method1074(-635989152);
                }
            } else {
                this.field4396 = arg0.method1087(false);
            }
        } else {
            this.field4397 = this.field4387 = arg0.method1087(false);
        }
        if (arg2 != 1638) {
            this.field4397 = -63;
        }
        ++field4395;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
    private final void method1898(byte arg0) {
        ++field4386;
        Random var2 = new Random((long) this.field4396);
        this.field4391 = new short[512];
        if (~this.field4393 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field4391[var3] = (short) class491.method2931(var2, Integer.MIN_VALUE, this.field4393);
            }
        }
        if (arg0 != 114) {
            method1900((byte) -25);
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class298() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)I")
    public static final int method1899(int arg0, int arg1, int arg2, int arg3) {
        ++field4389;
        int var4 = arg1 & 3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return -arg2 + 7;
        } else {
            return ~var4 == arg0 ? -arg3 + 7 : arg2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        if (arg0 >= -74) {
            this.field4396 = 9;
        }
        ++field4385;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int var4 = class350.field5392[arg1] * this.field4387 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class531.field7814 < ~var7; ++var7) {
                class397.field6055 = Integer.MAX_VALUE;
                class129.field1741 = Integer.MAX_VALUE;
                class187.field2517 = Integer.MAX_VALUE;
                class289.field4228 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class195.field2616[var7] * this.field4397);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field4384[255 & (var11 < this.field4387 ? var11 : -this.field4387 + var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (255 & this.field4384[(this.field4397 <= var14 ? -this.field4397 + var14 : var14) + var13 & 255]) * 2;
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field4391[var15]);
                        int var17 = -this.field4391[var27] - ((var11 << 12) - var4);
                        int var18 = this.field4390;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class289.field4228 > var19) {
                            class397.field6055 = class129.field1741;
                            class129.field1741 = class187.field2517;
                            class187.field2517 = class289.field4228;
                            class289.field4228 = var19;
                        } else if (var19 >= class187.field2517) {
                            if (class129.field1741 > var19) {
                                class397.field6055 = class129.field1741;
                                class129.field1741 = var19;
                            } else if (class397.field6055 > var19) {
                                class397.field6055 = var19;
                            }
                        } else {
                            class397.field6055 = class129.field1741;
                            class129.field1741 = class187.field2517;
                            class187.field2517 = var19;
                        }
                    }
                }
                int var12 = this.field4394;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class289.field4228 + class187.field2517;
                                }
                            } else {
                                var3[var7] = class397.field6055;
                            }
                        } else {
                            var3[var7] = class129.field1741;
                        }
                    } else {
                        var3[var7] = class187.field2517;
                    }
                } else {
                    var3[var7] = class289.field4228;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 <= 28) {
            this.field4387 = -121;
        }
        ++field4392;
        this.field4384 = class376.method2365((byte) -19, this.field4396);
        this.method1898((byte) 114);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
    public static void method1900(byte arg0) {
        int var1 = -100 / ((arg0 - 39) / 58);
        field4399 = null;
        field4398 = null;
    }
}
