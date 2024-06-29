import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class238 extends class265 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    private int field3898;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    private int field3899;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    private int field3910;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lwm;")
    public static class152 field3896 = class157.method1048("(U (X", 113);

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field3902 = 100;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lwm;")
    public static class152 field3900 = class157.method1048("Abbrechen", 118);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field3903 = 0;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lwm;")
    public static class152 field3909 = class157.method1048(" <col=ffffff>", 108);

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field3912 = 0;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "[I")
    public static int[] field3904;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 6)
    public static void method1631(int arg0) {
        field3896 = null;
        field3900 = null;
        if (arg0 != 9087) {
            field3902 = -47;
        }
        field3909 = null;
        field3904 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIIII)V", line = 18)
    public class238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3897 = arg2;
        this.field3898 = arg1;
        this.field3899 = arg0;
        this.field3910 = arg3;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V", line = 33)
    public static final void method1632(int arg0, int arg1) {
        field3911++;
        class303 var2 = class90.method589(false, arg1, 2);
        var2.method2114((byte) 125);
        if (arg0 != -3841) {
            method1631(75);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)V", line = 50)
    public final void method248(byte arg0, int arg1, int arg2) {
        field3906++;
        int var4 = -30 % ((22 - arg0) / 52);
        int var5 = this.field3899 * arg2 >> 12;
        int var6 = this.field3910 * arg1 >> 12;
        int var7 = this.field3898 * arg1 >> 12;
        int var8 = this.field3897 * arg2 >> 12;
        class108.method718(this.field4474, var7, this.field4472, var6, var8, this.field4466, 22441, var5);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 81)
    public static final void method1633(boolean arg0) {
        field3907++;
        class92.method607(!arg0, arg0);
        System.gc();
        class232.method1597((byte) 127, 25);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 91)
    public static final void method1634(int arg0) {
        class316.field5485 = null;
        if (arg0 != 1846013196) {
            method1633(true);
        }
        class123.field1732 = null;
        class324.field5655 = null;
        class305.field5244 = null;
        field3908++;
        class34.field562 = null;
        class113.field1611 = null;
        class49.field772 = null;
        class303.field5220 = null;
        class23.field402 = null;
        class305.field5238 = null;
        class203.field3277 = null;
        class195.field3129 = null;
        class33.field543 = null;
        class98.field1404 = null;
        class149.field2316 = null;
        class169.field2642 = null;
        class143.field2199 = null;
        class22.field360 = null;
        class66.field996 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)V", line = 140)
    public final void method247(int arg0, int arg1, int arg2) {
        if (arg2 >= 86) {
            field3905++;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V", line = 150)
    public final void method243(int arg0, int arg1, int arg2) {
        field3901++;
        if (arg2 >= -113) {
            field3909 = (class152) null;
        }
        int var4 = this.field3897 * arg0 >> 12;
        int var5 = this.field3899 * arg0 >> 12;
        int var6 = this.field3898 * arg1 >> 12;
        int var7 = this.field3910 * arg1 >> 12;
        class245.method1694(var4, var5, var7, var6, this.field4474, 1);
    }
}
