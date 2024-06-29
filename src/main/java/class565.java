import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class565 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lio;")
    public static class151 field8080;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "J")
    public static long field8086;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lgp;")
    public static class561 field8087;

    static {
        new class567("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field8082 = 0;
        field8080 = new class151(2, 4, 4, 0);
        field8086 = -1L;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 11)
    public static void method3214(int arg0) {
        int var1 = -35 / ((arg0 + 46) / 45);
        field8080 = null;
        field8087 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 23)
    public static final void method3215(byte arg0) {
        class307.method1904(true, 10);
        field8085++;
        class206.method1327((byte) 2);
        System.gc();
        if (arg0 != -76) {
            field8087 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Z", line = 39)
    public static final boolean method3216(boolean arg0) {
        if (!arg0) {
            method3216(true);
        }
        field8083++;
        return class563.field8065 != class47.field657 || class602.field8571 >= 2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V", line = 59)
    public static final void method3217(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            method3217(-49, -75, 96);
        }
        if (class359.field5100 == 1) {
            class127.method1001(82, class361.field5125, arg2, arg1);
        } else if (class359.field5100 == 2) {
            class355.method2159(arg2, arg1, (byte) 124);
        }
        field8084++;
        class361.field5125 = null;
        class359.field5100 = 0;
    }
}
