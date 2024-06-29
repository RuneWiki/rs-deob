import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class65 extends class26 {

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public int field817 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public int field821 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field819 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public int field827 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public int field825 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field816 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public int field822 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public int field824 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "Lfg;")
    public class352 field831;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
    public static int[] field826 = new int[100];

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field814 = new String[200];

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 9)
    public static void method469(boolean arg0) {
        field826 = null;
        field814 = null;
        if (!arg0) {
            method473(-16, -103, 22);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z", line = 20)
    public final boolean method470(int arg0, int arg1, int arg2) {
        field820++;
        if (this.field817 <= arg0 && arg0 <= this.field822 && arg2 >= this.field819 && this.field821 >= arg2) {
            return true;
        } else {
            if (arg1 >= -99) {
                method473(-106, 125, -30);
            }
            return arg0 >= this.field816 && arg0 <= this.field827 && this.field824 <= arg2 && arg2 <= this.field825;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V", line = 40)
    public static final void method471(boolean arg0) {
        class321.field4713.method2258((byte) 86);
        field818++;
        if (!arg0) {
            field830 = 79;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 52)
    public static final void method472(int arg0) {
        class268.field3861.method2258((byte) 86);
        if (arg0 > -22) {
            method472(44);
        }
        field829++;
        class357.field5586.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I", line = 66)
    public static final int method473(int arg0, int arg1, int arg2) {
        field823++;
        int var3 = class61.method452(arg1 + 91923, 0, arg0 + 45365, 4) + (class61.method452(arg1 + 37821, 0, arg0 + 10294, 2) - 128 >> 1) + (class61.method452(arg1, 0, arg0, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg2 >= -30) {
            method469(false);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V", line = 89)
    public static final void method474(String arg0, int arg1, String arg2, int arg3, String arg4, int arg5) {
        field811++;
        for (int var6 = 99; var6 > 0; var6--) {
            class193.field2665[var6] = class193.field2665[var6 - 1];
            class303.field4439[var6] = class303.field4439[var6 - 1];
            class64.field810[var6] = class64.field810[var6 - 1];
            class323.field4748[var6] = class323.field4748[var6 - 1];
            class305.field4462[var6] = class305.field4462[var6 - 1];
        }
        class193.field2665[0] = arg3;
        class303.field4439[0] = arg0;
        class64.field810[0] = arg4;
        class326.field4765 = class64.field801;
        class305.field4462[0] = arg1;
        field830++;
        class323.field4748[arg5] = arg2;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lfg;)V", line = 294)
    public class65(class352 arg0) {
        this.field831 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIC)I", line = 137)
    public static final int method475(int arg0, int arg1, char arg2) {
        if (arg0 != 1762) {
            method472(-16);
        }
        field828++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V", line = 160)
    public static final void method476(boolean arg0, int arg1) {
        class66.field853--;
        field832++;
        if (class66.field853 == arg1) {
            return;
        }
        class87.method628(class185.field2524, arg1 + 1, class185.field2524, arg1, class66.field853 - arg1);
        class87.method628(class328.field4805, arg1 + 1, class328.field4805, arg1, class66.field853 - arg1);
        if (arg0) {
            return;
        }
        class87.method629(class42.field533, arg1 + 1, class42.field533, arg1, class66.field853 - arg1);
        class87.method633(class156.field2169, arg1 + 1, class156.field2169, arg1, class66.field853 - arg1);
        class87.method634(class199.field2801, arg1 + 1, class199.field2801, arg1, class66.field853 - arg1);
        class87.method629(class95.field1243, arg1 + 1, class95.field1243, arg1, class66.field853 - arg1);
        class87.method629(class156.field2159, arg1 + 1, class156.field2159, arg1, class66.field853 - arg1);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 200)
    public static final void method477(int arg0) {
        class159.field2263 = false;
        class66.field853 = 0;
        class154.field2147 = -1;
        class251.field3681.field4351 = 0;
        class9.field99 = -1;
        class287.field4124 = -1;
        field812++;
        class314.field4618 = -1;
        class276.field3953 = 0;
        class240.field3490.field4351 = 0;
        class275.field3943 = 0;
        class315.field4648 = 0;
        class178.method1314((byte) 0);
        for (int var1 = 0; var1 < class311.field4574.length; var1++) {
            if (class311.field4574[var1] != null) {
                class311.field4574[var1].field4870 = -1;
            }
        }
        for (int var2 = arg0; var2 < class251.field3688.length; var2++) {
            if (class251.field3688[var2] != null) {
                class251.field3688[var2].field4870 = -1;
            }
        }
        class294.method2010(true);
        client.field1631 = 1;
        class59.method445(30, (byte) 107);
        for (int var3 = 0; var3 < 100; var3++) {
            class229.field3276[var3] = true;
        }
        class321.method2226(false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLp;)V", line = 252)
    public static final void method478(byte arg0, class169 arg1) {
        field813++;
        if (arg0 <= 39) {
            return;
        }
        for (class96 var2 = (class96) class343.field5336.method413(1253231568); var2 != null; var2 = (class96) class343.field5336.method419(14)) {
            if (var2.field1266 == arg1) {
                if (var2.field1260 != null) {
                    class186.field2548.method2246(var2.field1260);
                    var2.field1260 = null;
                }
                var2.method179((byte) 51);
                return;
            }
        }
    }
}
