import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class223 {

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Z")
    public static boolean field3272 = false;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "Lbg;")
    public static class324 field3276 = new class324(65, 2);

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "F")
    public static float field3274;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "J")
    public long field3271;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lvu;")
    public class223 field3269;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "Lvu;")
    public class223 field3275;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "[S")
    public static short[] field3270;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V", line = 3)
    public static void method1523(byte arg0) {
        if (arg0 < 13) {
            field3272 = false;
        }
        field3270 = null;
        field3276 = null;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method1524(int arg0) {
        int var2 = -14 % ((-arg0 - 59) / 40);
        field3278++;
        return this.field3269 != null;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V", line = 48)
    public final void method1525(byte arg0) {
        field3268++;
        if (this.field3269 == null) {
            return;
        }
        this.field3269.field3275 = this.field3275;
        this.field3275.field3269 = this.field3269;
        int var2 = 45 / ((19 - arg0) / 48);
        this.field3275 = null;
        this.field3269 = null;
    }
}
