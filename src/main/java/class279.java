import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class279 {

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    public static boolean field4639 = false;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4642 = "Opened title screen";

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lpf;")
    public static class17 field4629 = new class17(4);

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4645 = "Drop";

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lgf;")
    private class155 field4630;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Loe;")
    private class65 field4638;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lgf;")
    public final class155 method1946(byte arg0) {
        field4632++;
        class155 var2 = this.field4630;
        int var3 = 8 % ((arg0 - 10) / 63);
        if (this.field4638.field1099 == var2) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var2.field2569;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1947(int arg0) {
        field4643++;
        class195.field3119.method97(114);
        int var1 = 72 % ((arg0 - 39) / 56);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLaj;Lqm;Laj;)V")
    public static final void method1948(byte arg0, class151 arg1, class291 arg2, class151 arg3) {
        class41.field613 = arg2;
        field4641++;
        class130.field2150 = arg3;
        if (arg0 != -113) {
            field4645 = null;
        }
        class206.field3329 = arg1;
        if (class206.field3329 != null) {
            class15.field308 = class206.field3329.method1132(16777215, 1);
        }
        if (class130.field2150 != null) {
            class151.field2489 = class130.field2150.method1132(16777215, 1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public static final void method1949(int arg0, int arg1) {
        field4640++;
        if (arg1 > 0) {
            field4645 = null;
        }
        class36 var2 = class136.method1013(8, arg0, (byte) -90);
        var2.method221(1);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    public static final void method1950(int arg0, boolean arg1) {
        class80.method557(-103);
        field4636++;
        class65.method447((byte) -61);
        int var2 = class28.method178(arg0, 250).field3694;
        if (var2 == 0) {
            return;
        }
        int var3 = class12.field230[arg0];
        if (arg1) {
            field4642 = null;
        }
        if (var2 == 5) {
            class20.field375 = var3;
        }
        if (var2 == 6) {
            class68.field1154 = var3;
        }
        if (var2 == 9) {
            class313.field5043 = var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static void method1951(byte arg0) {
        field4645 = null;
        field4629 = null;
        if (arg0 != 49) {
            field4629 = null;
        }
        field4642 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)Lgf;")
    public final class155 method1952(byte arg0) {
        field4644++;
        if (arg0 != -97) {
            this.field4630 = null;
        }
        class155 var2 = this.field4638.field1099.field2569;
        if (this.field4638.field1099 == var2) {
            this.field4630 = null;
            return null;
        } else {
            this.field4630 = var2.field2569;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLoe;)V")
    public final void method1953(byte arg0, class65 arg1) {
        this.field4638 = arg1;
        if (arg0 > -97) {
            field4629 = null;
        }
        field4635++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)I")
    public static final int method1954(int arg0, byte arg1) {
        int var2 = arg0 & 0x3F;
        field4634++;
        if (arg1 > -45) {
            method1956((class312) null, 105, 30, -126);
        }
        int var3 = (arg0 & 0xCB) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)V")
    public static final void method1955(int arg0, int arg1) {
        field4633++;
        if (arg0 == -1 || !class301.method2056(-1, arg0)) {
            return;
        }
        class207[] var2 = class208.field3515[arg0];
        if (arg1 != 2000000) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class207 var4 = var2[var3];
            if (var4.field3428 != null) {
                class303 var5 = new class303();
                var5.field4935 = var4.field3428;
                var5.field4931 = var4;
                class161.method1193(2000000, var5, 2147483640);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lda;III)V")
    public static final void method1956(class312 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class21.field379) {
            class174 var4 = class90.field1498[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2805 != null && var4.field2805.field425.method1634()) {
                arg0.method1635(var4.field2805.field425, 128, 0, 0, true);
            }
        }
        if (arg3 < class21.field379) {
            class174 var5 = class90.field1498[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2805 != null && var5.field2805.field425.method1634()) {
                arg0.method1635(var5.field2805.field425, 0, 0, 128, true);
            }
        }
        if (arg2 < class21.field379 && arg3 < class28.field479) {
            class174 var6 = class90.field1498[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2805 != null && var6.field2805.field425.method1634()) {
                arg0.method1635(var6.field2805.field425, 128, 0, 128, true);
            }
        }
        if (arg2 < class21.field379 && arg3 > 0) {
            class174 var7 = class90.field1498[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2805 != null && var7.field2805.field425.method1634()) {
                arg0.method1635(var7.field2805.field425, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static final void method1957(boolean arg0) {
        class110.method823(0, class16.field328);
        field4631++;
        int var1 = (class26.field462 >> 3) + (class107.field1758 >> 10);
        byte var2 = 0;
        byte var3 = 8;
        byte var4 = 8;
        byte var5 = 18;
        class181.field2889 = new int[var5];
        class216.field3656 = new int[var5][4];
        class111.field1832 = new byte[var5][];
        class176.field2845 = new int[var5];
        class184.field2947 = new int[var5];
        int var6 = (class78.field1313 >> 3) + (class76.field1302 >> 10);
        class275.field4596 = new int[var5];
        class258.field4345 = new byte[var5][];
        class111.field1829 = new int[var5];
        class105.field1735 = new int[var5];
        class136.field2244 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var10 = (var6 - 6) / 8; var10 <= (var6 + 6) / 8; var10++) {
                int var11 = (var8 << 8) + var10;
                class184.field2947[var7] = var11;
                class176.field2845[var7] = class270.field4488.method1121(2, "m" + var8 + "_" + var10);
                class111.field1829[var7] = class270.field4488.method1121(2, "l" + var8 + "_" + var10);
                class105.field1735[var7] = class270.field4488.method1121(2, "n" + var8 + "_" + var10);
                class275.field4596[var7] = class270.field4488.method1121(2, "um" + var8 + "_" + var10);
                class181.field2889[var7] = class270.field4488.method1121(2, "ul" + var8 + "_" + var10);
                if (class105.field1735[var7] == -1) {
                    class176.field2845[var7] = -1;
                    class111.field1829[var7] = -1;
                    class275.field4596[var7] = -1;
                    class181.field2889[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class105.field1735.length; var9++) {
            class105.field1735[var9] = -1;
            class176.field2845[var9] = -1;
            class111.field1829[var9] = -1;
            class275.field4596[var9] = -1;
            class181.field2889[var9] = -1;
        }
        class108.method810(true, var1, var6, -85, arg0, var4, var3, var2);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method1958(int arg0) {
        class246.field4129 = -1;
        class54.field969 = 0;
        class186.field2981 = 0;
        class295.field4839 = -3;
        class283.field4696 = 0;
        field4637++;
        class273.field4575 = false;
        if (arg0 != 3) {
            method1958(52);
        }
        class189.field3017 = 1;
    }
}
