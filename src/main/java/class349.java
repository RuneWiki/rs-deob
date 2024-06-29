import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class349 {

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "Z")
    private boolean field5164 = false;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    private int field5170 = 32;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "J")
    private long field5171 = class465.method2818(255);

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "I")
    private int field5182 = 0;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "Z")
    private boolean field5185 = true;

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "[Los;")
    private class170[] field5180 = new class170[8];

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "[Los;")
    private class170[] field5187 = new class170[8];

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
    private int field5183 = 0;

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "J")
    private long field5188 = 0L;

    @OriginalMember(owner = "client!mda", name = "y", descriptor = "J")
    private long field5181 = 0L;

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
    private int field5189 = 0;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
    private int field5186 = 0;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
    public int field5179;

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
    public int field5190;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
    private int field5191;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "Los;")
    private class170 field5168;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "Ltd;")
    public static class515 field5167;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "[I")
    public int[] field5159;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "[[[S")
    public static short[][][] field5157;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V", line = 3)
    public final synchronized void method2221(int arg0) {
        field5163++;
        if (this.field5164) {
            return;
        }
        long var2 = class465.method2818(255);
        if (arg0 != 2000) {
            this.field5159 = null;
        }
        try {
            if (var2 > (this.field5171 + 6000L)) {
                this.field5171 = var2 - 6000L;
            }
            while (var2 > this.field5171 + 5000L) {
                this.method2227(256, 123);
                this.field5171 += (256000 / class132.field1821);
                var2 = class465.method2818(255);
            }
        } catch (Exception var7) {
            this.field5171 = var2;
        }
        if (this.field5159 == null) {
            return;
        }
        try {
            if (this.field5181 != 0L) {
                if (this.field5181 > var2) {
                    return;
                }
                this.method2222(this.field5179);
                this.field5181 = 0L;
                this.field5185 = true;
            }
            int var4 = this.method2233();
            if (this.field5186 < this.field5183 - var4) {
                this.field5186 = this.field5183 - var4;
            }
            int var5 = this.field5190 + this.field5191;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field5179 < (var5 + 256)) {
                this.field5179 += 1024;
                if (this.field5179 > 16384) {
                    this.field5179 = 16384;
                }
                this.method2223();
                var4 = 0;
                this.method2222(this.field5179);
                this.field5185 = true;
                if (var5 + 256 > this.field5179) {
                    var5 = this.field5179 - 256;
                    this.field5191 = var5 - this.field5190;
                }
            }
            while (var4 < var5) {
                this.method2225(this.field5159, 256);
                this.method2236();
                var4 += 256;
            }
            if (this.field5188 < var2) {
                if (this.field5185) {
                    this.field5185 = false;
                } else if (this.field5186 == 0 && this.field5189 == 0) {
                    this.method2223();
                    this.field5181 = var2 + 2000L;
                    return;
                } else {
                    this.field5191 = Math.min(this.field5189, this.field5186);
                    this.field5189 = this.field5186;
                }
                this.field5188 = var2 + 2000L;
                this.field5186 = 0;
            }
            this.field5183 = var4;
        } catch (Exception var6) {
            this.method2223();
            this.field5181 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V", line = 122)
    public void method2222(int arg0) throws Exception {
        field5177++;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "()V", line = 132)
    public void method2223() {
        field5175++;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BII)Z", line = 139)
    public static final boolean method2224(byte arg0, int arg1, int arg2) {
        field5173++;
        if (arg0 > -28) {
            method2228(null, (byte) 41, -2, 62);
        }
        if (!class147.field2154) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class600.field8524[var3] == null || class600.field8524[var3][var4] == null) {
            return false;
        }
        class146 var5 = class600.field8524[var3][var4];
        if (arg1 == -1 && var5.field2112 == 0) {
            for (class304 var6 = (class304) class303.field4137.method3565(107); var6 != null; var6 = (class304) class303.field4137.method3561((byte) 30)) {
                if (var6.field4152 == 25 || var6.field4152 == 1002 || var6.field4152 == 16 || var6.field4152 == 45 || var6.field4152 == 4) {
                    for (class146 var7 = class250.method1689(var6.field4159, false); var7 != null; var7 = class743.method4139(var7, (byte) 126)) {
                        if (var5.field2079 == var7.field2079) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class304 var8 = (class304) class303.field4137.method3565(107); var8 != null; var8 = (class304) class303.field4137.method3561((byte) 33)) {
                if (var8.field4146 == arg1 && var5.field2079 == var8.field4159 && (var8.field4152 == 25 || var8.field4152 == 1002 || var8.field4152 == 16 || var8.field4152 == 45 || var8.field4152 == 4)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "([II)V", line = 208)
    private final void method2225(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class147.field2155) {
            var3 = arg1 << 1;
        }
        class85.method681(arg0, 0, var3);
        this.field5182 -= arg1;
        if (this.field5168 != null && this.field5182 <= 0) {
            this.field5182 += class132.field1821 >> 4;
            class288.method1831(0, this.field5168);
            this.method2229(-19259, this.field5168, this.field5168.method1043());
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
                        class170 var10 = null;
                        class170 var11 = this.field5180[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class581 var12 = var11.field2398;
                                if (var12 == null || var12.field8298 <= var8) {
                                    var11.field2399 = true;
                                    int var13 = var11.method1054();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8298 += var13;
                                    }
                                    if (var4 >= this.field5170) {
                                        break label107;
                                    }
                                    class170 var14 = var11.method1065();
                                    if (var14 != null) {
                                        int var15 = var11.field2400;
                                        while (var14 != null) {
                                            this.method2229(-19259, var14, var15 * var14.method1043() >> 8);
                                            var14 = var11.method1086();
                                        }
                                    }
                                    class170 var16 = var11.field2397;
                                    var11.field2397 = null;
                                    if (var10 == null) {
                                        this.field5180[var7] = var16;
                                    } else {
                                        var10.field2397 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5187[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2397;
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
                class170 var18 = this.field5180[var17];
                this.field5180[var17] = this.field5187[var17] = null;
                while (var18 != null) {
                    class170 var19 = var18.field2397;
                    var18.field2397 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5182 < 0) {
            this.field5182 = 0;
        }
        if (this.field5168 != null) {
            this.field5168.method1088(arg0, 0, arg1);
        }
        this.field5171 = class465.method2818(255);
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V", line = 369)
    public static void method2226(int arg0) {
        field5167 = null;
        if (arg0 != 1) {
            method2224((byte) 35, 99, -66);
        }
        field5157 = null;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V", line = 382)
    private final void method2227(int arg0, int arg1) {
        field5165++;
        this.field5182 -= arg0;
        if (this.field5182 < 0) {
            this.field5182 = 0;
        }
        if (arg1 <= 102) {
            field5160 = 47;
        }
        if (this.field5168 != null) {
            this.field5168.method1083(arg0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lha;BII)V", line = 403)
    public static final void method2228(class543 arg0, byte arg1, int arg2, int arg3) {
        class680.field9653 = new class123[arg3][arg2];
        field5161++;
        class751.field10467 = arg0;
        if (class468.field6657 != null) {
            class387.field5590 = class225.method1564(4, class468.field6657[1], class468.field6657[2], class468.field6657[3], class468.field6657[5], class468.field6657[0], class468.field6657[4]);
        }
        class567.field8197 = new class123();
        int var4 = 100 % ((arg1 + 13) / 47);
        class388.method2380(true);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILos;I)V", line = 420)
    private final void method2229(int arg0, class170 arg1, int arg2) {
        field5184++;
        int var4 = arg2 >> 5;
        class170 var5 = this.field5187[var4];
        if (var5 == null) {
            this.field5180[var4] = arg1;
        } else {
            var5.field2397 = arg1;
        }
        if (arg0 == -19259) {
            this.field5187[var4] = arg1;
            arg1.field2400 = arg2;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V", line = 441)
    public final synchronized void method2230(byte arg0) {
        this.field5185 = true;
        int var2 = -65 % ((arg0 - 4) / 35);
        field5166++;
        try {
            this.method2234();
        } catch (Exception var3) {
            this.method2223();
            this.field5181 = class465.method2818(255) + 2000L;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLos;)V", line = 459)
    public final synchronized void method2231(byte arg0, class170 arg1) {
        field5172++;
        if (arg0 != 88) {
            this.method2223();
        }
        this.field5168 = arg1;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 472)
    public void method2232(Component arg0) throws Exception {
        field5174++;
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "()I", line = 488)
    public int method2233() throws Exception {
        field5178++;
        return this.field5179;
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "()V", line = 496)
    public void method2234() throws Exception {
        field5162++;
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V", line = 509)
    public final synchronized void method2235(int arg0) {
        if (class579.field8295 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class579.field8295.field5539[var3] == this) {
                    class579.field8295.field5539[var3] = null;
                }
                if (class579.field8295.field5539[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class579.field8295.field5545 = true;
                while (class579.field8295.field5544) {
                    class363.method2283(50L, -24244);
                }
                class579.field8295 = null;
            }
        }
        if (arg0 != 30597) {
            this.method2235(100);
        }
        field5158++;
        this.method2223();
        this.field5164 = true;
        this.field5159 = null;
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "()V", line = 558)
    public void method2236() throws Exception {
        field5169++;
    }
}
