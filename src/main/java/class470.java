import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class470 extends class602 {

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    private int field5806;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    private int field5807;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    private int field5802;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    private int field5801;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field5804 = 0;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method803(int arg0, byte arg1, int arg2) {
        ++field5809;
        int var4 = this.field5801 * arg0 >> 12;
        int var5 = this.field5807 * arg0 >> 12;
        if (arg1 != 61) {
            this.method807(-103, 71, 97);
        }
        int var6 = this.field5806 * arg2 >> 12;
        int var7 = this.field5802 * arg2 >> 12;
        class102.method735(super.field8082, (byte) -125, super.field8083, var7, super.field8084, var5, var4, var6);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZII)V", line = 30)
    public final void method805(boolean arg0, int arg1, int arg2) {
        ++field5803;
        int var4 = this.field5801 * arg2 >> 12;
        if (!arg0) {
            int var5 = this.field5807 * arg2 >> 12;
            int var6 = this.field5806 * arg1 >> 12;
            int var7 = this.field5802 * arg1 >> 12;
            class87.method661(-990813300, var7, super.field8084, var4, super.field8082, var6, var5);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I", line = 51)
    public static final int method2559(byte arg0, int arg1) {
        if (arg0 < 124) {
            method2559((byte) -42, 104);
        }
        ++field5805;
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 65)
    public final void method807(int arg0, int arg1, int arg2) {
        ++field5808;
        int var4 = this.field5801 * arg0 >> 12;
        if (arg2 == 5) {
            int var5 = this.field5807 * arg0 >> 12;
            int var6 = this.field5806 * arg1 >> 12;
            int var7 = this.field5802 * arg1 >> 12;
            class558.method2967(var5, 249, var4, super.field8083, var6, var7);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIII)V", line = 87)
    public class470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5806 = arg1;
        this.field5807 = arg2;
        this.field5802 = arg3;
        this.field5801 = arg0;
    }
}
