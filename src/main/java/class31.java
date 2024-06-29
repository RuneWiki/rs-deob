import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 extends class278 {

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    private int field444 = 2;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "[S")
    private short[] field446 = new short[512];

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    private int field445 = 0;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    private int field448 = 5;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    private int field442 = 1;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    private int field447 = 5;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    private int field451 = 2048;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "[B")
    private byte[] field450 = new byte[512];

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "Ltk;")
    public static class228 field440 = new class228(10, 2, 2, 0);

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lfg;")
    public static class83 field453 = new class83("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Lep;")
    public static class288 field454;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    private final void method206(byte arg0) {
        ++field441;
        Random var2 = new Random((long) this.field445);
        this.field446 = new short[512];
        if (this.field451 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field446[var3] = (short) class432.method2579((byte) 77, this.field451, var2);
            }
        }
        if (arg0 != -97) {
            field440 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public final void method207(int arg0) {
        ++field443;
        this.field450 = class158.method977(this.field445, (byte) 23);
        this.method206((byte) -97);
        if (arg0 != 2) {
            this.method207(-83);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field438;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int var4 = 2048 - -(class454.field6637[arg1] * this.field447);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class507.field7456 > var7; ++var7) {
                class464.field6750 = Integer.MAX_VALUE;
                class58.field789 = Integer.MAX_VALUE;
                class59.field794 = Integer.MAX_VALUE;
                class228.field3191 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class192.field2736[var7] * this.field448);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field450[255 & (var11 >= this.field447 ? -this.field447 + var11 : var11)];
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field450[255 & var13 + (var14 >= this.field448 ? -this.field448 + var14 : var14)] & 255) * 2;
                        int var27 = var15 + 1;
                        int var16 = -this.field446[var15] + -(var14 << 12) + var8;
                        int var17 = -this.field446[var27] - (var11 << 12) + var4;
                        int var18 = this.field442;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var25 < var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class228.field3191 >= ~var19) {
                            if (~var19 <= ~class59.field794) {
                                if (var19 < class58.field789) {
                                    class464.field6750 = class58.field789;
                                    class58.field789 = var19;
                                } else if (~var19 > ~class464.field6750) {
                                    class464.field6750 = var19;
                                }
                            } else {
                                class464.field6750 = class58.field789;
                                class58.field789 = class59.field794;
                                class59.field794 = var19;
                            }
                        } else {
                            class464.field6750 = class58.field789;
                            class58.field789 = class59.field794;
                            class59.field794 = class228.field3191;
                            class228.field3191 = var19;
                        }
                    }
                }
                int var12 = this.field444;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class228.field3191 + class59.field794;
                                }
                            } else {
                                var3[var7] = class464.field6750;
                            }
                        } else {
                            var3[var7] = class58.field789;
                        }
                    } else {
                        var3[var7] = class59.field794;
                    }
                } else {
                    var3[var7] = class228.field3191;
                }
            }
        }
        return arg0 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(B)V")
    public static void method209(byte arg0) {
        field454 = null;
        field440 = null;
        field453 = null;
        int var1 = 110 / ((arg0 - 11) / 51);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.field442 = -43;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field447 = arg0.method2099(255);
                                }
                            } else {
                                this.field448 = arg0.method2099(255);
                            }
                        } else {
                            this.field442 = arg0.method2099(255);
                        }
                    } else {
                        this.field444 = arg0.method2099(255);
                    }
                } else {
                    this.field451 = arg0.method2062((byte) 14);
                }
            } else {
                this.field445 = arg0.method2099(arg1 ^ -30227);
            }
        } else {
            this.field448 = this.field447 = arg0.method2099(255);
        }
        ++field449;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field439;
        if (class383.field5391 != null) {
            class22 var15;
            if (arg3 <= arg11) {
                int var14 = arg11 + -1;
                var15 = class179.field2534[var14];
            } else {
                int var16 = -arg11 + -1;
                if (~class202.field2880 != ~var16) {
                    var15 = class309.field4234[var16];
                } else {
                    var15 = class75.field1089;
                }
            }
            if (var15 != null) {
                class132 var17 = class82.field1154.method2121(arg5, true);
                int var18;
                int var19;
                if (arg1 != 1 && arg1 != 3) {
                    var18 = var17.field1881;
                    var19 = var17.field1880;
                } else {
                    var19 = var17.field1881;
                    var18 = var17.field1880;
                }
                int var20 = arg9 - -(var19 >> 1);
                int var21 = (var19 + 1 >> 1) + arg9;
                int var22 = (var18 >> 1) + arg4;
                int var23 = (var18 + 1 >> 1) + arg4;
                class35 var24 = class383.field5391[arg13];
                int var25 = var24.method221(var20, var22) + (var24.method221(var21, var22) - (-var24.method221(var20, var23) - var24.method221(var21, var23))) >> 2;
                class360 var26 = new class360();
                var26.field4945 = arg5;
                var26.field4930 = arg1;
                var26.field4936 = var15.field464;
                var26.field4928 = class393.field5484 + arg8;
                var26.field4939 = arg4;
                var26.field4933 = arg9;
                if (arg6 < arg12) {
                    int var27 = arg12;
                    arg12 = arg6;
                    arg6 = var27;
                }
                var26.field4946 = class393.field5484 + arg7;
                var26.field4932 = arg10;
                var26.field4943 = arg9 + arg12;
                if (arg0 > arg2) {
                    int var28 = arg0;
                    arg0 = arg2;
                    arg2 = var28;
                }
                var26.field4937 = arg9 - -arg6;
                var26.field4929 = arg4 - -arg2;
                var26.field4935 = arg0 + arg4;
                var26.field4931 = (var26.field4933 << 7) - -(var19 << 6);
                var26.field4934 = var25;
                var26.field4927 = (var26.field4939 << 7) + (var18 << 6);
                class352.field4809.method3070(var26, (byte) -125);
                var15.field366 = var26;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class31() {
        super(0, true);
    }
}
