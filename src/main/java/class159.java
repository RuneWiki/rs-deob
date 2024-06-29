import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class159 extends class202 {

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    private int field2169 = 5;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    private int field2173 = 0;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    private int field2170 = 2;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "[B")
    private byte[] field2175 = new byte[512];

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "[S")
    private short[] field2177 = new short[512];

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    private int field2180 = 1;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    private int field2183 = 2048;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    private int field2185 = 5;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field2171 = new String[5];

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "Lss;")
    public static class213 field2179 = new class213("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "[[I")
    public static int[][] field2186;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field2185 = arg0.method1445(-94);
                                }
                            } else {
                                this.field2169 = arg0.method1445(43);
                            }
                        } else {
                            this.field2180 = arg0.method1445(93);
                        }
                    } else {
                        this.field2170 = arg0.method1445(-103);
                    }
                } else {
                    this.field2183 = arg0.method1455(-3387);
                }
            } else {
                this.field2173 = arg0.method1445(-119);
            }
        } else {
            this.field2169 = this.field2185 = arg0.method1445(-116);
        }
        int var5 = -70 / ((-46 - arg1) / 50);
        ++field2178;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2184;
        if (class385.method2479(0, arg2)) {
            int var10 = -86 % ((arg5 - 21) / 57);
            if (class462.field7111[arg2] != null) {
                client.method505(class462.field7111[arg2], -1, arg3, arg4, arg9, arg7, arg6, arg8, arg1, arg0);
            } else {
                client.method505(class433.field6540[arg2], -1, arg3, arg4, arg9, arg7, arg6, arg8, arg1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field2172;
        this.field2175 = class309.method2073(0, this.field2173);
        this.method970(-513);
        int var2 = -6 / ((arg0 - 80) / 46);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
    public static final void method969(int arg0) {
        class381.method2462();
        ++field2182;
        if (arg0 != -1947139796) {
            method968(93, -43, 35, -101, -112, -41, -89, 18, -2, -50);
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V")
    private final void method970(int arg0) {
        if (arg0 != -513) {
            method968(-92, 26, 21, 6, -93, 121, -127, -5, 10, 90);
        }
        ++field2174;
        Random var2 = new Random((long) this.field2173);
        this.field2177 = new short[512];
        if (this.field2183 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2177[var3] = (short) class167.method1057(arg0 + -2968, var2, this.field2183);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field2176;
        int[] var3 = super.field3064.method2452((byte) 43, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field3064.field5837) {
                int var4 = class521.field7716[arg0] * this.field2185 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class276.field4375; ++var7) {
                    class415.field6281 = Integer.MAX_VALUE;
                    class95.field1390 = Integer.MAX_VALUE;
                    class276.field4379 = Integer.MAX_VALUE;
                    class331.field5188 = Integer.MAX_VALUE;
                    int var8 = class476.field7271[var7] * this.field2169 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                        int var13 = this.field2175[(var11 >= this.field2185 ? -this.field2185 + var11 : var11) & 255] & 255;
                        for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                            int var15 = (255 & this.field2175[255 & (~this.field2169 < ~var14 ? var14 : -this.field2169 + var14) + var13]) * 2;
                            int var10001 = var14 << 12;
                            int var27 = var15 + 1;
                            int var16 = var8 - (var10001 + this.field2177[var15]);
                            int var17 = -this.field2177[var27] + var4 - (var11 << 12);
                            int var18 = this.field2180;
                            int var19;
                            if (~var18 != -2) {
                                if (~var18 != -4) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (~var17 <= -1 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 >= 0 ? var17 : -var17;
                                    int var26 = var16 < 0 ? -var16 : var16;
                                    var19 = ~var25 <= ~var26 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~var19 <= ~class331.field5188) {
                                if (~var19 > ~class276.field4379) {
                                    class415.field6281 = class95.field1390;
                                    class95.field1390 = class276.field4379;
                                    class276.field4379 = var19;
                                } else if (~class95.field1390 >= ~var19) {
                                    if (var19 < class415.field6281) {
                                        class415.field6281 = var19;
                                    }
                                } else {
                                    class415.field6281 = class95.field1390;
                                    class95.field1390 = var19;
                                }
                            } else {
                                class415.field6281 = class95.field1390;
                                class95.field1390 = class276.field4379;
                                class276.field4379 = class331.field5188;
                                class331.field5188 = var19;
                            }
                        }
                    }
                    int var12 = this.field2170;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = class276.field4379 - class331.field5188;
                                    }
                                } else {
                                    var3[var7] = class415.field6281;
                                }
                            } else {
                                var3[var7] = class95.field1390;
                            }
                        } else {
                            var3[var7] = class276.field4379;
                        }
                    } else {
                        var3[var7] = class331.field5188;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(III)I")
    public static final int method971(int arg0, int arg1, int arg2) {
        int var3 = (127 & arg1) * arg0 >> 7;
        ++field2181;
        if (var3 >= 2) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return arg2 != 0 ? 123 : (arg1 & 65408) + var3;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(Z)V")
    public static void method972(boolean arg0) {
        field2179 = null;
        if (arg0) {
            field2186 = null;
            field2171 = null;
        }
    }
}
