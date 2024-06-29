import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class191 {

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lrf;")
    public static class163 field3785 = class53.method392(45, "<col=ff0000>");

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3788 = -1;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[Lrf;")
    public static class163[] field3786 = new class163[100];

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lrf;")
    public static class163 field3787 = class53.method392(-59, "<col=ff9040>");

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lrf;")
    public static class163 field3790 = class53.method392(42, "welle:");

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lig;")
    public static class84 field3791;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public static void method1285(boolean arg0) {
        field3791 = null;
        field3785 = null;
        if (arg0) {
            field3788 = 75;
        }
        field3787 = null;
        field3790 = null;
        field3786 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIILnh;)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, class129 arg4) {
        field3792++;
        if (class184.field3678 >= 400) {
            return;
        }
        if (arg4.field2682 != null) {
            arg4 = arg4.method851(arg0 - 4);
        }
        if (arg4 == null) {
            return;
        }
        if (arg0 != 4) {
            field3788 = -32;
        }
        if (!arg4.field2641) {
            return;
        }
        class163 var5 = arg4.field2664;
        if (arg4.field2680 != 0) {
            var5 = class180.method1216(new class163[] { var5, class195.method1300(arg4.field2680, class56.field1136.field753, 112), class150.field3106, class22.field392, class34.method217(arg4.field2680, -111), class21.field365 }, false);
        }
        if (class62.field1326 == 1) {
            class62.method453((short) 20, (long) arg3, arg1, arg2, class193.field3794, (byte) -76, class180.method1216(new class163[] { class119.field2516, class137.field2825, var5 }, false));
            class185.field3691++;
        } else if (!class189.field3766) {
            class26.field478++;
            class163[] var6 = arg4.field2656;
            if (class19.field312) {
                var6 = class197.method1306(var6, true);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1038(class112.field2363, 0)) {
                        class56.field1126++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 50;
                        }
                        if (var7 == 1) {
                            var8 = 9;
                        }
                        if (var7 == 2) {
                            var8 = 15;
                        }
                        if (var7 == 3) {
                            var8 = 46;
                        }
                        if (var7 == 4) {
                            var8 = 17;
                        }
                        class62.method453(var8, (long) arg3, arg1, arg2, var6[var7], (byte) -115, class180.method1216(new class163[] { class81.field1630, var5 }, false));
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1038(class112.field2363, 0)) {
                        short var10 = 0;
                        if (class56.field1136.field753 < arg4.field2680) {
                            var10 = 2000;
                        }
                        class102.field2123++;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 50;
                        }
                        if (var9 == 1) {
                            var11 = 9;
                        }
                        if (var9 == 2) {
                            var11 = 15;
                        }
                        if (var9 == 3) {
                            var11 = 46;
                        }
                        if (var9 == 4) {
                            var11 = 17;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class62.method453(var11, (long) arg3, arg1, arg2, var6[var9], (byte) 124, class180.method1216(new class163[] { class81.field1630, var5 }, false));
                    }
                }
            }
            class62.method453((short) 1006, (long) arg3, arg1, arg2, class167.field3391, (byte) 106, class180.method1216(new class163[] { class81.field1630, var5 }, false));
        } else if ((class112.field2362 & 0x2) == 2) {
            class65.field1390++;
            class62.method453((short) 19, (long) arg3, arg1, arg2, class181.field3635, (byte) -28, class180.method1216(new class163[] { class6.field134, class137.field2825, var5 }, false));
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
    public static final void method1287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3789++;
        int var5 = 0;
        if (arg4 != -7807) {
            field3785 = null;
        }
        while (class48.field944 > var5) {
            if (class20.field351[var5] + class106.field2207[var5] > arg0 && class106.field2207[var5] < arg0 + arg3 && class99.field2092[var5] + class161.field3258[var5] > arg1 && class99.field2092[var5] < arg1 + arg2) {
                class181.field3631[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lig;B)Z")
    public static final boolean method1288(class84 arg0, byte arg1) {
        field3783++;
        if (class135.field2791) {
            if (class21.method130(arg0, (byte) 77) != 0) {
                return false;
            }
            if (arg0.field1755 == 0) {
                return false;
            }
        }
        if (arg1 >= -78) {
            field3788 = 91;
        }
        return arg0.field1780;
    }
}
