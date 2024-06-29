import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class349 {

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Z")
    public boolean field5002;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lup;")
    public class342 field5001;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lup;")
    public class342 field5003;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
    public static boolean field4995;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Z")
    public boolean field4997;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsu;")
    public static final class146 method2124(Throwable arg0, String arg1) {
        field4998++;
        class146 var2;
        if ((arg0 instanceof class146)) {
            var2 = (class146) arg0;
            var2.field2243 = var2.field2243 + ' ' + arg1;
        } else {
            var2 = new class146(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
    public final boolean method2125(int arg0) {
        int var2 = -93 % ((-arg0 - 32) / 62);
        field4996++;
        return this.field4997 && !this.field5002;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final void method2126(int arg0) {
        if (this.field5001 != null) {
            this.field5001.method249(12416);
        }
        field5000++;
        this.field4997 = false;
        if (arg0 != 32) {
            this.method2126(24);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Z)V")
    public class349(boolean arg0) {
        this.field5002 = arg0;
    }
}
