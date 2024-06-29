import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class class538 {

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    private int field7263;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Z")
    private boolean field7260;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "Llj;")
    public class565 field7273;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    private int field7270;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public int field7271;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "Z")
    public static boolean field7258 = false;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field7267 = 1;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field7268 = 50;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "[I")
    public static int[] field7266 = new int[field7268];

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
    public static int[] field7265 = new int[field7268];

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "[I")
    public static int[] field7261 = new int[field7268];

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field7269 = new String[field7268];

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "[I")
    public static int[] field7275 = new int[field7268];

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "[I")
    public static int[] field7276 = new int[field7268];

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "[I")
    public static int[] field7262 = new int[field7268];

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "B")
    public static byte field7272;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
    public abstract void method594(int arg0);

    @OriginalMember(owner = "client!gu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7273.method3184(this.field7263, this.field7271, -9614);
        field7259++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[BI)V")
    public final void method3044(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 0) {
            field7272 = 38;
        }
        field7264++;
        this.method594(arg0 ^ 0xFFFFFF88);
        if (arg2 <= this.field7263) {
            OpenGL.glBufferSubDataARBub(this.field7270, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field7270, arg2, arg1, 0, this.field7260 ? 35040 : 35044);
            this.field7273.field7849 += arg2 - this.field7263;
            this.field7263 = arg2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3045(int arg0, int arg1, byte arg2) {
        field7274++;
        if (arg2 > -92) {
            field7261 = null;
        }
        return class665.method3760(arg0, arg1, 3553) & class645.method3595((byte) -102, arg1, arg0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static void method3046(byte arg0) {
        field7261 = null;
        field7266 = null;
        field7275 = null;
        field7262 = null;
        field7276 = null;
        field7269 = null;
        field7265 = null;
        if (arg0 != 22) {
            method3046((byte) 31);
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Llj;I[BIZ)V")
    public class538(class565 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field7263 = arg3;
        this.field7260 = arg4;
        this.field7273 = arg0;
        this.field7270 = arg1;
        OpenGL.glGenBuffersARB(1, class387.field5478, 0);
        this.field7271 = class387.field5478[0];
        this.method594(-74);
        OpenGL.glBufferDataARBub(arg1, this.field7263, arg2, 0, this.field7260 ? 35040 : 35044);
        this.field7273.field7849 += this.field7263;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Llj;ILjaclib/memory/Buffer;IZ)V")
    public class538(class565 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field7260 = arg4;
        this.field7270 = arg1;
        this.field7263 = arg3;
        this.field7273 = arg0;
        OpenGL.glGenBuffersARB(1, class387.field5478, 0);
        this.field7271 = class387.field5478[0];
        this.method594(-52);
        OpenGL.glBufferDataARBa(arg1, this.field7263, arg2.getAddress(), this.field7260 ? 35040 : 35044);
        this.field7273.field7849 += this.field7263;
    }
}
