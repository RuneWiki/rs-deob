import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class139 extends class150 {

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    private int field2202;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    private int field2206;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    private int field2199;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    private int field2212;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    private int field2219;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    private int field2201;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    private int field2211;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Lik;")
    public static class259 field2209 = new class259(64);

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Lea;")
    public static class204 field2216 = new class204();

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Z")
    public static boolean field2221 = true;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field2220 = 500;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "[I")
    public static int[] field2215;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "[[[B")
    public static byte[][][] field2218;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 4)
    public static final void method1057(int arg0) {
        if (arg0 != 29514) {
            method1064(-37, -10);
        }
        class42.field748 = new class110(32);
        field2207++;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 18)
    public static final void method1058(int arg0) {
        field2208++;
        byte var1 = 0;
        int var2 = (class177.field2780 >> 3) + (class140.field2223 >> 10);
        if (arg0 != 17398) {
            method1065(true, (byte) 25);
        }
        byte var3 = 8;
        int var4 = (class91.field1485 >> 3) + (class312.field4904 >> 10);
        byte var5 = 8;
        byte var6 = 18;
        class2.field2 = new byte[var6][];
        class151.field2425 = new byte[var6][];
        class65.field1067 = new int[var6][4];
        class329.field5094 = new int[var6];
        class30.field508 = new byte[var6][];
        class307.field4845 = new byte[var6][];
        class138.field2190 = new int[var6];
        class95.field1570 = new int[var6];
        class102.field1728 = new int[var6];
        class140.field2226 = new int[var6];
        class118.field1901 = new int[var6];
        class104.field1756 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= ((var2 + 6) / 8); var8++) {
            for (int var9 = (var4 - 6) / 8; var9 <= ((var4 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class102.field1728[var7] = var10;
                class329.field5094[var7] = class224.field3602.method487(false, "m" + var8 + "_" + var9);
                class138.field2190[var7] = class224.field3602.method487(false, "l" + var8 + "_" + var9);
                class118.field1901[var7] = class224.field3602.method487(false, "n" + var8 + "_" + var9);
                class140.field2226[var7] = class224.field3602.method487(false, "um" + var8 + "_" + var9);
                class95.field1570[var7] = class224.field3602.method487(false, "ul" + var8 + "_" + var9);
                if (class118.field1901[var7] == -1) {
                    class329.field5094[var7] = -1;
                    class138.field2190[var7] = -1;
                    class140.field2226[var7] = -1;
                    class95.field1570[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class118.field1901.length; var11++) {
            class118.field1901[var11] = -1;
            class329.field5094[var11] = -1;
            class138.field2190[var11] = -1;
            class140.field2226[var11] = -1;
            class95.field1570[var11] = -1;
        }
        class260.method1841(var2, var3, true, var5, var1, arg0 - 17312, var4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 101)
    public static void method1059(byte arg0) {
        field2215 = null;
        field2218 = (byte[][][]) null;
        field2216 = null;
        field2209 = null;
        if (arg0 != -97) {
            method1059((byte) -121);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)V", line = 114)
    public final void method1060(int arg0, int arg1, boolean arg2) {
        field2204++;
        if (arg2) {
            method1064(124, -38);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V", line = 129)
    public final void method1061(int arg0, int arg1, int arg2) {
        if (arg0 != 50) {
            field2221 = true;
        }
        field2205++;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 139)
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2202 = arg2;
        this.field2206 = arg1;
        this.field2199 = arg3;
        this.field2212 = arg6;
        this.field2217 = arg0;
        this.field2219 = arg7;
        this.field2201 = arg4;
        this.field2211 = arg5;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I", line = 158)
    public static final int method1062(int arg0, int arg1) {
        if (arg1 == -195905336) {
            field2210++;
            return arg0 >>> 8;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)V", line = 175)
    public final void method1063(int arg0, int arg1, int arg2) {
        int var4 = this.field2217 * arg2 >> 12;
        int var5 = this.field2206 * arg0 >> 12;
        field2213++;
        int var6 = this.field2199 * arg0 >> 12;
        int var7 = this.field2201 * arg2 >> 12;
        int var8 = this.field2202 * arg2 >> 12;
        int var9 = this.field2211 * arg0 >> 12;
        int var10 = this.field2212 * arg2 >> 12;
        int var11 = this.field2219 * arg0 >> 12;
        class31.method213(this.field2413, var7, var10, 0, var6, var5, var9, var11, var4, var8);
        int var12 = -26 / ((-arg1 - 72) / 53);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V", line = 202)
    public static final void method1064(int arg0, int arg1) {
        class180.field2886[0] = (float) class280.method2001(arg1 >> 16, 255) / 255.0F;
        field2214++;
        class180.field2886[2] = (float) class280.method2001(255, arg1) / 255.0F;
        class180.field2886[1] = (float) class280.method2001(255, arg1 >> 8) / 255.0F;
        class247.method1753(3, false);
        class247.method1753(4, false);
        if (arg0 != 20699) {
            field2215 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZB)V", line = 226)
    public static final void method1065(boolean arg0, byte arg1) {
        byte[][] var2;
        byte var3;
        if (class265.field4126 && arg0) {
            var2 = class104.field1756;
            var3 = 1;
        } else {
            var2 = class151.field2425;
            var3 = 4;
        }
        int var4 = -61 % ((58 - arg1) / 58);
        for (int var5 = 0; var5 < var3; var5++) {
            class84.method605((byte) 52);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class261.field4046[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = var8 >> 3 & 0x7FF;
                            int var12 = (var8 & 0xFFD8BB) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class102.field1728.length; var14++) {
                                if (class102.field1728[var14] == var13 && var2[var14] != null) {
                                    class78.method576(var10, var9, arg0, var2[var14], (var12 & 0x7) * 8, (byte) -2, var7 * 8, var5, var6 * 8, class244.field3772, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field2203++;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 307)
    public static final void method1066(byte arg0) {
        field2200++;
        if (arg0 != -42) {
            field2209 = (class259) null;
        }
        class303.field4758.method1837(17);
    }
}
