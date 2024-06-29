import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class155 extends class81 implements class161 {

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lob;")
    public class438 field2184;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "Z")
    private boolean field2204;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2193 = "Loaded sprites";

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Laa;IB)Lhc;", line = 3)
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        ++field2198;
        if (arg2 > -25) {
            this.method134((class281) null, 76, (byte) 114);
        }
        return this.field2184.method2747(arg0, 0, 0, false, false, arg1, true);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 15)
    public final void method138(int arg0) {
        if (arg0 == -4728) {
            ++field2203;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I", line = 25)
    public static final int method1043(int arg0, int arg1, int arg2) {
        ++field2196;
        int var3 = arg1 >>> 24;
        if (arg2 >= -64) {
            field2185 = 13;
        }
        int var4 = 255 - var3;
        int var5 = (16711680 & (arg1 & 65280) * var3 | -16711936 & (arg1 & 16711935) * var3) >>> 8;
        return (((65280 & arg0) * var4 & 16711680 | (16711935 & arg0) * var4 & -16711936) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V", line = 42)
    public static void method1044(int arg0) {
        if (arg0 != -30444) {
            field2185 = -36;
        }
        field2193 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 53)
    public final int method126(int arg0) {
        if (arg0 != -13482) {
            return 44;
        } else {
            ++field2188;
            return this.field2184.field6297;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)I", line = 65)
    public static final int method1045(byte arg0, int arg1) {
        ++field2190;
        double var2 = (double) ((arg1 & 16764297) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 65349) >> 8) / 256.0D;
        double var6 = (double) (255 & arg1) / 256.0D;
        double var8 = var2;
        if (arg0 != 43) {
            method1045((byte) -74, -43);
        }
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 + -var8);
            }
            if (var2 != var10) {
                if (var4 != var10) {
                    if (var6 == var10) {
                        var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
                    }
                } else {
                    var12 = (-var2 + var6) / (-var8 + var10) + 2.0D;
                }
            } else {
                var12 = (-var6 + var4) / (var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 >= 0) {
            if (var21 > 255) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (~var22 < -256) {
            var22 = 255;
        }
        if (~var22 >= -244) {
            if (~var22 >= -218) {
                if (~var22 >= -193) {
                    if (~var22 < -180) {
                        var21 >>= 1;
                    }
                } else {
                    var21 >>= 2;
                }
            } else {
                var21 >>= 3;
            }
        } else {
            var21 >>= 4;
        }
        return (var22 >> 1) + ((255 & var20) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Laa;Lsk;IIIIIIIZIIII)V", line = 169)
    public class155(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class322.method2034((byte) -6, arg3, arg2));
        this.field2184 = new class438(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field2204 = arg1.field5221 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Laa;Z)V", line = 179)
    public final void method128(class281 arg0, boolean arg1) {
        ++field2201;
        class75 var3 = this.field2184.method2747(arg0, super.field1256, super.field1251, false, true, 131072, arg1);
        if (var3 != null) {
            this.field2184.method2744(super.field1256 >> 7, super.field1251 >> 7, var3, false, arg0, super.field1251 >> 7, super.field1256 >> 7, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I", line = 191)
    public final int method123(byte arg0) {
        if (arg0 < 108) {
            this.field2204 = false;
        }
        ++field2200;
        return this.field2184.field6316;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(BI)V", line = 202)
    public static final void method1046(byte arg0, int arg1) {
        class285.field3920 = arg1;
        ++field2192;
        if (arg0 >= -122) {
            method1043(-102, -39, -96);
        }
        class190 var2 = class68.field1058;
        synchronized (class68.field1058) {
            class68.field1058.method1249(1);
        }
        class190 var3 = class229.field3061;
        synchronized (class229.field3061) {
            class229.field3061.method1249(1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)I", line = 219)
    public final int method579(byte arg0) {
        if (arg0 < 72) {
            return -31;
        } else {
            ++field2191;
            return this.field2184.method2740((byte) 109);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILaa;)Z", line = 230)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field2199;
        class75 var5 = this.field2184.method2747(arg3, super.field1256, super.field1251, false, false, 65536, true);
        if (var5 == null) {
            return false;
        } else {
            class261 var6 = arg3.method1769();
            if (arg0 != 0) {
                return true;
            } else {
                var6.method882(super.field1251 - -super.field1254, super.field1259, super.field1256 + super.field1253);
                return var5.method516(arg1, arg2, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Laa;B)V", line = 250)
    public final void method122(class281 arg0, byte arg1) {
        this.field2184.method2751(arg0, (byte) 78);
        if (arg1 >= 16) {
            ++field2187;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)I", line = 265)
    public final int method124(int arg0) {
        ++field2189;
        if (arg0 != -11197) {
            field2186 = -94;
        }
        return this.field2184.field6324;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z", line = 277)
    public final boolean method127(byte arg0) {
        int var2 = -59 % ((arg0 - -52) / 33);
        ++field2205;
        return this.field2184.method2743((byte) 115);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Laa;B)V", line = 290)
    public final void method133(class281 arg0, byte arg1) {
        ++field2197;
        if (arg1 == -102) {
            this.field2184.method2753(arg0, -7608);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Laa;I)Lcn;", line = 306)
    public final class300 method131(class281 arg0, int arg1) {
        ++field2202;
        class75 var3 = this.field2184.method2747(arg0, super.field1256, super.field1251, false, true, 1024, true);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 < 72) {
                field2186 = 25;
            }
            class261 var4 = arg0.method1769();
            var4.method882(super.field1251 - -super.field1254, super.field1259, super.field1256 - -super.field1253);
            class300 var5 = null;
            if (this.field2204) {
                var5 = class8.method54((byte) -114, 1);
            }
            if (this.field2184.field6318 == null) {
                var3.method514(var4, var5 != null ? var5.field4152[0] : null, 0);
            } else {
                class260 var6 = this.field2184.field6318.method1014();
                arg0.method1721(var3, var6, var4, var5 == null ? null : var5.field4152[0], 0);
            }
            this.field2184.method2744(super.field1256 >> 7, super.field1251 >> 7, var3, true, arg0, super.field1251 >> 7, super.field1256 >> 7, (byte) -114);
            return var5;
        }
    }
}
