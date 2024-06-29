import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class366 {

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "Lpn;")
    public static class49 field5395 = new class49(59, -1);

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "Lvg;")
    public static class56 field5398 = new class56(64);

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field5402 = 0;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "Lpn;")
    public static class49 field5401 = new class49(24, 7);

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public int field5385;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field5391;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Ljc;")
    public class489 field5384;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "[I")
    public int[] field5383;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "[I")
    public int[] field5386;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
    public int[] field5389;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "[I")
    public int[] field5392;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "[I")
    public int[] field5399;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "[I")
    public int[] field5400;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "[Ljc;")
    public class489[] field5387;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "[[I")
    public int[][] field5393;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "[[I")
    public int[][] field5397;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z[B)V")
    private final void method2330(boolean arg0, byte[] arg1) {
        field5394++;
        class194 var3 = new class194(class183.method1277((byte) -113, arg1));
        int var4 = var3.method1337((byte) 105);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field5390 = 0;
        } else {
            this.field5390 = var3.method1401(-63);
        }
        int var5 = var3.method1337((byte) -123);
        this.field5391 = var3.method1396(-91);
        int var6 = 0;
        this.field5383 = new int[this.field5391];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field5391; var8++) {
            this.field5383[var8] = var6 += var3.method1396(117);
            if (var7 < this.field5383[var8]) {
                var7 = this.field5383[var8];
            }
        }
        this.field5385 = var7 + 1;
        this.field5392 = new int[this.field5385];
        this.field5397 = new int[this.field5385][];
        this.field5399 = new int[this.field5385];
        this.field5389 = new int[this.field5385];
        this.field5400 = new int[this.field5385];
        if (var5 != 0) {
            this.field5386 = new int[this.field5385];
            for (int var9 = 0; var9 < this.field5385; var9++) {
                this.field5386[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5391; var10++) {
                this.field5386[this.field5383[var10]] = var3.method1401(126);
            }
            this.field5384 = new class489(this.field5386);
        }
        if (!arg0) {
            return;
        }
        for (int var11 = 0; var11 < this.field5391; var11++) {
            this.field5400[this.field5383[var11]] = var3.method1401(125);
        }
        for (int var12 = 0; var12 < this.field5391; var12++) {
            this.field5399[this.field5383[var12]] = var3.method1401(-107);
        }
        for (int var13 = 0; var13 < this.field5391; var13++) {
            this.field5389[this.field5383[var13]] = var3.method1396(-121);
        }
        for (int var14 = 0; var14 < this.field5391; var14++) {
            int var21 = this.field5383[var14];
            int var22 = this.field5389[var21];
            int var23 = 0;
            this.field5397[var21] = new int[var22];
            int var24 = -1;
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field5397[var21][var25] = var23 += var3.method1396(-82);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field5392[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field5397[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5393 = new int[var7 + 1][];
        this.field5387 = new class489[var7 + 1];
        for (int var15 = 0; var15 < this.field5391; var15++) {
            int var16 = this.field5383[var15];
            int var17 = this.field5389[var16];
            this.field5393[var16] = new int[this.field5392[var16]];
            for (int var18 = 0; var18 < this.field5392[var16]; var18++) {
                this.field5393[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field5397[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field5397[var16][var19];
                }
                this.field5393[var16][var20] = var3.method1401(-90);
            }
            this.field5387[var16] = new class489(this.field5393[var16]);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ll;IIIIILza;)V")
    public static final void method2331(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class299 arg6) {
        if (class307.field4698 < 100) {
            class482.method2907((byte) -128, arg0, arg6);
        }
        field5396++;
        arg6.method571(arg3, arg4, arg1 + arg3, arg2 + arg4);
        if (class307.field4698 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg3;
            arg6.method506(arg3, arg4, arg1, arg2, -16777216, 0);
            int var9 = arg2 / 2 + arg4 - var7 - 18;
            arg6.method602(var8 - 152, var9, 304, 34, class172.field2663[class286.field4470].getRGB(), 0);
            arg6.method506(var8 - 150, var9 - -2, class307.field4698 * 3, 30, class283.field4419[class286.field4470].getRGB(), 0);
            class441.field6573.method2047(var8, class433.field6431.method1265(class345.field5141, arg5 + 4850), var7 + var9, class521.field7602[class286.field4470].getRGB(), arg5 + 4962, -1);
            return;
        }
        int var10 = class445.field6617 - ((int) ((float) arg1 / class362.field5340));
        int var11 = class274.field4298 + ((int) ((float) arg2 / class362.field5340));
        int var12 = (int) ((float) arg1 / class362.field5340) + class445.field6617;
        class455.field6764 = class445.field6617 - ((int) ((float) arg1 / class362.field5340));
        class63.field1000 = (int) ((float) (arg2 * 2) / class362.field5340);
        int var13 = class274.field4298 - ((int) ((float) arg2 / class362.field5340));
        if (arg5 != -4963) {
            field5401 = null;
        }
        class23.field271 = class274.field4298 - ((int) ((float) arg2 / class362.field5340));
        class374.field5533 = (int) ((float) (arg1 * 2) / class362.field5340);
        class362.method2301(class362.field5350 + var10, class362.field5345 + var11, class362.field5350 + var12, class362.field5345 + var13, arg3, arg4, arg1 + arg3, arg2 - -1 + arg4);
        class362.method2305(arg6);
        class44 var14 = class362.method2296(arg6);
        class71.method615(-124, arg6, var14, 0, 0);
        if (class178.field2722 > 0) {
            class287.field4472--;
            if (class287.field4472 == 0) {
                class178.field2722--;
                class287.field4472 = 20;
            }
        }
        if (!class191.field2931) {
            return;
        }
        int var15 = arg3 + arg1 - 5;
        int var16 = arg2 + arg4 - 8;
        class54.field833.method2050(var15, "Fps:" + class324.field4916, -1, var16, 11308, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class54.field833.method2050(var15, "Mem:" + var18 + "k", -1, var20, 11308, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public static void method2332(int arg0) {
        if (arg0 != -1) {
            method2332(-32);
        }
        field5398 = null;
        field5401 = null;
        field5395 = null;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([BI)V")
    public class366(byte[] arg0, int arg1) {
        this.field5388 = class182.method1274(-116, arg0, arg0.length);
        if (this.field5388 != arg1) {
            throw new RuntimeException();
        }
        this.method2330(true, arg0);
    }
}
