import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class403 implements class149 {

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public int field6128;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Lvv;")
    public static class313 field6124 = new class313(83, 4);

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "[[I")
    public static int[][] field6130 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "Llt;")
    public static class224 field6129;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
    public static final String method2498(boolean arg0, byte arg1, int arg2, int arg3) {
        field6126++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            int var5 = -79 % ((70 - arg1) / 32);
            int var6 = arg2 / arg3;
            while (var6 != 0) {
                var6 /= arg3;
                var4++;
            }
            char[] var7 = new char[var4];
            var7[0] = '+';
            for (int var8 = var4 - 1; var8 > 0; var8--) {
                int var9 = arg2;
                arg2 /= arg3;
                int var10 = var9 - arg2 * arg3;
                if (var10 < 10) {
                    var7[var8] = (char) (var10 + 48);
                } else {
                    var7[var8] = (char) (var10 + 87);
                }
            }
            return new String(var7);
        } else {
            return Integer.toString(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!dw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6123++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Lhd;")
    public static final class239 method2499(int arg0) {
        if (arg0 != -1) {
            field6124 = null;
        }
        field6125++;
        return class221.field3807 < class441.field6575.length ? class441.field6575[class221.field3807++] : null;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
    public static void method2500(int arg0) {
        field6129 = null;
        field6130 = null;
        if (arg0 < -125) {
            field6124 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class403(String arg0, int arg1) {
        this.field6128 = arg1;
    }
}
