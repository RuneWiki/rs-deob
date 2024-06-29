import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class139 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2394 = "Loaded input handler";

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field2398 = 0;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field2396 = -2;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lrc;")
    public static class9 field2397 = new class9(4);

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "Ldl;")
    public static class46 field2404 = null;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field2403 = 0;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2394 = null;
        field2397 = null;
        field2404 = null;
        if (arg0 != 10416) {
            method981((class129) null, 120, (class129) null);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([Ldl;IZIZI)V")
    public static final void method978(class46[] arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class46 var7 = arg0[var6];
            if (var7 != null && var7.field660 == arg3) {
                class245.method1638((byte) -34, arg4, arg5, arg1, var7);
                class69.method422(110, arg5, arg1, var7);
                if (var7.field665 - var7.field701 < var7.field733) {
                    var7.field733 = var7.field665 - var7.field701;
                }
                if ((var7.field666 - var7.field715) < var7.field644) {
                    var7.field644 = var7.field666 - var7.field715;
                }
                if (var7.field733 < 0) {
                    var7.field733 = 0;
                }
                if (var7.field644 < 0) {
                    var7.field644 = 0;
                }
                if (var7.field812 == 0) {
                    class89.method580(!arg2, arg4, var7);
                }
            }
        }
        if (arg2) {
            field2394 = null;
        }
        field2400++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)V")
    public static final void method979(byte arg0, int arg1) {
        int var2 = -16 / ((arg0 + 60) / 47);
        field2395++;
        if (arg1 >= 0 && class217.field3659.length > arg1) {
            class217.field3659[arg1] = !class217.field3659[arg1];
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLvh;)V")
    public static final void method980(byte arg0, class108 arg1) {
        field2401++;
        if (arg0 != -26) {
            method981((class129) null, -1, (class129) null);
        }
        class187.field3023 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lwj;ILwj;)V")
    public static final void method981(class129 arg0, int arg1, class129 arg2) {
        if (arg0.field2258 != null) {
            arg0.method887((byte) -51);
        }
        arg0.field2261 = arg2.field2261;
        field2399++;
        arg0.field2258 = arg2;
        if (arg1 <= 50) {
            field2398 = 54;
        }
        arg0.field2258.field2261 = arg0;
        arg0.field2261.field2258 = arg0;
    }
}
