import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class70 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Z")
    private boolean field1319;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Ljj;")
    public class66 field1314;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field1320 = 1400;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!mf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1314.method522(this.field1312, this.field1313, (byte) -128);
        field1310++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method681(boolean arg0, String arg1) {
        field1316++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class404.field6020; var2++) {
            if (arg1.equalsIgnoreCase(class534.field7454[var2])) {
                return var2;
            }
        }
        if (arg0) {
            method685(null, null, -39);
        }
        return -1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BI)V")
    public final void method682(int arg0, byte[] arg1, int arg2) {
        field1318++;
        this.method684(58);
        if (arg0 >= -94) {
            method683(82, null);
        }
        if (this.field1313 < arg2) {
            OpenGL.glBufferDataARBub(this.field1311, arg2, arg1, 0, this.field1319 ? 35040 : 35044);
            this.field1314.field1148 += arg2 - this.field1313;
            this.field1313 = arg2;
        } else {
            OpenGL.glBufferSubDataARBub(this.field1311, 0, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILhn;)V")
    public static final void method683(int arg0, class85 arg1) {
        if ((arg1 instanceof class170)) {
            class170 var3 = (class170) arg1;
            if (var3.field2492 != null) {
                class273.method1768(class644.field9367.field5116 != var3.field5116, 20902, var3);
            }
        } else if (arg1 instanceof class400) {
            class400 var2 = (class400) arg1;
            class47.method421(-1, class644.field9367.field5116 != var2.field5116, var2);
        }
        field1317++;
        if (arg0 != -1) {
            field1320 = 84;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
    public abstract void method684(int arg0);

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljj;I[BIZ)V")
    public class70(class66 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1313 = arg3;
        this.field1311 = arg1;
        this.field1319 = arg4;
        this.field1314 = arg0;
        OpenGL.glGenBuffersARB(1, class169.field2461, 0);
        this.field1312 = class169.field2461[0];
        this.method684(58);
        OpenGL.glBufferDataARBub(arg1, this.field1313, arg2, 0, this.field1319 ? 35040 : 35044);
        this.field1314.field1148 += this.field1313;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
    public static final void method685(short[] arg0, String[] arg1, int arg2) {
        class524.method2955(arg1, arg0, arg1.length + arg2, 0, (byte) 110);
        field1315++;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljj;ILjaclib/memory/Buffer;IZ)V")
    public class70(class66 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1319 = arg4;
        this.field1314 = arg0;
        this.field1313 = arg3;
        this.field1311 = arg1;
        OpenGL.glGenBuffersARB(1, class169.field2461, 0);
        this.field1312 = class169.field2461[0];
        this.method684(58);
        OpenGL.glBufferDataARBa(arg1, this.field1313, arg2.getAddress(), this.field1319 ? 35040 : 35044);
        this.field1314.field1148 += this.field1313;
    }
}
