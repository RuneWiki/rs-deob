import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class675 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field9786;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9792 = new String[] { method4962(method4961("y<9d_H$ey^|x")), method4962(method4961("y<9,Yu9c.\u0018")), method4962(method4961("y<9R\u0018")), method4962(method4961("y<9Q\u0018")) };

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Ltw;")
    public static class214 field9788;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Ltw;")
    public static class214 field9785 = field9788 = new class214(false);

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lel;")
    public static class573 field9791 = new class573(43, -1);

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Z")
    public static final boolean method4959(int arg0, int arg1) {
        try {
            if (arg1 != 1) {
                field9785 = null;
            }
            field9790++;
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9792[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field9789++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9792[0] + ')');
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method4960(byte arg0) {
        try {
            if (arg0 == 66) {
                field9791 = null;
                field9788 = null;
                field9785 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9792[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(II)V")
    public class675(int arg0, int arg1) {
        try {
            this.field9786 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9792[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4961(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4962(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
