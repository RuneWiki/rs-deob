import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class506 extends class132 {

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    private int field7435;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    private int field7437;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field7439;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    private int field7440;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZI)V")
    public final void method929(int arg0, boolean arg1, int arg2) {
        ++field7436;
        int var4 = this.field7439 * arg2 >> 12;
        if (arg1) {
            int var5 = this.field7437 * arg2 >> 12;
            int var6 = this.field7440 * arg0 >> 12;
            int var7 = this.field7435 * arg0 >> 12;
            class419.method2462(var7, var6, var4, var5, (byte) 113, super.field1787);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
    public final void method927(int arg0, int arg1, byte arg2) {
        ++field7442;
        int var4 = this.field7439 * arg1 >> 12;
        int var5 = this.field7437 * arg1 >> 12;
        int var6 = 68 / ((-47 - arg2) / 33);
        int var7 = this.field7440 * arg0 >> 12;
        int var8 = this.field7435 * arg0 >> 12;
        class419.method2463(var4, super.field1786, var8, false, var7, super.field1792, var5);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIIII)V")
    public class506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7435 = arg3;
        this.field7437 = arg2;
        this.field7439 = arg0;
        this.field7440 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        ++field7438;
        int var4 = this.field7439 * arg1 >> 12;
        int var5 = this.field7437 * arg1 >> 12;
        int var6 = this.field7440 * arg0 >> 12;
        if (arg2 != 0) {
            this.method928(18, -105, -105);
        }
        int var7 = this.field7435 * arg0 >> 12;
        class348.method2048(var6, var4, super.field1787, var5, var7, super.field1786, (byte) 62, super.field1792);
    }
}
