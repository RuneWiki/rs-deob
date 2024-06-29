import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class579 extends class40 {

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field8595 = new String[] { method4334(method4333("\u0003;rW)")), method4334(method4333("\u0003;rS)")), method4334(method4333("\u0003;rP)")), method4334(method4333("\u0019:3eh\u00045\n{e\u000f=\u001dv")), method4334(method4333("\u0003;rT)")), method4334(method4333("\u0003;rQ)")), method4334(method4333("\u0003;rV)")) };

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "[I")
    public static int[] field8593 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "[B")
    private byte[] field8588;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method270(int arg0, int arg1, byte arg2) {
        try {
            field8594++;
            int var4 = arg0 * 2;
            byte var7 = (byte) ((arg2 >> 1 & 0x7F) + 127);
            if (arg1 == 4096) {
                this.field8588[var4++] = var7;
                this.field8588[var4] = var7;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8595[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)[B", line = 20)
    public final byte[] method4328(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field8588 = new byte[arg0 * arg3 * arg2 * 2];
            field8591++;
            this.method1867(arg2, arg3, arg0, (byte) -100);
            if (arg1 != 17968) {
                field8593 = null;
            }
            return this.field8588;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8595[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V", line = 34)
    public static void method4329(byte arg0) {
        try {
            if (arg0 <= -34) {
                field8593 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8595[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)Z", line = 44)
    public static final boolean method4330(boolean arg0) {
        try {
            if (!arg0) {
                field8593 = null;
            }
            field8590++;
            if (class296.field4464) {
                try {
                    if ((Boolean) class600.method4461(class629.field9206, field8595[3], (byte) -76)) {
                        return false;
                    }
                    return true;
                } catch (Throwable var2) {
                }
            }
            return true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8595[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 63)
    public static final void method4331(int arg0) {
        try {
            field8589++;
            int var1 = class289.field4305.field808.method4761(false);
            if (var1 == 0) {
                class520.field7621 = null;
                class474.method3602(1, 0);
            } else if (var1 == 1) {
                class611.method4513((byte) 0, -5);
                class474.method3602(1, 512);
                if (class184.field2545 != null) {
                    class220.method1919((byte) 65);
                }
            } else {
                class611.method4513((byte) (class373.field5698 - 4 & 0xFF), -5);
                class474.method3602(1, 2);
            }
            if (arg0 > 60) {
                class16.field194 = class520.field7618;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8595[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 100)
    public class579() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Z", line = 103)
    public static final boolean method4332(int arg0, int arg1, int arg2, int arg3) {
        try {
            class440.field6490.method2392(arg0, arg1, arg3, class376.field5724);
            field8592++;
            int var4 = class376.field5724[2];
            if (arg2 != 5) {
                field8593 = null;
            }
            if (var4 < 50) {
                return false;
            } else {
                class376.field5724[2] = var4;
                class376.field5724[0] = class690.field9995 + (class376.field5724[0] * class301.field4725 / var4);
                class376.field5724[1] = class253.field3934 + (class376.field5724[1] * class240.field3636 / var4);
                return true;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8595[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4333(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4334(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
