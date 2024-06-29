import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lre;")
    private class107 field354 = new class107();

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lrc;")
    public static class105 field358 = class43.method374("Absender:", 0);

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field361 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lrc;")
    private static class105 field350 = class43.method374(" from your friend list first", 0);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lrc;")
    public static class105 field351 = field350;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lmb;")
    public static class74 field349 = new class74(32);

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "[Ljb;")
    public static class56[] field368 = new class56[4];

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/util/Calendar;")
    public static Calendar field367 = Calendar.getInstance();

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lpb;")
    public static class92 field366;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Z")
    public static boolean field369;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[Leb;")
    public static class27[] field355;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lmc;Z)V", line = 11)
    public static final void method179(class75 arg0, boolean arg1) {
        if (!arg1) {
            method181(-112);
        }
        field357++;
        class34.field792 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILre;)V", line = 22)
    public final void method180(int arg0, class107 arg1) {
        if (arg1.field2456 != null) {
            arg1.method874(true);
        }
        arg1.field2450 = this.field354.field2450;
        field359++;
        arg1.field2456 = this.field354;
        if (arg0 != 32) {
            field355 = null;
        }
        arg1.field2456.field2450 = arg1;
        arg1.field2450.field2456 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 44)
    public static void method181(int arg0) {
        field349 = null;
        field355 = null;
        field366 = null;
        field367 = null;
        field350 = null;
        field368 = null;
        if (arg0 == 0) {
            field351 = null;
            field358 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLre;)V", line = 62)
    public final void method182(byte arg0, class107 arg1) {
        field360++;
        if (arg1.field2456 != null) {
            arg1.method874(true);
        }
        arg1.field2456 = this.field354.field2456;
        arg1.field2450 = this.field354;
        arg1.field2456.field2450 = arg1;
        if (arg0 == 92) {
            arg1.field2450.field2456 = arg1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 150)
    public class17() {
        this.field354.field2450 = this.field354;
        this.field354.field2456 = this.field354;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Lre;", line = 89)
    public final class107 method183(int arg0) {
        field363++;
        class107 var2 = this.field354.field2450;
        if (arg0 != 0) {
            field355 = null;
        }
        return this.field354 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Lre;", line = 128)
    public final class107 method184(int arg0) {
        if (arg0 != 18186) {
            this.method182((byte) 88, null);
        }
        field353++;
        class107 var2 = this.field354.field2450;
        if (this.field354 == var2) {
            return null;
        } else {
            var2.method874(true);
            return var2;
        }
    }
}
