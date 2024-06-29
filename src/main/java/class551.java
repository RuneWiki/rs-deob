import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class551 extends class348 {

    @OriginalMember(owner = "client!eka", name = "n", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8040;

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8051 = new String[] { method4128(method4127("2&\u000fa\u007f\u007f")), method4128(method4127("2&\u000faz\u007f")), method4128(method4127("2&\u000fa~\u007f")), method4128(method4127("2&\u000fax\u007f")), method4128(method4127("2&\u000fay\u007f")), method4128(method4127("2&\u000fa\u0000>#\u0007;\u0002\u007f")) };

    @OriginalMember(owner = "client!eka", name = "p", descriptor = "Lsb;")
    public static class261 field8043 = new class261(45, 4);

    @OriginalMember(owner = "client!eka", name = "u", descriptor = "[Lm;")
    public static class781[] field8047 = new class781[75];

    @OriginalMember(owner = "client!eka", name = "q", descriptor = "Lop;")
    public static class574 field8048 = new class574("", 11);

    @OriginalMember(owner = "client!eka", name = "m", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!eka", name = "k", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!eka", name = "o", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!eka", name = "t", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!eka", name = "s", descriptor = "Llga;")
    public static class47 field8050;

    @OriginalMember(owner = "client!eka", name = "r", descriptor = "[Lpja;")
    public static class403[] field8046;

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "(I)V")
    public static final void method4122(int arg0) {
        try {
            class759.field10834 = new class441[50];
            class347.field5048 = 0;
            if (arg0 != 4) {
                method4126(6);
            }
            field8049++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8051[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "(B)V")
    public static final void method4123(byte arg0) {
        try {
            field8044++;
            if (class299.field4169) {
                if (arg0 != -67) {
                    method4126(2);
                }
                while (true) {
                    while (class474.field6955 < class390.field5689.length) {
                        class728 var1 = class390.field5689[class474.field6955];
                        if (var1 != null && var1.field10432 == -1) {
                            if (class536.field7771 == null) {
                                class536.field7771 = class703.field9829.method4192((byte) -122, var1.field10437);
                            }
                            int var2 = class536.field7771.field7709;
                            if (var2 == -1) {
                                return;
                            }
                            var1.field10432 = var2;
                            class536.field7771 = null;
                            class474.field6955++;
                        } else {
                            class474.field6955++;
                        }
                    }
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8051[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V")
    public class551(int arg0) {
        try {
            this.field8040 = new NativeHeap(arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8051[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)V")
    public static void method4124(byte arg0) {
        try {
            field8047 = null;
            field8048 = null;
            field8043 = null;
            field8046 = null;
            field8050 = null;
            int var1 = -35 % ((arg0 + 20) / 35);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8051[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)V")
    public final void method4125(int arg0) {
        try {
            this.field8040.method3188();
            field8041++;
            if (arg0 != 4) {
                method4126(66);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8051[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)Ldm;")
    public static final class274 method4126(int arg0) {
        try {
            field8042++;
            return class363.field5266 == arg0 ? new class274() : class741.field10534[--class363.field5266];
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8051[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4127(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4128(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
