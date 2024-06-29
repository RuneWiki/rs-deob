import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class347 {

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    private int field4959 = 0;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    private int field4955 = 0;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    private int field4967 = 128;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public int field4961 = -1;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    private int field4965 = 0;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    private int field4958 = 128;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    private int field4976 = -1;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Z")
    public boolean field4975 = false;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "B")
    public byte field4971 = 0;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "F")
    public static float field4963;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "F")
    public static float field4966;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    private int field4978;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Lbw;")
    public class410 field4970;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[S")
    private short[] field4962;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[S")
    private short[] field4964;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[S")
    private short[] field4968;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "[S")
    private short[] field4974;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILqa;ILeca;)Lr;")
    public final class519 method2099(int arg0, int arg1, int arg2, int arg3, class167 arg4, int arg5, class378 arg6) {
        field4979++;
        if (arg5 != 0) {
            this.method2104(null, -94, 19);
        }
        return this.method2102(arg2, null, arg6, arg3, (byte) 2, 0, arg1, -116, arg4, 0, 0, arg0, null, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FB)F")
    public static final float method2100(float arg0, byte arg1) {
        field4960++;
        int var2 = -3 / ((arg1 - 21) / 56);
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lco;B)V")
    public final void method2101(class268 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                int var4 = -83 / ((-arg1 - 55) / 33);
                field4954++;
                return;
            }
            this.method2104(arg0, var3, -24080);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILsa;Leca;IBIIILqa;IIILsa;Z)Lr;")
    private final class519 method2102(int arg0, class542 arg1, class378 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, class167 arg8, int arg9, int arg10, int arg11, class542 arg12, boolean arg13) {
        int var15 = -87 / ((-arg7 - 55) / 47);
        field4953++;
        int var16 = arg11;
        class439 var17 = this.field4961 == -1 || arg0 == -1 ? null : arg2.method2297((byte) 120, this.field4961);
        boolean var18 = arg13 & this.field4971 != 0;
        if (var17 != null) {
            var16 = arg11 | var17.method2594(-1, false, arg0, arg6);
        }
        if (var18) {
            var16 |= this.field4971 == 3 ? 7 : 2;
        }
        if (this.field4958 != 128) {
            var16 |= 0x2;
        }
        if (this.field4967 != 128 || this.field4959 != 0) {
            var16 |= 0x5;
        }
        class395 var19 = this.field4970.field6099;
        class519 var20;
        synchronized (this.field4970.field6099) {
            var20 = (class519) this.field4970.field6099.method2407(false, (long) (this.field4972 |= arg8.field2441 << 29));
        }
        if (var20 == null || arg8.method560(var20.method1373(), var16) != 0) {
            if (var20 != null) {
                var16 = arg8.method649(var16, var20.method1373());
            }
            int var21 = var16;
            if (this.field4964 != null) {
                var21 = var16 | 0x4000;
            }
            if (this.field4974 != null) {
                var21 |= 0x8000;
            }
            class560 var22 = class307.method1903((byte) 70, this.field4978, 0, this.field4970.field6096);
            if (var22 == null) {
                return null;
            }
            if (var22.field7981 < 13) {
                var22.method3147(0, 46);
            }
            var20 = arg8.method400(var22, var21, this.field4970.field6100, this.field4965 + 64, this.field4955 + 850);
            if (this.field4964 != null) {
                for (int var23 = 0; var23 < this.field4964.length; var23++) {
                    var20.method1387(this.field4964[var23], this.field4962[var23]);
                }
            }
            if (this.field4974 != null) {
                for (int var24 = 0; var24 < this.field4974.length; var24++) {
                    var20.method1407(this.field4974[var24], this.field4968[var24]);
                }
            }
            var20.method1405(var16);
            class395 var25 = this.field4970.field6099;
            synchronized (this.field4970.field6099) {
                this.field4970.field6099.method2408(var20, (long) (this.field4972 |= arg8.field2441 << 29), -111);
            }
        }
        class519 var26 = var17 == null ? var20.method765(arg4, var16, true) : var17.method2597(arg4, arg6, arg0, var20, (byte) -83, var16, arg3, 0);
        if (this.field4967 != 128 || this.field4958 != 128) {
            var26.method1349(this.field4967, this.field4958, this.field4967);
        }
        if (this.field4959 != 0) {
            if (this.field4959 == 90) {
                var26.method1367(4096);
            }
            if (this.field4959 == 180) {
                var26.method1367(8192);
            }
            if (this.field4959 == 270) {
                var26.method1367(12288);
            }
        }
        if (var18) {
            var26.method1395(this.field4971, this.field4976, arg12, arg1, arg9, arg5, arg10);
        }
        var26.method1405(arg11);
        return var26;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILsa;IBLsa;Lqa;ILeca;IIII)Lr;")
    public final class519 method2103(boolean arg0, int arg1, class542 arg2, int arg3, byte arg4, class542 arg5, class167 arg6, int arg7, class378 arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg4 > -101) {
            this.field4968 = null;
        }
        field4969++;
        return this.method2102(arg12, arg2, arg8, arg1, (byte) 2, arg3, arg9, -106, arg6, arg10, arg11, arg7, arg5, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lco;II)V")
    private final void method2104(class268 arg0, int arg1, int arg2) {
        if (arg2 != -24080) {
            this.field4972 = 2;
        }
        if (arg1 == 1) {
            this.field4978 = arg0.method1745(32132);
        } else if (arg1 == 2) {
            this.field4961 = arg0.method1745(32132);
        } else if (arg1 == 4) {
            this.field4967 = arg0.method1745(32132);
        } else if (arg1 == 5) {
            this.field4958 = arg0.method1745(32132);
        } else if (arg1 == 6) {
            this.field4959 = arg0.method1745(32132);
        } else if (arg1 == 7) {
            this.field4965 = arg0.method1738(255);
        } else if (arg1 == 8) {
            this.field4955 = arg0.method1738(255);
        } else if (arg1 == 9) {
            this.field4971 = 3;
            this.field4976 = 8224;
        } else if (arg1 == 10) {
            this.field4975 = true;
        } else if (arg1 == 11) {
            this.field4971 = 1;
        } else if (arg1 == 12) {
            this.field4971 = 4;
        } else if (arg1 == 13) {
            this.field4971 = 5;
        } else if (arg1 == 14) {
            this.field4971 = 2;
            this.field4976 = arg0.method1738(255) * 256;
        } else if (arg1 == 15) {
            this.field4971 = 3;
            this.field4976 = arg0.method1745(32132);
        } else if (arg1 == 16) {
            this.field4971 = 3;
            this.field4976 = arg0.method1748(arg2 ^ 0x5E3F);
        } else if (arg1 == 40) {
            int var4 = arg0.method1738(255);
            this.field4964 = new short[var4];
            this.field4962 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4964[var5] = (short) arg0.method1745(32132);
                this.field4962[var5] = (short) arg0.method1745(arg2 + 56212);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method1738(255);
            this.field4968 = new short[var6];
            this.field4974 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4974[var7] = (short) arg0.method1745(32132);
                this.field4968[var7] = (short) arg0.method1745(32132);
            }
        }
        field4977++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lqa;ILeca;IIIB)Lr;")
    public final class519 method2105(class167 arg0, int arg1, class378 arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = 88 / ((-arg6 - 24) / 53);
        field4957++;
        return this.method2102(arg1, null, arg2, arg5, (byte) 5, 0, arg4, 5, arg0, 0, 0, arg3, null, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method2106(int[] arg0, int arg1) {
        field4956++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class274.field4013;
        if (arg1 > -41) {
            method2100(0.2843259F, (byte) 41);
        }
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class235 var5 = class394.field5911.method729(0, arg0[var4]);
            if (var5.field3447 != -1) {
                class116 var6 = (class116) class333.field4787.method2407(false, (long) var5.field3447);
                if (var6 == null) {
                    class518 var7 = class518.method2922(class325.field4675, var5.field3447, 0);
                    if (var7 != null) {
                        var6 = class159.field2378.method548(var7, true);
                        class333.field4787.method2408(var6, (long) var5.field3447, -125);
                    }
                }
                if (var6 != null) {
                    class144.field2231[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    static {
        new class567(null, "geschickt werden.", null, null);
    }
}
