import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class131 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    private int field2181 = 32;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "J")
    private long field2180 = class149.method1024(-14898);

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    private int field2207 = 0;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    private int field2209 = 0;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    private int field2204 = 0;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "[Lj;")
    private class206[] field2210 = new class206[8];

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "J")
    private long field2203 = 0L;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    private int field2206 = 0;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Z")
    private boolean field2202 = true;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "J")
    private long field2212 = 0L;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "[Lj;")
    private class206[] field2214 = new class206[8];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2182 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2178 = 0;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Leg;")
    private static class37 field2195 = class174.method1167("Choose Option", -101);

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Leg;")
    public static class37 field2192 = field2195;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "B")
    public static byte field2191;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    private int field2213;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lj;")
    private class206 field2197;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    public int[] field2194;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public final synchronized void method931(int arg0) {
        field2196++;
        if (class247.field4441 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class247.field4441.field3821[var3] == this) {
                    class247.field4441.field3821[var3] = null;
                }
                if (class247.field4441.field3821[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class247.field4441.field3815 = true;
                while (class247.field4441.field3818) {
                    class144.method1008(77, 50L);
                }
                class247.field4441 = null;
            }
        }
        this.method630();
        this.field2194 = null;
        if (arg0 != -6387) {
            this.method937(-90, (class206) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method932(boolean arg0) {
        field2192 = null;
        field2195 = null;
        if (arg0) {
            field2182 = -64;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method933(int arg0) {
        this.field2202 = true;
        field2183++;
        int var2 = 95 % ((arg0 - 4) / 48);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([II)V")
    private final void method934(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class225.field3868) {
            var3 = arg1 << 1;
        }
        class54.method354(arg0, 0, var3);
        this.field2204 -= arg1;
        if (this.field2197 != null && this.field2204 <= 0) {
            this.field2204 += class215.field3720 >> 4;
            class68.method470(this.field2197, (byte) -17);
            this.method939(this.field2197.method399(), -1147510779, this.field2197);
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
                        class206 var10 = null;
                        class206 var11 = this.field2210[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class135 var12 = var11.field3495;
                                if (var12 == null || var12.field2336 <= var8) {
                                    var11.field3494 = true;
                                    int var13 = var11.method396();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2336 += var13;
                                    }
                                    if (var4 >= this.field2181) {
                                        break label107;
                                    }
                                    class206 var14 = var11.method411();
                                    if (var14 != null) {
                                        int var15 = var11.field3496;
                                        while (var14 != null) {
                                            this.method939(var15 * var14.method399() >> 8, -1147510779, var14);
                                            var14 = var11.method395();
                                        }
                                    }
                                    class206 var16 = var11.field3497;
                                    var11.field3497 = null;
                                    if (var10 == null) {
                                        this.field2210[var7] = var16;
                                    } else {
                                        var10.field3497 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2214[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3497;
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
                class206 var18 = this.field2210[var17];
                this.field2210[var17] = this.field2214[var17] = null;
                while (var18 != null) {
                    class206 var19 = var18.field3497;
                    var18.field3497 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2204 < 0) {
            this.field2204 = 0;
        }
        if (this.field2197 != null) {
            this.field2197.method391(arg0, 0, arg1);
        }
        this.field2180 = class149.method1024(-14898);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
    public void method627() throws Exception {
        field2186++;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public void method628(int arg0) throws Exception {
        field2198++;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
    public void method629() throws Exception {
        field2201++;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public final synchronized void method935(int arg0) {
        field2200++;
        this.field2202 = true;
        try {
            this.method629();
            if (arg0 != 16128) {
                this.field2209 = 105;
            }
        } catch (Exception var2) {
            this.method630();
            this.field2212 = class149.method1024(-14898) + 2000L;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()V")
    public void method630() {
        field2188++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final synchronized void method936(byte arg0) {
        field2190++;
        if (this.field2194 == null) {
            return;
        }
        long var2 = class149.method1024(-14898);
        try {
            if (arg0 != -34) {
                return;
            }
            if (this.field2212 != 0L) {
                if (this.field2212 > var2) {
                    return;
                }
                this.method628(this.field2211);
                this.field2202 = true;
                this.field2212 = 0L;
            }
            int var4 = this.method632();
            if ((this.field2209 - var4) > this.field2206) {
                this.field2206 = this.field2209 - var4;
            }
            int var5 = this.field2213 + this.field2205;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2211) {
                this.field2211 += 1024;
                if (this.field2211 > 16384) {
                    this.field2211 = 16384;
                }
                this.method630();
                this.method628(this.field2211);
                var4 = 0;
                this.field2202 = true;
                if ((var5 + 256) > this.field2211) {
                    var5 = this.field2211 - 256;
                    this.field2213 = var5 - this.field2205;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method934(this.field2194, 256);
                this.method627();
            }
            if (var2 > this.field2203) {
                if (this.field2202) {
                    this.field2202 = false;
                } else if (this.field2206 == 0 && this.field2207 == 0) {
                    this.method630();
                    this.field2212 = var2 + 2000L;
                    return;
                } else {
                    this.field2213 = Math.min(this.field2207, this.field2206);
                    this.field2207 = this.field2206;
                }
                this.field2203 = var2 + 2000L;
                this.field2206 = 0;
            }
            this.field2209 = var4;
        } catch (Exception var7) {
            this.method630();
            this.field2212 = var2 + 2000L;
        }
        try {
            if (this.field2180 + 500000L < var2) {
                var2 = this.field2180;
            }
            while (this.field2180 + 5000L < var2) {
                this.method940(arg0 + 151, 256);
                this.field2180 += (long) (256000 / class215.field3720);
            }
        } catch (Exception var6) {
            this.field2180 = var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILj;)V")
    public final synchronized void method937(int arg0, class206 arg1) {
        this.field2197 = arg1;
        field2184++;
        if (arg0 != 16883) {
            this.method936((byte) -107);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public static final void method938(int arg0, int arg1, int arg2) {
        class274 var3 = class166.method1116(7, arg2, true);
        var3.method1835(-27);
        field2208++;
        var3.field4802 = arg1;
        int var4 = -43 / ((-arg0 - 40) / 45);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILj;)V")
    private final void method939(int arg0, int arg1, class206 arg2) {
        field2189++;
        if (arg1 != -1147510779) {
            this.method931(110);
        }
        int var4 = arg0 >> 5;
        class206 var5 = this.field2214[var4];
        if (var5 == null) {
            this.field2210[var4] = arg2;
        } else {
            var5.field3497 = arg2;
        }
        this.field2214[var4] = arg2;
        arg2.field3496 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    private final void method940(int arg0, int arg1) {
        field2199++;
        this.field2204 -= arg1;
        if (this.field2204 < 0) {
            this.field2204 = 0;
        }
        if (this.field2197 != null) {
            this.field2197.method394(arg1);
        }
        int var3 = -69 / ((62 - arg0) / 55);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method631(Component arg0) throws Exception {
        field2185++;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
    public int method632() throws Exception {
        field2187++;
        return this.field2211;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjl;II)Z")
    public static final boolean method941(int arg0, class101 arg1, int arg2, int arg3) {
        field2179++;
        byte[] var4 = arg1.method666(arg2, arg0, (byte) -51);
        if (var4 == null) {
            return false;
        }
        if (arg3 > -18) {
            field2178 = 99;
        }
        class280.method1882((byte) 43, var4);
        return true;
    }
}
