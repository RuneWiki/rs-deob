import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class377 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lod;B)V", line = 12)
    public static final void method2470(class468 arg0, byte arg1) {
        field5863++;
        if (arg1 < 116) {
            return;
        }
        arg0.field6949 = null;
        int var2 = arg0.field6948.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field6948[var3].field4827 = false;
        }
        class433[] var4 = class504.field7378;
        synchronized (class504.field7378) {
            if (var2 < class504.field7378.length && class674.field9495[var2] < 200) {
                class504.field7378[var2].method2757(arg0, -1);
                int var10002 = class674.field9495[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/awt/Canvas;Lfa;)Lr;", line = 40)
    public static final class167 method2471(int arg0, Canvas arg1, class214 arg2) {
        field5864++;
        return arg0 == 0 ? new class128(arg1, arg2) : null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 51)
    public static final void method2472(byte arg0) {
        field5865++;
        class99.field1607 = 0;
        if (arg0 != -31) {
            method2471(-16, null, null);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class588.field8351[var1] = null;
            class545.field7924[var1] = 1;
            class515.field7491[var1] = null;
        }
    }
}
