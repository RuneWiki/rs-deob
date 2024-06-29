import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class25 extends class298 {

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    private int field340 = 2;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    private int field335 = 2048;

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
    private int field341 = 0;

    @OriginalMember(owner = "client!vq", name = "T", descriptor = "[S")
    private short[] field344 = new short[512];

    @OriginalMember(owner = "client!vq", name = "V", descriptor = "I")
    private int field346 = 5;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "[B")
    private byte[] field337 = new byte[512];

    @OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
    private int field348 = 5;

    @OriginalMember(owner = "client!vq", name = "ab", descriptor = "I")
    private int field351 = 1;

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "[[Z")
    public static boolean[][] field338 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!vq", name = "Y", descriptor = "Lpn;")
    public static class72 field349 = new class72(27, 3);

    @OriginalMember(owner = "client!vq", name = "cb", descriptor = "[I")
    public static int[] field353 = new int[1024];

    @OriginalMember(owner = "client!vq", name = "bb", descriptor = "Lpn;")
    public static class72 field352 = new class72(34, -1);

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!vq", name = "S", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!vq", name = "U", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!vq", name = "W", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!vq", name = "Z", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILvt;)V", line = 6)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 >= -44) {
            this.field344 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field348 = arg2.method895((byte) -90);
                                }
                            } else {
                                this.field346 = arg2.method895((byte) -74);
                            }
                        } else {
                            this.field351 = arg2.method895((byte) -107);
                        }
                    } else {
                        this.field340 = arg2.method895((byte) -74);
                    }
                } else {
                    this.field335 = arg2.method916(21933);
                }
            } else {
                this.field341 = arg2.method895((byte) -90);
            }
        } else {
            this.field346 = this.field348 = arg2.method895((byte) -83);
        }
        ++field336;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V", line = 396)
    public class25() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)V", line = 92)
    public static final void method142(byte arg0, int arg1) {
        if (arg0 == -126) {
            ++field339;
            class89 var2 = class146.method695(1, arg1, (byte) -123);
            var2.method448(13);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 117)
    public final void method15(int arg0) {
        ++field343;
        this.field337 = class269.method1628(this.field341, 511);
        if (arg0 > -41) {
            this.field340 = -72;
        }
        this.method143(0);
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V", line = 129)
    private final void method143(int arg0) {
        ++field347;
        Random var2 = new Random((long) this.field341);
        this.field344 = new short[512];
        if (arg0 < this.field335) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field344[var3] = (short) class459.method2706(this.field335, var2, -30);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(B)V", line = 154)
    public static void method144(byte arg0) {
        field352 = null;
        if (arg0 != -66) {
            field353 = null;
        }
        field349 = null;
        field338 = null;
        field353 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZ)[I", line = 171)
    public final int[] method13(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field350;
            int[] var3 = super.field4443.method2877(arg0, 1);
            if (super.field4443.field6915) {
                int var4 = class156.field1865[arg0] * this.field348 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; ~class158.field1877 < ~var7; ++var7) {
                    class307.field4513 = Integer.MAX_VALUE;
                    class77.field928 = Integer.MAX_VALUE;
                    class335.field4840 = Integer.MAX_VALUE;
                    class371.field5316 = Integer.MAX_VALUE;
                    int var8 = 2048 - -(class236.field3260[var7] * this.field346);
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                        int var13 = this.field337[255 & (~var11 > ~this.field348 ? var11 : -this.field348 + var11)] & 255;
                        for (int var14 = var9 - 1; ~var10 <= ~var14; ++var14) {
                            int var15 = (this.field337[(var14 >= this.field346 ? -this.field346 + var14 : var14) + var13 & 255] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = -this.field344[var15] - ((var14 << 12) - var8);
                            int var17 = -(var11 << 12) - this.field344[var27] + var4;
                            int var18 = this.field351;
                            int var19;
                            if (var18 != 1) {
                                if (~var18 != -4) {
                                    if (~var18 != -5) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (var17 >= 0 ? var17 : -var17) + (var16 < 0 ? -var16 : var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)));
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 < 0 ? -var17 : var17;
                                    int var26 = ~var16 <= -1 ? var16 : -var16;
                                    var19 = ~var25 <= ~var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~var19 <= ~class371.field5316) {
                                if (~var19 > ~class335.field4840) {
                                    class307.field4513 = class77.field928;
                                    class77.field928 = class335.field4840;
                                    class335.field4840 = var19;
                                } else if (var19 >= class77.field928) {
                                    if (~class307.field4513 < ~var19) {
                                        class307.field4513 = var19;
                                    }
                                } else {
                                    class307.field4513 = class77.field928;
                                    class77.field928 = var19;
                                }
                            } else {
                                class307.field4513 = class77.field928;
                                class77.field928 = class335.field4840;
                                class335.field4840 = class371.field5316;
                                class371.field5316 = var19;
                            }
                        }
                    }
                    int var12 = this.field340;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (~var12 != -4) {
                                if (~var12 != -5) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class371.field5316 + class335.field4840;
                                    }
                                } else {
                                    var3[var7] = class307.field4513;
                                }
                            } else {
                                var3[var7] = class77.field928;
                            }
                        } else {
                            var3[var7] = class335.field4840;
                        }
                    } else {
                        var3[var7] = class371.field5316;
                    }
                }
            }
            return var3;
        }
    }
}
