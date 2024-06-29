import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class550 {

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    private int field7567 = 32;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "Z")
    private boolean field7576 = false;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "J")
    private long field7568 = class554.method3190(-99);

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "J")
    private long field7580 = 0L;

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "J")
    private long field7584 = 0L;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
    private int field7581 = 0;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "I")
    private int field7583 = 0;

    @OriginalMember(owner = "client!cba", name = "B", descriptor = "[Ljba;")
    private class400[] field7587 = new class400[8];

    @OriginalMember(owner = "client!cba", name = "D", descriptor = "Z")
    private boolean field7589 = true;

    @OriginalMember(owner = "client!cba", name = "C", descriptor = "I")
    private int field7588 = 0;

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "[Ljba;")
    private class400[] field7585 = new class400[8];

    @OriginalMember(owner = "client!cba", name = "E", descriptor = "I")
    private int field7590 = 0;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "I")
    public int field7579;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
    private int field7582;

    @OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
    public int field7586;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "Ljba;")
    private class400 field7570;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "[I")
    public int[] field7569;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "()I")
    public int method663() throws Exception {
        field7571++;
        return this.field7579;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public void method668(int arg0) throws Exception {
        field7573++;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "()V")
    public void method662() throws Exception {
        field7572++;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
    public final synchronized void method3165(int arg0) {
        field7561++;
        if (this.field7576) {
            return;
        }
        long var2 = class554.method3190(-107);
        try {
            if ((this.field7568 + 6000L) < var2) {
                this.field7568 = var2 - 6000L;
            }
            if (arg0 != -6858) {
                this.field7582 = 114;
            }
            while (this.field7568 + 5000L < var2) {
                this.method3170(256, (byte) -99);
                this.field7568 += (256000 / class103.field1834);
                var2 = class554.method3190(-96);
            }
        } catch (Exception var7) {
            this.field7568 = var2;
        }
        if (this.field7569 == null) {
            return;
        }
        try {
            if (this.field7580 != 0L) {
                if (var2 < this.field7580) {
                    return;
                }
                this.method668(this.field7579);
                this.field7589 = true;
                this.field7580 = 0L;
            }
            int var4 = this.method663();
            if (this.field7588 - var4 > this.field7590) {
                this.field7590 = this.field7588 - var4;
            }
            int var5 = this.field7586 + this.field7582;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field7579) {
                this.field7579 += 1024;
                if (this.field7579 > 16384) {
                    this.field7579 = 16384;
                }
                this.method665();
                this.method668(this.field7579);
                var4 = 0;
                this.field7589 = true;
                if (var5 + 256 > this.field7579) {
                    var5 = this.field7579 - 256;
                    this.field7582 = var5 - this.field7586;
                }
            }
            while (var5 > var4) {
                this.method3167(this.field7569, 256);
                this.method667();
                var4 += 256;
            }
            if (var2 > this.field7584) {
                if (this.field7589) {
                    this.field7589 = false;
                } else if (this.field7590 == 0 && this.field7583 == 0) {
                    this.method665();
                    this.field7580 = var2 + 2000L;
                    return;
                } else {
                    this.field7582 = Math.min(this.field7583, this.field7590);
                    this.field7583 = this.field7590;
                }
                this.field7584 = var2 + 2000L;
                this.field7590 = 0;
            }
            this.field7588 = var4;
        } catch (Exception var6) {
            this.method665();
            this.field7580 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjba;I)V")
    private final void method3166(int arg0, class400 arg1, int arg2) {
        field7563++;
        int var4 = arg2 >> 5;
        if (arg0 != -1846918107) {
            this.method3169(true, null);
        }
        class400 var5 = this.field7587[var4];
        if (var5 == null) {
            this.field7585[var4] = arg1;
        } else {
            var5.field5904 = arg1;
        }
        this.field7587[var4] = arg1;
        arg1.field5905 = arg2;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([II)V")
    private final void method3167(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class86.field1544) {
            var3 = arg1 << 1;
        }
        class363.method2315(arg0, 0, var3);
        this.field7581 -= arg1;
        if (this.field7570 != null && this.field7581 <= 0) {
            this.field7581 += class103.field1834 >> 4;
            class7.method30(this.field7570, 112);
            this.method3166(-1846918107, this.field7570, this.field7570.method2502());
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
                        class400 var10 = null;
                        class400 var11 = this.field7585[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class610 var12 = var11.field5906;
                                if (var12 == null || var12.field8363 <= var8) {
                                    var11.field5903 = true;
                                    int var13 = var11.method111();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8363 += var13;
                                    }
                                    if (var4 >= this.field7567) {
                                        break label107;
                                    }
                                    class400 var14 = var11.method103();
                                    if (var14 != null) {
                                        int var15 = var11.field5905;
                                        while (var14 != null) {
                                            this.method3166(-1846918107, var14, var15 * var14.method2502() >> 8);
                                            var14 = var11.method69();
                                        }
                                    }
                                    class400 var16 = var11.field5904;
                                    var11.field5904 = null;
                                    if (var10 == null) {
                                        this.field7585[var7] = var16;
                                    } else {
                                        var10.field5904 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field7587[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5904;
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
                class400 var18 = this.field7585[var17];
                this.field7585[var17] = this.field7587[var17] = null;
                while (var18 != null) {
                    class400 var19 = var18.field5904;
                    var18.field5904 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field7581 < 0) {
            this.field7581 = 0;
        }
        if (this.field7570 != null) {
            this.field7570.method92(arg0, 0, arg1);
        }
        this.field7568 = class554.method3190(-102);
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
    public final synchronized void method3168(int arg0) {
        this.field7589 = true;
        field7565++;
        try {
            if (arg0 >= -110) {
                this.field7568 = -66L;
            }
            this.method662();
        } catch (Exception var2) {
            this.method665();
            this.field7580 = class554.method3190(-96) + 2000L;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZLjba;)V")
    public final synchronized void method3169(boolean arg0, class400 arg1) {
        if (arg0) {
            this.method3166(0, null, 69);
        }
        this.field7570 = arg1;
        field7566++;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IB)V")
    private final void method3170(int arg0, byte arg1) {
        field7577++;
        this.field7581 -= arg0;
        if (this.field7581 < 0) {
            this.field7581 = 0;
        }
        if (this.field7570 != null) {
            this.field7570.method89(arg0);
        }
        if (arg1 > -75) {
            method3171(13, 6, true, (byte) 40, 67, -121, -107);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIZBIII)V")
    public static final void method3171(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        if ((arg2 ? class693.field9368.field4412.method820(-32350) : class693.field9368.field4469.method820(-32350)) != 0 && arg0 != 0 && class649.field8920 < 50 && arg6 != -1) {
            class429.field6148[class649.field8920++] = new class456((byte) (arg2 ? 3 : 2), arg6, arg0, arg5, arg4, 0, arg1, null);
        }
        if (arg3 == -35) {
            field7574++;
        }
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "()V")
    public void method665() {
        field7564++;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V")
    public static final void method3172(int arg0, int arg1, int[] arg2, int arg3, Object[] arg4) {
        int var5 = -92 / ((arg3 + 55) / 57);
        if (arg0 > arg1) {
            int var6 = (arg0 + arg1) / 2;
            int var7 = arg1;
            int var8 = arg2[var6];
            arg2[var6] = arg2[arg0];
            arg2[arg0] = var8;
            Object var9 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var9;
            int var10 = var8 == Integer.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg0; var11++) {
                if (arg2[var11] < (var10 & var11) + var8) {
                    int var12 = arg2[var11];
                    arg2[var11] = arg2[var7];
                    arg2[var7] = var12;
                    Object var13 = arg4[var11];
                    arg4[var11] = arg4[var7];
                    arg4[var7++] = var13;
                }
            }
            arg2[arg0] = arg2[var7];
            arg2[var7] = var8;
            arg4[arg0] = arg4[var7];
            arg4[var7] = var9;
            method3172(var7 - 1, arg1, arg2, 9, arg4);
            method3172(arg0, var7 + 1, arg2, -127, arg4);
        }
        field7560++;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)V")
    public final synchronized void method3173(boolean arg0) {
        field7575++;
        if (class468.field6565 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class468.field6565.field5754[var3] == this) {
                    class468.field6565.field5754[var3] = null;
                }
                if (class468.field6565.field5754[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class468.field6565.field5757 = true;
                while (class468.field6565.field5759) {
                    class700.method3916((byte) 68, 50L);
                }
                class468.field6565 = null;
            }
        }
        this.method665();
        this.field7569 = null;
        this.field7576 = arg0;
    }

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "()V")
    public void method667() throws Exception {
        field7578++;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method666(Component arg0) throws Exception {
        field7562++;
    }
}
