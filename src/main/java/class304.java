import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class304 extends class105 {

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "Lgs;")
    public class43 field4297;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "Z")
    public boolean field4296;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "[Lig;")
    public class243[] field4298;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILha;ZI)Z", line = 9)
    public final boolean method1975(int arg0, class58 arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return false;
        }
        field4299++;
        int var5 = this.field4297.method394((byte) 1);
        if (this.field4298 != null) {
            for (int var6 = 0; var6 < this.field4298.length; var6++) {
                this.field4298[var6].field3402 <<= var5;
                if (this.field4298[var6].method1626(arg3, arg0) && this.field4297.method390(arg1, arg0, true, arg3)) {
                    this.field4298[var6].field3402 >>= var5;
                    return true;
                }
                this.field4298[var6].field3402 >>= var5;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 48)
    public static final void method1976(int arg0) {
        if (arg0 >= 75) {
            class318.field4513 = -1;
            class334.field4722 = -1;
            field4295++;
            class255.field3697 = 0;
        }
    }
}
