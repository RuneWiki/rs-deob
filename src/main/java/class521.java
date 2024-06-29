import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class521 extends class4 {

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public int field7263;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method3101(byte arg0) {
        field7254++;
        class674 var1 = (class674) class72.field1088.method3618(106);
        if (arg0 > -98) {
            method3107(-127, (byte) 49);
        }
        boolean var2 = class731.field10159 != null || class409.field5835 > 0;
        int var3 = var1.method2574((byte) 2);
        int var4 = var1.method2571(true);
        if (var2) {
            class258.field3735 = 1;
        }
        if (var2) {
            class435.field6066 = class655.field8752;
        } else {
            class673.method3804(class655.field8752, var3, var4, true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z")
    public abstract boolean method3102(boolean arg0);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static final void method3103(byte arg0) {
        if (arg0 > -18) {
            return;
        }
        field7255++;
        if (class312.field4340 == null) {
            return;
        }
        class201[] var1 = class312.field4340;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class201 var3 = var1[var2];
            var3.method1224(-19040);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3104(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field7261++;
            return (arg2 & 0x800) != 0 | class65.method523(arg0, arg2, arg1) || class489.method2970(true, arg2, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[I[ILcea;[I)V")
    public static final void method3105(int arg0, int[] arg1, int[] arg2, class96 arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field7151.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field7151[var9] = null;
                    } else {
                        class57 var10 = class607.field8188.method3001(-12575, var6);
                        int var11 = var10.field818;
                        class597 var12 = arg3.field7151[var9];
                        if (var12 != null) {
                            if (var12.field8105 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field7151[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field8106 = var8;
                                    var12.field8103 = 0;
                                    var12.field8100 = 1;
                                    var12.field8099 = 0;
                                    var12.field8101 = 0;
                                    if (!arg3.field7134) {
                                        class123.method765(0, arg3, var10, false);
                                    }
                                } else if (var11 == 2) {
                                    var12.field8099 = 0;
                                }
                            } else if (var10.field815 >= class607.field8188.method3001(-12575, var12.field8105).field815) {
                                var12 = arg3.field7151[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class597 var13 = arg3.field7151[var9] = new class597();
                            var13.field8101 = 0;
                            var13.field8099 = 0;
                            var13.field8103 = 0;
                            var13.field8100 = 1;
                            var13.field8106 = var8;
                            var13.field8105 = var6;
                            if (!arg3.field7134) {
                                class123.method765(0, arg3, var10, false);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg0 != 8930) {
            method3103((byte) 70);
        }
        field7259++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIBI)V")
    public static final void method3106(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7257++;
        class346 var5 = class299.method1976(0, 10, arg2);
        var5.method2209(255);
        var5.field4926 = arg0;
        if (arg3 < 101) {
            method3103((byte) -15);
        }
        var5.field4919 = arg4;
        var5.field4916 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
    public static final void method3107(int arg0, byte arg1) {
        field7258++;
        if (arg1 < -127) {
            class346 var2 = class299.method1976(0, 6, arg0);
            var2.method2208(-1719);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method3108(byte arg0);

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V")
    public class521(int arg0) {
        this.field7263 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lida;I)Ljava/lang/String;")
    public static final String method3109(class272 arg0, int arg1) {
        if (arg1 == 0) {
            field7262++;
            return arg0.field3946 + " <col=ffffff>>";
        } else {
            return null;
        }
    }
}
