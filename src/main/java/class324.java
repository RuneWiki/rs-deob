import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class324 extends class489 {

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
    public int[] field4170;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
    public int[] field4168;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "S")
    public static short field4171 = 320;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(CI)Z")
    public static final boolean method1896(char arg0, int arg1) {
        field4169++;
        if (Character.isISOControl(arg0)) {
            return false;
        }
        int var2 = 70 / ((61 - arg1) / 50);
        if (class530.method3048(arg0, true)) {
            return true;
        }
        char[] var3 = class466.field6261;
        for (int var4 = 0; var4 < var3.length; var4++) {
            char var8 = var3[var4];
            if (arg0 == var8) {
                return true;
            }
        }
        char[] var5 = class19.field345;
        for (int var6 = 0; var6 < var5.length; var6++) {
            char var7 = var5[var6];
            if (arg0 == var7) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II[I[I)V")
    public class324(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4170 = arg3;
        this.field4168 = arg2;
    }
}
