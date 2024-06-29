import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class17 extends class114 {

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "J")
    private long field215 = -1L;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "Ljava/lang/String;")
    private String field214 = null;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    private int field216 = 0;

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field222 = new String[] { method118(method117("yb]P9")), method118(method117("yb]Q9")), method118(method117("*x\u0016~sog\u001dr|o/")), method118(method117("d`\u001f\u007f")), method118(method117("gp\u001eqtx}\u0012`y0")), method118(method117("yb]R9")), method118(method117("q;]=l")), method118(method117("yb]W9")) };

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "Lmv;")
    public static class125 field213 = new class125(29, 4);

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "Lcd;")
    public static class161 field218;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method113(int arg0, boolean arg1, int arg2) {
        try {
            field220++;
            if (arg1) {
                field213 = null;
            }
            return (arg2 & 0x400) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field222[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V", line = 34)
    public static void method114(byte arg0) {
        try {
            if (arg0 != 107) {
                method113(-93, false, 94);
            }
            field213 = null;
            field218 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field222[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILwfa;)V", line = 47)
    public final void method115(int arg0, class286 arg1) {
        try {
            arg1.method2318(this.field216, this.field215, this.field214, (byte) 74);
            if (arg0 != 95) {
                method113(-103, false, -6);
            }
            field217++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field222[7] + arg0 + ',' + (arg1 == null ? field222[3] : field222[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljc;I)V", line = 67)
    public final void method116(class711 arg0, int arg1) {
        try {
            if (arg0.method5128(0) != 255) {
                arg0.field9945--;
                this.field215 = arg0.method5147((byte) 80);
            }
            field219++;
            this.field214 = arg0.method5084(101);
            if (arg1 == -27800) {
                this.field216 = arg0.method5116((byte) -125);
                if (class389.field5673) {
                    System.out.println(field222[4] + this.field215 + field222[2] + this.field214);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field222[5] + (arg0 == null ? field222[3] : field222[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method117(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method118(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
