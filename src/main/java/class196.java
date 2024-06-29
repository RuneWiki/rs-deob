import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class196 {

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Z")
    private boolean field3125 = false;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    private int field3122 = 32;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "J")
    private long field3116 = class47.method371(72);

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "Z")
    private boolean field3140 = true;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "[Ljk;")
    private class363[] field3145 = new class363[8];

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "J")
    private long field3139 = 0L;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    private int field3146 = 0;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    private int field3138 = 0;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    private int field3149 = 0;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "J")
    private long field3150 = 0L;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "[Ljk;")
    private class363[] field3141 = new class363[8];

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    private int field3151 = 0;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Lmg;")
    public static class116 field3121 = new class116();

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field3132 = -1;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    private int field3143;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Ljk;")
    private class363 field3129;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "Lth;")
    public static class57 field3137;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "[I")
    public static int[] field3131;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "[I")
    public int[] field3134;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 7)
    public final synchronized void method1512(byte arg0) {
        field3119++;
        if (class229.field3811 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class229.field3811.field2330[var3] == this) {
                    class229.field3811.field2330[var3] = null;
                }
                if (class229.field3811.field2330[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class229.field3811.field2337 = true;
                while (class229.field3811.field2338) {
                    class283.method2076((byte) -117, 50L);
                }
                class229.field3811 = null;
            }
        }
        this.method740();
        if (arg0 < 13) {
            field3137 = (class57) null;
        }
        this.field3134 = null;
        this.field3125 = true;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([II)V", line = 51)
    private final void method1513(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class232.field3855) {
            var3 = arg1 << 1;
        }
        class242.method1847(arg0, 0, var3);
        this.field3138 -= arg1;
        if (this.field3129 != null && this.field3138 <= 0) {
            this.field3138 += class227.field3788 >> 4;
            class79.method652(this.field3129, 23744);
            this.method1522(1986222213, this.field3129.method1052(), this.field3129);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class363 var10 = null;
                        class363 var11 = this.field3141[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class219 var12 = var11.field5750;
                                if (var12 == null || var12.field3476 <= var8) {
                                    var11.field5747 = true;
                                    int var13 = var11.method46();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3476 += var13;
                                    }
                                    if (var4 >= this.field3122) {
                                        break label105;
                                    }
                                    class363 var14 = var11.method43();
                                    if (var14 != null) {
                                        int var15 = var11.field5748;
                                        while (var14 != null) {
                                            this.method1522(1986222213, var15 * var14.method1052() >> 8, var14);
                                            var14 = var11.method47();
                                        }
                                    }
                                    class363 var16 = var11.field5749;
                                    var11.field5749 = null;
                                    if (var10 == null) {
                                        this.field3141[var7] = var16;
                                    } else {
                                        var10.field5749 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3145[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5749;
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
                class363 var18 = this.field3141[var17];
                this.field3141[var17] = this.field3145[var17] = null;
                while (var18 != null) {
                    class363 var19 = var18.field5749;
                    var18.field5749 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3138 < 0) {
            this.field3138 = 0;
        }
        if (this.field3129 != null) {
            this.field3129.method53(arg0, 0, arg1);
        }
        this.field3116 = class47.method371(59);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "()V", line = 210)
    public void method742() throws Exception {
        field3124++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V", line = 218)
    private final void method1514(byte arg0, int arg1) {
        this.field3138 -= arg1;
        field3114++;
        if (arg0 < 64) {
            this.field3138 = -95;
        }
        if (this.field3138 < 0) {
            this.field3138 = 0;
        }
        if (this.field3129 != null) {
            this.field3129.method52(arg1);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljk;I)V", line = 236)
    public final synchronized void method1515(class363 arg0, int arg1) {
        field3136++;
        int var3 = 100 / ((arg1 + 39) / 52);
        this.field3129 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "()I", line = 247)
    public int method737() throws Exception {
        field3133++;
        return this.field3147;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 255)
    public final synchronized void method1516(int arg0) {
        field3127++;
        if (this.field3125) {
            return;
        }
        long var2 = class47.method371(120);
        try {
            if (this.field3116 + 500000L < var2) {
                this.field3116 = var2 - 500000L;
            }
            while (this.field3116 + 5000L < var2) {
                this.method1514((byte) 80, 256);
                this.field3116 += (long) (256000 / class227.field3788);
            }
        } catch (Exception var9) {
            this.field3116 = var2;
        }
        if (this.field3134 == null) {
            return;
        }
        try {
            if (this.field3150 != 0L) {
                if (this.field3150 > var2) {
                    return;
                }
                this.method739(this.field3147);
                this.field3150 = 0L;
                this.field3140 = true;
            }
            int var5 = this.method737();
            if (this.field3149 < (this.field3146 - var5)) {
                this.field3149 = this.field3146 - var5;
            }
            int var6 = this.field3142 + this.field3143;
            if (arg0 + var6 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field3147) {
                var5 = 0;
                this.field3147 += 1024;
                if (this.field3147 > 16384) {
                    this.field3147 = 16384;
                }
                this.method740();
                this.method739(this.field3147);
                if (var6 + 256 > this.field3147) {
                    var6 = this.field3147 - 256;
                    this.field3143 = var6 - this.field3142;
                }
                this.field3140 = true;
            }
            while (var6 > var5) {
                var5 += 256;
                this.method1513(this.field3134, 256);
                this.method741();
            }
            if (this.field3139 < var2) {
                if (this.field3140) {
                    this.field3140 = false;
                } else if (this.field3149 == 0 && this.field3151 == 0) {
                    this.method740();
                    this.field3150 = var2 + 2000L;
                    return;
                } else {
                    this.field3143 = Math.min(this.field3151, this.field3149);
                    this.field3151 = this.field3149;
                }
                this.field3139 = var2 + 2000L;
                this.field3149 = 0;
            }
            this.field3146 = var5;
        } catch (Exception var8) {
            this.method740();
            this.field3150 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V", line = 369)
    public final void method1517(byte arg0) {
        if (arg0 <= 121) {
            this.field3134 = (int[]) null;
        }
        this.field3140 = true;
        field3126++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 381)
    public void method743(Component arg0) throws Exception {
        field3117++;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 390)
    public final synchronized void method1518(int arg0) {
        this.field3140 = true;
        if (arg0 != -31008) {
            this.field3147 = 113;
        }
        try {
            this.method742();
        } catch (Exception var3) {
            this.method740();
            this.field3150 = class47.method371(80) + 2000L;
        }
        field3123++;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V", line = 415)
    public static final void method1519(byte arg0) {
        field3115++;
        class158.method1234((long) class332.field5261);
        if (class304.field4870 != -1) {
            class65.method563(class304.field4870, 128);
        }
        for (int var1 = 0; var1 < class183.field2955; var1++) {
            if (class270.field4498[var1]) {
                class12.field115[var1] = true;
            }
            class2.field13[var1] = class270.field4498[var1];
            class270.field4498[var1] = false;
        }
        if (arg0 != 33) {
            field3121 = (class116) null;
        }
        class152.field2415 = class332.field5261;
        if (class42.field607) {
            class63.field1132 = true;
        }
        class237.field3924 = -1;
        class14.field149 = null;
        class220.field3494 = -1;
        if (class304.field4870 != -1) {
            class183.field2955 = 0;
            class86.method690(false);
        }
        if (class42.field607) {
            class244.method1863();
        } else {
            class246.method1887();
        }
        class272.field4516 = 0;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)V", line = 465)
    public static void method1520(byte arg0) {
        field3121 = null;
        if (arg0 != 110) {
            field3144 = -81;
        }
        field3131 = null;
        field3137 = null;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "()V", line = 479)
    public void method741() throws Exception {
        field3148++;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "()V", line = 489)
    public void method740() {
        field3118++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)I", line = 511)
    public static final int method1521(int arg0, byte arg1) {
        if (arg1 == -59) {
            field3128++;
            return arg0 >>> 8;
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILjk;)V", line = 525)
    private final void method1522(int arg0, int arg1, class363 arg2) {
        field3130++;
        int var4 = arg1 >> 5;
        if (arg0 != 1986222213) {
            method1520((byte) 101);
        }
        class363 var5 = this.field3145[var4];
        if (var5 == null) {
            this.field3141[var4] = arg2;
        } else {
            var5.field5749 = arg2;
        }
        this.field3145[var4] = arg2;
        arg2.field5748 = arg1;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 559)
    public void method739(int arg0) throws Exception {
        field3120++;
    }
}
