import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class51 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lpj;")
    private class132 field739;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "J")
    public static long field741 = -1L;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Lfd;")
    private class485 field737;

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lpj;)V", line = 7)
    public class51(class132 arg0) {
        this.field739 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lms;I)Lqt;", line = 16)
    public final class582 method368(class695 arg0, int arg1) {
        field740++;
        if (arg0 == null) {
            return null;
        }
        class295 var3 = arg0.method52(-14151);
        if (class466.field6556 == var3) {
            return new class336((class595) arg0);
        } else if (class357.field5107 == var3) {
            return new class162(this.method369(arg1 ^ 0x7DFC), (class146) arg0);
        } else if (class238.field3435 == var3) {
            return new class184(this.field739, (class479) arg0);
        } else if (class270.field3827 == var3) {
            return new class536(this.field739, (class272) arg0);
        } else if (arg1 != -1) {
            return null;
        } else if (class520.field7080 == var3) {
            return new class632((class651) arg0);
        } else if (class389.field5463 == var3) {
            return new class182(this.field739, (class11) arg0);
        } else if (class125.field1743 == var3) {
            return new class206(this.field739, (class402) arg0);
        } else if (class539.field7316 == var3) {
            return new class456((class370) arg0);
        } else if (class22.field306 == var3) {
            return new class21(this.field739, (class406) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lfd;", line = 68)
    private final class485 method369(int arg0) {
        if (this.field737 == null) {
            this.field737 = new class485();
        }
        if (arg0 != -32253) {
            this.method369(-6);
        }
        field738++;
        return this.field737;
    }
}
