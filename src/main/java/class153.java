import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class153 extends class294 {

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field2315;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    private int field2309;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2302 = "Allocating memory";

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2314 = "Attack";

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    private int field2300;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    private int field2304;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "[B")
    private byte[] field2305;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V", line = 12)
    public final void method739(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.field2304 = this.field2318 - (arg1 < 0 ? -arg1 : arg1);
            this.field2304 = this.field2304 * this.field2304 >> 12;
            this.field2311 = this.field2304;
            this.field2310 = 4096;
        } else {
            this.field2310 = this.field2315 * this.field2304 >> 12;
            if (this.field2310 < 0) {
                this.field2310 = 0;
            } else if (this.field2310 > 4096) {
                this.field2310 = 4096;
            }
            this.field2304 = this.field2318 - (arg1 >= 0 ? arg1 : -arg1);
            this.field2304 = this.field2304 * this.field2304 >> 12;
            this.field2304 = this.field2310 * this.field2304 >> 12;
            this.field2311 += this.field2309 * this.field2304 >> 12;
            this.field2309 = this.field2316 * this.field2309 >> 12;
        }
        if (arg2 != 1858111180) {
            this.method739(94, -56, -7);
        }
        field2307++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V", line = 58)
    public void method33(int arg0, byte arg1) {
        field2308++;
        this.field2305[arg0] = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([ILfk;I[I[I)V", line = 69)
    public static final void method1122(int[] arg0, class45 arg1, int arg2, int[] arg3, int[] arg4) {
        field2303++;
        if (arg2 != 4929) {
            method1122((int[]) null, (class45) null, -62, (int[]) null, (int[]) null);
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var8 != 0 && var9 < arg1.field4449.length) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field4449[var9] = null;
                    } else {
                        class162 var10 = class173.method1259((byte) 119, var6);
                        int var11 = var10.field2402;
                        class47 var12 = arg1.field4449[var9];
                        if (var12 != null) {
                            if (var12.field720 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field4449[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field730 = 0;
                                    var12.field726 = 1;
                                    var12.field719 = 0;
                                    var12.field724 = 0;
                                    var12.field725 = var7;
                                    class158.method1143(arg1.field4496, 121, arg1.field4507, var10, false, 0);
                                } else if (var11 == 2) {
                                    var12.field719 = 0;
                                }
                            } else if (var10.field2405 >= class173.method1259((byte) 119, var12.field720).field2405) {
                                var12 = arg1.field4449[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class47 var13 = arg1.field4449[var9] = new class47();
                            var13.field730 = 0;
                            var13.field719 = 0;
                            var13.field726 = 1;
                            var13.field720 = var6;
                            var13.field725 = var7;
                            var13.field724 = 0;
                            class158.method1143(arg1.field4496, 92, arg1.field4507, var10, false, 0);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)I", line = 165)
    public static final int method1123(byte arg0) {
        field2306++;
        if (arg0 != 119) {
            field2299 = 35;
        }
        return class11.field116 && class50.field768[81] && class6.field62 > 2 ? class67.field994[class6.field62 - 2] : class67.field994[class6.field62 - 1];
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V", line = 180)
    public final void method742(byte arg0) {
        if (arg0 >= 60) {
            this.field2300 = 0;
            field2312++;
            this.field2311 = 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V", line = 193)
    public static void method1124(int arg0) {
        field2302 = null;
        int var1 = -37 % ((-arg0 - 30) / 61);
        field2314 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 204)
    public final void method745(byte arg0) {
        this.field2311 >>= 0x4;
        if (this.field2311 < 0) {
            this.field2311 = 0;
        } else if (this.field2311 > 255) {
            this.field2311 = 255;
        }
        this.field2309 = this.field2316;
        field2301++;
        this.method33(this.field2300++, (byte) this.field2311);
        if (arg0 == 107) {
            this.field2311 = 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIFFF)V", line = 224)
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2315 = (int) (arg7 * 4096.0F);
        this.field2318 = (int) (arg6 * 4096.0F);
        this.field2309 = this.field2316 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZB)V", line = 236)
    public static final void method1125(boolean arg0, byte arg1) {
        class199.field3148 = new int[104];
        class125.field1983 = new int[104];
        class43.field680 = 99;
        int var2 = 119 % ((arg1 + 28) / 58);
        class17.field191 = new int[104];
        class328.field5085 = new int[104];
        class263.field3931 = new int[104];
        field2298++;
        byte var3;
        if (arg0) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        class65.field963 = new byte[var3][104][104];
        class314.field4872 = new byte[var3][104][104];
        class323.field5018 = new byte[var3][104][104];
        class58.field868 = new int[var3][105][105];
        class277.field4260 = new byte[var3][105][105];
        class272.field4118 = new byte[var3][104][104];
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(III)V", line = 264)
    public static final void method1126(int arg0, int arg1, int arg2) {
        int var3 = 62 % ((arg2 + 81) / 33);
        if (class287.field4415 != arg1) {
            class179.field2684 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class179.field2684[var4] = (var4 << 12) / arg1;
            }
            class287.field4415 = arg1;
            class133.field2090 = arg1 - 1;
            class79.field1115 = arg1 == 64 ? 2048 : 4096;
        }
        if (class282.field4361 != arg0) {
            if (class287.field4415 == arg0) {
                class260.field3858 = class179.field2684;
            } else {
                class260.field3858 = new int[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    class260.field3858[var5] = (var5 << 12) / arg0;
                }
            }
            class11.field120 = arg0 - 1;
            class282.field4361 = arg0;
        }
        field2313++;
    }
}
