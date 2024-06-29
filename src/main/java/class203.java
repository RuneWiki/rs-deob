import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class203 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Ljm;")
    public static class485 field2884 = new class485(50, -1);

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "B")
    public byte field2885;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Ljava/lang/String;")
    public String field2887;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Ljava/lang/String;")
    public String field2889;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Ljava/lang/String;")
    public String field2890;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Ljava/lang/String;")
    public String field2891;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public static void method1238(boolean arg0) {
        if (!arg0) {
            method1240(-118, -48, -57);
        }
        field2884 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z")
    public static final boolean method1239(int arg0, int arg1, int arg2) {
        if (arg2 < 36) {
            field2884 = null;
        }
        field2888++;
        return class425.method2539(arg1, arg0, -30001) & class186.method1117(2048, arg0, arg1);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)Z")
    public static final boolean method1240(int arg0, int arg1, int arg2) {
        if (arg2 == 7041) {
            field2886++;
            return false;
        } else {
            return true;
        }
    }
}
