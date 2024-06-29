import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class183 extends class200 {

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    private int field3294 = 5;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    private int field3293 = 2048;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "[S")
    private short[] field3295 = new short[512];

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    private int field3302 = 5;

    @OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
    private int field3310 = 0;

    @OriginalMember(owner = "client!je", name = "fb", descriptor = "I")
    private int field3311 = 2;

    @OriginalMember(owner = "client!je", name = "gb", descriptor = "I")
    private int field3312 = 1;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "[B")
    private byte[] field3304 = new byte[512];

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Lid;")
    public static class149 field3297 = class60.method382(")3", (byte) 75);

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    public static int field3305 = 99;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "[I")
    public static int[] field3307 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "Lid;")
    private static class149 field3308 = class60.method382("Hidden", (byte) 93);

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Lid;")
    public static class149 field3300 = field3308;

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "I")
    public static volatile int field3314 = 0;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static volatile int field3306 = 0;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[B")
    public static byte[] field3296;

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "Lid;")
    public static class149 field3315;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!je", name = "db", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
    public static void method1268(byte arg0) {
        if (arg0 == -111) {
            field3296 = null;
            field3297 = null;
            field3300 = null;
            field3308 = null;
            field3307 = null;
            field3315 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1269(int arg0, int arg1, int arg2, long arg3) {
        class231 var5 = class261.field4664[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4053 != null && var5.field4053.field2200 == arg3) {
            return true;
        } else if (var5.field4056 != null && var5.field4056.field2903 == arg3) {
            return true;
        } else if (var5.field4048 != null && var5.field4048.field1765 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4047; ++var6) {
                if (var5.field4061[var6].field338 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field3303;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (arg1 != 55) {
            method1271(27, -67, 56, -12, (byte) -96);
        }
        if (super.field3638.field4887) {
            int var4 = class93.field1644[arg0] * this.field3302 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class137.field2515; ++var7) {
                class252.field4425 = Integer.MAX_VALUE;
                class119.field2041 = Integer.MAX_VALUE;
                class7.field83 = Integer.MAX_VALUE;
                class83.field1522 = Integer.MAX_VALUE;
                int var8 = class73.field1263[var7] * this.field3294 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field3304[(~this.field3302 >= ~var11 ? -this.field3302 + var11 : var11) & 255];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = 2 * (255 & this.field3304[(this.field3294 <= var14 ? var14 - this.field3294 : var14) + var13 & 255]);
                        int var27 = var15 + 1;
                        int var16 = var8 - this.field3295[var15] + -(var14 << 12);
                        int var17 = -this.field3295[var27] - ((var11 << 12) - var4);
                        int var18 = this.field3312;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class83.field1522 > var19) {
                            class252.field4425 = class119.field2041;
                            class119.field2041 = class7.field83;
                            class7.field83 = class83.field1522;
                            class83.field1522 = var19;
                        } else if (class7.field83 <= var19) {
                            if (class119.field2041 <= var19) {
                                if (var19 < class252.field4425) {
                                    class252.field4425 = var19;
                                }
                            } else {
                                class252.field4425 = class119.field2041;
                                class119.field2041 = var19;
                            }
                        } else {
                            class252.field4425 = class119.field2041;
                            class119.field2041 = class7.field83;
                            class7.field83 = var19;
                        }
                    }
                }
                int var12 = this.field3311;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class83.field1522 + class7.field83;
                                }
                            } else {
                                var3[var7] = class252.field4425;
                            }
                        } else {
                            var3[var7] = class119.field2041;
                        }
                    } else {
                        var3[var7] = class7.field83;
                    }
                } else {
                    var3[var7] = class83.field1522;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        int var2 = 35 % ((arg0 - -60) / 62);
        ++field3313;
        this.field3304 = class1.method4(this.field3310, (byte) 109);
        this.method1270((byte) 114);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field3299 = 120;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field3302 = arg0.method489((byte) -68);
                                }
                            } else {
                                this.field3294 = arg0.method489((byte) -114);
                            }
                        } else {
                            this.field3312 = arg0.method489((byte) -111);
                        }
                    } else {
                        this.field3311 = arg0.method489((byte) 96);
                    }
                } else {
                    this.field3293 = arg0.method485(-2386);
                }
            } else {
                this.field3310 = arg0.method489((byte) -32);
            }
        } else {
            this.field3294 = this.field3302 = arg0.method489((byte) 102);
        }
        ++field3298;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(B)V")
    private final void method1270(byte arg0) {
        if (arg0 > 106) {
            ++field3301;
            Random var2 = new Random((long) this.field3310);
            this.field3295 = new short[512];
            if (this.field3293 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field3295[var3] = (short) class35.method200(120, var2, this.field3293);
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIB)I")
    public static final int method1271(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 110) {
            method1269(-16, -65, -5, -41L);
        }
        int var5 = -class235.field4118[arg3 * 1024 / arg0] + 65536 >> 1;
        ++field3309;
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class183() {
        super(0, true);
    }

    static {
        int var0 = 0;
        field3296 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var2 <= var1; ++var2) {
                field3296[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3315 = class60.method382("cross", (byte) 19);
    }
}
