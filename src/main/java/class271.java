import java.nio.ByteBuffer;
import java.util.Date;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class271 extends class301 {

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    private int field4408 = -1;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    private int field4418 = 0;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    private int field4410;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field4414 = 0;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "[I")
    public static int[] field4415;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "[[[B")
    public static byte[][][] field4409;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIII)V", line = 10)
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4417++;
        class51.field1038.field2435 = 0;
        class51.field1038.method1027(20, -20374);
        class51.field1038.method1027(arg2, -20374);
        class51.field1038.method1027(arg4, -20374);
        class51.field1038.method1002((byte) -114, arg3);
        class51.field1038.method1002((byte) -105, arg0);
        if (arg1 <= 95) {
            field4414 = -104;
        }
        class46.field927 = -3;
        class65.field1234 = 1;
        class173.field2881 = 0;
        class208.field3481 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V", line = 30)
    public static final void method1914(byte arg0) {
        if (arg0 != -61) {
            return;
        }
        class156.field2639 = null;
        field4412++;
        class114.field2066 = null;
        class220.field3652 = null;
        class71.field1300 = null;
        class15.field450 = null;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V", line = 46)
    public static void method1915(byte arg0) {
        field4415 = null;
        field4409 = (byte[][][]) null;
        if (arg0 != -8) {
            method1917(52L, 37);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V", line = 145)
    public class271(int arg0) {
        GL var2 = class241.field4012;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field4408 = var3[0];
        this.field4410 = class239.field3974;
        class241.method1687(this.field4408);
        int var4 = class305.field4956[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class239.field3975 += var6.limit() - this.field4418;
        this.field4418 = var6.limit();
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 65)
    public final void method1916(int arg0) {
        field4411++;
        int var2 = class292.method2077(arg0 ^ 0xFFFF8EAD);
        if ((var2 & 0x1) == 0) {
            class241.method1687(this.field4408);
        }
        if ((var2 & 0x2) == 0) {
            class241.method1719(0);
        }
        if ((var2 & 0x4) == 0) {
            class241.method1718(0);
        }
        if (arg0 != -29009) {
            this.field4408 = 53;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 89)
    public static final String method1917(long arg0, int arg1) {
        class284.field4638.setTime(new Date(arg0));
        int var3 = class284.field4638.get(7);
        int var4 = class284.field4638.get(5);
        field4413++;
        int var5 = class284.field4638.get(2);
        if (arg1 != 21606) {
            method1915((byte) 113);
        }
        int var6 = class284.field4638.get(1);
        int var7 = class284.field4638.get(11);
        int var8 = class284.field4638.get(12);
        int var9 = class284.field4638.get(13);
        return class216.field3600[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class197.field3300[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V", line = 115)
    protected final void finalize() throws Throwable {
        field4416++;
        if (this.field4408 != -1) {
            class239.method1671(this.field4408, this.field4418, this.field4410);
            this.field4408 = -1;
            this.field4418 = 0;
        }
        super.finalize();
    }
}
