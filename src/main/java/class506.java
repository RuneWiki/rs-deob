import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class506 extends class227 {

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public int field7156;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public int field7160;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "F")
    public float field7154;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "F")
    public float field7159;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "Z")
    public boolean field7157;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIIIIZ)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field7156 = arg4;
        this.field7160 = arg5;
        if (super.field7260 != 34037) {
            this.field7159 = this.field7154 = 1.0F;
            this.field7157 = true;
        } else {
            this.field7154 = (float) arg5;
            this.field7157 = false;
            this.field7159 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIIZ[III)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field7260 != -34038) {
            this.field7159 = this.field7154 = 1.0F;
            this.field7157 = true;
        } else {
            this.field7157 = false;
            this.field7159 = (float) arg2;
            this.field7154 = (float) arg3;
        }
        this.field7156 = arg2;
        this.field7160 = arg3;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIII[I)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field7160 = arg2;
        this.field7156 = arg1;
        this.method1420(0, true, arg5, arg1, arg2, (byte) -127, 0, 0, 0);
        this.field7159 = (float) arg1 / (float) arg3;
        this.field7154 = (float) arg2 / (float) arg4;
        this.field7157 = false;
        this.method1424(10242, false, false);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIIII)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7160 = arg3;
        this.field7157 = false;
        this.field7156 = arg2;
        this.field7154 = (float) arg3 / (float) arg5;
        this.field7159 = (float) arg2 / (float) arg4;
        this.method1424(10242, false, false);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIIII[BI)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field7156 = arg2;
        this.field7160 = arg3;
        this.method1423(0, 0, 0, arg2, arg3, arg6, 0, arg7, true, -43);
        this.field7157 = false;
        this.field7159 = (float) arg2 / (float) arg4;
        this.field7154 = (float) arg3 / (float) arg5;
        this.method1424(10242, false, false);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIIIIIZ)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field7159 = (float) arg3 / (float) arg5;
        this.field7160 = arg4;
        this.field7156 = arg3;
        this.field7154 = (float) arg4 / (float) arg6;
        this.field7157 = false;
        this.method1424(10242, false, false);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIII)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field7160 = arg4;
        if (~super.field7260 == -34038) {
            this.field7154 = (float) arg4;
            this.field7159 = (float) arg3;
            this.field7157 = false;
        } else {
            this.field7157 = true;
            this.field7159 = this.field7154 = 1.0F;
        }
        this.field7156 = arg3;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public static final String method2879(boolean arg0) {
        ++field7155;
        if (!class683.field9638 && class340.field4933 != null) {
            return arg0 ? null : class340.field4933.field6222;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Luca;IIIIZ[BI)V")
    public class506(class287 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field7260 == -34038) {
            this.field7159 = (float) arg3;
            this.field7157 = false;
            this.field7154 = (float) arg4;
        } else {
            this.field7159 = this.field7154 = 1.0F;
            this.field7157 = true;
        }
        this.field7156 = arg3;
        this.field7160 = arg4;
    }
}
