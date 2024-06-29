import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field255 = 0;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "[B")
    public byte[] field268 = new byte[256];

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
    public int[] field258 = new int[257];

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "[B")
    public byte[] field280 = new byte[4096];

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "[[I")
    public int[][] field283 = new int[6][258];

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "[I")
    public int[] field272 = new int[6];

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
    public int[] field261 = new int[256];

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "[Z")
    public boolean[] field269 = new boolean[256];

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[Z")
    public boolean[] field263 = new boolean[16];

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[[B")
    public byte[][] field282 = new byte[6][258];

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "[B")
    public byte[] field285 = new byte[18002];

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public int field286 = 0;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[[I")
    public int[][] field278 = new int[6][258];

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[B")
    public byte[] field259 = new byte[18002];

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "[I")
    public int[] field292 = new int[16];

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "[[I")
    public int[][] field293 = new int[6][258];

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
    public static int[] field262 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Z")
    public static boolean field267 = false;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field276 = -1;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "B")
    public byte field273;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public int field277;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "Ljava/awt/Image;")
    public static Image field289;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[B")
    public byte[] field253;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "[B")
    public byte[] field266;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static final void method115(int arg0) {
        if (class135.field2532 != null) {
            class135.field2532.method1270((byte) 41);
            class135.field2532 = null;
        }
        field291++;
        class153.method1158((byte) 106);
        class168.method1239();
        for (int var1 = 0; var1 < 4; var1++) {
            class79.field1518[var1].method1816(-80);
        }
        client.method1151(arg0 ^ 0xFFFFFFBB);
        System.gc();
        class166.method1230(511, 2);
        class231.field4229 = -1;
        class119.field2251 = false;
        class268.method1846(true, 1);
        class220.field3962 = 0;
        class242.field4441 = 0;
        class83.field1577 = false;
        if (arg0 != -5) {
            method118(102);
        }
        for (int var2 = 0; var2 < class60.field1094.length; var2++) {
            class60.field1094[var2] = null;
        }
        class46.field659 = 0;
        class98.field1856 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class35.field491[var3] = null;
            class28.field398[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class131.field2428[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class32.field437[var5][var6][var7] = null;
                }
            }
        }
        class101.method744(88);
        class228.field4169 = 0;
        class33.method178(arg0 + 17305);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZD)V")
    public static final void method116(boolean arg0, double arg1) {
        if (!arg0) {
            field287 = -15;
        }
        field260++;
        if (class239.field4373 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class251.field4546[var3] = var4 <= 255 ? var4 : 255;
        }
        class239.field4373 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lnc;I)I")
    public static final int method117(class83 arg0, int arg1) {
        field288++;
        int var2 = arg1;
        if (arg0.method612(class140.field2617, -105)) {
            var2 = arg1 + 1;
        }
        if (arg0.method612(class149.field2780, arg1 - 126)) {
            var2++;
        }
        if (arg0.method612(class139.field2604, -49)) {
            var2++;
        }
        if (arg0.method612(class10.field92, arg1 ^ 0xFFFFFFF2)) {
            var2++;
        }
        if (arg0.method612(class246.field4497, -68)) {
            var2++;
        }
        if (arg0.method612(class71.field1390, -94)) {
            var2++;
        }
        if (arg0.method612(class146.field2703, -57)) {
            var2++;
        }
        if (arg0.method612(class177.field3220, arg1 - 116)) {
            var2++;
        }
        if (arg0.method612(class106.field2004, arg1 - 64)) {
            var2++;
        }
        if (arg0.method612(class268.field4762, arg1 ^ 0xFFFFFFB9)) {
            var2++;
        }
        if (arg0.method612(class58.field1059, arg1 - 15)) {
            var2++;
        }
        if (arg0.method612(class159.field2945, -38)) {
            var2++;
        }
        if (arg0.method612(class131.field2433, arg1 ^ 0xFFFFFFDB)) {
            var2++;
        }
        var2++;
        if (arg0.method612(class40.field564, -24)) {
            var2++;
        }
        if (arg0.method612(class146.field2692, -44)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static void method118(int arg0) {
        field262 = null;
        field289 = null;
        if (arg0 < 53) {
            method116(true, -1.1762598663076382D);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZ)V")
    public static final void method119(byte arg0, boolean arg1) {
        if (arg0 != 44) {
            method119((byte) -15, true);
        }
        field264++;
        class151.field2790 = arg1;
        class27.field392 = !class163.method1215(101);
    }
}
