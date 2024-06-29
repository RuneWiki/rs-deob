import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class131 extends class28 {

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field2379 = -1;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Ls;")
    public static class194 field2375 = new class194(128);

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field2386 = -1;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "Lqe;")
    public static class179 field2388 = class206.method1380("0(U", (byte) -127);

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "Lpc;")
    public static class166 field2387;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "Lee;")
    public static class49 field2384;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Leh;")
    public static class52 field2382;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "Leh;")
    public static class52 field2389;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
    public int[] field2368;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "[I")
    private int[] field2373;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "[Lqe;")
    private class179[] field2378;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "[[I")
    private int[][] field2380;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static void method832(int arg0) {
        field2387 = null;
        field2375 = null;
        if (arg0 != 1) {
            field2388 = null;
        }
        field2382 = null;
        field2388 = null;
        field2384 = null;
        field2389 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLra;)V")
    public final void method833(byte arg0, class185 arg1) {
        while (true) {
            int var3 = arg1.method1243(3);
            if (var3 == 0) {
                field2383++;
                if (arg0 >= -29) {
                    this.method840(null, 75, (byte) -49);
                    return;
                }
                return;
            }
            this.method840(arg1, var3, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)I")
    public final int method834(int arg0) {
        if (arg0 != -21868) {
            this.method838(76);
        }
        field2374++;
        return this.field2373 == null ? 0 : this.field2373.length;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lbc;")
    public static final class15 method835(byte arg0, int arg1) {
        field2377++;
        if (arg0 != -20) {
            return null;
        }
        class15 var2 = (class15) class11.field295.method1299((byte) -124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field958.method342(class4.method27(arg1, (byte) -91), class7.method48((byte) -118, arg1), (byte) -43);
        class15 var4 = new class15();
        var4.field414 = arg1;
        if (var3 != null) {
            var4.method114(-3243, new class185(var3));
        }
        var4.method117(arg0 ^ 0xFFFFFF8C);
        if (var4.field431 != -1) {
            var4.method115(-20261, method835((byte) -20, var4.field370), method835((byte) -20, var4.field431));
        }
        if (var4.field409 != -1) {
            var4.method112(method835((byte) -20, var4.field409), (byte) -114, method835((byte) -20, var4.field426));
        }
        if (!class175.field3131 && var4.field408) {
            var4.field417 = 0;
            var4.field392 = null;
            var4.field418 = class116.field2193;
            var4.field375 = false;
            var4.field381 = null;
        }
        class11.field295.method1303(var4, (long) arg1, (byte) 38);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
    public final int method836(int arg0, int arg1, int arg2) {
        field2385++;
        if (arg2 < 123) {
            return 107;
        } else if (this.field2373 == null || arg1 < 0 || this.field2373.length < arg1) {
            return -1;
        } else if (this.field2380[arg1] == null || arg0 < 0 || this.field2380[arg1].length < arg0) {
            return -1;
        } else {
            return this.field2380[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lra;Z)Lqe;")
    public final class179 method837(class185 arg0, boolean arg1) {
        field2372++;
        class179 var3 = class117.method752(80, 0);
        if (this.field2373 != null) {
            for (int var4 = 0; var4 < this.field2373.length; var4++) {
                var3.method1157(this.field2378[var4], (byte) 76);
                var3.method1157(class34.method225(arg0.method1249(class221.field4087[this.field2373[var4]], 100), this.field2380[var4], -2, this.field2373[var4]), (byte) -120);
            }
        }
        var3.method1157(this.field2378[this.field2378.length - 1], (byte) 87);
        return arg1 ? var3.method1150(0) : null;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Lqe;")
    public final class179 method838(int arg0) {
        class179 var2 = class117.method752(80, 0);
        var2.method1157(this.field2378[0], (byte) 81);
        if (arg0 != -20316) {
            method835((byte) -109, 75);
        }
        for (int var3 = 1; var3 < this.field2378.length; var3++) {
            var2.method1157(class191.field3574, (byte) 93);
            var2.method1157(this.field2378[var3], (byte) 98);
        }
        field2370++;
        return var2.method1150(arg0 + 20316);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I")
    public static final int method839(int arg0, int arg1) {
        field2371++;
        int var2 = -127 % ((39 - arg0) / 48);
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lra;IB)V")
    private final void method840(class185 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2378 = arg0.method1242(-105).method1145(60, -11381);
        } else if (arg1 == 2) {
            int var8 = arg0.method1243(3);
            this.field2368 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2368[var9] = arg0.method1252(2);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1243(3);
            this.field2380 = new int[var4][];
            this.field2373 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1252(2);
                this.field2373[var5] = var6;
                this.field2380[var5] = new int[class144.field2628[var6]];
                for (int var7 = 0; var7 < class144.field2628[var6]; var7++) {
                    this.field2380[var5][var7] = arg0.method1252(2);
                }
            }
        }
        int var10 = 40 / ((arg2 - 51) / 62);
        field2381++;
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
    public static final void method841(int arg0) {
        field2391++;
        for (class98 var1 = (class98) class36.field797.method913(arg0 ^ arg0); var1 != null; var1 = (class98) class36.field797.method907(true)) {
            int var2 = var1.field1831;
            if (class152.method976(true, var2)) {
                boolean var3 = true;
                class6[] var4 = class199.field3710[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field108;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1694;
                    class6 var7 = class87.method580(var6, arg0 ^ 0xE1);
                    if (var7 != null) {
                        class139.method880(var7, arg0 ^ 0xF3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lra;[IB)V")
    public final void method842(class185 arg0, int[] arg1, byte arg2) {
        if (arg2 != -18) {
            field2387 = null;
        }
        field2376++;
        if (this.field2373 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2373.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class13.field320[this.method843((byte) 122, var4)];
            if (var5 > 0) {
                arg0.method1239(var5, (long) arg1[var4], -126);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)I")
    public final int method843(byte arg0, int arg1) {
        field2369++;
        if (this.field2373 == null || arg1 < 0 || this.field2373.length < arg1) {
            return -1;
        } else {
            if (arg0 <= 120) {
                method835((byte) 116, 1);
            }
            return this.field2373[arg1];
        }
    }
}
