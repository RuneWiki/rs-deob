import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class577 {

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public int field8557 = 1;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Z")
    public boolean field8563 = false;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public int field8561 = 64;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public int field8560 = 2;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public int field8559 = -1;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Z")
    public boolean field8565 = false;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public int field8566 = 64;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8567 = new String[] { method4313(method4312("[xI\u0014")), method4313(method4312("N#\u000bV9")), method4313(method4312("[a\u000b9l")), method4313(method4312("[a\u000b:l")) };

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "J")
    public static long field8564;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILib;I)V", line = 10)
    public final void method4310(int arg0, class163 arg1, int arg2) {
        try {
            field8562++;
            while (true) {
                int var4 = arg1.method1455((byte) 62);
                if (var4 == 0) {
                    if (arg2 == -6753) {
                        return;
                    } else {
                        this.method4310(-121, null, -74);
                        return;
                    }
                }
                this.method4311(arg0, arg1, var4, (byte) -124);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8567[3] + arg0 + ',' + (arg1 == null ? field8567[0] : field8567[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILib;IB)V", line = 34)
    private final void method4311(int arg0, class163 arg1, int arg2, byte arg3) {
        try {
            if (arg3 >= -27) {
                this.method4311(89, null, 89, (byte) -57);
            }
            field8558++;
            if (arg2 == 1) {
                this.field8559 = arg1.method1445((byte) 110);
                if (this.field8559 == 65535) {
                    this.field8559 = -1;
                    return;
                }
            } else if (arg2 == 2) {
                this.field8566 = arg1.method1445((byte) 115) + 1;
                this.field8561 = arg1.method1445((byte) 119) + 1;
                return;
            } else if (arg2 == 3) {
                arg1.method1414(1);
            } else if (arg2 == 4) {
                this.field8560 = arg1.method1455((byte) 62);
                return;
            } else {
                if (arg2 == 5) {
                    this.field8557 = arg1.method1455((byte) 62);
                } else if (arg2 == 6) {
                    this.field8565 = true;
                    return;
                } else if (arg2 == 7) {
                    this.field8563 = true;
                    return;
                }
                return;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8567[2] + arg0 + ',' + (arg1 == null ? field8567[0] : field8567[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4312(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4313(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
