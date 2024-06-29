import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class723 {

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10621 = new String[] { method5253(method5252("\tC,\u0002")), method5253(method5252("\u0002@n/9")), method5253(method5252("\u001c\u0018n@l")), method5253(method5252("\u0002@n,9")), method5253(method5252("\u0002@n-9")) };

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "Lvn;")
    public static class330 field10614 = new class330(53, 3);

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "C")
    public char field10617;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public int field10612;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field10613;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public int field10616;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field10618;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public int field10620;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "Lrf;")
    public static class89 field10619;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "[J")
    public static long[] field10615;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field10611;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lwq;BI)V")
    private final void method5249(class176 arg0, byte arg1, int arg2) {
        try {
            field10613++;
            if (arg2 == 1) {
                this.field10617 = class423.method3359(-6826, arg0.method1672(-10));
            } else if (arg2 == 2) {
                this.field10620 = arg0.method1687((byte) -43);
                this.field10612 = arg0.method1645((byte) -79);
                this.field10616 = arg0.method1645((byte) -78);
            }
            if (arg1 != 91) {
                field10611 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10621[4] + (arg0 == null ? field10621[0] : field10621[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lwq;I)V")
    public final void method5250(class176 arg0, int arg1) {
        try {
            field10618++;
            while (true) {
                int var3 = arg0.method1645((byte) -113);
                if (var3 == 0) {
                    if (arg1 == 1) {
                        return;
                    } else {
                        this.field10616 = -13;
                        return;
                    }
                }
                this.method5249(arg0, (byte) 91, var3);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10621[1] + (arg0 == null ? field10621[0] : field10621[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
    public static void method5251(int arg0) {
        try {
            field10615 = null;
            field10611 = null;
            if (arg0 < 58) {
                field10615 = null;
            }
            field10619 = null;
            field10614 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10621[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5252(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5253(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
