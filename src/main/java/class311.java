import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class311 extends class43 {

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public int field4010 = -1;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "[S")
    public static short[] field4018 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lhb;")
    public static class250 field4013 = new class250(73, 15);

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "[S")
    public static short[] field4019 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "[I")
    public static int[] field4021 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4020 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Lf;")
    public static class404 field4017;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Ljava/lang/String;")
    public String field4009;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Ljava/lang/String;")
    public String field4012;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IFIFF)F", line = 3)
    public static final float method1854(int arg0, float arg1, int arg2, float arg3, float arg4) {
        ++field4011;
        float[] var5 = class288.field3690[arg0];
        if (arg2 != 2) {
            field4021 = null;
        }
        return var5[2] * arg1 + var5[1] * arg3 + var5[0] * arg4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIIIII)I", line = 17)
    public static final int method1855(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 3;
        if ((arg5 & 1) == 1) {
            int var8 = arg2;
            arg2 = arg4;
            arg4 = var8;
        }
        ++field4014;
        if (~var7 == -1) {
            return arg0;
        } else if (var7 == 1) {
            return 1 - arg2 + 7 - arg3;
        } else if (~var7 == -3) {
            return 1 - arg4 + -arg0 + 7;
        } else {
            return !arg1 ? 34 : arg3;
        }
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)Lwn;", line = 53)
    public final class174 method1856(int arg0) {
        if (arg0 != -1) {
            field4021 = null;
        }
        ++field4015;
        return class174.field2239[super.field633];
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V", line = 64)
    public static void method1857(int arg0) {
        field4018 = null;
        field4021 = null;
        field4019 = null;
        field4017 = null;
        if (arg0 != -21571) {
            field4018 = null;
        }
        field4020 = null;
        field4013 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILwt;)V", line = 82)
    public static final void method1858(int arg0, class16 arg1) {
        if (arg0 < 26) {
            field4022 = 32;
        }
        ++field4016;
        int var2 = 0;
        arg1.method99(8);
        for (int var3 = 0; ~class206.field2684 < ~var3; ++var3) {
            int var15 = class143.field1892[var3];
            if (~(1 & class360.field4664[var15]) == -1) {
                if (var2 > 0) {
                    class360.field4664[var15] = (byte) class31.method213(class360.field4664[var15], 2);
                    --var2;
                } else {
                    int var16 = arg1.method100((byte) -63, 1);
                    if (~var16 == -1) {
                        var2 = class512.method3051(arg1, 1);
                        class360.field4664[var15] = (byte) class31.method213(class360.field4664[var15], 2);
                    } else {
                        class417.method2452(arg1, var15, -600073092);
                    }
                }
            }
        }
        arg1.method102(103);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method99(8);
            for (int var4 = 0; ~class206.field2684 < ~var4; ++var4) {
                int var13 = class143.field1892[var4];
                if (~(class360.field4664[var13] & 1) != -1) {
                    if (var2 > 0) {
                        class360.field4664[var13] = (byte) class31.method213(class360.field4664[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg1.method100((byte) 92, 1);
                        if (~var14 == -1) {
                            var2 = class512.method3051(arg1, 1);
                            class360.field4664[var13] = (byte) class31.method213(class360.field4664[var13], 2);
                        } else {
                            class417.method2452(arg1, var13, -600073092);
                        }
                    }
                }
            }
            arg1.method102(113);
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method99(8);
                for (int var5 = 0; ~var5 > ~class199.field2563; ++var5) {
                    int var11 = class185.field2428[var5];
                    if (~(1 & class360.field4664[var11]) != -1) {
                        if (var2 > 0) {
                            class360.field4664[var11] = (byte) class31.method213(class360.field4664[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg1.method100((byte) -122, 1);
                            if (~var12 == -1) {
                                var2 = class512.method3051(arg1, 1);
                                class360.field4664[var11] = (byte) class31.method213(class360.field4664[var11], 2);
                            } else if (class25.method170(var11, arg1, false)) {
                                class360.field4664[var11] = (byte) class31.method213(class360.field4664[var11], 2);
                            }
                        }
                    }
                }
                arg1.method102(94);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg1.method99(8);
                    for (int var6 = 0; var6 < class199.field2563; ++var6) {
                        int var9 = class185.field2428[var6];
                        if ((class360.field4664[var9] & 1) == 0) {
                            if (var2 > 0) {
                                --var2;
                                class360.field4664[var9] = (byte) class31.method213(class360.field4664[var9], 2);
                            } else {
                                int var10 = arg1.method100((byte) 91, 1);
                                if (~var10 == -1) {
                                    var2 = class512.method3051(arg1, 1);
                                    class360.field4664[var9] = (byte) class31.method213(class360.field4664[var9], 2);
                                } else if (class25.method170(var9, arg1, false)) {
                                    class360.field4664[var9] = (byte) class31.method213(class360.field4664[var9], 2);
                                }
                            }
                        }
                    }
                    arg1.method102(104);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class199.field2563 = 0;
                        class206.field2684 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class360.field4664[var7] = (byte) (class360.field4664[var7] >> 1);
                            class518 var8 = class76.field952[var7];
                            if (var8 == null) {
                                class185.field2428[class199.field2563++] = var7;
                            } else {
                                class143.field1892[class206.field2684++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }
}
