import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class492 extends class80 {

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
    private int field7203 = 0;

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "I")
    private int field7204 = 20;

    @OriginalMember(owner = "client!ev", name = "S", descriptor = "I")
    private int field7211 = 0;

    @OriginalMember(owner = "client!ev", name = "U", descriptor = "I")
    private int field7213 = 1365;

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "Lbj;")
    public static class162 field7208 = new class162(34, 0);

    @OriginalMember(owner = "client!ev", name = "R", descriptor = "I")
    public static int field7210 = 0;

    @OriginalMember(owner = "client!ev", name = "V", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7214 = new Rectangle[100];

    @OriginalMember(owner = "client!ev", name = "W", descriptor = "[J")
    public static long[] field7215 = new long[32];

    @OriginalMember(owner = "client!ev", name = "T", descriptor = "Lmf;")
    public static class291 field7212 = new class291();

    @OriginalMember(owner = "client!ev", name = "X", descriptor = "I")
    public static int field7216 = 0;

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "I")
    public static int field7209;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ev", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field7217;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field7206;
        int var4 = -97 / ((28 - arg1) / 53);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field7203 = arg2.method1841((byte) -122);
                    }
                } else {
                    this.field7211 = arg2.method1841((byte) -123);
                }
            } else {
                this.field7204 = arg2.method1841((byte) -120);
            }
        } else {
            this.field7213 = arg2.method1841((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)V")
    public static void method2967(int arg0) {
        if (arg0 == 1822746508) {
            field7212 = null;
            field7215 = null;
            field7208 = null;
            field7214 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILza;Ll;III)V")
    public static final void method2968(int arg0, int arg1, class288 arg2, class16 arg3, int arg4, int arg5, int arg6) {
        if (class35.field537 < 100) {
            class7.method45((byte) 61, arg2, arg3);
        }
        ++field7209;
        arg2.method371(arg1, arg4, arg1 + arg6, arg0 + arg4);
        if (arg5 >= 79) {
            if (~class35.field537 > -101) {
                byte var7 = 20;
                int var8 = arg6 / 2 + arg1;
                arg2.method327(arg1, arg4, arg6, arg0, -16777216, 0);
                int var9 = arg0 / 2 - 18 + arg4 + -var7;
                arg2.method365(var8 - 152, var9, 304, 34, class119.field2089[class447.field6651].getRGB(), 0);
                arg2.method327(var8 - 150, var9 + 2, class35.field537 * 3, 30, class379.field5543[class447.field6651].getRGB(), 0);
                class356.field5232.method2010(var8, class239.field3714.method1977(class146.field2452, -61), class87.field1781[class447.field6651].getRGB(), var7 + var9, -1, 94);
            } else {
                int var10 = -((int) ((float) arg6 / class319.field4859)) + class71.field1437;
                int var11 = class457.field6775 - -((int) ((float) arg0 / class319.field4859));
                int var12 = (int) ((float) arg6 / class319.field4859) + class71.field1437;
                class528.field7697 = (int) ((float) (arg6 * 2) / class319.field4859);
                class62.field1267 = -((int) ((float) arg0 / class319.field4859)) + class457.field6775;
                int var13 = -((int) ((float) arg0 / class319.field4859)) + class457.field6775;
                class366.field5382 = (int) ((float) (arg0 * 2) / class319.field4859);
                class526.field7637 = -((int) ((float) arg6 / class319.field4859)) + class71.field1437;
                class319.method2049(var10 - -class319.field4876, class319.field4869 + var11, class319.field4876 + var12, class319.field4869 + var13, arg1, arg4, arg1 + arg6, arg0 + arg4 + 1);
                class319.method2042(arg2);
                class291 var14 = class319.method2039(arg2);
                class326.method2070(0, 0, var14, arg2, -7836);
                if (class420.field6337 > 0) {
                    --class25.field383;
                    if (class25.field383 == 0) {
                        class25.field383 = 20;
                        --class420.field6337;
                    }
                }
                if (class1.field32) {
                    int var15 = arg1 + arg6 - 5;
                    int var16 = arg4 + -8 - -arg0;
                    class470.field6980.method2015(113, "Fps:" + class506.field7385, -1, var16, var15, 16776960);
                    int var20 = var16 - 15;
                    Runtime var17 = Runtime.getRuntime();
                    int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                    int var19 = 16776960;
                    if (~var18 < -65537) {
                        var19 = 16711680;
                    }
                    class470.field6980.method2015(84, "Mem:" + var18 + "k", -1, var20, var15, var19);
                    var16 = var20 - 15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
    public static final void method2969(String arg0, int arg1, String arg2, String arg3, int arg4, int arg5) {
        class304.method1942(-1, (String) null, arg2, arg3, true, arg1, arg0, arg5);
        if (arg4 != 0) {
            method2969((String) null, 105, (String) null, (String) null, -32, -8);
        }
        ++field7202;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != -16828) {
            return null;
        } else {
            ++field7207;
            int[] var3 = super.field1601.method48(arg0, (byte) 0);
            if (super.field1601.field124) {
                for (int var4 = 0; class137.field2308 > var4; ++var4) {
                    int var5 = (class460.field6860[var4] << 12) / this.field7213 + this.field7211;
                    int var6 = (class44.field795[arg0] << 12) / this.field7213 + this.field7203;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13;
                    for (var13 = 0; var11 - -var12 < 16384 && this.field7204 > var13; ++var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var11 - var12 + var7;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = var13 >= this.field7204 + -1 ? 0 : (var13 << 12) / this.field7204;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
    public class492() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 32295) {
            method2967(42);
        }
        ++field7201;
        if (~arg2 <= -1 && arg4 >= 0 && arg2 < class339.field5099 - 1 && class484.field7129 + -1 > arg4) {
            if (class518.field7511 == null) {
                return;
            }
            if (arg1 != 0) {
                if (arg1 == 1) {
                    class425 var8 = (class425) class498.method3008(arg3, arg2, arg4);
                    if (var8 != null) {
                        if (var8 instanceof class327) {
                            ((class327) var8).field4957.method1570(30032, arg5);
                            return;
                        }
                        int var9 = var8.method224(arg7 + -43143);
                        if (arg0 != 4 && ~arg0 != -6) {
                            if (arg0 != 6) {
                                if (arg0 == 7) {
                                    class432.method2595(4, arg1, arg2, arg3, arg4, arg5, 118, var9, (arg6 + 2 & 3) - -4);
                                    return;
                                }
                                if (arg0 == 8) {
                                    class432.method2595(4, arg1, arg2, arg3, arg4, arg5, arg7 + -32296, var9, arg6 + 4);
                                    class432.method2595(4, arg1, arg2, arg3, arg4, arg5, arg7 ^ -32376, var9, (3 & arg6 + 2) + 4);
                                    return;
                                }
                            } else {
                                class432.method2595(4, arg1, arg2, arg3, arg4, arg5, 126, var9, arg6 + 4);
                            }
                            return;
                        }
                        class432.method2595(4, arg1, arg2, arg3, arg4, arg5, -78, var9, arg6);
                        return;
                    }
                } else if (arg1 != 2) {
                    if (~arg1 == -4) {
                        class425 var10 = (class425) class296.method1911(arg3, arg2, arg4);
                        if (var10 != null) {
                            if (!(var10 instanceof class199)) {
                                class432.method2595(arg0, arg1, arg2, arg3, arg4, arg5, 117, var10.method224(-10848), arg6);
                                return;
                            }
                            ((class199) var10).field3227.method1570(30032, arg5);
                            return;
                        }
                    }
                } else {
                    class425 var11 = (class425) class479.method2859(arg3, arg2, arg4, field7217 != null ? field7217 : (field7217 = method2972("rj")));
                    if (var11 == null) {
                        return;
                    }
                    if (~arg0 == -12) {
                        arg0 = 10;
                    }
                    if (!(var11 instanceof class133)) {
                        class432.method2595(arg0, arg1, arg2, arg3, arg4, arg5, 123, var11.method224(-10848), arg6);
                        return;
                    }
                    ((class133) var11).field2240.method1570(30032, arg5);
                }
                return;
            }
            class425 var12 = (class425) class211.method1435(arg3, arg2, arg4);
            class425 var13 = (class425) class359.method2210(arg3, arg2, arg4);
            if (var12 != null && ~arg0 != -3) {
                if (!(var12 instanceof class250)) {
                    class432.method2595(arg0, arg1, arg2, arg3, arg4, arg5, -107, var12.method224(-10848), arg6);
                } else {
                    ((class250) var12).field3855.method1570(arg7 + -2263, arg5);
                }
            }
            if (var13 != null) {
                if (!(var13 instanceof class250)) {
                    class432.method2595(arg0, arg1, arg2, arg3, arg4, arg5, 118, var13.method224(arg7 ^ -21625), arg6);
                    return;
                }
                ((class250) var13).field3855.method1570(30032, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BIIII)V")
    public static final void method2971(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class467.field6940 >= ~(-arg2 + arg1) && class43.field600 >= arg1 + arg2 && class372.field5455 <= -arg2 + arg4 && ~(arg2 + arg4) >= ~class216.field3415) {
            class526.method3113(arg2, arg1, 0, arg4, arg3);
        } else {
            class64.method567(arg2, arg4, arg1, arg3, 576);
        }
        int var5 = 25 / ((45 - arg0) / 54);
        ++field7205;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2972(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
