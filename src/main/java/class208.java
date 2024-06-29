import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class208 {

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Z")
    private boolean field3008 = false;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    private int field3006 = 32;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "J")
    private long field3010 = class465.method2699((byte) 14);

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    private int field3030 = 0;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    private int field3026 = 0;

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "[Lcv;")
    private class407[] field3032 = new class407[8];

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "J")
    private long field3034 = 0L;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "J")
    private long field3028 = 0L;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
    private boolean field3029 = true;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
    private int field3035 = 0;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    private int field3037 = 0;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "[Lcv;")
    private class407[] field3036 = new class407[8];

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Z")
    public static boolean field3020 = false;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "[I")
    public static int[] field3021 = new int[8];

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    private int field3027;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "Lcv;")
    private class407 field3023;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
    public int[] field3005;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "()I", line = 7)
    public int method795() throws Exception {
        field3011++;
        return this.field3033;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILcv;)V", line = 18)
    public final synchronized void method1324(int arg0, class407 arg1) {
        if (arg0 < 44) {
            this.method1328(31);
        }
        this.field3023 = arg1;
        field3016++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([II)V", line = 32)
    private final void method1325(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class366.field5230) {
            var3 = arg1 << 1;
        }
        class182.method1136(arg0, 0, var3);
        this.field3026 -= arg1;
        if (this.field3023 != null && this.field3026 <= 0) {
            this.field3026 += class289.field4225 >> 4;
            class531.method3126(this.field3023, -123);
            this.method1330(this.field3023, false, this.field3023.method1473());
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
                        class407 var10 = null;
                        class407 var11 = this.field3036[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class7 var12 = var11.field5764;
                                if (var12 == null || var12.field112 <= var8) {
                                    var11.field5762 = true;
                                    int var13 = var11.method518();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field112 += var13;
                                    }
                                    if (var4 >= this.field3006) {
                                        break label107;
                                    }
                                    class407 var14 = var11.method520();
                                    if (var14 != null) {
                                        int var15 = var11.field5761;
                                        while (var14 != null) {
                                            this.method1330(var14, false, var15 * var14.method1473() >> 8);
                                            var14 = var11.method511();
                                        }
                                    }
                                    class407 var16 = var11.field5763;
                                    var11.field5763 = null;
                                    if (var10 == null) {
                                        this.field3036[var7] = var16;
                                    } else {
                                        var10.field5763 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3032[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5763;
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
                class407 var18 = this.field3036[var17];
                this.field3036[var17] = this.field3032[var17] = null;
                while (var18 != null) {
                    class407 var19 = var18.field5763;
                    var18.field5763 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3026 < 0) {
            this.field3026 = 0;
        }
        if (this.field3023 != null) {
            this.field3023.method512(arg0, 0, arg1);
        }
        this.field3010 = class465.method2699((byte) 14);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 191)
    public void method801(Component arg0) throws Exception {
        field3019++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 198)
    public final synchronized void method1326(int arg0) {
        if (class75.field948 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class75.field948.field5001[var3] == this) {
                    class75.field948.field5001[var3] = null;
                }
                if (class75.field948.field5001[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class75.field948.field4999 = true;
                while (class75.field948.field4996) {
                    class52.method411(50L, (byte) 125);
                }
                class75.field948 = null;
            }
        }
        field3014++;
        if (arg0 != 0) {
            this.field3005 = null;
        }
        this.method800();
        this.field3008 = true;
        this.field3005 = null;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "()V", line = 242)
    public void method796() throws Exception {
        field3022++;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V", line = 260)
    private final void method1327(int arg0, byte arg1) {
        this.field3026 -= arg0;
        field3013++;
        if (this.field3026 < 0) {
            this.field3026 = 0;
        }
        if (this.field3023 != null) {
            this.field3023.method519(arg0);
        }
        if (arg1 <= 115) {
            this.method800();
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 277)
    public final synchronized void method1328(int arg0) {
        if (arg0 <= 92) {
            this.field3008 = true;
        }
        field3024++;
        this.field3029 = true;
        try {
            this.method796();
        } catch (Exception var2) {
            this.method800();
            this.field3034 = class465.method2699((byte) 14) + 2000L;
        }
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "()V", line = 300)
    public void method798() throws Exception {
        field3012++;
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V", line = 307)
    public void method797(int arg0) throws Exception {
        field3015++;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V", line = 314)
    public final synchronized void method1329(int arg0) {
        field3007++;
        if (this.field3008) {
            return;
        }
        long var2 = class465.method2699((byte) 14);
        try {
            if (this.field3010 + 500000L < var2) {
                this.field3010 = var2 - 500000L;
            }
            while ((this.field3010 + 5000L) < var2) {
                this.method1327(256, (byte) 127);
                this.field3010 += (256000 / class289.field4225);
            }
        } catch (Exception var7) {
            this.field3010 = var2;
        }
        if (this.field3005 == null) {
            return;
        }
        try {
            if (this.field3034 != 0L) {
                if (this.field3034 > var2) {
                    return;
                }
                this.method797(this.field3033);
                this.field3029 = true;
                this.field3034 = 0L;
            }
            int var4 = this.method795();
            if (arg0 != 3) {
                this.method1324(56, null);
            }
            if (this.field3035 < (this.field3037 - var4)) {
                this.field3035 = this.field3037 - var4;
            }
            int var5 = this.field3027 + this.field3025;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3033 < var5 + 256) {
                this.field3033 += 1024;
                if (this.field3033 > 16384) {
                    this.field3033 = 16384;
                }
                this.method800();
                this.method797(this.field3033);
                var4 = 0;
                this.field3029 = true;
                if (this.field3033 < (var5 + 256)) {
                    var5 = this.field3033 - 256;
                    this.field3027 = var5 - this.field3025;
                }
            }
            while (var4 < var5) {
                this.method1325(this.field3005, 256);
                this.method798();
                var4 += 256;
            }
            if (this.field3028 < var2) {
                if (this.field3029) {
                    this.field3029 = false;
                } else if (this.field3035 == 0 && this.field3030 == 0) {
                    this.method800();
                    this.field3034 = var2 + 2000L;
                    return;
                } else {
                    this.field3027 = Math.min(this.field3030, this.field3035);
                    this.field3030 = this.field3035;
                }
                this.field3035 = 0;
                this.field3028 = var2 + 2000L;
            }
            this.field3037 = var4;
        } catch (Exception var6) {
            this.method800();
            this.field3034 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lcv;ZI)V", line = 431)
    private final void method1330(class407 arg0, boolean arg1, int arg2) {
        field3031++;
        int var4 = arg2 >> 5;
        class407 var5 = this.field3032[var4];
        if (var5 == null) {
            this.field3036[var4] = arg0;
        } else {
            var5.field5763 = arg0;
        }
        if (!arg1) {
            this.field3032[var4] = arg0;
            arg0.field5761 = arg2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V", line = 493)
    public static void method1331(int arg0) {
        field3021 = null;
        if (arg0 != 4) {
            method1331(-80);
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "()V", line = 512)
    public void method800() {
        field3018++;
    }
}
