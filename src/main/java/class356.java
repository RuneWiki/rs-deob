import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class356 extends class270 {

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field4670 = 0;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "Z")
    public static boolean field4671 = true;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "J")
    public long field4676;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Lpp;")
    public class356 field4673;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Lpp;")
    public class356 field4675;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Z")
    public final boolean method1966(int arg0) {
        field4674++;
        if (this.field4675 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                method1967(null, -53, true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method1967(byte[] arg0, int arg1, boolean arg2) {
        field4672++;
        int var3 = -37 / ((arg1 + 64) / 45);
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class386.field5154) {
            try {
                class40 var4 = (class40) Class.forName("rf").getDeclaredConstructor().newInstance();
                var4.method211(-114, arg0);
                return var4;
            } catch (Throwable var5) {
                class386.field5154 = true;
            }
        }
        return arg2 ? class377.method2069(arg0, (byte) 120) : arg0;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
    public final void method1968(byte arg0) {
        field4669++;
        if (arg0 > -79) {
            this.field4676 = -104L;
        }
        if (this.field4675 != null) {
            this.field4675.field4673 = this.field4673;
            this.field4673.field4675 = this.field4675;
            this.field4673 = null;
            this.field4675 = null;
        }
    }
}
