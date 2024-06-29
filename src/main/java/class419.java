import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class419 {

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "Loo;")
    public static class41 field5592 = new class41();

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "J")
    public static long field5593;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 6)
    public static void method2348(int arg0) {
        field5592 = null;
        if (arg0 != 988355684) {
            method2350((byte) 122, 112, (char) 65504);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)Lwj;", line = 16)
    public static final class315 method2349(byte arg0, int arg1) {
        field5591++;
        class287[] var2 = class594.field8381;
        synchronized (class594.field8381) {
            if (arg0 <= 116) {
                method2350((byte) 0, 2, 'R');
            }
            class315 var3;
            if (arg1 >= class594.field8381.length || class594.field8381[arg1].method1671((byte) -115)) {
                var3 = new class315();
                var3.field3912 = new class374[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field3912[var4] = new class374();
                }
            } else {
                var3 = (class315) class594.field8381[arg1].method1667(20814);
                var3.method1821(115);
                int var10002 = class436.field6146[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BIC)I", line = 53)
    public static final int method2350(byte arg0, int arg1, char arg2) {
        field5594++;
        int var3 = arg2 << 4;
        if (arg0 != 73) {
            method2350((byte) 4, -91, '/');
        }
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }
}
