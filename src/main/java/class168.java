import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class168 {

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[S")
    public short[] field3031;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[S")
    public short[] field3035;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[B")
    public byte[] field3022;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "[Lcc;")
    public class209[] field3032;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    public int[] field3029;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lcc;")
    public static class209 field3019 = class95.method669(120, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field3023 = 0;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lcc;")
    public static class209 field3024 = class95.method669(103, "S-Blectionner");

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field3018 = 0;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lcc;")
    public static class209 field3033 = class95.method669(106, "(U");

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field3025 = 0;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    public static int[] field3030 = new int[1000];

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method1152(boolean arg0) {
        if (!arg0) {
            field3030 = null;
        }
        field3033 = null;
        field3019 = null;
        field3024 = null;
        field3030 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public static final boolean method1153(int arg0, int arg1) {
        field3027++;
        class159 var2 = class117.method829(arg1, arg0 - 69);
        if (var2 == null) {
            return false;
        } else if (class143.field2644 == 1 || class143.field2644 == 2 || class100.field1945 == 2) {
            byte[] var3 = var2.field2902.method1455((byte) 125);
            class64.field1255 = new String(var3, 0, var3.length);
            class37.field646 = var2.field2894;
            if (class100.field1945 != 0) {
                class155.field2845 = class37.field646 + 50000;
                class59.field1186 = class37.field646 + 40000;
                class45.field898 = class59.field1186;
            }
            return true;
        } else {
            if (arg0 != 0) {
                method1152(false);
            }
            class209 var4 = class129.field2487;
            if (class100.field1945 != 0) {
                var4 = class229.method1604(new class209[] { class99.field1932, class66.method485(var2.field2894 + 7000, (byte) 54) }, (byte) 108);
            }
            class209 var5 = class129.field2487;
            if (client.field2812 != null) {
                var5 = class229.method1604(new class209[] { class276.field4871, client.field2812 }, (byte) 104);
            }
            class209 var6 = class229.method1604(new class209[] { class288.field5089, var2.field2902, var4, class254.field4582, class66.method485(class131.field2514, (byte) 77), class278.field4890, class66.method485(class60.field1210, (byte) 61), var5, class200.field3572, class181.field3284 ? class155.field2850 : class259.field4669, class191.field3452, class245.field4442 ? class155.field2850 : class259.field4669, class1.field24, class132.field2532 ? class155.field2850 : class259.field4669 }, (byte) 114);
            try {
                class257.field4637.getAppletContext().showDocument(var6.method1462(arg0 + 22), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)I")
    public final int method1154(int arg0, int arg1) {
        if (arg1 == 3) {
            field3026++;
            return this.field3022[arg0] & 0x3;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIBZZII)V")
    public static final void method1155(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field3021++;
        if (arg2 != 55) {
            return;
        }
        if (arg1 == 3) {
            method1155(-1, class54.field1063, (byte) 55, true, true, -1, arg6);
            return;
        }
        Container var7;
        if (class84.field1682 != null) {
            var7 = class84.field1682;
        } else if (class230.field4176 == null) {
            var7 = class230.field4187.field2638;
        } else {
            var7 = class230.field4176;
        }
        class117.field2337 = var7.getSize().width;
        class234.field4220 = var7.getSize().height;
        if (class230.field4176 == var7) {
            Insets var8 = class230.field4176.getInsets();
            class234.field4220 -= var8.top + var8.bottom;
            class117.field2337 -= var8.right + var8.left;
        }
        if (arg1 < 2) {
            class209.field3779 = (class117.field2337 - 765) / 2;
            class50.field981 = 503;
            class50.field989 = 0;
            class25.field442 = 765;
        } else {
            class25.field442 = class117.field2337;
            class50.field981 = class234.field4220;
            class209.field3779 = 0;
            class50.field989 = 0;
        }
        if (arg4) {
            class50.method381(class122.field2411, arg2 - 55);
            class90.method638((byte) 98, class122.field2411);
            if (class7.field149 != null) {
                class7.field149.method1398(class122.field2411, -40);
            }
            class257.field4637.method1053(48);
            class97.method678(arg2 + 15428, class122.field2411);
            class145.method1014(arg2 ^ 0x1B, class122.field2411);
            if (class7.field149 != null) {
                class7.field149.method1395(class122.field2411, (byte) 62);
            }
        } else {
            class122.field2411.setSize(class25.field442, class50.field981);
            if (class230.field4176 == var7) {
                Insets var9 = class230.field4176.getInsets();
                class122.field2411.setLocation(var9.left + class209.field3779, class50.field989 + var9.top);
            } else {
                class122.field2411.setLocation(class209.field3779, class50.field989);
            }
        }
        if (arg1 > 0) {
            method1155(-1, 0, (byte) 55, true, true, -1, arg6);
            return;
        }
        class53.field1034 = !class186.method1273(-64);
        if (class149.field2727 != -1) {
            class141.method980(124, true);
        }
        if (class193.field3488 != null && (class284.field5008 == 30 || class284.field5008 == 25)) {
            class187.method1275(0);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class129.field2476[var10] = true;
        }
        class155.field2841 = true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Z")
    public final boolean method1156(int arg0, byte arg1) {
        if (arg1 > -121) {
            return false;
        } else {
            field3034++;
            return (this.field3022[arg0] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Lrd;")
    public static final class266 method1157(byte arg0, int arg1) {
        field3020++;
        class266 var2 = (class266) class162.field2933.method670((byte) -55, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 5 % ((-arg0 - 8) / 44);
        byte[] var4 = class81.field1536.method353(arg1, 101, 1);
        class266 var5 = new class266();
        var5.field4779 = arg1;
        if (var4 != null) {
            var5.method1823(-1, new class106(var4));
        }
        var5.method1820(true);
        class162.field2933.method673((long) arg1, -5087, var5);
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        field3028++;
        if (arg0 == 8608) {
            class286.field5040.method665(arg0 ^ 0x21A1);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(I)V")
    public class168(int arg0) {
        this.field3036 = arg0;
        this.field3031 = new short[this.field3036];
        this.field3035 = new short[this.field3036];
        this.field3022 = new byte[this.field3036];
        this.field3032 = new class209[this.field3036];
        this.field3029 = new int[this.field3036];
    }
}
