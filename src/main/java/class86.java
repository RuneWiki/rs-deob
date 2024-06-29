import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class86 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[F")
    public static float[] field1202 = new float[4];

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Lwm;")
    public static class152 field1211 = class157.method1048("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", 112);

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1212 = 1;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lwm;")
    private static class152 field1208 = class157.method1048("Examine", 111);

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lwm;")
    public static class152 field1204 = field1208;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Z")
    public static boolean field1207 = false;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lwm;")
    public static class152 field1214 = class157.method1048("(Z", 108);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[[[I")
    public static int[][][] field1213;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 7)
    public static final void method560(byte arg0) {
        if (arg0 != 10) {
            field1202 = (float[]) null;
        }
        field1209++;
        class26.field450 = class23.method189(true, 8, 4, 2048, 0.4F, 8, 35, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 41)
    public static final void method562(int arg0) {
        field1210++;
        if (arg0 >= -72) {
            field1205 = 55;
        }
        if (class141.field2156 == 0) {
            return;
        }
        try {
            if ((++class12.field155) > 2000) {
                if (class265.field4477 != null) {
                    class265.field4477.method1239((byte) -104);
                    class265.field4477 = null;
                }
                if (class201.field3243 >= 1) {
                    class141.field2156 = 0;
                    class28.field477 = -5;
                    return;
                }
                if (field1205 == class203.field3289) {
                    field1205 = class100.field1461;
                } else {
                    field1205 = class203.field3289;
                }
                class201.field3243++;
                class12.field155 = 0;
                class141.field2156 = 1;
            }
            if (class141.field2156 == 1) {
                class11.field142 = class34.field572.method962(field1205, class25.field425, (byte) -71);
                class141.field2156 = 2;
            }
            if (class141.field2156 == 2) {
                if (class11.field142.field2980 == 2) {
                    throw new IOException();
                }
                if (class11.field142.field2980 != 1) {
                    return;
                }
                class265.field4477 = new class186((Socket) class11.field142.field2977, class34.field572);
                class11.field142 = null;
                class265.field4477.method1237(true, 0, class245.field4102.field4946, class245.field4102.field4950);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(-3091);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(-3091);
                }
                int var1 = class265.field4477.method1235(-124);
                if (class270.field4629 != null) {
                    class270.field4629.method1676(-3091);
                }
                if (class224.field3646 != null) {
                    class224.field3646.method1676(-3091);
                }
                if (var1 != 21) {
                    class141.field2156 = 0;
                    class28.field477 = var1;
                    class265.field4477.method1239((byte) -67);
                    class265.field4477 = null;
                    return;
                }
                class141.field2156 = 3;
            }
            if (class141.field2156 == 3) {
                if (class265.field4477.method1238(1) < 1) {
                    return;
                }
                class287.field4856 = new class152[class265.field4477.method1235(-99)];
                class141.field2156 = 4;
            }
            if (class141.field2156 == 4) {
                if (class265.field4477.method1238(1) < (class287.field4856.length * 8)) {
                    return;
                }
                class73.field1058.field4946 = 0;
                class265.field4477.method1240(class73.field1058.field4950, 0, class287.field4856.length * 8, 125);
                for (int var2 = 0; var2 < class287.field4856.length; var2++) {
                    class287.field4856[var2] = class160.method1077(-124, class73.field1058.method1968(114));
                }
                class28.field477 = 21;
                class141.field2156 = 0;
                class265.field4477.method1239((byte) -70);
                class265.field4477 = null;
                return;
            }
        } catch (IOException var4) {
            if (class265.field4477 != null) {
                class265.field4477.method1239((byte) -93);
                class265.field4477 = null;
            }
            if (class201.field3243 < 1) {
                class141.field2156 = 1;
                class201.field3243++;
                if (field1205 == class203.field3289) {
                    field1205 = class100.field1461;
                } else {
                    field1205 = class203.field3289;
                }
                class12.field155 = 0;
            } else {
                class141.field2156 = 0;
                class28.field477 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 203)
    public static void method564(int arg0) {
        field1211 = null;
        field1202 = null;
        int var1 = -59 / ((arg0 - 34) / 43);
        field1208 = null;
        field1213 = (int[][][]) null;
        field1214 = null;
        field1204 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILah;II)Z", line = 227)
    public static final boolean method566(int arg0, class205 arg1, int arg2, int arg3) {
        field1203++;
        byte[] var4 = arg1.method1381(arg0, arg2, 0);
        if (var4 == null) {
            return false;
        } else {
            class50.method350(var4, (byte) 125);
            return arg3 == 1 ? true : true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V", line = 251)
    public static final void method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1206++;
        int var6 = 0;
        int var7 = arg3 * arg3;
        int var8 = arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = arg3 << 1;
        int var12 = var7 << 1;
        int var13 = (1 - var11) * var9 + var12;
        int var14 = var9 << 2;
        if (arg1 < 54) {
            method567(22, 56, 19, 28, -101, -19);
        }
        int var15 = var7 - (var11 - 1) * var10;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        int var18 = ((arg3 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var14;
        if (arg2 >= class157.field2505 && class110.field1553 >= arg2) {
            int var21 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg0 + arg4);
            int var22 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg0 - arg4);
            class275.method1885(arg5, class179.field2843[arg2], var22, var21, -2611);
        }
        while (var8 > 0) {
            var8--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var15 += var19;
                    var19 += var16;
                }
            }
            if (var15 < 0) {
                var13 += var17;
                var6++;
                var17 += var16;
                var15 += var19;
                var19 += var16;
            }
            int var23 = arg2 + var8;
            int var24 = arg2 - var8;
            var15 += -var18;
            if (class157.field2505 <= var23 && var24 <= class110.field1553) {
                int var25 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg0 + var6);
                int var26 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg0 - var6);
                if (var24 >= class157.field2505) {
                    class275.method1885(arg5, class179.field2843[var24], var26, var25, -2611);
                }
                if (var23 <= class110.field1553) {
                    class275.method1885(arg5, class179.field2843[var23], var26, var25, -2611);
                }
            }
            var18 -= var14;
            var13 += -var20;
            var20 -= var14;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method561(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
    public abstract int method563(int arg0);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method565(Component arg0, boolean arg1);
}
