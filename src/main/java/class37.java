import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class37 extends class192 implements class518 {

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Lf;")
    public class192 field550;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Ltd;")
    public static class374 field547;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Ldk;")
    public static class477 field552;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLza;)V")
    public final void method26(byte arg0, class491 arg1) {
        field555++;
        if (arg0 != 111) {
            field552 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
    public final int method29(int arg0) {
        field551++;
        int var2 = 5 / ((arg0 - 40) / 52);
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        field563++;
        int var2 = 30 / ((arg0 - 8) / 45);
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
    public static final void method273(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field548++;
        for (class451 var5 = (class451) class305.field4874.method2538(-3); var5 != null; var5 = (class451) class305.field4874.method2535((byte) -115)) {
            class367.method2336(arg3, var5, arg1, arg0, arg4, arg2 ^ 0x4D84);
        }
        if (arg2 != 19844) {
            return;
        }
        for (class451 var6 = (class451) class511.field7481.method2538(arg2 ^ 0xFFFFB279); var6 != null; var6 = (class451) class511.field7481.method2535((byte) -68)) {
            byte var11 = 1;
            class49 var12 = var6.field6728.method1308(-13076);
            if (var6.field6728.field3111) {
                var11 = 0;
            } else if (var6.field6728.field3078 == var12.field781 || var6.field6728.field3078 == var12.field797 || var6.field6728.field3078 == var12.field824 || var6.field6728.field3078 == var12.field809) {
                var11 = 2;
            } else if (var6.field6728.field3078 == var12.field805 || var6.field6728.field3078 == var12.field788 || var6.field6728.field3078 == var12.field811 || var6.field6728.field3078 == var12.field772) {
                var11 = 3;
            }
            if (var6.field6736 != var11) {
                int var13 = class30.method235(var6.field6728, (byte) -76);
                if (var6.field6730 != var13) {
                    if (var6.field6723 != null) {
                        class510.field7455.method1734(var6.field6723);
                        var6.field6723 = null;
                    }
                    var6.field6730 = var13;
                }
                var6.field6736 = var11;
            }
            var6.field6716 = var6.field6728.field4716;
            var6.field6735 = var6.field6728.field4716 + (var6.field6728.method1143(arg2 ^ 0x4D84) << 6);
            var6.field6740 = var6.field6728.field4714;
            var6.field6721 = var6.field6728.field4714 + (var6.field6728.method1143(0) << 6);
            class367.method2336(arg3, var6, arg1, arg0, arg4, 0);
        }
        for (class451 var7 = (class451) class101.field1683.method2518(-120); var7 != null; var7 = (class451) class101.field1683.method2524(arg2 ^ 0x4D84)) {
            byte var8 = 1;
            class49 var9 = var7.field6724.method1308(arg2 - 32920);
            if (var7.field6724.field3111) {
                var8 = 0;
            } else if (var7.field6724.field3078 == var9.field781 || var7.field6724.field3078 == var9.field797 || var7.field6724.field3078 == var9.field824 || var7.field6724.field3078 == var9.field809) {
                var8 = 2;
            } else if (var7.field6724.field3078 == var9.field805 || var7.field6724.field3078 == var9.field788 || var7.field6724.field3078 == var9.field811 || var7.field6724.field3078 == var9.field772) {
                var8 = 3;
            }
            if (var7.field6736 != var8) {
                int var10 = class112.method802(124, var7.field6724);
                if (var7.field6730 != var10) {
                    if (var7.field6723 != null) {
                        class510.field7455.method1734(var7.field6723);
                        var7.field6723 = null;
                    }
                    var7.field6730 = var10;
                }
                var7.field6736 = var8;
            }
            var7.field6716 = var7.field6724.field4716;
            var7.field6735 = var7.field6724.field4716 + (var7.field6724.method1143(0) << 6);
            var7.field6740 = var7.field6724.field4714;
            var7.field6721 = var7.field6724.field4714 + (var7.field6724.method1143(arg2 - 19844) << 6);
            class367.method2336(arg3, var7, arg1, arg0, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIILf;)V")
    public class37(int arg0, int arg1, int arg2, int arg3, int arg4, class192 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class255.method1729(arg1, -3868, arg0));
        this.field550 = arg5;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILza;I)Le;")
    public final class530 method32(int arg0, class491 arg1, int arg2) {
        int var4 = -40 % ((arg2 + 24) / 60);
        field556++;
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
    public final int method28(byte arg0) {
        if (arg0 != -118) {
            field547 = null;
        }
        field564++;
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
    public final void method31(int arg0) {
        field562++;
        int var2 = 95 / ((57 - arg0) / 48);
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)I")
    public final int method274(int arg0) {
        field559++;
        return arg0 == -2 ? 0 : -63;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
    public final int method38(int arg0) {
        if (arg0 != 5638) {
            field547 = null;
        }
        field549++;
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 121) {
            this.field550 = null;
        }
        field554++;
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(BLza;)V")
    public final void method43(byte arg0, class491 arg1) {
        field553++;
        if (arg0 != 35) {
            this.field550 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(ILza;)Lsr;")
    public final class430 method40(int arg0, class491 arg1) {
        field558++;
        if (arg0 >= -24) {
            this.field550 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V")
    public static void method275(int arg0) {
        field552 = null;
        if (arg0 != 24834) {
            field547 = null;
        }
        field547 = null;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)V")
    public static final void method276(byte arg0) {
        field560++;
        class283 var1 = (class283) class240.field4130.method2538(-3);
        int var2 = 22 / ((10 - arg0) / 45);
        while (var1 != null) {
            if (var1.field4629 == -1) {
                var1.field4630 = 0;
                if (var1.field4621 >= 0 && var1.field4628 >= 0 && class217.field3775 > var1.field4621 && var1.field4628 < class277.field4548) {
                    class4.method11(false, var1);
                }
            } else {
                var1.method1821((byte) -101);
            }
            var1 = (class283) class240.field4130.method2535((byte) -104);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILza;)V")
    public final void method34(int arg0, class491 arg1) {
        field561++;
        if (arg0 != 25747) {
            field552 = null;
        }
    }
}
