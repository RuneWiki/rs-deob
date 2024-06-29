import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class386 {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Z")
    private boolean field5399 = false;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    private int field5411 = 32;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "J")
    private long field5406 = class680.method3756(-124);

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    private int field5416 = 0;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "[Lvw;")
    private class276[] field5421 = new class276[8];

    @OriginalMember(owner = "client!un", name = "A", descriptor = "[Lvw;")
    private class276[] field5424 = new class276[8];

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    private int field5422 = 0;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    private int field5419 = 0;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "Z")
    private boolean field5425 = true;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "J")
    private long field5423 = 0L;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    private int field5415 = 0;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "J")
    private long field5426 = 0L;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public int field5418;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    private int field5427;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Lvw;")
    private class276 field5398;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "[I")
    public int[] field5414;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()I", line = 3)
    public int method2007() throws Exception {
        field5408++;
        return this.field5418;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "()V", line = 15)
    public void method2006() throws Exception {
        field5403++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V", line = 22)
    private final void method2221(int arg0, byte arg1) {
        field5409++;
        this.field5422 -= arg0;
        if (this.field5422 < 0) {
            this.field5422 = 0;
        }
        int var3 = -61 % ((arg1 + 35) / 55);
        if (this.field5398 != null) {
            this.field5398.method1678(arg0);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLvw;)V", line = 41)
    public final synchronized void method2222(byte arg0, class276 arg1) {
        this.field5398 = arg1;
        if (arg0 < 68) {
            this.method2221(-27, (byte) -39);
        }
        field5404++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 53)
    public void method2011(int arg0) throws Exception {
        field5413++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 60)
    public static final void method2223(byte arg0) {
        field5412++;
        if (!class274.field3872.method2433(0, class429.field6020) && class233.field3305 != class122.field1683) {
            class469.method2672(class326.field4813, false, 1, class357.field5117, 11);
            return;
        }
        int var1 = 105 % ((-arg0 - 57) / 56);
        class269.method1633(class630.field8790, (byte) -92);
        if (class233.field3305 != class156.field2354) {
            class640.method3569((byte) -46);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([II)V", line = 84)
    private final void method2224(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class581.field8101) {
            var3 = arg1 << 1;
        }
        class282.method1704(arg0, 0, var3);
        this.field5422 -= arg1;
        if (this.field5398 != null && this.field5422 <= 0) {
            this.field5422 += class29.field359 >> 4;
            class97.method759(this.field5398, -75);
            this.method2226(this.field5398.method1677(), this.field5398, 21131);
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
                        class276 var10 = null;
                        class276 var11 = this.field5421[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class259 var12 = var11.field3875;
                                if (var12 == null || var12.field3700 <= var8) {
                                    var11.field3877 = true;
                                    int var13 = var11.method1674();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3700 += var13;
                                    }
                                    if (var4 >= this.field5411) {
                                        break label107;
                                    }
                                    class276 var14 = var11.method1673();
                                    if (var14 != null) {
                                        int var15 = var11.field3876;
                                        while (var14 != null) {
                                            this.method2226(var15 * var14.method1677() >> 8, var14, 21131);
                                            var14 = var11.method1676();
                                        }
                                    }
                                    class276 var16 = var11.field3874;
                                    var11.field3874 = null;
                                    if (var10 == null) {
                                        this.field5421[var7] = var16;
                                    } else {
                                        var10.field3874 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5424[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3874;
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
                class276 var18 = this.field5421[var17];
                this.field5421[var17] = this.field5424[var17] = null;
                while (var18 != null) {
                    class276 var19 = var18.field3874;
                    var18.field3874 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5422 < 0) {
            this.field5422 = 0;
        }
        if (this.field5398 != null) {
            this.field5398.method1672(arg0, 0, arg1);
        }
        this.field5406 = class680.method3756(-87);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 245)
    public final synchronized void method2225(int arg0) {
        if (class185.field2723 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class185.field2723.field1772[var3] == this) {
                    class185.field2723.field1772[var3] = null;
                }
                if (class185.field2723.field1772[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class185.field2723.field1774 = true;
                while (class185.field2723.field1769) {
                    class419.method2390(125, 50L);
                }
                class185.field2723 = null;
            }
        }
        field5405++;
        if (arg0 != -3) {
            this.field5416 = -35;
        }
        this.method2009();
        this.field5399 = true;
        this.field5414 = null;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "()V", line = 290)
    public void method2009() {
        field5407++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILvw;I)V", line = 299)
    private final void method2226(int arg0, class276 arg1, int arg2) {
        field5410++;
        int var4 = arg0 >> 5;
        class276 var5 = this.field5424[var4];
        if (var5 == null) {
            this.field5421[var4] = arg1;
        } else {
            var5.field3874 = arg1;
        }
        this.field5424[var4] = arg1;
        arg1.field3876 = arg0;
        if (arg2 != 21131) {
            this.field5421 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "()V", line = 323)
    public void method2010() throws Exception {
        field5400++;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 330)
    public final synchronized void method2227(int arg0) {
        field5402++;
        if (this.field5399) {
            return;
        }
        long var2 = class680.method3756(-62);
        try {
            if (var2 > (this.field5406 + 500000L)) {
                this.field5406 = var2 - 500000L;
            }
            while (var2 > this.field5406 + 5000L) {
                this.method2221(256, (byte) 21);
                this.field5406 += (256000 / class29.field359);
            }
        } catch (Exception var8) {
            this.field5406 = var2;
        }
        if (this.field5414 == null) {
            return;
        }
        int var4 = -102 % ((arg0 + 4) / 59);
        try {
            if (this.field5426 != 0L) {
                if (this.field5426 > var2) {
                    return;
                }
                this.method2011(this.field5418);
                this.field5426 = 0L;
                this.field5425 = true;
            }
            int var5 = this.method2007();
            if (this.field5415 < this.field5419 - var5) {
                this.field5415 = this.field5419 - var5;
            }
            int var6 = this.field5427 + this.field5417;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (this.field5418 < var6 + 256) {
                this.field5418 += 1024;
                if (this.field5418 > 16384) {
                    this.field5418 = 16384;
                }
                this.method2009();
                this.method2011(this.field5418);
                var5 = 0;
                this.field5425 = true;
                if (this.field5418 < (var6 + 256)) {
                    var6 = this.field5418 - 256;
                    this.field5427 = var6 - this.field5417;
                }
            }
            while (var6 > var5) {
                this.method2224(this.field5414, 256);
                this.method2006();
                var5 += 256;
            }
            if (this.field5423 < var2) {
                if (this.field5425) {
                    this.field5425 = false;
                } else if (this.field5415 == 0 && this.field5416 == 0) {
                    this.method2009();
                    this.field5426 = var2 + 2000L;
                    return;
                } else {
                    this.field5427 = Math.min(this.field5416, this.field5415);
                    this.field5416 = this.field5415;
                }
                this.field5415 = 0;
                this.field5423 = var2 + 2000L;
            }
            this.field5419 = var5;
        } catch (Exception var7) {
            this.method2009();
            this.field5426 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V", line = 448)
    public final synchronized void method2228(int arg0) {
        field5420++;
        this.field5425 = true;
        try {
            if (arg0 != -25981) {
                this.method2224(null, 113);
            }
            this.method2010();
        } catch (Exception var2) {
            this.method2009();
            this.field5426 = class680.method3756(-58) + 2000L;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 483)
    public void method2008(Component arg0) throws Exception {
        field5401++;
    }
}
