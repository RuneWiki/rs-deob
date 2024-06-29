import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class212 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lvf;")
    public static class265 field3803 = class87.method582(-46, "classement ");

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lvf;")
    public static class265 field3810 = null;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lvf;")
    private static class265 field3804 = class87.method582(-46, "Created gameworld");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lvf;")
    public static class265 field3801 = field3804;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lvf;")
    public static class265 field3816 = class87.method582(-46, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lvf;")
    public static class265 field3806 = class87.method582(-46, "<br>(X");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "J")
    public long field3802;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Ldk;")
    public class179 field3805;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Ldk;")
    public class179 field3809;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Ldk;")
    public class179 field3814;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method1449(boolean arg0) {
        field3804 = null;
        field3810 = null;
        field3806 = null;
        if (!arg0) {
            method1449(true);
        }
        field3816 = null;
        field3801 = null;
        field3803 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
    public static final void method1450(long arg0, int arg1) {
        int var3 = 94 % ((arg1 + 40) / 60);
        field3817++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }
}
