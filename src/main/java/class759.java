import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class759 extends class158 {

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public int field10470;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public int field10474;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "Z")
    public boolean field10471;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "F")
    public float field10473;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "F")
    public float field10476;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "Ljo;")
    public static class351 field10477 = new class351(45, 11);

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    public static int field10478;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[BB)[B", line = 3)
    public static final byte[] method4188(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field10475;
        byte[] var4;
        if (arg1 <= 0) {
            var4 = arg2;
        } else {
            var4 = new byte[arg0];
            for (int var5 = 0; ~arg0 < ~var5; ++var5) {
                var4[var5] = arg2[arg1 + var5];
            }
        }
        class113 var6 = new class113();
        int var7 = -61 / ((-39 - arg3) / 54);
        var6.method806(true);
        var6.method809((long) (arg0 * 8), var4, 82);
        byte[] var8 = new byte[64];
        var6.method804(78, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(IZ)V", line = 35)
    public static final void method4189(int arg0, boolean arg1) {
        if (~class145.field1852.field9024.method3770((byte) -43) == -1) {
            arg0 = -1;
        }
        ++field10472;
        if (class776.field10708 != arg0) {
            if (~arg0 != 0) {
                class364 var2 = class604.field8501.method1995(arg0, -94);
                class625 var3 = var2.method2273((byte) 68);
                if (var3 == null) {
                    arg0 = -1;
                } else {
                    class27.field395.method3420(var3.method3573(), var3.method3584(), var3.method3586(), class359.field5219, (byte) -57, new Point(var2.field5269, var2.field5263));
                    class776.field10708 = arg0;
                }
            }
            if (!arg1) {
                method4191((byte) -3);
            }
            if (~arg0 == 0 && ~class776.field10708 != 0) {
                class27.field395.method3420((int[]) null, -1, -1, class359.field5219, (byte) -57, new Point());
                class776.field10708 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIIIIIZ)V", line = 76)
    public class759(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field10470 = arg4;
        this.field10474 = arg3;
        this.field10471 = false;
        this.field10473 = (float) arg3 / (float) arg5;
        this.field10476 = (float) arg4 / (float) arg6;
        this.method1252(false, 3314, false);
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 90)
    public static void method4190(int arg0) {
        if (arg0 >= -126) {
            field10477 = null;
        }
        field10477 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIIZ[III)V", line = 102)
    public class759(class280 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field10470 = arg3;
        if (~super.field8452 == -34038) {
            this.field10476 = (float) arg3;
            this.field10473 = (float) arg2;
            this.field10471 = false;
        } else {
            this.field10471 = true;
            this.field10473 = this.field10476 = 1.0F;
        }
        this.field10474 = arg2;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIIIZ[BI)V", line = 126)
    public class759(class280 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field10474 = arg3;
        if (~super.field8452 != -34038) {
            this.field10473 = this.field10476 = 1.0F;
            this.field10471 = true;
        } else {
            this.field10471 = false;
            this.field10476 = (float) arg4;
            this.field10473 = (float) arg3;
        }
        this.field10470 = arg4;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIII[I)V", line = 148)
    public class759(class280 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field10470 = arg2;
        this.field10474 = arg1;
        this.method1254(0, arg1, arg5, true, 0, 1, 0, arg2, 0);
        this.field10476 = (float) arg2 / (float) arg4;
        this.field10471 = false;
        this.field10473 = (float) arg1 / (float) arg3;
        this.method1252(false, 3314, false);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIIII[BI)V", line = 163)
    public class759(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field10470 = arg3;
        this.field10474 = arg2;
        this.method1257((byte) 114, 0, arg7, 0, 0, arg2, 0, arg6, arg3, true);
        this.field10473 = (float) arg2 / (float) arg4;
        this.field10471 = false;
        this.field10476 = (float) arg3 / (float) arg5;
        this.method1252(false, 3314, false);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 177)
    public static final void method4191(byte arg0) {
        ++field10478;
        int var1 = 0;
        if (arg0 < 42) {
            field10477 = null;
        }
        while (~var1 > -101) {
            class222.field3188[var1] = null;
            ++var1;
        }
        class9.field207 = 0;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIIII)V", line = 195)
    public class759(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field10476 = (float) arg3 / (float) arg5;
        this.field10470 = arg3;
        this.field10471 = false;
        this.field10474 = arg2;
        this.field10473 = (float) arg2 / (float) arg4;
        this.method1252(false, 3314, false);
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIIIIZ)V", line = 212)
    public class759(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field10474 = arg4;
        this.field10470 = arg5;
        if (super.field8452 != 34037) {
            this.field10471 = true;
            this.field10473 = this.field10476 = 1.0F;
        } else {
            this.field10471 = false;
            this.field10473 = (float) arg4;
            this.field10476 = (float) arg5;
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lkv;IIII)V", line = 233)
    public class759(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field8452 != 34037) {
            this.field10473 = this.field10476 = 1.0F;
            this.field10471 = true;
        } else {
            this.field10473 = (float) arg3;
            this.field10476 = (float) arg4;
            this.field10471 = false;
        }
        this.field10474 = arg3;
        this.field10470 = arg4;
    }
}
