import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class644 extends class695 implements class550 {

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    private int field9030;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[I")
    public static int[] field9033 = new int[1000];

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[BII)V")
    public final void method3212(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field9027;
        int var5 = 110 % ((-56 - arg2) / 61);
        this.method3940(arg1, arg0);
        this.field9030 = arg3;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)J")
    public final long method3213(int arg0) {
        ++field9028;
        if (arg0 != -20288) {
            field9033 = null;
        }
        return super.field9589.getAddress();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Llf;I)I")
    public static final int method3688(class238 arg0, int arg1) {
        ++field9031;
        if (arg1 != 34166) {
            return 111;
        } else if (class331.field4759 == arg0) {
            return 5890;
        } else if (class10.field152 == arg0) {
            return 34167;
        } else if (class328.field4670 == arg0) {
            return 34168;
        } else if (class469.field6850 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I")
    public final int method3211(int arg0) {
        int var2 = 81 % ((-43 - arg0) / 42);
        ++field9025;
        return 0;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static final void method3689(int arg0) {
        ++field9032;
        class469.field6851.method1913((byte) -85);
        int var1 = class469.field6851.method1914(arg0 + -13645, 8);
        if (arg0 != 25001) {
            method3689(4);
        }
        if (~class441.field6552 < ~var1) {
            for (int var2 = var1; class441.field6552 > var2; ++var2) {
                class239.field3476[class760.field10604++] = class338.field4921[var2];
            }
        }
        if (~class441.field6552 > ~var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class441.field6552 = 0;
            for (int var3 = 0; var1 > var3; ++var3) {
                int var4 = class338.field4921[var3];
                class282 var5 = ((class432) class497.field7067.method2287((long) var4, (byte) -117)).field6439;
                int var6 = class469.field6851.method1914(11356, 1);
                if (var6 == 0) {
                    class338.field4921[class441.field6552++] = var4;
                    var5.field6121 = class611.field8635;
                } else {
                    int var7 = class469.field6851.method1914(11356, 2);
                    if (~var7 == -1) {
                        class338.field4921[class441.field6552++] = var4;
                        var5.field6121 = class611.field8635;
                        class451.field6668[class228.field3346++] = var4;
                    } else if (~var7 == -2) {
                        class338.field4921[class441.field6552++] = var4;
                        var5.field6121 = class611.field8635;
                        int var8 = class469.field6851.method1914(11356, 3);
                        var5.method1805(1, var8, arg0 + -24994);
                        int var9 = class469.field6851.method1914(11356, 1);
                        if (~var9 == -2) {
                            class451.field6668[class228.field3346++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class338.field4921[class441.field6552++] = var4;
                        var5.field6121 = class611.field8635;
                        if (class469.field6851.method1914(arg0 ^ 19957, 1) != 1) {
                            int var10 = class469.field6851.method1914(11356, 3);
                            var5.method1805(0, var10, 7);
                        } else {
                            int var11 = class469.field6851.method1914(11356, 3);
                            var5.method1805(2, var11, arg0 + -24994);
                            int var12 = class469.field6851.method1914(11356, 3);
                            var5.method1805(2, var12, 7);
                        }
                        int var13 = class469.field6851.method1914(arg0 + -13645, 1);
                        if (var13 == 1) {
                            class451.field6668[class228.field3346++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class239.field3476[class760.field10604++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)I")
    public final int method3210(boolean arg0) {
        ++field9026;
        if (!arg0) {
            this.method3210(false);
        }
        return this.field9030;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lwh;I[BI)V")
    public class644(class148 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9030 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static void method3690(byte arg0) {
        if (arg0 > 107) {
            field9033 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public static final void method3691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field9029;
        if (arg3 == 3) {
            if (class245.method1632(816183856, arg6)) {
                if (class365.field5282[arg6] != null) {
                    client.method1890(class365.field5282[arg6], -1, arg8, arg4, arg2, arg1, arg9, arg5, arg10, arg7, arg0, arg11);
                } else {
                    client.method1890(class86.field1229[arg6], -1, arg8, arg4, arg2, arg1, arg9, arg5, arg10, arg7, arg0, arg11);
                }
            }
        }
    }
}
