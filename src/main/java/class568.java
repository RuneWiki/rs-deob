import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class568 implements class343 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Ljava/lang/String;")
    private String field8082;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ltf;")
    private class701 field8079;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "J")
    public static long field8083;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lr;")
    public static class564 field8078;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)Ldea;", line = 6)
    public final class446 method584(byte arg0) {
        field8085++;
        if (arg0 >= -64) {
            this.field8082 = null;
        }
        return class446.field6290;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 18)
    public static void method3219(byte arg0) {
        if (arg0 <= 60) {
            method3222(false);
        }
        field8078 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqq;B)V", line = 30)
    public static final void method3220(class653 arg0, byte arg1) {
        if (arg1 < 8) {
            field8078 = null;
        }
        class359.field4830.method3425(arg0, false);
        field8080++;
        arg0.field9157 = arg0.field9158.field1218;
        class530.field7470 += arg0.field9157;
        arg0.field9158.field1218 = 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I", line = 46)
    public final int method587(int arg0) {
        field8084++;
        if (arg0 == 9856) {
            return this.field8079.method3870(this.field8082, 8081) ? 100 : this.field8079.method3880(this.field8082, true);
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z", line = 61)
    public static final boolean method3221(int arg0, int arg1, int arg2) {
        field8077++;
        if (arg1 >= 0 && arg0 >= 0 && class16.field131[1].length > arg1 && class16.field131[1][arg1].length > arg0) {
            return (class16.field131[1][arg1][arg0] & 0x2) != arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 77)
    public static final void method3222(boolean arg0) {
        class130.method741(class497.field7199, 26034);
        field8081++;
        class338.field4254++;
        if (class600.field8465 && class473.field6815) {
            int var1 = class108.field1166.method253(arg0);
            int var2 = class108.field1166.method252(7);
            int var3 = var1 - class471.field6758;
            int var4 = var2 - class102.field1109;
            if (var3 < class697.field9781) {
                var3 = class697.field9781;
            }
            if (class697.field9781 + class480.field6918.field6483 < class497.field7199.field6483 + var3) {
                var3 = class480.field6918.field6483 + class697.field9781 - class497.field7199.field6483;
            }
            if (var4 < class546.field7802) {
                var4 = class546.field7802;
            }
            if (class546.field7802 + class480.field6918.field6443 < class497.field7199.field6443 + var4) {
                var4 = class546.field7802 + class480.field6918.field6443 - class497.field7199.field6443;
            }
            int var5 = class480.field6918.field6414 + var3 - class697.field9781;
            int var6 = class480.field6918.field6451 + var4 - class546.field7802;
            if (class108.field1166.method3211(-15540)) {
                if (class497.field7199.field6453 < class338.field4254) {
                    int var8 = var3 - class215.field2607;
                    int var9 = var4 - class677.field9494;
                    if (class497.field7199.field6385 < var8 || var8 < (-class497.field7199.field6385) || class497.field7199.field6385 < var9 || var9 < (-class497.field7199.field6385)) {
                        class323.field3980 = true;
                    }
                }
                if (class497.field7199.field6478 != null && class323.field3980) {
                    class213 var10 = new class213();
                    var10.field2592 = class497.field7199;
                    var10.field2587 = class497.field7199.field6478;
                    var10.field2586 = var6;
                    var10.field2584 = var5;
                    class281.method1642(var10);
                }
            } else {
                if (class323.field3980) {
                    class204.method1218(-100);
                    if (class497.field7199.field6429 != null) {
                        class213 var7 = new class213();
                        var7.field2593 = class593.field8377;
                        var7.field2592 = class497.field7199;
                        var7.field2586 = var6;
                        var7.field2587 = class497.field7199.field6429;
                        var7.field2584 = var5;
                        class281.method1642(var7);
                    }
                    if (class593.field8377 != null && client.method3760(class497.field7199) != null) {
                        class289.method1685(class497.field7199, class593.field8377, (byte) -115);
                    }
                } else if ((class436.field6145 == 1 || class602.method3370(-2001)) && class661.field9266 > 2) {
                    class277.method1618((byte) 52, class677.field9494 + class102.field1109, class471.field6758 + class215.field2607);
                } else if (class670.method3707((byte) -76)) {
                    class277.method1618((byte) 52, class677.field9494 + class102.field1109, class471.field6758 - -class215.field2607);
                }
                class497.field7199 = null;
            }
        } else if (class338.field4254 > 1) {
            class497.field7199 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Ltf;Ljava/lang/String;)V", line = 187)
    public class568(class701 arg0, String arg1) {
        this.field8082 = arg1;
        this.field8079 = arg0;
    }
}
