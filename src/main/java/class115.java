import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class115 extends class139 {

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    private int field2438 = 4096;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "[I")
    private int[] field2435 = new int[3];

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    private int field2444 = 4096;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    private int field2445 = 4096;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    private int field2437 = 409;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lrf;")
    public static class163 field2431 = class53.method392(-73, "_");

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lrf;")
    public static class163 field2434 = class53.method392(-61, "title)3jpg");

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field2432 = 0;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lrf;")
    public static class163 field2448 = class53.method392(96, "mapfunction");

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lrf;")
    public static class163 field2447 = class53.method392(-52, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "[I")
    public static int[] field2449 = new int[200];

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "Lsd;")
    public static class170 field2441;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Lig;")
    public static class84 field2433;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)Z")
    public static final boolean method796(int arg0, int arg1) {
        ++field2443;
        if (arg1 != 19175) {
            return false;
        } else {
            return ~((1434494 & arg0) >> 20) != -1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)V")
    public static void method797(byte arg0) {
        field2447 = null;
        field2431 = null;
        field2433 = null;
        field2449 = null;
        field2434 = null;
        field2448 = null;
        field2441 = null;
        if (arg0 != -113) {
            method797((byte) -59);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lu;B)V")
    public static final void method798(class184 arg0, byte arg1) {
        int var2 = 33 / ((arg1 - -9) / 61);
        class37.field752 = arg0;
        ++field2440;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field2439;
        if (arg0 < 53) {
            field2434 = null;
        }
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[][] var4 = this.method910((byte) -35, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class23.field402 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field2435[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field2437 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field2435[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2437) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2435[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field2437) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2438 * var12 >> 12;
                            var9[var11] = this.field2444 * var14 >> 12;
                            var10[var11] = this.field2445 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 == 21) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 == 4) {
                                int var5 = arg2.method340(false);
                                this.field2435[0] = class133.method887(16711680, var5) << 4;
                                this.field2435[2] = class133.method887(var5, 255) >> 12;
                                this.field2435[1] = class133.method887(4080, var5 >> 4);
                            }
                        } else {
                            this.field2438 = arg2.method390((byte) 126);
                        }
                    } else {
                        this.field2444 = arg2.method390((byte) 96);
                    }
                } else {
                    this.field2445 = arg2.method390((byte) 108);
                }
            } else {
                this.field2437 = arg2.method390((byte) 113);
            }
            ++field2436;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class115() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)I")
    public static final int method799(int arg0, boolean arg1) {
        ++field2446;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (!arg1) {
            method797((byte) -63);
        }
        int var3 = arg0 * 6 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
