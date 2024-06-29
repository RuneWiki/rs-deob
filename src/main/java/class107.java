import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class107 extends class137 {

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
    public boolean field1660;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "[Luh;")
    public class107[] field1675;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "Lnb;")
    public static class223 field1668 = new class223();

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Ldl;")
    public class131 field1661;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Luf;")
    public class184 field1662;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V")
    public static final void method751(boolean arg0, int arg1) {
        if (arg0) {
            if (class68.field1089 != -1) {
                class253.method1716(true, class68.field1089);
            }
            for (class109 var2 = (class109) class74.field1192.method379(-21146); var2 != null; var2 = (class109) class74.field1192.method369(true)) {
                class8.method78(arg1 - 9, true, var2);
            }
            class68.field1089 = -1;
            class74.field1192 = new class58(8);
            class156.method1053(arg1 ^ 0xFFFFFFB4);
            class68.field1089 = class53.field774;
            class291.method2011(false, -30310);
            class297.method2040(false);
            class273.method1807(class68.field1089, -1754690448);
        }
        class184.field3061 = -1;
        class108.method764(class274.field4428, (byte) -99);
        class217.field3408 = new class12();
        class217.field3408.field929 = 3000;
        class217.field3408.field994 = 3000;
        if (class106.field1656 == 0) {
            class135.method925((byte) 71, class118.field1844);
            class143.method983(10, 16590);
        } else {
            if (class231.field3613 == 2) {
                class135.field2184 = class90.field1414 << 7;
                class123.field1960 = class272.field4377 << 7;
            } else {
                class281.method1916((byte) 112);
            }
            class310.method2100(-110);
            class143.method983(28, 16590);
        }
        if (arg1 == 0) {
            field1664++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    public static void method752(int arg0) {
        if (arg0 < 86) {
            method754(67, -43);
        }
        field1668 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public void method753(byte arg0) {
        if (this.field1660) {
            this.field1661.method888(-21256);
            this.field1661 = null;
        } else {
            this.field1662.method1299(3);
            this.field1662 = null;
        }
        if (arg0 < 62) {
            this.field1660 = true;
        }
        field1663++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lv;")
    public static final class158 method754(int arg0, int arg1) {
        if (arg0 != -20563) {
            method751(false, 37);
        }
        field1673++;
        class158 var2 = (class158) class120.field1900.method1879(arg0 ^ 0xFFFF8D1A, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class298.field4869.method1156(class7.method72(arg1, 105), class111.method778(12972, arg1), (byte) -16);
        class158 var4 = new class158();
        var4.field2557 = arg1;
        if (var3 != null) {
            var4.method1070(new class274(var3), arg0 + 20562);
        }
        var4.method1072(0);
        if (var4.field2525 != -1) {
            var4.method1074((byte) 120, method754(arg0, var4.field2525), method754(arg0, var4.field2562));
        }
        if (var4.field2548 != -1) {
            var4.method1077(-125, method754(-20563, var4.field2541), method754(arg0, var4.field2548));
        }
        if (!class8.field182 && var4.field2576) {
            var4.field2531 = class272.field4391;
            var4.field2565 = class159.field2601;
            var4.field2584 = 0;
            var4.field2587 = false;
            var4.field2532 = class259.field4246;
        }
        class120.field1900.method1883((long) arg1, 40, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILfj;B)V")
    public void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            this.method756(87, -74, -122);
        }
        field1665++;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)I")
    public int method755(byte arg0) {
        int var2 = -126 / ((-arg0 - 49) / 58);
        field1666++;
        return -1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)[I")
    public final int[] method756(int arg0, int arg1, int arg2) {
        field1671++;
        if (arg2 != -29053) {
            method752(11);
        }
        return this.field1675[arg0].field1660 ? this.field1675[arg0].method189(91, arg1) : this.field1675[arg0].method190(arg1, (byte) -117)[0];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[[I")
    public int[][] method190(int arg0, byte arg1) {
        if (arg1 != -117) {
            this.field1661 = null;
        }
        field1670++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V")
    public void method300(byte arg0) {
        if (arg0 == 35) {
            field1667++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBI)V")
    public final void method757(int arg0, byte arg1, int arg2) {
        field1674++;
        int var4 = this.field1659 == 255 ? arg2 : this.field1659;
        if (arg1 != -94) {
            return;
        }
        if (this.field1660) {
            this.field1661 = new class131(var4, arg2, arg0);
        } else {
            this.field1662 = new class184(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I")
    public int[] method189(int arg0, int arg1) {
        int var3 = 23 % ((arg0 + 34) / 49);
        field1672++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)I")
    public int method758(int arg0) {
        field1676++;
        if (arg0 != 9633) {
            method752(-47);
        }
        return -1;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)[[I")
    public final int[][] method759(int arg0, int arg1, int arg2) {
        field1669++;
        if (arg1 > -127) {
            this.field1661 = null;
        }
        if (this.field1675[arg0].field1660) {
            int[] var4 = this.field1675[arg0].method189(-102, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1675[arg0].method190(arg2, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IZ)V")
    public class107(int arg0, boolean arg1) {
        this.field1660 = arg1;
        this.field1675 = new class107[arg0];
    }
}
