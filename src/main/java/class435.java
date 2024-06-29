import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class435 extends class573 {

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
    private int field6284 = 2;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    private int field6285 = 5;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "[S")
    private short[] field6286 = new short[512];

    @OriginalMember(owner = "client!cq", name = "T", descriptor = "I")
    private int field6291 = 2048;

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "[B")
    private byte[] field6288 = new byte[512];

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    private int field6281 = 1;

    @OriginalMember(owner = "client!cq", name = "S", descriptor = "I")
    private int field6290 = 5;

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "I")
    private int field6289 = 0;

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "Lqfa;")
    public static class85 field6292 = new class85(61, 8);

    @OriginalMember(owner = "client!cq", name = "Y", descriptor = "Low;")
    public static class319 field6296 = new class319();

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!cq", name = "V", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!cq", name = "W", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!cq", name = "X", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "(I)V")
    public static final void method2640(int arg0) {
        int var1 = -2 / ((-72 - arg0) / 46);
        class140.field2463.method152(class527.field7431, class527.field7429.field2626 ? class680.field9648 + 256 << 2 : -1, 0);
        ++field6283;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V")
    private final void method2641(byte arg0) {
        ++field6282;
        Random var2 = new Random((long) this.field6289);
        if (arg0 > -28) {
            this.method443((class61) null, 67, 109);
        }
        this.field6286 = new short[512];
        if (this.field6291 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field6286[var3] = (short) class468.method2795(var2, this.field6291, (byte) -123);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field6290 = arg0.method732(arg2 ^ -559537957);
                                }
                            } else {
                                this.field6285 = arg0.method732(-559537960);
                            }
                        } else {
                            this.field6281 = arg0.method732(-559537960);
                        }
                    } else {
                        this.field6284 = arg0.method732(arg2 ^ -559537957);
                    }
                } else {
                    this.field6291 = arg0.method723((byte) -25);
                }
            } else {
                this.field6289 = arg0.method732(-559537960);
            }
        } else {
            this.field6285 = this.field6290 = arg0.method732(-559537960);
        }
        if (arg2 != 3) {
            this.field6281 = 99;
        }
        ++field6293;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        ++field6287;
        this.field6288 = class490.method2947((byte) 114, this.field6289);
        if (arg0 != 4095) {
            this.field6290 = -13;
        }
        this.method2641((byte) -71);
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(II)V")
    public static final void method2642(int arg0, int arg1) {
        class194.field3046.method1908(arg1, (byte) -11);
        ++field6294;
        if (arg0 != 0) {
            method2643(true);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
    public static void method2643(boolean arg0) {
        field6292 = null;
        if (arg0) {
            field6296 = null;
        }
        field6296 = null;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
    public class435() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field6295;
        if (arg1 != 1) {
            this.field6285 = 105;
        }
        int[] var3 = super.field8321.method3164(arg0, -114);
        if (super.field8321.field7825) {
            int var4 = class230.field3460[arg0] * this.field6290 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class540.field7555; ++var7) {
                class302.field4503 = Integer.MAX_VALUE;
                class471.field6676 = Integer.MAX_VALUE;
                class415.field6012 = Integer.MAX_VALUE;
                class239.field3533 = Integer.MAX_VALUE;
                int var8 = class51.field1194[var7] * this.field6285 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field6288[(~this.field6290 < ~var11 ? var11 : -this.field6290 + var11) & 255] & 255;
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (255 & this.field6288[255 & (var14 >= this.field6285 ? -this.field6285 + var14 : var14) + var13]) * 2;
                        int var10001 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var8 + var10001 + -this.field6286[var15];
                        int var17 = -(var11 << 12) + -this.field6286[var27] + var4;
                        int var18 = this.field6281;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 >= 0 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var25 <= var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (var19 < class239.field3533) {
                            class302.field4503 = class471.field6676;
                            class471.field6676 = class415.field6012;
                            class415.field6012 = class239.field3533;
                            class239.field3533 = var19;
                        } else if (class415.field6012 > var19) {
                            class302.field4503 = class471.field6676;
                            class471.field6676 = class415.field6012;
                            class415.field6012 = var19;
                        } else if (var19 >= class471.field6676) {
                            if (~var19 > ~class302.field4503) {
                                class302.field4503 = var19;
                            }
                        } else {
                            class302.field4503 = class471.field6676;
                            class471.field6676 = var19;
                        }
                    }
                }
                int var12 = this.field6284;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class239.field3533 + class415.field6012;
                                }
                            } else {
                                var3[var7] = class302.field4503;
                            }
                        } else {
                            var3[var7] = class471.field6676;
                        }
                    } else {
                        var3[var7] = class415.field6012;
                    }
                } else {
                    var3[var7] = class239.field3533;
                }
            }
        }
        return var3;
    }
}
