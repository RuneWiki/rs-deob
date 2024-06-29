import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class207 {

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "[Lag;")
    private class123[] field3276;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[S")
    public static short[] field3272 = new short[256];

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3273 = "Loading title screen - ";

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field3271 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3270 = Calendar.getInstance();

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Lpk;")
    public static class120 field3278;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[[B")
    public static byte[][] field3277;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Llk;Z)V", line = 12)
    public static final void method1526(class294 arg0, boolean arg1) {
        int var2 = arg0.field4627 - class307.field4869;
        field3274++;
        int var3 = arg0.field4701 * 128 + (arg0.method738(-6421) * 64);
        int var4 = arg0.field4644 * 128 + arg0.method738(-6421) * 64;
        arg0.field4707 = 0;
        if (arg0.field4608 == 0) {
            arg0.field4630 = 1024;
        }
        if (arg1) {
            return;
        }
        arg0.field4671 += (var3 - arg0.field4671) / var2;
        if (arg0.field4608 == 1) {
            arg0.field4630 = 1536;
        }
        arg0.field4672 += (var4 - arg0.field4672) / var2;
        if (arg0.field4608 == 2) {
            arg0.field4630 = 0;
        }
        if (arg0.field4608 == 3) {
            arg0.field4630 = 512;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lph;B)V", line = 63)
    public static final void method1527(class86 arg0, byte arg1) {
        field3275++;
        int var2 = -20 % ((arg1 + 72) / 43);
        for (class71 var3 = (class71) class76.field1176.method268(-1); var3 != null; var3 = (class71) class76.field1176.method278(1)) {
            if (var3.field1076 == arg0) {
                if (var3.field1089 != null) {
                    class181.field2877.method2345(var3.field1089);
                    var3.field1089 = null;
                }
                var3.method489(false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 107)
    public static void method1528(int arg0) {
        if (arg0 != -9359) {
            field3278 = (class120) null;
        }
        field3270 = null;
        field3272 = null;
        field3273 = null;
        field3278 = null;
        field3277 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(I)V", line = 131)
    public class207(int arg0) {
        this.field3276 = new class123[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class123 var3 = this.field3276[var2] = new class123();
            var3.field2001 = var3;
            var3.field2000 = var3;
        }
    }
}
