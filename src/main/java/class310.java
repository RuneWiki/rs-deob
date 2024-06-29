import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class310 {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lkb;")
    private class315 field4814 = new class315();

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lkb;")
    private class315 field4822 = new class315();

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Lkb;")
    private class315 field4824 = new class315();

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "Lkb;")
    private class315 field4828 = new class315();

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Lvl;")
    private class6 field4835 = new class6(4);

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "B")
    private byte field4836 = 0;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public volatile int field4838 = 0;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public volatile int field4839 = 0;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "Lvl;")
    private class6 field4837 = new class6(8);

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4818 = "Loaded update list";

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lod;")
    public static class223 field4827 = new class223(64);

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "[I")
    public static int[] field4830 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field4829 = 0;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4831 = "M";

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    private int field4832;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "J")
    private long field4834;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lpa;")
    private class163 field4840;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Lna;")
    private class22 field4833;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method2139(int arg0) {
        field4821++;
        int var2 = 86 / ((arg0 + 10) / 44);
        return this.method2140(4) >= 20;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I", line = 22)
    public final int method2140(int arg0) {
        if (arg0 != 4) {
            field4827 = (class223) null;
        }
        field4811++;
        return this.field4814.method2202(0) + this.field4822.method2202(0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lug;BI)Lun;", line = 34)
    public static final class190 method2141(class253 arg0, byte arg1, int arg2) {
        field4819++;
        int var3 = -29 % ((arg1 - 28) / 34);
        return class192.method1415(arg0, arg2, 17082) ? class32.method299(-107) : null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 47)
    public final void method2142(byte arg0) {
        field4810++;
        if (arg0 != 108) {
            field4827 = (class223) null;
        }
        if (this.field4833 != null) {
            this.field4833.method218(true);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 60)
    public final void method2143(int arg0) {
        if (this.field4833 != null) {
            this.field4833.method222((byte) -103);
        }
        field4813++;
        if (arg0 != -1) {
            this.method2144(-81);
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)Z", line = 73)
    public final boolean method2144(int arg0) {
        field4808++;
        if (this.field4833 != null) {
            long var2 = class219.method1609(-898);
            int var4 = (int) (var2 - this.field4834);
            this.field4834 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4832 += var4;
            if (this.field4832 > 30000) {
                try {
                    this.field4833.method218(true);
                } catch (Exception var30) {
                }
                this.field4833 = null;
            }
        }
        if (this.field4833 == null) {
            return this.method2140(4) == 0 && this.method2151((byte) -106) == 0;
        }
        try {
            this.field4833.method220(-6365);
            if (arg0 <= 34) {
                field4827 = (class223) null;
            }
            for (class163 var6 = (class163) this.field4814.method2198(200); var6 != null; var6 = (class163) this.field4814.method2192((byte) -78)) {
                this.field4835.field111 = 0;
                this.field4835.method81((byte) -101, 1);
                this.field4835.method57(25, (int) var6.field4294);
                this.field4833.method221(117, this.field4835.field115, 0, 4);
                this.field4822.method2197((byte) -105, var6);
            }
            for (class163 var7 = (class163) this.field4824.method2198(200); var7 != null; var7 = (class163) this.field4824.method2192((byte) -35)) {
                this.field4835.field111 = 0;
                this.field4835.method81((byte) -115, 0);
                this.field4835.method57(108, (int) var7.field4294);
                this.field4833.method221(-112, this.field4835.field115, 0, 4);
                this.field4828.method2197((byte) -105, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4833.method217(30000);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4832 = 0;
                byte var10 = 0;
                if (this.field4840 == null) {
                    var10 = 8;
                } else if (this.field4840.field2654 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field4837.field111;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field4833.method219(var11, this.field4837.field111, this.field4837.field115, (byte) 24);
                    if (this.field4836 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4837.field115[this.field4837.field111 + var12] = (byte) class4.method16(this.field4837.field115[this.field4837.field111 + var12], this.field4836);
                        }
                    }
                    this.field4837.field111 += var11;
                    if (var10 <= this.field4837.field111) {
                        if (this.field4840 == null) {
                            this.field4837.field111 = 0;
                            int var13 = this.field4837.method58(-288140008);
                            int var14 = this.field4837.method39((byte) 55);
                            int var15 = this.field4837.method58(-288140008);
                            int var16 = this.field4837.method73((byte) 19);
                            boolean var17 = (var15 & 0x80) != 0;
                            int var18 = var15 & 0x7F;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class163 var22;
                            if (var17) {
                                for (var22 = (class163) this.field4828.method2198(200); var22 != null && var22.field4294 != var19; var22 = (class163) this.field4828.method2192((byte) -126)) {
                                }
                            } else {
                                for (var22 = (class163) this.field4822.method2198(200); var22 != null && var22.field4294 != var19; var22 = (class163) this.field4822.method2192((byte) -118)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field4840 = var22;
                            int var23 = var18 == 0 ? 5 : 9;
                            this.field4840.field2651 = new class6(var16 + var23 + this.field4840.field2652);
                            this.field4840.field2651.method81((byte) -110, var18);
                            this.field4840.field2651.method34(var16, 294335144);
                            this.field4840.field2654 = 8;
                            this.field4837.field111 = 0;
                        } else if (this.field4840.field2654 != 0) {
                            throw new IOException();
                        } else if (this.field4837.field115[0] == -1) {
                            this.field4837.field111 = 0;
                            this.field4840.field2654 = 1;
                        } else {
                            this.field4840 = null;
                        }
                    }
                } else {
                    int var24 = this.field4840.field2651.field115.length - this.field4840.field2652;
                    int var25 = 512 - this.field4840.field2654;
                    if ((var24 - this.field4840.field2651.field111) < var25) {
                        var25 = var24 - this.field4840.field2651.field111;
                    }
                    if (var9 < var25) {
                        var25 = var9;
                    }
                    this.field4833.method219(var25, this.field4840.field2651.field111, this.field4840.field2651.field115, (byte) 24);
                    if (this.field4836 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field4840.field2651.field115[this.field4840.field2651.field111 + var26] = (byte) class4.method16(this.field4840.field2651.field115[this.field4840.field2651.field111 + var26], this.field4836);
                        }
                    }
                    this.field4840.field2654 += var25;
                    this.field4840.field2651.field111 += var25;
                    if (this.field4840.field2651.field111 == var24) {
                        this.field4840.method1960(-27621);
                        this.field4840.field3055 = false;
                        this.field4840 = null;
                    } else if (this.field4840.field2654 == 512) {
                        this.field4840.field2654 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field4833.method218(true);
            } catch (Exception var29) {
            }
            this.field4833 = null;
            this.field4838++;
            this.field4839 = -2;
            return this.method2140(4) == 0 && this.method2151((byte) -125) == 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 353)
    public static void method2145(byte arg0) {
        field4827 = null;
        field4831 = null;
        field4830 = null;
        if (arg0 < -91) {
            field4818 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V", line = 368)
    public static final void method2146(int arg0) {
        if (arg0 != 5) {
            return;
        }
        if (class322.field5081 < 0) {
            class275.field4241 = -1;
            class198.field3167 = -1;
            class322.field5081 = 0;
        }
        if (class322.field5081 > class251.field3959) {
            class322.field5081 = class251.field3959;
            class198.field3167 = -1;
            class275.field4241 = -1;
        }
        field4817++;
        if (class191.field3045 < 0) {
            class275.field4241 = -1;
            class191.field3045 = 0;
            class198.field3167 = -1;
        }
        if (class340.field5301 < class191.field3045) {
            class198.field3167 = -1;
            class275.field4241 = -1;
            class191.field3045 = class340.field5301;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLna;)V", line = 412)
    public final void method2147(int arg0, boolean arg1, class22 arg2) {
        if (this.field4833 != null) {
            try {
                this.field4833.method218(true);
            } catch (Exception var11) {
            }
            this.field4833 = null;
        }
        field4816++;
        this.field4833 = arg2;
        this.method2149(5);
        this.method2154(15153, arg1);
        this.field4837.field111 = 0;
        this.field4840 = null;
        while (true) {
            class163 var5 = (class163) this.field4822.method2196((byte) -36);
            if (var5 == null) {
                while (true) {
                    class163 var6 = (class163) this.field4828.method2196((byte) -36);
                    if (var6 == null) {
                        if (arg0 < 94) {
                            this.method2154(28, true);
                        }
                        if (this.field4836 != 0) {
                            try {
                                this.field4835.field111 = 0;
                                this.field4835.method81((byte) -112, 4);
                                this.field4835.method81((byte) -128, this.field4836);
                                this.field4835.method65((byte) -9, 0);
                                this.field4833.method221(-93, this.field4835.field115, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field4833.method218(true);
                                } catch (Exception var9) {
                                }
                                this.field4839 = -2;
                                this.field4833 = null;
                                this.field4838++;
                            }
                        }
                        this.field4832 = 0;
                        this.field4834 = class219.method1609(-898);
                        return;
                    }
                    this.field4824.method2197((byte) -105, var6);
                }
            }
            this.field4814.method2197((byte) -105, var5);
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V", line = 480)
    public static final void method2148(int arg0) {
        class328.method2303(5, -5585);
        class307.method2125(5, 0);
        field4826++;
        class212.method1547(-4, 5);
        class179.method1322((byte) -115, 5);
        class127.method923(0, 5);
        class327.method2299(5, (byte) 103);
        class58.method471(1942, 5);
        int var1 = -127 % ((arg0 + 33) / 37);
        class142.method1063(5, 57);
        class184.method1348(5, (byte) -74);
        class23.method224(5, false);
        class156.method1130(5, (byte) 102);
        class196.method1457(5, 20421);
        class282.method2003((byte) 67, 5);
        class222.method1622(5, 23133);
        class21.method213(5, -37);
        class193.method1430(5, (byte) 127);
        class125.method913((byte) -126, 5);
        client.method950(0, 50);
        class263.method1885(false, 5);
        class181.method1331(37, 5);
        class84.field1148.method1353(-1, 5);
        class339.field5284.method1353(-1, 5);
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V", line = 511)
    private final void method2149(int arg0) {
        field4812++;
        if (this.field4833 == null) {
            return;
        }
        try {
            this.field4835.field111 = 0;
            this.field4835.method81((byte) -112, 6);
            this.field4835.method57(29, 3);
            if (arg0 != 5) {
                this.method2152((byte) -103);
            }
            this.field4833.method221(-62, this.field4835.field115, 0, 4);
        } catch (IOException var5) {
            try {
                this.field4833.method218(true);
            } catch (Exception var4) {
            }
            this.field4839 = -2;
            this.field4833 = null;
            this.field4838++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)Z", line = 540)
    public final boolean method2150(int arg0) {
        if (arg0 >= -84) {
            this.method2155(-123);
        }
        field4809++;
        return this.method2151((byte) -40) >= 20;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)I", line = 553)
    private final int method2151(byte arg0) {
        field4807++;
        if (arg0 >= -11) {
            this.field4840 = (class163) null;
        }
        return this.field4824.method2202(0) + this.field4828.method2202(0);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V", line = 566)
    public final void method2152(byte arg0) {
        try {
            this.field4833.method218(true);
            if (arg0 >= -120) {
                this.method2149(43);
            }
        } catch (Exception var3) {
        }
        this.field4839 = -1;
        this.field4838++;
        this.field4836 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4833 = null;
        field4825++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZIB)Lpa;", line = 591)
    public final class163 method2153(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        class163 var6 = new class163();
        var6.field3056 = arg2;
        if (arg3 != -21) {
            this.method2150(-16);
        }
        var6.field2652 = arg4;
        field4820++;
        long var7 = (long) ((arg1 << 16) + arg0);
        var6.field4294 = var7;
        if (arg2) {
            if (this.method2140(4) >= 20) {
                throw new RuntimeException();
            }
            this.field4814.method2197((byte) -105, var6);
        } else if (this.method2151((byte) -50) < 20) {
            this.field4824.method2197((byte) -105, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V", line = 641)
    public final void method2154(int arg0, boolean arg1) {
        field4815++;
        if (this.field4833 == null) {
            return;
        }
        try {
            this.field4835.field111 = 0;
            this.field4835.method81((byte) -120, arg1 ? 2 : 3);
            this.field4835.method57(19, 0);
            this.field4833.method221(-40, this.field4835.field115, 0, 4);
        } catch (IOException var6) {
            try {
                this.field4833.method218(true);
            } catch (Exception var5) {
            }
            this.field4838++;
            this.field4833 = null;
            this.field4839 = -2;
        }
        if (arg0 != 15153) {
            this.method2142((byte) 42);
        }
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "(I)V", line = 670)
    public final void method2155(int arg0) {
        field4823++;
        if (arg0 < 4) {
            this.field4839 = -82;
        }
        if (this.field4833 == null) {
            return;
        }
        try {
            this.field4835.field111 = 0;
            this.field4835.method81((byte) -128, 7);
            this.field4835.method57(32, 0);
            this.field4833.method221(100, this.field4835.field115, 0, 4);
        } catch (IOException var5) {
            try {
                this.field4833.method218(true);
            } catch (Exception var4) {
            }
            this.field4833 = null;
            this.field4838++;
            this.field4839 = -2;
        }
    }
}
