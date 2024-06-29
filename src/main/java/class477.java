import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class477 extends class763 implements class149 {

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "[I")
    public static int[] field6626 = new int[2048];

    @OriginalMember(owner = "client!jea", name = "y", descriptor = "Lmga;")
    public static class739 field6625 = new class739(63, 2);

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!jea", name = "A", descriptor = "[I")
    public static int[] field6627;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lgaa;B)V")
    public static final void method2787(class315 arg0, byte arg1) {
        ++field6624;
        arg0.method1990(false);
        int var2 = 0;
        for (int var3 = 0; ~class571.field7608 < ~var3; ++var3) {
            int var16 = class79.field1136[var3];
            if (~(class256.field3832[var16] & 1) == -1) {
                if (var2 > 0) {
                    class256.field3832[var16] = (byte) class213.method1409(class256.field3832[var16], 2);
                    --var2;
                } else {
                    int var17 = arg0.method1993(-1, 1);
                    if (var17 == 0) {
                        var2 = class662.method3659((byte) -64, arg0);
                        class256.field3832[var16] = (byte) class213.method1409(class256.field3832[var16], 2);
                    } else {
                        class42.method283((byte) -81, var16, arg0);
                    }
                }
            }
        }
        int var4 = 16 % ((-20 - arg1) / 52);
        arg0.method1984(-104);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method1990(false);
            for (int var5 = 0; ~class571.field7608 < ~var5; ++var5) {
                int var14 = class79.field1136[var5];
                if (~(1 & class256.field3832[var14]) != -1) {
                    if (~var2 < -1) {
                        --var2;
                        class256.field3832[var14] = (byte) class213.method1409(class256.field3832[var14], 2);
                    } else {
                        int var15 = arg0.method1993(-1, 1);
                        if (var15 == 0) {
                            var2 = class662.method3659((byte) -103, arg0);
                            class256.field3832[var14] = (byte) class213.method1409(class256.field3832[var14], 2);
                        } else {
                            class42.method283((byte) -113, var14, arg0);
                        }
                    }
                }
            }
            arg0.method1984(-83);
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method1990(false);
                for (int var6 = 0; class741.field10225 > var6; ++var6) {
                    int var12 = class613.field8313[var6];
                    if (~(class256.field3832[var12] & 1) != -1) {
                        if (var2 > 0) {
                            --var2;
                            class256.field3832[var12] = (byte) class213.method1409(class256.field3832[var12], 2);
                        } else {
                            int var13 = arg0.method1993(-1, 1);
                            if (var13 == 0) {
                                var2 = class662.method3659((byte) -103, arg0);
                                class256.field3832[var12] = (byte) class213.method1409(class256.field3832[var12], 2);
                            } else if (class226.method1494(var12, arg0, 0)) {
                                class256.field3832[var12] = (byte) class213.method1409(class256.field3832[var12], 2);
                            }
                        }
                    }
                }
                arg0.method1984(-110);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method1990(false);
                    for (int var7 = 0; var7 < class741.field10225; ++var7) {
                        int var10 = class613.field8313[var7];
                        if ((class256.field3832[var10] & 1) == 0) {
                            if (~var2 < -1) {
                                --var2;
                                class256.field3832[var10] = (byte) class213.method1409(class256.field3832[var10], 2);
                            } else {
                                int var11 = arg0.method1993(-1, 1);
                                if (var11 == 0) {
                                    var2 = class662.method3659((byte) -74, arg0);
                                    class256.field3832[var10] = (byte) class213.method1409(class256.field3832[var10], 2);
                                } else if (class226.method1494(var10, arg0, 0)) {
                                    class256.field3832[var10] = (byte) class213.method1409(class256.field3832[var10], 2);
                                }
                            }
                        }
                    }
                    arg0.method1984(-114);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class741.field10225 = 0;
                        class571.field7608 = 0;
                        for (int var8 = 1; ~var8 > -2049; ++var8) {
                            class256.field3832[var8] = (byte) (class256.field3832[var8] >> 1);
                            class73 var9 = class599.field8149[var8];
                            if (var9 != null) {
                                class79.field1136[class571.field7608++] = var8;
                            } else {
                                class613.field8313[class741.field10225++] = var8;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lpa;IZ[[I)V")
    public class477(class391 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class305.field4404, class258.field3847, arg1 * arg1 * 6, arg2);
        super.field10545.method3520(true, this);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method4241(arg3[var5], var5 + 34069, arg1, true, arg1);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method4235(-11391), arg1, arg1, 0, class719.method4017(41, super.field10555), super.field10545.field5792, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
    public static void method2788(int arg0) {
        field6627 = null;
        field6626 = null;
        if (arg0 > 113) {
            field6625 = null;
        }
    }
}
