import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class282 extends class36 {

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    private int field4215 = 0;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    private int field4217 = -1;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    private int field4218;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[I")
    public static int[] field4219 = new int[2000];

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4224 = null;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "F")
    public static float field4227;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V", line = 10)
    public final void method1946(byte arg0) {
        field4223++;
        int var2 = class203.method1441(30538);
        if ((var2 & 0x1) == 0) {
            class67.method479(this.field4217);
        }
        if ((var2 & 0x2) == 0) {
            class67.method489(0);
        }
        if ((var2 & 0x4) == 0) {
            class67.method457(0);
        }
        int var3 = -52 / ((arg0 + 44) / 56);
    }

    @OriginalMember(owner = "client!ai", name = "finalize", descriptor = "()V", line = 40)
    protected final void finalize() throws Throwable {
        field4225++;
        if (this.field4217 != -1) {
            class180.method1249(this.field4217, this.field4215, this.field4218);
            this.field4217 = -1;
            this.field4215 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V", line = 128)
    public class282(int arg0) {
        GL var2 = class67.field899;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field4217 = var3[0];
        this.field4218 = class180.field2413;
        class67.method479(this.field4217);
        int var4 = class184.field2527[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class180.field2412 += var6.limit() - this.field4215;
        this.field4215 = var6.limit();
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)V", line = 71)
    public static void method1947(byte arg0) {
        field4224 = null;
        field4219 = null;
        if (arg0 != -4) {
            method1948(-17, -28, (byte) -35);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)I", line = 86)
    public static final int method1948(int arg0, int arg1, byte arg2) {
        field4226++;
        if (arg2 != -75) {
            field4220 = 102;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILkm;BI)Ltj;", line = 113)
    public static final class258 method1949(int arg0, class133 arg1, byte arg2, int arg3) {
        field4221++;
        if (class129.method931(arg0, arg3, arg1, (byte) 94)) {
            int var4 = 40 / ((arg2 + 32) / 34);
            return class249.method1698((byte) -113);
        } else {
            return null;
        }
    }
}
