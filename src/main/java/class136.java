import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class136 extends class139 {

    @OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
    private int field2813 = -1;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Lrf;")
    public static class163 field2793 = class53.method392(123, "null");

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Lrf;")
    private static class163 field2795 = class53.method392(55, "glow3:");

    @OriginalMember(owner = "client!of", name = "X", descriptor = "Lrf;")
    public static class163 field2796 = class53.method392(-48, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "Lrf;")
    public static class163 field2801 = field2795;

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "Lrf;")
    public static class163 field2802 = class53.method392(-100, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "[[I")
    public static int[][] field2810 = new int[104][104];

    @OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "Lrf;")
    private static class163 field2798 = class53.method392(86, "Existing User");

    @OriginalMember(owner = "client!of", name = "rb", descriptor = "Lrf;")
    public static class163 field2816 = field2795;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "Lrf;")
    public static class163 field2803 = field2798;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!of", name = "pb", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "[I")
    public int[] field2809;

    @OriginalMember(owner = "client!of", name = "qb", descriptor = "[Z")
    public static boolean[] field2815;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (~arg0 == -1) {
            this.field2813 = arg2.method390((byte) 100);
        }
        ++field2800;
        if (arg1 != 21) {
            field2805 = 109;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, false);
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(B)Z")
    public final boolean method895(byte arg0) {
        if (arg0 != -18) {
            this.method77(-17, 8);
        }
        ++field2808;
        if (this.field2809 != null) {
            return true;
        } else if (this.field2813 >= 0) {
            class165 var2 = class196.method1303(arg0 + 18, class186.field3710, this.field2813);
            var2.method1118();
            this.field2804 = var2.field3365;
            this.field2809 = var2.field3370;
            this.field2794 = var2.field3364;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB[BI)Z")
    public static final boolean method896(int arg0, byte arg1, byte[] arg2, int arg3) {
        ++field2792;
        if (arg1 != 72) {
            field2810 = null;
        }
        boolean var4 = true;
        int var5 = -1;
        class52 var6 = new class52(arg2);
        label58: while (true) {
            int var7 = var6.method368(arg1 + -72);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method354((byte) -110);
                    if (~var11 == -1) {
                        continue label58;
                    }
                    int var12 = var6.method344(255) >> 2;
                    var8 += var11 + -1;
                    int var13 = 63 & var8;
                    int var14 = var8 >> 6 & 63;
                    int var15 = arg0 + var14;
                    int var16 = arg3 + var13;
                    if (~var15 < -1 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class61 var17 = class199.method1314((byte) 127, var5);
                        if (var12 != 22 || !class86.field1880 || ~var17.field1243 != -1 || var17.field1296 == 1 || var17.field1252) {
                            var9 = true;
                            if (!var17.method447(arg1 ^ -54)) {
                                ++class141.field2900;
                                var4 = false;
                            }
                        }
                    }
                }
                int var10 = var6.method354((byte) -108);
                if (~var10 == -1) {
                    break;
                }
                var6.method344(arg1 ^ 183);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)I")
    public final int method897(byte arg0) {
        if (arg0 != 90) {
            field2812 = 124;
        }
        ++field2814;
        return this.field2813;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
    public static void method898(int arg0) {
        field2801 = null;
        field2803 = null;
        if (arg0 == -1) {
            field2793 = null;
            field2802 = null;
            field2796 = null;
            field2795 = null;
            field2798 = null;
            field2810 = null;
            field2815 = null;
            field2816 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(B)V")
    public static final void method899(byte arg0) {
        ++field2811;
        boolean var1 = false;
        if (arg0 < 115) {
            field2796 = null;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~(class184.field3678 + -1) < ~var2; ++var2) {
                if (class21.field373[var2] < 1000 && ~class21.field373[var2 + 1] < -1001) {
                    var1 = false;
                    class163 var3 = class197.field3918[var2];
                    class197.field3918[var2] = class197.field3918[var2 + 1];
                    class197.field3918[var2 + 1] = var3;
                    class163 var4 = client.field610[var2];
                    client.field610[var2] = client.field610[var2 + 1];
                    client.field610[var2 + 1] = var4;
                    int var5 = class193.field3795[var2];
                    class193.field3795[var2] = class193.field3795[var2 + 1];
                    class193.field3795[var2 - -1] = var5;
                    int var6 = class87.field1900[var2];
                    class87.field1900[var2] = class87.field1900[var2 + 1];
                    class87.field1900[var2 - -1] = var6;
                    short var7 = class21.field373[var2];
                    class21.field373[var2] = class21.field373[var2 + 1];
                    class21.field373[var2 + 1] = var7;
                    long var8 = class188.field3741[var2];
                    class188.field3741[var2] = class188.field3741[var2 + 1];
                    class188.field3741[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[[I")
    public int[][] method77(int arg0, int arg1) {
        ++field2799;
        if (arg0 <= 53) {
            field2795 = null;
        }
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885 && this.method895((byte) -18)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class205.field4008 != ~this.field2804 ? this.field2804 * arg1 / class205.field4008 : arg1) * this.field2794;
            if (~class23.field402 == ~this.field2794) {
                for (int var8 = 0; ~var8 > ~class23.field402; ++var8) {
                    int var9 = this.field2809[var7++];
                    var6[var8] = class133.method887(255, var9) << 4;
                    var5[var8] = class133.method887(var9 >> 4, 4080);
                    var4[var8] = class133.method887(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class23.field402 > var10; ++var10) {
                    int var11 = this.field2794 * var10 / class23.field402;
                    int var12 = this.field2809[var7 - -var11];
                    var6[var10] = class133.method887(4080, var12 << 4);
                    var5[var10] = class133.method887(var12, 65280) >> 4;
                    var4[var10] = class133.method887(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
