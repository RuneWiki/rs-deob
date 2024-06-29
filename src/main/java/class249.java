import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class249 {

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lmf;")
    public class10 field4488 = new class10();

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[[B")
    public static byte[][] field4487 = new byte[1000][];

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[I")
    public static int[] field4492 = new int[32768];

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lcc;")
    public static class209 field4485 = class95.method669(92, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lcc;")
    public static class209 field4491 = class95.method669(103, "vert:");

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4486 = 0;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "[I")
    public static int[] field4497 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lcc;")
    public static class209 field4498 = class95.method669(99, "<col=40ff00>");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
    public static int[] field4483;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[Lal;")
    public static class231[] field4482;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[[[B")
    public static byte[][][] field4496;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method1726(byte arg0) {
        if (arg0 <= 31) {
            return;
        }
        while (true) {
            class10 var2 = this.field4488.field198;
            if (this.field4488 == var2) {
                field4499++;
                return;
            }
            var2.method89((byte) -102);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method1727(byte arg0) {
        field4492 = null;
        field4491 = null;
        field4483 = null;
        field4497 = null;
        field4487 = null;
        field4498 = null;
        field4485 = null;
        if (arg0 != 110) {
            field4487 = null;
        }
        field4496 = null;
        field4482 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)Lb;")
    public static final class82 method1728(int arg0, boolean arg1) {
        class82 var2 = (class82) class20.field382.method670((byte) -86, (long) arg0);
        field4495++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field589.method353(class277.method1876((byte) -38, arg0), 121, class62.method462(arg0, (byte) -50));
        class82 var4 = new class82();
        var4.field1600 = arg0;
        if (var3 != null) {
            var4.method599(-32220, new class106(var3));
        }
        if (!arg1) {
            method1732((byte) 114);
        }
        var4.method588(128);
        if (var4.field1625 != -1) {
            var4.method579(27145, method1728(var4.field1625, true), method1728(var4.field1619, true));
        }
        if (var4.field1617 != -1) {
            var4.method590(method1728(var4.field1626, true), method1728(var4.field1617, true), (byte) 108);
        }
        if (!class185.field3338 && var4.field1578) {
            var4.field1629 = class211.field3839;
            var4.field1613 = false;
            var4.field1615 = null;
            var4.field1632 = null;
            var4.field1584 = 0;
        }
        class20.field382.method673((long) arg0, -5087, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lmf;B)V")
    public final void method1729(class10 arg0, byte arg1) {
        field4484++;
        if (arg0.field196 != null) {
            arg0.method89((byte) -102);
        }
        arg0.field198 = this.field4488;
        int var3 = -118 / ((2 - arg1) / 57);
        arg0.field196 = this.field4488.field196;
        arg0.field196.field198 = arg0;
        arg0.field198.field196 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBI)V")
    public static final void method1730(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4493++;
        class195 var5 = class178.method1229(arg1, 8, 122);
        if (arg3 < -70) {
            var5.method1338(0);
            var5.field3506 = arg4;
            var5.field3511 = arg2;
            var5.field3503 = arg0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static final void method1731(int arg0) {
        if (!class244.field4418) {
            class219.field3993[0] = class76.field1408;
            class40.field680[0] = 1001;
            class20.field391[0] = class246.field4451;
            if (class103.field1974 != 0) {
                class56.field1161 = class255.field4616;
                class231.field4200 = class93.field1836;
            } else if (class183.field3310 == 0) {
                class231.field4200 = class150.field2735;
                class56.field1161 = class126.field2435;
            } else {
                class56.field1161 = class76.field1413;
                class231.field4200 = class237.field4246;
            }
            class98.field1912 = 1;
        }
        class221.method1556((long) class163.field2968);
        if (class149.field2727 != -1) {
            class223.method1575(class149.field2727, -1);
        }
        field4489++;
        for (int var1 = 0; var1 < class266.field4771; var1++) {
            if (class129.field2476[var1]) {
                class31.field562[var1] = true;
            }
            class47.field917[var1] = class129.field2476[var1];
            class129.field2476[var1] = false;
        }
        class62.field1231 = -1;
        class246.field4466 = null;
        class70.field1330 = null;
        class190.field3443 = arg0;
        class165.field2987 = class163.field2968;
        if (class149.field2727 != -1) {
            class266.field4771 = 0;
            class246.method1717(false, 0, class50.field981, -1, class149.field2727, 0, class25.field442, 0, 0);
        }
        class4.method18();
        class245.method1708(-676534904);
        if (class244.field4418) {
            class58.method447(false);
        } else if (class70.field1330 != null) {
            class6.method65(class70.field1330, class174.field3176, (byte) 100, class204.field3647);
        } else if (class62.field1231 != -1) {
            class6.method65((class42) null, class62.field1231, (byte) 126, class190.field3443);
        }
        if (class13.field251 == 3) {
            for (int var2 = 0; var2 < class266.field4771; var2++) {
                if (class47.field917[var2]) {
                    class4.method20(class45.field900[var2], class163.field2958[var2], class21.field400[var2], class210.field3831[var2], 16711935, 128);
                } else if (class31.field562[var2]) {
                    class4.method20(class45.field900[var2], class163.field2958[var2], class21.field400[var2], class210.field3831[var2], 16711680, 128);
                }
            }
        }
        class60.method453(class223.field4069.field1534, class122.field2402, arg0 ^ 0x74, class223.field4069.field1571, class99.field1937);
        class122.field2402 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class249() {
        this.field4488.field196 = this.field4488;
        this.field4488.field198 = this.field4488;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static final void method1732(byte arg0) {
        field4494++;
        class84.field1677.method287((byte) 125, 63);
        class209.field3762++;
        class97 var1 = (class97) class114.field2288.method1759((byte) 43);
        int var2 = 84 % ((arg0 - 56) / 45);
        while (var1 != null) {
            if (var1.field1888 == 0) {
                class122.method893(var1, 68, true);
            }
            var1 = (class97) class114.field2288.method1767((byte) 41);
        }
        if (class86.field1699 != null) {
            class126.method907(class86.field1699, 0);
            class86.field1699 = null;
        }
    }
}
