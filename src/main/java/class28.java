import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 extends class55 {

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public int field549 = -1;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public int field547 = 0;

    @OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
    public int field569 = -1;

    @OriginalMember(owner = "client!ec", name = "rb", descriptor = "Z")
    public boolean field568 = true;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Lo;")
    public static class84 field542 = class15.method124("No response from server", 255);

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "[I")
    public static int[] field554 = new int[4000];

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lo;")
    public static class84 field551 = class15.method124("M", 255);

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Lo;")
    public static class84 field548 = class15.method124("Enter object name", 255);

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "Lo;")
    public static class84 field544 = class15.method124("Drop @lre@", 255);

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "[[I")
    public static int[][] field558 = new int[104][104];

    @OriginalMember(owner = "client!ec", name = "ib", descriptor = "Lo;")
    private static class84 field559 = class15.method124("Take", 255);

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "Lo;")
    public static class84 field562 = field559;

    @OriginalMember(owner = "client!ec", name = "qb", descriptor = "Lo;")
    public static class84 field567 = class15.method124("::", 255);

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "Lo;")
    public static class84 field561 = class15.method124("No reply from loginserver)3", 255);

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
    public int field565;

    @OriginalMember(owner = "client!ec", name = "pb", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ec", name = "tb", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "Lud;")
    public static class118 field564;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 4)
    public static void method256(byte arg0) {
        field561 = null;
        if (arg0 != 69) {
            method262(-64);
        }
        field564 = null;
        field559 = null;
        field551 = null;
        field558 = null;
        field567 = null;
        field542 = null;
        field554 = null;
        field544 = null;
        field562 = null;
        field548 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILeb;I)V", line = 29)
    private final void method257(byte arg0, int arg1, class27 arg2, int arg3) {
        if (arg1 == 1) {
            this.field547 = arg2.method241(2);
        } else if (arg1 == 2) {
            this.field549 = arg2.method231(255);
        } else if (arg1 == 5) {
            this.field568 = false;
        } else if (arg1 == 7) {
            this.field569 = arg2.method241(2);
        }
        if (arg0 <= 105) {
            this.field543 = 36;
        }
        field545++;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 66)
    public final void method258(byte arg0) {
        if (arg0 <= 106) {
            method256((byte) -93);
        }
        if (this.field569 != -1) {
            this.method261((byte) 75, this.field569);
            this.field565 = this.field553;
            this.field543 = this.field570;
            this.field555 = this.field557;
        }
        this.method261((byte) 65, this.field547);
        field540++;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V", line = 104)
    public static final void method259(byte arg0) {
        class65.field1405.method980(false);
        field546++;
        int var1 = class65.field1405.method986(-106, 8);
        if (class85.field1933 > var1) {
            for (int var2 = var1; var2 < class85.field1933; var2++) {
                class61.field1273[class15.field274++] = class75.field1571[var2];
            }
        }
        if (class85.field1933 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class85.field1933 = 0;
        int var3 = 108 / ((arg0 - 64) / 49);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class75.field1571[var4];
            class115 var6 = class3.field30[var5];
            int var7 = class65.field1405.method986(55, 1);
            if (var7 == 0) {
                class75.field1571[class85.field1933++] = var5;
                var6.field1379 = class128.field2837;
            } else {
                int var8 = class65.field1405.method986(-65, 2);
                if (var8 == 0) {
                    class75.field1571[class85.field1933++] = var5;
                    var6.field1379 = class128.field2837;
                    class117.field2552[class62.field1290++] = var5;
                } else if (var8 == 1) {
                    class75.field1571[class85.field1933++] = var5;
                    var6.field1379 = class128.field2837;
                    int var9 = class65.field1405.method986(78, 3);
                    var6.method509(var9, (byte) 68, false);
                    int var10 = class65.field1405.method986(108, 1);
                    if (var10 == 1) {
                        class117.field2552[class62.field1290++] = var5;
                    }
                } else if (var8 == 2) {
                    class75.field1571[class85.field1933++] = var5;
                    var6.field1379 = class128.field2837;
                    int var11 = class65.field1405.method986(106, 3);
                    var6.method509(var11, (byte) 68, true);
                    int var12 = class65.field1405.method986(-91, 3);
                    var6.method509(var12, (byte) 68, true);
                    int var13 = class65.field1405.method986(-122, 1);
                    if (var13 == 1) {
                        class117.field2552[class62.field1290++] = var5;
                    }
                } else if (var8 == 3) {
                    class61.field1273[class15.field274++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Leb;BI)V", line = 212)
    public final void method260(class27 arg0, byte arg1, int arg2) {
        if (arg1 != 55) {
            this.method257((byte) -11, -61, null, 93);
        }
        while (true) {
            int var4 = arg0.method231(255);
            if (var4 == 0) {
                field566++;
                return;
            }
            this.method257((byte) 111, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V", line = 234)
    private final void method261(byte arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        int var5 = 67 % ((arg0 + 47) / 48);
        field563++;
        double var6 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var6;
        if (var3 < var6) {
            var10 = var3;
        }
        if (var10 > var8) {
            var10 = var8;
        }
        double var12 = 0.0D;
        double var14 = var6;
        if (var6 < var3) {
            var14 = var3;
        }
        if (var14 < var8) {
            var14 = var8;
        }
        double var16 = 0.0D;
        double var18 = (var10 + var14) / 2.0D;
        this.field570 = (int) (var18 * 256.0D);
        if (this.field570 < 0) {
            this.field570 = 0;
        } else if (this.field570 > 255) {
            this.field570 = 255;
        }
        if (var10 != var14) {
            if (var18 < 0.5D) {
                var16 = (var14 - var10) / (var10 + var14);
            }
            if (var18 >= 0.5D) {
                var16 = (var14 - var10) / (2.0D - var14 - var10);
            }
            if (var6 == var14) {
                var12 = (var3 - var8) / (var14 - var10);
            } else if (var3 == var14) {
                var12 = (var8 - var6) / (var14 - var10) + 2.0D;
            } else if (var8 == var14) {
                var12 = (var6 - var3) / (var14 - var10) + 4.0D;
            }
        }
        double var20 = var12 / 6.0D;
        this.field553 = (int) (var16 * 256.0D);
        this.field557 = (int) (var20 * 256.0D);
        if (this.field553 < 0) {
            this.field553 = 0;
        } else if (this.field553 > 255) {
            this.field553 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 349)
    public static final void method262(int arg0) {
        int var1 = class57.field1170;
        field552++;
        int var2 = class128.field2816;
        int var3 = class17.field301;
        if (arg0 != 30307) {
            field559 = null;
        }
        int var4 = class118.field2628;
        int var5 = 6116423;
        class32.method290(var1, var2, var3, var4, var5);
        class32.method290(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class32.method285(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        class16.field291.method320(class86.field1967, var1 + 3, var2 + 14, var5);
        int var6 = class38.field748;
        int var7 = class119.field2644;
        if (class1.field24 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class1.field24 == 1) {
            var7 -= 205;
            var6 -= 553;
        }
        if (class1.field24 == 2) {
            var7 -= 357;
            var6 -= 17;
        }
        for (int var8 = 0; var8 < class40.field805; var8++) {
            int var9 = (class40.field805 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class16.field291.method319(class21.field385[var8], var1 + 3, var9, var10, true);
        }
    }
}
