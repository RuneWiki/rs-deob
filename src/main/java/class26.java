import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class26 extends class739 {

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field241 = -1;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field240;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vj", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field242;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "Ljava/lang/String;")
    public static String field239;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lsh;")
    public static final class404 method109(Component arg0, int arg1, boolean arg2) {
        if (arg1 != 12566) {
            return null;
        } else {
            ++field238;
            try {
                Constructor var3 = Class.forName("kl").getDeclaredConstructor(field242 != null ? field242 : (field242 = method120("java.awt.Component")), Boolean.TYPE);
                return (class404) var3.newInstance(arg0, new Boolean(arg2));
            } catch (Throwable var4) {
                return new class460(arg0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lqk;BII)V")
    public static final void method110(class146 arg0, byte arg1, int arg2, int arg3) {
        ++field236;
        if (class131.field1810 == null && !class147.field2154) {
            if (arg0 != null && class350.method2238(100, arg0) != null) {
                class131.field1810 = arg0;
                class83.field1211 = class350.method2238(100, arg0);
                if (arg1 != 116) {
                    field239 = null;
                }
                class285.field3968 = arg2;
                class416.field5920 = arg3;
                class671.field9571 = 0;
                class564.field8175 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field227;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg6 + arg4;
        int var12 = arg2 - arg6;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        if (arg0 == -21406) {
            int var36 = (arg2 + -1) * var27;
            int var37 = var30;
            if (class377.field5458 <= arg1 && ~arg1 >= ~class362.field5291) {
                int[] var38 = class193.field2839[arg1];
                int var39 = class183.method1292(class200.field2976, -1, class204.field3061, -arg4 + arg5);
                int var40 = class183.method1292(class200.field2976, -1, class204.field3061, arg4 + arg5);
                int var41 = class183.method1292(class200.field2976, -1, class204.field3061, -var11 + arg5);
                int var42 = class183.method1292(class200.field2976, arg0 + 21405, class204.field3061, arg5 - -var11);
                class518.method3153(var41, var39, var38, arg0 ^ 21403, arg3);
                class518.method3153(var42, var41, var38, arg0 ^ 21403, arg7);
                class518.method3153(var40, var42, var38, -7, arg3);
            }
            int var43 = (var12 + -1) * var29;
            while (~var9 < -1) {
                boolean var44 = ~var9 >= ~var12;
                if (var23 < 0) {
                    while (var23 < 0) {
                        var23 += var31;
                        var24 += var35;
                        var35 += var28;
                        ++var8;
                        var31 += var28;
                    }
                }
                if (var44) {
                    if (var25 < 0) {
                        while (var25 < 0) {
                            var25 += var33;
                            var26 += var37;
                            var37 += var30;
                            var33 += var30;
                            ++var10;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        ++var10;
                        var37 += var30;
                        var33 += var30;
                    }
                    var26 += -var34;
                    var25 += -var43;
                    var34 -= var29;
                    var43 -= var29;
                }
                if (var24 < 0) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var35 += var28;
                    var31 += var28;
                }
                var24 += -var32;
                var23 += -var36;
                var36 -= var27;
                var32 -= var27;
                --var9;
                int var45 = -var9 + arg1;
                int var46 = arg1 + var9;
                if (~var46 <= ~class377.field5458 && class362.field5291 >= var45) {
                    int var47 = class183.method1292(class200.field2976, -1, class204.field3061, arg5 + var8);
                    int var48 = class183.method1292(class200.field2976, -1, class204.field3061, -var8 + arg5);
                    if (!var44) {
                        if (~class377.field5458 >= ~var45) {
                            class518.method3153(var47, var48, class193.field2839[var45], -7, arg3);
                        }
                        if (~class362.field5291 <= ~var46) {
                            class518.method3153(var47, var48, class193.field2839[var46], -7, arg3);
                        }
                    } else {
                        int var49 = class183.method1292(class200.field2976, -1, class204.field3061, arg5 + var10);
                        int var50 = class183.method1292(class200.field2976, -1, class204.field3061, -var10 + arg5);
                        if (class377.field5458 <= var45) {
                            int[] var51 = class193.field2839[var45];
                            class518.method3153(var50, var48, var51, -7, arg3);
                            class518.method3153(var49, var50, var51, -7, arg7);
                            class518.method3153(var47, var49, var51, -7, arg3);
                        }
                        if (~var46 >= ~class362.field5291) {
                            int[] var52 = class193.field2839[var46];
                            class518.method3153(var50, var48, var52, -7, arg3);
                            class518.method3153(var49, var50, var52, -7, arg7);
                            class518.method3153(var47, var49, var52, arg0 + 21399, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 != 1) {
            method109((Component) null, 124, false);
        }
        ++field228;
        if (arg1 == 0) {
            this.method115(4080, arg0.method2865(255));
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field240;
        if (arg1 != 8213) {
            this.method113(-27, -47);
        }
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class399.field5703; ++var7) {
                var4[var7] = this.field234;
                var5[var7] = this.field229;
                var6[var7] = this.field226;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
    public static final byte[] method114(int arg0, int arg1, int arg2, Object arg3) {
        if (arg1 != 4080) {
            method111(2, -21, 127, 110, 59, -82, 5, -39);
        }
        ++field237;
        if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class617.method3582(var4, arg0, (byte) 107, arg2);
        } else if (arg3 instanceof class234) {
            class234 var5 = (class234) arg3;
            return var5.method1634((byte) 66, arg0, arg2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V")
    private final void method115(int arg0, int arg1) {
        this.field226 = arg1 << 4 & 4080;
        this.field234 = (arg1 & 16711680) >> 12;
        this.field229 = arg0 & arg1 >> 4;
        ++field235;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)Z")
    public static final boolean method116(int arg0, int arg1, int arg2) {
        ++field230;
        if (!class90.method704(arg1, true, arg2)) {
            return false;
        } else if ((36864 & arg1) != 0 | class679.method3859(arg1, arg2, -1) | class353.method2248(arg2, arg1, -12647)) {
            return true;
        } else {
            int var3 = -41 % ((arg0 - -58) / 38);
            return (55 & arg2) == 0 & (class275.method1780(arg2, arg1, 86) | ~(arg1 & 8192) != -1 | class370.method2319((byte) -124, arg1, arg2));
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class26() {
        this(0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method117(String arg0, byte arg1) {
        ++field231;
        class88 var2 = class144.method1008((byte) 90);
        var2.field1260.method2881(class105.field1501.field9838, (byte) 115);
        var2.field1260.method2862(0, -1166933656);
        int var3 = var2.field1260.field6864;
        var2.field1260.method2862(630, -1166933656);
        int[] var4 = class617.method3584(99999999, var2);
        int var5 = var2.field1260.field6864;
        var2.field1260.method2902(arg0, false);
        var2.field1260.method2881(class45.field748, (byte) 111);
        if (arg1 >= 115) {
            var2.field1260.field6864 += 7;
            var2.field1260.method2861(-65, var4, var2.field1260.field6864, var5);
            var2.field1260.method2869(-var3 + var2.field1260.field6864, 3);
            class523.method3183(var2, (byte) 31);
            class523.field7602 = 0;
            class316.field4264 = 0;
            class306.field4163 = -3;
            class328.field4452 = 1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I")
    public static final int method118(int arg0, byte arg1) {
        if (arg1 != 31) {
            field232 = 101;
        }
        ++field233;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
    private class26(int arg0) {
        super(0, false);
        this.method115(4080, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static void method119(int arg0) {
        if (arg0 != -29558) {
            method117((String) null, (byte) -58);
        }
        field239 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method120(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
