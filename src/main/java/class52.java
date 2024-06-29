import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class52 extends class412 {

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Lpr;")
    public static class407 field546 = new class407(76, 16);

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 3)
    public final void method260(byte arg0) {
        int var2 = -42 % (arg0 / 38);
        ++field544;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I", line = 12)
    public static final int method261(int arg0) {
        ++field543;
        if (class215.field2615) {
            return 6;
        } else if (class122.field1377 == null) {
            return 0;
        } else {
            if (arg0 >= -81) {
                field546 = null;
            }
            int var1 = class122.field1377.field2527;
            if (class138.method769(var1, 107)) {
                return 1;
            } else if (class455.method2586(var1, (byte) -50)) {
                return 2;
            } else if (class429.method2304(15311, var1)) {
                return 3;
            } else {
                return class662.method3721((byte) 109, var1) ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V", line = 46)
    public static void method262(int arg0) {
        field546 = null;
        if (arg0 <= 58) {
            field546 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V", line = 57)
    public final void method263(boolean arg0, int arg1) {
        ++field542;
        if (arg1 != 3) {
            method262(-59);
        }
        super.field5478.method2388((byte) -30, this);
        OpenGL.glTexParameteri(super.field5464, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V", line = 69)
    public static final void method264(int arg0, boolean arg1) {
        ++field545;
        if (arg1) {
            class530 var2 = class242.method1402(-105, 2, arg0);
            var2.method3027((byte) -122);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BII)[B", line = 85)
    public static final byte[] method265(byte[] arg0, int arg1, int arg2) {
        ++field548;
        byte[] var3 = new byte[arg1];
        class652.method3679(arg0, arg2, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lap;II[BI)V", line = 103)
    public class52(class435 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field547 = arg2;
        super.field5478.method2388((byte) -51, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5464, 0, super.field5470, this.field547, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2233((byte) -99, true);
    }
}
