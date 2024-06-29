import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class306 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5431 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field5433 = new Random();

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[I")
    public static int[] field5435 = new int[1000];

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field5439 = -1;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lom;")
    public static class70 field5434;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lom;")
    public static class70 field5436;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "[Lml;")
    public static class132[] field5437;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "[[[I")
    public static int[][][] field5440;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 7)
    public static void method2175(byte arg0) {
        field5431 = null;
        field5436 = null;
        field5435 = null;
        field5433 = null;
        field5440 = (int[][][]) null;
        if (arg0 != 68) {
            field5436 = (class70) null;
        }
        field5437 = null;
        field5434 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V", line = 258)
    public static final void method2176(byte arg0) {
        if (arg0 >= -41) {
            field5431 = (Calendar) null;
        }
        if (class101.field1892 != null) {
            class254 var1 = class101.field1892;
            synchronized (class101.field1892) {
                class101.field1892 = null;
            }
        }
        field5429++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZII)I", line = 275)
    public static final int method2177(boolean arg0, int arg1, int arg2) {
        field5428++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (arg0) {
                return -18;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }
}
