import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class440 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lcu;")
    public static class219 field6380 = new class219();

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field6390 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field6388;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Loh;")
    public static class404 field6389;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static void method2742(boolean arg0) {
        field6380 = null;
        if (arg0) {
            field6389 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)I")
    public static final int method2743(int arg0, byte arg1, int arg2) {
        field6384++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = -127 % ((arg1 - 37) / 40);
            int var4 = (arg2 & 0x7F) * arg0 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
    public static final void method2744(int arg0, int arg1) {
        field6381++;
        class47 var2 = class258.method1546(arg0, arg1, (byte) 121);
        var2.method274(false);
    }
}
