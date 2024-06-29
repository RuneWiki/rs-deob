import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class448 extends class212 {

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Lmu;")
    public static class303 field6333 = new class303(115, 11);

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field6342 = 0;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(II)Lcs;")
    public static final class342 method2677(int arg0, int arg1) {
        if (arg1 != 10144) {
            return null;
        } else {
            ++field6340;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        if ((double) class489.field6769 == 3.0D) {
                            return class530.field7314;
                        }
                        if ((double) class489.field6769 == 4.0D) {
                            return class539.field7466;
                        }
                        if ((double) class489.field6769 == 6.0D) {
                            return class480.field6698;
                        }
                        if ((double) class489.field6769 >= 8.0D) {
                            return class214.field3034;
                        }
                    }
                } else {
                    if ((double) class489.field6769 == 3.0D) {
                        return class428.field6146;
                    }
                    if ((double) class489.field6769 == 4.0D) {
                        return class445.field6324;
                    }
                    if ((double) class489.field6769 == 6.0D) {
                        return class530.field7314;
                    }
                    if ((double) class489.field6769 >= 8.0D) {
                        return class539.field7466;
                    }
                }
            } else {
                if ((double) class489.field6769 == 3.0D) {
                    return class323.field4479;
                }
                if ((double) class489.field6769 == 4.0D) {
                    return class204.field2944;
                }
                if ((double) class489.field6769 == 6.0D) {
                    return class428.field6146;
                }
                if ((double) class489.field6769 >= 8.0D) {
                    return class445.field6324;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (arg0) {
            method2678(115, -122, -59, 41, -49, 92);
        }
        ++field6335;
        if (super.field3004.method2064((byte) -84).method3097(-23688) < 96) {
            super.field3006 = 0;
        }
        if (super.field3006 < 0 || ~super.field3006 < -3) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        ++field6341;
        if (arg0 != 3) {
            this.method2679(99);
        }
        return super.field3004.method2064((byte) -85).method3097(-23688) < 96 ? 3 : 1;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(ILdh;)V")
    public class448(int arg0, class322 arg1) {
        super(arg0, arg1);
        class646.method3671(super.field3006, -122);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V")
    public static final void method2678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6334;
        int var6 = -arg2 + arg3;
        int var7 = -arg0 + arg4;
        if (~var7 != arg1) {
            if (~var6 == -1) {
                class739.method4062(arg4, arg5, arg2, arg0, (byte) 47);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (var7 < 0) {
                    var7 = -var7;
                }
                boolean var8 = var7 < var6;
                if (var8) {
                    int var9 = arg0;
                    int var10 = arg4;
                    arg0 = arg2;
                    arg4 = arg3;
                    arg2 = var9;
                    arg3 = var10;
                }
                if (~arg0 < ~arg4) {
                    int var11 = arg0;
                    arg0 = arg4;
                    int var12 = arg2;
                    arg4 = var11;
                    arg2 = arg3;
                    arg3 = var12;
                }
                int var13 = arg2;
                int var14 = -arg0 + arg4;
                int var15 = -arg2 + arg3;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg3 <= arg2 ? -1 : 1;
                if (!var8) {
                    for (int var18 = arg0; var18 <= arg4; ++var18) {
                        var16 += var15;
                        class691.field9345[var13][var18] = arg5;
                        if (~var16 < -1) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg0; arg4 >= var19; ++var19) {
                        class691.field9345[var19][var13] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class344.method2168(arg3, arg2, -117, arg0, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        ++field6339;
        super.field3006 = arg1;
        int var3 = 33 % ((arg0 - 82) / 35);
        class646.method3671(super.field3006, -122);
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        ++field6332;
        if (arg0 != 20014) {
            method2677(-76, -103);
        }
        return ~super.field3004.method2064((byte) -105).method3097(-23688) > -97 ? 0 : 2;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ldh;)V")
    public class448(class322 arg0) {
        super(arg0);
        class646.method3671(super.field3006, -120);
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)I")
    public final int method2679(int arg0) {
        ++field6336;
        return arg0 != -32350 ? -82 : super.field3006;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
    public static void method2680(int arg0) {
        field6333 = null;
        if (arg0 != 8) {
            field6333 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)Z")
    public final boolean method2681(int arg0) {
        if (arg0 < 85) {
            this.method2679(-69);
        }
        ++field6337;
        return super.field3004.method2064((byte) -104).method3097(-23688) >= 96;
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "(II)V")
    public static final void method2682(int arg0, int arg1) {
        ++field6338;
        class594 var2 = class692.method3869(arg0, (byte) 105, arg1);
        var2.method3383(-16058);
    }
}
