import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class212 extends class279 {

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "[F")
    public static float[] field3523 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
    public final void method435(boolean arg0, int arg1) {
        if (arg1 != 2048) {
            this.method442(false);
        }
        ++field3520;
        super.field4267.method413(true, true);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BZ)V")
    public final void method441(byte arg0, boolean arg1) {
        ++field3521;
        if (arg0 != 9) {
            this.method442(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lpj;)V")
    public class212(class38 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V")
    public static void method1535(byte arg0) {
        if (arg0 == -10) {
            field3523 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
    public final boolean method438(byte arg0) {
        if (arg0 >= -32) {
            field3523 = null;
        }
        ++field3522;
        return true;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        super.field4267.method413(arg0, !arg0);
        ++field3518;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
    public final void method443(int arg0, int arg1, int arg2) {
        ++field3524;
        if (arg1 != 0) {
            this.method443(43, -89, 74);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZLiu;)V")
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        ++field3519;
        if (!arg1) {
            super.field4267.method215(8, arg2);
            super.field4267.method405(arg0, (byte) 121);
        }
    }
}
