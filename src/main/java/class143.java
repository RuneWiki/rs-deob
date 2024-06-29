import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class143 extends class297 {

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "[S")
    private short[] field2309 = new short[512];

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    private int field2310 = 2048;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    private int field2319 = 0;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    private int field2315 = 2;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    private int field2306 = 5;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    private int field2318 = 5;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "[B")
    private byte[] field2307 = new byte[512];

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
    private int field2323 = 1;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "Lwn;")
    public static class30 field2320 = new class30();

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Ltk;")
    public static class266 field2313;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)V", line = 4)
    public static void method1096(boolean arg0) {
        field2313 = null;
        field2320 = null;
        if (arg0) {
            method1096(false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 15)
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILaj;)V", line = 43)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field2318 = this.field2306 = arg2.method15((byte) 99);
        } else if (arg0 == 1) {
            this.field2319 = arg2.method15((byte) -115);
        } else if (arg0 == 2) {
            this.field2310 = arg2.method56(19612);
        } else if (arg0 == 3) {
            this.field2315 = arg2.method15((byte) -73);
        } else if (arg0 == 4) {
            this.field2323 = arg2.method15((byte) -71);
        } else if (arg0 == 5) {
            this.field2318 = arg2.method15((byte) -71);
        } else if (arg0 == 6) {
            this.field2306 = arg2.method15((byte) -107);
        }
        if (arg1 != 255) {
            method1100(18, -110);
        }
        field2311++;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V", line = 105)
    public static final void method1097(int arg0) {
        int var1 = -89 % ((arg0 + 26) / 36);
        field2316++;
        class147.field2416.method2282((byte) -125);
        class18.field347.method2282((byte) -128);
        class13.field286.method2282((byte) -122);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 122)
    public final void method247(byte arg0) {
        this.field2307 = class32.method286((byte) 34, this.field2319);
        if (arg0 != 68) {
            this.field2310 = -123;
        }
        this.method1099(false);
        field2317++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)[I", line = 136)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            this.method247((byte) 60);
        }
        field2322++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int var4 = class264.field3901[arg0] * this.field2306 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class31.field491; var7++) {
                class24.field416 = Integer.MAX_VALUE;
                class10.field235 = Integer.MAX_VALUE;
                class87.field1403 = Integer.MAX_VALUE;
                class285.field4449 = Integer.MAX_VALUE;
                int var8 = (class251.field3705[var7] * this.field2318) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2307[(var11 < this.field2306 ? var11 : var11 - this.field2306) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2307[var12 + (var13 < this.field2318 ? var13 : var13 - this.field2318) & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field2309[var14];
                        int var16 = var4 - this.field2309[var27] - (var11 << 12);
                        int var17 = this.field2323;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var16 < 0 ? -var16 : var16;
                            int var20 = var15 < 0 ? -var15 : var15;
                            var18 = var19 >= var20 ? var19 : var20;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var16 * var16;
                            int var25 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 < 0 ? -var15 : var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class285.field4449) {
                            class24.field416 = class10.field235;
                            class10.field235 = class87.field1403;
                            class87.field1403 = class285.field4449;
                            class285.field4449 = var18;
                        } else if (class87.field1403 > var18) {
                            class24.field416 = class10.field235;
                            class10.field235 = class87.field1403;
                            class87.field1403 = var18;
                        } else if (var18 < class10.field235) {
                            class24.field416 = class10.field235;
                            class10.field235 = var18;
                        } else if (var18 < class24.field416) {
                            class24.field416 = var18;
                        }
                    }
                }
                int var26 = this.field2315;
                if (var26 == 0) {
                    var3[var7] = class285.field4449;
                } else if (var26 == 1) {
                    var3[var7] = class87.field1403;
                } else if (var26 == 3) {
                    var3[var7] = class10.field235;
                } else if (var26 == 4) {
                    var3[var7] = class24.field416;
                } else if (var26 == 2) {
                    var3[var7] = class87.field1403 - class285.field4449;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V", line = 342)
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -18) {
            method1100(-13, -31);
        }
        for (class71 var5 = (class71) class180.field2858.method268(-1); var5 != null; var5 = (class71) class180.field2858.method278(1)) {
            class5.method88(arg2, arg1, var5, 127, arg3, arg4);
        }
        field2321++;
        for (class71 var6 = (class71) class76.field1176.method268(-1); var6 != null; var6 = (class71) class76.field1176.method278(1)) {
            byte var7 = 1;
            class66 var8 = var6.field1076.method2062((byte) -113);
            if (var6.field1076.field4614 == var8.field1006) {
                var7 = 0;
            } else if (var6.field1076.field4614 == var8.field1004 || var6.field1076.field4614 == var8.field977 || var6.field1076.field4614 == var8.field996 || var6.field1076.field4614 == var8.field975) {
                var7 = 2;
            } else if (var6.field1076.field4614 == var8.field991 || var6.field1076.field4614 == var8.field964 || var6.field1076.field4614 == var8.field999 || var6.field1076.field4614 == var8.field972) {
                var7 = 3;
            }
            if (var6.field1072 != var7) {
                int var9 = class294.method2065(var6.field1076, (byte) 123);
                if (var6.field1091 != var9) {
                    if (var6.field1089 != null) {
                        class181.field2877.method2345(var6.field1089);
                        var6.field1089 = null;
                    }
                    var6.field1091 = var9;
                }
                var6.field1072 = var7;
            }
            var6.field1069 = var6.field1076.field4671;
            var6.field1090 = var6.field1076.field4671 + var6.field1076.method738(-6421) * 64;
            var6.field1087 = var6.field1076.field4672;
            var6.field1081 = var6.field1076.field4672 + var6.field1076.method738(-6421) * 64;
            class5.method88(arg2, arg1, var6, 127, arg3, arg4);
        }
        for (class71 var10 = (class71) class107.field1754.method71((byte) -93); var10 != null; var10 = (class71) class107.field1754.method84(1)) {
            byte var11 = 1;
            class66 var12 = var10.field1084.method2062((byte) -97);
            if (var10.field1084.field4614 == var12.field1006) {
                var11 = 0;
            } else if (var10.field1084.field4614 == var12.field1004 || var10.field1084.field4614 == var12.field977 || var10.field1084.field4614 == var12.field996 || var10.field1084.field4614 == var12.field975) {
                var11 = 2;
            } else if (var10.field1084.field4614 == var12.field991 || var10.field1084.field4614 == var12.field964 || var10.field1084.field4614 == var12.field999 || var10.field1084.field4614 == var12.field972) {
                var11 = 3;
            }
            if (var10.field1072 != var11) {
                int var13 = class96.method778(var10.field1084, (byte) -18);
                if (var10.field1091 != var13) {
                    if (var10.field1089 != null) {
                        class181.field2877.method2345(var10.field1089);
                        var10.field1089 = null;
                    }
                    var10.field1091 = var13;
                }
                var10.field1072 = var11;
            }
            var10.field1069 = var10.field1084.field4671;
            var10.field1090 = var10.field1084.field4671 + var10.field1084.method738(-6421) * 64;
            var10.field1087 = var10.field1084.field4672;
            var10.field1081 = var10.field1084.field4672 + var10.field1084.method738(-6421) * 64;
            class5.method88(arg2, arg1, var10, 127, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(Z)V", line = 477)
    private final void method1099(boolean arg0) {
        field2308++;
        Random var2 = new Random((long) this.field2319);
        if (arg0) {
            return;
        }
        this.field2309 = new short[512];
        if (this.field2310 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field2309[var3] = (short) class64.method509(this.field2310, var2, 69);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 507)
    public static final void method1100(int arg0, int arg1) {
        field2312++;
        if (arg1 >= 0 && class122.field1988.length > arg1) {
            class122.field1988[arg1] = !class122.field1988[arg1];
            if (arg0 != 4505) {
                method1096(false);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V", line = 529)
    public static final void method1101(int arg0) {
        class9.field213.method2282((byte) -128);
        if (arg0 != 0) {
            field2313 = (class266) null;
        }
        class19.field359.method2282((byte) -128);
        field2314++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)I", line = 541)
    public static final int method1102(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }
}
