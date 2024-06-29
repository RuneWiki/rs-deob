import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class273 {

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field4095 = 0;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field4094 = -1;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Z")
    public static final boolean method1780(int arg0) {
        field4093++;
        return class577.field8380 == arg0 ? class114.field2046.method221((byte) -3) : true;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)Lju;")
    public static final class111 method1781(int arg0, boolean arg1) {
        field4092++;
        class111[] var2 = class468.method2796(-29479);
        int var3 = 0;
        if (arg1) {
            field4095 = -125;
        }
        while (var2.length > var3) {
            class111 var4 = var2[var3];
            if (var4.field2008 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public static final void method1782(int arg0) {
        class694.method3889(10432, false);
        field4097++;
        class346.field5164 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class408.field5904.length; var2++) {
            if (class607.field8843[var2] != -1 && class408.field5904[var2] == null) {
                class408.field5904[var2] = class13.field722.method2216(class607.field8843[var2], 0, true);
                if (class408.field5904[var2] == null) {
                    var1 = false;
                    class346.field5164++;
                }
            }
            if (class251.field3744[var2] != -1 && class81.field1589[var2] == null) {
                class81.field1589[var2] = class13.field722.method2210(class253.field3756[var2], 0, class251.field3744[var2], 37);
                if (class81.field1589[var2] == null) {
                    class346.field5164++;
                    var1 = false;
                }
            }
            if (class118.field2100[var2] != -1 && class221.field3340[var2] == null) {
                class221.field3340[var2] = class13.field722.method2216(class118.field2100[var2], 0, true);
                if (class221.field3340[var2] == null) {
                    class346.field5164++;
                    var1 = false;
                }
            }
            if (class600.field8603[var2] != -1 && class520.field7366[var2] == null) {
                class520.field7366[var2] = class13.field722.method2216(class600.field8603[var2], 0, true);
                if (class520.field7366[var2] == null) {
                    var1 = false;
                    class346.field5164++;
                }
            }
            if (class213.field3252 != null && class304.field4509[var2] == null && class213.field3252[var2] != -1) {
                class304.field4509[var2] = class13.field722.method2210(class253.field3756[var2], 0, class213.field3252[var2], -92);
                if (class304.field4509[var2] == null) {
                    class346.field5164++;
                    var1 = false;
                }
            }
        }
        if (class696.field9803 == null) {
            if (class356.field5319 == null || !class613.field8924.method2226(class356.field5319.field7876 + "_staticelements", (byte) 21)) {
                class696.field9803 = new class193(0);
            } else if (class613.field8924.method2232(1, class356.field5319.field7876 + "_staticelements")) {
                class696.field9803 = class115.method1020(class356.field5319.field7876 + "_staticelements", class613.field8924, class294.field4411, (byte) 19);
            } else {
                var1 = false;
                class346.field5164++;
            }
        }
        if (!var1) {
            class269.field4005 = 1;
            return;
        }
        boolean var3 = true;
        class363.field5387 = 0;
        for (int var4 = 0; var4 < class408.field5904.length; var4++) {
            byte[] var21 = class81.field1589[var4];
            if (var21 != null) {
                int var22 = (class335.field5019[var4] >> 8) * 64 - class33.field967;
                int var23 = (class335.field5019[var4] & 0xFF) * 64 - class323.field4749;
                if (class470.field6673 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class471.method2826(3695, class675.field9604, var23, var22, var21, class218.field3316);
            }
            byte[] var24 = class520.field7366[var4];
            if (var24 != null) {
                int var25 = (class335.field5019[var4] >> 8) * 64 - class33.field967;
                int var26 = (class335.field5019[var4] & 0xFF) * 64 - class323.field4749;
                if (class470.field6673 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class471.method2826(3695, class675.field9604, var26, var25, var24, class218.field3316);
            }
        }
        if (!var3) {
            class269.field4005 = 2;
            return;
        }
        if (class269.field4005 != 0) {
            class341.method2191(class623.field9017, class265.field3887.method1733(255, class140.field2466) + "<br>(100%)", true, class363.field5394, class612.field8916, (byte) -122);
        }
        class418.method2539(false);
        class432.method2627(255);
        boolean var5 = false;
        if (class623.field9017.method31() && class527.field7429.field2643) {
            for (int var6 = 0; var6 < class408.field5904.length; var6++) {
                if (class520.field7366[var6] != null || class221.field3340[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class527.field7429.field2626) {
            var7 = class248.field3727[class50.field1186];
        } else {
            var7 = class459.field6561[class50.field1186];
        }
        if (class623.field9017.method74()) {
            var7++;
        }
        class463.method2769(class623.field9017, class474.field6723, 9, 4, class675.field9604, class218.field3316, var7, var5, class623.field9017.method151() > 0);
        if (class536.field7505) {
            class623.method3553(class542.field7569);
        } else {
            class623.method3553(null);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class223.field3352[var8].method3480((byte) 75);
        }
        class635.method3625(arg0 - 53);
        class393.method2428((byte) 47, false);
        class223.method1531(0);
        class2.field378 = null;
        class612.field8902 = false;
        class418.method2539(false);
        System.gc();
        class694.method3889(10432, true);
        class578.method3319(arg0 + 121);
        class108.field1863 = class527.field7429.method1211(class90.field1654, (byte) 36);
        class620.field8976 = class527.field7429.field2643;
        class318.field4689 = class681.field9649 >= 96;
        class460.field6567 = class527.field7429.method1204((byte) 121, class90.field1654);
        class571.field8300 = !class527.field7429.field2625;
        class181.field2929 = class527.field7429.method2824(-1, class90.field1654) ? -1 : class432.field6242;
        class314.field4645 = class388.method2395((byte) -89, class90.field1654) || class527.field7429.field2662;
        class44.field1099 = class527.field7429.field2656;
        class691.field9754 = new class669(4, class675.field9604, class218.field3316, false);
        if (class470.field6673 == 0) {
            class423.method2578(false, class408.field5904, class691.field9754);
        } else {
            class148.method1175(true, class408.field5904, class691.field9754);
        }
        class75.method808(17393, class675.field9604 >> 4, class218.field3316 >> 4);
        class562.method3261((byte) -125);
        if (var5) {
            class532.method3091(true);
            class499.field7112 = new class669(1, class675.field9604, class218.field3316, true);
            if (class470.field6673 == 0) {
                class423.method2578(false, class221.field3340, class499.field7112);
                class694.method3889(10432, true);
            } else {
                class148.method1175(true, class221.field3340, class499.field7112);
                class694.method3889(10432, true);
            }
            class499.field7112.method1074(0, class691.field9754.field2264[0], arg0 + 128);
            class499.field7112.method1081(null, 39, null, class623.field9017);
            class532.method3091(false);
        }
        class691.field9754.method1081(class223.field3352, -92, var5 ? class499.field7112.field2264 : null, class623.field9017);
        if (class470.field6673 == 0) {
            class694.method3889(10432, true);
            class170.method1287(-23170, class81.field1589, class691.field9754);
            if (class304.field4509 != null) {
                class492.method2954(arg0 + 22366);
            }
        } else {
            class694.method3889(10432, true);
            class511.method3017(class691.field9754, class81.field1589, 8);
        }
        class432.method2627(arg0 ^ 0xFFFFFF00);
        if (class681.field9649 < 96) {
            class177.method1319((byte) 125);
        }
        class694.method3889(10432, true);
        class691.field9754.method1072(var5 ? class697.field9813[0] : null, null, class623.field9017, 4523);
        class691.field9754.method3787(class623.field9017, false, (byte) -79);
        class694.method3889(10432, true);
        if (var5) {
            class532.method3091(true);
            class694.method3889(arg0 ^ 0xFFFFD73F, true);
            if (class470.field6673 == 0) {
                class170.method1287(-23170, class520.field7366, class499.field7112);
            } else {
                class511.method3017(class499.field7112, class520.field7366, 8);
            }
            class432.method2627(arg0 + 256);
            class694.method3889(10432, true);
            class499.field7112.method1072(null, class185.field2987[0], class623.field9017, arg0 + 4524);
            class499.field7112.method3787(class623.field9017, true, (byte) -80);
            class694.method3889(10432, true);
            class532.method3091(false);
        }
        class434.method2635(5801);
        int var9 = class691.field9754.field9567;
        if (class37.field1046 < var9) {
            var9 = class37.field1046;
        }
        if (class37.field1046 - 1 > var9) {
            var9 = class37.field1046 - 1;
        }
        if (class527.field7429.method2824(arg0, class90.field1654)) {
            class566.method3274(0);
        } else {
            class566.method3274(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class675.field9604; var19++) {
                for (int var20 = 0; var20 < class218.field3316; var20++) {
                    class631.method3606(var20, (byte) 0, var19, var10);
                }
            }
        }
        class265.method1735(arg0 + 120);
        class418.method2539(false);
        class159.method1234(arg0 + 1);
        class432.method2627(255);
        class435.method2640(-123);
        if (class112.field2017 != null && class165.field2755 != null && class199.field3098 == 11) {
            class369.field5475++;
            class275 var11 = class185.method1355(0, class557.field7893, class395.field5772);
            var11.field4103.method715(1057001181, 1949991176);
            class140.method1141(var11, 19321);
        }
        if (class470.field6673 == 0) {
            int var12 = (class287.field4278 - (class675.field9604 >> 4)) / 8;
            int var13 = ((class675.field9604 >> 4) + class287.field4278) / 8;
            int var14 = (class32.field961 - (class218.field3316 >> 4)) / 8;
            int var15 = ((class218.field3316 >> 4) + class32.field961) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var16 > var13 || var14 > var17 || var17 > var15) {
                        class13.field722.method2222(arg0, "m" + var16 + "_" + var17);
                        class13.field722.method2222(arg0, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class199.field3098 == 4) {
            class118.method1038(3, arg0 + 2);
        } else if (class199.field3098 == 8) {
            class118.method1038(7, arg0 + 2);
        } else {
            class118.method1038(10, 1);
            if (class165.field2755 != null) {
                class275 var18 = class185.method1355(0, class343.field5103, class395.field5772);
                class140.method1141(var18, 19321);
            }
        }
        class253.method1687(0);
        class418.method2539(false);
        class438.method2652(true);
        if (class530.field7446) {
            class686.method3857("Took: " + (class525.method3074((byte) -101) - class509.field7226) + "ms", 83);
            class530.field7446 = false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Z")
    public static final boolean method1783(int arg0, int arg1) {
        field4096++;
        if (arg1 != 0) {
            field4095 = -94;
        }
        return arg0 == 0;
    }
}
