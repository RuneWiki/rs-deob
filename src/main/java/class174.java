import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class174 extends class261 {

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    private int field2877 = 0;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    private int field2876 = 0;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    private int field2875 = 0;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "Lve;")
    public static class255 field2886 = class87.method607(41, "Stufe:");

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "Lve;")
    public static class255 field2885 = class87.method607(104, "::clientjs5drop");

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lve;")
    public static class255 field2874 = class87.method607(115, "<col=ffffff>(Y");

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "[S")
    public static short[] field2887 = new short[] { 46, 25, 15, 4, 33, 42, 7, 30 };

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    private int field2868;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    private int field2870;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    private int field2871;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "Lrg;")
    public static class88 field2883;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 9)
    public class174() {
        super(1, false);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)[[I", line = 23)
    public final int[][] method13(boolean arg0, int arg1) {
        field2880++;
        int[][] var3 = this.field4418.method35(arg1, 89);
        if (this.field4418.field94) {
            int[][] var4 = this.method1819(104, 0, arg1);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class92.field1576; var11++) {
                this.method1236(var7[var11], (byte) 109, var10[var11], var8[var11]);
                this.field2867 += this.field2875;
                if (this.field2867 < 0) {
                    this.field2867 = 0;
                }
                if (this.field2867 > 4096) {
                    this.field2867 = 4096;
                }
                this.field2881 += this.field2877;
                this.field2870 += this.field2876;
                if (this.field2870 < 0) {
                    this.field2870 = 0;
                }
                while (this.field2881 < 0) {
                    this.field2881 += 4096;
                }
                if (this.field2870 > 4096) {
                    this.field2870 = 4096;
                }
                while (this.field2881 > 4096) {
                    this.field2881 -= 4096;
                }
                this.method1234(-27310, this.field2881, this.field2870, this.field2867);
                var6[var11] = this.field2868;
                var5[var11] = this.field2871;
                var9[var11] = this.field2878;
            }
        }
        if (!arg0) {
            this.field2876 = 77;
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[Ltl;I)V", line = 98)
    public static final void method1231(byte arg0, class197[] arg1, int arg2) {
        if (arg0 > -101) {
            method1231((byte) -34, (class197[]) null, 6);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class197 var4 = arg1[var3];
            if (var4 != null && var4.field3353 == arg2 && (!var4.field3365 || !client.method1674(var4))) {
                if (var4.field3281 == 0) {
                    if (!var4.field3365 && client.method1674(var4) && class56.field874 != var4) {
                        continue;
                    }
                    method1231((byte) -105, arg1, var4.field3256);
                    if (var4.field3359 != null) {
                        method1231((byte) -126, var4.field3359, var4.field3256);
                    }
                    class155 var5 = (class155) class158.field2675.method280((long) var4.field3256, 29153);
                    if (var5 != null) {
                        class205.method1489(var5.field2637, (byte) 105);
                    }
                }
                if (var4.field3281 == 6) {
                    if (var4.field3309 != -1 || var4.field3282 != -1) {
                        boolean var6 = class159.method1158(30439, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field3282;
                        } else {
                            var7 = var4.field3309;
                        }
                        if (var7 != -1) {
                            class271 var8 = class181.method1269(109, var7);
                            if (var8 != null) {
                                var4.field3317 += class122.field2036;
                                while (var4.field3317 > var8.field4680[var4.field3373]) {
                                    var4.field3317 -= var8.field4680[var4.field3373];
                                    var4.field3373++;
                                    if (var4.field3373 >= var8.field4667.length) {
                                        var4.field3373 -= var8.field4648;
                                        if (var4.field3373 < 0 || var4.field3373 >= var8.field4667.length) {
                                            var4.field3373 = 0;
                                        }
                                    }
                                    class108.method834((byte) 49, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3275 != 0 && !var4.field3365) {
                        int var9 = var4.field3275 << 16 >> 16;
                        int var10 = var4.field3275 >> 16;
                        int var11 = class122.field2036 * var10;
                        var4.field3251 = var4.field3251 + var11 & 0x7FF;
                        int var12 = class122.field2036 * var9;
                        var4.field3350 = var4.field3350 + var12 & 0x7FF;
                        class108.method834((byte) 49, var4);
                    }
                }
            }
        }
        field2872++;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 214)
    public static void method1232(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field2887 = null;
        field2885 = null;
        field2883 = null;
        field2886 = null;
        field2874 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lpb;BI)V", line = 240)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field2866++;
        if (arg2 == 0) {
            this.field2877 = arg0.method454((byte) 84);
        } else if (arg2 == 1) {
            this.field2875 = (arg0.method466((byte) -51) << 12) / 100;
        } else if (arg2 == 2) {
            this.field2876 = (arg0.method466((byte) -118) << 12) / 100;
        }
        if (arg1 > -115) {
            this.field2875 = 25;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lrg;B)V", line = 285)
    public static final void method1233(class88 arg0, byte arg1) {
        class101.field1707 = arg0;
        class186.field3003 = class101.field1707.method617(17374, 16);
        field2873++;
        int var2 = -73 / ((18 - arg1) / 46);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V", line = 306)
    private final void method1234(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -27310) {
            this.field2876 = -50;
        }
        field2879++;
        int var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : arg2 + arg3 - (arg2 * arg3 >> 12);
        if (var5 <= 0) {
            this.field2868 = this.field2871 = this.field2878 = arg2;
            return;
        }
        int var6 = arg1 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = var6 >> 12;
        int var9 = (var5 - var7 << 12) / var5;
        int var11 = var9 * var5 >> 12;
        int var12 = var6 - (var8 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var8 == 0) {
            this.field2868 = var5;
            this.field2871 = var15;
            this.field2878 = var7;
        } else if (var8 == 1) {
            this.field2878 = var7;
            this.field2871 = var5;
            this.field2868 = var14;
        } else if (var8 == 2) {
            this.field2868 = var7;
            this.field2878 = var15;
            this.field2871 = var5;
        } else if (var8 == 3) {
            this.field2878 = var5;
            this.field2871 = var14;
            this.field2868 = var7;
        } else if (var8 == 4) {
            this.field2868 = var15;
            this.field2871 = var7;
            this.field2878 = var5;
        } else if (var8 == 5) {
            this.field2871 = var7;
            this.field2878 = var14;
            this.field2868 = var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILfk;)V", line = 412)
    public static final void method1235(int arg0, class40 arg1) {
        class31 var2 = null;
        field2869++;
        try {
            class169 var3 = arg1.method235(false, "runescape");
            if (arg0 != 100) {
                field2887 = (short[]) null;
            }
            while (var3.field2833 == 0) {
                class137.method1027(1L, 0);
            }
            if (var3.field2833 == 1) {
                var2 = (class31) var3.field2832;
                class70 var4 = class29.method157(1);
                var2.method178(0, var4.field1066, (byte) -13, var4.field1068);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method177((byte) -60);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBII)V", line = 455)
    private final void method1236(int arg0, byte arg1, int arg2, int arg3) {
        field2884++;
        if (arg1 != 109) {
            this.method20((class70) null, (byte) -20, 109);
        }
        int var5 = arg3 >= arg2 ? arg3 : arg2;
        int var6 = var5 < arg0 ? arg0 : var5;
        int var7 = arg3 > arg2 ? arg2 : arg3;
        int var8 = var7 > arg0 ? arg0 : var7;
        this.field2870 = (var8 + var6) / 2;
        int var9 = var6 - var8;
        if (this.field2870 > 0 && this.field2870 < 4096) {
            this.field2867 = (var9 << 12) / (this.field2870 <= 2048 ? this.field2870 * 2 : 8192 - (this.field2870 * 2));
        } else {
            this.field2867 = 0;
        }
        if (var9 <= 0) {
            this.field2881 = 0;
            return;
        }
        int var10 = (var6 - arg3 << 12) / var9;
        int var11 = (var6 - arg2 << 12) / var9;
        int var12 = (var6 - arg0 << 12) / var9;
        if (arg2 == var6) {
            this.field2881 = arg3 == var8 ? var12 + 20480 : -var10 + 4096;
        } else if (arg3 == var6) {
            this.field2881 = arg0 == var8 ? var11 + 4096 : 12288 - var12;
        } else {
            this.field2881 = arg2 == var8 ? var10 + 12288 : -var11 + 20480;
        }
        this.field2881 /= 6;
    }
}
