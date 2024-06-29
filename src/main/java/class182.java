import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class182 extends class137 {

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public int field3029;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "[[I")
    public int[][] field3026;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "[Z")
    public boolean[] field3018;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
    public int[] field3022;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "[I")
    public int[] field3023;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Z")
    public static boolean field3019 = false;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3021;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "[[S")
    public static short[][] field3024;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
    public static final void method1285() {
        class11.field213 = 0;
        label191: for (int var0 = 0; var0 < class28.field512; var0++) {
            class52 var1 = class248.field3935[var0];
            if (class58.field833 != null) {
                for (int var2 = 0; var2 < class58.field833.length; var2++) {
                    if (class58.field833[var2] != -1000000 && (var1.field757 <= class58.field833[var2] || var1.field753 <= class58.field833[var2]) && (var1.field750 <= class237.field3726[var2] || var1.field748 <= class237.field3726[var2]) && (var1.field750 >= class75.field1199[var2] || var1.field748 >= class75.field1199[var2]) && (var1.field749 <= class13.field264[var2] || var1.field760 <= class13.field264[var2]) && (var1.field749 >= class263.field4302[var2] || var1.field760 >= class263.field4302[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field764 == 1) {
                int var3 = var1.field755 + class210.field3346 - class270.field4351;
                if (var3 >= 0 && var3 <= class210.field3346 + class210.field3346) {
                    int var4 = var1.field761 + class210.field3346 - class72.field1157;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field768 + class210.field3346 - class72.field1157;
                    if (var5 > class210.field3346 + class210.field3346) {
                        var5 = class210.field3346 + class210.field3346;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class306.field4970[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class35.field567 - var1.field750;
                        if (var7 > 32) {
                            var1.field751 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field751 = 2;
                            var7 = -var7;
                        }
                        var1.field759 = (var1.field749 - class280.field4561 << 8) / var7;
                        var1.field752 = (var1.field760 - class280.field4561 << 8) / var7;
                        var1.field763 = (var1.field757 - class251.field4123 << 8) / var7;
                        var1.field758 = (var1.field753 - class251.field4123 << 8) / var7;
                        class91.field1457[class11.field213++] = var1;
                    }
                }
            } else if (var1.field764 == 2) {
                int var8 = var1.field761 + class210.field3346 - class72.field1157;
                if (var8 >= 0 && var8 <= class210.field3346 + class210.field3346) {
                    int var9 = var1.field755 + class210.field3346 - class270.field4351;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field756 + class210.field3346 - class270.field4351;
                    if (var10 > class210.field3346 + class210.field3346) {
                        var10 = class210.field3346 + class210.field3346;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class306.field4970[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class280.field4561 - var1.field749;
                        if (var12 > 32) {
                            var1.field751 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field751 = 4;
                            var12 = -var12;
                        }
                        var1.field754 = (var1.field750 - class35.field567 << 8) / var12;
                        var1.field769 = (var1.field748 - class35.field567 << 8) / var12;
                        var1.field763 = (var1.field757 - class251.field4123 << 8) / var12;
                        var1.field758 = (var1.field753 - class251.field4123 << 8) / var12;
                        class91.field1457[class11.field213++] = var1;
                    }
                }
            } else if (var1.field764 == 4) {
                int var13 = var1.field757 - class251.field4123;
                if (var13 > 128) {
                    int var14 = var1.field761 + class210.field3346 - class72.field1157;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field768 + class210.field3346 - class72.field1157;
                    if (var15 > class210.field3346 + class210.field3346) {
                        var15 = class210.field3346 + class210.field3346;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field755 + class210.field3346 - class270.field4351;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field756 + class210.field3346 - class270.field4351;
                        if (var17 > class210.field3346 + class210.field3346) {
                            var17 = class210.field3346 + class210.field3346;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class306.field4970[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field751 = 5;
                            var1.field754 = (var1.field750 - class35.field567 << 8) / var13;
                            var1.field769 = (var1.field748 - class35.field567 << 8) / var13;
                            var1.field759 = (var1.field749 - class280.field4561 << 8) / var13;
                            var1.field752 = (var1.field760 - class280.field4561 << 8) / var13;
                            class91.field1457[class11.field213++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public static void method1286(int arg0) {
        if (arg0 != 8) {
            method1289(-78);
        }
        field3024 = null;
        field3021 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1287(String arg0, String arg1, byte arg2, String arg3) {
        int var4 = arg0.indexOf(arg1);
        int var5 = 20 % ((arg2 - 32) / 48);
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg1.length() + var4);
            var4 = arg0.indexOf(arg1, var4 + arg3.length());
        }
        field3025++;
        return arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method1288(int arg0, Random arg1, int arg2) {
        field3030++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (arg0 != 21953) {
            return 123;
        } else if (class143.method982(97, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class170.method1206(var4, 25179, arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I[B)V")
    public class182(int arg0, byte[] arg1) {
        this.field3020 = arg0;
        class274 var3 = new class274(arg1);
        this.field3029 = var3.method1849(255);
        this.field3026 = new int[this.field3029][];
        this.field3018 = new boolean[this.field3029];
        this.field3022 = new int[this.field3029];
        this.field3023 = new int[this.field3029];
        for (int var4 = 0; var4 < this.field3029; var4++) {
            this.field3022[var4] = var3.method1849(255);
        }
        for (int var5 = 0; var5 < this.field3029; var5++) {
            this.field3018[var5] = var3.method1849(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3029; var6++) {
            this.field3023[var6] = var3.method1837(252);
        }
        for (int var7 = 0; var7 < this.field3029; var7++) {
            this.field3026[var7] = new int[var3.method1849(255)];
        }
        for (int var8 = 0; var8 < this.field3029; var8++) {
            for (int var9 = 0; var9 < this.field3026[var8].length; var9++) {
                this.field3026[var8][var9] = var3.method1849(255);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public static final void method1289(int arg0) {
        class68.field1084 = null;
        class169.field2769 = null;
        class48.field702 = null;
        class33.field549 = null;
        class93.field1474 = null;
        class250.field4102 = null;
        class255.field4213 = null;
        if (arg0 > -24) {
            method1285();
        }
        class166.field2750 = null;
        class159.field2599 = null;
        class202.field3280 = null;
        class44.field657 = null;
        field3027++;
        class27.field480 = null;
    }
}
