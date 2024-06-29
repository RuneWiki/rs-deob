import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class161 extends class90 {

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "[[I")
    public int[][] field3260;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    public int[] field3252;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[Z")
    private boolean[] field3254;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "[I")
    public static int[] field3258 = new int[100];

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lrf;")
    public static class163 field3253 = class53.method392(-90, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field3259 = 0;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "[S")
    public static short[] field3262;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field3258 = null;
        if (arg0 == 4) {
            field3253 = null;
            field3262 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V")
    public static final void method1006(long arg0, int arg1) {
        field3261++;
        if (arg0 == 0L) {
            return;
        }
        if (class186.field3717 >= 100 && class155.field3215 != 1 || class186.field3717 >= 200) {
            class43.method267((byte) -65, class79.field1612, class36.field728, 0);
            return;
        }
        class163 var3 = class116.method802(arg0, true).method1031(false);
        int var4 = -73 % (arg1 / 51);
        for (int var5 = 0; var5 < class186.field3717; var5++) {
            if (class86.field1887[var5] == arg0) {
                class43.method267((byte) -89, class180.method1216(new class163[] { var3, class70.field1472 }, false), class36.field728, 0);
                return;
            }
        }
        for (int var6 = 0; var6 < class26.field479; var6++) {
            if (class130.field2713[var6] == arg0) {
                class43.method267((byte) -77, class180.method1216(new class163[] { class154.field3194, var3, class119.field2519 }, false), class36.field728, 0);
                return;
            }
        }
        if (var3.method1043(99, class56.field1136.field758)) {
            class43.method267((byte) -93, class17.field297, class36.field728, 0);
            return;
        }
        class87.field1891[class186.field3717] = var3;
        class86.field1887[class186.field3717] = arg0;
        class43.field882++;
        class115.field2449[class186.field3717] = 0;
        class52.field1091[class186.field3717] = 0;
        class109.field2286 = class62.field1325;
        class186.field3717++;
        class141.field2896.method326(104, 165);
        class141.field2896.method373((byte) -52, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    public static final void method1007() {
        int var0 = class85.field1863[class209.field4079];
        class142[] var1 = class85.field1864[class209.field4079];
        class143.field2946 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class142 var3 = var1[var2];
            if (var3.field2925 == 1) {
                int var4 = var3.field2919 + class34.field669 - class79.field1608;
                if (var4 >= 0 && var4 <= class34.field669 + class34.field669) {
                    int var5 = var3.field2924 + class34.field669 - class12.field234;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field2934 + class34.field669 - class12.field234;
                    if (var6 > class34.field669 + class34.field669) {
                        var6 = class34.field669 + class34.field669;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class150.field3109[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class154.field3198 - var3.field2914;
                        if (var8 > 32) {
                            var3.field2927 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field2927 = 2;
                            var8 = -var8;
                        }
                        var3.field2912 = (var3.field2917 - class116.field2466 << 8) / var8;
                        var3.field2923 = (var3.field2916 - class116.field2466 << 8) / var8;
                        var3.field2935 = (var3.field2922 - class208.field4046 << 8) / var8;
                        var3.field2933 = (var3.field2928 - class208.field4046 << 8) / var8;
                        class15.field257[class143.field2946++] = var3;
                    }
                }
            } else if (var3.field2925 == 2) {
                int var9 = var3.field2924 + class34.field669 - class12.field234;
                if (var9 >= 0 && var9 <= class34.field669 + class34.field669) {
                    int var10 = var3.field2919 + class34.field669 - class79.field1608;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field2911 + class34.field669 - class79.field1608;
                    if (var11 > class34.field669 + class34.field669) {
                        var11 = class34.field669 + class34.field669;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class150.field3109[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class116.field2466 - var3.field2917;
                        if (var13 > 32) {
                            var3.field2927 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field2927 = 4;
                            var13 = -var13;
                        }
                        var3.field2930 = (var3.field2914 - class154.field3198 << 8) / var13;
                        var3.field2920 = (var3.field2931 - class154.field3198 << 8) / var13;
                        var3.field2935 = (var3.field2922 - class208.field4046 << 8) / var13;
                        var3.field2933 = (var3.field2928 - class208.field4046 << 8) / var13;
                        class15.field257[class143.field2946++] = var3;
                    }
                }
            } else if (var3.field2925 == 4) {
                int var14 = var3.field2922 - class208.field4046;
                if (var14 > 128) {
                    int var15 = var3.field2924 + class34.field669 - class12.field234;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field2934 + class34.field669 - class12.field234;
                    if (var16 > class34.field669 + class34.field669) {
                        var16 = class34.field669 + class34.field669;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field2919 + class34.field669 - class79.field1608;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field2911 + class34.field669 - class79.field1608;
                        if (var18 > class34.field669 + class34.field669) {
                            var18 = class34.field669 + class34.field669;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class150.field3109[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field2927 = 5;
                            var3.field2930 = (var3.field2914 - class154.field3198 << 8) / var14;
                            var3.field2920 = (var3.field2931 - class154.field3198 << 8) / var14;
                            var3.field2912 = (var3.field2917 - class116.field2466 << 8) / var14;
                            var3.field2923 = (var3.field2916 - class116.field2466 << 8) / var14;
                            class15.field257[class143.field2946++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public static final void method1008(byte arg0) {
        class141 var1 = class131.field2735;
        synchronized (class131.field2735) {
            class117.field2476 = class177.field3573;
            class22.field394 = class58.field1169;
            int var2 = 99 % ((arg0 + 24) / 35);
            class75.field1555 = class108.field2245;
            class68.field1424 = class179.field3599;
            class193.field3796 = class139.field2860;
            class16.field283 = class4.field72;
            class128.field2625 = class89.field1933;
            class179.field3599 = 0;
        }
        field3250++;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
    public static final void method1009(byte arg0) {
        if (arg0 != 71) {
            return;
        }
        for (class87 var1 = (class87) class138.field2847.method468(1); var1 != null; var1 = (class87) class138.field2847.method471(arg0 - 5055)) {
            int var2 = var1.field1903;
            if (class114.method781(var2, (byte) -123)) {
                boolean var3 = true;
                class84[] var4 = class84.field1798[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1853;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1950;
                    class84 var7 = class138.method907(var6, false);
                    if (var7 != null) {
                        class194.method1295((byte) -118, var7);
                    }
                }
            }
        }
        field3255++;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I[B)V")
    public class161(int arg0, byte[] arg1) {
        this.field3256 = arg0;
        class52 var3 = new class52(arg1);
        this.field3251 = var3.method344(255);
        this.field3260 = new int[this.field3251][];
        this.field3252 = new int[this.field3251];
        this.field3254 = new boolean[this.field3251];
        for (int var4 = 0; var4 < this.field3251; var4++) {
            this.field3252[var4] = var3.method344(255);
        }
        for (int var5 = 0; var5 < this.field3251; var5++) {
            this.field3254[var5] = var3.method344(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3251; var6++) {
            this.field3260[var6] = new int[var3.method344(255)];
        }
        for (int var7 = 0; var7 < this.field3251; var7++) {
            for (int var8 = 0; var8 < this.field3260[var7].length; var8++) {
                this.field3260[var7][var8] = var3.method344(255);
            }
        }
    }
}
