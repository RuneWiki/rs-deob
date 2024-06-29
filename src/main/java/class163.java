import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class163 extends class185 {

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    private int field2502 = 1;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    private int field2503 = 0;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    private int field2506 = 0;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field2505 = 100;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field2501 = 0;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "J")
    public static long field2507;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "[[[B")
    public static byte[][][] field2508;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)I")
    public static final int method1006(int arg0, int arg1) {
        ++field2510;
        if (arg1 != 0) {
            return 83;
        } else if (~arg0 < -1) {
            return 1;
        } else {
            return ~arg0 > -1 ? -1 : 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IILpf;B)[Lpj;")
    public static final class255[] method1007(int arg0, int arg1, class294 arg2, byte arg3) {
        ++field2498;
        if (!class66.method451(arg2, arg0, 2048, arg1)) {
            return null;
        } else {
            if (arg3 <= 110) {
                field2507 = -20L;
            }
            return class18.method125(-10882);
        }
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V")
    public static void method1008(int arg0) {
        if (arg0 > 108) {
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IBI)V")
    public static final void method1009(int arg0, byte arg1, int arg2) {
        if (class174.field2648 != arg0) {
            class153.field2304 = new int[arg0];
            for (int var3 = 0; arg0 > var3; ++var3) {
                class153.field2304[var3] = (var3 << 12) / arg0;
            }
            class53.field873 = arg0 - 1;
            class174.field2648 = arg0;
            class49.field782 = arg0 * 32;
        }
        ++field2497;
        int var4 = 93 / ((arg1 - -73) / 34);
        if (~class130.field1933 != ~arg2) {
            if (~class174.field2648 == ~arg2) {
                class85.field1356 = class153.field2304;
            } else {
                class85.field1356 = new int[arg2];
                for (int var5 = 0; arg2 > var5; ++var5) {
                    class85.field1356[var5] = (var5 << 12) / arg2;
                }
            }
            class130.field1933 = arg2;
            class10.field133 = arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 <= 70) {
            field2501 = -57;
        }
        ++field2504;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int var4 = class85.field1356[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class174.field2648 < ~var6; ++var6) {
                int var7 = class153.field2304[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field2506 == -1) {
                    var9 = (-var4 + var7) * this.field2502;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field2502 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field2503 != 0) {
                    if (this.field2503 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class97.field1523[(4089 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZLrf;Z)V")
    public static final void method1010(boolean arg0, class289 arg1, boolean arg2) {
        ++field2509;
        if (!arg2) {
            field2505 = 84;
        }
        int var3 = arg1.field4423 != 0 ? arg1.field4423 : arg1.field4478;
        int var4 = arg1.field4558 == 0 ? arg1.field4444 : arg1.field4558;
        class39.method230(class234.field3532[arg1.field4504 >> 16], var3, arg0, 0, var4, arg1.field4504);
        if (arg1.field4472 != null) {
            class39.method230(arg1.field4472, var3, arg0, 0, var4, arg1.field4504);
        }
        class199 var5 = (class199) class229.field3449.method1666((long) arg1.field4504, (byte) 33);
        if (var5 != null) {
            class204.method1294(arg0, var4, var3, var5.field3026, 64);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        class82.method546(-13376);
        ++field2500;
        if (arg0 != -9) {
            field2507 = 83L;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field2499;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field2502 = arg1.method1593((byte) 27);
                }
            } else {
                this.field2503 = arg1.method1593((byte) 27);
            }
        } else {
            this.field2506 = arg1.method1593((byte) 27);
        }
        if (arg2 != -6357) {
            method1009(-125, (byte) 2, 106);
        }
    }
}
