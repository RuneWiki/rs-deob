import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class264 extends class263 {

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field3939 = 1;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "Laa;")
    public static class76 field3938 = new class76(53, 8);

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Ldp;")
    public static class347 field3944 = new class347("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Luv;")
    public static class2 field3945 = new class2(85, 8);

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "Liv;")
    public static class289 field3946;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field3935;
        if (arg1 < 40) {
            return null;
        } else {
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                class442.method2591(var3, 0, class367.field5597, class170.field2509[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class264() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method1649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ++field3941;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg0 - arg5;
        int var12 = -arg5 + arg4;
        int var13 = arg0 * arg0;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 - 1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        if (!arg7) {
            int var26 = -((var22 + -1) * var20) + var16;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 - 3) * var20;
            int var35 = var28;
            int var36 = (arg4 - 1) * var27;
            int var37 = var30;
            int var38 = (var12 + -1) * var29;
            if (~arg6 <= ~class305.field4555 && ~class286.field4290 <= ~arg6) {
                int[] var39 = class306.field4574[arg6];
                int var40 = class375.method2223(false, arg2 - arg0, class102.field1544, class297.field4427);
                int var41 = class375.method2223(false, arg0 + arg2, class102.field1544, class297.field4427);
                int var42 = class375.method2223(false, -var11 + arg2, class102.field1544, class297.field4427);
                int var43 = class375.method2223(false, arg2 + var11, class102.field1544, class297.field4427);
                class94.method740(var39, var40, var42, arg1, arg7);
                class94.method740(var39, var42, var43, arg3, false);
                class94.method740(var39, var43, var41, arg1, arg7);
            }
            while (var9 > 0) {
                boolean var44 = var12 >= var9;
                if (~var23 > -1) {
                    while (var23 < 0) {
                        var24 += var35;
                        var23 += var31;
                        var35 += var28;
                        ++var8;
                        var31 += var28;
                    }
                }
                if (var44) {
                    if (~var25 > -1) {
                        while (~var25 > -1) {
                            var26 += var37;
                            var25 += var33;
                            ++var10;
                            var37 += var30;
                            var33 += var30;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                    var26 += -var34;
                    var25 += -var38;
                    var38 -= var29;
                    var34 -= var29;
                }
                if (var24 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    ++var8;
                    var31 += var28;
                }
                var23 += -var36;
                var24 += -var32;
                var36 -= var27;
                --var9;
                var32 -= var27;
                int var45 = arg6 - var9;
                int var46 = arg6 - -var9;
                if (var46 >= class305.field4555 && ~class286.field4290 <= ~var45) {
                    int var47 = class375.method2223(false, arg2 + var8, class102.field1544, class297.field4427);
                    int var48 = class375.method2223(false, -var8 + arg2, class102.field1544, class297.field4427);
                    if (var44) {
                        int var49 = class375.method2223(false, arg2 + var10, class102.field1544, class297.field4427);
                        int var50 = class375.method2223(false, arg2 - var10, class102.field1544, class297.field4427);
                        if (class305.field4555 <= var45) {
                            int[] var51 = class306.field4574[var45];
                            class94.method740(var51, var48, var50, arg1, arg7);
                            class94.method740(var51, var50, var49, arg3, false);
                            class94.method740(var51, var49, var47, arg1, false);
                        }
                        if (var46 <= class286.field4290) {
                            int[] var52 = class306.field4574[var46];
                            class94.method740(var52, var48, var50, arg1, false);
                            class94.method740(var52, var50, var49, arg3, false);
                            class94.method740(var52, var49, var47, arg1, false);
                        }
                    } else {
                        if (~class305.field4555 >= ~var45) {
                            class94.method740(class306.field4574[var45], var48, var47, arg1, arg7);
                        }
                        if (~var46 >= ~class286.field4290) {
                            class94.method740(class306.field4574[var46], var48, var47, arg1, arg7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
    public static final void method1650(int arg0, int arg1) {
        ++field3933;
        class293.method1824(-116);
        class300.method1867(-1);
        class471.method2793(-7150, true, arg0);
        class31.method273(class407.field6147, class142.field2146, -79, class529.field7795);
        if (arg1 <= -61) {
            class179.method1221(class407.field6147, class142.field2146, 0);
            class31.method276(true);
            class196.method1293(10, class279.field4217);
            class134.method988(-28945);
            if (~class411.field6213 == -3) {
                class526.method3137(3, 2270);
            } else if (~class411.field6213 == -7) {
                class526.method3137(7, 2270);
            } else {
                if (~class411.field6213 != -10) {
                    if (class411.field6213 == 1) {
                        class157.method1120(class142.field2146, 0, class407.field6147);
                        return;
                    }
                } else {
                    class526.method3137(10, 2270);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIB)V")
    public static final void method1651(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field3940;
        if (arg4 != 1) {
            method1650(22, -36);
        }
        if (class454.field6661.field976 != 0 && ~arg3 != -1 && ~class187.field2744 > -51 && arg2 != -1) {
            class158.field2387[class187.field2744++] = new class425((byte) 1, arg2, arg3, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
    public static final void method1652(byte arg0) {
        ++field3936;
        if (class348.field5366 != null) {
            class348.field5366.method111(1);
            class348.field5366 = null;
            class291.field4363 = null;
        }
        if (arg0 < 6) {
            field3942 = -56;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1653(byte arg0, String arg1) {
        class73.method515(125, 0, 0, "", arg1, "");
        if (arg0 < 112) {
            method1651(65, -58, -71, 95, (byte) -115);
        }
        ++field3934;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method1654(int[] arg0, Object[] arg1, int arg2) {
        ++field3937;
        class96.method754(arg0.length + -1, arg0, arg1, arg2, (byte) 118);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)V")
    public static void method1655(byte arg0) {
        field3945 = null;
        if (arg0 > 48) {
            field3938 = null;
            field3944 = null;
            field3946 = null;
        }
    }
}
