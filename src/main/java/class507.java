import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class507 extends class694 {

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "I")
    private int field6934 = 0;

    @OriginalMember(owner = "client!lq", name = "V", descriptor = "I")
    private int field6947 = 0;

    @OriginalMember(owner = "client!lq", name = "Y", descriptor = "I")
    private int field6950 = 0;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "Z")
    public static boolean field6935 = false;

    @OriginalMember(owner = "client!lq", name = "T", descriptor = "Lve;")
    public static class463 field6945 = new class463();

    @OriginalMember(owner = "client!lq", name = "W", descriptor = "Luc;")
    public static class27 field6948 = new class27(65, 3);

    @OriginalMember(owner = "client!lq", name = "U", descriptor = "F")
    public static float field6946;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    private int field6932;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    private int field6936;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    private int field6939;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    private int field6940;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
    private int field6942;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "I")
    private int field6944;

    @OriginalMember(owner = "client!lq", name = "X", descriptor = "Z")
    public static boolean field6949;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method2821(boolean arg0) {
        ++field6937;
        if (!arg0) {
            method2824((byte) -75);
        }
        class1.method5(1, class676.field9548);
        ++class686.field9651;
        class288.field4014.method746((byte) -87, 0);
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V", line = 140)
    public class507() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILjr;B)V", line = 24)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field6941;
        int var4 = 123 % ((arg2 - 58) / 63);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field6950 = (arg1.method748(-813976688) << 12) / 100;
                }
            } else {
                this.field6934 = (arg1.method748(-813976688) << 12) / 100;
            }
        } else {
            this.field6947 = arg1.method722(4);
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(II)[[I", line = 68)
    public final int[][] method15(int arg0, int arg1) {
        ++field6943;
        if (arg0 != -22151) {
            return null;
        } else {
            int[][] var3 = super.field9740.method3483(arg1, true);
            if (super.field9740.field8738) {
                int[][] var4 = this.method3812(arg1, 0, -14032);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class465.field6544 > var11; ++var11) {
                    this.method2822(var5[var11], var6[var11], var7[var11], 4096);
                    this.field6932 += this.field6934;
                    this.field6942 += this.field6947;
                    this.field6939 += this.field6950;
                    while (this.field6942 < 0) {
                        this.field6942 += 4096;
                    }
                    while (~this.field6942 < -4097) {
                        this.field6942 -= 4096;
                    }
                    if (this.field6932 < 0) {
                        this.field6932 = 0;
                    }
                    if (this.field6932 > 4096) {
                        this.field6932 = 4096;
                    }
                    if (~this.field6939 > -1) {
                        this.field6939 = 0;
                    }
                    if (~this.field6939 < -4097) {
                        this.field6939 = 4096;
                    }
                    this.method2823(this.field6942, this.field6939, -114, this.field6932);
                    var8[var11] = this.field6936;
                    var9[var11] = this.field6940;
                    var10[var11] = this.field6944;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)V", line = 144)
    private final void method2822(int arg0, int arg1, int arg2, int arg3) {
        ++field6933;
        int var5 = arg0 <= arg1 ? arg1 : arg0;
        int var6 = ~var5 > ~arg2 ? arg2 : var5;
        int var7 = arg1 > arg0 ? arg0 : arg1;
        int var8 = var7 > arg2 ? arg2 : var7;
        this.field6939 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (arg3 == 4096) {
            if (~this.field6939 < -1 && ~this.field6939 > -4097) {
                this.field6932 = (var9 << 12) / (this.field6939 > 2048 ? -(this.field6939 * 2) + 8192 : this.field6939 * 2);
            } else {
                this.field6932 = 0;
            }
            if (~var9 >= -1) {
                this.field6942 = 0;
            } else {
                int var10 = (-arg0 + var6 << 12) / var9;
                int var11 = (-arg1 + var6 << 12) / var9;
                int var12 = (-arg2 + var6 << 12) / var9;
                if (~arg0 == ~var6) {
                    this.field6942 = ~arg1 != ~var8 ? -var11 + 4096 : var12 + 20480;
                } else if (arg1 == var6) {
                    this.field6942 = ~arg2 != ~var8 ? -var12 + 12288 : 4096 - -var10;
                } else {
                    this.field6942 = arg0 != var8 ? -var10 + 20480 : var11 + 12288;
                }
                this.field6942 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(IIII)V", line = 198)
    private final void method2823(int arg0, int arg1, int arg2, int arg3) {
        ++field6938;
        if (arg2 <= -68) {
            int var5 = ~arg1 >= -2049 ? (arg3 + 4096) * arg1 >> 12 : arg1 + arg3 - (arg1 * arg3 >> 12);
            if (~var5 >= -1) {
                this.field6936 = this.field6940 = this.field6944 = arg1;
            } else {
                int var6 = arg0 * 6;
                int var7 = arg1 + arg1 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 - -var13;
                int var15 = var5 - var13;
                if (~var9 != -1) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 != 3) {
                                if (~var9 != -5) {
                                    if (var9 == 5) {
                                        this.field6940 = var7;
                                        this.field6944 = var15;
                                        this.field6936 = var5;
                                    }
                                } else {
                                    this.field6936 = var14;
                                    this.field6944 = var5;
                                    this.field6940 = var7;
                                }
                            } else {
                                this.field6944 = var5;
                                this.field6940 = var15;
                                this.field6936 = var7;
                            }
                        } else {
                            this.field6940 = var5;
                            this.field6944 = var14;
                            this.field6936 = var7;
                        }
                    } else {
                        this.field6936 = var15;
                        this.field6944 = var7;
                        this.field6940 = var5;
                    }
                } else {
                    this.field6944 = var7;
                    this.field6940 = var14;
                    this.field6936 = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 315)
    public static void method2824(byte arg0) {
        field6945 = null;
        field6948 = null;
        if (arg0 != 39) {
            field6945 = null;
        }
    }
}
