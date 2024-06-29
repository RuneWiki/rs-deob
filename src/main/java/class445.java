import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class445 extends class223 {

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field6561 = new String[] { method3463(method3462(")K\u001b}\u0001")), method3463(method3462(")K\u001bx\u0001")), method3463(method3462(")K\u001by\u0001")), method3463(method3462(")K\u001b{\u0001")), method3463(method3462(")K\u001bz\u0001")) };

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field6560 = 0;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "Lmv;")
    public static class125 field6559 = new class125(54, 6);

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[B")
    private byte[] field6554;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V")
    public final void method1868(byte arg0, int arg1, int arg2) {
        try {
            field6556++;
            if (arg1 >= 4) {
                int var4 = arg2 * 2;
                int var5 = arg0 & 0xFF;
                int var8 = var4 + 1;
                this.field6554[var4] = -1;
                this.field6554[var8] = (byte) (var5 * 3 >> 5);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6561[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZBZ)V")
    public static final void method3458(boolean arg0, byte arg1, boolean arg2) {
        try {
            field6558++;
            if (arg2) {
                class73.field1060++;
                class290.method2353(false);
            }
            if (arg1 <= 13) {
                method3458(true, (byte) 67, true);
            }
            if (arg0) {
                class301.field4184++;
                class200.method1723(1307045008);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6561[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V")
    public static void method3459(byte arg0) {
        try {
            if (arg0 == 39) {
                field6559 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6561[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)[B")
    public final byte[] method3460(int arg0, byte arg1, int arg2, int arg3) {
        try {
            field6557++;
            this.field6554 = new byte[arg3 * 2 * arg0 * arg2];
            this.method5049((byte) -48, arg2, arg0, arg3);
            int var5 = -9 % ((arg1 - 28) / 49);
            return this.field6554;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6561[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class445() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3461(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 == 124) {
                field6555++;
                return class168.method1412(arg0, arg2, false) | (arg2 & 0x70000) != 0 || class669.method4817(arg0, (byte) 121, arg2);
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6561[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3462(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3463(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
