import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class156 {

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Luc;")
    private class211 field2823;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2819 = -1;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field2825 = 255;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Loc;")
    public static class151 field2826 = class137.method873(2, ":chalreq:");

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2824 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Loc;")
    private static class151 field2831 = class137.method873(2, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Loc;")
    public static class151 field2834 = class137.method873(2, "Mem:");

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Loc;")
    public static class151 field2830 = field2831;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Loc;")
    public static class151 field2835 = class137.method873(2, "<col=ff7000>");

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[I")
    public static int[] field2836 = new int[2000];

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Loc;")
    public static class151 field2832 = class137.method873(2, "cookiehost");

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Loc;")
    public static class151 field2833 = class137.method873(2, "Die Verbindung konnte");

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lsd;")
    public static class192 field2829;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
    public static final int method1022(int arg0, byte arg1) {
        field2827++;
        if (arg1 != 51) {
            method1027(40, 10L);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1023(int arg0) {
        field2836 = null;
        field2831 = null;
        field2826 = null;
        field2835 = null;
        field2830 = null;
        field2834 = null;
        field2829 = null;
        field2832 = null;
        field2824 = null;
        field2833 = null;
        if (arg0 != 0) {
            field2831 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IJ)V")
    public final void method1024(int arg0, long arg1) {
        this.field2823.method1314(-118, arg1);
        field2818++;
        int var4 = -105 % ((-arg0 - 75) / 45);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwg;ZJ)V")
    public final void method1025(class235 arg0, boolean arg1, long arg2) {
        field2828++;
        this.field2823.method1324(new class122(arg0), 18373, arg2);
        if (arg1) {
            this.method1025(null, true, 115L);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public final void method1026(int arg0) {
        field2822++;
        this.field2823.method1317((byte) -127);
        if (arg0 != -1) {
            method1022(110, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IJ)V")
    public static final void method1027(int arg0, long arg1) {
        field2820++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class188.method1164(arg1 - 1L, (byte) -37);
            class188.method1164(1L, (byte) -37);
        } else {
            class188.method1164(arg1, (byte) -37);
        }
        if (arg0 != 0) {
            method1027(86, 32L);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V")
    public class156(int arg0) {
        this.field2823 = new class211(arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JZ)Lwg;")
    public final class235 method1028(long arg0, boolean arg1) {
        field2821++;
        class122 var4 = (class122) this.field2823.method1318((byte) -121, arg0);
        if (var4 == null) {
            if (arg1) {
                this.field2823 = null;
            }
            return null;
        } else {
            return var4.field2185;
        }
    }
}
