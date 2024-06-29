import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 extends class640 {

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field184 = new String[] { method105(method104("askK ")), method105(method104("askI ")), method105(method104("askJ ")), method105(method104("w<k&u")), method105(method104("bg)d")) };

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Ljava/lang/String;")
    public String field183;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 5)
    public static final void method101(int arg0, int arg1) {
        try {
            field179++;
            int var2 = -65 % ((arg0 + 22) / 60);
            class130.field1524.method1557(arg1, (byte) -114);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field184[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 15)
    public static final byte[] method102(boolean arg0, Object arg1, int arg2) {
        try {
            field181++;
            if (arg1 == null) {
                return null;
            } else if (arg1 instanceof byte[]) {
                byte[] var3 = (byte[]) arg1;
                return arg0 ? class324.method2753(var3, false) : var3;
            } else if (arg1 instanceof class307) {
                class307 var4 = (class307) arg1;
                return var4.method824((byte) -12);
            } else if (arg2 == -1) {
                throw new IllegalArgumentException();
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field184[2] + arg0 + ',' + (arg1 == null ? field184[4] : field184[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)V", line = 57)
    public static final void method103(int arg0, byte arg1) {
        try {
            if (arg1 != 127) {
                method101(57, -14);
            }
            class180.field2496 = 100;
            class84.field942 = -1;
            class599.field8812 = arg0;
            field178++;
            class352.field5439 = 3;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field184[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method104(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method105(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
