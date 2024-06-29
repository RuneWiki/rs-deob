import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class211 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2863 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lam;")
    public static class286 field2866;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lam;")
    public static class286 field2868;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lgq;")
    public static class418 field2862;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[Llg;")
    public static class20[] field2865;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 4)
    public static final void method1143(String arg0, int arg1, int arg2) {
        field2872++;
        boolean var3 = false;
        for (int var4 = 0; var4 < class293.field3991; var4++) {
            class158 var5 = class85.field957[class345.field4629[var4]];
            if (var5 != null && var5.field2034 != null && var5.field2034.equalsIgnoreCase(arg0)) {
                var3 = true;
                if (arg2 == 1) {
                    class281.field3857.method295(20579, 122);
                    class101.field1198++;
                    class281.field3857.method1332(-128, class345.field4629[var4]);
                    class281.field3857.method1388(31475, 0);
                } else if (arg2 == 4) {
                    class281.field3857.method295(20579, 180);
                    class320.field4276++;
                    class281.field3857.method1386(-222840624, 0);
                    class281.field3857.method1360(class345.field4629[var4], -122);
                } else if (arg2 == 5) {
                    class12.field112++;
                    class281.field3857.method295(20579, 205);
                    class281.field3857.method1332(-128, class345.field4629[var4]);
                    class281.field3857.method1388(31475, 0);
                } else if (arg2 == 6) {
                    class281.field3857.method295(20579, 245);
                    class259.field3524++;
                    class281.field3857.method1341(0, -91);
                    class281.field3857.method1360(class345.field4629[var4], arg1 - 334);
                } else if (arg2 == 7) {
                    class70.field751++;
                    class281.field3857.method295(20579, 212);
                    class281.field3857.method1341(0, -115);
                    class281.field3857.method1376(90, class345.field4629[var4]);
                }
                break;
            }
        }
        if (arg1 != 212) {
            field2863 = 33;
        }
        if (!var3) {
            class371.method2240(class451.field6567 + arg0, -123);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[B", line = 82)
    public static final synchronized byte[] method1144(byte arg0, int arg1) {
        field2867++;
        if (arg1 == 100 && class118.field1474 > 0) {
            byte[] var2 = class372.field5199[--class118.field1474];
            class372.field5199[class118.field1474] = null;
            return var2;
        } else if (arg1 == 5000 && class422.field6191 > 0) {
            byte[] var3 = class98.field1160[--class422.field6191];
            class98.field1160[class422.field6191] = null;
            return var3;
        } else if (arg1 == 30000 && class410.field5935 > 0) {
            byte[] var4 = class167.field2114[--class410.field5935];
            class167.field2114[class410.field5935] = null;
            return var4;
        } else if (arg0 > -103) {
            return null;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIZIII)V", line = 122)
    public static final void method1145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg6) {
            field2868 = null;
        }
        field2861++;
        if (arg4 >= class322.field4306 && class310.field4183 >= arg4 && arg8 >= class322.field4306 && class310.field4183 >= arg8 && class322.field4306 <= arg9 && arg9 <= class310.field4183 && class322.field4306 <= arg0 && class310.field4183 >= arg0 && class335.field4462 <= arg2 && arg2 <= class6.field42 && class335.field4462 <= arg3 && arg3 <= class6.field42 && class335.field4462 <= arg1 && arg1 <= class6.field42 && class335.field4462 <= arg7 && class6.field42 >= arg7) {
            class392.method2440(arg8, arg9, arg4, arg3, arg5, (byte) 123, arg1, arg7, arg2, arg0);
        } else {
            class330.method1892(arg4, arg5, arg3, arg1, (byte) 91, arg2, arg7, arg9, arg8, arg0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I", line = 139)
    public static final int method1146(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field2863 = 29;
        }
        field2870++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 166)
    public static final void method1147(int arg0) {
        field2864++;
        if (class450.field6549 != 3) {
            class281.field3854 = -1;
        }
        if (arg0 != -1) {
            method1144((byte) 89, 66);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 180)
    public static final void method1148(int arg0) {
        while (true) {
            if (class448.field6514.method304(-126, class161.field2065) >= 11) {
                int var1 = class448.field6514.method305(11, -7985);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class85.field957[var1] == null) {
                        class85.field957[var1] = new class158();
                        class85.field957[var1].field6095 = var1;
                        var2 = true;
                        if (class312.field4194[var1] != null) {
                            class85.field957[var1].method852(0, class312.field4194[var1]);
                        }
                    }
                    class345.field4629[class293.field3991++] = var1;
                    class158 var3 = class85.field957[var1];
                    var3.field6071 = class234.field3224;
                    int var4 = class448.field6514.method305(5, -7985);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class448.field6514.method305(5, -7985);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class448.field6514.method305(1, -7985);
                    int var7 = class448.field6514.method305(1, -7985);
                    if (var7 == 1) {
                        class192.field2423[class338.field4509++] = var1;
                    }
                    int var8 = class327.field4341[class448.field6514.method305(3, -7985)];
                    if (var2) {
                        var3.method2600(0, var8);
                    }
                    var3.method853(class263.field3592, (byte) 70, class427.field6264.field6109[0] + var5, var6 == 1, class427.field6264.field6119[0] + var4);
                    continue;
                }
            }
            field2871++;
            if (arg0 > -81) {
                return;
            }
            class448.field6514.method299((byte) 76);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lfd;II)Ljava/lang/String;", line = 254)
    public static final String method1149(class194 arg0, int arg1, int arg2) {
        field2869++;
        if (!client.method1410(arg0).method1176(arg1, -81) && arg0.field2526 == null) {
            return null;
        } else if (arg2 != 28255) {
            return null;
        } else if (arg0.field2481 == null || arg0.field2481.length <= arg1 || arg0.field2481[arg1] == null || arg0.field2481[arg1].trim().length() == 0) {
            return class318.field4237 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field2481[arg1];
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 279)
    public static void method1150(int arg0) {
        field2866 = null;
        field2865 = null;
        field2862 = null;
        if (arg0 != 0) {
            method1148(-63);
        }
        field2868 = null;
    }
}
