import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class121 extends class286 {

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    private int field2019 = 4096;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Z")
    private boolean field2014 = true;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "[Z")
    public static boolean[] field2018 = new boolean[5];

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Lbe;")
    public static class283 field2021 = class153.method941(127, " ");

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "Lab;")
    public static class138 field2017 = new class138();

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "Lbe;")
    public static class283 field2027 = class153.method941(-88, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lbe;")
    private static class283 field2026 = class153.method941(127, "Select");

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "Lbe;")
    public static class283 field2025 = field2026;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lbe;")
    public static class283 field2028 = class153.method941(126, "welle2:");

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "J")
    public static long field2015;

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 47)
    public class121() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V", line = 29)
    public static void method769(byte arg0) {
        field2028 = null;
        field2018 = null;
        field2025 = null;
        field2021 = null;
        field2027 = null;
        field2017 = null;
        if (arg0 >= 31) {
            field2026 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfe;ZI)V", line = 55)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method770(12);
        }
        field2022++;
        if (arg2 == 0) {
            this.field2019 = arg0.method1496(true);
        } else if (arg2 == 1) {
            this.field2014 = arg0.method1535((byte) 110) == 1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[[I", line = 97)
    public final int[][] method16(int arg0, byte arg1) {
        field2016++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[] var4 = this.method1963(class126.field2100 & arg0 - 1, 0, -1);
            int[] var5 = this.method1963(arg0, 0, -1);
            int[] var6 = this.method1963(arg0 + 1 & class126.field2100, 0, -1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class27.field410; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2019;
                int var12 = (var5[class284.field4857 & var10 + 1] - var5[class284.field4857 & var10 - 1]) * this.field2019;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field2014) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return arg1 == -19 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V", line = 185)
    public static final void method770(int arg0) {
        field2024++;
        if (class270.field4554 == null) {
            return;
        }
        if (class23.field349 < 10) {
            if (!class10.field93.method1093(class270.field4554.field2124, arg0 ^ 0xEC8) || !class10.field93.method1093(class299.method2022(new class283[] { class270.field4554.field2124, class279.field4659 }, (byte) 45), 1736)) {
                class23.field349 = class232.field3931.method1105(class270.field4554.field2124, arg0 ^ 0x864) / 10;
                return;
            }
            class118.method761(arg0 ^ 0x800);
            class23.field349 = 10;
        }
        if (class23.field349 == 10) {
            class110.field1865 = class270.field4554.field2130 >> 6 << 6;
            class123.field2045 = class270.field4554.field2128 >> 6 << 6;
            class77.field1345 = (class270.field4554.field2137 >> 6 << 6) + 64 - class123.field2045;
            class123.field2044 = 8.0F;
            class162.field2649 = 8.0F;
            int var1 = (class213.field3624.field1193 >> 7) + class214.field3637 - class123.field2045;
            class134.field2254 = (class270.field4554.field2135 >> 6 << 6) + 64 - class110.field1865;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class110.field1865 + class134.field2254 - (class213.field3624.field1210 >> 7) - class107.field1833 - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && class77.field1345 > var2 && var4 >= 0 && class134.field2254 > var4) {
                class159.field2604 = var4;
                class7.field79 = var2;
            } else {
                class7.field79 = class270.field4554.field2125 * 64 - class123.field2045;
                class159.field2604 = class134.field2254 + class110.field1865 - (class270.field4554.field2136 * 64) - 1;
            }
            class305.method2070(-1);
            int var5 = class134.field2254 >> 6;
            int var6 = class157.field2565 >> 2 << 10;
            int var7 = class77.field1345 >> 6;
            class71.field1225 = new byte[var7][var5][];
            class180.field3112 = new byte[var7][var5][];
            class309.field5291 = new int[var7][var5][];
            class74.field1297 = new short[var7][var5][];
            int var8 = class114.field1915 >> 1;
            class163.field2686 = new int[class128.field2131 + 1];
            class260.field4416 = new byte[var7][var5][];
            class77.field1346 = new byte[var7][var5][];
            class86.field1451 = new byte[var7][var5][];
            class38.field551 = new int[var7][var5][];
            class118.method760(arg0 ^ 0x800, var8, var6);
            class23.field349 = 20;
        } else if (class23.field349 == 20) {
            class222.method1458((byte) -75, new class229(class10.field93.method1102(-25446, class270.field4554.field2124, class242.field4077)));
            class23.field349 = 30;
            class277.method1853(arg0 + 63487, true);
            class82.method535((byte) 5);
        } else if (class23.field349 == 30) {
            class153.method940(7930, new class229(class10.field93.method1102(-25446, class270.field4554.field2124, class280.field4672)));
            class23.field349 = 40;
            class82.method535((byte) 5);
        } else if (class23.field349 == 40) {
            class207.method1377((byte) -90, new class229(class10.field93.method1102(-25446, class270.field4554.field2124, class12.field103)));
            class23.field349 = 50;
            class82.method535((byte) 5);
        } else if (class23.field349 == 50) {
            class282.method1896((byte) 75, new class229(class10.field93.method1102(-25446, class270.field4554.field2124, class91.field1538)));
            class23.field349 = 60;
            class277.method1853(65535, true);
            class82.method535((byte) 5);
        } else if (class23.field349 == 60) {
            class272.field4577 = class279.method1862(class299.method2022(new class283[] { class270.field4554.field2124, class279.field4659 }, (byte) 100), class10.field93, 512);
            class23.field349 = 70;
            class82.method535((byte) 5);
        } else if (class23.field349 == 70) {
            class153.field2507 = new class181(11, true, class264.field4487);
            class23.field349 = 73;
            class277.method1853(65535, true);
            class82.method535((byte) 5);
        } else if (class23.field349 == 73) {
            class66.field927 = new class181(12, true, class264.field4487);
            class23.field349 = 76;
            class277.method1853(arg0 ^ 0xF7FF, true);
            class82.method535((byte) 5);
        } else if (class23.field349 == 76) {
            class217.field3673 = new class181(14, true, class264.field4487);
            class23.field349 = 79;
            class277.method1853(65535, true);
            class82.method535((byte) 5);
        } else if (class23.field349 == 79) {
            class117.field1980 = new class181(17, true, class264.field4487);
            class23.field349 = 82;
            class277.method1853(65535, true);
            class82.method535((byte) 5);
        } else if (arg0 == 2048) {
            if (class23.field349 == 82) {
                class169.field2848 = new class181(19, true, class264.field4487);
                class23.field349 = 85;
                class277.method1853(arg0 + 63487, true);
                class82.method535((byte) 5);
            } else if (class23.field349 == 85) {
                class187.field3209 = new class181(22, true, class264.field4487);
                class23.field349 = 88;
                class277.method1853(65535, true);
                class82.method535((byte) 5);
            } else if (class23.field349 == 88) {
                class210.field3577 = new class181(26, true, class264.field4487);
                class23.field349 = 91;
                class277.method1853(65535, true);
                class82.method535((byte) 5);
            } else {
                class208.field3565 = new class181(30, true, class264.field4487);
                class23.field349 = 100;
                class277.method1853(arg0 + 63487, true);
                class82.method535((byte) 5);
                class241.field4074 = -1;
                class237.field3962 = -1;
                System.gc();
            }
        }
    }
}
