import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class326 {

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "Ljava/lang/String;")
    public String field4514;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "Lgda;")
    public static class53 field4517 = new class53(32, 8);

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "Lnb;")
    public static class301 field4519;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V", line = 4)
    public static void method2124(byte arg0) {
        field4519 = null;
        field4517 = null;
        int var1 = -69 % ((79 - arg0) / 41);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIZJLfp;Z)V", line = 20)
    public static final void method2125(int arg0, int arg1, int arg2, int arg3, boolean arg4, long arg5, class323 arg6, boolean arg7) {
        class469.field6659 = 1;
        class444.field6316 = arg2;
        class226.field3049 = arg6;
        class681.field9343 = 10000;
        class213.field2801 = arg1;
        class98.field1182 = arg0;
        if (!arg4) {
            method2125(64, 95, 37, 109, true, -48L, null, false);
        }
        class561.field7881 = null;
        class318.field4412 = arg3;
        class750.field10412 = arg7;
        class289.field4078 = arg5;
        field4513++;
    }

    @OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;", line = 42)
    public final String toString() {
        field4518++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 55)
    public class326(String arg0, int arg1) {
        this.field4515 = arg1;
        this.field4514 = arg0;
    }
}
