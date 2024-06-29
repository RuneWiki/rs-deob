import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class class213 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Lsv;")
    public class312 field2766;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1325(boolean arg0, int arg1) {
        field2764++;
        if (arg0) {
            field2765 = 3;
        }
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public void method871(byte arg0) {
        field2772++;
        int var2 = 19 / ((arg0 - 38) / 46);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    public void method1326(byte arg0) {
        if (arg0 >= 72) {
            field2771++;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public abstract void method20(int arg0);

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(ZI)V")
    public abstract void method17(boolean arg0, int arg1);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public void method874(boolean arg0) {
        field2773++;
        if (arg0) {
            this.field2766 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
    public abstract void method28(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public void method870(int arg0) {
        field2768++;
        if (arg0 != 8) {
            this.field2766 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Z")
    public static final boolean method1327(int arg0, int arg1) {
        field2770++;
        if (arg1 == 12) {
            return arg0 >= 12 && arg0 <= 17;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILaw;)V")
    public abstract void method19(int arg0, int arg1, class619 arg2);

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
    public void method873(int arg0) {
        field2769++;
        if (arg0 > -95) {
            field2765 = -100;
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(ZI)V")
    public abstract void method23(boolean arg0, int arg1);

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(B)V")
    public void method872(byte arg0) {
        if (arg0 <= -122) {
            field2767++;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lsv;)V")
    public class213(class312 arg0) {
        this.field2766 = arg0;
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(B)Z")
    public abstract boolean method22(byte arg0);
}
