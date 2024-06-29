import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class399 {

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
    public static final void method2451(byte arg0) {
        field5806++;
        class419.field6038.method1913(true);
        class22.field867.method1913(true);
        class366.field5424.method1913(true);
        class341.field5071.method1913(true);
        int var1 = -43 / ((arg0 + 52) / 59);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILqh;)Lmfa;")
    public static final class573 method2452(int arg0, class61 arg1) {
        field5804++;
        arg1.method732(-559537960);
        int var2 = arg1.method732(-559537960);
        class573 var3 = class377.method2365(var2, -28);
        var3.field8315 = arg1.method732(-559537960);
        int var4 = arg1.method732(-559537960);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method732(-559537960);
            var3.method443(arg1, var6, 3);
        }
        if (arg0 > -104) {
            method2451((byte) -101);
        }
        var3.method617(4095);
        return var3;
    }
}
