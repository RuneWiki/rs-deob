import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class99 {

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    private int field2313;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[[I")
    private int[][] field2311;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lvc;")
    public static class137 field2301 = class45.method325("@lre@", -46);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lvc;")
    public static class137 field2302 = null;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lvc;")
    private static class137 field2317 = class45.method325("Connection timed out)3", -46);

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lvc;")
    private static class137 field2315 = class45.method325("Loaded title screen", -46);

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[I")
    public static int[] field2320 = new int[200];

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lvc;")
    public static class137 field2321 = class45.method325("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>", -46);

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Lvc;")
    public static class137 field2323 = class45.method325("Verbinde mit Server)3)3)3", -46);

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lvc;")
    public static class137 field2316 = field2315;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2309 = 0;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lvc;")
    public static class137 field2307 = field2317;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lia;")
    public static class57 field2305;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Loa;")
    public static class93 field2322;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
    public static final void method713(byte arg0, int arg1) {
        class98.method711(104);
        field2312++;
        int var2 = class67.method475((byte) -17, arg1).field1173;
        if (var2 == 0) {
            return;
        }
        int var3 = class28.field631[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class97.method692(0.9D);
                ((class1) class97.field2256).method10((byte) 2, 0.9D);
            }
            if (var3 == 2) {
                class97.method692(0.8D);
                ((class1) class97.field2256).method10((byte) 2, 0.8D);
            }
            if (var3 == 3) {
                class97.method692(0.7D);
                ((class1) class97.field2256).method10((byte) 2, 0.7D);
            }
            if (var3 == 4) {
                class97.method692(0.6D);
                ((class1) class97.field2256).method10((byte) 2, 0.6D);
            }
            class67.method472((byte) 98);
            class86.field2058 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class10.field218 != var4) {
                if (class10.field218 == 0 && class114.field2711 != -1) {
                    class13.method88(var4, 0, false, class23.field553, class114.field2711, arg0 + 84, 0);
                    class91.field2152 = 0;
                } else if (var4 == 0) {
                    class13.method84(-6027);
                    class91.field2152 = 0;
                } else {
                    class114.method885((byte) 122, var4);
                }
                class10.field218 = var4;
            }
        }
        if (var2 == 5) {
            client.field498 = var3;
        }
        if (arg0 != -85) {
            method713((byte) 35, 79);
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class43.field939 = 127;
            }
            if (var3 == 1) {
                class43.field939 = 96;
            }
            if (var3 == 2) {
                class43.field939 = 64;
            }
            if (var3 == 3) {
                class43.field939 = 32;
            }
            if (var3 == 4) {
                class43.field939 = 0;
            }
        }
        if (var2 == 8) {
            class7.field145 = var3;
            class80.field1825 = true;
        }
        if (var2 == 9) {
            class106.field2463 = var3;
        }
        if (var2 == 6) {
            class143.field3367 = var3;
        }
        if (var2 != 4) {
            return;
        }
        if (var3 == 0) {
            class12.field277 = 127;
        }
        if (var3 == 1) {
            class12.field277 = 96;
        }
        if (var3 == 2) {
            class12.field277 = 64;
        }
        if (var3 == 3) {
            class12.field277 = 32;
        }
        if (var3 == 4) {
            class12.field277 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B[B)[B")
    public final byte[] method714(byte arg0, byte[] arg1) {
        field2310++;
        if (arg0 > -120) {
            this.field2311 = null;
        }
        if (this.field2311 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2313 / (long) this.field2318) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field2311[var5];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2313 + var5;
                int var14 = var13 / this.field2318;
                var6 += var14;
                var5 = var13 - this.field2318 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2303++;
        if (arg5 < 18) {
            field2315 = null;
        }
        class73 var10 = (class73) class2.field44.method726(0);
        class73 var11 = null;
        while (var10 != null) {
            if (var10.field1545 == arg8 && var10.field1548 == arg1 && var10.field1558 == arg4 && var10.field1546 == arg3) {
                var11 = var10;
                break;
            }
            var10 = (class73) class2.field44.method731((byte) -117);
        }
        if (var11 == null) {
            var11 = new class73();
            var11.field1558 = arg4;
            var11.field1545 = arg8;
            var11.field1546 = arg3;
            var11.field1548 = arg1;
            class122.method916(var11, 256);
            class2.field44.method730(467, var11);
        }
        var11.field1550 = arg6;
        var11.field1554 = arg7;
        var11.field1557 = arg0;
        var11.field1549 = arg2;
        var11.field1541 = arg9;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
    public final int method716(int arg0, int arg1) {
        if (arg1 != 4) {
            return -47;
        }
        field2308++;
        if (this.field2311 != null) {
            arg0 = (int) ((long) this.field2313 * (long) arg0 / (long) this.field2318) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lme;BI)Lvc;")
    public static final class137 method717(class85 arg0, byte arg1, int arg2) {
        field2306++;
        if (arg1 > -3) {
            field2309 = -52;
        }
        if (!class22.method202(class28.method218(14485, arg0), false, arg2)) {
            return null;
        } else if (arg0.field1938 == null || arg2 >= arg0.field1938.length || arg0.field1938[arg2] == null || arg0.field1938[arg2].method1034(126).method997(109) == 0) {
            return class4.field103 ? class88.method666(-27, new class137[] { class44.field984, class61.method435(arg2, 78) }) : null;
        } else {
            return arg0.field1938[arg2];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lnb;Lvc;Lvc;I)Lia;")
    public static final class57 method718(class88 arg0, class137 arg1, class137 arg2, int arg3) {
        int var4 = arg0.method641(1, arg1);
        int var5 = arg0.method654(28784, arg2, var4);
        if (arg3 != -27880) {
            method717(null, (byte) -119, 119);
        }
        field2304++;
        return class111.method863(var4, -30605, var5, arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method719(int arg0) {
        field2307 = null;
        field2322 = null;
        field2316 = null;
        field2302 = null;
        field2323 = null;
        field2321 = null;
        field2301 = null;
        int var1 = 8 / ((23 - arg0) / 35);
        field2320 = null;
        field2315 = null;
        field2317 = null;
        field2305 = null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(BI)I")
    public final int method720(byte arg0, int arg1) {
        if (arg0 != 2) {
            return -59;
        }
        field2319++;
        if (this.field2311 != null) {
            arg1 = (int) ((long) this.field2313 * (long) arg1 / (long) this.field2318);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II)V")
    public class99(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class125.method934(arg1, arg0, -27775);
            int var4 = arg1 / var3;
            this.field2313 = var4;
            int var5 = arg0 / var3;
            this.field2311 = new int[var5][14];
            this.field2318 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2311[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
