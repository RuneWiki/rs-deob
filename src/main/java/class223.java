import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class223 {

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public int field2814 = -1;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "[I")
    public static int[] field2815 = new int[4096];

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "I")
    public static int field2822 = 50;

    @OriginalMember(owner = "client!dea", name = "w", descriptor = "[I")
    public static int[] field2823 = new int[field2822];

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "[I")
    public static int[] field2804 = new int[field2822];

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2810 = new String[field2822];

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "[I")
    public static int[] field2806 = new int[field2822];

    @OriginalMember(owner = "client!dea", name = "y", descriptor = "[I")
    public static int[] field2825 = new int[field2822];

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "[I")
    public static int[] field2801 = new int[field2822];

    @OriginalMember(owner = "client!dea", name = "C", descriptor = "[I")
    public static int[] field2829 = new int[field2822];

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "Lgs;")
    public static class41 field2811 = new class41("WTQA", 2);

    @OriginalMember(owner = "client!dea", name = "D", descriptor = "Lfv;")
    public static class108 field2830 = new class108(8, 0, 4, 1);

    @OriginalMember(owner = "client!dea", name = "E", descriptor = "Ldj;")
    public static class311 field2831 = new class311();

    @OriginalMember(owner = "client!dea", name = "F", descriptor = "Lkfa;")
    public static class549 field2832 = new class549(25, -1);

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!dea", name = "r", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!dea", name = "t", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!dea", name = "u", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!dea", name = "x", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!dea", name = "A", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!dea", name = "s", descriptor = "J")
    private long field2819;

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "J")
    private long field2826;

    @OriginalMember(owner = "client!dea", name = "B", descriptor = "Z")
    public boolean field2828;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "[I")
    private int[] field2803;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "[I")
    public int[] field2809;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "[[I")
    private int[][] field2813;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V", line = 5)
    private final void method1301(byte arg0) {
        field2817++;
        long[] var2 = class508.field7311;
        this.field2819 = -1L;
        this.field2819 = this.field2819 >>> 8 ^ var2[(int) ((this.field2819 ^ (long) (this.field2812 >> 8)) & 0xFFL)];
        this.field2819 = this.field2819 >>> 8 ^ var2[(int) (((long) this.field2812 ^ this.field2819) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2819 = var2[(int) ((this.field2819 ^ (long) (this.field2803[var3] >> 24)) & 0xFFL)] ^ this.field2819 >>> 8;
            this.field2819 = this.field2819 >>> 8 ^ var2[(int) (((long) (this.field2803[var3] >> 16) ^ this.field2819) & 0xFFL)];
            this.field2819 = var2[(int) (((long) (this.field2803[var3] >> 8) ^ this.field2819) & 0xFFL)] ^ this.field2819 >>> 8;
            this.field2819 = var2[(int) (((long) this.field2803[var3] ^ this.field2819) & 0xFFL)] ^ this.field2819 >>> 8;
        }
        int var4 = 42 / ((arg0 - 38) / 49);
        for (int var5 = 0; var5 < 5; var5++) {
            this.field2819 = var2[(int) (((long) this.field2809[var5] ^ this.field2819) & 0xFFL)] ^ this.field2819 >>> 8;
        }
        this.field2819 = this.field2819 >>> 8 ^ var2[(int) (((long) (this.field2828 ? 1 : 0) ^ this.field2819) & 0xFFL)];
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(BILsg;I)V", line = 41)
    public final void method1302(byte arg0, int arg1, class361 arg2, int arg3) {
        field2821++;
        if (arg0 != 4) {
            field2822 = -8;
        }
        int var5 = class683.field9691[arg1];
        if (this.field2803[var5] != 0 && arg2.method1982(arg3, (byte) -81) != null) {
            this.field2803[var5] = class139.method776(arg3, Integer.MIN_VALUE);
            this.method1301((byte) 97);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIILir;ILam;Lsg;BIILoa;I)Lba;", line = 62)
    public final class350 method1303(int arg0, int arg1, int arg2, class25 arg3, int arg4, class576 arg5, class361 arg6, byte arg7, int arg8, int arg9, class635 arg10, int arg11) {
        field2816++;
        int var13 = arg2;
        int var14 = -6 / ((arg7 + 69) / 45);
        if (arg5 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            var13 = arg2 | 0x20;
            Object var22 = null;
            int var23 = arg5.field8216[arg1];
            int var24 = var23 >>> 16;
            class2 var25 = arg3.method131(var24, true);
            int var26 = var23 & 0xFFFF;
            if (var25 != null) {
                var16 |= var25.method8(-68, var26);
                var15 |= var25.method11(var26, (byte) 68);
                var18 |= var25.method7(14569, var26);
                var17 |= arg5.field8230;
            }
            if ((arg5.field8218 || class504.field7259) && arg8 != -1 && arg5.field8216.length > arg8) {
                int var27 = arg5.field8216[arg8];
                int var28 = var27 >>> 16;
                int var29 = var27 & 0xFFFF;
                class2 var30;
                if (var24 == var28) {
                    var30 = var25;
                } else {
                    var30 = arg3.method131(var29 >>> 16, true);
                }
                if (var30 != null) {
                    var16 |= var30.method8(-21, var29);
                    var15 |= var30.method11(var29, (byte) 76);
                    var18 |= var30.method7(14569, var29);
                }
            }
            if (var16) {
                var13 |= 0x80;
            }
            if (var15) {
                var13 |= 0x100;
            }
            if (var17) {
                var13 |= 0x200;
            }
            if (var18) {
                var13 |= 0x400;
            }
        }
        long var31 = (long) (arg11 << 16) | (long) arg4 << 32 | (long) arg9;
        class653 var33 = class416.field5522;
        class350 var34;
        synchronized (class416.field5522) {
            var34 = (class350) class416.field5522.method3690((byte) -25, var31);
        }
        if (var34 == null || arg10.method312(var34.method902(), var13) != 0) {
            if (var34 != null) {
                var13 = arg10.method372(var13, var34.method902());
            }
            class90[] var36 = new class90[3];
            int var37 = 0;
            if (!arg6.method1982(arg9, (byte) -72).method3085(false) || !arg6.method1982(arg11, (byte) -112).method3085(false) || !arg6.method1982(arg4, (byte) -121).method3085(false)) {
                return null;
            }
            class90 var38 = arg6.method1982(arg9, (byte) -84).method3083((byte) -37);
            if (var38 != null) {
                var36[var37++] = var38;
            }
            class90 var39 = arg6.method1982(arg11, (byte) -70).method3083((byte) -94);
            if (var39 != null) {
                var36[var37++] = var39;
            }
            class90 var40 = arg6.method1982(arg4, (byte) -77).method3083((byte) -78);
            if (var40 != null) {
                var36[var37++] = var40;
            }
            class90 var41 = new class90(var36, var37);
            int var42 = var13 | 0x4000;
            var34 = arg10.method375(var41, var42, class274.field3473, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (class13.field116[var43].length > this.field2809[var43]) {
                    var34.method863(class505.field7270[var43], class13.field116[var43][this.field2809[var43]]);
                }
                if (this.field2809[var43] < class509.field7318[var43].length) {
                    var34.method863(class342.field4439[var43], class509.field7318[var43][this.field2809[var43]]);
                }
            }
            var34.method874(var13);
            class653 var44 = class416.field5522;
            synchronized (class416.field5522) {
                class416.field5522.method3683(var34, (byte) 100, var31);
            }
        }
        if (arg5 == null) {
            return var34;
        } else {
            class350 var45 = var34.method602((byte) 4, var13, true);
            return arg5.method3254(11, arg8, arg1, var45, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(BZ)V", line = 214)
    public final void method1304(byte arg0, boolean arg1) {
        this.field2828 = arg1;
        if (arg0 == 94) {
            field2824++;
            this.method1301((byte) 89);
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V", line = 227)
    public static void method1305(byte arg0) {
        field2831 = null;
        field2823 = null;
        field2804 = null;
        field2801 = null;
        field2810 = null;
        field2830 = null;
        field2806 = null;
        field2815 = null;
        field2832 = null;
        if (arg0 == -22) {
            field2829 = null;
            field2825 = null;
            field2811 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(III)I", line = 248)
    public static final int method1306(int arg0, int arg1, int arg2) {
        field2820++;
        int var3 = class169.method1008(4, 1, arg1 + 45365, arg0 + 91923) + (class169.method1008(2, 1, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (class169.method1008(1, arg2 ^ 0x4, arg1, arg0) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg2 == 5 ? var4 : 91;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIILwm;)V", line = 271)
    public static final void method1307(int arg0, int arg1, int arg2, class515 arg3) {
        class337.field4413[arg2][arg0] = arg3;
        field2802++;
        if (arg1 != 0) {
            field2801 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILir;Lam;Loba;ILln;Lwda;ILoa;Lsg;B)Lba;", line = 282)
    public final class350 method1308(int arg0, int arg1, class25 arg2, class576 arg3, class237 arg4, int arg5, class343 arg6, class582 arg7, int arg8, class635 arg9, class361 arg10, byte arg11) {
        if (arg11 <= 29) {
            method1306(-21, 79, 41);
        }
        field2805++;
        if (this.field2814 != -1) {
            return arg7.method3273(-1119, this.field2814).method110(arg8, arg0, arg9, arg4, arg2, 18381, arg3, arg1, arg5);
        }
        int var13 = arg5;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg3.field8216[arg1];
            Object var22 = null;
            var13 = arg5 | 0x20;
            int var23 = var21 >>> 16;
            class2 var24 = arg2.method131(var23, true);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method8(-55, var25);
                var14 |= var24.method11(var25, (byte) 91);
                var17 |= var24.method7(14569, var25);
                var16 |= arg3.field8230;
            }
            if ((arg3.field8218 || class504.field7259) && arg8 != -1 && arg3.field8216.length > arg8) {
                int var26 = arg3.field8216[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class2 var29 = var23 == var27 ? var24 : arg2.method131(var27, true);
                if (var29 != null) {
                    var15 |= var29.method8(-33, var28);
                    var14 |= var29.method11(var28, (byte) 32);
                    var17 |= var29.method7(14569, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class653 var30 = class416.field5522;
        class350 var31;
        synchronized (class416.field5522) {
            var31 = (class350) class416.field5522.method3690((byte) -34, this.field2819);
        }
        if (var31 == null || arg9.method312(var31.method902(), var13) != 0) {
            if (var31 != null) {
                var13 = arg9.method372(var13, var31.method902());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field2803[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg10.method1982(var35 & 0x3FFFFFFF, (byte) -125).method3085(false)) {
                        var33 = true;
                    }
                } else if (!arg6.method1903(var35 & 0x3FFFFFFF, (byte) -111).method3063(this.field2828, -1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class90[] var36 = new class90[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field2803[var38];
                if ((var39 & 0x40000000) != 0) {
                    class90 var40 = arg6.method1903(var39 & 0x3FFFFFFF, (byte) 108).method3065(this.field2828, (byte) 121);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class90 var41 = arg10.method1982(var39 & 0x3FFFFFFF, (byte) -103).method3083((byte) -12);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class90 var43 = new class90(var36, var37);
            var31 = arg9.method375(var43, var42, class274.field3473, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field2809[var44] < class13.field116[var44].length) {
                    var31.method863(class505.field7270[var44], class13.field116[var44][this.field2809[var44]]);
                }
                if (class509.field7318[var44].length > this.field2809[var44]) {
                    var31.method863(class342.field4439[var44], class509.field7318[var44][this.field2809[var44]]);
                }
            }
            var31.method874(var13);
            class653 var45 = class416.field5522;
            synchronized (class416.field5522) {
                class416.field5522.method3683(var31, (byte) 109, this.field2819);
            }
        }
        if (arg3 == null) {
            return var31;
        } else {
            var31.method602((byte) 4, var13, true);
            return arg3.method3254(11, arg8, arg1, var31, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lfu;Z)Z", line = 481)
    public static final boolean method1309(class354 arg0, boolean arg1) {
        boolean var2 = class628.field8912 == class591.field8415;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1046(-1);
        if (arg0.field4642 < 0 || arg0.field4648 < 0 || arg0.field4645 >= class181.field2222 || arg0.field4639 >= class272.field3451) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field4642; var7 <= arg0.field4645; var7++) {
            for (int var10 = arg0.field4648; var10 <= arg0.field4639; var10++) {
                class287 var11 = class396.method2161(arg0.field4638, var7, var10);
                if (var11 != null) {
                    int var12 = 0;
                    if (var7 > arg0.field4642) {
                        var12++;
                    }
                    if (var7 < arg0.field4645) {
                        var12 += 4;
                    }
                    if (var10 > arg0.field4648) {
                        var12 += 8;
                    }
                    if (var10 < arg0.field4639) {
                        var12 += 2;
                    }
                    class60 var13 = class40.method212(arg0, var12, (byte) 98);
                    class60 var14 = var11.field3680;
                    if (var14 == null) {
                        var11.field3680 = var13;
                    } else {
                        while (var14.field623 != null) {
                            var14 = var14.field623;
                        }
                        var14.field623 = var13;
                    }
                    var11.field3679 = (byte) (var11.field3679 | var12);
                    if (var2 && (class398.field5323[var7][var10] & 0xFF000000) != 0) {
                        var3 = class398.field5323[var7][var10];
                        var4 = class425.field5651[var7][var10];
                        var5 = class217.field2625[var7][var10];
                    }
                    if (var11.field3686 != null && var11.field3686.field4474 > var6) {
                        var6 = var11.field3686.field4474;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field4642; var8 <= arg0.field4645; var8++) {
                for (int var9 = arg0.field4648; var9 <= arg0.field4639; var9++) {
                    if ((class398.field5323[var8][var9] & 0xFF000000) == 0) {
                        class398.field5323[var8][var9] = var3;
                        class425.field5651[var8][var9] = var4;
                        class217.field2625[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class304.field3979[class474.field6910++] = arg0;
        }
        if (arg1) {
            arg0.field4646 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(III)V", line = 596)
    public final void method1310(int arg0, int arg1, int arg2) {
        field2807++;
        this.field2809[arg1] = arg2;
        this.method1301((byte) -87);
        if (arg0 < 52) {
            this.method1313(false, 82, null, -47, null, 26, -6, null, 11, null, null, null, null, -33, null, -59, 84, null, null);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "([IIZIZ[I)V", line = 608)
    public final void method1311(int[] arg0, int arg1, boolean arg2, int arg3, boolean arg4, int[] arg5) {
        this.field2814 = arg3;
        this.field2809 = arg0;
        field2808++;
        this.field2803 = arg5;
        this.field2828 = arg4;
        if (this.field2812 != arg1) {
            this.field2813 = null;
            this.field2812 = arg1;
        }
        if (!arg2) {
            this.method1310(111, 115, 9);
        }
        this.method1301((byte) 106);
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(B)V", line = 631)
    public static final void method1312(byte arg0) {
        if (class623.field8837.field7924 && class172.field2060.field3986 != -1) {
            class485.method2815(class172.field2060.field3992, -32012, class172.field2060.field3986);
        }
        if (arg0 == -35) {
            field2827++;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZILwda;ILoba;IILir;ILpl;[Lvb;Lam;Loa;ILam;IILsg;Lln;)Lba;", line = 650)
    public final class350 method1313(boolean arg0, int arg1, class582 arg2, int arg3, class237 arg4, int arg5, int arg6, class25 arg7, int arg8, class593 arg9, class179[] arg10, class576 arg11, class635 arg12, int arg13, class576 arg14, int arg15, int arg16, class361 arg17, class343 arg18) {
        field2818++;
        if (this.field2814 != -1) {
            return arg2.method3273(-1119, this.field2814).method103(arg3, -1, arg1, arg5, arg13, arg9, arg16, arg12, arg4, arg11, arg15, arg14, arg6, arg7, arg10);
        }
        int var20 = arg6;
        long var21 = this.field2819;
        int[] var23 = this.field2803;
        if (arg11 != null && (arg11.field8225 >= 0 || arg11.field8209 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field2803[var24];
            }
            if (arg11.field8225 >= 0) {
                if (arg11.field8225 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class139.method776(1073741824, arg11.field8225);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg11.field8209 >= 0) {
                if (arg11.field8209 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class139.method776(arg11.field8209, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg11 != null || arg14 != null;
        int var29 = arg10 == null ? 0 : arg10.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class575.field8181[var30] = null;
            if (arg10[var30] != null) {
                class576 var31 = arg7.method124(24006, arg10[var30].field2211);
                if (var31.field8216 != null) {
                    class539.field7754[var30] = var31;
                    var28 = true;
                    int var32 = arg10[var30].field2217;
                    int var33 = arg10[var30].field2212;
                    int var34 = var31.field8216[var32];
                    class575.field8181[var30] = arg7.method131(var34 >>> 16, true);
                    int var35 = var34 & 0xFFFF;
                    class179.field2215[var30] = var35;
                    if (class575.field8181[var30] != null) {
                        var26 |= class575.field8181[var30].method8(-29, var35);
                        var25 |= class575.field8181[var30].method11(var35, (byte) 9);
                        var27 |= class575.field8181[var30].method7(arg8 ^ 0xFFFFC716, var35);
                    }
                    if ((var31.field8218 || class504.field7259) && var33 != -1 && var31.field8216.length > var33) {
                        class522.field7479[var30] = var31.field8208[var32];
                        class569.field8068[var30] = arg10[var30].field2210;
                        int var36 = var31.field8216[var33];
                        class514.field7355[var30] = arg7.method131(var36 >>> 16, true);
                        int var37 = var36 & 0xFFFF;
                        class164.field1968[var30] = var37;
                        if (class514.field7355[var30] != null) {
                            var26 |= class514.field7355[var30].method8(arg8 ^ 0x73, var37);
                            var25 |= class514.field7355[var30].method11(var37, (byte) 42);
                            var27 |= class514.field7355[var30].method7(14569, var37);
                        }
                    } else {
                        class522.field7479[var30] = 0;
                        class569.field8068[var30] = 0;
                        class514.field7355[var30] = null;
                        class164.field1968[var30] = -1;
                    }
                }
            }
        }
        int var38 = arg8;
        int var39 = -1;
        int var40 = 0;
        class2 var41 = null;
        class2 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class2 var46 = null;
        class2 var47 = null;
        if (var28) {
            var20 = arg6 | 0x20;
            if (arg11 != null) {
                int var48 = arg11.field8216[arg5];
                int var49 = var48 >>> 16;
                var41 = arg7.method131(var49, true);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method8(arg8 - 120, var38);
                    var25 |= var41.method11(var38, (byte) 10);
                    var27 |= var41.method7(14569, var38);
                }
                if ((arg11.field8218 || class504.field7259) && arg13 != -1 && arg11.field8216.length > arg13) {
                    var40 = arg11.field8208[arg5];
                    int var50 = arg11.field8216[arg13];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg7.method131(var51, true);
                    if (var42 != null) {
                        var26 |= var42.method8(arg8 ^ 0x3C, var39);
                        var25 |= var42.method11(var39, (byte) 107);
                        var27 |= var42.method7(14569, var39);
                    }
                }
            }
            if (arg14 != null) {
                int var52 = arg14.field8216[arg1];
                int var53 = var52 >>> 16;
                var46 = arg7.method131(var53, true);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method8(-88, var43);
                    var25 |= var46.method11(var43, (byte) 13);
                    var27 |= var46.method7(arg8 ^ 0xFFFFC716, var43);
                }
                if ((arg14.field8218 || class504.field7259) && arg15 != -1 && arg14.field8216.length > arg15) {
                    var45 = arg14.field8208[arg1];
                    int var54 = arg14.field8216[arg15];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg7.method131(var55, true);
                    if (var47 != null) {
                        var26 |= var47.method8(arg8 ^ 0x75, var44);
                        var25 |= var47.method11(var44, (byte) 42);
                        var27 |= var47.method7(arg8 ^ 0xFFFFC716, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class653 var56 = class84.field896;
        class350 var57;
        synchronized (class84.field896) {
            var57 = (class350) class84.field896.method3690((byte) 124, var21);
        }
        class468 var58 = null;
        if (this.field2812 != -1) {
            var58 = arg9.method3324(this.field2812, -28590);
        }
        if (var57 == null || arg12.method312(var57.method902(), var20) != 0 || var58 != null && var58.field6513 != null && this.field2813 == null) {
            if (var57 != null) {
                var20 = arg12.method372(var20, var57.method902());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field2826 != -1L) {
                            class653 var63 = class84.field896;
                            synchronized (class84.field896) {
                                var57 = (class350) class84.field896.method3690((byte) 118, this.field2826);
                            }
                        }
                        if (var57 == null || arg12.method312(var57.method902(), var20) != 0 || var58 != null && var58.field6513 != null && this.field2813 == null) {
                            return null;
                        }
                    } else {
                        class90[] var64 = new class90[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class90 var68 = arg18.method1903(var66 & 0x3FFFFFFF, (byte) -4).method3050(this.field2828, (byte) -124);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            } else if ((var66 & Integer.MIN_VALUE) != 0) {
                                class90 var67 = arg17.method1982(var66 & 0x3FFFFFFF, (byte) -110).method3087((byte) 121);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            }
                        }
                        if (var58 != null && var58.field6513 != null) {
                            for (int var69 = 0; var69 < var58.field6513.length; var69++) {
                                if (var58.field6513[var69] != null && var64[var69] != null) {
                                    int var70 = var58.field6513[var69][0];
                                    int var71 = var58.field6513[var69][1];
                                    int var72 = var58.field6513[var69][2];
                                    int var73 = var58.field6513[var69][3] << 3;
                                    int var74 = var58.field6513[var69][4] << 3;
                                    int var75 = var58.field6513[var69][5] << 3;
                                    if (this.field2813 == null) {
                                        this.field2813 = new int[var58.field6513.length][];
                                    }
                                    if (this.field2813[var69] == null) {
                                        int[] var76 = this.field2813[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[13] = -var71;
                                            var76[0] = var76[4] = var76[8] = 32768;
                                            var76[14] = -var72;
                                            var76[12] = -var70;
                                        } else {
                                            int var77 = class285.field3656[var73];
                                            int var78 = class285.field3655[var73];
                                            int var79 = class285.field3656[var74];
                                            int var80 = class285.field3655[var74];
                                            int var81 = class285.field3656[var75];
                                            int var82 = class285.field3655[var75];
                                            int var83 = var78 * var81 + 8192 >> 14;
                                            int var84 = var78 * var82 + 8192 >> 14;
                                            var76[3] = var77 * var82 + 8192 >> 14;
                                            var76[7] = var79 * var83 + -var80 * -var82 + 8192 >> 14;
                                            var76[0] = var79 * var81 + var80 * var84 + 8192 >> 14;
                                            var76[5] = -var78;
                                            var76[1] = -var82 * var79 + var80 * var83 + 8192 >> 14;
                                            var76[2] = var77 * var80 + 8192 >> 14;
                                            var76[8] = var77 * var79 + 8192 >> 14;
                                            var76[6] = var79 * var84 + -var80 * var81 + 8192 >> 14;
                                            var76[4] = var77 * var81 + 8192 >> 14;
                                            var76[12] = var76[3] * -var71 + var76[0] * -var70 - (-(var76[6] * -var72) - 8192) >> 14;
                                            var76[14] = var76[2] * -var70 + (var76[5] * -var71 + (var76[8] * -var72) + 8192) >> 14;
                                            var76[13] = var76[1] * -var70 + (var76[4] * -var71) + var76[7] * -var72 + 8192 >> 14;
                                        }
                                        var76[10] = var71;
                                        var76[9] = var70;
                                        var76[11] = var72;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method568(true, var73, var75, var74);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method564(var71, 0, var70, var72);
                                    }
                                }
                            }
                        }
                        int var85 = var20 | 0x4000;
                        class90 var86 = new class90(var64, var64.length);
                        var57 = arg12.method375(var86, var85, class274.field3473, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            if (this.field2809[var87] < class13.field116[var87].length) {
                                var57.method863(class505.field7270[var87], class13.field116[var87][this.field2809[var87]]);
                            }
                            if (class509.field7318[var87].length > this.field2809[var87]) {
                                var57.method863(class342.field4439[var87], class509.field7318[var87][this.field2809[var87]]);
                            }
                        }
                        if (arg0) {
                            var57.method874(var20);
                            class653 var88 = class84.field896;
                            synchronized (class84.field896) {
                                class84.field896.method3683(var57, (byte) -74, var21);
                            }
                            this.field2826 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg17.method1982(var62 & 0x3FFFFFFF, (byte) -128).method3084(0)) {
                        var60 = true;
                    }
                } else if (!arg18.method1903(var62 & 0x3FFFFFFF, (byte) 103).method3062(this.field2828, (byte) 124)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class350 var89 = var57.method602((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class575.field8181[var90] != null) {
                var89.method1939(this.field2813 == null ? null : this.field2813[var90], class569.field8068[var90] - 1, class179.field2215[var90], var91, -76, class575.field8181[var90], class514.field7355[var90], class164.field1968[var90], class522.field7479[var90], 0, false);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method1941(arg16 - 1, ~arg8, var38, var40, arg3 - 1, arg11.field8228, var41, var46, var42, var43, var47, var45, false, var44, var39);
        } else if (var41 != null) {
            var89.method1938(var41, var42, false, var40, arg3 - 1, var39, var38, 0, (byte) 5);
        } else if (var46 != null) {
            var89.method1938(var46, var47, false, var45, arg16 - 1, var44, var43, 0, (byte) 5);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class575.field8181[var92] = null;
            class514.field7355[var92] = null;
            class539.field7754[var92] = null;
        }
        return var89;
    }
}
