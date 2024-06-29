import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class487 {

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lwf;")
    private class117 field6921 = new class117(128);

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lkda;")
    private class328 field6918;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Llb;")
    public static class465 field6920 = new class465(32);

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "F")
    public static float field6925;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Z")
    public static boolean field6924;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lmi;")
    public final class424 method2914(int arg0, int arg1) {
        field6919++;
        class117 var3 = this.field6921;
        class424 var4;
        synchronized (this.field6921) {
            var4 = (class424) this.field6921.method842(0, (long) arg1);
        }
        if (arg0 != -1996488705) {
            this.field6918 = null;
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6918.method1966(class304.method1863(arg1, (byte) -110), class521.method3078(arg1, -5165), true);
        class424 var6 = new class424();
        if (var5 != null) {
            var6.method2496(new class148(var5), (byte) 57);
        }
        class117 var7 = this.field6921;
        synchronized (this.field6921) {
            this.field6921.method835((byte) 119, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method2915(byte arg0) {
        field6920 = null;
        if (arg0 <= 82) {
            method2921(90, -56, -97, -57, null, 71);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I")
    public static final int method2916(int arg0, int arg1) {
        return class557.field8282 == null ? 0 : class557.field8282[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIB)I")
    public static final int method2917(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6916++;
        int var5 = arg2 & 0xF;
        if (arg4 == 90) {
            int var6 = var5 < 8 ? arg0 : arg3;
            int var7 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg0 : arg1);
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } else {
            return -24;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public static final void method2918(byte arg0) {
        class391.field5388.method671(29831);
        field6917++;
        class437.field5844.method1631((byte) -111);
        class194.field2879.method3642(true);
        class216.field3172.method1504(0);
        class64.field797.method1180(true);
        class150.field2242.method3595(false);
        class463.field6521.method2977((byte) -7);
        class59.field742.method856(-52);
        class32.field393.method2264((byte) 57);
        class110.field1564.method2300((byte) 98);
        class105.field1514.method924(false);
        int var1 = 99 % ((-arg0 - 17) / 47);
        class599.field8839.method543(120);
        class440.field5876.method3064(true);
        class86.field1226.method2168((byte) 109);
        class516.field7358.method1275(-25687);
        class97.field1414.method3018(8929);
        class351.field4786.method3614(-76);
        class116.field1639.method811(-29550);
        class583.field8559.method3568((byte) -31);
        class47.field560.method900((byte) -125);
        class397.method2355((byte) -120);
        class357.method2153(1000);
        class517.method3060(-1133);
        class183.method1276(-2);
        class647.field9397.method846(0);
        class1.field1.method846(0);
        class333.field4607.method846(0);
        class398.field5471.method846(0);
        class98.field1442.method846(0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method2919(byte arg0, int arg1) {
        field6923++;
        int var2 = -101 / ((25 - arg0) / 60);
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFFEE) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)Lvo;")
    public static final class38 method2920(boolean arg0, int arg1, int arg2) {
        if (arg1 != 13993) {
            method2915((byte) 43);
        }
        field6926++;
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
        return (class38) field6920.method2799(var3, true);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class487(class39 arg0, int arg1, class328 arg2) {
        this.field6918 = arg2;
        if (this.field6918 != null) {
            int var4 = this.field6918.method1974(-8588) - 1;
            this.field6918.method1975(49, var4);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILqa;I)V")
    public static final void method2921(int arg0, int arg1, int arg2, int arg3, class208 arg4, int arg5) {
        arg4.method510(arg5, arg1, arg3 + arg5, arg0 + arg1);
        field6922++;
        arg4.method1378(true, arg5, -16777216, arg3, arg0, arg1);
        if (class624.field9190 < 100) {
            return;
        }
        float var6 = (float) class339.field4682 / (float) class339.field4690;
        int var7 = arg3;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg3 - var7) / 2 + arg5;
        int var10 = (arg0 - var8) / 2 + arg1;
        if (class224.field3246 == null || class224.field3246.method325() != arg3 || class224.field3246.method318() != arg0) {
            class339.method2076(class339.field4685, class339.field4696 + class339.field4682, class339.field4685 - -class339.field4690, class339.field4696, var9, var10, var7 + var9, var8 + var10);
            class339.method2069(arg4);
            class224.field3246 = arg4.method442(var9, var10, var7, var8, false);
        }
        class224.field3246.method316(var9, var10);
        int var11 = class322.field4444 * var7 / class339.field4690;
        int var12 = class291.field4026 * var8 / class339.field4682;
        int var13 = class537.field8007 * var7 / class339.field4690 + var9;
        int var14 = var8 + var10 - var12 - (class224.field3242 * var8 / class339.field4682);
        int var15 = -1996554240;
        if (class348.field4768 == class143.field2006) {
            var15 = -1996488705;
        }
        if (arg2 <= 123) {
            method2916(113, -11);
        }
        arg4.method498(var13, var14, var11, var12, var15, 1);
        arg4.method445(var13, var14, var11, var12, var15, 0);
        if (class572.field8429 <= 0) {
            return;
        }
        int var16;
        if (class276.field3881 > 50) {
            var16 = (100 - class276.field3881) * 5;
        } else {
            var16 = class276.field3881 * 5;
        }
        for (class101 var17 = (class101) class339.field4681.method124((byte) 42); var17 != null; var17 = (class101) class339.field4681.method120(-112)) {
            class308 var18 = class339.field4665.method3058(var17.field1463, 0);
            if (class234.method1506(8, var18)) {
                if (class90.field1352 == var17.field1463) {
                    int var21 = var17.field1470 * var7 / class339.field4690 + var9;
                    int var22 = var10 + ((class339.field4682 - var17.field1465) * var8 / class339.field4682);
                    arg4.method1378(true, var21 - 2, var16 << 24 | 0xFFFF00, 4, 4, var22 - 2);
                } else if (class383.field5268 != -1 && class383.field5268 == var18.field4246) {
                    int var19 = var17.field1470 * var7 / class339.field4690 + var9;
                    int var20 = (class339.field4682 - var17.field1465) * var8 / class339.field4682 + var10;
                    arg4.method1378(true, var19 - 2, var16 << 24 | 0xFFFF00, 4, 4, var20 - 2);
                }
            }
        }
    }
}
