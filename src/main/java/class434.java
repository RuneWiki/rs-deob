import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class434 extends class227 {

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    private int field6327 = 2;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    private int field6331 = 5;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    private int field6329 = 5;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    private int field6333 = 0;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "[S")
    private short[] field6335 = new short[512];

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "[B")
    private byte[] field6340 = new byte[512];

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    private int field6341 = 2048;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private int field6339 = 1;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field6328 = 0;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "Lao;")
    public static class191 field6334;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "Lfo;")
    public static class361 field6336;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "[Lo;")
    public static class24[] field6332;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BII)I")
    public static final int method2668(byte arg0, int arg1, int arg2) {
        ++field6330;
        if (arg2 != 4 && arg2 != 5) {
            if (arg0 <= 65) {
                method2671(-111, -79, -96);
            }
            return 256;
        } else {
            return class58.field682[3 & arg1];
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    private final void method2669(byte arg0) {
        ++field6338;
        if (arg0 != 13) {
            this.method61((class396) null, 24, -27);
        }
        Random var2 = new Random((long) this.field6333);
        this.field6335 = new short[512];
        if (~this.field6341 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field6335[var3] = (short) class477.method2908((byte) -127, var2, this.field6341);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)V")
    public static final void method2670(int arg0) {
        ++field6337;
        if (!class319.field4261) {
            class319.field4261 = true;
            class419.field6089 = true;
            if (!class319.field4256.field4651) {
                class283.field3745 += (-12.0F - class283.field3745) / 2.0F;
            } else {
                class199.field2650 = (float) (-16 & (int) class199.field2650 + -17);
            }
            if (arg0 != 1) {
                method2671(-102, -21, 101);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)Lvv;")
    public static final class215 method2671(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        return var3 != null && var3.field7268 != null ? var3.field7268 : null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class434() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field6331 = arg0.method2388((byte) -116);
                                }
                            } else {
                                this.field6329 = arg0.method2388((byte) -112);
                            }
                        } else {
                            this.field6339 = arg0.method2388((byte) -120);
                        }
                    } else {
                        this.field6327 = arg0.method2388((byte) -111);
                    }
                } else {
                    this.field6341 = arg0.method2386(arg1 ^ -487197780);
                }
            } else {
                this.field6333 = arg0.method2388((byte) -125);
            }
        } else {
            this.field6329 = this.field6331 = arg0.method2388((byte) -116);
        }
        if (arg1 == 487215116) {
            ++field6342;
        }
    }

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)V")
    public static void method2672(int arg0) {
        field6336 = null;
        if (arg0 <= 27) {
            method2670(-44);
        }
        field6334 = null;
        field6332 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        if (arg0 != 15811) {
            return null;
        } else {
            ++field6326;
            int[] var3 = super.field3068.method1970(arg1, (byte) 100);
            if (super.field3068.field4480) {
                int var4 = class190.field2457[arg1] * this.field6331 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class446.field6486; ++var7) {
                    class509.field7373 = Integer.MAX_VALUE;
                    class304.field4042 = Integer.MAX_VALUE;
                    class507.field7350 = Integer.MAX_VALUE;
                    class386.field5621 = Integer.MAX_VALUE;
                    int var8 = class4.field37[var7] * this.field6329 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                        int var13 = 255 & this.field6340[(~this.field6331 < ~var11 ? var11 : -this.field6331 + var11) & 255];
                        for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                            int var15 = (255 & this.field6340[var13 - -(var14 < this.field6329 ? var14 : -this.field6329 + var14) & 255]) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field6335[var15] - (var14 << 12) + var8;
                            int var17 = -this.field6335[var27] - (var11 << 12) + var4;
                            int var18 = this.field6339;
                            int var19;
                            if (var18 != 1) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (var17 >= 0 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 <= -1 ? var16 : -var16;
                                    int var26 = ~var17 > -1 ? -var17 : var17;
                                    var19 = var25 <= var26 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class386.field5621 <= var19) {
                                if (class507.field7350 <= var19) {
                                    if (~class304.field4042 < ~var19) {
                                        class509.field7373 = class304.field4042;
                                        class304.field4042 = var19;
                                    } else if (~class509.field7373 < ~var19) {
                                        class509.field7373 = var19;
                                    }
                                } else {
                                    class509.field7373 = class304.field4042;
                                    class304.field4042 = class507.field7350;
                                    class507.field7350 = var19;
                                }
                            } else {
                                class509.field7373 = class304.field4042;
                                class304.field4042 = class507.field7350;
                                class507.field7350 = class386.field5621;
                                class386.field5621 = var19;
                            }
                        }
                    }
                    int var12 = this.field6327;
                    if (~var12 != -1) {
                        if (~var12 != -2) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (var12 == 2) {
                                        var3[var7] = -class386.field5621 + class507.field7350;
                                    }
                                } else {
                                    var3[var7] = class509.field7373;
                                }
                            } else {
                                var3[var7] = class304.field4042;
                            }
                        } else {
                            var3[var7] = class507.field7350;
                        }
                    } else {
                        var3[var7] = class386.field5621;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public final void method877(int arg0) {
        this.field6340 = class33.method185(this.field6333, (byte) -1);
        ++field6343;
        this.method2669((byte) 13);
        if (arg0 != 1) {
            this.method61((class396) null, 67, -10);
        }
    }
}
