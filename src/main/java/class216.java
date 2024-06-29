import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class216 extends class254 {

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Lnh;")
    public static class54 field3930 = new class54(32);

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "[S")
    public static short[] field3942 = new short[500];

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "[S")
    public static short[] field3943 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "Ldh;")
    public static class120 field3934;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Lcf;")
    public class93 field3939;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
    public int[] field3929;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "[I")
    public int[] field3933;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[Llj;")
    public class25[] field3936;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[Lcf;")
    public class93[] field3927;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Loc;IIIIIIIZ)V")
    public static final void method1518(class61 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class166.field2931;
        int var11;
        int var12 = var11 = (arg7 << 7) - class272.field4825;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class233.field4151[arg1][arg6][arg7] - class263.field4692;
        int var18 = class233.field4151[arg1][arg6 + 1][arg7] - class263.field4692;
        int var19 = class233.field4151[arg1][arg6 + 1][arg7 + 1] - class263.field4692;
        int var20 = class233.field4151[arg1][arg6][arg7 + 1] - class263.field4692;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class179.field3161;
        int var46 = (var24 << 9) / var25 + class179.field3162;
        int var47 = (var27 << 9) / var31 + class179.field3161;
        int var48 = (var30 << 9) / var31 + class179.field3162;
        int var49 = (var33 << 9) / var37 + class179.field3161;
        int var50 = (var36 << 9) / var37 + class179.field3162;
        int var51 = (var39 << 9) / var43 + class179.field3161;
        int var52 = (var42 << 9) / var43 + class179.field3162;
        class179.field3151 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class198.field3599 && class223.method1550(class191.field3492 + class179.field3161, class248.field4478 + class179.field3162, var50, var52, var48, var49, var51, var47)) {
                class78.field1458 = arg6;
                class26.field336 = arg7;
            }
            if (!arg8) {
                class179.field3150 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class179.field3164 || var51 > class179.field3164 || var47 > class179.field3164) {
                    class179.field3150 = true;
                }
                if (arg0.field1027 == -1) {
                    if (arg0.field1029 != 12345678) {
                        class179.method1300(var50, var52, var48, var49, var51, var47, arg0.field1029, arg0.field1024, arg0.field1026);
                    }
                } else if (!class119.field2117) {
                    int var53 = class179.field3156.method1416((byte) 126, arg0.field1027);
                    class179.method1300(var50, var52, var48, var49, var51, var47, class137.method1002(var53, arg0.field1029), class137.method1002(var53, arg0.field1024), class137.method1002(var53, arg0.field1026));
                } else if (arg0.field1033) {
                    class179.method1319(var50, var52, var48, var49, var51, var47, arg0.field1029, arg0.field1024, arg0.field1026, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1027);
                } else {
                    class179.method1319(var50, var52, var48, var49, var51, var47, arg0.field1029, arg0.field1024, arg0.field1026, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1027);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class198.field3599 && class223.method1550(class191.field3492 + class179.field3161, class248.field4478 + class179.field3162, var46, var48, var52, var45, var47, var51)) {
            class78.field1458 = arg6;
            class26.field336 = arg7;
        }
        if (arg8) {
            return;
        }
        class179.field3150 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class179.field3164 || var47 > class179.field3164 || var51 > class179.field3164) {
            class179.field3150 = true;
        }
        if (arg0.field1027 != -1) {
            if (class119.field2117) {
                class179.method1319(var46, var48, var52, var45, var47, var51, arg0.field1041, arg0.field1026, arg0.field1024, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1027);
                return;
            }
            int var54 = class179.field3156.method1416((byte) 117, arg0.field1027);
            class179.method1300(var46, var48, var52, var45, var47, var51, class137.method1002(var54, arg0.field1041), class137.method1002(var54, arg0.field1026), class137.method1002(var54, arg0.field1024));
        } else if (arg0.field1041 != 12345678) {
            class179.method1300(var46, var48, var52, var45, var47, var51, arg0.field1041, arg0.field1026, arg0.field1024);
            return;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1519(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field3942 = null;
        }
        field3937++;
        if (arg1 < arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class76.field1406[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class76.field1406[var6][arg0] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method1520(int arg0) {
        field3930 = null;
        field3943 = null;
        field3942 = null;
        field3934 = null;
        if (arg0 >= -118) {
            field3938 = 31;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)V")
    public static final void method1521(int arg0, int arg1) {
        if (arg1 == 40) {
            class152.field2668.method298(true, arg0);
            class51.field834.method298(true, arg0);
            field3944++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1522(int arg0, Throwable arg1) throws IOException {
        field3941++;
        String var2;
        if ((arg1 instanceof class58)) {
            class58 var3 = (class58) arg1;
            var2 = var3.field983 + " | ";
            arg1 = var3.field987;
        } else {
            var2 = "";
        }
        if (arg0 != 16) {
            method1518((class61) null, -115, 122, 17, -58, -111, -32, -2, true);
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }
}
