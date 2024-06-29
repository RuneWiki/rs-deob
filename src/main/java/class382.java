import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class382 extends class102 {

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[I")
    public static int[] field5550 = new int[4096];

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public int field5542;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lnc;")
    public class126 field5548;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lqs;")
    public static class438 field5544;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[Lkd;")
    public class330[] field5543;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILii;)Z", line = 10)
    public final boolean method2470(int arg0, int arg1, int arg2, class405 arg3) {
        field5540++;
        if (arg1 != 3) {
            method2471((byte) 51, (class347) null, (class347) null);
        }
        if (this.field5543 != null) {
            for (int var5 = 0; var5 < this.field5543.length; var5++) {
                if (this.field5543[var5].method2192(arg0, arg2) && this.field5548.method119(arg0, arg2, false, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLlm;Llm;)V", line = 43)
    public static final void method2471(byte arg0, class347 arg1, class347 arg2) {
        class354.field5127 = arg2;
        field5549++;
        if (arg0 >= 34) {
            class188.field2527 = arg1;
            class162.field2172 = class188.field2527.method2272(83, 3);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 65)
    public static void method2472(int arg0) {
        field5544 = null;
        field5550 = null;
        if (arg0 != -10250) {
            field5550 = null;
        }
    }
}
