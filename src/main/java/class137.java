import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class137 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
    public static int[] field2356 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lhi;")
    public static class82 field2358 = class95.method664((byte) -32, "<img=0>");

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2359 = Calendar.getInstance();

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lna;")
    public static class22 field2361 = new class22();

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lqc;")
    public static class329 field2362 = new class329(16);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Lem;", line = 72)
    public static final class90 method932(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        return var3 == null ? null : var3.field171;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZ)V", line = 127)
    public static final void method933(boolean arg0, boolean arg1) {
        field2360++;
        class146.field2468 = arg0;
        if (!arg1) {
            method932(-66, 15, -106);
        }
        class307.field5230 = !class123.method841(false);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 188)
    public static void method934(byte arg0) {
        if (arg0 >= -70) {
            return;
        }
        field2358 = null;
        field2361 = null;
        field2359 = null;
        field2356 = null;
        field2362 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 220)
    public static final void method935(byte arg0) {
        if (arg0 <= -53) {
            field2355++;
            class28.field378++;
        }
    }
}
