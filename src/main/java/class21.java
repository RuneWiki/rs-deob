import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 {

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "Z")
    private boolean field246 = true;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public int field252 = 443;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public int field242 = 43594;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field254 = new String[] { method148(method147("es\u0018Q")), method148(method147("isZ\u007fg")), method148(method147("p(Z\u00132")), method148(method147("isZ~g")), method148(method147("isZyg")), method148(method147("isZ|g")) };

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "J")
    public static long field245 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Z")
    public static boolean field248 = true;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Ljava/lang/String;")
    public String field250;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "[I")
    public static int[] field249;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method143(int arg0) {
        try {
            field249 = null;
            if (arg0 != 443) {
                field249 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field254[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILbu;)Z")
    public final boolean method144(int arg0, class21 arg1) {
        try {
            field251++;
            if (arg0 <= 42) {
                this.field250 = null;
            }
            if (arg1 == null) {
                return false;
            } else {
                return this.field243 == arg1.field243 && this.field250.equals(arg1.field250);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field254[1] + arg0 + ',' + (arg1 == null ? field254[0] : field254[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
    public final void method145(byte arg0) {
        try {
            if (!this.field246) {
                this.field244 = true;
                this.field246 = true;
            } else if (this.field244) {
                this.field244 = false;
            } else {
                this.field246 = false;
            }
            field253++;
            if (arg0 < 49) {
                this.method144(28, null);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field254[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lmca;B)Lvd;")
    public final class42 method146(class33 arg0, byte arg1) {
        try {
            field247++;
            if (arg1 > -122) {
                this.field246 = false;
            }
            return arg0.method222(this.field246 ? this.field252 : this.field242, (byte) 33, this.field250, this.field244);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field254[4] + (arg0 == null ? field254[0] : field254[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method147(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method148(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
