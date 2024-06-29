import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class51 {

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "I")
    private int field100 = 585;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "Led;")
    public static class43 field85 = class191.method1219("Zu viele Anmelde)2Versuche von Ihrer Adresse", false);

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "Led;")
    public static class43 field91 = class191.method1219("rect_debug=", false);

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "Led;")
    public static class43 field93 = class191.method1219("Freie Welt", false);

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
    public static int field92 = 0;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "[I")
    public static int[] field94 = new int[128];

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "Led;")
    public static class43 field99 = class191.method1219("<col=c0ff00>", false);

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "Led;")
    public static class43 field98 = class191.method1219("ams", false);

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "Lig;")
    public static class80 field90;

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "[Lnb;")
    public static class120[] field89;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(Z)V")
    public static void method23(boolean arg0) {
        field89 = null;
        field85 = null;
        field99 = null;
        field94 = null;
        if (arg0) {
            method25(91, -88, -26, -104, 79, -63, 88);
        }
        field93 = null;
        field90 = null;
        field91 = null;
        field98 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field97;
        if (~arg2 == -1) {
            this.field100 = arg0.method555(-1113627096);
        }
        if (arg1 != 0) {
            field94 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
    public static final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2047 & -arg1 + 2048;
        ++field95;
        int var8 = -arg6 + 2048 & 2047;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg0;
        if (var7 != 0) {
            int var12 = class135.field2798[var7];
            int var13 = class135.field2797[var7];
            int var14 = var9 * var12 - arg0 * var13 >> 16;
            var11 = var9 * var13 - -(arg0 * var12) >> 16;
            var9 = var14;
        }
        if (~var8 != -1) {
            int var15 = class135.field2798[var8];
            int var16 = class135.field2797[var8];
            int var17 = var10 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 + -(var10 * var16) >> 16;
            var10 = var17;
        }
        class51.field1034 = arg1;
        class32.field591 = arg6;
        if (arg3 == 20679) {
            class188.field3686 = -var11 + arg2;
            class184.field3617 = -var10 + arg5;
            class185.field3647 = -var9 + arg4;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    public static final void method26(byte arg0) {
        ++field87;
        if (class121.field2417 == null) {
            if (class148.field3021 == null) {
                if (arg0 != -117) {
                    field93 = null;
                }
                int var1 = class185.field3649;
                if (class186.field3665) {
                    if (var1 != 1) {
                        int var2 = class185.field3654;
                        int var3 = class105.field1998;
                        if (~var2 > ~(class103.field1963 - 10) || var2 > class158.field3200 + class103.field1963 + 10 || ~var3 > ~(class125.field2474 + -10) || ~var3 < ~(class30.field574 + class125.field2474 + 10)) {
                            class186.field3665 = false;
                            class200.method1306(class103.field1963, class30.field574, class125.field2474, class158.field3200, 0);
                        }
                    }
                    if (var1 == 1) {
                        int var4 = class103.field1963;
                        int var5 = class158.field3200;
                        int var6 = class125.field2474;
                        int var7 = class41.field814;
                        int var8 = class187.field3673;
                        int var9 = -1;
                        for (int var10 = 0; var10 < class41.field799; ++var10) {
                            int var11 = (-var10 + -1 + class41.field799) * 15 + 31 + var6;
                            if (var7 > var4 && ~var7 > ~(var4 - -var5) && ~(var11 - 13) > ~var8 && ~(var11 + 3) < ~var8) {
                                var9 = var10;
                            }
                        }
                        if (~var9 != 0) {
                            class114.method714((byte) 117, var9);
                        }
                        class186.field3665 = false;
                        class200.method1306(class103.field1963, class30.field574, class125.field2474, class158.field3200, 0);
                        return;
                    }
                } else {
                    if (~var1 == -2 && ~class41.field799 < -1) {
                        int var12 = class40.field756[class41.field799 + -1];
                        if (var12 == 37 || var12 == 21 || var12 == 22 || var12 == 47 || var12 == 16 || var12 == 2 || var12 == 8 || var12 == 35 || ~var12 == -45 || var12 == 25 || var12 == 23 || var12 == 1006) {
                            int var13 = class115.field2243[class41.field799 + -1];
                            int var14 = class171.field3405[class41.field799 + -1];
                            class129 var15 = class124.method801((byte) -36, var14);
                            if (class30.method160((byte) -55, class193.method1231((byte) 8, var15)) || class40.method220((byte) 48, class193.method1231((byte) -90, var15))) {
                                class88.field1714 = 0;
                                class18.field307 = false;
                                if (class121.field2417 != null) {
                                    class43.method265(false, class121.field2417);
                                }
                                class121.field2417 = class124.method801((byte) -36, var14);
                                class161.field3254 = var13;
                                class194.field3807 = class41.field814;
                                class167.field3316 = class187.field3673;
                                class43.method265(false, class121.field2417);
                                return;
                            }
                        }
                    }
                    if (~var1 == -2 && (class99.field1904 == 1 && ~class41.field799 < -3 || class97.method612(-25553, class41.field799 - 1))) {
                        var1 = 2;
                    }
                    if (~var1 == -2 && ~class41.field799 < -1) {
                        class114.method714((byte) 112, class41.field799 - 1);
                    }
                    if (~var1 != -3 || ~class41.field799 >= -1) {
                        return;
                    }
                    class100.method622((byte) -128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field96;
        if (arg0 != 16) {
            field89 = null;
        }
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = class40.field771[arg1];
            for (int var5 = 0; ~var5 > ~class122.field2442; ++var5) {
                int var6 = class95.field1855[var5];
                if (this.field100 < var6 && ~var6 > ~(-this.field100 + 4096) && ~(-this.field100 + 2048) > ~var4 && ~(this.field100 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field100);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field100 + 2048 < var6 && ~(this.field100 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field100;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field100 + 2048);
                } else if (~var4 <= ~this.field100 && -this.field100 + 4096 >= var4) {
                    if (var6 >= this.field100 && -this.field100 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field100 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field100;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field100);
                }
            }
        }
        return var3;
    }
}
