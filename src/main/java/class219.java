import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class219 extends class239 {

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "F")
    public float field2874;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "Z")
    public boolean field2876;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "F")
    public float field2872;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "Lgga;")
    public static class462 field2875 = new class462();

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field2878 = 0;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "Lra;")
    public static class361 field2879 = new class361(102, 0);

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field2881 = -1;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "Lra;")
    public static class361 field2882 = new class361(30, -1);

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIIII[BI)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2871 = arg3;
        this.field2877 = arg2;
        this.method1512(0, 5065, 0, arg6, true, arg2, 0, arg7, 0, arg3);
        this.field2874 = (float) arg2 / (float) arg4;
        this.field2876 = false;
        this.field2872 = (float) arg3 / (float) arg5;
        this.method1504(false, (byte) 57, false);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIII)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field9928 == 34037) {
            this.field2872 = (float) arg4;
            this.field2876 = false;
            this.field2874 = (float) arg3;
        } else {
            this.field2876 = true;
            this.field2874 = this.field2872 = 1.0F;
        }
        this.field2877 = arg3;
        this.field2871 = arg4;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIIIZ[BI)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field9928 == -34038) {
            this.field2872 = (float) arg4;
            this.field2874 = (float) arg3;
            this.field2876 = false;
        } else {
            this.field2874 = this.field2872 = 1.0F;
            this.field2876 = true;
        }
        this.field2877 = arg3;
        this.field2871 = arg4;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIII[I)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2871 = arg2;
        this.field2877 = arg1;
        this.method1511(0, arg1, arg2, 0, 0, 0, 0, arg5, true);
        this.field2876 = false;
        this.field2872 = (float) arg2 / (float) arg4;
        this.field2874 = (float) arg1 / (float) arg3;
        this.method1504(false, (byte) 54, false);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLe;Ljava/awt/Canvas;Z)Loa;")
    public static final class43 method1398(byte arg0, class702 arg1, Canvas arg2, boolean arg3) {
        ++field2873;
        if (arg0 > -14) {
            method1399(-118);
        }
        return arg3 ? new class110(arg2, arg1) : new class449(arg2, arg1);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIIZ[I)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field2871 = arg3;
        if (~super.field9928 != -34038) {
            this.field2874 = this.field2872 = 1.0F;
            this.field2876 = true;
        } else {
            this.field2874 = (float) arg2;
            this.field2876 = false;
            this.field2872 = (float) arg3;
        }
        this.field2877 = arg2;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIIIIIZ)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2876 = false;
        this.field2872 = (float) arg4 / (float) arg6;
        this.field2874 = (float) arg3 / (float) arg5;
        this.field2877 = arg3;
        this.field2871 = arg4;
        this.method1504(false, (byte) 42, false);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIIIIZ)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2871 = arg5;
        this.field2877 = arg4;
        if (~super.field9928 != -34038) {
            this.field2874 = this.field2872 = 1.0F;
            this.field2876 = true;
        } else {
            this.field2876 = false;
            this.field2874 = (float) arg4;
            this.field2872 = (float) arg5;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lji;IIIII)V")
    public class219(class622 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2874 = (float) arg2 / (float) arg4;
        this.field2872 = (float) arg3 / (float) arg5;
        this.field2871 = arg3;
        this.field2877 = arg2;
        this.field2876 = false;
        this.method1504(false, (byte) 44, false);
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field2879 = null;
        field2875 = null;
        field2882 = null;
        if (arg0 != 0) {
            method1399(10);
        }
    }
}
