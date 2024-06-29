import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class212 extends class8 {

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field3459 = 5;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "[B")
    private byte[] field3463 = new byte[512];

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field3460 = 5;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    private int field3465 = 2;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    private int field3461 = 0;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    private int field3469 = 2048;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    private int field3468 = 1;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "[S")
    private short[] field3471 = new short[512];

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field3456 = -1;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field3472 = "Starting 3d Library";

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Lmg;")
    public static class265 field3467 = null;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lqh;")
    public static class201 field3454;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "[I")
    public static int[] field3455;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        ++field3458;
        this.field3463 = class239.method1655(this.field3461, arg0);
        this.method1459((byte) 87);
        if (arg0) {
            field3472 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    private final void method1459(byte arg0) {
        ++field3457;
        if (arg0 != 87) {
            this.field3460 = 100;
        }
        Random var2 = new Random((long) this.field3461);
        this.field3471 = new short[512];
        if (~this.field3469 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3471[var3] = (short) class142.method982(-396321952, this.field3469, var2);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
    public static final void method1460(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -12) {
            method1462(-17);
        }
        if (class94.field1550 != 0 && ~arg2 != -1 && class221.field3623 < 50 && ~arg3 != 0) {
            class204.field3276[class221.field3623] = arg3;
            class43.field798[class221.field3623] = arg2;
            class161.field2562[class221.field3623] = arg0;
            class56.field962[class221.field3623] = null;
            class154.field2493[class221.field3623] = 0;
            ++class221.field3623;
        }
        ++field3466;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3460 = arg1.method1517((byte) -96);
                                }
                            } else {
                                this.field3459 = arg1.method1517((byte) -96);
                            }
                        } else {
                            this.field3468 = arg1.method1517((byte) -96);
                        }
                    } else {
                        this.field3465 = arg1.method1517((byte) -96);
                    }
                } else {
                    this.field3469 = arg1.method1521((byte) 113);
                }
            } else {
                this.field3461 = arg1.method1517((byte) -96);
            }
        } else {
            this.field3459 = this.field3460 = arg1.method1517((byte) -96);
        }
        ++field3470;
        if (arg0 <= 62) {
            this.method1459((byte) 104);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class212() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIBI)I")
    public static final int method1461(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -class69.field1137[arg2 * 1024 / arg0] + 65536 >> 1;
        ++field3462;
        if (arg3 <= 66) {
            method1461(84, -94, -59, (byte) 39, -125);
        }
        return ((-var5 + 65536) * arg4 >> 16) - -(arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field3453;
        if (arg0 != 3) {
            this.method1459((byte) -80);
        }
        int[] var3 = super.field110.method1585(0, arg1);
        if (super.field110.field3734) {
            int var4 = class182.field2864[arg1] * this.field3460 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class231.field3798; ++var7) {
                class72.field1187 = Integer.MAX_VALUE;
                class68.field1133 = Integer.MAX_VALUE;
                class259.field4127 = Integer.MAX_VALUE;
                class29.field459 = Integer.MAX_VALUE;
                int var8 = class176.field2776[var7] * this.field3459 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field3463[(~this.field3460 < ~var11 ? var11 : -this.field3460 + var11) & 255];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field3463[(this.field3459 > var14 ? var14 : -this.field3459 + var14) + var13 & 255]);
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field3471[var15] + -(var14 << 12);
                        int var17 = -this.field3471[var27] + var4 + -(var11 << 12);
                        int var18 = this.field3468;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class29.field459 > var19) {
                            class72.field1187 = class68.field1133;
                            class68.field1133 = class259.field4127;
                            class259.field4127 = class29.field459;
                            class29.field459 = var19;
                        } else if (~var19 <= ~class259.field4127) {
                            if (class68.field1133 > var19) {
                                class72.field1187 = class68.field1133;
                                class68.field1133 = var19;
                            } else if (~class72.field1187 < ~var19) {
                                class72.field1187 = var19;
                            }
                        } else {
                            class72.field1187 = class68.field1133;
                            class68.field1133 = class259.field4127;
                            class259.field4127 = var19;
                        }
                    }
                }
                int var12 = this.field3465;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class29.field459 + class259.field4127;
                                }
                            } else {
                                var3[var7] = class72.field1187;
                            }
                        } else {
                            var3[var7] = class68.field1133;
                        }
                    } else {
                        var3[var7] = class259.field4127;
                    }
                } else {
                    var3[var7] = class29.field459;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static void method1462(int arg0) {
        field3455 = null;
        field3472 = null;
        field3467 = null;
        if (arg0 != 29558) {
            method1461(-44, 41, 94, (byte) -16, 8);
        }
        field3454 = null;
    }
}
