import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class742 extends class301 {

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "Lwo;")
    private class722 field10053;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "Lnc;")
    private class516 field10045;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)V", line = 6)
    public final void method22(int arg0, int arg1, int arg2) {
        ++field10050;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg1 >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (128 & arg1) != 0;
        super.field3803.method3945(1, false);
        if (var7) {
            class63.field833[1] = 0.0F;
            class63.field833[3] = 0.0F;
            class63.field833[2] = 0.0F;
            class63.field833[0] = var6;
        } else {
            class63.field833[3] = 0.0F;
            class63.field833[1] = 0.0F;
            class63.field833[2] = var6;
            class63.field833[0] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class63.field833, 0);
        class63.field833[2] = 0.0F;
        class63.field833[3] = (float) super.field3803.field9807 * var4 % 1.0F;
        class63.field833[1] = var6;
        class63.field833[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class63.field833, arg2);
        if (this.field10053.field9478) {
            class63.field833[3] = (float) super.field3803.field9807 * var5 % 1.0F;
            class63.field833[0] = 0.0F;
            class63.field833[2] = 0.0F;
            class63.field833[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class63.field833, 0);
        } else {
            int var8 = (int) ((float) super.field3803.field9807 * var5 * 16.0F);
            super.field3803.method3975((byte) 115, this.field10053.field9482[var8 % 16]);
        }
        super.field3803.method3945(0, false);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B[Lpu;)V", line = 63)
    public static final void method4035(byte arg0, class772[] arg1) {
        ++field10049;
        class17.field165 = arg1.length;
        if (arg0 >= 44) {
            class269.field3556 = new class772[class17.field165 + 10];
            class230.field3103 = new int[class17.field165 + 10];
            class642.method3474(arg1, 0, class269.field3556, 0, class17.field165);
            for (int var2 = 0; var2 < class17.field165; ++var2) {
                class230.field3103[var2] = class269.field3556[var2].method628();
            }
            for (int var3 = class17.field165; var3 < class269.field3556.length; ++var3) {
                class230.field3103[var3] = 12;
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)V", line = 92)
    public final void method29(int arg0, boolean arg1) {
        ++field10051;
        this.field10045.method2855(4864, '\u0000');
        if (this.field10053.field9478) {
            super.field3803.method3945(1, false);
            super.field3803.method3975((byte) 126, this.field10053.field9485);
            super.field3803.method3945(0, false);
        }
        if (arg0 <= 18) {
            this.method24((byte) -11);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lwj;II)V", line = 111)
    public final void method28(class128 arg0, int arg1, int arg2) {
        super.field3803.method3975((byte) 113, arg0);
        ++field10054;
        super.field3803.method3979((byte) 90, arg2);
        if (arg1 != 0) {
            this.method22(106, 21, 61);
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V", line = 123)
    public final void method24(byte arg0) {
        this.field10045.method2855(4864, '\u0001');
        if (arg0 > -89) {
            this.field10045 = null;
        }
        ++field10046;
        super.field3803.method3945(1, false);
        super.field3803.method3975((byte) 115, (class128) null);
        super.field3803.method3945(0, false);
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lck;Lwo;)V", line = 137)
    public class742(class733 arg0, class722 arg1) {
        super(arg0);
        this.field10053 = arg1;
        this.field10045 = new class516(arg0, 2);
        this.field10045.method2857(0, (byte) -114);
        super.field3803.method3945(1, false);
        if (this.field10053.field9478) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3803.method3945(0, false);
        this.field10045.method2856((byte) -81);
        this.field10045.method2857(1, (byte) -113);
        super.field3803.method3945(1, false);
        if (this.field10053.field9478) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3803.method3945(0, false);
        this.field10045.method2856((byte) -107);
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(IZ)V", line = 169)
    public final void method27(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field10052;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)Z", line = 180)
    public final boolean method25(byte arg0) {
        if (arg0 < 7) {
            field10047 = 47;
        }
        ++field10048;
        return true;
    }
}
