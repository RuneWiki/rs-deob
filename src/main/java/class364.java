import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class364 extends class615 {

    @OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
    public int field5158;

    @OriginalMember(owner = "client!ll", name = "T", descriptor = "Z")
    public boolean field5156;

    @OriginalMember(owner = "client!ll", name = "P", descriptor = "F")
    public float field5152;

    @OriginalMember(owner = "client!ll", name = "R", descriptor = "F")
    public float field5154;

    @OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
    public static int field5151 = 0;

    @OriginalMember(owner = "client!ll", name = "X", descriptor = "Lqfa;")
    public static class98 field5160 = new class98(56, 4);

    @OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ll", name = "Y", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIIZ[III)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5153 = arg3;
        this.field5158 = arg2;
        if (~super.field2781 != -34038) {
            this.field5156 = true;
            this.field5154 = this.field5152 = 1.0F;
        } else {
            this.field5154 = (float) arg2;
            this.field5156 = false;
            this.field5152 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIIIIZ)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field2781 != 34037) {
            this.field5154 = this.field5152 = 1.0F;
            this.field5156 = true;
        } else {
            this.field5156 = false;
            this.field5154 = (float) arg4;
            this.field5152 = (float) arg5;
        }
        this.field5158 = arg4;
        this.field5153 = arg5;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(BII)Z")
    public static final boolean method2319(byte arg0, int arg1, int arg2) {
        if (arg0 > -6) {
            return true;
        } else {
            ++field5159;
            if (~arg1 <= -1 && arg2 >= 0 && class651.field8948[1].length > arg1 && class651.field8948[1][arg1].length > arg2) {
                return ~(class651.field8948[1][arg1][arg2] & 2) != -1;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V")
    public static final void method2320(boolean arg0, int arg1) {
        if (arg1 != -14543) {
            method2320(true, -114);
        }
        ++field5161;
        class570.method3279(class172.field2348, true, class457.field6447, class446.field6323, arg0);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIIIIIZ)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5153 = arg4;
        this.field5152 = (float) arg4 / (float) arg6;
        this.field5156 = false;
        this.field5154 = (float) arg3 / (float) arg5;
        this.field5158 = arg3;
        this.method3445(false, false, 127);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIIIZ[BI)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5153 = arg4;
        this.field5158 = arg3;
        if (~super.field2781 == -34038) {
            this.field5152 = (float) arg4;
            this.field5154 = (float) arg3;
            this.field5156 = false;
        } else {
            this.field5154 = this.field5152 = 1.0F;
            this.field5156 = true;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIIII[BI)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5153 = arg3;
        this.field5158 = arg2;
        this.method3446(arg2, true, 0, false, arg7, arg6, 0, arg3, 0, 0);
        this.field5152 = (float) arg3 / (float) arg5;
        this.field5154 = (float) arg2 / (float) arg4;
        this.field5156 = false;
        this.method3445(false, false, 85);
    }

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)V")
    public static void method2321(int arg0) {
        int var1 = 43 / ((-48 - arg0) / 49);
        field5160 = null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIII[I)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5153 = arg2;
        this.field5158 = arg1;
        this.method3440(0, 0, arg5, true, arg1, 0, -126, 0, arg2);
        this.field5152 = (float) arg2 / (float) arg4;
        this.field5156 = false;
        this.field5154 = (float) arg1 / (float) arg3;
        this.method3445(false, false, 91);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Z")
    public static final boolean method2322(int arg0, byte arg1) {
        if (arg1 != -88) {
            return false;
        } else {
            ++field5155;
            return arg0 >= 4 && arg0 <= 8;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIII)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5153 = arg4;
        if (super.field2781 != 34037) {
            this.field5156 = true;
            this.field5154 = this.field5152 = 1.0F;
        } else {
            this.field5156 = false;
            this.field5154 = (float) arg3;
            this.field5152 = (float) arg4;
        }
        this.field5158 = arg3;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Leea;IIIII)V")
    public class364(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5156 = false;
        this.field5158 = arg2;
        this.field5153 = arg3;
        this.field5154 = (float) arg2 / (float) arg4;
        this.field5152 = (float) arg3 / (float) arg5;
        this.method3445(false, false, 95);
    }
}
