import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class445 extends class622 {

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(B)V")
    public static final void method2521(byte arg0) {
        field6148++;
        class693[] var1 = class570.field8097;
        synchronized (class570.field8097) {
            for (int var2 = 0; var2 < class570.field8097.length; var2++) {
                class570.field8097[var2] = new class693();
                class622.field8639[var2] = 0;
            }
            int var3 = -126 / ((arg0 + 4) / 60);
        }
    }
}
