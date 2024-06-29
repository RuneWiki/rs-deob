import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class152 extends class67 {

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    private final int field2616;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    private final int field2606;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    private final int field2603;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    private final int field2612;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    private final int field2605;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    private final int field2613;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    private final int field2617;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    private final int field2614;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "[Lue;")
    public static class79[] field2608 = new class79[4];

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lng;")
    public static class121 field2604;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)I")
    public static final int method1029(byte arg0, int arg1) {
        ++field2610;
        int var2 = ((-1431655766 & arg1) >>> 1) + (arg1 & 1431655765);
        int var3 = ((var2 & -858993459) >>> 2) + (var2 & 858993459);
        int var4 = 252645135 & (var3 >>> 4) + var3;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 > -18) {
            return 119;
        } else {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 255;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method1030(int arg0) {
        field2608 = null;
        int var1 = 53 % ((arg0 - 51) / 49);
        field2604 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)V")
    public final void method446(int arg0, int arg1, byte arg2) {
        int var4 = this.field2617 * arg0 >> 12;
        ++field2620;
        int var5 = this.field2613 * arg0 >> 12;
        int var6 = this.field2605 * arg1 >> 12;
        int var7 = this.field2616 * arg1 >> 12;
        int var8 = this.field2606 * arg1 >> 12;
        int var9 = this.field2603 * arg0 >> 12;
        int var10 = this.field2614 * arg0 >> 12;
        int var11 = this.field2612 * arg1 >> 12;
        if (arg2 < -40) {
            class92.method558(var10, var4, var5, var6, var11, var8, 128, var9, super.field1165, var7);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZJ)V")
    public static final void method1031(boolean arg0, long arg1) {
        ++field2611;
        if (arg1 != 0L) {
            if (~class254.field4506 <= -101) {
                class47.method320(class179.field3070, class26.field385, 0, -1);
            } else {
                class191 var3 = class33.method225(arg1, false).method1345((byte) -18);
                for (int var4 = 0; class254.field4506 > var4; ++var4) {
                    if (~class207.field3693[var4] == ~arg1) {
                        class47.method320(class228.method1629(new class191[] { var3, class218.field3832 }, (byte) -26), class26.field385, 0, -1);
                        return;
                    }
                }
                for (int var5 = 0; class270.field4759 > var5; ++var5) {
                    if (class35.field643[var5] == arg1) {
                        class47.method320(class228.method1629(new class191[] { class118.field1947, var3, class149.field2568 }, (byte) -61), class26.field385, 0, -1);
                        return;
                    }
                }
                if (var3.method1317(-27518, class175.field2946.field1315)) {
                    class47.method320(class87.field1427, class26.field385, 0, -1);
                } else {
                    class207.field3693[class254.field4506] = arg1;
                    ++class92.field1503;
                    class47.field844[class254.field4506++] = class33.method225(arg1, false);
                    class21.field297 = class110.field1841;
                    class53.field963.method1096(117, 0);
                    class53.field963.method1589(arg1, !arg0);
                    if (!arg0) {
                        field2604 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    public final void method441(int arg0, int arg1, int arg2) {
        ++field2607;
        if (arg0 != 32) {
            field2604 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)V")
    public final void method443(int arg0, byte arg1, int arg2) {
        if (arg1 >= -51) {
            method1032(-68, 53);
        }
        ++field2615;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
    public static final int method1032(int arg0, int arg1) {
        ++field2618;
        if ((arg0 < 97 || ~arg0 < -123) && (~arg0 > -225 || arg0 > 254 || arg0 == 247)) {
            if (~arg0 == -256) {
                return 159;
            } else if (arg1 >= -30) {
                return 116;
            } else {
                return ~arg0 == -157 ? 140 : arg0;
            }
        } else {
            return arg0 + -32;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(BI)Ljk;")
    public static final class233 method1033(byte arg0, int arg1) {
        ++field2621;
        class233 var2 = (class233) class271.field4775.method437((byte) 121, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -55 / ((-30 - arg0) / 43);
            byte[] var4 = class176.field3026.method826((byte) 35, 26, arg1);
            class233 var5 = new class233();
            if (var4 != null) {
                var5.method1649(new class225(var4), true);
            }
            class271.field4775.method439(var5, -1, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILe;)V")
    public static final void method1034(int arg0, class191 arg1) {
        ++field2619;
        if (class227.field4084 >= 2) {
            if (arg1.method1351(-23098, class28.field403)) {
                class159.method1079((byte) -68);
                for (int var2 = 0; var2 < 10; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class47.method320(class228.method1629(new class191[] { class215.field3803, class92.method563(-57, var4), class18.field252 }, (byte) -69), (class191) null, 0, -1);
            }
            if (arg1.method1351(-23098, class134.field2255)) {
                class219.method1488(0);
            }
            if (arg1.method1351(-23098, class253.field4475)) {
                class188.method1293(25, -30211);
            }
            if (arg1.method1351(-23098, class143.field2385)) {
                class181.field3114 = true;
            }
            if (arg1.method1351(-23098, class223.field3983)) {
                class181.field3114 = false;
            }
            if (arg1.method1351(-23098, class31.field439)) {
                for (int var5 = 0; var5 < 4; ++var5) {
                    for (int var6 = 1; var6 < 103; ++var6) {
                        for (int var7 = 1; var7 < 103; ++var7) {
                            class82.field1383[var5].field3873[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1318(class166.field2807, 15056) && class18.field239 != 0) {
                class57.method381((byte) 125, arg1.method1315(6, (byte) 41).method1358(-16880));
            }
            if (arg1.method1351(-23098, class93.field1520) && ~class18.field239 == -3) {
                throw new RuntimeException();
            }
            if (arg1.method1318(class141.field2358, 15056)) {
                class224.field3991 = arg1.method1315(12, (byte) -92).method1346((byte) 17).method1358(-16880);
                class47.method320(class228.method1629(new class191[] { class183.field3144, class92.method563(-124, class224.field3991) }, (byte) -86), (class191) null, 0, -1);
            }
            if (arg1.method1351(-23098, class36.field658)) {
                class111.field1875 = true;
            }
        }
        if (arg0 > -87) {
            field2608 = null;
        }
        ++class142.field2365;
        class53.field963.method1096(67, 0);
        class53.field963.method1613(arg1.method1304(63) - 1, 21);
        class53.field963.method1586(arg1.method1315(2, (byte) 50), (byte) -117);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2616 = arg3;
        this.field2606 = arg5;
        this.field2603 = arg4;
        this.field2612 = arg7;
        this.field2605 = arg1;
        this.field2613 = arg2;
        this.field2617 = arg0;
        this.field2614 = arg6;
    }
}
