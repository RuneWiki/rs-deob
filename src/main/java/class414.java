import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class414 {

    @OriginalMember(owner = "client!br", name = "w", descriptor = "Z")
    private boolean field5967 = false;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    private int field5965 = 32;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "J")
    private long field5954 = class401.method2440(false);

    @OriginalMember(owner = "client!br", name = "y", descriptor = "I")
    private int field5969 = 0;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "Z")
    private boolean field5970 = true;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "J")
    private long field5972 = 0L;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "[Lpp;")
    private class413[] field5976 = new class413[8];

    @OriginalMember(owner = "client!br", name = "D", descriptor = "J")
    private long field5973 = 0L;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "[Lpp;")
    private class413[] field5975 = new class413[8];

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    private int field5977 = 0;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "I")
    private int field5974 = 0;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    private int field5978 = 0;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "I")
    public static int field5966 = 2;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[I")
    public static int[] field5958 = new int[2];

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "I")
    public int field5968;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "I")
    private int field5971;

    @OriginalMember(owner = "client!br", name = "J", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "Lpp;")
    private class413 field5963;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "[I")
    public int[] field5949;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public void method2292(int arg0) throws Exception {
        field5964++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "()I")
    public int method2293() throws Exception {
        field5947++;
        return this.field5979;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "([II)V")
    private final void method2490(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class177.field2341) {
            var3 = arg1 << 1;
        }
        class421.method2530(arg0, 0, var3);
        this.field5969 -= arg1;
        if (this.field5963 != null && this.field5969 <= 0) {
            this.field5969 += class624.field8419 >> 4;
            class163.method1131(12972, this.field5963);
            this.method2495(this.field5963, true, this.field5963.method1936());
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
                        class413 var10 = null;
                        class413 var11 = this.field5976[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class288 var12 = var11.field5941;
                                if (var12 == null || var12.field4109 <= var8) {
                                    var11.field5944 = true;
                                    int var13 = var11.method24();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4109 += var13;
                                    }
                                    if (var4 >= this.field5965) {
                                        break label107;
                                    }
                                    class413 var14 = var11.method15();
                                    if (var14 != null) {
                                        int var15 = var11.field5943;
                                        while (var14 != null) {
                                            this.method2495(var14, true, var15 * var14.method1936() >> 8);
                                            var14 = var11.method13();
                                        }
                                    }
                                    class413 var16 = var11.field5942;
                                    var11.field5942 = null;
                                    if (var10 == null) {
                                        this.field5976[var7] = var16;
                                    } else {
                                        var10.field5942 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5975[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5942;
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
                class413 var18 = this.field5976[var17];
                this.field5976[var17] = this.field5975[var17] = null;
                while (var18 != null) {
                    class413 var19 = var18.field5942;
                    var18.field5942 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5969 < 0) {
            this.field5969 = 0;
        }
        if (this.field5963 != null) {
            this.field5963.method18(arg0, 0, arg1);
        }
        this.field5954 = class401.method2440(false);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILuq;ZIII)V")
    public static final void method2491(int arg0, class172 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 11889) {
            method2499((byte) 91);
        }
        field5956++;
        class166.method1139(arg1, arg5, arg0, arg4, (byte) 124, 0L, arg2);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "()V")
    public void method2294() throws Exception {
        field5952++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public final synchronized void method2492(byte arg0) {
        field5946++;
        if (this.field5967) {
            return;
        }
        long var2 = class401.method2440(false);
        try {
            if (var2 > (this.field5954 + 6000L)) {
                this.field5954 = var2 - 6000L;
            }
            while (var2 > (this.field5954 + 5000L)) {
                this.method2494(256, false);
                this.field5954 += (256000 / class624.field8419);
                var2 = class401.method2440(false);
            }
        } catch (Exception var7) {
            this.field5954 = var2;
        }
        if (this.field5949 == null) {
            return;
        }
        try {
            if (this.field5973 != 0L) {
                if (this.field5973 > var2) {
                    return;
                }
                this.method2292(this.field5979);
                this.field5973 = 0L;
                this.field5970 = true;
            }
            int var4 = this.method2293();
            if (this.field5974 - var4 > this.field5978) {
                this.field5978 = this.field5974 - var4;
            }
            int var5 = this.field5968 + this.field5971;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field5979) {
                this.field5979 += 1024;
                if (this.field5979 > 16384) {
                    this.field5979 = 16384;
                }
                this.method2295();
                var4 = 0;
                this.method2292(this.field5979);
                if (this.field5979 < (var5 + 256)) {
                    var5 = this.field5979 - 256;
                    this.field5971 = var5 - this.field5968;
                }
                this.field5970 = true;
            }
            if (arg0 >= 32) {
                while (var5 > var4) {
                    this.method2490(this.field5949, 256);
                    this.method2294();
                    var4 += 256;
                }
                if (this.field5972 < var2) {
                    if (this.field5970) {
                        this.field5970 = false;
                    } else if (this.field5978 == 0 && this.field5977 == 0) {
                        this.method2295();
                        this.field5973 = var2 + 2000L;
                        return;
                    } else {
                        this.field5971 = Math.min(this.field5977, this.field5978);
                        this.field5977 = this.field5978;
                    }
                    this.field5972 = var2 + 2000L;
                    this.field5978 = 0;
                }
                this.field5974 = var4;
            }
        } catch (Exception var6) {
            this.method2295();
            this.field5973 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method2297(Component arg0) throws Exception {
        field5962++;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
    public final synchronized void method2493(byte arg0) {
        this.field5970 = true;
        field5961++;
        try {
            if (arg0 == -76) {
                this.method2296();
            }
        } catch (Exception var2) {
            this.method2295();
            this.field5973 = class401.method2440(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
    private final void method2494(int arg0, boolean arg1) {
        field5957++;
        this.field5969 -= arg0;
        if (this.field5969 < 0) {
            this.field5969 = 0;
        }
        if (arg1) {
            this.field5973 = 54L;
        }
        if (this.field5963 != null) {
            this.field5963.method17(arg0);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lpp;ZI)V")
    private final void method2495(class413 arg0, boolean arg1, int arg2) {
        field5959++;
        if (!arg1) {
            return;
        }
        int var4 = arg2 >> 5;
        class413 var5 = this.field5975[var4];
        if (var5 == null) {
            this.field5976[var4] = arg0;
        } else {
            var5.field5942 = arg0;
        }
        this.field5975[var4] = arg0;
        arg0.field5943 = arg2;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "()V")
    public static final void method2496() {
        for (int var0 = 0; var0 < class97.field1384.length; var0++) {
            class97.field1384[var0].method587();
        }
        class97.field1384 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)Z")
    public static final boolean method2497(int arg0, int arg1, int arg2) {
        field5951++;
        return arg1 >= -111 ? true : (class791.method4325(arg0, arg2, (byte) 104) | (arg0 & 0x2000) != 0 | class744.method4086(arg0, arg2, -68)) & class12.method81(55, arg2, arg0);
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "()V")
    public void method2296() throws Exception {
        field5950++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2498(int arg0, int arg1, byte arg2) {
        field5960++;
        if (arg2 <= 67) {
            method2491(93, null, false, 3, -63, 76);
        }
        return (arg1 & 0x60000) != 0 | class182.method1234(arg1, 16, arg0) || class341.method2167(arg1, -15254, arg0);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(B)V")
    public static void method2499(byte arg0) {
        field5958 = null;
        int var1 = -47 % ((-arg0 - 20) / 45);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILpp;)V")
    public final synchronized void method2500(int arg0, class413 arg1) {
        this.field5963 = arg1;
        if (arg0 == -27177) {
            field5948++;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public final synchronized void method2501(int arg0) {
        if (arg0 <= 78) {
            return;
        }
        if (class630.field8527 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class630.field8527.field5275[var3] == this) {
                    class630.field8527.field5275[var3] = null;
                }
                if (class630.field8527.field5275[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class630.field8527.field5273 = true;
                while (class630.field8527.field5276) {
                    class171.method1152(50L, false);
                }
                class630.field8527 = null;
            }
        }
        field5945++;
        this.method2295();
        this.field5949 = null;
        this.field5967 = true;
    }

    @OriginalMember(owner = "client!br", name = "e", descriptor = "()V")
    public void method2295() {
        field5955++;
    }
}
