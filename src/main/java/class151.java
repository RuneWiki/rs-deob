import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class151 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field1908 = 0;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lph;")
    public static class114 field1919 = new class114(64);

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "F")
    public static float field1916;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lam;")
    public static class286 field1909;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([Ljava/lang/String;[SB)V")
    public static final void method801(String[] arg0, short[] arg1, byte arg2) {
        class2.method12(arg0, arg1, 0, false, arg0.length - 1);
        int var3 = 115 % ((arg2 + 8) / 36);
        field1917++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field1907++;
        class436 var10 = null;
        for (class436 var11 = (class436) class308.field4167.method814((byte) 90); var11 != null; var11 = (class436) class308.field4167.method827(-126)) {
            if (var11.field6384 == arg4 && var11.field6378 == arg6 && var11.field6386 == arg9 && var11.field6368 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class436();
            var10.field6368 = arg7;
            var10.field6386 = arg9;
            var10.field6384 = arg4;
            var10.field6378 = arg6;
            class32.method153(var10, (byte) 78);
            class308.field4167.method825(arg5 ^ 0xFFFFFFA7, var10);
        }
        var10.field6373 = arg2;
        if (arg5 != -7) {
            field1916 = 0.06675244F;
        }
        var10.field6380 = arg0;
        var10.field6370 = arg3;
        var10.field6388 = arg1;
        var10.field6387 = arg8;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Lqs;")
    public static final class438 method803(int arg0, int arg1, int arg2) {
        field1918++;
        class438 var3 = new class438();
        var3.field6415 = -1;
        var3.field6397 = arg0 + 5 + 1;
        var3.field6417 = arg1 + arg2 + 5;
        var3.field6423 = -1;
        var3.field6422 = new int[var3.field6417][var3.field6397];
        var3.method2704(0);
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
    public static final void method804(byte arg0, int arg1) {
        field1914++;
        if (!class262.method1460((byte) -126, arg1) || arg0 != -5) {
            return;
        }
        class194[] var2 = class235.field3227[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class194 var4 = var2[var3];
            if (var4 != null) {
                var4.field2486 = 1;
                var4.field2508 = 0;
                var4.field2463 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILtq;)V")
    private final void method805(int arg0, int arg1, class250 arg2) {
        if (~arg1 == arg0) {
            this.field1908 = arg2.method1374(-2);
        }
        field1913++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ltq;B)V")
    public final void method806(class250 arg0, byte arg1) {
        if (arg1 <= 59) {
            field1916 = 0.13122848F;
        }
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                field1912++;
                return;
            }
            this.method805(-6, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static void method807(boolean arg0) {
        field1919 = null;
        field1909 = null;
        if (!arg0) {
            method807(false);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILfd;)V")
    public static final void method808(int arg0, class194 arg1) {
        field1910++;
        int var2 = arg1.field2455;
        if (var2 == 324) {
            if (class180.field2268 == -1) {
                class180.field2268 = arg1.field2603;
                class236.field3255 = arg1.field2465;
            }
            if (class17.field151.field4447) {
                arg1.field2603 = class180.field2268;
            } else {
                arg1.field2603 = class236.field3255;
            }
        } else if (var2 == 325) {
            if (class180.field2268 == -1) {
                class236.field3255 = arg1.field2465;
                class180.field2268 = arg1.field2603;
            }
            if (class17.field151.field4447) {
                arg1.field2603 = class236.field3255;
            } else {
                arg1.field2603 = class180.field2268;
            }
        } else if (var2 == 327) {
            arg1.field2479 = 150;
            arg1.field2583 = (int) (Math.sin((double) class234.field3224 / 40.0D) * 256.0D) & 0x3FFF;
            arg1.field2599 = -1;
            arg1.field2444 = 5;
        } else if (arg0 >= 26 && var2 == 328) {
            if (class427.field6264.field2034 == null) {
                arg1.field2599 = 0;
                arg1.field2487 = 0;
            } else {
                arg1.field2479 = 150;
                arg1.field2583 = (int) (Math.sin((double) class234.field3224 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2599 = 2047;
                arg1.field2444 = 5;
                arg1.field2487 = class339.method1975(class427.field6264.field2034, 0);
                arg1.field2463 = class427.field6264.field6030;
                arg1.field2516 = class427.field6264.field6100;
                arg1.field2486 = class427.field6264.field6074;
                arg1.field2508 = 0;
            }
        }
    }
}
