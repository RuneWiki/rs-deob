import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class162 implements class262 {

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "Lei;")
    private class194 field2161;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "I")
    public static int field2160 = 0;

    @OriginalMember(owner = "client!sia", name = "h", descriptor = "Z")
    public static boolean field2164 = false;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!sia", name = "g", descriptor = "Lwm;")
    public static class30 field2163;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)Z")
    public final boolean method1034(int arg0) {
        if (arg0 == -32160) {
            field2157++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)V")
    public final void method1035(int arg0) {
        field2162++;
        if (arg0 != 27889) {
            this.method1035(-124);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V")
    public final void method835(boolean arg0, int arg1) {
        field2159++;
        if (arg0) {
            class576.field7320.method921(0, 0, class372.field4550, class463.field6021, this.field2161.field2700, 0);
        }
        if (arg1 != 24726) {
            this.method1034(117);
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
    public static void method1036(byte arg0) {
        field2163 = null;
        if (arg0 > -30) {
            method1036((byte) 0);
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lei;)V")
    public class162(class194 arg0) {
        this.field2161 = arg0;
    }
}
