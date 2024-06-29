import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class392 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Ler;")
    private class54 field5877 = new class54();

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    private int field5879;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    private int field5880;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Lbn;")
    private class256 field5893;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Z")
    public static boolean field5881 = false;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    public static boolean field5887 = false;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lbn;")
    public static class256 field5891 = new class256(8);

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "[I")
    public static int[] field5894 = new int[256];

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[Lth;")
    public static class353[] field5890;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILvh;)Ljava/lang/Object;")
    public final Object method2468(int arg0, class200 arg1) {
        field5892++;
        long var3 = arg1.method853(-54);
        for (class119 var5 = (class119) this.field5893.method1770(-880, var3); var5 != null; var5 = (class119) this.field5893.method1771(false)) {
            if (var5.field1637.method854(arg1, (byte) -65)) {
                Object var7 = var5.method863((byte) 118);
                if (var7 != null) {
                    if (var5.method858((byte) -18)) {
                        class143 var8 = new class143(arg1, var7);
                        this.field5893.method1766(var5.field2539, var8, 51);
                        this.field5877.method363(true, var8);
                        var8.field86 = 0L;
                        var5.method1120(71);
                        var5.method90((byte) -53);
                    } else {
                        this.field5877.method363(true, var5);
                        var5.field86 = 0L;
                    }
                    return var7;
                }
                var5.method1120(-83);
                var5.method90((byte) -53);
                this.field5879++;
            }
        }
        int var6 = 124 % ((-arg0 - 15) / 53);
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvh;ILjava/lang/Object;)V")
    public final void method2469(class200 arg0, int arg1, Object arg2) {
        this.method2471(arg0, (byte) 127);
        field5884++;
        if (this.field5879 == 0) {
            class119 var4 = (class119) this.field5877.method358(0);
            var4.method1120(86);
            var4.method90((byte) -53);
        } else {
            this.field5879--;
        }
        class143 var5 = new class143(arg0, arg2);
        this.field5893.method1766(arg0.method853(-115), var5, arg1 - 125);
        this.field5877.method363(true, var5);
        var5.field86 = (long) arg1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
    public final int method2470(byte arg0) {
        if (arg0 != 87) {
            this.field5880 = -82;
        }
        field5886++;
        return this.field5880;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lvh;B)V")
    private final void method2471(class200 arg0, byte arg1) {
        field5896++;
        long var3 = arg0.method853(-107);
        if (arg1 < 118) {
            return;
        }
        for (class119 var5 = (class119) this.field5893.method1770(-880, var3); var5 != null; var5 = (class119) this.field5893.method1771(false)) {
            if (var5.field1637.method854(arg0, (byte) -65)) {
                var5.method1120(123);
                var5.method90((byte) -53);
                this.field5879++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)Ljg;")
    public static final class186 method2472(byte arg0) {
        field5888++;
        class186 var1 = new class186(38);
        var1.method1312(15, -49);
        var1.method1312(class394.field5905, -77);
        var1.method1312(class39.field497 ? 1 : 0, -121);
        var1.method1312(class216.field3514 ? 1 : 0, -69);
        var1.method1312(class341.field5267 ? 1 : 0, -105);
        var1.method1312(class311.field4905 ? 1 : 0, -119);
        var1.method1312(0, -121);
        var1.method1312(class234.field3903 ? 1 : 0, -31);
        var1.method1312(class256.field4149 ? 1 : 0, -39);
        var1.method1312(class183.field2984 ? 1 : 0, -69);
        var1.method1312(class299.field4755, -33);
        var1.method1312(class377.field5695 ? 1 : 0, -125);
        var1.method1312(class220.field3627 ? 1 : 0, -34);
        var1.method1312(class241.field3987 ? 1 : 0, -101);
        var1.method1312(class86.field1103, -59);
        var1.method1312(class349.field5410 ? 1 : 0, -52);
        var1.method1312(class145.field2283, -78);
        var1.method1312(class232.field3867, -82);
        var1.method1312(class213.field3427, -118);
        var1.method1283(8, class343.field5286);
        var1.method1283(8, class417.field6163);
        var1.method1312(class7.method88(22800), -76);
        var1.method1315(class13.field183, (byte) 27);
        var1.method1312(class317.field4970, -63);
        var1.method1312(field5887 ? 1 : 0, -91);
        var1.method1312(class301.field4772 ? 1 : 0, -40);
        var1.method1312(class386.field5835, -30);
        var1.method1312(class99.field1381 ? 1 : 0, -119);
        var1.method1312(class150.field2338 ? 1 : 0, -93);
        var1.method1312(class137.field2145, -35);
        var1.method1312(class395.field5923 ? 1 : 0, -74);
        var1.method1312(class452.field6579, -79);
        var1.method1312(class183.field2996, -61);
        if (arg0 <= 87) {
            method2474((byte) 80);
        }
        return var1;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)V")
    public final void method2473(byte arg0) {
        if (arg0 != -53) {
            field5890 = null;
        }
        this.field5877.method357((byte) 114);
        field5878++;
        this.field5893.method1764(arg0 ^ 0xFFFFFFB7);
        this.field5879 = this.field5880;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static final void method2474(byte arg0) {
        if (class421.field6216 != null) {
            class421.field6216.method1098((byte) 104);
            class421.field6216 = null;
        }
        field5882++;
        class346.method2261(15);
        class190.method1334();
        for (int var1 = 0; var1 < 4; var1++) {
            class162.field2547[var1].method465(2097152);
        }
        class375.method2396(9712, false);
        System.gc();
        int var2 = -121 % ((arg0 - 50) / 60);
        class250.method1737((byte) 18, 2);
        class241.field3998 = false;
        class160.field2533 = -1;
        class186.method1320(-2097152, true);
        class418.field6195 = 0;
        class236.field3947 = false;
        class444.field6481 = 0;
        class222.field3698 = 0;
        class409.field6048 = 0;
        for (int var3 = 0; var3 < class256.field4144.length; var3++) {
            class256.field4144[var3] = null;
        }
        class397.field5940 = 0;
        class107.field1500 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class216.field3517[var4] = null;
            class430.field6327[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class39.field499[var5] = null;
        }
        class312.field4924.method1764(93);
        class223.method1595(true);
        class160.field2530 = 0;
        class250.method1734(2);
        class312.method2088(false);
        class72.method461(-85);
        class334.method2209(true, (byte) -60);
        try {
            class169.method1180(class63.field822.field4464, "loggedout", false);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public final void method2475(int arg0, int arg1) {
        if (class427.field6293 != null) {
            for (class119 var3 = (class119) this.field5877.method364(0); var3 != null; var3 = (class119) this.field5877.method361(71)) {
                if (var3.method858((byte) -18)) {
                    if (var3.method863((byte) -91) == null) {
                        var3.method1120(arg0 - 107);
                        var3.method90((byte) -53);
                        this.field5879++;
                    }
                } else if ((long) arg1 < ++var3.field86) {
                    class119 var4 = class427.field6293.method2288((byte) 1, var3);
                    this.field5893.method1766(var3.field2539, var4, -104);
                    class56.method366(var4, 0, var3);
                    var3.method1120(-98);
                    var3.method90((byte) -53);
                }
            }
        }
        if (arg0 == 0) {
            field5895++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)I")
    public final int method2476(byte arg0) {
        field5889++;
        int var2 = -27 / ((-arg0 - 7) / 33);
        return this.field5879;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public final void method2477(int arg0) {
        field5883++;
        for (class119 var2 = (class119) this.field5877.method364(0); var2 != null; var2 = (class119) this.field5877.method361(28)) {
            if (var2.method858((byte) -18)) {
                var2.method1120(60);
                var2.method90((byte) -53);
                this.field5879++;
            }
        }
        if (arg0 != -14264) {
            this.method2471((class200) null, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static void method2478(int arg0) {
        field5891 = null;
        int var1 = -21 / ((arg0 - 22) / 61);
        field5894 = null;
        field5890 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class392(int arg0) {
        this.field5879 = arg0;
        this.field5880 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field5893 = new class256(var2);
    }
}
