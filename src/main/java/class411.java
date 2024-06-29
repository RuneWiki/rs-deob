import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class411 extends class389 {

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    private int field6124 = 0;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    private int field6127 = -1;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    private int field6150 = -32768;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Z")
    private boolean field6129 = false;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    private int field6149 = 0;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public int field6154;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    private int field6155;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    private int field6151;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    private int field6142;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field6112;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "Z")
    private boolean field6146;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field6116;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    private int field6132;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public int field6115;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "Lsm;")
    private class189 field6134;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field6125 = 0;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "[B")
    public static byte[] field6147 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!v", name = "B", descriptor = "D")
    private double field6118;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "D")
    private double field6119;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "D")
    private double field6136;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "D")
    private double field6139;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "D")
    private double field6143;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "D")
    private double field6148;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "D")
    private double field6152;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "D")
    private double field6153;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "F")
    public static float field6145;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    private int field6122;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    private int field6128;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "Lmq;")
    private class354 field6135;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6113;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class172.method1153(arg1, -4, arg2, arg3) + -arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field6154 = arg9;
        this.field6129 = false;
        this.field6155 = arg0;
        this.field6151 = arg7;
        this.field6142 = arg4;
        this.field6112 = arg6;
        this.field6146 = arg11;
        this.field6116 = arg10;
        this.field6132 = arg8;
        this.field6115 = arg5;
        int var13 = class123.field1839.method1490(this.field6155, true).field4775;
        if (var13 != -1) {
            this.field6134 = class242.field3846.method2238(var13, (byte) 78);
        } else {
            this.field6134 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZII)V")
    public final void method2575(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field6129) {
            double var6 = (double) (-super.field5837 + arg4);
            double var8 = (double) (-super.field5833 + arg1);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field6118 = (double) this.field6132 * var8 / var10 + (double) super.field5833;
            this.field6152 = (double) this.field6132 * var6 / var10 + (double) super.field5837;
            if (this.field6146) {
                this.field6153 = (double) (class172.method1153(super.field5826, -4, (int) this.field6152, (int) this.field6118) + -this.field6142);
            } else {
                this.field6153 = (double) super.field5831;
            }
        }
        ++field6130;
        if (arg2) {
            double var12 = (double) (this.field6112 + 1 + -arg0);
            this.field6143 = ((double) arg4 - this.field6152) / var12;
            this.field6119 = ((double) arg1 - this.field6118) / var12;
            this.field6136 = Math.sqrt(this.field6143 * this.field6143 + this.field6119 * this.field6119);
            if (~this.field6151 != 0) {
                if (!this.field6129) {
                    this.field6139 = -this.field6136 * Math.tan((double) this.field6151 * 0.02454369D);
                }
                this.field6148 = ((double) arg3 - this.field6153 - this.field6139 * var12) * 2.0D / (var12 * var12);
            } else {
                this.field6139 = ((double) arg3 - this.field6153) / var12;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLya;II)Z")
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 >= -119) {
            return false;
        } else {
            ++field6117;
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILya;)Lt;")
    private final class475 method2576(int arg0, int arg1, class38 arg2) {
        ++field6144;
        if (arg1 != 29243) {
            return null;
        } else {
            class316 var4 = class123.field1839.method1490(this.field6155, true);
            return var4.method2025(this.field6124, this.field6149, true, this.field6127, arg0, arg2, class242.field3846);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public final void method958(byte arg0) {
        super.field5836 = super.field5827 = (short) ((int) (this.field6152 / 128.0D));
        int var2 = 12 / ((-15 - arg0) / 44);
        super.field5830 = super.field5829 = (short) ((int) (this.field6118 / 128.0D));
        ++field6141;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public final void method2577(byte arg0) {
        if (this.field6135 != null) {
            this.field6135.method2220();
        }
        if (arg0 != -119) {
            this.method24(-14);
        }
        ++field6131;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILya;ILor;IZ)V")
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        ++field6133;
        if (arg0 == 3) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
    public final void method2578(int arg0, int arg1) {
        this.field6129 = true;
        if (arg1 >= 92) {
            ++field6123;
            this.field6152 += (double) arg0 * this.field6143;
            this.field6118 += (double) arg0 * this.field6119;
            if (this.field6146) {
                this.field6153 = (double) (class172.method1153(super.field5826, -4, (int) this.field6152, (int) this.field6118) - this.field6142);
            } else if (this.field6151 != -1) {
                this.field6153 += this.field6148 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field6139;
                this.field6139 += (double) arg0 * this.field6148;
            } else {
                this.field6153 += (double) arg0 * this.field6139;
            }
            this.field6128 = (int) (2607.5945876176133D * Math.atan2(this.field6143, this.field6119)) - -8192 & 16383;
            this.field6122 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field6139, this.field6136));
            if (this.field6134 != null) {
                this.field6149 += arg0;
                while (true) {
                    do {
                        do {
                            if (this.field6134.field3204[this.field6124] >= this.field6149) {
                                return;
                            }
                            this.field6149 -= this.field6134.field3204[this.field6124];
                            ++this.field6124;
                            if (~this.field6134.field3181.length >= ~this.field6124) {
                                this.field6124 -= this.field6134.field3202;
                                if (~this.field6124 > -1 || this.field6124 >= this.field6134.field3181.length) {
                                    this.field6124 = 0;
                                }
                            }
                            this.field6127 = this.field6124 - -1;
                        } while (~this.field6134.field3181.length < ~this.field6127);
                        this.field6127 -= this.field6134.field3202;
                    } while (this.field6127 >= 0 && this.field6127 < this.field6134.field3181.length);
                    this.field6127 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field6135 != null) {
            this.field6135.method2220();
        }
        ++field6137;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static void method2579(byte arg0) {
        field6113 = null;
        field6147 = null;
        int var1 = 17 % ((arg0 - 9) / 53);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lya;I)Lag;")
    public final class484 method29(class38 arg0, int arg1) {
        ++field6138;
        if (arg1 <= 22) {
            return null;
        } else {
            class475 var3 = this.method2576(2048, 29243, arg0);
            if (var3 == null) {
                return null;
            } else {
                class125 var4 = arg0.method296();
                var4.method219(this.field6122);
                var4.method210(this.field6128);
                var4.method207((int) this.field6152, (int) this.field6153, (int) this.field6118);
                if (this.field6135 == null) {
                    var3.method439(var4, (class83) null, 0);
                } else {
                    class341 var5 = this.field6135.method2221();
                    arg0.method311(var3, var5, var4, (class83) null, 0);
                }
                this.field6150 = var3.method427();
                this.method2581((byte) -112, arg0, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)I")
    public final int method24(int arg0) {
        if (arg0 != -867749273) {
            return -108;
        } else {
            ++field6121;
            return this.field6150;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method2580(int arg0) {
        class475.field6862 = arg0;
        for (int var1 = 0; var1 < class497.field7147; ++var1) {
            for (int var2 = 0; var2 < class385.field5799; ++var2) {
                if (client.field3311[arg0][var1][var2] == null) {
                    client.field3311[arg0][var1][var2] = new class138(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public final void method21(boolean arg0) {
        ++field6114;
        if (arg0) {
            this.field6151 = 15;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 != 13651334) {
            return false;
        } else {
            ++field6140;
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lya;Z)V")
    public final void method25(class38 arg0, boolean arg1) {
        ++field6111;
        class475 var3 = this.method2576(0, 29243, arg0);
        if (var3 != null) {
            class125 var4 = arg0.method296();
            if (!arg1) {
                var4.method219(this.field6122);
                var4.method210(this.field6128);
                var4.method207((int) this.field6152, (int) this.field6153, (int) this.field6118);
                this.field6150 = var3.method427();
                this.method2581((byte) -121, arg0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLya;Lt;)V")
    private final void method2581(byte arg0, class38 arg1, class475 arg2) {
        if (arg0 >= -109) {
            method2580(-122);
        }
        ++field6120;
        class262[] var4 = arg2.method431();
        class471[] var5 = arg2.method456();
        if ((this.field6135 == null || this.field6135.field5241) && (var4 != null || var5 != null)) {
            this.field6135 = new class354(class475.field6854);
        }
        if (this.field6135 != null) {
            this.field6135.method2223(arg1, (long) class475.field6854, var4, var5, false);
            this.field6135.method2228(super.field5826, super.field5836, super.field5827, super.field5830, super.field5829);
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(B)V")
    public static final void method2582(byte arg0) {
        ++field6126;
        class13 var1 = class298.field4532;
        synchronized (class298.field4532) {
            if (arg0 != 4) {
                method2582((byte) -62);
            }
            class298.field4532.method93((byte) 90);
        }
    }
}
