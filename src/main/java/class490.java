import java.awt.Dimension;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class490 extends OutputStream {

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[J")
    public static long[] field6299 = new long[11];

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field6298 = 4;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[[J")
    public static long[][] field6300 = new long[8][256];

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Luw;")
    public static class208 field6302;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
    public static int[] field6305;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "[[S")
    public static short[][] field6303;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static final void method2735(int arg0) {
        if (arg0 <= 5) {
            method2736(22);
        }
        class121.field1624.method1938((byte) -45);
        field6301++;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static final void method2736(int arg0) {
        if (arg0 == 0) {
            if (class514.field6556 == 2) {
                class166.field2206[0].method3836(class520.field6609[0]);
                class166.field2206[1].method3836(class520.field6609[1]);
            } else if (class514.field6556 == 3) {
                class166.field2206[0].method3836(class520.field6609[0]);
                class166.field2206[1].method3836(class520.field6609[1]);
                class166.field2206[2].method3836(class520.field6609[2]);
            } else {
                class166.field2206[0].method3836(class520.field6609[0]);
                class166.field2206[1].method3836(class520.field6609[1]);
                class166.field2206[2].method3836(class520.field6609[2]);
                class166.field2206[3].method3836(class520.field6609[3]);
            }
        } else if (arg0 == 1) {
            if (class514.field6556 == 2) {
                class166.field2206[0].method3836(class520.field6609[2]);
            } else if (class514.field6556 == 3) {
                class166.field2206[0].method3836(class520.field6609[3]);
                class166.field2206[1].method3836(class520.field6609[4]);
            } else {
                class166.field2206[0].method3836(class520.field6609[4]);
                class166.field2206[1].method3836(class520.field6609[5]);
                class166.field2206[2].method3836(class520.field6609[6]);
            }
        } else if (arg0 == 2) {
            if (class514.field6556 == 2) {
                class166.field2206[0].method3836(class520.field6609[3]);
                return;
            }
            if (class514.field6556 == 3) {
                class166.field2206[0].method3836(class520.field6609[5]);
                return;
            }
            class166.field2206[0].method3836(class520.field6609[7]);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)I")
    public static final int method2737(int arg0, int arg1, int arg2) {
        field6296++;
        if (class20.field190 == -1) {
            return 1;
        }
        if (arg1 != class485.field6252.field6949.method2402(false)) {
            class123.method730(true, 19892, arg1, class659.field8557.method3589(class496.field6338, -22395));
            if (class485.field6252.field6949.method2402(false) != arg1) {
                return -1;
            }
        }
        try {
            Dimension var3 = class678.field8763.getSize();
            class530.method2903(class659.field8557.method3589(class496.field6338, -22395), class576.field7320, class225.field3058, true, -1, class411.field5453);
            class615 var4 = class50.method321((byte) -89, 0, class20.field190, class470.field6128);
            long var5 = class502.method2786(-7114);
            class576.field7320.method957();
            class129.field1724.method449(0, class686.field8834, 0);
            if (arg2 >= -41) {
                method2735(-67);
            }
            class576.field7320.method991(class129.field1724);
            class576.field7320.method967(var3.width / 2, var3.height / 2, 512, 512);
            class576.field7320.method946(1.0F);
            class576.field7320.method997(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class299 var7 = class576.field7320.method930(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class576.field7320.method907(0);
                class576.field7320.method937();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class5.field57.method449((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class722.field9480), 0, (var10 + 1) * class722.field9480);
                        var7.method1297(class5.field57, null, 0);
                        var8++;
                        if ((long) arg0 <= class502.method2786(-7114) - var5) {
                            break label45;
                        }
                    }
                }
            }
            class576.field7320.method943();
            long var12 = (long) (var8 * 1000) / (class502.method2786(-7114) - var5);
            class576.field7320.method907(0);
            class576.field7320.method937();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static void method2738(byte arg0) {
        field6302 = null;
        int var1 = 57 / ((5 - arg0) / 63);
        field6300 = null;
        field6299 = null;
        field6305 = null;
        field6303 = null;
    }

    @OriginalMember(owner = "client!jp", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6295++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ[B)V")
    public static final void method2739(int arg0, boolean arg1, byte[] arg2) {
        field6297++;
        if (class756.field10308 == null) {
            class756.field10308 = new class234(20000);
        }
        class756.field10308.method1530(arg0, arg2.length, arg2, arg0 ^ 0x6C);
        if (!arg1) {
            return;
        }
        class696.method3762(class756.field10308.field3193, arg0 ^ 0x31);
        class21.field199 = new class230[class759.field10342];
        int var3 = 0;
        for (int var4 = class157.field2031; var4 <= class410.field5446; var4++) {
            class230 var5 = class190.method1331(var4, 7484);
            if (var5 != null) {
                class21.field199[var3++] = var5;
            }
        }
        class479.field6199 = false;
        class726.field9529 = class502.method2786(-7114);
        class756.field10308 = null;
    }

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
            long var14 = var12 ^ var4;
            field6300[0][var0] = class243.method1596(var14, class243.method1596(var6 << 8, class243.method1596(var10 << 16, class243.method1596(var12 << 24, class243.method1596(class243.method1596(class243.method1596(var4 << 56, var4 << 48), var8 << 40), var4 << 32)))));
            for (int var16 = 1; var16 < 8; var16++) {
                field6300[var16][var0] = class243.method1596(field6300[var16 - 1][var0] >>> 8, field6300[var16 - 1][var0] << 56);
            }
        }
        field6299[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field6299[var1] = class281.method1724(class281.method1724(class235.method1567(65280L, field6300[6][var2 + 6]), class281.method1724(class281.method1724(class235.method1567(field6300[4][var2 + 4], 4278190080L), class281.method1724(class281.method1724(class235.method1567(field6300[2][var2 + 2], 280375465082880L), class281.method1724(class235.method1567(71776119061217280L, field6300[1][var2 + 1]), class235.method1567(field6300[0][var2], -72057594037927936L))), class235.method1567(1095216660480L, field6300[3][var2 + 3]))), class235.method1567(16711680L, field6300[5][var2 + 5]))), class235.method1567(255L, field6300[7][var2 + 7]));
        }
        field6304 = -1;
        field6302 = new class208(108, -1);
        field6305 = new int[25];
    }
}
