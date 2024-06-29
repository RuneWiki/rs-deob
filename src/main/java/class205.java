import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class205 extends class65 {

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field3447 = 1;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "J")
    public long field3444;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Llh;")
    public class205 field3449;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Llh;")
    public class205 field3450;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[I")
    public static int[] field3445;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)Z", line = 4)
    public final boolean method1506(byte arg0) {
        field3448++;
        int var2 = 82 / ((4 - arg0) / 32);
        return this.field3450 != null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 24)
    public final void method1507(int arg0) {
        if (arg0 != 1) {
            this.field3444 = 42L;
        }
        field3446++;
        if (this.field3450 != null) {
            this.field3450.field3449 = this.field3449;
            this.field3449.field3450 = this.field3450;
            this.field3449 = null;
            this.field3450 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 43)
    public static void method1508(boolean arg0) {
        field3445 = null;
        if (!arg0) {
            method1508(true);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method1509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3451++;
        int var6 = class487.method2955(class76.field1126, class461.field6699, (byte) 44, arg5);
        int var7 = class487.method2955(class76.field1126, class461.field6699, (byte) -89, arg3);
        int var8 = class487.method2955(class184.field3102, class657.field9347, (byte) -84, arg0);
        int var9 = class487.method2955(class184.field3102, class657.field9347, (byte) 127, arg1);
        if (arg4 != 29966) {
            method1508(false);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class608.method3484(class77.field1131[var10], var8, -7, arg2, var9);
        }
    }
}
