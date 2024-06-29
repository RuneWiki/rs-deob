import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class25 extends class303 {

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BJ)V", line = 4)
    public static final void method169(byte arg0, long arg1) {
        field418++;
        int var3 = 22 / ((arg0 + 33) / 54);
        if (arg1 == 0L) {
            return;
        }
        for (int var4 = 0; var4 < class169.field2631; var4++) {
            if (class298.field4712[var4] == arg1) {
                class169.field2631--;
                class207.field3266++;
                for (int var5 = var4; var5 < class169.field2631; var5++) {
                    class298.field4712[var5] = class298.field4712[var5 + 1];
                    class71.field1121[var5] = class71.field1121[var5 + 1];
                }
                class169.field2625 = class200.field3157;
                class269.field4191.method246(false, 82);
                class269.field4191.method760(arg1, true);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 43)
    public class25() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[I", line = 49)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 == -3) {
            field419++;
            return class291.field4427;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 66)
    public static final void method170(int arg0) {
        if (arg0 != 0) {
            field417 = -47;
        }
        class175.field2750.method1837(arg0 ^ 0xD);
        field422++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/Object;ZLoj;)V", line = 77)
    public static final void method171(Object arg0, boolean arg1, class325 arg2) {
        field423++;
        if (arg2.field5035 == null) {
            return;
        }
        if (!arg1) {
            field421 = -74;
        }
        for (int var3 = 0; var3 < 50 && arg2.field5035.peekEvent() != null; var3++) {
            class279.method1991(115, 1L);
        }
        if (arg0 != null) {
            arg2.field5035.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }
}
