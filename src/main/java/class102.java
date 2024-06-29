import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public abstract class class102 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
    private boolean field1943;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lda;")
    public class44 field1939;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[I")
    public static int[] field1938 = new int[5];

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[I")
    public static int[] field1940 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lcd;")
    public static class208 field1945 = new class208("", 16);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lph;")
    public static class459 field1946;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lcg;")
    public static class93 field1942;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BII)V", line = 3)
    public final void method894(byte[] arg0, int arg1, int arg2) {
        if (arg1 > -101) {
            field1945 = null;
        }
        this.method897(-100);
        field1947++;
        if (this.field1941 >= arg2) {
            OpenGL.glBufferSubDataARB(this.field1936, 0, arg2, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field1936, arg2, arg0, 0, this.field1943 ? 35040 : 35044);
            this.field1939.field818 += arg2 - this.field1941;
            this.field1941 = arg2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 35)
    public static final void method895(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class486.field7167[var1] = true;
        }
        field1937++;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 49)
    public static void method896(int arg0) {
        field1940 = null;
        field1938 = null;
        field1942 = null;
        field1946 = null;
        field1945 = null;
        if (arg0 != 5) {
            field1942 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "finalize", descriptor = "()V", line = 63)
    protected final void finalize() throws Throwable {
        field1934++;
        this.field1939.method445(this.field1941, 14550, this.field1935);
        super.finalize();
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lda;I[BIZ)V", line = 84)
    public class102(class44 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1936 = arg1;
        this.field1941 = arg3;
        this.field1943 = arg4;
        this.field1939 = arg0;
        OpenGL.glGenBuffersARB(1, class466.field6931, 0);
        this.field1935 = class466.field6931[0];
        this.method897(-95);
        OpenGL.glBufferDataARBub(arg1, this.field1941, arg2, 0, this.field1943 ? 35040 : 35044);
        this.field1939.field818 += this.field1941;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lda;ILjaggl/memory/NativeBuffer;IZ)V", line = 107)
    public class102(class44 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field1943 = arg4;
        this.field1936 = arg1;
        this.field1941 = arg3;
        this.field1939 = arg0;
        OpenGL.glGenBuffersARB(1, class466.field6931, 0);
        this.field1935 = class466.field6931[0];
        this.method897(-87);
        OpenGL.glBufferDataARBa(arg1, this.field1941, arg2.method2641(), this.field1943 ? 35040 : 35044);
        this.field1939.field818 += this.field1941;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
    public abstract void method897(int arg0);
}
