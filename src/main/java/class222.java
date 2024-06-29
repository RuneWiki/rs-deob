import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class222 extends class167 {

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    private int field3999 = 2048;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    private int field4001 = 5;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    private int field4000 = 0;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    private int field4008 = 2;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "[B")
    private byte[] field4003 = new byte[512];

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "[S")
    private short[] field4004 = new short[512];

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    private int field4014 = 5;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    private int field4013 = 1;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "Lkh;")
    public static class117 field4005 = class224.method1450((byte) 121, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
    public static int[] field4007 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "[I")
    public static int[] field4006 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Lai;")
    public static class10 field4002;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "Lvb;")
    public static class232 field4012;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1441(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class194.field3463 * arg3 + class147.field2693 * arg0 >> 16;
        int var6 = class147.field2693 * arg3 - class194.field3463 * arg0 >> 16;
        int var7 = class41.field930 * var6 + class161.field2940 * arg1 >> 16;
        int var8 = class41.field930 * arg1 - class161.field2940 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class41.field930 * var6 + class161.field2940 * arg2 >> 16;
        int var12 = class41.field930 * arg2 - class161.field2940 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class170.field3056 && var13 < class170.field3056) {
            return false;
        } else if (var9 > class151.field2745 && var13 > class151.field2745) {
            return false;
        } else if (var10 < class200.field3616 && var14 < class200.field3616) {
            return false;
        } else {
            return var10 <= class205.field3695 || var14 <= class205.field3695;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method1442(boolean arg0) {
        field4007 = null;
        if (arg0) {
            field4002 = null;
            field4006 = null;
            field4012 = null;
            field4005 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field4009;
        this.field4003 = class128.method874(255, this.field4000);
        this.method1443(28593);
        int var2 = 110 / ((arg0 - -18) / 59);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
    private final void method1443(int arg0) {
        ++field4011;
        Random var2 = new Random((long) this.field4000);
        if (arg0 != 28593) {
            this.field4008 = 30;
        }
        this.field4004 = new short[512];
        if (~this.field3999 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4004[var3] = (short) class223.method1447(this.field3999, var2, (byte) -79);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (arg0 != -96) {
            this.method262(2);
        }
        ++field3998;
        if (super.field3013.field4085) {
            int var4 = class143.field2583[arg1] * this.field4001 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; var7 < class115.field2146; ++var7) {
                class81.field1516 = Integer.MAX_VALUE;
                class20.field549 = Integer.MAX_VALUE;
                class246.field4530 = Integer.MAX_VALUE;
                class106.field1930 = Integer.MAX_VALUE;
                int var8 = class70.field1350[var7] * this.field4014 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field4003[255 & (this.field4001 <= var11 ? var11 - this.field4001 : var11)];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field4003[255 & var13 + (this.field4014 > var14 ? var14 : -this.field4014 + var14)] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field4004[var15] + -(var14 << 12);
                        int var17 = -(var11 << 12) - this.field4004[var27] + var4;
                        int var18 = this.field4013;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = var26 < var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class106.field1930) {
                            class81.field1516 = class20.field549;
                            class20.field549 = class246.field4530;
                            class246.field4530 = class106.field1930;
                            class106.field1930 = var19;
                        } else if (class246.field4530 <= var19) {
                            if (class20.field549 > var19) {
                                class81.field1516 = class20.field549;
                                class20.field549 = var19;
                            } else if (var19 < class81.field1516) {
                                class81.field1516 = var19;
                            }
                        } else {
                            class81.field1516 = class20.field549;
                            class20.field549 = class246.field4530;
                            class246.field4530 = var19;
                        }
                    }
                }
                int var12 = this.field4008;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = class246.field4530 - class106.field1930;
                                }
                            } else {
                                var3[var7] = class81.field1516;
                            }
                        } else {
                            var3[var7] = class20.field549;
                        }
                    } else {
                        var3[var7] = class246.field4530;
                    }
                } else {
                    var3[var7] = class106.field1930;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field4013 = 90;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field4001 = arg0.method998(71);
                                }
                            } else {
                                this.field4014 = arg0.method998(74);
                            }
                        } else {
                            this.field4013 = arg0.method998(83);
                        }
                    } else {
                        this.field4008 = arg0.method998(67);
                    }
                } else {
                    this.field3999 = arg0.method1049((byte) 114);
                }
            } else {
                this.field4000 = arg0.method998(109);
            }
        } else {
            this.field4014 = this.field4001 = arg0.method998(66);
        }
        ++field4010;
    }
}
