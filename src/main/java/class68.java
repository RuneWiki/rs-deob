import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class68 extends class324 {

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1087 = -1;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Z")
    public static boolean field1094 = false;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1095 = "";

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Lik;")
    public static class259 field1092 = new class259(260);

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "Lj;")
    public static class285 field1096 = new class285(64);

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Z", line = 14)
    public static final boolean method513(int arg0, int arg1, int arg2) {
        int var3 = class324.field5027[arg0][arg1][arg2];
        if (-class94.field1531 == var3) {
            return false;
        } else if (class94.field1531 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class2.method4(var4 + 1, class29.field475[arg0][arg1][arg2], var5 + 1) && class2.method4(var4 + 128 - 1, class29.field475[arg0][arg1 + 1][arg2], var5 + 1) && class2.method4(var4 + 128 - 1, class29.field475[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class2.method4(var4 + 1, class29.field475[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class324.field5027[arg0][arg1][arg2] = class94.field1531;
                return true;
            } else {
                class324.field5027[arg0][arg1][arg2] = -class94.field1531;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 53)
    public static void method514(int arg0) {
        if (arg0 < 115) {
            method515(17, -17, -69, 91, true);
        }
        field1095 = null;
        field1096 = null;
        field1092 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIZ)V", line = 64)
    public static final void method515(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class323.field5009 = arg1;
        class196.field3122 = arg2;
        class258.field4008 = arg3;
        class157.field2500 = new class272[arg0][class323.field5009][class196.field3122];
        class298.field4701 = new int[arg0][class323.field5009 + 1][class196.field3122 + 1];
        if (class265.field4126) {
            class251.field3864 = new class186[4][];
        }
        if (arg4) {
            class115.field1885 = new class272[1][class323.field5009][class196.field3122];
            class128.field2046 = new int[class323.field5009][class196.field3122];
            class150.field2404 = new int[1][class323.field5009 + 1][class196.field3122 + 1];
            if (class265.field4126) {
                class236.field3706 = new class186[1][];
            }
        } else {
            class115.field1885 = (class272[][][]) null;
            class128.field2046 = (int[][]) null;
            class150.field2404 = (int[][][]) null;
            class236.field3706 = (class186[][]) null;
        }
        class151.method1155(false);
        class311.field4891 = new class94[500];
        class159.field2508 = 0;
        class236.field3716 = new class94[500];
        class294.field4638 = 0;
        class324.field5027 = new int[arg0][class323.field5009 + 1][class196.field3122 + 1];
        class63.field979 = new class45[5000];
        class104.field1764 = 0;
        class248.field3840 = new class45[100];
        class87.field1329 = new boolean[class258.field4008 + class258.field4008 + 1][class258.field4008 + class258.field4008 + 1];
        class249.field3843 = new boolean[class258.field4008 + class258.field4008 + 2][class258.field4008 + class258.field4008 + 2];
        class75.field1152 = new byte[arg0][class323.field5009][class196.field3122];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lob;IIIB)V", line = 111)
    public static final void method516(class292 arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -19) {
            method513(-4, -60, -103);
        }
        if (class265.field4126) {
            class262.method1865(arg2, arg1, arg2 + arg0.field4608, arg0.field4499 + arg1);
        }
        if (class17.field331 >= 3) {
            if (class265.field4126) {
                class126 var5 = arg0.method2056((byte) -59, false);
                if (var5 != null) {
                    var5.method59(arg2, arg1);
                }
            } else {
                class182.method1355(arg2, arg1, 0, arg0.field4597, arg0.field4459);
            }
        } else if (class265.field4126) {
            ((class105) class93.field1527).method814(arg2, arg1, arg0.field4608, arg0.field4499, class93.field1527.field2007 / 2, class93.field1527.field2011 / 2, class248.field3833, 256, (class105) arg0.method2056((byte) -59, false));
        } else {
            ((class7) class93.field1527).method39(arg2, arg1, arg0.field4608, arg0.field4499, class93.field1527.field2007 / 2, class93.field1527.field2011 / 2, class248.field3833, 256, arg0.field4597, arg0.field4459);
        }
        field1088++;
        class301.field4734[arg3] = true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBII)I", line = 155)
    public static final int method517(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field1086++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else if (arg1 == -3) {
            return 1023 - arg3;
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V", line = 180)
    public static final void method518(int arg0) {
        if (arg0 != 1) {
            method517(-82, (byte) -113, 33, 97);
        }
        field1093++;
        class92.field1514 = new class204();
    }
}
