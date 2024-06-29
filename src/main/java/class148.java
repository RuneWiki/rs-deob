import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class148 extends class109 {

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "Z")
    public boolean field1764;

    @OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "F")
    public float field1762;

    @OriginalMember(owner = "client!hq", name = "T", descriptor = "F")
    public float field1768;

    @OriginalMember(owner = "client!hq", name = "S", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!hq", name = "V", descriptor = "F")
    public static float field1770;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!hq", name = "R", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!hq", name = "W", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIIIIIZ)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1764 = false;
        this.field1769 = arg4;
        this.field1762 = (float) arg4 / (float) arg6;
        this.field1768 = (float) arg3 / (float) arg5;
        this.field1767 = arg3;
        this.method758(40, false, false);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z")
    public static final boolean method929(int arg0, int arg1, int arg2) {
        ++field1766;
        if (arg0 != 2048) {
            method930(8, -94, 11);
        }
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(III)I")
    public static final int method930(int arg0, int arg1, int arg2) {
        ++field1763;
        int var3 = 1;
        while (arg0 > 1) {
            if (~(1 & arg0) != -1) {
                var3 = arg1 * var3;
            }
            arg0 >>= 1;
            arg1 *= arg1;
        }
        if (arg0 == arg2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(II)V")
    public static final void method931(int arg0, int arg1) {
        if (arg0 == -15414) {
            ++field1771;
            class583.field7840 = arg1;
            class131.field1588.method1218(112);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIIZ[I)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1767 = arg2;
        this.field1769 = arg3;
        if (~super.field2169 == -34038) {
            this.field1762 = (float) arg3;
            this.field1764 = false;
            this.field1768 = (float) arg2;
        } else {
            this.field1768 = this.field1762 = 1.0F;
            this.field1764 = true;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIIIIZ)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field1767 = arg4;
        if (~super.field2169 == -34038) {
            this.field1768 = (float) arg4;
            this.field1762 = (float) arg5;
            this.field1764 = false;
        } else {
            this.field1764 = true;
            this.field1768 = this.field1762 = 1.0F;
        }
        this.field1769 = arg5;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIII)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1767 = arg3;
        if (super.field2169 != 34037) {
            this.field1768 = this.field1762 = 1.0F;
            this.field1764 = true;
        } else {
            this.field1762 = (float) arg4;
            this.field1768 = (float) arg3;
            this.field1764 = false;
        }
        this.field1769 = arg4;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIII[I)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1767 = arg1;
        this.field1769 = arg2;
        this.method764(0, 0, true, arg2, 0, 1, arg1, arg5, 0);
        this.field1762 = (float) arg2 / (float) arg4;
        this.field1768 = (float) arg1 / (float) arg3;
        this.field1764 = false;
        this.method758(55, false, false);
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIIII)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1762 = (float) arg3 / (float) arg5;
        this.field1767 = arg2;
        this.field1769 = arg3;
        this.field1764 = false;
        this.field1768 = (float) arg2 / (float) arg4;
        this.method758(126, false, false);
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIIII[BI)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1767 = arg2;
        this.field1769 = arg3;
        this.method765(arg2, arg7, 0, true, arg6, true, 0, arg3, 0, 0);
        this.field1768 = (float) arg2 / (float) arg4;
        this.field1764 = false;
        this.field1762 = (float) arg3 / (float) arg5;
        this.method758(54, false, false);
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljaa;IIIIZ[BI)V")
    public class148(class576 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1769 = arg4;
        if (super.field2169 == 34037) {
            this.field1768 = (float) arg3;
            this.field1762 = (float) arg4;
            this.field1764 = false;
        } else {
            this.field1768 = this.field1762 = 1.0F;
            this.field1764 = true;
        }
        this.field1767 = arg3;
    }
}
