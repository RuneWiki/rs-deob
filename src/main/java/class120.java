import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class120 extends class23 {

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    private int field2185 = 5;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    private int field2189 = 2;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "[B")
    private byte[] field2191 = new byte[512];

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    private int field2199 = 2048;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "I")
    private int field2202 = 0;

    @OriginalMember(owner = "client!l", name = "jb", descriptor = "I")
    private int field2204 = 5;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "[S")
    private short[] field2190 = new short[512];

    @OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
    private int field2206 = 1;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field2188 = 0;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Li;")
    public static class88 field2196 = class208.method1425(105, "::");

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "[S")
    public static short[] field2194 = new short[256];

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "Li;")
    public static class88 field2201 = class208.method1425(105, "<)4col>");

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field2197 = -1;

    @OriginalMember(owner = "client!l", name = "kb", descriptor = "[I")
    public static int[] field2205 = new int[4096];

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field2195;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field2185 = arg0.method347(26119);
                                }
                            } else {
                                this.field2204 = arg0.method347(26119);
                            }
                        } else {
                            this.field2206 = arg0.method347(26119);
                        }
                    } else {
                        this.field2189 = arg0.method347(26119);
                    }
                } else {
                    this.field2199 = arg0.method301(119);
                }
            } else {
                this.field2202 = arg0.method347(arg1 ^ -26118);
            }
        } else {
            this.field2204 = this.field2185 = arg0.method347(26119);
        }
        if (arg1 != -3) {
            this.method823(-66);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field2193;
        if (arg1 <= 19) {
            this.field2204 = -100;
        }
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int var4 = class111.field2023[arg0] * this.field2185 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class70.field1276 < ~var7; ++var7) {
                class80.field1452 = Integer.MAX_VALUE;
                class102.field1852 = Integer.MAX_VALUE;
                class199.field3811 = Integer.MAX_VALUE;
                class132.field2474 = Integer.MAX_VALUE;
                int var8 = class22.field351[var7] * this.field2204 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field2191[255 & (var11 < this.field2185 ? var11 : -this.field2185 + var11)];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field2191[var13 - -(this.field2204 <= var14 ? -this.field2204 + var14 : var14) & 255] & 255);
                        int var27 = var15 + 1;
                        int var16 = var8 + -this.field2190[var15] + -(var14 << 12);
                        int var17 = -(var11 << 12) + -this.field2190[var27] + var4;
                        int var18 = this.field2206;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 >= 0 ? var17 : -var17;
                                int var26 = var16 < 0 ? -var16 : var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class132.field2474 > var19) {
                            class80.field1452 = class102.field1852;
                            class102.field1852 = class199.field3811;
                            class199.field3811 = class132.field2474;
                            class132.field2474 = var19;
                        } else if (~var19 <= ~class199.field3811) {
                            if (~var19 <= ~class102.field1852) {
                                if (var19 < class80.field1452) {
                                    class80.field1452 = var19;
                                }
                            } else {
                                class80.field1452 = class102.field1852;
                                class102.field1852 = var19;
                            }
                        } else {
                            class80.field1452 = class102.field1852;
                            class102.field1852 = class199.field3811;
                            class199.field3811 = var19;
                        }
                    }
                }
                int var12 = this.field2189;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class132.field2474 + class199.field3811;
                                }
                            } else {
                                var3[var7] = class80.field1452;
                            }
                        } else {
                            var3[var7] = class102.field1852;
                        }
                    } else {
                        var3[var7] = class199.field3811;
                    }
                } else {
                    var3[var7] = class132.field2474;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method821(Component arg0, int arg1) {
        if (arg1 > 65) {
            arg0.removeKeyListener(class166.field3190);
            arg0.removeFocusListener(class166.field3190);
            class32.field524 = -1;
            ++field2200;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIBI)V")
    public static final void method822(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field2192;
        if (~class140.field2597 != ~arg2 || class110.field2016 != arg3 || ~class157.field3028 != ~arg0 && class245.field4499) {
            class157.field3028 = arg0;
            if (!class245.field4499) {
                class157.field3028 = 0;
            }
            class110.field2016 = arg3;
            class140.field2597 = arg2;
            if (arg4 < 114) {
                field2196 = null;
            }
            class131.method883(25, 65536);
            client.method221(class242.field4480, true, -22717);
            int var6 = class223.field4214;
            int var7 = class190.field3681;
            class190.field3681 = arg3 * 8 - 48;
            int var8 = -var7 + class190.field3681;
            class223.field4214 = (arg2 + -6) * 8;
            int var9 = -var6 + class223.field4214;
            int var10 = class223.field4214;
            int var11 = class190.field3681;
            for (int var12 = 0; ~var12 > -32769; ++var12) {
                class191 var28 = class225.field4225[var12];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field4089[var29] -= var9;
                        var28.field4143[var29] -= var8;
                    }
                    var28.field4123 -= var8 * 128;
                    var28.field4138 -= var9 * 128;
                }
            }
            for (int var13 = 0; var13 < 2048; ++var13) {
                class44 var26 = class244.field4493[var13];
                if (var26 != null) {
                    for (int var27 = 0; ~var27 > -11; ++var27) {
                        var26.field4089[var27] -= var9;
                        var26.field4143[var27] -= var8;
                    }
                    var26.field4138 -= var9 * 128;
                    var26.field4123 -= var8 * 128;
                }
            }
            class149.field2909 = arg0;
            byte var14 = 0;
            byte var15 = 104;
            class240.field4458.method1476(false, arg5, 0, arg1);
            byte var16 = 0;
            byte var17 = 1;
            if (~var9 > -1) {
                var15 = -1;
                var17 = -1;
                var14 = 103;
            }
            byte var18 = 1;
            byte var19 = 104;
            if (var8 < 0) {
                var19 = -1;
                var18 = -1;
                var16 = 103;
            }
            for (int var20 = var14; ~var15 != ~var20; var20 += var17) {
                for (int var22 = var16; ~var19 != ~var22; var22 += var18) {
                    int var23 = var9 + var20;
                    int var24 = var22 - -var8;
                    for (int var25 = 0; var25 < 4; ++var25) {
                        if (var23 >= 0 && ~var24 <= -1 && ~var23 > -105 && var24 < 104) {
                            class134.field2499[var25][var20][var22] = class134.field2499[var25][var23][var24];
                        } else {
                            class134.field2499[var25][var20][var22] = null;
                        }
                    }
                }
            }
            for (class159 var21 = (class159) class62.field1140.method1612(false); var21 != null; var21 = (class159) class62.field1140.method1621(82)) {
                var21.field3061 -= var9;
                var21.field3054 -= var8;
                if (var21.field3061 < 0 || ~var21.field3054 > -1 || var21.field3061 >= 104 || var21.field3054 >= 104) {
                    var21.method460(true);
                }
            }
            if (~class116.field2104 != -1) {
                class116.field2104 -= var9;
                class140.field2596 -= var8;
            }
            class172.field3338 = -1;
            class179.field3569 = false;
            class174.field3447 = 0;
            class42.field714.method1618(-3);
            class167.field3222.method1618(-3);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        ++field2187;
        this.field2191 = class159.method1074(this.field2202, 374);
        this.method823(arg0 ^ -62);
        if (arg0 != -69) {
            this.method123((byte) 93);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class120() {
        super(0, true);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    private final void method823(int arg0) {
        if (arg0 < 114) {
            this.field2190 = null;
        }
        Random var2 = new Random((long) this.field2202);
        this.field2190 = new short[512];
        if (~this.field2199 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2190[var3] = (short) class119.method814(this.field2199, var2, 54210528);
            }
        }
        ++field2186;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public static void method824(int arg0) {
        field2196 = null;
        field2194 = null;
        field2205 = null;
        field2201 = null;
        if (arg0 != 15506) {
            field2194 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Li;I)I")
    public static final int method825(class88 arg0, int arg1) {
        ++field2198;
        if (arg0 == null) {
            return -1;
        } else {
            int var2 = -48 / ((-29 - arg1) / 58);
            for (int var3 = 0; var3 < class146.field2731; ++var3) {
                if (arg0.method624(class23.field370[var3], (byte) 81)) {
                    return var3;
                }
            }
            return -1;
        }
    }
}
