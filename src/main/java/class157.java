import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class157 extends class92 {

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
    private int field3179;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "I")
    private int field3177;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
    private int field3187;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lwf;")
    private class205 field3165;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
    private int field3185;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "[Led;")
    public static class43[] field3174 = new class43[8];

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Ltd;")
    public static class176 field3168 = new class176(30);

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "Led;")
    private static class43 field3184 = class191.method1219("Unexpected loginserver response)3", false);

    @OriginalMember(owner = "client!rc", name = "vb", descriptor = "Led;")
    public static class43 field3188 = field3184;

    @OriginalMember(owner = "client!rc", name = "tb", descriptor = "Led;")
    public static class43 field3186 = class191.method1219("", false);

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lbf;")
    public static class17 field3183;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "Ldc;")
    public static class33 field3176;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "Lig;")
    public static class80 field3171;

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lig;")
    public static class80 field3181;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method992(byte arg0) {
        if (class101.field1935[98]) {
            class136.field2823 += (12 - class136.field2823) / 2;
        } else if (class101.field1935[99]) {
            class136.field2823 += (-class136.field2823 - 12) / 2;
        } else {
            class136.field2823 /= 2;
        }
        if (class101.field1935[96]) {
            class167.field3318 += (-class167.field3318 - 24) / 2;
        } else if (class101.field1935[97]) {
            class167.field3318 += (24 - class167.field3318) / 2;
        } else {
            class167.field3318 /= 2;
        }
        class142.field2933 = class167.field3318 / 2 + class142.field2933 & 0x7FF;
        int var1 = class24.field456 + class67.field1348.field2347;
        class88.field1715 += class136.field2823 / 2;
        field3166++;
        int var2 = class67.field1348.field2328 + class48.field978;
        if (class88.field1715 < 128) {
            class88.field1715 = 128;
        }
        if (class88.field1715 > 383) {
            class88.field1715 = 383;
        }
        if (class184.field3628 - var1 < -500 || class184.field3628 - var1 > 500 || class102.field1945 - var2 < -500 || class102.field1945 - var2 > 500) {
            class102.field1945 = var2;
            class184.field3628 = var1;
        }
        if (class102.field1945 != var2) {
            class102.field1945 += (var2 - class102.field1945) / 16;
        }
        if (class184.field3628 != var1) {
            class184.field3628 += (var1 - class184.field3628) / 16;
        }
        int var3 = class184.field3628 >> 7;
        int var4 = class102.field1945 >> 7;
        if (arg0 != -16) {
            field3183 = null;
        }
        int var5 = 0;
        int var6 = class108.method668(class102.field1945, class184.field3628, -127, class93.field1839);
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class93.field1839;
                    if (var9 < 3 && (class15.field232[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class158.field3203[var9][var7][var8];
                    if (var5 < var10) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = var5 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class73.field1433 < var11) {
            class73.field1433 += (var11 - class73.field1433) / 24;
        } else if (var11 < class73.field1433) {
            class73.field1433 += (var11 - class73.field1433) / 80;
        }
    }

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)V")
    public static void method993(int arg0) {
        field3171 = null;
        field3181 = null;
        field3183 = null;
        field3174 = null;
        field3184 = null;
        if (arg0 == 0) {
            field3186 = null;
            field3188 = null;
            field3176 = null;
            field3168 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)Lw;")
    public final class199 method593(int arg0) {
        field3180++;
        if (this.field3165 != null) {
            int var2 = client.field559 - this.field3167;
            if (var2 > 100 && this.field3165.field4006 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field3165.field3991[this.field3185]) {
                            break label51;
                        }
                        var2 -= this.field3165.field3991[this.field3185];
                        this.field3185++;
                    } while (this.field3185 < this.field3165.field3996.length);
                    this.field3185 -= this.field3165.field4006;
                } while (this.field3185 >= 0 && this.field3185 < this.field3165.field3996.length);
                this.field3165 = null;
            }
            this.field3167 = client.field559 - var2;
        }
        class23 var3 = class92.method592(this.field3175, (byte) 63);
        if (var3.field438 != null) {
            var3 = var3.method111(-74);
        }
        if (var3 == null) {
            return null;
        }
        if (arg0 != 6) {
            this.field3178 = 105;
        }
        int var4;
        int var5;
        if (this.field3178 == 1 || this.field3178 == 3) {
            var4 = var3.field423;
            var5 = var3.field424;
        } else {
            var4 = var3.field424;
            var5 = var3.field423;
        }
        int var6 = this.field3170 + (var5 >> 1);
        int var7 = (var4 >> 1) + this.field3187;
        int var8 = (var5 + 1 >> 1) + this.field3170;
        int var9 = this.field3187 + (var4 + 1 >> 1);
        int var10 = (this.field3170 << 7) + (var5 << 6);
        int[][] var11 = class158.field3203[this.field3177];
        int var12 = (this.field3187 << 7) + (var4 << 6);
        int var13 = var11[var6][var7] + var11[var6][var9] + var11[var8][var7] + var11[var8][var9] >> 2;
        return var3.method115(var10, var11, this.field3165, this.field3178, this.field3185, this.field3179, (byte) -111, var13, var12);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLje;I)V")
    public static final void method994(boolean arg0, class87 arg1, int arg2) {
        field3164++;
        if (client.field542 != null) {
            try {
                client.field542.method522(-23002);
            } catch (Exception var8) {
            }
            client.field542 = null;
        }
        client.field542 = arg1;
        class74.method460((byte) -97, arg0);
        if (arg2 != 1) {
            method995(-46);
        }
        class69.field1377 = null;
        class68.field1359 = null;
        class147.field3000.field1727 = 0;
        class128.field2560 = 0;
        while (true) {
            class143 var3 = (class143) class207.field4044.method76(arg2 + 112);
            if (var3 == null) {
                while (true) {
                    class143 var4 = (class143) class137.field2839.method76(45);
                    if (var4 == null) {
                        if (class136.field2831 != 0) {
                            try {
                                class89 var5 = new class89(4);
                                var5.method539(4, 27678);
                                var5.method539(class136.field2831, 27678);
                                var5.method546(false, 0);
                                client.field542.method524(var5.field1769, 4, (byte) -80, 0);
                            } catch (IOException var7) {
                                try {
                                    client.field542.method522(-23002);
                                } catch (Exception var6) {
                                }
                                client.field542 = null;
                                class51.field1024++;
                            }
                        }
                        class182.field3603 = 0;
                        class182.field3611 = class52.method315((byte) -124);
                        return;
                    }
                    class167.field3320.method683(var4, (byte) 108);
                    class126.field2512.method82(42, var4, var4.field1353);
                    class39.field750++;
                    class76.field1502--;
                }
            }
            class50.field1012.method82(-98, var3, var3.field1353);
            class206.field4039--;
            class185.field3653++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "(I)V")
    public static final void method995(int arg0) {
        field3173++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
    public static final void method996(int arg0, int arg1, int arg2, int arg3) {
        field3169++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            class200.field3933 = -1;
            class19.field333 = -1;
            return;
        }
        int var4 = class108.method668(arg1, arg0, -127, class93.field1839) - arg3;
        int var5 = arg1 - class188.field3686;
        int var6 = class135.field2798[class51.field1034];
        int var7 = var4 - class185.field3647;
        int var8 = class135.field2797[class51.field1034];
        int var9 = arg0 - class184.field3617;
        int var10 = class135.field2798[class32.field591];
        int var11 = class135.field2797[class32.field591];
        int var12 = var5 * var11 + var9 * var10 >> 16;
        if (arg2 != 8) {
            method995(74);
        }
        int var13 = var5 * var10 - var9 * var11 >> 16;
        int var15 = var6 * var7 - var8 * var13 >> 16;
        int var16 = var6 * var13 + var7 * var8 >> 16;
        if (var16 >= 50) {
            class19.field333 = (var15 << 9) / var16 + 167;
            class200.field3933 = (var12 << 9) / var16 + 256;
        } else {
            class200.field3933 = -1;
            class19.field333 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(IIIIIIIZLka;)V")
    public class157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class92 arg8) {
        this.field3178 = arg2;
        this.field3170 = arg4;
        this.field3179 = arg1;
        this.field3177 = arg3;
        this.field3175 = arg0;
        this.field3187 = arg5;
        if (arg6 != -1) {
            this.field3165 = class175.method1101(arg6, true);
            this.field3167 = client.field559 - 1;
            this.field3185 = 0;
            if (this.field3165.field3997 == 0 && arg8 != null && arg8 instanceof class157) {
                class157 var10 = (class157) arg8;
                if (this.field3165 == var10.field3165) {
                    this.field3185 = var10.field3185;
                    this.field3167 = var10.field3167;
                    return;
                }
            }
            if (arg7 && this.field3165.field4006 != -1) {
                this.field3185 = (int) (Math.random() * (double) this.field3165.field3996.length);
                this.field3167 -= (int) (Math.random() * (double) this.field3165.field3991[this.field3185]);
                return;
            }
        }
    }
}
