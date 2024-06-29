import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class223 extends class33 {

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private int field4261 = 1638;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "Z")
    private boolean field4268 = true;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
    private int field4270 = 4;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    private int field4272 = 4;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    private int field4274 = 4;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "[I")
    private int[] field4276 = new int[512];

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
    private int field4277 = 0;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "[I")
    public static int[] field4269 = new int[128];

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "Lrd;")
    public static class173 field4278 = class133.method843("Freie Welt", 57);

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "[I")
    private int[] field4264;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "[I")
    private int[] field4265;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = 38 % ((arg1 - -65) / 60);
        ++field4260;
        int[] var4 = super.field718.method514(arg0, -16);
        if (super.field718.field1615) {
            int var5 = this.field4272 << 12;
            int var6 = class105.field1937[arg0] * this.field4272;
            int var7 = this.field4274 << 12;
            for (int var8 = 0; ~class117.field2173 < ~var8; ++var8) {
                int var9 = 0;
                int var10 = class138.field2585[var8] * this.field4274;
                for (int var11 = 0; ~var11 > ~this.field4270; ++var11) {
                    int var12 = this.field4265[var11];
                    int var13 = this.field4264[var11];
                    int var14 = this.method1439(var5 * var12 >> 12, 124, var6 * var12 >> 12, var7 * var12 >> 12, var10 * var12 >> 12);
                    var9 += var13 * var14 >> 12;
                }
                if (this.field4268) {
                    var9 = 2048 - -(var9 >> 1);
                }
                var4[var8] = var9;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIII)I")
    private final int method1439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4262;
        int var6 = arg2 & -4096;
        int var7 = arg4 & -4096;
        int var8 = arg2 - var6;
        int var9 = var6 >> 12;
        int var10 = arg3 & -4096;
        int var11 = var9 + 1;
        int var12 = arg4 - var7;
        int var13 = var9 & 255;
        int var14 = var7 >> 12;
        int var15 = -4096 & arg0;
        if (~var11 <= ~(var15 >> 12)) {
            var11 = 0;
        }
        int var16 = var11 & 255;
        int var17 = var14 + 1;
        int var18 = var14 & 255;
        if (arg1 <= 94) {
            return -72;
        } else {
            if (~var17 <= ~(var10 >> 12)) {
                var17 = 0;
            }
            int var19 = this.field4276[this.field4276[var13] + var18] % 4;
            int var20 = this.field4276[var18 - -this.field4276[var16]] % 4;
            int var21 = var17 & 255;
            int var22 = this.field4276[this.field4276[var16] + var21] % 4;
            int var23 = this.field4276[var21 - -this.field4276[var13]] % 4;
            int var24 = class40.method295(var12, class24.field524[var19], var8, 0);
            int var25 = class40.method295(var12 + -4096, class24.field524[var23], var8, 0);
            int var26 = class40.method295(var12, class24.field524[var20], var8 + -4096, 0);
            int var27 = class40.method295(var12 + -4096, class24.field524[var22], var8 + -4096, 0);
            int var28 = class145.method926(-1738796884, var12);
            int var29 = class145.method926(-1738796884, var8);
            int var30 = class22.method184(var24, var28, var25, 115);
            int var31 = class22.method184(var26, var28, var27, 98);
            return class22.method184(var30, var29, var31, 117);
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    private final void method1440(int arg0) {
        ++field4271;
        Random var2 = new Random((long) this.field4277);
        if (arg0 != 1638) {
            this.method177(-50, 41, (class121) null);
        }
        for (int var3 = 0; var3 < 255; ++var3) {
            this.field4276[var3] = -1;
        }
        for (int var4 = 0; var4 < 255; ++var4) {
            int var5;
            do {
                var5 = class159.method1044(255, (byte) 117, var2);
            } while (~this.field4276[var5] != 0);
            this.field4276[var5 + 255] = this.field4276[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static void method1441(byte arg0) {
        field4278 = null;
        if (arg0 > -101) {
            method1442(52, 20);
        }
        field4269 = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class223() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)I")
    public static final int method1442(int arg0, int arg1) {
        if (arg1 != -1897070191) {
            method1443(-34, (class173) null);
        }
        ++field4266;
        return (arg0 & 1022391) >> 17;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILrd;)V")
    public static final void method1443(int arg0, class173 arg1) {
        ++field4267;
        if (arg0 != 0) {
            field4278 = null;
        }
        if (~class199.field3880 <= -3) {
            if (arg1.method1123(~arg0, class29.field603)) {
                System.gc();
            }
            if (arg1.method1123(arg0 ^ 114, class37.field792)) {
                class11.method71(-18070);
            }
            if (arg1.method1123(-126, class175.field3448)) {
                class57.field1128 = true;
            }
            if (arg1.method1123(7, class120.field2206)) {
                class57.field1128 = false;
            }
            arg1.method1123(110, class94.field1762);
            arg1.method1123(35, class121.field2286);
            if (arg1.method1123(arg0 + 57, class219.field4224)) {
                for (int var2 = 0; ~var2 > -5; ++var2) {
                    for (int var3 = 1; ~var3 > -104; ++var3) {
                        for (int var4 = 1; ~var4 > -104; ++var4) {
                            class35.field760[var2].field3474[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method1157(class161.field3001, false) && class105.field1970 != 0) {
                class69.method425(-94, arg1.method1140(6, (byte) 114).method1154(70));
            }
            if (arg1.method1123(-124, class116.field2147) && ~class105.field1970 == -3) {
                throw new RuntimeException();
            }
            if (arg1.method1157(class125.field2357, false)) {
                class114.field2117 = arg1.method1140(12, (byte) 117).method1122(108).method1154(arg0 ^ 17);
                class166.method1074((class173) null, 0, class173.method1158(-3, new class173[] { class108.field2022, class93.method588(class114.field2117, true) }), 82);
            }
            if (arg1.method1123(arg0 + -127, class151.field2864)) {
                class119.field2189 = true;
            }
        }
        class165.field3175.method1023(29, -21822);
        ++class152.field2880;
        class165.field3175.method752(-1 + arg1.method1153((byte) -128), (byte) -128);
        class165.field3175.method774(false, arg1.method1140(2, (byte) 118));
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field4272 = arg2.method751((byte) -102);
                                }
                            } else {
                                this.field4274 = arg2.method751((byte) -100);
                            }
                        } else {
                            this.field4277 = arg2.method751((byte) -107);
                        }
                    } else {
                        this.field4274 = this.field4272 = arg2.method751((byte) -25);
                    }
                } else {
                    this.field4261 = arg2.method782(true);
                    if (~this.field4261 > -1) {
                        this.field4264 = new int[this.field4270];
                        for (int var5 = 0; ~this.field4270 < ~var5; ++var5) {
                            this.field4264[var5] = arg2.method782(true);
                        }
                    }
                }
            } else {
                this.field4270 = arg2.method751((byte) 106);
            }
        } else {
            this.field4268 = ~arg2.method751((byte) 108) == -2;
        }
        if (arg1 > -99) {
            this.method177(91, 84, (class121) null);
        }
        ++field4273;
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
    private final void method1444(int arg0) {
        if (this.field4261 > arg0) {
            this.field4265 = new int[this.field4270];
            this.field4264 = new int[this.field4270];
            for (int var2 = 0; var2 < this.field4270; ++var2) {
                this.field4264[var2] = (int) (Math.pow((double) ((float) this.field4261 / 4096.0F), (double) var2) * 4096.0D);
                this.field4265[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
            }
        } else if (this.field4264 != null && ~this.field4264.length == ~this.field4270) {
            this.field4265 = new int[this.field4270];
            for (int var3 = 0; var3 < this.field4270; ++var3) {
                this.field4265[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        ++field4263;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 != -1) {
            method1443(12, (class173) null);
        }
        this.method1440(1638);
        this.method1444(0);
        ++field4275;
    }
}
