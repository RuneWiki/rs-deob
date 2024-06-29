import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class24 extends class78 {

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    private int field405 = 0;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    private int field414 = -1;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "Lja;")
    public static class64 field416;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "[Lob;")
    public static class292[] field407;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[[B")
    public static byte[][] field408;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V", line = 11)
    public static void method165(int arg0) {
        field416 = null;
        if (arg0 == -1) {
            field408 = (byte[][]) null;
            field407 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B[B)Lvd;", line = 25)
    public static final class135 method166(byte arg0, byte[] arg1) {
        field410++;
        if (arg0 < 0) {
            field416 = (class64) null;
        }
        if (arg1 == null) {
            return null;
        }
        class135 var2;
        if (class265.field4126) {
            var2 = new class5(arg1, class246.field3811, class62.field962, class108.field1797, class3.field14, class270.field4198);
        } else {
            var2 = new class266(arg1, class246.field3811, class62.field962, class108.field1797, class3.field14, class270.field4198);
        }
        class233.method1680((byte) -12);
        return var2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)Leh;", line = 51)
    public static final class169 method167(int arg0, int arg1, byte arg2) {
        field412++;
        int var3 = 2 % ((arg2 - 24) / 54);
        for (class169 var4 = (class169) class54.field852.method1490(200); var4 != null; var4 = (class169) class54.field852.method1487((byte) 117)) {
            if (var4.field2620 && var4.method1232(-87, arg1, arg0)) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V", line = 118)
    public class24(int arg0) {
        GL var2 = class265.field4099;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field414 = var3[0];
        this.field409 = class214.field3409;
        class265.method1889(this.field414);
        int var4 = class174.field2740[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class214.field3410 += var6.limit() - this.field405;
        this.field405 = var6.limit();
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V", line = 84)
    public final void method168(int arg0) {
        int var2 = 101 / ((arg0 + 14) / 61);
        field413++;
        int var3 = class230.method1665((byte) -117);
        if ((var3 & 0x1) == 0) {
            class265.method1889(this.field414);
        }
        if ((var3 & 0x2) == 0) {
            class265.method1899(0);
        }
        if ((var3 & 0x4) == 0) {
            class265.method1898(0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V", line = 104)
    protected final void finalize() throws Throwable {
        if (this.field414 != -1) {
            class214.method1553(this.field414, this.field405, this.field409);
            this.field414 = -1;
            this.field405 = 0;
        }
        field415++;
        super.finalize();
    }
}
