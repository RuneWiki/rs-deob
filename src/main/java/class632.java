import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class632 {

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    private int field8898 = 32;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Z")
    private boolean field8889 = false;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "J")
    private long field8892 = class557.method3157(-82);

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "J")
    private long field8906 = 0L;

    @OriginalMember(owner = "client!cv", name = "v", descriptor = "I")
    private int field8907 = 0;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "[Lnj;")
    private class529[] field8905 = new class529[8];

    @OriginalMember(owner = "client!cv", name = "w", descriptor = "J")
    private long field8908 = 0L;

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
    private int field8913 = 0;

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "Z")
    private boolean field8912 = true;

    @OriginalMember(owner = "client!cv", name = "y", descriptor = "[Lnj;")
    private class529[] field8910 = new class529[8];

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    private int field8917 = 0;

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
    private int field8915 = 0;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field8888 = 0;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "Lib;")
    public static class14 field8899 = new class14(7, 2);

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
    private int field8911;

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
    public int field8914;

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
    public int field8916;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "Lnj;")
    private class529 field8896;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "[I")
    public int[] field8895;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)V", line = 4)
    private final void method3547(int arg0, byte arg1) {
        field8886++;
        if (arg1 < 60) {
            this.method3552(3);
        }
        this.field8907 -= arg0;
        if (this.field8907 < 0) {
            this.field8907 = 0;
        }
        if (this.field8896 != null) {
            this.field8896.method490(arg0);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLnj;)V", line = 26)
    public final synchronized void method3548(byte arg0, class529 arg1) {
        if (arg0 >= -89) {
            this.field8914 = 1;
        }
        this.field8896 = arg1;
        field8902++;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "()V", line = 39)
    public static final void method3549() {
        for (int var0 = 0; var0 < class642.field9080.length; var0++) {
            class642.field9080[var0].method3318();
        }
        class642.field9080 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BILnj;)V", line = 49)
    private final void method3550(byte arg0, int arg1, class529 arg2) {
        field8897++;
        int var4 = arg1 >> 5;
        if (arg0 != 70) {
            method3554(53);
        }
        class529 var5 = this.field8905[var4];
        if (var5 == null) {
            this.field8910[var4] = arg2;
        } else {
            var5.field7448 = arg2;
        }
        this.field8905[var4] = arg2;
        arg2.field7447 = arg1;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 71)
    public void method211(Component arg0) throws Exception {
        field8894++;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "([II)V", line = 80)
    private final void method3551(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class60.field614) {
            var3 = arg1 << 1;
        }
        class567.method3218(arg0, 0, var3);
        this.field8907 -= arg1;
        if (this.field8896 != null && this.field8907 <= 0) {
            this.field8907 += class224.field2776 >> 4;
            class361.method2118(this.field8896, (byte) -115);
            this.method3550((byte) 70, this.field8896.method2973(), this.field8896);
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
                        class529 var10 = null;
                        class529 var11 = this.field8910[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class261 var12 = var11.field7449;
                                if (var12 == null || var12.field3266 <= var8) {
                                    var11.field7450 = true;
                                    int var13 = var11.method497();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3266 += var13;
                                    }
                                    if (var4 >= this.field8898) {
                                        break label107;
                                    }
                                    class529 var14 = var11.method505();
                                    if (var14 != null) {
                                        int var15 = var11.field7447;
                                        while (var14 != null) {
                                            this.method3550((byte) 70, var15 * var14.method2973() >> 8, var14);
                                            var14 = var11.method521();
                                        }
                                    }
                                    class529 var16 = var11.field7448;
                                    var11.field7448 = null;
                                    if (var10 == null) {
                                        this.field8910[var7] = var16;
                                    } else {
                                        var10.field7448 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field8905[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field7448;
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
                class529 var18 = this.field8910[var17];
                this.field8910[var17] = this.field8905[var17] = null;
                while (var18 != null) {
                    class529 var19 = var18.field7448;
                    var18.field7448 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field8907 < 0) {
            this.field8907 = 0;
        }
        if (this.field8896 != null) {
            this.field8896.method495(arg0, 0, arg1);
        }
        this.field8892 = class557.method3157(-88);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "()V", line = 238)
    public void method210() throws Exception {
        field8909++;
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "()I", line = 245)
    public int method208() throws Exception {
        field8891++;
        return this.field8914;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 257)
    public void method212(int arg0) throws Exception {
        field8904++;
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "()V", line = 267)
    public void method209() {
        field8903++;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 279)
    public final synchronized void method3552(int arg0) {
        field8887++;
        if (arg0 <= 48) {
            return;
        }
        if (class107.field1161 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class107.field1161.field346[var3] == this) {
                    class107.field1161.field346[var3] = null;
                }
                if (class107.field1161.field346[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class107.field1161.field345 = true;
                while (class107.field1161.field347) {
                    class452.method2602(50L, (byte) -97);
                }
                class107.field1161 = null;
            }
        }
        this.method209();
        this.field8889 = true;
        this.field8895 = null;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V", line = 323)
    public final synchronized void method3553(byte arg0) {
        if (arg0 != -29) {
            this.field8913 = -28;
        }
        field8901++;
        if (this.field8889) {
            return;
        }
        long var2 = class557.method3157(arg0 ^ 0x68);
        try {
            if (var2 > (this.field8892 + 500000L)) {
                this.field8892 = var2 - 500000L;
            }
            while (var2 > (this.field8892 + 5000L)) {
                this.method3547(256, (byte) 127);
                this.field8892 += (256000 / class224.field2776);
            }
        } catch (Exception var7) {
            this.field8892 = var2;
        }
        if (this.field8895 == null) {
            return;
        }
        try {
            if (this.field8906 != 0L) {
                if (this.field8906 > var2) {
                    return;
                }
                this.method212(this.field8914);
                this.field8912 = true;
                this.field8906 = 0L;
            }
            int var4 = this.method208();
            if ((this.field8915 - var4) > this.field8913) {
                this.field8913 = this.field8915 - var4;
            }
            int var5 = this.field8916 + this.field8911;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field8914) {
                this.field8914 += 1024;
                if (this.field8914 > 16384) {
                    this.field8914 = 16384;
                }
                this.method209();
                this.method212(this.field8914);
                var4 = 0;
                if (var5 + 256 > this.field8914) {
                    var5 = this.field8914 - 256;
                    this.field8911 = var5 - this.field8916;
                }
                this.field8912 = true;
            }
            while (var4 < var5) {
                this.method3551(this.field8895, 256);
                this.method207();
                var4 += 256;
            }
            if (var2 > this.field8908) {
                if (this.field8912) {
                    this.field8912 = false;
                } else if (this.field8913 == 0 && this.field8917 == 0) {
                    this.method209();
                    this.field8906 = var2 + 2000L;
                    return;
                } else {
                    this.field8911 = Math.min(this.field8917, this.field8913);
                    this.field8917 = this.field8913;
                }
                this.field8913 = 0;
                this.field8908 = var2 + 2000L;
            }
            this.field8915 = var4;
        } catch (Exception var6) {
            this.method209();
            this.field8906 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V", line = 444)
    public static void method3554(int arg0) {
        if (arg0 == 8466) {
            field8899 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "()V", line = 457)
    public void method207() throws Exception {
        field8890++;
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V", line = 511)
    public final synchronized void method3555(int arg0) {
        field8900++;
        if (arg0 != 7) {
            this.field8895 = null;
        }
        this.field8912 = true;
        try {
            this.method210();
        } catch (Exception var2) {
            this.method209();
            this.field8906 = class557.method3157(-55) + 2000L;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V", line = 532)
    public static final void method3556(byte arg0) {
        if (class441.method2549(-34, class421.field5601) || class2.method12(class421.field5601, 10755)) {
            class489.method2838(class689.field9698 >> 12, class516.field7360 >> 12, 5000, true);
        } else {
            int var1 = class362.field4859.field9517[0] >> 3;
            int var2 = class362.field4859.field9513[0] >> 3;
            if (var1 >= 0 && var1 < (class142.field1574 >> 3) && var2 >= 0 && class140.field1550 >> 3 > var2) {
                class489.method2838(var2, var1, 5000, true);
            } else {
                class489.method2838(class140.field1550 >> 4, class142.field1574 >> 4, 0, true);
            }
        }
        field8893++;
        int var3 = -8 / ((-arg0 - 9) / 61);
        class206.method1235((byte) 124);
        class540.method3039((byte) -77);
        class87.method451((byte) 103);
        class330.method1871(-63);
    }
}
