import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class175 {

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lid;")
    public static class149 field3214 = class60.method382("<br>", (byte) 83);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3210 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lal;")
    public static class230 field3211;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static final void method1239(boolean arg0) {
        field3212++;
        int var1 = class11.field150.method154((byte) 9, 8);
        if (class253.field4432 > var1) {
            for (int var2 = var1; var2 < class253.field4432; var2++) {
                class186.field3345[class283.field5002++] = class251.field4407[var2];
            }
        }
        if (class253.field4432 < var1) {
            throw new RuntimeException("gppov1");
        }
        class253.field4432 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class251.field4407[var3];
            class127 var5 = class107.field1851[var4];
            int var6 = class11.field150.method154((byte) 9, 1);
            if (var6 == 0) {
                class251.field4407[class253.field4432++] = var4;
                var5.field2403 = class118.field2022;
            } else {
                int var7 = class11.field150.method154((byte) 9, 2);
                if (var7 == 0) {
                    class251.field4407[class253.field4432++] = var4;
                    var5.field2403 = class118.field2022;
                    class255.field4462[class162.field3013++] = var4;
                } else if (var7 == 1) {
                    class251.field4407[class253.field4432++] = var4;
                    var5.field2403 = class118.field2022;
                    int var8 = class11.field150.method154((byte) 9, 3);
                    var5.method928(var8, 1, 3);
                    int var9 = class11.field150.method154((byte) 9, 1);
                    if (var9 == 1) {
                        class255.field4462[class162.field3013++] = var4;
                    }
                } else if (var7 == 2) {
                    class251.field4407[class253.field4432++] = var4;
                    var5.field2403 = class118.field2022;
                    if (class11.field150.method154((byte) 9, 1) == 1) {
                        int var10 = class11.field150.method154((byte) 9, 3);
                        var5.method928(var10, 2, 3);
                        int var11 = class11.field150.method154((byte) 9, 3);
                        var5.method928(var11, 2, 3);
                    } else {
                        int var12 = class11.field150.method154((byte) 9, 3);
                        var5.method928(var12, 0, 3);
                    }
                    int var13 = class11.field150.method154((byte) 9, 1);
                    if (var13 == 1) {
                        class255.field4462[class162.field3013++] = var4;
                    }
                } else if (var7 == 3) {
                    class186.field3345[class283.field5002++] = var4;
                }
            }
        }
        if (arg0) {
            field3213 = 40;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lal;Ltc;ILal;)V")
    public static final void method1240(class230 arg0, class178 arg1, int arg2, class230 arg3) {
        class237.field4159 = arg3;
        class84.field1536 = arg1;
        if (arg2 != 1) {
            field3217 = -94;
        }
        class48.field874 = arg0;
        if (class237.field4159 != null) {
            class253.field4440 = class237.field4159.method1559(1, arg2 + 6);
        }
        if (class48.field874 != null) {
            class159.field2920 = class48.field874.method1559(1, 13);
        }
        field3209++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method1241(int arg0) {
        field3211 = null;
        field3214 = null;
        if (arg0 != 1) {
            field3210 = -101;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Z")
    public static final boolean method1242(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        int var3 = -20 / ((arg1 + 55) / 36);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class268 var4 = class108.method755(11525, arg0);
        field3215++;
        return var4.method1862(-30880, arg2);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIILug;IZJ)Z")
    public static final boolean method1243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class199 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class54.field973 == class189.field3393;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class181.field3264 || var24 >= class129.field2291) {
                    return false;
                }
                class231 var25 = class261.field4664[arg0][var15][var24];
                if (var25 != null && var25.field4047 >= 5) {
                    return false;
                }
            }
        }
        class23 var16 = new class23();
        var16.field338 = arg11;
        var16.field340 = arg0;
        var16.field320 = arg5;
        var16.field336 = arg6;
        var16.field337 = arg7;
        var16.field343 = arg8;
        var16.field323 = arg9;
        var16.field318 = arg1;
        var16.field330 = arg2;
        var16.field331 = arg1 + arg3 - 1;
        var16.field342 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class261.field4664[var22][var17][var20] == null) {
                        class261.field4664[var22][var17][var20] = new class231(var22, var17, var20);
                    }
                }
                class231 var23 = class261.field4664[arg0][var17][var20];
                var23.field4061[var23.field4047] = var16;
                var23.field4054[var23.field4047] = var21;
                var23.field4068 |= var21;
                var23.field4047++;
                if (var13 && class108.field1867[var17][var20] != 0) {
                    var14 = class108.field1867[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class108.field1867[var18][var19] == 0) {
                        class108.field1867[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class213.field3778[class277.field4951++] = var16;
        }
        return true;
    }
}
