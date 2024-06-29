import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class330 extends class316 {

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "F")
    public float field4349;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "F")
    public float field4352;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Z")
    public boolean field4350;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbo;IIIIIIZ)V")
    public class330(class511 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4346 = arg4;
        this.field4349 = (float) arg3 / (float) arg5;
        this.field4352 = (float) arg4 / (float) arg6;
        this.field4345 = arg3;
        this.field4350 = false;
        this.method1831(true, false, false);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbo;IIIZ[I)V")
    public class330(class511 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (~super.field6920 != -34038) {
            this.field4350 = true;
            this.field4349 = this.field4352 = 1.0F;
        } else {
            this.field4352 = (float) arg3;
            this.field4350 = false;
            this.field4349 = (float) arg2;
        }
        this.field4346 = arg3;
        this.field4345 = arg2;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbo;IIIIZ[BI)V")
    public class330(class511 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4345 = arg3;
        this.field4346 = arg4;
        if (super.field6920 == 34037) {
            this.field4349 = (float) arg3;
            this.field4352 = (float) arg4;
            this.field4350 = false;
        } else {
            this.field4349 = this.field4352 = 1.0F;
            this.field4350 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbo;IIIII[BI)V")
    public class330(class511 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4345 = arg2;
        this.field4346 = arg3;
        this.method1832(0, true, (byte) -41, arg6, 0, arg3, arg2, arg7, 0, 0);
        this.field4350 = false;
        this.field4352 = (float) arg3 / (float) arg5;
        this.field4349 = (float) arg2 / (float) arg4;
        this.method1831(true, false, false);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BC)Z")
    public static final boolean method1902(byte arg0, char arg1) {
        ++field4347;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else {
            if (arg0 <= 49) {
                field4351 = 48;
            }
            if (arg1 >= 160 && ~arg1 >= -256) {
                return true;
            } else {
                return ~arg1 == -8365 || arg1 == 338 || arg1 == 8212 || ~arg1 == -340 || ~arg1 == -377;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbo;IIII[I)V")
    public class330(class511 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4346 = arg2;
        this.field4345 = arg1;
        this.method1834(0, true, 0, 0, arg1, (byte) -71, arg2, 0, arg5);
        this.field4352 = (float) arg2 / (float) arg4;
        this.field4350 = false;
        this.field4349 = (float) arg1 / (float) arg3;
        this.method1831(true, false, false);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lbo;IIIIIZ)V")
    public class330(class511 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field6920 == 34037) {
            this.field4352 = (float) arg5;
            this.field4349 = (float) arg4;
            this.field4350 = false;
        } else {
            this.field4350 = true;
            this.field4349 = this.field4352 = 1.0F;
        }
        this.field4346 = arg5;
        this.field4345 = arg4;
    }
}
