import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class410 {

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Z")
    public static boolean field6038 = false;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "[Lul;")
    public static class402[] field6040 = new class402[14];

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "[I")
    public static int[] field6043 = new int[200];

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIII)V", line = 8)
    public static final void method2535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6041++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = -98 % ((9 - arg4) / 42);
        int var11 = 0;
        int var12 = arg1 - arg5;
        int var13 = arg6 - arg5;
        int var14 = arg1 * arg1;
        int var15 = arg6 * arg6;
        int var16 = var12 * var12;
        int var17 = var13 * var13;
        int var18 = var15 << 1;
        int var19 = var14 << 1;
        int var20 = var17 << 1;
        int var21 = var16 << 1;
        int var22 = arg6 << 1;
        int var23 = var13 << 1;
        int var24 = (1 - var22) * var14 + var18;
        int var25 = var15 - ((var22 - 1) * var19);
        int var26 = (1 - var23) * var16 + var20;
        int var27 = var17 - ((var23 - 1) * var21);
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 << 2;
        int var32 = var18 * 3;
        int var33 = (var22 - 3) * var19;
        int var34 = var20 * 3;
        int var35 = (var23 - 3) * var21;
        int var36 = var29;
        int var37 = (arg6 - 1) * var28;
        int var38 = var31;
        int var39 = (var13 - 1) * var30;
        if (arg3 >= class229.field3347 && class156.field2366 >= arg3) {
            int[] var40 = class436.field6332[arg3];
            int var41 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 - arg1);
            int var42 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 + arg1);
            int var43 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 - var12);
            int var44 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 + var12);
            class217.method1448(var40, var41, arg0, 4, var43);
            class217.method1448(var40, var43, arg2, 4, var44);
            class217.method1448(var40, var44, arg0, 4, var42);
        }
        while (var9 > 0) {
            boolean var45 = var9 <= var13;
            if (var45) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var26 += var34;
                        var27 += var38;
                        var38 += var31;
                        var34 += var31;
                        var11++;
                    }
                }
                if (var27 < 0) {
                    var26 += var34;
                    var27 += var38;
                    var34 += var31;
                    var38 += var31;
                    var11++;
                }
                var27 += -var35;
                var26 += -var39;
                var35 -= var30;
                var39 -= var30;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var32;
                    var25 += var36;
                    var8++;
                    var36 += var29;
                    var32 += var29;
                }
            }
            if (var25 < 0) {
                var25 += var36;
                var24 += var32;
                var8++;
                var32 += var29;
                var36 += var29;
            }
            var24 += -var37;
            var25 += -var33;
            var9--;
            var37 -= var28;
            var33 -= var28;
            int var46 = arg3 - var9;
            int var47 = arg3 + var9;
            if (var47 >= class229.field3347 && var46 <= class156.field2366) {
                int var48 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 + var8);
                int var49 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 - var8);
                if (var45) {
                    int var50 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 + var11);
                    int var51 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7 - var11);
                    if (var46 >= class229.field3347) {
                        int[] var52 = class436.field6332[var46];
                        class217.method1448(var52, var49, arg0, 4, var51);
                        class217.method1448(var52, var51, arg2, 4, var50);
                        class217.method1448(var52, var50, arg0, 4, var48);
                    }
                    if (class156.field2366 >= var47) {
                        int[] var53 = class436.field6332[var47];
                        class217.method1448(var53, var49, arg0, 4, var51);
                        class217.method1448(var53, var51, arg2, 4, var50);
                        class217.method1448(var53, var50, arg0, 4, var48);
                    }
                } else {
                    if (var46 >= class229.field3347) {
                        class217.method1448(class436.field6332[var46], var49, arg0, 4, var48);
                    }
                    if (var47 <= class156.field2366) {
                        class217.method1448(class436.field6332[var47], var49, arg0, 4, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V", line = 214)
    public static final void method2536(boolean arg0, int arg1) {
        if (arg0) {
            if (class341.field5207 != -1) {
                class143.method1036(class341.field5207, 0);
            }
            for (class183 var2 = (class183) class466.field6844.method2483(113); var2 != null; var2 = (class183) class466.field6844.method2481((byte) -27)) {
                if (!var2.method2664(96)) {
                    var2 = (class183) class466.field6844.method2483(arg1 ^ 0xFFFFBD76);
                    if (var2 == null) {
                        break;
                    }
                }
                class456.method2743(true, 118, false, var2);
            }
            class341.field5207 = -1;
            class466.field6844 = new class398(8);
            class139.method1025((byte) 104);
            class341.field5207 = class31.field505;
            class31.method256(44, false);
            class67.method582(-25099);
            class150.method1081(class341.field5207);
        }
        field6039++;
        class496.method2954(13884);
        class508.field7429 = -1;
        class108.method807(class520.field7642, true);
        class95.field1558 = new class62();
        class95.field1558.field409[0] = class237.field3436 / 2;
        class95.field1558.field5529 = class237.field3436 * 128 / 2;
        class95.field1558.field5539 = class83.field1366 * 128 / 2;
        class291.field4175 = 0;
        class430.field6262 = 0;
        class95.field1558.field416[0] = class83.field1366 / 2;
        if (class403.field5944 == 2) {
            class430.field6262 = class294.field4197 << 7;
            class291.field4175 = class311.field4453 << 7;
        } else {
            class373.method2386(arg1 ^ 0x4291);
        }
        if (arg1 != -17143) {
            method2537((byte) -67, 5);
        }
        class193.method1317(arg1 ^ 0xFF00BD09);
        if (class430.field6262 == 0 || class291.field4175 == 0) {
            class138.method1022(10, arg1 + 17144);
        } else {
            class332.method2192((byte) 48);
            class138.method1022(28, 1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Lbw;", line = 289)
    public static final class482 method2537(byte arg0, int arg1) {
        field6036++;
        class259[] var2 = class270.field3923;
        synchronized (class270.field3923) {
            if (arg0 >= -7) {
                field6038 = false;
            }
            class482 var3;
            if (class270.field3923.length <= arg1 || class270.field3923[arg1].method1640(false)) {
                var3 = new class482();
                var3.field7079 = new class361[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field7079[var4] = new class361();
                }
            } else {
                var3 = (class482) class270.field3923[arg1].method1635(false);
                var3.method1540(-1);
                int var10002 = class204.field2946[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILqg;[Lwe;)Lv;", line = 329)
    public static final class406 method2538(int arg0, class321 arg1, class279[] arg2) {
        field6037++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field4016 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg0 != 1357486177) {
            return null;
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field4016);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class29.field479, 0);
        if (class29.field479[0] == 0) {
            if (class29.field479[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class29.field479, 1);
            if (class29.field479[1] > 1) {
                byte[] var7 = new byte[class29.field479[1]];
                OpenGL.glGetInfoLogARB(var4, class29.field479[1], class29.field479, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class29.field479[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field4016);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class406(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Z", line = 396)
    public static final boolean method2539(int arg0, int arg1) {
        field6035++;
        if (arg0 != -8927) {
            field6040 = null;
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 407)
    public static void method2540(byte arg0) {
        field6040 = null;
        field6043 = null;
        if (arg0 > -45) {
            field6043 = null;
        }
    }
}
