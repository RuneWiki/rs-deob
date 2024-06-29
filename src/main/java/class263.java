import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class263 extends class128 {

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    private int field4255 = 0;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    private int field4261 = -1;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    private int field4260;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field4261 != -1) {
            class151.method1190(this.field4261, this.field4255, this.field4260);
            this.field4255 = 0;
            this.field4261 = -1;
        }
        field4253++;
        super.finalize();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;II)V", line = 23)
    public static final void method1815(String arg0, String arg1, boolean arg2, String arg3, int arg4, int arg5) {
        field4256++;
        for (int var6 = 99; var6 > 0; var6--) {
            class308.field4905[var6] = class308.field4905[var6 - 1];
            class239.field3912[var6] = class239.field3912[var6 - 1];
            class127.field2195[var6] = class127.field2195[var6 - 1];
            class194.field3244[var6] = class194.field3244[var6 - 1];
            class89.field1405[var6] = class89.field1405[var6 - 1];
        }
        class308.field4905[0] = arg5;
        class239.field3912[0] = arg0;
        class89.field1405[0] = arg4;
        class127.field2195[0] = arg1;
        if (!arg2) {
            field4257 = 71;
        }
        class49.field766 = class99.field1606;
        class194.field3244[0] = arg3;
        class30.field435++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLqe;)V", line = 56)
    public static final void method1816(byte arg0, class205 arg1) {
        field4254++;
        int var2 = -44 % ((arg0 - 50) / 52);
        class261 var3 = (class261) class305.field4831.method732(class142.method1151(arg1.field3491, -87), true);
        if (var3 == null) {
            class288.method1962(arg1.field1975[0], 18913, arg1.field2034[0], 0, arg1, class205.field3497, (class278) null, (class97) null);
        } else {
            var3.method1802(128);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V", line = 108)
    public class263(int arg0) {
        GL var2 = class43.field651;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field4260 = class151.field2669;
        this.field4261 = var3[0];
        class43.method390(this.field4261);
        int var4 = class62.field955[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class151.field2671 += var6.limit() - this.field4255;
        this.field4255 = var6.limit();
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 86)
    public final void method1817(int arg0) {
        field4259++;
        int var2 = class108.method945(arg0 ^ arg0);
        if ((var2 & 0x1) == 0) {
            class43.method390(this.field4261);
        }
        if ((var2 & 0x2) == 0) {
            class43.method368(0);
        }
        if ((var2 & 0x4) == 0) {
            class43.method349(0);
        }
    }
}
