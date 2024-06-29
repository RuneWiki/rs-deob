import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class428 {

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    private int field5853 = 32;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "Z")
    private boolean field5861 = false;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "J")
    private long field5847 = class498.method2854(-127);

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "[Lgm;")
    private class79[] field5862 = new class79[8];

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "J")
    private long field5864 = 0L;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    private int field5866 = 0;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    private int field5865 = 0;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    private int field5869 = 0;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "Z")
    private boolean field5863 = true;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    private int field5867 = 0;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "J")
    private long field5871 = 0L;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "[Lgm;")
    private class79[] field5872 = new class79[8];

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "Lff;")
    public static class9 field5842 = new class9(46, 7);

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
    public int field5868;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
    public int field5870;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    private int field5873;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "J")
    public static long field5859;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Lgm;")
    private class79 field5852;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "[I")
    public int[] field5858;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public final synchronized void method2466(byte arg0) {
        this.field5863 = true;
        field5844++;
        try {
            this.method2413();
            if (arg0 >= -116) {
                this.method2471(50);
            }
        } catch (Exception var2) {
            this.method2411();
            this.field5864 = class498.method2854(-115) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([II)V")
    private final void method2467(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class202.field2798) {
            var3 = arg1 << 1;
        }
        class254.method1531(arg0, 0, var3);
        this.field5866 -= arg1;
        if (this.field5852 != null && this.field5866 <= 0) {
            this.field5866 += class296.field3877 >> 4;
            class151.method1032(false, this.field5852);
            this.method2474(this.field5852.method63(), (byte) 94, this.field5852);
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
                        class79 var10 = null;
                        class79 var11 = this.field5862[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class38 var12 = var11.field1180;
                                if (var12 == null || var12.field588 <= var8) {
                                    var11.field1177 = true;
                                    int var13 = var11.method83();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field588 += var13;
                                    }
                                    if (var4 >= this.field5853) {
                                        break label107;
                                    }
                                    class79 var14 = var11.method89();
                                    if (var14 != null) {
                                        int var15 = var11.field1178;
                                        while (var14 != null) {
                                            this.method2474(var15 * var14.method63() >> 8, (byte) 94, var14);
                                            var14 = var11.method92();
                                        }
                                    }
                                    class79 var16 = var11.field1179;
                                    var11.field1179 = null;
                                    if (var10 == null) {
                                        this.field5862[var7] = var16;
                                    } else {
                                        var10.field1179 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5872[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1179;
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
                class79 var18 = this.field5862[var17];
                this.field5862[var17] = this.field5872[var17] = null;
                while (var18 != null) {
                    class79 var19 = var18.field1179;
                    var18.field1179 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5866 < 0) {
            this.field5866 = 0;
        }
        if (this.field5852 != null) {
            this.field5852.method80(arg0, 0, arg1);
        }
        this.field5847 = class498.method2854(-109);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method2415(Component arg0) throws Exception {
        field5846++;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static void method2468(int arg0) {
        field5842 = null;
        if (arg0 != -3) {
            field5859 = 64L;
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public void method2409(int arg0) throws Exception {
        field5850++;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
    public void method2414() throws Exception {
        field5856++;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "()V")
    public void method2413() throws Exception {
        field5848++;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "()V")
    public void method2411() {
        field5841++;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "()I")
    public int method2410() throws Exception {
        field5851++;
        return this.field5870;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZLgm;)V")
    public final synchronized void method2469(boolean arg0, class79 arg1) {
        field5860++;
        this.field5852 = arg1;
        if (arg0) {
            this.field5847 = -117L;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)V")
    private final void method2470(byte arg0, int arg1) {
        if (arg0 < 47) {
            this.field5873 = -104;
        }
        field5857++;
        this.field5866 -= arg1;
        if (this.field5866 < 0) {
            this.field5866 = 0;
        }
        if (this.field5852 != null) {
            this.field5852.method71(arg1);
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
    public final synchronized void method2471(int arg0) {
        field5855++;
        if (class291.field3823 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class291.field3823.field4966[var3] == this) {
                    class291.field3823.field4966[var3] = null;
                }
                if (class291.field3823.field4966[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class291.field3823.field4970 = true;
                while (class291.field3823.field4969) {
                    class94.method674(50L, 1);
                }
                class291.field3823 = null;
            }
        }
        this.method2411();
        this.field5858 = null;
        if (arg0 <= -42) {
            this.field5861 = true;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIII)V")
    public static final void method2472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5849++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg3 != 15464) {
            field5859 = 41L;
        }
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        class427.method2465(class457.field6299[arg4], arg1 + arg5, -arg5 + arg1, -7, arg2);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class427.method2465(class457.field6299[var21], var23, var24, -7, arg2);
            class427.method2465(class457.field6299[var22], var23, var24, -7, arg2);
        }
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
    public final synchronized void method2473(int arg0) {
        field5843++;
        if (this.field5861) {
            return;
        }
        long var2 = class498.method2854(-123);
        try {
            if ((this.field5847 + 500000L) < var2) {
                this.field5847 = var2 - 500000L;
            }
            while (var2 > (this.field5847 + 5000L)) {
                this.method2470((byte) 119, 256);
                this.field5847 += (256000 / class296.field3877);
            }
        } catch (Exception var7) {
            this.field5847 = var2;
        }
        if (this.field5858 == null) {
            return;
        }
        try {
            if ((long) arg0 != this.field5864) {
                if (this.field5864 > var2) {
                    return;
                }
                this.method2409(this.field5870);
                this.field5864 = 0L;
                this.field5863 = true;
            }
            int var4 = this.method2410();
            if ((this.field5867 - var4) > this.field5865) {
                this.field5865 = this.field5867 - var4;
            }
            int var5 = this.field5873 + this.field5868;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field5870 < (var5 + 256)) {
                this.field5870 += 1024;
                if (this.field5870 > 16384) {
                    this.field5870 = 16384;
                }
                this.method2411();
                var4 = 0;
                this.method2409(this.field5870);
                this.field5863 = true;
                if (this.field5870 < (var5 + 256)) {
                    var5 = this.field5870 - 256;
                    this.field5873 = var5 - this.field5868;
                }
            }
            while (var4 < var5) {
                this.method2467(this.field5858, 256);
                var4 += 256;
                this.method2414();
            }
            if (this.field5871 < var2) {
                if (this.field5863) {
                    this.field5863 = false;
                } else if (this.field5865 == 0 && this.field5869 == 0) {
                    this.method2411();
                    this.field5864 = var2 + 2000L;
                    return;
                } else {
                    this.field5873 = Math.min(this.field5869, this.field5865);
                    this.field5869 = this.field5865;
                }
                this.field5871 = var2 + 2000L;
                this.field5865 = 0;
            }
            this.field5867 = var4;
        } catch (Exception var6) {
            this.method2411();
            this.field5864 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBLgm;)V")
    private final void method2474(int arg0, byte arg1, class79 arg2) {
        field5854++;
        int var4 = arg0 >> 5;
        class79 var5 = this.field5872[var4];
        if (var5 == null) {
            this.field5862[var4] = arg2;
        } else {
            var5.field1179 = arg2;
        }
        this.field5872[var4] = arg2;
        if (arg1 == 94) {
            arg2.field1178 = arg0;
        }
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
    public final void method2475(int arg0) {
        this.field5863 = true;
        if (arg0 != 18298) {
            this.field5864 = 30L;
        }
        field5845++;
    }

    static {
        new class304(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }
}
