import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class422 {

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    private int field5892 = 32;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Z")
    private boolean field5898 = false;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "J")
    private long field5890 = class433.method2562(-2039);

    @OriginalMember(owner = "client!it", name = "A", descriptor = "[Lme;")
    private class117[] field5909 = new class117[8];

    @OriginalMember(owner = "client!it", name = "z", descriptor = "J")
    private long field5908 = 0L;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "[Lme;")
    private class117[] field5907 = new class117[8];

    @OriginalMember(owner = "client!it", name = "w", descriptor = "Z")
    private boolean field5905 = true;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "I")
    private int field5912 = 0;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "I")
    private int field5913 = 0;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    private int field5906 = 0;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    private int field5904 = 0;

    @OriginalMember(owner = "client!it", name = "F", descriptor = "J")
    private long field5914 = 0L;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "[I")
    public static int[] field5885 = new int[5];

    @OriginalMember(owner = "client!it", name = "I", descriptor = "[Z")
    public static boolean[] field5917;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "[Lee;")
    public static class441[] field5918;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "I")
    private int field5911;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "I")
    private int field5915;

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Lme;")
    private class117 field5896;

    @OriginalMember(owner = "client!it", name = "K", descriptor = "Lb;")
    public static class201 field5919;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "[I")
    public int[] field5884;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public void method1873(int arg0) throws Exception {
        field5886++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
    public void method1874() throws Exception {
        field5900++;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "()V")
    public void method1876() throws Exception {
        field5889++;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
    public final synchronized void method2475(int arg0) {
        field5897++;
        if (this.field5898) {
            return;
        }
        long var2 = class433.method2562(-2039);
        if (arg0 < 74) {
            this.field5914 = 15L;
        }
        try {
            if (var2 > this.field5890 + 500000L) {
                this.field5890 = var2 - 500000L;
            }
            while (this.field5890 + 5000L < var2) {
                this.method2478(16384, 256);
                this.field5890 += (long) (256000 / class31.field409);
            }
        } catch (Exception var7) {
            this.field5890 = var2;
        }
        if (this.field5884 == null) {
            return;
        }
        try {
            if (this.field5908 != 0L) {
                if (var2 < this.field5908) {
                    return;
                }
                this.method1873(this.field5911);
                this.field5908 = 0L;
                this.field5905 = true;
            }
            int var4 = this.method1877();
            if (this.field5912 - var4 > this.field5906) {
                this.field5906 = this.field5912 - var4;
            }
            int var5 = this.field5916 + this.field5915;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field5911) {
                this.field5911 += 1024;
                if (this.field5911 > 16384) {
                    this.field5911 = 16384;
                }
                this.method1875();
                this.method1873(this.field5911);
                var4 = 0;
                this.field5905 = true;
                if (var5 + 256 > this.field5911) {
                    var5 = this.field5911 - 256;
                    this.field5916 = var5 - this.field5915;
                }
            }
            while (var4 < var5) {
                this.method2483(this.field5884, 256);
                this.method1876();
                var4 += 256;
            }
            if (var2 > this.field5914) {
                if (this.field5905) {
                    this.field5905 = false;
                } else if (this.field5906 == 0 && this.field5913 == 0) {
                    this.method1875();
                    this.field5908 = var2 + 2000L;
                    return;
                } else {
                    this.field5916 = Math.min(this.field5913, this.field5906);
                    this.field5913 = this.field5906;
                }
                this.field5914 = var2 + 2000L;
                this.field5906 = 0;
            }
            this.field5912 = var4;
        } catch (Exception var6) {
            this.method1875();
            this.field5908 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    public final synchronized void method2476(int arg0) {
        if (arg0 != 0) {
            this.field5904 = -67;
        }
        if (class203.field3015 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class203.field3015.field3430[var3] == this) {
                    class203.field3015.field3430[var3] = null;
                }
                if (class203.field3015.field3430[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class203.field3015.field3433 = true;
                while (class203.field3015.field3431) {
                    class111.method713(arg0 - 111, 50L);
                }
                class203.field3015 = null;
            }
        }
        field5910++;
        this.method1875();
        this.field5884 = null;
        this.field5898 = true;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
    public final void method2477(int arg0) {
        this.field5905 = true;
        field5883++;
        if (arg0 > -71) {
            this.field5907 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "()V")
    public void method1875() {
        field5893++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
    private final void method2478(int arg0, int arg1) {
        field5894++;
        if (arg0 != 16384) {
            this.field5908 = 73L;
        }
        this.field5904 -= arg1;
        if (this.field5904 < 0) {
            this.field5904 = 0;
        }
        if (this.field5896 != null) {
            this.field5896.method67(arg1);
        }
    }

    @OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
    public final synchronized void method2479(int arg0) {
        field5891++;
        this.field5905 = true;
        try {
            this.method1874();
        } catch (Exception var2) {
            this.method1875();
            this.field5908 = class433.method2562(arg0 - 22254) + 2000L;
        }
        if (arg0 != 20215) {
            this.field5905 = true;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII)V")
    public static final void method2480(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < -54) {
            field5901++;
            class413.field5813 = new byte[arg2][arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZILme;)V")
    private final void method2481(boolean arg0, int arg1, class117 arg2) {
        if (!arg0) {
            return;
        }
        field5899++;
        int var4 = arg1 >> 5;
        class117 var5 = this.field5909[var4];
        if (var5 == null) {
            this.field5907[var4] = arg2;
        } else {
            var5.field1484 = arg2;
        }
        this.field5909[var4] = arg2;
        arg2.field1483 = arg1;
    }

    @OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V")
    public static void method2482(int arg0) {
        field5919 = null;
        field5917 = null;
        field5885 = null;
        field5918 = null;
        if (arg0 != -257) {
            method2482(100);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([II)V")
    private final void method2483(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class410.field5752) {
            var3 = arg1 << 1;
        }
        class415.method2447(arg0, 0, var3);
        this.field5904 -= arg1;
        if (this.field5896 != null && this.field5904 <= 0) {
            this.field5904 += class31.field409 >> 4;
            class431.method2550(0, this.field5896);
            this.method2481(true, this.field5896.method53(), this.field5896);
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
                        class117 var10 = null;
                        class117 var11 = this.field5907[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class46 var12 = var11.field1486;
                                if (var12 == null || var12.field650 <= var8) {
                                    var11.field1485 = true;
                                    int var13 = var11.method73();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field650 += var13;
                                    }
                                    if (var4 >= this.field5892) {
                                        break label107;
                                    }
                                    class117 var14 = var11.method72();
                                    if (var14 != null) {
                                        int var15 = var11.field1483;
                                        while (var14 != null) {
                                            this.method2481(true, var15 * var14.method53() >> 8, var14);
                                            var14 = var11.method48();
                                        }
                                    }
                                    class117 var16 = var11.field1484;
                                    var11.field1484 = null;
                                    if (var10 == null) {
                                        this.field5907[var7] = var16;
                                    } else {
                                        var10.field1484 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5909[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1484;
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
                class117 var18 = this.field5907[var17];
                this.field5907[var17] = this.field5909[var17] = null;
                while (var18 != null) {
                    class117 var19 = var18.field1484;
                    var18.field1484 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5904 < 0) {
            this.field5904 = 0;
        }
        if (this.field5896 != null) {
            this.field5896.method52(arg0, 0, arg1);
        }
        this.field5890 = class433.method2562(-2039);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BLme;)V")
    public final synchronized void method2484(byte arg0, class117 arg1) {
        field5902++;
        if (arg0 >= 63) {
            this.field5896 = arg1;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIILjava/awt/Component;Lmj;)Lit;")
    public static final class422 method2485(int arg0, int arg1, int arg2, Component arg3, class430 arg4) {
        if (arg0 != 256) {
            method2480(88, -19, 64, -64);
        }
        field5888++;
        if (class31.field409 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class422 var5 = (class422) Class.forName("qe").getDeclaredConstructor().newInstance();
                var5.field5884 = new int[(class410.field5752 ? 2 : 1) * 256];
                var5.field5915 = arg2;
                var5.method1878(arg3);
                var5.field5911 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field5911 > 16384) {
                    var5.field5911 = 16384;
                }
                var5.method1873(var5.field5911);
                if (class437.field6071 > 0 && class203.field3015 == null) {
                    class203.field3015 = new class227();
                    class203.field3015.field3427 = arg4;
                    arg4.method2543(class203.field3015, class437.field6071, (byte) -113);
                }
                if (class203.field3015 != null) {
                    if (class203.field3015.field3430[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class203.field3015.field3430[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class436 var6 = new class436(arg4, arg1);
                    var6.field5915 = arg2;
                    var6.field5884 = new int[(class410.field5752 ? 2 : 1) * 256];
                    var6.method1878(arg3);
                    var6.field5911 = 16384;
                    var6.method1873(var6.field5911);
                    if (class437.field6071 > 0 && class203.field3015 == null) {
                        class203.field3015 = new class227();
                        class203.field3015.field3427 = arg4;
                        arg4.method2543(class203.field3015, class437.field6071, (byte) -55);
                    }
                    if (class203.field3015 != null) {
                        if (class203.field3015.field3430[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class203.field3015.field3430[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class422();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1878(Component arg0) throws Exception {
        field5903++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lb;Loi;ILb;)V")
    public static final void method2486(class201 arg0, class49 arg1, int arg2, class201 arg3) {
        class252.field3716 = arg1;
        class65.field841 = arg0;
        class187.field2802 = arg3;
        field5895++;
        if (arg2 != -256) {
            return;
        }
        if (class187.field2802 != null) {
            class53.field717 = class187.field2802.method1235(arg2 + 256, 1);
        }
        if (class65.field841 != null) {
            class333.field4842 = class65.field841.method1235(arg2 + 256, 1);
        }
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "()I")
    public int method1877() throws Exception {
        field5887++;
        return this.field5911;
    }

    static {
        new class326("From", "Von:", "De", "De");
        field5917 = new boolean[100];
        field5918 = new class441[4];
    }
}
