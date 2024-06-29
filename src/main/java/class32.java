import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class32 extends class739 {

    @OriginalMember(owner = "client!bja", name = "I", descriptor = "I")
    private int field534 = 5;

    @OriginalMember(owner = "client!bja", name = "E", descriptor = "I")
    private int field530 = 1;

    @OriginalMember(owner = "client!bja", name = "G", descriptor = "I")
    private int field532 = 2;

    @OriginalMember(owner = "client!bja", name = "H", descriptor = "I")
    private int field533 = 2048;

    @OriginalMember(owner = "client!bja", name = "L", descriptor = "I")
    private int field537 = 0;

    @OriginalMember(owner = "client!bja", name = "R", descriptor = "[B")
    private byte[] field543 = new byte[512];

    @OriginalMember(owner = "client!bja", name = "P", descriptor = "[S")
    private short[] field541 = new short[512];

    @OriginalMember(owner = "client!bja", name = "M", descriptor = "I")
    private int field538 = 5;

    @OriginalMember(owner = "client!bja", name = "F", descriptor = "[Lfv;")
    public static class124[] field531 = new class124[2048];

    @OriginalMember(owner = "client!bja", name = "J", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!bja", name = "K", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!bja", name = "N", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!bja", name = "O", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!bja", name = "Q", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V")
    private final void method213(byte arg0) {
        ++field535;
        Random var2 = new Random((long) this.field537);
        if (arg0 <= 39) {
            this.method216(-52);
        }
        this.field541 = new short[512];
        if (this.field533 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field541[var3] = (short) class596.method3377(this.field533, var2, -104);
            }
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 == -3) {
            ++field536;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field538 = arg0.method2600((byte) -125);
                                    }
                                } else {
                                    this.field534 = arg0.method2600((byte) -124);
                                }
                            } else {
                                this.field530 = arg0.method2600((byte) -123);
                            }
                        } else {
                            this.field532 = arg0.method2600((byte) -127);
                        }
                    } else {
                        this.field533 = arg0.method2566(-2);
                    }
                } else {
                    this.field537 = arg0.method2600((byte) -127);
                }
            } else {
                this.field534 = this.field538 = arg0.method2600((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        if (arg0 != -23347) {
            return null;
        } else {
            ++field540;
            int[] var3 = super.field10311.method2116(arg1, (byte) 125);
            if (super.field10311.field4728) {
                int var4 = 2048 - -(class287.field3604[arg1] * this.field538);
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class29.field523 > var7; ++var7) {
                    class640.field8888 = Integer.MAX_VALUE;
                    class732.field10188 = Integer.MAX_VALUE;
                    class681.field9498 = Integer.MAX_VALUE;
                    class425.field5712 = Integer.MAX_VALUE;
                    int var8 = 2048 - -(class634.field8751[var7] * this.field534);
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                        int var13 = 255 & this.field543[255 & (this.field538 > var11 ? var11 : var11 - this.field538)];
                        for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                            int var15 = 2 * (255 & this.field543[255 & (~this.field534 >= ~var14 ? -this.field534 + var14 : var14) + var13]);
                            int var10000 = var8 - (var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 - this.field541[var15];
                            int var17 = -(var11 << 12) + var4 + -this.field541[var27];
                            int var18 = this.field530;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (var18 == 2) {
                                                var19 = (~var17 > -1 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 < 0 ? -var17 : var17;
                                    int var26 = var16 >= 0 ? var16 : -var16;
                                    var19 = ~var25 > ~var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class425.field5712 <= var19) {
                                if (~var19 > ~class681.field9498) {
                                    class640.field8888 = class732.field10188;
                                    class732.field10188 = class681.field9498;
                                    class681.field9498 = var19;
                                } else if (var19 < class732.field10188) {
                                    class640.field8888 = class732.field10188;
                                    class732.field10188 = var19;
                                } else if (class640.field8888 > var19) {
                                    class640.field8888 = var19;
                                }
                            } else {
                                class640.field8888 = class732.field10188;
                                class732.field10188 = class681.field9498;
                                class681.field9498 = class425.field5712;
                                class425.field5712 = var19;
                            }
                        }
                    }
                    int var12 = this.field532;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class425.field5712 + class681.field9498;
                                    }
                                } else {
                                    var3[var7] = class640.field8888;
                                }
                            } else {
                                var3[var7] = class732.field10188;
                            }
                        } else {
                            var3[var7] = class681.field9498;
                        }
                    } else {
                        var3[var7] = class425.field5712;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.field543 = class287.method1710(this.field537, arg0 ^ -22004);
        ++field539;
        if (arg0 != -21773) {
            this.method215(62, -1);
        }
        this.method213((byte) 65);
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IIB)I")
    public static final int method217(int arg0, int arg1, byte arg2) {
        ++field542;
        if (~arg1 == 1) {
            return 12345678;
        } else if (~arg1 == 0) {
            if (~arg0 > -3) {
                arg0 = 2;
            } else if (~arg0 < -127) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (127 & arg1) * arg0 >> 7;
            if (arg2 <= 103) {
                return 88;
            } else {
                if (~var3 > -3) {
                    var3 = 2;
                } else if (~var3 < -127) {
                    var3 = 126;
                }
                return (arg1 & 65408) - -var3;
            }
        }
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "(I)V")
    public static void method218(int arg0) {
        if (arg0 == -1) {
            field531 = null;
        }
    }
}
