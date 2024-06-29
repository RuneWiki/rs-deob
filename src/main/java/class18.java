import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public abstract class class18 {

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Lag;")
    public class469 field225;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "Z")
    private boolean field224;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "[I")
    public static int[] field226 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field229 = new String[8];

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "[B")
    public static byte[] field230 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "([BII)V", line = 5)
    public final void method109(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 103) {
            this.field225 = null;
        }
        this.method110((byte) -122);
        field233++;
        if (this.field227 >= arg1) {
            OpenGL.glBufferSubDataARBub(this.field231, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field231, arg1, arg0, 0, this.field224 ? 35040 : 35044);
            this.field225.field6413 += arg1 - this.field227;
            this.field227 = arg1;
        }
    }

    @OriginalMember(owner = "client!saa", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        this.field225.method2631(this.field228, this.field227, 8448);
        field232++;
        super.finalize();
    }

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)V", line = 48)
    public static void method111(byte arg0) {
        field230 = null;
        field229 = null;
        if (arg0 >= -2) {
            field230 = null;
        }
        field226 = null;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lag;I[BIZ)V", line = 59)
    public class18(class469 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field227 = arg3;
        this.field231 = arg1;
        this.field225 = arg0;
        this.field224 = arg4;
        OpenGL.glGenBuffersARB(1, class428.field5767, 0);
        this.field228 = class428.field5767[0];
        this.method110((byte) -122);
        OpenGL.glBufferDataARBub(arg1, this.field227, arg2, 0, this.field224 ? 35040 : 35044);
        this.field225.field6413 += this.field227;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lag;ILjaclib/memory/Buffer;IZ)V", line = 85)
    public class18(class469 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field224 = arg4;
        this.field227 = arg3;
        this.field231 = arg1;
        this.field225 = arg0;
        OpenGL.glGenBuffersARB(1, class428.field5767, 0);
        this.field228 = class428.field5767[0];
        this.method110((byte) -122);
        OpenGL.glBufferDataARBa(arg1, this.field227, arg2.getAddress(), this.field224 ? 35040 : 35044);
        this.field225.field6413 += this.field227;
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(B)V")
    public abstract void method110(byte arg0);
}
