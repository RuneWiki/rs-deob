import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class208 {

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public int field2837 = -1;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "Lefa;")
    private class322 field2825;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Ljava/lang/String;")
    private String field2820;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Ljava/lang/String;")
    private String field2822;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[I")
    private int[] field2823;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
    private int[] field2826;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[I")
    private int[] field2827;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[I")
    private int[] field2828;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[I")
    private int[] field2830;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "[I")
    private int[] field2832;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[I")
    private int[] field2833;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "[I")
    private int[] field2835;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "[Ljava/lang/String;")
    private String[] field2836;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field2839;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[[I")
    private int[][] field2824;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[[I")
    private int[][] field2834;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[[I")
    private int[][] field2838;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZIIIZ)V", line = 8)
    public static final void method1330(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2831++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        if (arg5) {
            return;
        }
        int var7 = (class495.field7011 - class562.field8221) * var6 / 100 + class562.field8221;
        if (var7 < class209.field2841) {
            var7 = class209.field2841;
        } else if (class235.field3096 < var7) {
            var7 = class235.field3096;
        }
        int var8 = var7 * 512 * arg2 / (arg3 * 334);
        if (var8 < class49.field768) {
            short var12 = class49.field768;
            var7 = var12 * 334 * arg3 / (arg2 * 512);
            if (class235.field3096 < var7) {
                var7 = class235.field3096;
                int var13 = arg2 * var7 * 512 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg1) {
                    class332.field4821.method699();
                    class332.field4821.method710(arg4, 22339, -16777216, var14, arg0, arg2);
                    class332.field4821.method710(arg4, 22339, -16777216, var14, arg0 + arg3 - var14, arg2);
                }
                arg0 += var14;
                arg3 -= var14 * 2;
            }
        } else if (var8 > class592.field8595) {
            short var9 = class592.field8595;
            var7 = arg3 * var9 * 334 / (arg2 * 512);
            if (class209.field2841 > var7) {
                var7 = class209.field2841;
                int var10 = arg3 * var9 * 334 / (var7 * 512);
                int var11 = (arg2 - var10) / 2;
                if (arg1) {
                    class332.field4821.method699();
                    class332.field4821.method710(arg4, 22339, -16777216, arg3, arg0, var11);
                    class332.field4821.method710(arg4 + arg2 - var11, 22339, -16777216, arg3, arg0, var11);
                }
                arg2 -= var11 * 2;
                arg4 += var11;
            }
        }
        class643.field9225 = arg4;
        class496.field7021 = arg0;
        class85.field1331 = (short) arg2;
        class122.field1816 = (short) arg3;
        class395.field5975 = arg2 * var7 / 334;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZILgk;)V", line = 126)
    private final void method1331(boolean arg0, int arg1, class540 arg2) {
        if (arg1 == 1) {
            this.field2820 = arg2.method3138(-109);
        } else if (arg1 == 2) {
            this.field2822 = arg2.method3138(-88);
        } else if (arg1 == 3) {
            int var22 = arg2.method3115(29871);
            this.field2838 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2838[var23][0] = arg2.method3169(26488);
                this.field2838[var23][1] = arg2.method3160(false);
                this.field2838[var23][2] = arg2.method3160(arg0);
            }
        } else if (arg1 == 4) {
            int var4 = arg2.method3115(29871);
            this.field2824 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2824[var5][0] = arg2.method3169(26488);
                this.field2824[var5][1] = arg2.method3160(false);
                this.field2824[var5][2] = arg2.method3160(arg0);
            }
        } else if (arg1 == 5) {
            arg2.method3169(26488);
        } else if (arg1 == 6) {
            arg2.method3115(29871);
        } else if (arg1 == 7) {
            arg2.method3115(29871);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method3115(29871);
            } else if (arg1 == 10) {
                int var6 = arg2.method3115(29871);
                this.field2835 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2835[var7] = arg2.method3160(false);
                }
            } else if (arg1 == 12) {
                arg2.method3160(arg0);
            } else if (arg1 == 13) {
                int var8 = arg2.method3115(29871);
                this.field2827 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2827[var9] = arg2.method3169(26488);
                }
            } else if (arg1 == 14) {
                int var10 = arg2.method3115(29871);
                this.field2834 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field2834[var11][0] = arg2.method3115(29871);
                    this.field2834[var11][1] = arg2.method3115(29871);
                }
            } else if (arg1 == 15) {
                arg2.method3169(26488);
            } else if (arg1 == 17) {
                this.field2837 = arg2.method3169(26488);
            } else if (arg1 == 18) {
                int var12 = arg2.method3115(29871);
                this.field2828 = new int[var12];
                this.field2826 = new int[var12];
                this.field2839 = new String[var12];
                this.field2823 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field2828[var13] = arg2.method3160(false);
                    this.field2826[var13] = arg2.method3160(false);
                    this.field2823[var13] = arg2.method3160(arg0);
                    this.field2839[var13] = arg2.method3145((byte) -121);
                }
            } else if (arg1 == 19) {
                int var20 = arg2.method3115(29871);
                this.field2833 = new int[var20];
                this.field2836 = new String[var20];
                this.field2832 = new int[var20];
                this.field2830 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field2830[var21] = arg2.method3160(false);
                    this.field2833[var21] = arg2.method3160(arg0);
                    this.field2832[var21] = arg2.method3160(false);
                    this.field2836[var21] = arg2.method3145((byte) -121);
                }
            } else if (arg1 == 249) {
                int var14 = arg2.method3115(29871);
                if (this.field2825 == null) {
                    int var15 = class240.method1478(-28325, var14);
                    this.field2825 = new class322(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg2.method3115(29871) == 1;
                    int var18 = arg2.method3154((byte) -10);
                    class381 var19;
                    if (var17) {
                        var19 = new class180(arg2.method3145((byte) -121));
                    } else {
                        var19 = new class258(arg2.method3160(false));
                    }
                    this.field2825.method2001(107, var19, (long) var18);
                }
            }
        }
        if (arg0) {
            this.field2822 = null;
        }
        field2829++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 357)
    public final void method1332(int arg0) {
        if (arg0 >= 79) {
            field2819++;
            if (this.field2822 == null) {
                this.field2822 = this.field2820;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLgk;)V", line = 381)
    public final void method1333(boolean arg0, class540 arg1) {
        field2821++;
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                return;
            }
            this.method1331(false, var3, arg1);
        }
    }
}
