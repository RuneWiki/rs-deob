import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class369 extends class751 {

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "[B")
    private byte[] field5297 = new byte[512];

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "[S")
    private short[] field5301 = new short[512];

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    private int field5304 = 5;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    private int field5298 = 0;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    private int field5302 = 2048;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    private int field5306 = 2;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    private int field5310 = 1;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    private int field5303 = 5;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Leb;")
    public static class650 field5300 = new class650(true);

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "[I")
    public static int[] field5311 = new int[5];

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field5312 = 0;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)V", line = 4)
    private final void method2289(byte arg0) {
        ++field5308;
        if (arg0 != 89) {
            method2291(57);
        }
        Random var2 = new Random((long) this.field5298);
        this.field5301 = new short[512];
        if (~this.field5302 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field5301[var3] = (short) class425.method2530(103, this.field5302, var2);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 211)
    public class369() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 33)
    public static final void method2290(int arg0) {
        class64.field867 = 0;
        ++field5309;
        int var1 = class26.field371.method862(arg0 + -3327);
        boolean var2 = class26.field371.method867(true) == 1;
        int var3 = class26.field371.method898((byte) -123);
        int var4 = class26.field371.method855(0);
        class361.method2265(arg0 ^ -21867);
        class481.method2824(11423, var4);
        int var5 = (-class26.field371.field1521 + class440.field6294) / 16;
        class713.field10063 = new int[var5][4];
        for (int var6 = 0; ~var6 > ~var5; ++var6) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class713.field10063[var6][var10] = class26.field371.method871(23995);
            }
        }
        class550.field7793 = new byte[var5][];
        class347.field5088 = new int[var5];
        class405.field5709 = new byte[var5][];
        class205.field3018 = new byte[var5][];
        class141.field1823 = new int[var5];
        class9.field171 = new byte[var5][];
        class96.field1236 = new int[var5];
        class145.field1853 = null;
        class467.field6632 = null;
        class146.field1866 = new int[var5];
        class379.field5438 = new int[var5];
        int var7 = 0;
        if (arg0 != -21791) {
            method2290(-46);
        }
        for (int var8 = (var3 - (class109.field1314 >> 4)) / 8; var8 <= ((class109.field1314 >> 4) + var3) / 8; ++var8) {
            for (int var9 = (-(class760.field10479 >> 4) + var1) / 8; var9 <= ((class760.field10479 >> 4) + var1) / 8; ++var9) {
                class96.field1236[var7] = (var8 << 8) + var9;
                class146.field1866[var7] = class277.field3850.method3134(0, "m" + var8 + "_" + var9);
                class141.field1823[var7] = class277.field3850.method3134(0, "l" + var8 + "_" + var9);
                class379.field5438[var7] = class277.field3850.method3134(0, "um" + var8 + "_" + var9);
                class347.field5088[var7] = class277.field3850.method3134(0, "ul" + var8 + "_" + var9);
                ++var7;
            }
        }
        class230.method1600(var2, var1, 11, var3, -22710);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 110)
    public final void method1454(byte arg0) {
        this.field5297 = class406.method2442(60, this.field5298);
        ++field5307;
        this.method2289((byte) 89);
        if (arg0 < 123) {
            field5312 = 20;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILrv;I)V", line = 124)
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field5303 = arg1.method842(2384);
                                }
                            } else {
                                this.field5304 = arg1.method842(2384);
                            }
                        } else {
                            this.field5310 = arg1.method842(2384);
                        }
                    } else {
                        this.field5306 = arg1.method842(2384);
                    }
                } else {
                    this.field5302 = arg1.method898((byte) -101);
                }
            } else {
                this.field5298 = arg1.method842(2384);
            }
        } else {
            this.field5304 = this.field5303 = arg1.method842(2384);
        }
        ++field5305;
        int var5 = -8 / ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V", line = 218)
    public static void method2291(int arg0) {
        if (arg0 != 390407140) {
            method2290(-18);
        }
        field5300 = null;
        field5311 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I", line = 236)
    public final int[] method365(int arg0, int arg1) {
        ++field5299;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            method2290(80);
        }
        if (super.field10405.field8923) {
            int var4 = class619.field8728[arg0] * this.field5303 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class673.field9452; ++var7) {
                class654.field9232 = Integer.MAX_VALUE;
                class191.field2849 = Integer.MAX_VALUE;
                class766.field10559 = Integer.MAX_VALUE;
                class512.field7327 = Integer.MAX_VALUE;
                int var8 = class179.field2708[var7] * this.field5304 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field5297[255 & (~this.field5303 < ~var11 ? var11 : -this.field5303 + var11)];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (255 & this.field5297[255 & var13 - -(~var14 > ~this.field5304 ? var14 : var14 - this.field5304)]) * 2;
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field5301[var15] - (var14 << 12);
                        int var17 = -this.field5301[var27] - (var11 << 12) + var4;
                        int var18 = this.field5310;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) - -(~var17 <= -1 ? var17 : -var17);
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
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class512.field7327 <= var19) {
                            if (var19 < class766.field10559) {
                                class654.field9232 = class191.field2849;
                                class191.field2849 = class766.field10559;
                                class766.field10559 = var19;
                            } else if (~var19 <= ~class191.field2849) {
                                if (var19 < class654.field9232) {
                                    class654.field9232 = var19;
                                }
                            } else {
                                class654.field9232 = class191.field2849;
                                class191.field2849 = var19;
                            }
                        } else {
                            class654.field9232 = class191.field2849;
                            class191.field2849 = class766.field10559;
                            class766.field10559 = class512.field7327;
                            class512.field7327 = var19;
                        }
                    }
                }
                int var12 = this.field5306;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class512.field7327 + class766.field10559;
                                }
                            } else {
                                var3[var7] = class654.field9232;
                            }
                        } else {
                            var3[var7] = class191.field2849;
                        }
                    } else {
                        var3[var7] = class766.field10559;
                    }
                } else {
                    var3[var7] = class512.field7327;
                }
            }
        }
        return var3;
    }
}
