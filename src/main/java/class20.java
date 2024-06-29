import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class20 {

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private int field327 = 32;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "J")
    private long field334 = class244.method1644((byte) -51);

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    private int field344 = 0;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "J")
    private long field343 = 0L;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[Lhf;")
    private class168[] field346 = new class168[8];

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "[Lhf;")
    private class168[] field340 = new class168[8];

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    private int field347 = 0;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    private int field345 = 0;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    private int field339 = 0;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Z")
    private boolean field348 = true;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "J")
    private long field341 = 0L;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lli;")
    private static class185 field319 = class245.method1649("glow3:", -106);

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lli;")
    public static class185 field326 = field319;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lli;")
    public static class185 field325 = field319;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Lli;")
    public static class185 field336 = class245.method1649("", 126);

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Lli;")
    public static class185 field332 = field336;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Lli;")
    public static class185 field317 = field336;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Lli;")
    public static class185 field335 = class245.method1649("<col=ff9040>", 122);

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lhf;")
    private class168 field314;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
    public int[] field312;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[Lli;")
    public static class185[] field324;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public void method134(int arg0) throws Exception {
        field321++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBLhf;)V")
    private final void method135(int arg0, byte arg1, class168 arg2) {
        field316++;
        int var4 = arg0 >> 5;
        class168 var5 = this.field340[var4];
        if (var5 == null) {
            this.field346[var4] = arg2;
        } else {
            var5.field3127 = arg2;
        }
        if (arg1 > 82) {
            this.field340[var4] = arg2;
            arg2.field3125 = arg0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final synchronized void method136(int arg0) {
        field333++;
        if (arg0 != 0) {
            this.method148(83, (byte) 11);
        }
        this.field348 = true;
        try {
            this.method145();
        } catch (Exception var2) {
            this.method137();
            this.field341 = class244.method1644((byte) -100) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
    public void method137() {
        field337++;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public final synchronized void method138(int arg0) {
        field328++;
        if (class48.field785 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class48.field785.field386[var3] == this) {
                    class48.field785.field386[var3] = null;
                }
                if (class48.field785.field386[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class48.field785.field387 = true;
                while (class48.field785.field384) {
                    class212.method1488(50L, arg0 ^ 0x5A0F);
                }
                class48.field785 = null;
            }
        }
        this.method137();
        this.field312 = null;
        if (arg0 != -23083) {
            this.field344 = -61;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()I")
    public int method139() throws Exception {
        field330++;
        return this.field338;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public final synchronized void method140(int arg0) {
        field331++;
        if (this.field312 == null) {
            return;
        }
        long var2 = class244.method1644((byte) -128);
        try {
            if (this.field341 != 0L) {
                if (this.field341 > var2) {
                    return;
                }
                this.method134(this.field338);
                this.field348 = true;
                this.field341 = 0L;
            }
            int var4 = this.method139();
            int var5 = this.field349 + this.field342;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field344 - var4 > this.field345) {
                this.field345 = this.field344 - var4;
            }
            if ((var5 + 256) > this.field338) {
                var4 = 0;
                this.field338 += 1024;
                if (this.field338 > 16384) {
                    this.field338 = 16384;
                }
                this.method137();
                this.method134(this.field338);
                if ((var5 + 256) > this.field338) {
                    var5 = this.field338 - 256;
                    this.field342 = var5 - this.field349;
                }
                this.field348 = true;
            }
            while (var4 < var5) {
                this.method144(this.field312, 256);
                var4 += 256;
                this.method147();
            }
            if (this.field343 < var2) {
                if (this.field348) {
                    this.field348 = false;
                } else if (this.field345 == 0 && this.field347 == 0) {
                    this.method137();
                    this.field341 = var2 + 2000L;
                    return;
                } else {
                    this.field342 = Math.min(this.field347, this.field345);
                    this.field347 = this.field345;
                }
                this.field345 = 0;
                this.field343 = var2 + 2000L;
            }
            this.field344 = var4;
        } catch (Exception var7) {
            this.method137();
            this.field341 = var2 + 2000L;
        }
        try {
            if (var2 > this.field334 + 500000L) {
                var2 = this.field334;
            }
            while (var2 > (this.field334 + 5000L)) {
                this.method148(256, (byte) -16);
                this.field334 += (long) (256000 / class271.field4813);
            }
            if (arg0 != 16384) {
                this.field327 = 82;
            }
        } catch (Exception var6) {
            this.field334 = var2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLhf;)V")
    public final synchronized void method141(byte arg0, class168 arg1) {
        int var3 = 89 / ((arg0 + 6) / 48);
        field313++;
        this.field314 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method142(Component arg0) throws Exception {
        field322++;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public static void method143(int arg0) {
        field336 = null;
        field326 = null;
        field332 = null;
        field317 = null;
        if (arg0 != -25785) {
            field335 = null;
        }
        field335 = null;
        field325 = null;
        field324 = null;
        field319 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([II)V")
    private final void method144(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class131.field2349) {
            var3 = arg1 << 1;
        }
        class190.method1372(arg0, 0, var3);
        this.field339 -= arg1;
        if (this.field314 != null && this.field339 <= 0) {
            this.field339 += class271.field4813 >> 4;
            class152.method1080(0, this.field314);
            this.method135(this.field314.method676(), (byte) 114, this.field314);
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
                        class168 var10 = null;
                        class168 var11 = this.field346[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class62 var12 = var11.field3124;
                                if (var12 == null || var12.field1098 <= var8) {
                                    var11.field3126 = true;
                                    int var13 = var11.method347();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1098 += var13;
                                    }
                                    if (var4 >= this.field327) {
                                        break label107;
                                    }
                                    class168 var14 = var11.method342();
                                    if (var14 != null) {
                                        int var15 = var11.field3125;
                                        while (var14 != null) {
                                            this.method135(var15 * var14.method676() >> 8, (byte) 112, var14);
                                            var14 = var11.method336();
                                        }
                                    }
                                    class168 var16 = var11.field3127;
                                    var11.field3127 = null;
                                    if (var10 == null) {
                                        this.field346[var7] = var16;
                                    } else {
                                        var10.field3127 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field340[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3127;
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
                class168 var18 = this.field346[var17];
                this.field346[var17] = this.field340[var17] = null;
                while (var18 != null) {
                    class168 var19 = var18.field3127;
                    var18.field3127 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field339 < 0) {
            this.field339 = 0;
        }
        if (this.field314 != null) {
            this.field314.method356(arg0, 0, arg1);
        }
        this.field334 = class244.method1644((byte) -52);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V")
    public void method145() throws Exception {
        field320++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public final void method146(byte arg0) {
        field329++;
        if (arg0 < 118) {
            this.method135(-99, (byte) -10, (class168) null);
        }
        this.field348 = true;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V")
    public void method147() throws Exception {
        field323++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
    private final void method148(int arg0, byte arg1) {
        if (arg1 >= -3) {
            this.method148(81, (byte) -30);
        }
        this.field339 -= arg0;
        field315++;
        if (this.field339 < 0) {
            this.field339 = 0;
        }
        if (this.field314 != null) {
            this.field314.method354(arg0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static final void method149(boolean arg0) {
        if (arg0) {
            class153.field2896 = class171.field3151;
            class201.field3694 = class268.field4747;
        } else {
            class153.field2896 = class264.field4687;
            class201.field3694 = class60.field1075;
        }
        class42.field641 = class153.field2896.length;
    }
}
