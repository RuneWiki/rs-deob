import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class740 extends class46 {

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field10758 = new String[] { method5401(method5400("W\u000f\u001f\u000e")), method5401(method5400("U\u000f]*x")), method5401(method5400("BT]L-")), method5401(method5400("U\u000f]%x")), method5401(method5400("U\u000f](x")), method5401(method5400("U\u000f]$x")), method5401(method5400("U\u000f]+x")) };

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "Lel;")
    public static class573 field10749 = new class573(53, 10);

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "Ljava/lang/String;")
    public static String field10757 = null;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    public static int field10750;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public static int field10751;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field10752;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public static int field10753;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field10755;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    public static int field10756;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "Lqha;")
    private class112 field10754;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static void method5395(int arg0) {
        try {
            if (arg0 != -2) {
                method5395(-121);
            }
            field10757 = null;
            field10749 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10758[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lib;II)V")
    private final void method5396(class163 arg0, int arg1, int arg2) {
        try {
            if (arg2 == 249) {
                int var4 = arg0.method1455((byte) 62);
                if (this.field10754 == null) {
                    int var5 = class12.method83((byte) -1, var4);
                    this.field10754 = new class112(var5);
                }
                for (int var6 = 0; var6 < var4; var6++) {
                    boolean var7 = arg0.method1455((byte) 62) == 1;
                    int var8 = arg0.method1436((byte) 112);
                    class206 var9;
                    if (var7) {
                        var9 = new class78(arg0.method1423(121));
                    } else {
                        var9 = new class609(arg0.method1453((byte) 117));
                    }
                    this.field10754.method968((byte) -111, (long) var8, var9);
                }
            }
            if (arg1 != 10) {
                method5395(8);
            }
            field10753++;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10758[1] + (arg0 == null ? field10758[0] : field10758[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILib;)V")
    public final void method5397(int arg0, class163 arg1) {
        try {
            if (arg0 != 0) {
                this.method5397(0, null);
            }
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    field10756++;
                    return;
                }
                this.method5396(arg1, arg0 ^ 0xA, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10758[3] + arg0 + ',' + (arg1 == null ? field10758[0] : field10758[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method5398(int arg0, String arg1, int arg2) {
        try {
            field10750++;
            if (this.field10754 == null) {
                return arg1;
            } else if (arg2 == 10) {
                class78 var4 = (class78) this.field10754.method977((long) arg0, 1);
                return var4 == null ? arg1 : var4.field893;
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10758[4] + arg0 + ',' + (arg1 == null ? field10758[0] : field10758[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BII)I")
    public final int method5399(byte arg0, int arg1, int arg2) {
        try {
            field10751++;
            if (this.field10754 == null) {
                return arg2;
            }
            if (arg0 < 25) {
                field10749 = null;
            }
            class609 var4 = (class609) this.field10754.method977((long) arg1, 1);
            return var4 == null ? arg2 : var4.field8902;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10758[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5400(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5401(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
