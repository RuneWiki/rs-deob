import java.awt.Component;
import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class216 extends class252 {

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    private int field3784 = 2048;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    private int field3783 = 5;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    private int field3787 = 1;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
    private int field3794 = 2;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "[S")
    private short[] field3789 = new short[512];

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "[B")
    private byte[] field3793 = new byte[512];

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    private int field3796 = 0;

    @OriginalMember(owner = "client!eg", name = "mb", descriptor = "I")
    private int field3800 = 5;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3781 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "[I")
    public static int[] field3797 = new int[256];

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!eg", name = "kb", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "Lge;")
    public static class68 field3792;

    @OriginalMember(owner = "client!eg", name = "lb", descriptor = "[Lfg;")
    public static class12[] field3799;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)V")
    public static final void method1478(int arg0) {
        ++field3798;
        int var1 = -27 / ((arg0 - 51) / 49);
        ++class228.field3951;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/awt/Component;Lb;BI)Lr;")
    public static final class39 method1479(int arg0, Component arg1, class81 arg2, byte arg3, int arg4) {
        ++field3785;
        if (~class159.field2706 == -1) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class39 var5 = (class39) Class.forName("bg").newInstance();
                var5.field628 = arg4;
                var5.field611 = new int[(class256.field4568 ? 2 : 1) * 256];
                var5.method258(arg1);
                var5.field627 = (-1024 & arg4) + 1024;
                if (var5.field627 > 16384) {
                    var5.field627 = 16384;
                }
                var5.method259(var5.field627);
                if (~class171.field2956 < -1 && class110.field1927 == null) {
                    class110.field1927 = new class47();
                    class110.field1927.field830 = arg2;
                    arg2.method555(arg3 ^ 26883, class171.field2956, class110.field1927);
                }
                if (class110.field1927 != null) {
                    if (class110.field1927.field829[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class110.field1927.field829[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class149 var6 = new class149(arg2, arg0);
                    var6.field611 = new int[256 * (!class256.field4568 ? 1 : 2)];
                    var6.field628 = arg4;
                    var6.method258(arg1);
                    if (arg3 != -34) {
                        method1478(-13);
                    }
                    var6.field627 = 16384;
                    var6.method259(var6.field627);
                    if (~class171.field2956 < -1 && class110.field1927 == null) {
                        class110.field1927 = new class47();
                        class110.field1927.field830 = arg2;
                        arg2.method555(arg3 ^ 26883, class171.field2956, class110.field1927);
                    }
                    if (class110.field1927 != null) {
                        if (class110.field1927.field829[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class110.field1927.field829[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class39();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field3790;
        if (arg2 != -99) {
            method1479(116, (Component) null, (class81) null, (byte) -99, 101);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field3800 = arg0.method1711((byte) -67);
                                }
                            } else {
                                this.field3783 = arg0.method1711((byte) -67);
                            }
                        } else {
                            this.field3787 = arg0.method1711((byte) -67);
                        }
                    } else {
                        this.field3794 = arg0.method1711((byte) -67);
                    }
                } else {
                    this.field3784 = arg0.method1694((byte) -100);
                }
            } else {
                this.field3796 = arg0.method1711((byte) -67);
            }
        } else {
            this.field3783 = this.field3800 = arg0.method1711((byte) -67);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        client.method997(arg3, (byte) -112);
        ++field3782;
        int var7 = 0;
        if (arg2 != -10871) {
            method1479(31, (Component) null, (class81) null, (byte) -104, 95);
        }
        int var8 = arg3;
        int var9 = -arg3;
        int var10 = -arg1 + arg3;
        if (~var10 > -1) {
            var10 = 0;
        }
        int var11 = -var10;
        int var12 = -1;
        int var13 = var10;
        if (arg5 >= class34.field522 && ~arg5 >= ~class1.field6) {
            int[] var14 = class146.field2488[arg5];
            int var15 = class144.method945(arg4 - arg3, class217.field3802, (byte) -116, class83.field1513);
            int var16 = class144.method945(arg3 + arg4, class217.field3802, (byte) -116, class83.field1513);
            int var17 = class144.method945(-var10 + arg4, class217.field3802, (byte) -116, class83.field1513);
            int var18 = class144.method945(arg4 - -var10, class217.field3802, (byte) -116, class83.field1513);
            class183.method1260(arg6, var15, -118, var14, var17);
            class183.method1260(arg0, var17, arg2 + 10996, var14, var18);
            class183.method1260(arg6, var18, 57, var14, var16);
        }
        int var19 = -1;
        while (var7 < var8) {
            var19 += 2;
            var11 += var19;
            var12 += 2;
            var9 += var12;
            if (~var11 <= -1 && var13 >= 1) {
                --var13;
                var11 -= var13 << 1;
                class140.field2426[var13] = var7;
            }
            ++var7;
            if (~var9 <= -1) {
                --var8;
                var9 -= var8 << 1;
                int var20 = arg5 - -var8;
                int var21 = arg5 - var8;
                if (~class34.field522 >= ~var20 && var21 <= class1.field6) {
                    if (var8 >= var10) {
                        int var22 = class144.method945(arg4 + var7, class217.field3802, (byte) -116, class83.field1513);
                        int var23 = class144.method945(-var7 + arg4, class217.field3802, (byte) -116, class83.field1513);
                        if (~var20 >= ~class1.field6) {
                            class183.method1260(arg6, var23, 24, class146.field2488[var20], var22);
                        }
                        if (~var21 <= ~class34.field522) {
                            class183.method1260(arg6, var23, -106, class146.field2488[var21], var22);
                        }
                    } else {
                        int var24 = class140.field2426[var8];
                        int var25 = class144.method945(arg4 + var7, class217.field3802, (byte) -116, class83.field1513);
                        int var26 = class144.method945(arg4 - var7, class217.field3802, (byte) -116, class83.field1513);
                        int var27 = class144.method945(arg4 + var24, class217.field3802, (byte) -116, class83.field1513);
                        int var28 = class144.method945(-var24 + arg4, class217.field3802, (byte) -116, class83.field1513);
                        if (class1.field6 >= var20) {
                            int[] var29 = class146.field2488[var20];
                            class183.method1260(arg6, var26, -117, var29, var28);
                            class183.method1260(arg0, var28, -113, var29, var27);
                            class183.method1260(arg6, var27, arg2 + 10747, var29, var25);
                        }
                        if (var21 >= class34.field522) {
                            int[] var30 = class146.field2488[var21];
                            class183.method1260(arg6, var26, 125, var30, var28);
                            class183.method1260(arg0, var28, arg2 + 10759, var30, var27);
                            class183.method1260(arg6, var27, arg2 ^ 10756, var30, var25);
                        }
                    }
                }
            }
            int var31 = -var7 + arg5;
            int var32 = arg5 + var7;
            if (~var32 <= ~class34.field522 && class1.field6 >= var31) {
                int var33 = -var8 + arg4;
                int var34 = arg4 - -var8;
                if (var34 >= class217.field3802 && ~var33 >= ~class83.field1513) {
                    int var35 = class144.method945(var34, class217.field3802, (byte) -116, class83.field1513);
                    int var36 = class144.method945(var33, class217.field3802, (byte) -116, class83.field1513);
                    if (var7 < var10) {
                        int var37 = var7 > var13 ? class140.field2426[var7] : var13;
                        int var38 = class144.method945(arg4 + var37, class217.field3802, (byte) -116, class83.field1513);
                        int var39 = class144.method945(-var37 + arg4, class217.field3802, (byte) -116, class83.field1513);
                        if (~class1.field6 <= ~var32) {
                            int[] var40 = class146.field2488[var32];
                            class183.method1260(arg6, var36, -124, var40, var39);
                            class183.method1260(arg0, var39, -115, var40, var38);
                            class183.method1260(arg6, var38, -107, var40, var35);
                        }
                        if (~var31 <= ~class34.field522) {
                            int[] var41 = class146.field2488[var31];
                            class183.method1260(arg6, var36, -119, var41, var39);
                            class183.method1260(arg0, var39, -126, var41, var38);
                            class183.method1260(arg6, var38, -103, var41, var35);
                        }
                    } else {
                        if (~class1.field6 <= ~var32) {
                            class183.method1260(arg6, var36, -103, class146.field2488[var32], var35);
                        }
                        if (~class34.field522 >= ~var31) {
                            class183.method1260(arg6, var36, -126, class146.field2488[var31], var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        if (arg0 != 3906) {
            this.field3787 = -77;
        }
        this.field3793 = class263.method1795(-81, this.field3796);
        this.method1481(arg0 + -3906);
        ++field3786;
    }

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "(I)V")
    private final void method1481(int arg0) {
        ++field3791;
        Random var2 = new Random((long) this.field3796);
        this.field3789 = new short[512];
        if (arg0 < this.field3784) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3789[var3] = (short) class135.method901(arg0 + Integer.MIN_VALUE, this.field3784, var2);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class216() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field3788;
        int[] var3 = super.field4356.method868(arg0, (byte) 112);
        if (arg1 != -55) {
            field3781 = null;
        }
        if (super.field4356.field2258) {
            int var4 = class39.field622[arg0] * this.field3800 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class5.field63 > var7; ++var7) {
                class20.field291 = Integer.MAX_VALUE;
                class186.field3196 = Integer.MAX_VALUE;
                class116.field2082 = Integer.MAX_VALUE;
                class218.field3827 = Integer.MAX_VALUE;
                int var8 = class105.field1838[var7] * this.field3783 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 - 1; var11 <= var6; ++var11) {
                    int var13 = this.field3793[(this.field3800 <= var11 ? -this.field3800 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                        int var15 = (255 & this.field3793[var13 + (~var14 <= ~this.field3783 ? -this.field3783 + var14 : var14) & 255]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field3789[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field3789[var27] + var4;
                        int var18 = this.field3787;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 > -1 ? -var16 : var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class218.field3827) {
                            if (~var19 <= ~class116.field2082) {
                                if (var19 >= class186.field3196) {
                                    if (~class20.field291 < ~var19) {
                                        class20.field291 = var19;
                                    }
                                } else {
                                    class20.field291 = class186.field3196;
                                    class186.field3196 = var19;
                                }
                            } else {
                                class20.field291 = class186.field3196;
                                class186.field3196 = class116.field2082;
                                class116.field2082 = var19;
                            }
                        } else {
                            class20.field291 = class186.field3196;
                            class186.field3196 = class116.field2082;
                            class116.field2082 = class218.field3827;
                            class218.field3827 = var19;
                        }
                    }
                }
                int var12 = this.field3794;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class218.field3827 + class116.field2082;
                                }
                            } else {
                                var3[var7] = class20.field291;
                            }
                        } else {
                            var3[var7] = class186.field3196;
                        }
                    } else {
                        var3[var7] = class116.field2082;
                    }
                } else {
                    var3[var7] = class218.field3827;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "(I)V")
    public static void method1482(int arg0) {
        field3781 = null;
        field3792 = null;
        field3797 = null;
        field3799 = null;
        if (arg0 != 1) {
            field3797 = null;
        }
    }
}
