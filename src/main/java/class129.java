import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class129 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lgj;")
    public class255 field2065 = new class255();

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2061 = -1;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2062 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2066 = 127;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public final void method880(byte arg0) {
        if (arg0 != 106) {
            this.field2065 = null;
        }
        field2064++;
        while (true) {
            class255 var2 = this.field2065.field4204;
            if (this.field2065 == var2) {
                return;
            }
            var2.method1727((byte) -54);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lgj;B)V")
    public final void method881(class255 arg0, byte arg1) {
        if (arg0.field4207 != null) {
            arg0.method1727((byte) -54);
        }
        if (arg1 != 21) {
            field2066 = -78;
        }
        arg0.field4204 = this.field2065;
        field2063++;
        arg0.field4207 = this.field2065.field4207;
        arg0.field4207.field4204 = arg0;
        arg0.field4204.field4207 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static void method882(byte arg0) {
        if (arg0 >= -15) {
            method882((byte) 114);
        }
        field2062 = null;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class129() {
        this.field2065.field4204 = this.field2065;
        this.field2065.field4207 = this.field2065;
    }
}
