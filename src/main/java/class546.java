import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class546 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lrr;")
    public class332 field7937;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lhga;")
    public static class158 field7941 = new class158(83, 6);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "F")
    public static float field7947;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lk;")
    public static class525 field7949;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
    public abstract void method788(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public void method789(int arg0) {
        field7946++;
        if (arg0 <= 121) {
            this.method793(104, true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
    public static final boolean method3297(int arg0, int arg1, int arg2) {
        if (arg1 == -26033) {
            field7944++;
            return (arg0 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
    public static final void method3298(byte arg0, boolean arg1) {
        if (arg0 < 59) {
            field7949 = null;
        }
        if (arg1) {
            if (class528.field7706 != -1) {
                class20.method358(class528.field7706, 0);
            }
            for (class102 var2 = (class102) class486.field7115.method1556(65); var2 != null; var2 = (class102) class486.field7115.method1559(96)) {
                if (!var2.method708(50)) {
                    var2 = (class102) class486.field7115.method1556(109);
                    if (var2 == null) {
                        break;
                    }
                }
                class353.method2370(true, (byte) 0, false, var2);
            }
            class528.field7706 = -1;
            class486.field7115 = new class200(8);
            class40.method501(25664);
            class528.field7706 = class379.field5912;
            class351.method2359((byte) 96, false);
            class211.method1601(-20030);
            class142.method1208(class528.field7706);
        }
        field7943++;
        class473.field7017 = false;
        class521.field7550 = "";
        class63.field808 = "";
        class289.method2043((byte) -89);
        class250.field4003 = -1;
        class217.method1624(-120, class459.field6864);
        class567.field8141 = new class304();
        class567.field8141.field9705 = class417.field6374 * 512 / 2;
        class567.field8141.field4264[0] = class275.field4426 / 2;
        class567.field8141.field9696 = class275.field4426 * 512 / 2;
        class567.field8141.field4265[0] = class417.field6374 / 2;
        class412.field6318 = 0;
        class675.field9521 = 0;
        if (class126.field2062 == 2) {
            class675.field9521 = class101.field1681 << 9;
            class412.field6318 = class31.field455 << 9;
        } else {
            class661.method3794(-5922);
        }
        class338.method2317(63);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public void method795(int arg0) {
        if (arg0 == 15759) {
            field7939++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lrr;)V")
    public class546(class332 arg0) {
        this.field7937 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)I")
    public static final int method3299(byte arg0, int arg1) {
        field7945++;
        return arg0 == -3 ? arg1 & 0xFF : 10;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public void method791(int arg0) {
        field7940++;
        if (arg0 != -1) {
            this.method788(false, 109);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZLwq;)V")
    public abstract void method794(int arg0, boolean arg1, class152 arg2);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z")
    public abstract boolean method787(byte arg0);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public void method790(int arg0) {
        field7948++;
        if (arg0 != -32535) {
            this.method793(43, false);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public void method786(int arg0) {
        if (arg0 <= 27) {
            field7947 = -0.71468F;
        }
        field7938++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public void method784(byte arg0) {
        field7942++;
        if (arg0 != -103) {
            this.method784((byte) 36);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
    public abstract void method785(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
    public abstract void method793(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public abstract void method783(int arg0);

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
    public static void method3300(int arg0) {
        if (arg0 == -27880) {
            field7941 = null;
            field7949 = null;
        }
    }
}
