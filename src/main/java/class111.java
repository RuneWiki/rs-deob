import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class111 extends class115 {

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    private int field2038 = 0;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    private int field2044 = -1;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "[I")
    public static int[] field2039 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "Lud;")
    public static class279 field2037 = class130.method1024("Cach-B", 255);

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Lhc;")
    public static class171 field2046 = new class171(64);

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Lud;")
    private static class279 field2051 = class130.method1024("flash3:", 255);

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "Lud;")
    public static class279 field2047 = field2051;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lud;")
    public static class279 field2050 = class130.method1024("Annuler", 255);

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lud;")
    public static class279 field2052 = field2051;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "Lgf;")
    public static class8 field2048;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "[Llj;")
    public static class50[] field2049;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lmh;", line = 10)
    public static final class134 method907(int arg0, int arg1) {
        class134 var2 = (class134) class11.field369.method1767((byte) -37, (long) arg0);
        field2042++;
        if (var2 != null) {
            return var2;
        } else if (arg1 <= 12) {
            return (class134) null;
        } else {
            byte[] var3 = class317.field5575.method1192(0, 5, arg0);
            class134 var4 = new class134();
            if (var3 != null) {
                var4.method1054(2, new class53(var3));
            }
            class11.field369.method1771(106, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 35)
    public final void method908(int arg0) {
        field2043++;
        int var2 = class29.method264(0);
        if ((var2 & 0x1) == 0) {
            class97.method803(this.field2044);
        }
        if ((var2 & 0x2) == arg0) {
            class97.method835(0);
        }
        if ((var2 & 0x4) == 0) {
            class97.method811(0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "finalize", descriptor = "()V", line = 53)
    protected final void finalize() throws Throwable {
        field2034++;
        if (this.field2044 != -1) {
            class308.method2196(this.field2044, this.field2038, this.field2036);
            this.field2038 = 0;
            this.field2044 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)V", line = 73)
    public static final void method909(int arg0, byte arg1, int arg2) {
        field2040++;
        if (class283.method2031(20714, arg0)) {
            if (arg1 < 125) {
                method910(-55);
            }
            class321.method2263(arg2, class18.field545[arg0], -2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 87)
    public static void method910(int arg0) {
        field2052 = null;
        field2049 = null;
        field2039 = null;
        field2046 = null;
        int var1 = 74 % ((arg0 - 59) / 42);
        field2048 = null;
        field2047 = null;
        field2037 = null;
        field2050 = null;
        field2051 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V", line = 124)
    public class111(int arg0) {
        GL var2 = class97.field1801;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field2044 = var3[0];
        this.field2036 = class308.field5469;
        class97.method803(this.field2044);
        int var4 = class27.field645[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class308.field5471 += var6.limit() - this.field2038;
        this.field2038 = var6.limit();
    }
}
