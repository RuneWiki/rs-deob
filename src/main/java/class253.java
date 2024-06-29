import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class253 extends class151 {

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    private final int field4263;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private final int field4262;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    private final int field4255;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field4242 = 0;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "[I")
    public static int[] field4245 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Lwa;")
    public static class75 field4248 = class66.method560("null", false);

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "Lwa;")
    public static class75 field4253 = null;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Lwa;")
    private static class75 field4243 = class66.method560("You can(Wt add yourself to your own ignore list)3", false);

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field4256 = 3;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Lwa;")
    public static class75 field4259 = field4243;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    private int field4254;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    private int field4258;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "[B")
    private byte[] field4261;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIFFF)V", line = 8)
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4263 = (int) (arg6 * 4096.0F);
        this.field4262 = (int) (arg7 * 4096.0F);
        this.field4246 = this.field4255 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V", line = 22)
    public void method1815(int arg0, byte arg1) {
        this.field4261[arg0] = arg1;
        field4244++;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 35)
    public final void method573(int arg0) {
        field4260++;
        this.field4246 = this.field4255;
        this.field4258 >>= 0x4;
        if (this.field4258 < arg0) {
            this.field4258 = 0;
        } else if (this.field4258 > 255) {
            this.field4258 = 255;
        }
        this.method1815(this.field4252++, (byte) this.field4258);
        this.field4258 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)V", line = 54)
    public final void method570(int arg0, byte arg1, int arg2) {
        field4249++;
        if (arg2 == 0) {
            this.field4254 = 4096;
            this.field4247 = this.field4263 - (arg0 >= 0 ? arg0 : -arg0);
            this.field4247 = this.field4247 * this.field4247 >> 12;
            this.field4258 = this.field4247;
        } else {
            this.field4254 = this.field4262 * this.field4247 >> 12;
            if (this.field4254 < 0) {
                this.field4254 = 0;
            } else if (this.field4254 > 4096) {
                this.field4254 = 4096;
            }
            this.field4247 = this.field4263 - (arg0 < 0 ? -arg0 : arg0);
            this.field4247 = this.field4247 * this.field4247 >> 12;
            this.field4247 = this.field4254 * this.field4247 >> 12;
            this.field4258 += this.field4247 * this.field4246 >> 12;
            this.field4246 = this.field4255 * this.field4246 >> 12;
        }
        if (arg1 != -109) {
            this.field4254 = 118;
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V", line = 99)
    public static void method1816(int arg0) {
        field4243 = null;
        field4259 = null;
        field4245 = null;
        field4253 = null;
        field4248 = null;
        if (arg0 != -18752) {
            method1816(63);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 127)
    public final void method564(byte arg0) {
        if (arg0 != -31) {
            this.field4247 = -29;
        }
        field4264++;
        this.field4258 = 0;
        this.field4252 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V", line = 139)
    public static final void method1817(int arg0) {
        class154.field2647 = 0;
        class61.field1070 = -1;
        class217.field3718 = 0;
        class126.field2188 = 0;
        field4251++;
        class55.field905 = -1;
        client.field4016 = -1;
        class153.field2625 = false;
        class299.field5105 = 0;
        class143.field2471 = -1;
        class111.field1895 = 0;
        class158.field2719 = 0;
        class89.field1470.field1012 = 0;
        class136.field2328.field1012 = 0;
        for (int var1 = 0; var1 < class169.field2842.length; var1++) {
            if (class169.field2842[var1] != null) {
                class169.field2842[var1].field3237 = -1;
            }
        }
        if (arg0 > -44) {
            return;
        }
        for (int var2 = 0; var2 < class35.field521.length; var2++) {
            if (class35.field521[var2] != null) {
                class35.field521[var2].field3237 = -1;
            }
        }
        class83.method686(2048);
        class163.field2777 = 1;
        class52.method380(74, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class226.field3815[var3] = true;
        }
        class202.method1499(-33);
    }
}
