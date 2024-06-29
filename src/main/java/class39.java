import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class39 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "J")
    public static long field526 = 0L;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "J")
    public static long field527 = 0L;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lei;")
    public static class175 field524;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lam;")
    public static class180 field525;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
    public static int[] field523;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
    public static int[] field530;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([Lrf;IZIII)V")
    public static final void method230(class289[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field529++;
        for (int var6 = arg3; var6 < arg0.length; var6++) {
            class289 var7 = arg0[var6];
            if (var7 != null && var7.field4451 == arg5) {
                class283.method1864(var7, arg3 - 85, arg2, arg4, arg1);
                class133.method817(0, arg1, arg4, var7);
                if (var7.field4423 - var7.field4478 < var7.field4396) {
                    var7.field4396 = var7.field4423 - var7.field4478;
                }
                if (var7.field4396 < 0) {
                    var7.field4396 = 0;
                }
                if ((var7.field4558 - var7.field4444) < var7.field4460) {
                    var7.field4460 = var7.field4558 - var7.field4444;
                }
                if (var7.field4460 < 0) {
                    var7.field4460 = 0;
                }
                if (var7.field4394 == 0) {
                    class163.method1010(arg2, var7, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method231(boolean arg0) {
        if (class192.field2958 != null) {
            class192.field2958.method438(2000);
        }
        if (!arg0) {
            field528++;
            if (class147.field2144 != null) {
                class147.field2144.method438(2000);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method232(int arg0) {
        field530 = null;
        field524 = null;
        field523 = null;
        field525 = null;
        if (arg0 != 0) {
            method232(44);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static final void method233(int arg0) {
        field532++;
        for (int var1 = 0; var1 < 5; var1++) {
            class49.field789[var1] = false;
        }
        if (arg0 != 26611) {
            field531 = 3;
        }
        class253.field3837 = 5;
        class37.field510 = 0;
        class293.field4618 = -1;
        class49.field785 = 0;
        class85.field1355 = -1;
    }
}
