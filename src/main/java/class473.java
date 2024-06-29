import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class473 extends class362 {

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    private int field6404 = 0;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    private int field6406 = 5;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    private int field6411 = 5;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    private int field6414 = 2048;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    private int field6403 = 2;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "[S")
    private short[] field6416 = new short[512];

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "[B")
    private byte[] field6412 = new byte[512];

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    private int field6417 = 1;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "[Ldu;")
    public static class377[] field6407 = new class377[37];

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "[[Ljava/lang/String;")
    public static String[][] field6415 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)V")
    public static void method2719(byte arg0) {
        field6415 = null;
        int var1 = 119 % ((arg0 - -34) / 46);
        field6407 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        ++field6409;
        if (arg0 == -996226836) {
            this.field6412 = class61.method426(2, this.field6404);
            this.method2721((byte) -123);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[Lkh;I)V")
    public static final void method2720(int arg0, class17[] arg1, int arg2) {
        int var3 = 0;
        if (arg2 <= 58) {
            method2720(75, (class17[]) null, -94);
        }
        while (~var3 > ~arg1.length) {
            class17 var4 = arg1[var3];
            if (var4 != null && var4.field336 == arg0 && !client.method2030(var4)) {
                if (var4.field352 == 0) {
                    method2720(var4.field372, arg1, 87);
                    if (var4.field320 != null) {
                        method2720(var4.field372, var4.field320, 70);
                    }
                    class637 var5 = (class637) class186.field2881.method337((long) var4.field372, 1);
                    if (var5 != null) {
                        class61.method429((byte) -80, var5.field8789);
                    }
                }
                if (~var4.field352 == -7 && var4.field259 != -1) {
                    class200 var6 = class108.field1696.method1279((byte) 92, var4.field259);
                    if (var6 != null) {
                        var4.field374 += class241.field3425;
                        int var7 = var4.field375;
                        while (true) {
                            if (~var6.field3024[var4.field375] <= ~var4.field374) {
                                if (var4.field375 != var7) {
                                    class189.method1391(var6, 40, var4.field375);
                                }
                                break;
                            }
                            var4.field374 -= var6.field3024[var4.field375];
                            ++var4.field375;
                            if (~var6.field3040.length >= ~var4.field375) {
                                var4.field375 -= var6.field3033;
                                if (~var4.field375 > -1 || ~var6.field3040.length >= ~var4.field375) {
                                    var4.field375 = 0;
                                }
                            }
                            var4.field247 = var4.field375 - -1;
                            if (var4.field247 >= var6.field3040.length) {
                                var4.field247 -= var6.field3033;
                                if (~var4.field247 > -1 || var4.field247 >= var6.field3040.length) {
                                    var4.field247 = -1;
                                }
                            }
                            class410.method2433(var4, 14049);
                        }
                    }
                }
            }
            ++var3;
        }
        ++field6410;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
    private final void method2721(byte arg0) {
        if (arg0 > -112) {
            this.field6403 = -30;
        }
        ++field6402;
        Random var2 = new Random((long) this.field6404);
        this.field6416 = new short[512];
        if (this.field6414 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field6416[var3] = (short) class38.method235(this.field6414, -100, var2);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(B)V")
    public static final void method2722(byte arg0) {
        for (int var1 = 0; class317.field4324 > var1; ++var1) {
            int var2 = class361.method2217(38348543, var1 - -class567.field8014, class317.field4324) * class262.field3681;
            for (int var3 = 0; var3 < class262.field3681; ++var3) {
                int var4 = class361.method2217(38348543, class615.field8571 + var3, class262.field3681) + var2;
                if (~class449.field6157[var4] == ~class599.field8386) {
                    class687.field9555[var4].method2769(0, 0, class658.field9108, class471.field6394, class658.field9108 * var3, class471.field6394 * var1, true, true);
                }
            }
        }
        if (arg0 < -16) {
            ++field6408;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field6405;
        if (arg0 != -2026769311) {
            this.field6414 = 60;
        }
        int[] var3 = super.field4927.method808(-123, arg1);
        if (super.field4927.field1471) {
            int var4 = class135.field2287[arg1] * this.field6411 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~var7 > ~class769.field10597; ++var7) {
                class81.field1120 = Integer.MAX_VALUE;
                class97.field1559 = Integer.MAX_VALUE;
                class347.field4674 = Integer.MAX_VALUE;
                class354.field4716 = Integer.MAX_VALUE;
                int var8 = class172.field2750[var7] * this.field6406 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field6412[255 & (var11 >= this.field6411 ? -this.field6411 + var11 : var11)];
                    for (int var14 = var9 - 1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (255 & this.field6412[255 & var13 + (~var14 <= ~this.field6406 ? var14 - this.field6406 : var14)]);
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field6416[var15];
                        int var17 = -(var11 << 12) + var4 + -this.field6416[var27];
                        int var18 = this.field6417;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (var16 >= 0 ? var16 : -var16) + (~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 <= ~class354.field4716) {
                            if (~var19 <= ~class347.field4674) {
                                if (var19 < class97.field1559) {
                                    class81.field1120 = class97.field1559;
                                    class97.field1559 = var19;
                                } else if (var19 < class81.field1120) {
                                    class81.field1120 = var19;
                                }
                            } else {
                                class81.field1120 = class97.field1559;
                                class97.field1559 = class347.field4674;
                                class347.field4674 = var19;
                            }
                        } else {
                            class81.field1120 = class97.field1559;
                            class97.field1559 = class347.field4674;
                            class347.field4674 = class354.field4716;
                            class354.field4716 = var19;
                        }
                    }
                }
                int var12 = this.field6403;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class354.field4716 + class347.field4674;
                                }
                            } else {
                                var3[var7] = class81.field1120;
                            }
                        } else {
                            var3[var7] = class97.field1559;
                        }
                    } else {
                        var3[var7] = class347.field4674;
                    }
                } else {
                    var3[var7] = class354.field4716;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field6411 = arg0.method793((byte) 65);
                                }
                            } else {
                                this.field6406 = arg0.method793((byte) 61);
                            }
                        } else {
                            this.field6417 = arg0.method793((byte) 42);
                        }
                    } else {
                        this.field6403 = arg0.method793((byte) 34);
                    }
                } else {
                    this.field6414 = arg0.method763(124);
                }
            } else {
                this.field6404 = arg0.method793((byte) 75);
            }
        } else {
            this.field6406 = this.field6411 = arg0.method793((byte) 121);
        }
        ++field6413;
        if (arg2 != -1) {
            this.field6417 = 82;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class473() {
        super(0, true);
    }
}
