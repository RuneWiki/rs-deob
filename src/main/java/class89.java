import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class89 extends class692 {

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "F")
    public float field1360;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "Z")
    public boolean field1361;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "F")
    public float field1359;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "Lcb;")
    public static class631 field1362 = new class631(19, -1);

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Ltm;")
    public static class334 field1363 = new class334(46, 1);

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1364 = new CRC32();

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIIZ[III)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field7045 == 34037) {
            this.field1360 = (float) arg2;
            this.field1361 = false;
            this.field1359 = (float) arg3;
        } else {
            this.field1361 = true;
            this.field1360 = this.field1359 = 1.0F;
        }
        this.field1356 = arg2;
        this.field1357 = arg3;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static void method767(int arg0) {
        field1363 = null;
        field1364 = null;
        if (arg0 != 1) {
            field1362 = null;
        }
        field1362 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIIIIZ)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field7045 == 34037) {
            this.field1359 = (float) arg5;
            this.field1361 = false;
            this.field1360 = (float) arg4;
        } else {
            this.field1361 = true;
            this.field1360 = this.field1359 = 1.0F;
        }
        this.field1356 = arg4;
        this.field1357 = arg5;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIII)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1357 = arg4;
        this.field1356 = arg3;
        if (super.field7045 != 34037) {
            this.field1360 = this.field1359 = 1.0F;
            this.field1361 = true;
        } else {
            this.field1359 = (float) arg4;
            this.field1361 = false;
            this.field1360 = (float) arg3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIIIZ[BI)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1357 = arg4;
        this.field1356 = arg3;
        if (~super.field7045 == -34038) {
            this.field1359 = (float) arg4;
            this.field1360 = (float) arg3;
            this.field1361 = false;
        } else {
            this.field1360 = this.field1359 = 1.0F;
            this.field1361 = true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
    public static final void method768(int arg0, int arg1) {
        class69.field1070 = arg1;
        if (arg0 != 10794) {
            method768(-121, 37);
        }
        ++field1358;
        class186.field3110.method76(-114);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIIIIIZ)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1356 = arg3;
        this.field1360 = (float) arg3 / (float) arg5;
        this.field1361 = false;
        this.field1359 = (float) arg4 / (float) arg6;
        this.field1357 = arg4;
        this.method3862(false, false, -29630);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIII[I)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1357 = arg2;
        this.field1356 = arg1;
        this.method3860(0, arg1, 0, 0, arg5, 0, -70, true, arg2);
        this.field1360 = (float) arg1 / (float) arg3;
        this.field1359 = (float) arg2 / (float) arg4;
        this.field1361 = false;
        this.method3862(false, false, -29630);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIIII)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1360 = (float) arg2 / (float) arg4;
        this.field1356 = arg2;
        this.field1361 = false;
        this.field1359 = (float) arg3 / (float) arg5;
        this.field1357 = arg3;
        this.method3862(false, false, -29630);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lrs;IIIII[BI)V")
    public class89(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1357 = arg3;
        this.field1356 = arg2;
        this.method3858((byte) 116, 0, arg2, 0, 0, arg3, arg7, true, arg6, 0);
        this.field1359 = (float) arg3 / (float) arg5;
        this.field1361 = false;
        this.field1360 = (float) arg2 / (float) arg4;
        this.method3862(false, false, -29630);
    }
}
