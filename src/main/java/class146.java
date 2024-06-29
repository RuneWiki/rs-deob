import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class146 extends class240 {

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    private int field2577 = -1;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "Lig;")
    public static class168 field2574 = new class168(64);

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "Lcd;")
    public static class64 field2581 = class44.method335((byte) 71, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    private int field2575;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "Lqm;")
    public static class222 field2589;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "[I")
    private int[] field2573;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(B)V", line = 4)
    public static void method1037(byte arg0) {
        if (arg0 < -121) {
            field2581 = null;
            field2589 = null;
            field2574 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[[I", line = 21)
    public final int[][] method286(byte arg0, int arg1) {
        field2579++;
        int[][] var3 = this.field4095.method1797(arg1, -121);
        if (this.field4095.field4355 && this.method1039(4080)) {
            int var4 = (class131.field2320 == this.field2580 ? arg1 : this.field2580 * arg1 / class131.field2320) * this.field2575;
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class169.field2936 == this.field2575) {
                for (int var8 = 0; var8 < class169.field2936; var8++) {
                    int var9 = this.field2573[var4++];
                    var6[var8] = class224.method1614(255, var9) << 4;
                    var7[var8] = class224.method1614(4080, var9 >> 4);
                    var5[var8] = class224.method1614(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class169.field2936; var10++) {
                    int var11 = this.field2575 * var10 / class169.field2936;
                    int var12 = this.field2573[var4 + var11];
                    var6[var10] = class224.method1614(var12 << 4, 4080);
                    var7[var10] = class224.method1614(65280, var12) >> 4;
                    var5[var10] = class224.method1614(var12 >> 12, 4080);
                }
            }
        }
        return arg0 <= 34 ? (int[][]) ((int[][]) null) : var3;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)I", line = 85)
    public final int method1038(int arg0) {
        if (arg0 != 1000) {
            method1040((byte) 12);
        }
        field2582++;
        return this.field2577;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)Z", line = 100)
    private final boolean method1039(int arg0) {
        if (arg0 != 4080) {
            return false;
        }
        field2578++;
        if (this.field2573 != null) {
            return true;
        } else if (this.field2577 >= 0) {
            int var2 = class169.field2936;
            int var3 = class131.field2320;
            int var4 = class296.field5097.method663(this.field2577, arg0 - 3964) ? 64 : 128;
            this.field2573 = class296.field5097.method660(this.field2577, (byte) -100);
            this.field2580 = var4;
            this.field2575 = var4;
            class54.method408(var2, arg0 - 4191, var3);
            return this.field2573 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 137)
    public class146() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILkh;)V", line = 141)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field2585++;
        if (arg0 != 2) {
            this.method1039(91);
        }
        if (arg1 == 0) {
            this.field2577 = arg2.method112((byte) 92);
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)V", line = 156)
    public static final void method1040(byte arg0) {
        field2584++;
        int var1 = class108.field1991.method1220(-23932, 8);
        if (var1 < class163.field2862) {
            for (int var2 = var1; var2 < class163.field2862; var2++) {
                class310.field5265[class182.field3125++] = class194.field3307[var2];
            }
        }
        if (var1 > class163.field2862) {
            throw new RuntimeException("gppov1");
        }
        class163.field2862 = 0;
        if (arg0 != 33) {
            method1042(-111, -66);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class194.field3307[var3];
            class41 var5 = class284.field4888[var4];
            int var6 = class108.field1991.method1220(-23932, 1);
            if (var6 == 0) {
                class194.field3307[class163.field2862++] = var4;
                var5.field1911 = class29.field482;
            } else {
                int var7 = class108.field1991.method1220(-23932, 2);
                if (var7 == 0) {
                    class194.field3307[class163.field2862++] = var4;
                    var5.field1911 = class29.field482;
                    class89.field1616[class228.field3878++] = var4;
                } else if (var7 == 1) {
                    class194.field3307[class163.field2862++] = var4;
                    var5.field1911 = class29.field482;
                    int var8 = class108.field1991.method1220(-23932, 3);
                    var5.method762(var8, false, false);
                    int var9 = class108.field1991.method1220(-23932, 1);
                    if (var9 == 1) {
                        class89.field1616[class228.field3878++] = var4;
                    }
                } else if (var7 == 2) {
                    class194.field3307[class163.field2862++] = var4;
                    var5.field1911 = class29.field482;
                    int var10 = class108.field1991.method1220(arg0 - 23965, 3);
                    var5.method762(var10, false, true);
                    int var11 = class108.field1991.method1220(arg0 - 23965, 3);
                    var5.method762(var11, false, true);
                    int var12 = class108.field1991.method1220(-23932, 1);
                    if (var12 == 1) {
                        class89.field1616[class228.field3878++] = var4;
                    }
                } else if (var7 == 3) {
                    class310.field5265[class182.field3125++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V", line = 271)
    public final void method1012(byte arg0) {
        super.method1012((byte) -91);
        if (arg0 >= -74) {
            this.method16(56, -87, (class13) null);
        }
        field2590++;
        this.field2573 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BB)V", line = 287)
    public static final void method1041(byte arg0, byte arg1) {
        field2576++;
        if (class264.field4528 == null) {
            class264.field4528 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class264.field4528[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 >= -124) {
            method1043(47, 99, 25);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V", line = 329)
    public static final void method1042(int arg0, int arg1) {
        field2586++;
        class299 var2 = class158.method1135(arg1, arg0 ^ 0x167, 5);
        if (arg0 != -268) {
            field2591 = 30;
        }
        var2.method2093((byte) -73);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)I", line = 359)
    public static final int method1043(int arg0, int arg1, int arg2) {
        field2583++;
        int var3 = arg1 - 1 & arg0 >> 31;
        if (arg2 != 706516447) {
            field2574 = (class168) null;
        }
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }
}
