import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class555 extends class533 {

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "Ljava/lang/Object;")
    private Object field8069;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method2837(int arg0) {
        field8063++;
        return arg0 != 14559;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 14)
    public static final void method3333(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field8067++;
        class146 var5 = class590.method3467(1, arg4, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field2086 != null) {
            class362 var6 = new class362();
            var6.field5297 = var5.field2086;
            var6.field5288 = arg2;
            var6.field5304 = var5;
            var6.field5299 = arg1;
            class529.method3207(var6);
        }
        if (class369.field5392 != 10 || !client.method2732(var5).method2856((byte) 47, arg2 - 1)) {
            return;
        }
        if (arg2 == 1) {
            class641.field9118++;
            class88 var7 = class448.method2741((byte) 44, class591.field8406, class583.field8319);
            class233.method1626(arg4, arg3, var7, var5.field2131, 852);
            class523.method3183(var7, (byte) 31);
        }
        if (arg2 == 2) {
            class275.field3879++;
            class88 var8 = class448.method2741((byte) 36, class568.field8206, class583.field8319);
            class233.method1626(arg4, arg3, var8, var5.field2131, 852);
            class523.method3183(var8, (byte) 31);
        }
        if (arg0 != 26952) {
            field8066 = -89;
        }
        if (arg2 == 3) {
            class601.field8534++;
            class88 var9 = class448.method2741((byte) 48, class684.field9718, class583.field8319);
            class233.method1626(arg4, arg3, var9, var5.field2131, 852);
            class523.method3183(var9, (byte) 31);
        }
        if (arg2 == 4) {
            class448.field6424++;
            class88 var10 = class448.method2741((byte) 50, class71.field1080, class583.field8319);
            class233.method1626(arg4, arg3, var10, var5.field2131, 852);
            class523.method3183(var10, (byte) 31);
        }
        if (arg2 == 5) {
            class230.field3419++;
            class88 var11 = class448.method2741((byte) 92, class111.field1574, class583.field8319);
            class233.method1626(arg4, arg3, var11, var5.field2131, 852);
            class523.method3183(var11, (byte) 31);
        }
        if (arg2 == 6) {
            class457.field6508++;
            class88 var12 = class448.method2741((byte) 51, class258.field3695, class583.field8319);
            class233.method1626(arg4, arg3, var12, var5.field2131, 852);
            class523.method3183(var12, (byte) 31);
        }
        if (arg2 == 7) {
            class349.field5176++;
            class88 var13 = class448.method2741((byte) 109, class212.field3174, class583.field8319);
            class233.method1626(arg4, arg3, var13, var5.field2131, 852);
            class523.method3183(var13, (byte) 31);
        }
        if (arg2 == 8) {
            class268.field3815++;
            class88 var14 = class448.method2741((byte) 104, class385.field5569, class583.field8319);
            class233.method1626(arg4, arg3, var14, var5.field2131, 852);
            class523.method3183(var14, (byte) 31);
        }
        if (arg2 == 9) {
            class204.field3057++;
            class88 var15 = class448.method2741((byte) 107, class345.field4748, class583.field8319);
            class233.method1626(arg4, arg3, var15, var5.field2131, arg0 - 26100);
            class523.method3183(var15, (byte) 31);
        }
        if (arg2 == 10) {
            class310.field4184++;
            class88 var16 = class448.method2741((byte) 44, class475.field6765, class583.field8319);
            class233.method1626(arg4, arg3, var16, var5.field2131, 852);
            class523.method3183(var16, (byte) 31);
        }
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V", line = 145)
    public static final void method3334(int arg0) {
        class95.field1384 = null;
        field8068++;
        client.field6416 = null;
        class640.field9113 = null;
        class426.field6155 = null;
        int var1 = 96 % ((-arg0 - 63) / 63);
        class238.field3551 = false;
        class633.field8937 = null;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(Z)V", line = 163)
    public static final void method3335(boolean arg0) {
        field8065++;
        class105.field1478 = class413.method2494(8, 4, 2048, 8, 0.4F, arg0, 35, false);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 175)
    public final Object method2838(byte arg0) {
        field8064++;
        if (arg0 != -107) {
            this.method2837(-90);
        }
        return this.field8069;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 186)
    public class555(Object arg0, int arg1) {
        super(arg1);
        this.field8069 = arg0;
    }
}
