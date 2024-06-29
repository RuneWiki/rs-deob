import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class248 extends class235 {

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public int field3454 = 0;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "Z")
    public static boolean field3460 = false;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Lqj;")
    public static class238 field3459;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Lhp;")
    public static class88 field3456;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field3458;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method1528(int arg0) {
        field3456 = null;
        field3459 = null;
        field3458 = null;
        if (arg0 < 117) {
            field3458 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[I[I[ILai;)V")
    public static final void method1529(byte arg0, int[] arg1, int[] arg2, int[] arg3, class129 arg4) {
        field3453++;
        if (arg0 != 18) {
            method1528(75);
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg4.field288.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field288[var9] = null;
                    } else {
                        class15 var10 = class391.method2551(var6, (byte) -91);
                        int var11 = var10.field166;
                        class445 var12 = arg4.field288[var9];
                        if (var12 != null) {
                            if (var12.field6483 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field288[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6486 = 0;
                                    var12.field6479 = 0;
                                    var12.field6480 = 1;
                                    var12.field6482 = var8;
                                    var12.field6481 = 0;
                                    class277.method1770(arg4.field5284, 21155, false, 0, arg4.field5298, var10);
                                } else if (var11 == 2) {
                                    var12.field6479 = 0;
                                }
                            } else if (var10.field153 >= class391.method2551(var12.field6483, (byte) -95).field153) {
                                var12 = arg4.field288[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class445 var13 = arg4.field288[var9] = new class445();
                            var13.field6486 = 0;
                            var13.field6479 = 0;
                            var13.field6481 = 0;
                            var13.field6480 = 1;
                            var13.field6483 = var6;
                            var13.field6482 = var8;
                            class277.method1770(arg4.field5284, 21155, false, 0, arg4.field5298, var10);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Lgj;")
    public static final class373 method1530(int arg0, int arg1) {
        if (arg1 < 32) {
            method1532((byte) 29, 30);
        }
        field3461++;
        class24 var2 = class227.field3192;
        class373 var3;
        synchronized (class227.field3192) {
            var3 = (class373) class227.field3192.method209(120, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class129.field1715.method1472(class174.method1064((byte) 122, arg0), class64.method419(15443, arg0), 0);
        class373 var5 = new class373();
        var5.field5631 = arg0;
        if (var4 != null) {
            var5.method2471(-114, new class265(var4));
        }
        var5.method2466(16172);
        class24 var6 = class227.field3192;
        synchronized (class227.field3192) {
            class227.field3192.method202(true, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILil;)V")
    private final void method1531(int arg0, int arg1, class265 arg2) {
        if (arg0 == -17821) {
            if (arg1 == 2) {
                this.field3454 = arg2.method1685(8104);
            }
            field3462++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V")
    public static final void method1532(byte arg0, int arg1) {
        field3455++;
        class423.field6297 = -1;
        int var2 = 25 / ((arg0 + 63) / 32);
        class292.field4230 = 3;
        class263.field3834 = arg1;
        class395.field5935 = 100;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lil;I)V")
    public final void method1533(class265 arg0, int arg1) {
        if (arg1 != -1) {
            method1532((byte) 96, -90);
        }
        while (true) {
            int var3 = arg0.method1697(97);
            if (var3 == 0) {
                field3457++;
                return;
            }
            this.method1531(-17821, var3, arg0);
        }
    }
}
