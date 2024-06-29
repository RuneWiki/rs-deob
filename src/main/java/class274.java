import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class274 extends class122 {

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Z")
    public boolean field4542 = true;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "Z")
    public static boolean field4549 = false;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "I")
    public static int field4545 = 0;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "Lpl;")
    public static class186 field4547 = new class186(500);

    @OriginalMember(owner = "client!n", name = "ob", descriptor = "J")
    public static long field4565 = 0L;

    @OriginalMember(owner = "client!n", name = "mb", descriptor = "Lqd;")
    public static class40 field4563 = class147.method1106("Lade Benutzeroberfl-=che )2 ", (byte) -49);

    @OriginalMember(owner = "client!n", name = "nb", descriptor = "[[[B")
    public static byte[][][] field4564 = new byte[4][104][104];

    @OriginalMember(owner = "client!n", name = "pb", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!n", name = "eb", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!n", name = "gb", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!n", name = "db", descriptor = "Lce;")
    public static class239 field4554;

    @OriginalMember(owner = "client!n", name = "lb", descriptor = "Lce;")
    public static class239 field4562;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "[I")
    public int[] field4541;

    @OriginalMember(owner = "client!n", name = "X", descriptor = "[I")
    private int[] field4548;

    @OriginalMember(owner = "client!n", name = "ib", descriptor = "[Lqd;")
    private class40[] field4559;

    @OriginalMember(owner = "client!n", name = "hb", descriptor = "[[I")
    private int[][] field4558;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)I", line = 4)
    public final int method1896(int arg0, int arg1) {
        field4546++;
        if (this.field4548 == null || arg1 < 0 || arg1 > this.field4548.length) {
            return -1;
        } else {
            if (arg0 != -9848) {
                method1900(-66, 0);
            }
            return this.field4548[arg1];
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsd;B)Lqd;", line = 21)
    public final class40 method1897(class26 arg0, byte arg1) {
        class40 var3 = class29.method274((byte) -118, 80);
        if (this.field4548 != null) {
            for (int var4 = 0; var4 < this.field4548.length; var4++) {
                var3.method334(this.field4559[var4], false);
                var3.method334(class165.method1245(this.field4558[var4], -17880, this.field4548[var4], arg0.method222(class166.field2749[this.field4548[var4]], (byte) 107)), false);
            }
        }
        field4539++;
        var3.method334(this.field4559[this.field4559.length - 1], false);
        int var5 = -20 % ((12 - arg1) / 39);
        return var3.method336(-18690);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 49)
    public final void method1898(byte arg0) {
        if (this.field4541 != null) {
            for (int var2 = 0; var2 < this.field4541.length; var2++) {
                this.field4541[var2] = class11.method71(this.field4541[var2], 32768);
            }
        }
        if (arg0 != -32) {
            this.method1896(-100, 42);
        }
        field4561++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILsd;)V", line = 71)
    private final void method1899(int arg0, int arg1, class26 arg2) {
        if (arg0 == 1) {
            this.field4559 = arg2.method251((byte) 77).method359(60, -1);
        } else if (arg0 == 2) {
            int var8 = arg2.method226(255);
            this.field4541 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4541[var9] = arg2.method197(-1);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method226(255);
            this.field4558 = new int[var4][];
            this.field4548 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method197(arg1 ^ 0xFFFFB2A4);
                this.field4548[var5] = var6;
                this.field4558[var5] = new int[class193.field3114[var6]];
                for (int var7 = 0; var7 < class193.field3114[var6]; var7++) {
                    this.field4558[var5][var7] = arg2.method197(-1);
                }
            }
        } else if (arg0 == 4) {
            this.field4542 = false;
        }
        field4544++;
        if (arg1 != 19803) {
            this.method1898((byte) 74);
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(II)Lqd;", line = 136)
    public static final class40 method1900(int arg0, int arg1) {
        field4543++;
        if (arg1 >= arg0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class40 var2 = new class40();
        var2.field766 = 1;
        var2.field745 = new byte[1];
        var2.field745[0] = (byte) arg0;
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIZ)V", line = 164)
    public static final void method1901(int arg0, int arg1, int arg2, boolean arg3) {
        class40 var4 = class153.method1192(new class40[] { class188.field3030, class276.method1927((byte) -128, arg2), class213.field3518, class276.method1927((byte) -89, arg1 >> 6), class213.field3518, class276.method1927((byte) -64, arg0 >> 6), class213.field3518, class276.method1927((byte) -65, arg1 & 0x3F), class213.field3518, class276.method1927((byte) -86, arg0 & 0x3F) }, (byte) 123);
        field4556++;
        var4.method346(-16907);
        class132.method974(103, var4);
        if (!arg3) {
            method1906(-56, -17, -54);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V", line = 203)
    public static void method1902(boolean arg0) {
        field4562 = null;
        field4547 = null;
        field4564 = (byte[][][]) null;
        if (!arg0) {
            field4563 = null;
            field4554 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)Lqd;", line = 226)
    public final class40 method1903(byte arg0) {
        field4551++;
        class40 var2 = class29.method274((byte) -118, 80);
        if (arg0 >= -20) {
            field4564 = (byte[][][]) ((byte[][][]) null);
        }
        if (this.field4559 == null) {
            return class307.field5145;
        }
        var2.method334(this.field4559[0], false);
        for (int var3 = 1; var3 < this.field4559.length; var3++) {
            var2.method334(class60.field1145, false);
            var2.method334(this.field4559[var3], false);
        }
        return var2.method336(-18690);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lsd;[II)V", line = 258)
    public final void method1904(class26 arg0, int[] arg1, int arg2) {
        field4557++;
        if (this.field4548 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4548.length && arg1.length > var4; var4++) {
            int var5 = class158.field2643[this.method1896(-9848, var4)];
            if (var5 > 0) {
                arg0.method231(var5, -26714, (long) arg1[var4]);
            }
        }
        if (arg2 != -1) {
            this.method1909(-93, 16, -105);
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)I", line = 290)
    public final int method1905(int arg0) {
        field4555++;
        if (this.field4548 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field4548.length;
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V", line = 306)
    public static final void method1906(int arg0, int arg1, int arg2) {
        class177 var3 = class177.method1310(126, 1, arg0);
        field4550++;
        var3.method1302(-20040);
        if (arg1 != 9003) {
            field4549 = true;
        }
        var3.field2908 = arg2;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(III)V", line = 322)
    public static final void method1907(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field4545 = -16;
        }
        field4560++;
        class243.field4015[arg0] = arg2;
        class170 var3 = (class170) class7.field100.method1405((byte) 115, (long) arg0);
        if (var3 == null) {
            class170 var4 = new class170(4611686018427387905L);
            class7.field100.method1396(-19928, (long) arg0, var4);
        } else if (var3.field2791 != 4611686018427387905L) {
            var3.field2791 = class69.method535(true) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILsd;)V", line = 355)
    public final void method1908(int arg0, class26 arg1) {
        if (arg0 != 12101) {
            this.method1898((byte) 34);
        }
        while (true) {
            int var3 = arg1.method226(arg0 ^ 0x2FBA);
            if (var3 == 0) {
                field4552++;
                return;
            }
            this.method1899(var3, 19803, arg1);
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(III)I", line = 378)
    public final int method1909(int arg0, int arg1, int arg2) {
        field4553++;
        if (arg2 != -5) {
            this.field4542 = true;
        }
        if (this.field4548 == null || arg0 < 0 || this.field4548.length < arg0) {
            return -1;
        } else if (this.field4558[arg0] == null || arg1 < 0 || arg1 > this.field4558[arg0].length) {
            return -1;
        } else {
            return this.field4558[arg0][arg1];
        }
    }
}
