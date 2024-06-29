import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class361 {

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Lgk;")
    private class273 field5718 = null;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Z")
    private boolean field5723;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
    private boolean field5711;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "Lfl;")
    private class52 field5737;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "[I")
    public static int[] field5717 = new int[32];

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field5721 = 0;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5695 = "Loaded input handler";

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "Lth;")
    public static class57 field5735 = new class57(50);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[Ljava/lang/Object;")
    private Object[] field5693;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field5706;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLsb;)Ljava/lang/String;", line = 4)
    public static final String method2504(byte arg0, class190 arg1) {
        if (arg0 == 3) {
            field5725++;
            return class95.method742(-87, 32767, arg1);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 16)
    public final int method2505(String arg0, byte arg1) {
        field5710++;
        if (this.method2518(-1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5718.field4137.method2104(class139.method977(var3, 115), -1);
            int var5 = 13 % ((arg1 - 8) / 47);
            return this.method2506((byte) -59, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Z", line = 41)
    private final boolean method2506(byte arg0, int arg1) {
        field5730++;
        if (arg0 != -59) {
            return true;
        } else if (!this.method2518(-1)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field5718.field4145.length && this.field5718.field4145[arg1] != 0) {
            return true;
        } else if (class143.field2067) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I", line = 67)
    private final int method2507(int arg0, int arg1) {
        field5727++;
        int var3 = 25 / ((arg0 - 72) / 47);
        if (this.method2506((byte) -59, arg1)) {
            return this.field5693[arg1] == null ? this.field5737.method439(-1, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[I", line = 91)
    public final int[] method2508(int arg0, int arg1) {
        field5703++;
        if (!this.method2506((byte) -59, arg1)) {
            return null;
        }
        if (arg0 <= 25) {
            this.field5711 = false;
        }
        int[] var3 = this.field5718.field4136[arg1];
        if (var3 == null) {
            var3 = new int[this.field5718.field4138[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 120)
    public final byte[] method2509(int arg0, String arg1, String arg2) {
        field5716++;
        if (!this.method2518(arg0 + 19597)) {
            return null;
        }
        if (arg0 != -19598) {
            method2524(0, 58);
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field5718.field4137.method2104(class139.method977(var4, 118), -1);
        if (this.method2506((byte) -59, var6)) {
            int var7 = this.field5718.field4146[var6].method2104(class139.method977(var5, 115), -1);
            return this.method2520(var6, var7, (byte) -25);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 145)
    public static void method2510(boolean arg0) {
        if (!arg0) {
            method2510(false);
        }
        field5735 = null;
        field5695 = null;
        field5717 = null;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)V", line = 159)
    private final void method2511(int arg0, int arg1) {
        field5729++;
        if (arg0 <= 65) {
            method2512(22, -69, false, -55, (class248) null, 44);
        }
        if (this.field5723) {
            this.field5693[arg1] = this.field5737.method434(0, arg1);
        } else {
            this.field5693[arg1] = class143.method1029(this.field5737.method434(0, arg1), false, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZILtc;I)V", line = 176)
    public static final void method2512(int arg0, int arg1, boolean arg2, int arg3, class248 arg4, int arg5) {
        field5733++;
        if (arg0 != -29521 || class194.field2821 >= 50 || arg4 == null || arg4.field3693 == null || arg4.field3693.length <= arg3 || arg4.field3693[arg3] == null) {
            return;
        }
        int var6 = arg4.field3693[arg3][0];
        int var7 = var6 & 0x1F;
        int var8 = (var6 & 0xFD) >> 5;
        int var9 = var6 >> 8;
        if (arg4.field3693[arg3].length > 1) {
            int var10 = (int) (Math.random() * (double) arg4.field3693[arg3].length);
            if (var10 > 0) {
                var9 = arg4.field3693[arg3][var10];
            }
        }
        if (var7 == 0) {
            if (arg2) {
                class67.method548(var9, 0, 255, (byte) 27, var8);
            }
        } else if (class207.field3035 != 0) {
            class186.field2668[class194.field2821] = var9;
            class300.field4489[class194.field2821] = var8;
            int var11 = (arg5 - 64) / 128;
            class214.field3141[class194.field2821] = 0;
            class276.field4188[class194.field2821] = null;
            int var12 = (arg1 - 64) / 128;
            class344.field5322[class194.field2821] = 255;
            class225.field3396[class194.field2821] = (var12 << 16) + (var11 << 8) + var7;
            class194.field2821++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(BI)[B", line = 236)
    public final byte[] method2513(byte arg0, int arg1) {
        field5705++;
        if (!this.method2518(arg0 ^ 0x53)) {
            return null;
        } else if (this.field5718.field4145.length == 1) {
            return this.method2520(0, arg1, (byte) -25);
        } else if (arg0 != -84) {
            return (byte[]) null;
        } else if (!this.method2506((byte) -59, arg1)) {
            return null;
        } else if (this.field5718.field4145[arg1] == 1) {
            return this.method2520(arg1, 0, (byte) -25);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(BI)Z", line = 270)
    public final boolean method2514(byte arg0, int arg1) {
        field5724++;
        if (!this.method2518(-1)) {
            return false;
        }
        if (arg0 < 6) {
            this.method2508(68, -3);
        }
        if (this.field5718.field4145.length == 1) {
            return this.method2536(-19052, arg1, 0);
        } else if (!this.method2506((byte) -59, arg1)) {
            return false;
        } else if (this.field5718.field4145[arg1] == 1) {
            return this.method2536(-19052, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Z", line = 299)
    public final boolean method2515(int arg0) {
        if (arg0 <= 98) {
            return true;
        }
        field5694++;
        if (!this.method2518(-1)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field5718.field4130.length; var3++) {
            int var4 = this.field5718.field4130[var3];
            if (this.field5693[var4] == null) {
                this.method2511(120, var4);
                if (this.field5693[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 336)
    public final boolean method2516(byte arg0, String arg1) {
        field5731++;
        if (!this.method2518(-1)) {
            return false;
        }
        if (arg0 < 55) {
            this.method2511(110, -47);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field5718.field4137.method2104(class139.method977(var3, 127), -1);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)V", line = 357)
    public final void method2517(int arg0, int arg1) {
        field5715++;
        if (!this.method2506((byte) -59, arg1)) {
            return;
        }
        if (this.field5706 != null) {
            this.field5706[arg1] = null;
        }
        if (arg0 != 0) {
            this.field5693 = (Object[]) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Z", line = 377)
    private final boolean method2518(int arg0) {
        if (arg0 != -1) {
            this.field5711 = true;
        }
        field5692++;
        if (this.field5718 == null) {
            this.field5718 = this.field5737.method432(-1242);
            if (this.field5718 == null) {
                return false;
            }
            this.field5706 = new Object[this.field5718.field4144][];
            this.field5693 = new Object[this.field5718.field4144];
        }
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(BI)I", line = 400)
    public final int method2519(byte arg0, int arg1) {
        int var3 = 105 / ((arg0 - 37) / 32);
        field5714++;
        if (this.method2518(-1)) {
            int var4 = this.field5718.field4137.method2104(arg1, -1);
            return this.method2506((byte) -59, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)[B", line = 419)
    public final byte[] method2520(int arg0, int arg1, byte arg2) {
        if (arg2 != -25) {
            this.method2525(85, 12, 53, (int[]) null);
        }
        field5699++;
        return this.method2525(arg1, arg0, 1, (int[]) null);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 432)
    public static final String method2521(int arg0, byte arg1) {
        field5722++;
        if (arg1 != -80) {
            field5735 = (class57) null;
        }
        return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIB)[B", line = 447)
    public final byte[] method2522(int arg0, int arg1, byte arg2) {
        field5728++;
        if (!this.method2527((byte) 117, arg0, arg1)) {
            return null;
        }
        if (this.field5706[arg1] == null || this.field5706[arg1][arg0] == null) {
            boolean var4 = this.method2542((int[]) null, arg1, -52);
            if (!var4) {
                this.method2511(78, arg1);
                boolean var5 = this.method2542((int[]) null, arg1, 60);
                if (!var5) {
                    return null;
                }
            }
        }
        int var6 = 51 / ((-arg2 - 66) / 42);
        return class99.method778(this.field5706[arg1][arg0], false, 2);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I", line = 479)
    public final int method2523(int arg0) {
        field5700++;
        if (!this.method2518(-1)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field5693.length; var4++) {
            if (this.field5718.field4138[var4] > 0) {
                var3 += this.method2507(arg0 ^ 0x7C, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)I", line = 515)
    public static final int method2524(int arg0, int arg1) {
        field5719++;
        double var2 = (double) ((arg1 & 0xFF76F9) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFF4) >> 8) / 256.0D;
        double var6 = var2;
        if (var2 > var4) {
            var6 = var4;
        }
        if (arg0 != 7100) {
            method2543(-9, 18);
        }
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        if (var8 < var6) {
            var6 = var8;
        }
        double var10 = 0.0D;
        double var12 = var2;
        if (var2 < var4) {
            var12 = var4;
        }
        if (var8 > var12) {
            var12 = var8;
        }
        double var14 = 0.0D;
        double var16 = (var6 + var12) / 2.0D;
        if (var6 != var12) {
            if (var2 == var12) {
                var10 = (var4 - var8) / (var12 - var6);
            } else if (var4 == var12) {
                var10 = (var8 - var2) / (var12 - var6) + 2.0D;
            } else if (var8 == var12) {
                var10 = (var2 - var4) / (var12 - var6) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var12 - var6) / (var6 + var12);
            }
            if (var16 >= 0.5D) {
                var14 = (var12 - var6) / (2.0D - var12 - var6);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var19 = (int) (var16 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var19 > 243) {
            var18 >>= 0x4;
        } else if (var19 > 217) {
            var18 >>= 0x3;
        } else if (var19 > 192) {
            var18 >>= 0x2;
        } else if (var19 > 179) {
            var18 >>= 0x1;
        }
        double var20 = var10 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        return (var22 >> 2 << 10) - (-(var18 >> 5 << 7) - (var19 >> 1));
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[I)[B", line = 621)
    public final byte[] method2525(int arg0, int arg1, int arg2, int[] arg3) {
        field5709++;
        if (arg2 != 1) {
            field5735 = (class57) null;
        }
        if (!this.method2527((byte) -117, arg0, arg1)) {
            return null;
        }
        if (this.field5706[arg1] == null || this.field5706[arg1][arg0] == null) {
            boolean var5 = this.method2542(arg3, arg1, -112);
            if (!var5) {
                this.method2511(80, arg1);
                boolean var6 = this.method2542(arg3, arg1, arg2 + 118);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class99.method778(this.field5706[arg1][arg0], false, 2);
        if (this.field5711) {
            this.field5706[arg1][arg0] = null;
            if (this.field5718.field4145[arg1] == 1) {
                this.field5706[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I", line = 667)
    public final int method2526(byte arg0) {
        field5701++;
        if (arg0 <= 45) {
            return -19;
        } else if (this.method2518(-1)) {
            return this.field5718.field4145.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)Z", line = 682)
    private final boolean method2527(byte arg0, int arg1, int arg2) {
        field5696++;
        if (!this.method2518(-1)) {
            return false;
        }
        int var4 = -62 % ((arg0 - 32) / 55);
        if (arg2 >= 0 && arg1 >= 0 && this.field5718.field4145.length > arg2 && this.field5718.field4145[arg2] > arg1) {
            return true;
        } else if (class143.field2067) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lgi;BLid;)V", line = 705)
    public static final void method2528(class287 arg0, byte arg1, class200 arg2) {
        class234 var3 = arg2.method1453((byte) 116);
        field5736++;
        if (var3 == null) {
            return;
        }
        int var4 = var3.field3715;
        if (var3.field3715 < var3.field3716) {
            var4 = var3.field3716;
        }
        int var5 = arg0.field4341;
        int var6 = arg0.field4347;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (arg2.field2920 != null) {
            var9 = class229.field3473.method183(arg2.field2920, (int[]) null, class219.field3270);
            for (int var10 = 0; var10 < var9; var10++) {
                String var11 = class219.field3270[var10];
                if (var10 < var9 - 1) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class50.field759.method158(var11);
                if (var7 < var12) {
                    var7 = var12;
                }
            }
            var8 = (var9 - 1) * class50.field759.method159() + (class50.field759.method162() / 2);
        }
        int var13 = arg0.field4341;
        int var14 = arg0.field4347 - (var8 / 2);
        int var15 = -2;
        if (arg1 != -93) {
            method2538((byte) 77, (int[]) null, -96, 70, (int[]) null);
        }
        int var16 = -2;
        int var17 = -2;
        int var18 = -2;
        if (var5 < class105.field1515 + var4) {
            var5 = class105.field1515 + var4;
            var13 = class105.field1515 + var4 / 2 + 5 - (-(var7 / 2) - var4);
        } else if (var5 > (class105.field1518 - var4)) {
            var5 = class105.field1518 - var4;
            var13 = class105.field1518 - (var4 / 2) - var4 - (var7 / 2) - 5;
        }
        if ((class105.field1514 + var4) > var6) {
            var6 = class105.field1514 + var4;
            var14 = var4 + (var4 / 2 + class105.field1514 + class50.field759.method159());
        } else if (var6 > class105.field1511 - var4) {
            var6 = class105.field1511 - var4;
            var14 = class105.field1511 - var4 - var4 / 2 - var8;
        }
        int var19 = var4 >> 1;
        int var20 = (int) ((Math.atan2((double) (var5 - arg0.field4341), (double) (var6 - arg0.field4347)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var3.method1748(var3.field3719 << 3, var3.field3713 << 3, (var5 << 4) + var19, (var6 << 4) + var19, var20, 4096);
        if (arg2.field2920 != null) {
            var15 = var14 + (-class50.field759.method162() - 3);
            var18 = var9 * class50.field759.method159() + var15;
            var16 = var13 - (var7 / 2 + 5);
            var17 = var16 - (-var7 - 10);
            if (arg2.field2934 != 0) {
                class44.method315(var16, var15, var17 - var16, -var15 + var18, arg2.field2934, arg2.field2934 >>> 24);
            }
            if (arg2.field2918 != 0) {
                class44.method314(var16, var15, var17 - var16, -var15 + var18, arg2.field2918, arg2.field2918 >>> 24);
            }
            for (int var21 = 0; var21 < var9; var21++) {
                String var22 = class219.field3270[var21];
                if ((var9 - 1) > var21) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class50.field759.method161(var22, var13, var14, arg2.field2931, true);
                var14 += class50.field759.method159();
            }
        }
        if (var5 - var19 >= class56.field815 || class56.field815 >= var5 + var19 || class165.field2353 <= var6 - var19 || class165.field2353 >= var6 + var19 && class56.field815 <= var16 || class56.field815 >= var17 || var15 >= class165.field2353 || class165.field2353 >= var18) {
            return;
        }
        if (arg2.field2910[4] != null) {
            class261.method1920((short) 1012, arg2.field2910[4], -1, 0, arg2.field2929, -2, 0, (long) arg0.field4350);
        }
        if (arg2.field2910[3] != null) {
            class261.method1920((short) 1009, arg2.field2910[3], -1, 0, arg2.field2929, -2, 0, (long) arg0.field4350);
        }
        if (arg2.field2910[2] != null) {
            class261.method1920((short) 1005, arg2.field2910[2], -1, 0, arg2.field2929, arg1 ^ 0x5D, 0, (long) arg0.field4350);
        }
        if (arg2.field2910[1] != null) {
            class261.method1920((short) 1011, arg2.field2910[1], -1, 0, arg2.field2929, -2, 0, (long) arg0.field4350);
        }
        if (arg2.field2910[0] != null) {
            class261.method1920((short) 1010, arg2.field2910[0], -1, 0, arg2.field2929, -2, 0, (long) arg0.field4350);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Z", line = 858)
    public static final boolean method2529(int arg0) {
        field5720++;
        if (arg0 >= -28) {
            return true;
        }
        try {
            return class173.method1216(109);
        } catch (IOException var5) {
            class312.method2183(40);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class54.field788 + "," + class20.field319 + "," + class194.field2820 + " - " + class358.field5481 + "," + (class1.field55.field5186[0] + class272.field4123) + "," + (class1.field55.field5162[0] + class202.field2968) + " - ";
            for (int var4 = 0; class358.field5481 > var4 && var4 < 50; var4++) {
                var3 = var3 + class83.field1194.field2718[var4] + ",";
            }
            class343.method2402(var3, var6, -2);
            class302.method2131((byte) -118);
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z", line = 895)
    public final boolean method2530(String arg0, String arg1, boolean arg2) {
        field5732++;
        if (!this.method2518(-1)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field5718.field4137.method2104(class139.method977(var4, 117), -1);
        if (arg2) {
            this.method2518(-106);
        }
        if (this.method2506((byte) -59, var6)) {
            int var7 = this.field5718.field4146[var6].method2104(class139.method977(var5, 122), -1);
            return this.method2536(-19052, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZI)V", line = 918)
    public final void method2531(boolean arg0, boolean arg1, int arg2) {
        field5738++;
        if (!this.method2518(arg2)) {
            return;
        }
        if (arg0) {
            this.field5718.field4137 = null;
            this.field5718.field4152 = null;
        }
        if (arg1) {
            this.field5718.field4146 = null;
            this.field5718.field4143 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)Z", line = 945)
    public final boolean method2532(boolean arg0, int arg1) {
        field5712++;
        if (!this.method2506((byte) -59, arg1)) {
            return false;
        }
        if (arg0) {
            this.method2536(-73, 114, 119);
        }
        if (this.field5693[arg1] == null) {
            this.method2511(102, arg1);
            return this.field5693[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(BLjava/lang/String;)V", line = 971)
    public final void method2533(byte arg0, String arg1) {
        int var3 = 18 % ((54 - arg0) / 55);
        field5698++;
        if (this.method2518(-1)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field5718.field4137.method2104(class139.method977(var4, 126), -1);
            this.method2535(var5, 110);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V", line = 994)
    public static final void method2534() {
        for (int var0 = 0; var0 < class352.field5421; var0++) {
            class180 var1 = class344.field5330[var0];
            class265.method1963(var1);
            class344.field5330[var0] = null;
        }
        class352.field5421 = 0;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(II)V", line = 1008)
    private final void method2535(int arg0, int arg1) {
        this.field5737.method433((byte) -65, arg0);
        field5697++;
        if (arg1 <= 106) {
            this.field5711 = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z", line = 1023)
    public final boolean method2536(int arg0, int arg1, int arg2) {
        field5704++;
        if (!this.method2527((byte) -92, arg1, arg2)) {
            return false;
        } else if (this.field5706[arg2] != null && this.field5706[arg2][arg1] != null) {
            return true;
        } else if (this.field5693[arg2] == null) {
            this.method2511(arg0 + 19130, arg2);
            if (this.field5693[arg2] == null) {
                return arg0 == -19052 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 1048)
    public final void method2537(byte arg0) {
        if (this.field5706 != null) {
            for (int var2 = 0; var2 < this.field5706.length; var2++) {
                this.field5706[var2] = null;
            }
        }
        field5702++;
        if (arg0 > -118) {
            field5735 = (class57) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B[III[I)V", line = 1072)
    public static final void method2538(byte arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 != -21) {
            field5735 = (class57) null;
        }
        field5734++;
        if (arg2 <= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg3;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (((var9 & 0x1) + var7) > arg4[var9]) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg1[arg2] = arg1[var6];
        arg1[var6] = var8;
        method2538((byte) -21, arg1, var6 - 1, arg3, arg4);
        method2538((byte) -21, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZI)I", line = 1126)
    public final int method2539(boolean arg0, int arg1) {
        field5713++;
        if (!arg0) {
            this.method2509(124, (String) null, (String) null);
        }
        return this.method2506((byte) -59, arg1) ? this.field5718.field4145[arg1] : 0;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)I", line = 1141)
    public final int method2540(byte arg0) {
        field5726++;
        if (arg0 != -94) {
            method2512(-69, 46, false, -114, (class248) null, 45);
        }
        if (!this.method2518(-1)) {
            throw new IllegalStateException("");
        }
        return this.field5718.field4131;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 1156)
    public final boolean method2541(int arg0, String arg1) {
        if (arg0 != -30281) {
            return true;
        }
        field5707++;
        if (this.method2518(-1)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field5718.field4137.method2104(class139.method977(var3, 118), arg0 ^ 0x7648);
            return this.method2532(false, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([III)Z", line = 1178)
    private final boolean method2542(int[] arg0, int arg1, int arg2) {
        field5739++;
        if (!this.method2506((byte) -59, arg1)) {
            return false;
        } else if (this.field5693[arg1] == null) {
            return false;
        } else {
            int var4 = this.field5718.field4138[arg1];
            int[] var5 = this.field5718.field4136[arg1];
            if (this.field5706[arg1] == null) {
                this.field5706[arg1] = new Object[this.field5718.field4145[arg1]];
            }
            Object[] var6 = this.field5706[arg1];
            boolean var7 = true;
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class99.method778(this.field5693[arg1], true, 2);
                class190 var11 = new class190(var10);
                var11.method1326(var11.field2718.length, 5, arg0, (byte) -86);
            } else {
                var10 = class99.method778(this.field5693[arg1], false, 2);
            }
            byte[] var12;
            try {
                var12 = class260.method1907(var10, -101);
                int var13 = -45 / ((arg2 - 25) / 35);
            } catch (RuntimeException var32) {
                throw class229.method1710(var32, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class22.method131(var10.length, var10, -80) + "," + class22.method131(var10.length - 2, var10, 123) + "," + this.field5718.field4140[arg1] + "," + this.field5718.field4131);
            }
            if (this.field5723) {
                this.field5693[arg1] = null;
            }
            if (var4 > 1) {
                int var15 = var12.length;
                int var33 = var15 - 1;
                int var16 = var12[var33] & 0xFF;
                int var17 = var33 - var16 * 4 * var4;
                class190 var18 = new class190(var12);
                var18.field2776 = var17;
                int[] var19 = new int[var4];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        if (var5 == null) {
                        }
                        var21 += var18.method1371(-4);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                int var25 = 0;
                var18.field2776 = var17;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var18.method1371(-4);
                        class84.method684(var12, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field5711) {
                        var6[var30] = var23[var29];
                    } else {
                        var6[var30] = class143.method1029(var23[var29], false, (byte) 121);
                    }
                }
            } else {
                int var31;
                if (var5 == null) {
                    var31 = 0;
                } else {
                    var31 = var5[0];
                }
                if (this.field5711) {
                    var6[var31] = var12;
                } else {
                    var6[var31] = class143.method1029(var12, false, (byte) 114);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(II)V", line = 1369)
    public static final void method2543(int arg0, int arg1) {
        field5691++;
        class326.field4898.method464(3398, arg0);
        int var2 = -15 % ((-arg1 - 20) / 38);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILjava/lang/String;)I", line = 1382)
    public final int method2544(int arg0, String arg1) {
        field5708++;
        if (!this.method2518(-1)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != 1311165251) {
            method2512(13, 3, true, 88, (class248) null, 46);
        }
        int var4 = this.field5718.field4137.method2104(class139.method977(var3, 115), -1);
        return this.method2507(-19, var4);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lfl;ZZ)V", line = 1404)
    public class361(class52 arg0, boolean arg1, boolean arg2) {
        this.field5723 = arg1;
        this.field5711 = arg2;
        this.field5737 = arg0;
    }
}
