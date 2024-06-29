import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class221 extends class52 {

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    private int field3317 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Ls;")
    private class196 field3294 = new class196(16);

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    private int field3326 = 0;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "Lbo;")
    private class16 field3325 = new class16();

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "J")
    private long field3327 = 0L;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Lnm;")
    private class201 field3311;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    private int field3302;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Z")
    private boolean field3322;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "Lbo;")
    private class16 field3324;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Ldl;")
    private class33 field3312;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    private int field3307;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    private int field3306;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "Z")
    private boolean field3328;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Lcn;")
    private class279 field3308;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "Lnm;")
    private class201 field3318;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Lse;")
    private class4 field3315;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Z")
    public static boolean field3304 = true;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3320 = "Loaded world list data";

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lgk;")
    private class273 field3296;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "Z")
    private boolean field3323;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "[B")
    private byte[] field3310;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)Z", line = 4)
    public static final boolean method1609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 40) {
            return false;
        }
        field3319++;
        for (int var6 = arg5; var6 < arg4; var6++) {
            for (int var7 = arg3; var7 < arg1; var7++) {
                if (class8.field152[var6][var7] == arg0 && class86.field1209[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)I", line = 34)
    public final int method1610(byte arg0) {
        if (arg0 <= 61) {
            this.field3302 = 24;
        }
        field3300++;
        if (this.method432(-1242) == null) {
            return this.field3315 == null ? 0 : this.field3315.method29(-127);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)V", line = 79)
    public final void method1611(byte arg0) {
        field3295++;
        if (this.field3324 != null) {
            if (this.method432(-1242) == null) {
                return;
            }
            if (this.field3322) {
                boolean var6 = true;
                for (class117 var7 = this.field3324.method93((byte) -107); var7 != null; var7 = this.field3324.method97(-122)) {
                    int var8 = (int) var7.field1656;
                    if (this.field3310[var8] == 0) {
                        this.method1613(var8, -100, 1);
                    }
                    if (this.field3310[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method876(8);
                    }
                }
                while (this.field3296.field4138.length > this.field3326) {
                    if (this.field3296.field4138[this.field3326] == 0) {
                        this.field3326++;
                    } else {
                        if (this.field3308.field4249 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3310[this.field3326] == 0) {
                            this.method1613(this.field3326, 124, 1);
                        }
                        if (this.field3310[this.field3326] == 0) {
                            class117 var9 = new class117();
                            var9.field1656 = (long) this.field3326;
                            this.field3324.method106(var9, -128);
                            var6 = false;
                        }
                        this.field3326++;
                    }
                }
                if (var6) {
                    this.field3322 = false;
                    this.field3326 = 0;
                }
            } else if (this.field3323) {
                boolean var2 = true;
                for (class117 var3 = this.field3324.method93((byte) -55); var3 != null; var3 = this.field3324.method97(-108)) {
                    int var4 = (int) var3.field1656;
                    if (this.field3310[var4] != 1) {
                        this.method1613(var4, -27, 2);
                    }
                    if (this.field3310[var4] == 1) {
                        var3.method876(8);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3296.field4138.length > this.field3326) {
                    if (this.field3296.field4138[this.field3326] == 0) {
                        this.field3326++;
                    } else {
                        if (this.field3312.method240(20456)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3310[this.field3326] != 1) {
                            this.method1613(this.field3326, -76, 2);
                        }
                        if (this.field3310[this.field3326] != 1) {
                            var2 = false;
                            class117 var5 = new class117();
                            var5.field1656 = (long) this.field3326;
                            this.field3324.method106(var5, -128);
                        }
                        this.field3326++;
                    }
                }
                if (var2) {
                    this.field3323 = false;
                    this.field3326 = 0;
                }
            } else {
                this.field3324 = null;
            }
        }
        int var10 = -124 % ((50 - arg0) / 32);
        if (!this.field3328 || this.field3327 > class176.method1234(5574)) {
            return;
        }
        for (class4 var11 = (class4) this.field3294.method1406(0); var11 != null; var11 = (class4) this.field3294.method1404(-80)) {
            if (!var11.field118) {
                if (var11.field107) {
                    if (!var11.field108) {
                        throw new RuntimeException();
                    }
                    var11.method876(8);
                } else {
                    var11.field107 = true;
                }
            }
        }
        this.field3327 = class176.method1234(5574) + 1000L;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)I", line = 255)
    public final int method439(int arg0, int arg1) {
        class4 var3 = (class4) this.field3294.method1405((long) arg1, false);
        field3301++;
        if (arg0 == -1) {
            return var3 == null ? 0 : var3.method29(arg0 ^ 0xFFFFFFBE);
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)I", line = 273)
    public final int method1612(boolean arg0) {
        if (arg0) {
            field3299++;
            return this.field3317;
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Lse;", line = 291)
    private final class4 method1613(int arg0, int arg1, int arg2) {
        class4 var4 = (class4) this.field3294.method1405((long) arg0, false);
        if (var4 != null && arg2 == 0 && !var4.field108 && var4.field118) {
            var4.method876(8);
            var4 = null;
        }
        field3292++;
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3311 == null || this.field3310[arg0] == -1) {
                    if (this.field3312.method249((byte) 85)) {
                        return null;
                    }
                    var4 = this.field3312.method234(-2081513200, arg0, this.field3302, (byte) 2, true);
                } else {
                    var4 = this.field3308.method2035(arg0, 18538, this.field3311);
                }
            } else if (arg2 == 1) {
                if (this.field3311 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3308.method2040(arg0, this.field3311, -1760);
            } else if (arg2 == 2) {
                if (this.field3311 == null) {
                    throw new RuntimeException();
                }
                if (this.field3310[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3312.method240(20456)) {
                    return null;
                }
                var4 = this.field3312.method234(-2081513200, arg0, this.field3302, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field3294.method1400((long) arg0, 121, var4);
        }
        if (var4.field118) {
            return null;
        }
        byte[] var5 = var4.method27(118);
        int var6 = 38 / ((49 - arg1) / 62);
        if (!var4 instanceof class189) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class73.field1064.reset();
                class73.field1064.update(var5, 0, var5.length - 2);
                int var11 = (int) class73.field1064.getValue();
                if (this.field3296.field4140[arg0] != var11) {
                    throw new RuntimeException();
                }
                this.field3312.field504 = 0;
                this.field3312.field503 = 0;
            } catch (RuntimeException var15) {
                this.field3312.method243((byte) 10);
                var4.method876(8);
                if (var4.field108 && !this.field3312.method249((byte) 72)) {
                    class166 var13 = this.field3312.method234(-2081513200, arg0, this.field3302, (byte) 2, true);
                    this.field3294.method1400((long) arg0, 111, var13);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3296.field4141[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field3296.field4141[arg0];
            if (this.field3311 != null) {
                this.field3308.method2038(108, this.field3311, var5, arg0);
                if (this.field3310[arg0] != 1) {
                    this.field3317++;
                    this.field3310[arg0] = 1;
                }
            }
            if (!var4.field108) {
                var4.method876(8);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class73.field1064.reset();
            class73.field1064.update(var5, 0, var5.length - 2);
            int var7 = (int) class73.field1064.getValue();
            if (this.field3296.field4140[arg0] != var7) {
                throw new RuntimeException();
            }
            int var8 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3296.field4141[arg0] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field3310[arg0] != 1) {
                if (this.field3310[arg0] == 0) {
                }
                this.field3317++;
                this.field3310[arg0] = 1;
            }
            if (!var4.field108) {
                var4.method876(8);
            }
            return var4;
        } catch (Exception var14) {
            this.field3310[arg0] = -1;
            var4.method876(8);
            if (var4.field108 && !this.field3312.method249((byte) 103)) {
                class166 var10 = this.field3312.method234(-2081513200, arg0, this.field3302, (byte) 2, true);
                this.field3294.method1400((long) arg0, 112, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 510)
    public static final void method1614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= arg2) {
            class329.method2285(arg2, class274.field4158[arg3], (byte) 72, arg4, arg0);
        } else {
            class329.method2285(arg4, class274.field4158[arg3], (byte) -72, arg2, arg0);
        }
        field3313++;
        if (arg1 != -1) {
            method1609(32, 9, -66, 36, -81, -66);
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I", line = 531)
    public final int method1615(int arg0) {
        field3316++;
        if (arg0 != 6008) {
            this.method1618((byte) -61);
        }
        if (this.field3296 == null) {
            return 0;
        } else if (this.field3322) {
            class117 var2 = this.field3324.method93((byte) -116);
            return var2 == null ? 0 : (int) var2.field1656;
        } else {
            return this.field3296.field4132;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I", line = 554)
    public final int method1616(int arg0) {
        field3298++;
        if (arg0 != 0) {
            this.method1612(true);
        }
        return this.field3296 == null ? 0 : this.field3296.field4132;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V", line = 569)
    public final void method433(byte arg0, int arg1) {
        field3293++;
        if (this.field3311 == null) {
            return;
        }
        for (class117 var3 = this.field3325.method93((byte) -60); var3 != null; var3 = this.field3325.method97(-103)) {
            if (((long) arg1) == var3.field1656) {
                return;
            }
        }
        int var4 = 12 / ((arg0 - 32) / 42);
        class117 var5 = new class117();
        var5.field1656 = (long) arg1;
        this.field3325.method106(var5, -126);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[B", line = 600)
    public final byte[] method434(int arg0, int arg1) {
        class4 var3 = this.method1613(arg1, 122, arg0);
        field3321++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method27(127);
            var3.method876(arg0 ^ 0x8);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 617)
    public final void method1617(int arg0) {
        field3303++;
        if (this.field3324 == null) {
            return;
        }
        if (arg0 != -1) {
            method1609(0, 87, 55, 97, 0, 53);
        }
        if (this.method432(-1242) == null) {
            return;
        }
        for (class117 var2 = this.field3325.method93((byte) -99); var2 != null; var2 = this.field3325.method97(-98)) {
            int var3 = (int) var2.field1656;
            if (var3 < 0 || var3 >= this.field3296.field4144 || this.field3296.field4138[var3] == 0) {
                var2.method876(arg0 + 9);
            } else {
                if (this.field3310[var3] == 0) {
                    this.method1613(var3, 127, 1);
                }
                if (this.field3310[var3] == -1) {
                    this.method1613(var3, -70, 2);
                }
                if (this.field3310[var3] == 1) {
                    var2.method876(8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V", line = 661)
    public final void method1618(byte arg0) {
        field3314++;
        if (this.field3311 == null) {
            return;
        }
        int var2 = 92 % ((-arg0 - 49) / 34);
        this.field3323 = true;
        if (this.field3324 == null) {
            this.field3324 = new class16();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lgk;", line = 677)
    public final class273 method432(int arg0) {
        field3305++;
        if (this.field3296 != null) {
            return this.field3296;
        }
        if (this.field3315 == null) {
            if (this.field3312.method249((byte) 112)) {
                return null;
            }
            this.field3315 = this.field3312.method234(-2081513200, this.field3302, 255, (byte) 0, true);
        }
        if (this.field3315.field118) {
            return null;
        } else if (arg0 == -1242) {
            byte[] var2 = this.field3315.method27(117);
            if (this.field3315 instanceof class189) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field3296 = new class273(var2, this.field3307);
                    if (this.field3296.field4149 != this.field3306) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field3296 = null;
                    if (this.field3312.method249((byte) 70)) {
                        this.field3315 = null;
                    } else {
                        this.field3315 = this.field3312.method234(-2081513200, this.field3302, 255, (byte) 0, true);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field3296 = new class273(var2, this.field3307);
                } catch (RuntimeException var6) {
                    this.field3312.method243((byte) 10);
                    this.field3296 = null;
                    if (this.field3312.method249((byte) 72)) {
                        this.field3315 = null;
                    } else {
                        this.field3315 = this.field3312.method234(-2081513200, this.field3302, 255, (byte) 0, true);
                    }
                    return null;
                }
                if (this.field3318 != null) {
                    this.field3308.method2038(105, this.field3318, var2, this.field3302);
                }
            }
            if (this.field3311 != null) {
                this.field3317 = 0;
                this.field3310 = new byte[this.field3296.field4144];
            }
            this.field3315 = null;
            return this.field3296;
        } else {
            return (class273) null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)[F", line = 774)
    public static final float[] method1619(int arg0) {
        field3297++;
        float var1 = class222.method1622() + class222.method1627();
        int var2 = class222.method1631();
        float var3 = (float) ((var2 & 0xFFD5F8) >> 16) / 255.0F;
        class331.field5034[3] = (float) arg0;
        float var4 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        float var5 = 0.58823526F;
        class331.field5034[1] = class308.field4604[1] * var4 * var5 * var1;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class331.field5034[2] = class308.field4604[2] * var6 * var5 * var1;
        class331.field5034[0] = class308.field4604[0] * var3 * var5 * var1;
        return class331.field5034;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V", line = 801)
    public static void method1620(int arg0) {
        field3320 = null;
        if (arg0 != -1) {
            method1614(71, -41, 103, -74, -37);
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILnm;Lnm;Ldl;Lcn;IIZ)V", line = 839)
    public class221(int arg0, class201 arg1, class201 arg2, class33 arg3, class279 arg4, int arg5, int arg6, boolean arg7) {
        this.field3311 = arg1;
        this.field3302 = arg0;
        if (this.field3311 == null) {
            this.field3322 = false;
        } else {
            this.field3322 = true;
            this.field3324 = new class16();
        }
        this.field3312 = arg3;
        this.field3307 = arg5;
        this.field3306 = arg6;
        this.field3328 = arg7;
        this.field3308 = arg4;
        this.field3318 = arg2;
        if (this.field3318 != null) {
            this.field3315 = this.field3308.method2035(this.field3302, 18538, this.field3318);
        }
    }
}
