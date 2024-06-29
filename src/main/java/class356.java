import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class356 {

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Lmc;")
    private class384 field5173 = new class384();

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Lmc;")
    private class384 field5179 = new class384();

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "Lmc;")
    private class384 field5184 = new class384();

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "Lmc;")
    private class384 field5185 = new class384();

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "Lps;")
    private class428 field5187 = new class428(4);

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "B")
    private byte field5190 = 0;

    @OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
    public volatile int field5193 = 0;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
    public volatile int field5192 = 0;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "Lps;")
    private class428 field5191 = new class428(8);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field5165 = 0;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "Lqp;")
    public static class586 field5177 = new class586(96, 20);

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "[I")
    public static int[] field5180 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    private int field5189;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "J")
    private long field5186;

    @OriginalMember(owner = "client!fs", name = "F", descriptor = "Lpaa;")
    private class318 field5194;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "Lcaa;")
    private class51 field5188;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "Ldda;")
    public static class597 field5181;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
    public static final void method2183(boolean arg0) {
        if (class94.field1170 != null) {
            class94.field1170.method1659((byte) -92);
        }
        if (arg0) {
            method2185(false, 83, 62, 54);
        }
        field5172++;
        if (class178.field2704 != null) {
            class178.field2704.method1659((byte) -97);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method2184(int arg0) {
        int var2 = 78 / ((arg0 + 40) / 46);
        field5178++;
        if (this.field5188 != null) {
            this.field5188.method264((byte) 125);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIII)I")
    public static final int method2185(boolean arg0, int arg1, int arg2, int arg3) {
        field5170++;
        if (arg1 <= 101) {
            return -60;
        }
        class580 var4 = class585.method3419(-14473, arg0, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 >= 0 && arg3 < var4.field8543.length) {
            return var4.field8543[arg3];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)I")
    public final int method2186(int arg0) {
        field5168++;
        int var2 = 80 % ((-arg0 - 52) / 43);
        return this.field5173.method2330(-14638) + this.field5179.method2330(-14638);
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Z")
    public final boolean method2187(int arg0) {
        field5171++;
        if (arg0 == -21) {
            return this.method2191((byte) 118) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLcaa;)V")
    public final void method2188(int arg0, boolean arg1, class51 arg2) {
        if (this.field5188 != null) {
            try {
                this.field5188.method264((byte) 126);
            } catch (Exception var8) {
            }
            this.field5188 = null;
        }
        field5175++;
        this.field5188 = arg2;
        this.method2194((byte) -64);
        this.method2195(arg0, arg1);
        this.field5191.field6221 = 0;
        this.field5194 = null;
        while (true) {
            class318 var4 = (class318) this.field5179.method2332(false);
            if (var4 == null) {
                while (true) {
                    class318 var5 = (class318) this.field5185.method2332(false);
                    if (var5 == null) {
                        if (this.field5190 != 0) {
                            try {
                                this.field5187.field6221 = 0;
                                this.field5187.method2563(arg0 - 13021, 4);
                                this.field5187.method2563(-13021, this.field5190);
                                this.field5187.method2608(0, (byte) 52);
                                this.field5188.method255(0, 4, false, this.field5187.field6162);
                            } catch (IOException var7) {
                                try {
                                    this.field5188.method264((byte) 127);
                                } catch (Exception var6) {
                                }
                                this.field5193++;
                                this.field5188 = null;
                                this.field5192 = -2;
                            }
                        }
                        this.field5189 = arg0;
                        this.field5186 = class450.method2719((byte) -67);
                        return;
                    }
                    this.field5184.method2331(2, var5);
                }
            }
            this.field5173.method2331(2, var4);
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V")
    public final void method2189(int arg0) {
        if (arg0 != 7730) {
            this.method2186(-97);
        }
        field5176++;
        if (this.field5188 != null) {
            this.field5188.method254(true);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)V")
    public final void method2190(boolean arg0) {
        field5169++;
        if (this.field5188 == null) {
            return;
        }
        try {
            this.field5187.field6221 = 0;
            this.field5187.method2563(-13021, 7);
            this.field5187.method2569(-123, 0);
            this.field5188.method255(0, 4, arg0, this.field5187.field6162);
        } catch (IOException var3) {
            try {
                this.field5188.method264((byte) 127);
            } catch (Exception var2) {
            }
            this.field5192 = -2;
            this.field5188 = null;
            this.field5193++;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
    private final int method2191(byte arg0) {
        field5174++;
        if (arg0 != 118) {
            method2183(false);
        }
        return this.field5184.method2330(-14638) + this.field5185.method2330(-14638);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBZIB)Lpaa;")
    public final class318 method2192(int arg0, byte arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 != 44) {
            this.method2186(43);
        }
        field5164++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class318 var8 = new class318();
        var8.field8204 = var6;
        var8.field9006 = arg2;
        var8.field4751 = arg1;
        if (arg2) {
            if (this.method2186(-102) >= 20) {
                throw new RuntimeException();
            }
            this.field5173.method2331(2, var8);
        } else if (this.method2191((byte) 118) < 20) {
            this.field5184.method2331(arg4 - 42, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
    public static void method2193(byte arg0) {
        field5181 = null;
        if (arg0 > 48) {
            field5177 = null;
            field5180 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)V")
    private final void method2194(byte arg0) {
        field5183++;
        if (this.field5188 == null) {
            return;
        }
        try {
            if (arg0 != -64) {
                method2185(false, -107, 35, -52);
            }
            this.field5187.field6221 = 0;
            this.field5187.method2563(-13021, 6);
            this.field5187.method2569(-124, 3);
            this.field5188.method255(0, 4, false, this.field5187.field6162);
        } catch (IOException var3) {
            try {
                this.field5188.method264((byte) 126);
            } catch (Exception var2) {
            }
            this.field5193++;
            this.field5192 = -2;
            this.field5188 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
    public final void method2195(int arg0, boolean arg1) {
        field5167++;
        if (this.field5188 == null) {
            return;
        }
        try {
            this.field5187.field6221 = arg0;
            this.field5187.method2563(-13021, arg1 ? 2 : 3);
            this.field5187.method2569(arg0 - 116, 0);
            this.field5188.method255(0, 4, false, this.field5187.field6162);
        } catch (IOException var4) {
            try {
                this.field5188.method264((byte) 126);
            } catch (Exception var3) {
            }
            this.field5192 = -2;
            this.field5193++;
            this.field5188 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(Z)Z")
    public final boolean method2196(boolean arg0) {
        field5163++;
        if (this.field5188 != null) {
            long var2 = class450.method2719((byte) -43);
            int var4 = (int) (var2 - this.field5186);
            this.field5186 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5189 += var4;
            if (this.field5189 > 30000) {
                try {
                    this.field5188.method264((byte) 125);
                } catch (Exception var27) {
                }
                this.field5188 = null;
            }
        }
        if (this.field5188 == null) {
            return this.method2186(66) == 0 && this.method2191((byte) 118) == 0;
        }
        try {
            this.field5188.method263(arg0);
            if (!arg0) {
                return false;
            }
            for (class318 var5 = (class318) this.field5173.method2333(-1); var5 != null; var5 = (class318) this.field5173.method2327(10005)) {
                this.field5187.field6221 = 0;
                this.field5187.method2563(-13021, 1);
                this.field5187.method2569(-119, (int) var5.field8204);
                this.field5188.method255(0, 4, !arg0, this.field5187.field6162);
                this.field5179.method2331(2, var5);
            }
            for (class318 var6 = (class318) this.field5184.method2333(-1); var6 != null; var6 = (class318) this.field5184.method2327(10005)) {
                this.field5187.field6221 = 0;
                this.field5187.method2563(-13021, 0);
                this.field5187.method2569(-116, (int) var6.field8204);
                this.field5188.method255(0, 4, false, this.field5187.field6162);
                this.field5185.method2331(2, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5188.method257((byte) 68);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5189 = 0;
                byte var9 = 0;
                if (this.field5194 == null) {
                    var9 = 8;
                } else if (this.field5194.field4749 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5191.field6221;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field5188.method259(this.field5191.field6162, this.field5191.field6221, var10, 101);
                    if (this.field5190 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5191.field6162[this.field5191.field6221 + var11] = (byte) class342.method2119(this.field5191.field6162[this.field5191.field6221 + var11], this.field5190);
                        }
                    }
                    this.field5191.field6221 += var10;
                    if (var9 <= this.field5191.field6221) {
                        if (this.field5194 == null) {
                            this.field5191.field6221 = 0;
                            int var12 = this.field5191.method2561((byte) 120);
                            int var13 = this.field5191.method2620(75);
                            int var14 = this.field5191.method2561((byte) -64);
                            int var15 = this.field5191.method2589(-11179);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class318 var21;
                            if (var17) {
                                for (var21 = (class318) this.field5185.method2333(-1); var21 != null && var21.field8204 != var18; var21 = (class318) this.field5185.method2327(10005)) {
                                }
                            } else {
                                for (var21 = (class318) this.field5179.method2333(-1); var21 != null && var21.field8204 != var18; var21 = (class318) this.field5179.method2327(10005)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5194 = var21;
                            this.field5194.field4746 = new class428(this.field5194.field4751 + var22 + var15);
                            this.field5194.field4746.method2563(-13021, var16);
                            this.field5194.field4746.method2576(arg0, var15);
                            this.field5191.field6221 = 0;
                            this.field5194.field4749 = 8;
                        } else if (this.field5194.field4749 != 0) {
                            throw new IOException();
                        } else if (this.field5191.field6162[0] == -1) {
                            this.field5191.field6221 = 0;
                            this.field5194.field4749 = 1;
                        } else {
                            this.field5194 = null;
                        }
                    }
                } else {
                    int var23 = this.field5194.field4746.field6162.length - this.field5194.field4751;
                    int var24 = 512 - this.field5194.field4749;
                    if ((var23 - this.field5194.field4746.field6221) < var24) {
                        var24 = var23 - this.field5194.field4746.field6221;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field5188.method259(this.field5194.field4746.field6162, this.field5194.field4746.field6221, var24, 43);
                    if (this.field5190 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5194.field4746.field6162[this.field5194.field4746.field6221 + var25] = (byte) class342.method2119(this.field5194.field4746.field6162[this.field5194.field4746.field6221 + var25], this.field5190);
                        }
                    }
                    this.field5194.field4746.field6221 += var24;
                    this.field5194.field4749 += var24;
                    if (this.field5194.field4746.field6221 == var23) {
                        this.field5194.method3225(-48);
                        this.field5194.field9003 = false;
                        this.field5194 = null;
                    } else if (this.field5194.field4749 == 512) {
                        this.field5194.field4749 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5188.method264((byte) 126);
            } catch (Exception var26) {
            }
            this.field5188 = null;
            this.field5192 = -2;
            this.field5193++;
            return this.method2186(-6) == 0 && this.method2191((byte) 118) == 0;
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(Z)V")
    public final void method2197(boolean arg0) {
        if (!arg0) {
            this.field5187 = null;
        }
        try {
            this.field5188.method264((byte) 127);
        } catch (Exception var2) {
        }
        field5166++;
        this.field5190 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5188 = null;
        this.field5192 = -1;
        this.field5193++;
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(Z)Z")
    public final boolean method2198(boolean arg0) {
        if (arg0) {
            this.method2198(false);
        }
        field5182++;
        return this.method2186(81) >= 20;
    }
}
