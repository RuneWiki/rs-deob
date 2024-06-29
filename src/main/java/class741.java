import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class741 {

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "S")
    public short field10767;

    @OriginalMember(owner = "client!fka", name = "i", descriptor = "I")
    public int field10761;

    @OriginalMember(owner = "client!fka", name = "f", descriptor = "S")
    public short field10766;

    @OriginalMember(owner = "client!fka", name = "k", descriptor = "B")
    public byte field10768;

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "B")
    public byte field10770;

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "I")
    public int field10764;

    @OriginalMember(owner = "client!fka", name = "h", descriptor = "Z")
    public boolean field10763;

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "S")
    public short field10769;

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10772 = new String[] { method5407(method5406("(\f!5\u0000f")), method5407(method5406("(\f!5}'\t)o\u007ff")), method5407(method5406("(\f!5\u0003f")) };

    @OriginalMember(owner = "client!fka", name = "e", descriptor = "Lel;")
    public static class573 field10762 = new class573(77, 7);

    @OriginalMember(owner = "client!fka", name = "g", descriptor = "I")
    public static int field10765;

    @OriginalMember(owner = "client!fka", name = "j", descriptor = "I")
    public static int field10771;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(I)V", line = 7)
    public static void method5404(int arg0) {
        try {
            field10762 = null;
            if (arg0 != 77) {
                field10765 = 98;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10772[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(I)V", line = 24)
    public static final void method5405(int arg0) {
        try {
            field10771++;
            if (class251.field3897 == 10) {
                class251.field3897 = arg0;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10772[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 41)
    public class741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        try {
            this.field10767 = (short) arg6;
            this.field10761 = arg10;
            this.field10766 = (short) arg4;
            this.field10768 = (byte) arg7;
            this.field10770 = (byte) arg8;
            this.field10764 = arg0;
            this.field10763 = arg9;
            this.field10769 = (short) arg5;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10772[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5406(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5407(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 103;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
