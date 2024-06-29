import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class346 {

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    private int field4820 = 32;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "Z")
    private boolean field4836 = false;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "J")
    private long field4831 = class459.method2731(118);

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    private int field4839 = 0;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    private int field4843 = 0;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Z")
    private boolean field4840 = true;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "[Lsd;")
    private class101[] field4841 = new class101[8];

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "J")
    private long field4844 = 0L;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "J")
    private long field4842 = 0L;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    private int field4845 = 0;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "[Lsd;")
    private class101[] field4848 = new class101[8];

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    private int field4850 = 0;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Lfba;")
    public static class27 field4830 = new class27(48, 4);

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "[Lmb;")
    public static class274[] field4838 = new class274[4];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    public int field4849;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lsd;")
    private class101 field4821;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
    public int[] field4819;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILsd;)V", line = 7)
    public final synchronized void method2190(int arg0, class101 arg1) {
        if (arg0 == 0) {
            this.field4821 = arg1;
            field4833++;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 19)
    public final synchronized void method2191(int arg0) {
        field4822++;
        if (this.field4836) {
            return;
        }
        long var2 = class459.method2731(102);
        try {
            if (var2 > (this.field4831 + 6000L)) {
                this.field4831 = var2 - 6000L;
            }
            while (this.field4831 + 5000L < var2) {
                this.method2195(256, (byte) 13);
                this.field4831 += (256000 / class114.field1746);
                var2 = class459.method2731(103);
            }
        } catch (Exception var7) {
            this.field4831 = var2;
        }
        if (this.field4819 == null) {
            return;
        }
        if (arg0 > -13) {
            field4830 = null;
        }
        try {
            if (this.field4844 != 0L) {
                if (this.field4844 > var2) {
                    return;
                }
                this.method1465(this.field4849);
                this.field4844 = 0L;
                this.field4840 = true;
            }
            int var4 = this.method1464();
            if ((this.field4845 - var4) > this.field4839) {
                this.field4839 = this.field4845 - var4;
            }
            int var5 = this.field4847 + this.field4846;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field4849) {
                this.field4849 += 1024;
                if (this.field4849 > 16384) {
                    this.field4849 = 16384;
                }
                this.method1467();
                var4 = 0;
                this.method1465(this.field4849);
                this.field4840 = true;
                if (this.field4849 < (var5 + 256)) {
                    var5 = this.field4849 - 256;
                    this.field4846 = var5 - this.field4847;
                }
            }
            while (var5 > var4) {
                this.method2192(this.field4819, 256);
                this.method1469();
                var4 += 256;
            }
            if (var2 > this.field4842) {
                if (this.field4840) {
                    this.field4840 = false;
                } else if (this.field4839 == 0 && this.field4850 == 0) {
                    this.method1467();
                    this.field4844 = var2 + 2000L;
                    return;
                } else {
                    this.field4846 = Math.min(this.field4850, this.field4839);
                    this.field4850 = this.field4839;
                }
                this.field4842 = var2 + 2000L;
                this.field4839 = 0;
            }
            this.field4845 = var4;
        } catch (Exception var6) {
            this.method1467();
            this.field4844 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "()I", line = 138)
    public int method1464() throws Exception {
        field4827++;
        return this.field4849;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "()V", line = 150)
    public void method1469() throws Exception {
        field4837++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([II)V", line = 158)
    private final void method2192(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class488.field6898) {
            var3 = arg1 << 1;
        }
        class595.method3471(arg0, 0, var3);
        this.field4843 -= arg1;
        if (this.field4821 != null && this.field4843 <= 0) {
            this.field4843 += class114.field1746 >> 4;
            class311.method1995(this.field4821, true);
            this.method2196(this.field4821.method167(), this.field4821, 0);
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
                        class101 var10 = null;
                        class101 var11 = this.field4848[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class271 var12 = var11.field1179;
                                if (var12 == null || var12.field3925 <= var8) {
                                    var11.field1178 = true;
                                    int var13 = var11.method210();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3925 += var13;
                                    }
                                    if (var4 >= this.field4820) {
                                        break label107;
                                    }
                                    class101 var14 = var11.method191();
                                    if (var14 != null) {
                                        int var15 = var11.field1181;
                                        while (var14 != null) {
                                            this.method2196(var15 * var14.method167() >> 8, var14, 0);
                                            var14 = var11.method176();
                                        }
                                    }
                                    class101 var16 = var11.field1180;
                                    var11.field1180 = null;
                                    if (var10 == null) {
                                        this.field4848[var7] = var16;
                                    } else {
                                        var10.field1180 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4841[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1180;
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
                class101 var18 = this.field4848[var17];
                this.field4848[var17] = this.field4841[var17] = null;
                while (var18 != null) {
                    class101 var19 = var18.field1180;
                    var18.field1180 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4843 < 0) {
            this.field4843 = 0;
        }
        if (this.field4821 != null) {
            this.field4821.method203(arg0, 0, arg1);
        }
        this.field4831 = class459.method2731(123);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([Ljd;I)V", line = 319)
    public static final void method2193(class241[] arg0, int arg1) {
        class75.field852 = arg0.length;
        field4829++;
        class132.field1980 = new class241[class75.field852 + 10];
        class569.field8030 = new int[class75.field852 + 10];
        class595.method3472(arg0, 0, class132.field1980, 0, class75.field852);
        for (int var2 = 0; var2 < class75.field852; var2++) {
            class569.field8030[var2] = class132.field1980[var2].method1505();
        }
        if (arg1 == 4523) {
            for (int var3 = class75.field852; var3 < class132.field1980.length; var3++) {
                class569.field8030[var3] = 12;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "()V", line = 347)
    public void method1467() {
        field4818++;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "()V", line = 356)
    public void method1468() throws Exception {
        field4834++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 364)
    public void method1466(Component arg0) throws Exception {
        field4823++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIB)Z", line = 373)
    public static final boolean method2194(int arg0, int arg1, byte arg2) {
        if (arg2 > -43) {
            field4838 = null;
        }
        field4826++;
        if (class675.method3840(arg0, (byte) 56, arg1)) {
            return (arg1 & 0xB000) != 0 | class574.method3369((byte) -120, arg0, arg1) | class306.method1985((byte) 124, arg1, arg0) ? true : (class747.method4161(arg1, (byte) -8, arg0) | class611.method3551(true, arg1, arg0)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 393)
    public void method1465(int arg0) throws Exception {
        field4825++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)V", line = 400)
    private final void method2195(int arg0, byte arg1) {
        field4817++;
        if (arg1 != 13) {
            this.method1467();
        }
        this.field4843 -= arg0;
        if (this.field4843 < 0) {
            this.field4843 = 0;
        }
        if (this.field4821 != null) {
            this.field4821.method182(arg0);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILsd;I)V", line = 422)
    private final void method2196(int arg0, class101 arg1, int arg2) {
        field4828++;
        if (arg2 != 0) {
            return;
        }
        int var4 = arg0 >> 5;
        class101 var5 = this.field4841[var4];
        if (var5 == null) {
            this.field4848[var4] = arg1;
        } else {
            var5.field1180 = arg1;
        }
        this.field4841[var4] = arg1;
        arg1.field1181 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V", line = 448)
    public final synchronized void method2197(boolean arg0) {
        this.field4840 = true;
        field4824++;
        if (arg0) {
            this.method2195(-27, (byte) 117);
        }
        try {
            this.method1468();
        } catch (Exception var2) {
            this.method1467();
            this.field4844 = class459.method2731(103) + 2000L;
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 468)
    public static void method2198(int arg0) {
        if (arg0 == 13288) {
            field4830 = null;
            field4838 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V", line = 480)
    public final synchronized void method2199(int arg0) {
        field4832++;
        if (class17.field319 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class17.field319.field6857[var3] == this) {
                    class17.field319.field6857[var3] = null;
                }
                if (class17.field319.field6857[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class17.field319.field6860 = true;
                while (class17.field319.field6859) {
                    class107.method828(50L, (byte) 100);
                }
                class17.field319 = null;
            }
        }
        this.method1467();
        this.field4819 = null;
        if (arg0 != 18052) {
            this.method2190(-26, null);
        }
        this.field4836 = true;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V", line = 537)
    public static final void method2200(byte arg0, int arg1) {
        field4835++;
        class788.field10817 = 100;
        int var2 = -31 / ((arg0 - 10) / 44);
        class503.field7134 = 3;
        class735.field10154 = -1;
        class399.field5481 = arg1;
    }
}
