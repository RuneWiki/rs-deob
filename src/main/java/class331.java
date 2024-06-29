import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class331 {

    @OriginalMember(owner = "client!is", name = "e", descriptor = "D")
    public static double field4878;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBZ)Lgh;")
    public static final class48 method2130(int arg0, byte arg1, boolean arg2) {
        field4874++;
        class564[] var3 = class472.field6858;
        synchronized (class472.field6858) {
            class48 var4;
            if (arg0 >= class472.field6858.length || class472.field6858[arg0].method3263((byte) 88)) {
                var4 = new class48();
                var4.field795 = new class385[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field795[var5] = new class385();
                }
            } else {
                var4 = (class48) class472.field6858[arg0].method3267(-4);
                var4.method3610(-25057);
                int var10002 = class736.field10371[arg0]--;
            }
            if (arg1 != 92) {
                field4876 = 11;
            }
            var4.field794 = arg2;
            return var4;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)V")
    public static final void method2131(byte arg0, int arg1) {
        class292.field4496.method68(-16878, arg1);
        if (arg0 <= -78) {
            field4877++;
            class577.field8175.method68(-16878, arg1);
            class688.field9772.method68(-16878, arg1);
            class279.field4264.method68(-16878, arg1);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
    public static final void method2132(boolean arg0) {
        if (!arg0) {
            field4876 = -82;
        }
        field4875++;
        if (!class434.method2688((byte) 51)) {
            return;
        }
        if (class8.field84 == null) {
            class640.method3619(30901);
        }
        class624.field8743 = true;
        class138.field2172 = 0;
    }
}
