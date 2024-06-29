import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class142 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!hq", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field1773++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 17)
    public static final void method931(String arg0, int arg1) {
        field1772++;
        if (arg0.equals("")) {
            return;
        }
        class652.field9223++;
        class543 var2 = class299.method1780(class84.field1196, class395.field5586, 108);
        var2.field7872.method2281((byte) 58, class251.method1534(arg0, (byte) 113));
        var2.field7872.method2269(arg0, -104);
        int var3 = -110 / ((arg1 + 35) / 53);
        class511.method3028(7482, var2);
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 35)
    public class142(String arg0, int arg1) {
        this.field1771 = arg1;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V", line = 47)
    public static final void method932(byte arg0) {
        field1774++;
        for (int var1 = 0; var1 < 100; var1++) {
            class265.field3643[var1] = null;
        }
        if (arg0 > 40) {
            class288.field3879 = 0;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lwd;ILjava/lang/Object;)V", line = 66)
    public static final void method933(class248 arg0, int arg1, Object arg2) {
        field1775++;
        if (arg1 != -51) {
            method933(null, -74, null);
        }
        if (arg0.field3395 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field3395.peekEvent() != null; var3++) {
            class151.method974((byte) -102, 1L);
        }
        try {
            if (arg2 != null) {
                arg0.field3395.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }
}
