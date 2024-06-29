import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class334 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "[I")
    public int[] field4074;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1927(byte arg0) {
        field4077++;
        if (arg0 == -105) {
            class306.field3845.method2919(arg0 ^ 0xFFFFFF97);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBII)Z", line = 20)
    public static final boolean method1928(int arg0, byte arg1, int arg2, int arg3) {
        field4076++;
        if (arg1 >= -55) {
            method1927((byte) -65);
        }
        if (!class750.field10229 || !class141.field1854) {
            return false;
        } else if (class430.field5647 < 100) {
            return false;
        } else {
            int var4 = class86.field1201[arg0][arg2][arg3];
            if (-class237.field3233 == var4) {
                return false;
            } else if (class237.field3233 == var4) {
                return true;
            } else if (class735.field9973 == class116.field1542) {
                return false;
            } else {
                int var5 = arg2 << class88.field1221;
                int var6 = arg3 << class88.field1221;
                if (class239.method1574(23014, class116.field1542[arg0].method2060(arg3 + 1, -111, arg2 + 1), var5 + 1, class116.field1542[arg0].method2060(arg3, -103, arg2), var6 + 1, class722.field9480 + -1 + var6, class116.field1542[arg0].method2060(arg3 + 1, -107, arg2), var5 + 1, class722.field9480 + var6 + -1, class722.field9480 + var5 - 1) && class239.method1574(23014, class116.field1542[arg0].method2060(arg3, -91, arg2 + 1), var5 + 1, class116.field1542[arg0].method2060(arg3, -125, arg2), var6 + 1, var6 - -class722.field9480 + -1, class116.field1542[arg0].method2060(arg3 + 1, -90, arg2 + 1), class722.field9480 + var5 - 1, var6 + 1, var5 + class722.field9480 - 1)) {
                    class34.field386++;
                    class86.field1201[arg0][arg2][arg3] = class237.field3233;
                    return true;
                } else {
                    class86.field1201[arg0][arg2][arg3] = -class237.field3233;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILmc;)V", line = 69)
    private final void method1929(int arg0, class234 arg1) {
        label23: while (true) {
            int var3 = arg1.method1509(true);
            if (var3 != 0) {
                if (var3 != 1) {
                    continue;
                }
                int var4 = arg1.method1509(true);
                this.field4074 = new int[var4];
                int var5 = 0;
                while (true) {
                    if (this.field4074.length <= var5) {
                        continue label23;
                    }
                    this.field4074[var5] = arg1.method1509(true);
                    var5++;
                }
            }
            if (arg0 != -1) {
                return;
            }
            field4073++;
            return;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLjava/lang/String;)V", line = 122)
    public static final void method1930(byte arg0, String arg1) {
        field4075++;
        class310.field3887 = arg1;
        if (class80.field1134 == null) {
            return;
        }
        try {
            String var2 = class80.field1134.getParameter("cookieprefix");
            if (arg0 == 60) {
                String var3 = class80.field1134.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class757.method4116(49, class502.method2786(-7114) + 94608000000L) + "; Max-Age=" + 94608000L;
                }
                class586.method3136("document.cookie=\"" + var5 + "\"", 21424, class80.field1134);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lwm;)V", line = 156)
    public class334(class30 arg0) {
        byte[] var2 = arg0.method148((byte) -126, 6);
        this.method1929(-1, new class234(var2));
        if (this.field4074 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V", line = 169)
    protected class334() {
        this.field4074 = new int[0];
    }
}
