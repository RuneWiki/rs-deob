import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class310 {

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Lhn;")
    public static class509 field4668 = new class509(38, 11);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lkl;")
    public static class56 field4662;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1979(Component arg0, int arg1);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (!arg6) {
            return;
        }
        field4664++;
        if (class184.method1223((byte) -66, arg2)) {
            if (class283.field4301[arg2] == null) {
                class497.method2948(-1, arg4, arg7, class200.field3326[arg2], arg1, (byte) -103, arg8, arg0, arg3, arg5);
            } else {
                class497.method2948(-1, arg4, arg7, class283.field4301[arg2], arg1, (byte) 98, arg8, arg0, arg3, arg5);
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class277.field4219[var9] = true;
            }
        } else {
            class277.field4219[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method1981(int arg0, String[] arg1, short[] arg2) {
        field4666++;
        if (arg0 <= 61) {
            field4662 = null;
        }
        class200.method1401((byte) -74, 0, arg1.length - 1, arg1, arg2);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)I")
    public static final int method1982(int arg0, int arg1, int arg2, int arg3) {
        field4665++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg2 / arg1;
        int var7 = arg2 & arg1 - 1;
        int var8 = class282.method1832(var4, (byte) -89, var6);
        int var9 = class282.method1832(var4 + 1, (byte) -89, var6);
        int var10 = class282.method1832(var4, (byte) -89, var6 + 1);
        if (arg3 < 94) {
            field4668 = null;
        }
        int var11 = class282.method1832(var4 + 1, (byte) -89, var6 + 1);
        int var12 = class303.method1946(var9, var8, (byte) 107, var5, arg1);
        int var13 = class303.method1946(var11, var10, (byte) 73, var5, arg1);
        return class303.method1946(var13, var12, (byte) 82, var7, arg1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static final void method1983(byte arg0) {
        field4667++;
        if (class352.field5196 != 3) {
            class283.field4310 = class147.field2235;
        }
        if (arg0 >= -71) {
            field4668 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I")
    public abstract int method1984(byte arg0);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1985(Component arg0, int arg1);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4668 = null;
        field4662 = null;
        if (arg0 >= -90) {
            field4662 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[I[I[ILcl;)V")
    public static final void method1987(int arg0, int[] arg1, int[] arg2, int[] arg3, class177 arg4) {
        field4663++;
        int var5 = 0;
        if (arg0 <= 38) {
            method1986(-120);
        }
        while (var5 < arg2.length) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field1964.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1964[var9] = null;
                    } else {
                        class189 var10 = class242.field3846.method2238(var6, (byte) 78);
                        int var11 = var10.field3192;
                        class121 var12 = arg4.field1964[var9];
                        if (var12 != null) {
                            if (var12.field1815 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field1964[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1822 = 0;
                                    var12.field1817 = 0;
                                    var12.field1820 = var8;
                                    var12.field1816 = 1;
                                    var12.field1823 = 0;
                                    class501.method2969(var10, arg4.field5837, class398.field5947 == arg4, 0, -122, arg4.field5826, arg4.field5833);
                                } else if (var11 == 2) {
                                    var12.field1817 = 0;
                                }
                            } else if (var10.field3175 >= class242.field3846.method2238(var12.field1815, (byte) 78).field3175) {
                                var12 = arg4.field1964[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class121 var13 = arg4.field1964[var9] = new class121();
                            var13.field1820 = var8;
                            var13.field1817 = 0;
                            var13.field1815 = var6;
                            var13.field1822 = 0;
                            var13.field1823 = 0;
                            var13.field1816 = 1;
                            class501.method2969(var10, arg4.field5837, class398.field5947 == arg4, 0, -108, arg4.field5826, arg4.field5833);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
    }
}
