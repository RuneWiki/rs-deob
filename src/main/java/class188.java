import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class188 extends class23 {

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    private int field3395 = 0;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    private int field3403 = 2;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    private int field3396 = 1;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    private int field3406 = 5;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "[B")
    private byte[] field3402 = new byte[512];

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    private int field3401 = 2048;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "[S")
    private short[] field3404 = new short[512];

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    private int field3412 = 5;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field3398 = 0;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "[I")
    public static int[] field3397 = new int[200];

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "[Lee;")
    public static class246[] field3405 = new class246[50];

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "[J")
    public static long[] field3411 = new long[32];

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Lgf;")
    public static class7 field3399;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "[[[I")
    public static int[][][] field3410;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field3409;
        if (!arg2) {
            field3399 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3406 = arg0.method1265(122);
                                }
                            } else {
                                this.field3412 = arg0.method1265(123);
                            }
                        } else {
                            this.field3396 = arg0.method1265(118);
                        }
                    } else {
                        this.field3403 = arg0.method1265(125);
                    }
                } else {
                    this.field3401 = arg0.method1275(128);
                }
            } else {
                this.field3395 = arg0.method1265(124);
            }
        } else {
            this.field3412 = this.field3406 = arg0.method1265(118);
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field3411 = null;
        field3397 = null;
        field3399 = null;
        field3405 = null;
        if (arg0 > -17) {
            field3398 = -69;
        }
        field3410 = null;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        ++field3408;
        this.field3402 = class34.method233(this.field3395, 26939);
        int var2 = -30 % ((22 - arg0) / 60);
        this.method1221(30818);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    private final void method1221(int arg0) {
        ++field3407;
        if (arg0 != 30818) {
            this.method83((class190) null, 18, false);
        }
        Random var2 = new Random((long) this.field3395);
        this.field3404 = new short[512];
        if (~this.field3401 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3404[var3] = (short) class139.method834((byte) -54, this.field3401, var2);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
    public static final void method1222(int arg0) {
        class171.field3053.method823(true);
        class282.field4971.method823(true);
        class24.field411.method823(true);
        if (arg0 > -87) {
            field3405 = null;
        }
        ++field3400;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field3413;
        if (arg0 > -13) {
            this.field3404 = null;
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int var4 = class31.field495[arg1] * this.field3406 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class72.field1359; ++var7) {
                class97.field1769 = Integer.MAX_VALUE;
                class161.field2905 = Integer.MAX_VALUE;
                class139.field2422 = Integer.MAX_VALUE;
                class170.field3025 = Integer.MAX_VALUE;
                int var8 = class3.field43[var7] * this.field3412 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field3402[255 & (~this.field3406 < ~var11 ? var11 : -this.field3406 + var11)];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = 2 * (255 & this.field3402[var13 + (this.field3412 <= var14 ? -this.field3412 + var14 : var14) & 255]);
                        int var10000 = -(var14 << 12) + var8;
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field3404[var15];
                        int var17 = -this.field3404[var27] + var4 + -(var11 << 12);
                        int var18 = this.field3396;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = var25 < var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class170.field3025 > var19) {
                            class97.field1769 = class161.field2905;
                            class161.field2905 = class139.field2422;
                            class139.field2422 = class170.field3025;
                            class170.field3025 = var19;
                        } else if (class139.field2422 > var19) {
                            class97.field1769 = class161.field2905;
                            class161.field2905 = class139.field2422;
                            class139.field2422 = var19;
                        } else if (var19 >= class161.field2905) {
                            if (~class97.field1769 < ~var19) {
                                class97.field1769 = var19;
                            }
                        } else {
                            class97.field1769 = class161.field2905;
                            class161.field2905 = var19;
                        }
                    }
                }
                int var12 = this.field3403;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class170.field3025 + class139.field2422;
                                }
                            } else {
                                var3[var7] = class97.field1769;
                            }
                        } else {
                            var3[var7] = class161.field2905;
                        }
                    } else {
                        var3[var7] = class139.field2422;
                    }
                } else {
                    var3[var7] = class170.field3025;
                }
            }
        }
        return var3;
    }
}
