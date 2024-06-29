import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class89 extends class86 {

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    private int field1301 = 0;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    private int field1305 = -1;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1304 = "slide:";

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 8)
    public static void method722(int arg0) {
        if (arg0 != -1) {
            field1304 = (String) null;
        }
        field1304 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIII)V", line = 18)
    public static final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1303++;
        if (arg3 < 128 || arg4 < 128 || arg3 > 13056 || arg4 > 13056) {
            class318.field4961 = -1;
            class138.field2145 = -1;
            return;
        }
        int var8 = class294.method2080(899, arg4, arg3, class50.field775) - arg6;
        int var9 = class56.field838[class203.field3227];
        int var10 = class56.field830[class203.field3227];
        int var11 = arg4 - class311.field4845;
        int var12 = class56.field838[field1299];
        int var13 = arg3 - class220.field3455;
        int var14 = var9 * var11 + var10 * var13 >> 16;
        int var15 = var10 * var11 - (var9 * var13) >> 16;
        int var17 = var8 - class294.field4628;
        int var18 = class56.field830[field1299];
        int var19 = var17 * var18 - var12 * var15 >> 16;
        int var20 = var12 * var17 + var15 * var18 >> 16;
        if (var20 < 50) {
            class138.field2145 = -1;
            class318.field4961 = -1;
        } else if (class36.field534) {
            int var22 = arg1 * 512 >> 8;
            class138.field2145 = var14 * var22 / var20 + arg7;
            int var23 = arg5 * 512 >> 8;
            class318.field4961 = var19 * var23 / var20 + arg0;
        } else {
            class318.field4961 = (var19 << 9) / var20 + arg0;
            class138.field2145 = arg7 + ((var14 << 9) / var20);
        }
        int var24 = -68 / ((31 - arg2) / 38);
    }

    @OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V", line = 80)
    protected final void finalize() throws Throwable {
        field1302++;
        if (this.field1305 != -1) {
            class166.method1219(this.field1305, this.field1301, this.field1306);
            this.field1305 = -1;
            this.field1301 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 97)
    public final void method724(int arg0) {
        field1298++;
        int var2 = class110.method874((byte) -114);
        if ((var2 & 0x1) == 0) {
            class36.method310(this.field1305);
        }
        if ((var2 & 0x2) == 0) {
            class36.method313(0);
        }
        if (arg0 > -8) {
            method722(69);
        }
        if ((var2 & 0x4) == 0) {
            class36.method314(0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 159)
    public class89(int arg0) {
        GL var2 = class36.field518;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field1305 = var3[0];
        this.field1306 = class166.field2498;
        class36.method310(this.field1305);
        int var4 = class56.field832[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class166.field2499 += var6.limit() - this.field1301;
        this.field1301 = var6.limit();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBIIII)V", line = 123)
    public static final void method725(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= class298.field4667 && arg3 <= class327.field5072 && class34.field432 <= arg4 && arg5 <= class75.field1064) {
            if (arg1 == 1) {
                class210.method1493(arg0, arg3, arg5, arg6, true, arg4);
            } else {
                class310.method2145(arg0, false, arg3, arg5, arg4, arg1, arg6);
            }
        } else if (arg1 == 1) {
            class213.method1542(arg0, arg5, arg4, false, arg3, arg6);
        } else {
            class104.method803(arg5, arg1, (byte) -86, arg6, arg3, arg4, arg0);
        }
        int var7 = 72 / ((arg2 + 58) / 48);
        field1300++;
    }
}
