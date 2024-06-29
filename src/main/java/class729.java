import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class729 {

    @OriginalMember(owner = "client!no", name = "A", descriptor = "[B")
    public byte[] field10557 = new byte[18002];

    @OriginalMember(owner = "client!no", name = "s", descriptor = "[B")
    public byte[] field10562 = new byte[256];

    @OriginalMember(owner = "client!no", name = "e", descriptor = "[Z")
    public boolean[] field10567 = new boolean[256];

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[B")
    public byte[] field10573 = new byte[18002];

    @OriginalMember(owner = "client!no", name = "n", descriptor = "[[I")
    public int[][] field10571 = new int[6][258];

    @OriginalMember(owner = "client!no", name = "g", descriptor = "[[B")
    public byte[][] field10585 = new byte[6][258];

    @OriginalMember(owner = "client!no", name = "v", descriptor = "[I")
    public int[] field10568 = new int[6];

    @OriginalMember(owner = "client!no", name = "h", descriptor = "[[I")
    public int[][] field10575 = new int[6][258];

    @OriginalMember(owner = "client!no", name = "t", descriptor = "[I")
    public int[] field10583 = new int[257];

    @OriginalMember(owner = "client!no", name = "r", descriptor = "[I")
    public int[] field10582 = new int[16];

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public int field10570 = 0;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "[Z")
    public boolean[] field10581 = new boolean[16];

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public int field10589 = 0;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "[I")
    public int[] field10591 = new int[256];

    @OriginalMember(owner = "client!no", name = "w", descriptor = "[B")
    public byte[] field10594 = new byte[4096];

    @OriginalMember(owner = "client!no", name = "f", descriptor = "[[I")
    public int[][] field10588 = new int[6][258];

    @OriginalMember(owner = "client!no", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field10597 = new String[] { method5321(method5320("\u007f\u001bX*")), method5321(method5320("j@\u001ahQ")), method5321(method5320("\u007f\u0001\u001a\u0005\u0004")), method5321(method5320("\u007f\u0001\u001a\u0004\u0004")), method5321(method5320("\u007f\u0001\u001a\u0003\u0004")), method5321(method5320("\u007f\u0001\u001a\u0007\u0004")), method5321(method5320("\u007f\u0001\u001a\u0002\u0004")) };

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public static int field10569 = -1;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "Z")
    public static boolean field10574 = true;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "Z")
    public static boolean field10595 = false;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "B")
    public byte field10558;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public int field10559;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public int field10560;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public int field10561;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field10563;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public int field10564;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    public int field10566;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public int field10572;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public int field10576;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public int field10578;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public int field10579;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public static int field10580;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public int field10584;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public static int field10587;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public int field10590;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public int field10593;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public int field10596;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Lla;")
    public static class476 field10586;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "[B")
    public byte[] field10577;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "[B")
    public byte[] field10592;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public static final void method5315(int arg0) {
        try {
            field10565++;
            class422.field6215 = 0L;
            class76.field872 = "";
            class472.field6852 = -1;
            if (arg0 != 256) {
                field10586 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10597[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public static final void method5316(int arg0) {
        try {
            if (arg0 <= 110) {
                method5318(-62);
            }
            field10563++;
            class330.field5191 = null;
            class624.field9125 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10597[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V")
    public static final void method5317(int arg0, File arg1, String arg2) {
        try {
            if (arg0 != 18002) {
                method5318(81);
            }
            class275.field4152.put(arg2, arg1);
            field10580++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10597[2] + arg0 + ',' + (arg1 == null ? field10597[0] : field10597[1]) + ',' + (arg2 == null ? field10597[0] : field10597[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
    public static void method5318(int arg0) {
        try {
            if (arg0 != 16) {
                field10586 = null;
            }
            field10586 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10597[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V")
    public static final void method5319(boolean arg0, int arg1) {
        try {
            field10587++;
            class233.field3514 = 1000000000L / (long) arg1;
            if (arg0) {
                field10569 = 126;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10597[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!no", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5320(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!no", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5321(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
