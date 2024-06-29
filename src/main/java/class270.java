import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class270 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Z")
    private boolean field4079 = false;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    private int field4073 = 32;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "J")
    private long field4072 = class344.method2111((byte) -58);

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "[Lwg;")
    private class281[] field4090 = new class281[8];

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    private int field4092 = 0;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    private int field4089 = 0;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "J")
    private long field4093 = 0L;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "Z")
    private boolean field4101 = true;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    private int field4099 = 0;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    private int field4091 = 0;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "[Lwg;")
    private class281[] field4100 = new class281[8];

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "J")
    private long field4102 = 0L;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
    public static int[] field4082 = new int[3];

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lnd;")
    public static class366 field4085 = new class366(14, 18);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public int field4094;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "Lwg;")
    private class281 field4087;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
    public int[] field4078;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 8)
    private final void method1637(int arg0, int arg1) {
        field4084++;
        if (arg0 != -19182) {
            this.method1645(null, 109, -106);
        }
        this.field4091 -= arg1;
        if (this.field4091 < 0) {
            this.field4091 = 0;
        }
        if (this.field4087 != null) {
            this.field4087.method633(arg1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()I", line = 25)
    public int method582() throws Exception {
        field4080++;
        return this.field4094;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 35)
    public final void method1638(boolean arg0) {
        this.field4101 = arg0;
        field4075++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 44)
    public final synchronized void method1639(byte arg0) {
        if (class100.field1813 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class100.field1813.field1792[var3] == this) {
                    class100.field1813.field1792[var3] = null;
                }
                if (class100.field1813.field1792[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class100.field1813.field1799 = true;
                while (class100.field1813.field1797) {
                    class414.method2437(50L, (byte) -122);
                }
                class100.field1813 = null;
            }
        }
        field4070++;
        int var4 = -101 % ((arg0 + 17) / 51);
        this.method583();
        this.field4078 = null;
        this.field4079 = true;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lwg;I)V", line = 88)
    public final synchronized void method1640(class281 arg0, int arg1) {
        if (arg1 < -7) {
            this.field4087 = arg0;
            field4074++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()V", line = 101)
    public void method580() throws Exception {
        field4076++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 108)
    public static void method1641(int arg0) {
        field4085 = null;
        if (arg0 != 256) {
            field4077 = -88;
        }
        field4082 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 119)
    public final synchronized void method1642(int arg0) {
        field4098++;
        if (this.field4079) {
            return;
        }
        long var2 = class344.method2111((byte) -50);
        try {
            if (var2 > (this.field4072 + 500000L)) {
                this.field4072 = var2 - 500000L;
            }
            while (var2 > (this.field4072 + 5000L)) {
                this.method1637(-19182, 256);
                this.field4072 += (256000 / class170.field2646);
            }
        } catch (Exception var7) {
            this.field4072 = var2;
        }
        if (this.field4078 == null) {
            return;
        }
        try {
            if (this.field4093 != 0L) {
                if (this.field4093 > var2) {
                    return;
                }
                this.method579(this.field4094);
                this.field4093 = 0L;
                this.field4101 = true;
            }
            int var4 = this.method582();
            if ((this.field4099 - var4) > this.field4089) {
                this.field4089 = this.field4099 - var4;
            }
            int var5 = this.field4097 + this.field4095;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (arg0 != -2955) {
                this.field4091 = -87;
            }
            if (this.field4094 < (var5 + 256)) {
                this.field4094 += 1024;
                if (this.field4094 > 16384) {
                    this.field4094 = 16384;
                }
                this.method583();
                var4 = 0;
                this.method579(this.field4094);
                if (this.field4094 < (var5 + 256)) {
                    var5 = this.field4094 - 256;
                    this.field4097 = var5 - this.field4095;
                }
                this.field4101 = true;
            }
            while (var5 > var4) {
                this.method1643(this.field4078, 256);
                this.method580();
                var4 += 256;
            }
            if (this.field4102 < var2) {
                if (this.field4101) {
                    this.field4101 = false;
                } else if (this.field4089 == 0 && this.field4092 == 0) {
                    this.method583();
                    this.field4093 = var2 + 2000L;
                    return;
                } else {
                    this.field4097 = Math.min(this.field4092, this.field4089);
                    this.field4092 = this.field4089;
                }
                this.field4089 = 0;
                this.field4102 = var2 + 2000L;
            }
            this.field4099 = var4;
        } catch (Exception var6) {
            this.method583();
            this.field4093 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([II)V", line = 238)
    private final void method1643(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class236.field3576) {
            var3 = arg1 << 1;
        }
        class356.method2180(arg0, 0, var3);
        this.field4091 -= arg1;
        if (this.field4087 != null && this.field4091 <= 0) {
            this.field4091 += class170.field2646 >> 4;
            class511.method3057(this.field4087, 0);
            this.method1645(this.field4087, this.field4087.method1712(), 102);
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
                        class281 var10 = null;
                        class281 var11 = this.field4090[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class489 var12 = var11.field4261;
                                if (var12 == null || var12.field7449 <= var8) {
                                    var11.field4260 = true;
                                    int var13 = var11.method639();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field7449 += var13;
                                    }
                                    if (var4 >= this.field4073) {
                                        break label107;
                                    }
                                    class281 var14 = var11.method652();
                                    if (var14 != null) {
                                        int var15 = var11.field4263;
                                        while (var14 != null) {
                                            this.method1645(var14, var15 * var14.method1712() >> 8, 112);
                                            var14 = var11.method650();
                                        }
                                    }
                                    class281 var16 = var11.field4262;
                                    var11.field4262 = null;
                                    if (var10 == null) {
                                        this.field4090[var7] = var16;
                                    } else {
                                        var10.field4262 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4100[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4262;
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
                class281 var18 = this.field4090[var17];
                this.field4090[var17] = this.field4100[var17] = null;
                while (var18 != null) {
                    class281 var19 = var18.field4262;
                    var18.field4262 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4091 < 0) {
            this.field4091 = 0;
        }
        if (this.field4087 != null) {
            this.field4087.method643(arg0, 0, arg1);
        }
        this.field4072 = class344.method2111((byte) -72);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V", line = 397)
    public void method583() {
        field4096++;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 408)
    public void method579(int arg0) throws Exception {
        field4069++;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "()V", line = 426)
    public void method578() throws Exception {
        field4083++;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 436)
    public final synchronized void method1644(int arg0) {
        field4071++;
        this.field4101 = true;
        if (arg0 != 0) {
            this.method1637(-82, -122);
        }
        try {
            this.method578();
        } catch (Exception var2) {
            this.method583();
            this.field4093 = class344.method2111((byte) -108) + 2000L;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 458)
    public void method581(Component arg0) throws Exception {
        field4086++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lwg;II)V", line = 468)
    private final void method1645(class281 arg0, int arg1, int arg2) {
        if (arg2 <= 56) {
            return;
        }
        field4088++;
        int var4 = arg1 >> 5;
        class281 var5 = this.field4100[var4];
        if (var5 == null) {
            this.field4090[var4] = arg0;
        } else {
            var5.field4262 = arg0;
        }
        this.field4100[var4] = arg0;
        arg0.field4263 = arg1;
    }
}
