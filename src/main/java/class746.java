import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class746 extends class260 {

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "I")
    public static int field10297 = 0;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field10293;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lfca;)V", line = 4)
    public class746(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I", line = 7)
    public final int method4127(int arg0) {
        if (arg0 < 3) {
            this.method4(-78, (byte) 55);
        }
        ++field10300;
        return super.field3868;
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(ILfca;)V", line = 23)
    public class746(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZI)Z", line = 26)
    public static final boolean method4128(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field10297 = -20;
        }
        ++field10299;
        return ~(arg0 & 34) != -1;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 38)
    public static final void method4129(int arg0, String arg1, String arg2, String arg3, int arg4, String arg5, int arg6) {
        class589.method3288(arg0, true, arg5, arg1, -1, arg2, arg4, arg3, (String) null);
        ++field10293;
        if (arg6 != 16773) {
            method4129(104, (String) null, (String) null, (String) null, 77, (String) null, -1);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V", line = 53)
    public final void method2(boolean arg0) {
        ++field10298;
        if (arg0) {
            this.method4127(117);
        }
        if (~super.field3868 != -2 && ~super.field3868 != -1) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IB)I", line = 67)
    public final int method4(int arg0, byte arg1) {
        ++field10294;
        int var3 = 26 % ((-53 - arg1) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(IB)V", line = 77)
    public final void method9(int arg0, byte arg1) {
        ++field10296;
        super.field3868 = arg0;
        if (arg1 != -107) {
            field10297 = 66;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I", line = 89)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            return -27;
        } else {
            ++field10295;
            return 1;
        }
    }
}
