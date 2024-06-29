import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class212 {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Ltg;")
    public static class277 field3942 = new class277(8);

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Z")
    public static boolean field3944 = true;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[Lwb;")
    public static class133[] field3943 = new class133[0];

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "J")
    public static long field3946;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Llc;")
    public static final class143 method1477(int arg0, int arg1, int arg2) {
        field3938++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class178.field3189;
        } else if (arg2 > var3) {
            return class278.field4914;
        } else if (var3 < -3) {
            return class12.field234;
        } else if (var3 < 0) {
            return class169.field3014;
        } else if (var3 > 9) {
            return class128.field2262;
        } else if (var3 > 6) {
            return class88.field1604;
        } else if (var3 > 3) {
            return class13.field252;
        } else if (var3 > 0) {
            return class217.field3968;
        } else {
            return class210.field3902;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public abstract void method598(int arg0, int arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method1478(int arg0) {
        field3942 = null;
        field3943 = null;
        if (arg0 >= -89) {
            field3946 = -15L;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
    public abstract void method594(int arg0, int arg1, int arg2);
}
