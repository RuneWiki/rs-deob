import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class304 {

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    private int field3983 = 32;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Z")
    private boolean field3985 = false;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "J")
    private long field3988 = class584.method3191(1);

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "J")
    private long field3992 = 0L;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    private int field3993 = 0;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "J")
    private long field3990 = 0L;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    private int field3994 = 0;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    private int field3996 = 0;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "[Lega;")
    private class184[] field3998 = new class184[8];

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "[Lega;")
    private class184[] field3989 = new class184[8];

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Z")
    private boolean field4001 = true;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private int field3995 = 0;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lnj;")
    public static class415 field3979 = new class415(62, 8);

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lra;")
    public static class361 field4002 = new class361(111, 6);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public int field3997;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lega;")
    private class184 field3973;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    public int[] field3978;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 6)
    public final synchronized void method1782(boolean arg0) {
        if (class359.field4657 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class359.field4657.field3518[var3] == this) {
                    class359.field4657.field3518[var3] = null;
                }
                if (class359.field4657.field3518[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class359.field4657.field3520 = true;
                while (class359.field4657.field3519) {
                    class122.method905(50L, -6145);
                }
                class359.field4657 = null;
            }
        }
        field3987++;
        this.method1786();
        this.field3978 = null;
        this.field3985 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLega;)V", line = 48)
    public final synchronized void method1783(byte arg0, class184 arg1) {
        this.field3973 = arg1;
        if (arg0 != 6) {
            this.method1786();
        }
        field3980++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 60)
    public void method1784(int arg0) throws Exception {
        field3971++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([II)V", line = 68)
    private final void method1785(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class669.field9289) {
            var3 = arg1 << 1;
        }
        class443.method2515(arg0, 0, var3);
        this.field3994 -= arg1;
        if (this.field3973 != null && this.field3994 <= 0) {
            this.field3994 += class66.field901 >> 4;
            class388.method2218(this.field3973, 125);
            this.method1789(this.field3973.method1023(), 8, this.field3973);
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
                        class184 var10 = null;
                        class184 var11 = this.field3998[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class320 var12 = var11.field2361;
                                if (var12 == null || var12.field4154 <= var8) {
                                    var11.field2363 = true;
                                    int var13 = var11.method1022();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4154 += var13;
                                    }
                                    if (var4 >= this.field3983) {
                                        break label107;
                                    }
                                    class184 var14 = var11.method997();
                                    if (var14 != null) {
                                        int var15 = var11.field2362;
                                        while (var14 != null) {
                                            this.method1789(var15 * var14.method1023() >> 8, 8, var14);
                                            var14 = var11.method1005();
                                        }
                                    }
                                    class184 var16 = var11.field2360;
                                    var11.field2360 = null;
                                    if (var10 == null) {
                                        this.field3998[var7] = var16;
                                    } else {
                                        var10.field2360 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3989[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2360;
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
                class184 var18 = this.field3998[var17];
                this.field3998[var17] = this.field3989[var17] = null;
                while (var18 != null) {
                    class184 var19 = var18.field2360;
                    var18.field2360 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3994 < 0) {
            this.field3994 = 0;
        }
        if (this.field3973 != null) {
            this.field3973.method1010(arg0, 0, arg1);
        }
        this.field3988 = class584.method3191(1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 227)
    public void method1786() {
        field3982++;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()I", line = 235)
    public int method1787() throws Exception {
        field3969++;
        return this.field3997;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 244)
    public void method1788(Component arg0) throws Exception {
        field3972++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILega;)V", line = 255)
    private final void method1789(int arg0, int arg1, class184 arg2) {
        field3976++;
        int var4 = arg0 >> 5;
        class184 var5 = this.field3989[var4];
        if (arg1 != 8) {
            return;
        }
        if (var5 == null) {
            this.field3998[var4] = arg2;
        } else {
            var5.field2360 = arg2;
        }
        this.field3989[var4] = arg2;
        arg2.field2362 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()V", line = 277)
    public void method1790() throws Exception {
        field3970++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z", line = 285)
    public static final boolean method1791(int arg0, int arg1, int arg2) {
        field3974++;
        if (arg1 != 262144) {
            field4002 = null;
        }
        return class484.method2667(arg2, -13967, arg0) | (arg2 & 0x40000) != 0 || class337.method1932(arg1 ^ 0xFFFBFFFF, arg2, arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V", line = 296)
    private final void method1792(int arg0, boolean arg1) {
        field3984++;
        this.field3994 -= arg0;
        if (arg1) {
            return;
        }
        if (this.field3994 < 0) {
            this.field3994 = 0;
        }
        if (this.field3973 != null) {
            this.field3973.method1020(arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 318)
    public final synchronized void method1793(byte arg0) {
        field3977++;
        this.field4001 = true;
        try {
            this.method1798();
        } catch (Exception var2) {
            this.method1786();
            this.field3990 = class584.method3191(1) + 2000L;
        }
        if (arg0 <= 106) {
            method1797(53);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 341)
    public static final void method1794(int arg0) {
        field3981++;
        class628.method3487(-108);
        if (arg0 != 8) {
            method1797(-107);
        }
        class424.method2439(26);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIZ)V", line = 353)
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3975++;
        class367 var5 = class573.method3057(4, arg3, 2);
        var5.method2115(1);
        if (arg4) {
            field4002 = null;
        }
        var5.field4736 = arg2;
        var5.field4742 = arg0;
        var5.field4735 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V", line = 369)
    public final synchronized void method1796(byte arg0) {
        field3999++;
        if (this.field3985) {
            return;
        }
        long var2 = class584.method3191(1);
        try {
            if (var2 > this.field3988 + 500000L) {
                this.field3988 = var2 - 500000L;
            }
            while (this.field3988 + 5000L < var2) {
                this.method1792(256, false);
                this.field3988 += (256000 / class66.field901);
            }
        } catch (Exception var7) {
            this.field3988 = var2;
        }
        if (this.field3978 == null) {
            return;
        }
        try {
            if (arg0 != 77) {
                this.field3983 = -58;
            }
            if (this.field3990 != 0L) {
                if (var2 < this.field3990) {
                    return;
                }
                this.method1784(this.field3997);
                this.field3990 = 0L;
                this.field4001 = true;
            }
            int var4 = this.method1787();
            if (this.field3995 < this.field3993 - var4) {
                this.field3995 = this.field3993 - var4;
            }
            int var5 = this.field4000 + this.field3991;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3997) {
                this.field3997 += 1024;
                if (this.field3997 > 16384) {
                    this.field3997 = 16384;
                }
                this.method1786();
                this.method1784(this.field3997);
                var4 = 0;
                if (this.field3997 < var5 + 256) {
                    var5 = this.field3997 - 256;
                    this.field3991 = var5 - this.field4000;
                }
                this.field4001 = true;
            }
            while (var4 < var5) {
                this.method1785(this.field3978, 256);
                this.method1790();
                var4 += 256;
            }
            if (this.field3992 < var2) {
                if (this.field4001) {
                    this.field4001 = false;
                } else if (this.field3995 == 0 && this.field3996 == 0) {
                    this.method1786();
                    this.field3990 = var2 + 2000L;
                    return;
                } else {
                    this.field3991 = Math.min(this.field3996, this.field3995);
                    this.field3996 = this.field3995;
                }
                this.field3995 = 0;
                this.field3992 = var2 + 2000L;
            }
            this.field3993 = var4;
        } catch (Exception var6) {
            this.method1786();
            this.field3990 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 494)
    public static void method1797(int arg0) {
        if (arg0 != 256) {
            method1795(-5, 6, 19, 1, true);
        }
        field4002 = null;
        field3979 = null;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()V", line = 529)
    public void method1798() throws Exception {
        field3986++;
    }
}
