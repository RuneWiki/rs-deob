import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class347 extends class449 {

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    private int field5178 = 0;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Lvg;")
    private class56 field5156 = new class56(16);

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
    private int field5187 = 0;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "Lnv;")
    private class44 field5185 = new class44();

    @OriginalMember(owner = "client!ho", name = "O", descriptor = "J")
    private long field5189 = 0L;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    private int field5158;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "Lcn;")
    private class14 field5160;

    @OriginalMember(owner = "client!ho", name = "N", descriptor = "Z")
    private boolean field5188;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "Lnv;")
    private class44 field5186;

    @OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
    private int field5163;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    private int field5171;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "Lcn;")
    private class14 field5157;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "Lgf;")
    private class402 field5177;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "Lru;")
    private class379 field5181;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "Z")
    private boolean field5190;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "Lp;")
    private class187 field5162;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field5172 = 0;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field5179 = 0;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "Lsq;")
    private class366 field5180;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "Z")
    private boolean field5184;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "[B")
    private byte[] field5155;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field5161;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "[[B")
    public static byte[][] field5175;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V", line = 10)
    public static void method2225(byte arg0) {
        field5161 = null;
        if (arg0 > 19) {
            field5175 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I", line = 22)
    public final int method2226(int arg0) {
        field5164++;
        if (this.method2230((byte) 113) == null) {
            return this.field5162 == null ? 0 : this.field5162.method842(8030);
        } else if (arg0 == 100) {
            return 100;
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)I", line = 42)
    public final int method2227(int arg0) {
        if (arg0 != 0) {
            this.method2229((byte) -34);
        }
        field5182++;
        if (this.field5180 == null) {
            return 0;
        } else if (this.field5188) {
            class130 var2 = this.field5186.method295((byte) -59);
            return var2 == null ? 0 : (int) var2.field1932;
        } else {
            return this.field5180.field5391;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)I", line = 68)
    public final int method2228(byte arg0, int arg1) {
        field5174++;
        class187 var3 = (class187) this.field5156.method358((byte) -118, (long) arg1);
        if (arg0 < 59) {
            this.field5171 = -126;
        }
        return var3 == null ? 0 : var3.method842(8030);
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V", line = 85)
    public final void method2229(byte arg0) {
        field5183++;
        if (this.field5160 == null) {
            return;
        }
        this.field5184 = true;
        if (this.field5186 == null) {
            this.field5186 = new class44();
        }
        int var2 = 9 / ((arg0 - 60) / 62);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Lsq;", line = 105)
    public final class366 method2230(byte arg0) {
        if (arg0 <= 106) {
            this.field5158 = 13;
        }
        field5168++;
        if (this.field5180 != null) {
            return this.field5180;
        }
        if (this.field5162 == null) {
            if (this.field5177.method2530(0)) {
                return null;
            }
            this.field5162 = this.field5177.method2523(true, (byte) 0, 255, this.field5158, true);
        }
        if (this.field5162.field2870) {
            return null;
        }
        byte[] var2 = this.field5162.method841(9267);
        if (this.field5162 instanceof class422) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5180 = new class366(var2, this.field5163);
                if (this.field5180.field5390 != this.field5171) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5180 = null;
                if (this.field5177.method2530(0)) {
                    this.field5162 = null;
                } else {
                    this.field5162 = this.field5177.method2523(true, (byte) 0, 255, this.field5158, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5180 = new class366(var2, this.field5163);
            } catch (RuntimeException var4) {
                this.field5177.method2521(512);
                this.field5180 = null;
                if (this.field5177.method2530(0)) {
                    this.field5162 = null;
                } else {
                    this.field5162 = this.field5177.method2523(true, (byte) 0, 255, this.field5158, true);
                }
                return null;
            }
            if (this.field5157 != null) {
                this.field5181.method2412(this.field5158, var2, 6569, this.field5157);
            }
        }
        this.field5162 = null;
        if (this.field5160 != null) {
            this.field5178 = 0;
            this.field5155 = new byte[this.field5180.field5385];
        }
        return this.field5180;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)[B", line = 207)
    public final byte[] method2231(int arg0, int arg1) {
        field5170++;
        class187 var3 = this.method2234(arg0, -1, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method841(arg1 ^ 0x2433);
            var3.method947((byte) 101);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(B)I", line = 235)
    public final int method2232(byte arg0) {
        field5159++;
        if (arg0 == 33) {
            return this.field5180 == null ? 0 : this.field5180.field5391;
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 251)
    public final void method2233(int arg0) {
        field5173++;
        if (this.field5186 == null || this.method2230((byte) 124) == null) {
            return;
        }
        for (class130 var2 = this.field5185.method295((byte) -3); var2 != null; var2 = this.field5185.method296(true)) {
            int var3 = (int) var2.field1932;
            if (var3 < 0 || this.field5180.field5385 <= var3 || this.field5180.field5389[var3] == 0) {
                var2.method947((byte) 119);
            } else {
                if (this.field5155[var3] == 0) {
                    this.method2234(var3, -1, 1);
                }
                if (this.field5155[var3] == -1) {
                    this.method2234(var3, -1, 2);
                }
                if (this.field5155[var3] == 1) {
                    var2.method947((byte) 111);
                }
            }
        }
        if (arg0 >= -93) {
            this.method2237(18);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Lp;", line = 299)
    private final class187 method2234(int arg0, int arg1, int arg2) {
        field5166++;
        class187 var4 = (class187) this.field5156.method358((byte) -118, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field2871 && var4.field2870) {
            var4.method947((byte) 123);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5160 == null || this.field5155[arg0] == -1) {
                    if (this.field5177.method2530(0)) {
                        return null;
                    }
                    var4 = this.field5177.method2523(true, (byte) 2, this.field5158, arg0, true);
                } else {
                    var4 = this.field5181.method2414(this.field5160, 2, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field5160 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5181.method2413(arg0, this.field5160, (byte) -97);
            } else if (arg2 == 2) {
                if (this.field5160 == null) {
                    throw new RuntimeException();
                }
                if (this.field5155[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5177.method2531(127)) {
                    return null;
                }
                var4 = this.field5177.method2523(true, (byte) 2, this.field5158, arg0, false);
            } else {
                throw new RuntimeException();
            }
            this.field5156.method357(var4, 1, (long) arg0);
        }
        if (arg1 != -1) {
            this.method2233(-64);
        }
        if (var4.field2870) {
            return null;
        }
        byte[] var5 = var4.method841(9267);
        if (!var4 instanceof class422) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class413.field6090.reset();
                class413.field6090.update(var5, 0, var5.length - 2);
                int var6 = (int) class413.field6090.getValue();
                if (this.field5180.field5400[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field5177.field5956 = 0;
                this.field5177.field5953 = 0;
            } catch (RuntimeException var12) {
                this.field5177.method2521(arg1 + 513);
                var4.method947((byte) 92);
                if (var4.field2871 && !this.field5177.method2530(0)) {
                    class105 var7 = this.field5177.method2523(true, (byte) 2, this.field5158, arg0, true);
                    this.field5156.method357(var7, 1, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5180.field5399[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field5180.field5399[arg0];
            if (this.field5160 != null) {
                this.field5181.method2412(arg0, var5, arg1 ^ 0xFFFFE656, this.field5160);
                if (this.field5155[arg0] != 1) {
                    this.field5178++;
                    this.field5155[arg0] = 1;
                }
            }
            if (!var4.field2871) {
                var4.method947((byte) 120);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class413.field6090.reset();
            class413.field6090.update(var5, 0, var5.length - 2);
            int var8 = (int) class413.field6090.getValue();
            if (this.field5180.field5400[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5180.field5399[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field5155[arg0] != 1) {
                this.field5178++;
                this.field5155[arg0] = 1;
            }
            if (!var4.field2871) {
                var4.method947((byte) 94);
            }
            return var4;
        } catch (Exception var11) {
            this.field5155[arg0] = -1;
            var4.method947((byte) 118);
            if (var4.field2871 && !this.field5177.method2530(0)) {
                class105 var10 = this.field5177.method2523(true, (byte) 2, this.field5158, arg0, true);
                this.field5156.method357(var10, 1, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(ILcn;Lcn;Lgf;Lru;IIZ)V", line = 803)
    public class347(int arg0, class14 arg1, class14 arg2, class402 arg3, class379 arg4, int arg5, int arg6, boolean arg7) {
        this.field5158 = arg0;
        this.field5160 = arg1;
        if (this.field5160 == null) {
            this.field5188 = false;
        } else {
            this.field5188 = true;
            this.field5186 = new class44();
        }
        this.field5163 = arg5;
        this.field5171 = arg6;
        this.field5157 = arg2;
        this.field5177 = arg3;
        this.field5181 = arg4;
        this.field5190 = arg7;
        if (this.field5157 != null) {
            this.field5162 = this.field5181.method2414(this.field5157, 2, this.field5158);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V", line = 518)
    public final void method2235(boolean arg0, int arg1) {
        field5169++;
        if (this.field5160 == null) {
            return;
        }
        for (class130 var3 = this.field5185.method295((byte) -90); var3 != null; var3 = this.field5185.method296(true)) {
            if (((long) arg1) == var3.field1932) {
                return;
            }
        }
        class130 var4 = new class130();
        var4.field1932 = arg1;
        if (arg0) {
            this.field5181 = null;
        }
        this.field5185.method292((byte) 121, var4);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(BI)I", line = 548)
    public static final int method2236(byte arg0, int arg1) {
        if (arg0 != -16) {
            return 88;
        }
        field5165++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 595)
    public final void method2237(int arg0) {
        field5176++;
        if (this.field5186 != null) {
            if (this.method2230((byte) 117) == null) {
                return;
            }
            if (this.field5188) {
                boolean var2 = true;
                for (class130 var3 = this.field5186.method295((byte) 110); var3 != null; var3 = this.field5186.method296(true)) {
                    int var5 = (int) var3.field1932;
                    if (this.field5155[var5] == 0) {
                        this.method2234(var5, -1, 1);
                    }
                    if (this.field5155[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method947((byte) 93);
                    }
                }
                while (this.field5180.field5389.length > this.field5187) {
                    if (this.field5180.field5389[this.field5187] == 0) {
                        this.field5187++;
                    } else {
                        if (this.field5181.field5592 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5155[this.field5187] == 0) {
                            this.method2234(this.field5187, -1, 1);
                        }
                        if (this.field5155[this.field5187] == 0) {
                            class130 var4 = new class130();
                            var4.field1932 = this.field5187;
                            this.field5186.method292((byte) 121, var4);
                            var2 = false;
                        }
                        this.field5187++;
                    }
                }
                if (var2) {
                    this.field5188 = false;
                    this.field5187 = 0;
                }
            } else if (this.field5184) {
                boolean var6 = true;
                for (class130 var7 = this.field5186.method295((byte) 115); var7 != null; var7 = this.field5186.method296(true)) {
                    int var9 = (int) var7.field1932;
                    if (this.field5155[var9] != 1) {
                        this.method2234(var9, -1, 2);
                    }
                    if (this.field5155[var9] == 1) {
                        var7.method947((byte) 117);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5180.field5389.length > this.field5187) {
                    if (this.field5180.field5389[this.field5187] == 0) {
                        this.field5187++;
                    } else {
                        if (this.field5177.method2531(120)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5155[this.field5187] != 1) {
                            this.method2234(this.field5187, -1, 2);
                        }
                        if (this.field5155[this.field5187] != 1) {
                            class130 var8 = new class130();
                            var8.field1932 = this.field5187;
                            var6 = false;
                            this.field5186.method292((byte) 121, var8);
                        }
                        this.field5187++;
                    }
                }
                if (var6) {
                    this.field5184 = false;
                    this.field5187 = 0;
                }
            } else {
                this.field5186 = null;
            }
        }
        if (this.field5190 && this.field5189 <= class375.method2397((byte) -75)) {
            for (class187 var10 = (class187) this.field5156.method359(true); var10 != null; var10 = (class187) this.field5156.method365(-94)) {
                if (!var10.field2870) {
                    if (var10.field2872) {
                        if (!var10.field2871) {
                            throw new RuntimeException();
                        }
                        var10.method947((byte) 126);
                    } else {
                        var10.field2872 = true;
                    }
                }
            }
            this.field5189 = class375.method2397((byte) -75) + 1000L;
        }
        if (arg0 > -42) {
            this.method2229((byte) -97);
        }
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)I", line = 782)
    public final int method2238(int arg0) {
        field5167++;
        int var2 = -108 % ((arg0 + 46) / 61);
        return this.field5178;
    }
}
