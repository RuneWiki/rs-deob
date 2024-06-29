import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class53 extends Canvas {

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field1093;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
    public static int[] field1089 = new int[8];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IJ)V", line = 3)
    public static final void method598(int arg0, long arg1) {
        field1095++;
        int var3 = class66.field1256 + class58.field1147.field5922;
        int var4 = class680.field9216 + class58.field1147.field5933;
        if (class162.field2584 - var3 < -2000 || (class162.field2584 - var3) > 2000 || class476.field6650 - var4 < -2000 || (class476.field6650 - var4) > 2000) {
            class476.field6650 = var4;
            class162.field2584 = var3;
        }
        if (class162.field2584 != var3) {
            int var5 = var3 - class162.field2584;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class162.field2584 += var6;
        }
        if (arg0 != -1) {
            return;
        }
        class451.field6366 += (float) arg1 * class201.field2912 / 6.0F;
        if (class476.field6650 != var4) {
            int var7 = var4 - class476.field6650;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class476.field6650 += var8;
        }
        class440.field6267 += (float) arg1 * class55.field1119 / 6.0F;
        class294.method1924(262144);
    }

    @OriginalMember(owner = "client!vg", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 91)
    public final void update(Graphics arg0) {
        field1090++;
        this.field1093.update(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 101)
    public static void method599(boolean arg0) {
        field1089 = null;
        if (arg0) {
            field1089 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIII)V", line = 111)
    public static final void method600(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -364570972) {
            field1099 = -4;
        }
        field1097++;
        long var6 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
        class6 var8 = (class6) class297.field4174.method1465(var6, -6008);
        if (var8 == null) {
            var8 = new class6();
            class297.field4174.method1468((byte) 109, var6, var8);
        }
        if (var8.field44.length <= arg3) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field44.length; var11++) {
                var9[var11] = var8.field44[var11];
                var10[var11] = var8.field45[var11];
            }
            for (int var12 = var8.field44.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field44 = var9;
            var8.field45 = var10;
        }
        var8.field44[arg3] = arg5;
        var8.field45[arg3] = arg4;
    }

    @OriginalMember(owner = "client!vg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 163)
    public final void paint(Graphics arg0) {
        this.field1093.paint(arg0);
        field1094++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIBLha;)Lka;", line = 179)
    public static final class472 method601(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class59 arg6) {
        field1091++;
        if (arg5 != -35) {
            field1099 = 10;
        }
        long var7 = (long) arg4;
        class472 var9 = (class472) class425.field6121.method992(var7, 81);
        short var10 = 2055;
        if (var9 == null) {
            class37 var11 = class756.method4222(0, class301.field4202, arg4, -1);
            if (var11 == null) {
                return null;
            }
            if (var11.field897 < 13) {
                var11.method458(2, 105);
            }
            var9 = arg6.method174(var11, var10, class651.field8951, 64, 768);
            class425.field6121.method991(var9, var7, (byte) -122);
        }
        class472 var12 = var9.method504((byte) 2, var10, true);
        if (arg3 != 0) {
            var12.method524(arg3);
        }
        if (arg1 != 0) {
            var12.method515(arg1);
        }
        if (arg2 != 0) {
            var12.method502(arg2);
        }
        if (arg0 != 0) {
            var12.method528(0, arg0, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 233)
    public static final void method602(int arg0) {
        field1092++;
        class591.method3373(false, (byte) -125);
        class521.field7235 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class109.field1900.length; var2++) {
            if (class683.field9251[var2] != -1 && class109.field1900[var2] == null) {
                class109.field1900[var2] = class171.field2666.method863(-1860, class683.field9251[var2], 0);
                if (class109.field1900[var2] == null) {
                    var1 = false;
                    class521.field7235++;
                }
            }
            if (class355.field5025[var2] != -1 && class204.field2942[var2] == null) {
                class204.field2942[var2] = class171.field2666.method846(class355.field5025[var2], 0, arg0 + 2, class621.field8449[var2]);
                if (class204.field2942[var2] == null) {
                    class521.field7235++;
                    var1 = false;
                }
            }
            if (class67.field1266[var2] != -1 && class417.field6044[var2] == null) {
                class417.field6044[var2] = class171.field2666.method863(-1860, class67.field1266[var2], 0);
                if (class417.field6044[var2] == null) {
                    class521.field7235++;
                    var1 = false;
                }
            }
            if (class184.field2787[var2] != -1 && class689.field9303[var2] == null) {
                class689.field9303[var2] = class171.field2666.method863(-1860, class184.field2787[var2], 0);
                if (class689.field9303[var2] == null) {
                    var1 = false;
                    class521.field7235++;
                }
            }
            if (class346.field4845 != null && class568.field7815[var2] == null && class346.field4845[var2] != -1) {
                class568.field7815[var2] = class171.field2666.method846(class346.field4845[var2], 0, arg0 + 2, class621.field8449[var2]);
                if (class568.field7815[var2] == null) {
                    var1 = false;
                    class521.field7235++;
                }
            }
        }
        if (class28.field753 == null) {
            if (class655.field8991 == null || !class77.field1395.method853(-18308, class655.field8991.field2610 + "_staticelements")) {
                class28.field753 = new class350(0);
            } else if (class77.field1395.method866(100, class655.field8991.field2610 + "_staticelements")) {
                class28.field753 = class312.method2031(class77.field1395, class655.field8991.field2610 + "_staticelements", class491.field6806, (byte) -91);
            } else {
                var1 = false;
                class521.field7235++;
            }
        }
        if (!var1) {
            class585.field7992 = 1;
            return;
        }
        boolean var3 = true;
        class627.field8634 = 0;
        for (int var4 = 0; var4 < class109.field1900.length; var4++) {
            byte[] var21 = class204.field2942[var4];
            if (var21 != null) {
                int var22 = (class199.field2905[var4] >> 8) * 64 - class221.field3177;
                int var23 = (class199.field2905[var4] & 0xFF) * 64 - class367.field5236;
                if (class482.field6727 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class432.method2624(class376.field5325, var22, class175.field2711, var23, var21, (byte) 39);
            }
            byte[] var24 = class689.field9303[var4];
            if (var24 != null) {
                int var25 = (class199.field2905[var4] >> 8) * 64 - class221.field3177;
                int var26 = (class199.field2905[var4] & 0xFF) * 64 - class367.field5236;
                if (class482.field6727 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class432.method2624(class376.field5325, var25, class175.field2711, var26, var24, (byte) 39);
            }
        }
        if (!var3) {
            class585.field7992 = 2;
            return;
        }
        if (class585.field7992 != 0) {
            class130.method1074(true, class355.field5007, class308.field4276, class497.field6903.method2936(class607.field8336, 544) + "<br>(100%)", 2, class272.field3822);
        }
        class15.method120(false);
        class340.method2149((byte) 102);
        class640.method3632(arg0 ^ 0x41);
        boolean var5 = false;
        if (class272.field3822.method327() && class693.field9368.field4456.method3536(-32350) == 2) {
            for (int var6 = 0; var6 < class109.field1900.length; var6++) {
                if (class689.field9303[var6] != null || class417.field6044[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class693.field9368.field4444.method1557(-32350) == 1) {
            var7 = class365.field5221[class7.field48];
        } else {
            var7 = class44.field979[class7.field48];
        }
        if (class272.field3822.method247()) {
            var7++;
        }
        class251.method1703(class272.field3822, class218.field3161, 9, 4, class376.field5325, class175.field2711, var7, var5, class272.field3822.method318() > 0);
        class77.method714(class127.field2138);
        if (class127.field2138 == 0) {
            class688.method3845(null);
        } else {
            class688.method3845(class214.field3046);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class19.field295[var8].method3298(arg0 ^ 0x2BC);
        }
        class684.method3828((byte) -86);
        class81.method758((byte) 99, false);
        class745.method4151(arg0 + arg0);
        class318.field4390 = null;
        class740.field9961 = false;
        class15.method120(false);
        System.gc();
        class591.method3373(true, (byte) -128);
        class585.method3344(2);
        class307.field4248 = class693.field9368.field4435.method421(-32350);
        class639.field8781 = class69.field1286 >= 96;
        class140.field2326 = class693.field9368.field4456.method3536(-32350) == 2;
        class463.field6506 = class693.field9368.field4427.method3195(arg0 - 32350) == 1;
        class345.field4824 = class693.field9368.field4458.method3022(-32350) == 1 ? -1 : class534.field7352;
        class82.field1486 = class693.field9368.field4453.method1849(-32350) == 1;
        class439.field6256 = class693.field9368.field4432.method887(arg0 ^ 0xFFFF81A2) == 1;
        class546.field7534 = new class469(4, class376.field5325, class175.field2711, false);
        if (class482.field6727 == 0) {
            class465.method2738((byte) -65, class546.field7534, class109.field1900);
        } else {
            class211.method1449(false, class546.field7534, class109.field1900);
        }
        class746.method4163(class376.field5325 >> 4, class175.field2711 >> 4, true);
        class587.method3351((byte) -77);
        if (var5) {
            class174.method1308(true);
            class96.field1669 = new class469(1, class376.field5325, class175.field2711, true);
            if (class482.field6727 == 0) {
                class465.method2738((byte) -44, class96.field1669, class417.field6044);
                class591.method3373(true, (byte) -119);
            } else {
                class211.method1449(false, class96.field1669, class417.field6044);
                class591.method3373(true, (byte) -125);
            }
            class96.field1669.method1724(0, 0, class546.field7534.field3684[0]);
            class96.field1669.method1730(class272.field3822, null, 21407, null);
            class174.method1308(false);
        }
        class546.field7534.method1730(class272.field3822, var5 ? class96.field1669.field3684 : null, 21407, class19.field295);
        if (class482.field6727 == 0) {
            class591.method3373(true, (byte) -128);
            class514.method3010(class204.field2942, arg0 + 65536, class546.field7534);
            if (class568.field7815 != null) {
                class478.method2803(arg0 ^ 0xFFFFFF81);
            }
        } else {
            class591.method3373(true, (byte) -121);
            class495.method2916(arg0 - 8212, class204.field2942, class546.field7534);
        }
        class340.method2149((byte) 66);
        if (class69.field1286 < 96) {
            class271.method1794(31268);
        }
        class591.method3373(true, (byte) -119);
        class546.field7534.method1725(null, (byte) -125, var5 ? class344.field4822[0] : null, class272.field3822);
        class546.field7534.method2765(false, class272.field3822, -36);
        class591.method3373(true, (byte) -122);
        if (var5) {
            class174.method1308(true);
            class591.method3373(true, (byte) -124);
            if (class482.field6727 == 0) {
                class514.method3010(class689.field9303, arg0 + 65536, class96.field1669);
            } else {
                class495.method2916(-8212, class689.field9303, class96.field1669);
            }
            class340.method2149((byte) 73);
            class591.method3373(true, (byte) -121);
            class96.field1669.method1725(class465.field6517[0], (byte) -127, null, class272.field3822);
            class96.field1669.method2765(true, class272.field3822, arg0 - 60);
            class591.method3373(true, (byte) -126);
            class174.method1308(false);
        }
        class568.method3287(13022);
        int var9 = class546.field7534.field6580;
        if (class382.field5551 < var9) {
            var9 = class382.field5551;
        }
        if ((class382.field5551 - 1) > var9) {
            var9 = class382.field5551 - 1;
        }
        if (class693.field9368.field4458.method3022(-32350) == 0) {
            class645.method3666(var9);
        } else {
            class645.method3666(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class376.field5325; var19++) {
                for (int var20 = 0; var20 < class175.field2711; var20++) {
                    class209.method1439(var20, (byte) -126, var19, var10);
                }
            }
        }
        class566.method3277((byte) -99);
        class15.method120(false);
        class257.method1743((byte) -105);
        class340.method2149((byte) 62);
        class162.method1234(99);
        if (class684.field9263 != null && class512.field7137 != null && class214.field3036 == 11) {
            class547.field7540++;
            class564 var11 = class227.method1594(class531.field7321, class72.field1320, arg0 ^ 0xFFFFFFAA);
            var11.field7778.method1539((byte) 108, 1057001181);
            class167.method1260(-122, var11);
        }
        if (class482.field6727 == 0) {
            int var12 = (class59.field1172 - (class376.field5325 >> 4)) / 8;
            int var13 = (class59.field1172 + (class376.field5325 >> 4)) / 8;
            int var14 = (class531.field7322 - (class175.field2711 >> 4)) / 8;
            int var15 = ((class175.field2711 >> 4) + class531.field7322) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var17 < var14 || var15 < var17) {
                        class171.field2666.method862("m" + var16 + "_" + var17, true);
                        class171.field2666.method862("l" + var16 + "_" + var17, true);
                    }
                }
            }
        }
        if (class214.field3036 == 4) {
            class215.method1527(arg0 ^ 0x2, 3);
        } else if (class214.field3036 == 8) {
            class215.method1527(2, 7);
        } else {
            class215.method1527(2, 10);
            if (class512.field7137 != null) {
                class564 var18 = class227.method1594(class626.field8620, class72.field1320, -106);
                class167.method1260(127, var18);
            }
        }
        class669.method3753(-106);
        class15.method120(false);
        class660.method3714(true);
        class30.field778 = true;
        if (class284.field3969) {
            class355.method2228("Took: " + (class554.method3190(-117) - class367.field5235) + "ms", arg0 + 52);
            class284.field3969 = false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 713)
    public class53(Component arg0) {
        this.field1093 = arg0;
    }
}
