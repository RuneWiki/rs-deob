import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class195 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public int field2968 = -1;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field2971 = -1;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Z")
    public boolean field2975 = false;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Z")
    public boolean field2969 = false;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public int field2980 = -1;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public int field2967 = 2;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field2973 = -1;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Z")
    public boolean field2988 = false;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public int field2992 = 5;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field2982 = 99;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public int field2984 = -1;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "Z")
    public boolean field2998 = false;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2970 = new String[100];

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "[I")
    public static int[] field2981 = new int[99];

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2990;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "Z")
    public static boolean field2997;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[I")
    public int[] field2966;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "[I")
    private int[] field2977;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "[I")
    public int[] field2989;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "[Z")
    public boolean[] field3000;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "[[I")
    public int[][] field2986;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public final void method1230(boolean arg0) {
        field2974++;
        if (arg0) {
            field2993 = 75;
        }
        if (this.field2968 == -1) {
            if (this.field3000 == null) {
                this.field2968 = 0;
            } else {
                this.field2968 = 2;
            }
        }
        if (this.field2980 != -1) {
            return;
        }
        if (this.field3000 == null) {
            this.field2980 = 0;
        } else {
            this.field2980 = 2;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBII)V")
    public static final void method1231(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class231.field3614.field3280 = 0;
        field2985++;
        class231.field3614.method1363(20, -110);
        class231.field3614.method1363(arg3, 119);
        class231.field3614.method1363(arg0, 108);
        if (arg2 > -42) {
            method1238(35);
        }
        class231.field3614.method1385(arg4, true);
        class231.field3614.method1385(arg1, true);
        class179.field2714 = 1;
        class19.field318 = 0;
        class168.field2405 = -3;
        class154.field2133 = 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lmi;IIIII)Lmi;")
    public final class94 method1232(class94 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2999++;
        int var7 = this.field2966[arg3];
        int var8 = this.field2989[arg3];
        class82 var9 = class235.method1541(var8 >> 16, -87);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method415(true, true, true);
        }
        if (arg5 != 5289) {
            field2997 = true;
        }
        int var11 = arg1 & 0x3;
        class82 var12 = null;
        if ((this.field2998 || class199.field3035) && arg2 != -1 && arg2 < this.field2989.length) {
            int var13 = this.field2989[arg2];
            var12 = class235.method1541(var13 >> 16, arg5 ^ 0xFFFFEB77);
            arg2 = var13 & 0xFFFF;
        }
        class94 var14;
        if (var12 == null) {
            var14 = arg0.method415(!var9.method520(var10, 7502), !var9.method523(var10, 110), !this.field2988);
        } else {
            var14 = arg0.method415(!var9.method520(var10, arg5 + 2213) & !var12.method520(arg2, 7502), !var9.method523(var10, arg5 - 5201) & !var12.method523(arg2, -97), !this.field2988);
        }
        if (var11 == 1) {
            var14.method435();
        } else if (var11 == 2) {
            var14.method432();
        } else if (var11 == 3) {
            var14.method405();
        }
        var14.method603(var9, var10, var12, arg2, arg4 - 1, var7, this.field2988);
        if (var11 == 1) {
            var14.method405();
        } else if (var11 == 2) {
            var14.method432();
        } else if (var11 == 3) {
            var14.method435();
        }
        return var14;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZIILmi;I)Lmi;")
    public final class94 method1233(boolean arg0, int arg1, int arg2, class94 arg3, int arg4) {
        int var6 = this.field2966[arg4];
        field2978++;
        int var7 = this.field2989[arg4];
        if (arg0) {
            return null;
        }
        class82 var8 = class235.method1541(var7 >> 16, -56);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method436(true, true, true);
        }
        class82 var10 = null;
        if ((this.field2998 || class199.field3035) && arg2 != -1 && this.field2989.length > arg2) {
            int var11 = this.field2989[arg2];
            var10 = class235.method1541(var11 >> 16, -53);
            arg2 = var11 & 0xFFFF;
        }
        class82 var12 = null;
        int var13 = 0;
        int var14 = 0;
        class82 var15 = null;
        if (this.field2977 != null) {
            if (this.field2977.length > arg4) {
                var13 = this.field2977[arg4];
                if (var13 != 65535) {
                    var12 = class235.method1541(var13 >> 16, -20);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field2998 || class199.field3035) && arg2 != -1 && arg2 < this.field2977.length) {
                var14 = this.field2977[arg2];
                if (var14 != 65535) {
                    var15 = class235.method1541(var14 >> 16, 96);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method520(var9, 7502);
        boolean var17 = !var8.method523(var9, -100);
        if (var12 != null) {
            var16 &= !var12.method520(var13, 7502);
            var17 &= !var12.method523(var13, 105);
        }
        if (var10 != null) {
            var16 &= !var10.method520(arg2, 7502);
            var17 &= !var10.method523(arg2, -45);
        }
        if (var15 != null) {
            var16 &= !var15.method520(var14, 7502);
            var17 &= !var15.method523(var14, 103);
        }
        class94 var18 = arg3.method436(var16, var17, !this.field2988);
        var18.method603(var8, var9, var10, arg2, arg1 - 1, var6, this.field2988);
        if (var12 != null) {
            var18.method603(var12, var13, var15, var14, arg1 - 1, var6, this.field2988);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLcm;I)V")
    public static final void method1234(byte arg0, class256 arg1, int arg2) {
        field2996++;
        if (arg1.field4037 > class35.field533) {
            class112.method715(arg0 ^ 0x34, arg1);
        } else if (arg1.field4082 < class35.field533) {
            class112.method717(arg1, 6901);
        } else {
            class221.method1448(arg1, (byte) 125);
        }
        if (arg1.field4081 < 128 || arg1.field4140 < 128 || arg1.field4081 >= 13184 || arg1.field4140 >= 13184) {
            arg1.field4133 = -1;
            arg1.field4073 = -1;
            arg1.field4082 = 0;
            arg1.field4037 = 0;
            arg1.field4081 = arg1.field4143[0] * 128 + (arg1.method1683(-92) * 64);
            arg1.field4140 = arg1.field4053[0] * 128 + arg1.method1683(-119) * 64;
            arg1.method1680(arg0 - 3196);
        }
        if (class250.field3905 == arg1 && (arg1.field4081 < 1536 || arg1.field4140 < 1536 || arg1.field4081 >= 11776 || arg1.field4140 >= 11776)) {
            arg1.field4133 = -1;
            arg1.field4037 = 0;
            arg1.field4073 = -1;
            arg1.field4082 = 0;
            arg1.field4081 = arg1.field4143[0] * 128 + arg1.method1683(-116) * 64;
            arg1.field4140 = arg1.field4053[0] * 128 + arg1.method1683(-113) * 64;
            arg1.method1680(-3130);
        }
        class111.method712(arg1, (byte) 25);
        class65.method399(118, arg1);
        if (arg0 != 66) {
            method1238(85);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILmi;I)Lmi;")
    public final class94 method1235(int arg0, int arg1, int arg2, class94 arg3, int arg4) {
        field2979++;
        int var6 = this.field2966[arg4];
        int var7 = this.field2989[arg4];
        class82 var8 = class235.method1541(var7 >> 16, arg0 ^ 0xFFFFD458);
        int var9 = var7 & 0xFFFF;
        if (arg0 != -11262) {
            return null;
        } else if (var8 == null) {
            return arg3.method404(true, true, true);
        } else {
            class82 var10 = null;
            if ((this.field2998 || class199.field3035) && arg2 != -1 && arg2 < this.field2989.length) {
                int var11 = this.field2989[arg2];
                var10 = class235.method1541(var11 >> 16, -35);
                arg2 = var11 & 0xFFFF;
            }
            class94 var12;
            if (var10 == null) {
                var12 = arg3.method404(!var8.method520(var9, arg0 + 18764), !var8.method523(var9, -96), !this.field2988);
            } else {
                var12 = arg3.method404(!var8.method520(var9, 7502) & !var10.method520(arg2, arg0 ^ 0xFFFFC94C), !var8.method523(var9, -33) & !var10.method523(arg2, arg0 + 11134), !this.field2988);
            }
            var12.method603(var8, var9, var10, arg2, arg1 - 1, var6, this.field2988);
            return var12;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Luh;")
    public static final class239 method1236(int arg0, int arg1) {
        field2995++;
        class239 var2 = (class239) class295.field4708.method950((long) arg0, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class258.field4175.method2050(100, arg0, 0);
        if (arg1 != -27867) {
            method1236(31, -126);
        }
        class239 var4 = new class239(var3);
        var4.method225(class260.field4196, (int[]) null);
        class295.field4708.method942((long) arg0, (byte) 121, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZILbj;)V")
    private final void method1237(boolean arg0, int arg1, class215 arg2) {
        field2972++;
        if (!arg0) {
            field2993 = 96;
        }
        if (arg1 == 1) {
            int var4 = arg2.method1379(-98);
            this.field2966 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2966[var5] = arg2.method1379(-120);
            }
            this.field2989 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2989[var6] = arg2.method1379(-72);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2989[var7] = (arg2.method1379(-123) << 16) + this.field2989[var7];
            }
        } else if (arg1 == 2) {
            this.field2984 = arg2.method1379(-123);
        } else if (arg1 == 3) {
            this.field3000 = new boolean[256];
            int var8 = arg2.method1374((byte) -60);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3000[arg2.method1374((byte) -60)] = true;
            }
        } else if (arg1 == 4) {
            this.field2969 = true;
        } else if (arg1 == 5) {
            this.field2992 = arg2.method1374((byte) -60);
        } else if (arg1 == 6) {
            this.field2973 = arg2.method1379(-114);
        } else if (arg1 == 7) {
            this.field2971 = arg2.method1379(-128);
        } else if (arg1 == 8) {
            this.field2982 = arg2.method1374((byte) -60);
        } else if (arg1 == 9) {
            this.field2980 = arg2.method1374((byte) -60);
        } else if (arg1 == 10) {
            this.field2968 = arg2.method1374((byte) -60);
        } else if (arg1 == 11) {
            this.field2967 = arg2.method1374((byte) -60);
        } else if (arg1 == 12) {
            int var10 = arg2.method1374((byte) -60);
            this.field2977 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2977[var11] = arg2.method1379(-97);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2977[var12] = (arg2.method1379(-106) << 16) + this.field2977[var12];
            }
        } else if (arg1 == 13) {
            int var13 = arg2.method1379(-126);
            this.field2986 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg2.method1374((byte) -60);
                if (var15 > 0) {
                    this.field2986[var14] = new int[var15];
                    this.field2986[var14][0] = arg2.method1403(6591);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field2986[var14][var16] = arg2.method1379(-92);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2988 = true;
        } else if (arg1 == 15) {
            this.field2998 = true;
        } else if (arg1 == 16) {
            this.field2975 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method1238(int arg0) {
        field2970 = null;
        field2981 = null;
        if (arg0 != 25668) {
            method1238(8);
        }
        field2990 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILbj;Ljava/lang/String;)I")
    public static final int method1239(int arg0, class215 arg1, String arg2) {
        if (arg0 != -2) {
            return -11;
        }
        field2983++;
        int var3 = arg1.field3280;
        byte[] var4 = class121.method781(arg2, true);
        arg1.method1367(122, var4.length);
        arg1.field3280 += class156.field2156.method665(arg0 + 2, var4.length, arg1.field3287, 0, var4, arg1.field3280);
        return arg1.field3280 - var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lbj;I)V")
    public final void method1240(class215 arg0, int arg1) {
        field2976++;
        int var3 = 30 / ((-arg1 - 70) / 52);
        while (true) {
            int var4 = arg0.method1374((byte) -60);
            if (var4 == 0) {
                return;
            }
            this.method1237(true, var4, arg0);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2981[var1] = var0 / 4;
        }
        field2994 = -1;
        field2990 = "Drop";
        field2997 = false;
    }
}
