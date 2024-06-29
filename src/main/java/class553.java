import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class553 extends class223 {

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field8068 = new String[] { method4138(method4137("\r6\f\r4")), method4138(method4137("\r6\f\u000e4")), method4138(method4137("\r6\f\u000f4")), method4138(method4137("\r6\f\f4")), method4138(method4137("\u0006y\fia")), method4138(method4137("\u0013\"N+")), method4138(method4137("\r6\f\u000b4")) };

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "[J")
    public static long[] field8064 = new long[32];

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "Lsb;")
    public static class261 field8062 = new class261(40, -1);

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "Lsb;")
    public static class261 field8066 = new class261(70, 6);

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "Llb;")
    public static class329 field8067;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Lo;")
    public static class484 field8060;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "[B")
    private byte[] field8065;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 8)
    public static final boolean method4133(String arg0, int arg1) {
        try {
            field8063++;
            if (arg0 == null) {
                return false;
            }
            for (int var2 = arg1; var2 < class692.field9683; var2++) {
                if (arg0.equalsIgnoreCase(class599.field8597[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class46.field657[var2])) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8068[6] + (arg0 == null ? field8068[5] : field8068[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V", line = 33)
    public static void method4134(byte arg0) {
        try {
            field8060 = null;
            field8062 = null;
            field8066 = null;
            field8064 = null;
            if (arg0 >= -40) {
                method4133(null, -43);
            }
            field8067 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8068[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 48)
    public class553() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)V", line = 51)
    public final void method1868(byte arg0, int arg1, int arg2) {
        try {
            field8061++;
            int var4 = arg2 * 2;
            if (arg1 < 4) {
                this.field8065 = null;
            }
            int var5 = arg0 & 0xFF;
            this.field8065[var4++] = (byte) (var5 * 3 >> 5);
            this.field8065[var4] = (byte) (var5 * 3 >> 5);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8068[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBII)[B", line = 67)
    public final byte[] method4135(int arg0, byte arg1, int arg2, int arg3) {
        try {
            this.field8065 = new byte[arg0 * 2 * arg2 * arg3];
            field8059++;
            this.method5049((byte) -48, arg2, arg0, arg3);
            int var5 = -31 % ((arg1 - 28) / 49);
            return this.field8065;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8068[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)Z", line = 87)
    public static final boolean method4136(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 32) {
                field8058++;
                return (arg0 & 0x20) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8068[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4137(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4138(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
