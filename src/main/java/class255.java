import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class255 extends class2 {

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    private int field4095 = 0;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    private int field4096 = 0;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "Z")
    private boolean field4112 = false;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "Z")
    private boolean field4102 = false;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    private int field4092 = -1;

    @OriginalMember(owner = "client!tl", name = "cb", descriptor = "I")
    private int field4130 = -32768;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    private int field4093;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    private int field4098;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    private int field4106;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!tl", name = "jb", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "Llc;")
    private class307 field4110;

    @OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4121 = "shake:";

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "[I")
    public static int[] field4124 = new int[500];

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4125 = "Prepared sound engine";

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "D")
    public double field4101;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "D")
    public double field4109;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "D")
    private double field4111;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "D")
    private double field4119;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "D")
    private double field4120;

    @OriginalMember(owner = "client!tl", name = "bb", descriptor = "D")
    private double field4129;

    @OriginalMember(owner = "client!tl", name = "fb", descriptor = "D")
    private double field4133;

    @OriginalMember(owner = "client!tl", name = "ib", descriptor = "D")
    public double field4136;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!tl", name = "Y", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!tl", name = "ab", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!tl", name = "db", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!tl", name = "eb", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!tl", name = "hb", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!tl", name = "gb", descriptor = "Lic;")
    private class171 field4134;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "Lpe;")
    public static class72 field4115;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILk;)V")
    private final void method1714(int arg0, class37 arg1) {
        class31 var3 = (class31) arg1;
        if ((this.field4134 == null || this.field4134.field2775) && (var3.field397 != null || var3.field393 != null)) {
            this.field4134 = new class171(class29.field360, 1, 1);
        }
        if (this.field4134 != null) {
            this.field4134.method1248(var3.field397, var3.field393, false, var3.field390, var3.field377, var3.field408);
        }
        int var4 = 107 / ((8 - arg0) / 61);
        field4131++;
        this.field4112 = true;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIII)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4094++;
        if (!this.field4112) {
            class37 var6 = this.method1719(88);
            if (var6 == null) {
                return;
            }
            this.method1714(95, var6);
        }
        if (this.field4134 != null) {
            this.field4134.method1250(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()I")
    public final int method15() {
        field4122++;
        return this.field4130;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIJILic;)V")
    public final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class171 arg10) {
        class37 var13 = this.method1719(100);
        field4091++;
        if (var13 != null) {
            this.method1714(77, var13);
            var13.method9(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4134);
            this.field4130 = var13.method15();
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZBIIZI)V")
    public static final void method1715(int arg0, boolean arg1, byte arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg2 != 35) {
            method1720((byte) -81, -92, 101, 3);
        }
        if (arg4 < arg3) {
            int var7 = (arg3 + arg4) / 2;
            int var8 = arg4;
            class203 var9 = class188.field3049[var7];
            class188.field3049[var7] = class188.field3049[arg3];
            class188.field3049[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (class274.method1835(var9, (byte) -97, arg6, arg5, arg1, class188.field3049[var10], arg0) <= 0) {
                    class203 var11 = class188.field3049[var10];
                    class188.field3049[var10] = class188.field3049[var8];
                    class188.field3049[var8++] = var11;
                }
            }
            class188.field3049[arg3] = class188.field3049[var8];
            class188.field3049[var8] = var9;
            method1715(arg0, arg1, (byte) 35, var8 - 1, arg4, arg5, arg6);
            method1715(arg0, arg1, (byte) 35, arg3, var8 + 1, arg5, arg6);
        }
        field4113++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1716(boolean arg0, String arg1) throws ClassNotFoundException {
        field4132++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0) {
            return null;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
    public static void method1717(int arg0) {
        field4115 = null;
        if (arg0 >= -41) {
            method1715(49, true, (byte) 7, -38, -124, true, -27);
        }
        field4125 = null;
        field4121 = null;
        field4124 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(IIIII)V")
    public final void method1718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4126++;
        if (!this.field4102) {
            double var6 = (double) (arg3 - this.field4098);
            double var8 = (double) (arg4 - this.field4097);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field4136 = (double) this.field4106 * var6 / var10 + (double) this.field4098;
            this.field4101 = (double) this.field4104;
            this.field4109 = (double) this.field4106 * var8 / var10 + (double) this.field4097;
        }
        double var12 = (double) (this.field4137 + 1 - arg1);
        this.field4119 = ((double) arg3 - this.field4136) / var12;
        this.field4111 = ((double) arg4 - this.field4109) / var12;
        this.field4133 = Math.sqrt(this.field4119 * this.field4119 + this.field4111 * this.field4111);
        int var14 = -35 % ((arg2 + 16) / 55);
        if (this.field4108 == -1) {
            this.field4120 = ((double) arg0 - this.field4101) / var12;
        } else {
            if (!this.field4102) {
                this.field4120 = -this.field4133 * Math.tan((double) this.field4108 * 0.02454369D);
            }
            this.field4129 = ((double) arg0 - this.field4101 - (this.field4120 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)Lk;")
    private final class37 method1719(int arg0) {
        class55 var2 = class137.method958(this.field4093, (byte) -104);
        field4099++;
        class37 var3 = var2.method379(this.field4096, -18882, this.field4095, this.field4092);
        if (arg0 < 50) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            var3.method199(this.field4105);
            return var3;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIII)V")
    public static final void method1720(byte arg0, int arg1, int arg2, int arg3) {
        field4116++;
        class228 var4 = class6.method37(arg2, arg1, arg3, 0);
        if (var4 == null) {
            return;
        }
        class253.field4068 = new int[var4.field3678];
        class293.field4695 = new String[var4.field3685];
        if (arg0 < 120) {
            field4115 = null;
        }
        if (var4.field3686 == 15 || var4.field3686 == 17 || var4.field3686 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class280.field4486 != null) {
                var6 = class280.field4486.field3416;
                var5 = class280.field4486.field3453;
            }
            class253.field4068[0] = class269.field4344 - var5;
            class253.field4068[1] = class77.field1281 - var6;
        }
        class276.method1857(126, var4, 200000);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
    public final void method1721(int arg0, int arg1) {
        if (arg0 < 51) {
            this.field4111 = -0.22184468420354325D;
        }
        this.field4102 = true;
        field4114++;
        if (this.field4108 == -1) {
            this.field4101 += (double) arg1 * this.field4120;
        } else {
            this.field4101 += this.field4129 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field4120;
            this.field4120 += (double) arg1 * this.field4129;
        }
        this.field4136 += (double) arg1 * this.field4119;
        this.field4109 += (double) arg1 * this.field4111;
        this.field4090 = (int) (Math.atan2(this.field4119, this.field4111) * 325.949D) + 1024 & 0x7FF;
        this.field4105 = (int) (Math.atan2(this.field4120, this.field4133) * 325.949D) & 0x7FF;
        if (this.field4110 == null) {
            return;
        }
        this.field4096 += arg1;
        while (true) {
            do {
                do {
                    if (this.field4110.field4891[this.field4095] >= this.field4096) {
                        return;
                    }
                    this.field4096 -= this.field4110.field4891[this.field4095];
                    this.field4095++;
                    if (this.field4095 >= this.field4110.field4895.length) {
                        this.field4095 -= this.field4110.field4921;
                        if (this.field4095 < 0 || this.field4110.field4895.length <= this.field4095) {
                            this.field4095 = 0;
                        }
                    }
                    this.field4092 = this.field4095 + 1;
                } while (this.field4092 < this.field4110.field4895.length);
                this.field4092 -= this.field4110.field4921;
            } while (this.field4092 >= 0 && this.field4110.field4895.length > this.field4092);
            this.field4092 = -1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field4102 = false;
        this.field4093 = arg0;
        this.field4103 = arg1;
        this.field4097 = arg3;
        this.field4117 = arg5;
        this.field4098 = arg2;
        this.field4106 = arg8;
        this.field4108 = arg7;
        this.field4137 = arg6;
        this.field4107 = arg9;
        this.field4104 = arg4;
        this.field4100 = arg10;
        int var12 = class137.method958(this.field4093, (byte) 45).field908;
        if (var12 == -1) {
            this.field4110 = null;
        } else {
            this.field4110 = class22.method121(var12, true);
        }
    }
}
