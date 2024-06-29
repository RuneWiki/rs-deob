import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class153 {

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[[B")
    public byte[][] field2212 = new byte[6][258];

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[Z")
    public boolean[] field2213 = new boolean[16];

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "[[I")
    public int[][] field2219 = new int[6][258];

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public int field2226 = 0;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
    public int[] field2227 = new int[6];

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[B")
    public byte[] field2216 = new byte[18002];

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "[I")
    public int[] field2229 = new int[257];

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "[[I")
    public int[][] field2242 = new int[6][258];

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "[B")
    public byte[] field2239 = new byte[256];

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "[B")
    public byte[] field2234 = new byte[4096];

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "[B")
    public byte[] field2222 = new byte[18002];

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public int field2218 = 0;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "[Z")
    public boolean[] field2223 = new boolean[256];

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "[I")
    public int[] field2245 = new int[256];

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "[I")
    public int[] field2246 = new int[16];

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "[[I")
    public int[][] field2248 = new int[6][258];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[[B")
    public static byte[][] field2208 = new byte[50][];

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field2237 = -1;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "B")
    public byte field2241;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[B")
    public byte[] field2209;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[B")
    public byte[] field2211;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lve;I)V")
    public static final void method1033(class233 arg0, int arg1) {
        if (arg1 != 0) {
            field2208 = null;
        }
        field2238++;
        class32.field469 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2208 = null;
        if (arg0 != 2) {
            method1033((class233) null, 23);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method1035(byte arg0) {
        class240.field3602.method260(0);
        field2232++;
        int var1 = 51 / ((arg0 - 61) / 43);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static final void method1036(int arg0) {
        field2214++;
        if (class247.field3701 == -1 || class261.field3936 == -1) {
            return;
        }
        int var1 = ((class210.field3022 - class277.field4440) * class93.field1417 >> 16) + class277.field4440;
        float[] var2 = new float[3];
        class93.field1417 += var1;
        if (class93.field1417 < 65535) {
            class80.field1244 = false;
            class55.field840 = false;
        } else {
            class93.field1417 = 65535;
            if (class80.field1244) {
                class55.field840 = false;
            } else {
                class55.field840 = true;
            }
            class80.field1244 = true;
        }
        int var3 = class183.field2613 * 2;
        float var4 = (float) class93.field1417 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class74.field1155[class247.field3701][var3][var5] * 3;
            int var22 = (class74.field1155[class247.field3701][var3 + 2][var5] - (class74.field1155[class247.field3701][var3 + 3][var5] - class74.field1155[class247.field3701][var3 + 2][var5])) * 3;
            int var23 = class74.field1155[class247.field3701][var3][var5];
            int var24 = class74.field1155[class247.field3701][var3 + 1][var5] * 3;
            int var25 = var24 - var21;
            int var26 = var21 + var22 - (var24 * 2);
            int var27 = class74.field1155[class247.field3701][var3 + 2][var5] + var24 - var23 - var22;
            var2[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var23;
        }
        int var6 = class111.field1597 * 2;
        class169.field2442 = (int) var2[1] * -1;
        class89.field1355 = (int) var2[0] - (class113.field1615 * 128);
        float[] var7 = new float[3];
        class223.field3341 = (int) var2[arg0] - class95.field1445 * 128;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class74.field1155[class261.field3936][var6][var8] * 3;
            int var15 = class74.field1155[class261.field3936][var6 + 1][var8] * 3;
            int var16 = class74.field1155[class261.field3936][var6][var8];
            int var17 = (class74.field1155[class261.field3936][var6 + 2][var8] + class74.field1155[class261.field3936][var6 - -2][var8] - class74.field1155[class261.field3936][var6 + 3][var8]) * 3;
            int var18 = var14 + var17 - (var15 * 2);
            int var19 = var15 - var14;
            int var20 = class74.field1155[class261.field3936][var6 + 2][var8] + var15 - var16 - var17;
            var7[var8] = (((float) var20 * var4 + (float) var18) * var4 + (float) var19) * var4 + (float) var16;
        }
        float var9 = (var7[1] - var2[1]) * -1.0F;
        float var10 = var7[0] - var2[0];
        float var11 = var7[2] - var2[2];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class132.field1937 = (float) Math.atan2((double) var9, var12);
        class14.field218 = -((float) Math.atan2((double) var10, (double) var11));
        class30.field439 = (int) ((double) class14.field218 * 325.949D) & 0x7FF;
        class146.field2097 = (int) ((double) class132.field1937 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
    public static final void method1037(int arg0) {
        field2247++;
        for (int var1 = 0; var1 < 100; var1++) {
            class21.field278[var1] = true;
        }
        if (arg0 != 26566) {
            method1036(-1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
    public static final void method1038(int arg0, int arg1) {
        field2225++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class25.field342 += arg1 * 128;
        if (class25.field342 > class220.field3254.length) {
            class25.field342 -= class220.field3254.length;
            int var3 = (int) (Math.random() * 12.0D);
            class45.method303(class172.field2463[var3], (byte) -91);
        }
        int var4 = arg1 * 128;
        int var5 = (var2 - arg1) * 128;
        int var6 = 0;
        if (arg0 != 7472) {
            return;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var26 = class191.field2727[var6 + var4] - (class220.field3254[class220.field3254.length - 1 & class25.field342 + var6] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class191.field2727[var6++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class191.field2727[var23 + var24] = 255;
                } else {
                    class191.field2727[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg1); var9++) {
            class264.field3983[var9] = class264.field3983[arg1 + var9];
        }
        for (int var10 = var2 - arg1; var10 < var2; var10++) {
            class264.field3983[var10] = (int) (Math.sin((double) class236.field3559 / 14.0D) * 16.0D + Math.sin((double) class236.field3559 / 15.0D) * 14.0D + Math.sin((double) class236.field3559 / 16.0D) * 12.0D);
            class236.field3559++;
        }
        int var11 = ((class82.field1267 & 0x1) + arg1) / 2;
        class113.field1610 += arg1;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class113.field1610; var12++) {
            int var21 = (int) (Math.random() * 128.0D) + 128;
            int var22 = (int) (Math.random() * 124.0D) + 2;
            class191.field2727[(var21 << 7) + var22] = 192;
        }
        class113.field1610 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var20 + var11 < 128) {
                    var18 += class191.field2727[var20 + var19 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class191.field2727[var20 + var19 - var11 - 1];
                }
                if (var20 >= 0) {
                    class77.field1192[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var11 + var16) {
                    var15 += class77.field1192[var14 + var17 + (var11 * 128)];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class77.field1192[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class191.field2727[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    public static final void method1039(int arg0, int arg1) {
        field2233++;
        if (arg0 != 2) {
            method1037(109);
        }
        class242.field3640.method258(arg1, (byte) 76);
        class181.field2595.method258(arg1, (byte) 101);
    }
}
