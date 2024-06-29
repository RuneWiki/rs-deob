import java.awt.Component;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class258 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    private int field3136 = 32;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Z")
    private boolean field3148 = false;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "J")
    private long field3152 = class571.method3150(93);

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field3153 = 0;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "J")
    private long field3159 = 0L;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    private int field3155 = 0;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    private int field3157 = 0;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Z")
    private boolean field3158 = true;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "J")
    private long field3160 = 0L;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    private int field3161 = 0;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "[Lpn;")
    private class69[] field3166 = new class69[8];

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[Lpn;")
    private class69[] field3165 = new class69[8];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public int field3163;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lrj;")
    public static class648 field3151;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lpn;")
    private class69 field3144;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
    public int[] field3146;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V", line = 5)
    private final void method1500(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        field3142++;
        this.field3161 -= arg1;
        if (this.field3161 < 0) {
            this.field3161 = 0;
        }
        if (this.field3144 != null) {
            this.field3144.method410(arg1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILpn;B)V", line = 25)
    private final void method1501(int arg0, class69 arg1, byte arg2) {
        field3164++;
        int var4 = arg0 >> 5;
        class69 var5 = this.field3165[var4];
        if (var5 == null) {
            this.field3166[var4] = arg1;
        } else {
            var5.field940 = arg1;
        }
        this.field3165[var4] = arg1;
        if (arg2 != 33) {
            this.field3158 = true;
        }
        arg1.field938 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V", line = 46)
    public void method1208() {
        field3154++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 55)
    public final synchronized void method1502(int arg0) {
        field3138++;
        if (this.field3148) {
            return;
        }
        long var2 = class571.method3150(103);
        try {
            if ((this.field3152 + 500000L) < var2) {
                this.field3152 = var2 - 500000L;
            }
            while (var2 > this.field3152 + 5000L) {
                this.method1500(false, 256);
                this.field3152 += (256000 / class392.field4942);
            }
            if (arg0 != -26789) {
                method1508(false, 43);
            }
        } catch (Exception var7) {
            this.field3152 = var2;
        }
        if (this.field3146 == null) {
            return;
        }
        try {
            if (this.field3159 != 0L) {
                if (var2 < this.field3159) {
                    return;
                }
                this.method1206(this.field3163);
                this.field3159 = 0L;
                this.field3158 = true;
            }
            int var4 = this.method1210();
            if (this.field3153 < this.field3157 - var4) {
                this.field3153 = this.field3157 - var4;
            }
            int var5 = this.field3162 + this.field3156;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3163) {
                this.field3163 += 1024;
                if (this.field3163 > 16384) {
                    this.field3163 = 16384;
                }
                this.method1208();
                this.method1206(this.field3163);
                var4 = 0;
                this.field3158 = true;
                if (var5 + 256 > this.field3163) {
                    var5 = this.field3163 - 256;
                    this.field3156 = var5 - this.field3162;
                }
            }
            while (var4 < var5) {
                this.method1505(this.field3146, 256);
                var4 += 256;
                this.method1211();
            }
            if (this.field3160 < var2) {
                if (this.field3158) {
                    this.field3158 = false;
                } else if (this.field3153 == 0 && this.field3155 == 0) {
                    this.method1208();
                    this.field3159 = var2 + 2000L;
                    return;
                } else {
                    this.field3156 = Math.min(this.field3155, this.field3153);
                    this.field3155 = this.field3153;
                }
                this.field3153 = 0;
                this.field3160 = var2 + 2000L;
            }
            this.field3157 = var4;
        } catch (Exception var6) {
            this.method1208();
            this.field3159 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 178)
    public void method1212(Component arg0) throws Exception {
        field3145++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lpn;B)V", line = 185)
    public final synchronized void method1503(class69 arg0, byte arg1) {
        field3143++;
        this.field3144 = arg0;
        if (arg1 != 88) {
            this.field3136 = 77;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 197)
    public final synchronized void method1504(int arg0) {
        if (class324.field4171 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class324.field4171.field3073[var3] == this) {
                    class324.field4171.field3073[var3] = null;
                }
                if (class324.field4171.field3073[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class324.field4171.field3071 = true;
                while (class324.field4171.field3075) {
                    class419.method2233(-28448, 50L);
                }
                class324.field4171 = null;
            }
        }
        field3137++;
        if (arg0 != -32470) {
            this.method1502(-119);
        }
        this.method1208();
        this.field3146 = null;
        this.field3148 = true;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([II)V", line = 243)
    private final void method1505(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class382.field4824) {
            var3 = arg1 << 1;
        }
        class293.method1643(arg0, 0, var3);
        this.field3161 -= arg1;
        if (this.field3144 != null && this.field3161 <= 0) {
            this.field3161 += class392.field4942 >> 4;
            class424.method2252((byte) 121, this.field3144);
            this.method1501(this.field3144.method414(), this.field3144, (byte) 33);
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
                        class69 var10 = null;
                        class69 var11 = this.field3166[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class243 var12 = var11.field941;
                                if (var12 == null || var12.field3021 <= var8) {
                                    var11.field939 = true;
                                    int var13 = var11.method415();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3021 += var13;
                                    }
                                    if (var4 >= this.field3136) {
                                        break label107;
                                    }
                                    class69 var14 = var11.method409();
                                    if (var14 != null) {
                                        int var15 = var11.field938;
                                        while (var14 != null) {
                                            this.method1501(var15 * var14.method414() >> 8, var14, (byte) 33);
                                            var14 = var11.method413();
                                        }
                                    }
                                    class69 var16 = var11.field940;
                                    var11.field940 = null;
                                    if (var10 == null) {
                                        this.field3166[var7] = var16;
                                    } else {
                                        var10.field940 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3165[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field940;
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
                class69 var18 = this.field3166[var17];
                this.field3166[var17] = this.field3165[var17] = null;
                while (var18 != null) {
                    class69 var19 = var18.field940;
                    var18.field940 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3161 < 0) {
            this.field3161 = 0;
        }
        if (this.field3144 != null) {
            this.field3144.method412(arg0, 0, arg1);
        }
        this.field3152 = class571.method3150(117);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V", line = 402)
    public final synchronized void method1506(int arg0) {
        field3141++;
        this.field3158 = true;
        if (arg0 != 2000) {
            return;
        }
        try {
            this.method1207();
        } catch (Exception var2) {
            this.method1208();
            this.field3159 = class571.method3150(arg0 ^ 0x78A) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 422)
    public static void method1507(byte arg0) {
        if (arg0 == -91) {
            field3151 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(ZI)V", line = 432)
    public static final void method1508(boolean arg0, int arg1) {
        if (!arg0) {
            method1507((byte) 15);
        }
        field3140++;
        if (!class301.field3698.field6629) {
            arg1 = -1;
        }
        if (class179.field2313 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class473 var2 = class493.field6503.method3168(arg1, (byte) 93);
            class661 var3 = var2.method2500(-1);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class590.field8289.method3639(var3.method3725(), new Point(var2.field6003, var2.field5997), var3.method3718(), var3.method3720(), arg0, class500.field6585);
                class179.field2313 = arg1;
            }
        }
        if (arg1 == -1 && class179.field2313 != -1) {
            class590.field8289.method3639(null, new Point(), -1, -1, true, class500.field6585);
            class179.field2313 = -1;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()I", line = 473)
    public int method1210() throws Exception {
        field3150++;
        return this.field3163;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V", line = 481)
    public void method1207() throws Exception {
        field3139++;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 488)
    public void method1206(int arg0) throws Exception {
        field3147++;
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "()V", line = 539)
    public void method1211() throws Exception {
        field3149++;
    }
}
