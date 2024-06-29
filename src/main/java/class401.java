import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class401 {

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "Lkc;")
    public class145 field5522 = null;

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "Lda;")
    public class67 field5521 = null;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lda;)V", line = 55)
    public class401(class67 arg0) {
        this.field5521 = arg0;
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lda;Lkc;)V", line = 62)
    public class401(class67 arg0, class145 arg1) {
        this.field5522 = arg1;
        this.field5521 = arg0;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2402(int arg0) {
        field5523++;
        if (arg0 != 0 || !class41.field664) {
            return;
        }
        while (true) {
            while (class18.field426.length > class344.field4633) {
                class732 var1 = class18.field426[class344.field4633];
                if (var1 != null && var1.field10097 == -1) {
                    if (class224.field3278 == null) {
                        class224.field3278 = class111.field1848.method1625(var1.field10099, (byte) -123);
                    }
                    int var2 = class224.field3278.field5444;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field10097 = var2;
                    class344.field4633++;
                    class224.field3278 = null;
                } else {
                    class344.field4633++;
                }
            }
            return;
        }
    }
}
