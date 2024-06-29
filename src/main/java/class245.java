import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class245 {

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    private int field3894 = 32;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
    private boolean field3902 = false;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "J")
    private long field3898 = class112.method1033(-11752);

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    private int field3914 = 0;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    private int field3919 = 0;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    private int field3920 = 0;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "J")
    private long field3923 = 0L;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "J")
    private long field3917 = 0L;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "[Leq;")
    private class195[] field3918 = new class195[8];

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    private int field3924 = 0;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "[Leq;")
    private class195[] field3915 = new class195[8];

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "Z")
    private boolean field3916 = true;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lui;")
    public static class210 field3895 = new class210(8, 0, 4, 1);

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "J")
    public static long field3905 = 0L;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field3908 = -1;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Z")
    public static volatile boolean field3910 = true;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private int field3922;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Leq;")
    private class195 field3896;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
    public int[] field3891;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "[[Lpn;")
    public static class692[][] field3903;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 3)
    public final synchronized void method1746(int arg0) {
        field3892++;
        if (arg0 != 30921) {
            return;
        }
        if (class299.field4681 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class299.field4681.field4684[var3] == this) {
                    class299.field4681.field4684[var3] = null;
                }
                if (class299.field4681.field4684[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class299.field4681.field4691 = true;
                while (class299.field4681.field4689) {
                    class549.method3313(50L, 126);
                }
                class299.field4681 = null;
            }
        }
        this.method989();
        this.field3891 = null;
        this.field3902 = true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V", line = 48)
    private final void method1747(int arg0, boolean arg1) {
        field3912++;
        this.field3914 -= arg0;
        if (this.field3914 < 0) {
            this.field3914 = 0;
        }
        if (!arg1 && this.field3896 != null) {
            this.field3896.method235(arg0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Leq;II)V", line = 69)
    private final void method1748(class195 arg0, int arg1, int arg2) {
        if (arg1 != -184) {
            return;
        }
        field3909++;
        int var4 = arg2 >> 5;
        class195 var5 = this.field3915[var4];
        if (var5 == null) {
            this.field3918[var4] = arg0;
        } else {
            var5.field3226 = arg0;
        }
        this.field3915[var4] = arg0;
        arg0.field3223 = arg2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V", line = 90)
    public void method987() throws Exception {
        field3893++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 100)
    public void method984(Component arg0) throws Exception {
        field3911++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 108)
    public static void method1749(boolean arg0) {
        field3903 = null;
        field3895 = null;
        if (!arg0) {
            method1751(-67);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([II)V", line = 123)
    private final void method1750(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class3.field23) {
            var3 = arg1 << 1;
        }
        class398.method2568(arg0, 0, var3);
        this.field3914 -= arg1;
        if (this.field3896 != null && this.field3914 <= 0) {
            this.field3914 += class41.field581 >> 4;
            class325.method2192(this.field3896, true);
            this.method1748(this.field3896, -184, this.field3896.method1366());
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
                        class195 var10 = null;
                        class195 var11 = this.field3918[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class604 var12 = var11.field3225;
                                if (var12 == null || var12.field8579 <= var8) {
                                    var11.field3224 = true;
                                    int var13 = var11.method215();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8579 += var13;
                                    }
                                    if (var4 >= this.field3894) {
                                        break label107;
                                    }
                                    class195 var14 = var11.method219();
                                    if (var14 != null) {
                                        int var15 = var11.field3223;
                                        while (var14 != null) {
                                            this.method1748(var14, -184, var15 * var14.method1366() >> 8);
                                            var14 = var11.method220();
                                        }
                                    }
                                    class195 var16 = var11.field3226;
                                    var11.field3226 = null;
                                    if (var10 == null) {
                                        this.field3918[var7] = var16;
                                    } else {
                                        var10.field3226 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3915[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3226;
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
                class195 var18 = this.field3918[var17];
                this.field3918[var17] = this.field3915[var17] = null;
                while (var18 != null) {
                    class195 var19 = var18.field3226;
                    var18.field3226 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3914 < 0) {
            this.field3914 = 0;
        }
        if (this.field3896 != null) {
            this.field3896.method240(arg0, 0, arg1);
        }
        this.field3898 = class112.method1033(-11752);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()V", line = 288)
    public void method985() throws Exception {
        field3906++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 295)
    public static final void method1751(int arg0) {
        field3907++;
        if (arg0 >= -76) {
            field3903 = null;
        }
        class606.field8620.method1562((byte) 117);
        class236.field3753.method1562((byte) -72);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()I", line = 308)
    public int method986() throws Exception {
        field3901++;
        return this.field3913;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 316)
    public final synchronized void method1752(byte arg0) {
        field3899++;
        if (this.field3902) {
            return;
        }
        long var2 = class112.method1033(-11752);
        try {
            if ((this.field3898 + 500000L) < var2) {
                this.field3898 = var2 - 500000L;
            }
            while (var2 > (this.field3898 + 5000L)) {
                this.method1747(256, false);
                this.field3898 += (256000 / class41.field581);
            }
        } catch (Exception var7) {
            this.field3898 = var2;
        }
        if (arg0 != 63 || this.field3891 == null) {
            return;
        }
        try {
            if (this.field3923 != 0L) {
                if (this.field3923 > var2) {
                    return;
                }
                this.method990(this.field3913);
                this.field3916 = true;
                this.field3923 = 0L;
            }
            int var4 = this.method986();
            if (this.field3920 - var4 > this.field3924) {
                this.field3924 = this.field3920 - var4;
            }
            int var5 = this.field3922 + this.field3921;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3913 < var5 + 256) {
                this.field3913 += 1024;
                if (this.field3913 > 16384) {
                    this.field3913 = 16384;
                }
                this.method989();
                var4 = 0;
                this.method990(this.field3913);
                this.field3916 = true;
                if ((var5 + 256) > this.field3913) {
                    var5 = this.field3913 - 256;
                    this.field3922 = var5 - this.field3921;
                }
            }
            while (var4 < var5) {
                this.method1750(this.field3891, 256);
                this.method987();
                var4 += 256;
            }
            if (this.field3917 < var2) {
                if (this.field3916) {
                    this.field3916 = false;
                } else if (this.field3924 == 0 && this.field3919 == 0) {
                    this.method989();
                    this.field3923 = var2 + 2000L;
                    return;
                } else {
                    this.field3922 = Math.min(this.field3919, this.field3924);
                    this.field3919 = this.field3924;
                }
                this.field3917 = var2 + 2000L;
                this.field3924 = 0;
            }
            this.field3920 = var4;
        } catch (Exception var6) {
            this.method989();
            this.field3923 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()V", line = 440)
    public void method989() {
        field3897++;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 447)
    public void method990(int arg0) throws Exception {
        field3904++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V", line = 459)
    public final synchronized void method1753(boolean arg0) {
        field3890++;
        this.field3916 = true;
        try {
            this.method985();
            if (arg0) {
                this.method1747(78, true);
            }
        } catch (Exception var2) {
            this.method989();
            this.field3923 = class112.method1033(-11752) + 2000L;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Leq;B)V", line = 496)
    public final synchronized void method1754(class195 arg0, byte arg1) {
        if (arg1 != 28) {
            method1751(-111);
        }
        field3900++;
        this.field3896 = arg0;
    }
}
