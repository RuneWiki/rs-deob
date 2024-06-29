import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class228 {

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public int field3125 = -1;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public int field3116 = -1;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field3121 = -1;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public int field3133 = -1;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
    public boolean field3117 = true;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public int field3113 = -1;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public int field3115 = 0;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    private int field3112 = -1;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Z")
    public boolean field3119 = false;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field3124 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public int field3134 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public int field3136 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Z")
    public boolean field3126 = true;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    private int field3144 = -1;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "Z")
    public boolean field3142 = true;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public int field3139 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    private int field3147 = -1;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "[Ljava/lang/String;")
    public String[] field3154 = new String[5];

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    private int field3138 = -1;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3151 = "Loaded world list data";

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    private int field3150;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/lang/String;")
    public String field3123;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Ljava/lang/String;")
    public String field3152;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
    public int[] field3120;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static final void method1234(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            field3151 = null;
        }
        field3145++;
        class324.field4321 = -1;
        class32.field312 = 0;
        class149.field1894 = -1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
    public final void method1235(boolean arg0) {
        if (this.field3120 != null) {
            for (int var2 = 0; var2 < this.field3120.length; var2 += 2) {
                if (this.field3120[var2] < this.field3136) {
                    this.field3136 = this.field3120[var2];
                } else if (this.field3134 < this.field3120[var2]) {
                    this.field3134 = this.field3120[var2];
                }
                if (this.field3139 > this.field3120[var2 + 1]) {
                    this.field3139 = this.field3120[var2 + 1];
                } else if (this.field3124 < this.field3120[var2 + 1]) {
                    this.field3124 = this.field3120[var2 + 1];
                }
            }
        }
        if (arg0) {
            field3140++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ltq;II)V")
    private final void method1236(class250 arg0, int arg1, int arg2) {
        if (arg1 != -28022) {
            return;
        }
        if (arg2 == 1) {
            this.field3116 = arg0.method1374(-2);
        } else if (arg2 == 2) {
            this.field3113 = arg0.method1374(arg1 + 28020);
        } else if (arg2 == 3) {
            this.field3123 = arg0.method1349(-1754884856);
        } else if (arg2 == 4) {
            this.field3141 = arg0.method1372(-2);
        } else if (arg2 == 5) {
            this.field3125 = arg0.method1372(-2);
        } else if (arg2 == 6) {
            this.field3115 = arg0.method1350(31351);
        } else if (arg2 == 7) {
            int var6 = arg0.method1350(31351);
            if ((var6 & 0x1) == 0) {
                this.field3117 = false;
            }
            if ((var6 & 0x2) == 2) {
                this.field3119 = true;
            }
        } else if (arg2 == 8) {
            this.field3142 = arg0.method1350(arg1 ^ 0xFFFFE8FD) == 1;
        } else if (arg2 == 9) {
            this.field3121 = arg0.method1374(-2);
            if (this.field3121 == 65535) {
                this.field3121 = -1;
            }
            this.field3138 = arg0.method1374(-2);
            if (this.field3138 == 65535) {
                this.field3138 = -1;
            }
            this.field3131 = arg0.method1359(255);
            this.field3118 = arg0.method1359(255);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field3154[arg2 - 10] = arg0.method1349(-1754884856);
        } else if (arg2 == 15) {
            int var4 = arg0.method1350(31351);
            this.field3120 = new int[var4 * 2];
            for (int var5 = 0; var5 < (var4 * 2); var5++) {
                this.field3120[var5] = arg0.method1366((byte) -81);
            }
            this.field3137 = arg0.method1359(arg1 ^ 0xFFFF9275);
            this.field3130 = arg0.method1359(arg1 + 28277);
        } else if (arg2 == 16) {
            this.field3126 = false;
        } else if (arg2 == 17) {
            this.field3152 = arg0.method1349(arg1 - 1754856834);
        } else if (arg2 == 18) {
            this.field3147 = arg0.method1374(-2);
        } else if (arg2 == 19) {
            this.field3133 = arg0.method1374(arg1 + 28020);
        } else if (arg2 == 20) {
            this.field3144 = arg0.method1374(-2);
            if (this.field3144 == 65535) {
                this.field3144 = -1;
            }
            this.field3112 = arg0.method1374(-2);
            if (this.field3112 == 65535) {
                this.field3112 = -1;
            }
            this.field3150 = arg0.method1359(arg1 + 28277);
            this.field3132 = arg0.method1359(arg1 ^ 0xFFFF9275);
        } else if (arg2 == 21) {
            this.field3127 = arg0.method1359(255);
        } else if (arg2 == 22) {
            this.field3146 = arg0.method1359(255);
        }
        field3114++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLvm;)Llg;")
    public final class20 method1237(byte arg0, class322 arg1) {
        field3149++;
        class20 var3 = (class20) class321.field4295.method616(-58, (long) (this.field3147 | 0x20000 | arg1.field4307 << 29));
        if (var3 != null) {
            return var3;
        }
        if (arg0 <= 26) {
            method1238(-100, -66, 78, -68, -74, -96, -54, (byte) -62);
        }
        class180.field2269.method1673(-18, this.field3147);
        class241 var4 = class241.method1289(class180.field2269, this.field3147, 0);
        if (var4 != null) {
            var3 = arg1.method1633(var4, true);
            class321.field4295.method615((byte) -116, (long) (this.field3147 | 0x20000 | arg1.field4307 << 29), var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != 121) {
            field3151 = null;
        }
        field3143++;
        if (arg2 == arg3) {
            class436.method2695(arg3, arg4, 0, arg0, arg1, arg6, arg5);
        } else if (class322.field4306 <= (arg0 - arg3) && class310.field4183 >= (arg0 + arg3) && (arg5 - arg2) >= class335.field4462 && class6.field42 >= (arg2 + arg5)) {
            class279.method1548(arg6, arg0, arg1, arg2, arg4, arg5, arg3, (byte) -64);
        } else {
            class201.method1094(arg1, (byte) 35, arg3, arg4, arg6, arg5, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
    public final boolean method1239(byte arg0) {
        if (arg0 >= -94) {
            this.method1235(false);
        }
        field3129++;
        if (this.field3138 == -1 && this.field3121 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field3138 == -1) {
            var3 = class181.method955(this.field3121, (byte) 35);
        } else {
            var3 = class254.field3495[this.field3138];
        }
        if (this.field3131 > var3 || this.field3118 < var3) {
            return false;
        } else if (this.field3112 == -1 && this.field3144 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field3112 == -1) {
                var5 = class181.method955(this.field3144, (byte) 35);
            } else {
                var5 = class254.field3495[this.field3112];
            }
            return this.field3150 <= var5 && this.field3132 >= var5;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V")
    public static void method1240(boolean arg0) {
        field3151 = null;
        if (arg0) {
            method1238(-56, -87, -91, -117, -71, -64, -42, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ltq;I)V")
    public final void method1241(class250 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                if (arg1 <= 16) {
                    this.field3130 = 64;
                }
                field3153++;
                return;
            }
            this.method1236(arg0, -28022, var3);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLvm;I)Llg;")
    public final class20 method1242(boolean arg0, class322 arg1, int arg2) {
        if (arg2 != 2233) {
            this.method1239((byte) -6);
        }
        field3128++;
        int var4 = arg0 ? this.field3113 : this.field3116;
        int var5 = arg1.field4307 << 29 | var4;
        class20 var6 = (class20) class321.field4295.method616(118, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (class180.field2269.method1673(75, var4)) {
            class241 var7 = class241.method1289(class180.field2269, var4, 0);
            if (var7 != null) {
                var6 = arg1.method1633(var7, true);
                class321.field4295.method615((byte) -122, (long) var5, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 8 / ((arg7 - 30) / 62);
        field3148++;
        if (class322.field4306 <= arg2 && arg5 <= class310.field4183 && arg4 >= class335.field4462 && arg0 <= class6.field42) {
            class398.method2487(arg6, arg0, arg2, arg5, arg3, arg4, (byte) 45, arg1);
        } else {
            class320.method1844(arg5, arg6, arg0, arg4, arg1, arg2, arg3, -94);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)I")
    public static final int method1244(int arg0, byte arg1) {
        int var2 = -43 % ((arg1 + 16) / 55);
        field3122++;
        return arg0 == 16711935 ? -1 : class424.method2636(67, arg0);
    }
}
