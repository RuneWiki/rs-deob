import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class167 extends class232 {

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    private int field2820 = 0;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    private int field2828 = -1;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    private int field2827;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "Lok;")
    public static class146 field2821 = class235.method1724(-12908, "overlay2");

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "Lok;")
    private static class146 field2823 = class235.method1724(-12908, "Drop");

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "[Lok;")
    public static class146[] field2826 = new class146[100];

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "Lok;")
    public static class146 field2819 = field2823;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "Lok;")
    public static class146 field2824 = class235.method1724(-12908, "Sprites geladen)3");

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Llc;")
    public static class160 field2825 = new class160();

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V", line = 7)
    public final void method1293(int arg0) {
        field2829++;
        int var2 = class217.method1608((byte) 111);
        if ((var2 & 0x1) == 0) {
            class271.method1978(this.field2828);
        }
        if (arg0 != 13859) {
            method1296(8);
        }
        if ((var2 & 0x2) == 0) {
            class271.method1974(0);
        }
        if ((var2 & 0x4) == 0) {
            class271.method1983(0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method1294(byte arg0, int arg1) {
        class13.field250.method794(-17435, arg1);
        if (arg0 < -56) {
            field2817++;
        }
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V", line = 53)
    protected final void finalize() throws Throwable {
        if (this.field2828 != -1) {
            class68.method505(this.field2828, this.field2820, this.field2827);
            this.field2820 = 0;
            this.field2828 = -1;
        }
        super.finalize();
        field2818++;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V", line = 125)
    public class167(int arg0) {
        GL var2 = class271.field4641;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field2827 = class68.field1125;
        this.field2828 = var3[0];
        class271.method1978(this.field2828);
        int var4 = class109.field1746[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class68.field1130 += var6.limit() - this.field2820;
        this.field2820 = var6.limit();
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)V", line = 85)
    public static void method1295(byte arg0) {
        field2819 = null;
        field2821 = null;
        field2825 = null;
        field2824 = null;
        field2823 = null;
        int var1 = -41 % ((-arg0 - 29) / 36);
        field2826 = null;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 109)
    public static final void method1296(int arg0) {
        field2816++;
        if (arg0 != -1) {
            method1295((byte) -91);
        }
        class92.field1459 = new class264[class160.field2711.method109(arg0 - 11128)][];
        class279.field4786 = new boolean[class160.field2711.method109(-11129)];
    }
}
