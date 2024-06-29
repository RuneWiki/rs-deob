import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class373 extends class40 {

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    private int field5304 = 1;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[S")
    private short[] field5306 = new short[512];

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "[B")
    private byte[] field5307 = new byte[512];

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    private int field5311 = 2;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    private int field5305 = 5;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    private int field5315 = 2048;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    private int field5312 = 5;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    private int field5314 = 0;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "[I")
    public static int[] field5318;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)V")
    public static final void method2388(byte arg0) {
        ++field5309;
        if (~class423.field6041 != -11 && class423.field6041 != 28) {
            class128.method786(5000, (byte) 27, class181.field2555.field4601[0] >> 3, class181.field2555.field4595[0] >> 3);
        } else {
            class128.method786(5000, (byte) 27, class417.field5999 >> 10, class386.field5469 >> 10);
        }
        class128.method780(false);
        class78.method459(arg0 ^ 15229);
        class169.method1210(-11373);
        if (arg0 != 41) {
            field5313 = 42;
        }
        class302.method2034((byte) 122);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class373() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
    public static final int method2389(int arg0, int arg1) {
        ++field5310;
        if (arg0 <= 63) {
            field5313 = -10;
        }
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static final void method2390(int arg0) {
        class15 var1 = class317.field4658;
        synchronized (class317.field4658) {
            class317.field4658.method102((byte) -83);
        }
        ++field5316;
        class15 var2 = class392.field5506;
        synchronized (class392.field5506) {
            int var3 = 90 % ((arg0 - 67) / 45);
            class392.field5506.method102((byte) -105);
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)V")
    public final void method39(byte arg0) {
        this.field5307 = class239.method1630((byte) -12, this.field5314);
        if (arg0 != -23) {
            method2393(true);
        }
        ++field5308;
        this.method2392(-1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2391(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5) {
        class186.method1333(0, arg2, (String) null, arg4, arg0, arg1, arg5, arg3);
        ++field5317;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    private final void method2392(int arg0) {
        ++field5301;
        Random var2 = new Random((long) this.field5314);
        this.field5306 = new short[512];
        if (arg0 > ~this.field5315) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field5306[var3] = (short) class445.method2775(var2, class417.method2632(arg0, -31179), this.field5315);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field5303;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 >= -20) {
            this.field5311 = -44;
        }
        if (super.field551.field441) {
            int var4 = class86.field1123[arg1] * this.field5312 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class410.field5886; ++var7) {
                class120.field1625 = Integer.MAX_VALUE;
                class381.field5413 = Integer.MAX_VALUE;
                class228.field3386 = Integer.MAX_VALUE;
                class125.field1677 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class9.field124[var7] * this.field5305);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field5307[255 & (~this.field5312 < ~var11 ? var11 : -this.field5312 + var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field5307[255 & (~var14 <= ~this.field5305 ? -this.field5305 + var14 : var14) + var13]);
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field5306[var15] + -(var14 << 12);
                        int var17 = -(var11 << 12) + var4 + -this.field5306[var27];
                        int var18 = this.field5304;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (class125.field1677 <= var19) {
                            if (~class228.field3386 < ~var19) {
                                class120.field1625 = class381.field5413;
                                class381.field5413 = class228.field3386;
                                class228.field3386 = var19;
                            } else if (~class381.field5413 >= ~var19) {
                                if (var19 < class120.field1625) {
                                    class120.field1625 = var19;
                                }
                            } else {
                                class120.field1625 = class381.field5413;
                                class381.field5413 = var19;
                            }
                        } else {
                            class120.field1625 = class381.field5413;
                            class381.field5413 = class228.field3386;
                            class228.field3386 = class125.field1677;
                            class125.field1677 = var19;
                        }
                    }
                }
                int var12 = this.field5311;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class125.field1677 + class228.field3386;
                                }
                            } else {
                                var3[var7] = class120.field1625;
                            }
                        } else {
                            var3[var7] = class381.field5413;
                        }
                    } else {
                        var3[var7] = class228.field3386;
                    }
                } else {
                    var3[var7] = class125.field1677;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
    public static void method2393(boolean arg0) {
        if (arg0) {
            field5318 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field5302;
        if (arg1 < 79) {
            this.field5312 = -57;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field5312 = arg2.method837(true);
                                }
                            } else {
                                this.field5305 = arg2.method837(true);
                            }
                        } else {
                            this.field5304 = arg2.method837(true);
                        }
                    } else {
                        this.field5311 = arg2.method837(true);
                    }
                } else {
                    this.field5315 = arg2.method798(false);
                }
            } else {
                this.field5314 = arg2.method837(true);
            }
        } else {
            this.field5305 = this.field5312 = arg2.method837(true);
        }
    }
}
