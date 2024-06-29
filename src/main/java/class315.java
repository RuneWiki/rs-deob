import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class315 extends RuntimeException {

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5199;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Ljava/lang/String;")
    public String field5196;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
    public static boolean field5198 = false;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field5192 = 0;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field5200 = 0;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field5201 = 255;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "F")
    public static float field5202;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[[B")
    public static byte[][] field5197;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(J[III)Ljava/lang/String;", line = 15)
    public static final String method2261(long arg0, int[] arg1, int arg2, int arg3) {
        field5193++;
        if (class119.field1769 != null) {
            String var5 = class119.field1769.method630(arg1, arg2, (byte) -16, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg3 == 255 ? Long.toString(arg0) : (String) null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Laf;", line = 38)
    public static final class201 method2262(int arg0) {
        field5204++;
        if (class344.field5524 < class105.field1524.length) {
            return class105.field1524[class344.field5524++];
        } else {
            if (arg0 < 81) {
                method2262(-51);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 54)
    public static void method2263(int arg0) {
        field5197 = (byte[][]) null;
        if (arg0 != -22322) {
            field5200 = -76;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 66)
    public class315(Throwable arg0, String arg1) {
        this.field5199 = arg0;
        this.field5196 = arg1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 83)
    public static final String method2264(byte[] arg0, int arg1, int arg2, int arg3) {
        char[] var4 = new char[arg1];
        field5195++;
        int var5 = 0;
        for (int var6 = arg2; var6 < arg1; var6++) {
            int var7 = arg0[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class262.field4130[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
