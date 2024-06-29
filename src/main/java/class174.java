import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class174 extends class287 {

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Ltl;")
    private static class59 field2849 = class85.method639("Started 3d Library", 9588);

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Ltl;")
    public static class59 field2859 = class85.method639("(R", 9588);

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Ltl;")
    public static class59 field2850 = field2849;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Leh;")
    public static class94 field2857;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILtl;)V", line = 5)
    public static final void method1279(int arg0, class59 arg1) {
        field2853++;
        if (class280.field4793 >= 2) {
            if (arg1.method472(class249.field4147, 90)) {
                class86.method648(-120);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class288.method2003((class59) null, 0, arg0 - 121, class233.method1630(new class59[] { class155.field2541, class81.method619((byte) -92, var4), class101.field1643 }, -2883));
            }
            if (class55.field815 && arg1.method472(class28.field371, 90)) {
                System.out.println("oncard_geometry:" + class104.field1710);
                System.out.println("oncard_2d:" + class104.field1714);
                System.out.println("oncard_texture:" + class104.field1711);
            }
            if (arg1.method472(class21.field287, 90)) {
                class86.method650(-116);
            }
            if (arg1.method472(class64.field986, 90)) {
                class289.field4961.method732((byte) 94);
            }
            if (arg1.method472(class121.field2013, arg0 + 90)) {
                class289.field4961.method730(true);
            }
            if (arg1.method472(class303.field5161, arg0 ^ 0x5A)) {
                class308.field5222.method1285((byte) -9);
                class21.field284.method1260(16711680);
                class289.field4961.method740(65);
            }
            if (arg1.method472(class295.field5057, 90)) {
                class105.field1766 = true;
            }
            if (arg1.method472(class101.field1650, arg0 + 90)) {
                class286.method1996(30143, 25);
            }
            if (arg1.method472(class202.field3347, arg0 + 90)) {
                class222.field3592 = true;
            }
            if (arg1.method472(class145.field2381, arg0 + 90)) {
                class222.field3592 = false;
            }
            if (arg1.method472(class84.field1314, 90)) {
                class289.method2007((byte) -103, 0, false, -1, -1);
            }
            if (arg1.method472(class45.field733, 90)) {
                class289.method2007((byte) -92, 1, false, -1, -1);
            }
            if (arg1.method472(class163.field2661, 90)) {
                class289.method2007((byte) -119, 2, false, -1, -1);
            }
            if (arg1.method472(class114.field1876, 90)) {
                class289.method2007((byte) -126, 3, false, 1024, 768);
            }
            if (arg1.method472(class213.field3484, 90)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class41.field612[var5].field409[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method500(class218.field3545, (byte) 123) && class268.field4661 != 0) {
                class39.method257(arg1.method497(6, (byte) 60).method485(arg0 + 83), (byte) 96);
            }
            if (arg1.method472(class312.field5296, arg0 + 90) && class268.field4661 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method500(class150.field2473, (byte) 125)) {
                class176.field2888 = arg1.method497(12, (byte) 60).method452(arg0 + 255).method485(126);
                class288.method2003((class59) null, 0, -128, class233.method1630(new class59[] { class234.field3895, class81.method619((byte) -100, class176.field2888) }, arg0 ^ -2883));
            }
            if (arg1.method472(class86.field1353, 90)) {
                class39.field592 = true;
            }
        }
        class281.field4840++;
        class234.field3888.method1768(true, 209);
        if (arg0 != 0) {
            field2857 = (class94) null;
        }
        class234.field3888.method1219(arg1.method495(-118) - 1, true);
        class234.field3888.method1236((byte) 48, arg1.method497(2, (byte) 60));
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 159)
    public static final void method1280(int arg0, int arg1) {
        field2855++;
        if (arg1 <= -3) {
            class186 var2 = class67.method561(32, arg0, 6);
            var2.method1381(true);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[F", line = 173)
    public static final float[] method1281(int arg0, int arg1) {
        field2854++;
        float var2 = class141.method1028() + class141.method1032();
        int var3 = class141.method1027();
        float var4 = (float) (var3 & 0xFF) / 255.0F;
        float var5 = 0.58823526F;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = (float) ((var3 & 0xFFA86E) >> 16) / 255.0F;
        class190.field3177[0] = (float) (class93.method680(arg1, 16715264) >> 16) / 255.0F * var7 * var5 * var2;
        if (arg0 != 8) {
            field2859 = (class59) null;
        }
        class190.field3177[1] = var5 * var6 * ((float) class93.method680(255, arg1 >> 8) / 255.0F) * var2;
        class190.field3177[2] = (float) class93.method680(arg1, 255) / 255.0F * var4 * var5 * var2;
        class190.field3177[3] = 1.0F;
        return class190.field3177;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 202)
    public static void method1282(boolean arg0) {
        if (arg0) {
            field2857 = null;
            field2850 = null;
            field2859 = null;
            field2849 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[III)V", line = 233)
    public static final void method1283(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field2856++;
        arg3--;
        int var8 = arg4 - 1;
        int var5 = var8 - arg0;
        while (arg3 < var5) {
            int var6 = arg3 + 1;
            arg2[var6] = arg1;
            int var7 = var6 + 1;
            arg2[var7] = arg1;
            int var9 = var7 + 1;
            arg2[var9] = arg1;
            int var10 = var9 + 1;
            arg2[var10] = arg1;
            int var11 = var10 + 1;
            arg2[var11] = arg1;
            int var12 = var11 + 1;
            arg2[var12] = arg1;
            int var13 = var12 + 1;
            arg2[var13] = arg1;
            arg3 = var13 + 1;
            arg2[arg3] = arg1;
        }
        while (arg3 < var8) {
            arg3++;
            arg2[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ls;IIIZIIII)V", line = 259)
    public static final void method1284(class170 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 >= 0 && arg3 < 104 && arg6 >= 0 && arg6 < 104) {
            if (!arg4) {
                class308.field5219[arg2][arg3][arg6] = 0;
            }
            while (true) {
                int var9 = arg0.method1221(89);
                if (var9 == 0) {
                    if (arg4) {
                        class97.field1558[0][arg3][arg6] = class239.field3993[0][arg3][arg6];
                    } else if (arg2 == 0) {
                        class97.field1558[0][arg3][arg6] = -class30.method192(arg8 + 18763, arg6 + 556238 + arg1, arg5 + arg3 + 932731) * 8;
                    } else {
                        class97.field1558[arg2][arg3][arg6] = class97.field1558[arg2 - 1][arg3][arg6] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg0.method1221(arg8 + 25232);
                    if (arg4) {
                        class97.field1558[0][arg3][arg6] = var10 * 8 + class239.field3993[0][arg3][arg6];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg2 == 0) {
                            class97.field1558[0][arg3][arg6] = -var10 * 8;
                        } else {
                            class97.field1558[arg2][arg3][arg6] = class97.field1558[arg2 - 1][arg3][arg6] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class94.field1467[arg2][arg3][arg6] = arg0.method1205(-1);
                    class230.field3780[arg2][arg3][arg6] = (byte) ((var9 - 2) / 4);
                    class78.field1250[arg2][arg3][arg6] = (byte) class93.method680(3, var9 + arg7 - 2);
                } else if (var9 > 81) {
                    class123.field2027[arg2][arg3][arg6] = (byte) (var9 - 81);
                } else if (!arg4) {
                    class308.field5219[arg2][arg3][arg6] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg0.method1221(91);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg0.method1221(102);
                    break;
                }
                if (var11 <= 49) {
                    arg0.method1221(126);
                }
            }
        }
        if (arg8 != -25150) {
            method1280(59, -101);
        }
        field2852++;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 374)
    public class174() {
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(I)V", line = 376)
    public class174(int arg0) {
        this.field2851 = arg0;
    }
}
