import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class193 extends class89 {

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    private int field3460 = 2;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "[B")
    private byte[] field3456 = new byte[512];

    @OriginalMember(owner = "client!q", name = "T", descriptor = "[S")
    private short[] field3457 = new short[512];

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    private int field3461 = 2048;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "I")
    private int field3467 = 1;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    private int field3459 = 0;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
    private int field3471 = 5;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    private int field3465 = 5;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "Lwf;")
    public static class16 field3462 = new class16(64);

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "Z")
    public static boolean field3469 = false;

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "I")
    public static int field3473 = 0;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
    public static void method1395(boolean arg0) {
        field3462 = null;
        if (arg0) {
            method1396(90, -25, -11);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        this.field3456 = class10.method53(0, this.field3459);
        this.method1397(512);
        if (!arg0) {
            field3473 = -82;
        }
        ++field3470;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III)Lue;")
    public static final class197 method1396(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field3585; ++var4) {
                class197 var5 = var3.field3600[var4];
                if ((var5.field3523 >> 29 & 3L) == 2L && var5.field3541 == arg1 && var5.field3533 == arg2) {
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -111 % ((51 - arg1) / 44);
        ++field3472;
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int var5 = class87.field1652[arg0] * this.field3465 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; ~class241.field4284 < ~var8; ++var8) {
                class183.field3283 = Integer.MAX_VALUE;
                class215.field3810 = Integer.MAX_VALUE;
                class261.field4544 = Integer.MAX_VALUE;
                class144.field2611 = Integer.MAX_VALUE;
                int var9 = class259.field4523[var8] * this.field3471 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 - -1;
                for (int var12 = var6 + -1; var12 <= var7; ++var12) {
                    int var14 = 255 & this.field3456[(~var12 <= ~this.field3465 ? var12 - this.field3465 : var12) & 255];
                    for (int var15 = var10 + -1; ~var11 <= ~var15; ++var15) {
                        int var16 = (this.field3456[255 & (~this.field3471 >= ~var15 ? -this.field3471 + var15 : var15) + var14] & 255) * 2;
                        int var10000 = -(var15 << 12);
                        int var28 = var16 + 1;
                        int var17 = var10000 - this.field3457[var16] + var9;
                        int var18 = -(var12 << 12) - this.field3457[var28] + var5;
                        int var19 = this.field3467;
                        int var20;
                        if (~var19 != -2) {
                            if (~var19 != -4) {
                                if (var19 != 4) {
                                    if (~var19 != -6) {
                                        if (var19 == 2) {
                                            var20 = (var18 >= 0 ? var18 : -var18) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (~var18 <= -1 ? var18 : -var18) / 4096.0F)));
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                int var27 = ~var18 > -1 ? -var18 : var18;
                                var20 = ~var27 > ~var26 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (~class144.field2611 >= ~var20) {
                            if (class261.field4544 <= var20) {
                                if (~var20 > ~class215.field3810) {
                                    class183.field3283 = class215.field3810;
                                    class215.field3810 = var20;
                                } else if (~class183.field3283 < ~var20) {
                                    class183.field3283 = var20;
                                }
                            } else {
                                class183.field3283 = class215.field3810;
                                class215.field3810 = class261.field4544;
                                class261.field4544 = var20;
                            }
                        } else {
                            class183.field3283 = class215.field3810;
                            class215.field3810 = class261.field4544;
                            class261.field4544 = class144.field2611;
                            class144.field2611 = var20;
                        }
                    }
                }
                int var13 = this.field3460;
                if (var13 != 0) {
                    if (~var13 != -2) {
                        if (var13 != 3) {
                            if (var13 != 4) {
                                if (~var13 == -3) {
                                    var4[var8] = -class144.field2611 + class261.field4544;
                                }
                            } else {
                                var4[var8] = class183.field3283;
                            }
                        } else {
                            var4[var8] = class215.field3810;
                        }
                    } else {
                        var4[var8] = class261.field4544;
                    }
                } else {
                    var4[var8] = class144.field2611;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    private final void method1397(int arg0) {
        ++field3464;
        Random var2 = new Random((long) this.field3459);
        if (arg0 != 512) {
            method1398(27, false, 59, true, false);
        }
        this.field3457 = new short[512];
        if (~this.field3461 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3457[var3] = (short) class98.method761(var2, false, this.field3461);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZIZZ)Lpi;")
    public static final class181 method1398(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        int var5 = 78 % ((arg0 - 17) / 46);
        ++field3466;
        class73 var6 = null;
        if (class30.field580 != null) {
            var6 = new class73(arg2, class30.field580, class158.field2818[arg2], 1000000);
        }
        class119.field2236[arg2] = class268.field4633.method751(class134.field2428, arg2, var6, 255);
        if (arg4) {
            class119.field2236[arg2].method1578(0);
        }
        return new class181(class119.field2236[arg2], arg1, arg3);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        ++field3463;
        if (arg1 == -641641492) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (arg2 == 6) {
                                        this.field3465 = arg0.method558(1);
                                    }
                                } else {
                                    this.field3471 = arg0.method558(1);
                                }
                            } else {
                                this.field3467 = arg0.method558(1);
                            }
                        } else {
                            this.field3460 = arg0.method558(1);
                        }
                    } else {
                        this.field3461 = arg0.method545((byte) 43);
                    }
                } else {
                    this.field3459 = arg0.method558(arg1 + 641641493);
                }
            } else {
                this.field3471 = this.field3465 = arg0.method558(1);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }
}
