import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class635 {

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    private int field8960 = 32;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "Z")
    private boolean field8970 = false;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "J")
    private long field8961 = class337.method2062(false);

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "J")
    private long field8972 = 0L;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    private int field8974 = 0;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "Z")
    private boolean field8973 = true;

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "J")
    private long field8980 = 0L;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "[Lfja;")
    private class202[] field8979 = new class202[8];

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "I")
    private int field8978 = 0;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    private int field8975 = 0;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "[Lfja;")
    private class202[] field8977 = new class202[8];

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "I")
    private int field8983 = 0;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "[I")
    public static int[] field8954 = new int[50];

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field8971 = -1;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Lmaa;")
    public static class461 field8952 = new class461();

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public int field8976;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
    private int field8981;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
    public int field8984;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "Lfja;")
    private class202 field8967;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "[I")
    public int[] field8966;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "()V")
    public void method2279() throws Exception {
        field8982++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lfja;II)V")
    private final void method3613(class202 arg0, int arg1, int arg2) {
        field8955++;
        int var4 = arg1 >> 5;
        if (arg2 > -63) {
            return;
        }
        class202 var5 = this.field8979[var4];
        if (var5 == null) {
            this.field8977[var4] = arg0;
        } else {
            var5.field2994 = arg0;
        }
        this.field8979[var4] = arg0;
        arg0.field2997 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method3614(int arg0) {
        if (arg0 == 0) {
            field8954 = null;
            field8952 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public void method2282(int arg0) throws Exception {
        field8962++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLfja;)V")
    public final synchronized void method3615(byte arg0, class202 arg1) {
        field8965++;
        this.field8967 = arg1;
        if (arg0 != 126) {
            this.method2280();
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "()V")
    public void method2280() {
        field8963++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "([II)V")
    private final void method3616(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class209.field3076) {
            var3 = arg1 << 1;
        }
        class171.method1260(arg0, 0, var3);
        this.field8978 -= arg1;
        if (this.field8967 != null && this.field8978 <= 0) {
            this.field8978 += class702.field9843 >> 4;
            class30.method256(0, this.field8967);
            this.method3613(this.field8967, this.field8967.method1419(), -83);
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
                        class202 var10 = null;
                        class202 var11 = this.field8977[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class574 var12 = var11.field2996;
                                if (var12 == null || var12.field8287 <= var8) {
                                    var11.field2995 = true;
                                    int var13 = var11.method1418();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8287 += var13;
                                    }
                                    if (var4 >= this.field8960) {
                                        break label107;
                                    }
                                    class202 var14 = var11.method1423();
                                    if (var14 != null) {
                                        int var15 = var11.field2997;
                                        while (var14 != null) {
                                            this.method3613(var14, var15 * var14.method1419() >> 8, -74);
                                            var14 = var11.method1420();
                                        }
                                    }
                                    class202 var16 = var11.field2994;
                                    var11.field2994 = null;
                                    if (var10 == null) {
                                        this.field8977[var7] = var16;
                                    } else {
                                        var10.field2994 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field8979[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2994;
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
                class202 var18 = this.field8977[var17];
                this.field8977[var17] = this.field8979[var17] = null;
                while (var18 != null) {
                    class202 var19 = var18.field2994;
                    var18.field2994 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field8978 < 0) {
            this.field8978 = 0;
        }
        if (this.field8967 != null) {
            this.field8967.method1422(arg0, 0, arg1);
        }
        this.field8961 = class337.method2062(false);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public final synchronized void method3617(byte arg0) {
        field8968++;
        if (this.field8970) {
            return;
        }
        long var2 = class337.method2062(false);
        try {
            if (var2 > this.field8961 + 6000L) {
                this.field8961 = var2 - 6000L;
            }
            while ((this.field8961 + 5000L) < var2) {
                this.method3618((byte) -110, 256);
                this.field8961 += (256000 / class702.field9843);
                var2 = class337.method2062(false);
            }
        } catch (Exception var7) {
            this.field8961 = var2;
        }
        if (arg0 > -27 || this.field8966 == null) {
            return;
        }
        try {
            if (this.field8980 != 0L) {
                if (var2 < this.field8980) {
                    return;
                }
                this.method2282(this.field8984);
                this.field8980 = 0L;
                this.field8973 = true;
            }
            int var4 = this.method2281();
            if ((this.field8974 - var4) > this.field8983) {
                this.field8983 = this.field8974 - var4;
            }
            int var5 = this.field8981 + this.field8976;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field8984) {
                this.field8984 += 1024;
                if (this.field8984 > 16384) {
                    this.field8984 = 16384;
                }
                this.method2280();
                var4 = 0;
                this.method2282(this.field8984);
                if (var5 + 256 > this.field8984) {
                    var5 = this.field8984 - 256;
                    this.field8981 = var5 - this.field8976;
                }
                this.field8973 = true;
            }
            while (var5 > var4) {
                this.method3616(this.field8966, 256);
                this.method2277();
                var4 += 256;
            }
            if (var2 > this.field8972) {
                if (this.field8973) {
                    this.field8973 = false;
                } else if (this.field8983 == 0 && this.field8975 == 0) {
                    this.method2280();
                    this.field8980 = var2 + 2000L;
                    return;
                } else {
                    this.field8981 = Math.min(this.field8975, this.field8983);
                    this.field8975 = this.field8983;
                }
                this.field8972 = var2 + 2000L;
                this.field8983 = 0;
            }
            this.field8974 = var4;
        } catch (Exception var6) {
            this.method2280();
            this.field8980 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)V")
    private final void method3618(byte arg0, int arg1) {
        this.field8978 -= arg1;
        field8969++;
        if (arg0 > -52) {
            this.field8960 = -5;
        }
        if (this.field8978 < 0) {
            this.field8978 = 0;
        }
        if (this.field8967 != null) {
            this.field8967.method1421(arg1);
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
    public final synchronized void method3619(byte arg0) {
        field8959++;
        this.field8973 = true;
        try {
            if (arg0 != -116) {
                this.method3613(null, 71, -88);
            }
            this.method2279();
        } catch (Exception var2) {
            this.method2280();
            this.field8980 = class337.method2062(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V")
    public static final void method3620(byte arg0) {
        class74.field1141 = new class774(8);
        int var1 = 66 % ((-arg0 - 48) / 41);
        field8964++;
        class120.field2045 = 0;
        for (class187 var2 = (class187) class546.field7568.method1730((byte) 127); var2 != null; var2 = (class187) class546.field7568.method1729((byte) 100)) {
            var2.method1345();
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method2283(Component arg0) throws Exception {
        field8956++;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)V")
    public final synchronized void method3621(byte arg0) {
        field8958++;
        if (class329.field4687 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class329.field4687.field6761[var3] == this) {
                    class329.field4687.field6761[var3] = null;
                }
                if (class329.field4687.field6761[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class329.field4687.field6759 = true;
                while (class329.field4687.field6762) {
                    class579.method3405(50L, 10);
                }
                class329.field4687 = null;
            }
        }
        this.method2280();
        this.field8970 = true;
        this.field8966 = null;
        int var4 = -41 / ((-arg0 - 74) / 43);
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "()I")
    public int method2281() throws Exception {
        field8957++;
        return this.field8984;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "()V")
    public void method2277() throws Exception {
        field8953++;
    }
}
