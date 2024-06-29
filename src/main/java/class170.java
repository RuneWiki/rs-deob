import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class170 extends class23 {

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field3024 = 0;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    private int field3039 = 0;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    private int field3040 = 0;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field3023 = 0;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "Z")
    public static boolean field3030 = false;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "[Llc;")
    public static class143[] field3029 = new class143[1000];

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3034 = 0;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    private int field3026;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    private int field3035;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    private int field3037;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    private int field3042;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    private int field3046;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "Lfd;")
    public static class213 field3036;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)Llc;")
    public static final class143 method1114(int arg0, boolean arg1) {
        if (arg1) {
            method1119((class143) null, 106, (class143) null, -64);
        }
        ++field3027;
        class143 var2 = new class143();
        var2.field2503 = new byte[arg0];
        var2.field2548 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public static void method1115(int arg0) {
        field3036 = null;
        if (arg0 != 0) {
            method1114(48, true);
        }
        field3029 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3040 = (arg0.method1234(false) << 12) / 100;
                }
            } else {
                this.field3039 = (arg0.method1234(false) << 12) / 100;
            }
        } else {
            this.field3024 = arg0.method1274((byte) 92);
        }
        if (!arg2) {
            field3030 = false;
        }
        ++field3031;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIBI)V")
    private final void method1116(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 88) {
            this.field3037 = -110;
        }
        ++field3041;
        int var5 = arg0 < arg1 ? arg1 : arg0;
        int var6 = arg1 < arg0 ? arg1 : arg0;
        int var7 = ~arg3 <= ~var6 ? var6 : arg3;
        int var8 = var5 >= arg3 ? var5 : arg3;
        int var9 = -var7 + var8;
        if (var9 > 0) {
            int var10 = (-arg0 + var8 << 12) / var9;
            int var11 = (-arg1 + var8 << 12) / var9;
            int var12 = (var8 - arg3 << 12) / var9;
            if (~arg1 != ~var8) {
                if (~arg0 == ~var8) {
                    this.field3038 = arg3 == var7 ? var11 + 4096 : -var12 + 12288;
                } else {
                    this.field3038 = arg1 == var7 ? var10 + 12288 : -var11 + 20480;
                }
            } else {
                this.field3038 = arg0 != var7 ? -var10 + 4096 : var12 + 20480;
            }
            this.field3038 /= 6;
        } else {
            this.field3038 = 0;
        }
        this.field3026 = (var7 + var8) / 2;
        if (~this.field3026 < -1 && ~this.field3026 > -4097) {
            this.field3042 = (var9 << 12) / (this.field3026 <= 2048 ? this.field3026 * 2 : 8192 - this.field3026 * 2);
        } else {
            this.field3042 = 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        if (arg1 != 1) {
            field3044 = -117;
        }
        int[][] var3 = super.field366.method209(0, arg0);
        ++field3043;
        if (super.field366.field508) {
            int[][] var4 = this.method161(arg0, 0, arg1 + -1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class72.field1359 < ~var11; ++var11) {
                this.method1116(var5[var11], var6[var11], (byte) 96, var7[var11]);
                this.field3026 += this.field3040;
                this.field3038 += this.field3024;
                this.field3042 += this.field3039;
                if (this.field3042 < 0) {
                    this.field3042 = 0;
                }
                if (this.field3042 > 4096) {
                    this.field3042 = 4096;
                }
                while (~this.field3038 > -1) {
                    this.field3038 += 4096;
                }
                if (this.field3026 < 0) {
                    this.field3026 = 0;
                }
                while (this.field3038 > 4096) {
                    this.field3038 -= 4096;
                }
                if (~this.field3026 < -4097) {
                    this.field3026 = 4096;
                }
                this.method1118(this.field3042, this.field3026, 0, this.field3038);
                var10[var11] = this.field3035;
                var8[var11] = this.field3046;
                var9[var11] = this.field3037;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
    public static final void method1117(int arg0, byte arg1) {
        ++field3047;
        if (arg0 != -1) {
            if (class254.field4559[arg0]) {
                class263.field4705.method34(arg0, (byte) 109);
                if (class223.field4045[arg0] != null) {
                    boolean var2 = true;
                    for (int var3 = 0; ~class223.field4045[arg0].length < ~var3; ++var3) {
                        if (class223.field4045[arg0][var3] != null) {
                            if (~class223.field4045[arg0][var3].field769 == -3) {
                                var2 = false;
                            } else {
                                class223.field4045[arg0][var3] = null;
                            }
                        }
                    }
                    int var4 = -96 / ((53 - arg1) / 60);
                    if (var2) {
                        class223.field4045[arg0] = null;
                    }
                    class254.field4559[arg0] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    private final void method1118(int arg0, int arg1, int arg2, int arg3) {
        ++field3028;
        int var5 = ~arg1 < -2049 ? -(arg0 * arg1 >> 12) + arg1 - -arg0 : (4096 - -arg0) * arg1 >> 12;
        if (arg2 >= var5) {
            this.field3035 = this.field3046 = this.field3037 = arg1;
        } else {
            int var6 = arg3 * 6;
            int var7 = arg1 - (-arg1 - -var5);
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field3037 = var15;
                                    this.field3046 = var7;
                                    this.field3035 = var5;
                                }
                            } else {
                                this.field3037 = var5;
                                this.field3035 = var14;
                                this.field3046 = var7;
                            }
                        } else {
                            this.field3037 = var5;
                            this.field3035 = var7;
                            this.field3046 = var15;
                        }
                    } else {
                        this.field3037 = var14;
                        this.field3046 = var5;
                        this.field3035 = var7;
                    }
                } else {
                    this.field3035 = var15;
                    this.field3046 = var5;
                    this.field3037 = var7;
                }
            } else {
                this.field3046 = var14;
                this.field3035 = var5;
                this.field3037 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Llc;ILlc;I)V")
    public static final void method1119(class143 arg0, int arg1, class143 arg2, int arg3) {
        ++field3032;
        if (arg1 != 4096) {
            field3023 = -103;
        }
        class173.method1135(-1, 3, arg3, (class143) null, arg0, arg2);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class170() {
        super(1, false);
    }
}
