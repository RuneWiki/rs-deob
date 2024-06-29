import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class778 extends class36 {

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Ljava/lang/String;")
    private String field11346 = null;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "J")
    private long field11353 = -1L;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11354 = new String[] { method5592(method5591("\u0011/\u0001G")), method5592(method5591("\b5Cj\u0004")), method5592(method5591("\u0004tC\u0005Q")), method5592(method5591("_7\bFN\u001a(\u0003JA\u001a`")), method5592(method5591("\b5Co\u0004")), method5592(method5591("\u0012?\u0000II\r2\fXDE")) };

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field11350 = 0;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "B")
    private byte field11345;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "F")
    public static float field11348;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field11347;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field11349;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field11351;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    private int field11352;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lwt;I)V", line = 12)
    public final void method359(class328 arg0, int arg1) {
        try {
            field11349++;
            class432 var3 = new class432();
            var3.field6784 = this.field11352;
            var3.field6785 = this.field11345;
            var3.field6783 = this.field11346;
            if (arg1 != 1984) {
                field11348 = 0.089668095F;
            }
            arg0.method2788(5, var3);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11354[1] + (arg0 == null ? field11354[0] : field11354[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lwq;I)V", line = 35)
    public final void method361(class176 arg0, int arg1) {
        try {
            if (arg0.method1645((byte) -116) != 255) {
                arg0.field2799--;
                this.field11353 = arg0.method1658(-24862);
            }
            if (arg1 > 0) {
                field11351++;
                this.field11346 = arg0.method1666(-107);
                this.field11352 = arg0.method1687((byte) -54);
                this.field11345 = arg0.method1672(101);
                arg0.method1658(-24862);
                if (class632.field9089) {
                    System.out.println(field11354[5] + this.field11353 + field11354[3] + this.field11346);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11354[4] + (arg0 == null ? field11354[0] : field11354[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5591(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5592(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
