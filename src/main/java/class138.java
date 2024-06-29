import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class138 {

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lre;")
    private class137 field2284 = new class137();

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lqk;")
    private class1 field2288 = new class1();

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    private int field2290;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field2285;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Leh;")
    private class94 field2286;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Ltl;")
    public static class59 field2269 = class85.method639("Titelbild ge-Offnet)3", 9588);

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[[I")
    public static int[][] field2278 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Ltl;")
    private static class59 field2282 = class85.method639("You can(Wt add yourself to your own ignore list)3", 9588);

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Ltl;")
    private static class59 field2283 = class85.method639("Loading wordpack )2 ", 9588);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Ltl;")
    public static class59 field2275 = field2283;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Ltl;")
    public static class59 field2287 = field2282;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lgb;")
    public static class212 field2280 = new class212(100);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lwe;")
    public static class54 field2272;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[I")
    public static int[] field2274;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1001(int arg0, int arg1) {
        if (arg0 >= -126) {
            field2283 = (class59) null;
        }
        field2279++;
        class130.field2152.method1486(false, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Lhf;", line = 21)
    public final class287 method1002(byte arg0) {
        if (arg0 <= 10) {
            this.method1006(17L, 86);
        }
        field2273++;
        return this.field2286.method693((byte) 106);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 46)
    public static final void method1003(int arg0) {
        int var1 = -22 / ((63 - arg0) / 36);
        field2270++;
        class18.field236.method1765(-1);
        int var2 = class18.field236.method1762((byte) 53, 8);
        if (var2 < class185.field3107) {
            for (int var3 = var2; var3 < class185.field3107; var3++) {
                class38.field583[class21.field282++] = class232.field3816[var3];
            }
        }
        if (var2 > class185.field3107) {
            throw new RuntimeException("gnpov1");
        }
        class185.field3107 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class232.field3816[var4];
            class23 var6 = class23.field311[var5];
            int var7 = class18.field236.method1762((byte) -1, 1);
            if (var7 == 0) {
                class232.field3816[class185.field3107++] = var5;
                var6.field1761 = class30.field420;
            } else {
                int var8 = class18.field236.method1762((byte) 116, 2);
                if (var8 == 0) {
                    class232.field3816[class185.field3107++] = var5;
                    var6.field1761 = class30.field420;
                    class301.field5143[class255.field4242++] = var5;
                } else if (var8 == 1) {
                    class232.field3816[class185.field3107++] = var5;
                    var6.field1761 = class30.field420;
                    int var12 = class18.field236.method1762((byte) 45, 3);
                    var6.method794(var12, -109, false);
                    int var13 = class18.field236.method1762((byte) 78, 1);
                    if (var13 == 1) {
                        class301.field5143[class255.field4242++] = var5;
                    }
                } else if (var8 == 2) {
                    class232.field3816[class185.field3107++] = var5;
                    var6.field1761 = class30.field420;
                    int var9 = class18.field236.method1762((byte) -122, 3);
                    var6.method794(var9, -55, true);
                    int var10 = class18.field236.method1762((byte) 107, 3);
                    var6.method794(var10, -33, true);
                    int var11 = class18.field236.method1762((byte) -111, 1);
                    if (var11 == 1) {
                        class301.field5143[class255.field4242++] = var5;
                    }
                } else if (var8 == 3) {
                    class38.field583[class21.field282++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)Lhf;", line = 147)
    public final class287 method1004(int arg0) {
        if (arg0 < 0) {
            field2269 = (class59) null;
        }
        field2289++;
        return this.field2286.method692(64);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 165)
    public final void method1005(int arg0) {
        this.field2288.method9(true);
        field2277++;
        this.field2286.method690(10);
        int var2 = 93 % ((arg0 - 11) / 39);
        this.field2284 = new class137();
        this.field2290 = this.field2285;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JI)Lre;", line = 179)
    public final class137 method1006(long arg0, int arg1) {
        field2276++;
        if (arg1 != 1) {
            method1010(-63);
        }
        class137 var4 = (class137) this.field2286.method685(arg0, 128);
        if (var4 != null) {
            this.field2288.method6(var4, -73);
        }
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBLtl;)V", line = 221)
    public static final void method1007(int arg0, byte arg1, class59 arg2) {
        field2271++;
        class186 var3 = class67.method561(32, arg0, 2);
        var3.method1380(3293);
        var3.field3113 = arg2;
        if (arg1 != -100) {
            method1007(-1, (byte) -38, (class59) null);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lre;JI)V", line = 242)
    public final void method1008(class137 arg0, long arg1, int arg2) {
        if (this.field2290 == arg2) {
            class137 var5 = this.field2288.method3(arg2);
            var5.method2000(arg2 ^ 0xFFFFFFB5);
            var5.method997(-69);
            if (this.field2284 == var5) {
                class137 var6 = this.field2288.method3(0);
                var6.method2000(119);
                var6.method997(120);
            }
        } else {
            this.field2290--;
        }
        field2281++;
        this.field2286.method694(arg0, (byte) -90, arg1);
        this.field2288.method6(arg0, -42);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZ)V", line = 270)
    public static final void method1009(boolean arg0, boolean arg1) {
        field2268++;
        for (class308 var2 = (class308) class27.field357.method536(2); var2 != null; var2 = (class308) class27.field357.method533(24)) {
            if (var2.field5205 != null) {
                class222.field3596.method369(var2.field5205);
                var2.field5205 = null;
            }
            if (var2.field5225 != null) {
                class222.field3596.method369(var2.field5225);
                var2.field5225 = null;
            }
            var2.method2000(120);
        }
        if (!arg0) {
            method1003(38);
        }
        if (!arg1) {
            return;
        }
        for (class308 var3 = (class308) class130.field2157.method536(2); var3 != null; var3 = (class308) class130.field2157.method533(24)) {
            if (var3.field5205 != null) {
                class222.field3596.method369(var3.field5205);
                var3.field5205 = null;
            }
            var3.method2000(-63);
        }
        for (class308 var4 = (class308) class206.field3365.method692(64); var4 != null; var4 = (class308) class206.field3365.method693((byte) 106)) {
            if (var4.field5205 != null) {
                class222.field3596.method369(var4.field5205);
                var4.field5205 = null;
            }
            var4.method2000(32);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V", line = 375)
    public class138(int arg0) {
        this.field2290 = arg0;
        this.field2285 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2286 = new class94(var2);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 343)
    public static void method1010(int arg0) {
        field2269 = null;
        if (arg0 != -28444) {
            field2278 = (int[][]) ((int[][]) null);
        }
        field2282 = null;
        field2280 = null;
        field2278 = (int[][]) null;
        field2283 = null;
        field2287 = null;
        field2274 = null;
        field2272 = null;
        field2275 = null;
    }
}
