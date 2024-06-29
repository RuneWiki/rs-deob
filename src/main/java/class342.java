import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class342 extends class376 {

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Ljava/lang/String;")
    public String field4787;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method2199(boolean arg0) {
        class376.field5360.method1249(1);
        field4785++;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)Lgp;", line = 18)
    public static final class31 method2200(byte arg0) {
        if (arg0 > -82) {
            return null;
        } else {
            field4786++;
            class429.field6168 = 0;
            return class179.method1189(-26);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V", line = 38)
    public class342() {
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Lpo;", line = 42)
    public static final class331 method2201(int arg0) {
        field4788++;
        class331 var1 = (class331) class378.field5393.method2314((byte) 75);
        if (var1 == null) {
            int var2 = 26 / ((arg0 - 78) / 48);
            return new class331();
        } else {
            class373.field5321--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 61)
    public class342(String arg0, int arg1) {
        this.field4787 = arg0;
    }
}
