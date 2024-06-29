import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class427 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field5753 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field5757 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5754 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[[Z")
    public static boolean[][] field5756;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII[Lwv;I)V", line = 3)
    public static final void method2416(int arg0, boolean arg1, int arg2, int arg3, class423[] arg4, int arg5) {
        for (int var6 = arg0; var6 < arg4.length; var6++) {
            class423 var7 = arg4[var6];
            if (var7 != null && var7.field5585 == arg2) {
                class604.method3363(var7, arg5, (byte) -97, arg1, arg3);
                class455.method2561(arg3, arg5, -70, var7);
                if (var7.field5550 > var7.field5595 - var7.field5561) {
                    var7.field5550 = var7.field5595 - var7.field5561;
                }
                if (var7.field5603 - var7.field5672 < var7.field5640) {
                    var7.field5640 = var7.field5603 - var7.field5672;
                }
                if (var7.field5550 < 0) {
                    var7.field5550 = 0;
                }
                if (var7.field5640 < 0) {
                    var7.field5640 = 0;
                }
                if (var7.field5598 == 0) {
                    class583.method3218(var7, (byte) 66, arg1);
                }
            }
        }
        field5752++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 61)
    public static void method2418(int arg0) {
        field5756 = null;
        if (arg0 >= -20) {
            method2418(-81);
        }
        field5754 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 74)
    public static final void method2419(byte arg0) {
        field5755++;
        int var1 = 80 % ((-arg0 - 61) / 42);
        if (class675.field9604 != class480.field6673) {
            try {
                class507.method2883(class386.field5153, -4200, "tbrefresh");
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([FFIIFIIIFIF)V")
    public abstract void method2417(float[] arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10);
}
