import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class21 extends class235 {

    @OriginalMember(owner = "client!od", name = "y", descriptor = "[J")
    private long[] field363 = new long[10];

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    private int field352 = 1;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    private int field358 = 0;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    private int field362 = 256;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "J")
    private long field351 = class244.method1644((byte) -74);

    @OriginalMember(owner = "client!od", name = "r", descriptor = "S")
    public static short field356 = 320;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lli;")
    public static class185 field359 = class245.method1649("<br>", 126);

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field353 = 0;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "Lli;")
    public static class185 field367 = class245.method1649("::noclip", 122);

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Z")
    public static boolean field368 = false;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "Lhi;")
    public static class250 field365;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Z")
    public static boolean field364;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
    public static int[] field360;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I")
    public static int method150(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method151(int arg0) {
        class232.method1591(arg0 ^ 0xFFFF9854, false);
        class18.field298 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class149.field2815.length; var2++) {
            if (class191.field3538[var2] != -1 && class149.field2815[var2] == null) {
                class149.field2815[var2] = class24.field407.method1688(arg0 + 26600, 0, class191.field3538[var2]);
                if (class149.field2815[var2] == null) {
                    var1 = false;
                    class18.field298++;
                }
            }
            if (class273.field4842[var2] != -1 && class87.field1713[var2] == null) {
                class87.field1713[var2] = class24.field407.method1677(0, class31.field510[var2], class273.field4842[var2], (byte) 68);
                if (class87.field1713[var2] == null) {
                    var1 = false;
                    class18.field298++;
                }
            }
            if (class130.field2331 != null && class240.field4292[var2] == null && class130.field2331[var2] != -1) {
                class240.field4292[var2] = class24.field407.method1677(0, class31.field510[var2], class130.field2331[var2], (byte) 100);
                if (class240.field4292[var2] == null) {
                    class18.field298++;
                    var1 = false;
                }
            }
        }
        if (class2.field44 == null) {
            if (class66.field1161 == null || !class193.field3563.method1674(arg0 ^ 0x6799, class87.method567(-11039, new class185[] { class66.field1161.field1680, class266.field4718 }))) {
                class2.field44 = new class169(0);
            } else if (class193.field3563.method1676(arg0 + 26601, class87.method567(-11039, new class185[] { class66.field1161.field1680, class266.field4718 }))) {
                class2.field44 = class249.method1672(class87.method567(-11039, new class185[] { class66.field1161.field1680, class266.field4718 }), (byte) 88, class193.field3563);
            } else {
                var1 = false;
                class18.field298++;
            }
        }
        field361++;
        if (!var1) {
            class181.field3317 = 1;
            return;
        }
        class148.field2808 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class149.field2815.length; var4++) {
            byte[] var20 = class87.field1713[var4];
            if (var20 != null) {
                int var21 = (class141.field2640[var4] >> 8) * 64 - class77.field1339;
                int var22 = (class141.field2640[var4] & 0xFF) * 64 - class107.field1933;
                if (class256.field4560) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class107.method756((byte) -121, var22, var21, var20);
            }
        }
        if (!var3) {
            class181.field3317 = 2;
            return;
        }
        if (arg0 != -26600) {
            field364 = true;
        }
        if (class181.field3317 != 0) {
            class265.method1811(class87.method567(-11039, new class185[] { class228.field4146, class242.field4327 }), arg0 + 26606, true);
        }
        boolean var5 = false;
        class125.method907((byte) -21);
        class155.method1105(-28489);
        class271.method1858(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class165.field3090[var6].method295(arg0 + 26605);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class239.field4262[var7][var18][var19] = 0;
                }
            }
        }
        class7.method78(false, false);
        class125.method907((byte) -21);
        System.gc();
        class232.method1591(107, true);
        class2.method22((byte) -107, false);
        if (!class256.field4560) {
            class18.method126((byte) -126, false);
            class232.method1591(101, true);
            class28.method179(false, false);
            if (class240.field4292 != null) {
                class221.method1528((byte) -57);
            }
        }
        if (class256.field4560) {
            class224.method1556(false, true);
            class232.method1591(67, true);
            class223.method1546(false, (byte) 127);
        }
        class155.method1105(arg0 - 1889);
        class232.method1591(107, true);
        class239.method1622(false, class165.field3090, arg0 ^ 0xFFFF987F);
        class232.method1591(arg0 ^ 0xFFFF985E, true);
        int var8 = class275.field4882;
        if (var8 > class265.field4703) {
            var8 = class265.field4703;
        }
        if (class265.field4703 - 1 > var8) {
            int var9 = class265.field4703 - 1;
        }
        if (class17.method125(38)) {
            class224.method1553(0);
        } else {
            class224.method1553(class275.field4882);
        }
        class140.method1005(-1);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class228.method1578(var17, var10, false);
            }
        }
        class81.method522(-1);
        class125.method907((byte) -21);
        class178.method1259((byte) -57);
        class155.method1105(-28489);
        if (class131.field2357 != null && class125.field2252 != null && class80.field1399 == 25) {
            class182.field3349.method577(232, 0);
            class182.field3349.method842(1057001181, -6596);
            class184.field3384++;
        }
        if (!class256.field4560) {
            int var11 = (class103.field1868 + 6) / 8;
            int var12 = (class103.field1868 - 6) / 8;
            int var13 = (class265.field4704 - 6) / 8;
            int var14 = (class265.field4704 + 6) / 8;
            for (int var15 = var12 - 1; var15 <= (var11 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var12 || var15 > var11 || var16 < var13 || var16 > var14) {
                        class24.field407.method1703(arg0 + 26535, class87.method567(arg0 + 15561, new class185[] { class206.field3786, class90.method591(var15, 0), class94.field1783, class90.method591(var16, 0) }));
                        class24.field407.method1703(-119, class87.method567(-11039, new class185[] { class152.field2880, class90.method591(var15, 0), class94.field1783, class90.method591(var16, 0) }));
                    }
                }
            }
        }
        if (class80.field1399 == 28) {
            class276.method1892((byte) -121, 10);
        } else {
            class276.method1892((byte) -112, 30);
            if (class125.field2252 != null) {
                class182.field3349.method577(40, 0);
            }
        }
        class76.method492(-88);
        class125.method907((byte) -21);
        class157.method1119(30831);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)I")
    public final int method152(int arg0, int arg1, int arg2) {
        field357++;
        int var4 = this.field352;
        int var5 = this.field362;
        this.field352 = 1;
        this.field362 = 300;
        this.field351 = class244.method1644((byte) -90);
        if (this.field363[this.field354] == 0L) {
            this.field362 = var5;
            this.field352 = var4;
        } else if (this.field363[this.field354] < this.field351) {
            this.field362 = (int) ((long) (arg1 * 2560) / (this.field351 - this.field363[this.field354]));
        }
        if (this.field362 < 25) {
            this.field362 = 25;
        }
        if (this.field362 > 256) {
            this.field362 = 256;
            this.field352 = (int) ((long) arg1 - ((this.field351 - this.field363[this.field354]) / 10L));
        }
        if (this.field352 > arg1) {
            this.field352 = arg1;
        }
        this.field363[this.field354] = this.field351;
        this.field354 = (this.field354 + 1) % 10;
        if (this.field352 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field363[var6] != 0L) {
                    this.field363[var6] -= -((long) this.field352);
                }
            }
        }
        if (arg0 != 2) {
            return -84;
        }
        int var7 = 0;
        if (this.field352 < arg2) {
            this.field352 = arg2;
        }
        class212.method1488((long) this.field352, -90);
        while (this.field358 < 256) {
            this.field358 += this.field362;
            var7++;
        }
        this.field358 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class21() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field363[var1] = this.field351;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    public static void method153(int arg0) {
        field365 = null;
        if (arg0 != 2) {
            field356 = -40;
        }
        field367 = null;
        field359 = null;
        field360 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (arg0 != -105) {
            method151(-126);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field363[var2] = 0L;
        }
        field366++;
    }
}
