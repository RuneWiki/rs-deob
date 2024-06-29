import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class701 {

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Ldp;")
    private class514 field9802;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9810 = new String[] { method5048(method5047("nLKKk")), method5048(method5047("nLKJk")), method5048(method5047("g\\\te")), method5048(method5047("nLK5*g@\u00117k")), method5048(method5047("r\u0007K'>")), method5048(method5047("nLKHk")) };

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lmv;")
    public static class125 field9800 = new class125(44, 8);

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[[I")
    public static int[][] field9803 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[[I")
    public static int[][] field9805 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9807 = -1;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[F")
    public static float[] field9808 = new float[4];

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lig;")
    private class687 field9801;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lig;", line = 6)
    public final class687 method5044(byte arg0) {
        try {
            field9809++;
            class687 var2 = this.field9801;
            int var3 = 16 / ((-arg0 - 55) / 62);
            if (this.field9802.field7555 == var2) {
                this.field9801 = null;
                return null;
            } else {
                this.field9801 = var2.field9626;
                return var2;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9810[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lig;", line = 29)
    public final class687 method5045(int arg0) {
        try {
            field9804++;
            if (arg0 != 0) {
                this.method5044((byte) 25);
            }
            class687 var2 = this.field9802.field7555.field9626;
            if (this.field9802.field7555 == var2) {
                this.field9801 = null;
                return null;
            } else {
                this.field9801 = var2.field9626;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9810[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 75)
    public static void method5046(int arg0) {
        try {
            field9800 = null;
            field9805 = null;
            field9808 = null;
            field9803 = null;
            if (arg0 > -49) {
                method5046(-128);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9810[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 89)
    public class701() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ldp;)V", line = 91)
    public class701(class514 arg0) {
        try {
            this.field9802 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9810[3] + (arg0 == null ? field9810[2] : field9810[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5047(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5048(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 9;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
