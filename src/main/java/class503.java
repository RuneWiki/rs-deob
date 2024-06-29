import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class503 extends class314 {

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    private int field7361 = 2;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    private int field7359 = 0;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    private int field7362 = 2048;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    private int field7367 = 5;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    private int field7370 = 1;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    private int field7365 = 5;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "[B")
    private byte[] field7369 = new byte[512];

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "[S")
    private short[] field7371 = new short[512];

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLie;I)V", line = 6)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 < -1) {
            ++field7366;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (arg2 == 6) {
                                        this.field7367 = arg1.method70(-9059);
                                    }
                                } else {
                                    this.field7365 = arg1.method70(-9059);
                                }
                            } else {
                                this.field7370 = arg1.method70(-9059);
                            }
                        } else {
                            this.field7361 = arg1.method70(-9059);
                        }
                    } else {
                        this.field7362 = arg1.method67(12021);
                    }
                } else {
                    this.field7359 = arg1.method70(-9059);
                }
            } else {
                this.field7365 = this.field7367 = arg1.method70(-9059);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 403)
    public class503() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method6(int arg0, int arg1) {
        ++field7368;
        int[] var3 = super.field4928.method534((byte) -126, arg0);
        if (arg1 < 109) {
            return null;
        } else {
            if (super.field4928.field618) {
                int var4 = 2048 - -(class657.field9166[arg0] * this.field7367);
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class81.field1009 > var7; ++var7) {
                    class391.field6066 = Integer.MAX_VALUE;
                    class114.field1786 = Integer.MAX_VALUE;
                    class211.field3532 = Integer.MAX_VALUE;
                    class562.field8085 = Integer.MAX_VALUE;
                    int var8 = class328.field5091[var7] * this.field7365 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                        int var13 = this.field7369[(this.field7367 > var11 ? var11 : var11 - this.field7367) & 255] & 255;
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = 2 * (255 & this.field7369[255 & var13 + (var14 >= this.field7365 ? -this.field7365 + var14 : var14)]);
                            int var10000 = -(var14 << 12) + var8;
                            int var27 = var15 + 1;
                            int var16 = var10000 + -this.field7371[var15];
                            int var17 = -this.field7371[var27] - (var11 << 12) + var4;
                            int var18 = this.field7370;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (var17 >= 0 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 - -var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 <= -1 ? var16 : -var16;
                                    int var26 = var17 >= 0 ? var17 : -var17;
                                    var19 = ~var25 >= ~var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class562.field8085 <= var19) {
                                if (class211.field3532 <= var19) {
                                    if (var19 < class114.field1786) {
                                        class391.field6066 = class114.field1786;
                                        class114.field1786 = var19;
                                    } else if (var19 < class391.field6066) {
                                        class391.field6066 = var19;
                                    }
                                } else {
                                    class391.field6066 = class114.field1786;
                                    class114.field1786 = class211.field3532;
                                    class211.field3532 = var19;
                                }
                            } else {
                                class391.field6066 = class114.field1786;
                                class114.field1786 = class211.field3532;
                                class211.field3532 = class562.field8085;
                                class562.field8085 = var19;
                            }
                        }
                    }
                    int var12 = this.field7361;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class562.field8085 + class211.field3532;
                                    }
                                } else {
                                    var3[var7] = class391.field6066;
                                }
                            } else {
                                var3[var7] = class114.field1786;
                            }
                        } else {
                            var3[var7] = class211.field3532;
                        }
                    } else {
                        var3[var7] = class562.field8085;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 313)
    public static final boolean method3059(byte arg0, String arg1) {
        ++field7360;
        if (arg1 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg0 != -77) {
                field7364 = -124;
            }
            while (~class204.field3334 < ~var2) {
                if (arg1.equalsIgnoreCase(class527.field7700[var2])) {
                    return true;
                }
                ++var2;
            }
            return arg1.equalsIgnoreCase(class567.field8141.field4792);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V", line = 348)
    private final void method3060(boolean arg0) {
        ++field7363;
        Random var2 = new Random((long) this.field7359);
        if (arg0) {
            this.method6(-92, -81);
        }
        this.field7371 = new short[512];
        if (~this.field7362 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field7371[var3] = (short) class93.method902(8047, var2, this.field7362);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 385)
    public final void method3(byte arg0) {
        ++field7358;
        this.field7369 = class438.method2777(this.field7359, true);
        if (arg0 != -15) {
            field7364 = 89;
        }
        this.method3060(false);
    }
}
