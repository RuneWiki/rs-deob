import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class270 implements Runnable {

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lbu;")
    private class19 field3830 = new class19();

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field3831 = new Thread(this);

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lvp;")
    public static class162 field3826 = null;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[J")
    public static long[] field3823 = new long[11];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[[J")
    public static long[][] field3828 = new long[8][256];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field3834;

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
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var4 ^ var12;
            field3828[0][var0] = class334.method2034(var14, class334.method2034(class334.method2034(var10 << 16, class334.method2034(class334.method2034(class334.method2034(class334.method2034(var4 << 56, var4 << 48), var8 << 40), var4 << 32), var12 << 24)), var6 << 8));
            for (int var16 = 1; var16 < 8; var16++) {
                field3828[var16][var0] = class334.method2034(field3828[var16 - 1][var0] >>> 8, field3828[var16 - 1][var0] << 56);
            }
        }
        field3823[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field3823[var1] = class68.method534(class68.method534(class68.method534(class68.method534(class209.method1384(field3828[4][var2 + 4], 4278190080L), class68.method534(class209.method1384(1095216660480L, field3828[3][var2 + 3]), class68.method534(class68.method534(class209.method1384(-72057594037927936L, field3828[0][var2]), class209.method1384(71776119061217280L, field3828[1][var2 + 1])), class209.method1384(field3828[2][var2 + 2], 280375465082880L)))), class209.method1384(16711680L, field3828[5][var2 + 5])), class209.method1384(field3828[6][var2 + 6], 65280L)), class209.method1384(field3828[7][var2 + 7], 255L));
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 4)
    public final void method1700(byte arg0) {
        field3829++;
        int var2 = -55 % ((-arg0 - 27) / 59);
        if (this.field3831 == null) {
            return;
        }
        this.method1701(new class417(), 5359);
        try {
            this.field3831.join();
        } catch (InterruptedException var3) {
        }
        this.field3831 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lkp;I)V", line = 24)
    private final void method1701(class417 arg0, int arg1) {
        field3824++;
        class19 var3 = this.field3830;
        synchronized (this.field3830) {
            this.field3830.method131(arg0, 0);
            if (arg1 != 5359) {
                field3828 = null;
            }
            this.field3830.notify();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 38)
    public static void method1702(int arg0) {
        field3828 = null;
        field3826 = null;
        field3823 = null;
        if (arg0 != 250) {
            method1703(117, -63, 46, 0, 110, -16, -104, -121, -33);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V", line = 53)
    public static final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class408.method2398(arg1, arg5, arg3, arg4, arg7, -5984, 0, arg6, arg8, arg2);
        if (arg0 != -1) {
            field3834 = -82;
        }
        field3832++;
    }

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V", line = 64)
    public final void run() {
        field3833++;
        while (true) {
            class19 var1 = this.field3830;
            class635 var3;
            synchronized (this.field3830) {
                class417 var2;
                for (var2 = this.field3830.method128(936); var2 == null; var2 = this.field3830.method128(936)) {
                    try {
                        this.field3830.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class635)) {
                    return;
                }
                var3 = (class635) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field9295).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field9292 = var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 115)
    public class270() {
        this.field3831.setDaemon(true);
        this.field3831.start();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 127)
    public static final void method1704(String arg0, boolean arg1, boolean arg2) {
        field3822++;
        class146.field2116.field4501 = 1;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        if (!arg2) {
            field3834 = -106;
        }
        for (int var6 = 0; var6 < class150.field2242.field9095; var6++) {
            class540 var9 = class150.field2242.method3606((byte) 71, var6);
            if ((!arg1 || var9.field8096) && var9.field8101 == -1 && var9.field8059 == -1 && var9.field8034 == 0 && var9.field8105.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class161.field2385 = -1;
                    class372.field5115 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class514.field7342 = 0;
        class372.field5115 = var4;
        class161.field2385 = var5;
        String[] var7 = new String[class161.field2385];
        for (int var8 = 0; var8 < class161.field2385; var8++) {
            var7[var8] = class150.field2242.method3606((byte) -102, var4[var8]).field8105;
        }
        class293.method1805(var7, (byte) -127, class372.field5115);
        class146.field2116.method1969(false);
        class146.field2116.field4501 = 2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/String;)Lpn;", line = 200)
    public final class635 method1705(int arg0, String arg1) {
        field3827++;
        if (this.field3831 == null) {
            throw new IllegalStateException("");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("");
        } else {
            class635 var3 = new class635(arg1);
            if (arg0 <= 98) {
                this.method1700((byte) 94);
            }
            this.method1701(var3, 5359);
            return var3;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIII)V", line = 221)
    public static final void method1706(boolean arg0, int arg1, int arg2, int arg3) {
        field3825++;
        int var4 = class56.field668.field6850 * arg2 >> 8;
        if (arg1 == -1 && !class568.field8385) {
            class577.method3435((byte) -108);
        } else if (arg1 != -1 && (class625.field9210 != arg1 || !class523.method3083((byte) -115)) && var4 != 0 && !class568.field8385) {
            class60.method393(17502, var4, false, arg1, arg3, 0, class333.field4619);
        }
        if (arg0) {
            class625.field9210 = arg1;
        }
    }
}
