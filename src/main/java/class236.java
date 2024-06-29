import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class236 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Led;")
    public class190 field3725 = new class190();

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3724 = 0;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3731 = -1;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lih;")
    public static class214 field3730 = new class214();

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3733 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lhe;")
    public static class20 field3728;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[Lig;")
    public static class9[] field3734;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Led;I)V")
    public final void method1615(class190 arg0, int arg1) {
        if (arg0.field2976 != null) {
            arg0.method1354((byte) -45);
        }
        arg0.field2976 = this.field3725.field2976;
        arg0.field2981 = this.field3725;
        arg0.field2976.field2981 = arg0;
        arg0.field2981.field2976 = arg0;
        if (arg1 != -1) {
            field3734 = null;
        }
        field3732++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1616(int arg0) {
        if (arg0 == -20708) {
            field3734 = null;
            field3730 = null;
            field3728 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public final void method1617(int arg0) {
        if (arg0 > -105) {
            return;
        }
        field3723++;
        while (true) {
            class190 var2 = this.field3725.field2981;
            if (this.field3725 == var2) {
                return;
            }
            var2.method1354((byte) -45);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public static final void method1618(int arg0, int arg1) {
        field3727++;
        int var2 = -60 / ((30 - arg0) / 55);
        class98.field1571.method1166((byte) 23, arg1);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class236() {
        this.field3725.field2981 = this.field3725;
        this.field3725.field2976 = this.field3725;
    }
}
