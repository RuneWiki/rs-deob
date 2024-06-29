import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class230 extends class175 {

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    private int field3947 = 2048;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    private int field3954 = 5;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "[S")
    private short[] field3960 = new short[512];

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    private int field3951 = 2;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    private int field3962 = 1;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    private int field3964 = 5;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "[B")
    private byte[] field3952 = new byte[512];

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
    private int field3965 = 0;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lmb;")
    private static class96 field3957 = class243.method1708("Loaded fonts", (byte) 125);

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Lmb;")
    public static class96 field3950 = class243.method1708("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) 107);

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "Lmb;")
    public static class96 field3959 = field3957;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "Lmb;")
    public static class96 field3955 = class243.method1708("(U0a )2 in: ", (byte) 99);

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "[I")
    public static int[] field3958 = new int[25];

    @OriginalMember(owner = "client!te", name = "db", descriptor = "Lmb;")
    public static class96 field3961 = class243.method1708("Versteckt", (byte) 95);

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "[Lti;")
    public static class161[] field3966 = new class161[27];

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class230() {
        super(0, true);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)V")
    public static final void method1571(byte arg0, int arg1) {
        ++field3948;
        int var2 = -88 / ((-11 - arg0) / 35);
        class60 var3 = (class60) class132.field2373.method1081(0, (long) arg1);
        if (var3 != null) {
            for (int var4 = 0; ~var4 > ~var3.field1035.length; ++var4) {
                var3.field1035[var4] = -1;
                var3.field1040[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    private final void method1572(int arg0) {
        Random var2 = new Random((long) this.field3965);
        this.field3960 = new short[arg0];
        if (this.field3947 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3960[var3] = (short) class50.method379(this.field3947, var2, (byte) 26);
            }
        }
        ++field3963;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field3953;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field3964 = arg2.method1651(4139);
                                }
                            } else {
                                this.field3954 = arg2.method1651(4139);
                            }
                        } else {
                            this.field3962 = arg2.method1651(4139);
                        }
                    } else {
                        this.field3951 = arg2.method1651(4139);
                    }
                } else {
                    this.field3947 = arg2.method1663((byte) -106);
                }
            } else {
                this.field3965 = arg2.method1651(4139);
            }
        } else {
            this.field3954 = this.field3964 = arg2.method1651(4139);
        }
        int var5 = 82 % ((-22 - arg0) / 58);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public final void method150(int arg0) {
        if (arg0 == 2) {
            this.field3952 = class39.method307((byte) -128, this.field3965);
            ++field3956;
            this.method1572(512);
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
    public static void method1573(byte arg0) {
        field3958 = null;
        field3950 = null;
        field3966 = null;
        field3959 = null;
        field3961 = null;
        field3955 = null;
        field3957 = null;
        int var1 = -81 / ((arg0 - 32) / 41);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        int var3 = -78 % ((arg0 - 62) / 54);
        ++field3949;
        int[] var4 = super.field3044.method904((byte) 124, arg1);
        if (super.field3044.field2150) {
            int var5 = class23.field395[arg1] * this.field3964 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; ~var8 > ~class1.field11; ++var8) {
                class170.field2988 = Integer.MAX_VALUE;
                class3.field49 = Integer.MAX_VALUE;
                class242.field4207 = Integer.MAX_VALUE;
                class36.field611 = Integer.MAX_VALUE;
                int var9 = class244.field4240[var8] * this.field3954 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 - 1; var7 >= var12; ++var12) {
                    int var14 = 255 & this.field3952[(~this.field3964 < ~var12 ? var12 : -this.field3964 + var12) & 255];
                    for (int var15 = var10 + -1; ~var11 <= ~var15; ++var15) {
                        int var16 = 2 * (this.field3952[255 & var14 - -(this.field3954 <= var15 ? var15 - this.field3954 : var15)] & 255);
                        int var10001 = var15 << 12;
                        int var28 = var16 + 1;
                        int var17 = var9 - (var10001 + this.field3960[var16]);
                        int var18 = -this.field3960[var28] - (var12 << 12) + var5;
                        int var19 = this.field3962;
                        int var20;
                        if (~var19 != -2) {
                            if (var19 != 3) {
                                if (~var19 != -5) {
                                    if (var19 != 5) {
                                        if (var19 == 2) {
                                            var20 = (~var18 > -1 ? -var18 : var18) + (~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var20 = (int) (Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = (int) (Math.sqrt((double) ((float) (~var18 <= -1 ? var18 : -var18) / 4096.0F)) * 4096.0D);
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                int var27 = ~var18 > -1 ? -var18 : var18;
                                var20 = var26 > var27 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (class36.field611 <= var20) {
                            if (var20 >= class242.field4207) {
                                if (var20 >= class3.field49) {
                                    if (class170.field2988 > var20) {
                                        class170.field2988 = var20;
                                    }
                                } else {
                                    class170.field2988 = class3.field49;
                                    class3.field49 = var20;
                                }
                            } else {
                                class170.field2988 = class3.field49;
                                class3.field49 = class242.field4207;
                                class242.field4207 = var20;
                            }
                        } else {
                            class170.field2988 = class3.field49;
                            class3.field49 = class242.field4207;
                            class242.field4207 = class36.field611;
                            class36.field611 = var20;
                        }
                    }
                }
                int var13 = this.field3951;
                if (var13 != 0) {
                    if (~var13 != -2) {
                        if (~var13 != -4) {
                            if (~var13 != -5) {
                                if (var13 == 2) {
                                    var4[var8] = class242.field4207 - class36.field611;
                                }
                            } else {
                                var4[var8] = class170.field2988;
                            }
                        } else {
                            var4[var8] = class3.field49;
                        }
                    } else {
                        var4[var8] = class242.field4207;
                    }
                } else {
                    var4[var8] = class36.field611;
                }
            }
        }
        return var4;
    }
}
