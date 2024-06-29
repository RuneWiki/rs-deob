import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class65 {

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "Z")
    private boolean field717 = false;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    private int field710 = 32;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "J")
    private long field713 = class538.method2963(-47);

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    private int field728 = 0;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    private int field727 = 0;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[Lmha;")
    private class417[] field733 = new class417[8];

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "J")
    private long field731 = 0L;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    private int field726 = 0;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Z")
    private boolean field725 = true;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "J")
    private long field723 = 0L;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "[Lmha;")
    private class417[] field735 = new class417[8];

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    private int field729 = 0;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    private int field732;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Lmha;")
    private class417 field708;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "[I")
    public int[] field712;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static final void method494(int arg0) {
        if (arg0 != 0) {
            field716 = -86;
        }
        class479.field6613.method2556(-71);
        field722++;
        class214.field2572.method2342(16711680);
        class275.field3677.method2342(16711680);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
    public final synchronized void method495(byte arg0) {
        field718++;
        this.field725 = true;
        try {
            this.method505();
            int var2 = -67 / ((-arg0 - 38) / 34);
        } catch (Exception var3) {
            this.method508();
            this.field731 = class538.method2963(-47) + 2000L;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
    public void method496(int arg0) throws Exception {
        field720++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILmha;I)V")
    private final void method497(int arg0, class417 arg1, int arg2) {
        field711++;
        int var4 = arg2 >> 5;
        class417 var5 = this.field735[var4];
        if (var5 == null) {
            this.field733[var4] = arg1;
        } else {
            var5.field5873 = arg1;
        }
        this.field735[var4] = arg1;
        arg1.field5875 = arg2;
        if (arg0 != -16680) {
            this.field728 = 29;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILmha;)V")
    public final synchronized void method498(int arg0, class417 arg1) {
        field715++;
        this.field708 = arg1;
        if (arg0 != 0) {
            this.field712 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method499(Component arg0) throws Exception {
        field734++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lr;III[Z)V")
    public static final void method500(class184 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class25.field188 == class143.field1850) {
            return;
        }
        int var5 = class86.field1182[arg1].method1683(arg2, arg3, true);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class281 var7 = class86.field1182[var6];
                if (var7 != null) {
                    var7.method1529(arg0, arg2, var5 - var7.method1683(arg2, arg3, true), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([II)V")
    private final void method501(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class460.field6375) {
            var3 = arg1 << 1;
        }
        class373.method2193(arg0, 0, var3);
        this.field729 -= arg1;
        if (this.field708 != null && this.field729 <= 0) {
            this.field729 += class478.field6609 >> 4;
            class650.method3672((byte) -32, this.field708);
            this.method497(-16680, this.field708, this.field708.method2397());
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
                        class417 var10 = null;
                        class417 var11 = this.field733[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class338 var12 = var11.field5876;
                                if (var12 == null || var12.field4561 <= var8) {
                                    var11.field5874 = true;
                                    int var13 = var11.method1979();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4561 += var13;
                                    }
                                    if (var4 >= this.field710) {
                                        break label107;
                                    }
                                    class417 var14 = var11.method1989();
                                    if (var14 != null) {
                                        int var15 = var11.field5875;
                                        while (var14 != null) {
                                            this.method497(-16680, var14, var15 * var14.method2397() >> 8);
                                            var14 = var11.method1991();
                                        }
                                    }
                                    class417 var16 = var11.field5873;
                                    var11.field5873 = null;
                                    if (var10 == null) {
                                        this.field733[var7] = var16;
                                    } else {
                                        var10.field5873 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field735[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5873;
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
                class417 var18 = this.field733[var17];
                this.field733[var17] = this.field735[var17] = null;
                while (var18 != null) {
                    class417 var19 = var18.field5873;
                    var18.field5873 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field729 < 0) {
            this.field729 = 0;
        }
        if (this.field708 != null) {
            this.field708.method1985(arg0, 0, arg1);
        }
        this.field713 = class538.method2963(-47);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
    public final synchronized void method502(byte arg0) {
        if (class713.field9948 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class713.field9948.field9466[var3] == this) {
                    class713.field9948.field9466[var3] = null;
                }
                if (class713.field9948.field9466[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class713.field9948.field9464 = true;
                while (class713.field9948.field9467) {
                    class267.method1599(0, 50L);
                }
                class713.field9948 = null;
            }
        }
        field721++;
        this.method508();
        this.field712 = null;
        this.field717 = true;
        if (arg0 <= 24) {
            this.field727 = -23;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
    public void method503() throws Exception {
        field714++;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()I")
    public int method504() throws Exception {
        field704++;
        return this.field724;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "()V")
    public void method505() throws Exception {
        field709++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    private final void method506(int arg0, int arg1) {
        this.field729 -= arg0;
        field719++;
        if (this.field729 < 0) {
            this.field729 = 0;
        }
        int var3 = 23 % ((-arg1 - 58) / 48);
        if (this.field708 != null) {
            this.field708.method1974(arg0);
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)V")
    public final synchronized void method507(byte arg0) {
        field705++;
        if (this.field717) {
            return;
        }
        long var2 = class538.method2963(-47);
        try {
            if (this.field713 + 6000L < var2) {
                this.field713 = var2 - 6000L;
            }
            while (this.field713 + 5000L < var2) {
                this.method506(256, -113);
                this.field713 += (256000 / class478.field6609);
                var2 = class538.method2963(-47);
            }
        } catch (Exception var7) {
            this.field713 = var2;
        }
        if (this.field712 == null) {
            return;
        }
        try {
            if (this.field731 != 0L) {
                if (var2 < this.field731) {
                    return;
                }
                this.method496(this.field724);
                this.field731 = 0L;
                this.field725 = true;
            }
            if (arg0 >= -66) {
                method494(122);
            }
            int var4 = this.method504();
            if ((this.field727 - var4) > this.field726) {
                this.field726 = this.field727 - var4;
            }
            int var5 = this.field732 + this.field730;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field724 < var5 + 256) {
                this.field724 += 1024;
                if (this.field724 > 16384) {
                    this.field724 = 16384;
                }
                this.method508();
                this.method496(this.field724);
                var4 = 0;
                this.field725 = true;
                if (this.field724 < (var5 + 256)) {
                    var5 = this.field724 - 256;
                    this.field732 = var5 - this.field730;
                }
            }
            while (var5 > var4) {
                this.method501(this.field712, 256);
                this.method503();
                var4 += 256;
            }
            if (this.field723 < var2) {
                if (this.field725) {
                    this.field725 = false;
                } else if (this.field726 == 0 && this.field728 == 0) {
                    this.method508();
                    this.field731 = var2 + 2000L;
                    return;
                } else {
                    this.field732 = Math.min(this.field728, this.field726);
                    this.field728 = this.field726;
                }
                this.field726 = 0;
                this.field723 = var2 + 2000L;
            }
            this.field727 = var4;
        } catch (Exception var6) {
            this.method508();
            this.field731 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "()V")
    public void method508() {
        field706++;
    }
}
