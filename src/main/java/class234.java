import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class234 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    private int field3275 = 32;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Z")
    private boolean field3286 = false;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "J")
    private long field3284 = class681.method3802(-23600);

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "J")
    private long field3300 = 0L;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    private int field3301 = 0;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "[Lsda;")
    private class240[] field3302 = new class240[8];

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    private int field3298 = 0;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    private int field3299 = 0;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "[Lsda;")
    private class240[] field3305 = new class240[8];

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    private int field3307 = 0;

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "J")
    private long field3309 = 0L;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "Z")
    private boolean field3303 = true;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "[J")
    public static long[] field3274 = new long[11];

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field3289 = 1406;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "[Lwo;")
    public static class696[] field3290 = new class696[14];

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field3285 = 52;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "[[J")
    public static long[][] field3291 = new long[8][256];

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3304;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    private int field3297;

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Lsda;")
    private class240 field3287;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "[I")
    public int[] field3293;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var4 ^ var12;
            field3291[0][var0] = class586.method3222(var14, class586.method3222(var6 << 8, class586.method3222(var10 << 16, class586.method3222(class586.method3222(var4 << 32, class586.method3222(var8 << 40, class586.method3222(var4 << 56, var4 << 48))), var12 << 24))));
            for (int var16 = 1; var16 < 8; var16++) {
                field3291[var16][var0] = class586.method3222(field3291[var16 - 1][var0] >>> 8, field3291[var16 - 1][var0] << 56);
            }
        }
        field3274[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field3274[var1] = class260.method1592(class260.method1592(class260.method1592(class396.method2277(field3291[5][var2 + 5], 16711680L), class260.method1592(class260.method1592(class396.method2277(1095216660480L, field3291[3][var2 + 3]), class260.method1592(class260.method1592(class396.method2277(field3291[0][var2], -72057594037927936L), class396.method2277(71776119061217280L, field3291[1][var2 + 1])), class396.method2277(field3291[2][var2 + 2], 280375465082880L))), class396.method2277(4278190080L, field3291[4][var2 + 4]))), class396.method2277(field3291[6][var2 + 6], 65280L)), class396.method2277(field3291[7][var2 + 7], 255L));
        }
        field3304 = new BigInteger("8ac4f0372e6318950e5b1274ec93c649222591c3b844960389523bf85932cd83a356ea148c1a975ad5e79ab11afdd125d9e5ee7d09d88c81acc57bfa71afa058a78710a8c5faa011f07eff60f838180e0cca9960294ee84c8880c636d92a0ea67329e7f89b873c2c3354c3075adf543455195fd37fb01f42696da238ee89dd475a10be4a946323ff7e7ab09ee517746a119cacb6d35009a75863d88c785a9ffaaaa82d13f3406e15635058d7aadb357e387491ef2c484ea8ddc6a66a4f2c4b6b9f861b52299bdca587e4100612f282805e33b4b8a41d69368423688c987ba19370143ae8c597e6de8ee62811b21a68f7fab8077e9b8e78d08ff57e2e9bddbceea4e192cb2bc7430e2476d1726563fe1660cb35aba151e0d8b7a0abcca50299f66b212528b3dcc9e9e785e4319f5ea0b974040d1431046b695b33b9ca21f5b20a3c0e9c168eda537e8a0f7d985c42ee84c723cf4d48637ca556ec98fc32ac635152d4a087faf227e6fe8801e0ca86a9a856128fb1b5da51d6ea863d11e1c6a8b33c1a1fb830bbd7cc2caa870ab9ce65f2a2d6359c9e95e88e76fc2b525dfc023382b4e6d9d15c8beb89dc47e0b4b9f2601523822ec3b17b61b486288f6727459848c37c0fef24fd60de28ce247648d4aaa1753b2224e76c2571949fc3a46c905656b56b9039781f1bb4360529830731bd8ab9d53df904a48cae62d5852fe724bd", 16);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 4)
    public static void method1456(int arg0) {
        field3291 = null;
        field3290 = null;
        field3274 = null;
        field3304 = null;
        if (arg0 != 0) {
            method1465((byte) -39, -50);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZLsda;)V", line = 18)
    private final void method1457(int arg0, boolean arg1, class240 arg2) {
        field3273++;
        int var4 = arg0 >> 5;
        class240 var5 = this.field3302[var4];
        if (!arg1) {
            method1456(21);
        }
        if (var5 == null) {
            this.field3305[var4] = arg2;
        } else {
            var5.field3371 = arg2;
        }
        this.field3302[var4] = arg2;
        arg2.field3372 = arg0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([II)V", line = 46)
    private final void method1458(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class79.field1234) {
            var3 = arg1 << 1;
        }
        class83.method683(arg0, 0, var3);
        this.field3307 -= arg1;
        if (this.field3287 != null && this.field3307 <= 0) {
            this.field3307 += class443.field6071 >> 4;
            class317.method1888(1, this.field3287);
            this.method1457(this.field3287.method660(), true, this.field3287);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class240 var10 = null;
                        class240 var11 = this.field3305[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class589 var12 = var11.field3370;
                                if (var12 == null || var12.field7799 <= var8) {
                                    var11.field3373 = true;
                                    int var13 = var11.method163();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7799 += var13;
                                    }
                                    if (var4 >= this.field3275) {
                                        break label107;
                                    }
                                    class240 var14 = var11.method165();
                                    if (var14 != null) {
                                        int var15 = var11.field3372;
                                        while (var14 != null) {
                                            this.method1457(var15 * var14.method660() >> 8, true, var14);
                                            var14 = var11.method156();
                                        }
                                    }
                                    class240 var16 = var11.field3371;
                                    var11.field3371 = null;
                                    if (var10 == null) {
                                        this.field3305[var7] = var16;
                                    } else {
                                        var10.field3371 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3302[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3371;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class240 var18 = this.field3305[var17];
                this.field3305[var17] = this.field3302[var17] = null;
                while (var18 != null) {
                    class240 var19 = var18.field3371;
                    var18.field3371 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3307 < 0) {
            this.field3307 = 0;
        }
        if (this.field3287 != null) {
            this.field3287.method160(arg0, 0, arg1);
        }
        this.field3284 = class681.method3802(-23600);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZLsda;)V", line = 205)
    public final synchronized void method1459(boolean arg0, class240 arg1) {
        field3283++;
        this.field3287 = arg1;
        if (!arg0) {
            method1456(-107);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "()V", line = 218)
    public void method1143() throws Exception {
        field3279++;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 226)
    public final synchronized void method1460(int arg0) {
        field3294++;
        if (class117.field1995 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class117.field1995.field9852[var3] == this) {
                    class117.field1995.field9852[var3] = null;
                }
                if (class117.field1995.field9852[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class117.field1995.field9853 = true;
                while (class117.field1995.field9848) {
                    class486.method2722(0, 50L);
                }
                class117.field1995 = null;
            }
        }
        if (arg0 != 0) {
            this.field3308 = -115;
        }
        this.method1139();
        this.field3293 = null;
        this.field3286 = true;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 279)
    public final synchronized void method1461(boolean arg0) {
        this.field3303 = true;
        if (arg0) {
            return;
        }
        field3296++;
        try {
            this.method1143();
        } catch (Exception var2) {
            this.method1139();
            this.field3300 = class681.method3802(-23600) + 2000L;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V", line = 300)
    private final void method1462(int arg0, int arg1) {
        field3276++;
        this.field3307 -= arg0;
        if (this.field3307 < 0) {
            this.field3307 = 0;
        }
        int var3 = -34 / ((arg1 - 21) / 58);
        if (this.field3287 != null) {
            this.field3287.method162(arg0);
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V", line = 319)
    public final synchronized void method1463(int arg0) {
        field3280++;
        if (this.field3286) {
            return;
        }
        long var2 = class681.method3802(-23600);
        try {
            if ((this.field3284 + 500000L) < var2) {
                this.field3284 = var2 - 500000L;
            }
            while ((this.field3284 + 5000L) < var2) {
                this.method1462(256, arg0 ^ 0xF311E6E8);
                this.field3284 += (256000 / class443.field6071);
            }
        } catch (Exception var7) {
            this.field3284 = var2;
        }
        if (this.field3293 == null) {
            return;
        }
        try {
            if (this.field3300 != 0L) {
                if (this.field3300 > var2) {
                    return;
                }
                this.method1142(this.field3306);
                this.field3300 = 0L;
                this.field3303 = true;
            }
            int var4 = this.method1141();
            if (arg0 != 216930648) {
                method1464(null, 99, -23, null, -30);
            }
            if (this.field3299 < (this.field3301 - var4)) {
                this.field3299 = this.field3301 - var4;
            }
            int var5 = this.field3308 + this.field3297;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3306) {
                this.field3306 += 1024;
                if (this.field3306 > 16384) {
                    this.field3306 = 16384;
                }
                this.method1139();
                this.method1142(this.field3306);
                var4 = 0;
                this.field3303 = true;
                if (this.field3306 < (var5 + 256)) {
                    var5 = this.field3306 - 256;
                    this.field3297 = var5 - this.field3308;
                }
            }
            while (var5 > var4) {
                this.method1458(this.field3293, 256);
                var4 += 256;
                this.method1140();
            }
            if (this.field3309 < var2) {
                if (this.field3303) {
                    this.field3303 = false;
                } else if (this.field3299 == 0 && this.field3298 == 0) {
                    this.method1139();
                    this.field3300 = var2 + 2000L;
                    return;
                } else {
                    this.field3297 = Math.min(this.field3298, this.field3299);
                    this.field3298 = this.field3299;
                }
                this.field3309 = var2 + 2000L;
                this.field3299 = 0;
            }
            this.field3301 = var4;
        } catch (Exception var6) {
            this.method1139();
            this.field3300 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "()V", line = 438)
    public void method1140() throws Exception {
        field3277++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 449)
    public void method1144(Component arg0) throws Exception {
        field3292++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([III[II)V", line = 457)
    public static final void method1464(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        int var5 = -44 / ((39 - arg4) / 57);
        field3295++;
        if (arg1 >= arg2) {
            return;
        }
        int var6 = (arg1 + arg2) / 2;
        int var7 = arg1;
        int var8 = arg3[var6];
        arg3[var6] = arg3[arg2];
        arg3[arg2] = var8;
        int var9 = arg0[var6];
        arg0[var6] = arg0[arg2];
        arg0[arg2] = var9;
        int var10 = ~var8 == Integer.MIN_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg2; var11++) {
            if (arg3[var11] < ((var11 & var10) + var8)) {
                int var12 = arg3[var11];
                arg3[var11] = arg3[var7];
                arg3[var7] = var12;
                int var13 = arg0[var11];
                arg0[var11] = arg0[var7];
                arg0[var7++] = var13;
            }
        }
        arg3[arg2] = arg3[var7];
        arg3[var7] = var8;
        arg0[arg2] = arg0[var7];
        arg0[var7] = var9;
        method1464(arg0, arg1, var7 - 1, arg3, 117);
        method1464(arg0, var7 + 1, arg2, arg3, 114);
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "()V", line = 521)
    public void method1139() {
        field3282++;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V", line = 533)
    public void method1142(int arg0) throws Exception {
        field3288++;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "()I", line = 605)
    public int method1141() throws Exception {
        field3281++;
        return this.field3306;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V", line = 617)
    public static final void method1465(byte arg0, int arg1) {
        field3278++;
        class382 var2 = class396.method2276(95, 4, arg1);
        if (arg0 <= 19) {
            field3291 = null;
        }
        var2.method2228((byte) -55);
    }
}
