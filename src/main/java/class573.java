import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class573 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private int field8471;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public int field8467;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8472 = new String[] { method4280(method4279("F\u0003o)\u0001")), method4280(method4279("F\u0003o\u001cFp\u001b3\u0001GDG")), method4280(method4279("F\u0003oT@M\u00065V\u0001")) };

    @OriginalMember(owner = "client!el", name = "d", descriptor = "F")
    public static float field8469;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!el", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field8470++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8472[1] + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(II)V")
    public class573(int arg0, int arg1) {
        try {
            this.field8471 = arg0;
            this.field8467 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8472[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
    public final int method4278(int arg0) {
        try {
            field8468++;
            if (arg0 >= -106) {
                this.toString();
            }
            return this.field8471;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8472[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!el", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4279(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!el", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4280(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
