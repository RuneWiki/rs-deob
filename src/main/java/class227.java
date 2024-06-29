import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class227 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
    private boolean field3190;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lad;")
    public class362 field3185;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "F")
    public static float field3189 = 1.0F;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "J")
    public static long field3183 = -1L;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Lkea;")
    public static class203 field3191;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lmca;")
    public static class28 field3184;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 4)
    public static void method1474(int arg0) {
        field3184 = null;
        field3191 = null;
        if (arg0 != -1945) {
            method1475(26, -57, 6, -58);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)V", line = 17)
    public static final void method1475(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field3191 = null;
        }
        class443.field6617 = new byte[arg0][arg3][arg1];
        field3192++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([BII)V", line = 32)
    public final void method1476(byte[] arg0, int arg1, int arg2) {
        this.method451(1102);
        field3182++;
        if (arg2 != 0) {
            this.method1476(null, -3, 46);
        }
        if (arg1 <= this.field3181) {
            OpenGL.glBufferSubDataARBub(this.field3180, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field3180, arg1, arg0, 0, this.field3190 ? 35040 : 35044);
            this.field3185.field5363 += arg1 - this.field3181;
            this.field3181 = arg1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "finalize", descriptor = "()V", line = 56)
    protected final void finalize() throws Throwable {
        this.field3185.method2314(this.field3181, this.field3186, (byte) -113);
        field3187++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z", line = 68)
    public static final boolean method1477(int arg0, int arg1) {
        field3188++;
        if (class119.field1484[arg0]) {
            return true;
        } else if (class515.field7512.method1312(0, arg0)) {
            int var2 = class515.field7512.method1309(1675886592, arg0);
            if (~var2 == arg1) {
                class119.field1484[arg0] = true;
                return true;
            }
            if (class297.field4403[arg0] == null) {
                class297.field4403[arg0] = new class593[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class297.field4403[arg0][var3] == null) {
                    byte[] var4 = class515.field7512.method1286(var3, arg0, (byte) -49);
                    if (var4 != null) {
                        class593 var5 = class297.field4403[arg0][var3] = new class593();
                        var5.field8579 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method3461(new class194(var4), true);
                    }
                }
            }
            class119.field1484[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lad;I[BIZ)V", line = 135)
    public class227(class362 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3190 = arg4;
        this.field3181 = arg3;
        this.field3180 = arg1;
        this.field3185 = arg0;
        OpenGL.glGenBuffersARB(1, class615.field8951, 0);
        this.field3186 = class615.field8951[0];
        this.method451(1102);
        OpenGL.glBufferDataARBub(arg1, this.field3181, arg2, 0, this.field3190 ? 35040 : 35044);
        this.field3185.field5363 += this.field3181;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lad;ILjaclib/memory/Buffer;IZ)V", line = 154)
    public class227(class362 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field3181 = arg3;
        this.field3180 = arg1;
        this.field3190 = arg4;
        this.field3185 = arg0;
        OpenGL.glGenBuffersARB(1, class615.field8951, 0);
        this.field3186 = class615.field8951[0];
        this.method451(1102);
        OpenGL.glBufferDataARBa(arg1, this.field3181, arg2.getAddress(), this.field3190 ? 35040 : 35044);
        this.field3185.field5363 += this.field3181;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
    public abstract void method451(int arg0);
}
