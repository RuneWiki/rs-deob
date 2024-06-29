import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class719 extends class297 {

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "[S")
    private short[] field9778 = new short[512];

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    private int field9780 = 1;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "[B")
    private byte[] field9781 = new byte[512];

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    private int field9787 = 2048;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
    private int field9786 = 2;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    private int field9784 = 0;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    private int field9779 = 5;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
    private int field9791 = 5;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "Z")
    public static boolean field9783 = false;

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "Lej;")
    public static class124 field9792 = new class124(1, -1);

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V", line = 8)
    public static void method3999(int arg0) {
        field9792 = null;
        if (arg0 >= -111) {
            method3999(-83);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)I", line = 18)
    public static final int method4000(int arg0, boolean arg1) {
        ++field9790;
        if (!arg1) {
            field9792 = null;
        }
        return 127 & arg0 >> 11;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 86)
    public class719() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V", line = 49)
    private final void method4001(boolean arg0) {
        ++field9782;
        if (arg0) {
            Random var2 = new Random((long) this.field9784);
            this.field9778 = new short[512];
            if (~this.field9787 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field9778[var3] = (short) class37.method463((byte) 81, this.field9787, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 92)
    public final void method711(int arg0) {
        if (arg0 > 108) {
            this.field9781 = class59.method622(this.field9784, 124);
            ++field9788;
            this.method4001(true);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)[I", line = 109)
    public final int[] method15(int arg0, int arg1) {
        ++field9785;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            this.method711(-57);
        }
        if (super.field4165.field266) {
            int var4 = class620.field8445[arg0] * this.field9779 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class525.field7275; ++var7) {
                class106.field1867 = Integer.MAX_VALUE;
                class649.field8922 = Integer.MAX_VALUE;
                class653.field8958 = Integer.MAX_VALUE;
                class336.field4747 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class733.field9899[var7] * this.field9791);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field9781[255 & (var11 >= this.field9779 ? -this.field9779 + var11 : var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (255 & this.field9781[(this.field9791 > var14 ? var14 : -this.field9791 + var14) + var13 & 255]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field9778[var15] - var8);
                        int var17 = -this.field9778[var27] + var4 + -(var11 << 12);
                        int var18 = this.field9780;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) - -(var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var25 <= var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class336.field4747 <= var19) {
                            if (~class653.field8958 >= ~var19) {
                                if (~class649.field8922 < ~var19) {
                                    class106.field1867 = class649.field8922;
                                    class649.field8922 = var19;
                                } else if (~class106.field1867 < ~var19) {
                                    class106.field1867 = var19;
                                }
                            } else {
                                class106.field1867 = class649.field8922;
                                class649.field8922 = class653.field8958;
                                class653.field8958 = var19;
                            }
                        } else {
                            class106.field1867 = class649.field8922;
                            class649.field8922 = class653.field8958;
                            class653.field8958 = class336.field4747;
                            class336.field4747 = var19;
                        }
                    }
                }
                int var12 = this.field9786;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class336.field4747 + class653.field8958;
                                }
                            } else {
                                var3[var7] = class106.field1867;
                            }
                        } else {
                            var3[var7] = class649.field8922;
                        }
                    } else {
                        var3[var7] = class653.field8958;
                    }
                } else {
                    var3[var7] = class336.field4747;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lcea;II)V", line = 317)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 == 31015) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (~arg1 == -7) {
                                        this.field9779 = arg0.method1535(255);
                                    }
                                } else {
                                    this.field9791 = arg0.method1535(255);
                                }
                            } else {
                                this.field9780 = arg0.method1535(arg2 ^ 31192);
                            }
                        } else {
                            this.field9786 = arg0.method1535(arg2 ^ 31192);
                        }
                    } else {
                        this.field9787 = arg0.method1478(842397944);
                    }
                } else {
                    this.field9784 = arg0.method1535(arg2 + -30760);
                }
            } else {
                this.field9791 = this.field9779 = arg0.method1535(arg2 ^ 31192);
            }
            ++field9789;
        }
    }
}
