import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class225 extends class155 {

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    private int field3216;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    private int field3221;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIIIII)V", line = 3)
    public class225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3216 = arg2;
        this.field3220 = arg1;
        this.field3221 = arg3;
        this.field3213 = arg0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)V", line = 14)
    public final void method5(int arg0, int arg1, int arg2) {
        ++field3218;
        int var4 = this.field3213 * arg2 >> 12;
        if (arg1 > -107) {
            this.field3220 = 78;
        }
        int var5 = this.field3216 * arg2 >> 12;
        int var6 = this.field3220 * arg0 >> 12;
        int var7 = this.field3221 * arg0 >> 12;
        class274.method1803(var7, super.field2332, super.field2329, -128, super.field2333, var6, var5, var4);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIB)V", line = 35)
    public final void method3(int arg0, int arg1, byte arg2) {
        if (arg2 != -30) {
            this.field3220 = -63;
        }
        ++field3215;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Z", line = 45)
    public static final boolean method1556(int arg0) {
        ++field3217;
        if (arg0 >= -16) {
            method1556(-43);
        }
        return ~class731.field10231 != -1 ? true : class284.field4029.method1683(-8);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIBII)V", line = 59)
    public static final void method1557(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            method1556(-95);
        }
        ++field3219;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        class399.method2472(27113, -arg0 + arg1, arg1 - -arg0, arg3, class329.field4651[arg4]);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            ++var5;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class329.field4651[arg4 + var6];
                int[] var10 = class329.field4651[-var6 + arg4];
                int var11 = arg1 - -var5;
                int var12 = arg1 - var5;
                class399.method2472(27113, var12, var11, arg3, var9);
                class399.method2472(27113, var12, var11, arg3, var10);
            }
            int var13 = arg1 + var6;
            int var14 = -var6 + arg1;
            int[] var15 = class329.field4651[arg4 + var5];
            int[] var16 = class329.field4651[-var5 + arg4];
            class399.method2472(27113, var14, var13, arg3, var15);
            class399.method2472(27113, var14, var13, arg3, var16);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZI)V", line = 122)
    public final void method4(int arg0, boolean arg1, int arg2) {
        ++field3214;
        int var4 = this.field3213 * arg0 >> 12;
        if (arg1) {
            method1556(-98);
        }
        int var5 = this.field3216 * arg0 >> 12;
        int var6 = this.field3220 * arg2 >> 12;
        int var7 = this.field3221 * arg2 >> 12;
        class443.method2657(var7, 1, super.field2333, var5, var6, var4);
    }
}
