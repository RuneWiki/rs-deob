import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class245 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Z")
    public static boolean[] field3862 = new boolean[100];

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lf;")
    public static class227 field3864 = new class227(64);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static final void method1623(int arg0) {
        field3861++;
        if (arg0 > -107) {
            method1625((byte) -122, (Component) null);
        }
        class204.field3287.method1157(760);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method1624(int arg0) {
        if (arg0 != 22599) {
            method1624(90);
        }
        field3862 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1625(byte arg0, Component arg1) {
        arg1.removeMouseListener(class210.field3374);
        field3870++;
        arg1.removeMouseMotionListener(class210.field3374);
        arg1.removeFocusListener(class210.field3374);
        if (arg0 != 41) {
            method1629(91, 22, true, -30, 107, 52, -4);
        }
        class132.field2190 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    public static final void method1626(int arg0, int arg1) {
        class42.field776--;
        field3867++;
        if (arg1 != -12726) {
            method1627((byte) -14, (class74) null);
        }
        if (class42.field776 == arg0) {
            return;
        }
        class68.method536(class47.field840, arg0 + 1, class47.field840, arg0, class42.field776 - arg0);
        class68.method536(class217.field3488, arg0 + 1, class217.field3488, arg0, class42.field776 - arg0);
        class68.method533(class251.field3993, arg0 + 1, class251.field3993, arg0, class42.field776 - arg0);
        class68.method534(class94.field1468, arg0 + 1, class94.field1468, arg0, class42.field776 - arg0);
        class68.method531(class110.field1703, arg0 + 1, class110.field1703, arg0, class42.field776 - arg0);
        class68.method533(class223.field3559, arg0 + 1, class223.field3559, arg0, class42.field776 - arg0);
        class68.method533(class15.field231, arg0 + 1, class15.field231, arg0, class42.field776 - arg0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLcj;)V")
    public static final void method1627(byte arg0, class74 arg1) {
        for (int var2 = 0; var2 < class206.field3322.length; var2++) {
            class206.field3322[var2] = 0;
        }
        short var3 = 256;
        if (arg0 >= -124) {
            method1630(122, false, true, -46, -14, 72, -15);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class206.field3322[var16] = (int) (Math.random() * 284.0D);
        }
        field3866++;
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class135.field2224[var15] = (class206.field3322[var15 + 128] + class206.field3322[var15 - 128] + class206.field3322[var15 + 1] + class206.field3322[var15 + -1]) / 4;
                }
            }
            int[] var13 = class206.field3322;
            class206.field3322 = class135.field2224;
            class135.field2224 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field2447; var7++) {
            for (int var8 = 0; var8 < arg1.field2440; var8++) {
                if (arg1.field1224[var6++] != 0) {
                    int var9 = var8 - (-arg1.field2445 - 16);
                    int var10 = arg1.field2442 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class206.field3322[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Lfc;")
    public static final class149 method1628(int arg0) {
        int var1 = 111 % ((-arg0 - 73) / 52);
        field3871++;
        class74 var2 = new class74(class287.field4592, class20.field315, class193.field3155[0], class197.field3224[0], class4.field56[0], class19.field268[0], class66.field1082[0], class244.field3857);
        class213.method1410(0);
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1629(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class179[] var7 = class288.field4608;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class179 var9 = var7[var8];
            if (var9 != null && var9.field2981 == 2) {
                class77.method624((var9.field2986 - class170.field2787 << 7) + var9.field2985, -13057, var9.field2993 * 2, arg4 >> 1, (var9.field2983 - class256.field4082 << 7) + var9.field2988, arg1, arg0, arg5 >> 1);
                if (class111.field1713 > -1 && (class207.field3336 % 20) < 10) {
                    class223.field3555[var9.field2969].method124(class111.field1713 + arg3 - 12, arg6 + -28 - -class241.field3800);
                }
            }
        }
        field3872++;
        if (!arg2) {
            method1625((byte) -111, (Component) null);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZZIIII)V")
    public static final void method1630(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > arg3) {
            int var7 = (arg0 + arg3) / 2;
            int var8 = arg3;
            class80 var9 = class143.field2362[var7];
            class143.field2362[var7] = class143.field2362[arg0];
            class143.field2362[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (class156.method1129(class143.field2362[var10], arg5, arg2, -67, arg1, arg4, var9) <= 0) {
                    class80 var11 = class143.field2362[var10];
                    class143.field2362[var10] = class143.field2362[var8];
                    class143.field2362[var8++] = var11;
                }
            }
            class143.field2362[arg0] = class143.field2362[var8];
            class143.field2362[var8] = var9;
            method1630(var8 - 1, arg1, arg2, arg3, arg4, arg5, -23491);
            method1630(arg0, arg1, arg2, var8 + 1, arg4, arg5, arg6);
        }
        if (arg6 != -23491) {
            method1627((byte) 22, (class74) null);
        }
        field3865++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLig;)Lle;")
    public static final class183 method1631(byte arg0, class136 arg1) {
        field3863++;
        if (arg0 != -49) {
            method1632(18, -117, true, -29, 76);
        }
        return new class183(arg1.method1027((byte) 64), arg1.method1027((byte) 64), arg1.method1027((byte) 64), arg1.method1027((byte) 64), arg1.method1009(113), arg1.method1012(4));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZII)V")
    public static final void method1632(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3868++;
        class11.field153 = 0L;
        boolean var5 = false;
        int var6 = class218.method1447(-769845689);
        if (arg0 >= -79) {
            field3864 = null;
        }
        if (arg1 > 0 != var6 > 0) {
            var5 = true;
        }
        if (arg1 == 3 || var6 == 3) {
            arg2 = true;
        }
        if (class78.field1300.startsWith("mac") && arg1 > 0) {
            arg2 = true;
        }
        if (arg2 && arg1 > 0) {
            var5 = true;
        }
        class31.method272(var5, arg4, arg3, -23, arg1, var6, arg2);
    }
}
