import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class664 extends class182 {

    @OriginalMember(owner = "client!qt", name = "Q", descriptor = "I")
    public int field9126;

    @OriginalMember(owner = "client!qt", name = "K", descriptor = "I")
    public int field9120;

    @OriginalMember(owner = "client!qt", name = "N", descriptor = "F")
    public float field9123;

    @OriginalMember(owner = "client!qt", name = "R", descriptor = "F")
    public float field9127;

    @OriginalMember(owner = "client!qt", name = "T", descriptor = "Z")
    public boolean field9129;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "Z")
    public static boolean field9119 = false;

    @OriginalMember(owner = "client!qt", name = "O", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9124 = new Hashtable();

    @OriginalMember(owner = "client!qt", name = "S", descriptor = "Llja;")
    public static class744 field9128 = new class744(80, -1);

    @OriginalMember(owner = "client!qt", name = "L", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!qt", name = "M", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!qt", name = "P", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIII[I)V", line = 3)
    public class664(class700 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field9126 = arg2;
        this.field9120 = arg1;
        this.method1217(0, arg1, true, 0, arg5, 0, 0, 0, arg2);
        this.field9123 = (float) arg2 / (float) arg4;
        this.field9127 = (float) arg1 / (float) arg3;
        this.field9129 = false;
        this.method1221(false, -1, false);
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIIII)V", line = 17)
    public class664(class700 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field9126 = arg3;
        this.field9127 = (float) arg2 / (float) arg4;
        this.field9120 = arg2;
        this.field9129 = false;
        this.field9123 = (float) arg3 / (float) arg5;
        this.method1221(false, -1, false);
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIIZ[III)V", line = 35)
    public class664(class700 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field5235 == -34038) {
            this.field9123 = (float) arg3;
            this.field9129 = false;
            this.field9127 = (float) arg2;
        } else {
            this.field9129 = true;
            this.field9127 = this.field9123 = 1.0F;
        }
        this.field9120 = arg2;
        this.field9126 = arg3;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ID)V", line = 60)
    public static final void method3728(int arg0, double arg1) {
        ++field9125;
        if (arg0 != 0) {
            method3731(93);
        }
        if (class171.field2049 != arg1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class761.field10529[var3] = ~var4 >= -256 ? var4 : 255;
            }
            class171.field2049 = arg1;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIII)V", line = 87)
    public class664(class700 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9126 = arg4;
        this.field9120 = arg3;
        if (~super.field5235 != -34038) {
            this.field9129 = true;
            this.field9127 = this.field9123 = 1.0F;
        } else {
            this.field9127 = (float) arg3;
            this.field9123 = (float) arg4;
            this.field9129 = false;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIIIZ[BI)V", line = 109)
    public class664(class700 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field9120 = arg3;
        this.field9126 = arg4;
        if (~super.field5235 != -34038) {
            this.field9129 = true;
            this.field9127 = this.field9123 = 1.0F;
        } else {
            this.field9129 = false;
            this.field9123 = (float) arg4;
            this.field9127 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIIIIIZ)V", line = 133)
    public class664(class700 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field9126 = arg4;
        this.field9123 = (float) arg4 / (float) arg6;
        this.field9129 = false;
        this.field9120 = arg3;
        this.field9127 = (float) arg3 / (float) arg5;
        this.method1221(false, -1, false);
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIIII[BI)V", line = 146)
    public class664(class700 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field9120 = arg2;
        this.field9126 = arg3;
        this.method1218(arg7, true, 0, arg6, 0, (byte) 102, arg3, 0, 0, arg2);
        this.field9127 = (float) arg2 / (float) arg4;
        this.field9123 = (float) arg3 / (float) arg5;
        this.field9129 = false;
        this.method1221(false, -1, false);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIBII)V", line = 160)
    public static final void method3729(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class403.field5319 = arg0;
        class572.field7844 = arg4;
        if (arg2 != 27) {
            field9119 = true;
        }
        class449.field6221 = arg3;
        class230.field2729 = arg1;
        ++field9121;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)I", line = 178)
    public static final int method3730(int arg0, int arg1) {
        if (arg0 != 21981) {
            return 63;
        } else {
            ++field9122;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lpc;IIIIIZ)V", line = 189)
    public class664(class700 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field5235 != -34038) {
            this.field9129 = true;
            this.field9127 = this.field9123 = 1.0F;
        } else {
            this.field9127 = (float) arg4;
            this.field9123 = (float) arg5;
            this.field9129 = false;
        }
        this.field9126 = arg5;
        this.field9120 = arg4;
    }

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "(I)V", line = 215)
    public static void method3731(int arg0) {
        field9124 = null;
        if (arg0 == -4437) {
            field9128 = null;
        }
    }
}
