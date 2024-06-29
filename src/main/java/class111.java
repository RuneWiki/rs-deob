import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class111 {

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    private int field2138 = 0;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    private int field2143 = -1;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Lc;")
    private class125 field2144 = new class125();

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Z")
    public boolean field2147 = false;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    private int field2142;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "[Ln;")
    private class142[] field2131;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[[I")
    private int[][] field2141;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
    public static int[] field2133 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "[I")
    public static int[] field2140 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Lc;")
    public static class125 field2145 = new class125();

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static volatile int field2148 = -1;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method746(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2) {
            method751(120);
        }
        field2137++;
        int var9 = arg5 - arg6;
        int var10 = arg7 - arg0;
        int var11 = (arg4 - arg8 << 16) / var10;
        int var12 = (arg3 - arg1 << 16) / var9;
        class21.method94(var12, arg7, arg6, 0, -117, arg8, arg0, 0, var11, arg1, arg5);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static final void method747(boolean arg0) {
        field2139++;
        if (arg0 || class98.field1911 == null) {
            return;
        }
        if (class140.field2595 < 10) {
            if (!class211.field3629.method151(0, class98.field1911.field4164) || !class211.field3629.method151(0, class212.method1372(2, new class66[] { class98.field1911.field4164, class14.field169 }))) {
                class140.field2595 = class26.field327.method160(126, class98.field1911.field4164) / 10;
                return;
            }
            class29.method164(297);
            class140.field2595 = 10;
        }
        if (class140.field2595 == 10) {
            class16.field208 = class98.field1911.field4159 >> 6 << 6;
            class89.field1727 = (class98.field1911.field4158 >> 6 << 6) + 64 - class16.field208;
            class73.field1439 = class98.field1911.field4171 >> 6 << 6;
            int var1 = class16.field208 + class89.field1727 - (class207.field3595.field2053 >> 7) - class34.field512 - 1;
            class35.field527 = 8.0F;
            class69.field1399 = 8.0F;
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            class33.field500 = (class98.field1911.field4162 >> 6 << 6) + 64 - class73.field1439;
            int var3 = (class207.field3595.field2077 >> 7) + class3.field39 - class73.field1439;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && class33.field500 > var4 && var2 >= 0 && var2 < class89.field1727) {
                class144.field2635 = var4;
                class192.field3323 = var2;
            } else {
                class144.field2635 = class98.field1911.field4175 * 64 - class73.field1439;
                class192.field3323 = class16.field208 + class89.field1727 - (class98.field1911.field4180 * 64) - 1;
            }
            class167.method1130(-1);
            int var5 = class226.field3892 >> 1;
            int var6 = class97.field1906 >> 2 << 10;
            int var7 = class89.field1727 >> 6;
            class255.field4480 = new int[class93.field1781 + 1];
            int var8 = class33.field500 >> 6;
            class154.field2752 = new int[var8][var7][];
            class8.field88 = new byte[var8][var7][];
            class234.field4087 = new byte[var8][var7][];
            class209.field3627 = new byte[var8][var7][];
            class9.field98 = new int[var8][var7][];
            class96.field1862 = new byte[var8][var7][];
            class96.field1866 = new short[var8][var7][];
            class129.field2408 = new byte[var8][var7][];
            class120.method818(var5, var6, 68);
            class140.field2595 = 20;
        } else if (class140.field2595 == 20) {
            class95.method653(79, new class249(class211.field3629.method148(class98.field1911.field4164, class54.field938, (byte) 89)));
            class140.field2595 = 30;
            class138.method954(-12915, true);
            class203.method1319((byte) 63);
        } else if (class140.field2595 == 30) {
            class96.method658(81, new class249(class211.field3629.method148(class98.field1911.field4164, class149.field2688, (byte) 104)));
            class140.field2595 = 40;
            class203.method1319((byte) 63);
        } else if (class140.field2595 == 40) {
            class34.method192((byte) 69, new class249(class211.field3629.method148(class98.field1911.field4164, class144.field2630, (byte) 117)));
            class140.field2595 = 50;
            class203.method1319((byte) 53);
        } else if (class140.field2595 == 50) {
            class237.method1568(14904, new class249(class211.field3629.method148(class98.field1911.field4164, class67.field1347, (byte) 102)));
            class140.field2595 = 60;
            class138.method954(-12915, true);
            class203.method1319((byte) 50);
        } else if (class140.field2595 == 60) {
            class178.field3122 = class62.method403(class212.method1372(2, new class66[] { class98.field1911.field4164, class14.field169 }), 12666, class211.field3629);
            class140.field2595 = 70;
            class203.method1319((byte) 103);
        } else if (class140.field2595 == 70) {
            class69.field1398 = new class228(11, true, class131.field2452);
            class140.field2595 = 73;
            class138.method954(-12915, true);
            class203.method1319((byte) 120);
        } else if (class140.field2595 == 73) {
            class49.field883 = new class228(12, true, class131.field2452);
            class140.field2595 = 76;
            class138.method954(-12915, true);
            class203.method1319((byte) 38);
        } else if (class140.field2595 == 76) {
            class82.field1598 = new class228(14, true, class131.field2452);
            class140.field2595 = 79;
            class138.method954(-12915, true);
            class203.method1319((byte) 123);
        } else if (class140.field2595 == 79) {
            class224.field3812 = new class228(17, true, class131.field2452);
            class140.field2595 = 82;
            class138.method954(-12915, true);
            class203.method1319((byte) 49);
        } else if (class140.field2595 == 82) {
            class263.field4621 = new class228(19, true, class131.field2452);
            class140.field2595 = 85;
            class138.method954(-12915, true);
            class203.method1319((byte) 79);
        } else if (class140.field2595 == 85) {
            class145.field2643 = new class228(22, true, class131.field2452);
            class140.field2595 = 88;
            class138.method954(-12915, true);
            class203.method1319((byte) 85);
        } else if (class140.field2595 == 88) {
            class189.field3280 = new class228(26, true, class131.field2452);
            class140.field2595 = 91;
            class138.method954(-12915, true);
            class203.method1319((byte) 86);
        } else {
            class240.field4169 = new class228(30, true, class131.field2452);
            class140.field2595 = 100;
            class138.method954(-12915, true);
            class203.method1319((byte) 25);
            class214.field3684 = -1;
            class15.field196 = -1;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)[[I")
    public final int[][] method748(int arg0) {
        field2135++;
        if (arg0 != -32044) {
            this.field2144 = null;
        }
        if (this.field2142 != this.field2130) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2130; var2++) {
            this.field2131[var2] = class249.field4384;
        }
        return this.field2141;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)[I")
    public final int[] method749(boolean arg0, int arg1) {
        if (arg0) {
            this.method748(30);
        }
        field2129++;
        if (this.field2142 == this.field2130) {
            this.field2147 = this.field2131[arg1] == null;
            this.field2131[arg1] = class249.field4384;
            return this.field2141[arg1];
        } else if (this.field2130 == 1) {
            this.field2147 = this.field2143 != arg1;
            this.field2143 = arg1;
            return this.field2141[0];
        } else {
            class142 var3 = this.field2131[arg1];
            if (var3 == null) {
                this.field2147 = true;
                if (this.field2130 <= this.field2138) {
                    class142 var4 = (class142) this.field2144.method869(30568);
                    var3 = new class142(arg1, var4.field2605);
                    this.field2131[var4.field2604] = null;
                    var4.method560(-17554);
                } else {
                    var3 = new class142(arg1, this.field2138);
                    this.field2138++;
                }
                this.field2131[arg1] = var3;
            } else {
                this.field2147 = false;
            }
            this.field2144.method871((byte) 107, var3);
            return this.field2141[var3.field2605];
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lr;I)Lr;")
    public static final class66 method750(class66 arg0, int arg1) {
        int var2 = class180.method1200(64, arg0);
        field2132++;
        if (arg1 != 14589) {
            field2136 = 117;
        }
        return var2 == -1 ? class10.field108 : class178.field3122.field2161[var2];
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static void method751(int arg0) {
        field2133 = null;
        field2140 = null;
        field2145 = null;
        if (arg0 != 100) {
            method747(true);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V")
    public final void method752(boolean arg0) {
        for (int var2 = 0; var2 < this.field2130; var2++) {
            this.field2141[var2] = null;
        }
        if (!arg0) {
            return;
        }
        this.field2131 = null;
        field2134++;
        this.field2141 = null;
        this.field2144.method864(105);
        this.field2144 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V")
    public static final void method753() {
        for (int var0 = 0; var0 < class224.field3831; var0++) {
            class44 var1 = class80.field1564[var0];
            class32.method186(var1);
            class80.field1564[var0] = null;
        }
        class224.field3831 = 0;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(III)V")
    public class111(int arg0, int arg1, int arg2) {
        this.field2142 = arg1;
        this.field2131 = new class142[this.field2142];
        this.field2130 = arg0;
        this.field2141 = new int[this.field2130][arg2];
    }
}
