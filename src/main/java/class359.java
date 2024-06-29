import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class359 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field5503;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Lod;")
    public class349 field5502;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Z")
    private boolean field5507;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    private int field5509;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public int field5508;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lng;")
    public static class226 field5506 = new class226(5);

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lki;")
    public static class498 field5511 = new class498(20, 8);

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field5515 = new String[100];

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lai;")
    public static class423 field5513 = new class423("stellardawn", 1);

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field5516 = -1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 7)
    public static void method2228(byte arg0) {
        field5506 = null;
        field5513 = null;
        field5515 = null;
        if (arg0 != -56) {
            method2229(2, -48, 86, (byte) 21);
        }
        field5511 = null;
    }

    @OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() throws Throwable {
        field5501++;
        this.field5502.method2128(this.field5508, this.field5509, 8);
        super.finalize();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIB)V", line = 35)
    public static final void method2229(int arg0, int arg1, int arg2, byte arg3) {
        if (arg2 == 0) {
            class470.field6929++;
            class291.method1861((byte) -104, class356.field5470);
        }
        field5510++;
        if (arg2 == 1) {
            class521.field7664++;
            class291.method1861((byte) -104, class3.field36);
        }
        class356.field5471.method1419(class162.field2368.method1352(82, 105) ? 1 : 0, -127);
        class356.field5471.method1413(-127, class24.field259 + arg0);
        class356.field5471.method1439(-61, class68.field1038 + arg1);
        class255.field3778 = false;
        class523.field7749 = arg0;
        if (arg3 >= 50) {
            class401.field6030 = arg1;
            class282.method1823(28460);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILm;ILjava/awt/Canvas;)Lqa;", line = 65)
    public static final class162 method2230(int arg0, class126 arg1, int arg2, Canvas arg3) {
        if (arg2 != 35040) {
            method2228((byte) 31);
        }
        field5505++;
        return new class216(arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIZI)V", line = 79)
    public static final void method2232(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            field5514 = 6;
        }
        if (class494.field7297 <= arg6 && arg3 <= class445.field6629 && arg1 >= class37.field393 && class509.field7436 >= arg2) {
            if (arg4 == 1) {
                class525.method3104(arg3, arg2, arg1, arg6, 30135, arg0);
            } else {
                class258.method1719(arg6, arg2, arg4, arg3, (byte) -49, arg0, arg1);
            }
        } else if (arg4 == 1) {
            class101.method618(-31341, arg2, arg6, arg3, arg1, arg0);
        } else {
            class231.method1586(arg1, arg3, arg2, arg6, arg0, arg4, (byte) -6);
        }
        field5504++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[BB)V", line = 111)
    public final void method2233(int arg0, byte[] arg1, byte arg2) {
        field5499++;
        this.method2231(true);
        if (arg2 != -57) {
            field5506 = null;
        }
        if (arg0 <= this.field5509) {
            OpenGL.glBufferSubDataARB(this.field5503, 0, arg0, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field5503, arg0, arg1, 0, this.field5507 ? 35040 : 35044);
            this.field5502.field5244 += arg0 - this.field5509;
            this.field5509 = arg0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILsq;I)Llg;", line = 138)
    public static final class284 method2234(int arg0, class117 arg1, int arg2) {
        field5500++;
        if (arg2 != -13659) {
            method2235(9, -110, 17, (byte) 31);
        }
        class284 var3;
        if (class91.field1370 == null) {
            var3 = new class284();
        } else {
            var3 = class91.field1370;
            class91.field1370 = class91.field1370.field4087;
            class74.field1106--;
            var3.field4087 = null;
        }
        var3.field4080 = arg0;
        var3.field4083 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lod;I[BIZ)V", line = 162)
    public class359(class349 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field5503 = arg1;
        this.field5502 = arg0;
        this.field5507 = arg4;
        this.field5509 = arg3;
        OpenGL.glGenBuffersARB(1, class11.field141, 0);
        this.field5508 = class11.field141[0];
        this.method2231(true);
        OpenGL.glBufferDataARBub(arg1, this.field5509, arg2, 0, this.field5507 ? 35040 : 35044);
        this.field5502.field5244 += this.field5509;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lod;ILjaggl/memory/NativeBuffer;IZ)V", line = 183)
    public class359(class349 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field5502 = arg0;
        this.field5507 = arg4;
        this.field5503 = arg1;
        this.field5509 = arg3;
        OpenGL.glGenBuffersARB(1, class11.field141, 0);
        this.field5508 = class11.field141[0];
        this.method2231(true);
        OpenGL.glBufferDataARBa(arg1, this.field5509, arg2.method2633(), this.field5507 ? 35040 : 35044);
        this.field5502.field5244 += this.field5509;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIB)V", line = 213)
    public static final void method2235(int arg0, int arg1, int arg2, byte arg3) {
        field5512++;
        class338 var4 = class230.method1580(9, arg3 ^ 0x4F673EAA, arg2);
        var4.method2053(-91);
        if (arg3 != -30) {
            field5511 = null;
        }
        var4.field4751 = arg0;
        var4.field4756 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
    public abstract void method2231(boolean arg0);
}
