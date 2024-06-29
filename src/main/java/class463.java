import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class463 extends class542 {

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    private int field6925;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    private int field6927;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    private int field6926;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    private int field6922;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field6924 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field6920 = 1;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lij;")
    public static class295 field6923;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
    public final void method930(byte arg0, int arg1, int arg2) {
        if (arg0 > -107) {
            this.method931(-103, 21, (byte) 27);
        }
        ++field6928;
        int var4 = this.field6925 * arg1 >> 12;
        int var5 = this.field6926 * arg1 >> 12;
        int var6 = this.field6927 * arg2 >> 12;
        int var7 = this.field6922 * arg2 >> 12;
        class535.method3165(super.field7925, var7, var6, var4, super.field7926, (byte) 25, var5, super.field7921);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIII)V")
    public class463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6925 = arg0;
        this.field6927 = arg1;
        this.field6926 = arg2;
        this.field6922 = arg3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
    public final void method931(int arg0, int arg1, byte arg2) {
        if (arg2 == 0) {
            ++field6919;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        ++field6921;
        int var4 = this.field6925 * arg2 >> 12;
        int var5 = this.field6926 * arg2 >> 12;
        int var6 = this.field6927 * arg1 >> 12;
        int var7 = this.field6922 * arg1 >> 12;
        class493.method2937(var4, var5, super.field7925, var6, var7, (byte) 108);
        if (arg0 != 21074) {
            this.field6925 = -61;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method2797(byte arg0) {
        field6923 = null;
        if (arg0 > -106) {
            method2797((byte) 53);
        }
    }
}
