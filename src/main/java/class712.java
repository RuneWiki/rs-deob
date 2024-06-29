import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class712 extends class155 {

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    private int field9958;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    private int field9955;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    private int field9952;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    private int field9951;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "Z")
    public static boolean field9953 = false;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "Z")
    public static boolean field9957 = false;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field9950;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
    public static int field9956;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
    public static final void method3976(int arg0, int arg1) {
        ++field9954;
        int var2 = -43 % ((arg1 - 30) / 49);
        class320.field4554 = -1;
        if (arg0 == 37) {
            class542.field7628 = 3.0F;
        } else if (arg0 != 50) {
            if (~arg0 != -76) {
                if (~arg0 != -101) {
                    if (~arg0 == -201) {
                        class542.field7628 = 16.0F;
                    }
                } else {
                    class542.field7628 = 8.0F;
                }
            } else {
                class542.field7628 = 6.0F;
            }
        } else {
            class542.field7628 = 4.0F;
        }
        class320.field4554 = -1;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
    public final void method5(int arg0, int arg1, int arg2) {
        ++field9950;
        int var4 = this.field9952 * arg2 >> 12;
        int var5 = this.field9958 * arg2 >> 12;
        int var6 = this.field9955 * arg0 >> 12;
        if (arg1 >= -107) {
            this.method5(115, 63, 101);
        }
        int var7 = this.field9951 * arg0 >> 12;
        class535.method3139(super.field2332, var7, 95, super.field2329, var4, var6, var5, super.field2333);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZI)V")
    public final void method4(int arg0, boolean arg1, int arg2) {
        ++field9956;
        int var4 = this.field9952 * arg0 >> 12;
        int var5 = this.field9958 * arg0 >> 12;
        int var6 = this.field9955 * arg2 >> 12;
        if (!arg1) {
            int var7 = this.field9951 * arg2 >> 12;
            class165.method1225(0, var7, var4, super.field2333, var5, var6);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)V")
    public final void method3(int arg0, int arg1, byte arg2) {
        ++field9949;
        int var4 = this.field9952 * arg0 >> 12;
        int var5 = this.field9958 * arg0 >> 12;
        int var6 = this.field9955 * arg1 >> 12;
        if (arg2 == -30) {
            int var7 = this.field9951 * arg1 >> 12;
            class174.method1270(super.field2332, var5, var6, var7, var4, super.field2329, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(IIIIIII)V")
    public class712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9958 = arg2;
        this.field9955 = arg1;
        this.field9952 = arg0;
        this.field9951 = arg3;
    }
}
