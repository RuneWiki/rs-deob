import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class450 extends class354 {

    @OriginalMember(owner = "client!or", name = "H", descriptor = "[S")
    private short[] field6569 = new short[512];

    @OriginalMember(owner = "client!or", name = "N", descriptor = "I")
    private int field6574 = 2;

    @OriginalMember(owner = "client!or", name = "S", descriptor = "I")
    private int field6579 = 0;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "I")
    private int field6576 = 1;

    @OriginalMember(owner = "client!or", name = "R", descriptor = "I")
    private int field6578 = 5;

    @OriginalMember(owner = "client!or", name = "U", descriptor = "I")
    private int field6581 = 2048;

    @OriginalMember(owner = "client!or", name = "W", descriptor = "I")
    private int field6583 = 5;

    @OriginalMember(owner = "client!or", name = "T", descriptor = "[B")
    private byte[] field6580 = new byte[512];

    @OriginalMember(owner = "client!or", name = "K", descriptor = "Lgf;")
    public static class180 field6571 = new class180("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!or", name = "V", descriptor = "Ljg;")
    public static class223 field6582;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V")
    private final void method2710(int arg0) {
        ++field6577;
        Random var2 = new Random((long) this.field6579);
        this.field6569 = new short[512];
        if (arg0 != 2) {
            this.field6583 = 0;
        }
        if (this.field6581 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field6569[var3] = (short) class104.method790((byte) 90, this.field6581, var2);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field6573;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int var4 = 2048 - -(class278.field4009[arg0] * this.field6578);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; var7 < class404.field5952; ++var7) {
                class81.field1349 = Integer.MAX_VALUE;
                class189.field2791 = Integer.MAX_VALUE;
                class274.field3958 = Integer.MAX_VALUE;
                class62.field1111 = Integer.MAX_VALUE;
                int var8 = class154.field2358[var7] * this.field6583 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field6580[255 & (var11 >= this.field6578 ? -this.field6578 + var11 : var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (this.field6580[255 & (~var14 <= ~this.field6583 ? var14 - this.field6583 : var14) + var13] & 255);
                        int var27 = var15 + 1;
                        int var16 = -this.field6569[var15] - (var14 << 12) + var8;
                        int var17 = -(var11 << 12) + -this.field6569[var27] + var4;
                        int var18 = this.field6576;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = var25 < var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class62.field1111) {
                            class81.field1349 = class189.field2791;
                            class189.field2791 = class274.field3958;
                            class274.field3958 = class62.field1111;
                            class62.field1111 = var19;
                        } else if (var19 < class274.field3958) {
                            class81.field1349 = class189.field2791;
                            class189.field2791 = class274.field3958;
                            class274.field3958 = var19;
                        } else if (~var19 <= ~class189.field2791) {
                            if (~class81.field1349 < ~var19) {
                                class81.field1349 = var19;
                            }
                        } else {
                            class81.field1349 = class189.field2791;
                            class189.field2791 = var19;
                        }
                    }
                }
                int var12 = this.field6574;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = class274.field3958 - class62.field1111;
                                }
                            } else {
                                var3[var7] = class81.field1349;
                            }
                        } else {
                            var3[var7] = class189.field2791;
                        }
                    } else {
                        var3[var7] = class274.field3958;
                    }
                } else {
                    var3[var7] = class62.field1111;
                }
            }
        }
        if (arg1 != -95) {
            this.method771(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)V")
    public static void method2711(int arg0) {
        if (arg0 >= -91) {
            field6571 = null;
        }
        field6571 = null;
        field6582 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field6578 = arg1.method1918((byte) 93);
                                }
                            } else {
                                this.field6583 = arg1.method1918((byte) -45);
                            }
                        } else {
                            this.field6576 = arg1.method1918((byte) 71);
                        }
                    } else {
                        this.field6574 = arg1.method1918((byte) -63);
                    }
                } else {
                    this.field6581 = arg1.method1868(0);
                }
            } else {
                this.field6579 = arg1.method1918((byte) -92);
            }
        } else {
            this.field6583 = this.field6578 = arg1.method1918((byte) -71);
        }
        if (arg0 != 15180) {
            field6582 = null;
        }
        ++field6572;
    }

    @OriginalMember(owner = "client!or", name = "g", descriptor = "(I)V")
    public static final void method2712(int arg0) {
        ++field6570;
        class114.method841(false, class210.field3018);
        ++class205.field2959;
        if (arg0 >= -55) {
            field6582 = null;
        }
        class86.field1436.method1923((byte) 62, class428.method2611(1));
        class86.field1436.method1874(class112.field1780, (byte) -110);
        class86.field1436.method1874(class477.field7003, (byte) -110);
        class86.field1436.method1923((byte) 62, class397.field5830.field142);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
    public class450() {
        super(0, true);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
    public final void method771(boolean arg0) {
        if (arg0) {
            this.method206(54, (class303) null, 74);
        }
        this.field6580 = class173.method1234(this.field6579, (byte) 64);
        ++field6575;
        this.method2710(2);
    }
}
