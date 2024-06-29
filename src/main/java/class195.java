import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class195 extends class270 {

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    private int field3288 = 2048;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    private int field3305 = 0;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "I")
    private int field3306 = 10;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3287 = 0;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lmh;")
    public static class62 field3295 = class201.method1405(true, "zap");

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "Lmh;")
    public static class62 field3290 = class201.method1405(true, "Ablegen");

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lmh;")
    public static class62 field3294 = class201.method1405(true, "");

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field3293 = 0;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "Z")
    public static boolean field3304 = false;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "Lmh;")
    public static class62 field3307 = class201.method1405(true, "http:)4)4");

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lmh;")
    public static class62 field3298 = class201.method1405(true, ":clan:");

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Lga;")
    public static class147 field3286;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "[I")
    private int[] field3289;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "[I")
    private int[] field3297;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 13)
    public static void method1367(int arg0) {
        field3286 = null;
        field3307 = null;
        if (arg0 < 10) {
            field3292 = -42;
        }
        field3295 = null;
        field3290 = null;
        field3294 = null;
        field3298 = null;
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(B)Z", line = 30)
    public static final boolean method1368(byte arg0) {
        field3301++;
        if (arg0 != 39) {
            field3304 = false;
        }
        try {
            return class156.method1152((byte) 127);
        } catch (IOException var5) {
            class194.method1359(122);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class237.field4063 + "," + class70.field1071 + "," + class107.field1735 + " - " + class60.field874 + "," + (class268.field4551.field3828[0] + class120.field2006) + "," + (class268.field4551.field3846[0] + class290.field4936) + " - ";
            for (int var4 = 0; class60.field874 > var4 && var4 < 50; var4++) {
                var3 = var3 + class75.field1223.field1495[var4] + ",";
            }
            class235.method1659(var6, var3, arg0 - 28716);
            class41.method277(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 223)
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIIII)V", line = 70)
    public static final void method1369(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3302++;
        class311.method2118(arg4, arg2, arg4 + arg1, arg2 + arg3);
        class311.method2117(arg4, arg2, arg1, arg3, 0);
        if (arg0 >= -87) {
            field3292 = -124;
        }
        if (class287.field4904 < 100) {
            return;
        }
        if (class218.field3742 == null || class218.field3742.field2207 != arg1 || class218.field3742.field2202 != arg3) {
            class82 var5 = new class82(arg1, arg3);
            class280.method1914(var5.field1363, arg1, arg3);
            class236.method1670(arg1, 0, class184.field2955, 0, arg3, 0, class248.field4219, (byte) -69, 0);
            class218.field3742 = new class257(var5);
            class280.field4795 = null;
        }
        class218.field3742.method304(arg4, arg2);
        int var6 = class244.field4146 * arg1 / class184.field2955 + arg4;
        int var7 = class149.field2353 * arg3 / class248.field4219 + arg2;
        int var8 = class38.field597 * arg1 / class184.field2955;
        int var9 = class131.field2130 * arg3 / class248.field4219;
        class311.method2113(var6, var7, var8, var9, 16711680, 128);
        class311.method2115(var6, var7, var8, var9, 16711680);
        if (class116.field1937 <= 0 || class116.field1937 % 10 >= 5) {
            return;
        }
        for (class119 var10 = (class119) class192.field3223.method334(-18673); var10 != null; var10 = (class119) class192.field3223.method335((byte) 124)) {
            if (class36.field479 == var10.field1998) {
                int var11 = var10.field1986 * arg1 / class184.field2955 + arg4;
                int var12 = var10.field1985 * arg3 / class248.field4219 + arg2;
                class311.method2117(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(B)V", line = 142)
    public final void method231(byte arg0) {
        if (arg0 != 90) {
            this.field3289 = (int[]) null;
        }
        this.method1372(4096);
        field3309++;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(II)V", line = 155)
    public static final void method1370(int arg0, int arg1) {
        if (arg1 != 18201) {
            method1371(-86, -52, -42);
        }
        field3311++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class244.method1709(2);
        } else if (arg0 == 2) {
            class56.method361(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)V", line = 183)
    public static final void method1371(int arg0, int arg1, int arg2) {
        field3303++;
        class24.field275[arg2] = arg1;
        if (arg0 != -26388) {
            field3286 = (class147) null;
        }
        class176 var3 = (class176) class269.field4567.method311((byte) 114, (long) arg2);
        if (var3 == null) {
            class176 var4 = new class176(4611686018427387905L);
            class269.field4567.method309(var4, (long) arg2, arg0 + 26389);
        } else if (var3.field2822 != 4611686018427387905L) {
            var3.field2822 = class293.method1985((byte) -71) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 245)
    private final void method1372(int arg0) {
        this.field3289 = new int[this.field3306 + 1];
        field3310++;
        int var2 = 4096 / this.field3306;
        int var3 = 0;
        this.field3297 = new int[this.field3306 + 1];
        int var4 = this.field3288 * var2 >> 12;
        for (int var5 = 0; var5 < this.field3306; var5++) {
            this.field3289[var5] = var3;
            this.field3297[var5] = var3 + var4;
            var3 += var2;
        }
        this.field3289[this.field3306] = 4096;
        this.field3297[this.field3306] = this.field3297[0] + arg0;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lmi;II)V", line = 286)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3306 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field3288 = arg0.method721(120);
        } else if (arg1 == 2) {
            this.field3305 = arg0.method702(-1);
        }
        int var5 = 52 % ((arg2 + 8) / 53);
        field3296++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Z", line = 318)
    public static final boolean method1373(byte arg0, int arg1) {
        field3308++;
        int var2 = 91 / ((arg0 + 39) / 57);
        if (arg1 < 0) {
            return false;
        }
        int var3 = class286.field4892[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        return var3 == 1001;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I", line = 356)
    public final int[] method6(int arg0, int arg1) {
        field3291++;
        if (arg0 != 18693) {
            this.method6(-86, -32);
        }
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int var4 = class166.field2702[arg1];
            if (this.field3305 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3306; var12++) {
                    if (var4 >= this.field3289[var12] && var4 < this.field3289[var12 + 1]) {
                        if (this.field3297[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class231.method1632(var3, 0, class109.field1770, var11);
            } else {
                for (int var5 = 0; var5 < class109.field1770; var5++) {
                    int var6 = 0;
                    int var7 = class283.field4840[var5];
                    int var8 = this.field3305;
                    if (var8 == 1) {
                        var6 = var7;
                    } else if (var8 == 2) {
                        var6 = (var4 + var7 - 4096 >> 1) + 2048;
                    } else if (var8 == 3) {
                        var6 = (var7 - var4 >> 1) + 2048;
                    }
                    short var9 = 0;
                    for (int var10 = 0; var10 < this.field3306; var10++) {
                        if (this.field3289[var10] <= var6 && this.field3289[var10 + 1] > var6) {
                            if (this.field3297[var10] > var6) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var9;
                }
            }
        }
        return var3;
    }
}
