import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class7 {

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Z")
    public static boolean field83 = false;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lna;")
    public static class26 field77 = class69.method505("leuchten2:", (byte) -117);

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[I")
    public static int[] field79 = new int[4096];

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "F")
    public static float field80;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lqf;")
    public static class148 field88;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lve;")
    public static class266 field81;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBLe;)V", line = 11)
    public static final void method43(int arg0, int arg1, byte arg2, class159 arg3) {
        if ((arg0 & 0x80) != 0) {
            int var4 = class300.field5157.method605(arg2 - 47);
            int var5 = class300.field5157.method642((byte) -54);
            int var6 = class300.field5157.method642((byte) -57);
            int var7 = class300.field5157.field1301;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg3.field2495 != null && arg3.field2484 != null) {
                long var9 = arg3.field2495.method209(-125);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (var8 || (!class88.field1454 || class17.field242) && !class292.field4863) {
                        for (int var12 = 0; var12 < class132.field2014; var12++) {
                            if (class85.field1394[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    } else {
                        var11 = true;
                    }
                }
                if (!var11 && class166.field2573 == 0) {
                    class154.field2404.field1301 = 0;
                    class300.field5157.method613(2, var6, class154.field2404.field1280, 0);
                    class154.field2404.field1301 = 0;
                    int var13 = -1;
                    class26 var15;
                    if (var8) {
                        class306 var14 = class53.method390(1024, class154.field2404);
                        var4 &= 0x7FFF;
                        var13 = var14.field5274;
                        var15 = var14.field5277.method1977(arg2 + 28100, class154.field2404);
                    } else {
                        var15 = class175.method1203(class223.method1487(class154.field2404, 29488).method167(78));
                    }
                    arg3.field3968 = var15.method195(1);
                    arg3.field3886 = var4 & 0xFF;
                    arg3.field3957 = 150;
                    arg3.field3981 = var4 >> 8;
                    if (var5 == 2) {
                        class250.method1718(var13, var8 ? 17 : 1, var15, (class26) null, (byte) 50, class236.method1587(new class26[] { class168.field2604, arg3.method1083(arg2 + 79) }, (byte) -116));
                    } else if (var5 == 1) {
                        class250.method1718(var13, var8 ? 17 : 1, var15, (class26) null, (byte) 50, class236.method1587(new class26[] { class223.field3529, arg3.method1083(0) }, (byte) -127));
                    } else {
                        class250.method1718(var13, var8 ? 17 : 2, var15, (class26) null, (byte) 50, arg3.method1083(0));
                    }
                }
            }
            class300.field5157.field1301 = var6 + var7;
        }
        if ((arg0 & 0x1) != 0) {
            int var16 = class300.field5157.method617(true);
            int var17 = class300.field5157.method590((byte) -99);
            arg3.method1660(var17, -8, class229.field3626, var16);
            arg3.field3918 = class229.field3626 + 300;
            arg3.field3912 = class300.field5157.method593(true);
        }
        field87++;
        if ((arg0 & 0x8) != 0) {
            int var18 = class300.field5157.method576(1);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class300.field5157.method642((byte) -112);
            class2.method11(0, var19, var18, arg3);
        }
        if ((arg0 & 0x4) != 0) {
            int var20 = class300.field5157.method590((byte) -118);
            byte[] var21 = new byte[var20];
            class82 var22 = new class82(var21);
            class300.field5157.method603(0, var20, var21, (byte) 93);
            class64.field1018[arg1] = var22;
            arg3.method1080(-15, var22);
        }
        if ((arg0 & 0x2) != 0) {
            arg3.field3909 = class300.field5157.method597(-114);
            if (arg3.field3909 == 65535) {
                arg3.field3909 = -1;
            }
        }
        if ((arg0 & 0x400) != 0) {
            arg3.field3921 = class300.field5157.method625(true);
            arg3.field3979 = class300.field5157.method642((byte) -24);
            arg3.field3966 = class300.field5157.method590((byte) -106);
            arg3.field3937 = class300.field5157.method642((byte) -37);
            arg3.field3940 = class300.field5157.method605(-90) + class229.field3626;
            arg3.field3927 = class300.field5157.method605(-99) + class229.field3626;
            arg3.field3984 = class300.field5157.method625(true);
            arg3.field3959 = 1;
            arg3.field3954 = 0;
        }
        if ((arg0 & 0x20) != 0) {
            arg3.field3968 = class300.field5157.method615(true);
            if (arg3.field3968.method200(0, (byte) -45) == 126) {
                arg3.field3968 = arg3.field3968.method187(1, (byte) -74);
                class214.method1420(arg3.method1083(0), 2, arg3.field3968, arg2 ^ 0x4E);
            } else if (class13.field221 == arg3) {
                class214.method1420(arg3.method1083(0), 2, arg3.field3968, arg2 + 78);
            }
            arg3.field3886 = 0;
            arg3.field3981 = 0;
            arg3.field3957 = 150;
        }
        if ((arg0 & 0x200) != 0) {
            int var23 = class300.field5157.method617(true);
            int var24 = class300.field5157.method593(true);
            arg3.method1660(var24, arg2 + 71, class229.field3626, var23);
        }
        if ((arg0 & 0x800) != 0) {
            int var25 = class300.field5157.method625(true);
            int[] var26 = new int[var25];
            int[] var27 = new int[var25];
            int[] var28 = new int[var25];
            for (int var29 = 0; var29 < var25; var29++) {
                int var30 = class300.field5157.method605(-101);
                if (var30 == 65535) {
                    var30 = -1;
                }
                var26[var29] = var30;
                var27[var29] = class300.field5157.method590((byte) 125);
                var28[var29] = class300.field5157.method576(class282.method1982(arg2, -80));
            }
            class199.method1336(var27, var26, arg3, (byte) -113, var28);
        }
        if ((arg0 & 0x100) != 0) {
            int var31 = class300.field5157.method605(-128);
            if (var31 == 65535) {
                var31 = -1;
            }
            int var32 = class300.field5157.method637((byte) -73);
            boolean var33 = true;
            if (var31 != -1 && arg3.field3986 != -1 && client.method1731(class236.method1582((byte) 42, var31).field5168, (byte) -20).field4060 < client.method1731(class236.method1582((byte) 42, arg3.field3986).field5168, (byte) -20).field4060) {
                var33 = false;
            }
            if (var33) {
                arg3.field3894 = (var32 & 0xFFFF) + class229.field3626;
                arg3.field3896 = 0;
                arg3.field3945 = 0;
                arg3.field3986 = var31;
                if (arg3.field3894 > class229.field3626) {
                    arg3.field3945 = -1;
                }
                arg3.field3939 = var32 >> 16;
                arg3.field3969 = 1;
                if (arg3.field3986 != -1 && class229.field3626 == arg3.field3894) {
                    int var34 = class236.method1582((byte) 42, arg3.field3986).field5168;
                    if (var34 != -1) {
                        class249 var35 = client.method1731(var34, (byte) -20);
                        if (var35 != null && var35.field4051 != null) {
                            class285.method2020(arg3.field3972, var35, 183921384, arg3.field3962, class13.field221 == arg3, 0);
                        }
                    }
                }
            }
        }
        if (arg2 == -79 && (arg0 & 0x40) != 0) {
            arg3.field3923 = class300.field5157.method576(1);
            arg3.field3898 = class300.field5157.method620((byte) -107);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 301)
    public static void method44(byte arg0) {
        field88 = null;
        field79 = null;
        field77 = null;
        if (arg0 <= 63) {
            method45((byte[]) null, -60);
        }
        field81 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BI)V", line = 318)
    public static final void method45(byte[] arg0, int arg1) {
        class82 var2 = new class82(arg0);
        var2.field1301 = arg0.length - 2;
        class313.field5350 = var2.method576(1);
        class98.field1596 = new int[class313.field5350];
        class141.field2149 = new int[class313.field5350];
        field89++;
        class58.field936 = new int[class313.field5350];
        class268.field4431 = new boolean[class313.field5350];
        class59.field961 = new byte[class313.field5350][];
        class82.field1281 = new int[class313.field5350];
        class205.field3203 = new byte[class313.field5350][];
        var2.field1301 = arg0.length - (class313.field5350 * 8) - 7;
        class88.field1445 = var2.method576(1);
        class37.field607 = var2.method576(1);
        int var3 = (var2.method642((byte) -43) & 0xFF) + 1;
        for (int var4 = 0; var4 < class313.field5350; var4++) {
            class58.field936[var4] = var2.method576(1);
        }
        if (arg1 < 11) {
            method44((byte) -52);
        }
        for (int var5 = 0; var5 < class313.field5350; var5++) {
            class82.field1281[var5] = var2.method576(1);
        }
        for (int var6 = 0; var6 < class313.field5350; var6++) {
            class141.field2149[var6] = var2.method576(1);
        }
        for (int var7 = 0; var7 < class313.field5350; var7++) {
            class98.field1596[var7] = var2.method576(1);
        }
        var2.field1301 = arg0.length + 3 - (class313.field5350 * 8) - (var3 * 3) - 7;
        class190.field2975 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class190.field2975[var8] = var2.method633((byte) 122);
            if (class190.field2975[var8] == 0) {
                class190.field2975[var8] = 1;
            }
        }
        var2.field1301 = 0;
        for (int var9 = 0; var9 < class313.field5350; var9++) {
            int var10 = class141.field2149[var9];
            int var11 = class98.field1596[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            class205.field3203[var9] = var13;
            byte[] var15 = new byte[var12];
            class59.field961[var9] = var15;
            int var16 = var2.method642((byte) -64);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method599(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var15[var23] = var2.method599(false);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label92;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var15[var10 * var20 + var19] = var2.method599(false);
                                var14 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var13[var10 * var18 + var17] = var2.method599(false);
                    }
                    var17++;
                }
            }
            class268.field4431[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 497)
    public static final void method46(byte arg0) {
        class245.field4017 = class61.method474(true, 14585, 8, 2048, 4, 0.4F, 8, 35);
        field78++;
        int var1 = -5 / ((arg0 - 45) / 59);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lrg;Lrg;B)V", line = 513)
    public static final void method47(class96 arg0, class96 arg1, byte arg2) {
        field82++;
        if (arg1.field1565 != null) {
            arg1.method722((byte) -107);
        }
        arg1.field1565 = arg0;
        arg1.field1575 = arg0.field1575;
        arg1.field1565.field1575 = arg1;
        if (arg2 <= 101) {
            field83 = true;
        }
        arg1.field1575.field1565 = arg1;
    }
}
