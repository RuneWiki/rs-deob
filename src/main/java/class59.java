import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class59 extends class183 {

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    private int field1031 = -1;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field1026 = 500;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field1020 = -1;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    private int field1021;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "[I")
    private int[] field1032;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(II)V", line = 4)
    public static final void method449(int arg0, int arg1) {
        field1025++;
        if (arg1 == 37) {
            class160.field2716 = 3.0F;
        } else if (arg1 == 50) {
            class160.field2716 = 4.0F;
        } else if (arg1 == 75) {
            class160.field2716 = 6.0F;
        } else {
            class160.field2716 = 8.0F;
        }
        class189.field3304 = -1;
        if (arg0 != 0) {
            method452(0.23353669213776032D, (byte) -108);
        }
        class189.field3304 = -1;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)Z", line = 39)
    private final boolean method450(int arg0) {
        field1030++;
        int var2 = 22 % ((arg0 - 12) / 51);
        if (this.field1032 != null) {
            return true;
        } else if (this.field1031 >= 0) {
            int var3 = class22.field393;
            int var4 = class144.field2508;
            int var5 = class107.field1884.method1508((byte) 73, this.field1031) ? 64 : 128;
            this.field1032 = class107.field1884.method1512(this.field1031, (byte) -111);
            this.field1018 = var5;
            this.field1021 = var5;
            class328.method2216(var3, var4, (byte) -33);
            return this.field1032 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[[I", line = 68)
    public final int[][] method12(int arg0, int arg1) {
        int var3 = 88 % ((arg0 - 18) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        field1019++;
        if (this.field3160.field2689 && this.method450(86)) {
            int var5 = (class144.field2508 == this.field1018 ? arg1 : this.field1018 * arg1 / class144.field2508) * this.field1021;
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (class22.field393 == this.field1021) {
                for (int var9 = 0; var9 < class22.field393; var9++) {
                    int var10 = this.field1032[var5++];
                    var8[var9] = class305.method2086(var10 << 4, 4080);
                    var7[var9] = class305.method2086(4080, var10 >> 4);
                    var6[var9] = class305.method2086(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class22.field393; var11++) {
                    int var12 = this.field1021 * var11 / class22.field393;
                    int var13 = this.field1032[var5 + var12];
                    var8[var11] = class305.method2086(var13 << 4, 4080);
                    var7[var11] = class305.method2086(65280, var13) >> 4;
                    var6[var11] = class305.method2086(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I", line = 139)
    public final int method451(int arg0) {
        if (arg0 == -1) {
            field1017++;
            return this.field1031;
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(DB)V", line = 159)
    public static final void method452(double arg0, byte arg1) {
        if (class260.field4518 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class71.field1375[var3] = var4 > 255 ? 255 : var4;
            }
            class260.field4518 = arg0;
        }
        field1023++;
        if (arg1 <= 35) {
            method452(-0.3979815501992457D, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)I", line = 185)
    public static final int method453(int arg0, int arg1, int arg2, int arg3) {
        field1022++;
        if (arg3 != 718654344) {
            return -115;
        }
        int var4 = class227.field3907[class32.method285(arg1, arg0)];
        if (arg2 > 0) {
            int var5 = class227.field3904.method1510(255, arg2 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg0 < 0) {
                    var6 = 0;
                } else if (arg0 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg0 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var7 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class227.field3904.method1514(-106, arg2 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                int var11 = (var4 & 0xFF) * var9;
                int var12 = (var4 >> 8 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var10 << 8 & 0xFF003F) + (var11 >> 8) + (var12 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 271)
    public final void method454(int arg0) {
        super.method454(-101);
        int var2 = 79 / ((arg0 - 70) / 42);
        field1024++;
        this.field1032 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 282)
    public class59() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILkh;I)V", line = 286)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 < -43) {
            if (arg2 == 0) {
                this.field1031 = arg1.method116(-1);
            }
            field1028++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)Ljf;", line = 308)
    public static final class229 method455(int arg0) {
        class229 var1 = class208.field3615;
        if (arg0 < 99) {
            field1020 = -13;
        }
        field1027++;
        if (class329.field5599 != 0) {
            var1 = class126.field2219;
        }
        class229 var2 = class331.field5638;
        if (class174.field3033 != null) {
            var2 = class142.method989(new class229[] { client.field4469, class174.field3033 }, -46);
        }
        return class142.method989(new class229[] { class288.field4926, var1, class41.field739, class84.method607(98, class128.field2290), class320.field5420, class84.method607(-63, class23.field432), var2, class313.field5257 }, -83);
    }
}
