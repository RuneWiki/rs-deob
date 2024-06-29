import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class161 {

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    private int field2141 = 32;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "Z")
    private boolean field2144 = false;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "J")
    private long field2128 = class502.method2786(-7114);

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "Z")
    private boolean field2145 = true;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    private int field2149 = 0;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "J")
    private long field2148 = 0L;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "[Lkm;")
    private class476[] field2150 = new class476[8];

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "[Lkm;")
    private class476[] field2151 = new class476[8];

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    private int field2147 = 0;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    private int field2152 = 0;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "J")
    private long field2154 = 0L;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
    private int field2156 = 0;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Lkm;")
    private class476 field2138;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lhh;")
    public static class554 field2125;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "[I")
    public int[] field2133;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()V", line = 3)
    public void method570() {
        field2134++;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 10)
    public static void method1023(int arg0) {
        field2125 = null;
        if (arg0 != 32) {
            method1024('y', -124);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(CI)Z", line = 22)
    public static final boolean method1024(char arg0, int arg1) {
        field2126++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            int var2 = 39 % ((82 - arg1) / 33);
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "()V", line = 42)
    public void method572() throws Exception {
        field2135++;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Z", line = 49)
    public static final boolean method1025(int arg0, int arg1) {
        if (arg1 != -14896) {
            field2125 = null;
        }
        field2136++;
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "()I", line = 61)
    public int method569() throws Exception {
        field2130++;
        return this.field2146;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 69)
    public final synchronized void method1026(byte arg0) {
        field2143++;
        if (class335.field4079 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class335.field4079.field9272[var3] == this) {
                    class335.field4079.field9272[var3] = null;
                }
                if (class335.field4079.field9272[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class335.field4079.field9275 = true;
                while (class335.field4079.field9273) {
                    class591.method3181(50L, 0);
                }
                class335.field4079 = null;
            }
        }
        this.method570();
        this.field2144 = true;
        if (arg0 != -104) {
            this.method1026((byte) -104);
        }
        this.field2133 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V", line = 113)
    public final synchronized void method1027(int arg0) {
        field2140++;
        int var2 = 1 / ((arg0 + 28) / 55);
        if (this.field2144) {
            return;
        }
        long var3 = class502.method2786(-7114);
        try {
            if (var3 > (this.field2128 + 6000L)) {
                this.field2128 = var3 - 6000L;
            }
            while (this.field2128 + 5000L < var3) {
                this.method1032(256, 2020);
                this.field2128 += (256000 / class791.field10837);
                var3 = class502.method2786(-7114);
            }
        } catch (Exception var8) {
            this.field2128 = var3;
        }
        if (this.field2133 == null) {
            return;
        }
        try {
            if (this.field2148 != 0L) {
                if (this.field2148 > var3) {
                    return;
                }
                this.method571(this.field2146);
                this.field2148 = 0L;
                this.field2145 = true;
            }
            int var5 = this.method569();
            if (this.field2149 - var5 > this.field2156) {
                this.field2156 = this.field2149 - var5;
            }
            int var6 = this.field2153 + this.field2155;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field2146) {
                this.field2146 += 1024;
                if (this.field2146 > 16384) {
                    this.field2146 = 16384;
                }
                this.method570();
                var5 = 0;
                this.method571(this.field2146);
                this.field2145 = true;
                if (this.field2146 < var6 + 256) {
                    var6 = this.field2146 - 256;
                    this.field2155 = var6 - this.field2153;
                }
            }
            while (var6 > var5) {
                this.method1033(this.field2133, 256);
                var5 += 256;
                this.method572();
            }
            if (this.field2154 < var3) {
                if (this.field2145) {
                    this.field2145 = false;
                } else if (this.field2156 == 0 && this.field2147 == 0) {
                    this.method570();
                    this.field2148 = var3 + 2000L;
                    return;
                } else {
                    this.field2155 = Math.min(this.field2147, this.field2156);
                    this.field2147 = this.field2156;
                }
                this.field2154 = var3 + 2000L;
                this.field2156 = 0;
            }
            this.field2149 = var5;
        } catch (Exception var7) {
            this.method570();
            this.field2148 = var3 + 2000L;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lkm;II)V", line = 228)
    private final void method1028(class476 arg0, int arg1, int arg2) {
        field2124++;
        int var4 = arg1 >> 5;
        class476 var5 = this.field2150[var4];
        if (var5 == null) {
            this.field2151[var4] = arg0;
        } else {
            var5.field6184 = arg0;
        }
        this.field2150[var4] = arg0;
        if (arg2 != 12646) {
            this.field2138 = null;
        }
        arg0.field6181 = arg1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lkm;I)V", line = 254)
    public final synchronized void method1029(class476 arg0, int arg1) {
        field2137++;
        this.field2138 = arg0;
        if (arg1 != 26707) {
            this.method1027(69);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 265)
    public void method573(Component arg0) throws Exception {
        field2132++;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V", line = 273)
    public final synchronized void method1030(byte arg0) {
        field2131++;
        this.field2145 = true;
        try {
            this.method574();
        } catch (Exception var2) {
            this.method570();
            this.field2148 = class502.method2786(-7114) + 2000L;
        }
        if (arg0 <= 107) {
            this.field2152 = -108;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lcv;", line = 294)
    public static final class567 method1031(Throwable arg0, String arg1) {
        field2139++;
        class567 var2;
        if ((arg0 instanceof class567)) {
            var2 = (class567) arg0;
            var2.field7174 = var2.field7174 + ' ' + arg1;
        } else {
            var2 = new class567(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V", line = 313)
    private final void method1032(int arg0, int arg1) {
        if (arg1 != 2020) {
            this.field2149 = 56;
        }
        field2127++;
        this.field2152 -= arg0;
        if (this.field2152 < 0) {
            this.field2152 = 0;
        }
        if (this.field2138 != null) {
            this.field2138.method36(arg0);
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V", line = 333)
    public void method571(int arg0) throws Exception {
        field2129++;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([II)V", line = 342)
    private final void method1033(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class654.field8426) {
            var3 = arg1 << 1;
        }
        class642.method3477(arg0, 0, var3);
        this.field2152 -= arg1;
        if (this.field2138 != null && this.field2152 <= 0) {
            this.field2152 += class791.field10837 >> 4;
            class365.method2100(3, this.field2138);
            this.method1028(this.field2138, this.field2138.method2680(), 12646);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class476 var10 = null;
                        class476 var11 = this.field2151[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class300 var12 = var11.field6183;
                                if (var12 == null || var12.field3799 <= var8) {
                                    var11.field6182 = true;
                                    int var13 = var11.method31();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3799 += var13;
                                    }
                                    if (var4 >= this.field2141) {
                                        break label107;
                                    }
                                    class476 var14 = var11.method42();
                                    if (var14 != null) {
                                        int var15 = var11.field6181;
                                        while (var14 != null) {
                                            this.method1028(var14, var15 * var14.method2680() >> 8, 12646);
                                            var14 = var11.method40();
                                        }
                                    }
                                    class476 var16 = var11.field6184;
                                    var11.field6184 = null;
                                    if (var10 == null) {
                                        this.field2151[var7] = var16;
                                    } else {
                                        var10.field6184 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2150[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6184;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class476 var18 = this.field2151[var17];
                this.field2151[var17] = this.field2150[var17] = null;
                while (var18 != null) {
                    class476 var19 = var18.field6184;
                    var18.field6184 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2152 < 0) {
            this.field2152 = 0;
        }
        if (this.field2138 != null) {
            this.field2138.method33(arg0, 0, arg1);
        }
        this.field2128 = class502.method2786(-7114);
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "()V", line = 508)
    public void method574() throws Exception {
        field2142++;
    }
}
