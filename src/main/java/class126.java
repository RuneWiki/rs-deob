import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class126 extends class105 {

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    private int field2519 = -1;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "Leh;")
    private static class47 field2520 = class195.method1282((byte) -4, "Examine");

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "Leh;")
    public static class47 field2530 = field2520;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "Lpa;")
    public static class136 field2521 = new class136(64);

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "Leh;")
    private static class47 field2534 = class195.method1282((byte) -4, "Type");

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "Leh;")
    public static class47 field2533 = field2534;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "[[I")
    public static int[][] field2535 = new int[104][104];

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "Lea;")
    public static class40 field2531 = new class40();

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    private int field2525;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    private int field2526;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "Ldd;")
    public static class34 field2532;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "Lah;")
    public static class9 field2522;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "[I")
    private int[] field2524;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "[Ldh;")
    public static class38[] field2517;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2519 = -112;
        }
        ++field2518;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28 && this.method953(-64)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class120.field2422 == this.field2526 ? arg0 : this.field2526 * arg0 / class120.field2422) * this.field2525;
            int[] var7 = var3[2];
            if (~class149.field2928 != ~this.field2525) {
                for (int var8 = 0; var8 < class149.field2928; ++var8) {
                    int var9 = this.field2525 * var8 / class149.field2928;
                    int var10 = this.field2524[var6 + var9];
                    var7[var8] = class142.method1018(var10, 255) << 4;
                    var5[var8] = class142.method1018(4080, var10 >> 4);
                    var4[var8] = class142.method1018(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class149.field2928; ++var11) {
                    int var12 = this.field2524[var6++];
                    var7[var11] = class142.method1018(255, var12) << 4;
                    var5[var11] = class142.method1018(var12, 65280) >> 4;
                    var4[var11] = class142.method1018(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
    public static final void method951(byte arg0) {
        if (class54.field1044 != null) {
            class54.field1044.method903((byte) 61);
        }
        if (arg0 <= -125) {
            if (class191.field3711 != null) {
                class191.field3711.method903((byte) 69);
            }
            ++field2516;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field2529;
        if (arg0 == 0) {
            this.field2519 = arg1.method569(26496);
        }
        if (arg2 != -256) {
            this.method858(-52);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public static final void method952(int arg0, int arg1) {
        class86.method704((byte) 97);
        class116.method910((byte) -125);
        ++field2527;
        int var2 = class139.method1011(arg0, 16).field2094;
        if (arg1 < -36) {
            if (~var2 != -1) {
                int var3 = class83.field1778[arg0];
                if (var2 == 1) {
                    class103.field2163 = var3;
                    if (class103.field2163 == 1) {
                        class17.method193(0.9F);
                    }
                    if (class103.field2163 == 2) {
                        class17.method193(0.8F);
                    }
                    if (~class103.field2163 == -4) {
                        class17.method193(0.7F);
                    }
                    if (~class103.field2163 == -5) {
                        class17.method193(0.6F);
                    }
                    class56.method489(-32481);
                }
                if (~var2 == -4) {
                    short var4 = 0;
                    if (var3 == 0) {
                        var4 = 255;
                    }
                    if (var3 == 1) {
                        var4 = 192;
                    }
                    if (~var3 == -3) {
                        var4 = 128;
                    }
                    if (~var3 == -4) {
                        var4 = 64;
                    }
                    if (~var3 == -5) {
                        var4 = 0;
                    }
                    if (~class146.field2855 != ~var4) {
                        if (class146.field2855 == 0 && class107.field2235 != -1) {
                            class79.method677(false, class107.field2235, 0, 32, class189.field3667, var4);
                            class72.field1545 = false;
                        } else if (var4 != 0) {
                            class67.method555(var4, true);
                        } else {
                            class191.method1255(26061);
                            class72.field1545 = false;
                        }
                        class146.field2855 = var4;
                    }
                }
                if (var2 == 4) {
                    if (var3 == 0) {
                        class60.field1169 = 127;
                    }
                    if (var3 == 1) {
                        class60.field1169 = 96;
                    }
                    if (var3 == 2) {
                        class60.field1169 = 64;
                    }
                    if (var3 == 3) {
                        class60.field1169 = 32;
                    }
                    if (~var3 == -5) {
                        class60.field1169 = 0;
                    }
                }
                if (~var2 == -7) {
                    class85.field1809 = var3;
                }
                if (~var2 == -6) {
                    class6.field95 = var3;
                }
                if (var2 == 9) {
                    class8.field154 = var3;
                }
                if (var2 == 10) {
                    if (var3 == 0) {
                        class159.field3099 = 127;
                    }
                    if (var3 == 1) {
                        class159.field3099 = 96;
                    }
                    if (~var3 == -3) {
                        class159.field3099 = 64;
                    }
                    if (~var3 == -4) {
                        class159.field3099 = 32;
                    }
                    if (~var3 == -5) {
                        class159.field3099 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
    public final int method858(int arg0) {
        ++field2523;
        if (arg0 != 18263) {
            this.method17(37, (class68) null, -113);
        }
        return this.field2519;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z")
    private final boolean method953(int arg0) {
        int var2 = 25 % ((47 - arg0) / 59);
        ++field2528;
        if (this.field2524 != null) {
            return true;
        } else if (this.field2519 >= 0) {
            int var3 = class59.field1136.method729(this.field2519, true) ? 64 : 128;
            this.field2524 = class59.field1136.method732(this.field2519, true);
            this.field2525 = var3;
            this.field2526 = var3;
            return this.field2524 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class126() {
        super(0, false);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static void method954(byte arg0) {
        field2517 = null;
        field2531 = null;
        field2532 = null;
        if (arg0 != 121) {
            method951((byte) 6);
        }
        field2522 = null;
        field2534 = null;
        field2521 = null;
        field2533 = null;
        field2535 = null;
        field2530 = null;
        field2520 = null;
    }
}
