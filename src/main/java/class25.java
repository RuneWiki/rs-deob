import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class25 extends class282 {

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    private int field455 = -1;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    private int field459 = 0;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "Ljf;")
    public static class229 field454 = class212.method1457((byte) 98, "mapfunction");

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "Z")
    public static boolean field460 = false;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "Ljf;")
    public static class229 field463 = class212.method1457((byte) 73, "settings");

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(I)V", line = 107)
    public class25(int arg0) {
        GL var2 = class108.field1899;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field455 = var3[0];
        this.field458 = class263.field4547;
        class108.method736(this.field455);
        int var4 = class227.field3907[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class263.field4549 += var6.limit() - this.field459;
        this.field459 = var6.limit();
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(Z)V", line = 23)
    public final void method233(boolean arg0) {
        field462++;
        int var2 = class323.method2177(-126);
        if ((var2 & 0x1) == 0) {
            class108.method736(this.field455);
        }
        if ((var2 & 0x2) == 0) {
            class108.method766(0);
        }
        if ((var2 & 0x4) == 0) {
            class108.method765(0);
        }
        if (arg0) {
            method234(-46);
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 50)
    public static void method234(int arg0) {
        field454 = null;
        field463 = null;
        if (arg0 != 1) {
            field454 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() throws Throwable {
        if (this.field455 != -1) {
            class263.method1864(this.field455, this.field459, this.field458);
            this.field459 = 0;
            this.field455 = -1;
        }
        field456++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V", line = 85)
    public static final void method235(int arg0) {
        if (arg0 >= -51) {
            method235(55);
        }
        class237.field4099++;
        class84.field1608.method1397(194, 0);
        class84.field1608.method125(-25369, class308.field5208);
        field457++;
    }
}
