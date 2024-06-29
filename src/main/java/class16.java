import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 extends class615 {

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "[B")
    private byte[] field239 = new byte[512];

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    private int field242 = 1;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "[S")
    private short[] field245 = new short[512];

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    private int field244 = 2048;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    private int field250 = 0;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    private int field252 = 5;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    private int field253 = 5;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    private int field251 = 2;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field243 = 13156520;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "[I")
    public static int[] field240 = new int[5];

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Lgj;")
    public static class593 field247 = new class593();

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "[[I")
    public static int[][] field257 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "Ldb;")
    public static class298 field258 = new class298(29, -1);

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "Lbi;")
    public static class449 field254;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 < 44) {
            this.method15((byte) -119, 77, (class335) null);
        }
        ++field246;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field253 = arg2.method2034(255);
                                }
                            } else {
                                this.field252 = arg2.method2034(255);
                            }
                        } else {
                            this.field242 = arg2.method2034(255);
                        }
                    } else {
                        this.field251 = arg2.method2034(255);
                    }
                } else {
                    this.field244 = arg2.method2001((byte) -83);
                }
            } else {
                this.field250 = arg2.method2034(255);
            }
        } else {
            this.field252 = this.field253 = arg2.method2034(255);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            this.method170(-105);
        }
        ++field241;
        int[] var3 = super.field8125.method298(arg0, -121);
        if (super.field8125.field579) {
            int var4 = class402.field5353[arg0] * this.field253 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class505.field6740; ++var7) {
                class168.field2602 = Integer.MAX_VALUE;
                class204.field2960 = Integer.MAX_VALUE;
                class651.field8817 = Integer.MAX_VALUE;
                class410.field5545 = Integer.MAX_VALUE;
                int var8 = class168.field2599[var7] * this.field252 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 - 1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field239[255 & (~this.field253 < ~var11 ? var11 : -this.field253 + var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (255 & this.field239[255 & (var14 >= this.field252 ? var14 - this.field252 : var14) + var13]) * 2;
                        int var10000 = -(var14 << 12) + var8;
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field245[var15];
                        int var17 = -(var11 << 12) - (this.field245[var27] - var4);
                        int var18 = this.field242;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var16 >= 0 ? var16 : -var16) - -(~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var26 <= ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class410.field5545) {
                            if (var19 >= class651.field8817) {
                                if (class204.field2960 <= var19) {
                                    if (class168.field2602 > var19) {
                                        class168.field2602 = var19;
                                    }
                                } else {
                                    class168.field2602 = class204.field2960;
                                    class204.field2960 = var19;
                                }
                            } else {
                                class168.field2602 = class204.field2960;
                                class204.field2960 = class651.field8817;
                                class651.field8817 = var19;
                            }
                        } else {
                            class168.field2602 = class204.field2960;
                            class204.field2960 = class651.field8817;
                            class651.field8817 = class410.field5545;
                            class410.field5545 = var19;
                        }
                    }
                }
                int var12 = this.field251;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class410.field5545 + class651.field8817;
                                }
                            } else {
                                var3[var7] = class168.field2602;
                            }
                        } else {
                            var3[var7] = class204.field2960;
                        }
                    } else {
                        var3[var7] = class651.field8817;
                    }
                } else {
                    var3[var7] = class410.field5545;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field239 = class187.method1231((byte) -67, this.field250);
        ++field255;
        if (arg0 != 12404) {
            field256 = 102;
        }
        this.method170(-2);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
    public static final void method169(int arg0, int arg1) {
        ++field248;
        if (!class344.field4718.field5458) {
            arg0 = -1;
        }
        if (class584.field7753 != arg0) {
            if (arg1 != -1) {
                method169(-19, -10);
            }
            if (~arg0 != 0) {
                class628 var2 = class397.field5279.method3248(arg0, (byte) -87);
                class500 var3 = var2.method3457(arg1 ^ -2427);
                if (var3 == null) {
                    arg0 = -1;
                } else {
                    class688.field9669.method2903(new Point(var2.field8469, var2.field8475), class443.field6072, true, var3.method2768(), var3.method2779(), var3.method2771());
                    class584.field7753 = arg0;
                }
            }
            if (~arg0 == 0 && ~class584.field7753 != 0) {
                class688.field9669.method2903(new Point(), class443.field6072, true, -1, -1, (int[]) null);
                class584.field7753 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V")
    private final void method170(int arg0) {
        ++field249;
        if (arg0 != -2) {
            this.method10(102);
        }
        Random var2 = new Random((long) this.field250);
        this.field245 = new short[512];
        if (~this.field244 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field245[var3] = (short) class660.method3697(0, this.field244, var2);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
    public static void method171(byte arg0) {
        field240 = null;
        field258 = null;
        field254 = null;
        field257 = null;
        int var1 = -71 % ((arg0 - -58) / 46);
        field247 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class16() {
        super(0, true);
    }
}
