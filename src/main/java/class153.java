import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class153 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field2260 = 2;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field2268 = -1;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field2267 = -1;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field2255 = -1;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public int field2278 = -1;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Z")
    public boolean field2264 = false;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public int field2283 = 99;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Z")
    public boolean field2271 = false;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public int field2286 = -1;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Z")
    public boolean field2257 = false;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Z")
    public boolean field2277 = false;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public int field2289 = 5;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2258 = 0;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[Lhk;")
    public static class59[] field2265 = new class59[128];

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field2279 = 0;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lcn;")
    public class329 field2262;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lrg;")
    public static class420 field2259;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[I")
    public int[] field2254;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "[I")
    private int[] field2274;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "[I")
    public int[] field2275;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "[Z")
    public boolean[] field2281;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "[[I")
    public int[][] field2272;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2259 = null;
        field2265 = null;
        if (arg0 != -1) {
            field2259 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILf;III)Lf;")
    public final class491 method959(int arg0, int arg1, class491 arg2, int arg3, int arg4, int arg5) {
        field2276++;
        int var7 = this.field2275[arg5];
        int var8 = this.field2254[arg5];
        class31 var9 = this.field2262.method2082(-23748, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1292((byte) 1, arg4, true);
        }
        class31 var11 = null;
        if ((this.field2264 || class70.field884) && arg0 != -1 && arg0 < this.field2254.length) {
            int var12 = this.field2254[arg0];
            var11 = this.field2262.method2082(-23748, var12 >> 16);
            arg0 = var12 & 0xFFFF;
        }
        class31 var13 = null;
        class31 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2274 != null) {
            if (this.field2274.length > arg5) {
                var15 = this.field2274[arg5];
                if (var15 != 65535) {
                    var13 = this.field2262.method2082(arg1 - 24004, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2264 || class70.field884) && arg0 != -1 && this.field2274.length > arg0) {
                var16 = this.field2274[arg0];
                if (var16 != 65535) {
                    var14 = this.field2262.method2082(-23748, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2271) {
            arg4 |= 0x200;
        }
        if (var9.method218(14, var10)) {
            arg4 |= 0x80;
        }
        if (arg1 != 256) {
            return null;
        }
        if (var9.method217(arg1 + 65024, var10)) {
            arg4 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method218(14, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method217(65280, var15)) {
                arg4 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method218(14, arg0)) {
                arg4 |= 0x80;
            }
            if (var11.method217(65280, arg0)) {
                arg4 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method218(14, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method217(arg1 + 65024, var16)) {
                arg4 |= 0x100;
            }
        }
        int var17 = arg4 | 0x20;
        class491 var18 = arg2.method1292((byte) 1, var17, true);
        var18.method2885(var10, var9, var7, 0, arg3 - 1, (byte) -59, this.field2271, arg0, var11);
        if (var13 != null) {
            var18.method2885(var15, var13, var7, 0, arg3 - 1, (byte) -59, this.field2271, var16, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static final void method960(int arg0) {
        field2280++;
        class135.field1783.method619(class51.field703, class149.field2234, class490.field6914);
        int var1 = -61 % ((arg0 + 77) / 46);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIBLf;IBI)Lf;")
    public final class491 method961(int arg0, int arg1, int arg2, byte arg3, class491 arg4, int arg5, byte arg6, int arg7) {
        field2266++;
        int var9 = this.field2275[arg7];
        int var10 = this.field2254[arg7];
        class31 var11 = this.field2262.method2082(-23748, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method1292(arg3, arg5, true);
        }
        class31 var13 = null;
        if ((this.field2264 || class70.field884) && arg1 != -1 && this.field2254.length > arg1) {
            int var14 = this.field2254[arg1];
            var13 = this.field2262.method2082(-23748, var14 >> 16);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field2271) {
            arg5 |= 0x200;
        }
        if (var11.method218(14, var12)) {
            arg5 |= 0x80;
        }
        if (var11.method217(65280, var12)) {
            arg5 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method218(14, arg1)) {
                arg5 |= 0x80;
            }
            if (var13.method217(65280, arg1)) {
                arg5 |= 0x100;
            }
        }
        int var15 = arg5 | 0x20;
        int var16 = -59 / ((24 - arg6) / 51);
        class491 var17 = arg4.method1292(arg3, var15, true);
        var17.method2885(var12, var11, var9, arg0, arg2 - 1, (byte) -59, this.field2271, arg1, var13);
        return var17;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Lmd;")
    public static final class351 method962(int arg0, boolean arg1) {
        field2269++;
        class351 var2 = (class351) class424.field5949.method1524(arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class485.field6823.method1257(arg0 & 0x7FFF, 0, 24558);
        } else {
            var3 = class479.field6718.method1257(arg0, 0, 24558);
        }
        class351 var4 = new class351();
        if (var3 != null) {
            var4.method2192(new class276(var3), (byte) 106);
        }
        if (arg0 >= 32768) {
            var4.method2196(107);
        }
        class424.field5949.method1522((long) arg0, arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static final void method963(byte arg0) {
        if (class483.field6806 < 1024.0F) {
            class483.field6806 = 1024.0F;
        }
        if (arg0 != 91) {
            return;
        }
        field2282++;
        while (class157.field2346 >= 16384.0F) {
            class157.field2346 -= 16384.0F;
        }
        if (class483.field6806 > 3072.0F) {
            class483.field6806 = 3072.0F;
        }
        while (class157.field2346 < 0.0F) {
            class157.field2346 += 16384.0F;
        }
        int var1 = class353.field5098 >> 7;
        int var2 = class480.field6734 >> 7;
        int var3 = class132.method835(class480.field6734, class29.field394, class353.field5098, 2002);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class29.field394;
                    if (var7 < 3 && class28.method207(var5, -25548, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class184.field2718.field5395 != null && class184.field2718.field5395[var7] != null) {
                        var8 = (class184.field2718.field5395[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class53.field725[var7].method1218(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class487.field6867 < var10) {
            class487.field6867 += (var10 - class487.field6867) / 24;
        } else if (class487.field6867 > var10) {
            class487.field6867 += (var10 - class487.field6867) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lrp;II)V")
    private final void method964(class276 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var13 = arg0.method1729(65280);
            this.field2275 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2275[var14] = arg0.method1729(65280);
            }
            this.field2254 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2254[var15] = arg0.method1729(65280);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2254[var16] = (arg0.method1729(65280) << 16) + this.field2254[var16];
            }
        } else if (arg1 == 2) {
            this.field2255 = arg0.method1729(65280);
        } else if (arg1 == 3) {
            this.field2281 = new boolean[256];
            int var4 = arg0.method1701(arg2 ^ 0xFFFFA5AF);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2281[arg0.method1701(-23121)] = true;
            }
        } else if (arg1 == 4) {
            this.field2257 = true;
        } else if (arg1 == 5) {
            this.field2289 = arg0.method1701(arg2 ^ 0xFFFFA5AF);
        } else if (arg1 == 6) {
            this.field2267 = arg0.method1729(65280);
        } else if (arg1 == 7) {
            this.field2268 = arg0.method1729(arg2 ^ 0xFF00);
        } else if (arg1 == 8) {
            this.field2283 = arg0.method1701(-23121);
        } else if (arg1 == 9) {
            this.field2286 = arg0.method1701(arg2 - 23121);
        } else if (arg1 == 10) {
            this.field2278 = arg0.method1701(arg2 - 23121);
        } else if (arg1 == 11) {
            this.field2260 = arg0.method1701(-23121);
        } else if (arg1 == 12) {
            int var10 = arg0.method1701(-23121);
            this.field2274 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2274[var11] = arg0.method1729(65280);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2274[var12] = (arg0.method1729(arg2 + 65280) << 16) + this.field2274[var12];
            }
        } else if (arg1 == 13) {
            int var6 = arg0.method1729(65280);
            this.field2272 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1701(-23121);
                if (var8 > 0) {
                    this.field2272[var7] = new int[var8];
                    this.field2272[var7][0] = arg0.method1748(false);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field2272[var7][var9] = arg0.method1729(65280);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2271 = true;
        } else if (arg1 == 15) {
            this.field2264 = true;
        } else if (arg1 == 16) {
            this.field2277 = true;
        }
        field2273++;
        if (arg2 != 0) {
            method963((byte) 25);
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public final void method965(int arg0) {
        if (this.field2278 == -1) {
            if (this.field2281 == null) {
                this.field2278 = 0;
            } else {
                this.field2278 = 2;
            }
        }
        field2287++;
        if (~this.field2286 != arg0) {
            return;
        }
        if (this.field2281 == null) {
            this.field2286 = 0;
        } else {
            this.field2286 = 2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIII)I")
    public final int method966(boolean arg0, int arg1, int arg2, int arg3) {
        field2256++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2254[arg3];
        if (arg1 != -384337424) {
            this.method968((class276) null, (byte) 68);
        }
        class31 var8 = null;
        class31 var9 = this.field2262.method2082(-23748, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2264 || class70.field884) && arg2 != -1 && arg2 < this.field2254.length) {
            int var11 = this.field2254[arg2];
            var8 = this.field2262.method2082(-23748, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2271) {
            var5 |= 0x200;
        }
        if (var9.method218(14, var10)) {
            var5 |= 0x80;
        }
        if (var9.method217(arg1 + 384402704, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method218(14, var6)) {
                var5 |= 0x80;
            }
            if (var8.method217(arg1 ^ 0xE91786F0, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field2274 != null && arg0) {
            if (this.field2274.length > arg3) {
                int var12 = this.field2274[arg3];
                if (var12 != 65535) {
                    class31 var13 = this.field2262.method2082(-23748, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method218(14, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method217(65280, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field2264 || class70.field884) && arg2 != -1 && this.field2274.length > arg2) {
                int var15 = this.field2274[arg2];
                if (var15 != 65535) {
                    class31 var16 = this.field2262.method2082(arg1 ^ 0x16E8DACC, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method218(14, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method217(65280, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILrp;)Lro;")
    public static final class2 method967(int arg0, class276 arg1) {
        if (arg0 == 0) {
            field2261++;
            return new class2(arg1.method1702(-35), arg1.method1702(-108), arg1.method1702(arg0 - 79), arg1.method1702(-106), arg1.method1748(false), arg1.method1748(false), arg1.method1701(-23121));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lrp;B)V")
    public final void method968(class276 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1701(arg1 ^ 0xFFFFA59C);
            if (var3 == 0) {
                if (arg1 != 51) {
                    return;
                }
                field2285++;
                return;
            }
            this.method964(arg0, var3, 0);
        }
    }

    static {
        new class326("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }
}
