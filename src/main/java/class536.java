import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class536 extends class187 {

    @OriginalMember(owner = "client!gq", name = "Y", descriptor = "I")
    public int field7877;

    @OriginalMember(owner = "client!gq", name = "bb", descriptor = "I")
    public int field7880;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "F")
    public float field7871;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "Z")
    public boolean field7869;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "F")
    public float field7867;

    @OriginalMember(owner = "client!gq", name = "V", descriptor = "[I")
    public static int[] field7874 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!gq", name = "W", descriptor = "[I")
    public static int[] field7875 = new int[13];

    @OriginalMember(owner = "client!gq", name = "Z", descriptor = "I")
    public static int field7878 = 0;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
    public static int field7868 = 0;

    @OriginalMember(owner = "client!gq", name = "X", descriptor = "I")
    public static int field7876 = -1;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!gq", name = "ab", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "Lpu;")
    public static class411 field7873;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "Lqs;")
    public static class496 field7870;

    @OriginalMember(owner = "client!gq", name = "cb", descriptor = "Lqs;")
    public static class496 field7881;

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lih;IIII[I)V", line = 4)
    public class536(class214 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field7877 = arg1;
        this.field7880 = arg2;
        this.method1272(0, true, arg2, (byte) -27, arg5, 0, arg1, 0, 0);
        this.field7871 = (float) arg2 / (float) arg4;
        this.field7869 = false;
        this.field7867 = (float) arg1 / (float) arg3;
        this.method1262(-1, false, false);
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lih;IIIII[BI)V", line = 19)
    public class536(class214 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7880 = arg3;
        this.field7877 = arg2;
        this.method1268(arg2, (byte) 125, true, 0, arg6, arg3, arg7, 0, 0, 0);
        this.field7869 = false;
        this.field7867 = (float) arg2 / (float) arg4;
        this.field7871 = (float) arg3 / (float) arg5;
        this.method1262(-1, false, false);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method3173(int arg0, int arg1, int arg2) {
        ++field7879;
        if (arg1 != -1) {
            method3173(-96, -16, 127);
        }
        return ~(arg2 & 544) == -545 | ~(arg2 & 24) != -1;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lih;IIIIIZ)V", line = 50)
    public class536(class214 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field7877 = arg4;
        if (~super.field2829 == -34038) {
            this.field7871 = (float) arg5;
            this.field7867 = (float) arg4;
            this.field7869 = false;
        } else {
            this.field7869 = true;
            this.field7867 = this.field7871 = 1.0F;
        }
        this.field7880 = arg5;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lih;IIIZ[I)V", line = 71)
    public class536(class214 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field7880 = arg3;
        if (~super.field2829 != -34038) {
            this.field7867 = this.field7871 = 1.0F;
            this.field7869 = true;
        } else {
            this.field7871 = (float) arg3;
            this.field7869 = false;
            this.field7867 = (float) arg2;
        }
        this.field7877 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IFFF)F", line = 100)
    public static final float method3174(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 != 0) {
            field7881 = null;
        }
        ++field7872;
        return (-arg2 + arg3) * arg1 + arg2;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V", line = 112)
    public static void method3175(byte arg0) {
        field7881 = null;
        field7873 = null;
        if (arg0 == 36) {
            field7874 = null;
            field7870 = null;
            field7875 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lih;IIIIZ[BI)V", line = 140)
    public class536(class214 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field7880 = arg4;
        if (~super.field2829 != -34038) {
            this.field7867 = this.field7871 = 1.0F;
            this.field7869 = true;
        } else {
            this.field7869 = false;
            this.field7871 = (float) arg4;
            this.field7867 = (float) arg3;
        }
        this.field7877 = arg3;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lih;IIIIIIZ)V", line = 162)
    public class536(class214 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field7871 = (float) arg4 / (float) arg6;
        this.field7877 = arg3;
        this.field7867 = (float) arg3 / (float) arg5;
        this.field7869 = false;
        this.field7880 = arg4;
        this.method1262(-1, false, false);
    }
}
