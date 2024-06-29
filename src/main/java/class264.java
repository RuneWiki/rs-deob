import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class264 extends class285 {

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public int field4460 = 0;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Lve;")
    public static class255 field4458 = class87.method607(52, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Lve;")
    public static class255 field4464 = class87.method607(109, "event_opbase");

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "[S")
    public static short[] field4466 = new short[500];

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field4459 = -1;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "[I")
    public static int[] field4471 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field4469 = 0;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "[I")
    public static int[] field4475 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Ltl;")
    public static class197 field4472;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lpc;")
    public static class83 field4468;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZILmg;)V", line = 6)
    public static final void method1834(int arg0, int arg1, boolean arg2, int arg3, class145 arg4) {
        if (arg2) {
            method1843(117L, (byte) -124);
        }
        field4467++;
        for (class152 var5 = (class152) class95.field1622.method1471((byte) 107); var5 != null; var5 = (class152) class95.field1622.method1475((byte) 83)) {
            if (var5.field2583 == arg3 && arg0 * 128 == var5.field2579 && (arg1 * 128) == var5.field2577 && var5.field2587.field2458 == arg4.field2458) {
                if (var5.field2567 != null) {
                    class230.field3813.method1481(var5.field2567);
                    var5.field2567 = null;
                }
                if (var5.field2582 != null) {
                    class230.field3813.method1481(var5.field2582);
                    var5.field2582 = null;
                }
                var5.method1502((byte) -82);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lpb;Z)V", line = 46)
    public final void method1835(class70 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field4457++;
        while (true) {
            int var3 = arg0.method481(0);
            if (var3 == 0) {
                return;
            }
            this.method1838(var3, -124, arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I", line = 72)
    public static int method1836(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V", line = 85)
    public static void method1837(int arg0) {
        field4472 = null;
        field4468 = null;
        field4471 = null;
        field4464 = null;
        if (arg0 > -19) {
            method1839((byte) 65);
        }
        field4466 = null;
        field4458 = null;
        field4475 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILpb;)V", line = 102)
    private final void method1838(int arg0, int arg1, class70 arg2) {
        if (arg0 == 2) {
            this.field4460 = arg2.method423(255);
        }
        int var4 = -42 / ((-arg1 - 66) / 45);
        field4462++;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V", line = 125)
    public static final void method1839(byte arg0) {
        field4465++;
        int var1 = class184.field2974;
        int var2 = class249.field4172;
        int var3 = class173.field2864;
        int var4 = class148.field2507;
        int var5 = 6116423;
        if (class281.field4827) {
            class126.method936(var2, var1, var3, var4, var5);
            class126.method936(var2 + 1, var1 + 1, var3 - 2, 16, 0);
            class126.method926(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        } else {
            class175.method1249(var2, var1, var3, var4, var5);
            class175.method1249(var2 + 1, var1 + 1, var3 - 2, 16, 0);
            class175.method1253(var2 + 1, var1 - -18, var3 - 2, var4 + -19, 0);
        }
        class277.field4761.method494(class196.field3225, var2 + 3, var1 - -14, var5, -1);
        int var6 = class2.field31;
        if (arg0 >= -88) {
            method1840((class197) null, (byte) -37);
        }
        int var7 = class67.field994;
        for (int var8 = 0; var8 < class136.field2272; var8++) {
            int var9 = 16777215;
            int var10 = (class136.field2272 - var8 - 1) * 15 + var1 + 31;
            if (var2 < var6 && var6 < (var2 + var3) && var7 > var10 - 13 && (var10 + 3) > var7) {
                var9 = 16776960;
            }
            class277.field4761.method494(class9.method47(true, var8), var2 + 3, var10, var9, 0);
        }
        class160.method1163(0, class148.field2507, class184.field2974, class249.field4172, class173.field2864);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ltl;B)Ltl;", line = 182)
    public static final class197 method1840(class197 arg0, byte arg1) {
        field4474++;
        if (arg0.field3353 != -1) {
            return class58.method353(arg0.field3353, (byte) -115);
        }
        int var2 = arg0.field3256 >>> 16;
        if (arg1 < 6) {
            method1840((class197) null, (byte) -37);
        }
        class184 var3 = new class184(class158.field2675);
        for (class155 var4 = (class155) var3.method1288(121); var4 != null; var4 = (class155) var3.method1287(100)) {
            if (var4.field2637 == var2) {
                return class58.method353((int) var4.field3568, (byte) 124);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZIBII)Lud;", line = 223)
    public static final class269 method1841(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var7 = -46 / ((44 - arg3) / 33);
        field4463++;
        int var8 = (arg0 << 19) + (arg1 ? 65536 : 0) + (arg2 << 17) + arg5;
        long var9 = (long) arg4 * 3147483667L + ((long) var8 * 3849834839L);
        class269 var11 = (class269) class14.field203.method558(var9, true);
        if (var11 != null) {
            return var11;
        }
        class283.field4874 = false;
        class269 var12 = class185.method1296(false, false, arg4, -405013968, arg2, arg0, arg1, arg5);
        if (var12 != null && !class283.field4874) {
            class14.field203.method555(var12, var9, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V", line = 274)
    public static final void method1842(byte arg0) {
        field4473++;
        if (arg0 <= 109) {
            return;
        }
        for (class155 var1 = (class155) class158.field2675.method288((byte) -42); var1 != null; var1 = (class155) class158.field2675.method289(94)) {
            int var2 = var1.field2637;
            if (class225.method1570((byte) -96, var2)) {
                class197[] var3 = class297.field5087[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field3365;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field3568;
                    class197 var7 = class58.method353(var6, (byte) -19);
                    if (var7 != null) {
                        class108.method834((byte) 49, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(JB)Lve;", line = 330)
    public static final class255 method1843(long arg0, byte arg1) {
        field4461++;
        return arg1 < 76 ? (class255) null : class241.method1663(arg0, false, 10, -1);
    }
}
