import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class301 extends class120 implements Runnable {

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public int field4326 = -1;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "Z")
    private boolean field4327 = true;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "Lbk;")
    private class32 field4320;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4324 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!pr", name = "run", descriptor = "()V")
    public final void run() {
        field4325++;
        while (this.field4327) {
            this.field4320.method272(this, (byte) 23);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
    public static final boolean method1906(int arg0) {
        field4323++;
        class411 var1 = class310.field4436;
        synchronized (class310.field4436) {
            if (class318.field4544 == class284.field4149) {
                return false;
            }
            int var3 = 53 % ((-arg0 - 11) / 58);
            class122.field1633 = class154.field2015[class318.field4544];
            class157.field2066 = class66.field935[class318.field4544];
            class318.field4544 = class318.field4544 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    public static void method1907(int arg0) {
        field4324 = null;
        if (arg0 >= -3) {
            field4324 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
    public final void method1908(byte arg0) {
        this.field4327 = false;
        field4322++;
        if (arg0 <= 69) {
            method1907(32);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
    public final void method1909(byte arg0) {
        (new Thread(this, "a")).start();
        field4321++;
        if (arg0 < 71) {
            this.field4327 = false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lbk;)V")
    public class301(class32 arg0) {
        this.field4320 = arg0;
    }
}
