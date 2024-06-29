import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class210 {

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[I")
    private int[] field3347;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field3341 = 0;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field3348 = 50;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[Lng;")
    public static class80[] field3349 = new class80[8];

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field3351 = new String[field3348];

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
    public static int[] field3344 = new int[field3348];

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "[I")
    public static int[] field3352 = new int[field3348];

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[I")
    public static int[] field3350 = new int[field3348];

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "[I")
    public static int[] field3354 = new int[field3348];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[I")
    public static int[] field3339 = new int[field3348];

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field3345 = 0;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "[I")
    public static int[] field3355 = new int[field3348];

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "[I")
    public static int[] field3359 = new int[200];

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[I")
    public static int[] field3342 = new int[field3348];

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lrg;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1445(class248 arg0, String arg1, byte arg2) {
        if (arg1.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class35.field564 != null) {
                                                            if (class35.field564.field4930 == null) {
                                                                var9 = class273.method1806((byte) 108, class35.field564.field4934);
                                                            } else {
                                                                var9 = (String) class35.field564.field4930;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class214.method1472((byte) -55, class188.method1327(1110088615, 4, arg0)) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class214.method1472((byte) -55, class188.method1327(1110088615, 3, arg0)) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class214.method1472((byte) -55, class188.method1327(arg2 + 1110088736, 2, arg0)) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class214.method1472((byte) -55, class188.method1327(1110088615, 1, arg0)) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class214.method1472((byte) -55, class188.method1327(arg2 + 1110088736, 0, arg0)) + arg1.substring(var3 + 2);
            }
        }
        if (arg2 == -121) {
            field3356++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method1446(int arg0) {
        field3359 = null;
        field3349 = null;
        field3351 = null;
        field3355 = null;
        field3350 = null;
        field3352 = null;
        if (arg0 >= -79) {
            field3342 = null;
        }
        field3354 = null;
        field3342 = null;
        field3339 = null;
        field3344 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([I)V")
    public class210(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3347 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3347[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3347[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3347[var5 + var5] = arg0[var4];
            this.field3347[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
    public final int method1447(int arg0, int arg1) {
        field3343++;
        int var3 = (this.field3347.length >> 1) - 1;
        if (arg0 != -13069) {
            this.method1447(77, 68);
        }
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field3347[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3347[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3357++;
        if (class118.method816(arg3, 0)) {
            client.method1121(class208.field3315[arg3], -1, arg6, arg0, arg7, arg2, arg4, arg5);
            if (arg1 != -14364) {
                method1446(77);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3360++;
        int var7 = 0;
        class50.method322(arg5, -128);
        int var8 = arg5;
        int var9 = -arg5;
        int var10 = -1;
        int var11 = arg5 - arg2;
        if (var11 < 0) {
            var11 = 0;
        }
        if (arg4 != -2) {
            method1446(-81);
        }
        int var12 = -1;
        int var13 = arg3 - var11;
        int var14 = arg3 + var11;
        int var15 = var11;
        int[] var16 = class232.field3629[arg0];
        class309.method2096(arg1, var13, (byte) -117, var16, arg3 - arg5);
        int var17 = -var11;
        class309.method2096(arg6, var14, (byte) -117, var16, var13);
        class309.method2096(arg1, arg3 + arg5, (byte) -117, var16, var14);
        while (var7 < var8) {
            var10 += 2;
            var17 += var10;
            var12 += 2;
            if (var17 >= 0 && var15 >= 1) {
                class225.field3536[var15] = var7;
                var15--;
                var17 -= var15 << 1;
            }
            var7++;
            var9 += var12;
            if (var9 >= 0) {
                var8--;
                if (var8 >= var11) {
                    int[] var18 = class232.field3629[arg0 + var8];
                    int[] var19 = class232.field3629[arg0 - var8];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class309.method2096(arg1, var20, (byte) -117, var18, var21);
                    class309.method2096(arg1, var20, (byte) -117, var19, var21);
                } else {
                    int[] var22 = class232.field3629[arg0 - var8];
                    int[] var23 = class232.field3629[arg0 + var8];
                    int var24 = class225.field3536[var8];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class309.method2096(arg1, var28, (byte) -117, var23, var26);
                    class309.method2096(arg6, var27, (byte) -117, var23, var28);
                    class309.method2096(arg1, var25, (byte) -117, var23, var27);
                    class309.method2096(arg1, var28, (byte) -117, var22, var26);
                    class309.method2096(arg6, var27, (byte) -117, var22, var28);
                    class309.method2096(arg1, var25, (byte) -117, var22, var27);
                }
                var9 -= var8 << 1;
            }
            int[] var29 = class232.field3629[arg0 + var7];
            int var30 = arg3 + var8;
            int[] var31 = class232.field3629[arg0 - var7];
            int var32 = arg3 - var8;
            if (var7 < var11) {
                int var33 = var15 < var7 ? class225.field3536[var7] : var15;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class309.method2096(arg1, var35, (byte) -117, var29, var32);
                class309.method2096(arg6, var34, (byte) -117, var29, var35);
                class309.method2096(arg1, var30, (byte) -117, var29, var34);
                class309.method2096(arg1, var35, (byte) -117, var31, var32);
                class309.method2096(arg6, var34, (byte) -117, var31, var35);
                class309.method2096(arg1, var30, (byte) -117, var31, var34);
            } else {
                class309.method2096(arg1, var30, (byte) -117, var29, var32);
                class309.method2096(arg1, var30, (byte) -117, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V")
    public static final void method1450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= class34.field561 && class148.field2371 >= arg0) {
            int var5 = class268.method1789(class191.field3112, 9, arg4, class52.field766);
            int var6 = class268.method1789(class191.field3112, -79, arg2, class52.field766);
            class33.method246(var6, arg0, 1, var5, arg3);
        }
        field3353++;
        if (arg1 <= 107) {
            field3358 = -55;
        }
    }
}
