import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class214 extends class35 {

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[I")
    public int[] field3427;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "[I")
    public int[] field3430;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[[I")
    public int[][] field3426;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[Z")
    public boolean[] field3436;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Z")
    public static boolean field3434 = false;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lib;")
    public static class312 field3428;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V", line = 10)
    public static void method1439(byte arg0) {
        int var1 = -39 % ((-arg0 - 50) / 61);
        field3428 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;Lag;)I", line = 19)
    public static final int method1440(int arg0, String arg1, class202 arg2) {
        int var3 = -104 / ((47 - arg0) / 50);
        int var4 = arg2.field3249;
        byte[] var5 = class294.method1972(arg1, false);
        arg2.method1337(-27196, var5.length);
        arg2.field3249 += class281.field4322.method1933(var5.length, 0, (byte) 35, var5, arg2.field3249, arg2.field3273);
        field3431++;
        return arg2.field3249 - var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V", line = 38)
    public static final void method1441(int arg0, int arg1) {
        field3433++;
        int var2 = class38.field742;
        if (arg1 >= -10) {
            method1441(-89, 50);
        }
        int var3 = class132.field2232;
        int var4 = class283.field4381;
        int var5 = class43.field820;
        int var6 = class131.field2213;
        int var7 = (int) class120.field2090;
        if (class168.field2692 / 256 > var7) {
            var7 = class168.field2692 / 256;
        }
        if (class39.field747[4] && var7 < class293.field4480[4] + 128) {
            var7 = class293.field4480[4] + 128;
        }
        int var8 = (int) class95.field1709 + class301.field4556 & 0x7FF;
        class94.method630(class325.method2250(class66.field1265.field1872, 22771, class289.field4438, class66.field1265.field1869) - 50, var7, (var7 * 3) + 600, class221.field3503, var8, arg0, class230.field3630, (byte) -57);
        if (class38.field742 == var2 && class132.field2232 == var3 && class283.field4381 == var4 && class43.field820 == var5 && class131.field2213 == var6) {
            class135.field2271 = 1;
            return;
        }
        class178.field2870 = 10;
        class288.field4435 = 10;
        if (class283.field4381 > var4) {
            var4 += (class283.field4381 - var4) * class178.field2870 / 1000 + class288.field4435;
            if (class283.field4381 > var4) {
                class283.field4381 = var4;
            }
        }
        if (var3 < class132.field2232) {
            var3 += (class132.field2232 - var3) * class178.field2870 / 1000 + class288.field4435;
            if (var3 < class132.field2232) {
                class132.field2232 = var3;
            }
        }
        class247.field3821 = 10;
        class196.field3155 = 10;
        if (var4 > class283.field4381) {
            int var9 = var4 - (class288.field4435 + ((var4 - class283.field4381) * class178.field2870 / 1000));
            if (var9 > class283.field4381) {
                class283.field4381 = var9;
            }
        }
        if (var5 < class43.field820) {
            var5 += class247.field3821 + ((class43.field820 - var5) * class196.field3155 / 1000);
            if (class43.field820 > var5) {
                class43.field820 = var5;
            }
        }
        if (var3 > class132.field2232) {
            int var10 = var3 - ((var3 - class132.field2232) * class178.field2870 / 1000 + class288.field4435);
            if (var10 > class132.field2232) {
                class132.field2232 = var10;
            }
        }
        if (var5 > class43.field820) {
            int var11 = var5 - ((var5 - class43.field820) * class196.field3155 / 1000 + class247.field3821);
            if (class43.field820 < var11) {
                class43.field820 = var11;
            }
        }
        int var12 = class131.field2213 - var6;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            int var13 = class196.field3155 * var12 / 1000 + class247.field3821 + var6;
            var6 = var13 & 0x7FF;
        }
        if (var12 < 0) {
            int var14 = var6 - (-var12 * class196.field3155 / 1000 + class247.field3821);
            var6 = var14 & 0x7FF;
        }
        int var15 = class131.field2213 - var6;
        if (class38.field742 > var2) {
            var2 += (class38.field742 - var2) * class178.field2870 / 1000 + class288.field4435;
            if (class38.field742 > var2) {
                class38.field742 = var2;
            }
        }
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var2 > class38.field742) {
            int var16 = var2 - ((var2 - class38.field742) * class178.field2870 / 1000 + class288.field4435);
            if (var16 > class38.field742) {
                class38.field742 = var16;
            }
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 >= 0 || var12 <= 0 || var15 > 0 && var12 < 0) {
            class131.field2213 = var6;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(I[B)V", line = 190)
    public class214(int arg0, byte[] arg1) {
        this.field3429 = arg0;
        class202 var3 = new class202(arg1);
        this.field3432 = var3.method1317((byte) -109);
        this.field3427 = new int[this.field3432];
        this.field3430 = new int[this.field3432];
        this.field3426 = new int[this.field3432][];
        this.field3436 = new boolean[this.field3432];
        for (int var4 = 0; var4 < this.field3432; var4++) {
            this.field3430[var4] = var3.method1317((byte) -102);
        }
        for (int var5 = 0; var5 < this.field3432; var5++) {
            this.field3436[var5] = var3.method1317((byte) -101) == 1;
        }
        for (int var6 = 0; var6 < this.field3432; var6++) {
            this.field3427[var6] = var3.method1315(14289);
        }
        for (int var7 = 0; var7 < this.field3432; var7++) {
            this.field3426[var7] = new int[var3.method1317((byte) -97)];
        }
        for (int var8 = 0; var8 < this.field3432; var8++) {
            for (int var9 = 0; var9 < this.field3426[var8].length; var9++) {
                this.field3426[var8][var9] = var3.method1317((byte) -106);
            }
        }
    }
}
