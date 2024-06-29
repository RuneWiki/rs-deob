import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class665 extends class164 {

    @OriginalMember(owner = "client!nea", name = "O", descriptor = "F")
    public float field9322;

    @OriginalMember(owner = "client!nea", name = "R", descriptor = "F")
    public float field9325;

    @OriginalMember(owner = "client!nea", name = "S", descriptor = "Z")
    public boolean field9326;

    @OriginalMember(owner = "client!nea", name = "N", descriptor = "I")
    public int field9321;

    @OriginalMember(owner = "client!nea", name = "Q", descriptor = "I")
    public int field9324;

    @OriginalMember(owner = "client!nea", name = "P", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIIIZ[BI)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field1925 != -34038) {
            this.field9325 = this.field9322 = 1.0F;
            this.field9326 = true;
        } else {
            this.field9322 = (float) arg4;
            this.field9326 = false;
            this.field9325 = (float) arg3;
        }
        this.field9321 = arg3;
        this.field9324 = arg4;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIII)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9321 = arg3;
        if (super.field1925 == 34037) {
            this.field9322 = (float) arg4;
            this.field9325 = (float) arg3;
            this.field9326 = false;
        } else {
            this.field9325 = this.field9322 = 1.0F;
            this.field9326 = true;
        }
        this.field9324 = arg4;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIIII[BI)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field9321 = arg2;
        this.field9324 = arg3;
        this.method1146(arg7, 0, true, 0, 0, 0, arg2, (byte) 111, arg6, arg3);
        this.field9326 = false;
        this.field9322 = (float) arg3 / (float) arg5;
        this.field9325 = (float) arg2 / (float) arg4;
        this.method1151(false, 79, false);
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIIZ[III)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field9324 = arg3;
        this.field9321 = arg2;
        if (super.field1925 == 34037) {
            this.field9322 = (float) arg3;
            this.field9326 = false;
            this.field9325 = (float) arg2;
        } else {
            this.field9325 = this.field9322 = 1.0F;
            this.field9326 = true;
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIIIIZ)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field1925 != 34037) {
            this.field9326 = true;
            this.field9325 = this.field9322 = 1.0F;
        } else {
            this.field9322 = (float) arg5;
            this.field9325 = (float) arg4;
            this.field9326 = false;
        }
        this.field9324 = arg5;
        this.field9321 = arg4;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIIII)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field9326 = false;
        this.field9325 = (float) arg2 / (float) arg4;
        this.field9322 = (float) arg3 / (float) arg5;
        this.field9321 = arg2;
        this.field9324 = arg3;
        this.method1151(false, 58, false);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)Z")
    public static final boolean method3760(int arg0, int arg1, int arg2) {
        ++field9323;
        return arg2 != 3553;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIII[I)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field9321 = arg1;
        this.field9324 = arg2;
        this.method1150(arg2, 0, 0, true, arg5, 3314, arg1, 0, 0);
        this.field9325 = (float) arg1 / (float) arg3;
        this.field9322 = (float) arg2 / (float) arg4;
        this.field9326 = false;
        this.method1151(false, 95, false);
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Llj;IIIIIIZ)V")
    public class665(class565 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field9325 = (float) arg3 / (float) arg5;
        this.field9326 = false;
        this.field9322 = (float) arg4 / (float) arg6;
        this.field9324 = arg4;
        this.field9321 = arg3;
        this.method1151(false, 97, false);
    }
}
