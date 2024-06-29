import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class383 extends class532 {

    @OriginalMember(owner = "client!uia", name = "q", descriptor = "I")
    public static int field4895 = 1;

    @OriginalMember(owner = "client!uia", name = "u", descriptor = "[I")
    public static int[] field4899 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!uia", name = "s", descriptor = "Lsi;")
    public static class586 field4897 = new class586();

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!uia", name = "r", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!uia", name = "t", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        if (arg0) {
            field4897 = null;
        }
        ++field4891;
    }

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "(B)V")
    public static void method2254(byte arg0) {
        field4897 = null;
        int var1 = -87 / ((arg0 - 24) / 38);
        field4899 = null;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBI)V")
    public final void method700(int arg0, byte arg1, int arg2) {
        if (arg1 != 94) {
            field4895 = 37;
        }
        ++field4898;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZI)V")
    public final void method707(boolean arg0, int arg1) {
        if (arg1 == 30902) {
            ++field4894;
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lwg;)V")
    public class383(class449 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        if (arg1 != -10) {
            method2254((byte) 35);
        }
        ++field4892;
    }

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "(B)Z")
    public final boolean method703(byte arg0) {
        ++field4896;
        if (arg0 <= 126) {
            this.method700(-7, (byte) 108, 104);
        }
        return false;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(ZILgaa;)V")
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        ++field4893;
        super.field7494.method2643(-2, arg2);
        super.field7494.method2649((byte) 126, arg1);
        if (!arg0) {
            this.method707(true, -123);
        }
    }
}
