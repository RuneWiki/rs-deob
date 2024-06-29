import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class648 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    private int field9162 = 32;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
    private boolean field9175 = false;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "J")
    private long field9170 = class669.method3713(0);

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "J")
    private long field9183 = 0L;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Z")
    private boolean field9181 = true;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    private int field9182 = 0;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    private int field9187 = 0;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "[Lwi;")
    private class232[] field9186 = new class232[8];

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "J")
    private long field9180 = 0L;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    private int field9188 = 0;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field9189 = 0;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "[Lwi;")
    private class232[] field9190 = new class232[8];

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[Lpn;")
    public static class361[] field9171 = new class361[5];

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "Z")
    public static boolean field9191;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public int field9179;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    private int field9184;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public int field9185;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "Lwi;")
    private class232 field9177;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Lwfa;")
    public static class54 field9178;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "[I")
    public int[] field9158;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public void method465(int arg0) throws Exception {
        field9165++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
    public void method470() {
        field9163++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public final synchronized void method3595(byte arg0) {
        field9157++;
        if (this.field9175) {
            return;
        }
        long var2 = class669.method3713(0);
        try {
            if (this.field9170 + 500000L < var2) {
                this.field9170 = var2 - 500000L;
            }
            if (arg0 != -15) {
                return;
            }
            while (this.field9170 + 5000L < var2) {
                this.method3600(5000, 256);
                this.field9170 += (256000 / class519.field7166);
            }
        } catch (Exception var7) {
            this.field9170 = var2;
        }
        if (this.field9158 == null) {
            return;
        }
        try {
            if (this.field9183 != 0L) {
                if (var2 < this.field9183) {
                    return;
                }
                this.method465(this.field9185);
                this.field9181 = true;
                this.field9183 = 0L;
            }
            int var4 = this.method468();
            if ((this.field9188 - var4) > this.field9187) {
                this.field9187 = this.field9188 - var4;
            }
            int var5 = this.field9184 + this.field9179;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field9185) {
                this.field9185 += 1024;
                if (this.field9185 > 16384) {
                    this.field9185 = 16384;
                }
                this.method470();
                this.method465(this.field9185);
                var4 = 0;
                if (this.field9185 < var5 + 256) {
                    var5 = this.field9185 - 256;
                    this.field9184 = var5 - this.field9179;
                }
                this.field9181 = true;
            }
            while (var5 > var4) {
                this.method3603(this.field9158, 256);
                var4 += 256;
                this.method467();
            }
            if (this.field9180 < var2) {
                if (this.field9181) {
                    this.field9181 = false;
                } else if (this.field9187 == 0 && this.field9182 == 0) {
                    this.method470();
                    this.field9183 = var2 + 2000L;
                    return;
                } else {
                    this.field9184 = Math.min(this.field9182, this.field9187);
                    this.field9182 = this.field9187;
                }
                this.field9187 = 0;
                this.field9180 = var2 + 2000L;
            }
            this.field9188 = var4;
        } catch (Exception var6) {
            this.method470();
            this.field9183 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    public final synchronized void method3596(int arg0) {
        if (class357.field5184 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class357.field5184.field3660[var3] == this) {
                    class357.field5184.field3660[var3] = null;
                }
                if (class357.field5184.field3660[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class357.field5184.field3668 = true;
                while (class357.field5184.field3666) {
                    class660.method3668(-1, 50L);
                }
                class357.field5184 = null;
            }
        }
        field9168++;
        this.method470();
        this.field9175 = true;
        this.field9158 = null;
        if (arg0 != 15821) {
            this.method3604(-98);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLwi;I)V")
    private final void method3597(byte arg0, class232 arg1, int arg2) {
        field9160++;
        int var4 = arg2 >> 5;
        if (arg0 != -28) {
            this.field9182 = 19;
        }
        class232 var5 = this.field9186[var4];
        if (var5 == null) {
            this.field9190[var4] = arg1;
        } else {
            var5.field3021 = arg1;
        }
        this.field9186[var4] = arg1;
        arg1.field3023 = arg2;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()V")
    public void method467() throws Exception {
        field9164++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
    public static final void method3598(byte arg0, int arg1, int arg2) {
        field9174++;
        if (arg0 < 46) {
            field9178 = null;
        }
        class19 var3 = class364.method2236(1248116640, 0, 15);
        var3.method110(12142);
        var3.field171 = arg1;
        var3.field173 = arg2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3599(boolean arg0, int arg1, int arg2) {
        field9166++;
        if (arg0) {
            field9178 = null;
        }
        return class169.method1124((byte) -92, arg1, arg2) & class227.method1394(arg1, -1, arg2);
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "()I")
    public int method468() throws Exception {
        field9172++;
        return this.field9185;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    private final void method3600(int arg0, int arg1) {
        field9159++;
        this.field9189 -= arg1;
        if (this.field9189 < 0) {
            this.field9189 = 0;
        }
        if (this.field9177 != null) {
            this.field9177.method305(arg1);
        }
        if (arg0 != 5000) {
            this.method3597((byte) 38, null, -120);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method469(Component arg0) throws Exception {
        field9176++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public static void method3601(byte arg0) {
        field9178 = null;
        if (arg0 > -109) {
            method3599(true, -9, 8);
        }
        field9171 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLwi;)V")
    public final synchronized void method3602(byte arg0, class232 arg1) {
        field9173++;
        if (arg0 == -105) {
            this.field9177 = arg1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([II)V")
    private final void method3603(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class129.field1643) {
            var3 = arg1 << 1;
        }
        class657.method3638(arg0, 0, var3);
        this.field9189 -= arg1;
        if (this.field9177 != null && this.field9189 <= 0) {
            this.field9189 += class519.field7166 >> 4;
            class519.method2953(this.field9177, -23);
            this.method3597((byte) -28, this.field9177, this.field9177.method1429());
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
                        class232 var10 = null;
                        class232 var11 = this.field9190[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class663 var12 = var11.field3022;
                                if (var12 == null || var12.field9394 <= var8) {
                                    var11.field3024 = true;
                                    int var13 = var11.method332();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field9394 += var13;
                                    }
                                    if (var4 >= this.field9162) {
                                        break label107;
                                    }
                                    class232 var14 = var11.method304();
                                    if (var14 != null) {
                                        int var15 = var11.field3023;
                                        while (var14 != null) {
                                            this.method3597((byte) -28, var14, var15 * var14.method1429() >> 8);
                                            var14 = var11.method322();
                                        }
                                    }
                                    class232 var16 = var11.field3021;
                                    var11.field3021 = null;
                                    if (var10 == null) {
                                        this.field9190[var7] = var16;
                                    } else {
                                        var10.field3021 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field9186[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3021;
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
                class232 var18 = this.field9190[var17];
                this.field9190[var17] = this.field9186[var17] = null;
                while (var18 != null) {
                    class232 var19 = var18.field3021;
                    var18.field3021 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field9189 < 0) {
            this.field9189 = 0;
        }
        if (this.field9177 != null) {
            this.field9177.method312(arg0, 0, arg1);
        }
        this.field9170 = class669.method3713(0);
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "()V")
    public void method466() throws Exception {
        field9161++;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
    public final synchronized void method3604(int arg0) {
        this.field9181 = true;
        field9167++;
        try {
            this.method466();
            if (arg0 != 1) {
                this.field9186 = null;
            }
        } catch (Exception var2) {
            this.method470();
            this.field9183 = class669.method3713(0) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLjava/lang/Object;Z)[B")
    public static final byte[] method3605(boolean arg0, Object arg1, boolean arg2) {
        if (!arg0) {
            field9178 = null;
        }
        field9169++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class21.method117(0, var3) : var3;
        } else if (arg1 instanceof class653) {
            class653 var4 = (class653) arg1;
            return var4.method2521(13949);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static {
        for (int var0 = 0; var0 < field9171.length; var0++) {
            field9171[var0] = new class361();
        }
        field9191 = false;
    }
}
