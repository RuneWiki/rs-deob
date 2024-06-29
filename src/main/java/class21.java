import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 extends class184 {

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "[S")
    private short[] field296 = new short[512];

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    private int field295 = 5;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    private int field294 = 0;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    private int field301 = 2;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "[B")
    private byte[] field303 = new byte[512];

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    private int field300 = 1;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    private int field305 = 2048;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    private int field304 = 5;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "Lub;")
    public static class18 field306 = new class18();

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "Lap;")
    public static class335 field307 = new class335("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "[I")
    public static int[] field308 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V", line = 3)
    public final void method109(boolean arg0) {
        this.field303 = class293.method1722(this.field294, -15477);
        if (arg0) {
            method175(-53);
        }
        ++field290;
        this.method176(512);
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V", line = 21)
    public static void method174(int arg0) {
        field308 = null;
        if (arg0 < -92) {
            field307 = null;
            field306 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 328)
    public class21() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I", line = 50)
    public static final int method175(int arg0) {
        ++field299;
        class38 var1 = class33.field416;
        boolean var2 = false;
        if (~class377.field4959 != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class38.method283((byte) -19, 0, (class476) null, var3, 0, (class278) null);
            var2 = true;
        }
        long var4 = class504.method3034((byte) -99);
        if (arg0 != 25212) {
            return 82;
        } else {
            for (int var6 = 0; ~var6 > -10001; ++var6) {
                var1.method312(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
            }
            int var7 = (int) (-var4 + class504.method3034((byte) -98));
            var1.method364(100, 0, 100, 0, (byte) -48, -16777216);
            if (var2) {
                var1.method275((byte) -126);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V", line = 91)
    private final void method176(int arg0) {
        if (arg0 == 512) {
            ++field298;
            Random var2 = new Random((long) this.field294);
            this.field296 = new short[512];
            if (this.field305 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field296[var3] = (short) class349.method2006(var2, (byte) -46, this.field305);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method6(int arg0, int arg1) {
        ++field302;
        if (arg1 != 578) {
            this.method7((byte) 94, 8, (class463) null);
        }
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int var4 = class334.field4218[arg0] * this.field295 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class245.field3167 < ~var7; ++var7) {
                class496.field7203 = Integer.MAX_VALUE;
                class27.field390 = Integer.MAX_VALUE;
                class296.field3800 = Integer.MAX_VALUE;
                class350.field4505 = Integer.MAX_VALUE;
                int var8 = class347.field4461[var7] * this.field304 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field303[255 & (var11 >= this.field295 ? -this.field295 + var11 : var11)];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field303[var13 - -(~this.field304 >= ~var14 ? -this.field304 + var14 : var14) & 255] & 255);
                        int var10001 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var8 + var10001 + -this.field296[var15];
                        int var17 = -(var11 << 12) + -this.field296[var27] + var4;
                        int var18 = this.field300;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 >= 0 ? var17 : -var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 > -1 ? -var16 : var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class350.field4505 > var19) {
                            class496.field7203 = class27.field390;
                            class27.field390 = class296.field3800;
                            class296.field3800 = class350.field4505;
                            class350.field4505 = var19;
                        } else if (class296.field3800 > var19) {
                            class496.field7203 = class27.field390;
                            class27.field390 = class296.field3800;
                            class296.field3800 = var19;
                        } else if (~var19 <= ~class27.field390) {
                            if (~class496.field7203 < ~var19) {
                                class496.field7203 = var19;
                            }
                        } else {
                            class496.field7203 = class27.field390;
                            class27.field390 = var19;
                        }
                    }
                }
                int var12 = this.field301;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class350.field4505 + class296.field3800;
                                }
                            } else {
                                var3[var7] = class496.field7203;
                            }
                        } else {
                            var3[var7] = class27.field390;
                        }
                    } else {
                        var3[var7] = class296.field3800;
                    }
                } else {
                    var3[var7] = class350.field4505;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLqn;I)Lli;", line = 342)
    public static final class297 method177(int arg0, byte arg1, class47 arg2, int arg3) {
        ++field292;
        if (arg1 != 100) {
            field307 = null;
        }
        byte[] var4 = arg2.method481(arg3, arg0, -97);
        return var4 == null ? null : new class297(var4);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILfh;)V", line = 365)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field293;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field295 = arg2.method2737(false);
                                }
                            } else {
                                this.field304 = arg2.method2737(false);
                            }
                        } else {
                            this.field300 = arg2.method2737(false);
                        }
                    } else {
                        this.field301 = arg2.method2737(false);
                    }
                } else {
                    this.field305 = arg2.method2758((byte) 91);
                }
            } else {
                this.field294 = arg2.method2737(false);
            }
        } else {
            this.field304 = this.field295 = arg2.method2737(false);
        }
        int var5 = -27 % ((arg0 - -13) / 51);
    }
}
