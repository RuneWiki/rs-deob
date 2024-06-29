import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class46 {

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Liha;")
    private class29 field514 = new class29(256);

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Lgca;")
    private class261 field513;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "Ld;")
    private class158 field511;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field523 = new String[] { method472(method471("M\u0005\u000f\u0012\u001f")), method472(method471("M\u0005\u000f\u0014\u001f")), method472(method471("M\u0005\u000f\u0013\u001f")), method472(method471("M\u0005\u000f\u0017\u001f")), method472(method471("M\u0005\u000f\u0015\u001f")), method472(method471("D\u0003M:")), method472(method471("QX\u000fxJ")), method472(method471("M\u0005\u000fj^D\u001fUh\u001f")), method472(method471("M\u0005\u000f\u0010\u001f")), method472(method471("M\u0005\u000f\u0011\u001f")) };

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field521 = 4;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Lafa;")
    public static class363 field518;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public final void method464(byte arg0) {
        try {
            field519++;
            int var2 = 88 % ((arg0 - 90) / 35);
            this.field514.method294(5, -630);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field523[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z")
    public static final boolean method465(int arg0, int arg1, int arg2) {
        try {
            if (arg1 == -6635) {
                field522++;
                return (arg0 & 0x21) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field523[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Lah;")
    public final class406 method466(int arg0, int arg1) {
        try {
            field516++;
            Object var3 = this.field514.method302(-120, (long) arg0);
            if (var3 != null) {
                return (class406) var3;
            } else if (this.field511.method1417((byte) -37, arg0)) {
                class304 var4 = this.field511.method1419(arg0, -115);
                int var5 = var4.field4911 ? 64 : this.field513.field4168;
                class406 var7;
                if (var4.field4898 && this.field513.method167()) {
                    float[] var6 = this.field511.method1418(var5, 31922, arg0, 0.7F, false, var5);
                    var7 = this.field513.method2273(class313.field5120, var5, (byte) 32, var6, var5, var4.field4904 != 0);
                } else {
                    int[] var8;
                    if (var4.field4892 != 2 && class143.method1327(arg1 ^ 0xFFFFFF84, var4.field4913)) {
                        var8 = this.field511.method1420(var5, true, var5, arg0, 0.7F, -7385);
                    } else {
                        var8 = this.field511.method1415(arg0, 0.7F, var5, var5, 28039, false);
                    }
                    var7 = this.field513.method2206(1826, var4.field4904 != 0, var5, var8, var5);
                }
                var7.method3166(var4.field4912, 8095, var4.field4909);
                if (arg1 != 4) {
                    method468(true);
                }
                this.field514.method295(false, (long) arg0, var7);
                return var7;
            } else {
                return null;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field523[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
    public final void method467(int arg0) {
        try {
            this.field514.method304(1);
            if (arg0 <= 31) {
                this.method464((byte) 79);
            }
            field520++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field523[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public static final void method468(boolean arg0) {
        try {
            field512++;
            class330.field5401 = new class59(class709.field10206.method5154(class795.field11624, (byte) 65), "", class561.field8156, 1010, -1, 0L, 0, 0, true, arg0, 0L, true);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field523[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lgca;Ld;)V")
    public class46(class261 arg0, class158 arg1) {
        try {
            this.field513 = arg0;
            this.field511 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field523[7] + (arg0 == null ? field523[5] : field523[6]) + ',' + (arg1 == null ? field523[5] : field523[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)Z")
    public static final boolean method469(int arg0, int arg1) {
        try {
            field517++;
            if (arg1 != 1010) {
                method465(-38, -84, -85);
            }
            return (arg0 & -arg0) == arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field523[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public static void method470(byte arg0) {
        try {
            if (arg0 <= 0) {
                field518 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field523[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method471(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method472(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
