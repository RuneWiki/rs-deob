import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class345 {

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public int field4532 = -1;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public int field4533 = -1;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field4534 = 0;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "[I")
    public int[] field4530;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(JI)V", line = 9)
    public static final void method1975(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 > -91) {
            field4534 = -63;
        }
        field4529++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(FFFFFIILwfa;III)[B", line = 25)
    public static final byte[] method1976(float arg0, float arg1, float arg2, float arg3, float arg4, int arg5, int arg6, class181 arg7, int arg8, int arg9, int arg10) {
        field4531++;
        byte[] var11 = new byte[arg5 * arg9 * arg10];
        class317.method1850(arg2, arg5, arg0, arg7, arg1, arg10, arg3, arg8, arg6, var11, true, arg9, arg4);
        return var11;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILun;)V", line = 36)
    private final void method1977(int arg0, int arg1, class389 arg2) {
        if (arg0 == 1) {
            this.field4533 = arg2.method2260(-68);
        } else if (arg0 == 2) {
            this.field4530 = new int[arg2.method2229(255)];
            for (int var4 = 0; var4 < this.field4530.length; var4++) {
                this.field4530[var4] = arg2.method2260(-125);
            }
        } else if (arg0 == 3) {
            this.field4532 = arg2.method2229(255);
        }
        field4528++;
        if (arg1 >= -106) {
            this.field4532 = 112;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lun;Z)V", line = 77)
    public final void method1978(class389 arg0, boolean arg1) {
        field4535++;
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.method1977(-55, -82, null);
                    return;
                }
            }
            this.method1977(var3, -126, arg0);
        }
    }
}
